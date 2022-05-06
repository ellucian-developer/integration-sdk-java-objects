
package com.ellucian.generated.bpapi.ban.test_score_administration_type_codes_contacts_cohorts_attributes.v1_0_0;

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
    "sgastdnId",
    "chrtCode",
    "stspKeySequence",
    "creaCode",
    "activityDate",
    "sgrsattStspKeySequence",
    "attsCode",
    "activeInd",
    "sgastdnTermCodeEff",
    "userId"
})
@Generated("jsonschema2pojo")
public class TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest {

    /**
     * ID
     * <p>
     * Lineage reference object : sgastdnId
     * 
     */
    @JsonProperty("sgastdnId")
    @JsonPropertyDescription("Lineage reference object : sgastdnId")
    private Object sgastdnId;
    /**
     * Cohort Code
     * <p>
     * Lineage reference object : SGRCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt
     * (Required)
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp")
    private Double stspKeySequence;
    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("creaCode")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea")
    private String creaCode;
    /**
     * Lineage reference object : SGRSATT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRSATT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRSATT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("sgrsattStspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SGRSATT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp")
    private Double sgrsattStspKeySequence;
    /**
     * Attribute Code
     * <p>
     * Lineage reference object : SGRSATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * (Required)
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SGRSATT_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_ACTIVE_IND")
    private String activeInd;
    /**
     * Term
     * <p>
     * Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgastdnTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm")
    private Object sgastdnTermCodeEff;
    /**
     * Lineage reference object : SGRSATT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SGRSATT_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * Lineage reference object : sgastdnId
     * 
     */
    @JsonProperty("sgastdnId")
    public Object getSgastdnId() {
        return sgastdnId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : sgastdnId
     * 
     */
    @JsonProperty("sgastdnId")
    public void setSgastdnId(Object sgastdnId) {
        this.sgastdnId = sgastdnId;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withSgastdnId(Object sgastdnId) {
        this.sgastdnId = sgastdnId;
        return this;
    }

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : SGRCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt
     * (Required)
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : SGRCHRT_CHRT_CODE, Lookup lineage reference object : stvchrt
     * (Required)
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("creaCode")
    public String getCreaCode() {
        return creaCode;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SGRCHRT_CREA_CODE, Lookup lineage reference object : stvcrea
     * 
     */
    @JsonProperty("creaCode")
    public void setCreaCode(String creaCode) {
        this.creaCode = creaCode;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withCreaCode(String creaCode) {
        this.creaCode = creaCode;
        return this;
    }

    /**
     * Lineage reference object : SGRSATT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SGRSATT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRSATT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("sgrsattStspKeySequence")
    public Double getSgrsattStspKeySequence() {
        return sgrsattStspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRSATT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("sgrsattStspKeySequence")
    public void setSgrsattStspKeySequence(Double sgrsattStspKeySequence) {
        this.sgrsattStspKeySequence = sgrsattStspKeySequence;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withSgrsattStspKeySequence(Double sgrsattStspKeySequence) {
        this.sgrsattStspKeySequence = sgrsattStspKeySequence;
        return this;
    }

    /**
     * Attribute Code
     * <p>
     * Lineage reference object : SGRSATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * (Required)
     * 
     */
    @JsonProperty("attsCode")
    public String getAttsCode() {
        return attsCode;
    }

    /**
     * Attribute Code
     * <p>
     * Lineage reference object : SGRSATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * (Required)
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgastdnTermCodeEff")
    public Object getSgastdnTermCodeEff() {
        return sgastdnTermCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : sgastdnTermCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sgastdnTermCodeEff")
    public void setSgastdnTermCodeEff(Object sgastdnTermCodeEff) {
        this.sgastdnTermCodeEff = sgastdnTermCodeEff;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withSgastdnTermCodeEff(Object sgastdnTermCodeEff) {
        this.sgastdnTermCodeEff = sgastdnTermCodeEff;
        return this;
    }

    /**
     * Lineage reference object : SGRSATT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SGRSATT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withUserId(String userId) {
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

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgastdnId");
        sb.append('=');
        sb.append(((this.sgastdnId == null)?"<null>":this.sgastdnId));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("creaCode");
        sb.append('=');
        sb.append(((this.creaCode == null)?"<null>":this.creaCode));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("sgrsattStspKeySequence");
        sb.append('=');
        sb.append(((this.sgrsattStspKeySequence == null)?"<null>":this.sgrsattStspKeySequence));
        sb.append(',');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("sgastdnTermCodeEff");
        sb.append('=');
        sb.append(((this.sgastdnTermCodeEff == null)?"<null>":this.sgastdnTermCodeEff));
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
        result = ((result* 31)+((this.sgastdnId == null)? 0 :this.sgastdnId.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.creaCode == null)? 0 :this.creaCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.sgrsattStspKeySequence == null)? 0 :this.sgrsattStspKeySequence.hashCode()));
        result = ((result* 31)+((this.attsCode == null)? 0 :this.attsCode.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.sgastdnTermCodeEff == null)? 0 :this.sgastdnTermCodeEff.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest) == false) {
            return false;
        }
        TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest rhs = ((TestScoreAdministrationTypeCodesContactsCohortsAttributes100GetRequest) other);
        return ((((((((((((this.sgastdnId == rhs.sgastdnId)||((this.sgastdnId!= null)&&this.sgastdnId.equals(rhs.sgastdnId)))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.creaCode == rhs.creaCode)||((this.creaCode!= null)&&this.creaCode.equals(rhs.creaCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.sgrsattStspKeySequence == rhs.sgrsattStspKeySequence)||((this.sgrsattStspKeySequence!= null)&&this.sgrsattStspKeySequence.equals(rhs.sgrsattStspKeySequence))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.sgastdnTermCodeEff == rhs.sgastdnTermCodeEff)||((this.sgastdnTermCodeEff!= null)&&this.sgastdnTermCodeEff.equals(rhs.sgastdnTermCodeEff))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
