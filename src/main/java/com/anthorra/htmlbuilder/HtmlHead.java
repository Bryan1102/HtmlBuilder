
package com.anthorra.htmlbuilder;

import com.anthorra.htmlbuilder.HeadElements.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HtmlHead extends HtmlElement
{
    private String head;
    
    private String title;
    
    private ArrayList<Meta> metaList;
    //private HashMap<String, String> attributes;

    /* CONSTRUCTOR */
    public HtmlHead()
    {
        metaList = new ArrayList<>();
    }
    
    @Override
    String contructElement()
    {
        head = "<head>";
        
        if(title == null)
        {
            Logger.getLogger(HtmlHead.class.getName()).log(Level.WARNING, "HTML <head> must have a <title>! Use setTitle method to specify!");
        }
        else
        {
            head += "<title>" + title + "</title>";
        }
        
        if(metaList != null && !metaList.isEmpty())
        {
            for(Meta m : metaList)
            {
                head += "<meta name=\"" + m.name + "\" content=\"" + m.content + "\">";
            }
        }
        
        
        

        
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
    
    /* METHODS */
    public void addMeta(String name, String content)
    {
        metaList.add(new Meta(name, content));
    }
    
    
    /* SETTERS */
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    
    /* GETTERS */
    public String getHead()
    {
        return contructElement();
    }
    
    
    
}
