
package com.ellucian.generated.bpapi.ban.faculty_assignment.v1_0_0;

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
    "nistDesc",
    "compensationAppliedCbox",
    "topsCode",
    "nistCode",
    "fcntCode",
    "nistWorkload",
    "compensationExtractedCbox",
    "posn",
    "suff",
    "weeklyHrs",
    "fte",
    "collCode",
    "astyCode",
    "deptCode"
})
@Generated("jsonschema2pojo")
public class Sirnist {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("nistDesc")
    private String nistDesc;
    @JsonProperty("compensationAppliedCbox")
    private String compensationAppliedCbox;
    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops")
    private String topsCode;
    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("nistCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist")
    private String nistCode;
    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt")
    private String fcntCode;
    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("nistWorkload")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_NIST_WORKLOAD")
    private Double nistWorkload;
    @JsonProperty("compensationExtractedCbox")
    private String compensationExtractedCbox;
    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_POSN")
    private String posn;
    /**
     * Position Suffix
     * <p>
     * Lineage reference object : SIRNIST_SUFF
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_SUFF")
    private String suff;
    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("weeklyHrs")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_WEEKLY_HRS")
    private Double weeklyHrs;
    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("fte")
    private Double fte;
    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty")
    private String astyCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("nistDesc")
    public String getNistDesc() {
        return nistDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("nistDesc")
    public void setNistDesc(String nistDesc) {
        this.nistDesc = nistDesc;
    }

    public Sirnist withNistDesc(String nistDesc) {
        this.nistDesc = nistDesc;
        return this;
    }

    @JsonProperty("compensationAppliedCbox")
    public String getCompensationAppliedCbox() {
        return compensationAppliedCbox;
    }

    @JsonProperty("compensationAppliedCbox")
    public void setCompensationAppliedCbox(String compensationAppliedCbox) {
        this.compensationAppliedCbox = compensationAppliedCbox;
    }

    public Sirnist withCompensationAppliedCbox(String compensationAppliedCbox) {
        this.compensationAppliedCbox = compensationAppliedCbox;
        return this;
    }

    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    public String getTopsCode() {
        return topsCode;
    }

    /**
     * TOPS
     * <p>
     * Lineage reference object : SIRNIST_TOPS_CODE, Lookup lineage reference object : stvtops
     * 
     */
    @JsonProperty("topsCode")
    public void setTopsCode(String topsCode) {
        this.topsCode = topsCode;
    }

    public Sirnist withTopsCode(String topsCode) {
        this.topsCode = topsCode;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("nistCode")
    public String getNistCode() {
        return nistCode;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : SIRNIST_NIST_CODE, Lookup lineage reference object : stvnist
     * 
     */
    @JsonProperty("nistCode")
    public void setNistCode(String nistCode) {
        this.nistCode = nistCode;
    }

    public Sirnist withNistCode(String nistCode) {
        this.nistCode = nistCode;
        return this;
    }

    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    public String getFcntCode() {
        return fcntCode;
    }

    /**
     * Contract
     * <p>
     * Lineage reference object : SIRNIST_FCNT_CODE, Lookup lineage reference object : stvfcnt,siricnt,siricnt
     * 
     */
    @JsonProperty("fcntCode")
    public void setFcntCode(String fcntCode) {
        this.fcntCode = fcntCode;
    }

    public Sirnist withFcntCode(String fcntCode) {
        this.fcntCode = fcntCode;
        return this;
    }

    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("nistWorkload")
    public Double getNistWorkload() {
        return nistWorkload;
    }

    /**
     * Workload
     * <p>
     * Lineage reference object : SIRNIST_NIST_WORKLOAD
     * 
     */
    @JsonProperty("nistWorkload")
    public void setNistWorkload(Double nistWorkload) {
        this.nistWorkload = nistWorkload;
    }

    public Sirnist withNistWorkload(Double nistWorkload) {
        this.nistWorkload = nistWorkload;
        return this;
    }

    @JsonProperty("compensationExtractedCbox")
    public String getCompensationExtractedCbox() {
        return compensationExtractedCbox;
    }

    @JsonProperty("compensationExtractedCbox")
    public void setCompensationExtractedCbox(String compensationExtractedCbox) {
        this.compensationExtractedCbox = compensationExtractedCbox;
    }

    public Sirnist withCompensationExtractedCbox(String compensationExtractedCbox) {
        this.compensationExtractedCbox = compensationExtractedCbox;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : SIRNIST_POSN
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public Sirnist withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Position Suffix
     * <p>
     * Lineage reference object : SIRNIST_SUFF
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Position Suffix
     * <p>
     * Lineage reference object : SIRNIST_SUFF
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public Sirnist withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("weeklyHrs")
    public Double getWeeklyHrs() {
        return weeklyHrs;
    }

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRNIST_WEEKLY_HRS
     * 
     */
    @JsonProperty("weeklyHrs")
    public void setWeeklyHrs(Double weeklyHrs) {
        this.weeklyHrs = weeklyHrs;
    }

    public Sirnist withWeeklyHrs(Double weeklyHrs) {
        this.weeklyHrs = weeklyHrs;
        return this;
    }

    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("fte")
    public Double getFte() {
        return fte;
    }

    /**
     * FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("fte")
    public void setFte(Double fte) {
        this.fte = fte;
    }

    public Sirnist withFte(Double fte) {
        this.fte = fte;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SIRNIST_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public Sirnist withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    public String getAstyCode() {
        return astyCode;
    }

    /**
     * Assignment Type
     * <p>
     * Lineage reference object : SIRNIST_ASTY_CODE, Lookup lineage reference object : stvasty
     * 
     */
    @JsonProperty("astyCode")
    public void setAstyCode(String astyCode) {
        this.astyCode = astyCode;
    }

    public Sirnist withAstyCode(String astyCode) {
        this.astyCode = astyCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SIRNIST_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Sirnist withDeptCode(String deptCode) {
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

    public Sirnist withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sirnist.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nistDesc");
        sb.append('=');
        sb.append(((this.nistDesc == null)?"<null>":this.nistDesc));
        sb.append(',');
        sb.append("compensationAppliedCbox");
        sb.append('=');
        sb.append(((this.compensationAppliedCbox == null)?"<null>":this.compensationAppliedCbox));
        sb.append(',');
        sb.append("topsCode");
        sb.append('=');
        sb.append(((this.topsCode == null)?"<null>":this.topsCode));
        sb.append(',');
        sb.append("nistCode");
        sb.append('=');
        sb.append(((this.nistCode == null)?"<null>":this.nistCode));
        sb.append(',');
        sb.append("fcntCode");
        sb.append('=');
        sb.append(((this.fcntCode == null)?"<null>":this.fcntCode));
        sb.append(',');
        sb.append("nistWorkload");
        sb.append('=');
        sb.append(((this.nistWorkload == null)?"<null>":this.nistWorkload));
        sb.append(',');
        sb.append("compensationExtractedCbox");
        sb.append('=');
        sb.append(((this.compensationExtractedCbox == null)?"<null>":this.compensationExtractedCbox));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("weeklyHrs");
        sb.append('=');
        sb.append(((this.weeklyHrs == null)?"<null>":this.weeklyHrs));
        sb.append(',');
        sb.append("fte");
        sb.append('=');
        sb.append(((this.fte == null)?"<null>":this.fte));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("astyCode");
        sb.append('=');
        sb.append(((this.astyCode == null)?"<null>":this.astyCode));
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
        result = ((result* 31)+((this.nistDesc == null)? 0 :this.nistDesc.hashCode()));
        result = ((result* 31)+((this.compensationAppliedCbox == null)? 0 :this.compensationAppliedCbox.hashCode()));
        result = ((result* 31)+((this.topsCode == null)? 0 :this.topsCode.hashCode()));
        result = ((result* 31)+((this.nistCode == null)? 0 :this.nistCode.hashCode()));
        result = ((result* 31)+((this.fcntCode == null)? 0 :this.fcntCode.hashCode()));
        result = ((result* 31)+((this.nistWorkload == null)? 0 :this.nistWorkload.hashCode()));
        result = ((result* 31)+((this.compensationExtractedCbox == null)? 0 :this.compensationExtractedCbox.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.weeklyHrs == null)? 0 :this.weeklyHrs.hashCode()));
        result = ((result* 31)+((this.fte == null)? 0 :this.fte.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.astyCode == null)? 0 :this.astyCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sirnist) == false) {
            return false;
        }
        Sirnist rhs = ((Sirnist) other);
        return ((((((((((((((((this.nistDesc == rhs.nistDesc)||((this.nistDesc!= null)&&this.nistDesc.equals(rhs.nistDesc)))&&((this.compensationAppliedCbox == rhs.compensationAppliedCbox)||((this.compensationAppliedCbox!= null)&&this.compensationAppliedCbox.equals(rhs.compensationAppliedCbox))))&&((this.topsCode == rhs.topsCode)||((this.topsCode!= null)&&this.topsCode.equals(rhs.topsCode))))&&((this.nistCode == rhs.nistCode)||((this.nistCode!= null)&&this.nistCode.equals(rhs.nistCode))))&&((this.fcntCode == rhs.fcntCode)||((this.fcntCode!= null)&&this.fcntCode.equals(rhs.fcntCode))))&&((this.nistWorkload == rhs.nistWorkload)||((this.nistWorkload!= null)&&this.nistWorkload.equals(rhs.nistWorkload))))&&((this.compensationExtractedCbox == rhs.compensationExtractedCbox)||((this.compensationExtractedCbox!= null)&&this.compensationExtractedCbox.equals(rhs.compensationExtractedCbox))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.weeklyHrs == rhs.weeklyHrs)||((this.weeklyHrs!= null)&&this.weeklyHrs.equals(rhs.weeklyHrs))))&&((this.fte == rhs.fte)||((this.fte!= null)&&this.fte.equals(rhs.fte))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.astyCode == rhs.astyCode)||((this.astyCode!= null)&&this.astyCode.equals(rhs.astyCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
