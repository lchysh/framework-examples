package com.ship.dao.c6;

import com.ship.model.User;

public interface UserDAO {
	/**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
}
