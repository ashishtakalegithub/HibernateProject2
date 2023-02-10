package com.practice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSECTION")
public class Transection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "T_ID")
	private int id;
	@Column(name = "T_DATE")
	private Date date;
	@Column(name = "T_TOTAL")
	private int total;

	@Override
	public String toString() {
		return "Transection [id=" + id + ", date=" + date + ", total=" + total + "]";
	}

	public Transection() {
		super();

	}

	public Transection(int id, Date date, int total) {
		super();
		this.id = id;
		this.date = date;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
