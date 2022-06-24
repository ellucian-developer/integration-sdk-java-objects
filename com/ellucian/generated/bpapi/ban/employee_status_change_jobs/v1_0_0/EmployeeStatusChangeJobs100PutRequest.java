
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
    "actionList",
    "lreaCode",
    "id",
    "actionDate",
    "loaBegDate"
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
    private String allCbox;
    /**
     * Action
     * <p>
     * Lineage reference object : actionList
     * (Required)
     * 
     */
    @JsonProperty("actionList")
    @JsonPropertyDescription("Lineage reference object : actionList")
    private String actionList;
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
    private String id;
    /**
     * Personnel Date
     * <p>
     * Lineage reference object : actionDate
     * 
     */
    @JsonProperty("actionDate")
    @JsonPropertyDescription("Lineage reference object : actionDate")
    private Date actionDate;
    /**
     * Leave Begin Date
     * <p>
     * Lineage reference object : PEBEMPL_LOA_BEG_DATE
     * 
     */
    @JsonProperty("loaBegDate")
    @JsonPropertyDescription("Lineage reference object : PEBEMPL_LOA_BEG_DATE")
    private Date loaBegDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * All Records
     * <p>
     * Lineage reference object : allCbox
     * 
     */
    @JsonProperty("allCbox")
    public String getAllCbox() {
        return allCbox;
    }

    /**
     * All Records
     * <p>
     * Lineage reference object : allCbox
     * 
     */
    @JsonProperty("allCbox")
    public void setAllCbox(String allCbox) {
        this.allCbox = allCbox;
    }

    public EmployeeStatusChangeJobs100PutRequest withAllCbox(String allCbox) {
        this.allCbox = allCbox;
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
    public String getActionList() {
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
    public void setActionList(String actionList) {
        this.actionList = actionList;
    }

    public EmployeeStatusChangeJobs100PutRequest withActionList(String actionList) {
        this.actionList = actionList;
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

    public EmployeeStatusChangeJobs100PutRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Personnel Date
     * <p>
     * Lineage reference object : actionDate
     * 
     */
    @JsonProperty("actionDate")
    public Date getActionDate() {
        return actionDate;
    }

    /**
     * Personnel Date
     * <p>
     * Lineage reference object : actionDate
     * 
     */
    @JsonProperty("actionDate")
    public void setActionDate(Date actionDate) {
        this.actionDate = actionDate;
    }

    public EmployeeStatusChangeJobs100PutRequest withActionDate(Date actionDate) {
        this.actionDate = actionDate;
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
        sb.append("actionList");
        sb.append('=');
        sb.append(((this.actionList == null)?"<null>":this.actionList));
        sb.append(',');
        sb.append("lreaCode");
        sb.append('=');
        sb.append(((this.lreaCode == null)?"<null>":this.lreaCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("actionDate");
        sb.append('=');
        sb.append(((this.actionDate == null)?"<null>":this.actionDate));
        sb.append(',');
        sb.append("loaBegDate");
        sb.append('=');
        sb.append(((this.loaBegDate == null)?"<null>":this.loaBegDate));
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
        result = ((result* 31)+((this.allCbox == null)? 0 :this.allCbox.hashCode()));
        result = ((result* 31)+((this.actionList == null)? 0 :this.actionList.hashCode()));
        result = ((result* 31)+((this.lreaCode == null)? 0 :this.lreaCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actionDate == null)? 0 :this.actionDate.hashCode()));
        result = ((result* 31)+((this.loaBegDate == null)? 0 :this.loaBegDate.hashCode()));
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
        return ((((((((this.allCbox == rhs.allCbox)||((this.allCbox!= null)&&this.allCbox.equals(rhs.allCbox)))&&((this.actionList == rhs.actionList)||((this.actionList!= null)&&this.actionList.equals(rhs.actionList))))&&((this.lreaCode == rhs.lreaCode)||((this.lreaCode!= null)&&this.lreaCode.equals(rhs.lreaCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actionDate == rhs.actionDate)||((this.actionDate!= null)&&this.actionDate.equals(rhs.actionDate))))&&((this.loaBegDate == rhs.loaBegDate)||((this.loaBegDate!= null)&&this.loaBegDate.equals(rhs.loaBegDate))));
    }

}
