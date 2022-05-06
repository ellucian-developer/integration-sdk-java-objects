
package com.ellucian.generated.bpapi.ban.course_registration_class_and_level_restrictions.v1_0_0;

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
    "scrrcls",
    "scrrlvl"
})
@Generated("jsonschema2pojo")
public class CourseRegistrationClassAndLevelRestrictions100PostResponse {

    @JsonProperty("scrrcls")
    private List<Scrrcl__1> scrrcls = new ArrayList<Scrrcl__1>();
    @JsonProperty("scrrlvl")
    private List<Scrrlvl__1> scrrlvl = new ArrayList<Scrrlvl__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrrcls")
    public List<Scrrcl__1> getScrrcls() {
        return scrrcls;
    }

    @JsonProperty("scrrcls")
    public void setScrrcls(List<Scrrcl__1> scrrcls) {
        this.scrrcls = scrrcls;
    }

    public CourseRegistrationClassAndLevelRestrictions100PostResponse withScrrcls(List<Scrrcl__1> scrrcls) {
        this.scrrcls = scrrcls;
        return this;
    }

    @JsonProperty("scrrlvl")
    public List<Scrrlvl__1> getScrrlvl() {
        return scrrlvl;
    }

    @JsonProperty("scrrlvl")
    public void setScrrlvl(List<Scrrlvl__1> scrrlvl) {
        this.scrrlvl = scrrlvl;
    }

    public CourseRegistrationClassAndLevelRestrictions100PostResponse withScrrlvl(List<Scrrlvl__1> scrrlvl) {
        this.scrrlvl = scrrlvl;
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

    public CourseRegistrationClassAndLevelRestrictions100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseRegistrationClassAndLevelRestrictions100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrrcls");
        sb.append('=');
        sb.append(((this.scrrcls == null)?"<null>":this.scrrcls));
        sb.append(',');
        sb.append("scrrlvl");
        sb.append('=');
        sb.append(((this.scrrlvl == null)?"<null>":this.scrrlvl));
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
        result = ((result* 31)+((this.scrrcls == null)? 0 :this.scrrcls.hashCode()));
        result = ((result* 31)+((this.scrrlvl == null)? 0 :this.scrrlvl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseRegistrationClassAndLevelRestrictions100PostResponse) == false) {
            return false;
        }
        CourseRegistrationClassAndLevelRestrictions100PostResponse rhs = ((CourseRegistrationClassAndLevelRestrictions100PostResponse) other);
        return ((((this.scrrcls == rhs.scrrcls)||((this.scrrcls!= null)&&this.scrrcls.equals(rhs.scrrcls)))&&((this.scrrlvl == rhs.scrrlvl)||((this.scrrlvl!= null)&&this.scrrlvl.equals(rhs.scrrlvl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
