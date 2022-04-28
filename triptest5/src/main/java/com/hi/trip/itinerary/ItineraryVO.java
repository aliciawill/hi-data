package com.hi.trip.itinerary;

import java.sql.Timestamp;

public class ItineraryVO {
	private int itinerary_idx;
	private int member_idx;
	private String itinerary_title;
	private Timestamp itinerary_date;
	private String itinerary_places;
	private String itinerary_details;
	private int itinerary_view;
	private int itinerary_like;
	private int itinerary_available;
	
	
	@Override
	public String toString() {
		return "ItineraryVO [itinerary_idx=" + itinerary_idx + ", member_idx=" + member_idx + ", itinerary_title="
				+ itinerary_title + ", itinerary_date=" + itinerary_date + ", itinerary_places=" + itinerary_places
				+ ", itinerary_details=" + itinerary_details + ", itinerary_view=" + itinerary_view
				+ ", itinerary_like=" + itinerary_like + ", place_idx=" + itinerary_available + "]";
	}
	
	public int getItinerary_idx() {
		return itinerary_idx;
	}
	public void setItinerary_idx(int itinerary_idx) {
		this.itinerary_idx = itinerary_idx;
	}
	public int getMember_idx() {
		return member_idx;
	}
	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}
	public String getItinerary_title() {
		return itinerary_title;
	}
	public void setItinerary_title(String itinerary_title) {
		this.itinerary_title = itinerary_title;
	}
	public Timestamp getItinerary_date() {
		return itinerary_date;
	}
	public void setItinerary_date(Timestamp itinerary_date) {
		this.itinerary_date = itinerary_date;
	}
	public String getItinerary_places() {
		return itinerary_places;
	}
	public void setItinerary_places(String itinerary_places) {
		this.itinerary_places = itinerary_places;
	}
	public String getItinerary_details() {
		return itinerary_details;
	}
	public void setItinerary_details(String itinerary_details) {
		this.itinerary_details = itinerary_details;
	}
	public int getItinerary_view() {
		return itinerary_view;
	}
	public void setItinerary_view(int itinerary_view) {
		this.itinerary_view = itinerary_view;
	}
	public int getItinerary_like() {
		return itinerary_like;
	}
	public void setItinerary_like(int itinerary_like) {
		this.itinerary_like = itinerary_like;
	}
	public int getPlace_idx() {
		return itinerary_available;
	}
	public void setPlace_idx(int place_idx) {
		this.itinerary_available = place_idx;
	}
}
