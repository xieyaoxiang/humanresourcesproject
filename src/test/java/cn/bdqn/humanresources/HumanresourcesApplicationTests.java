package cn.bdqn.humanresources;

import cn.bdqn.humanresources.pojo.*;
import cn.bdqn.humanresources.repository.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HumanresourcesApplicationTests {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    CultivatePlanRepository cultivatePlanRepository;

    @Autowired
    HumanAffairsArchivesRecordRepository humanAffairsArchivesRecordRepository;

    @Autowired
    PositionRecruitRepository positionRecruitRepository;

    @Autowired
    ItemBankRepository itemBankRepository;

    @Autowired
    SalaryProjectSetRepository salaryProjectSetRepository;

    @Test
    public void contextLoads() {

        List<Users> list = usersRepository.findAll();

    }

    @Test
    public void contextLoadsCultivatePlan() {

        List<CultivatePlan> list = cultivatePlanRepository.findAll();

    }

    @Test
    public void contextLoadsHumanAffairsArchivesRecord() {

        List<HumanAffairsArchivesRecord> list = humanAffairsArchivesRecordRepository.findAll();

    }
    @Test
    public void contextLoadsPositionRecruit() {

        List<PositionRecruit> list = positionRecruitRepository.findAll();

    }
    @Test
    public void contextLoadsItemBank() {

        List<ItemBank> list = itemBankRepository.findAll();

    }

    @Test
    public void contextLoadsSalaryProjectSet() {

        List<SalaryProjectSet> list = salaryProjectSetRepository.findAll();

    }
}
