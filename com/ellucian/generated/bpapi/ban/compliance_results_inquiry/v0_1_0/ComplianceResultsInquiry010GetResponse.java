
package com.ellucian.generated.bpapi.ban.compliance_results_inquiry.v0_1_0;

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
    "programDesc",
    "origDesc",
    "origName",
    "program",
    "termDesc",
    "termCodeCatlg",
    "origId",
    "origCode"
})
@Generated("jsonschema2pojo")
public class ComplianceResultsInquiry010GetResponse {

    @JsonProperty("programDesc")
    private String programDesc;
    @JsonProperty("origDesc")
    private String origDesc;
    @JsonProperty("origName")
    private String origName;
    /**
     * Program
     * <p>
     * Lineage reference object : SMBPOGN_PROGRAM
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : SMBPOGN_PROGRAM")
    private String program;
    @JsonProperty("termDesc")
    private String termDesc;
    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SMBPOGN_TERM_CODE_CATLG
     * 
     */
    @JsonProperty("termCodeCatlg")
    @JsonPropertyDescription("Lineage reference object : SMBPOGN_TERM_CODE_CATLG")
    private String termCodeCatlg;
    /**
     * Originator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("origId")
    private String origId;
    /**
     * Originator Code
     * <p>
     * 
     * 
     */
    @JsonProperty("origCode")
    private String origCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("programDesc")
    public String getProgramDesc() {
        return programDesc;
    }

    @JsonProperty("programDesc")
    public void setProgramDesc(String programDesc) {
        this.programDesc = programDesc;
    }

    public ComplianceResultsInquiry010GetResponse withProgramDesc(String programDesc) {
        this.programDesc = programDesc;
        return this;
    }

    @JsonProperty("origDesc")
    public String getOrigDesc() {
        return origDesc;
    }

    @JsonProperty("origDesc")
    public void setOrigDesc(String origDesc) {
        this.origDesc = origDesc;
    }

    public ComplianceResultsInquiry010GetResponse withOrigDesc(String origDesc) {
        this.origDesc = origDesc;
        return this;
    }

    @JsonProperty("origName")
    public String getOrigName() {
        return origName;
    }

    @JsonProperty("origName")
    public void setOrigName(String origName) {
        this.origName = origName;
    }

    public ComplianceResultsInquiry010GetResponse withOrigName(String origName) {
        this.origName = origName;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMBPOGN_PROGRAM
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SMBPOGN_PROGRAM
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public ComplianceResultsInquiry010GetResponse withProgram(String program) {
        this.program = program;
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

    public ComplianceResultsInquiry010GetResponse withTermDesc(String termDesc) {
        this.termDesc = termDesc;
        return this;
    }

    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SMBPOGN_TERM_CODE_CATLG
     * 
     */
    @JsonProperty("termCodeCatlg")
    public String getTermCodeCatlg() {
        return termCodeCatlg;
    }

    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SMBPOGN_TERM_CODE_CATLG
     * 
     */
    @JsonProperty("termCodeCatlg")
    public void setTermCodeCatlg(String termCodeCatlg) {
        this.termCodeCatlg = termCodeCatlg;
    }

    public ComplianceResultsInquiry010GetResponse withTermCodeCatlg(String termCodeCatlg) {
        this.termCodeCatlg = termCodeCatlg;
        return this;
    }

    /**
     * Originator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("origId")
    public String getOrigId() {
        return origId;
    }

    /**
     * Originator ID
     * <p>
     * 
     * 
     */
    @JsonProperty("origId")
    public void setOrigId(String origId) {
        this.origId = origId;
    }

    public ComplianceResultsInquiry010GetResponse withOrigId(String origId) {
        this.origId = origId;
        return this;
    }

    /**
     * Originator Code
     * <p>
     * 
     * 
     */
    @JsonProperty("origCode")
    public String getOrigCode() {
        return origCode;
    }

    /**
     * Originator Code
     * <p>
     * 
     * 
     */
    @JsonProperty("origCode")
    public void setOrigCode(String origCode) {
        this.origCode = origCode;
    }

    public ComplianceResultsInquiry010GetResponse withOrigCode(String origCode) {
        this.origCode = origCode;
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

    public ComplianceResultsInquiry010GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ComplianceResultsInquiry010GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("programDesc");
        sb.append('=');
        sb.append(((this.programDesc == null)?"<null>":this.programDesc));
        sb.append(',');
        sb.append("origDesc");
        sb.append('=');
        sb.append(((this.origDesc == null)?"<null>":this.origDesc));
        sb.append(',');
        sb.append("origName");
        sb.append('=');
        sb.append(((this.origName == null)?"<null>":this.origName));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("termDesc");
        sb.append('=');
        sb.append(((this.termDesc == null)?"<null>":this.termDesc));
        sb.append(',');
        sb.append("termCodeCatlg");
        sb.append('=');
        sb.append(((this.termCodeCatlg == null)?"<null>":this.termCodeCatlg));
        sb.append(',');
        sb.append("origId");
        sb.append('=');
        sb.append(((this.origId == null)?"<null>":this.origId));
        sb.append(',');
        sb.append("origCode");
        sb.append('=');
        sb.append(((this.origCode == null)?"<null>":this.origCode));
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
        result = ((result* 31)+((this.programDesc == null)? 0 :this.programDesc.hashCode()));
        result = ((result* 31)+((this.origDesc == null)? 0 :this.origDesc.hashCode()));
        result = ((result* 31)+((this.origName == null)? 0 :this.origName.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.termDesc == null)? 0 :this.termDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCodeCatlg == null)? 0 :this.termCodeCatlg.hashCode()));
        result = ((result* 31)+((this.origId == null)? 0 :this.origId.hashCode()));
        result = ((result* 31)+((this.origCode == null)? 0 :this.origCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComplianceResultsInquiry010GetResponse) == false) {
            return false;
        }
        ComplianceResultsInquiry010GetResponse rhs = ((ComplianceResultsInquiry010GetResponse) other);
        return ((((((((((this.programDesc == rhs.programDesc)||((this.programDesc!= null)&&this.programDesc.equals(rhs.programDesc)))&&((this.origDesc == rhs.origDesc)||((this.origDesc!= null)&&this.origDesc.equals(rhs.origDesc))))&&((this.origName == rhs.origName)||((this.origName!= null)&&this.origName.equals(rhs.origName))))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.termDesc == rhs.termDesc)||((this.termDesc!= null)&&this.termDesc.equals(rhs.termDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCodeCatlg == rhs.termCodeCatlg)||((this.termCodeCatlg!= null)&&this.termCodeCatlg.equals(rhs.termCodeCatlg))))&&((this.origId == rhs.origId)||((this.origId!= null)&&this.origId.equals(rhs.origId))))&&((this.origCode == rhs.origCode)||((this.origCode!= null)&&this.origCode.equals(rhs.origCode))));
    }

}
