
package com.ellucian.generated.bpapi.ban.general_information_examinations.v1_0_0;

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
    "examPercent",
    "examCode",
    "examDate",
    "passInd",
    "examDesc",
    "examScore"
})
@Generated("jsonschema2pojo")
public class GeneralInformationExaminations100GetResponse {

    /**
     * Percent
     * <p>
     * Lineage reference object : PPREXAM_EXAM_PERCENT
     * 
     */
    @JsonProperty("examPercent")
    @JsonPropertyDescription("Lineage reference object : PPREXAM_EXAM_PERCENT")
    private Double examPercent;
    /**
     * Examination
     * <p>
     * Lineage reference object : PPREXAM_EXAM_CODE
     * (Required)
     * 
     */
    @JsonProperty("examCode")
    @JsonPropertyDescription("Lineage reference object : PPREXAM_EXAM_CODE")
    private String examCode;
    /**
     * Examination Date
     * <p>
     * Lineage reference object : PPREXAM_EXAM_DATE
     * (Required)
     * 
     */
    @JsonProperty("examDate")
    @JsonPropertyDescription("Lineage reference object : PPREXAM_EXAM_DATE")
    private Date examDate;
    /**
     * Pass
     * <p>
     * Lineage reference object : PPREXAM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    @JsonPropertyDescription("Lineage reference object : PPREXAM_PASS_IND")
    private String passInd;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("examDesc")
    private String examDesc;
    /**
     * Score
     * <p>
     * Lineage reference object : PPREXAM_EXAM_SCORE
     * 
     */
    @JsonProperty("examScore")
    @JsonPropertyDescription("Lineage reference object : PPREXAM_EXAM_SCORE")
    private Double examScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Percent
     * <p>
     * Lineage reference object : PPREXAM_EXAM_PERCENT
     * 
     */
    @JsonProperty("examPercent")
    public Double getExamPercent() {
        return examPercent;
    }

    /**
     * Percent
     * <p>
     * Lineage reference object : PPREXAM_EXAM_PERCENT
     * 
     */
    @JsonProperty("examPercent")
    public void setExamPercent(Double examPercent) {
        this.examPercent = examPercent;
    }

    public GeneralInformationExaminations100GetResponse withExamPercent(Double examPercent) {
        this.examPercent = examPercent;
        return this;
    }

    /**
     * Examination
     * <p>
     * Lineage reference object : PPREXAM_EXAM_CODE
     * (Required)
     * 
     */
    @JsonProperty("examCode")
    public String getExamCode() {
        return examCode;
    }

    /**
     * Examination
     * <p>
     * Lineage reference object : PPREXAM_EXAM_CODE
     * (Required)
     * 
     */
    @JsonProperty("examCode")
    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public GeneralInformationExaminations100GetResponse withExamCode(String examCode) {
        this.examCode = examCode;
        return this;
    }

    /**
     * Examination Date
     * <p>
     * Lineage reference object : PPREXAM_EXAM_DATE
     * (Required)
     * 
     */
    @JsonProperty("examDate")
    public Date getExamDate() {
        return examDate;
    }

    /**
     * Examination Date
     * <p>
     * Lineage reference object : PPREXAM_EXAM_DATE
     * (Required)
     * 
     */
    @JsonProperty("examDate")
    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public GeneralInformationExaminations100GetResponse withExamDate(Date examDate) {
        this.examDate = examDate;
        return this;
    }

    /**
     * Pass
     * <p>
     * Lineage reference object : PPREXAM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    public String getPassInd() {
        return passInd;
    }

    /**
     * Pass
     * <p>
     * Lineage reference object : PPREXAM_PASS_IND
     * 
     */
    @JsonProperty("passInd")
    public void setPassInd(String passInd) {
        this.passInd = passInd;
    }

    public GeneralInformationExaminations100GetResponse withPassInd(String passInd) {
        this.passInd = passInd;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("examDesc")
    public String getExamDesc() {
        return examDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("examDesc")
    public void setExamDesc(String examDesc) {
        this.examDesc = examDesc;
    }

    public GeneralInformationExaminations100GetResponse withExamDesc(String examDesc) {
        this.examDesc = examDesc;
        return this;
    }

    /**
     * Score
     * <p>
     * Lineage reference object : PPREXAM_EXAM_SCORE
     * 
     */
    @JsonProperty("examScore")
    public Double getExamScore() {
        return examScore;
    }

    /**
     * Score
     * <p>
     * Lineage reference object : PPREXAM_EXAM_SCORE
     * 
     */
    @JsonProperty("examScore")
    public void setExamScore(Double examScore) {
        this.examScore = examScore;
    }

    public GeneralInformationExaminations100GetResponse withExamScore(Double examScore) {
        this.examScore = examScore;
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

    public GeneralInformationExaminations100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralInformationExaminations100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("examPercent");
        sb.append('=');
        sb.append(((this.examPercent == null)?"<null>":this.examPercent));
        sb.append(',');
        sb.append("examCode");
        sb.append('=');
        sb.append(((this.examCode == null)?"<null>":this.examCode));
        sb.append(',');
        sb.append("examDate");
        sb.append('=');
        sb.append(((this.examDate == null)?"<null>":this.examDate));
        sb.append(',');
        sb.append("passInd");
        sb.append('=');
        sb.append(((this.passInd == null)?"<null>":this.passInd));
        sb.append(',');
        sb.append("examDesc");
        sb.append('=');
        sb.append(((this.examDesc == null)?"<null>":this.examDesc));
        sb.append(',');
        sb.append("examScore");
        sb.append('=');
        sb.append(((this.examScore == null)?"<null>":this.examScore));
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
        result = ((result* 31)+((this.examPercent == null)? 0 :this.examPercent.hashCode()));
        result = ((result* 31)+((this.examCode == null)? 0 :this.examCode.hashCode()));
        result = ((result* 31)+((this.examDate == null)? 0 :this.examDate.hashCode()));
        result = ((result* 31)+((this.passInd == null)? 0 :this.passInd.hashCode()));
        result = ((result* 31)+((this.examDesc == null)? 0 :this.examDesc.hashCode()));
        result = ((result* 31)+((this.examScore == null)? 0 :this.examScore.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralInformationExaminations100GetResponse) == false) {
            return false;
        }
        GeneralInformationExaminations100GetResponse rhs = ((GeneralInformationExaminations100GetResponse) other);
        return ((((((((this.examPercent == rhs.examPercent)||((this.examPercent!= null)&&this.examPercent.equals(rhs.examPercent)))&&((this.examCode == rhs.examCode)||((this.examCode!= null)&&this.examCode.equals(rhs.examCode))))&&((this.examDate == rhs.examDate)||((this.examDate!= null)&&this.examDate.equals(rhs.examDate))))&&((this.passInd == rhs.passInd)||((this.passInd!= null)&&this.passInd.equals(rhs.passInd))))&&((this.examDesc == rhs.examDesc)||((this.examDesc!= null)&&this.examDesc.equals(rhs.examDesc))))&&((this.examScore == rhs.examScore)||((this.examScore!= null)&&this.examScore.equals(rhs.examScore))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
