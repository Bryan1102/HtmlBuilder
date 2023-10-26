package com.anthorra.htmlbuilder;

import com.anthorra.htmlbuilder.Utils.TagCounter;
        
/**
 *
 * @author Anthorra
 */
public class HtmlBuilder 
{

    public static void main(String[] args) 
    {
        HtmlDocument doc = new HtmlDocument();
        System.out.println(doc.getElement());
        
        String docstring = doc.getElement();
        
        
        boolean isHtmlTagClosed = TagCounter.matchTags(docstring, "html"); 
        System.out.println(isHtmlTagClosed);
        
        
        /*
        Integration test
        
        https://html.spec.whatwg.org/multipage/syntax.html#syntax-doctype
        - include doctype test
        In other words, <!DOCTYPE html>, case-insensitively.
        */



    }
}
