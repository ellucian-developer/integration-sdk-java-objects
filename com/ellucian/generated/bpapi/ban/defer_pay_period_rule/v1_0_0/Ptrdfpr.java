
package com.ellucian.generated.bpapi.ban.defer_pay_period_rule.v1_0_0;

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
    "endPayno",
    "activityDate",
    "pictCode",
    "factor",
    "beginPayno",
    "pictDesc",
    "desc",
    "pays"
})
@Generated("jsonschema2pojo")
public class Ptrdfpr {

    /**
     * End Payroll Number
     * <p>
     * Lineage reference object : PTRDFPR_END_PAYNO
     * (Required)
     * 
     */
    @JsonProperty("endPayno")
    @JsonPropertyDescription("Lineage reference object : PTRDFPR_END_PAYNO")
    private Double endPayno;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRDFPR_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : PTRDFPR_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRDFPR_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    @JsonPropertyDescription("Lineage reference object : PTRDFPR_PICT_CODE")
    private String pictCode;
    /**
     * Factor
     * <p>
     * Lineage reference object : PTRDFPR_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("factor")
    @JsonPropertyDescription("Lineage reference object : PTRDFPR_FACTOR")
    private Double factor;
    /**
     * Begin Payroll Number
     * <p>
     * Lineage reference object : PTRDFPR_BEGIN_PAYNO
     * (Required)
     * 
     */
    @JsonProperty("beginPayno")
    @JsonPropertyDescription("Lineage reference object : PTRDFPR_BEGIN_PAYNO")
    private Double beginPayno;
    @JsonProperty("pictDesc")
    private String pictDesc;
    /**
     * Description
     * <p>
     * Lineage reference object : PTRDFPR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : PTRDFPR_DESC")
    private String desc;
    /**
     * Pays
     * <p>
     * Lineage reference object : PTRDFPR_PAYS
     * 
     */
    @JsonProperty("pays")
    @JsonPropertyDescription("Lineage reference object : PTRDFPR_PAYS")
    private Double pays;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * End Payroll Number
     * <p>
     * Lineage reference object : PTRDFPR_END_PAYNO
     * (Required)
     * 
     */
    @JsonProperty("endPayno")
    public Double getEndPayno() {
        return endPayno;
    }

    /**
     * End Payroll Number
     * <p>
     * Lineage reference object : PTRDFPR_END_PAYNO
     * (Required)
     * 
     */
    @JsonProperty("endPayno")
    public void setEndPayno(Double endPayno) {
        this.endPayno = endPayno;
    }

    public Ptrdfpr withEndPayno(Double endPayno) {
        this.endPayno = endPayno;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : PTRDFPR_ACTIVITY_DATE
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
     * Lineage reference object : PTRDFPR_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Ptrdfpr withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRDFPR_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public String getPictCode() {
        return pictCode;
    }

    /**
     * Payroll ID
     * <p>
     * Lineage reference object : PTRDFPR_PICT_CODE
     * (Required)
     * 
     */
    @JsonProperty("pictCode")
    public void setPictCode(String pictCode) {
        this.pictCode = pictCode;
    }

    public Ptrdfpr withPictCode(String pictCode) {
        this.pictCode = pictCode;
        return this;
    }

    /**
     * Factor
     * <p>
     * Lineage reference object : PTRDFPR_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("factor")
    public Double getFactor() {
        return factor;
    }

    /**
     * Factor
     * <p>
     * Lineage reference object : PTRDFPR_FACTOR
     * (Required)
     * 
     */
    @JsonProperty("factor")
    public void setFactor(Double factor) {
        this.factor = factor;
    }

    public Ptrdfpr withFactor(Double factor) {
        this.factor = factor;
        return this;
    }

    /**
     * Begin Payroll Number
     * <p>
     * Lineage reference object : PTRDFPR_BEGIN_PAYNO
     * (Required)
     * 
     */
    @JsonProperty("beginPayno")
    public Double getBeginPayno() {
        return beginPayno;
    }

    /**
     * Begin Payroll Number
     * <p>
     * Lineage reference object : PTRDFPR_BEGIN_PAYNO
     * (Required)
     * 
     */
    @JsonProperty("beginPayno")
    public void setBeginPayno(Double beginPayno) {
        this.beginPayno = beginPayno;
    }

    public Ptrdfpr withBeginPayno(Double beginPayno) {
        this.beginPayno = beginPayno;
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

    public Ptrdfpr withPictDesc(String pictDesc) {
        this.pictDesc = pictDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : PTRDFPR_DESC
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
     * Lineage reference object : PTRDFPR_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Ptrdfpr withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Pays
     * <p>
     * Lineage reference object : PTRDFPR_PAYS
     * 
     */
    @JsonProperty("pays")
    public Double getPays() {
        return pays;
    }

    /**
     * Pays
     * <p>
     * Lineage reference object : PTRDFPR_PAYS
     * 
     */
    @JsonProperty("pays")
    public void setPays(Double pays) {
        this.pays = pays;
    }

    public Ptrdfpr withPays(Double pays) {
        this.pays = pays;
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

    public Ptrdfpr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ptrdfpr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endPayno");
        sb.append('=');
        sb.append(((this.endPayno == null)?"<null>":this.endPayno));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("pictCode");
        sb.append('=');
        sb.append(((this.pictCode == null)?"<null>":this.pictCode));
        sb.append(',');
        sb.append("factor");
        sb.append('=');
        sb.append(((this.factor == null)?"<null>":this.factor));
        sb.append(',');
        sb.append("beginPayno");
        sb.append('=');
        sb.append(((this.beginPayno == null)?"<null>":this.beginPayno));
        sb.append(',');
        sb.append("pictDesc");
        sb.append('=');
        sb.append(((this.pictDesc == null)?"<null>":this.pictDesc));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("pays");
        sb.append('=');
        sb.append(((this.pays == null)?"<null>":this.pays));
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
        result = ((result* 31)+((this.endPayno == null)? 0 :this.endPayno.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.pictCode == null)? 0 :this.pictCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.factor == null)? 0 :this.factor.hashCode()));
        result = ((result* 31)+((this.beginPayno == null)? 0 :this.beginPayno.hashCode()));
        result = ((result* 31)+((this.pictDesc == null)? 0 :this.pictDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.pays == null)? 0 :this.pays.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ptrdfpr) == false) {
            return false;
        }
        Ptrdfpr rhs = ((Ptrdfpr) other);
        return ((((((((((this.endPayno == rhs.endPayno)||((this.endPayno!= null)&&this.endPayno.equals(rhs.endPayno)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.pictCode == rhs.pictCode)||((this.pictCode!= null)&&this.pictCode.equals(rhs.pictCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.factor == rhs.factor)||((this.factor!= null)&&this.factor.equals(rhs.factor))))&&((this.beginPayno == rhs.beginPayno)||((this.beginPayno!= null)&&this.beginPayno.equals(rhs.beginPayno))))&&((this.pictDesc == rhs.pictDesc)||((this.pictDesc!= null)&&this.pictDesc.equals(rhs.pictDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.pays == rhs.pays)||((this.pays!= null)&&this.pays.equals(rhs.pays))));
    }

}
