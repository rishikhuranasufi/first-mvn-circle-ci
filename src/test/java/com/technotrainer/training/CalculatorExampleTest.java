package com.technotrainer.training;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorExampleTest {

    @Test
    public void testAdditionOfTwoNumber() throws Exception{
        CalculatorExample calculatorExample = new CalculatorExample();
        Assert.assertEquals(198, calculatorExample.additionOfTwoNumber("99", "99"));
    }

    @Test
    public void testAdditionOfTwoNegitiveNumbers() throws Exception{
        CalculatorExample calculatorExample = new CalculatorExample();
        Assert.assertEquals(-198, calculatorExample.additionOfTwoNumber("-99", "-99"));
    }

    @Test
    public void testPrintDetails() throws Exception{
        CalculatorExample calculatorExample = new CalculatorExample();
        Assert.assertEquals(true, calculatorExample.printDetails("99", "99", 99, 99));
    }

    @Test
    public void testMultiplication() throws Exception{
        CalculatorExample calculatorExample = new CalculatorExample();
        Assert.assertEquals(9801, calculatorExample.multiplicationOfTwoNumber("99", "99"));
    }

    @Test
    public void testMultiplicationWithZero() throws Exception{
        CalculatorExample calculatorExample = new CalculatorExample();
        Assert.assertEquals(0, calculatorExample.multiplicationOfTwoNumber("0", "99"));
    }

}