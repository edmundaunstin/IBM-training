/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

public class GreetingTagHandler extends BodyTagSupport{
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
  
    public  int doStartTag() throws JspException{
        JspWriter out=null;
        try {
            out=pageContext.getOut();
            out.println("GREETINGS TO "+name);
        }catch(Exception e){
            e.printStackTrace();
        }
        return super.doStartTag();
    }
    
}
