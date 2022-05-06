
package com.ellucian.generated.bpapi.ban.electronic_approval_summary_other_information_and_comments.v1_0_0;

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
    "nobtranApplyUserId",
    "nobtranOriginatorUserId",
    "dataSeparatorLine0",
    "nobtranSubmissionDate",
    "nobtranSubmittorUserId",
    "nobtranApplyDate",
    "nobtranCreatedDate"
})
@Generated("jsonschema2pojo")
public class NobtranInfo1__1 {

    /**
     * Applied to Database By
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_USER_ID
     * 
     */
    @JsonProperty("nobtranApplyUserId")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_APPLY_USER_ID")
    private String nobtranApplyUserId;
    /**
     * Originator ID
     * <p>
     * Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID
     * (Required)
     * 
     */
    @JsonProperty("nobtranOriginatorUserId")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID")
    private String nobtranOriginatorUserId;
    @JsonProperty("dataSeparatorLine0")
    private String dataSeparatorLine0;
    /**
     * Submitted Date
     * <p>
     * Lineage reference object : NOBTRAN_SUBMISSION_DATE
     * 
     */
    @JsonProperty("nobtranSubmissionDate")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_SUBMISSION_DATE")
    private Date nobtranSubmissionDate;
    /**
     * Submitter ID
     * <p>
     * Lineage reference object : NOBTRAN_SUBMITTOR_USER_ID
     * 
     */
    @JsonProperty("nobtranSubmittorUserId")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_SUBMITTOR_USER_ID")
    private String nobtranSubmittorUserId;
    /**
     * Application Date
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_DATE
     * 
     */
    @JsonProperty("nobtranApplyDate")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_APPLY_DATE")
    private Date nobtranApplyDate;
    /**
     * Created Date
     * <p>
     * Lineage reference object : NOBTRAN_CREATED_DATE
     * (Required)
     * 
     */
    @JsonProperty("nobtranCreatedDate")
    @JsonPropertyDescription("Lineage reference object : NOBTRAN_CREATED_DATE")
    private Date nobtranCreatedDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Applied to Database By
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_USER_ID
     * 
     */
    @JsonProperty("nobtranApplyUserId")
    public String getNobtranApplyUserId() {
        return nobtranApplyUserId;
    }

    /**
     * Applied to Database By
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_USER_ID
     * 
     */
    @JsonProperty("nobtranApplyUserId")
    public void setNobtranApplyUserId(String nobtranApplyUserId) {
        this.nobtranApplyUserId = nobtranApplyUserId;
    }

    public NobtranInfo1__1 withNobtranApplyUserId(String nobtranApplyUserId) {
        this.nobtranApplyUserId = nobtranApplyUserId;
        return this;
    }

    /**
     * Originator ID
     * <p>
     * Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID
     * (Required)
     * 
     */
    @JsonProperty("nobtranOriginatorUserId")
    public String getNobtranOriginatorUserId() {
        return nobtranOriginatorUserId;
    }

    /**
     * Originator ID
     * <p>
     * Lineage reference object : NOBTRAN_ORIGINATOR_USER_ID
     * (Required)
     * 
     */
    @JsonProperty("nobtranOriginatorUserId")
    public void setNobtranOriginatorUserId(String nobtranOriginatorUserId) {
        this.nobtranOriginatorUserId = nobtranOriginatorUserId;
    }

    public NobtranInfo1__1 withNobtranOriginatorUserId(String nobtranOriginatorUserId) {
        this.nobtranOriginatorUserId = nobtranOriginatorUserId;
        return this;
    }

    @JsonProperty("dataSeparatorLine0")
    public String getDataSeparatorLine0() {
        return dataSeparatorLine0;
    }

    @JsonProperty("dataSeparatorLine0")
    public void setDataSeparatorLine0(String dataSeparatorLine0) {
        this.dataSeparatorLine0 = dataSeparatorLine0;
    }

    public NobtranInfo1__1 withDataSeparatorLine0(String dataSeparatorLine0) {
        this.dataSeparatorLine0 = dataSeparatorLine0;
        return this;
    }

    /**
     * Submitted Date
     * <p>
     * Lineage reference object : NOBTRAN_SUBMISSION_DATE
     * 
     */
    @JsonProperty("nobtranSubmissionDate")
    public Date getNobtranSubmissionDate() {
        return nobtranSubmissionDate;
    }

    /**
     * Submitted Date
     * <p>
     * Lineage reference object : NOBTRAN_SUBMISSION_DATE
     * 
     */
    @JsonProperty("nobtranSubmissionDate")
    public void setNobtranSubmissionDate(Date nobtranSubmissionDate) {
        this.nobtranSubmissionDate = nobtranSubmissionDate;
    }

    public NobtranInfo1__1 withNobtranSubmissionDate(Date nobtranSubmissionDate) {
        this.nobtranSubmissionDate = nobtranSubmissionDate;
        return this;
    }

    /**
     * Submitter ID
     * <p>
     * Lineage reference object : NOBTRAN_SUBMITTOR_USER_ID
     * 
     */
    @JsonProperty("nobtranSubmittorUserId")
    public String getNobtranSubmittorUserId() {
        return nobtranSubmittorUserId;
    }

    /**
     * Submitter ID
     * <p>
     * Lineage reference object : NOBTRAN_SUBMITTOR_USER_ID
     * 
     */
    @JsonProperty("nobtranSubmittorUserId")
    public void setNobtranSubmittorUserId(String nobtranSubmittorUserId) {
        this.nobtranSubmittorUserId = nobtranSubmittorUserId;
    }

    public NobtranInfo1__1 withNobtranSubmittorUserId(String nobtranSubmittorUserId) {
        this.nobtranSubmittorUserId = nobtranSubmittorUserId;
        return this;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_DATE
     * 
     */
    @JsonProperty("nobtranApplyDate")
    public Date getNobtranApplyDate() {
        return nobtranApplyDate;
    }

    /**
     * Application Date
     * <p>
     * Lineage reference object : NOBTRAN_APPLY_DATE
     * 
     */
    @JsonProperty("nobtranApplyDate")
    public void setNobtranApplyDate(Date nobtranApplyDate) {
        this.nobtranApplyDate = nobtranApplyDate;
    }

    public NobtranInfo1__1 withNobtranApplyDate(Date nobtranApplyDate) {
        this.nobtranApplyDate = nobtranApplyDate;
        return this;
    }

    /**
     * Created Date
     * <p>
     * Lineage reference object : NOBTRAN_CREATED_DATE
     * (Required)
     * 
     */
    @JsonProperty("nobtranCreatedDate")
    public Date getNobtranCreatedDate() {
        return nobtranCreatedDate;
    }

    /**
     * Created Date
     * <p>
     * Lineage reference object : NOBTRAN_CREATED_DATE
     * (Required)
     * 
     */
    @JsonProperty("nobtranCreatedDate")
    public void setNobtranCreatedDate(Date nobtranCreatedDate) {
        this.nobtranCreatedDate = nobtranCreatedDate;
    }

    public NobtranInfo1__1 withNobtranCreatedDate(Date nobtranCreatedDate) {
        this.nobtranCreatedDate = nobtranCreatedDate;
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

    public NobtranInfo1__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NobtranInfo1__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nobtranApplyUserId");
        sb.append('=');
        sb.append(((this.nobtranApplyUserId == null)?"<null>":this.nobtranApplyUserId));
        sb.append(',');
        sb.append("nobtranOriginatorUserId");
        sb.append('=');
        sb.append(((this.nobtranOriginatorUserId == null)?"<null>":this.nobtranOriginatorUserId));
        sb.append(',');
        sb.append("dataSeparatorLine0");
        sb.append('=');
        sb.append(((this.dataSeparatorLine0 == null)?"<null>":this.dataSeparatorLine0));
        sb.append(',');
        sb.append("nobtranSubmissionDate");
        sb.append('=');
        sb.append(((this.nobtranSubmissionDate == null)?"<null>":this.nobtranSubmissionDate));
        sb.append(',');
        sb.append("nobtranSubmittorUserId");
        sb.append('=');
        sb.append(((this.nobtranSubmittorUserId == null)?"<null>":this.nobtranSubmittorUserId));
        sb.append(',');
        sb.append("nobtranApplyDate");
        sb.append('=');
        sb.append(((this.nobtranApplyDate == null)?"<null>":this.nobtranApplyDate));
        sb.append(',');
        sb.append("nobtranCreatedDate");
        sb.append('=');
        sb.append(((this.nobtranCreatedDate == null)?"<null>":this.nobtranCreatedDate));
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
        result = ((result* 31)+((this.nobtranApplyUserId == null)? 0 :this.nobtranApplyUserId.hashCode()));
        result = ((result* 31)+((this.nobtranOriginatorUserId == null)? 0 :this.nobtranOriginatorUserId.hashCode()));
        result = ((result* 31)+((this.dataSeparatorLine0 == null)? 0 :this.dataSeparatorLine0 .hashCode()));
        result = ((result* 31)+((this.nobtranSubmissionDate == null)? 0 :this.nobtranSubmissionDate.hashCode()));
        result = ((result* 31)+((this.nobtranSubmittorUserId == null)? 0 :this.nobtranSubmittorUserId.hashCode()));
        result = ((result* 31)+((this.nobtranApplyDate == null)? 0 :this.nobtranApplyDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nobtranCreatedDate == null)? 0 :this.nobtranCreatedDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NobtranInfo1__1) == false) {
            return false;
        }
        NobtranInfo1__1 rhs = ((NobtranInfo1__1) other);
        return (((((((((this.nobtranApplyUserId == rhs.nobtranApplyUserId)||((this.nobtranApplyUserId!= null)&&this.nobtranApplyUserId.equals(rhs.nobtranApplyUserId)))&&((this.nobtranOriginatorUserId == rhs.nobtranOriginatorUserId)||((this.nobtranOriginatorUserId!= null)&&this.nobtranOriginatorUserId.equals(rhs.nobtranOriginatorUserId))))&&((this.dataSeparatorLine0 == rhs.dataSeparatorLine0)||((this.dataSeparatorLine0 != null)&&this.dataSeparatorLine0 .equals(rhs.dataSeparatorLine0))))&&((this.nobtranSubmissionDate == rhs.nobtranSubmissionDate)||((this.nobtranSubmissionDate!= null)&&this.nobtranSubmissionDate.equals(rhs.nobtranSubmissionDate))))&&((this.nobtranSubmittorUserId == rhs.nobtranSubmittorUserId)||((this.nobtranSubmittorUserId!= null)&&this.nobtranSubmittorUserId.equals(rhs.nobtranSubmittorUserId))))&&((this.nobtranApplyDate == rhs.nobtranApplyDate)||((this.nobtranApplyDate!= null)&&this.nobtranApplyDate.equals(rhs.nobtranApplyDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nobtranCreatedDate == rhs.nobtranCreatedDate)||((this.nobtranCreatedDate!= null)&&this.nobtranCreatedDate.equals(rhs.nobtranCreatedDate))));
    }

}
