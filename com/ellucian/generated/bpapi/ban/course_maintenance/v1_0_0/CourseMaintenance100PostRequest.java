
package com.ellucian.generated.bpapi.ban.course_maintenance.v1_0_0;

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
    "creditHours",
    "gmodCode",
    "primaryLevlInd",
    "keyblckTermCode",
    "id",
    "gchgCode",
    "crn",
    "levlCode",
    "grdeCodeFinal"
})
@Generated("jsonschema2pojo")
public class CourseMaintenance100PostRequest {

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
     * Grade Mode
     * <p>
     * Lineage reference object : SHRTCKG_GMOD_CODE
     * 
     */
    @JsonProperty("gmodCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKG_GMOD_CODE")
    private String gmodCode;
    /**
     * Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND
     * 
     */
    @JsonProperty("primaryLevlInd")
    @JsonPropertyDescription("Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND")
    private String primaryLevlInd;
    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm")
    private Object keyblckTermCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
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
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SHRTCKN_CRN")
    private String crn;
    /**
     * Code
     * <p>
     * Lineage reference object : SHRTCKL_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lineage reference object : SHRTCKL_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String levlCode;
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

    public CourseMaintenance100PostRequest withCreditHours(Double creditHours) {
        this.creditHours = creditHours;
        return this;
    }

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

    public CourseMaintenance100PostRequest withGmodCode(String gmodCode) {
        this.gmodCode = gmodCode;
        return this;
    }

    /**
     * Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND
     * 
     */
    @JsonProperty("primaryLevlInd")
    public String getPrimaryLevlInd() {
        return primaryLevlInd;
    }

    /**
     * Lineage reference object : SHRTCKL_PRIMARY_LEVL_IND
     * 
     */
    @JsonProperty("primaryLevlInd")
    public void setPrimaryLevlInd(String primaryLevlInd) {
        this.primaryLevlInd = primaryLevlInd;
    }

    public CourseMaintenance100PostRequest withPrimaryLevlInd(String primaryLevlInd) {
        this.primaryLevlInd = primaryLevlInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public Object getKeyblckTermCode() {
        return keyblckTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblckTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblckTermCode")
    public void setKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
    }

    public CourseMaintenance100PostRequest withKeyblckTermCode(Object keyblckTermCode) {
        this.keyblckTermCode = keyblckTermCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public CourseMaintenance100PostRequest withId(Object id) {
        this.id = id;
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

    public CourseMaintenance100PostRequest withGchgCode(String gchgCode) {
        this.gchgCode = gchgCode;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SHRTCKN_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public CourseMaintenance100PostRequest withCrn(String crn) {
        this.crn = crn;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SHRTCKL_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SHRTCKL_LEVL_CODE, Lookup lineage reference object : stvlevl
     * (Required)
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public CourseMaintenance100PostRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
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

    public CourseMaintenance100PostRequest withGrdeCodeFinal(String grdeCodeFinal) {
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

    public CourseMaintenance100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CourseMaintenance100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("creditHours");
        sb.append('=');
        sb.append(((this.creditHours == null)?"<null>":this.creditHours));
        sb.append(',');
        sb.append("gmodCode");
        sb.append('=');
        sb.append(((this.gmodCode == null)?"<null>":this.gmodCode));
        sb.append(',');
        sb.append("primaryLevlInd");
        sb.append('=');
        sb.append(((this.primaryLevlInd == null)?"<null>":this.primaryLevlInd));
        sb.append(',');
        sb.append("keyblckTermCode");
        sb.append('=');
        sb.append(((this.keyblckTermCode == null)?"<null>":this.keyblckTermCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("gchgCode");
        sb.append('=');
        sb.append(((this.gchgCode == null)?"<null>":this.gchgCode));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
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
        result = ((result* 31)+((this.creditHours == null)? 0 :this.creditHours.hashCode()));
        result = ((result* 31)+((this.gmodCode == null)? 0 :this.gmodCode.hashCode()));
        result = ((result* 31)+((this.primaryLevlInd == null)? 0 :this.primaryLevlInd.hashCode()));
        result = ((result* 31)+((this.keyblckTermCode == null)? 0 :this.keyblckTermCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.gchgCode == null)? 0 :this.gchgCode.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.grdeCodeFinal == null)? 0 :this.grdeCodeFinal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CourseMaintenance100PostRequest) == false) {
            return false;
        }
        CourseMaintenance100PostRequest rhs = ((CourseMaintenance100PostRequest) other);
        return (((((((((((this.creditHours == rhs.creditHours)||((this.creditHours!= null)&&this.creditHours.equals(rhs.creditHours)))&&((this.gmodCode == rhs.gmodCode)||((this.gmodCode!= null)&&this.gmodCode.equals(rhs.gmodCode))))&&((this.primaryLevlInd == rhs.primaryLevlInd)||((this.primaryLevlInd!= null)&&this.primaryLevlInd.equals(rhs.primaryLevlInd))))&&((this.keyblckTermCode == rhs.keyblckTermCode)||((this.keyblckTermCode!= null)&&this.keyblckTermCode.equals(rhs.keyblckTermCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.gchgCode == rhs.gchgCode)||((this.gchgCode!= null)&&this.gchgCode.equals(rhs.gchgCode))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.grdeCodeFinal == rhs.grdeCodeFinal)||((this.grdeCodeFinal!= null)&&this.grdeCodeFinal.equals(rhs.grdeCodeFinal))));
    }

}
