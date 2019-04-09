package cn.bdqn.humanresources.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 职位招聘表
 */
@Entity
@Table(name="PositionRecruit")
public class PositionRecruit {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="position_recruit_num")
    @SequenceGenerator(name="position_recruit_num",sequenceName="position_recruit_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "count")  //招聘人数
    private Integer count;

    @Basic
    @Column(name = "EndDate")  //截止日期
    private Date endDate;

    @Basic
    @Column(name = "RegisterDate")
    private Date registerDate;  //登记日期

    //发布登记人
    @ManyToOne
    @JoinColumn(name="u_Id")
    @Basic(fetch=FetchType.LAZY)
    private Users users;          //User对象

    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name = "describe",columnDefinition="CLOB", nullable=true)
    private String describe;    //职位描述

    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name = "RecruitRequire",columnDefinition="CLOB", nullable=true)
    private String recruitRequire;  //招聘要求

    //所属部门
    @ManyToOne
    @JoinColumn(name="os_Id")
    @Basic(fetch=FetchType.LAZY)
    private OrganizeStructure organizeStructure;          //部门对象

    //职位名称、编码
    @ManyToOne
    @JoinColumn(name="p_Id")
    @Basic(fetch=FetchType.LAZY)
    private Position position;          //职位对象

    //招聘类型（公共）
    @ManyToOne
    @JoinColumn(name="pr_Type_ID")
    @Basic(fetch=FetchType.LAZY)
    private PublicPropertySon publicPropertySonPositionRecruitType;

    @OneToMany(mappedBy="positionRecruit",cascade={CascadeType.ALL})
    private Set<RecruitResume> recruitResumes = new HashSet<>();     //用户集合

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getRecruitRequire() {
        return recruitRequire;
    }

    public void setRecruitRequire(String recruitRequire) {
        this.recruitRequire = recruitRequire;
    }

    public OrganizeStructure getOrganizeStructure() {
        return organizeStructure;
    }

    public void setOrganizeStructure(OrganizeStructure organizeStructure) {
        this.organizeStructure = organizeStructure;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public PublicPropertySon getPublicPropertySonPositionRecruitType() {
        return publicPropertySonPositionRecruitType;
    }

    public void setPublicPropertySonPositionRecruitType(PublicPropertySon publicPropertySonPositionRecruitType) {
        this.publicPropertySonPositionRecruitType = publicPropertySonPositionRecruitType;
    }

    public Set<RecruitResume> getRecruitResumes() {
        return recruitResumes;
    }

    public void setRecruitResumes(Set<RecruitResume> recruitResumes) {
        this.recruitResumes = recruitResumes;
    }
}
