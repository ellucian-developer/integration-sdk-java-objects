
package com.ellucian.generated.bpapi.ban.eu_hesa_entry_qualification.v1_0_0;

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
    "id",
    "keyblockEngagementNum",
    "entryqualAwardedId",
    "ownqualid",
    "qualificationYear",
    "ssdtCodeQualResult",
    "ssdtCodeQualTypeId",
    "activityDate",
    "userId"
})
@Generated("jsonschema2pojo")
public class EuHesaEntryQualification100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblockEngagementNum")
    private String keyblockEngagementNum;
    @JsonProperty("entryqualAwardedId")
    private String entryqualAwardedId;
    @JsonProperty("ownqualid")
    private String ownqualid;
    @JsonProperty("qualificationYear")
    private String qualificationYear;
    @JsonProperty("ssdtCodeQualResult")
    private String ssdtCodeQualResult;
    @JsonProperty("ssdtCodeQualTypeId")
    private String ssdtCodeQualTypeId;
    /**
     * Lineage reference object : SORENTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORENTS_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SORENTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORENTS_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EuHesaEntryQualification100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblockEngagementNum")
    public String getKeyblockEngagementNum() {
        return keyblockEngagementNum;
    }

    @JsonProperty("keyblockEngagementNum")
    public void setKeyblockEngagementNum(String keyblockEngagementNum) {
        this.keyblockEngagementNum = keyblockEngagementNum;
    }

    public EuHesaEntryQualification100QapiPost withKeyblockEngagementNum(String keyblockEngagementNum) {
        this.keyblockEngagementNum = keyblockEngagementNum;
        return this;
    }

    @JsonProperty("entryqualAwardedId")
    public String getEntryqualAwardedId() {
        return entryqualAwardedId;
    }

    @JsonProperty("entryqualAwardedId")
    public void setEntryqualAwardedId(String entryqualAwardedId) {
        this.entryqualAwardedId = entryqualAwardedId;
    }

    public EuHesaEntryQualification100QapiPost withEntryqualAwardedId(String entryqualAwardedId) {
        this.entryqualAwardedId = entryqualAwardedId;
        return this;
    }

    @JsonProperty("ownqualid")
    public String getOwnqualid() {
        return ownqualid;
    }

    @JsonProperty("ownqualid")
    public void setOwnqualid(String ownqualid) {
        this.ownqualid = ownqualid;
    }

    public EuHesaEntryQualification100QapiPost withOwnqualid(String ownqualid) {
        this.ownqualid = ownqualid;
        return this;
    }

    @JsonProperty("qualificationYear")
    public String getQualificationYear() {
        return qualificationYear;
    }

    @JsonProperty("qualificationYear")
    public void setQualificationYear(String qualificationYear) {
        this.qualificationYear = qualificationYear;
    }

    public EuHesaEntryQualification100QapiPost withQualificationYear(String qualificationYear) {
        this.qualificationYear = qualificationYear;
        return this;
    }

    @JsonProperty("ssdtCodeQualResult")
    public String getSsdtCodeQualResult() {
        return ssdtCodeQualResult;
    }

    @JsonProperty("ssdtCodeQualResult")
    public void setSsdtCodeQualResult(String ssdtCodeQualResult) {
        this.ssdtCodeQualResult = ssdtCodeQualResult;
    }

    public EuHesaEntryQualification100QapiPost withSsdtCodeQualResult(String ssdtCodeQualResult) {
        this.ssdtCodeQualResult = ssdtCodeQualResult;
        return this;
    }

    @JsonProperty("ssdtCodeQualTypeId")
    public String getSsdtCodeQualTypeId() {
        return ssdtCodeQualTypeId;
    }

    @JsonProperty("ssdtCodeQualTypeId")
    public void setSsdtCodeQualTypeId(String ssdtCodeQualTypeId) {
        this.ssdtCodeQualTypeId = ssdtCodeQualTypeId;
    }

    public EuHesaEntryQualification100QapiPost withSsdtCodeQualTypeId(String ssdtCodeQualTypeId) {
        this.ssdtCodeQualTypeId = ssdtCodeQualTypeId;
        return this;
    }

    /**
     * Lineage reference object : SORENTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SORENTS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public EuHesaEntryQualification100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SORENTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SORENTS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public EuHesaEntryQualification100QapiPost withUserId(String userId) {
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

    public EuHesaEntryQualification100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaEntryQualification100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblockEngagementNum");
        sb.append('=');
        sb.append(((this.keyblockEngagementNum == null)?"<null>":this.keyblockEngagementNum));
        sb.append(',');
        sb.append("entryqualAwardedId");
        sb.append('=');
        sb.append(((this.entryqualAwardedId == null)?"<null>":this.entryqualAwardedId));
        sb.append(',');
        sb.append("ownqualid");
        sb.append('=');
        sb.append(((this.ownqualid == null)?"<null>":this.ownqualid));
        sb.append(',');
        sb.append("qualificationYear");
        sb.append('=');
        sb.append(((this.qualificationYear == null)?"<null>":this.qualificationYear));
        sb.append(',');
        sb.append("ssdtCodeQualResult");
        sb.append('=');
        sb.append(((this.ssdtCodeQualResult == null)?"<null>":this.ssdtCodeQualResult));
        sb.append(',');
        sb.append("ssdtCodeQualTypeId");
        sb.append('=');
        sb.append(((this.ssdtCodeQualTypeId == null)?"<null>":this.ssdtCodeQualTypeId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.ssdtCodeQualTypeId == null)? 0 :this.ssdtCodeQualTypeId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.qualificationYear == null)? 0 :this.qualificationYear.hashCode()));
        result = ((result* 31)+((this.ownqualid == null)? 0 :this.ownqualid.hashCode()));
        result = ((result* 31)+((this.keyblockEngagementNum == null)? 0 :this.keyblockEngagementNum.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.ssdtCodeQualResult == null)? 0 :this.ssdtCodeQualResult.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.entryqualAwardedId == null)? 0 :this.entryqualAwardedId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaEntryQualification100QapiPost) == false) {
            return false;
        }
        EuHesaEntryQualification100QapiPost rhs = ((EuHesaEntryQualification100QapiPost) other);
        return (((((((((((this.ssdtCodeQualTypeId == rhs.ssdtCodeQualTypeId)||((this.ssdtCodeQualTypeId!= null)&&this.ssdtCodeQualTypeId.equals(rhs.ssdtCodeQualTypeId)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.qualificationYear == rhs.qualificationYear)||((this.qualificationYear!= null)&&this.qualificationYear.equals(rhs.qualificationYear))))&&((this.ownqualid == rhs.ownqualid)||((this.ownqualid!= null)&&this.ownqualid.equals(rhs.ownqualid))))&&((this.keyblockEngagementNum == rhs.keyblockEngagementNum)||((this.keyblockEngagementNum!= null)&&this.keyblockEngagementNum.equals(rhs.keyblockEngagementNum))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.ssdtCodeQualResult == rhs.ssdtCodeQualResult)||((this.ssdtCodeQualResult!= null)&&this.ssdtCodeQualResult.equals(rhs.ssdtCodeQualResult))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.entryqualAwardedId == rhs.entryqualAwardedId)||((this.entryqualAwardedId!= null)&&this.entryqualAwardedId.equals(rhs.entryqualAwardedId))));
    }

}
