
package com.ellucian.generated.bpapi.ban.athletic_compliance_inquiry.v1_0_0;

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
    "view",
    "sgvispt"
})
@Generated("jsonschema2pojo")
public class AthleticComplianceInquiry100GetResponse {

    @JsonProperty("view")
    private List<View> view = new ArrayList<View>();
    @JsonProperty("sgvispt")
    private List<Sgvispt> sgvispt = new ArrayList<Sgvispt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("view")
    public List<View> getView() {
        return view;
    }

    @JsonProperty("view")
    public void setView(List<View> view) {
        this.view = view;
    }

    public AthleticComplianceInquiry100GetResponse withView(List<View> view) {
        this.view = view;
        return this;
    }

    @JsonProperty("sgvispt")
    public List<Sgvispt> getSgvispt() {
        return sgvispt;
    }

    @JsonProperty("sgvispt")
    public void setSgvispt(List<Sgvispt> sgvispt) {
        this.sgvispt = sgvispt;
    }

    public AthleticComplianceInquiry100GetResponse withSgvispt(List<Sgvispt> sgvispt) {
        this.sgvispt = sgvispt;
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

    public AthleticComplianceInquiry100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AthleticComplianceInquiry100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("view");
        sb.append('=');
        sb.append(((this.view == null)?"<null>":this.view));
        sb.append(',');
        sb.append("sgvispt");
        sb.append('=');
        sb.append(((this.sgvispt == null)?"<null>":this.sgvispt));
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
        result = ((result* 31)+((this.sgvispt == null)? 0 :this.sgvispt.hashCode()));
        result = ((result* 31)+((this.view == null)? 0 :this.view.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AthleticComplianceInquiry100GetResponse) == false) {
            return false;
        }
        AthleticComplianceInquiry100GetResponse rhs = ((AthleticComplianceInquiry100GetResponse) other);
        return ((((this.sgvispt == rhs.sgvispt)||((this.sgvispt!= null)&&this.sgvispt.equals(rhs.sgvispt)))&&((this.view == rhs.view)||((this.view!= null)&&this.view.equals(rhs.view))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
