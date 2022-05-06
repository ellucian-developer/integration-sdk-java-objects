
package com.ellucian.generated.bpapi.ban.curricula_summary_institutional_courses.v1_0_0;

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
    "shrtckn",
    "shrattr"
})
@Generated("jsonschema2pojo")
public class CurriculaSummaryInstitutionalCourses100GetResponse {

    @JsonProperty("shrtckn")
    private List<Shrtckn> shrtckn = new ArrayList<Shrtckn>();
    @JsonProperty("shrattr")
    private List<Shrattr> shrattr = new ArrayList<Shrattr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrtckn")
    public List<Shrtckn> getShrtckn() {
        return shrtckn;
    }

    @JsonProperty("shrtckn")
    public void setShrtckn(List<Shrtckn> shrtckn) {
        this.shrtckn = shrtckn;
    }

    public CurriculaSummaryInstitutionalCourses100GetResponse withShrtckn(List<Shrtckn> shrtckn) {
        this.shrtckn = shrtckn;
        return this;
    }

    @JsonProperty("shrattr")
    public List<Shrattr> getShrattr() {
        return shrattr;
    }

    @JsonProperty("shrattr")
    public void setShrattr(List<Shrattr> shrattr) {
        this.shrattr = shrattr;
    }

    public CurriculaSummaryInstitutionalCourses100GetResponse withShrattr(List<Shrattr> shrattr) {
        this.shrattr = shrattr;
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

    public CurriculaSummaryInstitutionalCourses100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculaSummaryInstitutionalCourses100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrtckn");
        sb.append('=');
        sb.append(((this.shrtckn == null)?"<null>":this.shrtckn));
        sb.append(',');
        sb.append("shrattr");
        sb.append('=');
        sb.append(((this.shrattr == null)?"<null>":this.shrattr));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrtckn == null)? 0 :this.shrtckn.hashCode()));
        result = ((result* 31)+((this.shrattr == null)? 0 :this.shrattr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculaSummaryInstitutionalCourses100GetResponse) == false) {
            return false;
        }
        CurriculaSummaryInstitutionalCourses100GetResponse rhs = ((CurriculaSummaryInstitutionalCourses100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.shrtckn == rhs.shrtckn)||((this.shrtckn!= null)&&this.shrtckn.equals(rhs.shrtckn))))&&((this.shrattr == rhs.shrattr)||((this.shrattr!= null)&&this.shrattr.equals(rhs.shrattr))));
    }

}
