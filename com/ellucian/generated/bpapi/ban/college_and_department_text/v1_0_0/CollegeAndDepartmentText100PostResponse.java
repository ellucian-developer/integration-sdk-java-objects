
package com.ellucian.generated.bpapi.ban.college_and_department_text.v1_0_0;

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
    "scrcdtx",
    "scbcdtl"
})
@Generated("jsonschema2pojo")
public class CollegeAndDepartmentText100PostResponse {

    @JsonProperty("scrcdtx")
    private List<Scrcdtx> scrcdtx = new ArrayList<Scrcdtx>();
    @JsonProperty("scbcdtl")
    private List<Scbcdtl> scbcdtl = new ArrayList<Scbcdtl>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrcdtx")
    public List<Scrcdtx> getScrcdtx() {
        return scrcdtx;
    }

    @JsonProperty("scrcdtx")
    public void setScrcdtx(List<Scrcdtx> scrcdtx) {
        this.scrcdtx = scrcdtx;
    }

    public CollegeAndDepartmentText100PostResponse withScrcdtx(List<Scrcdtx> scrcdtx) {
        this.scrcdtx = scrcdtx;
        return this;
    }

    @JsonProperty("scbcdtl")
    public List<Scbcdtl> getScbcdtl() {
        return scbcdtl;
    }

    @JsonProperty("scbcdtl")
    public void setScbcdtl(List<Scbcdtl> scbcdtl) {
        this.scbcdtl = scbcdtl;
    }

    public CollegeAndDepartmentText100PostResponse withScbcdtl(List<Scbcdtl> scbcdtl) {
        this.scbcdtl = scbcdtl;
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

    public CollegeAndDepartmentText100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CollegeAndDepartmentText100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrcdtx");
        sb.append('=');
        sb.append(((this.scrcdtx == null)?"<null>":this.scrcdtx));
        sb.append(',');
        sb.append("scbcdtl");
        sb.append('=');
        sb.append(((this.scbcdtl == null)?"<null>":this.scbcdtl));
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
        result = ((result* 31)+((this.scbcdtl == null)? 0 :this.scbcdtl.hashCode()));
        result = ((result* 31)+((this.scrcdtx == null)? 0 :this.scrcdtx.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CollegeAndDepartmentText100PostResponse) == false) {
            return false;
        }
        CollegeAndDepartmentText100PostResponse rhs = ((CollegeAndDepartmentText100PostResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.scbcdtl == rhs.scbcdtl)||((this.scbcdtl!= null)&&this.scbcdtl.equals(rhs.scbcdtl))))&&((this.scrcdtx == rhs.scrcdtx)||((this.scrcdtx!= null)&&this.scrcdtx.equals(rhs.scrcdtx))));
    }

}
