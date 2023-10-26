package com.anthorra.htmlbuilder.Utils;

/**
 *
 * @author Anthorra
 */
public class TagCounter
{
    public static boolean matchTags(String string, String htmlTag)
    {
        String openTag = "<" + htmlTag + ">";
        String closeTag = "</" + htmlTag + ">";
        
        boolean retVal = false;
        int countOpenTag = count(string, openTag);
        int countCloseTag = count(string, closeTag);
        
        return countOpenTag==countCloseTag;
    }
    
    public static int count(String string, String htmlTag)
    {
        
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) 
        {

            lastIndex = string.indexOf(htmlTag, lastIndex);

            if (lastIndex != -1) 
            {
                count++;
                lastIndex += htmlTag.length();
            }
        }
        //System.out.println(count);
        return count;
    }
    
}
