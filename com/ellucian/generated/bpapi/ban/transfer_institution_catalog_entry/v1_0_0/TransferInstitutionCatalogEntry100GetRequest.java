
package com.ellucian.generated.bpapi.ban.transfer_institution_catalog_entry.v1_0_0;

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
    "sbgiCode",
    "program",
    "sbgiCodeDef"
})
@Generated("jsonschema2pojo")
public class TransferInstitutionCatalogEntry100GetRequest {

    /**
     * Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : keyblocSbgiCode, Lookup lineage reference object : stvsbgi")
    private String sbgiCode;
    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgram, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    @JsonPropertyDescription("Lineage reference object : keyblocProgram, Lookup lineage reference object : smrprle")
    private String program;
    /**
     * Default Institution
     * <p>
     * Lineage reference object : keyblocSbgiCodeDef, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCodeDef")
    @JsonPropertyDescription("Lineage reference object : keyblocSbgiCodeDef, Lookup lineage reference object : stvsbgi")
    private String sbgiCodeDef;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public TransferInstitutionCatalogEntry100GetRequest withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgram, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgram, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    public TransferInstitutionCatalogEntry100GetRequest withProgram(String program) {
        this.program = program;
        return this;
    }

    /**
     * Default Institution
     * <p>
     * Lineage reference object : keyblocSbgiCodeDef, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCodeDef")
    public String getSbgiCodeDef() {
        return sbgiCodeDef;
    }

    /**
     * Default Institution
     * <p>
     * Lineage reference object : keyblocSbgiCodeDef, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCodeDef")
    public void setSbgiCodeDef(String sbgiCodeDef) {
        this.sbgiCodeDef = sbgiCodeDef;
    }

    public TransferInstitutionCatalogEntry100GetRequest withSbgiCodeDef(String sbgiCodeDef) {
        this.sbgiCodeDef = sbgiCodeDef;
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

    public TransferInstitutionCatalogEntry100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferInstitutionCatalogEntry100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("program");
        sb.append('=');
        sb.append(((this.program == null)?"<null>":this.program));
        sb.append(',');
        sb.append("sbgiCodeDef");
        sb.append('=');
        sb.append(((this.sbgiCodeDef == null)?"<null>":this.sbgiCodeDef));
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
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.program == null)? 0 :this.program.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sbgiCodeDef == null)? 0 :this.sbgiCodeDef.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransferInstitutionCatalogEntry100GetRequest) == false) {
            return false;
        }
        TransferInstitutionCatalogEntry100GetRequest rhs = ((TransferInstitutionCatalogEntry100GetRequest) other);
        return (((((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode)))&&((this.program == rhs.program)||((this.program!= null)&&this.program.equals(rhs.program))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sbgiCodeDef == rhs.sbgiCodeDef)||((this.sbgiCodeDef!= null)&&this.sbgiCodeDef.equals(rhs.sbgiCodeDef))));
    }

}
