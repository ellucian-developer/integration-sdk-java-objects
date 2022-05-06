
package com.ellucian.generated.bpapi.ban.contract_person_authorization.v1_0_0;

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
    "studypathName",
    "tbbcstuStudentContRollInd",
    "tbbcstuAuthInd",
    "tbbcstuStspKeySequence",
    "tbbcstuDelInd",
    "tbbcstuMaxStudentAmount",
    "additionalText2",
    "stuName2",
    "tbbcstuActivityDate",
    "tbbcstuTermCodeExpiration",
    "stuId2",
    "tbbcstuAuthNumber",
    "tbbcstuSponsorRefNumber",
    "tbbcstuContractPriority"
})
@Generated("jsonschema2pojo")
public class Tbbcstu2 {

    @JsonProperty("studypathName")
    private String studypathName;
    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("tbbcstuStudentContRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND")
    private String tbbcstuStudentContRollInd;
    /**
     * Authorize
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("tbbcstuAuthInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_AUTH_IND")
    private String tbbcstuAuthInd;
    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("tbbcstuStspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE")
    private Double tbbcstuStspKeySequence;
    /**
     * Delete
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("tbbcstuDelInd")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_DEL_IND")
    private String tbbcstuDelInd;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("tbbcstuMaxStudentAmount")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT")
    private Double tbbcstuMaxStudentAmount;
    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("additionalText2")
    private String additionalText2;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("stuName2")
    private String stuName2;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBCSTU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("tbbcstuActivityDate")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_ACTIVITY_DATE")
    private Date tbbcstuActivityDate;
    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("tbbcstuTermCodeExpiration")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm")
    private String tbbcstuTermCodeExpiration;
    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId2")
    private String stuId2;
    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("tbbcstuAuthNumber")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_AUTH_NUMBER")
    private String tbbcstuAuthNumber;
    /**
     * Sponsor Reference Number
     * <p>
     * Lineage reference object : TBBCSTU_SPONSOR_REF_NUMBER
     * 
     */
    @JsonProperty("tbbcstuSponsorRefNumber")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_SPONSOR_REF_NUMBER")
    private String tbbcstuSponsorRefNumber;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("tbbcstuContractPriority")
    @JsonPropertyDescription("Lineage reference object : TBBCSTU_CONTRACT_PRIORITY")
    private Double tbbcstuContractPriority;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("studypathName")
    public String getStudypathName() {
        return studypathName;
    }

    @JsonProperty("studypathName")
    public void setStudypathName(String studypathName) {
        this.studypathName = studypathName;
    }

    public Tbbcstu2 withStudypathName(String studypathName) {
        this.studypathName = studypathName;
        return this;
    }

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("tbbcstuStudentContRollInd")
    public String getTbbcstuStudentContRollInd() {
        return tbbcstuStudentContRollInd;
    }

    /**
     * Lineage reference object : TBBCSTU_STUDENT_CONT_ROLL_IND
     * 
     */
    @JsonProperty("tbbcstuStudentContRollInd")
    public void setTbbcstuStudentContRollInd(String tbbcstuStudentContRollInd) {
        this.tbbcstuStudentContRollInd = tbbcstuStudentContRollInd;
    }

    public Tbbcstu2 withTbbcstuStudentContRollInd(String tbbcstuStudentContRollInd) {
        this.tbbcstuStudentContRollInd = tbbcstuStudentContRollInd;
        return this;
    }

    /**
     * Authorize
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("tbbcstuAuthInd")
    public String getTbbcstuAuthInd() {
        return tbbcstuAuthInd;
    }

    /**
     * Authorize
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_IND
     * 
     */
    @JsonProperty("tbbcstuAuthInd")
    public void setTbbcstuAuthInd(String tbbcstuAuthInd) {
        this.tbbcstuAuthInd = tbbcstuAuthInd;
    }

    public Tbbcstu2 withTbbcstuAuthInd(String tbbcstuAuthInd) {
        this.tbbcstuAuthInd = tbbcstuAuthInd;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("tbbcstuStspKeySequence")
    public Double getTbbcstuStspKeySequence() {
        return tbbcstuStspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBCSTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("tbbcstuStspKeySequence")
    public void setTbbcstuStspKeySequence(Double tbbcstuStspKeySequence) {
        this.tbbcstuStspKeySequence = tbbcstuStspKeySequence;
    }

    public Tbbcstu2 withTbbcstuStspKeySequence(Double tbbcstuStspKeySequence) {
        this.tbbcstuStspKeySequence = tbbcstuStspKeySequence;
        return this;
    }

    /**
     * Delete
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("tbbcstuDelInd")
    public String getTbbcstuDelInd() {
        return tbbcstuDelInd;
    }

    /**
     * Delete
     * <p>
     * Lineage reference object : TBBCSTU_DEL_IND
     * 
     */
    @JsonProperty("tbbcstuDelInd")
    public void setTbbcstuDelInd(String tbbcstuDelInd) {
        this.tbbcstuDelInd = tbbcstuDelInd;
    }

    public Tbbcstu2 withTbbcstuDelInd(String tbbcstuDelInd) {
        this.tbbcstuDelInd = tbbcstuDelInd;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("tbbcstuMaxStudentAmount")
    public Double getTbbcstuMaxStudentAmount() {
        return tbbcstuMaxStudentAmount;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBCSTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("tbbcstuMaxStudentAmount")
    public void setTbbcstuMaxStudentAmount(Double tbbcstuMaxStudentAmount) {
        this.tbbcstuMaxStudentAmount = tbbcstuMaxStudentAmount;
    }

    public Tbbcstu2 withTbbcstuMaxStudentAmount(Double tbbcstuMaxStudentAmount) {
        this.tbbcstuMaxStudentAmount = tbbcstuMaxStudentAmount;
        return this;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("additionalText2")
    public String getAdditionalText2() {
        return additionalText2;
    }

    /**
     * Text
     * <p>
     * 
     * 
     */
    @JsonProperty("additionalText2")
    public void setAdditionalText2(String additionalText2) {
        this.additionalText2 = additionalText2;
    }

    public Tbbcstu2 withAdditionalText2(String additionalText2) {
        this.additionalText2 = additionalText2;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("stuName2")
    public String getStuName2() {
        return stuName2;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("stuName2")
    public void setStuName2(String stuName2) {
        this.stuName2 = stuName2;
    }

    public Tbbcstu2 withStuName2(String stuName2) {
        this.stuName2 = stuName2;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBCSTU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("tbbcstuActivityDate")
    public Date getTbbcstuActivityDate() {
        return tbbcstuActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBCSTU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("tbbcstuActivityDate")
    public void setTbbcstuActivityDate(Date tbbcstuActivityDate) {
        this.tbbcstuActivityDate = tbbcstuActivityDate;
    }

    public Tbbcstu2 withTbbcstuActivityDate(Date tbbcstuActivityDate) {
        this.tbbcstuActivityDate = tbbcstuActivityDate;
        return this;
    }

    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("tbbcstuTermCodeExpiration")
    public String getTbbcstuTermCodeExpiration() {
        return tbbcstuTermCodeExpiration;
    }

    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBCSTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("tbbcstuTermCodeExpiration")
    public void setTbbcstuTermCodeExpiration(String tbbcstuTermCodeExpiration) {
        this.tbbcstuTermCodeExpiration = tbbcstuTermCodeExpiration;
    }

    public Tbbcstu2 withTbbcstuTermCodeExpiration(String tbbcstuTermCodeExpiration) {
        this.tbbcstuTermCodeExpiration = tbbcstuTermCodeExpiration;
        return this;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId2")
    public String getStuId2() {
        return stuId2;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId2")
    public void setStuId2(String stuId2) {
        this.stuId2 = stuId2;
    }

    public Tbbcstu2 withStuId2(String stuId2) {
        this.stuId2 = stuId2;
        return this;
    }

    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("tbbcstuAuthNumber")
    public String getTbbcstuAuthNumber() {
        return tbbcstuAuthNumber;
    }

    /**
     * Authorization Number
     * <p>
     * Lineage reference object : TBBCSTU_AUTH_NUMBER
     * 
     */
    @JsonProperty("tbbcstuAuthNumber")
    public void setTbbcstuAuthNumber(String tbbcstuAuthNumber) {
        this.tbbcstuAuthNumber = tbbcstuAuthNumber;
    }

    public Tbbcstu2 withTbbcstuAuthNumber(String tbbcstuAuthNumber) {
        this.tbbcstuAuthNumber = tbbcstuAuthNumber;
        return this;
    }

    /**
     * Sponsor Reference Number
     * <p>
     * Lineage reference object : TBBCSTU_SPONSOR_REF_NUMBER
     * 
     */
    @JsonProperty("tbbcstuSponsorRefNumber")
    public String getTbbcstuSponsorRefNumber() {
        return tbbcstuSponsorRefNumber;
    }

    /**
     * Sponsor Reference Number
     * <p>
     * Lineage reference object : TBBCSTU_SPONSOR_REF_NUMBER
     * 
     */
    @JsonProperty("tbbcstuSponsorRefNumber")
    public void setTbbcstuSponsorRefNumber(String tbbcstuSponsorRefNumber) {
        this.tbbcstuSponsorRefNumber = tbbcstuSponsorRefNumber;
    }

    public Tbbcstu2 withTbbcstuSponsorRefNumber(String tbbcstuSponsorRefNumber) {
        this.tbbcstuSponsorRefNumber = tbbcstuSponsorRefNumber;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("tbbcstuContractPriority")
    public Double getTbbcstuContractPriority() {
        return tbbcstuContractPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBCSTU_CONTRACT_PRIORITY
     * (Required)
     * 
     */
    @JsonProperty("tbbcstuContractPriority")
    public void setTbbcstuContractPriority(Double tbbcstuContractPriority) {
        this.tbbcstuContractPriority = tbbcstuContractPriority;
    }

    public Tbbcstu2 withTbbcstuContractPriority(Double tbbcstuContractPriority) {
        this.tbbcstuContractPriority = tbbcstuContractPriority;
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

    public Tbbcstu2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbbcstu2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("studypathName");
        sb.append('=');
        sb.append(((this.studypathName == null)?"<null>":this.studypathName));
        sb.append(',');
        sb.append("tbbcstuStudentContRollInd");
        sb.append('=');
        sb.append(((this.tbbcstuStudentContRollInd == null)?"<null>":this.tbbcstuStudentContRollInd));
        sb.append(',');
        sb.append("tbbcstuAuthInd");
        sb.append('=');
        sb.append(((this.tbbcstuAuthInd == null)?"<null>":this.tbbcstuAuthInd));
        sb.append(',');
        sb.append("tbbcstuStspKeySequence");
        sb.append('=');
        sb.append(((this.tbbcstuStspKeySequence == null)?"<null>":this.tbbcstuStspKeySequence));
        sb.append(',');
        sb.append("tbbcstuDelInd");
        sb.append('=');
        sb.append(((this.tbbcstuDelInd == null)?"<null>":this.tbbcstuDelInd));
        sb.append(',');
        sb.append("tbbcstuMaxStudentAmount");
        sb.append('=');
        sb.append(((this.tbbcstuMaxStudentAmount == null)?"<null>":this.tbbcstuMaxStudentAmount));
        sb.append(',');
        sb.append("additionalText2");
        sb.append('=');
        sb.append(((this.additionalText2 == null)?"<null>":this.additionalText2));
        sb.append(',');
        sb.append("stuName2");
        sb.append('=');
        sb.append(((this.stuName2 == null)?"<null>":this.stuName2));
        sb.append(',');
        sb.append("tbbcstuActivityDate");
        sb.append('=');
        sb.append(((this.tbbcstuActivityDate == null)?"<null>":this.tbbcstuActivityDate));
        sb.append(',');
        sb.append("tbbcstuTermCodeExpiration");
        sb.append('=');
        sb.append(((this.tbbcstuTermCodeExpiration == null)?"<null>":this.tbbcstuTermCodeExpiration));
        sb.append(',');
        sb.append("stuId2");
        sb.append('=');
        sb.append(((this.stuId2 == null)?"<null>":this.stuId2));
        sb.append(',');
        sb.append("tbbcstuAuthNumber");
        sb.append('=');
        sb.append(((this.tbbcstuAuthNumber == null)?"<null>":this.tbbcstuAuthNumber));
        sb.append(',');
        sb.append("tbbcstuSponsorRefNumber");
        sb.append('=');
        sb.append(((this.tbbcstuSponsorRefNumber == null)?"<null>":this.tbbcstuSponsorRefNumber));
        sb.append(',');
        sb.append("tbbcstuContractPriority");
        sb.append('=');
        sb.append(((this.tbbcstuContractPriority == null)?"<null>":this.tbbcstuContractPriority));
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
        result = ((result* 31)+((this.studypathName == null)? 0 :this.studypathName.hashCode()));
        result = ((result* 31)+((this.tbbcstuStudentContRollInd == null)? 0 :this.tbbcstuStudentContRollInd.hashCode()));
        result = ((result* 31)+((this.tbbcstuAuthInd == null)? 0 :this.tbbcstuAuthInd.hashCode()));
        result = ((result* 31)+((this.tbbcstuStspKeySequence == null)? 0 :this.tbbcstuStspKeySequence.hashCode()));
        result = ((result* 31)+((this.tbbcstuDelInd == null)? 0 :this.tbbcstuDelInd.hashCode()));
        result = ((result* 31)+((this.tbbcstuMaxStudentAmount == null)? 0 :this.tbbcstuMaxStudentAmount.hashCode()));
        result = ((result* 31)+((this.additionalText2 == null)? 0 :this.additionalText2 .hashCode()));
        result = ((result* 31)+((this.stuName2 == null)? 0 :this.stuName2 .hashCode()));
        result = ((result* 31)+((this.tbbcstuActivityDate == null)? 0 :this.tbbcstuActivityDate.hashCode()));
        result = ((result* 31)+((this.tbbcstuTermCodeExpiration == null)? 0 :this.tbbcstuTermCodeExpiration.hashCode()));
        result = ((result* 31)+((this.stuId2 == null)? 0 :this.stuId2 .hashCode()));
        result = ((result* 31)+((this.tbbcstuAuthNumber == null)? 0 :this.tbbcstuAuthNumber.hashCode()));
        result = ((result* 31)+((this.tbbcstuSponsorRefNumber == null)? 0 :this.tbbcstuSponsorRefNumber.hashCode()));
        result = ((result* 31)+((this.tbbcstuContractPriority == null)? 0 :this.tbbcstuContractPriority.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbbcstu2) == false) {
            return false;
        }
        Tbbcstu2 rhs = ((Tbbcstu2) other);
        return ((((((((((((((((this.studypathName == rhs.studypathName)||((this.studypathName!= null)&&this.studypathName.equals(rhs.studypathName)))&&((this.tbbcstuStudentContRollInd == rhs.tbbcstuStudentContRollInd)||((this.tbbcstuStudentContRollInd!= null)&&this.tbbcstuStudentContRollInd.equals(rhs.tbbcstuStudentContRollInd))))&&((this.tbbcstuAuthInd == rhs.tbbcstuAuthInd)||((this.tbbcstuAuthInd!= null)&&this.tbbcstuAuthInd.equals(rhs.tbbcstuAuthInd))))&&((this.tbbcstuStspKeySequence == rhs.tbbcstuStspKeySequence)||((this.tbbcstuStspKeySequence!= null)&&this.tbbcstuStspKeySequence.equals(rhs.tbbcstuStspKeySequence))))&&((this.tbbcstuDelInd == rhs.tbbcstuDelInd)||((this.tbbcstuDelInd!= null)&&this.tbbcstuDelInd.equals(rhs.tbbcstuDelInd))))&&((this.tbbcstuMaxStudentAmount == rhs.tbbcstuMaxStudentAmount)||((this.tbbcstuMaxStudentAmount!= null)&&this.tbbcstuMaxStudentAmount.equals(rhs.tbbcstuMaxStudentAmount))))&&((this.additionalText2 == rhs.additionalText2)||((this.additionalText2 != null)&&this.additionalText2 .equals(rhs.additionalText2))))&&((this.stuName2 == rhs.stuName2)||((this.stuName2 != null)&&this.stuName2 .equals(rhs.stuName2))))&&((this.tbbcstuActivityDate == rhs.tbbcstuActivityDate)||((this.tbbcstuActivityDate!= null)&&this.tbbcstuActivityDate.equals(rhs.tbbcstuActivityDate))))&&((this.tbbcstuTermCodeExpiration == rhs.tbbcstuTermCodeExpiration)||((this.tbbcstuTermCodeExpiration!= null)&&this.tbbcstuTermCodeExpiration.equals(rhs.tbbcstuTermCodeExpiration))))&&((this.stuId2 == rhs.stuId2)||((this.stuId2 != null)&&this.stuId2 .equals(rhs.stuId2))))&&((this.tbbcstuAuthNumber == rhs.tbbcstuAuthNumber)||((this.tbbcstuAuthNumber!= null)&&this.tbbcstuAuthNumber.equals(rhs.tbbcstuAuthNumber))))&&((this.tbbcstuSponsorRefNumber == rhs.tbbcstuSponsorRefNumber)||((this.tbbcstuSponsorRefNumber!= null)&&this.tbbcstuSponsorRefNumber.equals(rhs.tbbcstuSponsorRefNumber))))&&((this.tbbcstuContractPriority == rhs.tbbcstuContractPriority)||((this.tbbcstuContractPriority!= null)&&this.tbbcstuContractPriority.equals(rhs.tbbcstuContractPriority))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}