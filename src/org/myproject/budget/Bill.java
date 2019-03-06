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
	    

	}
