
package com.ellucian.generated.bpapi.ban.employee_status_change_jobs.v1_0_0;

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
    "allCbox",
    "effDate",
    "actionList",
    "nbrjobsPersonnelDate",
    "lreaCode",
    "id",
    "nbrjobsStatus",
    "actionDate",
    "actionJobCbox",
    "loaBegDate",
    "nbrjobsJcreCode"
})
@Generated("jsonschema2pojo")
public class EmployeeStatusChangeJobs100PutRequest {

    /**
     * All Records
     * <p>
     * Lineage reference object : allCbox
     * 
     */
    @JsonProperty("allCbox")
    @JsonPropertyDescription("Lineage reference object : allCbox")
    private Object allCbox;
    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("effDate")
    private Date effDate;
    /**
     * Action
     * <p>
     * Lineage reference object : actionList
     * (Required)
     * 
     */
    @JsonProperty("actionList")
    @JsonPropertyDescription("Lineage reference object : actionList")
    private Object actionList;
    /**
     * Personnel Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsPersonnelDate")
    private Date nbrjobsPersonnelDate;
    /**
     * Leave Reason
     * <p>
     * Lineage reference object : PEBEMPL_LREA_CODE
     * 
     */
    @JsonProperty("lreaCode")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LREA_CODE")
    private String lreaCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsStatus")
    private String nbrjobsStatus;
    /**
     * Personnel Date
     * <p>
     * Lineage reference object : actionDate
     * 
     */
    @JsonProperty("actionDate")
    @JsonPropertyDescription("Lineage reference object : actionDate")
    private Object actionDate;
    /**
     * Job Assignment Change
     * <p>
     * 
     * 
     */
    @JsonProperty("actionJobCbox")
    private String actionJobCbox;
    /**
     * Leave Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LOA_BEG_DATE")
    private Date loaBegDate;
    /**
     * Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsJcreCode")
    private String nbrjobsJcreCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * All Records
     * <p>
     * Lineage reference object : allCbox
     * 
     */
    @JsonProperty("allCbox")
    public Object getAllCbox() {
        return allCbox;
    }

    /**
     * All Records
     * <p>
     * Lineage reference object : allCbox
     * 
     */
    @JsonProperty("allCbox")
    public void setAllCbox(Object allCbox) {
        this.allCbox = allCbox;
    }

    public EmployeeStatusChangeJobs100PutRequest withAllCbox(Object allCbox) {
        this.allCbox = allCbox;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * 
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public EmployeeStatusChangeJobs100PutRequest withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Action
     * <p>
     * Lineage reference object : actionList
     * (Required)
     * 
     */
    @JsonProperty("actionList")
    public Object getActionList() {
        return actionList;
    }

    /**
     * Action
     * <p>
     * Lineage reference object : actionList
     * (Required)
     * 
     */
    @JsonProperty("actionList")
    public void setActionList(Object actionList) {
        this.actionList = actionList;
    }

    public EmployeeStatusChangeJobs100PutRequest withActionList(Object actionList) {
        this.actionList = actionList;
        return this;
    }

    /**
     * Personnel Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsPersonnelDate")
    public Date getNbrjobsPersonnelDate() {
        return nbrjobsPersonnelDate;
    }

    /**
     * Personnel Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsPersonnelDate")
    public void setNbrjobsPersonnelDate(Date nbrjobsPersonnelDate) {
        this.nbrjobsPersonnelDate = nbrjobsPersonnelDate;
    }

    public EmployeeStatusChangeJobs100PutRequest withNbrjobsPersonnelDate(Date nbrjobsPersonnelDate) {
        this.nbrjobsPersonnelDate = nbrjobsPersonnelDate;
        return this;
    }

    /**
     * Leave Reason
     * <p>
     * Lineage reference object : PEBEMPL_LREA_CODE
     * 
     */
    @JsonProperty("lreaCode")
    public String getLreaCode() {
        return lreaCode;
    }

    /**
     * Leave Reason
     * <p>
     * Lineage reference object : PEBEMPL_LREA_CODE
     * 
     */
    @JsonProperty("lreaCode")
    public void setLreaCode(String lreaCode) {
        this.lreaCode = lreaCode;
    }

    public EmployeeStatusChangeJobs100PutRequest withLreaCode(String lreaCode) {
        this.lreaCode = lreaCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public EmployeeStatusChangeJobs100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsStatus")
    public String getNbrjobsStatus() {
        return nbrjobsStatus;
    }

    /**
     * Status
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsStatus")
    public void setNbrjobsStatus(String nbrjobsStatus) {
        this.nbrjobsStatus = nbrjobsStatus;
    }

    public EmployeeStatusChangeJobs100PutRequest withNbrjobsStatus(String nbrjobsStatus) {
        this.nbrjobsStatus = nbrjobsStatus;
        return this;
    }

    /**
     * Personnel Date
     * <p>
     * Lineage reference object : actionDate
     * 
     */
    @JsonProperty("actionDate")
    public Object getActionDate() {
        return actionDate;
    }

    /**
     * Personnel Date
     * <p>
     * Lineage reference object : actionDate
     * 
     */
    @JsonProperty("actionDate")
    public void setActionDate(Object actionDate) {
        this.actionDate = actionDate;
    }

    public EmployeeStatusChangeJobs100PutRequest withActionDate(Object actionDate) {
        this.actionDate = actionDate;
        return this;
    }

    /**
     * Job Assignment Change
     * <p>
     * 
     * 
     */
    @JsonProperty("actionJobCbox")
    public String getActionJobCbox() {
        return actionJobCbox;
    }

    /**
     * Job Assignment Change
     * <p>
     * 
     * 
     */
    @JsonProperty("actionJobCbox")
    public void setActionJobCbox(String actionJobCbox) {
        this.actionJobCbox = actionJobCbox;
    }

    public EmployeeStatusChangeJobs100PutRequest withActionJobCbox(String actionJobCbox) {
        this.actionJobCbox = actionJobCbox;
        return this;
    }

    /**
     * Leave Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    public Date getLoaBegDate() {
        return loaBegDate;
    }

    /**
     * Leave Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    public void setLoaBegDate(Date loaBegDate) {
        this.loaBegDate = loaBegDate;
    }

    public EmployeeStatusChangeJobs100PutRequest withLoaBegDate(Date loaBegDate) {
        this.loaBegDate = loaBegDate;
        return this;
    }

    /**
     * Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsJcreCode")
    public String getNbrjobsJcreCode() {
        return nbrjobsJcreCode;
    }

    /**
     * Reason
     * <p>
     * 
     * 
     */
    @JsonProperty("nbrjobsJcreCode")
    public void setNbrjobsJcreCode(String nbrjobsJcreCode) {
        this.nbrjobsJcreCode = nbrjobsJcreCode;
    }

    public EmployeeStatusChangeJobs100PutRequest withNbrjobsJcreCode(String nbrjobsJcreCode) {
        this.nbrjobsJcreCode = nbrjobsJcreCode;
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

    public EmployeeStatusChangeJobs100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeStatusChangeJobs100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allCbox");
        sb.append('=');
        sb.append(((this.allCbox == null)?"<null>":this.allCbox));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("actionList");
        sb.append('=');
        sb.append(((this.actionList == null)?"<null>":this.actionList));
        sb.append(',');
        sb.append("nbrjobsPersonnelDate");
        sb.append('=');
        sb.append(((this.nbrjobsPersonnelDate == null)?"<null>":this.nbrjobsPersonnelDate));
        sb.append(',');
        sb.append("lreaCode");
        sb.append('=');
        sb.append(((this.lreaCode == null)?"<null>":this.lreaCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nbrjobsStatus");
        sb.append('=');
        sb.append(((this.nbrjobsStatus == null)?"<null>":this.nbrjobsStatus));
        sb.append(',');
        sb.append("actionDate");
        sb.append('=');
        sb.append(((this.actionDate == null)?"<null>":this.actionDate));
        sb.append(',');
        sb.append("actionJobCbox");
        sb.append('=');
        sb.append(((this.actionJobCbox == null)?"<null>":this.actionJobCbox));
        sb.append(',');
        sb.append("loaBegDate");
        sb.append('=');
        sb.append(((this.loaBegDate == null)?"<null>":this.loaBegDate));
        sb.append(',');
        sb.append("nbrjobsJcreCode");
        sb.append('=');
        sb.append(((this.nbrjobsJcreCode == null)?"<null>":this.nbrjobsJcreCode));
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
        result = ((result* 31)+((this.actionList == null)? 0 :this.actionList.hashCode()));
        result = ((result* 31)+((this.nbrjobsPersonnelDate == null)? 0 :this.nbrjobsPersonnelDate.hashCode()));
        result = ((result* 31)+((this.nbrjobsStatus == null)? 0 :this.nbrjobsStatus.hashCode()));
        result = ((result* 31)+((this.actionJobCbox == null)? 0 :this.actionJobCbox.hashCode()));
        result = ((result* 31)+((this.loaBegDate == null)? 0 :this.loaBegDate.hashCode()));
        result = ((result* 31)+((this.allCbox == null)? 0 :this.allCbox.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.lreaCode == null)? 0 :this.lreaCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actionDate == null)? 0 :this.actionDate.hashCode()));
        result = ((result* 31)+((this.nbrjobsJcreCode == null)? 0 :this.nbrjobsJcreCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeStatusChangeJobs100PutRequest) == false) {
            return false;
        }
        EmployeeStatusChangeJobs100PutRequest rhs = ((EmployeeStatusChangeJobs100PutRequest) other);
        return (((((((((((((this.actionList == rhs.actionList)||((this.actionList!= null)&&this.actionList.equals(rhs.actionList)))&&((this.nbrjobsPersonnelDate == rhs.nbrjobsPersonnelDate)||((this.nbrjobsPersonnelDate!= null)&&this.nbrjobsPersonnelDate.equals(rhs.nbrjobsPersonnelDate))))&&((this.nbrjobsStatus == rhs.nbrjobsStatus)||((this.nbrjobsStatus!= null)&&this.nbrjobsStatus.equals(rhs.nbrjobsStatus))))&&((this.actionJobCbox == rhs.actionJobCbox)||((this.actionJobCbox!= null)&&this.actionJobCbox.equals(rhs.actionJobCbox))))&&((this.loaBegDate == rhs.loaBegDate)||((this.loaBegDate!= null)&&this.loaBegDate.equals(rhs.loaBegDate))))&&((this.allCbox == rhs.allCbox)||((this.allCbox!= null)&&this.allCbox.equals(rhs.allCbox))))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.lreaCode == rhs.lreaCode)||((this.lreaCode!= null)&&this.lreaCode.equals(rhs.lreaCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actionDate == rhs.actionDate)||((this.actionDate!= null)&&this.actionDate.equals(rhs.actionDate))))&&((this.nbrjobsJcreCode == rhs.nbrjobsJcreCode)||((this.nbrjobsJcreCode!= null)&&this.nbrjobsJcreCode.equals(rhs.nbrjobsJcreCode))));
    }

}
