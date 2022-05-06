
package com.ellucian.generated.bpapi.ban.exemption_authorization_person_authorization.v1_0_0;

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
    "exemptionCode",
    "keyblocTermCode",
    "desc",
    "delInd",
    "stuId",
    "stuName",
    "studentExptRollInd",
    "termCodeExpiration",
    "exemptionPriority",
    "maxStudentAmount",
    "stspKeySequence",
    "studypathName",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class ExemptionAuthorizationPersonAuthorization100QapiPost {

    @JsonProperty("exemptionCode")
    private String exemptionCode;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    @JsonProperty("desc")
    private String desc;
    /**
     * Delete
     * <p>
     * Lineage reference object : TBBESTU_DEL_IND
     * 
     */
    @JsonProperty("delInd")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_DEL_IND")
    private String delInd;
    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId")
    private String stuId;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("stuName")
    private String stuName;
    /**
     * Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND")
    private String studentExptRollInd;
    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBESTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm")
    private String termCodeExpiration;
    /**
     * Priority
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_PRIORITY
     * 
     */
    @JsonProperty("exemptionPriority")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_EXEMPTION_PRIORITY")
    private Double exemptionPriority;
    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("maxStudentAmount")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT")
    private Double maxStudentAmount;
    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE")
    private Double stspKeySequence;
    @JsonProperty("studypathName")
    private String studypathName;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBESTU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : TBBESTU_ACTIVITY_DATE")
    private Date activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("exemptionCode")
    public String getExemptionCode() {
        return exemptionCode;
    }

    @JsonProperty("exemptionCode")
    public void setExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withExemptionCode(String exemptionCode) {
        this.exemptionCode = exemptionCode;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Delete
     * <p>
     * Lineage reference object : TBBESTU_DEL_IND
     * 
     */
    @JsonProperty("delInd")
    public String getDelInd() {
        return delInd;
    }

    /**
     * Delete
     * <p>
     * Lineage reference object : TBBESTU_DEL_IND
     * 
     */
    @JsonProperty("delInd")
    public void setDelInd(String delInd) {
        this.delInd = delInd;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withDelInd(String delInd) {
        this.delInd = delInd;
        return this;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId")
    public String getStuId() {
        return stuId;
    }

    /**
     * Student ID
     * <p>
     * 
     * 
     */
    @JsonProperty("stuId")
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withStuId(String stuId) {
        this.stuId = stuId;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("stuName")
    public String getStuName() {
        return stuName;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("stuName")
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withStuName(String stuName) {
        this.stuName = stuName;
        return this;
    }

    /**
     * Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    public String getStudentExptRollInd() {
        return studentExptRollInd;
    }

    /**
     * Lineage reference object : TBBESTU_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    public void setStudentExptRollInd(String studentExptRollInd) {
        this.studentExptRollInd = studentExptRollInd;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withStudentExptRollInd(String studentExptRollInd) {
        this.studentExptRollInd = studentExptRollInd;
        return this;
    }

    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBESTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    public String getTermCodeExpiration() {
        return termCodeExpiration;
    }

    /**
     * Expiration Term
     * <p>
     * Lineage reference object : TBBESTU_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    public void setTermCodeExpiration(String termCodeExpiration) {
        this.termCodeExpiration = termCodeExpiration;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withTermCodeExpiration(String termCodeExpiration) {
        this.termCodeExpiration = termCodeExpiration;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_PRIORITY
     * 
     */
    @JsonProperty("exemptionPriority")
    public Double getExemptionPriority() {
        return exemptionPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : TBBESTU_EXEMPTION_PRIORITY
     * 
     */
    @JsonProperty("exemptionPriority")
    public void setExemptionPriority(Double exemptionPriority) {
        this.exemptionPriority = exemptionPriority;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withExemptionPriority(Double exemptionPriority) {
        this.exemptionPriority = exemptionPriority;
        return this;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("maxStudentAmount")
    public Double getMaxStudentAmount() {
        return maxStudentAmount;
    }

    /**
     * Maximum Amount
     * <p>
     * Lineage reference object : TBBESTU_MAX_STUDENT_AMOUNT
     * 
     */
    @JsonProperty("maxStudentAmount")
    public void setMaxStudentAmount(Double maxStudentAmount) {
        this.maxStudentAmount = maxStudentAmount;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withMaxStudentAmount(Double maxStudentAmount) {
        this.maxStudentAmount = maxStudentAmount;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public Double getStspKeySequence() {
        return stspKeySequence;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : TBBESTU_STSP_KEY_SEQUENCE
     * 
     */
    @JsonProperty("stspKeySequence")
    public void setStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withStspKeySequence(Double stspKeySequence) {
        this.stspKeySequence = stspKeySequence;
        return this;
    }

    @JsonProperty("studypathName")
    public String getStudypathName() {
        return studypathName;
    }

    @JsonProperty("studypathName")
    public void setStudypathName(String studypathName) {
        this.studypathName = studypathName;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withStudypathName(String studypathName) {
        this.studypathName = studypathName;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBESTU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : TBBESTU_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ExemptionAuthorizationPersonAuthorization100QapiPost withActivityDate(Date activityDate) {
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

    public ExemptionAuthorizationPersonAuthorization100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExemptionAuthorizationPersonAuthorization100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exemptionCode");
        sb.append('=');
        sb.append(((this.exemptionCode == null)?"<null>":this.exemptionCode));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("delInd");
        sb.append('=');
        sb.append(((this.delInd == null)?"<null>":this.delInd));
        sb.append(',');
        sb.append("stuId");
        sb.append('=');
        sb.append(((this.stuId == null)?"<null>":this.stuId));
        sb.append(',');
        sb.append("stuName");
        sb.append('=');
        sb.append(((this.stuName == null)?"<null>":this.stuName));
        sb.append(',');
        sb.append("studentExptRollInd");
        sb.append('=');
        sb.append(((this.studentExptRollInd == null)?"<null>":this.studentExptRollInd));
        sb.append(',');
        sb.append("termCodeExpiration");
        sb.append('=');
        sb.append(((this.termCodeExpiration == null)?"<null>":this.termCodeExpiration));
        sb.append(',');
        sb.append("exemptionPriority");
        sb.append('=');
        sb.append(((this.exemptionPriority == null)?"<null>":this.exemptionPriority));
        sb.append(',');
        sb.append("maxStudentAmount");
        sb.append('=');
        sb.append(((this.maxStudentAmount == null)?"<null>":this.maxStudentAmount));
        sb.append(',');
        sb.append("stspKeySequence");
        sb.append('=');
        sb.append(((this.stspKeySequence == null)?"<null>":this.stspKeySequence));
        sb.append(',');
        sb.append("studypathName");
        sb.append('=');
        sb.append(((this.studypathName == null)?"<null>":this.studypathName));
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
        result = ((result* 31)+((this.exemptionCode == null)? 0 :this.exemptionCode.hashCode()));
        result = ((result* 31)+((this.studypathName == null)? 0 :this.studypathName.hashCode()));
        result = ((result* 31)+((this.stspKeySequence == null)? 0 :this.stspKeySequence.hashCode()));
        result = ((result* 31)+((this.stuId == null)? 0 :this.stuId.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.termCodeExpiration == null)? 0 :this.termCodeExpiration.hashCode()));
        result = ((result* 31)+((this.stuName == null)? 0 :this.stuName.hashCode()));
        result = ((result* 31)+((this.exemptionPriority == null)? 0 :this.exemptionPriority.hashCode()));
        result = ((result* 31)+((this.delInd == null)? 0 :this.delInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.studentExptRollInd == null)? 0 :this.studentExptRollInd.hashCode()));
        result = ((result* 31)+((this.maxStudentAmount == null)? 0 :this.maxStudentAmount.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExemptionAuthorizationPersonAuthorization100QapiPost) == false) {
            return false;
        }
        ExemptionAuthorizationPersonAuthorization100QapiPost rhs = ((ExemptionAuthorizationPersonAuthorization100QapiPost) other);
        return (((((((((((((((this.exemptionCode == rhs.exemptionCode)||((this.exemptionCode!= null)&&this.exemptionCode.equals(rhs.exemptionCode)))&&((this.studypathName == rhs.studypathName)||((this.studypathName!= null)&&this.studypathName.equals(rhs.studypathName))))&&((this.stspKeySequence == rhs.stspKeySequence)||((this.stspKeySequence!= null)&&this.stspKeySequence.equals(rhs.stspKeySequence))))&&((this.stuId == rhs.stuId)||((this.stuId!= null)&&this.stuId.equals(rhs.stuId))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.termCodeExpiration == rhs.termCodeExpiration)||((this.termCodeExpiration!= null)&&this.termCodeExpiration.equals(rhs.termCodeExpiration))))&&((this.stuName == rhs.stuName)||((this.stuName!= null)&&this.stuName.equals(rhs.stuName))))&&((this.exemptionPriority == rhs.exemptionPriority)||((this.exemptionPriority!= null)&&this.exemptionPriority.equals(rhs.exemptionPriority))))&&((this.delInd == rhs.delInd)||((this.delInd!= null)&&this.delInd.equals(rhs.delInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.studentExptRollInd == rhs.studentExptRollInd)||((this.studentExptRollInd!= null)&&this.studentExptRollInd.equals(rhs.studentExptRollInd))))&&((this.maxStudentAmount == rhs.maxStudentAmount)||((this.maxStudentAmount!= null)&&this.maxStudentAmount.equals(rhs.maxStudentAmount))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
