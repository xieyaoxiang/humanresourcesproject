package cn.bdqn.humanresources.service.user;

import cn.bdqn.humanresources.pojo.Users;

import java.util.List;

public interface UserService {

    public List<Users> getUsersList();

    public boolean addUsers(Users user);

}
