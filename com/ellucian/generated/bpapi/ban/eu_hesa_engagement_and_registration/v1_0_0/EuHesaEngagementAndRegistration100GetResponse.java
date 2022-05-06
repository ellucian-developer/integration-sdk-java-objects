
package com.ellucian.generated.bpapi.ban.eu_hesa_engagement_and_registration.v1_0_0;

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
    "sobenga",
    "sobencp",
    "sobscaa",
    "sobrelv",
    "sobresi"
})
@Generated("jsonschema2pojo")
public class EuHesaEngagementAndRegistration100GetResponse {

    @JsonProperty("sobenga")
    private List<Sobenga> sobenga = new ArrayList<Sobenga>();
    @JsonProperty("sobencp")
    private List<Sobencp> sobencp = new ArrayList<Sobencp>();
    @JsonProperty("sobscaa")
    private List<Sobscaa> sobscaa = new ArrayList<Sobscaa>();
    @JsonProperty("sobrelv")
    private List<Sobrelv> sobrelv = new ArrayList<Sobrelv>();
    @JsonProperty("sobresi")
    private List<Sobresi> sobresi = new ArrayList<Sobresi>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobenga")
    public List<Sobenga> getSobenga() {
        return sobenga;
    }

    @JsonProperty("sobenga")
    public void setSobenga(List<Sobenga> sobenga) {
        this.sobenga = sobenga;
    }

    public EuHesaEngagementAndRegistration100GetResponse withSobenga(List<Sobenga> sobenga) {
        this.sobenga = sobenga;
        return this;
    }

    @JsonProperty("sobencp")
    public List<Sobencp> getSobencp() {
        return sobencp;
    }

    @JsonProperty("sobencp")
    public void setSobencp(List<Sobencp> sobencp) {
        this.sobencp = sobencp;
    }

    public EuHesaEngagementAndRegistration100GetResponse withSobencp(List<Sobencp> sobencp) {
        this.sobencp = sobencp;
        return this;
    }

    @JsonProperty("sobscaa")
    public List<Sobscaa> getSobscaa() {
        return sobscaa;
    }

    @JsonProperty("sobscaa")
    public void setSobscaa(List<Sobscaa> sobscaa) {
        this.sobscaa = sobscaa;
    }

    public EuHesaEngagementAndRegistration100GetResponse withSobscaa(List<Sobscaa> sobscaa) {
        this.sobscaa = sobscaa;
        return this;
    }

    @JsonProperty("sobrelv")
    public List<Sobrelv> getSobrelv() {
        return sobrelv;
    }

    @JsonProperty("sobrelv")
    public void setSobrelv(List<Sobrelv> sobrelv) {
        this.sobrelv = sobrelv;
    }

    public EuHesaEngagementAndRegistration100GetResponse withSobrelv(List<Sobrelv> sobrelv) {
        this.sobrelv = sobrelv;
        return this;
    }

    @JsonProperty("sobresi")
    public List<Sobresi> getSobresi() {
        return sobresi;
    }

    @JsonProperty("sobresi")
    public void setSobresi(List<Sobresi> sobresi) {
        this.sobresi = sobresi;
    }

    public EuHesaEngagementAndRegistration100GetResponse withSobresi(List<Sobresi> sobresi) {
        this.sobresi = sobresi;
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

    public EuHesaEngagementAndRegistration100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaEngagementAndRegistration100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobenga");
        sb.append('=');
        sb.append(((this.sobenga == null)?"<null>":this.sobenga));
        sb.append(',');
        sb.append("sobencp");
        sb.append('=');
        sb.append(((this.sobencp == null)?"<null>":this.sobencp));
        sb.append(',');
        sb.append("sobscaa");
        sb.append('=');
        sb.append(((this.sobscaa == null)?"<null>":this.sobscaa));
        sb.append(',');
        sb.append("sobrelv");
        sb.append('=');
        sb.append(((this.sobrelv == null)?"<null>":this.sobrelv));
        sb.append(',');
        sb.append("sobresi");
        sb.append('=');
        sb.append(((this.sobresi == null)?"<null>":this.sobresi));
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
        result = ((result* 31)+((this.sobenga == null)? 0 :this.sobenga.hashCode()));
        result = ((result* 31)+((this.sobrelv == null)? 0 :this.sobrelv.hashCode()));
        result = ((result* 31)+((this.sobencp == null)? 0 :this.sobencp.hashCode()));
        result = ((result* 31)+((this.sobscaa == null)? 0 :this.sobscaa.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sobresi == null)? 0 :this.sobresi.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaEngagementAndRegistration100GetResponse) == false) {
            return false;
        }
        EuHesaEngagementAndRegistration100GetResponse rhs = ((EuHesaEngagementAndRegistration100GetResponse) other);
        return (((((((this.sobenga == rhs.sobenga)||((this.sobenga!= null)&&this.sobenga.equals(rhs.sobenga)))&&((this.sobrelv == rhs.sobrelv)||((this.sobrelv!= null)&&this.sobrelv.equals(rhs.sobrelv))))&&((this.sobencp == rhs.sobencp)||((this.sobencp!= null)&&this.sobencp.equals(rhs.sobencp))))&&((this.sobscaa == rhs.sobscaa)||((this.sobscaa!= null)&&this.sobscaa.equals(rhs.sobscaa))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sobresi == rhs.sobresi)||((this.sobresi!= null)&&this.sobresi.equals(rhs.sobresi))));
    }

}
