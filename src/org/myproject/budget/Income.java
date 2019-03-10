package org.myproject.budget;

import java.util.Date;

import java.math.BigDecimal;

import java.util.GregorianCalendar;

public class Income {
	
	//Declaration of Variables
	
    private BigDecimal amount;
   
    enum Type {Salary, Bonus, Leasing, StockExchange, Dividents, Loan};
    
    private Type type;
    
    private GregorianCalendar date;
       
    private String comment;
    
    // set und get methods
    
    public BigDecimal getAmount() 
    {	
    	return amount;	
    }
    
    public void setAmount(double amount)
    {
    	this.amount = new BigDecimal(Double.toString(amount));
    }
    
    public Type getType()
    {
    	return type;
    }
    
    public void setType(Type type)
    {
    	this.type = type;
    }
    
    public Date getDate()
    {
    	return date.getTime();
    }
    
    public void setDate(int year, int month, int day)
    {
    	this.date = new GregorianCalendar(year, month, day);
    }
    
    public String getComment() 
    {
    	return comment;
    }
    
    public void setComment(String comment)
    {
    	this.comment = comment;
    }
    
    //Definition of Constructor
    
    public Income(double amount, Type type, int year, int month, int day, String comment)
    {
    	setAmount(amount);
    	setType(type);
    	setDate(year, month, day);
    	setComment(comment);
    }


}
