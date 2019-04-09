package cn.bdqn.humanresources.repository;

import cn.bdqn.humanresources.pojo.ItemBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ItemBankRepository extends JpaRepository<ItemBank,Integer>, JpaSpecificationExecutor<ItemBank> {

}
