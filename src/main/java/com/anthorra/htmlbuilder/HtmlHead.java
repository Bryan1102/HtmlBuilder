
package com.anthorra.htmlbuilder;

import java.util.ArrayList;
import java.util.HashMap;


public class HtmlHead extends HtmlElement
{
    private String head;
    
    private HashMap<String, String> attributes;

    /* CONSTRUCTOR */
    public HtmlHead()
    {
    }
    
    @Override
    String contructElement()
    {
        head = "<head>";
        
//        if(title != null){head += title;}
//        if(charset != null){head += "<meta charset=\"" + charset + "\">";}else{head += "<meta charset=\"UTF-8\">";}
//        head += "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">";
//        if(stylesheet != null){head += "<link rel=\"stylesheet\" href=\"" + stylesheet + "\">";}
//        if(jScript != null){head += "<script>" + jScript + "</script>";}
/*        if(scripts != null)
        {
            for(String script : scripts)
            {
                head += "<script src=\"" + script + "\"></script>";
            }
            
        }*/
        head += "</head>";
        
        return head;
    }
    
    
    /* GETTERS */
    public String getHead()
    {
        return contructElement();
    }
    
    /*
    public void addTitle(String title)
    {
        if (title != null)
        {
            this.title = "<title>" + title + "</title>";
        }
        
    }
    public void setCharset(String charset)
    {
        if(charset != null)
        {
            this.charset = charset;
        }
        else
        {
            this.charset = "UTF-8";
        }
        
    }
    public void setStylesheet(String path)
    {
        if(path != null)
        {
            stylesheet = path;
        }
    }

    public void setjScript(String jScript)
    {
        if(jScript != null)
        {
            this.jScript = jScript;
        }
        
    }
    
    public void addScriptSrc(String script)
    {
        if(script != null)
        {
            this.scripts.add(script);
        }
    }
    */

    
}
