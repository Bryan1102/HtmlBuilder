
package com.anthorra.htmlbuilder;

/**
 *
 * @author Anthorra
 */
public class HtmlDocument extends HtmlElement
{
    private String htmldoc;
    
    private HtmlHead htmlhead;
    private HtmlBody htmlbody;
        
    @Override
    String contructElement()
    {
        htmldoc = "<!DOCTYPE html>";
        htmldoc += "<html>";
        
        htmldoc += htmlhead.getHead();
        htmldoc += htmlbody.getBody();
        
        htmldoc += "</html>";
        
        return htmldoc;
    }

    /* CONSTRUCTOR */
    public HtmlDocument()
    {
        this.htmlhead = new HtmlHead();
        this.htmlbody = new HtmlBody();
    }

    
    /* GETTERS */
    public HtmlHead getHtmlhead()
    {
        return htmlhead;
    }

    public HtmlBody getHtmlbody()
    {
        return htmlbody;
    }
    
    
    
    
    
}
