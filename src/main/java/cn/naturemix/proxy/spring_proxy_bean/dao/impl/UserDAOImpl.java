package cn.naturemix.proxy.spring_proxy_bean.dao.impl;

import cn.naturemix.proxy.spring_proxy_bean.dao.UserDAO;
import cn.naturemix.proxy.spring_proxy_bean.model.User;

public class UserDAOImpl implements UserDAO {
    public void save(User user) {

        System.out.println("user save11d!");
        /*throw new RuntimeException("exception");*/ //抛异常
    }
}
