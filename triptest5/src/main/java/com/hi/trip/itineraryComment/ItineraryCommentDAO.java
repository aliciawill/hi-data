package com.hi.trip.itineraryComment;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hi.trip.itineraryComment.ItineraryCommentVO;

@Component
public class ItineraryCommentDAO implements ItineraryCommentDAOInter {
	@Autowired
	SqlSessionTemplate my; //의존성주입(DI)
	
	@Override
	public List<ItineraryCommentVO> itineraryCommentList() {
		return my.selectList("itineraryComment.list");
	}
	@Override
	public ItineraryCommentVO itineraryCommentReadOne(ItineraryCommentVO vo) {
		return my.selectOne("itineraryComment.readOne", vo);
	}
	@Override
	public int itineraryCommentDelete(ItineraryCommentVO vo) {
		return my.delete("itineraryComment.delete", vo); 
	}
	@Override
	public int itineraryCommentCreate(ItineraryCommentVO vo) {
		return my.insert("itineraryComment.create", vo);
	}
	@Override
	public int itineraryCommentUpdate(ItineraryCommentVO vo) {
		return my.update("itineraryComment.update", vo);
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
}
