
package com.ellucian.generated.bpapi.ban.curricula_summary_institutional_courses.v1_0_0;

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
    "degsCode",
    "id",
    "dgmrSeqNo",
    "viewCurrent"
})
@Generated("jsonschema2pojo")
public class CurriculaSummaryInstitutionalCourses100GetRequest {

    /**
     * Outcome Status
     * <p>
     * Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs
     * 
     */
    @JsonProperty("degsCode")
    @JsonPropertyDescription("Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs")
    private String degsCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private String id;
    /**
     * Degree Sequence
     * <p>
     * Lineage reference object : dgmrSeqNo
     * 
     */
    @JsonProperty("dgmrSeqNo")
    @JsonPropertyDescription("Lineage reference object : dgmrSeqNo")
    private Double dgmrSeqNo;
    /**
     * View Current/Active Curricula
     * <p>
     * Lineage reference object : viewCurrent
     * 
     */
    @JsonProperty("viewCurrent")
    @JsonPropertyDescription("Lineage reference object : viewCurrent")
    private String viewCurrent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Outcome Status
     * <p>
     * Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs
     * 
     */
    @JsonProperty("degsCode")
    public String getDegsCode() {
        return degsCode;
    }

    /**
     * Outcome Status
     * <p>
     * Lineage reference object : SHRDGMR_DEGS_CODE, Lookup lineage reference object : stvdegs
     * 
     */
    @JsonProperty("degsCode")
    public void setDegsCode(String degsCode) {
        this.degsCode = degsCode;
    }

    public CurriculaSummaryInstitutionalCourses100GetRequest withDegsCode(String degsCode) {
        this.degsCode = degsCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CurriculaSummaryInstitutionalCourses100GetRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Degree Sequence
     * <p>
     * Lineage reference object : dgmrSeqNo
     * 
     */
    @JsonProperty("dgmrSeqNo")
    public Double getDgmrSeqNo() {
        return dgmrSeqNo;
    }

    /**
     * Degree Sequence
     * <p>
     * Lineage reference object : dgmrSeqNo
     * 
     */
    @JsonProperty("dgmrSeqNo")
    public void setDgmrSeqNo(Double dgmrSeqNo) {
        this.dgmrSeqNo = dgmrSeqNo;
    }

    public CurriculaSummaryInstitutionalCourses100GetRequest withDgmrSeqNo(Double dgmrSeqNo) {
        this.dgmrSeqNo = dgmrSeqNo;
        return this;
    }

    /**
     * View Current/Active Curricula
     * <p>
     * Lineage reference object : viewCurrent
     * 
     */
    @JsonProperty("viewCurrent")
    public String getViewCurrent() {
        return viewCurrent;
    }

    /**
     * View Current/Active Curricula
     * <p>
     * Lineage reference object : viewCurrent
     * 
     */
    @JsonProperty("viewCurrent")
    public void setViewCurrent(String viewCurrent) {
        this.viewCurrent = viewCurrent;
    }

    public CurriculaSummaryInstitutionalCourses100GetRequest withViewCurrent(String viewCurrent) {
        this.viewCurrent = viewCurrent;
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

    public CurriculaSummaryInstitutionalCourses100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculaSummaryInstitutionalCourses100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("degsCode");
        sb.append('=');
        sb.append(((this.degsCode == null)?"<null>":this.degsCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("dgmrSeqNo");
        sb.append('=');
        sb.append(((this.dgmrSeqNo == null)?"<null>":this.dgmrSeqNo));
        sb.append(',');
        sb.append("viewCurrent");
        sb.append('=');
        sb.append(((this.viewCurrent == null)?"<null>":this.viewCurrent));
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
        result = ((result* 31)+((this.degsCode == null)? 0 :this.degsCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dgmrSeqNo == null)? 0 :this.dgmrSeqNo.hashCode()));
        result = ((result* 31)+((this.viewCurrent == null)? 0 :this.viewCurrent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculaSummaryInstitutionalCourses100GetRequest) == false) {
            return false;
        }
        CurriculaSummaryInstitutionalCourses100GetRequest rhs = ((CurriculaSummaryInstitutionalCourses100GetRequest) other);
        return ((((((this.degsCode == rhs.degsCode)||((this.degsCode!= null)&&this.degsCode.equals(rhs.degsCode)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dgmrSeqNo == rhs.dgmrSeqNo)||((this.dgmrSeqNo!= null)&&this.dgmrSeqNo.equals(rhs.dgmrSeqNo))))&&((this.viewCurrent == rhs.viewCurrent)||((this.viewCurrent!= null)&&this.viewCurrent.equals(rhs.viewCurrent))));
    }

}
