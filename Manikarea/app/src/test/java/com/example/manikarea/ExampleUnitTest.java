package com.example.manikarea;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainActivity tester = new MainActivity();
    @Test
    public void addition_isCorrect() {
      assertEquals("4.00",CalculatorFuntion.add("2.0","2.0"));
        assertEquals("12.00",CalculatorFuntion.add("9.0","3.0"));
    }
    @Test
    public  void subtration_isCorrect(){
        assertEquals("0.00",CalculatorFuntion.sub("2.0","2.0"));
        assertEquals("6.00",CalculatorFuntion.sub("9.0","3.0"));
    }
    @Test
    public  void multiplication_isCorrect(){
        assertEquals("4.00",CalculatorFuntion.mul("2.0","2.0"));
        assertEquals("27.00",CalculatorFuntion.mul("9.0","3.0"));
    }
    @Test
    public  void divition_isCorrect(){
        assertEquals("1.00",CalculatorFuntion.div("2.0","2.0"));
        assertEquals("3.00",CalculatorFuntion.div("9.0","3.0"));
    }

}