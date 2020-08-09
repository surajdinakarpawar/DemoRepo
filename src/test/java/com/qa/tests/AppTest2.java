package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test
 */

public class AppTest2 
{
    
    @Test
    public void sum()
    {
    	System.out.println("Sum");
        int a = 10;
        int b = 10;
        Assert.assertEquals(20, a+b);
    }
    
    @Test
    public void sub()
    {
    	System.out.println("Sub");
        int a = 10;
        int b = 10;
        Assert.assertEquals(0, a-b);
    }
    
    @Test
    public void div()
    {
    	System.out.println("Div");
        int a = 10;
        int b = 10;
        Assert.assertEquals(1, a/b);
    }
    
    @Test
    public void mul()
    {
    	System.out.println("Mul");
        int a = 10;
        int b = 10;
        Assert.assertEquals(100, a*b);
    }
}
