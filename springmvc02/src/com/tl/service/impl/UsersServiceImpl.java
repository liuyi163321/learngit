package com.tl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tl.entity.Users;
import com.tl.mapper.UsersMapper;
import com.tl.service.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public List<Users> findAllUsers() {
		return usersMapper.selectByExample(null);
	}

	@Override
	public Users findUsersById(Integer id) {
		return usersMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUsers(Users users) {
		usersMapper.updateByPrimaryKeySelective(users);
	}

    @Override
    public void deleteUsers(Integer[] ids) {
        usersMapper.batchDeleteUser(ids);
    }


}
