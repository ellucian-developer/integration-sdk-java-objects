
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
    "studentExptRollInd",
    "keyblocTermCode",
    "exemptionRollInd",
    "detailCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class ExemptionAuthorization100PostRequest {

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
     * Roll Students
     * <p>
     * Lineage reference object : TBBEXPT_STUDENT_EXPT_ROLL_IND
     * 
     */
    @JsonProperty("studentExptRollInd")
    @JsonPropertyDescription("Lineage reference object : TBBEXPT_STUDENT_EXPT_ROLL_IND")
    private String studentExptRollInd;
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

    public ExemptionAuthorization100PostRequest withExemptionCode(Object exemptionCode) {
        this.exemptionCode = exemptionCode;
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

    public ExemptionAuthorization100PostRequest withStudentExptRollInd(String studentExptRollInd) {
        this.studentExptRollInd = studentExptRollInd;
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

    public ExemptionAuthorization100PostRequest withKeyblocTermCode(Object keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
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

    public ExemptionAuthorization100PostRequest withExemptionRollInd(String exemptionRollInd) {
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

    public ExemptionAuthorization100PostRequest withDetailCode(String detailCode) {
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

    public ExemptionAuthorization100PostRequest withDesc(String desc) {
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

    public ExemptionAuthorization100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExemptionAuthorization100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exemptionCode");
        sb.append('=');
        sb.append(((this.exemptionCode == null)?"<null>":this.exemptionCode));
        sb.append(',');
        sb.append("studentExptRollInd");
        sb.append('=');
        sb.append(((this.studentExptRollInd == null)?"<null>":this.studentExptRollInd));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
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
        result = ((result* 31)+((this.exemptionCode == null)? 0 :this.exemptionCode.hashCode()));
        result = ((result* 31)+((this.studentExptRollInd == null)? 0 :this.studentExptRollInd.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
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
        if ((other instanceof ExemptionAuthorization100PostRequest) == false) {
            return false;
        }
        ExemptionAuthorization100PostRequest rhs = ((ExemptionAuthorization100PostRequest) other);
        return ((((((((this.exemptionCode == rhs.exemptionCode)||((this.exemptionCode!= null)&&this.exemptionCode.equals(rhs.exemptionCode)))&&((this.studentExptRollInd == rhs.studentExptRollInd)||((this.studentExptRollInd!= null)&&this.studentExptRollInd.equals(rhs.studentExptRollInd))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.exemptionRollInd == rhs.exemptionRollInd)||((this.exemptionRollInd!= null)&&this.exemptionRollInd.equals(rhs.exemptionRollInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.detailCode == rhs.detailCode)||((this.detailCode!= null)&&this.detailCode.equals(rhs.detailCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
