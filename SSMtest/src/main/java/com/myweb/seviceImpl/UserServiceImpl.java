package com.myweb.seviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myweb.dao.UserMapper;
import com.myweb.entity.User;
import com.myweb.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userdao;
	
	public User getUserById(int userId){
		return this.userdao.selectByPrimaryKey(userId);
	}
}
