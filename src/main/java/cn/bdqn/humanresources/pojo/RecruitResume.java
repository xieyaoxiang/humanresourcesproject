package cn.bdqn.humanresources.pojo;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * 招聘简历表
 */
@Entity
@Table(name="RecruitResume")
public class RecruitResume {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="recruit_resume_num")
    @SequenceGenerator(name="recruit_resume_num",sequenceName="recruit_resume_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "Name")  //姓名
    private String name;

    @Basic
    @Column(name = "Sex")  //性别
    private Integer sex;

    @Basic
    @Column(name = "Email")  //邮箱
    private String email;

    @Basic
    @Column(name = "Telephone")  //电话
    private String telephone;

    @Basic
    @Column(name = "Address")  //地址
    private String address;

    @Basic
    @Column(name = "HouseholdRegister")  //户籍
    private String householdRegister;

    @Basic
    @Column(name = "PoliticalOutlook")  //政治面貌
    private String politicalOutlook;

    @Basic
    @Column(name = "IdentityCard")  //身份证号
    private String identityCard;

    @Basic
    @Column(name = "GraduationAcademy")  //毕业院校
    private String  graduationAcademy;

    //学历
    @Basic
    @Column(name = "EducationalBackground")
    private Integer educationalBackground;

    @Basic
    @Column(name = "Major")  //专业
    private String major;

    @Basic
    @Column(name = "WorkExperience")
    private String workExperience;//工作经验

    @Basic
    @Column(name = "MonthSalary")
    private String monthSalary; //月薪

    @Basic
    @Column(name = "IsIncumbency")
    private Integer isIncumbency;   //是否在职

    @Basic
    @Column(name = "IsFreshGraduate")
    private Integer isFreshGraduate;    //是否应届生

    @Basic
    @Column(name = "registerDate")  //登记时间
    private Date registerDate;

    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name = "PersonalResume",columnDefinition="CLOB", nullable=true)
    private String personalResume;  //个人履历

    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name="RESUMEENCLOSURE", columnDefinition="BLOB", nullable=true)
    private Blob resumeEnclosure;    //简历附件

    @Basic
    @Column(name = "IsRecommendInterview")
    private Integer isRecommendInterview;   //是否推荐面试

    @Basic
    @Column(name = "RecommendPerson")
    private String recommendPerson;        //推荐人

    @Basic
    @Column(name = "RecommendDate")
    private Date recommendDate;     //推荐时间

    @Basic
    @Column(name = "RecommendOpinion")
    private String recommendOpinion;      //推荐面试意见

    @Basic
    @Column(name = "ResumeState")
    private Integer resumeState;        //简历状态

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="irr_Id",unique=true)
    private InterviewResultRecord interviewResultRecord;//面试结果对象

    @ManyToOne
    @JoinColumn(name="pr_Id")
    @Basic(fetch=FetchType.LAZY)
    private PositionRecruit positionRecruit;          //职位招聘对象

    //招聘类型（公共）
    @ManyToOne
    @JoinColumn(name="pr_Type_ID")
    @Basic(fetch=FetchType.LAZY)
    private PublicPropertySon publicPropertySonPositionRecruitType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseholdRegister() {
        return householdRegister;
    }

    public void setHouseholdRegister(String householdRegister) {
        this.householdRegister = householdRegister;
    }

    public String getPoliticalOutlook() {
        return politicalOutlook;
    }

    public void setPoliticalOutlook(String politicalOutlook) {
        this.politicalOutlook = politicalOutlook;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getGraduationAcademy() {
        return graduationAcademy;
    }

    public void setGraduationAcademy(String graduationAcademy) {
        this.graduationAcademy = graduationAcademy;
    }

    public Integer getEducationalBackground() {
        return educationalBackground;
    }

    public void setEducationalBackground(Integer educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(String monthSalary) {
        this.monthSalary = monthSalary;
    }

    public Integer getIsIncumbency() {
        return isIncumbency;
    }

    public void setIsIncumbency(Integer isIncumbency) {
        this.isIncumbency = isIncumbency;
    }

    public Integer getIsFreshGraduate() {
        return isFreshGraduate;
    }

    public void setIsFreshGraduate(Integer isFreshGraduate) {
        this.isFreshGraduate = isFreshGraduate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getPersonalResume() {
        return personalResume;
    }

    public void setPersonalResume(String personalResume) {
        this.personalResume = personalResume;
    }

    public Blob getResumeEnclosure() {
        return resumeEnclosure;
    }

    public void setResumeEnclosure(Blob resumeEnclosure) {
        this.resumeEnclosure = resumeEnclosure;
    }

    public Integer getIsRecommendInterview() {
        return isRecommendInterview;
    }

    public void setIsRecommendInterview(Integer isRecommendInterview) {
        this.isRecommendInterview = isRecommendInterview;
    }

    public String getRecommendPerson() {
        return recommendPerson;
    }

    public void setRecommendPerson(String recommendPerson) {
        this.recommendPerson = recommendPerson;
    }

    public Date getRecommendDate() {
        return recommendDate;
    }

    public void setRecommendDate(Date recommendDate) {
        this.recommendDate = recommendDate;
    }

    public String getRecommendOpinion() {
        return recommendOpinion;
    }

    public void setRecommendOpinion(String recommendOpinion) {
        this.recommendOpinion = recommendOpinion;
    }

    public Integer getResumeState() {
        return resumeState;
    }

    public void setResumeState(Integer resumeState) {
        this.resumeState = resumeState;
    }

    public InterviewResultRecord getInterviewResultRecord() {
        return interviewResultRecord;
    }

    public void setInterviewResultRecord(InterviewResultRecord interviewResultRecord) {
        this.interviewResultRecord = interviewResultRecord;
    }

    public PositionRecruit getPositionRecruit() {
        return positionRecruit;
    }

    public void setPositionRecruit(PositionRecruit positionRecruit) {
        this.positionRecruit = positionRecruit;
    }

    public PublicPropertySon getPublicPropertySonPositionRecruitType() {
        return publicPropertySonPositionRecruitType;
    }

    public void setPublicPropertySonPositionRecruitType(PublicPropertySon publicPropertySonPositionRecruitType) {
        this.publicPropertySonPositionRecruitType = publicPropertySonPositionRecruitType;
    }
}
