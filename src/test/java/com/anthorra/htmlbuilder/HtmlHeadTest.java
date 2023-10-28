package com.anthorra.htmlbuilder;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Anthorra
 */
public class HtmlHeadTest
{
    
    public HtmlHeadTest()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testContructElement()
    {
        System.out.println("TESTING HEAD: contruct new Html Head");
        HtmlHead instance = new HtmlHead();
        String expResult = "<head></head>";
        String result = instance.contructElement();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetTitle()
    {
        System.out.println("TESTING HEAD: setTitle");
        String title = "test title";
        HtmlHead instance = new HtmlHead();
        instance.setTitle(title);
        
        String expResult = "<head><title>test title</title></head>";
        String result = instance.contructElement();
        assertEquals(expResult, result);
    }
/*
    @Test
    public void testGetHead()
    {
        System.out.println("getHead");
        HtmlHead instance = new HtmlHead();
        String expResult = "";
        String result = instance.getHead();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
