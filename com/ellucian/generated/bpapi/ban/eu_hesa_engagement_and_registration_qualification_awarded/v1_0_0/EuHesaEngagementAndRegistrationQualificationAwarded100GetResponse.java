
package com.ellucian.generated.bpapi.ban.eu_hesa_engagement_and_registration_qualification_awarded.v1_0_0;

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
    "sobreqa",
    "sobrqaa"
})
@Generated("jsonschema2pojo")
public class EuHesaEngagementAndRegistrationQualificationAwarded100GetResponse {

    @JsonProperty("sobreqa")
    private List<Sobreqa> sobreqa = new ArrayList<Sobreqa>();
    @JsonProperty("sobrqaa")
    private List<Sobrqaa> sobrqaa = new ArrayList<Sobrqaa>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobreqa")
    public List<Sobreqa> getSobreqa() {
        return sobreqa;
    }

    @JsonProperty("sobreqa")
    public void setSobreqa(List<Sobreqa> sobreqa) {
        this.sobreqa = sobreqa;
    }

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetResponse withSobreqa(List<Sobreqa> sobreqa) {
        this.sobreqa = sobreqa;
        return this;
    }

    @JsonProperty("sobrqaa")
    public List<Sobrqaa> getSobrqaa() {
        return sobrqaa;
    }

    @JsonProperty("sobrqaa")
    public void setSobrqaa(List<Sobrqaa> sobrqaa) {
        this.sobrqaa = sobrqaa;
    }

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetResponse withSobrqaa(List<Sobrqaa> sobrqaa) {
        this.sobrqaa = sobrqaa;
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

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaEngagementAndRegistrationQualificationAwarded100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobreqa");
        sb.append('=');
        sb.append(((this.sobreqa == null)?"<null>":this.sobreqa));
        sb.append(',');
        sb.append("sobrqaa");
        sb.append('=');
        sb.append(((this.sobrqaa == null)?"<null>":this.sobrqaa));
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
        result = ((result* 31)+((this.sobreqa == null)? 0 :this.sobreqa.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sobrqaa == null)? 0 :this.sobrqaa.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaEngagementAndRegistrationQualificationAwarded100GetResponse) == false) {
            return false;
        }
        EuHesaEngagementAndRegistrationQualificationAwarded100GetResponse rhs = ((EuHesaEngagementAndRegistrationQualificationAwarded100GetResponse) other);
        return ((((this.sobreqa == rhs.sobreqa)||((this.sobreqa!= null)&&this.sobreqa.equals(rhs.sobreqa)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sobrqaa == rhs.sobrqaa)||((this.sobrqaa!= null)&&this.sobrqaa.equals(rhs.sobrqaa))));
    }

}
