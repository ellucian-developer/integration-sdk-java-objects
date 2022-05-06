
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
    "sgastdnTermCodeEff",
    "chrtCode",
    "activeInd",
    "stspKeySequence",
    "creaCode",
    "userId",
    "activityDate",
    "attsCode",
    "sgrsattStspKeySequence"
})
@Generated("jsonschema2pojo")
public class TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost {

    @JsonProperty("sgastdnId")
    private String sgastdnId;
    @JsonProperty("sgastdnTermCodeEff")
    private String sgastdnTermCodeEff;
    @JsonProperty("chrtCode")
    private String chrtCode;
    @JsonProperty("activeInd")
    private String activeInd;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRSATT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SGRSATT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp")
    private Double stspKeySequence;
    @JsonProperty("creaCode")
    private String creaCode;
    /**
     * Lineage reference object : SGRSATT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SGRSATT_USER_ID")
    private String userId;
    /**
     * Lineage reference object : SGRSATT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SGRSATT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Attribute Code
     * <p>
     * Lineage reference object : SGRSATT_ATTS_CODE, Lookup lineage reference object : stvatts
     * 
     */
    @JsonProperty("attsCode")
    @JsonPropertyDescription("Lineage reference object : SGRSATT_ATTS_CODE, Lookup lineage reference object : stvatts")
    private String attsCode;
    @JsonProperty("sgrsattStspKeySequence")
    private String sgrsattStspKeySequence;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sgastdnId")
    public String getSgastdnId() {
        return sgastdnId;
    }

    @JsonProperty("sgastdnId")
    public void setSgastdnId(String sgastdnId) {
        this.sgastdnId = sgastdnId;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withSgastdnId(String sgastdnId) {
        this.sgastdnId = sgastdnId;
        return this;
    }

    @JsonProperty("sgastdnTermCodeEff")
    public String getSgastdnTermCodeEff() {
        return sgastdnTermCodeEff;
    }

    @JsonProperty("sgastdnTermCodeEff")
    public void setSgastdnTermCodeEff(String sgastdnTermCodeEff) {
        this.sgastdnTermCodeEff = sgastdnTermCodeEff;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withSgastdnTermCodeEff(String sgastdnTermCodeEff) {
        this.sgastdnTermCodeEff = sgastdnTermCodeEff;
        return this;
    }

    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    @JsonProperty("activeInd")
    public String getActiveInd() {
        return activeInd;
    }

    @JsonProperty("activeInd")
    public void setActiveInd(String activeInd) {
        this.activeInd = activeInd;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRSATT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRSATT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    @JsonProperty("creaCode")
    public String getCreaCode() {
        return creaCode;
    }

    @JsonProperty("creaCode")
    public void setCreaCode(String creaCode) {
        this.creaCode = creaCode;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withCreaCode(String creaCode) {
        this.creaCode = creaCode;
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

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withUserId(String userId) {
        this.userId = userId;
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

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Attribute Code
     * <p>
     * Lineage reference object : SGRSATT_ATTS_CODE, Lookup lineage reference object : stvatts
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
     * 
     */
    @JsonProperty("attsCode")
    public void setAttsCode(String attsCode) {
        this.attsCode = attsCode;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withAttsCode(String attsCode) {
        this.attsCode = attsCode;
        return this;
    }

    @JsonProperty("sgrsattStspKeySequence")
    public String getSgrsattStspKeySequence() {
        return sgrsattStspKeySequence;
    }

    @JsonProperty("sgrsattStspKeySequence")
    public void setSgrsattStspKeySequence(String sgrsattStspKeySequence) {
        this.sgrsattStspKeySequence = sgrsattStspKeySequence;
    }

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withSgrsattStspKeySequence(String sgrsattStspKeySequence) {
        this.sgrsattStspKeySequence = sgrsattStspKeySequence;
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

    public TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgastdnId");
        sb.append('=');
        sb.append(((this.sgastdnId == null)?"<null>":this.sgastdnId));
        sb.append(',');
        sb.append("sgastdnTermCodeEff");
        sb.append('=');
        sb.append(((this.sgastdnTermCodeEff == null)?"<null>":this.sgastdnTermCodeEff));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("creaCode");
        sb.append('=');
        sb.append(((this.creaCode == null)?"<null>":this.creaCode));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("attsCode");
        sb.append('=');
        sb.append(((this.attsCode == null)?"<null>":this.attsCode));
        sb.append(',');
        sb.append("sgrsattStspKeySequence");
        sb.append('=');
        sb.append(((this.sgrsattStspKeySequence == null)?"<null>":this.sgrsattStspKeySequence));
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
        if ((other instanceof TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost) == false) {
            return false;
        }
        TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost rhs = ((TestScoreAdministrationTypeCodesContactsCohortsAttributes100QapiPost) other);
        return ((((((((((((this.sgastdnId == rhs.sgastdnId)||((this.sgastdnId!= null)&&this.sgastdnId.equals(rhs.sgastdnId)))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.creaCode == rhs.creaCode)||((this.creaCode!= null)&&this.creaCode.equals(rhs.creaCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.sgrsattStspKeySequence == rhs.sgrsattStspKeySequence)||((this.sgrsattStspKeySequence!= null)&&this.sgrsattStspKeySequence.equals(rhs.sgrsattStspKeySequence))))&&((this.attsCode == rhs.attsCode)||((this.attsCode!= null)&&this.attsCode.equals(rhs.attsCode))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.sgastdnTermCodeEff == rhs.sgastdnTermCodeEff)||((this.sgastdnTermCodeEff!= null)&&this.sgastdnTermCodeEff.equals(rhs.sgastdnTermCodeEff))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
