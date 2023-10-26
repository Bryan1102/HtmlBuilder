
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
        setHtmlhead(new HtmlHead());
        setHtmlbody(new HtmlBody());
    }
    public HtmlDocument(HtmlHead htmlhead)
    {
        setHtmlhead(htmlhead);
        setHtmlbody(new HtmlBody());
    }
    public HtmlDocument(HtmlBody htmlbody)
    {
        setHtmlhead(new HtmlHead());
        setHtmlbody(htmlbody);
    }
    public HtmlDocument(HtmlHead htmlhead, HtmlBody htmlbody)
    {
        setHtmlhead(htmlhead);
        setHtmlbody(htmlbody);
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
    
    /* SETTERS */
    public void setHtmlhead(HtmlHead htmlhead)
    {
        this.htmlhead = htmlhead;
    }

    public void setHtmlbody(HtmlBody htmlbody)
    {
        this.htmlbody = htmlbody;
    }
    
    
    
    
}
