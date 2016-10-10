package org.csu.coderlee.dao.user;

import org.csu.coderlee.domain.user.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lixiang on 16/10/9.
 */
public class UserDao extends SqlMapClientDaoSupport{

    public void insert(User user){

        Map<String, Object> condition = new HashMap<String, Object>();
        getSqlMapClientTemplate().insert("User.user", condition);
    }

    public void delete(String id){

    }

    //参数中传递部分字段, 只更新部分字段
    public void update(User user){

    }

    //参数中有部分字段, 根据部分字段的信息查找
    public void select(User user){

    }

    public User selectById(String id){
       return (User) getSqlMapClientTemplate().queryForObject(id);
    }
}
