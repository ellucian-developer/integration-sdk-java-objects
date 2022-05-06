
package com.ellucian.generated.bpapi.ban.class_roster.v1_0_0;

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
    "gmodCode",
    "creditHr",
    "gcmtCodeDesc",
    "grdeCodeMid",
    "grdeCode",
    "rolled",
    "regSeq",
    "spridenId",
    "grdeIncmpFinal",
    "gcmtCode",
    "rstsCode",
    "incompleteExtDate",
    "rstsDate",
    "spridenCurrName"
})
@Generated("jsonschema2pojo")
public class ClassRoster100GetResponse {

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod")
    private String gmodCode;
    /**
     * Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("creditHr")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CREDIT_HR")
    private Double creditHr;
    /**
     * Grade Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gcmtCodeDesc")
    private String gcmtCodeDesc;
    /**
     * Midterm Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_MID
     * 
     */
    @JsonProperty("grdeCodeMid")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE_MID")
    private String grdeCodeMid;
    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE")
    private String grdeCode;
    @JsonProperty("rolled")
    private String rolled;
    /**
     * Sequence
     * <p>
     * Lineage reference object : SFRSTCR_REG_SEQ
     * 
     */
    @JsonProperty("regSeq")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_REG_SEQ")
    private Double regSeq;
    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    private String spridenId;
    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeIncmpFinal")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde")
    private String grdeIncmpFinal;
    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt")
    private String gcmtCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts")
    private String rstsCode;
    /**
     * Extension Date
     * <p>
     * Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDate")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE")
    private Date incompleteExtDate;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("rstsDate")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_RSTS_DATE")
    private Date rstsDate;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenCurrName")
    private String spridenCurrName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SFRSTCR_GMOD_CODE, Lookup lineage reference object : stvgmod
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public ClassRoster100GetResponse withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("creditHr")
    public Double getCreditHr() {
        return creditHr;
    }

    /**
     * Hours
     * <p>
     * Lineage reference object : SFRSTCR_CREDIT_HR
     * 
     */
    @JsonProperty("creditHr")
    public void setCreditHr(Double creditHr) {
        this.creditHr = creditHr;
    }

    public ClassRoster100GetResponse withCreditHr(Double creditHr) {
        this.creditHr = creditHr;
        return this;
    }

    /**
     * Grade Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gcmtCodeDesc")
    public String getGcmtCodeDesc() {
        return gcmtCodeDesc;
    }

    /**
     * Grade Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gcmtCodeDesc")
    public void setGcmtCodeDesc(String gcmtCodeDesc) {
        this.gcmtCodeDesc = gcmtCodeDesc;
    }

    public ClassRoster100GetResponse withGcmtCodeDesc(String gcmtCodeDesc) {
        this.gcmtCodeDesc = gcmtCodeDesc;
        return this;
    }

    /**
     * Midterm Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_MID
     * 
     */
    @JsonProperty("grdeCodeMid")
    public String getGrdeCodeMid() {
        return grdeCodeMid;
    }

    /**
     * Midterm Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_MID
     * 
     */
    @JsonProperty("grdeCodeMid")
    public void setGrdeCodeMid(String grdeCodeMid) {
        this.grdeCodeMid = grdeCodeMid;
    }

    public ClassRoster100GetResponse withGrdeCodeMid(String grdeCodeMid) {
        this.grdeCodeMid = grdeCodeMid;
        return this;
    }

    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    public String getGrdeCode() {
        return grdeCode;
    }

    /**
     * Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE
     * 
     */
    @JsonProperty("grdeCode")
    public void setGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
    }

    public ClassRoster100GetResponse withGrdeCode(String grdeCode) {
        this.grdeCode = grdeCode;
        return this;
    }

    @JsonProperty("rolled")
    public String getRolled() {
        return rolled;
    }

    @JsonProperty("rolled")
    public void setRolled(String rolled) {
        this.rolled = rolled;
    }

    public ClassRoster100GetResponse withRolled(String rolled) {
        this.rolled = rolled;
        return this;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SFRSTCR_REG_SEQ
     * 
     */
    @JsonProperty("regSeq")
    public Double getRegSeq() {
        return regSeq;
    }

    /**
     * Sequence
     * <p>
     * Lineage reference object : SFRSTCR_REG_SEQ
     * 
     */
    @JsonProperty("regSeq")
    public void setRegSeq(Double regSeq) {
        this.regSeq = regSeq;
    }

    public ClassRoster100GetResponse withRegSeq(Double regSeq) {
        this.regSeq = regSeq;
        return this;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    public String getSpridenId() {
        return spridenId;
    }

    /**
     * ID
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenId")
    public void setSpridenId(String spridenId) {
        this.spridenId = spridenId;
    }

    public ClassRoster100GetResponse withSpridenId(String spridenId) {
        this.spridenId = spridenId;
        return this;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeIncmpFinal")
    public String getGrdeIncmpFinal() {
        return grdeIncmpFinal;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SFRSTCR_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeIncmpFinal")
    public void setGrdeIncmpFinal(String grdeIncmpFinal) {
        this.grdeIncmpFinal = grdeIncmpFinal;
    }

    public ClassRoster100GetResponse withGrdeIncmpFinal(String grdeIncmpFinal) {
        this.grdeIncmpFinal = grdeIncmpFinal;
        return this;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    public String getGcmtCode() {
        return gcmtCode;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SFRSTCR_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    public void setGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
    }

    public ClassRoster100GetResponse withGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    public String getRstsCode() {
        return rstsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_CODE, Lookup lineage reference object : stvrsts
     * 
     */
    @JsonProperty("rstsCode")
    public void setRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
    }

    public ClassRoster100GetResponse withRstsCode(String rstsCode) {
        this.rstsCode = rstsCode;
        return this;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDate")
    public Date getIncompleteExtDate() {
        return incompleteExtDate;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SFRSTCR_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDate")
    public void setIncompleteExtDate(Date incompleteExtDate) {
        this.incompleteExtDate = incompleteExtDate;
    }

    public ClassRoster100GetResponse withIncompleteExtDate(Date incompleteExtDate) {
        this.incompleteExtDate = incompleteExtDate;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("rstsDate")
    public Date getRstsDate() {
        return rstsDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFRSTCR_RSTS_DATE
     * 
     */
    @JsonProperty("rstsDate")
    public void setRstsDate(Date rstsDate) {
        this.rstsDate = rstsDate;
    }

    public ClassRoster100GetResponse withRstsDate(Date rstsDate) {
        this.rstsDate = rstsDate;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenCurrName")
    public String getSpridenCurrName() {
        return spridenCurrName;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("spridenCurrName")
    public void setSpridenCurrName(String spridenCurrName) {
        this.spridenCurrName = spridenCurrName;
    }

    public ClassRoster100GetResponse withSpridenCurrName(String spridenCurrName) {
        this.spridenCurrName = spridenCurrName;
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

    public ClassRoster100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClassRoster100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("creditHr");
        sb.append('=');
        sb.append(((this.creditHr == null)?"<null>":this.creditHr));
        sb.append(',');
        sb.append("gcmtCodeDesc");
        sb.append('=');
        sb.append(((this.gcmtCodeDesc == null)?"<null>":this.gcmtCodeDesc));
        sb.append(',');
        sb.append("grdeCodeMid");
        sb.append('=');
        sb.append(((this.grdeCodeMid == null)?"<null>":this.grdeCodeMid));
        sb.append(',');
        sb.append("grdeCode");
        sb.append('=');
        sb.append(((this.grdeCode == null)?"<null>":this.grdeCode));
        sb.append(',');
        sb.append("rolled");
        sb.append('=');
        sb.append(((this.rolled == null)?"<null>":this.rolled));
        sb.append(',');
        sb.append("regSeq");
        sb.append('=');
        sb.append(((this.regSeq == null)?"<null>":this.regSeq));
        sb.append(',');
        sb.append("spridenId");
        sb.append('=');
        sb.append(((this.spridenId == null)?"<null>":this.spridenId));
        sb.append(',');
        sb.append("grdeIncmpFinal");
        sb.append('=');
        sb.append(((this.grdeIncmpFinal == null)?"<null>":this.grdeIncmpFinal));
        sb.append(',');
        sb.append("gcmtCode");
        sb.append('=');
        sb.append(((this.gcmtCode == null)?"<null>":this.gcmtCode));
        sb.append(',');
        sb.append("rstsCode");
        sb.append('=');
        sb.append(((this.rstsCode == null)?"<null>":this.rstsCode));
        sb.append(',');
        sb.append("incompleteExtDate");
        sb.append('=');
        sb.append(((this.incompleteExtDate == null)?"<null>":this.incompleteExtDate));
        sb.append(',');
        sb.append("rstsDate");
        sb.append('=');
        sb.append(((this.rstsDate == null)?"<null>":this.rstsDate));
        sb.append(',');
        sb.append("spridenCurrName");
        sb.append('=');
        sb.append(((this.spridenCurrName == null)?"<null>":this.spridenCurrName));
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
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.creditHr == null)? 0 :this.creditHr.hashCode()));
        result = ((result* 31)+((this.gcmtCodeDesc == null)? 0 :this.gcmtCodeDesc.hashCode()));
        result = ((result* 31)+((this.grdeCodeMid == null)? 0 :this.grdeCodeMid.hashCode()));
        result = ((result* 31)+((this.grdeCode == null)? 0 :this.grdeCode.hashCode()));
        result = ((result* 31)+((this.rolled == null)? 0 :this.rolled.hashCode()));
        result = ((result* 31)+((this.regSeq == null)? 0 :this.regSeq.hashCode()));
        result = ((result* 31)+((this.spridenId == null)? 0 :this.spridenId.hashCode()));
        result = ((result* 31)+((this.grdeIncmpFinal == null)? 0 :this.grdeIncmpFinal.hashCode()));
        result = ((result* 31)+((this.gcmtCode == null)? 0 :this.gcmtCode.hashCode()));
        result = ((result* 31)+((this.rstsCode == null)? 0 :this.rstsCode.hashCode()));
        result = ((result* 31)+((this.incompleteExtDate == null)? 0 :this.incompleteExtDate.hashCode()));
        result = ((result* 31)+((this.rstsDate == null)? 0 :this.rstsDate.hashCode()));
        result = ((result* 31)+((this.spridenCurrName == null)? 0 :this.spridenCurrName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassRoster100GetResponse) == false) {
            return false;
        }
        ClassRoster100GetResponse rhs = ((ClassRoster100GetResponse) other);
        return ((((((((((((((((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode)))&&((this.creditHr == rhs.creditHr)||((this.creditHr!= null)&&this.creditHr.equals(rhs.creditHr))))&&((this.gcmtCodeDesc == rhs.gcmtCodeDesc)||((this.gcmtCodeDesc!= null)&&this.gcmtCodeDesc.equals(rhs.gcmtCodeDesc))))&&((this.grdeCodeMid == rhs.grdeCodeMid)||((this.grdeCodeMid!= null)&&this.grdeCodeMid.equals(rhs.grdeCodeMid))))&&((this.grdeCode == rhs.grdeCode)||((this.grdeCode!= null)&&this.grdeCode.equals(rhs.grdeCode))))&&((this.rolled == rhs.rolled)||((this.rolled!= null)&&this.rolled.equals(rhs.rolled))))&&((this.regSeq == rhs.regSeq)||((this.regSeq!= null)&&this.regSeq.equals(rhs.regSeq))))&&((this.spridenId == rhs.spridenId)||((this.spridenId!= null)&&this.spridenId.equals(rhs.spridenId))))&&((this.grdeIncmpFinal == rhs.grdeIncmpFinal)||((this.grdeIncmpFinal!= null)&&this.grdeIncmpFinal.equals(rhs.grdeIncmpFinal))))&&((this.gcmtCode == rhs.gcmtCode)||((this.gcmtCode!= null)&&this.gcmtCode.equals(rhs.gcmtCode))))&&((this.rstsCode == rhs.rstsCode)||((this.rstsCode!= null)&&this.rstsCode.equals(rhs.rstsCode))))&&((this.incompleteExtDate == rhs.incompleteExtDate)||((this.incompleteExtDate!= null)&&this.incompleteExtDate.equals(rhs.incompleteExtDate))))&&((this.rstsDate == rhs.rstsDate)||((this.rstsDate!= null)&&this.rstsDate.equals(rhs.rstsDate))))&&((this.spridenCurrName == rhs.spridenCurrName)||((this.spridenCurrName!= null)&&this.spridenCurrName.equals(rhs.spridenCurrName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
