package org.csu.coderlee.services;

import org.csu.coderlee.dao.user.UserDao;
import org.csu.coderlee.domain.user.User;
import org.csu.coderlee.services.user.IUserService;

import javax.annotation.Resource;

/**
 * Created by lixiang on 16/10/9.
 */
public class UserService implements IUserService {

    @Resource
    private UserDao userDao;

    public User getUser(String id) {

        return userDao.selectById(id);
    }
}
