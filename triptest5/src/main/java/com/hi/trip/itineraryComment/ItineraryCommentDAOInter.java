package com.hi.trip.itineraryComment;

import java.util.List;

public interface ItineraryCommentDAOInter {

	List<ItineraryCommentVO> itineraryCommentList();

	ItineraryCommentVO itineraryCommentReadOne(ItineraryCommentVO vo);

	int itineraryCommentDelete(ItineraryCommentVO vo);

	int itineraryCommentCreate(ItineraryCommentVO vo);

	int itineraryCommentUpdate(ItineraryCommentVO vo);

	String getDate();

	String getTime();

}