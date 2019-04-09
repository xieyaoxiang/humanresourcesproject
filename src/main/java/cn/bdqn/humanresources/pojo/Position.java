package cn.bdqn.humanresources.pojo;

import javax.persistence.*;

/**
 * 职位表
 */
@Entity
@Table(name="Position")
public class Position {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="position_num")
    @SequenceGenerator(name="position_num",sequenceName="position_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "positionCode")  //职位编码
    private String positionCode;

    @Basic
    @Column(name = "pName")
    private String pName;      //职位名称

    @Basic
    @Column(name = "describe")
    private String describe;   //职位描述

    @Basic
    @Column(name = "remarks")   //备注
    private String remarks;

    @Basic
    @Column(name = "uncertaintyDelete")
    private Integer uncertaintyDelete;      //是否已删除

    @ManyToOne
    @JoinColumn(name="os_Id")
    @Basic(fetch=FetchType.LAZY)
    private OrganizeStructure organizeStructure;          //部门对象

    //是否启用（公共）
    @ManyToOne
    @JoinColumn(name="pps_IsStart_ID")
    @Basic(fetch=FetchType.LAZY)
    private PublicPropertySon publicPropertySonIsStart;             //公共属性子表对象

    //职位类型(公共)
    @ManyToOne
    @JoinColumn(name="pps_p_type_ID")
    @Basic(fetch=FetchType.LAZY)
    private PublicPropertySon publicPropertySonPositionType;          //公共属性子表对象

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getUncertaintyDelete() {
        return uncertaintyDelete;
    }

    public void setUncertaintyDelete(Integer uncertaintyDelete) {
        this.uncertaintyDelete = uncertaintyDelete;
    }

    public OrganizeStructure getOrganizeStructure() {
        return organizeStructure;
    }

    public void setOrganizeStructure(OrganizeStructure organizeStructure) {
        this.organizeStructure = organizeStructure;
    }

    public PublicPropertySon getPublicPropertySonIsStart() {
        return publicPropertySonIsStart;
    }

    public void setPublicPropertySonIsStart(PublicPropertySon publicPropertySonIsStart) {
        this.publicPropertySonIsStart = publicPropertySonIsStart;
    }

    public PublicPropertySon getPublicPropertySonPositionType() {
        return publicPropertySonPositionType;
    }

    public void setPublicPropertySonPositionType(PublicPropertySon publicPropertySonPositionType) {
        this.publicPropertySonPositionType = publicPropertySonPositionType;
    }
}
