package org.myproject.budget;

import java.util.Date;

public class Income {

    double amount;
    
   
    
    String type;
    
   
    
    Date date;
   
    String comment;
    
    void Controll_Of_Numeric_Value (double Value)
    {

            if (Value <= 0){System.out.println("Only positive amounts can be entered");}
            
            else if (Value-(int)Value != 0)  
                 {
            	  String Value_as_String = Double.toString(Value);
                  Value_as_String = Value_as_String.substring(Value_as_String.indexOf(".") + 1);
                  int Number_Of_Decimal_Places = Value_as_String.length();

                  if (Number_Of_Decimal_Places > 2) 
                     {System.out.println("An amount can have at the most two decimal places");}
                 }  

     }

}
