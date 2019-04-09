package cn.bdqn.humanresources.service.user;

import cn.bdqn.humanresources.pojo.Users;
import cn.bdqn.humanresources.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> getUsersList() {
        return usersRepository.findAll();
    }

    @Override
    public boolean addUsers(Users user) {
        boolean flag = true;
        try{
            usersRepository.save(user);
        }catch (Exception e){
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
}
