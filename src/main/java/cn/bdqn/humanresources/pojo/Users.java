package cn.bdqn.humanresources.pojo;

import javax.persistence.*;

/**
 * 用户表
 */
@Entity
@Table(name="Users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="user_num")
    @SequenceGenerator(name="user_num",sequenceName="user_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;     //用户编号

    @Basic
    @Column(name = "userCode")  //用户编码
    private String userCode;

    @Basic
    @Column(name = "uName")
    private String uName;   //用户名称

    @Basic
    @Column(name = "pwd")
    private String pwd;     //密码

    @Basic
    @Column(name = "telephone")
    private String telephone;   //电话

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="Role_ID")
    @Basic(fetch=FetchType.LAZY)
    private Roles role;         //角色对象

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="os_Id")
    @Basic(fetch=FetchType.LAZY)
    private OrganizeStructure organizeStructure;          //部门对象

    @Basic
    @Column(name = "uncertaintyDelete")
    private Integer uncertaintyDelete;      //是否已删除


    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public OrganizeStructure getOrganizeStructure() {
        return organizeStructure;
    }

    public void setOrganizeStructure(OrganizeStructure organizeStructure) {
        this.organizeStructure = organizeStructure;
    }

    public Integer getUncertaintyDelete() {
        return uncertaintyDelete;
    }

    public void setUncertaintyDelete(Integer uncertaintyDelete) {
        this.uncertaintyDelete = uncertaintyDelete;
    }
}
