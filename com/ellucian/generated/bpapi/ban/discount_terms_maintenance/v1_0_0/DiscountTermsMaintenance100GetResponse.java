
package com.ellucian.generated.bpapi.ban.discount_terms_maintenance.v1_0_0;

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
    "pct",
    "endOfMonthInd",
    "effDate",
    "activityDate",
    "code",
    "days",
    "nchgDate",
    "termDate",
    "netDays",
    "desc"
})
@Generated("jsonschema2pojo")
public class DiscountTermsMaintenance100GetResponse {

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVDISC_PCT
     * (Required)
     * 
     */
    @JsonProperty("pct")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_PCT")
    private Double pct;
    /**
     * Month End Discount
     * <p>
     * Lineage reference object : FTVDISC_END_OF_MONTH_IND
     * (Required)
     * 
     */
    @JsonProperty("endOfMonthInd")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_END_OF_MONTH_IND")
    private String endOfMonthInd;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVDISC_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_EFF_DATE")
    private Date effDate;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVDISC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Discount Code
     * <p>
     * Lineage reference object : FTVDISC_CODE, Lookup lineage reference object : ftvdisc
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_CODE, Lookup lineage reference object : ftvdisc")
    private String code;
    /**
     * Discount Days
     * <p>
     * Lineage reference object : FTVDISC_DAYS
     * 
     */
    @JsonProperty("days")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_DAYS")
    private Double days;
    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FTVDISC_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_NCHG_DATE")
    private Date nchgDate;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVDISC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_TERM_DATE")
    private Date termDate;
    /**
     * Net Days
     * <p>
     * Lineage reference object : FTVDISC_NET_DAYS
     * 
     */
    @JsonProperty("netDays")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_NET_DAYS")
    private Double netDays;
    /**
     * Discount Code Description
     * <p>
     * Lineage reference object : FTVDISC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : FTVDISC_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVDISC_PCT
     * (Required)
     * 
     */
    @JsonProperty("pct")
    public Double getPct() {
        return pct;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : FTVDISC_PCT
     * (Required)
     * 
     */
    @JsonProperty("pct")
    public void setPct(Double pct) {
        this.pct = pct;
    }

    public DiscountTermsMaintenance100GetResponse withPct(Double pct) {
        this.pct = pct;
        return this;
    }

    /**
     * Month End Discount
     * <p>
     * Lineage reference object : FTVDISC_END_OF_MONTH_IND
     * (Required)
     * 
     */
    @JsonProperty("endOfMonthInd")
    public String getEndOfMonthInd() {
        return endOfMonthInd;
    }

    /**
     * Month End Discount
     * <p>
     * Lineage reference object : FTVDISC_END_OF_MONTH_IND
     * (Required)
     * 
     */
    @JsonProperty("endOfMonthInd")
    public void setEndOfMonthInd(String endOfMonthInd) {
        this.endOfMonthInd = endOfMonthInd;
    }

    public DiscountTermsMaintenance100GetResponse withEndOfMonthInd(String endOfMonthInd) {
        this.endOfMonthInd = endOfMonthInd;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVDISC_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVDISC_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public DiscountTermsMaintenance100GetResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVDISC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVDISC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public DiscountTermsMaintenance100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Discount Code
     * <p>
     * Lineage reference object : FTVDISC_CODE, Lookup lineage reference object : ftvdisc
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Discount Code
     * <p>
     * Lineage reference object : FTVDISC_CODE, Lookup lineage reference object : ftvdisc
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public DiscountTermsMaintenance100GetResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Discount Days
     * <p>
     * Lineage reference object : FTVDISC_DAYS
     * 
     */
    @JsonProperty("days")
    public Double getDays() {
        return days;
    }

    /**
     * Discount Days
     * <p>
     * Lineage reference object : FTVDISC_DAYS
     * 
     */
    @JsonProperty("days")
    public void setDays(Double days) {
        this.days = days;
    }

    public DiscountTermsMaintenance100GetResponse withDays(Double days) {
        this.days = days;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FTVDISC_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    public Date getNchgDate() {
        return nchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * Lineage reference object : FTVDISC_NCHG_DATE
     * 
     */
    @JsonProperty("nchgDate")
    public void setNchgDate(Date nchgDate) {
        this.nchgDate = nchgDate;
    }

    public DiscountTermsMaintenance100GetResponse withNchgDate(Date nchgDate) {
        this.nchgDate = nchgDate;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVDISC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVDISC_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public DiscountTermsMaintenance100GetResponse withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Net Days
     * <p>
     * Lineage reference object : FTVDISC_NET_DAYS
     * 
     */
    @JsonProperty("netDays")
    public Double getNetDays() {
        return netDays;
    }

    /**
     * Net Days
     * <p>
     * Lineage reference object : FTVDISC_NET_DAYS
     * 
     */
    @JsonProperty("netDays")
    public void setNetDays(Double netDays) {
        this.netDays = netDays;
    }

    public DiscountTermsMaintenance100GetResponse withNetDays(Double netDays) {
        this.netDays = netDays;
        return this;
    }

    /**
     * Discount Code Description
     * <p>
     * Lineage reference object : FTVDISC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Discount Code Description
     * <p>
     * Lineage reference object : FTVDISC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DiscountTermsMaintenance100GetResponse withDesc(String desc) {
        this.desc = desc;
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

    public DiscountTermsMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DiscountTermsMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pct");
        sb.append('=');
        sb.append(((this.pct == null)?"<null>":this.pct));
        sb.append(',');
        sb.append("endOfMonthInd");
        sb.append('=');
        sb.append(((this.endOfMonthInd == null)?"<null>":this.endOfMonthInd));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("days");
        sb.append('=');
        sb.append(((this.days == null)?"<null>":this.days));
        sb.append(',');
        sb.append("nchgDate");
        sb.append('=');
        sb.append(((this.nchgDate == null)?"<null>":this.nchgDate));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("netDays");
        sb.append('=');
        sb.append(((this.netDays == null)?"<null>":this.netDays));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.days == null)? 0 :this.days.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nchgDate == null)? 0 :this.nchgDate.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.netDays == null)? 0 :this.netDays.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DiscountTermsMaintenance100GetResponse) == false) {
            return false;
        }
        DiscountTermsMaintenance100GetResponse rhs = ((DiscountTermsMaintenance100GetResponse) other);
        return ((((((((((((this.pct == rhs.pct)||((this.pct!= null)&&this.pct.equals(rhs.pct)))&&((this.endOfMonthInd == rhs.endOfMonthInd)||((this.endOfMonthInd!= null)&&this.endOfMonthInd.equals(rhs.endOfMonthInd))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.days == rhs.days)||((this.days!= null)&&this.days.equals(rhs.days))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nchgDate == rhs.nchgDate)||((this.nchgDate!= null)&&this.nchgDate.equals(rhs.nchgDate))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.netDays == rhs.netDays)||((this.netDays!= null)&&this.netDays.equals(rhs.netDays))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
