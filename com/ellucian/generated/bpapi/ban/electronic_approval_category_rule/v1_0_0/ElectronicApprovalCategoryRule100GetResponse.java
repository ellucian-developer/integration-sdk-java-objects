
package com.ellucian.generated.bpapi.ban.electronic_approval_category_rule.v1_0_0;

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
    "ntracat",
    "ntraclv"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalCategoryRule100GetResponse {

    @JsonProperty("ntracat")
    private List<Ntracat> ntracat = new ArrayList<Ntracat>();
    @JsonProperty("ntraclv")
    private List<Ntraclv> ntraclv = new ArrayList<Ntraclv>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ntracat")
    public List<Ntracat> getNtracat() {
        return ntracat;
    }

    @JsonProperty("ntracat")
    public void setNtracat(List<Ntracat> ntracat) {
        this.ntracat = ntracat;
    }

    public ElectronicApprovalCategoryRule100GetResponse withNtracat(List<Ntracat> ntracat) {
        this.ntracat = ntracat;
        return this;
    }

    @JsonProperty("ntraclv")
    public List<Ntraclv> getNtraclv() {
        return ntraclv;
    }

    @JsonProperty("ntraclv")
    public void setNtraclv(List<Ntraclv> ntraclv) {
        this.ntraclv = ntraclv;
    }

    public ElectronicApprovalCategoryRule100GetResponse withNtraclv(List<Ntraclv> ntraclv) {
        this.ntraclv = ntraclv;
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

    public ElectronicApprovalCategoryRule100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalCategoryRule100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ntracat");
        sb.append('=');
        sb.append(((this.ntracat == null)?"<null>":this.ntracat));
        sb.append(',');
        sb.append("ntraclv");
        sb.append('=');
        sb.append(((this.ntraclv == null)?"<null>":this.ntraclv));
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
        result = ((result* 31)+((this.ntracat == null)? 0 :this.ntracat.hashCode()));
        result = ((result* 31)+((this.ntraclv == null)? 0 :this.ntraclv.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalCategoryRule100GetResponse) == false) {
            return false;
        }
        ElectronicApprovalCategoryRule100GetResponse rhs = ((ElectronicApprovalCategoryRule100GetResponse) other);
        return ((((this.ntracat == rhs.ntracat)||((this.ntracat!= null)&&this.ntracat.equals(rhs.ntracat)))&&((this.ntraclv == rhs.ntraclv)||((this.ntraclv!= null)&&this.ntraclv.equals(rhs.ntraclv))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
