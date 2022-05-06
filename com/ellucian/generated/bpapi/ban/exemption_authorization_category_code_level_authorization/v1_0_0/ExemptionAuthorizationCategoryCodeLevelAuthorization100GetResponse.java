
package com.ellucian.generated.bpapi.ban.exemption_authorization_category_code_level_authorization.v1_0_0;

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
    "tbbexpt",
    "tbrecat"
})
@Generated("jsonschema2pojo")
public class ExemptionAuthorizationCategoryCodeLevelAuthorization100GetResponse {

    @JsonProperty("tbbexpt")
    private List<Tbbexpt> tbbexpt = new ArrayList<Tbbexpt>();
    @JsonProperty("tbrecat")
    private List<Tbrecat> tbrecat = new ArrayList<Tbrecat>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("tbbexpt")
    public List<Tbbexpt> getTbbexpt() {
        return tbbexpt;
    }

    @JsonProperty("tbbexpt")
    public void setTbbexpt(List<Tbbexpt> tbbexpt) {
        this.tbbexpt = tbbexpt;
    }

    public ExemptionAuthorizationCategoryCodeLevelAuthorization100GetResponse withTbbexpt(List<Tbbexpt> tbbexpt) {
        this.tbbexpt = tbbexpt;
        return this;
    }

    @JsonProperty("tbrecat")
    public List<Tbrecat> getTbrecat() {
        return tbrecat;
    }

    @JsonProperty("tbrecat")
    public void setTbrecat(List<Tbrecat> tbrecat) {
        this.tbrecat = tbrecat;
    }

    public ExemptionAuthorizationCategoryCodeLevelAuthorization100GetResponse withTbrecat(List<Tbrecat> tbrecat) {
        this.tbrecat = tbrecat;
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

    public ExemptionAuthorizationCategoryCodeLevelAuthorization100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExemptionAuthorizationCategoryCodeLevelAuthorization100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tbbexpt");
        sb.append('=');
        sb.append(((this.tbbexpt == null)?"<null>":this.tbbexpt));
        sb.append(',');
        sb.append("tbrecat");
        sb.append('=');
        sb.append(((this.tbrecat == null)?"<null>":this.tbrecat));
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
        result = ((result* 31)+((this.tbbexpt == null)? 0 :this.tbbexpt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tbrecat == null)? 0 :this.tbrecat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExemptionAuthorizationCategoryCodeLevelAuthorization100GetResponse) == false) {
            return false;
        }
        ExemptionAuthorizationCategoryCodeLevelAuthorization100GetResponse rhs = ((ExemptionAuthorizationCategoryCodeLevelAuthorization100GetResponse) other);
        return ((((this.tbbexpt == rhs.tbbexpt)||((this.tbbexpt!= null)&&this.tbbexpt.equals(rhs.tbbexpt)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tbrecat == rhs.tbrecat)||((this.tbrecat!= null)&&this.tbrecat.equals(rhs.tbrecat))));
    }

}
