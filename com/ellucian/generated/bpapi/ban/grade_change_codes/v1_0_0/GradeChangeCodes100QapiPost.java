
package com.ellucian.generated.bpapi.ban.grade_change_codes.v1_0_0;

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
    "acadhistInd",
    "activityDate",
    "calculatedInd",
    "code",
    "definitiveInd",
    "desc",
    "egbInd",
    "exemptInd",
    "gcatCode",
    "permitDupInd",
    "reasGrdeInd",
    "resitInd",
    "systemReqInd"
})
@Generated("jsonschema2pojo")
public class GradeChangeCodes100QapiPost {

    /**
     * Lineage reference object : STVGCHG_ACADHIST_IND
     * 
     */
    @JsonProperty("acadhistInd")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_ACADHIST_IND")
    private String acadhistInd;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVGCHG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : STVGCHG_CALCULATED_IND
     * 
     */
    @JsonProperty("calculatedInd")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_CALCULATED_IND")
    private String calculatedInd;
    /**
     * Code
     * <p>
     * Lineage reference object : STVGCHG_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_CODE")
    private String code;
    /**
     * Lineage reference object : STVGCHG_DEFINITIVE_IND
     * 
     */
    @JsonProperty("definitiveInd")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_DEFINITIVE_IND")
    private String definitiveInd;
    /**
     * Description
     * <p>
     * Lineage reference object : STVGCHG_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_DESC")
    private String desc;
    /**
     * Lineage reference object : STVGCHG_EGB_IND
     * 
     */
    @JsonProperty("egbInd")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_EGB_IND")
    private String egbInd;
    /**
     * Lineage reference object : STVGCHG_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_EXEMPT_IND")
    private String exemptInd;
    /**
     * Attribute
     * <p>
     * Lineage reference object : STVGCHG_GCAT_CODE, Lookup lineage reference object : STVGCAT
     * 
     */
    @JsonProperty("gcatCode")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_GCAT_CODE, Lookup lineage reference object : STVGCAT")
    private String gcatCode;
    /**
     * Lineage reference object : STVGCHG_PERMIT_DUP_IND
     * 
     */
    @JsonProperty("permitDupInd")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_PERMIT_DUP_IND")
    private String permitDupInd;
    /**
     * Lineage reference object : STVGCHG_REAS_GRDE_IND
     * 
     */
    @JsonProperty("reasGrdeInd")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_REAS_GRDE_IND")
    private String reasGrdeInd;
    /**
     * Lineage reference object : STVGCHG_RESIT_IND
     * 
     */
    @JsonProperty("resitInd")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_RESIT_IND")
    private String resitInd;
    /**
     * Lineage reference object : STVGCHG_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    @JsonPropertyDescription("Lineage reference object : STVGCHG_SYSTEM_REQ_IND")
    private String systemReqInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : STVGCHG_ACADHIST_IND
     * 
     */
    @JsonProperty("acadhistInd")
    public String getAcadhistInd() {
        return acadhistInd;
    }

    /**
     * Lineage reference object : STVGCHG_ACADHIST_IND
     * 
     */
    @JsonProperty("acadhistInd")
    public void setAcadhistInd(String acadhistInd) {
        this.acadhistInd = acadhistInd;
    }

    public GradeChangeCodes100QapiPost withAcadhistInd(String acadhistInd) {
        this.acadhistInd = acadhistInd;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVGCHG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVGCHG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public GradeChangeCodes100QapiPost withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : STVGCHG_CALCULATED_IND
     * 
     */
    @JsonProperty("calculatedInd")
    public String getCalculatedInd() {
        return calculatedInd;
    }

    /**
     * Lineage reference object : STVGCHG_CALCULATED_IND
     * 
     */
    @JsonProperty("calculatedInd")
    public void setCalculatedInd(String calculatedInd) {
        this.calculatedInd = calculatedInd;
    }

    public GradeChangeCodes100QapiPost withCalculatedInd(String calculatedInd) {
        this.calculatedInd = calculatedInd;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVGCHG_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : STVGCHG_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public GradeChangeCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVGCHG_DEFINITIVE_IND
     * 
     */
    @JsonProperty("definitiveInd")
    public String getDefinitiveInd() {
        return definitiveInd;
    }

    /**
     * Lineage reference object : STVGCHG_DEFINITIVE_IND
     * 
     */
    @JsonProperty("definitiveInd")
    public void setDefinitiveInd(String definitiveInd) {
        this.definitiveInd = definitiveInd;
    }

    public GradeChangeCodes100QapiPost withDefinitiveInd(String definitiveInd) {
        this.definitiveInd = definitiveInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVGCHG_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVGCHG_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public GradeChangeCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Lineage reference object : STVGCHG_EGB_IND
     * 
     */
    @JsonProperty("egbInd")
    public String getEgbInd() {
        return egbInd;
    }

    /**
     * Lineage reference object : STVGCHG_EGB_IND
     * 
     */
    @JsonProperty("egbInd")
    public void setEgbInd(String egbInd) {
        this.egbInd = egbInd;
    }

    public GradeChangeCodes100QapiPost withEgbInd(String egbInd) {
        this.egbInd = egbInd;
        return this;
    }

    /**
     * Lineage reference object : STVGCHG_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    public String getExemptInd() {
        return exemptInd;
    }

    /**
     * Lineage reference object : STVGCHG_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    public void setExemptInd(String exemptInd) {
        this.exemptInd = exemptInd;
    }

    public GradeChangeCodes100QapiPost withExemptInd(String exemptInd) {
        this.exemptInd = exemptInd;
        return this;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : STVGCHG_GCAT_CODE, Lookup lineage reference object : STVGCAT
     * 
     */
    @JsonProperty("gcatCode")
    public String getGcatCode() {
        return gcatCode;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : STVGCHG_GCAT_CODE, Lookup lineage reference object : STVGCAT
     * 
     */
    @JsonProperty("gcatCode")
    public void setGcatCode(String gcatCode) {
        this.gcatCode = gcatCode;
    }

    public GradeChangeCodes100QapiPost withGcatCode(String gcatCode) {
        this.gcatCode = gcatCode;
        return this;
    }

    /**
     * Lineage reference object : STVGCHG_PERMIT_DUP_IND
     * 
     */
    @JsonProperty("permitDupInd")
    public String getPermitDupInd() {
        return permitDupInd;
    }

    /**
     * Lineage reference object : STVGCHG_PERMIT_DUP_IND
     * 
     */
    @JsonProperty("permitDupInd")
    public void setPermitDupInd(String permitDupInd) {
        this.permitDupInd = permitDupInd;
    }

    public GradeChangeCodes100QapiPost withPermitDupInd(String permitDupInd) {
        this.permitDupInd = permitDupInd;
        return this;
    }

    /**
     * Lineage reference object : STVGCHG_REAS_GRDE_IND
     * 
     */
    @JsonProperty("reasGrdeInd")
    public String getReasGrdeInd() {
        return reasGrdeInd;
    }

    /**
     * Lineage reference object : STVGCHG_REAS_GRDE_IND
     * 
     */
    @JsonProperty("reasGrdeInd")
    public void setReasGrdeInd(String reasGrdeInd) {
        this.reasGrdeInd = reasGrdeInd;
    }

    public GradeChangeCodes100QapiPost withReasGrdeInd(String reasGrdeInd) {
        this.reasGrdeInd = reasGrdeInd;
        return this;
    }

    /**
     * Lineage reference object : STVGCHG_RESIT_IND
     * 
     */
    @JsonProperty("resitInd")
    public String getResitInd() {
        return resitInd;
    }

    /**
     * Lineage reference object : STVGCHG_RESIT_IND
     * 
     */
    @JsonProperty("resitInd")
    public void setResitInd(String resitInd) {
        this.resitInd = resitInd;
    }

    public GradeChangeCodes100QapiPost withResitInd(String resitInd) {
        this.resitInd = resitInd;
        return this;
    }

    /**
     * Lineage reference object : STVGCHG_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public String getSystemReqInd() {
        return systemReqInd;
    }

    /**
     * Lineage reference object : STVGCHG_SYSTEM_REQ_IND
     * 
     */
    @JsonProperty("systemReqInd")
    public void setSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
    }

    public GradeChangeCodes100QapiPost withSystemReqInd(String systemReqInd) {
        this.systemReqInd = systemReqInd;
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

    public GradeChangeCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GradeChangeCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acadhistInd");
        sb.append('=');
        sb.append(((this.acadhistInd == null)?"<null>":this.acadhistInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("calculatedInd");
        sb.append('=');
        sb.append(((this.calculatedInd == null)?"<null>":this.calculatedInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("definitiveInd");
        sb.append('=');
        sb.append(((this.definitiveInd == null)?"<null>":this.definitiveInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("egbInd");
        sb.append('=');
        sb.append(((this.egbInd == null)?"<null>":this.egbInd));
        sb.append(',');
        sb.append("exemptInd");
        sb.append('=');
        sb.append(((this.exemptInd == null)?"<null>":this.exemptInd));
        sb.append(',');
        sb.append("gcatCode");
        sb.append('=');
        sb.append(((this.gcatCode == null)?"<null>":this.gcatCode));
        sb.append(',');
        sb.append("permitDupInd");
        sb.append('=');
        sb.append(((this.permitDupInd == null)?"<null>":this.permitDupInd));
        sb.append(',');
        sb.append("reasGrdeInd");
        sb.append('=');
        sb.append(((this.reasGrdeInd == null)?"<null>":this.reasGrdeInd));
        sb.append(',');
        sb.append("resitInd");
        sb.append('=');
        sb.append(((this.resitInd == null)?"<null>":this.resitInd));
        sb.append(',');
        sb.append("systemReqInd");
        sb.append('=');
        sb.append(((this.systemReqInd == null)?"<null>":this.systemReqInd));
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
        result = ((result* 31)+((this.exemptInd == null)? 0 :this.exemptInd.hashCode()));
        result = ((result* 31)+((this.resitInd == null)? 0 :this.resitInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.systemReqInd == null)? 0 :this.systemReqInd.hashCode()));
        result = ((result* 31)+((this.definitiveInd == null)? 0 :this.definitiveInd.hashCode()));
        result = ((result* 31)+((this.acadhistInd == null)? 0 :this.acadhistInd.hashCode()));
        result = ((result* 31)+((this.egbInd == null)? 0 :this.egbInd.hashCode()));
        result = ((result* 31)+((this.calculatedInd == null)? 0 :this.calculatedInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.gcatCode == null)? 0 :this.gcatCode.hashCode()));
        result = ((result* 31)+((this.reasGrdeInd == null)? 0 :this.reasGrdeInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.permitDupInd == null)? 0 :this.permitDupInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GradeChangeCodes100QapiPost) == false) {
            return false;
        }
        GradeChangeCodes100QapiPost rhs = ((GradeChangeCodes100QapiPost) other);
        return (((((((((((((((this.exemptInd == rhs.exemptInd)||((this.exemptInd!= null)&&this.exemptInd.equals(rhs.exemptInd)))&&((this.resitInd == rhs.resitInd)||((this.resitInd!= null)&&this.resitInd.equals(rhs.resitInd))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.systemReqInd == rhs.systemReqInd)||((this.systemReqInd!= null)&&this.systemReqInd.equals(rhs.systemReqInd))))&&((this.definitiveInd == rhs.definitiveInd)||((this.definitiveInd!= null)&&this.definitiveInd.equals(rhs.definitiveInd))))&&((this.acadhistInd == rhs.acadhistInd)||((this.acadhistInd!= null)&&this.acadhistInd.equals(rhs.acadhistInd))))&&((this.egbInd == rhs.egbInd)||((this.egbInd!= null)&&this.egbInd.equals(rhs.egbInd))))&&((this.calculatedInd == rhs.calculatedInd)||((this.calculatedInd!= null)&&this.calculatedInd.equals(rhs.calculatedInd))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.gcatCode == rhs.gcatCode)||((this.gcatCode!= null)&&this.gcatCode.equals(rhs.gcatCode))))&&((this.reasGrdeInd == rhs.reasGrdeInd)||((this.reasGrdeInd!= null)&&this.reasGrdeInd.equals(rhs.reasGrdeInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.permitDupInd == rhs.permitDupInd)||((this.permitDupInd!= null)&&this.permitDupInd.equals(rhs.permitDupInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
