
package com.ellucian.generated.bpapi.ban.grant_maintenance_effort_reporting.v1_0_0;

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
    "acctElement",
    "activityDate",
    "acctElementValue",
    "eccgCode",
    "chargeType",
    "coasCode",
    "acctElementValueDes",
    "reportSection"
})
@Generated("jsonschema2pojo")
public class Frrgrec {

    /**
     * Accounting Element Source
     * <p>
     * Lineage reference object : FRRGREC_ACCT_ELEMENT
     * (Required)
     * 
     */
    @JsonProperty("acctElement")
    @JsonPropertyDescription("Lineage reference object : FRRGREC_ACCT_ELEMENT")
    private String acctElement;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : FRRGREC_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FRRGREC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Value
     * <p>
     * Lineage reference object : FRRGREC_ACCT_ELEMENT_VALUE
     * 
     */
    @JsonProperty("acctElementValue")
    @JsonPropertyDescription("Lineage reference object : FRRGREC_ACCT_ELEMENT_VALUE")
    private String acctElementValue;
    /**
     * Effort Category Type
     * <p>
     * Lineage reference object : FRRGREC_ECCG_CODE
     * 
     */
    @JsonProperty("eccgCode")
    @JsonPropertyDescription("Lineage reference object : FRRGREC_ECCG_CODE")
    private String eccgCode;
    /**
     * Charge Type
     * <p>
     * Lineage reference object : FRRGREC_CHARGE_TYPE
     * 
     */
    @JsonProperty("chargeType")
    @JsonPropertyDescription("Lineage reference object : FRRGREC_CHARGE_TYPE")
    private String chargeType;
    /**
     * COA
     * <p>
     * Lineage reference object : FRRGREC_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FRRGREC_COAS_CODE")
    private String coasCode;
    @JsonProperty("acctElementValueDes")
    private String acctElementValueDes;
    /**
     * Report Section
     * <p>
     * Lineage reference object : FRRGREC_REPORT_SECTION
     * 
     */
    @JsonProperty("reportSection")
    @JsonPropertyDescription("Lineage reference object : FRRGREC_REPORT_SECTION")
    private String reportSection;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Accounting Element Source
     * <p>
     * Lineage reference object : FRRGREC_ACCT_ELEMENT
     * (Required)
     * 
     */
    @JsonProperty("acctElement")
    public String getAcctElement() {
        return acctElement;
    }

    /**
     * Accounting Element Source
     * <p>
     * Lineage reference object : FRRGREC_ACCT_ELEMENT
     * (Required)
     * 
     */
    @JsonProperty("acctElement")
    public void setAcctElement(String acctElement) {
        this.acctElement = acctElement;
    }

    public Frrgrec withAcctElement(String acctElement) {
        this.acctElement = acctElement;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : FRRGREC_ACTIVITY_DATE
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
     * Lineage reference object : FRRGREC_ACTIVITY_DATE
     * (Required)
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Frrgrec withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : FRRGREC_ACCT_ELEMENT_VALUE
     * 
     */
    @JsonProperty("acctElementValue")
    public String getAcctElementValue() {
        return acctElementValue;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : FRRGREC_ACCT_ELEMENT_VALUE
     * 
     */
    @JsonProperty("acctElementValue")
    public void setAcctElementValue(String acctElementValue) {
        this.acctElementValue = acctElementValue;
    }

    public Frrgrec withAcctElementValue(String acctElementValue) {
        this.acctElementValue = acctElementValue;
        return this;
    }

    /**
     * Effort Category Type
     * <p>
     * Lineage reference object : FRRGREC_ECCG_CODE
     * 
     */
    @JsonProperty("eccgCode")
    public String getEccgCode() {
        return eccgCode;
    }

    /**
     * Effort Category Type
     * <p>
     * Lineage reference object : FRRGREC_ECCG_CODE
     * 
     */
    @JsonProperty("eccgCode")
    public void setEccgCode(String eccgCode) {
        this.eccgCode = eccgCode;
    }

    public Frrgrec withEccgCode(String eccgCode) {
        this.eccgCode = eccgCode;
        return this;
    }

    /**
     * Charge Type
     * <p>
     * Lineage reference object : FRRGREC_CHARGE_TYPE
     * 
     */
    @JsonProperty("chargeType")
    public String getChargeType() {
        return chargeType;
    }

    /**
     * Charge Type
     * <p>
     * Lineage reference object : FRRGREC_CHARGE_TYPE
     * 
     */
    @JsonProperty("chargeType")
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public Frrgrec withChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FRRGREC_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * COA
     * <p>
     * Lineage reference object : FRRGREC_COAS_CODE
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public Frrgrec withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("acctElementValueDes")
    public String getAcctElementValueDes() {
        return acctElementValueDes;
    }

    @JsonProperty("acctElementValueDes")
    public void setAcctElementValueDes(String acctElementValueDes) {
        this.acctElementValueDes = acctElementValueDes;
    }

    public Frrgrec withAcctElementValueDes(String acctElementValueDes) {
        this.acctElementValueDes = acctElementValueDes;
        return this;
    }

    /**
     * Report Section
     * <p>
     * Lineage reference object : FRRGREC_REPORT_SECTION
     * 
     */
    @JsonProperty("reportSection")
    public String getReportSection() {
        return reportSection;
    }

    /**
     * Report Section
     * <p>
     * Lineage reference object : FRRGREC_REPORT_SECTION
     * 
     */
    @JsonProperty("reportSection")
    public void setReportSection(String reportSection) {
        this.reportSection = reportSection;
    }

    public Frrgrec withReportSection(String reportSection) {
        this.reportSection = reportSection;
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

    public Frrgrec withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Frrgrec.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acctElement");
        sb.append('=');
        sb.append(((this.acctElement == null)?"<null>":this.acctElement));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("acctElementValue");
        sb.append('=');
        sb.append(((this.acctElementValue == null)?"<null>":this.acctElementValue));
        sb.append(',');
        sb.append("eccgCode");
        sb.append('=');
        sb.append(((this.eccgCode == null)?"<null>":this.eccgCode));
        sb.append(',');
        sb.append("chargeType");
        sb.append('=');
        sb.append(((this.chargeType == null)?"<null>":this.chargeType));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("acctElementValueDes");
        sb.append('=');
        sb.append(((this.acctElementValueDes == null)?"<null>":this.acctElementValueDes));
        sb.append(',');
        sb.append("reportSection");
        sb.append('=');
        sb.append(((this.reportSection == null)?"<null>":this.reportSection));
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
        result = ((result* 31)+((this.acctElement == null)? 0 :this.acctElement.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.acctElementValue == null)? 0 :this.acctElementValue.hashCode()));
        result = ((result* 31)+((this.eccgCode == null)? 0 :this.eccgCode.hashCode()));
        result = ((result* 31)+((this.chargeType == null)? 0 :this.chargeType.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.acctElementValueDes == null)? 0 :this.acctElementValueDes.hashCode()));
        result = ((result* 31)+((this.reportSection == null)? 0 :this.reportSection.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Frrgrec) == false) {
            return false;
        }
        Frrgrec rhs = ((Frrgrec) other);
        return ((((((((((this.acctElement == rhs.acctElement)||((this.acctElement!= null)&&this.acctElement.equals(rhs.acctElement)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.acctElementValue == rhs.acctElementValue)||((this.acctElementValue!= null)&&this.acctElementValue.equals(rhs.acctElementValue))))&&((this.eccgCode == rhs.eccgCode)||((this.eccgCode!= null)&&this.eccgCode.equals(rhs.eccgCode))))&&((this.chargeType == rhs.chargeType)||((this.chargeType!= null)&&this.chargeType.equals(rhs.chargeType))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.acctElementValueDes == rhs.acctElementValueDes)||((this.acctElementValueDes!= null)&&this.acctElementValueDes.equals(rhs.acctElementValueDes))))&&((this.reportSection == rhs.reportSection)||((this.reportSection!= null)&&this.reportSection.equals(rhs.reportSection))));
    }

}
