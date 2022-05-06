
package com.ellucian.generated.bpapi.ban.course_detail_information_integration_partners.v1_0_0;

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
    "intgDescription",
    "intgCde",
    "userId"
})
@Generated("jsonschema2pojo")
public class CourseDetailInformationIntegrationPartners100GetResponse {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRINTG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SCRINTG_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("intgDescription")
    private String intgDescription;
    /**
     * Integration Partners
     * <p>
     * Lineage reference object : SCRINTG_INTG_CDE
     * (Required)
     * 
     */
    @JsonProperty("intgCde")
    @JsonPropertyDescription("Lineage reference object : SCRINTG_INTG_CDE")
    private String intgCde;
    /**
     * User ID
     * <p>
     * Lineage reference object : SCRINTG_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SCRINTG_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRINTG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SCRINTG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public CourseDetailInformationIntegrationPartners100GetResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("intgDescription")
    public String getIntgDescription() {
        return intgDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("intgDescription")
    public void setIntgDescription(String intgDescription) {
        this.intgDescription = intgDescription;
    }

    public CourseDetailInformationIntegrationPartners100GetResponse withIntgDescription(String intgDescription) {
        this.intgDescription = intgDescription;
        return this;
    }

    /**
     * Integration Partners
     * <p>
     * Lineage reference object : SCRINTG_INTG_CDE
     * (Required)
     * 
     */
    @JsonProperty("intgCde")
    public String getIntgCde() {
        return intgCde;
    }

    /**
     * Integration Partners
     * <p>
     * Lineage reference object : SCRINTG_INTG_CDE
     * (Required)
     * 
     */
    @JsonProperty("intgCde")
    public void setIntgCde(String intgCde) {
        this.intgCde = intgCde;
    }

    public CourseDetailInformationIntegrationPartners100GetResponse withIntgCde(String intgCde) {
        this.intgCde = intgCde;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SCRINTG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : SCRINTG_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public CourseDetailInformationIntegrationPartners100GetResponse withUserId(String userId) {
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

    public CourseDetailInformationIntegrationPartners100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseDetailInformationIntegrationPartners100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("intgDescription");
        sb.append('=');
        sb.append(((this.intgDescription == null)?"<null>":this.intgDescription));
        sb.append(',');
        sb.append("intgCde");
        sb.append('=');
        sb.append(((this.intgCde == null)?"<null>":this.intgCde));
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
        result = ((result* 31)+((this.intgCde == null)? 0 :this.intgCde.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.intgDescription == null)? 0 :this.intgDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseDetailInformationIntegrationPartners100GetResponse) == false) {
            return false;
        }
        CourseDetailInformationIntegrationPartners100GetResponse rhs = ((CourseDetailInformationIntegrationPartners100GetResponse) other);
        return ((((((this.intgCde == rhs.intgCde)||((this.intgCde!= null)&&this.intgCde.equals(rhs.intgCde)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.intgDescription == rhs.intgDescription)||((this.intgDescription!= null)&&this.intgDescription.equals(rhs.intgDescription))));
    }

}
