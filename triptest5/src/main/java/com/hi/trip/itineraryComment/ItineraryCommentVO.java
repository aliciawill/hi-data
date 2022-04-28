package com.hi.trip.itineraryComment;

import java.sql.Timestamp;

public class ItineraryCommentVO {
	private int itineraryComment_idx;
	private int itinerary_idx;
	private String itineraryComment_comment;
	private int member_idx;
	private Timestamp itineraryComment_rgstdate;
	
	
	
	@Override
	public String toString() {
		return "ItineraryCommentVO [itineraryComment_idx=" + itineraryComment_idx + ", itinerary_idx=" + itinerary_idx
				+ ", itineraryComment_comment=" + itineraryComment_comment + ", member_idx=" + member_idx
				+ ", itineraryComment_rgstdate=" + itineraryComment_rgstdate + "]";
	}
	public int getItineraryComment_idx() {
		return itineraryComment_idx;
	}
	public void setItineraryComment_idx(int itineraryComment_idx) {
		this.itineraryComment_idx = itineraryComment_idx;
	}
	public int getItinerary_idx() {
		return itinerary_idx;
	}
	public void setItinerary_idx(int itinerary_idx) {
		this.itinerary_idx = itinerary_idx;
	}
	public String getItineraryComment_comment() {
		return itineraryComment_comment;
	}
	public void setItineraryComment_comment(String itineraryComment_comment) {
		this.itineraryComment_comment = itineraryComment_comment;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public Timestamp getItineraryComment_rgstdate() {
		return itineraryComment_rgstdate;
	}
	public void setItineraryComment_rgstdate(Timestamp itineraryComment_rgstdate) {
		this.itineraryComment_rgstdate = itineraryComment_rgstdate;
	}
}
