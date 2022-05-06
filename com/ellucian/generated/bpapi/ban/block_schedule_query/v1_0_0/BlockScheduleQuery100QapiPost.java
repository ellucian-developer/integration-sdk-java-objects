
package com.ellucian.generated.bpapi.ban.block_schedule_query.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ssablkqTermCodeEff",
    "ssablkqKeyCrn",
    "criteria.blckCode",
    "criteria.blckDescription"
})
@Generated("jsonschema2pojo")
public class BlockScheduleQuery100QapiPost {

    @JsonProperty("ssablkqTermCodeEff")
    private String ssablkqTermCodeEff;
    @JsonProperty("ssablkqKeyCrn")
    private String ssablkqKeyCrn;
    @JsonProperty("criteria.blckCode")
    private String criteriaBlckCode;
    @JsonProperty("criteria.blckDescription")
    private String criteriaBlckDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ssablkqTermCodeEff")
    public String getSsablkqTermCodeEff() {
        return ssablkqTermCodeEff;
    }

    @JsonProperty("ssablkqTermCodeEff")
    public void setSsablkqTermCodeEff(String ssablkqTermCodeEff) {
        this.ssablkqTermCodeEff = ssablkqTermCodeEff;
    }

    public BlockScheduleQuery100QapiPost withSsablkqTermCodeEff(String ssablkqTermCodeEff) {
        this.ssablkqTermCodeEff = ssablkqTermCodeEff;
        return this;
    }

    @JsonProperty("ssablkqKeyCrn")
    public String getSsablkqKeyCrn() {
        return ssablkqKeyCrn;
    }

    @JsonProperty("ssablkqKeyCrn")
    public void setSsablkqKeyCrn(String ssablkqKeyCrn) {
        this.ssablkqKeyCrn = ssablkqKeyCrn;
    }

    public BlockScheduleQuery100QapiPost withSsablkqKeyCrn(String ssablkqKeyCrn) {
        this.ssablkqKeyCrn = ssablkqKeyCrn;
        return this;
    }

    @JsonProperty("criteria.blckCode")
    public String getCriteriaBlckCode() {
        return criteriaBlckCode;
    }

    @JsonProperty("criteria.blckCode")
    public void setCriteriaBlckCode(String criteriaBlckCode) {
        this.criteriaBlckCode = criteriaBlckCode;
    }

    public BlockScheduleQuery100QapiPost withCriteriaBlckCode(String criteriaBlckCode) {
        this.criteriaBlckCode = criteriaBlckCode;
        return this;
    }

    @JsonProperty("criteria.blckDescription")
    public String getCriteriaBlckDescription() {
        return criteriaBlckDescription;
    }

    @JsonProperty("criteria.blckDescription")
    public void setCriteriaBlckDescription(String criteriaBlckDescription) {
        this.criteriaBlckDescription = criteriaBlckDescription;
    }

    public BlockScheduleQuery100QapiPost withCriteriaBlckDescription(String criteriaBlckDescription) {
        this.criteriaBlckDescription = criteriaBlckDescription;
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

    public BlockScheduleQuery100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BlockScheduleQuery100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssablkqTermCodeEff");
        sb.append('=');
        sb.append(((this.ssablkqTermCodeEff == null)?"<null>":this.ssablkqTermCodeEff));
        sb.append(',');
        sb.append("ssablkqKeyCrn");
        sb.append('=');
        sb.append(((this.ssablkqKeyCrn == null)?"<null>":this.ssablkqKeyCrn));
        sb.append(',');
        sb.append("criteriaBlckCode");
        sb.append('=');
        sb.append(((this.criteriaBlckCode == null)?"<null>":this.criteriaBlckCode));
        sb.append(',');
        sb.append("criteriaBlckDescription");
        sb.append('=');
        sb.append(((this.criteriaBlckDescription == null)?"<null>":this.criteriaBlckDescription));
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
        result = ((result* 31)+((this.ssablkqTermCodeEff == null)? 0 :this.ssablkqTermCodeEff.hashCode()));
        result = ((result* 31)+((this.criteriaBlckDescription == null)? 0 :this.criteriaBlckDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssablkqKeyCrn == null)? 0 :this.ssablkqKeyCrn.hashCode()));
        result = ((result* 31)+((this.criteriaBlckCode == null)? 0 :this.criteriaBlckCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlockScheduleQuery100QapiPost) == false) {
            return false;
        }
        BlockScheduleQuery100QapiPost rhs = ((BlockScheduleQuery100QapiPost) other);
        return ((((((this.ssablkqTermCodeEff == rhs.ssablkqTermCodeEff)||((this.ssablkqTermCodeEff!= null)&&this.ssablkqTermCodeEff.equals(rhs.ssablkqTermCodeEff)))&&((this.criteriaBlckDescription == rhs.criteriaBlckDescription)||((this.criteriaBlckDescription!= null)&&this.criteriaBlckDescription.equals(rhs.criteriaBlckDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssablkqKeyCrn == rhs.ssablkqKeyCrn)||((this.ssablkqKeyCrn!= null)&&this.ssablkqKeyCrn.equals(rhs.ssablkqKeyCrn))))&&((this.criteriaBlckCode == rhs.criteriaBlckCode)||((this.criteriaBlckCode!= null)&&this.criteriaBlckCode.equals(rhs.criteriaBlckCode))));
    }

}
