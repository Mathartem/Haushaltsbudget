package org.myproject.budget;
	
	import java.util.Date;

	import java.lang.Enum;
	
	import java.math.BigDecimal;
	
	import java.util.GregorianCalendar;

	public class Bill {
		
	    BigDecimal amount;
	   
	    enum Type {HomeRent, HomeAdditionalCosts, Food, Medical, Entertainment, Utilities, Transport, DebtPayment};
	    
	    Type type;
	    
	    GregorianCalendar date;
	       
	    String comment;
	 
	    BigDecimal getAmount() 
	    {	
	    	return amount;	
	    }
	    
	    void setAmount(double amount)
	    {
	    	this.amount = new BigDecimal(Double.toString(amount));
	    }
	    
	    Type getType()
	    {
	    	return type;
	    }
	    
	    void setType(Type type)
	    {
	    	this.type = type;
	    }
	    
	    GregorianCalendar getDate()
	    {
	    	return date;
	    }
	    
	    void setDate(int year, int month, int day)
	    {
	    	this.date = new GregorianCalendar(year, month, day);
	    }
	    
	    String getComment() 
	    {
	    	return comment;
	    }
	    
	    void setComment(String comment)
	    {
	    	this.comment = comment;
	    }

	
}