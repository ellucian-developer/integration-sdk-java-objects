
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
    "arInd",
    "keyblocTermCode",
    "rollInd",
    "mscdCode",
    "id",
    "onlOrBat",
    "termCode",
    "assessNeeded"
})
@Generated("jsonschema2pojo")
public class MealAssignment100GetRequest {

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
     * Lineage reference object : SLRMASG_AR_IND
     * 
     */
    @JsonProperty("arInd")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_AR_IND")
    private String arInd;
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
    @JsonProperty("rollInd")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_ROLL_IND")
    private String rollInd;
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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Assignment Source
     * <p>
     * Lineage reference object : SLRMASG_ONL_OR_BAT
     * 
     */
    @JsonProperty("onlOrBat")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_ONL_OR_BAT")
    private String onlOrBat;
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
    /**
     * Lineage reference object : SLRMASG_ASSESS_NEEDED
     * 
     */
    @JsonProperty("assessNeeded")
    @JsonPropertyDescription("Lineage reference object : SLRMASG_ASSESS_NEEDED")
    private String assessNeeded;
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

    public MealAssignment100GetRequest withStatusDate(Date statusDate) {
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

    public MealAssignment100GetRequest withMrcdCode(String mrcdCode) {
        this.mrcdCode = mrcdCode;
        return this;
    }

    /**
     * Lineage reference object : SLRMASG_AR_IND
     * 
     */
    @JsonProperty("arInd")
    public String getArInd() {
        return arInd;
    }

    /**
     * Lineage reference object : SLRMASG_AR_IND
     * 
     */
    @JsonProperty("arInd")
    public void setArInd(String arInd) {
        this.arInd = arInd;
    }

    public MealAssignment100GetRequest withArInd(String arInd) {
        this.arInd = arInd;
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

    public MealAssignment100GetRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
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

    public MealAssignment100GetRequest withRollInd(String rollInd) {
        this.rollInd = rollInd;
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

    public MealAssignment100GetRequest withMscdCode(String mscdCode) {
        this.mscdCode = mscdCode;
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

    public MealAssignment100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Assignment Source
     * <p>
     * Lineage reference object : SLRMASG_ONL_OR_BAT
     * 
     */
    @JsonProperty("onlOrBat")
    public String getOnlOrBat() {
        return onlOrBat;
    }

    /**
     * Assignment Source
     * <p>
     * Lineage reference object : SLRMASG_ONL_OR_BAT
     * 
     */
    @JsonProperty("onlOrBat")
    public void setOnlOrBat(String onlOrBat) {
        this.onlOrBat = onlOrBat;
    }

    public MealAssignment100GetRequest withOnlOrBat(String onlOrBat) {
        this.onlOrBat = onlOrBat;
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

    public MealAssignment100GetRequest withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * Lineage reference object : SLRMASG_ASSESS_NEEDED
     * 
     */
    @JsonProperty("assessNeeded")
    public String getAssessNeeded() {
        return assessNeeded;
    }

    /**
     * Lineage reference object : SLRMASG_ASSESS_NEEDED
     * 
     */
    @JsonProperty("assessNeeded")
    public void setAssessNeeded(String assessNeeded) {
        this.assessNeeded = assessNeeded;
    }

    public MealAssignment100GetRequest withAssessNeeded(String assessNeeded) {
        this.assessNeeded = assessNeeded;
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

    public MealAssignment100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MealAssignment100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("mrcdCode");
        sb.append('=');
        sb.append(((this.mrcdCode == null)?"<null>":this.mrcdCode));
        sb.append(',');
        sb.append("arInd");
        sb.append('=');
        sb.append(((this.arInd == null)?"<null>":this.arInd));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("rollInd");
        sb.append('=');
        sb.append(((this.rollInd == null)?"<null>":this.rollInd));
        sb.append(',');
        sb.append("mscdCode");
        sb.append('=');
        sb.append(((this.mscdCode == null)?"<null>":this.mscdCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("onlOrBat");
        sb.append('=');
        sb.append(((this.onlOrBat == null)?"<null>":this.onlOrBat));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("assessNeeded");
        sb.append('=');
        sb.append(((this.assessNeeded == null)?"<null>":this.assessNeeded));
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
        result = ((result* 31)+((this.arInd == null)? 0 :this.arInd.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.rollInd == null)? 0 :this.rollInd.hashCode()));
        result = ((result* 31)+((this.mscdCode == null)? 0 :this.mscdCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.onlOrBat == null)? 0 :this.onlOrBat.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.assessNeeded == null)? 0 :this.assessNeeded.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MealAssignment100GetRequest) == false) {
            return false;
        }
        MealAssignment100GetRequest rhs = ((MealAssignment100GetRequest) other);
        return ((((((((((((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate)))&&((this.mrcdCode == rhs.mrcdCode)||((this.mrcdCode!= null)&&this.mrcdCode.equals(rhs.mrcdCode))))&&((this.arInd == rhs.arInd)||((this.arInd!= null)&&this.arInd.equals(rhs.arInd))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.rollInd == rhs.rollInd)||((this.rollInd!= null)&&this.rollInd.equals(rhs.rollInd))))&&((this.mscdCode == rhs.mscdCode)||((this.mscdCode!= null)&&this.mscdCode.equals(rhs.mscdCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.onlOrBat == rhs.onlOrBat)||((this.onlOrBat!= null)&&this.onlOrBat.equals(rhs.onlOrBat))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.assessNeeded == rhs.assessNeeded)||((this.assessNeeded!= null)&&this.assessNeeded.equals(rhs.assessNeeded))));
    }

}
