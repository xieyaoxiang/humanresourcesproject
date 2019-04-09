package cn.bdqn.humanresources.pojo;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;

/**
 * 人事档案记录表
 */
@Entity
@Table(name="HumanAffairsArchivesRecord")
public class HumanAffairsArchivesRecord {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="haar_num")
    @SequenceGenerator(name="haar_num",sequenceName="haar_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;

    @Basic
    @Column(name = "haarCode",unique = true)  //档案编码
    private String haarCode;

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
    @Column(name = "IdentityCard")  //身份证号
    private String identityCard;

    @Basic
    @Column(name = "HouseholdRegister")  //户籍
    private String householdRegister;

    @Basic
    @Column(name = "PoliticalOutlook")  //政治面貌
    private String politicalOutlook;

    @Basic
    @Column(name = "GraduationAcademy")  //毕业院校
    private String  graduationAcademy;

    @Basic
    @Column(name = "Major")  //专业
    private String major;

    @Basic
    @Column(name = "BankOfDeposit")  //开户行
    private String bankOfDeposit;

    @Basic
    @Column(name = "BankAccount")  //银行账号
    private String bankAccount;

    @Basic
    @Column(name = "SocialSecurityCard")  //社保卡
    private String socialSecurityCard;

    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name = "PersonalResume",columnDefinition="CLOB", nullable=true)  //个人履历
    private String personalResume;

    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name = "FamilyRelationInfo",columnDefinition="CLOB", nullable=true)  //家庭关系信息
    private String familyRelationInfo;

    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name = "remarks",columnDefinition="CLOB", nullable=true)
    private String remarks;    //备注

    @Basic
    @Column(name = "registerDate")  //登记时间
    private Date registerDate;

    //照片
    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name="IMGS", columnDefinition="BLOB", nullable=true)
    private Blob imgs;

    //个人简历附件
    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name="RESUMEENCLOSURE", columnDefinition="BLOB", nullable=true)
    private Blob resumeEnclosure;

    //所属部门
    @ManyToOne
    @JoinColumn(name="os_Id")
    @Basic(fetch=FetchType.LAZY)
    private OrganizeStructure organizeStructure;          //部门对象
    //职位名称、编码
    @ManyToOne
    @JoinColumn(name="p_Id")
    @Basic(fetch=FetchType.LAZY)
    private Position position;          //职位对象
    //职称
    @ManyToOne
    @JoinColumn(name="pt_Id")
    @Basic(fetch=FetchType.LAZY)
    private PositionTitle positionTitle;          //职称对象
    //登记人
    @ManyToOne
    @JoinColumn(name="u_Id")
    @Basic(fetch=FetchType.LAZY)
    private Users users;                    //User对象

    //档案状态
    @Basic
    @Column(name = "archivesState")
    private Integer archivesState;

    //审核状态
    @Basic
    @Column(name = "auditingState")
    private Integer auditingState;

    //变更类型
    @Basic
    @Column(name = "changeType")
    private Integer changeType;

    //学历
    @Basic
    @Column(name = "EducationalBackground")
    private Integer educationalBackground;

    //薪酬标准
    @Basic
    @Column(name = "PrivatepayStandard")
    private Integer privatepayStandard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHaarCode() {
        return haarCode;
    }

    public void setHaarCode(String haarCode) {
        this.haarCode = haarCode;
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

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
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

    public String getGraduationAcademy() {
        return graduationAcademy;
    }

    public void setGraduationAcademy(String graduationAcademy) {
        this.graduationAcademy = graduationAcademy;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBankOfDeposit() {
        return bankOfDeposit;
    }

    public void setBankOfDeposit(String bankOfDeposit) {
        this.bankOfDeposit = bankOfDeposit;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getSocialSecurityCard() {
        return socialSecurityCard;
    }

    public void setSocialSecurityCard(String socialSecurityCard) {
        this.socialSecurityCard = socialSecurityCard;
    }

    public String getPersonalResume() {
        return personalResume;
    }

    public void setPersonalResume(String personalResume) {
        this.personalResume = personalResume;
    }

    public String getFamilyRelationInfo() {
        return familyRelationInfo;
    }

    public void setFamilyRelationInfo(String familyRelationInfo) {
        this.familyRelationInfo = familyRelationInfo;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Blob getImgs() {
        return imgs;
    }

    public void setImgs(Blob imgs) {
        this.imgs = imgs;
    }

    public Blob getResumeEnclosure() {
        return resumeEnclosure;
    }

    public void setResumeEnclosure(Blob resumeEnclosure) {
        this.resumeEnclosure = resumeEnclosure;
    }

    public OrganizeStructure getOrganizeStructure() {
        return organizeStructure;
    }

    public void setOrganizeStructure(OrganizeStructure organizeStructure) {
        this.organizeStructure = organizeStructure;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public PositionTitle getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(PositionTitle positionTitle) {
        this.positionTitle = positionTitle;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Integer getArchivesState() {
        return archivesState;
    }

    public void setArchivesState(Integer archivesState) {
        this.archivesState = archivesState;
    }

    public Integer getAuditingState() {
        return auditingState;
    }

    public void setAuditingState(Integer auditingState) {
        this.auditingState = auditingState;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public Integer getEducationalBackground() {
        return educationalBackground;
    }

    public void setEducationalBackground(Integer educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    public Integer getPrivatepayStandard() {
        return privatepayStandard;
    }

    public void setPrivatepayStandard(Integer privatepayStandard) {
        this.privatepayStandard = privatepayStandard;
    }
}
