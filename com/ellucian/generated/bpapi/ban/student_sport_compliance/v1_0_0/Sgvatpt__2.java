
package com.ellucian.generated.bpapi.ban.student_sport_compliance.v1_0_0;

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
    "stdnStstDesc",
    "ctrlProspectInd",
    "ctrlApplInd",
    "termDesc",
    "ctrlStudentInd",
    "termCode"
})
@Generated("jsonschema2pojo")
public class Sgvatpt__2 {

    /**
     * Student Status
     * <p>
     * 
     * 
     */
    @JsonProperty("stdnStstDesc")
    private String stdnStstDesc;
    @JsonProperty("ctrlProspectInd")
    private String ctrlProspectInd;
    @JsonProperty("ctrlApplInd")
    private String ctrlApplInd;
    @JsonProperty("termDesc")
    private String termDesc;
    @JsonProperty("ctrlStudentInd")
    private String ctrlStudentInd;
    /**
     * Term
     * <p>
     * Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Student Status
     * <p>
     * 
     * 
     */
    @JsonProperty("stdnStstDesc")
    public String getStdnStstDesc() {
        return stdnStstDesc;
    }

    /**
     * Student Status
     * <p>
     * 
     * 
     */
    @JsonProperty("stdnStstDesc")
    public void setStdnStstDesc(String stdnStstDesc) {
        this.stdnStstDesc = stdnStstDesc;
    }

    public Sgvatpt__2 withStdnStstDesc(String stdnStstDesc) {
        this.stdnStstDesc = stdnStstDesc;
        return this;
    }

    @JsonProperty("ctrlProspectInd")
    public String getCtrlProspectInd() {
        return ctrlProspectInd;
    }

    @JsonProperty("ctrlProspectInd")
    public void setCtrlProspectInd(String ctrlProspectInd) {
        this.ctrlProspectInd = ctrlProspectInd;
    }

    public Sgvatpt__2 withCtrlProspectInd(String ctrlProspectInd) {
        this.ctrlProspectInd = ctrlProspectInd;
        return this;
    }

    @JsonProperty("ctrlApplInd")
    public String getCtrlApplInd() {
        return ctrlApplInd;
    }

    @JsonProperty("ctrlApplInd")
    public void setCtrlApplInd(String ctrlApplInd) {
        this.ctrlApplInd = ctrlApplInd;
    }

    public Sgvatpt__2 withCtrlApplInd(String ctrlApplInd) {
        this.ctrlApplInd = ctrlApplInd;
        return this;
    }

    @JsonProperty("termDesc")
    public String getTermDesc() {
        return termDesc;
    }

    @JsonProperty("termDesc")
    public void setTermDesc(String termDesc) {
        this.termDesc = termDesc;
    }

    public Sgvatpt__2 withTermDesc(String termDesc) {
        this.termDesc = termDesc;
        return this;
    }

    @JsonProperty("ctrlStudentInd")
    public String getCtrlStudentInd() {
        return ctrlStudentInd;
    }

    @JsonProperty("ctrlStudentInd")
    public void setCtrlStudentInd(String ctrlStudentInd) {
        this.ctrlStudentInd = ctrlStudentInd;
    }

    public Sgvatpt__2 withCtrlStudentInd(String ctrlStudentInd) {
        this.ctrlStudentInd = ctrlStudentInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SGVATPT_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public Sgvatpt__2 withTermCode(String termCode) {
        this.termCode = termCode;
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

    public Sgvatpt__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sgvatpt__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stdnStstDesc");
        sb.append('=');
        sb.append(((this.stdnStstDesc == null)?"<null>":this.stdnStstDesc));
        sb.append(',');
        sb.append("ctrlProspectInd");
        sb.append('=');
        sb.append(((this.ctrlProspectInd == null)?"<null>":this.ctrlProspectInd));
        sb.append(',');
        sb.append("ctrlApplInd");
        sb.append('=');
        sb.append(((this.ctrlApplInd == null)?"<null>":this.ctrlApplInd));
        sb.append(',');
        sb.append("termDesc");
        sb.append('=');
        sb.append(((this.termDesc == null)?"<null>":this.termDesc));
        sb.append(',');
        sb.append("ctrlStudentInd");
        sb.append('=');
        sb.append(((this.ctrlStudentInd == null)?"<null>":this.ctrlStudentInd));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.stdnStstDesc == null)? 0 :this.stdnStstDesc.hashCode()));
        result = ((result* 31)+((this.ctrlProspectInd == null)? 0 :this.ctrlProspectInd.hashCode()));
        result = ((result* 31)+((this.ctrlApplInd == null)? 0 :this.ctrlApplInd.hashCode()));
        result = ((result* 31)+((this.termDesc == null)? 0 :this.termDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ctrlStudentInd == null)? 0 :this.ctrlStudentInd.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sgvatpt__2) == false) {
            return false;
        }
        Sgvatpt__2 rhs = ((Sgvatpt__2) other);
        return ((((((((this.stdnStstDesc == rhs.stdnStstDesc)||((this.stdnStstDesc!= null)&&this.stdnStstDesc.equals(rhs.stdnStstDesc)))&&((this.ctrlProspectInd == rhs.ctrlProspectInd)||((this.ctrlProspectInd!= null)&&this.ctrlProspectInd.equals(rhs.ctrlProspectInd))))&&((this.ctrlApplInd == rhs.ctrlApplInd)||((this.ctrlApplInd!= null)&&this.ctrlApplInd.equals(rhs.ctrlApplInd))))&&((this.termDesc == rhs.termDesc)||((this.termDesc!= null)&&this.termDesc.equals(rhs.termDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ctrlStudentInd == rhs.ctrlStudentInd)||((this.ctrlStudentInd!= null)&&this.ctrlStudentInd.equals(rhs.ctrlStudentInd))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
