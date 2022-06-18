package projects.esii;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParserTest {
	Parser parser;
	private static final double DELTA = 1e-15;
    
    @Before
    public void init() {
    	this.parser = new Parser();
    }
    
    @Test
    public void testPartialResult() {
    	parser.evaluate("1 + 1");
    	assertEquals(2, parser.getPartialResult(), 0.0f);
    }
    
    @Test
    public void testPartialResultisInitializedByZero() {
    	assertEquals(0, parser.getPartialResult(), DELTA);
    }
    
    @Test
    public void testSum() {
    	parser.evaluate("2 + 3");
    	assertEquals(5, parser.getPartialResult(), DELTA);
    }
    
    @Test
    public void testSubtraction() {
    	parser.evaluate("2 - 3");
    	assertEquals(-1, parser.getPartialResult(), DELTA);
    }
    
    @Test
    public void testMultiplication() {
    	parser.evaluate("2 * 3");
    	assertEquals(6, parser.getPartialResult(), DELTA);
    }
    
    @Test
    public void testDivision() {
    	parser.evaluate("2 / 3");
    	assertEquals(2.0/3.0, parser.getPartialResult(), DELTA);
    }
    
    @Test
    public void testPower() {
    	parser.evaluate("2 ^ 3");
    	assertEquals(8, parser.getPartialResult(), DELTA);
    }
    
    @Test
    public void testPrintResultZero() {
    	assertEquals("The result is 0.0.", parser.printResult());
    }
    
    @Test
    public void testPrintResult() {
    	parser.evaluate("1 + 1");
    	assertEquals("The result is 2.0.", parser.printResult());
    }
    
    @Test
    public void testDivisionByZero() {
    	parser.evaluate("1 / 0");
    	assertEquals("Error: Can't divide by zero!", parser.printResult());
    }
    
    @Test
    public void testMultipleExpression() {
    	parser.evaluate("1 + 2 - 4 * 3 ^ 2");
    	assertEquals(9, parser.getPartialResult(), 0.0f);
    }
}
