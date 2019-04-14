package org.myproject.budget;                     

import java.math.BigDecimal;
import java.util.Date;

public class Bill {

	// Declaration of Variables

	private BigDecimal amount;

	private IncomeType type;

	private Date date;

	private String comment;

	// Definition of Constructor

	public Bill(BigDecimal amount, IncomeType type, Date date, String comment) {
		setAmount(amount);
		setType(type);
		setDate(date);
		setComment(comment);
	}

	// get und set Methods

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public IncomeType getType() {
		return type;
	}

	public void setType(IncomeType type) {
		this.type = type;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}