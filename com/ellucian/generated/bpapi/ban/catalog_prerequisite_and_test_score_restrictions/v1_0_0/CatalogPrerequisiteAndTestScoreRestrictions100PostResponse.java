
package com.ellucian.generated.bpapi.ban.catalog_prerequisite_and_test_score_restrictions.v1_0_0;

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
    "scrclpp",
    "scrprts",
    "scrpare"
})
@Generated("jsonschema2pojo")
public class CatalogPrerequisiteAndTestScoreRestrictions100PostResponse {

    @JsonProperty("scrclpp")
    private List<Scrclpp__1> scrclpp = new ArrayList<Scrclpp__1>();
    @JsonProperty("scrprts")
    private List<Scrprt__1> scrprts = new ArrayList<Scrprt__1>();
    @JsonProperty("scrpare")
    private List<Scrpare> scrpare = new ArrayList<Scrpare>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("scrclpp")
    public List<Scrclpp__1> getScrclpp() {
        return scrclpp;
    }

    @JsonProperty("scrclpp")
    public void setScrclpp(List<Scrclpp__1> scrclpp) {
        this.scrclpp = scrclpp;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PostResponse withScrclpp(List<Scrclpp__1> scrclpp) {
        this.scrclpp = scrclpp;
        return this;
    }

    @JsonProperty("scrprts")
    public List<Scrprt__1> getScrprts() {
        return scrprts;
    }

    @JsonProperty("scrprts")
    public void setScrprts(List<Scrprt__1> scrprts) {
        this.scrprts = scrprts;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PostResponse withScrprts(List<Scrprt__1> scrprts) {
        this.scrprts = scrprts;
        return this;
    }

    @JsonProperty("scrpare")
    public List<Scrpare> getScrpare() {
        return scrpare;
    }

    @JsonProperty("scrpare")
    public void setScrpare(List<Scrpare> scrpare) {
        this.scrpare = scrpare;
    }

    public CatalogPrerequisiteAndTestScoreRestrictions100PostResponse withScrpare(List<Scrpare> scrpare) {
        this.scrpare = scrpare;
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

    public CatalogPrerequisiteAndTestScoreRestrictions100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CatalogPrerequisiteAndTestScoreRestrictions100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scrclpp");
        sb.append('=');
        sb.append(((this.scrclpp == null)?"<null>":this.scrclpp));
        sb.append(',');
        sb.append("scrprts");
        sb.append('=');
        sb.append(((this.scrprts == null)?"<null>":this.scrprts));
        sb.append(',');
        sb.append("scrpare");
        sb.append('=');
        sb.append(((this.scrpare == null)?"<null>":this.scrpare));
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
        result = ((result* 31)+((this.scrpare == null)? 0 :this.scrpare.hashCode()));
        result = ((result* 31)+((this.scrclpp == null)? 0 :this.scrclpp.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scrprts == null)? 0 :this.scrprts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CatalogPrerequisiteAndTestScoreRestrictions100PostResponse) == false) {
            return false;
        }
        CatalogPrerequisiteAndTestScoreRestrictions100PostResponse rhs = ((CatalogPrerequisiteAndTestScoreRestrictions100PostResponse) other);
        return (((((this.scrpare == rhs.scrpare)||((this.scrpare!= null)&&this.scrpare.equals(rhs.scrpare)))&&((this.scrclpp == rhs.scrclpp)||((this.scrclpp!= null)&&this.scrclpp.equals(rhs.scrclpp))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scrprts == rhs.scrprts)||((this.scrprts!= null)&&this.scrprts.equals(rhs.scrprts))));
    }

}
