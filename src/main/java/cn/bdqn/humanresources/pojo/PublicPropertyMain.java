package cn.bdqn.humanresources.pojo;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 公共属性主表
 */
@Entity
@Table(name="PublicPropertyMain")
public class PublicPropertyMain {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="public_property_main_num")
    @SequenceGenerator(name="public_property_main_num",sequenceName="public_property_main_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "ppmCode")  //组织编码/代码
    private String ppmCode;

    @Basic
    @Column(name = "ppmName")
    private String ppmName;     //名称

    @Basic
    @Column(name = "describe")
    private String describe;   //描述

    @Basic
    @Column(name = "enableDate")
    private Date enableDate;    //启用时间

    @Basic
    @Column(name = "invalidDate")
    private Date invalidDate;   //失效时间

    @OneToMany(mappedBy="publicPropertyMain",cascade={CascadeType.ALL})
    private Set<PublicPropertySon> publicPropertySons = new HashSet<>();     //公共属性子表集合

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPpmCode() {
        return ppmCode;
    }

    public void setPpmCode(String ppmCode) {
        this.ppmCode = ppmCode;
    }

    public String getPpmName() {
        return ppmName;
    }

    public void setPpmName(String ppmName) {
        this.ppmName = ppmName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getEnableDate() {
        return enableDate;
    }

    public void setEnableDate(Date enableDate) {
        this.enableDate = enableDate;
    }

    public Date getInvalidDate() {
        return invalidDate;
    }

    public void setInvalidDate(Date invalidDate) {
        this.invalidDate = invalidDate;
    }

    public Set<PublicPropertySon> getPublicPropertySons() {
        return publicPropertySons;
    }

    public void setPublicPropertySons(Set<PublicPropertySon> publicPropertySons) {
        this.publicPropertySons = publicPropertySons;
    }
}
