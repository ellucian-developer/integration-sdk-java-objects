
package com.ellucian.generated.bpapi.ban.student_cohort.v1_0_0;

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
    "termCodeTo",
    "chrtCode",
    "termCodeEff",
    "creaCode",
    "stspKeySequence",
    "bannerId",
    "activeInd",
    "sgrchrtTermCodeEff",
    "userId"
})
@Generated("jsonschema2pojo")
public class StudentCohort100GetRequest {

    /**
     * To Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termCodeTo")
    private String termCodeTo;
    /**
     * Cohort Code
     * <p>
     * Lineage reference object : chrtCode, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    @JsonPropertyDescription("Lineage reference object : chrtCode, Lookup lineage reference object : stvchrt")
    private String chrtCode;
    /**
     * Term
     * <p>
     * Lineage reference object : termCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : termCodeEff, Lookup lineage reference object : stvterm")
    private String termCodeEff;
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
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp")
    private String stspKeySequence;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("bannerId")
    private String bannerId;
    /**
     * Lineage reference object : SGRCHRT_ACTIVE_IND
     * 
     */
    @JsonProperty("activeInd")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_ACTIVE_IND")
    private String activeInd;
    /**
     * From Term
     * <p>
     * Lineage reference object : SGRCHRT_TERM_CODE_EFF
     * 
     */
    @JsonProperty("sgrchrtTermCodeEff")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_TERM_CODE_EFF")
    private String sgrchrtTermCodeEff;
    /**
     * Lineage reference object : SGRCHRT_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SGRCHRT_USER_ID")
    private String userId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * To Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termCodeTo")
    public String getTermCodeTo() {
        return termCodeTo;
    }

    /**
     * To Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termCodeTo")
    public void setTermCodeTo(String termCodeTo) {
        this.termCodeTo = termCodeTo;
    }

    public StudentCohort100GetRequest withTermCodeTo(String termCodeTo) {
        this.termCodeTo = termCodeTo;
        return this;
    }

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : chrtCode, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public String getChrtCode() {
        return chrtCode;
    }

    /**
     * Cohort Code
     * <p>
     * Lineage reference object : chrtCode, Lookup lineage reference object : stvchrt
     * 
     */
    @JsonProperty("chrtCode")
    public void setChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
    }

    public StudentCohort100GetRequest withChrtCode(String chrtCode) {
        this.chrtCode = chrtCode;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : termCodeEff, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public StudentCohort100GetRequest withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
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

    public StudentCohort100GetRequest withCreaCode(String creaCode) {
        this.creaCode = creaCode;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    public String getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SGRCHRT_STSP_KEY_SEQUENCE, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(String stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public StudentCohort100GetRequest withStspKeySequence(String stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("bannerId")
    public String getBannerId() {
        return bannerId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("bannerId")
    public void setBannerId(String bannerId) {
        this.bannerId = bannerId;
    }

    public StudentCohort100GetRequest withBannerId(String bannerId) {
        this.bannerId = bannerId;
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

    public StudentCohort100GetRequest withActiveInd(String activeInd) {
        this.activeInd = activeInd;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : SGRCHRT_TERM_CODE_EFF
     * 
     */
    @JsonProperty("sgrchrtTermCodeEff")
    public String getSgrchrtTermCodeEff() {
        return sgrchrtTermCodeEff;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : SGRCHRT_TERM_CODE_EFF
     * 
     */
    @JsonProperty("sgrchrtTermCodeEff")
    public void setSgrchrtTermCodeEff(String sgrchrtTermCodeEff) {
        this.sgrchrtTermCodeEff = sgrchrtTermCodeEff;
    }

    public StudentCohort100GetRequest withSgrchrtTermCodeEff(String sgrchrtTermCodeEff) {
        this.sgrchrtTermCodeEff = sgrchrtTermCodeEff;
        return this;
    }

    /**
     * Lineage reference object : SGRCHRT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SGRCHRT_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public StudentCohort100GetRequest withUserId(String userId) {
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

    public StudentCohort100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentCohort100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("termCodeTo");
        sb.append('=');
        sb.append(((this.termCodeTo == null)?"<null>":this.termCodeTo));
        sb.append(',');
        sb.append("chrtCode");
        sb.append('=');
        sb.append(((this.chrtCode == null)?"<null>":this.chrtCode));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("creaCode");
        sb.append('=');
        sb.append(((this.creaCode == null)?"<null>":this.creaCode));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("bannerId");
        sb.append('=');
        sb.append(((this.bannerId == null)?"<null>":this.bannerId));
        sb.append(',');
        sb.append("activeInd");
        sb.append('=');
        sb.append(((this.activeInd == null)?"<null>":this.activeInd));
        sb.append(',');
        sb.append("sgrchrtTermCodeEff");
        sb.append('=');
        sb.append(((this.sgrchrtTermCodeEff == null)?"<null>":this.sgrchrtTermCodeEff));
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
        result = ((result* 31)+((this.termCodeTo == null)? 0 :this.termCodeTo.hashCode()));
        result = ((result* 31)+((this.chrtCode == null)? 0 :this.chrtCode.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.creaCode == null)? 0 :this.creaCode.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.bannerId == null)? 0 :this.bannerId.hashCode()));
        result = ((result* 31)+((this.activeInd == null)? 0 :this.activeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sgrchrtTermCodeEff == null)? 0 :this.sgrchrtTermCodeEff.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentCohort100GetRequest) == false) {
            return false;
        }
        StudentCohort100GetRequest rhs = ((StudentCohort100GetRequest) other);
        return (((((((((((this.termCodeTo == rhs.termCodeTo)||((this.termCodeTo!= null)&&this.termCodeTo.equals(rhs.termCodeTo)))&&((this.chrtCode == rhs.chrtCode)||((this.chrtCode!= null)&&this.chrtCode.equals(rhs.chrtCode))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.creaCode == rhs.creaCode)||((this.creaCode!= null)&&this.creaCode.equals(rhs.creaCode))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.bannerId == rhs.bannerId)||((this.bannerId!= null)&&this.bannerId.equals(rhs.bannerId))))&&((this.activeInd == rhs.activeInd)||((this.activeInd!= null)&&this.activeInd.equals(rhs.activeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sgrchrtTermCodeEff == rhs.sgrchrtTermCodeEff)||((this.sgrchrtTermCodeEff!= null)&&this.sgrchrtTermCodeEff.equals(rhs.sgrchrtTermCodeEff))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))));
    }

}
