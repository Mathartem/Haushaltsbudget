package org.myproject.budget;

import org.myproject.budget.Income.Type;

public class Execution2 {
	public static void main(String[] args) {
		Income Income3 = new Income(3333.32, Type.Salary, 2019, 11, 5, "no comment");
		
		System.out.println(Income3.getAmount());
		System.out.println(Income3.getType());
		System.out.println(Income3.getDate());
		System.out.println(Income3.getComment());
		
		
	}
}
