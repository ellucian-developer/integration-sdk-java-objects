
package com.ellucian.generated.bpapi.ban.schedule_override.v1_0_0;

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
    "deptDescription",
    "divsDescription",
    "topsCode",
    "divsCode",
    "topsDescription",
    "collDescription",
    "collCode",
    "deptCode"
})
@Generated("jsonschema2pojo")
public class ScheduleOverride100PutResponse {

    @JsonProperty("deptDescription")
    private String deptDescription;
    @JsonProperty("divsDescription")
    private String divsDescription;
    /**
     * Taxonomy of Program
     * <p>
     * Lineage reference object : SSBOVRR_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    @JsonPropertyDescription("Lineage reference object : SSBOVRR_TOPS_CODE, Lookup lineage reference object : stvtops")
    private String topsCode;
    /**
     * Division
     * <p>
     * Lineage reference object : SSBOVRR_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("divsCode")
    @JsonPropertyDescription("Lineage reference object : SSBOVRR_DIVS_CODE, Lookup lineage reference object : stvdivs")
    private String divsCode;
    @JsonProperty("topsDescription")
    private String topsDescription;
    @JsonProperty("collDescription")
    private String collDescription;
    /**
     * College
     * <p>
     * Lineage reference object : SSBOVRR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SSBOVRR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SSBOVRR_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SSBOVRR_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("deptDescription")
    public String getDeptDescription() {
        return deptDescription;
    }

    @JsonProperty("deptDescription")
    public void setDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
    }

    public ScheduleOverride100PutResponse withDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
        return this;
    }

    @JsonProperty("divsDescription")
    public String getDivsDescription() {
        return divsDescription;
    }

    @JsonProperty("divsDescription")
    public void setDivsDescription(String divsDescription) {
        this.divsDescription = divsDescription;
    }

    public ScheduleOverride100PutResponse withDivsDescription(String divsDescription) {
        this.divsDescription = divsDescription;
        return this;
    }

    /**
     * Taxonomy of Program
     * <p>
     * Lineage reference object : SSBOVRR_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    public String getTopsCode() {
        return topsCode;
    }

    /**
     * Taxonomy of Program
     * <p>
     * Lineage reference object : SSBOVRR_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    public void setTopsCode(String topsCode) {
        this.topsCode = topsCode;
    }

    public ScheduleOverride100PutResponse withTopsCode(String topsCode) {
        this.topsCode = topsCode;
        return this;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : SSBOVRR_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("divsCode")
    public String getDivsCode() {
        return divsCode;
    }

    /**
     * Division
     * <p>
     * Lineage reference object : SSBOVRR_DIVS_CODE, Lookup lineage reference object : stvdivs
     * 
     */
    @JsonProperty("divsCode")
    public void setDivsCode(String divsCode) {
        this.divsCode = divsCode;
    }

    public ScheduleOverride100PutResponse withDivsCode(String divsCode) {
        this.divsCode = divsCode;
        return this;
    }

    @JsonProperty("topsDescription")
    public String getTopsDescription() {
        return topsDescription;
    }

    @JsonProperty("topsDescription")
    public void setTopsDescription(String topsDescription) {
        this.topsDescription = topsDescription;
    }

    public ScheduleOverride100PutResponse withTopsDescription(String topsDescription) {
        this.topsDescription = topsDescription;
        return this;
    }

    @JsonProperty("collDescription")
    public String getCollDescription() {
        return collDescription;
    }

    @JsonProperty("collDescription")
    public void setCollDescription(String collDescription) {
        this.collDescription = collDescription;
    }

    public ScheduleOverride100PutResponse withCollDescription(String collDescription) {
        this.collDescription = collDescription;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SSBOVRR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SSBOVRR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public ScheduleOverride100PutResponse withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SSBOVRR_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SSBOVRR_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public ScheduleOverride100PutResponse withDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public ScheduleOverride100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleOverride100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("deptDescription");
        sb.append('=');
        sb.append(((this.deptDescription == null)?"<null>":this.deptDescription));
        sb.append(',');
        sb.append("divsDescription");
        sb.append('=');
        sb.append(((this.divsDescription == null)?"<null>":this.divsDescription));
        sb.append(',');
        sb.append("topsCode");
        sb.append('=');
        sb.append(((this.topsCode == null)?"<null>":this.topsCode));
        sb.append(',');
        sb.append("divsCode");
        sb.append('=');
        sb.append(((this.divsCode == null)?"<null>":this.divsCode));
        sb.append(',');
        sb.append("topsDescription");
        sb.append('=');
        sb.append(((this.topsDescription == null)?"<null>":this.topsDescription));
        sb.append(',');
        sb.append("collDescription");
        sb.append('=');
        sb.append(((this.collDescription == null)?"<null>":this.collDescription));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
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
        result = ((result* 31)+((this.deptDescription == null)? 0 :this.deptDescription.hashCode()));
        result = ((result* 31)+((this.divsDescription == null)? 0 :this.divsDescription.hashCode()));
        result = ((result* 31)+((this.topsCode == null)? 0 :this.topsCode.hashCode()));
        result = ((result* 31)+((this.divsCode == null)? 0 :this.divsCode.hashCode()));
        result = ((result* 31)+((this.topsDescription == null)? 0 :this.topsDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collDescription == null)? 0 :this.collDescription.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleOverride100PutResponse) == false) {
            return false;
        }
        ScheduleOverride100PutResponse rhs = ((ScheduleOverride100PutResponse) other);
        return ((((((((((this.deptDescription == rhs.deptDescription)||((this.deptDescription!= null)&&this.deptDescription.equals(rhs.deptDescription)))&&((this.divsDescription == rhs.divsDescription)||((this.divsDescription!= null)&&this.divsDescription.equals(rhs.divsDescription))))&&((this.topsCode == rhs.topsCode)||((this.topsCode!= null)&&this.topsCode.equals(rhs.topsCode))))&&((this.divsCode == rhs.divsCode)||((this.divsCode!= null)&&this.divsCode.equals(rhs.divsCode))))&&((this.topsDescription == rhs.topsDescription)||((this.topsDescription!= null)&&this.topsDescription.equals(rhs.topsDescription))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collDescription == rhs.collDescription)||((this.collDescription!= null)&&this.collDescription.equals(rhs.collDescription))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
