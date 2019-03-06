package org.myproject.budget;

import java.util.Date;

import java.lang.Enum;

import java.math.BigDecimal;

import java.util.Date;

import java.lang.Enum;

import java.math.BigDecimal;

import java.util.GregorianCalendar;

public class Income {
	
    BigDecimal amount;
   
    enum Type {Salary, Bonus, Leasing, StockExchange, Dividents, Loan};
    
    Type type;
    
    GregorianCalendar date;
       
    String comment;
    

}
