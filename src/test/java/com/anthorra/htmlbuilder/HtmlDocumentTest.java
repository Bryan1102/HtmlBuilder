
package com.anthorra.htmlbuilder;

import com.anthorra.htmlbuilder.Utils.TagCounter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Anthorra
 */
public class HtmlDocumentTest
{
    
    public HtmlDocumentTest()
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
        System.out.println("TESTING DOCUMENT: contruct Html Document");
        HtmlDocument instance = new HtmlDocument();
        String expResult = "<!DOCTYPE html><html><head></head><body></body></html>";
        String result = instance.contructElement();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testDoctype()
    {
        //https://html.spec.whatwg.org/multipage/syntax.html#the-doctype
        System.out.println("TESTING DOCUMENT: Doctype");
        HtmlDocument instance = new HtmlDocument();
        boolean isDoctypeCorrect = instance.contructElement().toLowerCase().contains("<!doctype html>");
        assertTrue(isDoctypeCorrect, "FAILED: Doctype");
    }
    
    @Test
    public void testCloseTags()
    {
        System.out.println("TESTING DOCUMENT: <html>Tags</html>");
        HtmlDocument instance = new HtmlDocument();
        boolean isHtmlTagClosed = TagCounter.matchTags(instance.getElement(), "html"); 
        assertTrue(isHtmlTagClosed, "FAILED: <html>Tags</html>");
        
        int countTags = TagCounter.count(instance.getElement(), "<html>");
        assertEquals(1, countTags, "FAILED: only 1 <html> allowed");
    }
    
    @Test
    public void testGetHtmlhead()
    {
//        System.out.println("getHtmlhead");
//        HtmlDocument instance = new HtmlDocument();
//        HtmlHead expResult = null;
//        HtmlHead result = instance.getHtmlhead();
//        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetHtmlbody()
    {
//        System.out.println("getHtmlbody");
//        HtmlDocument instance = new HtmlDocument();
//        HtmlBody expResult = null;
//        HtmlBody result = instance.getHtmlbody();
//        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
