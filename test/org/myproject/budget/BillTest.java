package org.myproject.budget;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

public class BillTest {
	
	@Test
	public void billTest() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(GregorianCalendar.YEAR, 2019);
		calendar.set(GregorianCalendar.MONTH, 3);
		calendar.set(GregorianCalendar.DAY_OF_MONTH, 22);
		
		Bill bill = new Bill(new BigDecimal("22"), IncomeType.Food, calendar.getTime(), "testComment");
		System.out.println(bill.getAmount());
		System.out.println(bill.getDate());
	}

}
