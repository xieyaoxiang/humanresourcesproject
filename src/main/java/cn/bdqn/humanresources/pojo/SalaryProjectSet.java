package cn.bdqn.humanresources.pojo;

import javax.persistence.*;

/**
 * 薪酬项目设置表
 */
@Entity
@Table(name="SalaryProjectSet")
public class SalaryProjectSet {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="salary_project_set_num")
    @SequenceGenerator(name="salary_project_set_num",sequenceName="salary_project_set_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "ppsCode")  //项目编码
    private String ppsCode;

    @Basic
    @Column(name = "ppsName")  //项目名称
    private String ppsName;

    @Basic
    @Column(name = "arrangement")  //排序
    private Integer arrangement;

    @Basic
    @Column(name = "describe")
    private String describe;   //描述

    @Basic
    @Column(name = "money")
    private Double money;   //金额

    @Basic
    @Column(name = "uncertaintyDelete")
    private Integer uncertaintyDelete;      //是否已删除

    //是否启用（公共）
    @ManyToOne
    @JoinColumn(name="pps_IsStart_ID")
    @Basic(fetch=FetchType.LAZY)
    private PublicPropertySon publicPropertySonIsStart;             //公共属性子表对象

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPpsCode() {
        return ppsCode;
    }

    public void setPpsCode(String ppsCode) {
        this.ppsCode = ppsCode;
    }

    public String getPpsName() {
        return ppsName;
    }

    public void setPpsName(String ppsName) {
        this.ppsName = ppsName;
    }

    public Integer getArrangement() {
        return arrangement;
    }

    public void setArrangement(Integer arrangement) {
        this.arrangement = arrangement;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getUncertaintyDelete() {
        return uncertaintyDelete;
    }

    public void setUncertaintyDelete(Integer uncertaintyDelete) {
        this.uncertaintyDelete = uncertaintyDelete;
    }

    public PublicPropertySon getPublicPropertySonIsStart() {
        return publicPropertySonIsStart;
    }

    public void setPublicPropertySonIsStart(PublicPropertySon publicPropertySonIsStart) {
        this.publicPropertySonIsStart = publicPropertySonIsStart;
    }
}
