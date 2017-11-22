package com.atit.app.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atit.app.dao.UserDAO;
import com.atit.app.vo.UserVO;

@Repository
public class IUserDAO implements UserDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String mapper = "com.atit.mapper.DemoMapper";
	
/*	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}*/

	@Override
	public List<UserVO> getUser() {
		return sqlSession.selectList("com.atit.mapper.DemoMapper.selectUser");
	}

	@Override
	public int setUser(String name) {	
		Map<String,String> params = new HashMap<String,String>();
		params.put("name", name);
		
		return sqlSession.insert(mapper + ".insertUser", params);
	}
	
	

}
