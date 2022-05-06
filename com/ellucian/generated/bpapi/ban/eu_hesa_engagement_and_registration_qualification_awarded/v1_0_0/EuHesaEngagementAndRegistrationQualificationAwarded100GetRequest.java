
package com.ellucian.generated.bpapi.ban.eu_hesa_engagement_and_registration_qualification_awarded.v1_0_0;

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
    "thesisTitle",
    "numhus",
    "qualId",
    "id",
    "qualAwardId",
    "ssdtCodeQualResult",
    "userId"
})
@Generated("jsonschema2pojo")
public class EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest {

    /**
     * Lineage reference object : SOBREQA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOBREQA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Thesis Title
     * <p>
     * Lineage reference object : SOBREQA_THESIS_TITLE
     * 
     */
    @JsonProperty("thesisTitle")
    @JsonPropertyDescription("Lineage reference object : SOBREQA_THESIS_TITLE")
    private String thesisTitle;
    /**
     * Engagement Number
     * <p>
     * Lineage reference object : numhus
     * 
     */
    @JsonProperty("numhus")
    @JsonPropertyDescription("Lineage reference object : numhus")
    private Object numhus;
    /**
     * Qualification Identifier
     * <p>
     * Lineage reference object : SOBREQA_QUAL_ID
     * (Required)
     * 
     */
    @JsonProperty("qualId")
    @JsonPropertyDescription("Lineage reference object : SOBREQA_QUAL_ID")
    private String qualId;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Qualification Awarded Identifier
     * <p>
     * Lineage reference object : SOBREQA_QUAL_AWARD_ID
     * (Required)
     * 
     */
    @JsonProperty("qualAwardId")
    @JsonPropertyDescription("Lineage reference object : SOBREQA_QUAL_AWARD_ID")
    private String qualAwardId;
    /**
     * Qualification Result
     * <p>
     * Lineage reference object : SOBREQA_SSDT_CODE_QUAL_RESULT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQualResult")
    @JsonPropertyDescription("Lineage reference object : SOBREQA_SSDT_CODE_QUAL_RESULT, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeQualResult;
    /**
     * Lineage reference object : SOBREQA_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOBREQA_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SOBREQA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SOBREQA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Thesis Title
     * <p>
     * Lineage reference object : SOBREQA_THESIS_TITLE
     * 
     */
    @JsonProperty("thesisTitle")
    public String getThesisTitle() {
        return thesisTitle;
    }

    /**
     * Thesis Title
     * <p>
     * Lineage reference object : SOBREQA_THESIS_TITLE
     * 
     */
    @JsonProperty("thesisTitle")
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest withThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
        return this;
    }

    /**
     * Engagement Number
     * <p>
     * Lineage reference object : numhus
     * 
     */
    @JsonProperty("numhus")
    public Object getNumhus() {
        return numhus;
    }

    /**
     * Engagement Number
     * <p>
     * Lineage reference object : numhus
     * 
     */
    @JsonProperty("numhus")
    public void setNumhus(Object numhus) {
        this.numhus = numhus;
    }

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest withNumhus(Object numhus) {
        this.numhus = numhus;
        return this;
    }

    /**
     * Qualification Identifier
     * <p>
     * Lineage reference object : SOBREQA_QUAL_ID
     * (Required)
     * 
     */
    @JsonProperty("qualId")
    public String getQualId() {
        return qualId;
    }

    /**
     * Qualification Identifier
     * <p>
     * Lineage reference object : SOBREQA_QUAL_ID
     * (Required)
     * 
     */
    @JsonProperty("qualId")
    public void setQualId(String qualId) {
        this.qualId = qualId;
    }

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest withQualId(String qualId) {
        this.qualId = qualId;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Qualification Awarded Identifier
     * <p>
     * Lineage reference object : SOBREQA_QUAL_AWARD_ID
     * (Required)
     * 
     */
    @JsonProperty("qualAwardId")
    public String getQualAwardId() {
        return qualAwardId;
    }

    /**
     * Qualification Awarded Identifier
     * <p>
     * Lineage reference object : SOBREQA_QUAL_AWARD_ID
     * (Required)
     * 
     */
    @JsonProperty("qualAwardId")
    public void setQualAwardId(String qualAwardId) {
        this.qualAwardId = qualAwardId;
    }

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest withQualAwardId(String qualAwardId) {
        this.qualAwardId = qualAwardId;
        return this;
    }

    /**
     * Qualification Result
     * <p>
     * Lineage reference object : SOBREQA_SSDT_CODE_QUAL_RESULT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQualResult")
    public String getSsdtCodeQualResult() {
        return ssdtCodeQualResult;
    }

    /**
     * Qualification Result
     * <p>
     * Lineage reference object : SOBREQA_SSDT_CODE_QUAL_RESULT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQualResult")
    public void setSsdtCodeQualResult(String ssdtCodeQualResult) {
        this.ssdtCodeQualResult = ssdtCodeQualResult;
    }

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest withSsdtCodeQualResult(String ssdtCodeQualResult) {
        this.ssdtCodeQualResult = ssdtCodeQualResult;
        return this;
    }

    /**
     * Lineage reference object : SOBREQA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOBREQA_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest withUserId(String userId) {
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

    public EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("thesisTitle");
        sb.append('=');
        sb.append(((this.thesisTitle == null)?"<null>":this.thesisTitle));
        sb.append(',');
        sb.append("numhus");
        sb.append('=');
        sb.append(((this.numhus == null)?"<null>":this.numhus));
        sb.append(',');
        sb.append("qualId");
        sb.append('=');
        sb.append(((this.qualId == null)?"<null>":this.qualId));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("qualAwardId");
        sb.append('=');
        sb.append(((this.qualAwardId == null)?"<null>":this.qualAwardId));
        sb.append(',');
        sb.append("ssdtCodeQualResult");
        sb.append('=');
        sb.append(((this.ssdtCodeQualResult == null)?"<null>":this.ssdtCodeQualResult));
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
        result = ((result* 31)+((this.thesisTitle == null)? 0 :this.thesisTitle.hashCode()));
        result = ((result* 31)+((this.numhus == null)? 0 :this.numhus.hashCode()));
        result = ((result* 31)+((this.qualId == null)? 0 :this.qualId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.qualAwardId == null)? 0 :this.qualAwardId.hashCode()));
        result = ((result* 31)+((this.ssdtCodeQualResult == null)? 0 :this.ssdtCodeQualResult.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest) == false) {
            return false;
        }
        EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest rhs = ((EuHesaEngagementAndRegistrationQualificationAwarded100GetRequest) other);
        return ((((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.thesisTitle == rhs.thesisTitle)||((this.thesisTitle!= null)&&this.thesisTitle.equals(rhs.thesisTitle))))&&((this.numhus == rhs.numhus)||((this.numhus!= null)&&this.numhus.equals(rhs.numhus))))&&((this.qualId == rhs.qualId)||((this.qualId!= null)&&this.qualId.equals(rhs.qualId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.qualAwardId == rhs.qualAwardId)||((this.qualAwardId!= null)&&this.qualAwardId.equals(rhs.qualAwardId))))&&((this.ssdtCodeQualResult == rhs.ssdtCodeQualResult)||((this.ssdtCodeQualResult!= null)&&this.ssdtCodeQualResult.equals(rhs.ssdtCodeQualResult))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
