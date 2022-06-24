
package com.ellucian.generated.bpapi.ban.employee_new_hire.v1_0_0;

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
    "confirmedReDate",
    "surnamePrefix",
    "pebemplCoasCodeHome",
    "jcreCode",
    "prefix",
    "contractType",
    "deferPay",
    "suffix",
    "title",
    "ethnCode",
    "posn",
    "pebemplBcatCode",
    "fromDate",
    "pebemplFirstHireDate",
    "beginDate",
    "ntypCode",
    "suff",
    "pebemplNewHireInd",
    "pebemplOrgnCodeHome",
    "step",
    "id",
    "ethnCde",
    "pebemplEclsCode",
    "confirmedReCde"
})
@Generated("jsonschema2pojo")
public class EmployeeNewHire100PutRequest {

    /**
     * Confirmed Date
     * <p>
     * Lineage reference object : confirmedReDate
     * 
     */
    @JsonProperty("confirmedReDate")
    @JsonPropertyDescription("Lineage reference object : confirmedReDate")
    private Date confirmedReDate;
    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : surnamePrefix
     * 
     */
    @JsonProperty("surnamePrefix")
    @JsonPropertyDescription("Lineage reference object : surnamePrefix")
    private String surnamePrefix;
    /**
     * Home Department COA
     * <p>
     * Lineage reference object : pebemplCoasCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplCoasCodeHome")
    @JsonPropertyDescription("Lineage reference object : pebemplCoasCodeHome")
    private String pebemplCoasCodeHome;
    /**
     * Change Reason
     * <p>
     * Lineage reference object : jcreCode
     * 
     */
    @JsonProperty("jcreCode")
    @JsonPropertyDescription("Lineage reference object : jcreCode")
    private String jcreCode;
    /**
     * Prefix
     * <p>
     * Lineage reference object : prefix
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("Lineage reference object : prefix")
    private String prefix;
    /**
     * Job Type
     * <p>
     * Lineage reference object : contractType
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    @JsonPropertyDescription("Lineage reference object : contractType")
    private String contractType;
    /**
     * Deferred Pay
     * <p>
     * Lineage reference object : deferPay
     * 
     */
    @JsonProperty("deferPay")
    @JsonPropertyDescription("Lineage reference object : deferPay")
    private String deferPay;
    /**
     * Suffix
     * <p>
     * Lineage reference object : suffix
     * 
     */
    @JsonProperty("suffix")
    @JsonPropertyDescription("Lineage reference object : suffix")
    private String suffix;
    /**
     * Title
     * <p>
     * Lineage reference object : jobsTitle
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : jobsTitle")
    private String title;
    /**
     * Ethnicity
     * <p>
     * Lineage reference object : ethnCode, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    @JsonPropertyDescription("Lineage reference object : ethnCode, Lookup lineage reference object : stvethn")
    private String ethnCode;
    /**
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private String posn;
    /**
     * Benefit Category
     * <p>
     * Lineage reference object : pebemplBcatCode, Lookup lineage reference object : ptrecbc,ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("pebemplBcatCode")
    @JsonPropertyDescription("Lineage reference object : pebemplBcatCode, Lookup lineage reference object : ptrecbc,ptrbcat")
    private String pebemplBcatCode;
    /**
     * Address and Telephone
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    @JsonPropertyDescription("Lineage reference object : SPRADDR_FROM_DATE")
    private Date fromDate;
    /**
     * Original Hire
     * <p>
     * Lineage reference object : pebemplFirstHireDate
     * (Required)
     * 
     */
    @JsonProperty("pebemplFirstHireDate")
    @JsonPropertyDescription("Lineage reference object : pebemplFirstHireDate")
    private Date pebemplFirstHireDate;
    /**
     * Begin Date
     * <p>
     * Lineage reference object : beginDate
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    @JsonPropertyDescription("Lineage reference object : beginDate")
    private Date beginDate;
    /**
     * Name Type
     * <p>
     * Lineage reference object : ntypCode, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    @JsonPropertyDescription("Lineage reference object : ntypCode, Lookup lineage reference object : gtvntyp")
    private String ntypCode;
    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * (Required)
     * 
     */
    @JsonProperty("suff")
    @JsonPropertyDescription("Lineage reference object : suff")
    private String suff;
    /**
     * Allow New Hire Benefits Enrollment
     * <p>
     * Lineage reference object : pebemplNewHireInd
     * 
     */
    @JsonProperty("pebemplNewHireInd")
    @JsonPropertyDescription("Lineage reference object : pebemplNewHireInd")
    private String pebemplNewHireInd;
    /**
     * Organization
     * <p>
     * Lineage reference object : pebemplOrgnCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplOrgnCodeHome")
    @JsonPropertyDescription("Lineage reference object : pebemplOrgnCodeHome")
    private String pebemplOrgnCodeHome;
    /**
     * Step
     * <p>
     * Lineage reference object : step
     * (Required)
     * 
     */
    @JsonProperty("step")
    @JsonPropertyDescription("Lineage reference object : step")
    private Double step;
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
     * New Ethnicity
     * <p>
     * Lineage reference object : ethnCde
     * 
     */
    @JsonProperty("ethnCde")
    @JsonPropertyDescription("Lineage reference object : ethnCde")
    private String ethnCde;
    /**
     * Employee Class
     * <p>
     * Lineage reference object : pebemplEclsCode
     * (Required)
     * 
     */
    @JsonProperty("pebemplEclsCode")
    @JsonPropertyDescription("Lineage reference object : pebemplEclsCode")
    private String pebemplEclsCode;
    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : confirmedReCde
     * 
     */
    @JsonProperty("confirmedReCde")
    @JsonPropertyDescription("Lineage reference object : confirmedReCde")
    private String confirmedReCde;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Confirmed Date
     * <p>
     * Lineage reference object : confirmedReDate
     * 
     */
    @JsonProperty("confirmedReDate")
    public Date getConfirmedReDate() {
        return confirmedReDate;
    }

    /**
     * Confirmed Date
     * <p>
     * Lineage reference object : confirmedReDate
     * 
     */
    @JsonProperty("confirmedReDate")
    public void setConfirmedReDate(Date confirmedReDate) {
        this.confirmedReDate = confirmedReDate;
    }

    public EmployeeNewHire100PutRequest withConfirmedReDate(Date confirmedReDate) {
        this.confirmedReDate = confirmedReDate;
        return this;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : surnamePrefix
     * 
     */
    @JsonProperty("surnamePrefix")
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * Last Name Prefix
     * <p>
     * Lineage reference object : surnamePrefix
     * 
     */
    @JsonProperty("surnamePrefix")
    public void setSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
    }

    public EmployeeNewHire100PutRequest withSurnamePrefix(String surnamePrefix) {
        this.surnamePrefix = surnamePrefix;
        return this;
    }

    /**
     * Home Department COA
     * <p>
     * Lineage reference object : pebemplCoasCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplCoasCodeHome")
    public String getPebemplCoasCodeHome() {
        return pebemplCoasCodeHome;
    }

    /**
     * Home Department COA
     * <p>
     * Lineage reference object : pebemplCoasCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplCoasCodeHome")
    public void setPebemplCoasCodeHome(String pebemplCoasCodeHome) {
        this.pebemplCoasCodeHome = pebemplCoasCodeHome;
    }

    public EmployeeNewHire100PutRequest withPebemplCoasCodeHome(String pebemplCoasCodeHome) {
        this.pebemplCoasCodeHome = pebemplCoasCodeHome;
        return this;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : jcreCode
     * 
     */
    @JsonProperty("jcreCode")
    public String getJcreCode() {
        return jcreCode;
    }

    /**
     * Change Reason
     * <p>
     * Lineage reference object : jcreCode
     * 
     */
    @JsonProperty("jcreCode")
    public void setJcreCode(String jcreCode) {
        this.jcreCode = jcreCode;
    }

    public EmployeeNewHire100PutRequest withJcreCode(String jcreCode) {
        this.jcreCode = jcreCode;
        return this;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : prefix
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * Prefix
     * <p>
     * Lineage reference object : prefix
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public EmployeeNewHire100PutRequest withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Job Type
     * <p>
     * Lineage reference object : contractType
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    public String getContractType() {
        return contractType;
    }

    /**
     * Job Type
     * <p>
     * Lineage reference object : contractType
     * (Required)
     * 
     */
    @JsonProperty("contractType")
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public EmployeeNewHire100PutRequest withContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }

    /**
     * Deferred Pay
     * <p>
     * Lineage reference object : deferPay
     * 
     */
    @JsonProperty("deferPay")
    public String getDeferPay() {
        return deferPay;
    }

    /**
     * Deferred Pay
     * <p>
     * Lineage reference object : deferPay
     * 
     */
    @JsonProperty("deferPay")
    public void setDeferPay(String deferPay) {
        this.deferPay = deferPay;
    }

    public EmployeeNewHire100PutRequest withDeferPay(String deferPay) {
        this.deferPay = deferPay;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suffix
     * 
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suffix
     * 
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public EmployeeNewHire100PutRequest withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : jobsTitle
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * Lineage reference object : jobsTitle
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public EmployeeNewHire100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Ethnicity
     * <p>
     * Lineage reference object : ethnCode, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    public String getEthnCode() {
        return ethnCode;
    }

    /**
     * Ethnicity
     * <p>
     * Lineage reference object : ethnCode, Lookup lineage reference object : stvethn
     * 
     */
    @JsonProperty("ethnCode")
    public void setEthnCode(String ethnCode) {
        this.ethnCode = ethnCode;
    }

    public EmployeeNewHire100PutRequest withEthnCode(String ethnCode) {
        this.ethnCode = ethnCode;
        return this;
    }

    /**
     * Position
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
     * Position
     * <p>
     * Lineage reference object : posn
     * (Required)
     * 
     */
    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public EmployeeNewHire100PutRequest withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : pebemplBcatCode, Lookup lineage reference object : ptrecbc,ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("pebemplBcatCode")
    public String getPebemplBcatCode() {
        return pebemplBcatCode;
    }

    /**
     * Benefit Category
     * <p>
     * Lineage reference object : pebemplBcatCode, Lookup lineage reference object : ptrecbc,ptrbcat
     * (Required)
     * 
     */
    @JsonProperty("pebemplBcatCode")
    public void setPebemplBcatCode(String pebemplBcatCode) {
        this.pebemplBcatCode = pebemplBcatCode;
    }

    public EmployeeNewHire100PutRequest withPebemplBcatCode(String pebemplBcatCode) {
        this.pebemplBcatCode = pebemplBcatCode;
        return this;
    }

    /**
     * Address and Telephone
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    public Date getFromDate() {
        return fromDate;
    }

    /**
     * Address and Telephone
     * <p>
     * Lineage reference object : SPRADDR_FROM_DATE
     * 
     */
    @JsonProperty("fromDate")
    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public EmployeeNewHire100PutRequest withFromDate(Date fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Original Hire
     * <p>
     * Lineage reference object : pebemplFirstHireDate
     * (Required)
     * 
     */
    @JsonProperty("pebemplFirstHireDate")
    public Date getPebemplFirstHireDate() {
        return pebemplFirstHireDate;
    }

    /**
     * Original Hire
     * <p>
     * Lineage reference object : pebemplFirstHireDate
     * (Required)
     * 
     */
    @JsonProperty("pebemplFirstHireDate")
    public void setPebemplFirstHireDate(Date pebemplFirstHireDate) {
        this.pebemplFirstHireDate = pebemplFirstHireDate;
    }

    public EmployeeNewHire100PutRequest withPebemplFirstHireDate(Date pebemplFirstHireDate) {
        this.pebemplFirstHireDate = pebemplFirstHireDate;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : beginDate
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date
     * <p>
     * Lineage reference object : beginDate
     * (Required)
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public EmployeeNewHire100PutRequest withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : ntypCode, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    public String getNtypCode() {
        return ntypCode;
    }

    /**
     * Name Type
     * <p>
     * Lineage reference object : ntypCode, Lookup lineage reference object : gtvntyp
     * 
     */
    @JsonProperty("ntypCode")
    public void setNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
    }

    public EmployeeNewHire100PutRequest withNtypCode(String ntypCode) {
        this.ntypCode = ntypCode;
        return this;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * (Required)
     * 
     */
    @JsonProperty("suff")
    public String getSuff() {
        return suff;
    }

    /**
     * Suffix
     * <p>
     * Lineage reference object : suff
     * (Required)
     * 
     */
    @JsonProperty("suff")
    public void setSuff(String suff) {
        this.suff = suff;
    }

    public EmployeeNewHire100PutRequest withSuff(String suff) {
        this.suff = suff;
        return this;
    }

    /**
     * Allow New Hire Benefits Enrollment
     * <p>
     * Lineage reference object : pebemplNewHireInd
     * 
     */
    @JsonProperty("pebemplNewHireInd")
    public String getPebemplNewHireInd() {
        return pebemplNewHireInd;
    }

    /**
     * Allow New Hire Benefits Enrollment
     * <p>
     * Lineage reference object : pebemplNewHireInd
     * 
     */
    @JsonProperty("pebemplNewHireInd")
    public void setPebemplNewHireInd(String pebemplNewHireInd) {
        this.pebemplNewHireInd = pebemplNewHireInd;
    }

    public EmployeeNewHire100PutRequest withPebemplNewHireInd(String pebemplNewHireInd) {
        this.pebemplNewHireInd = pebemplNewHireInd;
        return this;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : pebemplOrgnCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplOrgnCodeHome")
    public String getPebemplOrgnCodeHome() {
        return pebemplOrgnCodeHome;
    }

    /**
     * Organization
     * <p>
     * Lineage reference object : pebemplOrgnCodeHome
     * (Required)
     * 
     */
    @JsonProperty("pebemplOrgnCodeHome")
    public void setPebemplOrgnCodeHome(String pebemplOrgnCodeHome) {
        this.pebemplOrgnCodeHome = pebemplOrgnCodeHome;
    }

    public EmployeeNewHire100PutRequest withPebemplOrgnCodeHome(String pebemplOrgnCodeHome) {
        this.pebemplOrgnCodeHome = pebemplOrgnCodeHome;
        return this;
    }

    /**
     * Step
     * <p>
     * Lineage reference object : step
     * (Required)
     * 
     */
    @JsonProperty("step")
    public Double getStep() {
        return step;
    }

    /**
     * Step
     * <p>
     * Lineage reference object : step
     * (Required)
     * 
     */
    @JsonProperty("step")
    public void setStep(Double step) {
        this.step = step;
    }

    public EmployeeNewHire100PutRequest withStep(Double step) {
        this.step = step;
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

    public EmployeeNewHire100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : ethnCde
     * 
     */
    @JsonProperty("ethnCde")
    public String getEthnCde() {
        return ethnCde;
    }

    /**
     * New Ethnicity
     * <p>
     * Lineage reference object : ethnCde
     * 
     */
    @JsonProperty("ethnCde")
    public void setEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
    }

    public EmployeeNewHire100PutRequest withEthnCde(String ethnCde) {
        this.ethnCde = ethnCde;
        return this;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : pebemplEclsCode
     * (Required)
     * 
     */
    @JsonProperty("pebemplEclsCode")
    public String getPebemplEclsCode() {
        return pebemplEclsCode;
    }

    /**
     * Employee Class
     * <p>
     * Lineage reference object : pebemplEclsCode
     * (Required)
     * 
     */
    @JsonProperty("pebemplEclsCode")
    public void setPebemplEclsCode(String pebemplEclsCode) {
        this.pebemplEclsCode = pebemplEclsCode;
    }

    public EmployeeNewHire100PutRequest withPebemplEclsCode(String pebemplEclsCode) {
        this.pebemplEclsCode = pebemplEclsCode;
        return this;
    }

    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : confirmedReCde
     * 
     */
    @JsonProperty("confirmedReCde")
    public String getConfirmedReCde() {
        return confirmedReCde;
    }

    /**
     * Ethnicity and Race Confirmed
     * <p>
     * Lineage reference object : confirmedReCde
     * 
     */
    @JsonProperty("confirmedReCde")
    public void setConfirmedReCde(String confirmedReCde) {
        this.confirmedReCde = confirmedReCde;
    }

    public EmployeeNewHire100PutRequest withConfirmedReCde(String confirmedReCde) {
        this.confirmedReCde = confirmedReCde;
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

    public EmployeeNewHire100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeNewHire100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("confirmedReDate");
        sb.append('=');
        sb.append(((this.confirmedReDate == null)?"<null>":this.confirmedReDate));
        sb.append(',');
        sb.append("surnamePrefix");
        sb.append('=');
        sb.append(((this.surnamePrefix == null)?"<null>":this.surnamePrefix));
        sb.append(',');
        sb.append("pebemplCoasCodeHome");
        sb.append('=');
        sb.append(((this.pebemplCoasCodeHome == null)?"<null>":this.pebemplCoasCodeHome));
        sb.append(',');
        sb.append("jcreCode");
        sb.append('=');
        sb.append(((this.jcreCode == null)?"<null>":this.jcreCode));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("contractType");
        sb.append('=');
        sb.append(((this.contractType == null)?"<null>":this.contractType));
        sb.append(',');
        sb.append("deferPay");
        sb.append('=');
        sb.append(((this.deferPay == null)?"<null>":this.deferPay));
        sb.append(',');
        sb.append("suffix");
        sb.append('=');
        sb.append(((this.suffix == null)?"<null>":this.suffix));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("ethnCode");
        sb.append('=');
        sb.append(((this.ethnCode == null)?"<null>":this.ethnCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("pebemplBcatCode");
        sb.append('=');
        sb.append(((this.pebemplBcatCode == null)?"<null>":this.pebemplBcatCode));
        sb.append(',');
        sb.append("fromDate");
        sb.append('=');
        sb.append(((this.fromDate == null)?"<null>":this.fromDate));
        sb.append(',');
        sb.append("pebemplFirstHireDate");
        sb.append('=');
        sb.append(((this.pebemplFirstHireDate == null)?"<null>":this.pebemplFirstHireDate));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("ntypCode");
        sb.append('=');
        sb.append(((this.ntypCode == null)?"<null>":this.ntypCode));
        sb.append(',');
        sb.append("suff");
        sb.append('=');
        sb.append(((this.suff == null)?"<null>":this.suff));
        sb.append(',');
        sb.append("pebemplNewHireInd");
        sb.append('=');
        sb.append(((this.pebemplNewHireInd == null)?"<null>":this.pebemplNewHireInd));
        sb.append(',');
        sb.append("pebemplOrgnCodeHome");
        sb.append('=');
        sb.append(((this.pebemplOrgnCodeHome == null)?"<null>":this.pebemplOrgnCodeHome));
        sb.append(',');
        sb.append("step");
        sb.append('=');
        sb.append(((this.step == null)?"<null>":this.step));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("ethnCde");
        sb.append('=');
        sb.append(((this.ethnCde == null)?"<null>":this.ethnCde));
        sb.append(',');
        sb.append("pebemplEclsCode");
        sb.append('=');
        sb.append(((this.pebemplEclsCode == null)?"<null>":this.pebemplEclsCode));
        sb.append(',');
        sb.append("confirmedReCde");
        sb.append('=');
        sb.append(((this.confirmedReCde == null)?"<null>":this.confirmedReCde));
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
        result = ((result* 31)+((this.surnamePrefix == null)? 0 :this.surnamePrefix.hashCode()));
        result = ((result* 31)+((this.pebemplCoasCodeHome == null)? 0 :this.pebemplCoasCodeHome.hashCode()));
        result = ((result* 31)+((this.jcreCode == null)? 0 :this.jcreCode.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.contractType == null)? 0 :this.contractType.hashCode()));
        result = ((result* 31)+((this.deferPay == null)? 0 :this.deferPay.hashCode()));
        result = ((result* 31)+((this.suffix == null)? 0 :this.suffix.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.ethnCode == null)? 0 :this.ethnCode.hashCode()));
        result = ((result* 31)+((this.suff == null)? 0 :this.suff.hashCode()));
        result = ((result* 31)+((this.pebemplNewHireInd == null)? 0 :this.pebemplNewHireInd.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.ethnCde == null)? 0 :this.ethnCde.hashCode()));
        result = ((result* 31)+((this.pebemplEclsCode == null)? 0 :this.pebemplEclsCode.hashCode()));
        result = ((result* 31)+((this.confirmedReDate == null)? 0 :this.confirmedReDate.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        result = ((result* 31)+((this.pebemplBcatCode == null)? 0 :this.pebemplBcatCode.hashCode()));
        result = ((result* 31)+((this.fromDate == null)? 0 :this.fromDate.hashCode()));
        result = ((result* 31)+((this.pebemplFirstHireDate == null)? 0 :this.pebemplFirstHireDate.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.ntypCode == null)? 0 :this.ntypCode.hashCode()));
        result = ((result* 31)+((this.pebemplOrgnCodeHome == null)? 0 :this.pebemplOrgnCodeHome.hashCode()));
        result = ((result* 31)+((this.step == null)? 0 :this.step.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.confirmedReCde == null)? 0 :this.confirmedReCde.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeNewHire100PutRequest) == false) {
            return false;
        }
        EmployeeNewHire100PutRequest rhs = ((EmployeeNewHire100PutRequest) other);
        return ((((((((((((((((((((((((((this.surnamePrefix == rhs.surnamePrefix)||((this.surnamePrefix!= null)&&this.surnamePrefix.equals(rhs.surnamePrefix)))&&((this.pebemplCoasCodeHome == rhs.pebemplCoasCodeHome)||((this.pebemplCoasCodeHome!= null)&&this.pebemplCoasCodeHome.equals(rhs.pebemplCoasCodeHome))))&&((this.jcreCode == rhs.jcreCode)||((this.jcreCode!= null)&&this.jcreCode.equals(rhs.jcreCode))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.contractType == rhs.contractType)||((this.contractType!= null)&&this.contractType.equals(rhs.contractType))))&&((this.deferPay == rhs.deferPay)||((this.deferPay!= null)&&this.deferPay.equals(rhs.deferPay))))&&((this.suffix == rhs.suffix)||((this.suffix!= null)&&this.suffix.equals(rhs.suffix))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.ethnCode == rhs.ethnCode)||((this.ethnCode!= null)&&this.ethnCode.equals(rhs.ethnCode))))&&((this.suff == rhs.suff)||((this.suff!= null)&&this.suff.equals(rhs.suff))))&&((this.pebemplNewHireInd == rhs.pebemplNewHireInd)||((this.pebemplNewHireInd!= null)&&this.pebemplNewHireInd.equals(rhs.pebemplNewHireInd))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.ethnCde == rhs.ethnCde)||((this.ethnCde!= null)&&this.ethnCde.equals(rhs.ethnCde))))&&((this.pebemplEclsCode == rhs.pebemplEclsCode)||((this.pebemplEclsCode!= null)&&this.pebemplEclsCode.equals(rhs.pebemplEclsCode))))&&((this.confirmedReDate == rhs.confirmedReDate)||((this.confirmedReDate!= null)&&this.confirmedReDate.equals(rhs.confirmedReDate))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))))&&((this.pebemplBcatCode == rhs.pebemplBcatCode)||((this.pebemplBcatCode!= null)&&this.pebemplBcatCode.equals(rhs.pebemplBcatCode))))&&((this.fromDate == rhs.fromDate)||((this.fromDate!= null)&&this.fromDate.equals(rhs.fromDate))))&&((this.pebemplFirstHireDate == rhs.pebemplFirstHireDate)||((this.pebemplFirstHireDate!= null)&&this.pebemplFirstHireDate.equals(rhs.pebemplFirstHireDate))))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.ntypCode == rhs.ntypCode)||((this.ntypCode!= null)&&this.ntypCode.equals(rhs.ntypCode))))&&((this.pebemplOrgnCodeHome == rhs.pebemplOrgnCodeHome)||((this.pebemplOrgnCodeHome!= null)&&this.pebemplOrgnCodeHome.equals(rhs.pebemplOrgnCodeHome))))&&((this.step == rhs.step)||((this.step!= null)&&this.step.equals(rhs.step))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.confirmedReCde == rhs.confirmedReCde)||((this.confirmedReCde!= null)&&this.confirmedReCde.equals(rhs.confirmedReCde))));
    }

}
