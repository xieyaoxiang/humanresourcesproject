package cn.bdqn.humanresources.repository;

import cn.bdqn.humanresources.pojo.HumanAffairsArchivesRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HumanAffairsArchivesRecordRepository extends JpaRepository<HumanAffairsArchivesRecord,Integer>, JpaSpecificationExecutor<HumanAffairsArchivesRecord> {
}
