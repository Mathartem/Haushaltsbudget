package org.myproject.budget;
	
	import java.util.Date;

	public class Bill {

	    double Amount;
	    
	    
	    
	    String Type;
	    
	    
	    
	    Date Date;
	    
	    
	    String Comment;
	    
	    void Controll_Of_Numeric_Value (double Value)
	    {

	            if (Value <= 0){System.out.println("Sie k�nnen nur positive Geldbetr�ge erfassen");}
	            
	            else if (Value-(int)Value != 0)  
	                 {
	            	  String Value_as_String = Double.toString(Value);
	                  Value_as_String = Value_as_String.substring(Value_as_String.indexOf(".") + 1);
	                  int Number_Of_Decimal_Places = Value_as_String.length();

	                  if (Number_Of_Decimal_Places > 2) 
	                     {System.out.println("Ein Geldbetrag kann hoechstens zwei Nachkommastellen haben");}
	                 }  

	     }

	}
