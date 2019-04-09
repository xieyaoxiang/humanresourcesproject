package cn.bdqn.humanresources.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * 组织结构表
 */
@Entity
@Table(name="OrganizeStructure")
public class OrganizeStructure {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="organize_structure_num")
    @SequenceGenerator(name="organize_structure_num",sequenceName="organize_structure_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "osCode")  //组织编码
    private String osCode;

    @Basic
    @Column(name = "osFullName")
    private String osFullName;      //组织全称

    @Basic
    @Column(name = "osSimpleName")
    private String osSimpleName;      //组织简称

    @Basic
    @Column(name = "osLevel")
    private Integer osLevel;      //组织等级

    @Basic
    @Column(name = "parentId")
    private Integer parentId;      //父级组织Id

    @Basic
    @Column(name = "address")
    private String address;      //地址

    @Basic
    @Column(name = "synopsis")
    private String synopsis;    //简介

    @Basic
    @Column(name = "remarks")
    private String remarks;    //备注

    @Basic
    @Column(name = "uncertaintyDelete")
    private Integer uncertaintyDelete;      //是否已删除

    @OneToMany(mappedBy="organizeStructure",cascade={CascadeType.ALL})
    private Set<Users> users = new HashSet<>();     //用户集合

    //是否启用（公共）
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="pps_IsStart_ID")
    @Basic(fetch=FetchType.LAZY)
    private PublicPropertySon publicPropertySonIsStart;             //公共属性子表对象

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOsCode() {
        return osCode;
    }

    public void setOsCode(String osCode) {
        this.osCode = osCode;
    }

    public String getOsFullName() {
        return osFullName;
    }

    public void setOsFullName(String osFullName) {
        this.osFullName = osFullName;
    }

    public String getOsSimpleName() {
        return osSimpleName;
    }

    public void setOsSimpleName(String osSimpleName) {
        this.osSimpleName = osSimpleName;
    }

    public Integer getOsLevel() {
        return osLevel;
    }

    public void setOsLevel(Integer osLevel) {
        this.osLevel = osLevel;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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

    public PublicPropertySon getPublicPropertySonIsStart() {
        return publicPropertySonIsStart;
    }

    public void setPublicPropertySonIsStart(PublicPropertySon publicPropertySonIsStart) {
        this.publicPropertySonIsStart = publicPropertySonIsStart;
    }
}
