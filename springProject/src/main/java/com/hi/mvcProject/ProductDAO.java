package com.hi.mvcProject;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDAO {

	@Autowired
	SqlSessionTemplate my; //의존성주입(DI)
	
	public ProductVO one(ProductVO vo) {
		return my.selectOne("product.one", vo);
	}
	
	public List<ProductVO> all() {
		return my.selectList("product.list");
	}
}
