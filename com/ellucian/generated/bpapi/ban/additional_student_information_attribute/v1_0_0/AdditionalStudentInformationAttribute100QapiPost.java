
package com.ellucian.generated.bpapi.ban.additional_student_information_attribute.v1_0_0;

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
    "sgastdnId",
    "sgastdnTermCodeEff"
})
@Generated("jsonschema2pojo")
public class AdditionalStudentInformationAttribute100QapiPost {

    @JsonProperty("sgastdnId")
    private String sgastdnId;
    @JsonProperty("sgastdnTermCodeEff")
    private String sgastdnTermCodeEff;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgastdnId")
    public String getSgastdnId() {
        return sgastdnId;
    }

    @JsonProperty("sgastdnId")
    public void setSgastdnId(String sgastdnId) {
        this.sgastdnId = sgastdnId;
    }

    public AdditionalStudentInformationAttribute100QapiPost withSgastdnId(String sgastdnId) {
        this.sgastdnId = sgastdnId;
        return this;
    }

    @JsonProperty("sgastdnTermCodeEff")
    public String getSgastdnTermCodeEff() {
        return sgastdnTermCodeEff;
    }

    @JsonProperty("sgastdnTermCodeEff")
    public void setSgastdnTermCodeEff(String sgastdnTermCodeEff) {
        this.sgastdnTermCodeEff = sgastdnTermCodeEff;
    }

    public AdditionalStudentInformationAttribute100QapiPost withSgastdnTermCodeEff(String sgastdnTermCodeEff) {
        this.sgastdnTermCodeEff = sgastdnTermCodeEff;
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

    public AdditionalStudentInformationAttribute100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalStudentInformationAttribute100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgastdnId");
        sb.append('=');
        sb.append(((this.sgastdnId == null)?"<null>":this.sgastdnId));
        sb.append(',');
        sb.append("sgastdnTermCodeEff");
        sb.append('=');
        sb.append(((this.sgastdnTermCodeEff == null)?"<null>":this.sgastdnTermCodeEff));
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
        result = ((result* 31)+((this.sgastdnId == null)? 0 :this.sgastdnId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sgastdnTermCodeEff == null)? 0 :this.sgastdnTermCodeEff.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalStudentInformationAttribute100QapiPost) == false) {
            return false;
        }
        AdditionalStudentInformationAttribute100QapiPost rhs = ((AdditionalStudentInformationAttribute100QapiPost) other);
        return ((((this.sgastdnId == rhs.sgastdnId)||((this.sgastdnId!= null)&&this.sgastdnId.equals(rhs.sgastdnId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sgastdnTermCodeEff == rhs.sgastdnTermCodeEff)||((this.sgastdnTermCodeEff!= null)&&this.sgastdnTermCodeEff.equals(rhs.sgastdnTermCodeEff))));
    }

}
