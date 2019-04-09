package cn.bdqn.humanresources.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 公共属性子表
 */
@Entity
@Table(name="PublicPropertySon")
public class PublicPropertySon {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="public_property_son_num")
    @SequenceGenerator(name="public_property_son_num",sequenceName="public_property_son_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "pps_Code")  //编码\代码
    private String pps_Code;

    @Basic
    @Column(name = "arrangement")  //排序
    private Integer arrangement;

    @Basic
    @Column(name = "pps_Name")  //名称
    private String pps_Name;

    @Basic
    @Column(name = "describe")
    private String describe;   //描述

    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="ppm_ID")
    @Basic(fetch=FetchType.LAZY)
    private PublicPropertyMain publicPropertyMain;             //公共属性主表对象



    /*@OneToMany(mappedBy="publicPropertyMain",cascade={CascadeType.ALL})
    private Set<ItemBank> publicPropertySons = new HashSet<>(); */    //试题集合


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPps_Code() {
        return pps_Code;
    }

    public void setPps_Code(String pps_Code) {
        this.pps_Code = pps_Code;
    }

    public Integer getArrangement() {
        return arrangement;
    }

    public void setArrangement(Integer arrangement) {
        this.arrangement = arrangement;
    }

    public String getPps_Name() {
        return pps_Name;
    }

    public void setPps_Name(String pps_Name) {
        this.pps_Name = pps_Name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public PublicPropertyMain getPublicPropertyMain() {
        return publicPropertyMain;
    }

    public void setPublicPropertyMain(PublicPropertyMain publicPropertyMain) {
        this.publicPropertyMain = publicPropertyMain;
    }
}
