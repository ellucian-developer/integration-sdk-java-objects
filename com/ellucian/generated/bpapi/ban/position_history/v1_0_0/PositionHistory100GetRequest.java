
package com.ellucian.generated.bpapi.ban.position_history.v1_0_0;

import java.util.Date;
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
    "probationUnits",
    "bargCode",
    "exemptInd",
    "ecipCode",
    "pclsCode",
    "title",
    "eclsCode",
    "posn",
    "esocCode",
    "queryDate",
    "apptPct",
    "jobpCode",
    "grade",
    "posnReports",
    "pgrpCode",
    "step",
    "table",
    "jblnCode"
})
@Generated("jsonschema2pojo")
public class PositionHistory100GetRequest {

    /**
     * Probation Period
     * <p>
     * Lineage reference object : NBRPOSH_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_PROBATION_UNITS")
    private Double probationUnits;
    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBRPOSH_BARG_CODE
     * 
     */
    @JsonProperty("bargCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_BARG_CODE")
    private String bargCode;
    /**
     * Lineage reference object : NBRPOSH_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_EXEMPT_IND")
    private String exemptInd;
    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBRPOSH_ECIP_CODE
     * 
     */
    @JsonProperty("ecipCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_ECIP_CODE")
    private String ecipCode;
    /**
     * Position Class
     * <p>
     * Lineage reference object : NBRPOSH_PCLS_CODE
     * 
     */
    @JsonProperty("pclsCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_PCLS_CODE")
    private String pclsCode;
    /**
     * Position Title
     * <p>
     * Lineage reference object : NBRPOSH_TITLE
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_TITLE")
    private String title;
    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBRPOSH_ECLS_CODE
     * 
     */
    @JsonProperty("eclsCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_ECLS_CODE")
    private String eclsCode;
    /**
     * Position Number
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private String posn;
    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBRPOSH_ESOC_CODE
     * 
     */
    @JsonProperty("esocCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_ESOC_CODE")
    private String esocCode;
    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    @JsonPropertyDescription("Lineage reference object : queryDate")
    private Date queryDate;
    /**
     * Appointment Percentage
     * <p>
     * Lineage reference object : NBRPOSH_APPT_PCT
     * 
     */
    @JsonProperty("apptPct")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_APPT_PCT")
    private Double apptPct;
    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBRPOSH_JOBP_CODE
     * 
     */
    @JsonProperty("jobpCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_JOBP_CODE")
    private String jobpCode;
    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBRPOSH_GRADE
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_GRADE")
    private String grade;
    /**
     * Reports to
     * <p>
     * Lineage reference object : NBRPOSH_POSN_REPORTS
     * 
     */
    @JsonProperty("posnReports")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_POSN_REPORTS")
    private String posnReports;
    /**
     * Position Group
     * <p>
     * Lineage reference object : NBRPOSH_PGRP_CODE
     * 
     */
    @JsonProperty("pgrpCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_PGRP_CODE")
    private String pgrpCode;
    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBRPOSH_STEP
     * 
     */
    @JsonProperty("step")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_STEP")
    private Double step;
    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBRPOSH_TABLE
     * 
     */
    @JsonProperty("table")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_TABLE")
    private String table;
    /**
     * Job Location
     * <p>
     * Lineage reference object : NBRPOSH_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    @JsonPropertyDescription("Lineage reference object : NBRPOSH_JBLN_CODE")
    private String jblnCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Probation Period
     * <p>
     * Lineage reference object : NBRPOSH_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    public Double getProbationUnits() {
        return probationUnits;
    }

    /**
     * Probation Period
     * <p>
     * Lineage reference object : NBRPOSH_PROBATION_UNITS
     * 
     */
    @JsonProperty("probationUnits")
    public void setProbationUnits(Double probationUnits) {
        this.probationUnits = probationUnits;
    }

    public PositionHistory100GetRequest withProbationUnits(Double probationUnits) {
        this.probationUnits = probationUnits;
        return this;
    }

    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBRPOSH_BARG_CODE
     * 
     */
    @JsonProperty("bargCode")
    public String getBargCode() {
        return bargCode;
    }

    /**
     * Bargaining Unit
     * <p>
     * Lineage reference object : NBRPOSH_BARG_CODE
     * 
     */
    @JsonProperty("bargCode")
    public void setBargCode(String bargCode) {
        this.bargCode = bargCode;
    }

    public PositionHistory100GetRequest withBargCode(String bargCode) {
        this.bargCode = bargCode;
        return this;
    }

    /**
     * Lineage reference object : NBRPOSH_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    public String getExemptInd() {
        return exemptInd;
    }

    /**
     * Lineage reference object : NBRPOSH_EXEMPT_IND
     * 
     */
    @JsonProperty("exemptInd")
    public void setExemptInd(String exemptInd) {
        this.exemptInd = exemptInd;
    }

    public PositionHistory100GetRequest withExemptInd(String exemptInd) {
        this.exemptInd = exemptInd;
        return this;
    }

    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBRPOSH_ECIP_CODE
     * 
     */
    @JsonProperty("ecipCode")
    public String getEcipCode() {
        return ecipCode;
    }

    /**
     * Employment Category
     * <p>
     * Lineage reference object : NBRPOSH_ECIP_CODE
     * 
     */
    @JsonProperty("ecipCode")
    public void setEcipCode(String ecipCode) {
        this.ecipCode = ecipCode;
    }

    public PositionHistory100GetRequest withEcipCode(String ecipCode) {
        this.ecipCode = ecipCode;
        return this;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : NBRPOSH_PCLS_CODE
     * 
     */
    @JsonProperty("pclsCode")
    public String getPclsCode() {
        return pclsCode;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : NBRPOSH_PCLS_CODE
     * 
     */
    @JsonProperty("pclsCode")
    public void setPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
    }

    public PositionHistory100GetRequest withPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
        return this;
    }

    /**
     * Position Title
     * <p>
     * Lineage reference object : NBRPOSH_TITLE
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Position Title
     * <p>
     * Lineage reference object : NBRPOSH_TITLE
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public PositionHistory100GetRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBRPOSH_ECLS_CODE
     * 
     */
    @JsonProperty("eclsCode")
    public String getEclsCode() {
        return eclsCode;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : NBRPOSH_ECLS_CODE
     * 
     */
    @JsonProperty("eclsCode")
    public void setEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
    }

    public PositionHistory100GetRequest withEclsCode(String eclsCode) {
        this.eclsCode = eclsCode;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public PositionHistory100GetRequest withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBRPOSH_ESOC_CODE
     * 
     */
    @JsonProperty("esocCode")
    public String getEsocCode() {
        return esocCode;
    }

    /**
     * Standard Occupational Category
     * <p>
     * Lineage reference object : NBRPOSH_ESOC_CODE
     * 
     */
    @JsonProperty("esocCode")
    public void setEsocCode(String esocCode) {
        this.esocCode = esocCode;
    }

    public PositionHistory100GetRequest withEsocCode(String esocCode) {
        this.esocCode = esocCode;
        return this;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public Date getQueryDate() {
        return queryDate;
    }

    /**
     * Query Date
     * <p>
     * Lineage reference object : queryDate
     * (Required)
     * 
     */
    @JsonProperty("queryDate")
    public void setQueryDate(Date queryDate) {
        this.queryDate = queryDate;
    }

    public PositionHistory100GetRequest withQueryDate(Date queryDate) {
        this.queryDate = queryDate;
        return this;
    }

    /**
     * Appointment Percentage
     * <p>
     * Lineage reference object : NBRPOSH_APPT_PCT
     * 
     */
    @JsonProperty("apptPct")
    public Double getApptPct() {
        return apptPct;
    }

    /**
     * Appointment Percentage
     * <p>
     * Lineage reference object : NBRPOSH_APPT_PCT
     * 
     */
    @JsonProperty("apptPct")
    public void setApptPct(Double apptPct) {
        this.apptPct = apptPct;
    }

    public PositionHistory100GetRequest withApptPct(Double apptPct) {
        this.apptPct = apptPct;
        return this;
    }

    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBRPOSH_JOBP_CODE
     * 
     */
    @JsonProperty("jobpCode")
    public String getJobpCode() {
        return jobpCode;
    }

    /**
     * Job Progression
     * <p>
     * Lineage reference object : NBRPOSH_JOBP_CODE
     * 
     */
    @JsonProperty("jobpCode")
    public void setJobpCode(String jobpCode) {
        this.jobpCode = jobpCode;
    }

    public PositionHistory100GetRequest withJobpCode(String jobpCode) {
        this.jobpCode = jobpCode;
        return this;
    }

    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBRPOSH_GRADE
     * 
     */
    @JsonProperty("grade")
    public String getGrade() {
        return grade;
    }

    /**
     * Salary Grade
     * <p>
     * Lineage reference object : NBRPOSH_GRADE
     * 
     */
    @JsonProperty("grade")
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public PositionHistory100GetRequest withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Reports to
     * <p>
     * Lineage reference object : NBRPOSH_POSN_REPORTS
     * 
     */
    @JsonProperty("posnReports")
    public String getPosnReports() {
        return posnReports;
    }

    /**
     * Reports to
     * <p>
     * Lineage reference object : NBRPOSH_POSN_REPORTS
     * 
     */
    @JsonProperty("posnReports")
    public void setPosnReports(String posnReports) {
        this.posnReports = posnReports;
    }

    public PositionHistory100GetRequest withPosnReports(String posnReports) {
        this.posnReports = posnReports;
        return this;
    }

    /**
     * Position Group
     * <p>
     * Lineage reference object : NBRPOSH_PGRP_CODE
     * 
     */
    @JsonProperty("pgrpCode")
    public String getPgrpCode() {
        return pgrpCode;
    }

    /**
     * Position Group
     * <p>
     * Lineage reference object : NBRPOSH_PGRP_CODE
     * 
     */
    @JsonProperty("pgrpCode")
    public void setPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
    }

    public PositionHistory100GetRequest withPgrpCode(String pgrpCode) {
        this.pgrpCode = pgrpCode;
        return this;
    }

    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBRPOSH_STEP
     * 
     */
    @JsonProperty("step")
    public Double getStep() {
        return step;
    }

    /**
     * Salary Step
     * <p>
     * Lineage reference object : NBRPOSH_STEP
     * 
     */
    @JsonProperty("step")
    public void setStep(Double step) {
        this.step = step;
    }

    public PositionHistory100GetRequest withStep(Double step) {
        this.step = step;
        return this;
    }

    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBRPOSH_TABLE
     * 
     */
    @JsonProperty("table")
    public String getTable() {
        return table;
    }

    /**
     * Salary Table
     * <p>
     * Lineage reference object : NBRPOSH_TABLE
     * 
     */
    @JsonProperty("table")
    public void setTable(String table) {
        this.table = table;
    }

    public PositionHistory100GetRequest withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Job Location
     * <p>
     * Lineage reference object : NBRPOSH_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    public String getJblnCode() {
        return jblnCode;
    }

    /**
     * Job Location
     * <p>
     * Lineage reference object : NBRPOSH_JBLN_CODE
     * 
     */
    @JsonProperty("jblnCode")
    public void setJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
    }

    public PositionHistory100GetRequest withJblnCode(String jblnCode) {
        this.jblnCode = jblnCode;
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

    public PositionHistory100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionHistory100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("probationUnits");
        sb.append('=');
        sb.append(((this.probationUnits == null)?"<null>":this.probationUnits));
        sb.append(',');
        sb.append("bargCode");
        sb.append('=');
        sb.append(((this.bargCode == null)?"<null>":this.bargCode));
        sb.append(',');
        sb.append("exemptInd");
        sb.append('=');
        sb.append(((this.exemptInd == null)?"<null>":this.exemptInd));
        sb.append(',');
        sb.append("ecipCode");
        sb.append('=');
        sb.append(((this.ecipCode == null)?"<null>":this.ecipCode));
        sb.append(',');
        sb.append("pclsCode");
        sb.append('=');
        sb.append(((this.pclsCode == null)?"<null>":this.pclsCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("eclsCode");
        sb.append('=');
        sb.append(((this.eclsCode == null)?"<null>":this.eclsCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("esocCode");
        sb.append('=');
        sb.append(((this.esocCode == null)?"<null>":this.esocCode));
        sb.append(',');
        sb.append("queryDate");
        sb.append('=');
        sb.append(((this.queryDate == null)?"<null>":this.queryDate));
        sb.append(',');
        sb.append("apptPct");
        sb.append('=');
        sb.append(((this.apptPct == null)?"<null>":this.apptPct));
        sb.append(',');
        sb.append("jobpCode");
        sb.append('=');
        sb.append(((this.jobpCode == null)?"<null>":this.jobpCode));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("posnReports");
        sb.append('=');
        sb.append(((this.posnReports == null)?"<null>":this.posnReports));
        sb.append(',');
        sb.append("pgrpCode");
        sb.append('=');
        sb.append(((this.pgrpCode == null)?"<null>":this.pgrpCode));
        sb.append(',');
        sb.append("step");
        sb.append('=');
        sb.append(((this.step == null)?"<null>":this.step));
        sb.append(',');
        sb.append("table");
        sb.append('=');
        sb.append(((this.table == null)?"<null>":this.table));
        sb.append(',');
        sb.append("jblnCode");
        sb.append('=');
        sb.append(((this.jblnCode == null)?"<null>":this.jblnCode));
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
        result = ((result* 31)+((this.probationUnits == null)? 0 :this.probationUnits.hashCode()));
        result = ((result* 31)+((this.bargCode == null)? 0 :this.bargCode.hashCode()));
        result = ((result* 31)+((this.exemptInd == null)? 0 :this.exemptInd.hashCode()));
        result = ((result* 31)+((this.ecipCode == null)? 0 :this.ecipCode.hashCode()));
        result = ((result* 31)+((this.pclsCode == null)? 0 :this.pclsCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.eclsCode == null)? 0 :this.eclsCode.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.esocCode == null)? 0 :this.esocCode.hashCode()));
        result = ((result* 31)+((this.queryDate == null)? 0 :this.queryDate.hashCode()));
        result = ((result* 31)+((this.apptPct == null)? 0 :this.apptPct.hashCode()));
        result = ((result* 31)+((this.jobpCode == null)? 0 :this.jobpCode.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        result = ((result* 31)+((this.posnReports == null)? 0 :this.posnReports.hashCode()));
        result = ((result* 31)+((this.pgrpCode == null)? 0 :this.pgrpCode.hashCode()));
        result = ((result* 31)+((this.step == null)? 0 :this.step.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.table == null)? 0 :this.table.hashCode()));
        result = ((result* 31)+((this.jblnCode == null)? 0 :this.jblnCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionHistory100GetRequest) == false) {
            return false;
        }
        PositionHistory100GetRequest rhs = ((PositionHistory100GetRequest) other);
        return ((((((((((((((((((((this.probationUnits == rhs.probationUnits)||((this.probationUnits!= null)&&this.probationUnits.equals(rhs.probationUnits)))&&((this.bargCode == rhs.bargCode)||((this.bargCode!= null)&&this.bargCode.equals(rhs.bargCode))))&&((this.exemptInd == rhs.exemptInd)||((this.exemptInd!= null)&&this.exemptInd.equals(rhs.exemptInd))))&&((this.ecipCode == rhs.ecipCode)||((this.ecipCode!= null)&&this.ecipCode.equals(rhs.ecipCode))))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.eclsCode == rhs.eclsCode)||((this.eclsCode!= null)&&this.eclsCode.equals(rhs.eclsCode))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.esocCode == rhs.esocCode)||((this.esocCode!= null)&&this.esocCode.equals(rhs.esocCode))))&&((this.queryDate == rhs.queryDate)||((this.queryDate!= null)&&this.queryDate.equals(rhs.queryDate))))&&((this.apptPct == rhs.apptPct)||((this.apptPct!= null)&&this.apptPct.equals(rhs.apptPct))))&&((this.jobpCode == rhs.jobpCode)||((this.jobpCode!= null)&&this.jobpCode.equals(rhs.jobpCode))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))))&&((this.posnReports == rhs.posnReports)||((this.posnReports!= null)&&this.posnReports.equals(rhs.posnReports))))&&((this.pgrpCode == rhs.pgrpCode)||((this.pgrpCode!= null)&&this.pgrpCode.equals(rhs.pgrpCode))))&&((this.step == rhs.step)||((this.step!= null)&&this.step.equals(rhs.step))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.table == rhs.table)||((this.table!= null)&&this.table.equals(rhs.table))))&&((this.jblnCode == rhs.jblnCode)||((this.jblnCode!= null)&&this.jblnCode.equals(rhs.jblnCode))));
    }

}
