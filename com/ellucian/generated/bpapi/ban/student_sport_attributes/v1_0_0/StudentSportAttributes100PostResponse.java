
package com.ellucian.generated.bpapi.ban.student_sport_attributes.v1_0_0;

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
    "saatCode",
    "activityDate",
    "userId",
    "saatDesc"
})
@Generated("jsonschema2pojo")
public class StudentSportAttributes100PostResponse {

    /**
     * Athletic Attribute
     * <p>
     * Lineage reference object : SGRATHA_SAAT_CODE, Lookup lineage reference object : stvsaat
     * 
     */
    @JsonProperty("saatCode")
    @JsonPropertyDescription("Lineage reference object : SGRATHA_SAAT_CODE, Lookup lineage reference object : stvsaat")
    private String saatCode;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRATHA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SGRATHA_USER_ID")
    private String userId;
    @JsonProperty("saatDesc")
    private String saatDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Athletic Attribute
     * <p>
     * Lineage reference object : SGRATHA_SAAT_CODE, Lookup lineage reference object : stvsaat
     * 
     */
    @JsonProperty("saatCode")
    public String getSaatCode() {
        return saatCode;
    }

    /**
     * Athletic Attribute
     * <p>
     * Lineage reference object : SGRATHA_SAAT_CODE, Lookup lineage reference object : stvsaat
     * 
     */
    @JsonProperty("saatCode")
    public void setSaatCode(String saatCode) {
        this.saatCode = saatCode;
    }

    public StudentSportAttributes100PostResponse withSaatCode(String saatCode) {
        this.saatCode = saatCode;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SGRATHA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public StudentSportAttributes100PostResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SGRATHA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public StudentSportAttributes100PostResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("saatDesc")
    public String getSaatDesc() {
        return saatDesc;
    }

    @JsonProperty("saatDesc")
    public void setSaatDesc(String saatDesc) {
        this.saatDesc = saatDesc;
    }

    public StudentSportAttributes100PostResponse withSaatDesc(String saatDesc) {
        this.saatDesc = saatDesc;
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

    public StudentSportAttributes100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentSportAttributes100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saatCode");
        sb.append('=');
        sb.append(((this.saatCode == null)?"<null>":this.saatCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("saatDesc");
        sb.append('=');
        sb.append(((this.saatDesc == null)?"<null>":this.saatDesc));
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
        result = ((result* 31)+((this.saatCode == null)? 0 :this.saatCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.saatDesc == null)? 0 :this.saatDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentSportAttributes100PostResponse) == false) {
            return false;
        }
        StudentSportAttributes100PostResponse rhs = ((StudentSportAttributes100PostResponse) other);
        return ((((((this.saatCode == rhs.saatCode)||((this.saatCode!= null)&&this.saatCode.equals(rhs.saatCode)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.saatDesc == rhs.saatDesc)||((this.saatDesc!= null)&&this.saatDesc.equals(rhs.saatDesc))));
    }

}
