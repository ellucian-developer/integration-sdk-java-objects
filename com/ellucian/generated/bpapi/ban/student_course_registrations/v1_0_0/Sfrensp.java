
package com.ellucian.generated.bpapi.ban.student_course_registrations.v1_0_0;

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
    "estsCode",
    "regAllowed",
    "holdSpBlckCode",
    "processSpBlockInd",
    "spEstsDesc",
    "keySeqno"
})
@Generated("jsonschema2pojo")
public class Sfrensp {

    /**
     * Enrollment Status
     * <p>
     * Lineage reference object : SFRENSP_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    @JsonPropertyDescription("Lineage reference object : SFRENSP_ESTS_CODE, Lookup lineage reference object : stvests")
    private String estsCode;
    @JsonProperty("regAllowed")
    private String regAllowed;
    /**
     * Process Block
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSpBlckCode")
    private String holdSpBlckCode;
    @JsonProperty("processSpBlockInd")
    private String processSpBlockInd;
    /**
     * Enrollment Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("spEstsDesc")
    private String spEstsDesc;
    /**
     * Study Path
     * <p>
     * Lineage reference object : SFRENSP_KEY_SEQNO, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur
     * 
     */
    @JsonProperty("keySeqno")
    @JsonPropertyDescription("Lineage reference object : SFRENSP_KEY_SEQNO, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur")
    private Double keySeqno;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Enrollment Status
     * <p>
     * Lineage reference object : SFRENSP_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    public String getEstsCode() {
        return estsCode;
    }

    /**
     * Enrollment Status
     * <p>
     * Lineage reference object : SFRENSP_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    public void setEstsCode(String estsCode) {
        this.estsCode = estsCode;
    }

    public Sfrensp withEstsCode(String estsCode) {
        this.estsCode = estsCode;
        return this;
    }

    @JsonProperty("regAllowed")
    public String getRegAllowed() {
        return regAllowed;
    }

    @JsonProperty("regAllowed")
    public void setRegAllowed(String regAllowed) {
        this.regAllowed = regAllowed;
    }

    public Sfrensp withRegAllowed(String regAllowed) {
        this.regAllowed = regAllowed;
        return this;
    }

    /**
     * Process Block
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSpBlckCode")
    public String getHoldSpBlckCode() {
        return holdSpBlckCode;
    }

    /**
     * Process Block
     * <p>
     * 
     * 
     */
    @JsonProperty("holdSpBlckCode")
    public void setHoldSpBlckCode(String holdSpBlckCode) {
        this.holdSpBlckCode = holdSpBlckCode;
    }

    public Sfrensp withHoldSpBlckCode(String holdSpBlckCode) {
        this.holdSpBlckCode = holdSpBlckCode;
        return this;
    }

    @JsonProperty("processSpBlockInd")
    public String getProcessSpBlockInd() {
        return processSpBlockInd;
    }

    @JsonProperty("processSpBlockInd")
    public void setProcessSpBlockInd(String processSpBlockInd) {
        this.processSpBlockInd = processSpBlockInd;
    }

    public Sfrensp withProcessSpBlockInd(String processSpBlockInd) {
        this.processSpBlockInd = processSpBlockInd;
        return this;
    }

    /**
     * Enrollment Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("spEstsDesc")
    public String getSpEstsDesc() {
        return spEstsDesc;
    }

    /**
     * Enrollment Status Description
     * <p>
     * 
     * 
     */
    @JsonProperty("spEstsDesc")
    public void setSpEstsDesc(String spEstsDesc) {
        this.spEstsDesc = spEstsDesc;
    }

    public Sfrensp withSpEstsDesc(String spEstsDesc) {
        this.spEstsDesc = spEstsDesc;
        return this;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SFRENSP_KEY_SEQNO, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur
     * 
     */
    @JsonProperty("keySeqno")
    public Double getKeySeqno() {
        return keySeqno;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SFRENSP_KEY_SEQNO, Lookup lineage reference object : sovlcur,stvastd,stvcast,sgvstsp,sgrstsp,stvastd,stvcast,sgvstsp,sgrstsp,sovlcur
     * 
     */
    @JsonProperty("keySeqno")
    public void setKeySeqno(Double keySeqno) {
        this.keySeqno = keySeqno;
    }

    public Sfrensp withKeySeqno(Double keySeqno) {
        this.keySeqno = keySeqno;
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

    public Sfrensp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfrensp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("estsCode");
        sb.append('=');
        sb.append(((this.estsCode == null)?"<null>":this.estsCode));
        sb.append(',');
        sb.append("regAllowed");
        sb.append('=');
        sb.append(((this.regAllowed == null)?"<null>":this.regAllowed));
        sb.append(',');
        sb.append("holdSpBlckCode");
        sb.append('=');
        sb.append(((this.holdSpBlckCode == null)?"<null>":this.holdSpBlckCode));
        sb.append(',');
        sb.append("processSpBlockInd");
        sb.append('=');
        sb.append(((this.processSpBlockInd == null)?"<null>":this.processSpBlockInd));
        sb.append(',');
        sb.append("spEstsDesc");
        sb.append('=');
        sb.append(((this.spEstsDesc == null)?"<null>":this.spEstsDesc));
        sb.append(',');
        sb.append("keySeqno");
        sb.append('=');
        sb.append(((this.keySeqno == null)?"<null>":this.keySeqno));
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
        result = ((result* 31)+((this.estsCode == null)? 0 :this.estsCode.hashCode()));
        result = ((result* 31)+((this.regAllowed == null)? 0 :this.regAllowed.hashCode()));
        result = ((result* 31)+((this.holdSpBlckCode == null)? 0 :this.holdSpBlckCode.hashCode()));
        result = ((result* 31)+((this.processSpBlockInd == null)? 0 :this.processSpBlockInd.hashCode()));
        result = ((result* 31)+((this.spEstsDesc == null)? 0 :this.spEstsDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keySeqno == null)? 0 :this.keySeqno.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfrensp) == false) {
            return false;
        }
        Sfrensp rhs = ((Sfrensp) other);
        return ((((((((this.estsCode == rhs.estsCode)||((this.estsCode!= null)&&this.estsCode.equals(rhs.estsCode)))&&((this.regAllowed == rhs.regAllowed)||((this.regAllowed!= null)&&this.regAllowed.equals(rhs.regAllowed))))&&((this.holdSpBlckCode == rhs.holdSpBlckCode)||((this.holdSpBlckCode!= null)&&this.holdSpBlckCode.equals(rhs.holdSpBlckCode))))&&((this.processSpBlockInd == rhs.processSpBlockInd)||((this.processSpBlockInd!= null)&&this.processSpBlockInd.equals(rhs.processSpBlockInd))))&&((this.spEstsDesc == rhs.spEstsDesc)||((this.spEstsDesc!= null)&&this.spEstsDesc.equals(rhs.spEstsDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keySeqno == rhs.keySeqno)||((this.keySeqno!= null)&&this.keySeqno.equals(rhs.keySeqno))));
    }

}
