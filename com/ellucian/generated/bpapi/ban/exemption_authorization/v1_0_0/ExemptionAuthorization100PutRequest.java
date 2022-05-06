
package com.ellucian.generated.bpapi.ban.exemption_authorization.v1_0_0;

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
    "criteria.detailCode",
    "criteria.exemptionRollInd",
    "keyblocTermCode",
    "criteria.termCodeExpiration",
    "termCodeExpiration",
    "criteria.studentExptRollInd",
    "criteria.desc",
    "criteria.expTermCodeDesc",
    "studentExptRollInd",
    "exemptionRollInd",
    "criteria.detailDesc",
    "desc"
})
@Generated("jsonschema2pojo")
public class ExemptionAuthorization100PutRequest {

    /**
     * Exemption Code
     * <p>
     * Lineage reference object : exemptionCode
     * 
     */
    @JsonProperty("exemptionCode")
    @JsonPropertyDescription("Lineage reference object : exemptionCode")
    private Object exemptionCode;
    /**
     * Detail Payment Code
     * <p>
     * Lineage reference object : TBBEXPT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String criteriaDetailCode;
    /**
     * Roll Exemptions
     * <p>
     * Lineage reference object : TBBEXPT_EXEMPTION_ROLL_IND
     * 
     */
    @JsonProperty("criteria.exemptionRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_EXEMPTION_ROLL_IND")
    private String criteriaExemptionRollInd;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private Object keyblocTermCode;
    /**
     * Roll Expiration Term
     * <p>
     * Lineage reference object : TBBEXPT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeExpiration")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeExpiration;
    /**
     * Roll Expiration Term
     * <p>
     * Lineage reference object : TBBEXPT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm")
    private String termCodeExpiration;
    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBEXPT_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentExptRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_STUDENT_EXPT_ROLL_IND")
    private String criteriaStudentExptRollInd;
    /**
     * Description
     * <p>
     * Lineage reference object : TBBEXPT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_DESC")
    private String criteriaDesc;
    @JsonProperty("criteria.expTermCodeDesc")
    private String criteriaExpTermCodeDesc;
    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBEXPT_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_STUDENT_EXPT_ROLL_IND")
    private String studentExptRollInd;
    /**
     * Roll Exemptions
     * <p>
     * Lineage reference object : TBBEXPT_EXEMPTION_ROLL_IND
     * 
     */
    @JsonProperty("exemptionRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_EXEMPTION_ROLL_IND")
    private String exemptionRollInd;
    @JsonProperty("criteria.detailDesc")
    private String criteriaDetailDesc;
    /**
     * Description
     * <p>
     * Lineage reference object : TBBEXPT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Exemption Code
     * <p>
     * Lineage reference object : exemptionCode
     * 
     */
    @JsonProperty("exemptionCode")
    public Object getExemptionCode() {
        return exemptionCode;
    }

    /**
     * Exemption Code
     * <p>
     * Lineage reference object : exemptionCode
     * 
     */
    @JsonProperty("exemptionCode")
    public void setExemptionCode(Object exemptionCode) {
        this.exemptionCode = exemptionCode;
    }

    public ExemptionAuthorization100PutRequest withExemptionCode(Object exemptionCode) {
        this.exemptionCode = exemptionCode;
        return this;
    }

    /**
     * Detail Payment Code
     * <p>
     * Lineage reference object : TBBEXPT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public String getCriteriaDetailCode() {
        return criteriaDetailCode;
    }

    /**
     * Detail Payment Code
     * <p>
     * Lineage reference object : TBBEXPT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("criteria.detailCode")
    public void setCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
    }

    public ExemptionAuthorization100PutRequest withCriteriaDetailCode(String criteriaDetailCode) {
        this.criteriaDetailCode = criteriaDetailCode;
        return this;
    }

    /**
     * Roll Exemptions
     * <p>
     * Lineage reference object : TBBEXPT_EXEMPTION_ROLL_IND
     * 
     */
    @JsonProperty("criteria.exemptionRollInd")
    public String getCriteriaExemptionRollInd() {
        return criteriaExemptionRollInd;
    }

    /**
     * Roll Exemptions
     * <p>
     * Lineage reference object : TBBEXPT_EXEMPTION_ROLL_IND
     * 
     */
    @JsonProperty("criteria.exemptionRollInd")
    public void setCriteriaExemptionRollInd(String criteriaExemptionRollInd) {
        this.criteriaExemptionRollInd = criteriaExemptionRollInd;
    }

    public ExemptionAuthorization100PutRequest withCriteriaExemptionRollInd(String criteriaExemptionRollInd) {
        this.criteriaExemptionRollInd = criteriaExemptionRollInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public Object getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ExemptionAuthorization100PutRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Roll Expiration Term
     * <p>
     * Lineage reference object : TBBEXPT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeExpiration")
    public String getCriteriaTermCodeExpiration() {
        return criteriaTermCodeExpiration;
    }

    /**
     * Roll Expiration Term
     * <p>
     * Lineage reference object : TBBEXPT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("criteria.termCodeExpiration")
    public void setCriteriaTermCodeExpiration(String criteriaTermCodeExpiration) {
        this.criteriaTermCodeExpiration = criteriaTermCodeExpiration;
    }

    public ExemptionAuthorization100PutRequest withCriteriaTermCodeExpiration(String criteriaTermCodeExpiration) {
        this.criteriaTermCodeExpiration = criteriaTermCodeExpiration;
        return this;
    }

    /**
     * Roll Expiration Term
     * <p>
     * Lineage reference object : TBBEXPT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    public String getTermCodeExpiration() {
        return termCodeExpiration;
    }

    /**
     * Roll Expiration Term
     * <p>
     * Lineage reference object : TBBEXPT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    public void setTermCodeExpiration(String termCodeExpiration) {
        this.termCodeExpiration = termCodeExpiration;
    }

    public ExemptionAuthorization100PutRequest withTermCodeExpiration(String termCodeExpiration) {
        this.termCodeExpiration = termCodeExpiration;
        return this;
    }

    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBEXPT_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentExptRollInd")
    public String getCriteriaStudentExptRollInd() {
        return criteriaStudentExptRollInd;
    }

    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBEXPT_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("criteria.studentExptRollInd")
    public void setCriteriaStudentExptRollInd(String criteriaStudentExptRollInd) {
        this.criteriaStudentExptRollInd = criteriaStudentExptRollInd;
    }

    public ExemptionAuthorization100PutRequest withCriteriaStudentExptRollInd(String criteriaStudentExptRollInd) {
        this.criteriaStudentExptRollInd = criteriaStudentExptRollInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBBEXPT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBBEXPT_DESC
     * (Required)
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public ExemptionAuthorization100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    @JsonProperty("criteria.expTermCodeDesc")
    public String getCriteriaExpTermCodeDesc() {
        return criteriaExpTermCodeDesc;
    }

    @JsonProperty("criteria.expTermCodeDesc")
    public void setCriteriaExpTermCodeDesc(String criteriaExpTermCodeDesc) {
        this.criteriaExpTermCodeDesc = criteriaExpTermCodeDesc;
    }

    public ExemptionAuthorization100PutRequest withCriteriaExpTermCodeDesc(String criteriaExpTermCodeDesc) {
        this.criteriaExpTermCodeDesc = criteriaExpTermCodeDesc;
        return this;
    }

    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBEXPT_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    public String getStudentExptRollInd() {
        return studentExptRollInd;
    }

    /**
     * Roll Students
     * <p>
     * Lineage reference object : TBBEXPT_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    public void setStudentExptRollInd(String studentExptRollInd) {
        this.studentExptRollInd = studentExptRollInd;
    }

    public ExemptionAuthorization100PutRequest withStudentExptRollInd(String studentExptRollInd) {
        this.studentExptRollInd = studentExptRollInd;
        return this;
    }

    /**
     * Roll Exemptions
     * <p>
     * Lineage reference object : TBBEXPT_EXEMPTION_ROLL_IND
     * 
     */
    @JsonProperty("exemptionRollInd")
    public String getExemptionRollInd() {
        return exemptionRollInd;
    }

    /**
     * Roll Exemptions
     * <p>
     * Lineage reference object : TBBEXPT_EXEMPTION_ROLL_IND
     * 
     */
    @JsonProperty("exemptionRollInd")
    public void setExemptionRollInd(String exemptionRollInd) {
        this.exemptionRollInd = exemptionRollInd;
    }

    public ExemptionAuthorization100PutRequest withExemptionRollInd(String exemptionRollInd) {
        this.exemptionRollInd = exemptionRollInd;
        return this;
    }

    @JsonProperty("criteria.detailDesc")
    public String getCriteriaDetailDesc() {
        return criteriaDetailDesc;
    }

    @JsonProperty("criteria.detailDesc")
    public void setCriteriaDetailDesc(String criteriaDetailDesc) {
        this.criteriaDetailDesc = criteriaDetailDesc;
    }

    public ExemptionAuthorization100PutRequest withCriteriaDetailDesc(String criteriaDetailDesc) {
        this.criteriaDetailDesc = criteriaDetailDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBBEXPT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : TBBEXPT_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ExemptionAuthorization100PutRequest withDesc(String desc) {
        this.desc = desc;
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

    public ExemptionAuthorization100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExemptionAuthorization100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exemptionCode");
        sb.append('=');
        sb.append(((this.exemptionCode == null)?"<null>":this.exemptionCode));
        sb.append(',');
        sb.append("criteriaDetailCode");
        sb.append('=');
        sb.append(((this.criteriaDetailCode == null)?"<null>":this.criteriaDetailCode));
        sb.append(',');
        sb.append("criteriaExemptionRollInd");
        sb.append('=');
        sb.append(((this.criteriaExemptionRollInd == null)?"<null>":this.criteriaExemptionRollInd));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("criteriaTermCodeExpiration");
        sb.append('=');
        sb.append(((this.criteriaTermCodeExpiration == null)?"<null>":this.criteriaTermCodeExpiration));
        sb.append(',');
        sb.append("termCodeExpiration");
        sb.append('=');
        sb.append(((this.termCodeExpiration == null)?"<null>":this.termCodeExpiration));
        sb.append(',');
        sb.append("criteriaStudentExptRollInd");
        sb.append('=');
        sb.append(((this.criteriaStudentExptRollInd == null)?"<null>":this.criteriaStudentExptRollInd));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaExpTermCodeDesc");
        sb.append('=');
        sb.append(((this.criteriaExpTermCodeDesc == null)?"<null>":this.criteriaExpTermCodeDesc));
        sb.append(',');
        sb.append("studentExptRollInd");
        sb.append('=');
        sb.append(((this.studentExptRollInd == null)?"<null>":this.studentExptRollInd));
        sb.append(',');
        sb.append("exemptionRollInd");
        sb.append('=');
        sb.append(((this.exemptionRollInd == null)?"<null>":this.exemptionRollInd));
        sb.append(',');
        sb.append("criteriaDetailDesc");
        sb.append('=');
        sb.append(((this.criteriaDetailDesc == null)?"<null>":this.criteriaDetailDesc));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.criteriaExpTermCodeDesc == null)? 0 :this.criteriaExpTermCodeDesc.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeExpiration == null)? 0 :this.criteriaTermCodeExpiration.hashCode()));
        result = ((result* 31)+((this.termCodeExpiration == null)? 0 :this.termCodeExpiration.hashCode()));
        result = ((result* 31)+((this.criteriaStudentExptRollInd == null)? 0 :this.criteriaStudentExptRollInd.hashCode()));
        result = ((result* 31)+((this.criteriaDetailCode == null)? 0 :this.criteriaDetailCode.hashCode()));
        result = ((result* 31)+((this.criteriaDetailDesc == null)? 0 :this.criteriaDetailDesc.hashCode()));
        result = ((result* 31)+((this.studentExptRollInd == null)? 0 :this.studentExptRollInd.hashCode()));
        result = ((result* 31)+((this.criteriaExemptionRollInd == null)? 0 :this.criteriaExemptionRollInd.hashCode()));
        result = ((result* 31)+((this.exemptionRollInd == null)? 0 :this.exemptionRollInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExemptionAuthorization100PutRequest) == false) {
            return false;
        }
        ExemptionAuthorization100PutRequest rhs = ((ExemptionAuthorization100PutRequest) other);
        return (((((((((((((((this.exemptionCode == rhs.exemptionCode)||((this.exemptionCode!= null)&&this.exemptionCode.equals(rhs.exemptionCode)))&&((this.criteriaExpTermCodeDesc == rhs.criteriaExpTermCodeDesc)||((this.criteriaExpTermCodeDesc!= null)&&this.criteriaExpTermCodeDesc.equals(rhs.criteriaExpTermCodeDesc))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.criteriaTermCodeExpiration == rhs.criteriaTermCodeExpiration)||((this.criteriaTermCodeExpiration!= null)&&this.criteriaTermCodeExpiration.equals(rhs.criteriaTermCodeExpiration))))&&((this.termCodeExpiration == rhs.termCodeExpiration)||((this.termCodeExpiration!= null)&&this.termCodeExpiration.equals(rhs.termCodeExpiration))))&&((this.criteriaStudentExptRollInd == rhs.criteriaStudentExptRollInd)||((this.criteriaStudentExptRollInd!= null)&&this.criteriaStudentExptRollInd.equals(rhs.criteriaStudentExptRollInd))))&&((this.criteriaDetailCode == rhs.criteriaDetailCode)||((this.criteriaDetailCode!= null)&&this.criteriaDetailCode.equals(rhs.criteriaDetailCode))))&&((this.criteriaDetailDesc == rhs.criteriaDetailDesc)||((this.criteriaDetailDesc!= null)&&this.criteriaDetailDesc.equals(rhs.criteriaDetailDesc))))&&((this.studentExptRollInd == rhs.studentExptRollInd)||((this.studentExptRollInd!= null)&&this.studentExptRollInd.equals(rhs.studentExptRollInd))))&&((this.criteriaExemptionRollInd == rhs.criteriaExemptionRollInd)||((this.criteriaExemptionRollInd!= null)&&this.criteriaExemptionRollInd.equals(rhs.criteriaExemptionRollInd))))&&((this.exemptionRollInd == rhs.exemptionRollInd)||((this.exemptionRollInd!= null)&&this.exemptionRollInd.equals(rhs.exemptionRollInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
