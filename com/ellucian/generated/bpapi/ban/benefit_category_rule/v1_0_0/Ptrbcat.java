
package com.ellucian.generated.bpapi.ban.benefit_category_rule.v1_0_0;

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
    "calcFactor",
    "newhireEnrollDays",
    "flexAmt",
    "openBeginDate",
    "enrlBaseDateMethod",
    "openEffectiveDate",
    "webAccessInd",
    "dateOverrideInd",
    "desc",
    "openEndDate"
})
@Generated("jsonschema2pojo")
public class Ptrbcat {

    @JsonProperty("calcFactor")
    private String calcFactor;
    /**
     * Enrollment Days
     * <p>
     * Lineage reference object : PTRBCAT_NEWHIRE_ENROLL_DAYS
     * 
     */
    @JsonProperty("newhireEnrollDays")
    @JsonPropertyDescription("Lineage reference object : PTRBCAT_NEWHIRE_ENROLL_DAYS")
    private Double newhireEnrollDays;
    /**
     * Flex Amount
     * <p>
     * Lineage reference object : PTRBCAT_FLEX_AMT
     * 
     */
    @JsonProperty("flexAmt")
    @JsonPropertyDescription("Lineage reference object : PTRBCAT_FLEX_AMT")
    private Double flexAmt;
    /**
     * Open Enrollment Begins
     * <p>
     * Lineage reference object : PTRBCAT_OPEN_BEGIN_DATE
     * 
     */
    @JsonProperty("openBeginDate")
    @JsonPropertyDescription("Lineage reference object : PTRBCAT_OPEN_BEGIN_DATE")
    private Date openBeginDate;
    /**
     * Employment Base Enrollment Date
     * <p>
     * Lineage reference object : PTRBCAT_ENRL_BASE_DATE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("enrlBaseDateMethod")
    @JsonPropertyDescription("Lineage reference object : PTRBCAT_ENRL_BASE_DATE_METHOD")
    private String enrlBaseDateMethod;
    /**
     * Updates made via Web will become effective
     * <p>
     * Lineage reference object : PTRBCAT_OPEN_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("openEffectiveDate")
    @JsonPropertyDescription("Lineage reference object : PTRBCAT_OPEN_EFFECTIVE_DATE")
    private Date openEffectiveDate;
    /**
     * Benefits or Deductions can be Accessed via Web
     * <p>
     * Lineage reference object : PTRBCAT_WEB_ACCESS_IND
     * 
     */
    @JsonProperty("webAccessInd")
    @JsonPropertyDescription("Lineage reference object : PTRBCAT_WEB_ACCESS_IND")
    private String webAccessInd;
    /**
     * Lineage reference object : PTRBCAT_DATE_OVERRIDE_IND
     * 
     */
    @JsonProperty("dateOverrideInd")
    @JsonPropertyDescription("Lineage reference object : PTRBCAT_DATE_OVERRIDE_IND")
    private String dateOverrideInd;
    /**
     * Category Description
     * <p>
     * Lineage reference object : PTRBCAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTRBCAT_DESC")
    private String desc;
    /**
     * Open Enrollment Ends
     * <p>
     * Lineage reference object : PTRBCAT_OPEN_END_DATE
     * 
     */
    @JsonProperty("openEndDate")
    @JsonPropertyDescription("Lineage reference object : PTRBCAT_OPEN_END_DATE")
    private Date openEndDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("calcFactor")
    public String getCalcFactor() {
        return calcFactor;
    }

    @JsonProperty("calcFactor")
    public void setCalcFactor(String calcFactor) {
        this.calcFactor = calcFactor;
    }

    public Ptrbcat withCalcFactor(String calcFactor) {
        this.calcFactor = calcFactor;
        return this;
    }

    /**
     * Enrollment Days
     * <p>
     * Lineage reference object : PTRBCAT_NEWHIRE_ENROLL_DAYS
     * 
     */
    @JsonProperty("newhireEnrollDays")
    public Double getNewhireEnrollDays() {
        return newhireEnrollDays;
    }

    /**
     * Enrollment Days
     * <p>
     * Lineage reference object : PTRBCAT_NEWHIRE_ENROLL_DAYS
     * 
     */
    @JsonProperty("newhireEnrollDays")
    public void setNewhireEnrollDays(Double newhireEnrollDays) {
        this.newhireEnrollDays = newhireEnrollDays;
    }

    public Ptrbcat withNewhireEnrollDays(Double newhireEnrollDays) {
        this.newhireEnrollDays = newhireEnrollDays;
        return this;
    }

    /**
     * Flex Amount
     * <p>
     * Lineage reference object : PTRBCAT_FLEX_AMT
     * 
     */
    @JsonProperty("flexAmt")
    public Double getFlexAmt() {
        return flexAmt;
    }

    /**
     * Flex Amount
     * <p>
     * Lineage reference object : PTRBCAT_FLEX_AMT
     * 
     */
    @JsonProperty("flexAmt")
    public void setFlexAmt(Double flexAmt) {
        this.flexAmt = flexAmt;
    }

    public Ptrbcat withFlexAmt(Double flexAmt) {
        this.flexAmt = flexAmt;
        return this;
    }

    /**
     * Open Enrollment Begins
     * <p>
     * Lineage reference object : PTRBCAT_OPEN_BEGIN_DATE
     * 
     */
    @JsonProperty("openBeginDate")
    public Date getOpenBeginDate() {
        return openBeginDate;
    }

    /**
     * Open Enrollment Begins
     * <p>
     * Lineage reference object : PTRBCAT_OPEN_BEGIN_DATE
     * 
     */
    @JsonProperty("openBeginDate")
    public void setOpenBeginDate(Date openBeginDate) {
        this.openBeginDate = openBeginDate;
    }

    public Ptrbcat withOpenBeginDate(Date openBeginDate) {
        this.openBeginDate = openBeginDate;
        return this;
    }

    /**
     * Employment Base Enrollment Date
     * <p>
     * Lineage reference object : PTRBCAT_ENRL_BASE_DATE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("enrlBaseDateMethod")
    public String getEnrlBaseDateMethod() {
        return enrlBaseDateMethod;
    }

    /**
     * Employment Base Enrollment Date
     * <p>
     * Lineage reference object : PTRBCAT_ENRL_BASE_DATE_METHOD
     * (Required)
     * 
     */
    @JsonProperty("enrlBaseDateMethod")
    public void setEnrlBaseDateMethod(String enrlBaseDateMethod) {
        this.enrlBaseDateMethod = enrlBaseDateMethod;
    }

    public Ptrbcat withEnrlBaseDateMethod(String enrlBaseDateMethod) {
        this.enrlBaseDateMethod = enrlBaseDateMethod;
        return this;
    }

    /**
     * Updates made via Web will become effective
     * <p>
     * Lineage reference object : PTRBCAT_OPEN_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("openEffectiveDate")
    public Date getOpenEffectiveDate() {
        return openEffectiveDate;
    }

    /**
     * Updates made via Web will become effective
     * <p>
     * Lineage reference object : PTRBCAT_OPEN_EFFECTIVE_DATE
     * 
     */
    @JsonProperty("openEffectiveDate")
    public void setOpenEffectiveDate(Date openEffectiveDate) {
        this.openEffectiveDate = openEffectiveDate;
    }

    public Ptrbcat withOpenEffectiveDate(Date openEffectiveDate) {
        this.openEffectiveDate = openEffectiveDate;
        return this;
    }

    /**
     * Benefits or Deductions can be Accessed via Web
     * <p>
     * Lineage reference object : PTRBCAT_WEB_ACCESS_IND
     * 
     */
    @JsonProperty("webAccessInd")
    public String getWebAccessInd() {
        return webAccessInd;
    }

    /**
     * Benefits or Deductions can be Accessed via Web
     * <p>
     * Lineage reference object : PTRBCAT_WEB_ACCESS_IND
     * 
     */
    @JsonProperty("webAccessInd")
    public void setWebAccessInd(String webAccessInd) {
        this.webAccessInd = webAccessInd;
    }

    public Ptrbcat withWebAccessInd(String webAccessInd) {
        this.webAccessInd = webAccessInd;
        return this;
    }

    /**
     * Lineage reference object : PTRBCAT_DATE_OVERRIDE_IND
     * 
     */
    @JsonProperty("dateOverrideInd")
    public String getDateOverrideInd() {
        return dateOverrideInd;
    }

    /**
     * Lineage reference object : PTRBCAT_DATE_OVERRIDE_IND
     * 
     */
    @JsonProperty("dateOverrideInd")
    public void setDateOverrideInd(String dateOverrideInd) {
        this.dateOverrideInd = dateOverrideInd;
    }

    public Ptrbcat withDateOverrideInd(String dateOverrideInd) {
        this.dateOverrideInd = dateOverrideInd;
        return this;
    }

    /**
     * Category Description
     * <p>
     * Lineage reference object : PTRBCAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Category Description
     * <p>
     * Lineage reference object : PTRBCAT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Ptrbcat withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Open Enrollment Ends
     * <p>
     * Lineage reference object : PTRBCAT_OPEN_END_DATE
     * 
     */
    @JsonProperty("openEndDate")
    public Date getOpenEndDate() {
        return openEndDate;
    }

    /**
     * Open Enrollment Ends
     * <p>
     * Lineage reference object : PTRBCAT_OPEN_END_DATE
     * 
     */
    @JsonProperty("openEndDate")
    public void setOpenEndDate(Date openEndDate) {
        this.openEndDate = openEndDate;
    }

    public Ptrbcat withOpenEndDate(Date openEndDate) {
        this.openEndDate = openEndDate;
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

    public Ptrbcat withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ptrbcat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("calcFactor");
        sb.append('=');
        sb.append(((this.calcFactor == null)?"<null>":this.calcFactor));
        sb.append(',');
        sb.append("newhireEnrollDays");
        sb.append('=');
        sb.append(((this.newhireEnrollDays == null)?"<null>":this.newhireEnrollDays));
        sb.append(',');
        sb.append("flexAmt");
        sb.append('=');
        sb.append(((this.flexAmt == null)?"<null>":this.flexAmt));
        sb.append(',');
        sb.append("openBeginDate");
        sb.append('=');
        sb.append(((this.openBeginDate == null)?"<null>":this.openBeginDate));
        sb.append(',');
        sb.append("enrlBaseDateMethod");
        sb.append('=');
        sb.append(((this.enrlBaseDateMethod == null)?"<null>":this.enrlBaseDateMethod));
        sb.append(',');
        sb.append("openEffectiveDate");
        sb.append('=');
        sb.append(((this.openEffectiveDate == null)?"<null>":this.openEffectiveDate));
        sb.append(',');
        sb.append("webAccessInd");
        sb.append('=');
        sb.append(((this.webAccessInd == null)?"<null>":this.webAccessInd));
        sb.append(',');
        sb.append("dateOverrideInd");
        sb.append('=');
        sb.append(((this.dateOverrideInd == null)?"<null>":this.dateOverrideInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("openEndDate");
        sb.append('=');
        sb.append(((this.openEndDate == null)?"<null>":this.openEndDate));
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
        result = ((result* 31)+((this.calcFactor == null)? 0 :this.calcFactor.hashCode()));
        result = ((result* 31)+((this.newhireEnrollDays == null)? 0 :this.newhireEnrollDays.hashCode()));
        result = ((result* 31)+((this.flexAmt == null)? 0 :this.flexAmt.hashCode()));
        result = ((result* 31)+((this.openBeginDate == null)? 0 :this.openBeginDate.hashCode()));
        result = ((result* 31)+((this.enrlBaseDateMethod == null)? 0 :this.enrlBaseDateMethod.hashCode()));
        result = ((result* 31)+((this.openEffectiveDate == null)? 0 :this.openEffectiveDate.hashCode()));
        result = ((result* 31)+((this.webAccessInd == null)? 0 :this.webAccessInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dateOverrideInd == null)? 0 :this.dateOverrideInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.openEndDate == null)? 0 :this.openEndDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ptrbcat) == false) {
            return false;
        }
        Ptrbcat rhs = ((Ptrbcat) other);
        return ((((((((((((this.calcFactor == rhs.calcFactor)||((this.calcFactor!= null)&&this.calcFactor.equals(rhs.calcFactor)))&&((this.newhireEnrollDays == rhs.newhireEnrollDays)||((this.newhireEnrollDays!= null)&&this.newhireEnrollDays.equals(rhs.newhireEnrollDays))))&&((this.flexAmt == rhs.flexAmt)||((this.flexAmt!= null)&&this.flexAmt.equals(rhs.flexAmt))))&&((this.openBeginDate == rhs.openBeginDate)||((this.openBeginDate!= null)&&this.openBeginDate.equals(rhs.openBeginDate))))&&((this.enrlBaseDateMethod == rhs.enrlBaseDateMethod)||((this.enrlBaseDateMethod!= null)&&this.enrlBaseDateMethod.equals(rhs.enrlBaseDateMethod))))&&((this.openEffectiveDate == rhs.openEffectiveDate)||((this.openEffectiveDate!= null)&&this.openEffectiveDate.equals(rhs.openEffectiveDate))))&&((this.webAccessInd == rhs.webAccessInd)||((this.webAccessInd!= null)&&this.webAccessInd.equals(rhs.webAccessInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dateOverrideInd == rhs.dateOverrideInd)||((this.dateOverrideInd!= null)&&this.dateOverrideInd.equals(rhs.dateOverrideInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.openEndDate == rhs.openEndDate)||((this.openEndDate!= null)&&this.openEndDate.equals(rhs.openEndDate))));
    }

}
