package org.myproject.budget;
	
	import java.util.Date;

	import java.lang.Enum;
	
	import java.math.BigDecimal;
	
	import java.util.GregorianCalendar;

	public class Bill {
		
		//Declaration of Variables
		
	   private BigDecimal amount;
	   
	    enum Type {HomeRent, HomeAdditionalCosts, Food, Medical, Entertainment, Utilities, Transport, DebtPayment};
	    
	   private Type type;
	    
	   private GregorianCalendar date;
	       
	   private String comment;
	   
	   //get und set Methods 
	 
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
	    
	    public Bill(double amount, Type type, int year, int month, int day, String comment)
	    {
	    	setAmount(amount);
	    	setType(type);
	    	setDate(year, month, day);
	    	setComment(comment);
	    }

	
}