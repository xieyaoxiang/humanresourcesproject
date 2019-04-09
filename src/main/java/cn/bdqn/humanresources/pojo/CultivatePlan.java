package cn.bdqn.humanresources.pojo;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

/**
 * 培训计划表
 */
@Entity
@Table(name="CultivatePlan")
public class CultivatePlan {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="cp_num")
    @SequenceGenerator(name="cp_num",sequenceName="cp_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "CultivateNmae")
    private String cultivateNmae;//培训名称

    @Basic
    @Column(name = "LecturerName")
    private String lecturerName;    //培训讲师

    @Basic
    @Column(name = "StartDate")
    private Date startDate; //开始时间

    @Basic
    @Column(name = "EndDate")
    private Date endDate; //结束时间

    @Basic
    @Column(name = "CultivatePurpose")
    private String cultivatePurpose;        //培训目的

    @Basic
    @Column(name = "JoinCultivatePersonnel")
    private String joinCultivatePersonnel;   //参训人员

    @Basic
    @Column(name = "CultivateSynopsis")
    private String cultivateSynopsis;       //培训简介

    //培训资料
    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name="CULTIVATEMATERIAL", columnDefinition="BLOB", nullable=true)
    private Blob cultivateMaterial;     //培训资料

    //审核状态
    @Basic
    @Column(name = "auditingState")
    private Integer auditingState;

    //审核意见
    @Basic
    @Column(name = "auditingOpinion")
    private String auditingOpinion;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cfr_Id",unique=true)
    private CultivateFeedbackRecord cultivateFeedbackRecord;    //培训计划反馈对象

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCultivateNmae() {
        return cultivateNmae;
    }

    public void setCultivateNmae(String cultivateNmae) {
        this.cultivateNmae = cultivateNmae;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCultivatePurpose() {
        return cultivatePurpose;
    }

    public void setCultivatePurpose(String cultivatePurpose) {
        this.cultivatePurpose = cultivatePurpose;
    }

    public String getJoinCultivatePersonnel() {
        return joinCultivatePersonnel;
    }

    public void setJoinCultivatePersonnel(String joinCultivatePersonnel) {
        this.joinCultivatePersonnel = joinCultivatePersonnel;
    }

    public String getCultivateSynopsis() {
        return cultivateSynopsis;
    }

    public void setCultivateSynopsis(String cultivateSynopsis) {
        this.cultivateSynopsis = cultivateSynopsis;
    }

    public Blob getCultivateMaterial() {
        return cultivateMaterial;
    }

    public void setCultivateMaterial(Blob cultivateMaterial) {
        this.cultivateMaterial = cultivateMaterial;
    }

    public Integer getAuditingState() {
        return auditingState;
    }

    public void setAuditingState(Integer auditingState) {
        this.auditingState = auditingState;
    }

    public String getAuditingOpinion() {
        return auditingOpinion;
    }

    public void setAuditingOpinion(String auditingOpinion) {
        this.auditingOpinion = auditingOpinion;
    }

    public CultivateFeedbackRecord getCultivateFeedbackRecord() {
        return cultivateFeedbackRecord;
    }

    public void setCultivateFeedbackRecord(CultivateFeedbackRecord cultivateFeedbackRecord) {
        this.cultivateFeedbackRecord = cultivateFeedbackRecord;
    }
}
