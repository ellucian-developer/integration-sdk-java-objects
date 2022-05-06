
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
    "ssdtCodeQualResultSt",
    "ssdtCodeQualTypeId",
    "activityDate",
    "SorentqOwnqualId",
    "SorentqQualificationYear",
    "ssdtCodeQualResult",
    "ssdtCodeQualTypeIdSt",
    "userId",
    "entryqualAwardedId"
})
@Generated("jsonschema2pojo")
public class Sorentq {

    /**
     * Qualification Result Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualResultSt")
    private String ssdtCodeQualResultSt;
    /**
     * Qualification Type Identifier
     * <p>
     * Lineage reference object : SORENTQ_SSDT_CODE_QUAL_TYPE_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQualTypeId")
    @JsonPropertyDescription("Lineage reference object : SORENTQ_SSDT_CODE_QUAL_TYPE_ID, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeQualTypeId;
    /**
     * Sorentq Activity Date
     * <p>
     * Lineage reference object : SORENTQ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SORENTQ_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : SORENTQ_OWNQUALID
     * 
     */
    @JsonProperty("SorentqOwnqualId")
    @JsonPropertyDescription("Lineage reference object : SORENTQ_OWNQUALID")
    private String sorentqOwnqualId;
    /**
     * Lineage reference object : SORENTQ_QUALIFICATION_YEAR
     * 
     */
    @JsonProperty("SorentqQualificationYear")
    @JsonPropertyDescription("Lineage reference object : SORENTQ_QUALIFICATION_YEAR")
    private Double sorentqQualificationYear;
    /**
     * Qualification Result
     * <p>
     * Lineage reference object : SORENTQ_SSDT_CODE_QUAL_RESULT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQualResult")
    @JsonPropertyDescription("Lineage reference object : SORENTQ_SSDT_CODE_QUAL_RESULT, Lookup lineage reference object : skvssdt,skvssdt")
    private String ssdtCodeQualResult;
    /**
     * Qualification Type Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualTypeIdSt")
    private String ssdtCodeQualTypeIdSt;
    /**
     * Sorentq User Id
     * <p>
     * Lineage reference object : SORENTQ_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SORENTQ_USER_ID")
    private String userId;
    /**
     * Entry Qualification Awarded Identifier
     * <p>
     * Lineage reference object : SORENTQ_ENTRYQUAL_AWARDED_ID
     * (Required)
     * 
     */
    @JsonProperty("entryqualAwardedId")
    @JsonPropertyDescription("Lineage reference object : SORENTQ_ENTRYQUAL_AWARDED_ID")
    private String entryqualAwardedId;
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

    public Sorentq withSsdtCodeQualResultSt(String ssdtCodeQualResultSt) {
        this.ssdtCodeQualResultSt = ssdtCodeQualResultSt;
        return this;
    }

    /**
     * Qualification Type Identifier
     * <p>
     * Lineage reference object : SORENTQ_SSDT_CODE_QUAL_TYPE_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQualTypeId")
    public String getSsdtCodeQualTypeId() {
        return ssdtCodeQualTypeId;
    }

    /**
     * Qualification Type Identifier
     * <p>
     * Lineage reference object : SORENTQ_SSDT_CODE_QUAL_TYPE_ID, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQualTypeId")
    public void setSsdtCodeQualTypeId(String ssdtCodeQualTypeId) {
        this.ssdtCodeQualTypeId = ssdtCodeQualTypeId;
    }

    public Sorentq withSsdtCodeQualTypeId(String ssdtCodeQualTypeId) {
        this.ssdtCodeQualTypeId = ssdtCodeQualTypeId;
        return this;
    }

    /**
     * Sorentq Activity Date
     * <p>
     * Lineage reference object : SORENTQ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Sorentq Activity Date
     * <p>
     * Lineage reference object : SORENTQ_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Sorentq withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : SORENTQ_OWNQUALID
     * 
     */
    @JsonProperty("SorentqOwnqualId")
    public String getSorentqOwnqualId() {
        return sorentqOwnqualId;
    }

    /**
     * Lineage reference object : SORENTQ_OWNQUALID
     * 
     */
    @JsonProperty("SorentqOwnqualId")
    public void setSorentqOwnqualId(String sorentqOwnqualId) {
        this.sorentqOwnqualId = sorentqOwnqualId;
    }

    public Sorentq withSorentqOwnqualId(String sorentqOwnqualId) {
        this.sorentqOwnqualId = sorentqOwnqualId;
        return this;
    }

    /**
     * Lineage reference object : SORENTQ_QUALIFICATION_YEAR
     * 
     */
    @JsonProperty("SorentqQualificationYear")
    public Double getSorentqQualificationYear() {
        return sorentqQualificationYear;
    }

    /**
     * Lineage reference object : SORENTQ_QUALIFICATION_YEAR
     * 
     */
    @JsonProperty("SorentqQualificationYear")
    public void setSorentqQualificationYear(Double sorentqQualificationYear) {
        this.sorentqQualificationYear = sorentqQualificationYear;
    }

    public Sorentq withSorentqQualificationYear(Double sorentqQualificationYear) {
        this.sorentqQualificationYear = sorentqQualificationYear;
        return this;
    }

    /**
     * Qualification Result
     * <p>
     * Lineage reference object : SORENTQ_SSDT_CODE_QUAL_RESULT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQualResult")
    public String getSsdtCodeQualResult() {
        return ssdtCodeQualResult;
    }

    /**
     * Qualification Result
     * <p>
     * Lineage reference object : SORENTQ_SSDT_CODE_QUAL_RESULT, Lookup lineage reference object : skvssdt,skvssdt
     * 
     */
    @JsonProperty("ssdtCodeQualResult")
    public void setSsdtCodeQualResult(String ssdtCodeQualResult) {
        this.ssdtCodeQualResult = ssdtCodeQualResult;
    }

    public Sorentq withSsdtCodeQualResult(String ssdtCodeQualResult) {
        this.ssdtCodeQualResult = ssdtCodeQualResult;
        return this;
    }

    /**
     * Qualification Type Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualTypeIdSt")
    public String getSsdtCodeQualTypeIdSt() {
        return ssdtCodeQualTypeIdSt;
    }

    /**
     * Qualification Type Identifier Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ssdtCodeQualTypeIdSt")
    public void setSsdtCodeQualTypeIdSt(String ssdtCodeQualTypeIdSt) {
        this.ssdtCodeQualTypeIdSt = ssdtCodeQualTypeIdSt;
    }

    public Sorentq withSsdtCodeQualTypeIdSt(String ssdtCodeQualTypeIdSt) {
        this.ssdtCodeQualTypeIdSt = ssdtCodeQualTypeIdSt;
        return this;
    }

    /**
     * Sorentq User Id
     * <p>
     * Lineage reference object : SORENTQ_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Sorentq User Id
     * <p>
     * Lineage reference object : SORENTQ_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Sorentq withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Entry Qualification Awarded Identifier
     * <p>
     * Lineage reference object : SORENTQ_ENTRYQUAL_AWARDED_ID
     * (Required)
     * 
     */
    @JsonProperty("entryqualAwardedId")
    public String getEntryqualAwardedId() {
        return entryqualAwardedId;
    }

    /**
     * Entry Qualification Awarded Identifier
     * <p>
     * Lineage reference object : SORENTQ_ENTRYQUAL_AWARDED_ID
     * (Required)
     * 
     */
    @JsonProperty("entryqualAwardedId")
    public void setEntryqualAwardedId(String entryqualAwardedId) {
        this.entryqualAwardedId = entryqualAwardedId;
    }

    public Sorentq withEntryqualAwardedId(String entryqualAwardedId) {
        this.entryqualAwardedId = entryqualAwardedId;
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

    public Sorentq withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorentq.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssdtCodeQualResultSt");
        sb.append('=');
        sb.append(((this.ssdtCodeQualResultSt == null)?"<null>":this.ssdtCodeQualResultSt));
        sb.append(',');
        sb.append("ssdtCodeQualTypeId");
        sb.append('=');
        sb.append(((this.ssdtCodeQualTypeId == null)?"<null>":this.ssdtCodeQualTypeId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("sorentqOwnqualId");
        sb.append('=');
        sb.append(((this.sorentqOwnqualId == null)?"<null>":this.sorentqOwnqualId));
        sb.append(',');
        sb.append("sorentqQualificationYear");
        sb.append('=');
        sb.append(((this.sorentqQualificationYear == null)?"<null>":this.sorentqQualificationYear));
        sb.append(',');
        sb.append("ssdtCodeQualResult");
        sb.append('=');
        sb.append(((this.ssdtCodeQualResult == null)?"<null>":this.ssdtCodeQualResult));
        sb.append(',');
        sb.append("ssdtCodeQualTypeIdSt");
        sb.append('=');
        sb.append(((this.ssdtCodeQualTypeIdSt == null)?"<null>":this.ssdtCodeQualTypeIdSt));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("entryqualAwardedId");
        sb.append('=');
        sb.append(((this.entryqualAwardedId == null)?"<null>":this.entryqualAwardedId));
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
        result = ((result* 31)+((this.ssdtCodeQualTypeId == null)? 0 :this.ssdtCodeQualTypeId.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.ssdtCodeQualResult == null)? 0 :this.ssdtCodeQualResult.hashCode()));
        result = ((result* 31)+((this.ssdtCodeQualTypeIdSt == null)? 0 :this.ssdtCodeQualTypeIdSt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorentqQualificationYear == null)? 0 :this.sorentqQualificationYear.hashCode()));
        result = ((result* 31)+((this.sorentqOwnqualId == null)? 0 :this.sorentqOwnqualId.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.entryqualAwardedId == null)? 0 :this.entryqualAwardedId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorentq) == false) {
            return false;
        }
        Sorentq rhs = ((Sorentq) other);
        return (((((((((((this.ssdtCodeQualResultSt == rhs.ssdtCodeQualResultSt)||((this.ssdtCodeQualResultSt!= null)&&this.ssdtCodeQualResultSt.equals(rhs.ssdtCodeQualResultSt)))&&((this.ssdtCodeQualTypeId == rhs.ssdtCodeQualTypeId)||((this.ssdtCodeQualTypeId!= null)&&this.ssdtCodeQualTypeId.equals(rhs.ssdtCodeQualTypeId))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.ssdtCodeQualResult == rhs.ssdtCodeQualResult)||((this.ssdtCodeQualResult!= null)&&this.ssdtCodeQualResult.equals(rhs.ssdtCodeQualResult))))&&((this.ssdtCodeQualTypeIdSt == rhs.ssdtCodeQualTypeIdSt)||((this.ssdtCodeQualTypeIdSt!= null)&&this.ssdtCodeQualTypeIdSt.equals(rhs.ssdtCodeQualTypeIdSt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorentqQualificationYear == rhs.sorentqQualificationYear)||((this.sorentqQualificationYear!= null)&&this.sorentqQualificationYear.equals(rhs.sorentqQualificationYear))))&&((this.sorentqOwnqualId == rhs.sorentqOwnqualId)||((this.sorentqOwnqualId!= null)&&this.sorentqOwnqualId.equals(rhs.sorentqOwnqualId))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.entryqualAwardedId == rhs.entryqualAwardedId)||((this.entryqualAwardedId!= null)&&this.entryqualAwardedId.equals(rhs.entryqualAwardedId))));
    }

}
