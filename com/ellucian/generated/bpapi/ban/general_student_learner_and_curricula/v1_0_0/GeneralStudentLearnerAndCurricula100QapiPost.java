
package com.ellucian.generated.bpapi.ban.general_student_learner_and_curricula.v1_0_0;

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
    "stvtermTermCode",
    "termCodeEff",
    "resdCode",
    "scpcCode",
    "ststCode",
    "rateCode",
    "fullPartInd",
    "stypCode",
    "siteCode",
    "blckCode",
    "sessCode",
    "orsnCode",
    "gainCode",
    "caplCode",
    "voedCode",
    "pracCode",
    "trcnCode",
    "edlvCode",
    "egolCode",
    "incmCode",
    "bsklCode",
    "emexCode",
    "gradCreditApprInd",
    "aprnCode",
    "leavFromDate",
    "leavCode",
    "leavToDate",
    "userId",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class GeneralStudentLearnerAndCurricula100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("stvtermTermCode")
    private String stvtermTermCode;
    @JsonProperty("termCodeEff")
    private String termCodeEff;
    @JsonProperty("resdCode")
    private String resdCode;
    @JsonProperty("scpcCode")
    private String scpcCode;
    @JsonProperty("ststCode")
    private String ststCode;
    @JsonProperty("rateCode")
    private String rateCode;
    @JsonProperty("fullPartInd")
    private String fullPartInd;
    @JsonProperty("stypCode")
    private String stypCode;
    @JsonProperty("siteCode")
    private String siteCode;
    @JsonProperty("blckCode")
    private String blckCode;
    @JsonProperty("sessCode")
    private String sessCode;
    @JsonProperty("orsnCode")
    private String orsnCode;
    @JsonProperty("gainCode")
    private String gainCode;
    @JsonProperty("caplCode")
    private String caplCode;
    @JsonProperty("voedCode")
    private String voedCode;
    @JsonProperty("pracCode")
    private String pracCode;
    @JsonProperty("trcnCode")
    private String trcnCode;
    @JsonProperty("edlvCode")
    private String edlvCode;
    @JsonProperty("egolCode")
    private String egolCode;
    @JsonProperty("incmCode")
    private String incmCode;
    @JsonProperty("bsklCode")
    private String bsklCode;
    @JsonProperty("emexCode")
    private String emexCode;
    @JsonProperty("gradCreditApprInd")
    private String gradCreditApprInd;
    @JsonProperty("aprnCode")
    private String aprnCode;
    @JsonProperty("leavFromDate")
    private String leavFromDate;
    @JsonProperty("leavCode")
    private String leavCode;
    @JsonProperty("leavToDate")
    private String leavToDate;
    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_USER_ID")
    private String userId;
    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SOVLFOS_ACTIVITY_DATE")
    private Date activityDate;
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

    public GeneralStudentLearnerAndCurricula100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("stvtermTermCode")
    public String getStvtermTermCode() {
        return stvtermTermCode;
    }

    @JsonProperty("stvtermTermCode")
    public void setStvtermTermCode(String stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withStvtermTermCode(String stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
        return this;
    }

    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
        return this;
    }

    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    @JsonProperty("scpcCode")
    public String getScpcCode() {
        return scpcCode;
    }

    @JsonProperty("scpcCode")
    public void setScpcCode(String scpcCode) {
        this.scpcCode = scpcCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withScpcCode(String scpcCode) {
        this.scpcCode = scpcCode;
        return this;
    }

    @JsonProperty("ststCode")
    public String getStstCode() {
        return ststCode;
    }

    @JsonProperty("ststCode")
    public void setStstCode(String ststCode) {
        this.ststCode = ststCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withStstCode(String ststCode) {
        this.ststCode = ststCode;
        return this;
    }

    @JsonProperty("rateCode")
    public String getRateCode() {
        return rateCode;
    }

    @JsonProperty("rateCode")
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withRateCode(String rateCode) {
        this.rateCode = rateCode;
        return this;
    }

    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    @JsonProperty("siteCode")
    public String getSiteCode() {
        return siteCode;
    }

    @JsonProperty("siteCode")
    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withSiteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    @JsonProperty("blckCode")
    public String getBlckCode() {
        return blckCode;
    }

    @JsonProperty("blckCode")
    public void setBlckCode(String blckCode) {
        this.blckCode = blckCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withBlckCode(String blckCode) {
        this.blckCode = blckCode;
        return this;
    }

    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    @JsonProperty("orsnCode")
    public String getOrsnCode() {
        return orsnCode;
    }

    @JsonProperty("orsnCode")
    public void setOrsnCode(String orsnCode) {
        this.orsnCode = orsnCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withOrsnCode(String orsnCode) {
        this.orsnCode = orsnCode;
        return this;
    }

    @JsonProperty("gainCode")
    public String getGainCode() {
        return gainCode;
    }

    @JsonProperty("gainCode")
    public void setGainCode(String gainCode) {
        this.gainCode = gainCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withGainCode(String gainCode) {
        this.gainCode = gainCode;
        return this;
    }

    @JsonProperty("caplCode")
    public String getCaplCode() {
        return caplCode;
    }

    @JsonProperty("caplCode")
    public void setCaplCode(String caplCode) {
        this.caplCode = caplCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withCaplCode(String caplCode) {
        this.caplCode = caplCode;
        return this;
    }

    @JsonProperty("voedCode")
    public String getVoedCode() {
        return voedCode;
    }

    @JsonProperty("voedCode")
    public void setVoedCode(String voedCode) {
        this.voedCode = voedCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withVoedCode(String voedCode) {
        this.voedCode = voedCode;
        return this;
    }

    @JsonProperty("pracCode")
    public String getPracCode() {
        return pracCode;
    }

    @JsonProperty("pracCode")
    public void setPracCode(String pracCode) {
        this.pracCode = pracCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withPracCode(String pracCode) {
        this.pracCode = pracCode;
        return this;
    }

    @JsonProperty("trcnCode")
    public String getTrcnCode() {
        return trcnCode;
    }

    @JsonProperty("trcnCode")
    public void setTrcnCode(String trcnCode) {
        this.trcnCode = trcnCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withTrcnCode(String trcnCode) {
        this.trcnCode = trcnCode;
        return this;
    }

    @JsonProperty("edlvCode")
    public String getEdlvCode() {
        return edlvCode;
    }

    @JsonProperty("edlvCode")
    public void setEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withEdlvCode(String edlvCode) {
        this.edlvCode = edlvCode;
        return this;
    }

    @JsonProperty("egolCode")
    public String getEgolCode() {
        return egolCode;
    }

    @JsonProperty("egolCode")
    public void setEgolCode(String egolCode) {
        this.egolCode = egolCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withEgolCode(String egolCode) {
        this.egolCode = egolCode;
        return this;
    }

    @JsonProperty("incmCode")
    public String getIncmCode() {
        return incmCode;
    }

    @JsonProperty("incmCode")
    public void setIncmCode(String incmCode) {
        this.incmCode = incmCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withIncmCode(String incmCode) {
        this.incmCode = incmCode;
        return this;
    }

    @JsonProperty("bsklCode")
    public String getBsklCode() {
        return bsklCode;
    }

    @JsonProperty("bsklCode")
    public void setBsklCode(String bsklCode) {
        this.bsklCode = bsklCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withBsklCode(String bsklCode) {
        this.bsklCode = bsklCode;
        return this;
    }

    @JsonProperty("emexCode")
    public String getEmexCode() {
        return emexCode;
    }

    @JsonProperty("emexCode")
    public void setEmexCode(String emexCode) {
        this.emexCode = emexCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withEmexCode(String emexCode) {
        this.emexCode = emexCode;
        return this;
    }

    @JsonProperty("gradCreditApprInd")
    public String getGradCreditApprInd() {
        return gradCreditApprInd;
    }

    @JsonProperty("gradCreditApprInd")
    public void setGradCreditApprInd(String gradCreditApprInd) {
        this.gradCreditApprInd = gradCreditApprInd;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withGradCreditApprInd(String gradCreditApprInd) {
        this.gradCreditApprInd = gradCreditApprInd;
        return this;
    }

    @JsonProperty("aprnCode")
    public String getAprnCode() {
        return aprnCode;
    }

    @JsonProperty("aprnCode")
    public void setAprnCode(String aprnCode) {
        this.aprnCode = aprnCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withAprnCode(String aprnCode) {
        this.aprnCode = aprnCode;
        return this;
    }

    @JsonProperty("leavFromDate")
    public String getLeavFromDate() {
        return leavFromDate;
    }

    @JsonProperty("leavFromDate")
    public void setLeavFromDate(String leavFromDate) {
        this.leavFromDate = leavFromDate;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withLeavFromDate(String leavFromDate) {
        this.leavFromDate = leavFromDate;
        return this;
    }

    @JsonProperty("leavCode")
    public String getLeavCode() {
        return leavCode;
    }

    @JsonProperty("leavCode")
    public void setLeavCode(String leavCode) {
        this.leavCode = leavCode;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withLeavCode(String leavCode) {
        this.leavCode = leavCode;
        return this;
    }

    @JsonProperty("leavToDate")
    public String getLeavToDate() {
        return leavToDate;
    }

    @JsonProperty("leavToDate")
    public void setLeavToDate(String leavToDate) {
        this.leavToDate = leavToDate;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withLeavToDate(String leavToDate) {
        this.leavToDate = leavToDate;
        return this;
    }

    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SOVLFOS_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Created
     * <p>
     * Lineage reference object : SOVLFOS_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public GeneralStudentLearnerAndCurricula100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public GeneralStudentLearnerAndCurricula100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralStudentLearnerAndCurricula100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("stvtermTermCode");
        sb.append('=');
        sb.append(((this.stvtermTermCode == null)?"<null>":this.stvtermTermCode));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("scpcCode");
        sb.append('=');
        sb.append(((this.scpcCode == null)?"<null>":this.scpcCode));
        sb.append(',');
        sb.append("ststCode");
        sb.append('=');
        sb.append(((this.ststCode == null)?"<null>":this.ststCode));
        sb.append(',');
        sb.append("rateCode");
        sb.append('=');
        sb.append(((this.rateCode == null)?"<null>":this.rateCode));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("siteCode");
        sb.append('=');
        sb.append(((this.siteCode == null)?"<null>":this.siteCode));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("orsnCode");
        sb.append('=');
        sb.append(((this.orsnCode == null)?"<null>":this.orsnCode));
        sb.append(',');
        sb.append("gainCode");
        sb.append('=');
        sb.append(((this.gainCode == null)?"<null>":this.gainCode));
        sb.append(',');
        sb.append("caplCode");
        sb.append('=');
        sb.append(((this.caplCode == null)?"<null>":this.caplCode));
        sb.append(',');
        sb.append("voedCode");
        sb.append('=');
        sb.append(((this.voedCode == null)?"<null>":this.voedCode));
        sb.append(',');
        sb.append("pracCode");
        sb.append('=');
        sb.append(((this.pracCode == null)?"<null>":this.pracCode));
        sb.append(',');
        sb.append("trcnCode");
        sb.append('=');
        sb.append(((this.trcnCode == null)?"<null>":this.trcnCode));
        sb.append(',');
        sb.append("edlvCode");
        sb.append('=');
        sb.append(((this.edlvCode == null)?"<null>":this.edlvCode));
        sb.append(',');
        sb.append("egolCode");
        sb.append('=');
        sb.append(((this.egolCode == null)?"<null>":this.egolCode));
        sb.append(',');
        sb.append("incmCode");
        sb.append('=');
        sb.append(((this.incmCode == null)?"<null>":this.incmCode));
        sb.append(',');
        sb.append("bsklCode");
        sb.append('=');
        sb.append(((this.bsklCode == null)?"<null>":this.bsklCode));
        sb.append(',');
        sb.append("emexCode");
        sb.append('=');
        sb.append(((this.emexCode == null)?"<null>":this.emexCode));
        sb.append(',');
        sb.append("gradCreditApprInd");
        sb.append('=');
        sb.append(((this.gradCreditApprInd == null)?"<null>":this.gradCreditApprInd));
        sb.append(',');
        sb.append("aprnCode");
        sb.append('=');
        sb.append(((this.aprnCode == null)?"<null>":this.aprnCode));
        sb.append(',');
        sb.append("leavFromDate");
        sb.append('=');
        sb.append(((this.leavFromDate == null)?"<null>":this.leavFromDate));
        sb.append(',');
        sb.append("leavCode");
        sb.append('=');
        sb.append(((this.leavCode == null)?"<null>":this.leavCode));
        sb.append(',');
        sb.append("leavToDate");
        sb.append('=');
        sb.append(((this.leavToDate == null)?"<null>":this.leavToDate));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.leavCode == null)? 0 :this.leavCode.hashCode()));
        result = ((result* 31)+((this.incmCode == null)? 0 :this.incmCode.hashCode()));
        result = ((result* 31)+((this.edlvCode == null)? 0 :this.edlvCode.hashCode()));
        result = ((result* 31)+((this.rateCode == null)? 0 :this.rateCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.pracCode == null)? 0 :this.pracCode.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.leavToDate == null)? 0 :this.leavToDate.hashCode()));
        result = ((result* 31)+((this.trcnCode == null)? 0 :this.trcnCode.hashCode()));
        result = ((result* 31)+((this.emexCode == null)? 0 :this.emexCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.stvtermTermCode == null)? 0 :this.stvtermTermCode.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.orsnCode == null)? 0 :this.orsnCode.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.siteCode == null)? 0 :this.siteCode.hashCode()));
        result = ((result* 31)+((this.caplCode == null)? 0 :this.caplCode.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.leavFromDate == null)? 0 :this.leavFromDate.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.scpcCode == null)? 0 :this.scpcCode.hashCode()));
        result = ((result* 31)+((this.ststCode == null)? 0 :this.ststCode.hashCode()));
        result = ((result* 31)+((this.gradCreditApprInd == null)? 0 :this.gradCreditApprInd.hashCode()));
        result = ((result* 31)+((this.bsklCode == null)? 0 :this.bsklCode.hashCode()));
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.egolCode == null)? 0 :this.egolCode.hashCode()));
        result = ((result* 31)+((this.aprnCode == null)? 0 :this.aprnCode.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gainCode == null)? 0 :this.gainCode.hashCode()));
        result = ((result* 31)+((this.voedCode == null)? 0 :this.voedCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralStudentLearnerAndCurricula100QapiPost) == false) {
            return false;
        }
        GeneralStudentLearnerAndCurricula100QapiPost rhs = ((GeneralStudentLearnerAndCurricula100QapiPost) other);
        return ((((((((((((((((((((((((((((((((this.leavCode == rhs.leavCode)||((this.leavCode!= null)&&this.leavCode.equals(rhs.leavCode)))&&((this.incmCode == rhs.incmCode)||((this.incmCode!= null)&&this.incmCode.equals(rhs.incmCode))))&&((this.edlvCode == rhs.edlvCode)||((this.edlvCode!= null)&&this.edlvCode.equals(rhs.edlvCode))))&&((this.rateCode == rhs.rateCode)||((this.rateCode!= null)&&this.rateCode.equals(rhs.rateCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.pracCode == rhs.pracCode)||((this.pracCode!= null)&&this.pracCode.equals(rhs.pracCode))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.leavToDate == rhs.leavToDate)||((this.leavToDate!= null)&&this.leavToDate.equals(rhs.leavToDate))))&&((this.trcnCode == rhs.trcnCode)||((this.trcnCode!= null)&&this.trcnCode.equals(rhs.trcnCode))))&&((this.emexCode == rhs.emexCode)||((this.emexCode!= null)&&this.emexCode.equals(rhs.emexCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.orsnCode == rhs.orsnCode)||((this.orsnCode!= null)&&this.orsnCode.equals(rhs.orsnCode))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.siteCode == rhs.siteCode)||((this.siteCode!= null)&&this.siteCode.equals(rhs.siteCode))))&&((this.caplCode == rhs.caplCode)||((this.caplCode!= null)&&this.caplCode.equals(rhs.caplCode))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.leavFromDate == rhs.leavFromDate)||((this.leavFromDate!= null)&&this.leavFromDate.equals(rhs.leavFromDate))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.scpcCode == rhs.scpcCode)||((this.scpcCode!= null)&&this.scpcCode.equals(rhs.scpcCode))))&&((this.ststCode == rhs.ststCode)||((this.ststCode!= null)&&this.ststCode.equals(rhs.ststCode))))&&((this.gradCreditApprInd == rhs.gradCreditApprInd)||((this.gradCreditApprInd!= null)&&this.gradCreditApprInd.equals(rhs.gradCreditApprInd))))&&((this.bsklCode == rhs.bsklCode)||((this.bsklCode!= null)&&this.bsklCode.equals(rhs.bsklCode))))&&((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode))))&&((this.egolCode == rhs.egolCode)||((this.egolCode!= null)&&this.egolCode.equals(rhs.egolCode))))&&((this.aprnCode == rhs.aprnCode)||((this.aprnCode!= null)&&this.aprnCode.equals(rhs.aprnCode))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gainCode == rhs.gainCode)||((this.gainCode!= null)&&this.gainCode.equals(rhs.gainCode))))&&((this.voedCode == rhs.voedCode)||((this.voedCode!= null)&&this.voedCode.equals(rhs.voedCode))));
    }

}
