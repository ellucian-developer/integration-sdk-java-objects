
package com.ellucian.generated.bpapi.ban.exemption_authorization_detail_code_level_authorization.v1_0_0;

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
    "detailDesc",
    "studentExptRollInd",
    "termCodeExpiration",
    "expTermCodeDesc",
    "exemptionRollInd",
    "detailCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class Tbbexpt {

    @JsonProperty("detailDesc")
    private String detailDesc;
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
     * Roll Expiration Term
     * <p>
     * Lineage reference object : TBBEXPT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeExpiration")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_TERM_CODE_EXPIRATION, Lookup lineage reference object : stvterm")
    private String termCodeExpiration;
    @JsonProperty("expTermCodeDesc")
    private String expTermCodeDesc;
    /**
     * Roll Exemptions
     * <p>
     * Lineage reference object : TBBEXPT_EXEMPTION_ROLL_IND
     * 
     */
    @JsonProperty("exemptionRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_EXEMPTION_ROLL_IND")
    private String exemptionRollInd;
    /**
     * Detail Payment Code
     * <p>
     * Lineage reference object : TBBEXPT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_DETAIL_CODE, Lookup lineage reference object : tbbdetc")
    private String detailCode;
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

    @JsonProperty("detailDesc")
    public String getDetailDesc() {
        return detailDesc;
    }

    @JsonProperty("detailDesc")
    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public Tbbexpt withDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
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

    public Tbbexpt withStudentExptRollInd(String studentExptRollInd) {
        this.studentExptRollInd = studentExptRollInd;
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

    public Tbbexpt withTermCodeExpiration(String termCodeExpiration) {
        this.termCodeExpiration = termCodeExpiration;
        return this;
    }

    @JsonProperty("expTermCodeDesc")
    public String getExpTermCodeDesc() {
        return expTermCodeDesc;
    }

    @JsonProperty("expTermCodeDesc")
    public void setExpTermCodeDesc(String expTermCodeDesc) {
        this.expTermCodeDesc = expTermCodeDesc;
    }

    public Tbbexpt withExpTermCodeDesc(String expTermCodeDesc) {
        this.expTermCodeDesc = expTermCodeDesc;
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

    public Tbbexpt withExemptionRollInd(String exemptionRollInd) {
        this.exemptionRollInd = exemptionRollInd;
        return this;
    }

    /**
     * Detail Payment Code
     * <p>
     * Lineage reference object : TBBEXPT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public String getDetailCode() {
        return detailCode;
    }

    /**
     * Detail Payment Code
     * <p>
     * Lineage reference object : TBBEXPT_DETAIL_CODE, Lookup lineage reference object : tbbdetc
     * (Required)
     * 
     */
    @JsonProperty("detailCode")
    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode;
    }

    public Tbbexpt withDetailCode(String detailCode) {
        this.detailCode = detailCode;
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

    public Tbbexpt withDesc(String desc) {
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

    public Tbbexpt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Tbbexpt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("detailDesc");
        sb.append('=');
        sb.append(((this.detailDesc == null)?"<null>":this.detailDesc));
        sb.append(',');
        sb.append("studentExptRollInd");
        sb.append('=');
        sb.append(((this.studentExptRollInd == null)?"<null>":this.studentExptRollInd));
        sb.append(',');
        sb.append("termCodeExpiration");
        sb.append('=');
        sb.append(((this.termCodeExpiration == null)?"<null>":this.termCodeExpiration));
        sb.append(',');
        sb.append("expTermCodeDesc");
        sb.append('=');
        sb.append(((this.expTermCodeDesc == null)?"<null>":this.expTermCodeDesc));
        sb.append(',');
        sb.append("exemptionRollInd");
        sb.append('=');
        sb.append(((this.exemptionRollInd == null)?"<null>":this.exemptionRollInd));
        sb.append(',');
        sb.append("detailCode");
        sb.append('=');
        sb.append(((this.detailCode == null)?"<null>":this.detailCode));
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
        result = ((result* 31)+((this.detailDesc == null)? 0 :this.detailDesc.hashCode()));
        result = ((result* 31)+((this.studentExptRollInd == null)? 0 :this.studentExptRollInd.hashCode()));
        result = ((result* 31)+((this.termCodeExpiration == null)? 0 :this.termCodeExpiration.hashCode()));
        result = ((result* 31)+((this.expTermCodeDesc == null)? 0 :this.expTermCodeDesc.hashCode()));
        result = ((result* 31)+((this.exemptionRollInd == null)? 0 :this.exemptionRollInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.detailCode == null)? 0 :this.detailCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tbbexpt) == false) {
            return false;
        }
        Tbbexpt rhs = ((Tbbexpt) other);
        return (((((((((this.detailDesc == rhs.detailDesc)||((this.detailDesc!= null)&&this.detailDesc.equals(rhs.detailDesc)))&&((this.studentExptRollInd == rhs.studentExptRollInd)||((this.studentExptRollInd!= null)&&this.studentExptRollInd.equals(rhs.studentExptRollInd))))&&((this.termCodeExpiration == rhs.termCodeExpiration)||((this.termCodeExpiration!= null)&&this.termCodeExpiration.equals(rhs.termCodeExpiration))))&&((this.expTermCodeDesc == rhs.expTermCodeDesc)||((this.expTermCodeDesc!= null)&&this.expTermCodeDesc.equals(rhs.expTermCodeDesc))))&&((this.exemptionRollInd == rhs.exemptionRollInd)||((this.exemptionRollInd!= null)&&this.exemptionRollInd.equals(rhs.exemptionRollInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
