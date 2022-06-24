
package com.ellucian.generated.bpapi.ban.employee_new_hire.v1_0_0;

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
    "jcreCode",
    "contractType",
    "nbrbjobActivityDate",
    "deferPay",
    "title",
    "salary",
    "posn",
    "beginDate",
    "nbrbjobUserId",
    "suff",
    "rate",
    "step"
})
@Generated("jsonschema2pojo")
public class Job {

    /**
     * Lineage reference object : jcreDesc
     * 
     */
    @JsonProperty("jcreDesc")
    @JsonPropertyDescription("Lineage reference object : jcreDesc")
    private String jcreDesc;
    /**
     * Change Reason
     * <p>
     * Lineage reference object : jcreCode
     * 
     */
    @JsonProperty("jcreCode")
    @JsonPropertyDescription("Lineage reference object : jcreCode")
    private String jcreCode;
    /**
     * Job Type
     * <p>
     * Lineage reference object : contractType
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    @JsonPropertyDescription("Lineage reference object : contractType")
    private String contractType;
    /**
     * Lineage reference object : nbrbjobActivityDate
     * 
     */
    @JsonProperty("nbrbjobActivityDate")
    @JsonPropertyDescription("Lineage reference object : nbrbjobActivityDate")
    private Date nbrbjobActivityDate;
    /**
     * Deferred Pay
     * <p>
     * Lineage reference object : deferPay
     * 
     */
    @JsonProperty("deferPay")
    @JsonPropertyDescription("Lineage reference object : deferPay")
    private String deferPay;
    /**
     * Title
     * <p>
     * Lineage reference object : jobsTitle
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : jobsTitle")
    private String title;
    /**
     * Annual Salary
     * <p>
     * Lineage reference object : salary
     * 
     */
    @JsonProperty("salary")
    @JsonPropertyDescription("Lineage reference object : salary")
    private Double salary;
    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private String posn;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : beginDate
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : beginDate")
    private Date beginDate;
    /**
     * Lineage reference object : nbrbjobUserId
     * 
     */
    @JsonProperty("nbrbjobUserId")
    @JsonPropertyDescription("Lineage reference object : nbrbjobUserId")
    private String nbrbjobUserId;
    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * (Required)
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : suff")
    private String suff;
    /**
     * Rate
     * <p>
     * Lineage reference object : rate
     * 
     */
    @JsonProperty("rate")
    @JsonPropertyDescription("Lineage reference object : rate")
    private Double rate;
    /**
     * Step
     * <p>
     * Lineage reference object : step
     * (Required)
     * 
     */
    @JsonProperty("step")
    @JsonPropertyDescription("Lineage reference object : step")
    private Double step;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : jcreDesc
     * 
     */
    @JsonProperty("jcreDesc")
    public String getJcreDesc() {
        return jcreDesc;
    }

    /**
     * Lineage reference object : jcreDesc
     * 
     */
    @JsonProperty("jcreDesc")
    public void setJcreDesc(String jcreDesc) {
        this.jcreDesc = jcreDesc;
    }

    public Job withJcreDesc(String jcreDesc) {
        this.jcreDesc = jcreDesc;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : jcreCode
     * 
     */
    @JsonProperty("jcreCode")
    public String getJcreCode() {
        return jcreCode;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : jcreCode
     * 
     */
    @JsonProperty("jcreCode")
    public void setJcreCode(String jcreCode) {
        this.jcreCode = jcreCode;
    }

    public Job withJcreCode(String jcreCode) {
        this.jcreCode = jcreCode;
        return this;
    }

    /**
     * Job Type
     * <p>
     * Lineage reference object : contractType
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    public String getContractType() {
        return contractType;
    }

    /**
     * Job Type
     * <p>
     * Lineage reference object : contractType
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public Job withContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * Lineage reference object : nbrbjobActivityDate
     * 
     */
    @JsonProperty("nbrbjobActivityDate")
    public Date getNbrbjobActivityDate() {
        return nbrbjobActivityDate;
    }

    /**
     * Lineage reference object : nbrbjobActivityDate
     * 
     */
    @JsonProperty("nbrbjobActivityDate")
    public void setNbrbjobActivityDate(Date nbrbjobActivityDate) {
        this.nbrbjobActivityDate = nbrbjobActivityDate;
    }

    public Job withNbrbjobActivityDate(Date nbrbjobActivityDate) {
        this.nbrbjobActivityDate = nbrbjobActivityDate;
        return this;
    }

    /**
     * Deferred Pay
     * <p>
     * Lineage reference object : deferPay
     * 
     */
    @JsonProperty("deferPay")
    public String getDeferPay() {
        return deferPay;
    }

    /**
     * Deferred Pay
     * <p>
     * Lineage reference object : deferPay
     * 
     */
    @JsonProperty("deferPay")
    public void setDeferPay(String deferPay) {
        this.deferPay = deferPay;
    }

    public Job withDeferPay(String deferPay) {
        this.deferPay = deferPay;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : jobsTitle
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : jobsTitle
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Job withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Annual Salary
     * <p>
     * Lineage reference object : salary
     * 
     */
    @JsonProperty("salary")
    public Double getSalary() {
        return salary;
    }

    /**
     * Annual Salary
     * <p>
     * Lineage reference object : salary
     * 
     */
    @JsonProperty("salary")
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Job withSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public Job withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : beginDate
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : beginDate
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Job withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Lineage reference object : nbrbjobUserId
     * 
     */
    @JsonProperty("nbrbjobUserId")
    public String getNbrbjobUserId() {
        return nbrbjobUserId;
    }

    /**
     * Lineage reference object : nbrbjobUserId
     * 
     */
    @JsonProperty("nbrbjobUserId")
    public void setNbrbjobUserId(String nbrbjobUserId) {
        this.nbrbjobUserId = nbrbjobUserId;
    }

    public Job withNbrbjobUserId(String nbrbjobUserId) {
        this.nbrbjobUserId = nbrbjobUserId;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * (Required)
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * (Required)
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public Job withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : rate
     * 
     */
    @JsonProperty("rate")
    public Double getRate() {
        return rate;
    }

    /**
     * Rate
     * <p>
     * Lineage reference object : rate
     * 
     */
    @JsonProperty("rate")
    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Job withRate(Double rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Step
     * <p>
     * Lineage reference object : step
     * (Required)
     * 
     */
    @JsonProperty("step")
    public Double getStep() {
        return step;
    }

    /**
     * Step
     * <p>
     * Lineage reference object : step
     * (Required)
     * 
     */
    @JsonProperty("step")
    public void setStep(Double step) {
        this.step = step;
    }

    public Job withStep(Double step) {
        this.step = step;
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

    public Job withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Job.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jcreDesc");
        sb.append('=');
        sb.append(((this.jcreDesc == null)?"<null>":this.jcreDesc));
        sb.append(',');
        sb.append("jcreCode");
        sb.append('=');
        sb.append(((this.jcreCode == null)?"<null>":this.jcreCode));
        sb.append(',');
        sb.append("contractType");
        sb.append('=');
        sb.append(((this.contractType == null)?"<null>":this.contractType));
        sb.append(',');
        sb.append("nbrbjobActivityDate");
        sb.append('=');
        sb.append(((this.nbrbjobActivityDate == null)?"<null>":this.nbrbjobActivityDate));
        sb.append(',');
        sb.append("deferPay");
        sb.append('=');
        sb.append(((this.deferPay == null)?"<null>":this.deferPay));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("salary");
        sb.append('=');
        sb.append(((this.salary == null)?"<null>":this.salary));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("nbrbjobUserId");
        sb.append('=');
        sb.append(((this.nbrbjobUserId == null)?"<null>":this.nbrbjobUserId));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("rate");
        sb.append('=');
        sb.append(((this.rate == null)?"<null>":this.rate));
        sb.append(',');
        sb.append("step");
        sb.append('=');
        sb.append(((this.step == null)?"<null>":this.step));
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
        result = ((result* 31)+((this.jcreCode == null)? 0 :this.jcreCode.hashCode()));
        result = ((result* 31)+((this.contractType == null)? 0 :this.contractType.hashCode()));
        result = ((result* 31)+((this.nbrbjobActivityDate == null)? 0 :this.nbrbjobActivityDate.hashCode()));
        result = ((result* 31)+((this.deferPay == null)? 0 :this.deferPay.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.salary == null)? 0 :this.salary.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.nbrbjobUserId == null)? 0 :this.nbrbjobUserId.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.rate == null)? 0 :this.rate.hashCode()));
        result = ((result* 31)+((this.step == null)? 0 :this.step.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Job) == false) {
            return false;
        }
        Job rhs = ((Job) other);
        return (((((((((((((((this.jcreDesc == rhs.jcreDesc)||((this.jcreDesc!= null)&&this.jcreDesc.equals(rhs.jcreDesc)))&&((this.jcreCode == rhs.jcreCode)||((this.jcreCode!= null)&&this.jcreCode.equals(rhs.jcreCode))))&&((this.contractType == rhs.contractType)||((this.contractType!= null)&&this.contractType.equals(rhs.contractType))))&&((this.nbrbjobActivityDate == rhs.nbrbjobActivityDate)||((this.nbrbjobActivityDate!= null)&&this.nbrbjobActivityDate.equals(rhs.nbrbjobActivityDate))))&&((this.deferPay == rhs.deferPay)||((this.deferPay!= null)&&this.deferPay.equals(rhs.deferPay))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.salary == rhs.salary)||((this.salary!= null)&&this.salary.equals(rhs.salary))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.nbrbjobUserId == rhs.nbrbjobUserId)||((this.nbrbjobUserId!= null)&&this.nbrbjobUserId.equals(rhs.nbrbjobUserId))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.rate == rhs.rate)||((this.rate!= null)&&this.rate.equals(rhs.rate))))&&((this.step == rhs.step)||((this.step!= null)&&this.step.equals(rhs.step))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
