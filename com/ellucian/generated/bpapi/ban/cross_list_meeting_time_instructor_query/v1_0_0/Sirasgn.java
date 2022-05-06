
package com.ellucian.generated.bpapi.ban.cross_list_meeting_time_instructor_query.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "percentResponse",
    "overRide",
    "name",
    "category",
    "idno",
    "percentSess",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class Sirasgn {

    /**
     * Percent
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * 
     */
    @JsonProperty("percentResponse")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_RESPONSE")
    private Double percentResponse;
    /**
     * Override Indicator
     * <p>
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_OVER_RIDE")
    private String overRide;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_CATEGORY")
    private String category;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("idno")
    private String idno;
    /**
     * Percent Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * 
     */
    @JsonProperty("percentSess")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PERCENT_SESS")
    private Double percentSess;
    /**
     * Primary Indicator
     * <p>
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    @JsonPropertyDescription("Lineage reference object : SIRASGN_PRIMARY_IND")
    private String primaryInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Percent
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * 
     */
    @JsonProperty("percentResponse")
    public Double getPercentResponse() {
        return percentResponse;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_RESPONSE
     * 
     */
    @JsonProperty("percentResponse")
    public void setPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
    }

    public Sirasgn withPercentResponse(Double percentResponse) {
        this.percentResponse = percentResponse;
        return this;
    }

    /**
     * Override Indicator
     * <p>
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    public String getOverRide() {
        return overRide;
    }

    /**
     * Override Indicator
     * <p>
     * Lineage reference object : SIRASGN_OVER_RIDE
     * 
     */
    @JsonProperty("overRide")
    public void setOverRide(String overRide) {
        this.overRide = overRide;
    }

    public Sirasgn withOverRide(String overRide) {
        this.overRide = overRide;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Sirasgn withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * 
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * Session Indicator
     * <p>
     * Lineage reference object : SIRASGN_CATEGORY
     * 
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public Sirasgn withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("idno")
    public String getIdno() {
        return idno;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("idno")
    public void setIdno(String idno) {
        this.idno = idno;
    }

    public Sirasgn withIdno(String idno) {
        this.idno = idno;
        return this;
    }

    /**
     * Percent Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * 
     */
    @JsonProperty("percentSess")
    public Double getPercentSess() {
        return percentSess;
    }

    /**
     * Percent Session
     * <p>
     * Lineage reference object : SIRASGN_PERCENT_SESS
     * 
     */
    @JsonProperty("percentSess")
    public void setPercentSess(Double percentSess) {
        this.percentSess = percentSess;
    }

    public Sirasgn withPercentSess(Double percentSess) {
        this.percentSess = percentSess;
        return this;
    }

    /**
     * Primary Indicator
     * <p>
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public String getPrimaryInd() {
        return primaryInd;
    }

    /**
     * Primary Indicator
     * <p>
     * Lineage reference object : SIRASGN_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public Sirasgn withPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
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

    public Sirasgn withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sirasgn.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("percentResponse");
        sb.append('=');
        sb.append(((this.percentResponse == null)?"<null>":this.percentResponse));
        sb.append(',');
        sb.append("overRide");
        sb.append('=');
        sb.append(((this.overRide == null)?"<null>":this.overRide));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("idno");
        sb.append('=');
        sb.append(((this.idno == null)?"<null>":this.idno));
        sb.append(',');
        sb.append("percentSess");
        sb.append('=');
        sb.append(((this.percentSess == null)?"<null>":this.percentSess));
        sb.append(',');
        sb.append("primaryInd");
        sb.append('=');
        sb.append(((this.primaryInd == null)?"<null>":this.primaryInd));
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
        result = ((result* 31)+((this.percentResponse == null)? 0 :this.percentResponse.hashCode()));
        result = ((result* 31)+((this.overRide == null)? 0 :this.overRide.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.idno == null)? 0 :this.idno.hashCode()));
        result = ((result* 31)+((this.percentSess == null)? 0 :this.percentSess.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sirasgn) == false) {
            return false;
        }
        Sirasgn rhs = ((Sirasgn) other);
        return (((((((((this.percentResponse == rhs.percentResponse)||((this.percentResponse!= null)&&this.percentResponse.equals(rhs.percentResponse)))&&((this.overRide == rhs.overRide)||((this.overRide!= null)&&this.overRide.equals(rhs.overRide))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.idno == rhs.idno)||((this.idno!= null)&&this.idno.equals(rhs.idno))))&&((this.percentSess == rhs.percentSess)||((this.percentSess!= null)&&this.percentSess.equals(rhs.percentSess))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
