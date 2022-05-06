
package com.ellucian.generated.bpapi.ban.leave_reason_rule.v1_0_0;

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
    "sabbLeaveInd",
    "code",
    "cobraEligInd",
    "activityDate",
    "commFullfillInd",
    "retWorkEligInd",
    "assocAcatCode",
    "facTrackingInd",
    "desc",
    "status"
})
@Generated("jsonschema2pojo")
public class LeaveReasonRule100GetRequest {

    /**
     * Lineage reference object : PTRLREA_SABB_LEAVE_IND
     * 
     */
    @JsonProperty("sabbLeaveInd")
    @JsonPropertyDescription("Lineage reference object : PTRLREA_SABB_LEAVE_IND")
    private String sabbLeaveInd;
    /**
     * Reason Code
     * <p>
     * Lineage reference object : PTRLREA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : PTRLREA_CODE")
    private String code;
    /**
     * Lineage reference object : PTRLREA_COBRA_ELIG_IND
     * 
     */
    @JsonProperty("cobraEligInd")
    @JsonPropertyDescription("Lineage reference object : PTRLREA_COBRA_ELIG_IND")
    private String cobraEligInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLREA_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRLREA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : PTRLREA_COMM_FULLFILL_IND
     * 
     */
    @JsonProperty("commFullfillInd")
    @JsonPropertyDescription("Lineage reference object : PTRLREA_COMM_FULLFILL_IND")
    private String commFullfillInd;
    /**
     * Lineage reference object : PTRLREA_RET_WORK_ELIG_IND
     * 
     */
    @JsonProperty("retWorkEligInd")
    @JsonPropertyDescription("Lineage reference object : PTRLREA_RET_WORK_ELIG_IND")
    private String retWorkEligInd;
    /**
     * Associated Approval Category
     * <p>
     * Lineage reference object : PTRLREA_ASSOC_ACAT_CODE
     * 
     */
    @JsonProperty("assocAcatCode")
    @JsonPropertyDescription("Lineage reference object : PTRLREA_ASSOC_ACAT_CODE")
    private String assocAcatCode;
    /**
     * Lineage reference object : PTRLREA_FAC_TRACKING_IND
     * 
     */
    @JsonProperty("facTrackingInd")
    @JsonPropertyDescription("Lineage reference object : PTRLREA_FAC_TRACKING_IND")
    private String facTrackingInd;
    /**
     * Description
     * <p>
     * Lineage reference object : PTRLREA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTRLREA_DESC")
    private String desc;
    /**
     * Employee Status
     * <p>
     * Lineage reference object : PTRLREA_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Lineage reference object : PTRLREA_STATUS")
    private String status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : PTRLREA_SABB_LEAVE_IND
     * 
     */
    @JsonProperty("sabbLeaveInd")
    public String getSabbLeaveInd() {
        return sabbLeaveInd;
    }

    /**
     * Lineage reference object : PTRLREA_SABB_LEAVE_IND
     * 
     */
    @JsonProperty("sabbLeaveInd")
    public void setSabbLeaveInd(String sabbLeaveInd) {
        this.sabbLeaveInd = sabbLeaveInd;
    }

    public LeaveReasonRule100GetRequest withSabbLeaveInd(String sabbLeaveInd) {
        this.sabbLeaveInd = sabbLeaveInd;
        return this;
    }

    /**
     * Reason Code
     * <p>
     * Lineage reference object : PTRLREA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Reason Code
     * <p>
     * Lineage reference object : PTRLREA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public LeaveReasonRule100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : PTRLREA_COBRA_ELIG_IND
     * 
     */
    @JsonProperty("cobraEligInd")
    public String getCobraEligInd() {
        return cobraEligInd;
    }

    /**
     * Lineage reference object : PTRLREA_COBRA_ELIG_IND
     * 
     */
    @JsonProperty("cobraEligInd")
    public void setCobraEligInd(String cobraEligInd) {
        this.cobraEligInd = cobraEligInd;
    }

    public LeaveReasonRule100GetRequest withCobraEligInd(String cobraEligInd) {
        this.cobraEligInd = cobraEligInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLREA_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRLREA_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public LeaveReasonRule100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : PTRLREA_COMM_FULLFILL_IND
     * 
     */
    @JsonProperty("commFullfillInd")
    public String getCommFullfillInd() {
        return commFullfillInd;
    }

    /**
     * Lineage reference object : PTRLREA_COMM_FULLFILL_IND
     * 
     */
    @JsonProperty("commFullfillInd")
    public void setCommFullfillInd(String commFullfillInd) {
        this.commFullfillInd = commFullfillInd;
    }

    public LeaveReasonRule100GetRequest withCommFullfillInd(String commFullfillInd) {
        this.commFullfillInd = commFullfillInd;
        return this;
    }

    /**
     * Lineage reference object : PTRLREA_RET_WORK_ELIG_IND
     * 
     */
    @JsonProperty("retWorkEligInd")
    public String getRetWorkEligInd() {
        return retWorkEligInd;
    }

    /**
     * Lineage reference object : PTRLREA_RET_WORK_ELIG_IND
     * 
     */
    @JsonProperty("retWorkEligInd")
    public void setRetWorkEligInd(String retWorkEligInd) {
        this.retWorkEligInd = retWorkEligInd;
    }

    public LeaveReasonRule100GetRequest withRetWorkEligInd(String retWorkEligInd) {
        this.retWorkEligInd = retWorkEligInd;
        return this;
    }

    /**
     * Associated Approval Category
     * <p>
     * Lineage reference object : PTRLREA_ASSOC_ACAT_CODE
     * 
     */
    @JsonProperty("assocAcatCode")
    public String getAssocAcatCode() {
        return assocAcatCode;
    }

    /**
     * Associated Approval Category
     * <p>
     * Lineage reference object : PTRLREA_ASSOC_ACAT_CODE
     * 
     */
    @JsonProperty("assocAcatCode")
    public void setAssocAcatCode(String assocAcatCode) {
        this.assocAcatCode = assocAcatCode;
    }

    public LeaveReasonRule100GetRequest withAssocAcatCode(String assocAcatCode) {
        this.assocAcatCode = assocAcatCode;
        return this;
    }

    /**
     * Lineage reference object : PTRLREA_FAC_TRACKING_IND
     * 
     */
    @JsonProperty("facTrackingInd")
    public String getFacTrackingInd() {
        return facTrackingInd;
    }

    /**
     * Lineage reference object : PTRLREA_FAC_TRACKING_IND
     * 
     */
    @JsonProperty("facTrackingInd")
    public void setFacTrackingInd(String facTrackingInd) {
        this.facTrackingInd = facTrackingInd;
    }

    public LeaveReasonRule100GetRequest withFacTrackingInd(String facTrackingInd) {
        this.facTrackingInd = facTrackingInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRLREA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRLREA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LeaveReasonRule100GetRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Employee Status
     * <p>
     * Lineage reference object : PTRLREA_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     * Employee Status
     * <p>
     * Lineage reference object : PTRLREA_STATUS
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public LeaveReasonRule100GetRequest withStatus(String status) {
        this.status = status;
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

    public LeaveReasonRule100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LeaveReasonRule100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sabbLeaveInd");
        sb.append('=');
        sb.append(((this.sabbLeaveInd == null)?"<null>":this.sabbLeaveInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("cobraEligInd");
        sb.append('=');
        sb.append(((this.cobraEligInd == null)?"<null>":this.cobraEligInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("commFullfillInd");
        sb.append('=');
        sb.append(((this.commFullfillInd == null)?"<null>":this.commFullfillInd));
        sb.append(',');
        sb.append("retWorkEligInd");
        sb.append('=');
        sb.append(((this.retWorkEligInd == null)?"<null>":this.retWorkEligInd));
        sb.append(',');
        sb.append("assocAcatCode");
        sb.append('=');
        sb.append(((this.assocAcatCode == null)?"<null>":this.assocAcatCode));
        sb.append(',');
        sb.append("facTrackingInd");
        sb.append('=');
        sb.append(((this.facTrackingInd == null)?"<null>":this.facTrackingInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.sabbLeaveInd == null)? 0 :this.sabbLeaveInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.cobraEligInd == null)? 0 :this.cobraEligInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.commFullfillInd == null)? 0 :this.commFullfillInd.hashCode()));
        result = ((result* 31)+((this.retWorkEligInd == null)? 0 :this.retWorkEligInd.hashCode()));
        result = ((result* 31)+((this.assocAcatCode == null)? 0 :this.assocAcatCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.facTrackingInd == null)? 0 :this.facTrackingInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LeaveReasonRule100GetRequest) == false) {
            return false;
        }
        LeaveReasonRule100GetRequest rhs = ((LeaveReasonRule100GetRequest) other);
        return ((((((((((((this.sabbLeaveInd == rhs.sabbLeaveInd)||((this.sabbLeaveInd!= null)&&this.sabbLeaveInd.equals(rhs.sabbLeaveInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.cobraEligInd == rhs.cobraEligInd)||((this.cobraEligInd!= null)&&this.cobraEligInd.equals(rhs.cobraEligInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.commFullfillInd == rhs.commFullfillInd)||((this.commFullfillInd!= null)&&this.commFullfillInd.equals(rhs.commFullfillInd))))&&((this.retWorkEligInd == rhs.retWorkEligInd)||((this.retWorkEligInd!= null)&&this.retWorkEligInd.equals(rhs.retWorkEligInd))))&&((this.assocAcatCode == rhs.assocAcatCode)||((this.assocAcatCode!= null)&&this.assocAcatCode.equals(rhs.assocAcatCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.facTrackingInd == rhs.facTrackingInd)||((this.facTrackingInd!= null)&&this.facTrackingInd.equals(rhs.facTrackingInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
