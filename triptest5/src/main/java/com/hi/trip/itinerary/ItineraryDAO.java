package com.hi.trip.itinerary;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItineraryDAO implements ItineraryDAOInter {

	@Autowired
	SqlSessionTemplate my; //의존성주입(DI)
	
	@Override
	public List<ItineraryVO> itineraryList(int pageNumber) {
		int num = getNext() - (pageNumber - 1) * 10;
		return my.selectList("itinerary.list", num);
	}
	@Override
	public ItineraryVO itineraryReadOne(ItineraryVO vo) {
		return my.selectOne("itinerary.readOne", vo);
	}
	@Override
	public int itineraryDelete(ItineraryVO vo) {
		return my.delete("itinerary.delete", vo); 
	}
	@Override
	public int itineraryCreate(ItineraryVO vo) {
		return my.insert("itinerary.create", vo);
	}
	@Override
	public int itineraryUpdate(ItineraryVO vo) {
		return my.update("itinerary.update", vo);
	}
	@Override
	public String getDate() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(timestamp);
	}
	@Override
	public String getTime() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(timestamp);
	}
	@Override
	public int getNext() {
		//현재 게시글을 내림차순으로 조회하여 가장 마지막 글의 번호를 구한다
		int result = my.selectOne("itinerary.getNext");
		return result+1;
	}
	@Override
	public boolean nextPage(int pageNumber) {
		int num = getNext() - (pageNumber - 1) * 10;
		int result = my.selectOne("itinerary.nextPage", num);
		if(result!=0) {
			return true;
		}
		return false;
	}
}
