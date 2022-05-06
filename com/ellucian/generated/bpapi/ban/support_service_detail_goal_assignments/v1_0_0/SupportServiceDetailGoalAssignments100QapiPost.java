
package com.ellucian.generated.bpapi.ban.support_service_detail_goal_assignments.v1_0_0;

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
    "seadetlId",
    "seadetlTermCodeEff",
    "seadetlSsgpCode",
    "goalCode",
    "ssgpCode",
    "priorityNbr",
    "treqCode",
    "estimateDate",
    "actualDate",
    "ssrsCode",
    "origCode"
})
@Generated("jsonschema2pojo")
public class SupportServiceDetailGoalAssignments100QapiPost {

    @JsonProperty("seadetlId")
    private String seadetlId;
    @JsonProperty("seadetlTermCodeEff")
    private String seadetlTermCodeEff;
    @JsonProperty("seadetlSsgpCode")
    private String seadetlSsgpCode;
    /**
     * Goal
     * <p>
     * Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal
     * 
     */
    @JsonProperty("goalCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal")
    private String goalCode;
    /**
     * Group
     * <p>
     * Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp")
    private String ssgpCode;
    /**
     * Priority Number
     * <p>
     * Lineage reference object : SERDTGL_PRIORITY_NBR
     * 
     */
    @JsonProperty("priorityNbr")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_PRIORITY_NBR")
    private Double priorityNbr;
    /**
     * Time
     * <p>
     * Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq
     * 
     */
    @JsonProperty("treqCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq")
    private String treqCode;
    /**
     * Estimated Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ESTIMATE_DATE
     * 
     */
    @JsonProperty("estimateDate")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_ESTIMATE_DATE")
    private Date estimateDate;
    /**
     * Actual Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ACTUAL_DATE
     * 
     */
    @JsonProperty("actualDate")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_ACTUAL_DATE")
    private Date actualDate;
    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs")
    private String ssrsCode;
    /**
     * Review
     * <p>
     * Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    @JsonPropertyDescription("Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("seadetlId")
    public String getSeadetlId() {
        return seadetlId;
    }

    @JsonProperty("seadetlId")
    public void setSeadetlId(String seadetlId) {
        this.seadetlId = seadetlId;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withSeadetlId(String seadetlId) {
        this.seadetlId = seadetlId;
        return this;
    }

    @JsonProperty("seadetlTermCodeEff")
    public String getSeadetlTermCodeEff() {
        return seadetlTermCodeEff;
    }

    @JsonProperty("seadetlTermCodeEff")
    public void setSeadetlTermCodeEff(String seadetlTermCodeEff) {
        this.seadetlTermCodeEff = seadetlTermCodeEff;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withSeadetlTermCodeEff(String seadetlTermCodeEff) {
        this.seadetlTermCodeEff = seadetlTermCodeEff;
        return this;
    }

    @JsonProperty("seadetlSsgpCode")
    public String getSeadetlSsgpCode() {
        return seadetlSsgpCode;
    }

    @JsonProperty("seadetlSsgpCode")
    public void setSeadetlSsgpCode(String seadetlSsgpCode) {
        this.seadetlSsgpCode = seadetlSsgpCode;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withSeadetlSsgpCode(String seadetlSsgpCode) {
        this.seadetlSsgpCode = seadetlSsgpCode;
        return this;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal
     * 
     */
    @JsonProperty("goalCode")
    public String getGoalCode() {
        return goalCode;
    }

    /**
     * Goal
     * <p>
     * Lineage reference object : SERDTGL_GOAL_CODE, Lookup lineage reference object : stvgoal
     * 
     */
    @JsonProperty("goalCode")
    public void setGoalCode(String goalCode) {
        this.goalCode = goalCode;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withGoalCode(String goalCode) {
        this.goalCode = goalCode;
        return this;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public String getSsgpCode() {
        return ssgpCode;
    }

    /**
     * Group
     * <p>
     * Lineage reference object : SERDTGL_SSGP_CODE, Lookup lineage reference object : stvssgp
     * 
     */
    @JsonProperty("ssgpCode")
    public void setSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withSsgpCode(String ssgpCode) {
        this.ssgpCode = ssgpCode;
        return this;
    }

    /**
     * Priority Number
     * <p>
     * Lineage reference object : SERDTGL_PRIORITY_NBR
     * 
     */
    @JsonProperty("priorityNbr")
    public Double getPriorityNbr() {
        return priorityNbr;
    }

    /**
     * Priority Number
     * <p>
     * Lineage reference object : SERDTGL_PRIORITY_NBR
     * 
     */
    @JsonProperty("priorityNbr")
    public void setPriorityNbr(Double priorityNbr) {
        this.priorityNbr = priorityNbr;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withPriorityNbr(Double priorityNbr) {
        this.priorityNbr = priorityNbr;
        return this;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq
     * 
     */
    @JsonProperty("treqCode")
    public String getTreqCode() {
        return treqCode;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SERDTGL_TREQ_CODE, Lookup lineage reference object : stvtreq
     * 
     */
    @JsonProperty("treqCode")
    public void setTreqCode(String treqCode) {
        this.treqCode = treqCode;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withTreqCode(String treqCode) {
        this.treqCode = treqCode;
        return this;
    }

    /**
     * Estimated Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ESTIMATE_DATE
     * 
     */
    @JsonProperty("estimateDate")
    public Date getEstimateDate() {
        return estimateDate;
    }

    /**
     * Estimated Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ESTIMATE_DATE
     * 
     */
    @JsonProperty("estimateDate")
    public void setEstimateDate(Date estimateDate) {
        this.estimateDate = estimateDate;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withEstimateDate(Date estimateDate) {
        this.estimateDate = estimateDate;
        return this;
    }

    /**
     * Actual Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ACTUAL_DATE
     * 
     */
    @JsonProperty("actualDate")
    public Date getActualDate() {
        return actualDate;
    }

    /**
     * Actual Completion Date
     * <p>
     * Lineage reference object : SERDTGL_ACTUAL_DATE
     * 
     */
    @JsonProperty("actualDate")
    public void setActualDate(Date actualDate) {
        this.actualDate = actualDate;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withActualDate(Date actualDate) {
        this.actualDate = actualDate;
        return this;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    public String getSsrsCode() {
        return ssrsCode;
    }

    /**
     * Result
     * <p>
     * Lineage reference object : SERDTGL_SSRS_CODE, Lookup lineage reference object : stvssrs
     * 
     */
    @JsonProperty("ssrsCode")
    public void setSsrsCode(String ssrsCode) {
        this.ssrsCode = ssrsCode;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withSsrsCode(String ssrsCode) {
        this.ssrsCode = ssrsCode;
        return this;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Review
     * <p>
     * Lineage reference object : SERDTGL_ORIG_CODE, Lookup lineage reference object : stvorig
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public SupportServiceDetailGoalAssignments100QapiPost withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public SupportServiceDetailGoalAssignments100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupportServiceDetailGoalAssignments100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("seadetlId");
        sb.append('=');
        sb.append(((this.seadetlId == null)?"<null>":this.seadetlId));
        sb.append(',');
        sb.append("seadetlTermCodeEff");
        sb.append('=');
        sb.append(((this.seadetlTermCodeEff == null)?"<null>":this.seadetlTermCodeEff));
        sb.append(',');
        sb.append("seadetlSsgpCode");
        sb.append('=');
        sb.append(((this.seadetlSsgpCode == null)?"<null>":this.seadetlSsgpCode));
        sb.append(',');
        sb.append("goalCode");
        sb.append('=');
        sb.append(((this.goalCode == null)?"<null>":this.goalCode));
        sb.append(',');
        sb.append("ssgpCode");
        sb.append('=');
        sb.append(((this.ssgpCode == null)?"<null>":this.ssgpCode));
        sb.append(',');
        sb.append("priorityNbr");
        sb.append('=');
        sb.append(((this.priorityNbr == null)?"<null>":this.priorityNbr));
        sb.append(',');
        sb.append("treqCode");
        sb.append('=');
        sb.append(((this.treqCode == null)?"<null>":this.treqCode));
        sb.append(',');
        sb.append("estimateDate");
        sb.append('=');
        sb.append(((this.estimateDate == null)?"<null>":this.estimateDate));
        sb.append(',');
        sb.append("actualDate");
        sb.append('=');
        sb.append(((this.actualDate == null)?"<null>":this.actualDate));
        sb.append(',');
        sb.append("ssrsCode");
        sb.append('=');
        sb.append(((this.ssrsCode == null)?"<null>":this.ssrsCode));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
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
        result = ((result* 31)+((this.goalCode == null)? 0 :this.goalCode.hashCode()));
        result = ((result* 31)+((this.seadetlSsgpCode == null)? 0 :this.seadetlSsgpCode.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        result = ((result* 31)+((this.seadetlTermCodeEff == null)? 0 :this.seadetlTermCodeEff.hashCode()));
        result = ((result* 31)+((this.ssgpCode == null)? 0 :this.ssgpCode.hashCode()));
        result = ((result* 31)+((this.treqCode == null)? 0 :this.treqCode.hashCode()));
        result = ((result* 31)+((this.seadetlId == null)? 0 :this.seadetlId.hashCode()));
        result = ((result* 31)+((this.actualDate == null)? 0 :this.actualDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priorityNbr == null)? 0 :this.priorityNbr.hashCode()));
        result = ((result* 31)+((this.ssrsCode == null)? 0 :this.ssrsCode.hashCode()));
        result = ((result* 31)+((this.estimateDate == null)? 0 :this.estimateDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupportServiceDetailGoalAssignments100QapiPost) == false) {
            return false;
        }
        SupportServiceDetailGoalAssignments100QapiPost rhs = ((SupportServiceDetailGoalAssignments100QapiPost) other);
        return (((((((((((((this.goalCode == rhs.goalCode)||((this.goalCode!= null)&&this.goalCode.equals(rhs.goalCode)))&&((this.seadetlSsgpCode == rhs.seadetlSsgpCode)||((this.seadetlSsgpCode!= null)&&this.seadetlSsgpCode.equals(rhs.seadetlSsgpCode))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))))&&((this.seadetlTermCodeEff == rhs.seadetlTermCodeEff)||((this.seadetlTermCodeEff!= null)&&this.seadetlTermCodeEff.equals(rhs.seadetlTermCodeEff))))&&((this.ssgpCode == rhs.ssgpCode)||((this.ssgpCode!= null)&&this.ssgpCode.equals(rhs.ssgpCode))))&&((this.treqCode == rhs.treqCode)||((this.treqCode!= null)&&this.treqCode.equals(rhs.treqCode))))&&((this.seadetlId == rhs.seadetlId)||((this.seadetlId!= null)&&this.seadetlId.equals(rhs.seadetlId))))&&((this.actualDate == rhs.actualDate)||((this.actualDate!= null)&&this.actualDate.equals(rhs.actualDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priorityNbr == rhs.priorityNbr)||((this.priorityNbr!= null)&&this.priorityNbr.equals(rhs.priorityNbr))))&&((this.ssrsCode == rhs.ssrsCode)||((this.ssrsCode!= null)&&this.ssrsCode.equals(rhs.ssrsCode))))&&((this.estimateDate == rhs.estimateDate)||((this.estimateDate!= null)&&this.estimateDate.equals(rhs.estimateDate))));
    }

}
