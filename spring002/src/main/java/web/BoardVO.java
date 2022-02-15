package web;

import java.sql.Timestamp;

public class BoardVO {

	private int b_idx;
	private String b_title;
	private String b_content;
	private Timestamp b_rgstdate;
	private Timestamp b_mdfydate;
	public int getB_idx() {
		return b_idx;
	}
	public void setB_idx(int b_idx) {
		this.b_idx = b_idx;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public Timestamp getB_rgstdate() {
		return b_rgstdate;
	}
	public void setB_rgstdate(Timestamp b_rgstdate) {
		this.b_rgstdate = b_rgstdate;
	}
	public Timestamp getB_mdfydate() {
		return b_mdfydate;
	}
	public void setB_mdfydate(Timestamp b_mdfydate) {
		this.b_mdfydate = b_mdfydate;
	}
	
	
}
