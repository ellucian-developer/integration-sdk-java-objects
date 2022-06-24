
package com.ellucian.generated.bpapi.ban.class_attendance_roster.v1_0_0;

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
    "ssbsectTermCodet"
})
@Generated("jsonschema2pojo")
public class ClassAttendanceRoster100GetRequest {

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

    public ClassAttendanceRoster100GetRequest withSsbsectCrnt(String ssbsectCrnt) {
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

    public ClassAttendanceRoster100GetRequest withSsbsectDegsAwrdInd(String ssbsectDegsAwrdInd) {
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

    public ClassAttendanceRoster100GetRequest withSsbsectTermCodet(String ssbsectTermCodet) {
        this.ssbsectTermCodet = ssbsectTermCodet;
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

    public ClassAttendanceRoster100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClassAttendanceRoster100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClassAttendanceRoster100GetRequest) == false) {
            return false;
        }
        ClassAttendanceRoster100GetRequest rhs = ((ClassAttendanceRoster100GetRequest) other);
        return (((((this.ssbsectDegsAwrdInd == rhs.ssbsectDegsAwrdInd)||((this.ssbsectDegsAwrdInd!= null)&&this.ssbsectDegsAwrdInd.equals(rhs.ssbsectDegsAwrdInd)))&&((this.ssbsectCrnt == rhs.ssbsectCrnt)||((this.ssbsectCrnt!= null)&&this.ssbsectCrnt.equals(rhs.ssbsectCrnt))))&&((this.ssbsectTermCodet == rhs.ssbsectTermCodet)||((this.ssbsectTermCodet!= null)&&this.ssbsectTermCodet.equals(rhs.ssbsectTermCodet))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
