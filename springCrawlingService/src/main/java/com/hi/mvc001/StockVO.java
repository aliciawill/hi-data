package com.hi.mvc001;

public class StockVO {

	private String code;
	private String company;
	private int today;
	private int yesterday;
	private int high;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getToday() {
		return today;
	}

	public void setToday(int today) {
		this.today = today;
	}

	public int getYesterday() {
		return yesterday;
	}

	public void setYesterday(int yesterday) {
		this.yesterday = yesterday;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	@Override
	public String toString() {
		return "StockVO [code=" + code + ", company=" + company + ", today=" + today + ", yesterday=" + yesterday
				+ ", high=" + high + "]";
	}

}
