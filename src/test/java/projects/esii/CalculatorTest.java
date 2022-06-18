package projects.esii;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatorTest extends TestCase {
	Calculator calculator;
	
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CalculatorTest(String testName) {
        super(testName);
        calculator = new Calculator();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(CalculatorTest.class);
    }

    public void testSum() {
        assertEquals(3.0, calculator.sum(1, 2));
    }
    
    public void testPositiveSubtraction() {
        assertEquals(2.0, calculator.subtraction(5, 3));
    }
    
    public void testNegativeSubtraction() {
        assertEquals(-1.0, calculator.subtraction(1, 2));
    }
    
    public void testMultiplication() {
    	assertEquals(10.0, calculator.multiplication(5, 2));
    }
    
    public void testDivision() {
    	assertEquals(2.0, calculator.division(6, 3));
    }
    
    public void testNotIntegerDivision() {
    	assertEquals(0.3333, calculator.division(1, 3), 0.4f);
    }
    
    public void testPow() {
    	assertEquals(8.0, calculator.pow(2, 3));
    }
    
    public void testPowerToZero() {
    	assertEquals(1.0, calculator.pow(1, 0));
    }
    
    public void testPowerToNegative() {
    	assertEquals(0.1111, calculator.pow(3, 2*-1), 0.4f);
    }
}
