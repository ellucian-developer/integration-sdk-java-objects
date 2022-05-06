
package com.ellucian.generated.bpapi.ban.program_code_maintenance.v1_0_0;

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
    "criteria.effDate",
    "criteria.activityDate",
    "criteria.statusInd",
    "progCodePred",
    "dataEntryInd",
    "coasCode",
    "criteria.progCode",
    "title",
    "criteria.termDate",
    "criteria.title",
    "effDate",
    "criteria.dataEntryInd",
    "statusInd",
    "criteria.progCodePred",
    "criteria.coasCode",
    "termDate"
})
@Generated("jsonschema2pojo")
public class ProgramCodeMaintenance100PutRequest {

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVPROG_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_EFF_DATE")
    private Date criteriaEffDate;
    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVPROG_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_STATUS_IND")
    private String criteriaStatusInd;
    /**
     * Predecessor Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE_PRED
     * 
     */
    @JsonProperty("progCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_PROG_CODE_PRED")
    private String progCodePred;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVPROG_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_DATA_ENTRY_IND")
    private String dataEntryInd;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String coasCode;
    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.progCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_PROG_CODE")
    private String criteriaProgCode;
    /**
     * Program Title
     * <p>
     * Lineage reference object : FTVPROG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_TITLE")
    private String title;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROG_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_TERM_DATE")
    private Date criteriaTermDate;
    /**
     * Program Title
     * <p>
     * Lineage reference object : FTVPROG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_TITLE")
    private String criteriaTitle;
    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVPROG_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_EFF_DATE")
    private Date effDate;
    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVPROG_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_DATA_ENTRY_IND")
    private String criteriaDataEntryInd;
    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVPROG_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_STATUS_IND")
    private String statusInd;
    /**
     * Predecessor Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE_PRED
     * 
     */
    @JsonProperty("criteria.progCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_PROG_CODE_PRED")
    private String criteriaProgCodePred;
    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_COAS_CODE, Lookup lineage reference object : ftvcoas")
    private String criteriaCoasCode;
    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROG_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_TERM_DATE")
    private Date termDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVPROG_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public Date getCriteriaEffDate() {
        return criteriaEffDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVPROG_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.effDate")
    public void setCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
    }

    public ProgramCodeMaintenance100PutRequest withCriteriaEffDate(Date criteriaEffDate) {
        this.criteriaEffDate = criteriaEffDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public ProgramCodeMaintenance100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVPROG_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public String getCriteriaStatusInd() {
        return criteriaStatusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVPROG_STATUS_IND
     * 
     */
    @JsonProperty("criteria.statusInd")
    public void setCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
    }

    public ProgramCodeMaintenance100PutRequest withCriteriaStatusInd(String criteriaStatusInd) {
        this.criteriaStatusInd = criteriaStatusInd;
        return this;
    }

    /**
     * Predecessor Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE_PRED
     * 
     */
    @JsonProperty("progCodePred")
    public String getProgCodePred() {
        return progCodePred;
    }

    /**
     * Predecessor Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE_PRED
     * 
     */
    @JsonProperty("progCodePred")
    public void setProgCodePred(String progCodePred) {
        this.progCodePred = progCodePred;
    }

    public ProgramCodeMaintenance100PutRequest withProgCodePred(String progCodePred) {
        this.progCodePred = progCodePred;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVPROG_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    public String getDataEntryInd() {
        return dataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVPROG_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("dataEntryInd")
    public void setDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
    }

    public ProgramCodeMaintenance100PutRequest withDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public ProgramCodeMaintenance100PutRequest withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.progCode")
    public String getCriteriaProgCode() {
        return criteriaProgCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.progCode")
    public void setCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
    }

    public ProgramCodeMaintenance100PutRequest withCriteriaProgCode(String criteriaProgCode) {
        this.criteriaProgCode = criteriaProgCode;
        return this;
    }

    /**
     * Program Title
     * <p>
     * Lineage reference object : FTVPROG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Program Title
     * <p>
     * Lineage reference object : FTVPROG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public ProgramCodeMaintenance100PutRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROG_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public Date getCriteriaTermDate() {
        return criteriaTermDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROG_TERM_DATE
     * 
     */
    @JsonProperty("criteria.termDate")
    public void setCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
    }

    public ProgramCodeMaintenance100PutRequest withCriteriaTermDate(Date criteriaTermDate) {
        this.criteriaTermDate = criteriaTermDate;
        return this;
    }

    /**
     * Program Title
     * <p>
     * Lineage reference object : FTVPROG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public String getCriteriaTitle() {
        return criteriaTitle;
    }

    /**
     * Program Title
     * <p>
     * Lineage reference object : FTVPROG_TITLE
     * (Required)
     * 
     */
    @JsonProperty("criteria.title")
    public void setCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
    }

    public ProgramCodeMaintenance100PutRequest withCriteriaTitle(String criteriaTitle) {
        this.criteriaTitle = criteriaTitle;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVPROG_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * Lineage reference object : FTVPROG_EFF_DATE
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public ProgramCodeMaintenance100PutRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVPROG_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    public String getCriteriaDataEntryInd() {
        return criteriaDataEntryInd;
    }

    /**
     * Data Entry
     * <p>
     * Lineage reference object : FTVPROG_DATA_ENTRY_IND
     * 
     */
    @JsonProperty("criteria.dataEntryInd")
    public void setCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
    }

    public ProgramCodeMaintenance100PutRequest withCriteriaDataEntryInd(String criteriaDataEntryInd) {
        this.criteriaDataEntryInd = criteriaDataEntryInd;
        return this;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVPROG_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Active Status
     * <p>
     * Lineage reference object : FTVPROG_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    public ProgramCodeMaintenance100PutRequest withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Predecessor Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE_PRED
     * 
     */
    @JsonProperty("criteria.progCodePred")
    public String getCriteriaProgCodePred() {
        return criteriaProgCodePred;
    }

    /**
     * Predecessor Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE_PRED
     * 
     */
    @JsonProperty("criteria.progCodePred")
    public void setCriteriaProgCodePred(String criteriaProgCodePred) {
        this.criteriaProgCodePred = criteriaProgCodePred;
    }

    public ProgramCodeMaintenance100PutRequest withCriteriaProgCodePred(String criteriaProgCodePred) {
        this.criteriaProgCodePred = criteriaProgCodePred;
        return this;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public String getCriteriaCoasCode() {
        return criteriaCoasCode;
    }

    /**
     * Chart of Accounts
     * <p>
     * Lineage reference object : FTVPROG_COAS_CODE, Lookup lineage reference object : ftvcoas
     * (Required)
     * 
     */
    @JsonProperty("criteria.coasCode")
    public void setCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
    }

    public ProgramCodeMaintenance100PutRequest withCriteriaCoasCode(String criteriaCoasCode) {
        this.criteriaCoasCode = criteriaCoasCode;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROG_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROG_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public ProgramCodeMaintenance100PutRequest withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public ProgramCodeMaintenance100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProgramCodeMaintenance100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaEffDate");
        sb.append('=');
        sb.append(((this.criteriaEffDate == null)?"<null>":this.criteriaEffDate));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaStatusInd");
        sb.append('=');
        sb.append(((this.criteriaStatusInd == null)?"<null>":this.criteriaStatusInd));
        sb.append(',');
        sb.append("progCodePred");
        sb.append('=');
        sb.append(((this.progCodePred == null)?"<null>":this.progCodePred));
        sb.append(',');
        sb.append("dataEntryInd");
        sb.append('=');
        sb.append(((this.dataEntryInd == null)?"<null>":this.dataEntryInd));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("criteriaProgCode");
        sb.append('=');
        sb.append(((this.criteriaProgCode == null)?"<null>":this.criteriaProgCode));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("criteriaTermDate");
        sb.append('=');
        sb.append(((this.criteriaTermDate == null)?"<null>":this.criteriaTermDate));
        sb.append(',');
        sb.append("criteriaTitle");
        sb.append('=');
        sb.append(((this.criteriaTitle == null)?"<null>":this.criteriaTitle));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("criteriaDataEntryInd");
        sb.append('=');
        sb.append(((this.criteriaDataEntryInd == null)?"<null>":this.criteriaDataEntryInd));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("criteriaProgCodePred");
        sb.append('=');
        sb.append(((this.criteriaProgCodePred == null)?"<null>":this.criteriaProgCodePred));
        sb.append(',');
        sb.append("criteriaCoasCode");
        sb.append('=');
        sb.append(((this.criteriaCoasCode == null)?"<null>":this.criteriaCoasCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
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
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.progCodePred == null)? 0 :this.progCodePred.hashCode()));
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.criteriaCoasCode == null)? 0 :this.criteriaCoasCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermDate == null)? 0 :this.criteriaTermDate.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.criteriaDataEntryInd == null)? 0 :this.criteriaDataEntryInd.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.criteriaProgCode == null)? 0 :this.criteriaProgCode.hashCode()));
        result = ((result* 31)+((this.criteriaStatusInd == null)? 0 :this.criteriaStatusInd.hashCode()));
        result = ((result* 31)+((this.criteriaEffDate == null)? 0 :this.criteriaEffDate.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaProgCodePred == null)? 0 :this.criteriaProgCodePred.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.criteriaTitle == null)? 0 :this.criteriaTitle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramCodeMaintenance100PutRequest) == false) {
            return false;
        }
        ProgramCodeMaintenance100PutRequest rhs = ((ProgramCodeMaintenance100PutRequest) other);
        return ((((((((((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.progCodePred == rhs.progCodePred)||((this.progCodePred!= null)&&this.progCodePred.equals(rhs.progCodePred))))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.criteriaCoasCode == rhs.criteriaCoasCode)||((this.criteriaCoasCode!= null)&&this.criteriaCoasCode.equals(rhs.criteriaCoasCode))))&&((this.criteriaTermDate == rhs.criteriaTermDate)||((this.criteriaTermDate!= null)&&this.criteriaTermDate.equals(rhs.criteriaTermDate))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.criteriaDataEntryInd == rhs.criteriaDataEntryInd)||((this.criteriaDataEntryInd!= null)&&this.criteriaDataEntryInd.equals(rhs.criteriaDataEntryInd))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.criteriaProgCode == rhs.criteriaProgCode)||((this.criteriaProgCode!= null)&&this.criteriaProgCode.equals(rhs.criteriaProgCode))))&&((this.criteriaStatusInd == rhs.criteriaStatusInd)||((this.criteriaStatusInd!= null)&&this.criteriaStatusInd.equals(rhs.criteriaStatusInd))))&&((this.criteriaEffDate == rhs.criteriaEffDate)||((this.criteriaEffDate!= null)&&this.criteriaEffDate.equals(rhs.criteriaEffDate))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaProgCodePred == rhs.criteriaProgCodePred)||((this.criteriaProgCodePred!= null)&&this.criteriaProgCodePred.equals(rhs.criteriaProgCodePred))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.criteriaTitle == rhs.criteriaTitle)||((this.criteriaTitle!= null)&&this.criteriaTitle.equals(rhs.criteriaTitle))));
    }

}
