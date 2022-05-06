
package com.ellucian.generated.bpapi.ban.transfer_articulation_evaluation.v1_0_0;

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
    "tramSeq",
    "credHours",
    "tgrdCode",
    "keyblocSbgiCode",
    "jgroup",
    "tsubjCode",
    "id",
    "keyblocProgram",
    "levlCode",
    "termCode",
    "tcrseNumb"
})
@Generated("jsonschema2pojo")
public class TransferArticulationEvaluation100PostRequest {

    /**
     * Attendance Period
     * <p>
     * 
     * 
     */
    @JsonProperty("tramSeq")
    private String tramSeq;
    /**
     * Transfer Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("credHours")
    private Double credHours;
    /**
     * Transfer Grade
     * <p>
     * Lookup lineage reference object : shrtgrd
     * 
     */
    @JsonProperty("tgrdCode")
    @JsonPropertyDescription("Lookup lineage reference object : shrtgrd")
    private String tgrdCode;
    /**
     * Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode
     * 
     */
    @JsonProperty("keyblocSbgiCode")
    @JsonPropertyDescription("Lineage reference object : keyblocSbgiCode")
    private Object keyblocSbgiCode;
    /**
     * Transfer Group
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("jgroup")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String jgroup;
    /**
     * Transfer Subject
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tsubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String tsubjCode;
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
     * Program
     * <p>
     * Lineage reference object : keyblocProgram
     * 
     */
    @JsonProperty("keyblocProgram")
    @JsonPropertyDescription("Lineage reference object : keyblocProgram")
    private Object keyblocProgram;
    /**
     * Level
     * <p>
     * Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * 
     */
    @JsonProperty("levlCode")
    @JsonPropertyDescription("Lookup lineage reference object : sorbtal,stvtlvl,sorbtal")
    private String levlCode;
    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termCode")
    private String termCode;
    /**
     * Transfer Course
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tcrseNumb")
    @JsonPropertyDescription("Lookup lineage reference object : shbtatc")
    private String tcrseNumb;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attendance Period
     * <p>
     * 
     * 
     */
    @JsonProperty("tramSeq")
    public String getTramSeq() {
        return tramSeq;
    }

    /**
     * Attendance Period
     * <p>
     * 
     * 
     */
    @JsonProperty("tramSeq")
    public void setTramSeq(String tramSeq) {
        this.tramSeq = tramSeq;
    }

    public TransferArticulationEvaluation100PostRequest withTramSeq(String tramSeq) {
        this.tramSeq = tramSeq;
        return this;
    }

    /**
     * Transfer Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("credHours")
    public Double getCredHours() {
        return credHours;
    }

    /**
     * Transfer Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("credHours")
    public void setCredHours(Double credHours) {
        this.credHours = credHours;
    }

    public TransferArticulationEvaluation100PostRequest withCredHours(Double credHours) {
        this.credHours = credHours;
        return this;
    }

    /**
     * Transfer Grade
     * <p>
     * Lookup lineage reference object : shrtgrd
     * 
     */
    @JsonProperty("tgrdCode")
    public String getTgrdCode() {
        return tgrdCode;
    }

    /**
     * Transfer Grade
     * <p>
     * Lookup lineage reference object : shrtgrd
     * 
     */
    @JsonProperty("tgrdCode")
    public void setTgrdCode(String tgrdCode) {
        this.tgrdCode = tgrdCode;
    }

    public TransferArticulationEvaluation100PostRequest withTgrdCode(String tgrdCode) {
        this.tgrdCode = tgrdCode;
        return this;
    }

    /**
     * Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode
     * 
     */
    @JsonProperty("keyblocSbgiCode")
    public Object getKeyblocSbgiCode() {
        return keyblocSbgiCode;
    }

    /**
     * Institution
     * <p>
     * Lineage reference object : keyblocSbgiCode
     * 
     */
    @JsonProperty("keyblocSbgiCode")
    public void setKeyblocSbgiCode(Object keyblocSbgiCode) {
        this.keyblocSbgiCode = keyblocSbgiCode;
    }

    public TransferArticulationEvaluation100PostRequest withKeyblocSbgiCode(Object keyblocSbgiCode) {
        this.keyblocSbgiCode = keyblocSbgiCode;
        return this;
    }

    /**
     * Transfer Group
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("jgroup")
    public String getJgroup() {
        return jgroup;
    }

    /**
     * Transfer Group
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("jgroup")
    public void setJgroup(String jgroup) {
        this.jgroup = jgroup;
    }

    public TransferArticulationEvaluation100PostRequest withJgroup(String jgroup) {
        this.jgroup = jgroup;
        return this;
    }

    /**
     * Transfer Subject
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tsubjCode")
    public String getTsubjCode() {
        return tsubjCode;
    }

    /**
     * Transfer Subject
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tsubjCode")
    public void setTsubjCode(String tsubjCode) {
        this.tsubjCode = tsubjCode;
    }

    public TransferArticulationEvaluation100PostRequest withTsubjCode(String tsubjCode) {
        this.tsubjCode = tsubjCode;
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

    public TransferArticulationEvaluation100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgram
     * 
     */
    @JsonProperty("keyblocProgram")
    public Object getKeyblocProgram() {
        return keyblocProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : keyblocProgram
     * 
     */
    @JsonProperty("keyblocProgram")
    public void setKeyblocProgram(Object keyblocProgram) {
        this.keyblocProgram = keyblocProgram;
    }

    public TransferArticulationEvaluation100PostRequest withKeyblocProgram(Object keyblocProgram) {
        this.keyblocProgram = keyblocProgram;
        return this;
    }

    /**
     * Level
     * <p>
     * Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * 
     */
    @JsonProperty("levlCode")
    public String getLevlCode() {
        return levlCode;
    }

    /**
     * Level
     * <p>
     * Lookup lineage reference object : sorbtal,stvtlvl,sorbtal
     * 
     */
    @JsonProperty("levlCode")
    public void setLevlCode(String levlCode) {
        this.levlCode = levlCode;
    }

    public TransferArticulationEvaluation100PostRequest withLevlCode(String levlCode) {
        this.levlCode = levlCode;
        return this;
    }

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term
     * <p>
     * 
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public TransferArticulationEvaluation100PostRequest withTermCode(String termCode) {
        this.termCode = termCode;
        return this;
    }

    /**
     * Transfer Course
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tcrseNumb")
    public String getTcrseNumb() {
        return tcrseNumb;
    }

    /**
     * Transfer Course
     * <p>
     * Lookup lineage reference object : shbtatc
     * 
     */
    @JsonProperty("tcrseNumb")
    public void setTcrseNumb(String tcrseNumb) {
        this.tcrseNumb = tcrseNumb;
    }

    public TransferArticulationEvaluation100PostRequest withTcrseNumb(String tcrseNumb) {
        this.tcrseNumb = tcrseNumb;
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

    public TransferArticulationEvaluation100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferArticulationEvaluation100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tramSeq");
        sb.append('=');
        sb.append(((this.tramSeq == null)?"<null>":this.tramSeq));
        sb.append(',');
        sb.append("credHours");
        sb.append('=');
        sb.append(((this.credHours == null)?"<null>":this.credHours));
        sb.append(',');
        sb.append("tgrdCode");
        sb.append('=');
        sb.append(((this.tgrdCode == null)?"<null>":this.tgrdCode));
        sb.append(',');
        sb.append("keyblocSbgiCode");
        sb.append('=');
        sb.append(((this.keyblocSbgiCode == null)?"<null>":this.keyblocSbgiCode));
        sb.append(',');
        sb.append("jgroup");
        sb.append('=');
        sb.append(((this.jgroup == null)?"<null>":this.jgroup));
        sb.append(',');
        sb.append("tsubjCode");
        sb.append('=');
        sb.append(((this.tsubjCode == null)?"<null>":this.tsubjCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblocProgram");
        sb.append('=');
        sb.append(((this.keyblocProgram == null)?"<null>":this.keyblocProgram));
        sb.append(',');
        sb.append("levlCode");
        sb.append('=');
        sb.append(((this.levlCode == null)?"<null>":this.levlCode));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
        sb.append(',');
        sb.append("tcrseNumb");
        sb.append('=');
        sb.append(((this.tcrseNumb == null)?"<null>":this.tcrseNumb));
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
        result = ((result* 31)+((this.credHours == null)? 0 :this.credHours.hashCode()));
        result = ((result* 31)+((this.tgrdCode == null)? 0 :this.tgrdCode.hashCode()));
        result = ((result* 31)+((this.keyblocSbgiCode == null)? 0 :this.keyblocSbgiCode.hashCode()));
        result = ((result* 31)+((this.keyblocProgram == null)? 0 :this.keyblocProgram.hashCode()));
        result = ((result* 31)+((this.tramSeq == null)? 0 :this.tramSeq.hashCode()));
        result = ((result* 31)+((this.jgroup == null)? 0 :this.jgroup.hashCode()));
        result = ((result* 31)+((this.tsubjCode == null)? 0 :this.tsubjCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.levlCode == null)? 0 :this.levlCode.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        result = ((result* 31)+((this.tcrseNumb == null)? 0 :this.tcrseNumb.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransferArticulationEvaluation100PostRequest) == false) {
            return false;
        }
        TransferArticulationEvaluation100PostRequest rhs = ((TransferArticulationEvaluation100PostRequest) other);
        return (((((((((((((this.credHours == rhs.credHours)||((this.credHours!= null)&&this.credHours.equals(rhs.credHours)))&&((this.tgrdCode == rhs.tgrdCode)||((this.tgrdCode!= null)&&this.tgrdCode.equals(rhs.tgrdCode))))&&((this.keyblocSbgiCode == rhs.keyblocSbgiCode)||((this.keyblocSbgiCode!= null)&&this.keyblocSbgiCode.equals(rhs.keyblocSbgiCode))))&&((this.keyblocProgram == rhs.keyblocProgram)||((this.keyblocProgram!= null)&&this.keyblocProgram.equals(rhs.keyblocProgram))))&&((this.tramSeq == rhs.tramSeq)||((this.tramSeq!= null)&&this.tramSeq.equals(rhs.tramSeq))))&&((this.jgroup == rhs.jgroup)||((this.jgroup!= null)&&this.jgroup.equals(rhs.jgroup))))&&((this.tsubjCode == rhs.tsubjCode)||((this.tsubjCode!= null)&&this.tsubjCode.equals(rhs.tsubjCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.levlCode == rhs.levlCode)||((this.levlCode!= null)&&this.levlCode.equals(rhs.levlCode))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))))&&((this.tcrseNumb == rhs.tcrseNumb)||((this.tcrseNumb!= null)&&this.tcrseNumb.equals(rhs.tcrseNumb))));
    }

}
