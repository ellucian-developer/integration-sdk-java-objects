
package com.ellucian.generated.bpapi.ban.fiscal_year_maintenance.v1_0_0;

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
    "eoqInd",
    "prdEndDate",
    "statusDesc",
    "prdStatusInd",
    "fspdCode",
    "prdStartDate"
})
@Generated("jsonschema2pojo")
public class Ftvfspd__1 {

    /**
     * Lineage reference object : FTVFSPD_EOQ_IND
     * 
     */
    @JsonProperty("eoqInd")
    @JsonPropertyDescription("Lineage reference object : FTVFSPD_EOQ_IND")
    private String eoqInd;
    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSPD_PRD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("prdEndDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSPD_PRD_END_DATE")
    private Date prdEndDate;
    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("statusDesc")
    private String statusDesc;
    /**
     * Lineage reference object : FTVFSPD_PRD_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("prdStatusInd")
    @JsonPropertyDescription("Lineage reference object : FTVFSPD_PRD_STATUS_IND")
    private String prdStatusInd;
    /**
     * Fiscal Period
     * <p>
     * Lineage reference object : FTVFSPD_FSPD_CODE, Lookup lineage reference object : ftvfspd
     * 
     */
    @JsonProperty("fspdCode")
    @JsonPropertyDescription("Lineage reference object : FTVFSPD_FSPD_CODE, Lookup lineage reference object : ftvfspd")
    private String fspdCode;
    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSPD_PRD_START_DATE
     * 
     */
    @JsonProperty("prdStartDate")
    @JsonPropertyDescription("Lineage reference object : FTVFSPD_PRD_START_DATE")
    private Date prdStartDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : FTVFSPD_EOQ_IND
     * 
     */
    @JsonProperty("eoqInd")
    public String getEoqInd() {
        return eoqInd;
    }

    /**
     * Lineage reference object : FTVFSPD_EOQ_IND
     * 
     */
    @JsonProperty("eoqInd")
    public void setEoqInd(String eoqInd) {
        this.eoqInd = eoqInd;
    }

    public Ftvfspd__1 withEoqInd(String eoqInd) {
        this.eoqInd = eoqInd;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSPD_PRD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("prdEndDate")
    public Date getPrdEndDate() {
        return prdEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : FTVFSPD_PRD_END_DATE
     * (Required)
     * 
     */
    @JsonProperty("prdEndDate")
    public void setPrdEndDate(Date prdEndDate) {
        this.prdEndDate = prdEndDate;
    }

    public Ftvfspd__1 withPrdEndDate(Date prdEndDate) {
        this.prdEndDate = prdEndDate;
        return this;
    }

    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("statusDesc")
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("statusDesc")
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public Ftvfspd__1 withStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    /**
     * Lineage reference object : FTVFSPD_PRD_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("prdStatusInd")
    public String getPrdStatusInd() {
        return prdStatusInd;
    }

    /**
     * Lineage reference object : FTVFSPD_PRD_STATUS_IND
     * (Required)
     * 
     */
    @JsonProperty("prdStatusInd")
    public void setPrdStatusInd(String prdStatusInd) {
        this.prdStatusInd = prdStatusInd;
    }

    public Ftvfspd__1 withPrdStatusInd(String prdStatusInd) {
        this.prdStatusInd = prdStatusInd;
        return this;
    }

    /**
     * Fiscal Period
     * <p>
     * Lineage reference object : FTVFSPD_FSPD_CODE, Lookup lineage reference object : ftvfspd
     * 
     */
    @JsonProperty("fspdCode")
    public String getFspdCode() {
        return fspdCode;
    }

    /**
     * Fiscal Period
     * <p>
     * Lineage reference object : FTVFSPD_FSPD_CODE, Lookup lineage reference object : ftvfspd
     * 
     */
    @JsonProperty("fspdCode")
    public void setFspdCode(String fspdCode) {
        this.fspdCode = fspdCode;
    }

    public Ftvfspd__1 withFspdCode(String fspdCode) {
        this.fspdCode = fspdCode;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSPD_PRD_START_DATE
     * 
     */
    @JsonProperty("prdStartDate")
    public Date getPrdStartDate() {
        return prdStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : FTVFSPD_PRD_START_DATE
     * 
     */
    @JsonProperty("prdStartDate")
    public void setPrdStartDate(Date prdStartDate) {
        this.prdStartDate = prdStartDate;
    }

    public Ftvfspd__1 withPrdStartDate(Date prdStartDate) {
        this.prdStartDate = prdStartDate;
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

    public Ftvfspd__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ftvfspd__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("eoqInd");
        sb.append('=');
        sb.append(((this.eoqInd == null)?"<null>":this.eoqInd));
        sb.append(',');
        sb.append("prdEndDate");
        sb.append('=');
        sb.append(((this.prdEndDate == null)?"<null>":this.prdEndDate));
        sb.append(',');
        sb.append("statusDesc");
        sb.append('=');
        sb.append(((this.statusDesc == null)?"<null>":this.statusDesc));
        sb.append(',');
        sb.append("prdStatusInd");
        sb.append('=');
        sb.append(((this.prdStatusInd == null)?"<null>":this.prdStatusInd));
        sb.append(',');
        sb.append("fspdCode");
        sb.append('=');
        sb.append(((this.fspdCode == null)?"<null>":this.fspdCode));
        sb.append(',');
        sb.append("prdStartDate");
        sb.append('=');
        sb.append(((this.prdStartDate == null)?"<null>":this.prdStartDate));
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
        result = ((result* 31)+((this.eoqInd == null)? 0 :this.eoqInd.hashCode()));
        result = ((result* 31)+((this.prdEndDate == null)? 0 :this.prdEndDate.hashCode()));
        result = ((result* 31)+((this.statusDesc == null)? 0 :this.statusDesc.hashCode()));
        result = ((result* 31)+((this.prdStatusInd == null)? 0 :this.prdStatusInd.hashCode()));
        result = ((result* 31)+((this.fspdCode == null)? 0 :this.fspdCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.prdStartDate == null)? 0 :this.prdStartDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ftvfspd__1) == false) {
            return false;
        }
        Ftvfspd__1 rhs = ((Ftvfspd__1) other);
        return ((((((((this.eoqInd == rhs.eoqInd)||((this.eoqInd!= null)&&this.eoqInd.equals(rhs.eoqInd)))&&((this.prdEndDate == rhs.prdEndDate)||((this.prdEndDate!= null)&&this.prdEndDate.equals(rhs.prdEndDate))))&&((this.statusDesc == rhs.statusDesc)||((this.statusDesc!= null)&&this.statusDesc.equals(rhs.statusDesc))))&&((this.prdStatusInd == rhs.prdStatusInd)||((this.prdStatusInd!= null)&&this.prdStatusInd.equals(rhs.prdStatusInd))))&&((this.fspdCode == rhs.fspdCode)||((this.fspdCode!= null)&&this.fspdCode.equals(rhs.fspdCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.prdStartDate == rhs.prdStartDate)||((this.prdStartDate!= null)&&this.prdStartDate.equals(rhs.prdStartDate))));
    }

}
