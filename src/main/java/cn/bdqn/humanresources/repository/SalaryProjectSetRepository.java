package cn.bdqn.humanresources.repository;

import cn.bdqn.humanresources.pojo.SalaryProjectSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SalaryProjectSetRepository extends JpaRepository<SalaryProjectSet,Integer>, JpaSpecificationExecutor<SalaryProjectSet> {
}
