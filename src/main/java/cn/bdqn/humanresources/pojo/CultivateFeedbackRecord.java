package cn.bdqn.humanresources.pojo;

import javax.persistence.*;

/**
 * 培训计划反馈表
 */
@Entity
@Table(name="CultivateFeedbackRecord")
public class CultivateFeedbackRecord {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="cfr_num")
    @SequenceGenerator(name="cfr_num",sequenceName="cfr_num_no",allocationSize=1)
    @Column(name = "ID")
    private Integer id;


    @Basic
    @Column(name = "FeedbackContent")
    private Integer feedbackContent;    //培训反馈


    @Basic
    @Column(name = "FeedbackSummary")
    private Integer feedbackSummary;    //培训总结

    @Basic
    @Column(name = "feedbackResult")
    private Integer feedbackResult;     //培训结果

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cp_Id",unique=true)
    private CultivatePlan cultivatePlan;    //培训计划对象

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(Integer feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public Integer getFeedbackSummary() {
        return feedbackSummary;
    }

    public void setFeedbackSummary(Integer feedbackSummary) {
        this.feedbackSummary = feedbackSummary;
    }

    public Integer getFeedbackResult() {
        return feedbackResult;
    }

    public void setFeedbackResult(Integer feedbackResult) {
        this.feedbackResult = feedbackResult;
    }

    public CultivatePlan getCultivatePlan() {
        return cultivatePlan;
    }

    public void setCultivatePlan(CultivatePlan cultivatePlan) {
        this.cultivatePlan = cultivatePlan;
    }
}
