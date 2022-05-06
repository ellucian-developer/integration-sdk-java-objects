
package com.ellucian.generated.bpapi.ban.course_maintenance.v1_0_0;

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
    "hoursAttempted",
    "seqNo",
    "finalGrdeChgUser",
    "gchgCode",
    "creditHours",
    "gcmtDesc",
    "grdeCodeIncmpFinal",
    "finalGrdeChgDate",
    "gcmtCode",
    "incompleteExtDate",
    "stvgchgDesc",
    "gmodCodeDesc",
    "grdeCodeFinal"
})
@Generated("jsonschema2pojo")
public class Shrtckg__2 {

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SHRTCKG_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GMOD_CODE")
    private String gmodCode;
    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHRTCKG_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("hoursAttempted")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_HOURS_ATTEMPTED")
    private Double hoursAttempted;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SHRTCKG_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_SEQ_NO")
    private Double seqNo;
    /**
     * User
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_USER
     * 
     */
    @JsonProperty("finalGrdeChgUser")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_USER")
    private String finalGrdeChgUser;
    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("gchgCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg")
    private String gchgCode;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SHRTCKG_CREDIT_HOURS
     * 
     */
    @JsonProperty("creditHours")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_CREDIT_HOURS")
    private Double creditHours;
    /**
     * Grade Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gcmtDesc")
    private String gcmtDesc;
    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeCodeIncmpFinal")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde")
    private String grdeCodeIncmpFinal;
    /**
     * Grade Date
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE
     * 
     */
    @JsonProperty("finalGrdeChgDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE")
    private Date finalGrdeChgDate;
    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt")
    private String gcmtCode;
    /**
     * Extension Date
     * <p>
     * Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDate")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE")
    private Date incompleteExtDate;
    /**
     * Change Reason Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgchgDesc")
    private String stvgchgDesc;
    /**
     * Grade Mode Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gmodCodeDesc")
    private String gmodCodeDesc;
    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_FINAL
     * 
     */
    @JsonProperty("grdeCodeFinal")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GRDE_CODE_FINAL")
    private String grdeCodeFinal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SHRTCKG_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    public String getGmodCode() {
        return gmodCode;
    }

    /**
     * Grade Mode
     * <p>
     * Lineage reference object : SHRTCKG_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    public void setGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
    }

    public Shrtckg__2 withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHRTCKG_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("hoursAttempted")
    public Double getHoursAttempted() {
        return hoursAttempted;
    }

    /**
     * Attempted Hours
     * <p>
     * Lineage reference object : SHRTCKG_HOURS_ATTEMPTED
     * 
     */
    @JsonProperty("hoursAttempted")
    public void setHoursAttempted(Double hoursAttempted) {
        this.hoursAttempted = hoursAttempted;
    }

    public Shrtckg__2 withHoursAttempted(Double hoursAttempted) {
        this.hoursAttempted = hoursAttempted;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SHRTCKG_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public Double getSeqNo() {
        return seqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : SHRTCKG_SEQ_NO
     * 
     */
    @JsonProperty("seqNo")
    public void setSeqNo(Double seqNo) {
        this.seqNo = seqNo;
    }

    public Shrtckg__2 withSeqNo(Double seqNo) {
        this.seqNo = seqNo;
        return this;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_USER
     * 
     */
    @JsonProperty("finalGrdeChgUser")
    public String getFinalGrdeChgUser() {
        return finalGrdeChgUser;
    }

    /**
     * User
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_USER
     * 
     */
    @JsonProperty("finalGrdeChgUser")
    public void setFinalGrdeChgUser(String finalGrdeChgUser) {
        this.finalGrdeChgUser = finalGrdeChgUser;
    }

    public Shrtckg__2 withFinalGrdeChgUser(String finalGrdeChgUser) {
        this.finalGrdeChgUser = finalGrdeChgUser;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("gchgCode")
    public String getGchgCode() {
        return gchgCode;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : SHRTCKG_GCHG_CODE, Lookup lineage reference object : stvgchg
     * 
     */
    @JsonProperty("gchgCode")
    public void setGchgCode(String gchgCode) {
        this.gchgCode = gchgCode;
    }

    public Shrtckg__2 withGchgCode(String gchgCode) {
        this.gchgCode = gchgCode;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SHRTCKG_CREDIT_HOURS
     * 
     */
    @JsonProperty("creditHours")
    public Double getCreditHours() {
        return creditHours;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SHRTCKG_CREDIT_HOURS
     * 
     */
    @JsonProperty("creditHours")
    public void setCreditHours(Double creditHours) {
        this.creditHours = creditHours;
    }

    public Shrtckg__2 withCreditHours(Double creditHours) {
        this.creditHours = creditHours;
        return this;
    }

    /**
     * Grade Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gcmtDesc")
    public String getGcmtDesc() {
        return gcmtDesc;
    }

    /**
     * Grade Comment Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gcmtDesc")
    public void setGcmtDesc(String gcmtDesc) {
        this.gcmtDesc = gcmtDesc;
    }

    public Shrtckg__2 withGcmtDesc(String gcmtDesc) {
        this.gcmtDesc = gcmtDesc;
        return this;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeCodeIncmpFinal")
    public String getGrdeCodeIncmpFinal() {
        return grdeCodeIncmpFinal;
    }

    /**
     * Incomplete Final Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_INCMP_FINAL, Lookup lineage reference object : shrgrde,shrgrde
     * 
     */
    @JsonProperty("grdeCodeIncmpFinal")
    public void setGrdeCodeIncmpFinal(String grdeCodeIncmpFinal) {
        this.grdeCodeIncmpFinal = grdeCodeIncmpFinal;
    }

    public Shrtckg__2 withGrdeCodeIncmpFinal(String grdeCodeIncmpFinal) {
        this.grdeCodeIncmpFinal = grdeCodeIncmpFinal;
        return this;
    }

    /**
     * Grade Date
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE
     * 
     */
    @JsonProperty("finalGrdeChgDate")
    public Date getFinalGrdeChgDate() {
        return finalGrdeChgDate;
    }

    /**
     * Grade Date
     * <p>
     * Lineage reference object : SHRTCKG_FINAL_GRDE_CHG_DATE
     * 
     */
    @JsonProperty("finalGrdeChgDate")
    public void setFinalGrdeChgDate(Date finalGrdeChgDate) {
        this.finalGrdeChgDate = finalGrdeChgDate;
    }

    public Shrtckg__2 withFinalGrdeChgDate(Date finalGrdeChgDate) {
        this.finalGrdeChgDate = finalGrdeChgDate;
        return this;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    public String getGcmtCode() {
        return gcmtCode;
    }

    /**
     * Grade Comment
     * <p>
     * Lineage reference object : SHRTCKG_GCMT_CODE, Lookup lineage reference object : stvgcmt
     * 
     */
    @JsonProperty("gcmtCode")
    public void setGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
    }

    public Shrtckg__2 withGcmtCode(String gcmtCode) {
        this.gcmtCode = gcmtCode;
        return this;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDate")
    public Date getIncompleteExtDate() {
        return incompleteExtDate;
    }

    /**
     * Extension Date
     * <p>
     * Lineage reference object : SHRTCKG_INCOMPLETE_EXT_DATE
     * 
     */
    @JsonProperty("incompleteExtDate")
    public void setIncompleteExtDate(Date incompleteExtDate) {
        this.incompleteExtDate = incompleteExtDate;
    }

    public Shrtckg__2 withIncompleteExtDate(Date incompleteExtDate) {
        this.incompleteExtDate = incompleteExtDate;
        return this;
    }

    /**
     * Change Reason Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgchgDesc")
    public String getStvgchgDesc() {
        return stvgchgDesc;
    }

    /**
     * Change Reason Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvgchgDesc")
    public void setStvgchgDesc(String stvgchgDesc) {
        this.stvgchgDesc = stvgchgDesc;
    }

    public Shrtckg__2 withStvgchgDesc(String stvgchgDesc) {
        this.stvgchgDesc = stvgchgDesc;
        return this;
    }

    /**
     * Grade Mode Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gmodCodeDesc")
    public String getGmodCodeDesc() {
        return gmodCodeDesc;
    }

    /**
     * Grade Mode Description
     * <p>
     * 
     * 
     */
    @JsonProperty("gmodCodeDesc")
    public void setGmodCodeDesc(String gmodCodeDesc) {
        this.gmodCodeDesc = gmodCodeDesc;
    }

    public Shrtckg__2 withGmodCodeDesc(String gmodCodeDesc) {
        this.gmodCodeDesc = gmodCodeDesc;
        return this;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_FINAL
     * 
     */
    @JsonProperty("grdeCodeFinal")
    public String getGrdeCodeFinal() {
        return grdeCodeFinal;
    }

    /**
     * Grade
     * <p>
     * Lineage reference object : SHRTCKG_GRDE_CODE_FINAL
     * 
     */
    @JsonProperty("grdeCodeFinal")
    public void setGrdeCodeFinal(String grdeCodeFinal) {
        this.grdeCodeFinal = grdeCodeFinal;
    }

    public Shrtckg__2 withGrdeCodeFinal(String grdeCodeFinal) {
        this.grdeCodeFinal = grdeCodeFinal;
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

    public Shrtckg__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrtckg__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("hoursAttempted");
        sb.append('=');
        sb.append(((this.hoursAttempted == null)?"<null>":this.hoursAttempted));
        sb.append(',');
        sb.append("seqNo");
        sb.append('=');
        sb.append(((this.seqNo == null)?"<null>":this.seqNo));
        sb.append(',');
        sb.append("finalGrdeChgUser");
        sb.append('=');
        sb.append(((this.finalGrdeChgUser == null)?"<null>":this.finalGrdeChgUser));
        sb.append(',');
        sb.append("gchgCode");
        sb.append('=');
        sb.append(((this.gchgCode == null)?"<null>":this.gchgCode));
        sb.append(',');
        sb.append("creditHours");
        sb.append('=');
        sb.append(((this.creditHours == null)?"<null>":this.creditHours));
        sb.append(',');
        sb.append("gcmtDesc");
        sb.append('=');
        sb.append(((this.gcmtDesc == null)?"<null>":this.gcmtDesc));
        sb.append(',');
        sb.append("grdeCodeIncmpFinal");
        sb.append('=');
        sb.append(((this.grdeCodeIncmpFinal == null)?"<null>":this.grdeCodeIncmpFinal));
        sb.append(',');
        sb.append("finalGrdeChgDate");
        sb.append('=');
        sb.append(((this.finalGrdeChgDate == null)?"<null>":this.finalGrdeChgDate));
        sb.append(',');
        sb.append("gcmtCode");
        sb.append('=');
        sb.append(((this.gcmtCode == null)?"<null>":this.gcmtCode));
        sb.append(',');
        sb.append("incompleteExtDate");
        sb.append('=');
        sb.append(((this.incompleteExtDate == null)?"<null>":this.incompleteExtDate));
        sb.append(',');
        sb.append("stvgchgDesc");
        sb.append('=');
        sb.append(((this.stvgchgDesc == null)?"<null>":this.stvgchgDesc));
        sb.append(',');
        sb.append("gmodCodeDesc");
        sb.append('=');
        sb.append(((this.gmodCodeDesc == null)?"<null>":this.gmodCodeDesc));
        sb.append(',');
        sb.append("grdeCodeFinal");
        sb.append('=');
        sb.append(((this.grdeCodeFinal == null)?"<null>":this.grdeCodeFinal));
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
        result = ((result* 31)+((this.hoursAttempted == null)? 0 :this.hoursAttempted.hashCode()));
        result = ((result* 31)+((this.seqNo == null)? 0 :this.seqNo.hashCode()));
        result = ((result* 31)+((this.finalGrdeChgUser == null)? 0 :this.finalGrdeChgUser.hashCode()));
        result = ((result* 31)+((this.gchgCode == null)? 0 :this.gchgCode.hashCode()));
        result = ((result* 31)+((this.creditHours == null)? 0 :this.creditHours.hashCode()));
        result = ((result* 31)+((this.gcmtDesc == null)? 0 :this.gcmtDesc.hashCode()));
        result = ((result* 31)+((this.grdeCodeIncmpFinal == null)? 0 :this.grdeCodeIncmpFinal.hashCode()));
        result = ((result* 31)+((this.finalGrdeChgDate == null)? 0 :this.finalGrdeChgDate.hashCode()));
        result = ((result* 31)+((this.gcmtCode == null)? 0 :this.gcmtCode.hashCode()));
        result = ((result* 31)+((this.incompleteExtDate == null)? 0 :this.incompleteExtDate.hashCode()));
        result = ((result* 31)+((this.stvgchgDesc == null)? 0 :this.stvgchgDesc.hashCode()));
        result = ((result* 31)+((this.gmodCodeDesc == null)? 0 :this.gmodCodeDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.grdeCodeFinal == null)? 0 :this.grdeCodeFinal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrtckg__2) == false) {
            return false;
        }
        Shrtckg__2 rhs = ((Shrtckg__2) other);
        return ((((((((((((((((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode)))&&((this.hoursAttempted == rhs.hoursAttempted)||((this.hoursAttempted!= null)&&this.hoursAttempted.equals(rhs.hoursAttempted))))&&((this.seqNo == rhs.seqNo)||((this.seqNo!= null)&&this.seqNo.equals(rhs.seqNo))))&&((this.finalGrdeChgUser == rhs.finalGrdeChgUser)||((this.finalGrdeChgUser!= null)&&this.finalGrdeChgUser.equals(rhs.finalGrdeChgUser))))&&((this.gchgCode == rhs.gchgCode)||((this.gchgCode!= null)&&this.gchgCode.equals(rhs.gchgCode))))&&((this.creditHours == rhs.creditHours)||((this.creditHours!= null)&&this.creditHours.equals(rhs.creditHours))))&&((this.gcmtDesc == rhs.gcmtDesc)||((this.gcmtDesc!= null)&&this.gcmtDesc.equals(rhs.gcmtDesc))))&&((this.grdeCodeIncmpFinal == rhs.grdeCodeIncmpFinal)||((this.grdeCodeIncmpFinal!= null)&&this.grdeCodeIncmpFinal.equals(rhs.grdeCodeIncmpFinal))))&&((this.finalGrdeChgDate == rhs.finalGrdeChgDate)||((this.finalGrdeChgDate!= null)&&this.finalGrdeChgDate.equals(rhs.finalGrdeChgDate))))&&((this.gcmtCode == rhs.gcmtCode)||((this.gcmtCode!= null)&&this.gcmtCode.equals(rhs.gcmtCode))))&&((this.incompleteExtDate == rhs.incompleteExtDate)||((this.incompleteExtDate!= null)&&this.incompleteExtDate.equals(rhs.incompleteExtDate))))&&((this.stvgchgDesc == rhs.stvgchgDesc)||((this.stvgchgDesc!= null)&&this.stvgchgDesc.equals(rhs.stvgchgDesc))))&&((this.gmodCodeDesc == rhs.gmodCodeDesc)||((this.gmodCodeDesc!= null)&&this.gmodCodeDesc.equals(rhs.gmodCodeDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.grdeCodeFinal == rhs.grdeCodeFinal)||((this.grdeCodeFinal!= null)&&this.grdeCodeFinal.equals(rhs.grdeCodeFinal))));
    }

}
