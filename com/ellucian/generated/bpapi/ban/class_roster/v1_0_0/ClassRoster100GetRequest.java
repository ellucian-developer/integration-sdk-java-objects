
package com.ellucian.generated.bpapi.ban.class_roster.v1_0_0;

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
    "ssbsectCrnt",
    "ssbsectDegsAwrdInd",
    "ssbsectTermCodet",
    "rollIndicator"
})
@Generated("jsonschema2pojo")
public class ClassRoster100GetRequest {

    /**
     * CRN
     * <p>
     * Lineage reference object : ssbsectCrnt
     * 
     */
    @JsonProperty("ssbsectCrnt")
    @JsonPropertyDescription("Lineage reference object : ssbsectCrnt")
    private String ssbsectCrnt;
    /**
     * Degree Award Status
     * <p>
     * Lineage reference object : ssbsectDegsAwrdInd
     * 
     */
    @JsonProperty("ssbsectDegsAwrdInd")
    @JsonPropertyDescription("Lineage reference object : ssbsectDegsAwrdInd")
    private String ssbsectDegsAwrdInd;
    /**
     * Term
     * <p>
     * Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssbsectTermCodet")
    @JsonPropertyDescription("Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm")
    private String ssbsectTermCodet;
    /**
     * Roll
     * <p>
     * Lineage reference object : rollIndicator
     * 
     */
    @JsonProperty("rollIndicator")
    @JsonPropertyDescription("Lineage reference object : rollIndicator")
    private String rollIndicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * CRN
     * <p>
     * Lineage reference object : ssbsectCrnt
     * 
     */
    @JsonProperty("ssbsectCrnt")
    public String getSsbsectCrnt() {
        return ssbsectCrnt;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : ssbsectCrnt
     * 
     */
    @JsonProperty("ssbsectCrnt")
    public void setSsbsectCrnt(String ssbsectCrnt) {
        this.ssbsectCrnt = ssbsectCrnt;
    }

    public ClassRoster100GetRequest withSsbsectCrnt(String ssbsectCrnt) {
        this.ssbsectCrnt = ssbsectCrnt;
        return this;
    }

    /**
     * Degree Award Status
     * <p>
     * Lineage reference object : ssbsectDegsAwrdInd
     * 
     */
    @JsonProperty("ssbsectDegsAwrdInd")
    public String getSsbsectDegsAwrdInd() {
        return ssbsectDegsAwrdInd;
    }

    /**
     * Degree Award Status
     * <p>
     * Lineage reference object : ssbsectDegsAwrdInd
     * 
     */
    @JsonProperty("ssbsectDegsAwrdInd")
    public void setSsbsectDegsAwrdInd(String ssbsectDegsAwrdInd) {
        this.ssbsectDegsAwrdInd = ssbsectDegsAwrdInd;
    }

    public ClassRoster100GetRequest withSsbsectDegsAwrdInd(String ssbsectDegsAwrdInd) {
        this.ssbsectDegsAwrdInd = ssbsectDegsAwrdInd;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssbsectTermCodet")
    public String getSsbsectTermCodet() {
        return ssbsectTermCodet;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : ssbsectTermCodet, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("ssbsectTermCodet")
    public void setSsbsectTermCodet(String ssbsectTermCodet) {
        this.ssbsectTermCodet = ssbsectTermCodet;
    }

    public ClassRoster100GetRequest withSsbsectTermCodet(String ssbsectTermCodet) {
        this.ssbsectTermCodet = ssbsectTermCodet;
        return this;
    }

    /**
     * Roll
     * <p>
     * Lineage reference object : rollIndicator
     * 
     */
    @JsonProperty("rollIndicator")
    public String getRollIndicator() {
        return rollIndicator;
    }

    /**
     * Roll
     * <p>
     * Lineage reference object : rollIndicator
     * 
     */
    @JsonProperty("rollIndicator")
    public void setRollIndicator(String rollIndicator) {
        this.rollIndicator = rollIndicator;
    }

    public ClassRoster100GetRequest withRollIndicator(String rollIndicator) {
        this.rollIndicator = rollIndicator;
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

    public ClassRoster100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClassRoster100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ssbsectCrnt");
        sb.append('=');
        sb.append(((this.ssbsectCrnt == null)?"<null>":this.ssbsectCrnt));
        sb.append(',');
        sb.append("ssbsectDegsAwrdInd");
        sb.append('=');
        sb.append(((this.ssbsectDegsAwrdInd == null)?"<null>":this.ssbsectDegsAwrdInd));
        sb.append(',');
        sb.append("ssbsectTermCodet");
        sb.append('=');
        sb.append(((this.ssbsectTermCodet == null)?"<null>":this.ssbsectTermCodet));
        sb.append(',');
        sb.append("rollIndicator");
        sb.append('=');
        sb.append(((this.rollIndicator == null)?"<null>":this.rollIndicator));
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
        result = ((result* 31)+((this.ssbsectDegsAwrdInd == null)? 0 :this.ssbsectDegsAwrdInd.hashCode()));
        result = ((result* 31)+((this.ssbsectCrnt == null)? 0 :this.ssbsectCrnt.hashCode()));
        result = ((result* 31)+((this.ssbsectTermCodet == null)? 0 :this.ssbsectTermCodet.hashCode()));
        result = ((result* 31)+((this.rollIndicator == null)? 0 :this.rollIndicator.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassRoster100GetRequest) == false) {
            return false;
        }
        ClassRoster100GetRequest rhs = ((ClassRoster100GetRequest) other);
        return ((((((this.ssbsectDegsAwrdInd == rhs.ssbsectDegsAwrdInd)||((this.ssbsectDegsAwrdInd!= null)&&this.ssbsectDegsAwrdInd.equals(rhs.ssbsectDegsAwrdInd)))&&((this.ssbsectCrnt == rhs.ssbsectCrnt)||((this.ssbsectCrnt!= null)&&this.ssbsectCrnt.equals(rhs.ssbsectCrnt))))&&((this.ssbsectTermCodet == rhs.ssbsectTermCodet)||((this.ssbsectTermCodet!= null)&&this.ssbsectTermCodet.equals(rhs.ssbsectTermCodet))))&&((this.rollIndicator == rhs.rollIndicator)||((this.rollIndicator!= null)&&this.rollIndicator.equals(rhs.rollIndicator))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
