
package com.ellucian.generated.bpapi.ban.complementary_activities_submission_rules.v1_0_0;

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
    "actcCode",
    "actcDesc",
    "accgCode",
    "minHrs",
    "maxHrs",
    "cadtCode",
    "cadtDesc"
})
@Generated("jsonschema2pojo")
public class ComplementaryActivitiesSubmissionRules100QapiPost {

    @JsonProperty("actcCode")
    private String actcCode;
    @JsonProperty("actcDesc")
    private String actcDesc;
    @JsonProperty("accgCode")
    private String accgCode;
    @JsonProperty("minHrs")
    private String minHrs;
    @JsonProperty("maxHrs")
    private String maxHrs;
    /**
     * Lineage reference object : SORCADA_CADT_CODE
     * 
     */
    @JsonProperty("cadtCode")
    @JsonPropertyDescription("Lineage reference object : SORCADA_CADT_CODE")
    private String cadtCode;
    /**
     * Document Code Description
     * <p>
     * Lineage reference object : SORCADA_CADT_DESC
     * 
     */
    @JsonProperty("cadtDesc")
    @JsonPropertyDescription("Lineage reference object : SORCADA_CADT_DESC")
    private String cadtDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("actcCode")
    public String getActcCode() {
        return actcCode;
    }

    @JsonProperty("actcCode")
    public void setActcCode(String actcCode) {
        this.actcCode = actcCode;
    }

    public ComplementaryActivitiesSubmissionRules100QapiPost withActcCode(String actcCode) {
        this.actcCode = actcCode;
        return this;
    }

    @JsonProperty("actcDesc")
    public String getActcDesc() {
        return actcDesc;
    }

    @JsonProperty("actcDesc")
    public void setActcDesc(String actcDesc) {
        this.actcDesc = actcDesc;
    }

    public ComplementaryActivitiesSubmissionRules100QapiPost withActcDesc(String actcDesc) {
        this.actcDesc = actcDesc;
        return this;
    }

    @JsonProperty("accgCode")
    public String getAccgCode() {
        return accgCode;
    }

    @JsonProperty("accgCode")
    public void setAccgCode(String accgCode) {
        this.accgCode = accgCode;
    }

    public ComplementaryActivitiesSubmissionRules100QapiPost withAccgCode(String accgCode) {
        this.accgCode = accgCode;
        return this;
    }

    @JsonProperty("minHrs")
    public String getMinHrs() {
        return minHrs;
    }

    @JsonProperty("minHrs")
    public void setMinHrs(String minHrs) {
        this.minHrs = minHrs;
    }

    public ComplementaryActivitiesSubmissionRules100QapiPost withMinHrs(String minHrs) {
        this.minHrs = minHrs;
        return this;
    }

    @JsonProperty("maxHrs")
    public String getMaxHrs() {
        return maxHrs;
    }

    @JsonProperty("maxHrs")
    public void setMaxHrs(String maxHrs) {
        this.maxHrs = maxHrs;
    }

    public ComplementaryActivitiesSubmissionRules100QapiPost withMaxHrs(String maxHrs) {
        this.maxHrs = maxHrs;
        return this;
    }

    /**
     * Lineage reference object : SORCADA_CADT_CODE
     * 
     */
    @JsonProperty("cadtCode")
    public String getCadtCode() {
        return cadtCode;
    }

    /**
     * Lineage reference object : SORCADA_CADT_CODE
     * 
     */
    @JsonProperty("cadtCode")
    public void setCadtCode(String cadtCode) {
        this.cadtCode = cadtCode;
    }

    public ComplementaryActivitiesSubmissionRules100QapiPost withCadtCode(String cadtCode) {
        this.cadtCode = cadtCode;
        return this;
    }

    /**
     * Document Code Description
     * <p>
     * Lineage reference object : SORCADA_CADT_DESC
     * 
     */
    @JsonProperty("cadtDesc")
    public String getCadtDesc() {
        return cadtDesc;
    }

    /**
     * Document Code Description
     * <p>
     * Lineage reference object : SORCADA_CADT_DESC
     * 
     */
    @JsonProperty("cadtDesc")
    public void setCadtDesc(String cadtDesc) {
        this.cadtDesc = cadtDesc;
    }

    public ComplementaryActivitiesSubmissionRules100QapiPost withCadtDesc(String cadtDesc) {
        this.cadtDesc = cadtDesc;
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

    public ComplementaryActivitiesSubmissionRules100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplementaryActivitiesSubmissionRules100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("actcCode");
        sb.append('=');
        sb.append(((this.actcCode == null)?"<null>":this.actcCode));
        sb.append(',');
        sb.append("actcDesc");
        sb.append('=');
        sb.append(((this.actcDesc == null)?"<null>":this.actcDesc));
        sb.append(',');
        sb.append("accgCode");
        sb.append('=');
        sb.append(((this.accgCode == null)?"<null>":this.accgCode));
        sb.append(',');
        sb.append("minHrs");
        sb.append('=');
        sb.append(((this.minHrs == null)?"<null>":this.minHrs));
        sb.append(',');
        sb.append("maxHrs");
        sb.append('=');
        sb.append(((this.maxHrs == null)?"<null>":this.maxHrs));
        sb.append(',');
        sb.append("cadtCode");
        sb.append('=');
        sb.append(((this.cadtCode == null)?"<null>":this.cadtCode));
        sb.append(',');
        sb.append("cadtDesc");
        sb.append('=');
        sb.append(((this.cadtDesc == null)?"<null>":this.cadtDesc));
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
        result = ((result* 31)+((this.actcDesc == null)? 0 :this.actcDesc.hashCode()));
        result = ((result* 31)+((this.cadtCode == null)? 0 :this.cadtCode.hashCode()));
        result = ((result* 31)+((this.accgCode == null)? 0 :this.accgCode.hashCode()));
        result = ((result* 31)+((this.cadtDesc == null)? 0 :this.cadtDesc.hashCode()));
        result = ((result* 31)+((this.maxHrs == null)? 0 :this.maxHrs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.minHrs == null)? 0 :this.minHrs.hashCode()));
        result = ((result* 31)+((this.actcCode == null)? 0 :this.actcCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplementaryActivitiesSubmissionRules100QapiPost) == false) {
            return false;
        }
        ComplementaryActivitiesSubmissionRules100QapiPost rhs = ((ComplementaryActivitiesSubmissionRules100QapiPost) other);
        return (((((((((this.actcDesc == rhs.actcDesc)||((this.actcDesc!= null)&&this.actcDesc.equals(rhs.actcDesc)))&&((this.cadtCode == rhs.cadtCode)||((this.cadtCode!= null)&&this.cadtCode.equals(rhs.cadtCode))))&&((this.accgCode == rhs.accgCode)||((this.accgCode!= null)&&this.accgCode.equals(rhs.accgCode))))&&((this.cadtDesc == rhs.cadtDesc)||((this.cadtDesc!= null)&&this.cadtDesc.equals(rhs.cadtDesc))))&&((this.maxHrs == rhs.maxHrs)||((this.maxHrs!= null)&&this.maxHrs.equals(rhs.maxHrs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.minHrs == rhs.minHrs)||((this.minHrs!= null)&&this.minHrs.equals(rhs.minHrs))))&&((this.actcCode == rhs.actcCode)||((this.actcCode!= null)&&this.actcCode.equals(rhs.actcCode))));
    }

}
