
package com.ellucian.generated.bpapi.ban.data_source_codes.v1_0_0;

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
    "trstCode",
    "activityDate",
    "code",
    "treqCode",
    "ctypCode",
    "sbgiCode",
    "treqCodeSupp",
    "desc"
})
@Generated("jsonschema2pojo")
public class DataSourceCodes100GetRequest {

    /**
     * Status
     * <p>
     * Lineage reference object : RTVINFC_TRST_CODE, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCode")
    @JsonPropertyDescription("Lineage reference object : RTVINFC_TRST_CODE, Lookup lineage reference object : rtvtrst")
    private String trstCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVINFC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVINFC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Source Code
     * <p>
     * Lineage reference object : RTVINFC_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVINFC_CODE")
    private String code;
    /**
     * Requirements Code
     * <p>
     * Lineage reference object : RTVINFC_TREQ_CODE
     * 
     */
    @JsonProperty("treqCode")
    @JsonPropertyDescription("Lineage reference object : RTVINFC_TREQ_CODE")
    private String treqCode;
    /**
     * Contact Type
     * <p>
     * Lineage reference object : RTVINFC_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : RTVINFC_CTYP_CODE, Lookup lineage reference object : stvctyp")
    private String ctypCode;
    /**
     * Recruiting Source
     * <p>
     * Lineage reference object : RTVINFC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : RTVINFC_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String sbgiCode;
    /**
     * Supplemental Requirements
     * <p>
     * Lineage reference object : RTVINFC_TREQ_CODE_SUPP
     * 
     */
    @JsonProperty("treqCodeSupp")
    @JsonPropertyDescription("Lineage reference object : RTVINFC_TREQ_CODE_SUPP")
    private String treqCodeSupp;
    /**
     * Description
     * <p>
     * Lineage reference object : RTVINFC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVINFC_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : RTVINFC_TRST_CODE, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCode")
    public String getTrstCode() {
        return trstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RTVINFC_TRST_CODE, Lookup lineage reference object : rtvtrst
     * 
     */
    @JsonProperty("trstCode")
    public void setTrstCode(String trstCode) {
        this.trstCode = trstCode;
    }

    public DataSourceCodes100GetRequest withTrstCode(String trstCode) {
        this.trstCode = trstCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVINFC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVINFC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public DataSourceCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Source Code
     * <p>
     * Lineage reference object : RTVINFC_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Source Code
     * <p>
     * Lineage reference object : RTVINFC_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public DataSourceCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Requirements Code
     * <p>
     * Lineage reference object : RTVINFC_TREQ_CODE
     * 
     */
    @JsonProperty("treqCode")
    public String getTreqCode() {
        return treqCode;
    }

    /**
     * Requirements Code
     * <p>
     * Lineage reference object : RTVINFC_TREQ_CODE
     * 
     */
    @JsonProperty("treqCode")
    public void setTreqCode(String treqCode) {
        this.treqCode = treqCode;
    }

    public DataSourceCodes100GetRequest withTreqCode(String treqCode) {
        this.treqCode = treqCode;
        return this;
    }

    /**
     * Contact Type
     * <p>
     * Lineage reference object : RTVINFC_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Contact Type
     * <p>
     * Lineage reference object : RTVINFC_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public DataSourceCodes100GetRequest withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * Recruiting Source
     * <p>
     * Lineage reference object : RTVINFC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * Recruiting Source
     * <p>
     * Lineage reference object : RTVINFC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public DataSourceCodes100GetRequest withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Supplemental Requirements
     * <p>
     * Lineage reference object : RTVINFC_TREQ_CODE_SUPP
     * 
     */
    @JsonProperty("treqCodeSupp")
    public String getTreqCodeSupp() {
        return treqCodeSupp;
    }

    /**
     * Supplemental Requirements
     * <p>
     * Lineage reference object : RTVINFC_TREQ_CODE_SUPP
     * 
     */
    @JsonProperty("treqCodeSupp")
    public void setTreqCodeSupp(String treqCodeSupp) {
        this.treqCodeSupp = treqCodeSupp;
    }

    public DataSourceCodes100GetRequest withTreqCodeSupp(String treqCodeSupp) {
        this.treqCodeSupp = treqCodeSupp;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVINFC_DESC
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
     * Lineage reference object : RTVINFC_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DataSourceCodes100GetRequest withDesc(String desc) {
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

    public DataSourceCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataSourceCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("trstCode");
        sb.append('=');
        sb.append(((this.trstCode == null)?"<null>":this.trstCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("treqCode");
        sb.append('=');
        sb.append(((this.treqCode == null)?"<null>":this.treqCode));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("treqCodeSupp");
        sb.append('=');
        sb.append(((this.treqCodeSupp == null)?"<null>":this.treqCodeSupp));
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
        result = ((result* 31)+((this.trstCode == null)? 0 :this.trstCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.treqCode == null)? 0 :this.treqCode.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.treqCodeSupp == null)? 0 :this.treqCodeSupp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataSourceCodes100GetRequest) == false) {
            return false;
        }
        DataSourceCodes100GetRequest rhs = ((DataSourceCodes100GetRequest) other);
        return ((((((((((this.trstCode == rhs.trstCode)||((this.trstCode!= null)&&this.trstCode.equals(rhs.trstCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.treqCode == rhs.treqCode)||((this.treqCode!= null)&&this.treqCode.equals(rhs.treqCode))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.treqCodeSupp == rhs.treqCodeSupp)||((this.treqCodeSupp!= null)&&this.treqCodeSupp.equals(rhs.treqCodeSupp))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
