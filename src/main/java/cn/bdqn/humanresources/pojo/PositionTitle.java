package cn.bdqn.humanresources.pojo;


import javax.persistence.*;

/**
 * 职称表
 */
@Entity
@Table(name="PositionTitle")
public class PositionTitle {


    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="position_title_num")
    @SequenceGenerator(name="position_title_num",sequenceName="position_title_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "PositionTitleCode")  //职称编码
    private String ptCode;

    @Basic
    @Column(name = "ptName")
    private String ptName;      //职称名称

    @Basic
    @Column(name = "describe")
    private String describe;   //职称描述

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPtCode() {
        return ptCode;
    }

    public void setPtCode(String ptCode) {
        this.ptCode = ptCode;
    }

    public String getPtName() {
        return ptName;
    }

    public void setPtName(String ptName) {
        this.ptName = ptName;
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
}
