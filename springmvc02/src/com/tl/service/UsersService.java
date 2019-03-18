package com.tl.service;

import java.util.List;

import com.tl.entity.Users;


public interface UsersService {
	
	/**
	 * 查询所有的用户
	 * @return
	 */
	public List<Users> findAllUsers();
	
	/**
	 * 根据id查询用户
	 * @return
	 */
	public Users findUsersById(Integer id);
	
	/**
	 * 更新用户
	 * @param users
	 */
	public void updateUsers(Users users);

	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteUsers(Integer [] ids);


}
