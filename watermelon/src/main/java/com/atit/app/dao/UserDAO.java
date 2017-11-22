package com.atit.app.dao;

import java.util.List;

import com.atit.app.vo.UserVO;

public interface UserDAO {

	public List<UserVO> getUser();
	public int setUser(String name); 
}
