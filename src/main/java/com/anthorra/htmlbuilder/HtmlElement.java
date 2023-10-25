
package com.anthorra.htmlbuilder;

import java.util.HashMap;



/**
 *
 * @author Anthorra
 */
public abstract class HtmlElement
{
    
    /** 
     Every HTML Element has to have a method returning a String to construct itself and nested elements too.
     */
    abstract String contructElement();
    
    /** 
     Every HTML Element has to have a public function returning itself as contructed html String.
     * @return 
     */
    public String getElement()
    {
        return contructElement();
    }
    
}
