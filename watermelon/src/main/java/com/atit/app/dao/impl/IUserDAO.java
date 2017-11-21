package com.atit.app.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.atit.app.dao.UserDAO;
import com.atit.app.vo.UserVO;

@Repository
public class IUserDAO implements UserDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
/*	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;
	}*/

	@Override
	public List<UserVO> getUser() {				
		return sqlSession.selectList("com.atit.mapper.DemoMapper.selectUser");
	}
	
	

}
