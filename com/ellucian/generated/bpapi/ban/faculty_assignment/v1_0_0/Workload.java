
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
    "total",
    "wkldDesc1",
    "creditHr",
    "fte",
    "instWorkload",
    "termContact",
    "sibinstWkldCode",
    "generatedHrs",
    "nonInstWorkload",
    "weeklyContactHrs"
})
@Generated("jsonschema2pojo")
public class Workload {

    /**
     * Total Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("total")
    private Double total;
    @JsonProperty("wkldDesc1")
    private String wkldDesc1;
    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("creditHr")
    private Double creditHr;
    /**
     * Term FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("fte")
    private Double fte;
    /**
     * Instructional Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("instWorkload")
    private Double instWorkload;
    /**
     * Term Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("termContact")
    private Double termContact;
    /**
     * Workload Rule
     * <p>
     * Lineage reference object : SIBINST_WKLD_CODE
     * 
     */
    @JsonProperty("sibinstWkldCode")
    @JsonPropertyDescription("Lineage reference object : SIBINST_WKLD_CODE")
    private String sibinstWkldCode;
    /**
     * Generated Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("generatedHrs")
    private Double generatedHrs;
    /**
     * Non-Instructional Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("nonInstWorkload")
    private Double nonInstWorkload;
    /**
     * Weekly Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("weeklyContactHrs")
    private Double weeklyContactHrs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Total Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("total")
    public Double getTotal() {
        return total;
    }

    /**
     * Total Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("total")
    public void setTotal(Double total) {
        this.total = total;
    }

    public Workload withTotal(Double total) {
        this.total = total;
        return this;
    }

    @JsonProperty("wkldDesc1")
    public String getWkldDesc1() {
        return wkldDesc1;
    }

    @JsonProperty("wkldDesc1")
    public void setWkldDesc1(String wkldDesc1) {
        this.wkldDesc1 = wkldDesc1;
    }

    public Workload withWkldDesc1(String wkldDesc1) {
        this.wkldDesc1 = wkldDesc1;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("creditHr")
    public Double getCreditHr() {
        return creditHr;
    }

    /**
     * Credit Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("creditHr")
    public void setCreditHr(Double creditHr) {
        this.creditHr = creditHr;
    }

    public Workload withCreditHr(Double creditHr) {
        this.creditHr = creditHr;
        return this;
    }

    /**
     * Term FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("fte")
    public Double getFte() {
        return fte;
    }

    /**
     * Term FTE
     * <p>
     * 
     * 
     */
    @JsonProperty("fte")
    public void setFte(Double fte) {
        this.fte = fte;
    }

    public Workload withFte(Double fte) {
        this.fte = fte;
        return this;
    }

    /**
     * Instructional Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("instWorkload")
    public Double getInstWorkload() {
        return instWorkload;
    }

    /**
     * Instructional Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("instWorkload")
    public void setInstWorkload(Double instWorkload) {
        this.instWorkload = instWorkload;
    }

    public Workload withInstWorkload(Double instWorkload) {
        this.instWorkload = instWorkload;
        return this;
    }

    /**
     * Term Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("termContact")
    public Double getTermContact() {
        return termContact;
    }

    /**
     * Term Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("termContact")
    public void setTermContact(Double termContact) {
        this.termContact = termContact;
    }

    public Workload withTermContact(Double termContact) {
        this.termContact = termContact;
        return this;
    }

    /**
     * Workload Rule
     * <p>
     * Lineage reference object : SIBINST_WKLD_CODE
     * 
     */
    @JsonProperty("sibinstWkldCode")
    public String getSibinstWkldCode() {
        return sibinstWkldCode;
    }

    /**
     * Workload Rule
     * <p>
     * Lineage reference object : SIBINST_WKLD_CODE
     * 
     */
    @JsonProperty("sibinstWkldCode")
    public void setSibinstWkldCode(String sibinstWkldCode) {
        this.sibinstWkldCode = sibinstWkldCode;
    }

    public Workload withSibinstWkldCode(String sibinstWkldCode) {
        this.sibinstWkldCode = sibinstWkldCode;
        return this;
    }

    /**
     * Generated Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("generatedHrs")
    public Double getGeneratedHrs() {
        return generatedHrs;
    }

    /**
     * Generated Hours
     * <p>
     * 
     * 
     */
    @JsonProperty("generatedHrs")
    public void setGeneratedHrs(Double generatedHrs) {
        this.generatedHrs = generatedHrs;
    }

    public Workload withGeneratedHrs(Double generatedHrs) {
        this.generatedHrs = generatedHrs;
        return this;
    }

    /**
     * Non-Instructional Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("nonInstWorkload")
    public Double getNonInstWorkload() {
        return nonInstWorkload;
    }

    /**
     * Non-Instructional Workload
     * <p>
     * 
     * 
     */
    @JsonProperty("nonInstWorkload")
    public void setNonInstWorkload(Double nonInstWorkload) {
        this.nonInstWorkload = nonInstWorkload;
    }

    public Workload withNonInstWorkload(Double nonInstWorkload) {
        this.nonInstWorkload = nonInstWorkload;
        return this;
    }

    /**
     * Weekly Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("weeklyContactHrs")
    public Double getWeeklyContactHrs() {
        return weeklyContactHrs;
    }

    /**
     * Weekly Contact
     * <p>
     * 
     * 
     */
    @JsonProperty("weeklyContactHrs")
    public void setWeeklyContactHrs(Double weeklyContactHrs) {
        this.weeklyContactHrs = weeklyContactHrs;
    }

    public Workload withWeeklyContactHrs(Double weeklyContactHrs) {
        this.weeklyContactHrs = weeklyContactHrs;
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

    public Workload withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Workload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("wkldDesc1");
        sb.append('=');
        sb.append(((this.wkldDesc1 == null)?"<null>":this.wkldDesc1));
        sb.append(',');
        sb.append("creditHr");
        sb.append('=');
        sb.append(((this.creditHr == null)?"<null>":this.creditHr));
        sb.append(',');
        sb.append("fte");
        sb.append('=');
        sb.append(((this.fte == null)?"<null>":this.fte));
        sb.append(',');
        sb.append("instWorkload");
        sb.append('=');
        sb.append(((this.instWorkload == null)?"<null>":this.instWorkload));
        sb.append(',');
        sb.append("termContact");
        sb.append('=');
        sb.append(((this.termContact == null)?"<null>":this.termContact));
        sb.append(',');
        sb.append("sibinstWkldCode");
        sb.append('=');
        sb.append(((this.sibinstWkldCode == null)?"<null>":this.sibinstWkldCode));
        sb.append(',');
        sb.append("generatedHrs");
        sb.append('=');
        sb.append(((this.generatedHrs == null)?"<null>":this.generatedHrs));
        sb.append(',');
        sb.append("nonInstWorkload");
        sb.append('=');
        sb.append(((this.nonInstWorkload == null)?"<null>":this.nonInstWorkload));
        sb.append(',');
        sb.append("weeklyContactHrs");
        sb.append('=');
        sb.append(((this.weeklyContactHrs == null)?"<null>":this.weeklyContactHrs));
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
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.wkldDesc1 == null)? 0 :this.wkldDesc1 .hashCode()));
        result = ((result* 31)+((this.creditHr == null)? 0 :this.creditHr.hashCode()));
        result = ((result* 31)+((this.fte == null)? 0 :this.fte.hashCode()));
        result = ((result* 31)+((this.instWorkload == null)? 0 :this.instWorkload.hashCode()));
        result = ((result* 31)+((this.termContact == null)? 0 :this.termContact.hashCode()));
        result = ((result* 31)+((this.sibinstWkldCode == null)? 0 :this.sibinstWkldCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.generatedHrs == null)? 0 :this.generatedHrs.hashCode()));
        result = ((result* 31)+((this.nonInstWorkload == null)? 0 :this.nonInstWorkload.hashCode()));
        result = ((result* 31)+((this.weeklyContactHrs == null)? 0 :this.weeklyContactHrs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Workload) == false) {
            return false;
        }
        Workload rhs = ((Workload) other);
        return ((((((((((((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total)))&&((this.wkldDesc1 == rhs.wkldDesc1)||((this.wkldDesc1 != null)&&this.wkldDesc1 .equals(rhs.wkldDesc1))))&&((this.creditHr == rhs.creditHr)||((this.creditHr!= null)&&this.creditHr.equals(rhs.creditHr))))&&((this.fte == rhs.fte)||((this.fte!= null)&&this.fte.equals(rhs.fte))))&&((this.instWorkload == rhs.instWorkload)||((this.instWorkload!= null)&&this.instWorkload.equals(rhs.instWorkload))))&&((this.termContact == rhs.termContact)||((this.termContact!= null)&&this.termContact.equals(rhs.termContact))))&&((this.sibinstWkldCode == rhs.sibinstWkldCode)||((this.sibinstWkldCode!= null)&&this.sibinstWkldCode.equals(rhs.sibinstWkldCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.generatedHrs == rhs.generatedHrs)||((this.generatedHrs!= null)&&this.generatedHrs.equals(rhs.generatedHrs))))&&((this.nonInstWorkload == rhs.nonInstWorkload)||((this.nonInstWorkload!= null)&&this.nonInstWorkload.equals(rhs.nonInstWorkload))))&&((this.weeklyContactHrs == rhs.weeklyContactHrs)||((this.weeklyContactHrs!= null)&&this.weeklyContactHrs.equals(rhs.weeklyContactHrs))));
    }

}
