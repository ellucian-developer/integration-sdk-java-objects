
package com.ellucian.generated.bpapi.ban.meal_assignment.v1_0_0;

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
    "statusDate",
    "mrcdCode",
    "keyblocTermCode",
    "criteria.rollInd",
    "mscdCode",
    "mscdDate",
    "criteria.termCode",
    "criteria.arInd",
    "workasgEndDate",
    "criteria.onlOrBat",
    "totalDays",
    "totalMonths",
    "rollInd",
    "criteria.mrcdCode",
    "criteria.mscdCode",
    "workasgBeginDate",
    "id",
    "criteria.assessNeeded",
    "termCode"
})
@Generated("jsonschema2pojo")
public class MealAssignment100PutRequest {

    /**
     * Date
     * <p>
     * Lineage reference object : statusDate
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("Lineage reference object : statusDate")
    private Date statusDate;
    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("mrcdCode")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc")
    private String mrcdCode;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Prevent Roll
     * <p>
     * Lineage reference object : SLRMASG_ROLL_IND
     * 
     */
    @JsonProperty("criteria.rollInd")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_ROLL_IND")
    private String criteriaRollInd;
    /**
     * Status
     * <p>
     * Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd
     * (Required)
     * 
     */
    @JsonProperty("mscdCode")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd")
    private String mscdCode;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SLRMASG_MSCD_DATE
     * (Required)
     * 
     */
    @JsonProperty("mscdDate")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_MSCD_DATE")
    private Date mscdDate;
    /**
     * Term
     * <p>
     * Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTermCode;
    /**
     * Lineage reference object : SLRMASG_AR_IND
     * 
     */
    @JsonProperty("criteria.arInd")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_AR_IND")
    private String criteriaArInd;
    /**
     * End Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgEndDate")
    private Date workasgEndDate;
    /**
     * Assignment Source
     * <p>
     * Lineage reference object : SLRMASG_ONL_OR_BAT
     * 
     */
    @JsonProperty("criteria.onlOrBat")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_ONL_OR_BAT")
    private String criteriaOnlOrBat;
    /**
     * Days
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_DAYS
     * (Required)
     * 
     */
    @JsonProperty("totalDays")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_TOTAL_DAYS")
    private Double totalDays;
    /**
     * Months
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_MONTHS
     * (Required)
     * 
     */
    @JsonProperty("totalMonths")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_TOTAL_MONTHS")
    private Double totalMonths;
    /**
     * Prevent Roll
     * <p>
     * Lineage reference object : SLRMASG_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_ROLL_IND")
    private String rollInd;
    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.mrcdCode")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc")
    private String criteriaMrcdCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd
     * (Required)
     * 
     */
    @JsonProperty("criteria.mscdCode")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd")
    private String criteriaMscdCode;
    /**
     * Start Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgBeginDate")
    private Date workasgBeginDate;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Lineage reference object : SLRMASG_ASSESS_NEEDED
     * 
     */
    @JsonProperty("criteria.assessNeeded")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_ASSESS_NEEDED")
    private String criteriaAssessNeeded;
    /**
     * Term
     * <p>
     * Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Date
     * <p>
     * Lineage reference object : statusDate
     * 
     */
    @JsonProperty("statusDate")
    public Date getStatusDate() {
        return statusDate;
    }

    /**
     * Date
     * <p>
     * Lineage reference object : statusDate
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public MealAssignment100PutRequest withStatusDate(Date statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("mrcdCode")
    public String getMrcdCode() {
        return mrcdCode;
    }

    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("mrcdCode")
    public void setMrcdCode(String mrcdCode) {
        this.mrcdCode = mrcdCode;
    }

    public MealAssignment100PutRequest withMrcdCode(String mrcdCode) {
        this.mrcdCode = mrcdCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public MealAssignment100PutRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Prevent Roll
     * <p>
     * Lineage reference object : SLRMASG_ROLL_IND
     * 
     */
    @JsonProperty("criteria.rollInd")
    public String getCriteriaRollInd() {
        return criteriaRollInd;
    }

    /**
     * Prevent Roll
     * <p>
     * Lineage reference object : SLRMASG_ROLL_IND
     * 
     */
    @JsonProperty("criteria.rollInd")
    public void setCriteriaRollInd(String criteriaRollInd) {
        this.criteriaRollInd = criteriaRollInd;
    }

    public MealAssignment100PutRequest withCriteriaRollInd(String criteriaRollInd) {
        this.criteriaRollInd = criteriaRollInd;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd
     * (Required)
     * 
     */
    @JsonProperty("mscdCode")
    public String getMscdCode() {
        return mscdCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd
     * (Required)
     * 
     */
    @JsonProperty("mscdCode")
    public void setMscdCode(String mscdCode) {
        this.mscdCode = mscdCode;
    }

    public MealAssignment100PutRequest withMscdCode(String mscdCode) {
        this.mscdCode = mscdCode;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SLRMASG_MSCD_DATE
     * (Required)
     * 
     */
    @JsonProperty("mscdDate")
    public Date getMscdDate() {
        return mscdDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SLRMASG_MSCD_DATE
     * (Required)
     * 
     */
    @JsonProperty("mscdDate")
    public void setMscdDate(Date mscdDate) {
        this.mscdDate = mscdDate;
    }

    public MealAssignment100PutRequest withMscdDate(Date mscdDate) {
        this.mscdDate = mscdDate;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public String getCriteriaTermCode() {
        return criteriaTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public MealAssignment100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
        return this;
    }

    /**
     * Lineage reference object : SLRMASG_AR_IND
     * 
     */
    @JsonProperty("criteria.arInd")
    public String getCriteriaArInd() {
        return criteriaArInd;
    }

    /**
     * Lineage reference object : SLRMASG_AR_IND
     * 
     */
    @JsonProperty("criteria.arInd")
    public void setCriteriaArInd(String criteriaArInd) {
        this.criteriaArInd = criteriaArInd;
    }

    public MealAssignment100PutRequest withCriteriaArInd(String criteriaArInd) {
        this.criteriaArInd = criteriaArInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgEndDate")
    public Date getWorkasgEndDate() {
        return workasgEndDate;
    }

    /**
     * End Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgEndDate")
    public void setWorkasgEndDate(Date workasgEndDate) {
        this.workasgEndDate = workasgEndDate;
    }

    public MealAssignment100PutRequest withWorkasgEndDate(Date workasgEndDate) {
        this.workasgEndDate = workasgEndDate;
        return this;
    }

    /**
     * Assignment Source
     * <p>
     * Lineage reference object : SLRMASG_ONL_OR_BAT
     * 
     */
    @JsonProperty("criteria.onlOrBat")
    public String getCriteriaOnlOrBat() {
        return criteriaOnlOrBat;
    }

    /**
     * Assignment Source
     * <p>
     * Lineage reference object : SLRMASG_ONL_OR_BAT
     * 
     */
    @JsonProperty("criteria.onlOrBat")
    public void setCriteriaOnlOrBat(String criteriaOnlOrBat) {
        this.criteriaOnlOrBat = criteriaOnlOrBat;
    }

    public MealAssignment100PutRequest withCriteriaOnlOrBat(String criteriaOnlOrBat) {
        this.criteriaOnlOrBat = criteriaOnlOrBat;
        return this;
    }

    /**
     * Days
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_DAYS
     * (Required)
     * 
     */
    @JsonProperty("totalDays")
    public Double getTotalDays() {
        return totalDays;
    }

    /**
     * Days
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_DAYS
     * (Required)
     * 
     */
    @JsonProperty("totalDays")
    public void setTotalDays(Double totalDays) {
        this.totalDays = totalDays;
    }

    public MealAssignment100PutRequest withTotalDays(Double totalDays) {
        this.totalDays = totalDays;
        return this;
    }

    /**
     * Months
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_MONTHS
     * (Required)
     * 
     */
    @JsonProperty("totalMonths")
    public Double getTotalMonths() {
        return totalMonths;
    }

    /**
     * Months
     * <p>
     * Lineage reference object : SLRMASG_TOTAL_MONTHS
     * (Required)
     * 
     */
    @JsonProperty("totalMonths")
    public void setTotalMonths(Double totalMonths) {
        this.totalMonths = totalMonths;
    }

    public MealAssignment100PutRequest withTotalMonths(Double totalMonths) {
        this.totalMonths = totalMonths;
        return this;
    }

    /**
     * Prevent Roll
     * <p>
     * Lineage reference object : SLRMASG_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    public String getRollInd() {
        return rollInd;
    }

    /**
     * Prevent Roll
     * <p>
     * Lineage reference object : SLRMASG_ROLL_IND
     * 
     */
    @JsonProperty("rollInd")
    public void setRollInd(String rollInd) {
        this.rollInd = rollInd;
    }

    public MealAssignment100PutRequest withRollInd(String rollInd) {
        this.rollInd = rollInd;
        return this;
    }

    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.mrcdCode")
    public String getCriteriaMrcdCode() {
        return criteriaMrcdCode;
    }

    /**
     * Meal Plan
     * <p>
     * Lineage reference object : SLRMASG_MRCD_CODE, Lookup lineage reference object : slrlmfe,tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.mrcdCode")
    public void setCriteriaMrcdCode(String criteriaMrcdCode) {
        this.criteriaMrcdCode = criteriaMrcdCode;
    }

    public MealAssignment100PutRequest withCriteriaMrcdCode(String criteriaMrcdCode) {
        this.criteriaMrcdCode = criteriaMrcdCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd
     * (Required)
     * 
     */
    @JsonProperty("criteria.mscdCode")
    public String getCriteriaMscdCode() {
        return criteriaMscdCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SLRMASG_MSCD_CODE, Lookup lineage reference object : stvmscd
     * (Required)
     * 
     */
    @JsonProperty("criteria.mscdCode")
    public void setCriteriaMscdCode(String criteriaMscdCode) {
        this.criteriaMscdCode = criteriaMscdCode;
    }

    public MealAssignment100PutRequest withCriteriaMscdCode(String criteriaMscdCode) {
        this.criteriaMscdCode = criteriaMscdCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgBeginDate")
    public Date getWorkasgBeginDate() {
        return workasgBeginDate;
    }

    /**
     * Start Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("workasgBeginDate")
    public void setWorkasgBeginDate(Date workasgBeginDate) {
        this.workasgBeginDate = workasgBeginDate;
    }

    public MealAssignment100PutRequest withWorkasgBeginDate(Date workasgBeginDate) {
        this.workasgBeginDate = workasgBeginDate;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public MealAssignment100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Lineage reference object : SLRMASG_ASSESS_NEEDED
     * 
     */
    @JsonProperty("criteria.assessNeeded")
    public String getCriteriaAssessNeeded() {
        return criteriaAssessNeeded;
    }

    /**
     * Lineage reference object : SLRMASG_ASSESS_NEEDED
     * 
     */
    @JsonProperty("criteria.assessNeeded")
    public void setCriteriaAssessNeeded(String criteriaAssessNeeded) {
        this.criteriaAssessNeeded = criteriaAssessNeeded;
    }

    public MealAssignment100PutRequest withCriteriaAssessNeeded(String criteriaAssessNeeded) {
        this.criteriaAssessNeeded = criteriaAssessNeeded;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SLRMASG_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public MealAssignment100PutRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public MealAssignment100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MealAssignment100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("mrcdCode");
        sb.append('=');
        sb.append(((this.mrcdCode == null)?"<null>":this.mrcdCode));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("criteriaRollInd");
        sb.append('=');
        sb.append(((this.criteriaRollInd == null)?"<null>":this.criteriaRollInd));
        sb.append(',');
        sb.append("mscdCode");
        sb.append('=');
        sb.append(((this.mscdCode == null)?"<null>":this.mscdCode));
        sb.append(',');
        sb.append("mscdDate");
        sb.append('=');
        sb.append(((this.mscdDate == null)?"<null>":this.mscdDate));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("criteriaArInd");
        sb.append('=');
        sb.append(((this.criteriaArInd == null)?"<null>":this.criteriaArInd));
        sb.append(',');
        sb.append("workasgEndDate");
        sb.append('=');
        sb.append(((this.workasgEndDate == null)?"<null>":this.workasgEndDate));
        sb.append(',');
        sb.append("criteriaOnlOrBat");
        sb.append('=');
        sb.append(((this.criteriaOnlOrBat == null)?"<null>":this.criteriaOnlOrBat));
        sb.append(',');
        sb.append("totalDays");
        sb.append('=');
        sb.append(((this.totalDays == null)?"<null>":this.totalDays));
        sb.append(',');
        sb.append("totalMonths");
        sb.append('=');
        sb.append(((this.totalMonths == null)?"<null>":this.totalMonths));
        sb.append(',');
        sb.append("rollInd");
        sb.append('=');
        sb.append(((this.rollInd == null)?"<null>":this.rollInd));
        sb.append(',');
        sb.append("criteriaMrcdCode");
        sb.append('=');
        sb.append(((this.criteriaMrcdCode == null)?"<null>":this.criteriaMrcdCode));
        sb.append(',');
        sb.append("criteriaMscdCode");
        sb.append('=');
        sb.append(((this.criteriaMscdCode == null)?"<null>":this.criteriaMscdCode));
        sb.append(',');
        sb.append("workasgBeginDate");
        sb.append('=');
        sb.append(((this.workasgBeginDate == null)?"<null>":this.workasgBeginDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaAssessNeeded");
        sb.append('=');
        sb.append(((this.criteriaAssessNeeded == null)?"<null>":this.criteriaAssessNeeded));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this.mrcdCode == null)? 0 :this.mrcdCode.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.mscdCode == null)? 0 :this.mscdCode.hashCode()));
        result = ((result* 31)+((this.mscdDate == null)? 0 :this.mscdDate.hashCode()));
        result = ((result* 31)+((this.workasgEndDate == null)? 0 :this.workasgEndDate.hashCode()));
        result = ((result* 31)+((this.criteriaMrcdCode == null)? 0 :this.criteriaMrcdCode.hashCode()));
        result = ((result* 31)+((this.criteriaArInd == null)? 0 :this.criteriaArInd.hashCode()));
        result = ((result* 31)+((this.totalDays == null)? 0 :this.totalDays.hashCode()));
        result = ((result* 31)+((this.totalMonths == null)? 0 :this.totalMonths.hashCode()));
        result = ((result* 31)+((this.rollInd == null)? 0 :this.rollInd.hashCode()));
        result = ((result* 31)+((this.criteriaOnlOrBat == null)? 0 :this.criteriaOnlOrBat.hashCode()));
        result = ((result* 31)+((this.criteriaRollInd == null)? 0 :this.criteriaRollInd.hashCode()));
        result = ((result* 31)+((this.workasgBeginDate == null)? 0 :this.workasgBeginDate.hashCode()));
        result = ((result* 31)+((this.criteriaMscdCode == null)? 0 :this.criteriaMscdCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaAssessNeeded == null)? 0 :this.criteriaAssessNeeded.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MealAssignment100PutRequest) == false) {
            return false;
        }
        MealAssignment100PutRequest rhs = ((MealAssignment100PutRequest) other);
        return (((((((((((((((((((((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate)))&&((this.mrcdCode == rhs.mrcdCode)||((this.mrcdCode!= null)&&this.mrcdCode.equals(rhs.mrcdCode))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.mscdCode == rhs.mscdCode)||((this.mscdCode!= null)&&this.mscdCode.equals(rhs.mscdCode))))&&((this.mscdDate == rhs.mscdDate)||((this.mscdDate!= null)&&this.mscdDate.equals(rhs.mscdDate))))&&((this.workasgEndDate == rhs.workasgEndDate)||((this.workasgEndDate!= null)&&this.workasgEndDate.equals(rhs.workasgEndDate))))&&((this.criteriaMrcdCode == rhs.criteriaMrcdCode)||((this.criteriaMrcdCode!= null)&&this.criteriaMrcdCode.equals(rhs.criteriaMrcdCode))))&&((this.criteriaArInd == rhs.criteriaArInd)||((this.criteriaArInd!= null)&&this.criteriaArInd.equals(rhs.criteriaArInd))))&&((this.totalDays == rhs.totalDays)||((this.totalDays!= null)&&this.totalDays.equals(rhs.totalDays))))&&((this.totalMonths == rhs.totalMonths)||((this.totalMonths!= null)&&this.totalMonths.equals(rhs.totalMonths))))&&((this.rollInd == rhs.rollInd)||((this.rollInd!= null)&&this.rollInd.equals(rhs.rollInd))))&&((this.criteriaOnlOrBat == rhs.criteriaOnlOrBat)||((this.criteriaOnlOrBat!= null)&&this.criteriaOnlOrBat.equals(rhs.criteriaOnlOrBat))))&&((this.criteriaRollInd == rhs.criteriaRollInd)||((this.criteriaRollInd!= null)&&this.criteriaRollInd.equals(rhs.criteriaRollInd))))&&((this.workasgBeginDate == rhs.workasgBeginDate)||((this.workasgBeginDate!= null)&&this.workasgBeginDate.equals(rhs.workasgBeginDate))))&&((this.criteriaMscdCode == rhs.criteriaMscdCode)||((this.criteriaMscdCode!= null)&&this.criteriaMscdCode.equals(rhs.criteriaMscdCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaAssessNeeded == rhs.criteriaAssessNeeded)||((this.criteriaAssessNeeded!= null)&&this.criteriaAssessNeeded.equals(rhs.criteriaAssessNeeded))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
