
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
    "effDate",
    "activityDate",
    "displayNchgDate",
    "progCodePred",
    "predTitle",
    "dataEntryInd",
    "statusInd",
    "progCode",
    "coasCode",
    "termDate",
    "title"
})
@Generated("jsonschema2pojo")
public class ProgramCodeMaintenance100PutResponse {

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
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    private Date displayNchgDate;
    /**
     * Predecessor Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE_PRED
     * 
     */
    @JsonProperty("progCodePred")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_PROG_CODE_PRED")
    private String progCodePred;
    @JsonProperty("predTitle")
    private String predTitle;
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
     * Active Status
     * <p>
     * Lineage reference object : FTVPROG_STATUS_IND
     * 
     */
    @JsonProperty("statusInd")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_STATUS_IND")
    private String statusInd;
    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE
     * (Required)
     * 
     */
    @JsonProperty("progCode")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_PROG_CODE")
    private String progCode;
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
     * Termination Date
     * <p>
     * Lineage reference object : FTVPROG_TERM_DATE
     * 
     */
    @JsonProperty("termDate")
    @JsonPropertyDescription("Lineage reference object : FTVPROG_TERM_DATE")
    private Date termDate;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public ProgramCodeMaintenance100PutResponse withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Last Activity Date
     * <p>
     * Lineage reference object : FTVPROG_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public ProgramCodeMaintenance100PutResponse withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public Date getDisplayNchgDate() {
        return displayNchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("displayNchgDate")
    public void setDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
    }

    public ProgramCodeMaintenance100PutResponse withDisplayNchgDate(Date displayNchgDate) {
        this.displayNchgDate = displayNchgDate;
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

    public ProgramCodeMaintenance100PutResponse withProgCodePred(String progCodePred) {
        this.progCodePred = progCodePred;
        return this;
    }

    @JsonProperty("predTitle")
    public String getPredTitle() {
        return predTitle;
    }

    @JsonProperty("predTitle")
    public void setPredTitle(String predTitle) {
        this.predTitle = predTitle;
    }

    public ProgramCodeMaintenance100PutResponse withPredTitle(String predTitle) {
        this.predTitle = predTitle;
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

    public ProgramCodeMaintenance100PutResponse withDataEntryInd(String dataEntryInd) {
        this.dataEntryInd = dataEntryInd;
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

    public ProgramCodeMaintenance100PutResponse withStatusInd(String statusInd) {
        this.statusInd = statusInd;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE
     * (Required)
     * 
     */
    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : FTVPROG_PROG_CODE
     * (Required)
     * 
     */
    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public ProgramCodeMaintenance100PutResponse withProgCode(String progCode) {
        this.progCode = progCode;
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

    public ProgramCodeMaintenance100PutResponse withCoasCode(String coasCode) {
        this.coasCode = coasCode;
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

    public ProgramCodeMaintenance100PutResponse withTermDate(Date termDate) {
        this.termDate = termDate;
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

    public ProgramCodeMaintenance100PutResponse withTitle(String title) {
        this.title = title;
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

    public ProgramCodeMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProgramCodeMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("displayNchgDate");
        sb.append('=');
        sb.append(((this.displayNchgDate == null)?"<null>":this.displayNchgDate));
        sb.append(',');
        sb.append("progCodePred");
        sb.append('=');
        sb.append(((this.progCodePred == null)?"<null>":this.progCodePred));
        sb.append(',');
        sb.append("predTitle");
        sb.append('=');
        sb.append(((this.predTitle == null)?"<null>":this.predTitle));
        sb.append(',');
        sb.append("dataEntryInd");
        sb.append('=');
        sb.append(((this.dataEntryInd == null)?"<null>":this.dataEntryInd));
        sb.append(',');
        sb.append("statusInd");
        sb.append('=');
        sb.append(((this.statusInd == null)?"<null>":this.statusInd));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
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
        result = ((result* 31)+((this.progCodePred == null)? 0 :this.progCodePred.hashCode()));
        result = ((result* 31)+((this.dataEntryInd == null)? 0 :this.dataEntryInd.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.displayNchgDate == null)? 0 :this.displayNchgDate.hashCode()));
        result = ((result* 31)+((this.predTitle == null)? 0 :this.predTitle.hashCode()));
        result = ((result* 31)+((this.statusInd == null)? 0 :this.statusInd.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramCodeMaintenance100PutResponse) == false) {
            return false;
        }
        ProgramCodeMaintenance100PutResponse rhs = ((ProgramCodeMaintenance100PutResponse) other);
        return (((((((((((((this.progCodePred == rhs.progCodePred)||((this.progCodePred!= null)&&this.progCodePred.equals(rhs.progCodePred)))&&((this.dataEntryInd == rhs.dataEntryInd)||((this.dataEntryInd!= null)&&this.dataEntryInd.equals(rhs.dataEntryInd))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.displayNchgDate == rhs.displayNchgDate)||((this.displayNchgDate!= null)&&this.displayNchgDate.equals(rhs.displayNchgDate))))&&((this.predTitle == rhs.predTitle)||((this.predTitle!= null)&&this.predTitle.equals(rhs.predTitle))))&&((this.statusInd == rhs.statusInd)||((this.statusInd!= null)&&this.statusInd.equals(rhs.statusInd))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))));
    }

}
