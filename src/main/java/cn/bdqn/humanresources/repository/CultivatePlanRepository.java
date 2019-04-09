package cn.bdqn.humanresources.repository;

import cn.bdqn.humanresources.pojo.CultivatePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CultivatePlanRepository extends JpaRepository<CultivatePlan,Integer>, JpaSpecificationExecutor<CultivatePlan> {


}
