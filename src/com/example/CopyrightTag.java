package com.example;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;

public class CopyrightTag extends SimpleTagSupport{
	
	public void doTag() throws JspException {
	
	JspWriter out=getJspContext().getOut();
	try {
		out.println("<BR><B><i> Copyright is from year 2017</i></B>");
	}
	catch (java.io.IOException e)
	{
		throw new JspException(e.getMessage());
	}
	}
	
}
