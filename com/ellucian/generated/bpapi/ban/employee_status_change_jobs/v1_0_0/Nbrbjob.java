
package com.ellucian.generated.bpapi.ban.employee_status_change_jobs.v1_0_0;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jcreDesc",
    "jobStatus",
    "jobTitle",
    "nbrjobsPersonnelDate",
    "nbrjobsStatus",
    "actionJobCbox",
    "userId",
    "posn",
    "beginDate",
    "effDate",
    "nbrjobsPictCode",
    "activityDate",
    "suff",
    "jobLastPaidDate",
    "contractTypeDesc",
    "nbrjobsEffectiveDate",
    "nbrjobsJcreCode",
    "pictDesc"
})
@Generated("jsonschema2pojo")
public class Nbrbjob {

    @JsonProperty("jcreDesc")
    private String jcreDesc;
    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("jobStatus")
    private String jobStatus;
    /**
     * Job Title
     * <p>
     * 
     * 
     */
    @JsonProperty("jobTitle")
    private String jobTitle;
    /**
     * Personnel Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsPersonnelDate")
    private Date nbrjobsPersonnelDate;
    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsStatus")
    private String nbrjobsStatus;
    /**
     * Job Assignment Change
     * <p>
     * 
     * 
     */
    @JsonProperty("actionJobCbox")
    private String actionJobCbox;
    /**
     * Lineage reference object : NBRBJOB_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_USER_ID")
    private String userId;
    /**
     * Position
     * <p>
     * Lineage reference object : NBRBJOB_POSN
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_POSN")
    private String posn;
    /**
     * Job Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_BEGIN_DATE")
    private Date beginDate;
    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("effDate")
    private Date effDate;
    /**
     * Payroll ID
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsPictCode")
    private String nbrjobsPictCode;
    /**
     * Lineage reference object : NBRBJOB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Suffix
     * <p>
     * Lineage reference object : NBRBJOB_SUFF
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : NBRBJOB_SUFF")
    private String suff;
    /**
     * Last Paid Date
     * <p>
     * 
     * 
     */
    @JsonProperty("jobLastPaidDate")
    private Date jobLastPaidDate;
    /**
     * Job Type
     * <p>
     * 
     * 
     */
    @JsonProperty("contractTypeDesc")
    private String contractTypeDesc;
    /**
     * Current Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsEffectiveDate")
    private Date nbrjobsEffectiveDate;
    /**
     * Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsJcreCode")
    private String nbrjobsJcreCode;
    @JsonProperty("pictDesc")
    private String pictDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jcreDesc")
    public String getJcreDesc() {
        return jcreDesc;
    }

    @JsonProperty("jcreDesc")
    public void setJcreDesc(String jcreDesc) {
        this.jcreDesc = jcreDesc;
    }

    public Nbrbjob withJcreDesc(String jcreDesc) {
        this.jcreDesc = jcreDesc;
        return this;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("jobStatus")
    public String getJobStatus() {
        return jobStatus;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("jobStatus")
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public Nbrbjob withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * Job Title
     * <p>
     * 
     * 
     */
    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Job Title
     * <p>
     * 
     * 
     */
    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Nbrbjob withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Personnel Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsPersonnelDate")
    public Date getNbrjobsPersonnelDate() {
        return nbrjobsPersonnelDate;
    }

    /**
     * Personnel Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsPersonnelDate")
    public void setNbrjobsPersonnelDate(Date nbrjobsPersonnelDate) {
        this.nbrjobsPersonnelDate = nbrjobsPersonnelDate;
    }

    public Nbrbjob withNbrjobsPersonnelDate(Date nbrjobsPersonnelDate) {
        this.nbrjobsPersonnelDate = nbrjobsPersonnelDate;
        return this;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsStatus")
    public String getNbrjobsStatus() {
        return nbrjobsStatus;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsStatus")
    public void setNbrjobsStatus(String nbrjobsStatus) {
        this.nbrjobsStatus = nbrjobsStatus;
    }

    public Nbrbjob withNbrjobsStatus(String nbrjobsStatus) {
        this.nbrjobsStatus = nbrjobsStatus;
        return this;
    }

    /**
     * Job Assignment Change
     * <p>
     * 
     * 
     */
    @JsonProperty("actionJobCbox")
    public String getActionJobCbox() {
        return actionJobCbox;
    }

    /**
     * Job Assignment Change
     * <p>
     * 
     * 
     */
    @JsonProperty("actionJobCbox")
    public void setActionJobCbox(String actionJobCbox) {
        this.actionJobCbox = actionJobCbox;
    }

    public Nbrbjob withActionJobCbox(String actionJobCbox) {
        this.actionJobCbox = actionJobCbox;
        return this;
    }

    /**
     * Lineage reference object : NBRBJOB_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : NBRBJOB_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Nbrbjob withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : NBRBJOB_POSN
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : NBRBJOB_POSN
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public Nbrbjob withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Job Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Job Begin Date
     * <p>
     * Lineage reference object : NBRBJOB_BEGIN_DATE
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Nbrbjob withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Nbrbjob withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Payroll ID
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsPictCode")
    public String getNbrjobsPictCode() {
        return nbrjobsPictCode;
    }

    /**
     * Payroll ID
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsPictCode")
    public void setNbrjobsPictCode(String nbrjobsPictCode) {
        this.nbrjobsPictCode = nbrjobsPictCode;
    }

    public Nbrbjob withNbrjobsPictCode(String nbrjobsPictCode) {
        this.nbrjobsPictCode = nbrjobsPictCode;
        return this;
    }

    /**
     * Lineage reference object : NBRBJOB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : NBRBJOB_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Nbrbjob withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : NBRBJOB_SUFF
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : NBRBJOB_SUFF
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public Nbrbjob withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Last Paid Date
     * <p>
     * 
     * 
     */
    @JsonProperty("jobLastPaidDate")
    public Date getJobLastPaidDate() {
        return jobLastPaidDate;
    }

    /**
     * Last Paid Date
     * <p>
     * 
     * 
     */
    @JsonProperty("jobLastPaidDate")
    public void setJobLastPaidDate(Date jobLastPaidDate) {
        this.jobLastPaidDate = jobLastPaidDate;
    }

    public Nbrbjob withJobLastPaidDate(Date jobLastPaidDate) {
        this.jobLastPaidDate = jobLastPaidDate;
        return this;
    }

    /**
     * Job Type
     * <p>
     * 
     * 
     */
    @JsonProperty("contractTypeDesc")
    public String getContractTypeDesc() {
        return contractTypeDesc;
    }

    /**
     * Job Type
     * <p>
     * 
     * 
     */
    @JsonProperty("contractTypeDesc")
    public void setContractTypeDesc(String contractTypeDesc) {
        this.contractTypeDesc = contractTypeDesc;
    }

    public Nbrbjob withContractTypeDesc(String contractTypeDesc) {
        this.contractTypeDesc = contractTypeDesc;
        return this;
    }

    /**
     * Current Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsEffectiveDate")
    public Date getNbrjobsEffectiveDate() {
        return nbrjobsEffectiveDate;
    }

    /**
     * Current Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsEffectiveDate")
    public void setNbrjobsEffectiveDate(Date nbrjobsEffectiveDate) {
        this.nbrjobsEffectiveDate = nbrjobsEffectiveDate;
    }

    public Nbrbjob withNbrjobsEffectiveDate(Date nbrjobsEffectiveDate) {
        this.nbrjobsEffectiveDate = nbrjobsEffectiveDate;
        return this;
    }

    /**
     * Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsJcreCode")
    public String getNbrjobsJcreCode() {
        return nbrjobsJcreCode;
    }

    /**
     * Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsJcreCode")
    public void setNbrjobsJcreCode(String nbrjobsJcreCode) {
        this.nbrjobsJcreCode = nbrjobsJcreCode;
    }

    public Nbrbjob withNbrjobsJcreCode(String nbrjobsJcreCode) {
        this.nbrjobsJcreCode = nbrjobsJcreCode;
        return this;
    }

    @JsonProperty("pictDesc")
    public String getPictDesc() {
        return pictDesc;
    }

    @JsonProperty("pictDesc")
    public void setPictDesc(String pictDesc) {
        this.pictDesc = pictDesc;
    }

    public Nbrbjob withPictDesc(String pictDesc) {
        this.pictDesc = pictDesc;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Nbrbjob withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Nbrbjob.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jcreDesc");
        sb.append('=');
        sb.append(((this.jcreDesc == null)?"<null>":this.jcreDesc));
        sb.append(',');
        sb.append("jobStatus");
        sb.append('=');
        sb.append(((this.jobStatus == null)?"<null>":this.jobStatus));
        sb.append(',');
        sb.append("jobTitle");
        sb.append('=');
        sb.append(((this.jobTitle == null)?"<null>":this.jobTitle));
        sb.append(',');
        sb.append("nbrjobsPersonnelDate");
        sb.append('=');
        sb.append(((this.nbrjobsPersonnelDate == null)?"<null>":this.nbrjobsPersonnelDate));
        sb.append(',');
        sb.append("nbrjobsStatus");
        sb.append('=');
        sb.append(((this.nbrjobsStatus == null)?"<null>":this.nbrjobsStatus));
        sb.append(',');
        sb.append("actionJobCbox");
        sb.append('=');
        sb.append(((this.actionJobCbox == null)?"<null>":this.actionJobCbox));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("nbrjobsPictCode");
        sb.append('=');
        sb.append(((this.nbrjobsPictCode == null)?"<null>":this.nbrjobsPictCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("jobLastPaidDate");
        sb.append('=');
        sb.append(((this.jobLastPaidDate == null)?"<null>":this.jobLastPaidDate));
        sb.append(',');
        sb.append("contractTypeDesc");
        sb.append('=');
        sb.append(((this.contractTypeDesc == null)?"<null>":this.contractTypeDesc));
        sb.append(',');
        sb.append("nbrjobsEffectiveDate");
        sb.append('=');
        sb.append(((this.nbrjobsEffectiveDate == null)?"<null>":this.nbrjobsEffectiveDate));
        sb.append(',');
        sb.append("nbrjobsJcreCode");
        sb.append('=');
        sb.append(((this.nbrjobsJcreCode == null)?"<null>":this.nbrjobsJcreCode));
        sb.append(',');
        sb.append("pictDesc");
        sb.append('=');
        sb.append(((this.pictDesc == null)?"<null>":this.pictDesc));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.jcreDesc == null)? 0 :this.jcreDesc.hashCode()));
        result = ((result* 31)+((this.jobStatus == null)? 0 :this.jobStatus.hashCode()));
        result = ((result* 31)+((this.jobTitle == null)? 0 :this.jobTitle.hashCode()));
        result = ((result* 31)+((this.nbrjobsPersonnelDate == null)? 0 :this.nbrjobsPersonnelDate.hashCode()));
        result = ((result* 31)+((this.nbrjobsStatus == null)? 0 :this.nbrjobsStatus.hashCode()));
        result = ((result* 31)+((this.actionJobCbox == null)? 0 :this.actionJobCbox.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.nbrjobsPictCode == null)? 0 :this.nbrjobsPictCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.jobLastPaidDate == null)? 0 :this.jobLastPaidDate.hashCode()));
        result = ((result* 31)+((this.contractTypeDesc == null)? 0 :this.contractTypeDesc.hashCode()));
        result = ((result* 31)+((this.nbrjobsEffectiveDate == null)? 0 :this.nbrjobsEffectiveDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nbrjobsJcreCode == null)? 0 :this.nbrjobsJcreCode.hashCode()));
        result = ((result* 31)+((this.pictDesc == null)? 0 :this.pictDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nbrbjob) == false) {
            return false;
        }
        Nbrbjob rhs = ((Nbrbjob) other);
        return ((((((((((((((((((((this.jcreDesc == rhs.jcreDesc)||((this.jcreDesc!= null)&&this.jcreDesc.equals(rhs.jcreDesc)))&&((this.jobStatus == rhs.jobStatus)||((this.jobStatus!= null)&&this.jobStatus.equals(rhs.jobStatus))))&&((this.jobTitle == rhs.jobTitle)||((this.jobTitle!= null)&&this.jobTitle.equals(rhs.jobTitle))))&&((this.nbrjobsPersonnelDate == rhs.nbrjobsPersonnelDate)||((this.nbrjobsPersonnelDate!= null)&&this.nbrjobsPersonnelDate.equals(rhs.nbrjobsPersonnelDate))))&&((this.nbrjobsStatus == rhs.nbrjobsStatus)||((this.nbrjobsStatus!= null)&&this.nbrjobsStatus.equals(rhs.nbrjobsStatus))))&&((this.actionJobCbox == rhs.actionJobCbox)||((this.actionJobCbox!= null)&&this.actionJobCbox.equals(rhs.actionJobCbox))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.nbrjobsPictCode == rhs.nbrjobsPictCode)||((this.nbrjobsPictCode!= null)&&this.nbrjobsPictCode.equals(rhs.nbrjobsPictCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.jobLastPaidDate == rhs.jobLastPaidDate)||((this.jobLastPaidDate!= null)&&this.jobLastPaidDate.equals(rhs.jobLastPaidDate))))&&((this.contractTypeDesc == rhs.contractTypeDesc)||((this.contractTypeDesc!= null)&&this.contractTypeDesc.equals(rhs.contractTypeDesc))))&&((this.nbrjobsEffectiveDate == rhs.nbrjobsEffectiveDate)||((this.nbrjobsEffectiveDate!= null)&&this.nbrjobsEffectiveDate.equals(rhs.nbrjobsEffectiveDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nbrjobsJcreCode == rhs.nbrjobsJcreCode)||((this.nbrjobsJcreCode!= null)&&this.nbrjobsJcreCode.equals(rhs.nbrjobsJcreCode))))&&((this.pictDesc == rhs.pictDesc)||((this.pictDesc!= null)&&this.pictDesc.equals(rhs.pictDesc))));
    }

}
