
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
    "ssdtCodeQualResultSt",
    "activityDate",
    "thesisTitle",
    "qualId",
    "qualAwardId",
    "ssdtCodeQualResult",
    "userId"
})
@Generated("jsonschema2pojo")
public class Sobreqa {

    /**
     * Qualification Result Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualResultSt")
    private String ssdtCodeQualResultSt;
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
     * Qualification Result Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualResultSt")
    public String getSsdtCodeQualResultSt() {
        return ssdtCodeQualResultSt;
    }

    /**
     * Qualification Result Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualResultSt")
    public void setSsdtCodeQualResultSt(String ssdtCodeQualResultSt) {
        this.ssdtCodeQualResultSt = ssdtCodeQualResultSt;
    }

    public Sobreqa withSsdtCodeQualResultSt(String ssdtCodeQualResultSt) {
        this.ssdtCodeQualResultSt = ssdtCodeQualResultSt;
        return this;
    }

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

    public Sobreqa withActivityDate(Date activityDate) {
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

    public Sobreqa withThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
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

    public Sobreqa withQualId(String qualId) {
        this.qualId = qualId;
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

    public Sobreqa withQualAwardId(String qualAwardId) {
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

    public Sobreqa withSsdtCodeQualResult(String ssdtCodeQualResult) {
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

    public Sobreqa withUserId(String userId) {
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

    public Sobreqa withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sobreqa.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssdtCodeQualResultSt");
        sb.append('=');
        sb.append(((this.ssdtCodeQualResultSt == null)?"<null>":this.ssdtCodeQualResultSt));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("thesisTitle");
        sb.append('=');
        sb.append(((this.thesisTitle == null)?"<null>":this.thesisTitle));
        sb.append(',');
        sb.append("qualId");
        sb.append('=');
        sb.append(((this.qualId == null)?"<null>":this.qualId));
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
        result = ((result* 31)+((this.ssdtCodeQualResultSt == null)? 0 :this.ssdtCodeQualResultSt.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.thesisTitle == null)? 0 :this.thesisTitle.hashCode()));
        result = ((result* 31)+((this.qualId == null)? 0 :this.qualId.hashCode()));
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
        if ((other instanceof Sobreqa) == false) {
            return false;
        }
        Sobreqa rhs = ((Sobreqa) other);
        return (((((((((this.ssdtCodeQualResultSt == rhs.ssdtCodeQualResultSt)||((this.ssdtCodeQualResultSt!= null)&&this.ssdtCodeQualResultSt.equals(rhs.ssdtCodeQualResultSt)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.thesisTitle == rhs.thesisTitle)||((this.thesisTitle!= null)&&this.thesisTitle.equals(rhs.thesisTitle))))&&((this.qualId == rhs.qualId)||((this.qualId!= null)&&this.qualId.equals(rhs.qualId))))&&((this.qualAwardId == rhs.qualAwardId)||((this.qualAwardId!= null)&&this.qualAwardId.equals(rhs.qualAwardId))))&&((this.ssdtCodeQualResult == rhs.ssdtCodeQualResult)||((this.ssdtCodeQualResult!= null)&&this.ssdtCodeQualResult.equals(rhs.ssdtCodeQualResult))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
