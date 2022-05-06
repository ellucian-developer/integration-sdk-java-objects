
package com.ellucian.generated.bpapi.ban.general_person.v1_0_0;

import java.util.Date;
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
    "activityDate",
    "raceDesc",
    "raceCde",
    "userId"
})
@Generated("jsonschema2pojo")
public class Gorprac__1 {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORPRAC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GORPRAC_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Race Description
     * <p>
     * 
     * 
     */
    @JsonProperty("raceDesc")
    private String raceDesc;
    /**
     * Race
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    @JsonPropertyDescription("Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace")
    private String raceCde;
    /**
     * User
     * <p>
     * Lineage reference object : GORPRAC_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : GORPRAC_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORPRAC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GORPRAC_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Gorprac__1 withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Race Description
     * <p>
     * 
     * 
     */
    @JsonProperty("raceDesc")
    public String getRaceDesc() {
        return raceDesc;
    }

    /**
     * Race Description
     * <p>
     * 
     * 
     */
    @JsonProperty("raceDesc")
    public void setRaceDesc(String raceDesc) {
        this.raceDesc = raceDesc;
    }

    public Gorprac__1 withRaceDesc(String raceDesc) {
        this.raceDesc = raceDesc;
        return this;
    }

    /**
     * Race
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    public String getRaceCde() {
        return raceCde;
    }

    /**
     * Race
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    public void setRaceCde(String raceCde) {
        this.raceCde = raceCde;
    }

    public Gorprac__1 withRaceCde(String raceCde) {
        this.raceCde = raceCde;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GORPRAC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User
     * <p>
     * Lineage reference object : GORPRAC_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Gorprac__1 withUserId(String userId) {
        this.userId = userId;
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

    public Gorprac__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Gorprac__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("raceDesc");
        sb.append('=');
        sb.append(((this.raceDesc == null)?"<null>":this.raceDesc));
        sb.append(',');
        sb.append("raceCde");
        sb.append('=');
        sb.append(((this.raceCde == null)?"<null>":this.raceCde));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.raceDesc == null)? 0 :this.raceDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.raceCde == null)? 0 :this.raceCde.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gorprac__1) == false) {
            return false;
        }
        Gorprac__1 rhs = ((Gorprac__1) other);
        return ((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.raceDesc == rhs.raceDesc)||((this.raceDesc!= null)&&this.raceDesc.equals(rhs.raceDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.raceCde == rhs.raceCde)||((this.raceCde!= null)&&this.raceCde.equals(rhs.raceCde))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
