package cn.bdqn.humanresources.repository;

import cn.bdqn.humanresources.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UsersRepository extends JpaRepository<Users,Integer>, JpaSpecificationExecutor<Users> {

}
