package cn.bdqn.humanresources.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 面试结果记录表
 */
@Entity
@Table(name="InterviewResultRecord")
public class InterviewResultRecord {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="irr_num")
    @SequenceGenerator(name="irr_num",sequenceName="irr_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "FirstInterviewName")
    private String firstInterviewName;  //一面面试人

    @Basic
    @Column(name = "FirstInterviewDate")
    private String firstInterviewDate;  //一面面试时间

    @Basic
    @Column(name = "FirstInterviewEvaluate")
    private String firstInterviewEvaluate;  //一面面试评价

    @Basic
    @Column(name = "SecondInterviewName")
    private String secondInterviewName;  //二面面试人

    @Basic
    @Column(name = "SecondInterviewDate")
    private String secondInterviewDate;  //二面面试时间

    @Basic
    @Column(name = "SecondInterviewEvaluate")
    private String secondInterviewEvaluate;  //二面面试评价

    @Basic
    @Column(name = "ThirdInterviewName")
    private String thirdInterviewName;  //三面面试人

    @Basic
    @Column(name = "ThirdInterviewDate")
    private String thirdInterviewDate;  //三面面试时间

    @Basic
    @Column(name = "ThirdInterviewEvaluate")
    private String thirdInterviewEvaluate;  //三面面试评价

    @Basic
    @Column(name = "EmployDecision")
    private String employDecision;  //录用决议

    @Basic
    @Column(name = "DecisionDate")
    private Date decisionDate;  //决议时间

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="rr_Id",unique=true)
    private RecruitResume recruitResume;    //简历对象


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstInterviewName() {
        return firstInterviewName;
    }

    public void setFirstInterviewName(String firstInterviewName) {
        this.firstInterviewName = firstInterviewName;
    }

    public String getFirstInterviewDate() {
        return firstInterviewDate;
    }

    public void setFirstInterviewDate(String firstInterviewDate) {
        this.firstInterviewDate = firstInterviewDate;
    }

    public String getFirstInterviewEvaluate() {
        return firstInterviewEvaluate;
    }

    public void setFirstInterviewEvaluate(String firstInterviewEvaluate) {
        this.firstInterviewEvaluate = firstInterviewEvaluate;
    }

    public String getSecondInterviewName() {
        return secondInterviewName;
    }

    public void setSecondInterviewName(String secondInterviewName) {
        this.secondInterviewName = secondInterviewName;
    }

    public String getSecondInterviewDate() {
        return secondInterviewDate;
    }

    public void setSecondInterviewDate(String secondInterviewDate) {
        this.secondInterviewDate = secondInterviewDate;
    }

    public String getSecondInterviewEvaluate() {
        return secondInterviewEvaluate;
    }

    public void setSecondInterviewEvaluate(String secondInterviewEvaluate) {
        this.secondInterviewEvaluate = secondInterviewEvaluate;
    }

    public String getThirdInterviewName() {
        return thirdInterviewName;
    }

    public void setThirdInterviewName(String thirdInterviewName) {
        this.thirdInterviewName = thirdInterviewName;
    }

    public String getThirdInterviewDate() {
        return thirdInterviewDate;
    }

    public void setThirdInterviewDate(String thirdInterviewDate) {
        this.thirdInterviewDate = thirdInterviewDate;
    }

    public String getThirdInterviewEvaluate() {
        return thirdInterviewEvaluate;
    }

    public void setThirdInterviewEvaluate(String thirdInterviewEvaluate) {
        this.thirdInterviewEvaluate = thirdInterviewEvaluate;
    }

    public String getEmployDecision() {
        return employDecision;
    }

    public void setEmployDecision(String employDecision) {
        this.employDecision = employDecision;
    }

    public Date getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(Date decisionDate) {
        this.decisionDate = decisionDate;
    }

    public RecruitResume getRecruitResume() {
        return recruitResume;
    }

    public void setRecruitResume(RecruitResume recruitResume) {
        this.recruitResume = recruitResume;
    }
}
