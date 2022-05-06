
package com.ellucian.generated.bpapi.ban.interface_rules.v1_0_0;

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
    "activityDate",
    "cmscCode",
    "code",
    "ctypCode",
    "desc",
    "sbgiCode",
    "tsrcCode"
})
@Generated("jsonschema2pojo")
public class InterfaceRules100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVINFC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVINFC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Common Matching Source
     * <p>
     * Lineage reference object : STVINFC_CMSC_CODE, Lookup lineage reference object : gtvcmsc
     * 
     */
    @JsonProperty("cmscCode")
    @JsonPropertyDescription("Lineage reference object : STVINFC_CMSC_CODE, Lookup lineage reference object : gtvcmsc")
    private String cmscCode;
    /**
     * Interface Code
     * <p>
     * Lineage reference object : STVINFC_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVINFC_CODE")
    private String code;
    /**
     * Contact Type
     * <p>
     * Lineage reference object : STVINFC_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    @JsonPropertyDescription("Lineage reference object : STVINFC_CTYP_CODE, Lookup lineage reference object : stvctyp")
    private String ctypCode;
    /**
     * Description
     * <p>
     * Lineage reference object : STVINFC_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVINFC_DESC")
    private String desc;
    /**
     * Source Code
     * <p>
     * Lineage reference object : STVINFC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : STVINFC_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String sbgiCode;
    /**
     * Test Source
     * <p>
     * Lineage reference object : STVINFC_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("tsrcCode")
    @JsonPropertyDescription("Lineage reference object : STVINFC_TSRC_CODE, Lookup lineage reference object : stvtsrc")
    private String tsrcCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVINFC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVINFC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public InterfaceRules100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Common Matching Source
     * <p>
     * Lineage reference object : STVINFC_CMSC_CODE, Lookup lineage reference object : gtvcmsc
     * 
     */
    @JsonProperty("cmscCode")
    public String getCmscCode() {
        return cmscCode;
    }

    /**
     * Common Matching Source
     * <p>
     * Lineage reference object : STVINFC_CMSC_CODE, Lookup lineage reference object : gtvcmsc
     * 
     */
    @JsonProperty("cmscCode")
    public void setCmscCode(String cmscCode) {
        this.cmscCode = cmscCode;
    }

    public InterfaceRules100QapiPost withCmscCode(String cmscCode) {
        this.cmscCode = cmscCode;
        return this;
    }

    /**
     * Interface Code
     * <p>
     * Lineage reference object : STVINFC_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Interface Code
     * <p>
     * Lineage reference object : STVINFC_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public InterfaceRules100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Contact Type
     * <p>
     * Lineage reference object : STVINFC_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    public String getCtypCode() {
        return ctypCode;
    }

    /**
     * Contact Type
     * <p>
     * Lineage reference object : STVINFC_CTYP_CODE, Lookup lineage reference object : stvctyp
     * 
     */
    @JsonProperty("ctypCode")
    public void setCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
    }

    public InterfaceRules100QapiPost withCtypCode(String ctypCode) {
        this.ctypCode = ctypCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVINFC_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVINFC_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public InterfaceRules100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Source Code
     * <p>
     * Lineage reference object : STVINFC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * Source Code
     * <p>
     * Lineage reference object : STVINFC_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public InterfaceRules100QapiPost withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Test Source
     * <p>
     * Lineage reference object : STVINFC_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("tsrcCode")
    public String getTsrcCode() {
        return tsrcCode;
    }

    /**
     * Test Source
     * <p>
     * Lineage reference object : STVINFC_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("tsrcCode")
    public void setTsrcCode(String tsrcCode) {
        this.tsrcCode = tsrcCode;
    }

    public InterfaceRules100QapiPost withTsrcCode(String tsrcCode) {
        this.tsrcCode = tsrcCode;
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

    public InterfaceRules100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InterfaceRules100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("cmscCode");
        sb.append('=');
        sb.append(((this.cmscCode == null)?"<null>":this.cmscCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("ctypCode");
        sb.append('=');
        sb.append(((this.ctypCode == null)?"<null>":this.ctypCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("tsrcCode");
        sb.append('=');
        sb.append(((this.tsrcCode == null)?"<null>":this.tsrcCode));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.ctypCode == null)? 0 :this.ctypCode.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.cmscCode == null)? 0 :this.cmscCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tsrcCode == null)? 0 :this.tsrcCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InterfaceRules100QapiPost) == false) {
            return false;
        }
        InterfaceRules100QapiPost rhs = ((InterfaceRules100QapiPost) other);
        return (((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.ctypCode == rhs.ctypCode)||((this.ctypCode!= null)&&this.ctypCode.equals(rhs.ctypCode))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.cmscCode == rhs.cmscCode)||((this.cmscCode!= null)&&this.cmscCode.equals(rhs.cmscCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tsrcCode == rhs.tsrcCode)||((this.tsrcCode!= null)&&this.tsrcCode.equals(rhs.tsrcCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
