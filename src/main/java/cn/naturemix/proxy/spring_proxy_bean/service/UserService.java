package cn.naturemix.proxy.spring_proxy_bean.service;

import cn.naturemix.proxy.spring_proxy_bean.dao.UserDAO;
import cn.naturemix.proxy.spring_proxy_bean.model.User;

import javax.annotation.Resource;

public class UserService {

    private UserDAO userDAO;

    public void init() {
        System.out.println("init");
    }

    public void add(User user) {
        userDAO.save(user);
    }
    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Resource(name="u")
    public void setUserDAO( UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void destroy() {
        System.out.println("destroy");
    }

}
