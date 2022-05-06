
package com.ellucian.generated.bpapi.ban.electronic_admissions_applicant_rules.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "key_block",
    "sarerul"
})
@Generated("jsonschema2pojo")
public class ElectronicAdmissionsApplicantRules100GetResponse {

    @JsonProperty("key_block")
    private List<KeyBlock> keyBlock = new ArrayList<KeyBlock>();
    @JsonProperty("sarerul")
    private List<Sarerul> sarerul = new ArrayList<Sarerul>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("key_block")
    public List<KeyBlock> getKeyBlock() {
        return keyBlock;
    }

    @JsonProperty("key_block")
    public void setKeyBlock(List<KeyBlock> keyBlock) {
        this.keyBlock = keyBlock;
    }

    public ElectronicAdmissionsApplicantRules100GetResponse withKeyBlock(List<KeyBlock> keyBlock) {
        this.keyBlock = keyBlock;
        return this;
    }

    @JsonProperty("sarerul")
    public List<Sarerul> getSarerul() {
        return sarerul;
    }

    @JsonProperty("sarerul")
    public void setSarerul(List<Sarerul> sarerul) {
        this.sarerul = sarerul;
    }

    public ElectronicAdmissionsApplicantRules100GetResponse withSarerul(List<Sarerul> sarerul) {
        this.sarerul = sarerul;
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

    public ElectronicAdmissionsApplicantRules100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicAdmissionsApplicantRules100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyBlock");
        sb.append('=');
        sb.append(((this.keyBlock == null)?"<null>":this.keyBlock));
        sb.append(',');
        sb.append("sarerul");
        sb.append('=');
        sb.append(((this.sarerul == null)?"<null>":this.sarerul));
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
        result = ((result* 31)+((this.sarerul == null)? 0 :this.sarerul.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyBlock == null)? 0 :this.keyBlock.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicAdmissionsApplicantRules100GetResponse) == false) {
            return false;
        }
        ElectronicAdmissionsApplicantRules100GetResponse rhs = ((ElectronicAdmissionsApplicantRules100GetResponse) other);
        return ((((this.sarerul == rhs.sarerul)||((this.sarerul!= null)&&this.sarerul.equals(rhs.sarerul)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyBlock == rhs.keyBlock)||((this.keyBlock!= null)&&this.keyBlock.equals(rhs.keyBlock))));
    }

}
