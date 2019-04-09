package cn.bdqn.humanresources.pojo;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

/**
 * 题库表
 */
@Entity
@Table(name="ItemBank")
public class ItemBank {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="item_bank_num")
    @SequenceGenerator(name="item_bank_num",sequenceName="item_bank_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "title")
    private String title;   //试题标题

    @Basic
    @Column(name = "topicMaker")
    private String topicMaker;  //出题人

    @Basic
    @Column(name = "topicDate")
    private Date topicDate;  //出题时间

    @Basic
    @Column(name = "topicContent")
    private String topicContent; //试题内容

    @Basic
    @Column(name = "remarks")   //备注
    private String remarks;


    @ManyToOne
    @JoinColumn(name="os_Id")
    @Basic(fetch=FetchType.LAZY)
    private OrganizeStructure organizeStructure;          //部门对象


    //试题等级（公共）
    @ManyToOne
    @JoinColumn(name="pps_ib_rank_ID")
    @Basic(fetch=FetchType.LAZY)
    private PublicPropertySon publicPropertySonItemBankRank;             //公共属性子表对象

    //试题类型（公共）
    @ManyToOne
    @JoinColumn(name="pps_ib_type_ID")
    @Basic(fetch=FetchType.LAZY)
    private PublicPropertySon publicPropertySonItemBankType;             //公共属性子表对象

    //是否启用（公共）
    @ManyToOne
    @JoinColumn(name="pps_IsStart_ID")
    @Basic(fetch=FetchType.LAZY)
    private PublicPropertySon publicPropertySonIsStart;             //公共属性子表对象

    //试题附件
    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name="ENCLOSURE", columnDefinition="BLOB", nullable=true)
    private Blob enclosure;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopicMaker() {
        return topicMaker;
    }

    public void setTopicMaker(String topicMaker) {
        this.topicMaker = topicMaker;
    }

    public Date getTopicDate() {
        return topicDate;
    }

    public void setTopicDate(Date topicDate) {
        this.topicDate = topicDate;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public void setTopicContent(String topicContent) {
        this.topicContent = topicContent;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public OrganizeStructure getOrganizeStructure() {
        return organizeStructure;
    }

    public void setOrganizeStructure(OrganizeStructure organizeStructure) {
        this.organizeStructure = organizeStructure;
    }

    public PublicPropertySon getPublicPropertySonItemBankRank() {
        return publicPropertySonItemBankRank;
    }

    public void setPublicPropertySonItemBankRank(PublicPropertySon publicPropertySonItemBankRank) {
        this.publicPropertySonItemBankRank = publicPropertySonItemBankRank;
    }

    public PublicPropertySon getPublicPropertySonItemBankType() {
        return publicPropertySonItemBankType;
    }

    public void setPublicPropertySonItemBankType(PublicPropertySon publicPropertySonItemBankType) {
        this.publicPropertySonItemBankType = publicPropertySonItemBankType;
    }

    public PublicPropertySon getPublicPropertySonIsStart() {
        return publicPropertySonIsStart;
    }

    public void setPublicPropertySonIsStart(PublicPropertySon publicPropertySonIsStart) {
        this.publicPropertySonIsStart = publicPropertySonIsStart;
    }

    public Blob getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Blob enclosure) {
        this.enclosure = enclosure;
    }
}
