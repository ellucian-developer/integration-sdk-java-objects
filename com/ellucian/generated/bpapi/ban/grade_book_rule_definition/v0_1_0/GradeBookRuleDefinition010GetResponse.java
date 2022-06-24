
package com.ellucian.generated.bpapi.ban.grade_book_rule_definition.v0_1_0;

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
    "shrgrul",
    "shbgrul"
})
@Generated("jsonschema2pojo")
public class GradeBookRuleDefinition010GetResponse {

    @JsonProperty("shrgrul")
    private List<Shrgrul> shrgrul = new ArrayList<Shrgrul>();
    @JsonProperty("shbgrul")
    private List<Shbgrul> shbgrul = new ArrayList<Shbgrul>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrgrul")
    public List<Shrgrul> getShrgrul() {
        return shrgrul;
    }

    @JsonProperty("shrgrul")
    public void setShrgrul(List<Shrgrul> shrgrul) {
        this.shrgrul = shrgrul;
    }

    public GradeBookRuleDefinition010GetResponse withShrgrul(List<Shrgrul> shrgrul) {
        this.shrgrul = shrgrul;
        return this;
    }

    @JsonProperty("shbgrul")
    public List<Shbgrul> getShbgrul() {
        return shbgrul;
    }

    @JsonProperty("shbgrul")
    public void setShbgrul(List<Shbgrul> shbgrul) {
        this.shbgrul = shbgrul;
    }

    public GradeBookRuleDefinition010GetResponse withShbgrul(List<Shbgrul> shbgrul) {
        this.shbgrul = shbgrul;
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

    public GradeBookRuleDefinition010GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeBookRuleDefinition010GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrgrul");
        sb.append('=');
        sb.append(((this.shrgrul == null)?"<null>":this.shrgrul));
        sb.append(',');
        sb.append("shbgrul");
        sb.append('=');
        sb.append(((this.shbgrul == null)?"<null>":this.shbgrul));
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
        result = ((result* 31)+((this.shrgrul == null)? 0 :this.shrgrul.hashCode()));
        result = ((result* 31)+((this.shbgrul == null)? 0 :this.shbgrul.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeBookRuleDefinition010GetResponse) == false) {
            return false;
        }
        GradeBookRuleDefinition010GetResponse rhs = ((GradeBookRuleDefinition010GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.shrgrul == rhs.shrgrul)||((this.shrgrul!= null)&&this.shrgrul.equals(rhs.shrgrul))))&&((this.shbgrul == rhs.shbgrul)||((this.shbgrul!= null)&&this.shbgrul.equals(rhs.shbgrul))));
    }

}
