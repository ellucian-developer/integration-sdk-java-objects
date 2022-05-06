
package com.ellucian.generated.bpapi.ban.discount_terms.v1_0_0;

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
    "code",
    "days",
    "desc",
    "effDate",
    "endOfMonthInd",
    "pct",
    "termDate"
})
@Generated("jsonschema2pojo")
public class DiscountTerms100QapiPost {

    /**
     * Discount
     * Code
     * <p>
     * Lineage reference object : FTVDISC_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_CODE")
    private String code;
    /**
     * Days
     * <p>
     * Lineage reference object : FTVDISC_DAYS
     * 
     */
    @JsonProperty("days")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_DAYS")
    private Double days;
    /**
     * Description
     * <p>
     * Lineage reference object : FTVDISC_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_DESC")
    private String desc;
    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVDISC_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_EFF_DATE")
    private Date effDate;
    /**
     * Month
     * End
     * <p>
     * Lineage reference object : FTVDISC_END_OF_MONTH_IND
     * 
     */
    @JsonProperty("endOfMonthInd")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_END_OF_MONTH_IND")
    private String endOfMonthInd;
    /**
     * Discount
     * Percent
     * <p>
     * Lineage reference object : FTVDISC_PCT
     * 
     */
    @JsonProperty("pct")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_PCT")
    private Double pct;
    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVDISC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_TERM_DATE")
    private Date termDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Discount
     * Code
     * <p>
     * Lineage reference object : FTVDISC_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Discount
     * Code
     * <p>
     * Lineage reference object : FTVDISC_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public DiscountTerms100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Days
     * <p>
     * Lineage reference object : FTVDISC_DAYS
     * 
     */
    @JsonProperty("days")
    public Double getDays() {
        return days;
    }

    /**
     * Days
     * <p>
     * Lineage reference object : FTVDISC_DAYS
     * 
     */
    @JsonProperty("days")
    public void setDays(Double days) {
        this.days = days;
    }

    public DiscountTerms100QapiPost withDays(Double days) {
        this.days = days;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVDISC_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : FTVDISC_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DiscountTerms100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVDISC_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective
     * Date
     * <p>
     * Lineage reference object : FTVDISC_EFF_DATE
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public DiscountTerms100QapiPost withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Month
     * End
     * <p>
     * Lineage reference object : FTVDISC_END_OF_MONTH_IND
     * 
     */
    @JsonProperty("endOfMonthInd")
    public String getEndOfMonthInd() {
        return endOfMonthInd;
    }

    /**
     * Month
     * End
     * <p>
     * Lineage reference object : FTVDISC_END_OF_MONTH_IND
     * 
     */
    @JsonProperty("endOfMonthInd")
    public void setEndOfMonthInd(String endOfMonthInd) {
        this.endOfMonthInd = endOfMonthInd;
    }

    public DiscountTerms100QapiPost withEndOfMonthInd(String endOfMonthInd) {
        this.endOfMonthInd = endOfMonthInd;
        return this;
    }

    /**
     * Discount
     * Percent
     * <p>
     * Lineage reference object : FTVDISC_PCT
     * 
     */
    @JsonProperty("pct")
    public Double getPct() {
        return pct;
    }

    /**
     * Discount
     * Percent
     * <p>
     * Lineage reference object : FTVDISC_PCT
     * 
     */
    @JsonProperty("pct")
    public void setPct(Double pct) {
        this.pct = pct;
    }

    public DiscountTerms100QapiPost withPct(Double pct) {
        this.pct = pct;
        return this;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVDISC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination
     * Date
     * <p>
     * Lineage reference object : FTVDISC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public DiscountTerms100QapiPost withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public DiscountTerms100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DiscountTerms100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("days");
        sb.append('=');
        sb.append(((this.days == null)?"<null>":this.days));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("endOfMonthInd");
        sb.append('=');
        sb.append(((this.endOfMonthInd == null)?"<null>":this.endOfMonthInd));
        sb.append(',');
        sb.append("pct");
        sb.append('=');
        sb.append(((this.pct == null)?"<null>":this.pct));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.pct == null)? 0 :this.pct.hashCode()));
        result = ((result* 31)+((this.endOfMonthInd == null)? 0 :this.endOfMonthInd.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.days == null)? 0 :this.days.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscountTerms100QapiPost) == false) {
            return false;
        }
        DiscountTerms100QapiPost rhs = ((DiscountTerms100QapiPost) other);
        return (((((((((this.pct == rhs.pct)||((this.pct!= null)&&this.pct.equals(rhs.pct)))&&((this.endOfMonthInd == rhs.endOfMonthInd)||((this.endOfMonthInd!= null)&&this.endOfMonthInd.equals(rhs.endOfMonthInd))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.days == rhs.days)||((this.days!= null)&&this.days.equals(rhs.days))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
