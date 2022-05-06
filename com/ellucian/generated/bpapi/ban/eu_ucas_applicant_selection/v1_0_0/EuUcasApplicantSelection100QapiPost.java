
package com.ellucian.generated.bpapi.ban.eu_ucas_applicant_selection.v1_0_0;

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
    "skrsainApplicantNo",
    "skrsainPersonalid",
    "skrsainAppSchemeCode",
    "skrsainSource",
    "id",
    "name"
})
@Generated("jsonschema2pojo")
public class EuUcasApplicantSelection100QapiPost {

    /**
     * Skrsain Ucasnum
     * <p>
     * Lineage reference object : SKRSAIN_APPLICANT_NO
     * 
     */
    @JsonProperty("skrsainApplicantNo")
    @JsonPropertyDescription("Lineage reference object : SKRSAIN_APPLICANT_NO")
    private String skrsainApplicantNo;
    /**
     * Personal Id
     * <p>
     * Lineage reference object : SKRSAIN_PERSONALID
     * 
     */
    @JsonProperty("skrsainPersonalid")
    @JsonPropertyDescription("Lineage reference object : SKRSAIN_PERSONALID")
    private String skrsainPersonalid;
    /**
     * Application Scheme Code
     * <p>
     * Lineage reference object : SKRSAIN_APP_SCHEME_CODE
     * 
     */
    @JsonProperty("skrsainAppSchemeCode")
    @JsonPropertyDescription("Lineage reference object : SKRSAIN_APP_SCHEME_CODE")
    private String skrsainAppSchemeCode;
    /**
     * Source
     * <p>
     * Lineage reference object : SKRSAIN_SOURCE
     * 
     */
    @JsonProperty("skrsainSource")
    @JsonPropertyDescription("Lineage reference object : SKRSAIN_SOURCE")
    private String skrsainSource;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Skrsain Ucasnum
     * <p>
     * Lineage reference object : SKRSAIN_APPLICANT_NO
     * 
     */
    @JsonProperty("skrsainApplicantNo")
    public String getSkrsainApplicantNo() {
        return skrsainApplicantNo;
    }

    /**
     * Skrsain Ucasnum
     * <p>
     * Lineage reference object : SKRSAIN_APPLICANT_NO
     * 
     */
    @JsonProperty("skrsainApplicantNo")
    public void setSkrsainApplicantNo(String skrsainApplicantNo) {
        this.skrsainApplicantNo = skrsainApplicantNo;
    }

    public EuUcasApplicantSelection100QapiPost withSkrsainApplicantNo(String skrsainApplicantNo) {
        this.skrsainApplicantNo = skrsainApplicantNo;
        return this;
    }

    /**
     * Personal Id
     * <p>
     * Lineage reference object : SKRSAIN_PERSONALID
     * 
     */
    @JsonProperty("skrsainPersonalid")
    public String getSkrsainPersonalid() {
        return skrsainPersonalid;
    }

    /**
     * Personal Id
     * <p>
     * Lineage reference object : SKRSAIN_PERSONALID
     * 
     */
    @JsonProperty("skrsainPersonalid")
    public void setSkrsainPersonalid(String skrsainPersonalid) {
        this.skrsainPersonalid = skrsainPersonalid;
    }

    public EuUcasApplicantSelection100QapiPost withSkrsainPersonalid(String skrsainPersonalid) {
        this.skrsainPersonalid = skrsainPersonalid;
        return this;
    }

    /**
     * Application Scheme Code
     * <p>
     * Lineage reference object : SKRSAIN_APP_SCHEME_CODE
     * 
     */
    @JsonProperty("skrsainAppSchemeCode")
    public String getSkrsainAppSchemeCode() {
        return skrsainAppSchemeCode;
    }

    /**
     * Application Scheme Code
     * <p>
     * Lineage reference object : SKRSAIN_APP_SCHEME_CODE
     * 
     */
    @JsonProperty("skrsainAppSchemeCode")
    public void setSkrsainAppSchemeCode(String skrsainAppSchemeCode) {
        this.skrsainAppSchemeCode = skrsainAppSchemeCode;
    }

    public EuUcasApplicantSelection100QapiPost withSkrsainAppSchemeCode(String skrsainAppSchemeCode) {
        this.skrsainAppSchemeCode = skrsainAppSchemeCode;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SKRSAIN_SOURCE
     * 
     */
    @JsonProperty("skrsainSource")
    public String getSkrsainSource() {
        return skrsainSource;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SKRSAIN_SOURCE
     * 
     */
    @JsonProperty("skrsainSource")
    public void setSkrsainSource(String skrsainSource) {
        this.skrsainSource = skrsainSource;
    }

    public EuUcasApplicantSelection100QapiPost withSkrsainSource(String skrsainSource) {
        this.skrsainSource = skrsainSource;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EuUcasApplicantSelection100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public EuUcasApplicantSelection100QapiPost withName(String name) {
        this.name = name;
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

    public EuUcasApplicantSelection100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuUcasApplicantSelection100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("skrsainApplicantNo");
        sb.append('=');
        sb.append(((this.skrsainApplicantNo == null)?"<null>":this.skrsainApplicantNo));
        sb.append(',');
        sb.append("skrsainPersonalid");
        sb.append('=');
        sb.append(((this.skrsainPersonalid == null)?"<null>":this.skrsainPersonalid));
        sb.append(',');
        sb.append("skrsainAppSchemeCode");
        sb.append('=');
        sb.append(((this.skrsainAppSchemeCode == null)?"<null>":this.skrsainAppSchemeCode));
        sb.append(',');
        sb.append("skrsainSource");
        sb.append('=');
        sb.append(((this.skrsainSource == null)?"<null>":this.skrsainSource));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.skrsainApplicantNo == null)? 0 :this.skrsainApplicantNo.hashCode()));
        result = ((result* 31)+((this.skrsainSource == null)? 0 :this.skrsainSource.hashCode()));
        result = ((result* 31)+((this.skrsainAppSchemeCode == null)? 0 :this.skrsainAppSchemeCode.hashCode()));
        result = ((result* 31)+((this.skrsainPersonalid == null)? 0 :this.skrsainPersonalid.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuUcasApplicantSelection100QapiPost) == false) {
            return false;
        }
        EuUcasApplicantSelection100QapiPost rhs = ((EuUcasApplicantSelection100QapiPost) other);
        return ((((((((this.skrsainApplicantNo == rhs.skrsainApplicantNo)||((this.skrsainApplicantNo!= null)&&this.skrsainApplicantNo.equals(rhs.skrsainApplicantNo)))&&((this.skrsainSource == rhs.skrsainSource)||((this.skrsainSource!= null)&&this.skrsainSource.equals(rhs.skrsainSource))))&&((this.skrsainAppSchemeCode == rhs.skrsainAppSchemeCode)||((this.skrsainAppSchemeCode!= null)&&this.skrsainAppSchemeCode.equals(rhs.skrsainAppSchemeCode))))&&((this.skrsainPersonalid == rhs.skrsainPersonalid)||((this.skrsainPersonalid!= null)&&this.skrsainPersonalid.equals(rhs.skrsainPersonalid))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
