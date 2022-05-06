
package com.ellucian.generated.bpapi.ban.class_codes.v1_0_0;

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
    "code",
    "desc",
    "ediEquiv",
    "lmsEquiv",
    "nscClassCde"
})
@Generated("jsonschema2pojo")
public class ClassCodes100QapiPost {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCLAS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVCLAS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Class Code
     * <p>
     * Lineage reference object : STVCLAS_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVCLAS_CODE")
    private String code;
    /**
     * Description
     * <p>
     * Lineage reference object : STVCLAS_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVCLAS_DESC")
    private String desc;
    /**
     * EDI Eqv
     * <p>
     * Lineage reference object : STVCLAS_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    @JsonPropertyDescription("Lineage reference object : STVCLAS_EDI_EQUIV")
    private String ediEquiv;
    /**
     * LMS Eqv
     * <p>
     * Lineage reference object : STVCLAS_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    @JsonPropertyDescription("Lineage reference object : STVCLAS_LMS_EQUIV")
    private String lmsEquiv;
    /**
     * NSC Class Level Translation
     * <p>
     * Lineage reference object : STVCLAS_NSC_CLASS_CDE
     * 
     */
    @JsonProperty("nscClassCde")
    @JsonPropertyDescription("Lineage reference object : STVCLAS_NSC_CLASS_CDE")
    private String nscClassCde;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCLAS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVCLAS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ClassCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Class Code
     * <p>
     * Lineage reference object : STVCLAS_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Class Code
     * <p>
     * Lineage reference object : STVCLAS_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public ClassCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCLAS_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVCLAS_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ClassCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * EDI Eqv
     * <p>
     * Lineage reference object : STVCLAS_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public String getEdiEquiv() {
        return ediEquiv;
    }

    /**
     * EDI Eqv
     * <p>
     * Lineage reference object : STVCLAS_EDI_EQUIV
     * 
     */
    @JsonProperty("ediEquiv")
    public void setEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
    }

    public ClassCodes100QapiPost withEdiEquiv(String ediEquiv) {
        this.ediEquiv = ediEquiv;
        return this;
    }

    /**
     * LMS Eqv
     * <p>
     * Lineage reference object : STVCLAS_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    public String getLmsEquiv() {
        return lmsEquiv;
    }

    /**
     * LMS Eqv
     * <p>
     * Lineage reference object : STVCLAS_LMS_EQUIV
     * 
     */
    @JsonProperty("lmsEquiv")
    public void setLmsEquiv(String lmsEquiv) {
        this.lmsEquiv = lmsEquiv;
    }

    public ClassCodes100QapiPost withLmsEquiv(String lmsEquiv) {
        this.lmsEquiv = lmsEquiv;
        return this;
    }

    /**
     * NSC Class Level Translation
     * <p>
     * Lineage reference object : STVCLAS_NSC_CLASS_CDE
     * 
     */
    @JsonProperty("nscClassCde")
    public String getNscClassCde() {
        return nscClassCde;
    }

    /**
     * NSC Class Level Translation
     * <p>
     * Lineage reference object : STVCLAS_NSC_CLASS_CDE
     * 
     */
    @JsonProperty("nscClassCde")
    public void setNscClassCde(String nscClassCde) {
        this.nscClassCde = nscClassCde;
    }

    public ClassCodes100QapiPost withNscClassCde(String nscClassCde) {
        this.nscClassCde = nscClassCde;
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

    public ClassCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClassCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("ediEquiv");
        sb.append('=');
        sb.append(((this.ediEquiv == null)?"<null>":this.ediEquiv));
        sb.append(',');
        sb.append("lmsEquiv");
        sb.append('=');
        sb.append(((this.lmsEquiv == null)?"<null>":this.lmsEquiv));
        sb.append(',');
        sb.append("nscClassCde");
        sb.append('=');
        sb.append(((this.nscClassCde == null)?"<null>":this.nscClassCde));
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
        result = ((result* 31)+((this.lmsEquiv == null)? 0 :this.lmsEquiv.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.nscClassCde == null)? 0 :this.nscClassCde.hashCode()));
        result = ((result* 31)+((this.ediEquiv == null)? 0 :this.ediEquiv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassCodes100QapiPost) == false) {
            return false;
        }
        ClassCodes100QapiPost rhs = ((ClassCodes100QapiPost) other);
        return ((((((((this.lmsEquiv == rhs.lmsEquiv)||((this.lmsEquiv!= null)&&this.lmsEquiv.equals(rhs.lmsEquiv)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.nscClassCde == rhs.nscClassCde)||((this.nscClassCde!= null)&&this.nscClassCde.equals(rhs.nscClassCde))))&&((this.ediEquiv == rhs.ediEquiv)||((this.ediEquiv!= null)&&this.ediEquiv.equals(rhs.ediEquiv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
