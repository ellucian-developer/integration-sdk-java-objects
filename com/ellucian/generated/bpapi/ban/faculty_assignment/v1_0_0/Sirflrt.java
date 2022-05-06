
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
    "contactHrLowWeek",
    "totWorkloadLow",
    "fteHigh",
    "nistInd",
    "wkldCode",
    "contactHrLow",
    "instInd",
    "contactHrHigh",
    "creditHrLowGen",
    "creditHrHigh",
    "fteInd",
    "creditHrLow",
    "contactHrHighWeek",
    "totwlInd",
    "fteLow",
    "instWorkloadLow",
    "genInd",
    "weekInd",
    "totalInd",
    "wkldDesc",
    "instWorkloadHigh",
    "nistWorkloadLow",
    "nistWorkloadHigh",
    "totWorkloadHigh",
    "creditHrHighGen",
    "credInd"
})
@Generated("jsonschema2pojo")
public class Sirflrt {

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRFLRT_CONTACT_HR_LOW_WEEK
     * 
     */
    @JsonProperty("contactHrLowWeek")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_CONTACT_HR_LOW_WEEK")
    private Double contactHrLowWeek;
    /**
     * Total Workload
     * <p>
     * Lineage reference object : SIRFLRT_TOT_WORKLOAD_LOW
     * 
     */
    @JsonProperty("totWorkloadLow")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_TOT_WORKLOAD_LOW")
    private Double totWorkloadLow;
    /**
     * Lineage reference object : SIRFLRT_FTE_HIGH
     * 
     */
    @JsonProperty("fteHigh")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_FTE_HIGH")
    private Double fteHigh;
    @JsonProperty("nistInd")
    private String nistInd;
    /**
     * Workload Rule
     * <p>
     * Lineage reference object : SIRFLRT_WKLD_CODE
     * 
     */
    @JsonProperty("wkldCode")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_WKLD_CODE")
    private String wkldCode;
    /**
     * Total Contact
     * <p>
     * Lineage reference object : SIRFLRT_CONTACT_HR_LOW
     * 
     */
    @JsonProperty("contactHrLow")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_CONTACT_HR_LOW")
    private Double contactHrLow;
    @JsonProperty("instInd")
    private String instInd;
    /**
     * Lineage reference object : SIRFLRT_CONTACT_HR_HIGH
     * 
     */
    @JsonProperty("contactHrHigh")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_CONTACT_HR_HIGH")
    private Double contactHrHigh;
    /**
     * Generated Hours
     * <p>
     * Lineage reference object : SIRFLRT_CREDIT_HR_LOW_GEN
     * 
     */
    @JsonProperty("creditHrLowGen")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_CREDIT_HR_LOW_GEN")
    private Double creditHrLowGen;
    /**
     * Lineage reference object : SIRFLRT_CREDIT_HR_HIGH
     * 
     */
    @JsonProperty("creditHrHigh")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_CREDIT_HR_HIGH")
    private Double creditHrHigh;
    @JsonProperty("fteInd")
    private String fteInd;
    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SIRFLRT_CREDIT_HR_LOW
     * 
     */
    @JsonProperty("creditHrLow")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_CREDIT_HR_LOW")
    private Double creditHrLow;
    /**
     * Lineage reference object : SIRFLRT_CONTACT_HR_HIGH_WEEK
     * 
     */
    @JsonProperty("contactHrHighWeek")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_CONTACT_HR_HIGH_WEEK")
    private Double contactHrHighWeek;
    @JsonProperty("totwlInd")
    private String totwlInd;
    /**
     * Term FTE
     * <p>
     * Lineage reference object : SIRFLRT_FTE_LOW
     * 
     */
    @JsonProperty("fteLow")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_FTE_LOW")
    private Double fteLow;
    /**
     * Instructional Workload
     * <p>
     * Lineage reference object : SIRFLRT_INST_WORKLOAD_LOW
     * 
     */
    @JsonProperty("instWorkloadLow")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_INST_WORKLOAD_LOW")
    private Double instWorkloadLow;
    @JsonProperty("genInd")
    private String genInd;
    @JsonProperty("weekInd")
    private String weekInd;
    @JsonProperty("totalInd")
    private String totalInd;
    @JsonProperty("wkldDesc")
    private String wkldDesc;
    /**
     * Lineage reference object : SIRFLRT_INST_WORKLOAD_HIGH
     * 
     */
    @JsonProperty("instWorkloadHigh")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_INST_WORKLOAD_HIGH")
    private Double instWorkloadHigh;
    /**
     * Non-Instructional Workload
     * <p>
     * Lineage reference object : SIRFLRT_NIST_WORKLOAD_LOW
     * 
     */
    @JsonProperty("nistWorkloadLow")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_NIST_WORKLOAD_LOW")
    private Double nistWorkloadLow;
    /**
     * Lineage reference object : SIRFLRT_NIST_WORKLOAD_HIGH
     * 
     */
    @JsonProperty("nistWorkloadHigh")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_NIST_WORKLOAD_HIGH")
    private Double nistWorkloadHigh;
    /**
     * Lineage reference object : SIRFLRT_TOT_WORKLOAD_HIGH
     * 
     */
    @JsonProperty("totWorkloadHigh")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_TOT_WORKLOAD_HIGH")
    private Double totWorkloadHigh;
    /**
     * Lineage reference object : SIRFLRT_CREDIT_HR_HIGH_GEN
     * 
     */
    @JsonProperty("creditHrHighGen")
    @JsonPropertyDescription("Lineage reference object : SIRFLRT_CREDIT_HR_HIGH_GEN")
    private Double creditHrHighGen;
    @JsonProperty("credInd")
    private String credInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRFLRT_CONTACT_HR_LOW_WEEK
     * 
     */
    @JsonProperty("contactHrLowWeek")
    public Double getContactHrLowWeek() {
        return contactHrLowWeek;
    }

    /**
     * Weekly Contact
     * <p>
     * Lineage reference object : SIRFLRT_CONTACT_HR_LOW_WEEK
     * 
     */
    @JsonProperty("contactHrLowWeek")
    public void setContactHrLowWeek(Double contactHrLowWeek) {
        this.contactHrLowWeek = contactHrLowWeek;
    }

    public Sirflrt withContactHrLowWeek(Double contactHrLowWeek) {
        this.contactHrLowWeek = contactHrLowWeek;
        return this;
    }

    /**
     * Total Workload
     * <p>
     * Lineage reference object : SIRFLRT_TOT_WORKLOAD_LOW
     * 
     */
    @JsonProperty("totWorkloadLow")
    public Double getTotWorkloadLow() {
        return totWorkloadLow;
    }

    /**
     * Total Workload
     * <p>
     * Lineage reference object : SIRFLRT_TOT_WORKLOAD_LOW
     * 
     */
    @JsonProperty("totWorkloadLow")
    public void setTotWorkloadLow(Double totWorkloadLow) {
        this.totWorkloadLow = totWorkloadLow;
    }

    public Sirflrt withTotWorkloadLow(Double totWorkloadLow) {
        this.totWorkloadLow = totWorkloadLow;
        return this;
    }

    /**
     * Lineage reference object : SIRFLRT_FTE_HIGH
     * 
     */
    @JsonProperty("fteHigh")
    public Double getFteHigh() {
        return fteHigh;
    }

    /**
     * Lineage reference object : SIRFLRT_FTE_HIGH
     * 
     */
    @JsonProperty("fteHigh")
    public void setFteHigh(Double fteHigh) {
        this.fteHigh = fteHigh;
    }

    public Sirflrt withFteHigh(Double fteHigh) {
        this.fteHigh = fteHigh;
        return this;
    }

    @JsonProperty("nistInd")
    public String getNistInd() {
        return nistInd;
    }

    @JsonProperty("nistInd")
    public void setNistInd(String nistInd) {
        this.nistInd = nistInd;
    }

    public Sirflrt withNistInd(String nistInd) {
        this.nistInd = nistInd;
        return this;
    }

    /**
     * Workload Rule
     * <p>
     * Lineage reference object : SIRFLRT_WKLD_CODE
     * 
     */
    @JsonProperty("wkldCode")
    public String getWkldCode() {
        return wkldCode;
    }

    /**
     * Workload Rule
     * <p>
     * Lineage reference object : SIRFLRT_WKLD_CODE
     * 
     */
    @JsonProperty("wkldCode")
    public void setWkldCode(String wkldCode) {
        this.wkldCode = wkldCode;
    }

    public Sirflrt withWkldCode(String wkldCode) {
        this.wkldCode = wkldCode;
        return this;
    }

    /**
     * Total Contact
     * <p>
     * Lineage reference object : SIRFLRT_CONTACT_HR_LOW
     * 
     */
    @JsonProperty("contactHrLow")
    public Double getContactHrLow() {
        return contactHrLow;
    }

    /**
     * Total Contact
     * <p>
     * Lineage reference object : SIRFLRT_CONTACT_HR_LOW
     * 
     */
    @JsonProperty("contactHrLow")
    public void setContactHrLow(Double contactHrLow) {
        this.contactHrLow = contactHrLow;
    }

    public Sirflrt withContactHrLow(Double contactHrLow) {
        this.contactHrLow = contactHrLow;
        return this;
    }

    @JsonProperty("instInd")
    public String getInstInd() {
        return instInd;
    }

    @JsonProperty("instInd")
    public void setInstInd(String instInd) {
        this.instInd = instInd;
    }

    public Sirflrt withInstInd(String instInd) {
        this.instInd = instInd;
        return this;
    }

    /**
     * Lineage reference object : SIRFLRT_CONTACT_HR_HIGH
     * 
     */
    @JsonProperty("contactHrHigh")
    public Double getContactHrHigh() {
        return contactHrHigh;
    }

    /**
     * Lineage reference object : SIRFLRT_CONTACT_HR_HIGH
     * 
     */
    @JsonProperty("contactHrHigh")
    public void setContactHrHigh(Double contactHrHigh) {
        this.contactHrHigh = contactHrHigh;
    }

    public Sirflrt withContactHrHigh(Double contactHrHigh) {
        this.contactHrHigh = contactHrHigh;
        return this;
    }

    /**
     * Generated Hours
     * <p>
     * Lineage reference object : SIRFLRT_CREDIT_HR_LOW_GEN
     * 
     */
    @JsonProperty("creditHrLowGen")
    public Double getCreditHrLowGen() {
        return creditHrLowGen;
    }

    /**
     * Generated Hours
     * <p>
     * Lineage reference object : SIRFLRT_CREDIT_HR_LOW_GEN
     * 
     */
    @JsonProperty("creditHrLowGen")
    public void setCreditHrLowGen(Double creditHrLowGen) {
        this.creditHrLowGen = creditHrLowGen;
    }

    public Sirflrt withCreditHrLowGen(Double creditHrLowGen) {
        this.creditHrLowGen = creditHrLowGen;
        return this;
    }

    /**
     * Lineage reference object : SIRFLRT_CREDIT_HR_HIGH
     * 
     */
    @JsonProperty("creditHrHigh")
    public Double getCreditHrHigh() {
        return creditHrHigh;
    }

    /**
     * Lineage reference object : SIRFLRT_CREDIT_HR_HIGH
     * 
     */
    @JsonProperty("creditHrHigh")
    public void setCreditHrHigh(Double creditHrHigh) {
        this.creditHrHigh = creditHrHigh;
    }

    public Sirflrt withCreditHrHigh(Double creditHrHigh) {
        this.creditHrHigh = creditHrHigh;
        return this;
    }

    @JsonProperty("fteInd")
    public String getFteInd() {
        return fteInd;
    }

    @JsonProperty("fteInd")
    public void setFteInd(String fteInd) {
        this.fteInd = fteInd;
    }

    public Sirflrt withFteInd(String fteInd) {
        this.fteInd = fteInd;
        return this;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SIRFLRT_CREDIT_HR_LOW
     * 
     */
    @JsonProperty("creditHrLow")
    public Double getCreditHrLow() {
        return creditHrLow;
    }

    /**
     * Credit Hours
     * <p>
     * Lineage reference object : SIRFLRT_CREDIT_HR_LOW
     * 
     */
    @JsonProperty("creditHrLow")
    public void setCreditHrLow(Double creditHrLow) {
        this.creditHrLow = creditHrLow;
    }

    public Sirflrt withCreditHrLow(Double creditHrLow) {
        this.creditHrLow = creditHrLow;
        return this;
    }

    /**
     * Lineage reference object : SIRFLRT_CONTACT_HR_HIGH_WEEK
     * 
     */
    @JsonProperty("contactHrHighWeek")
    public Double getContactHrHighWeek() {
        return contactHrHighWeek;
    }

    /**
     * Lineage reference object : SIRFLRT_CONTACT_HR_HIGH_WEEK
     * 
     */
    @JsonProperty("contactHrHighWeek")
    public void setContactHrHighWeek(Double contactHrHighWeek) {
        this.contactHrHighWeek = contactHrHighWeek;
    }

    public Sirflrt withContactHrHighWeek(Double contactHrHighWeek) {
        this.contactHrHighWeek = contactHrHighWeek;
        return this;
    }

    @JsonProperty("totwlInd")
    public String getTotwlInd() {
        return totwlInd;
    }

    @JsonProperty("totwlInd")
    public void setTotwlInd(String totwlInd) {
        this.totwlInd = totwlInd;
    }

    public Sirflrt withTotwlInd(String totwlInd) {
        this.totwlInd = totwlInd;
        return this;
    }

    /**
     * Term FTE
     * <p>
     * Lineage reference object : SIRFLRT_FTE_LOW
     * 
     */
    @JsonProperty("fteLow")
    public Double getFteLow() {
        return fteLow;
    }

    /**
     * Term FTE
     * <p>
     * Lineage reference object : SIRFLRT_FTE_LOW
     * 
     */
    @JsonProperty("fteLow")
    public void setFteLow(Double fteLow) {
        this.fteLow = fteLow;
    }

    public Sirflrt withFteLow(Double fteLow) {
        this.fteLow = fteLow;
        return this;
    }

    /**
     * Instructional Workload
     * <p>
     * Lineage reference object : SIRFLRT_INST_WORKLOAD_LOW
     * 
     */
    @JsonProperty("instWorkloadLow")
    public Double getInstWorkloadLow() {
        return instWorkloadLow;
    }

    /**
     * Instructional Workload
     * <p>
     * Lineage reference object : SIRFLRT_INST_WORKLOAD_LOW
     * 
     */
    @JsonProperty("instWorkloadLow")
    public void setInstWorkloadLow(Double instWorkloadLow) {
        this.instWorkloadLow = instWorkloadLow;
    }

    public Sirflrt withInstWorkloadLow(Double instWorkloadLow) {
        this.instWorkloadLow = instWorkloadLow;
        return this;
    }

    @JsonProperty("genInd")
    public String getGenInd() {
        return genInd;
    }

    @JsonProperty("genInd")
    public void setGenInd(String genInd) {
        this.genInd = genInd;
    }

    public Sirflrt withGenInd(String genInd) {
        this.genInd = genInd;
        return this;
    }

    @JsonProperty("weekInd")
    public String getWeekInd() {
        return weekInd;
    }

    @JsonProperty("weekInd")
    public void setWeekInd(String weekInd) {
        this.weekInd = weekInd;
    }

    public Sirflrt withWeekInd(String weekInd) {
        this.weekInd = weekInd;
        return this;
    }

    @JsonProperty("totalInd")
    public String getTotalInd() {
        return totalInd;
    }

    @JsonProperty("totalInd")
    public void setTotalInd(String totalInd) {
        this.totalInd = totalInd;
    }

    public Sirflrt withTotalInd(String totalInd) {
        this.totalInd = totalInd;
        return this;
    }

    @JsonProperty("wkldDesc")
    public String getWkldDesc() {
        return wkldDesc;
    }

    @JsonProperty("wkldDesc")
    public void setWkldDesc(String wkldDesc) {
        this.wkldDesc = wkldDesc;
    }

    public Sirflrt withWkldDesc(String wkldDesc) {
        this.wkldDesc = wkldDesc;
        return this;
    }

    /**
     * Lineage reference object : SIRFLRT_INST_WORKLOAD_HIGH
     * 
     */
    @JsonProperty("instWorkloadHigh")
    public Double getInstWorkloadHigh() {
        return instWorkloadHigh;
    }

    /**
     * Lineage reference object : SIRFLRT_INST_WORKLOAD_HIGH
     * 
     */
    @JsonProperty("instWorkloadHigh")
    public void setInstWorkloadHigh(Double instWorkloadHigh) {
        this.instWorkloadHigh = instWorkloadHigh;
    }

    public Sirflrt withInstWorkloadHigh(Double instWorkloadHigh) {
        this.instWorkloadHigh = instWorkloadHigh;
        return this;
    }

    /**
     * Non-Instructional Workload
     * <p>
     * Lineage reference object : SIRFLRT_NIST_WORKLOAD_LOW
     * 
     */
    @JsonProperty("nistWorkloadLow")
    public Double getNistWorkloadLow() {
        return nistWorkloadLow;
    }

    /**
     * Non-Instructional Workload
     * <p>
     * Lineage reference object : SIRFLRT_NIST_WORKLOAD_LOW
     * 
     */
    @JsonProperty("nistWorkloadLow")
    public void setNistWorkloadLow(Double nistWorkloadLow) {
        this.nistWorkloadLow = nistWorkloadLow;
    }

    public Sirflrt withNistWorkloadLow(Double nistWorkloadLow) {
        this.nistWorkloadLow = nistWorkloadLow;
        return this;
    }

    /**
     * Lineage reference object : SIRFLRT_NIST_WORKLOAD_HIGH
     * 
     */
    @JsonProperty("nistWorkloadHigh")
    public Double getNistWorkloadHigh() {
        return nistWorkloadHigh;
    }

    /**
     * Lineage reference object : SIRFLRT_NIST_WORKLOAD_HIGH
     * 
     */
    @JsonProperty("nistWorkloadHigh")
    public void setNistWorkloadHigh(Double nistWorkloadHigh) {
        this.nistWorkloadHigh = nistWorkloadHigh;
    }

    public Sirflrt withNistWorkloadHigh(Double nistWorkloadHigh) {
        this.nistWorkloadHigh = nistWorkloadHigh;
        return this;
    }

    /**
     * Lineage reference object : SIRFLRT_TOT_WORKLOAD_HIGH
     * 
     */
    @JsonProperty("totWorkloadHigh")
    public Double getTotWorkloadHigh() {
        return totWorkloadHigh;
    }

    /**
     * Lineage reference object : SIRFLRT_TOT_WORKLOAD_HIGH
     * 
     */
    @JsonProperty("totWorkloadHigh")
    public void setTotWorkloadHigh(Double totWorkloadHigh) {
        this.totWorkloadHigh = totWorkloadHigh;
    }

    public Sirflrt withTotWorkloadHigh(Double totWorkloadHigh) {
        this.totWorkloadHigh = totWorkloadHigh;
        return this;
    }

    /**
     * Lineage reference object : SIRFLRT_CREDIT_HR_HIGH_GEN
     * 
     */
    @JsonProperty("creditHrHighGen")
    public Double getCreditHrHighGen() {
        return creditHrHighGen;
    }

    /**
     * Lineage reference object : SIRFLRT_CREDIT_HR_HIGH_GEN
     * 
     */
    @JsonProperty("creditHrHighGen")
    public void setCreditHrHighGen(Double creditHrHighGen) {
        this.creditHrHighGen = creditHrHighGen;
    }

    public Sirflrt withCreditHrHighGen(Double creditHrHighGen) {
        this.creditHrHighGen = creditHrHighGen;
        return this;
    }

    @JsonProperty("credInd")
    public String getCredInd() {
        return credInd;
    }

    @JsonProperty("credInd")
    public void setCredInd(String credInd) {
        this.credInd = credInd;
    }

    public Sirflrt withCredInd(String credInd) {
        this.credInd = credInd;
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

    public Sirflrt withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sirflrt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contactHrLowWeek");
        sb.append('=');
        sb.append(((this.contactHrLowWeek == null)?"<null>":this.contactHrLowWeek));
        sb.append(',');
        sb.append("totWorkloadLow");
        sb.append('=');
        sb.append(((this.totWorkloadLow == null)?"<null>":this.totWorkloadLow));
        sb.append(',');
        sb.append("fteHigh");
        sb.append('=');
        sb.append(((this.fteHigh == null)?"<null>":this.fteHigh));
        sb.append(',');
        sb.append("nistInd");
        sb.append('=');
        sb.append(((this.nistInd == null)?"<null>":this.nistInd));
        sb.append(',');
        sb.append("wkldCode");
        sb.append('=');
        sb.append(((this.wkldCode == null)?"<null>":this.wkldCode));
        sb.append(',');
        sb.append("contactHrLow");
        sb.append('=');
        sb.append(((this.contactHrLow == null)?"<null>":this.contactHrLow));
        sb.append(',');
        sb.append("instInd");
        sb.append('=');
        sb.append(((this.instInd == null)?"<null>":this.instInd));
        sb.append(',');
        sb.append("contactHrHigh");
        sb.append('=');
        sb.append(((this.contactHrHigh == null)?"<null>":this.contactHrHigh));
        sb.append(',');
        sb.append("creditHrLowGen");
        sb.append('=');
        sb.append(((this.creditHrLowGen == null)?"<null>":this.creditHrLowGen));
        sb.append(',');
        sb.append("creditHrHigh");
        sb.append('=');
        sb.append(((this.creditHrHigh == null)?"<null>":this.creditHrHigh));
        sb.append(',');
        sb.append("fteInd");
        sb.append('=');
        sb.append(((this.fteInd == null)?"<null>":this.fteInd));
        sb.append(',');
        sb.append("creditHrLow");
        sb.append('=');
        sb.append(((this.creditHrLow == null)?"<null>":this.creditHrLow));
        sb.append(',');
        sb.append("contactHrHighWeek");
        sb.append('=');
        sb.append(((this.contactHrHighWeek == null)?"<null>":this.contactHrHighWeek));
        sb.append(',');
        sb.append("totwlInd");
        sb.append('=');
        sb.append(((this.totwlInd == null)?"<null>":this.totwlInd));
        sb.append(',');
        sb.append("fteLow");
        sb.append('=');
        sb.append(((this.fteLow == null)?"<null>":this.fteLow));
        sb.append(',');
        sb.append("instWorkloadLow");
        sb.append('=');
        sb.append(((this.instWorkloadLow == null)?"<null>":this.instWorkloadLow));
        sb.append(',');
        sb.append("genInd");
        sb.append('=');
        sb.append(((this.genInd == null)?"<null>":this.genInd));
        sb.append(',');
        sb.append("weekInd");
        sb.append('=');
        sb.append(((this.weekInd == null)?"<null>":this.weekInd));
        sb.append(',');
        sb.append("totalInd");
        sb.append('=');
        sb.append(((this.totalInd == null)?"<null>":this.totalInd));
        sb.append(',');
        sb.append("wkldDesc");
        sb.append('=');
        sb.append(((this.wkldDesc == null)?"<null>":this.wkldDesc));
        sb.append(',');
        sb.append("instWorkloadHigh");
        sb.append('=');
        sb.append(((this.instWorkloadHigh == null)?"<null>":this.instWorkloadHigh));
        sb.append(',');
        sb.append("nistWorkloadLow");
        sb.append('=');
        sb.append(((this.nistWorkloadLow == null)?"<null>":this.nistWorkloadLow));
        sb.append(',');
        sb.append("nistWorkloadHigh");
        sb.append('=');
        sb.append(((this.nistWorkloadHigh == null)?"<null>":this.nistWorkloadHigh));
        sb.append(',');
        sb.append("totWorkloadHigh");
        sb.append('=');
        sb.append(((this.totWorkloadHigh == null)?"<null>":this.totWorkloadHigh));
        sb.append(',');
        sb.append("creditHrHighGen");
        sb.append('=');
        sb.append(((this.creditHrHighGen == null)?"<null>":this.creditHrHighGen));
        sb.append(',');
        sb.append("credInd");
        sb.append('=');
        sb.append(((this.credInd == null)?"<null>":this.credInd));
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
        result = ((result* 31)+((this.contactHrLowWeek == null)? 0 :this.contactHrLowWeek.hashCode()));
        result = ((result* 31)+((this.totWorkloadLow == null)? 0 :this.totWorkloadLow.hashCode()));
        result = ((result* 31)+((this.fteHigh == null)? 0 :this.fteHigh.hashCode()));
        result = ((result* 31)+((this.nistInd == null)? 0 :this.nistInd.hashCode()));
        result = ((result* 31)+((this.wkldCode == null)? 0 :this.wkldCode.hashCode()));
        result = ((result* 31)+((this.contactHrLow == null)? 0 :this.contactHrLow.hashCode()));
        result = ((result* 31)+((this.instInd == null)? 0 :this.instInd.hashCode()));
        result = ((result* 31)+((this.contactHrHigh == null)? 0 :this.contactHrHigh.hashCode()));
        result = ((result* 31)+((this.creditHrLowGen == null)? 0 :this.creditHrLowGen.hashCode()));
        result = ((result* 31)+((this.creditHrHigh == null)? 0 :this.creditHrHigh.hashCode()));
        result = ((result* 31)+((this.fteInd == null)? 0 :this.fteInd.hashCode()));
        result = ((result* 31)+((this.creditHrLow == null)? 0 :this.creditHrLow.hashCode()));
        result = ((result* 31)+((this.contactHrHighWeek == null)? 0 :this.contactHrHighWeek.hashCode()));
        result = ((result* 31)+((this.totwlInd == null)? 0 :this.totwlInd.hashCode()));
        result = ((result* 31)+((this.fteLow == null)? 0 :this.fteLow.hashCode()));
        result = ((result* 31)+((this.instWorkloadLow == null)? 0 :this.instWorkloadLow.hashCode()));
        result = ((result* 31)+((this.genInd == null)? 0 :this.genInd.hashCode()));
        result = ((result* 31)+((this.weekInd == null)? 0 :this.weekInd.hashCode()));
        result = ((result* 31)+((this.totalInd == null)? 0 :this.totalInd.hashCode()));
        result = ((result* 31)+((this.wkldDesc == null)? 0 :this.wkldDesc.hashCode()));
        result = ((result* 31)+((this.instWorkloadHigh == null)? 0 :this.instWorkloadHigh.hashCode()));
        result = ((result* 31)+((this.nistWorkloadLow == null)? 0 :this.nistWorkloadLow.hashCode()));
        result = ((result* 31)+((this.nistWorkloadHigh == null)? 0 :this.nistWorkloadHigh.hashCode()));
        result = ((result* 31)+((this.totWorkloadHigh == null)? 0 :this.totWorkloadHigh.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.creditHrHighGen == null)? 0 :this.creditHrHighGen.hashCode()));
        result = ((result* 31)+((this.credInd == null)? 0 :this.credInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sirflrt) == false) {
            return false;
        }
        Sirflrt rhs = ((Sirflrt) other);
        return ((((((((((((((((((((((((((((this.contactHrLowWeek == rhs.contactHrLowWeek)||((this.contactHrLowWeek!= null)&&this.contactHrLowWeek.equals(rhs.contactHrLowWeek)))&&((this.totWorkloadLow == rhs.totWorkloadLow)||((this.totWorkloadLow!= null)&&this.totWorkloadLow.equals(rhs.totWorkloadLow))))&&((this.fteHigh == rhs.fteHigh)||((this.fteHigh!= null)&&this.fteHigh.equals(rhs.fteHigh))))&&((this.nistInd == rhs.nistInd)||((this.nistInd!= null)&&this.nistInd.equals(rhs.nistInd))))&&((this.wkldCode == rhs.wkldCode)||((this.wkldCode!= null)&&this.wkldCode.equals(rhs.wkldCode))))&&((this.contactHrLow == rhs.contactHrLow)||((this.contactHrLow!= null)&&this.contactHrLow.equals(rhs.contactHrLow))))&&((this.instInd == rhs.instInd)||((this.instInd!= null)&&this.instInd.equals(rhs.instInd))))&&((this.contactHrHigh == rhs.contactHrHigh)||((this.contactHrHigh!= null)&&this.contactHrHigh.equals(rhs.contactHrHigh))))&&((this.creditHrLowGen == rhs.creditHrLowGen)||((this.creditHrLowGen!= null)&&this.creditHrLowGen.equals(rhs.creditHrLowGen))))&&((this.creditHrHigh == rhs.creditHrHigh)||((this.creditHrHigh!= null)&&this.creditHrHigh.equals(rhs.creditHrHigh))))&&((this.fteInd == rhs.fteInd)||((this.fteInd!= null)&&this.fteInd.equals(rhs.fteInd))))&&((this.creditHrLow == rhs.creditHrLow)||((this.creditHrLow!= null)&&this.creditHrLow.equals(rhs.creditHrLow))))&&((this.contactHrHighWeek == rhs.contactHrHighWeek)||((this.contactHrHighWeek!= null)&&this.contactHrHighWeek.equals(rhs.contactHrHighWeek))))&&((this.totwlInd == rhs.totwlInd)||((this.totwlInd!= null)&&this.totwlInd.equals(rhs.totwlInd))))&&((this.fteLow == rhs.fteLow)||((this.fteLow!= null)&&this.fteLow.equals(rhs.fteLow))))&&((this.instWorkloadLow == rhs.instWorkloadLow)||((this.instWorkloadLow!= null)&&this.instWorkloadLow.equals(rhs.instWorkloadLow))))&&((this.genInd == rhs.genInd)||((this.genInd!= null)&&this.genInd.equals(rhs.genInd))))&&((this.weekInd == rhs.weekInd)||((this.weekInd!= null)&&this.weekInd.equals(rhs.weekInd))))&&((this.totalInd == rhs.totalInd)||((this.totalInd!= null)&&this.totalInd.equals(rhs.totalInd))))&&((this.wkldDesc == rhs.wkldDesc)||((this.wkldDesc!= null)&&this.wkldDesc.equals(rhs.wkldDesc))))&&((this.instWorkloadHigh == rhs.instWorkloadHigh)||((this.instWorkloadHigh!= null)&&this.instWorkloadHigh.equals(rhs.instWorkloadHigh))))&&((this.nistWorkloadLow == rhs.nistWorkloadLow)||((this.nistWorkloadLow!= null)&&this.nistWorkloadLow.equals(rhs.nistWorkloadLow))))&&((this.nistWorkloadHigh == rhs.nistWorkloadHigh)||((this.nistWorkloadHigh!= null)&&this.nistWorkloadHigh.equals(rhs.nistWorkloadHigh))))&&((this.totWorkloadHigh == rhs.totWorkloadHigh)||((this.totWorkloadHigh!= null)&&this.totWorkloadHigh.equals(rhs.totWorkloadHigh))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.creditHrHighGen == rhs.creditHrHighGen)||((this.creditHrHighGen!= null)&&this.creditHrHighGen.equals(rhs.creditHrHighGen))))&&((this.credInd == rhs.credInd)||((this.credInd!= null)&&this.credInd.equals(rhs.credInd))));
    }

}
