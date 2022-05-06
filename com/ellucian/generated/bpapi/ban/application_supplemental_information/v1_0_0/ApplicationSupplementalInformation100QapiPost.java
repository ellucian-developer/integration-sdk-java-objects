
package com.ellucian.generated.bpapi.ban.application_supplemental_information.v1_0_0;

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
    "id",
    "keyblockTerm",
    "keyblockApplNo"
})
@Generated("jsonschema2pojo")
public class ApplicationSupplementalInformation100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblockTerm")
    private String keyblockTerm;
    @JsonProperty("keyblockApplNo")
    private String keyblockApplNo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ApplicationSupplementalInformation100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblockTerm")
    public String getKeyblockTerm() {
        return keyblockTerm;
    }

    @JsonProperty("keyblockTerm")
    public void setKeyblockTerm(String keyblockTerm) {
        this.keyblockTerm = keyblockTerm;
    }

    public ApplicationSupplementalInformation100QapiPost withKeyblockTerm(String keyblockTerm) {
        this.keyblockTerm = keyblockTerm;
        return this;
    }

    @JsonProperty("keyblockApplNo")
    public String getKeyblockApplNo() {
        return keyblockApplNo;
    }

    @JsonProperty("keyblockApplNo")
    public void setKeyblockApplNo(String keyblockApplNo) {
        this.keyblockApplNo = keyblockApplNo;
    }

    public ApplicationSupplementalInformation100QapiPost withKeyblockApplNo(String keyblockApplNo) {
        this.keyblockApplNo = keyblockApplNo;
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

    public ApplicationSupplementalInformation100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationSupplementalInformation100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblockTerm");
        sb.append('=');
        sb.append(((this.keyblockTerm == null)?"<null>":this.keyblockTerm));
        sb.append(',');
        sb.append("keyblockApplNo");
        sb.append('=');
        sb.append(((this.keyblockApplNo == null)?"<null>":this.keyblockApplNo));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.keyblockTerm == null)? 0 :this.keyblockTerm.hashCode()));
        result = ((result* 31)+((this.keyblockApplNo == null)? 0 :this.keyblockApplNo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationSupplementalInformation100QapiPost) == false) {
            return false;
        }
        ApplicationSupplementalInformation100QapiPost rhs = ((ApplicationSupplementalInformation100QapiPost) other);
        return (((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.keyblockTerm == rhs.keyblockTerm)||((this.keyblockTerm!= null)&&this.keyblockTerm.equals(rhs.keyblockTerm))))&&((this.keyblockApplNo == rhs.keyblockApplNo)||((this.keyblockApplNo!= null)&&this.keyblockApplNo.equals(rhs.keyblockApplNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
