
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
    "skrsainSource",
    "skrsainAppSchemeCode",
    "skrsainPersonalid",
    "rwname",
    "id"
})
@Generated("jsonschema2pojo")
public class EuUcasApplicantSelection100GetResponse {

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
     * Source
     * <p>
     * Lineage reference object : SKRSAIN_SOURCE
     * 
     */
    @JsonProperty("skrsainSource")
    @JsonPropertyDescription("Lineage reference object : SKRSAIN_SOURCE")
    private String skrsainSource;
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
     * Personal Id
     * <p>
     * Lineage reference object : SKRSAIN_PERSONALID
     * 
     */
    @JsonProperty("skrsainPersonalid")
    @JsonPropertyDescription("Lineage reference object : SKRSAIN_PERSONALID")
    private String skrsainPersonalid;
    @JsonProperty("rwname")
    private String rwname;
    /**
     * ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
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

    public EuUcasApplicantSelection100GetResponse withSkrsainApplicantNo(String skrsainApplicantNo) {
        this.skrsainApplicantNo = skrsainApplicantNo;
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

    public EuUcasApplicantSelection100GetResponse withSkrsainSource(String skrsainSource) {
        this.skrsainSource = skrsainSource;
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

    public EuUcasApplicantSelection100GetResponse withSkrsainAppSchemeCode(String skrsainAppSchemeCode) {
        this.skrsainAppSchemeCode = skrsainAppSchemeCode;
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

    public EuUcasApplicantSelection100GetResponse withSkrsainPersonalid(String skrsainPersonalid) {
        this.skrsainPersonalid = skrsainPersonalid;
        return this;
    }

    @JsonProperty("rwname")
    public String getRwname() {
        return rwname;
    }

    @JsonProperty("rwname")
    public void setRwname(String rwname) {
        this.rwname = rwname;
    }

    public EuUcasApplicantSelection100GetResponse withRwname(String rwname) {
        this.rwname = rwname;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EuUcasApplicantSelection100GetResponse withId(String id) {
        this.id = id;
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

    public EuUcasApplicantSelection100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuUcasApplicantSelection100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("skrsainApplicantNo");
        sb.append('=');
        sb.append(((this.skrsainApplicantNo == null)?"<null>":this.skrsainApplicantNo));
        sb.append(',');
        sb.append("skrsainSource");
        sb.append('=');
        sb.append(((this.skrsainSource == null)?"<null>":this.skrsainSource));
        sb.append(',');
        sb.append("skrsainAppSchemeCode");
        sb.append('=');
        sb.append(((this.skrsainAppSchemeCode == null)?"<null>":this.skrsainAppSchemeCode));
        sb.append(',');
        sb.append("skrsainPersonalid");
        sb.append('=');
        sb.append(((this.skrsainPersonalid == null)?"<null>":this.skrsainPersonalid));
        sb.append(',');
        sb.append("rwname");
        sb.append('=');
        sb.append(((this.rwname == null)?"<null>":this.rwname));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.rwname == null)? 0 :this.rwname.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuUcasApplicantSelection100GetResponse) == false) {
            return false;
        }
        EuUcasApplicantSelection100GetResponse rhs = ((EuUcasApplicantSelection100GetResponse) other);
        return ((((((((this.skrsainApplicantNo == rhs.skrsainApplicantNo)||((this.skrsainApplicantNo!= null)&&this.skrsainApplicantNo.equals(rhs.skrsainApplicantNo)))&&((this.skrsainSource == rhs.skrsainSource)||((this.skrsainSource!= null)&&this.skrsainSource.equals(rhs.skrsainSource))))&&((this.skrsainAppSchemeCode == rhs.skrsainAppSchemeCode)||((this.skrsainAppSchemeCode!= null)&&this.skrsainAppSchemeCode.equals(rhs.skrsainAppSchemeCode))))&&((this.skrsainPersonalid == rhs.skrsainPersonalid)||((this.skrsainPersonalid!= null)&&this.skrsainPersonalid.equals(rhs.skrsainPersonalid))))&&((this.rwname == rhs.rwname)||((this.rwname!= null)&&this.rwname.equals(rhs.rwname))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
