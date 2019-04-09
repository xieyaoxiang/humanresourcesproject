package cn.bdqn.humanresources.controller;

import cn.bdqn.humanresources.pojo.*;
import cn.bdqn.humanresources.service.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        System.out.println("==============================进入获取UsersList控制器方法");
        List<Users>list = userService.getUsersList();
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("/addUser")
    public String addUser(Model model){
        System.out.println("==============================进入添加User控制器方法");
        Users user = new Users();
        user.setPwd("123456");
        user.setTelephone("18735438348");
        user.setuName("二狗");
        user.setUncertaintyDelete(1);
        user.setUserCode("ERGOU");
        OrganizeStructure organizeStructure = new OrganizeStructure();
        organizeStructure.setAddress("太原市小店区");
        organizeStructure.setOsCode("CAIWU");
        organizeStructure.setOsFullName("教育产品发展部");
        organizeStructure.setOsLevel(1);
        organizeStructure.setOsSimpleName("教育产品发展部");
        organizeStructure.setParentId(0);
        PublicPropertySon publicPropertySon = new PublicPropertySon();
        publicPropertySon.setArrangement(1);
        publicPropertySon.setDescribe("启用");
        publicPropertySon.setPps_Code("START");
        publicPropertySon.setPps_Name("启用");
        PublicPropertyMain publicPropertyMain = new PublicPropertyMain();
        publicPropertyMain.setDescribe("是否启用");
        publicPropertyMain.setEnableDate(new Date());
        publicPropertyMain.setInvalidDate(new Date());
        publicPropertyMain.setPpmCode("IS_START");
        publicPropertyMain.setPpmName("是否启用");
        publicPropertySon.setPublicPropertyMain(publicPropertyMain);
        organizeStructure.setPublicPropertySonIsStart(publicPropertySon);
        organizeStructure.setUncertaintyDelete(1);
        organizeStructure.setRemarks("教育产品发展部备注");
        organizeStructure.setSynopsis("教育产品发展部简介");
        user.setOrganizeStructure(organizeStructure);
        Roles role = new Roles();
        role.setRoleCode("System");
        role.setRoleNmae("系统管理员");
        role.setUncertaintyDelete(1);
        user.setRole(role);

        if(userService.addUsers(user)){
            model.addAttribute("result","添加成功");
        }else{
            model.addAttribute("result","添加失败");
        }
        return "addUser";
    }
}
