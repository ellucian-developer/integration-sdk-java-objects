
package com.ellucian.generated.bpapi.ban.course_detail_information_corequisites_and_equivalents.v1_0_0;

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
    "crseNumbCorq",
    "endcopy",
    "subjCodeCorq"
})
@Generated("jsonschema2pojo")
public class Scrcorq__1 {

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCORQ_CRSE_NUMB_CORQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("crseNumbCorq")
    @JsonPropertyDescription("Lineage reference object : SCRCORQ_CRSE_NUMB_CORQ, Lookup lineage reference object : stvsubj")
    private String crseNumbCorq;
    @JsonProperty("endcopy")
    private String endcopy;
    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCORQ_SUBJ_CODE_CORQ, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeCorq")
    @JsonPropertyDescription("Lineage reference object : SCRCORQ_SUBJ_CODE_CORQ, Lookup lineage reference object : scbcrse,scbcrky")
    private String subjCodeCorq;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCORQ_CRSE_NUMB_CORQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("crseNumbCorq")
    public String getCrseNumbCorq() {
        return crseNumbCorq;
    }

    /**
     * Course
     * <p>
     * Lineage reference object : SCRCORQ_CRSE_NUMB_CORQ, Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("crseNumbCorq")
    public void setCrseNumbCorq(String crseNumbCorq) {
        this.crseNumbCorq = crseNumbCorq;
    }

    public Scrcorq__1 withCrseNumbCorq(String crseNumbCorq) {
        this.crseNumbCorq = crseNumbCorq;
        return this;
    }

    @JsonProperty("endcopy")
    public String getEndcopy() {
        return endcopy;
    }

    @JsonProperty("endcopy")
    public void setEndcopy(String endcopy) {
        this.endcopy = endcopy;
    }

    public Scrcorq__1 withEndcopy(String endcopy) {
        this.endcopy = endcopy;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCORQ_SUBJ_CODE_CORQ, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeCorq")
    public String getSubjCodeCorq() {
        return subjCodeCorq;
    }

    /**
     * Subject
     * <p>
     * Lineage reference object : SCRCORQ_SUBJ_CODE_CORQ, Lookup lineage reference object : scbcrse,scbcrky
     * (Required)
     * 
     */
    @JsonProperty("subjCodeCorq")
    public void setSubjCodeCorq(String subjCodeCorq) {
        this.subjCodeCorq = subjCodeCorq;
    }

    public Scrcorq__1 withSubjCodeCorq(String subjCodeCorq) {
        this.subjCodeCorq = subjCodeCorq;
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

    public Scrcorq__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrcorq__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crseNumbCorq");
        sb.append('=');
        sb.append(((this.crseNumbCorq == null)?"<null>":this.crseNumbCorq));
        sb.append(',');
        sb.append("endcopy");
        sb.append('=');
        sb.append(((this.endcopy == null)?"<null>":this.endcopy));
        sb.append(',');
        sb.append("subjCodeCorq");
        sb.append('=');
        sb.append(((this.subjCodeCorq == null)?"<null>":this.subjCodeCorq));
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
        result = ((result* 31)+((this.crseNumbCorq == null)? 0 :this.crseNumbCorq.hashCode()));
        result = ((result* 31)+((this.endcopy == null)? 0 :this.endcopy.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.subjCodeCorq == null)? 0 :this.subjCodeCorq.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrcorq__1) == false) {
            return false;
        }
        Scrcorq__1 rhs = ((Scrcorq__1) other);
        return (((((this.crseNumbCorq == rhs.crseNumbCorq)||((this.crseNumbCorq!= null)&&this.crseNumbCorq.equals(rhs.crseNumbCorq)))&&((this.endcopy == rhs.endcopy)||((this.endcopy!= null)&&this.endcopy.equals(rhs.endcopy))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.subjCodeCorq == rhs.subjCodeCorq)||((this.subjCodeCorq!= null)&&this.subjCodeCorq.equals(rhs.subjCodeCorq))));
    }

}
