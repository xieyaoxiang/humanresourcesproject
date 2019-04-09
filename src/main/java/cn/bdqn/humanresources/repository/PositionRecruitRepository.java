package cn.bdqn.humanresources.repository;

import cn.bdqn.humanresources.pojo.PositionRecruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PositionRecruitRepository extends JpaRepository<PositionRecruit,Integer>, JpaSpecificationExecutor<PositionRecruit> {

}
