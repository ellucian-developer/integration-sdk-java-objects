
package com.ellucian.generated.bpapi.ban.employee_status_change_jobs.v1_0_0;

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
    "id",
    "actionDate"
})
@Generated("jsonschema2pojo")
public class EmployeeStatusChangeJobs100GetRequest {

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
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Personnel Date
     * <p>
     * Lineage reference object : actionDate
     * 
     */
    @JsonProperty("actionDate")
    @JsonPropertyDescription("Lineage reference object : actionDate")
    private Object actionDate;
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

    public EmployeeStatusChangeJobs100GetRequest withAllCbox(Object allCbox) {
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

    public EmployeeStatusChangeJobs100GetRequest withActionList(Object actionList) {
        this.actionList = actionList;
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

    public EmployeeStatusChangeJobs100GetRequest withId(Object id) {
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

    public EmployeeStatusChangeJobs100GetRequest withActionDate(Object actionDate) {
        this.actionDate = actionDate;
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

    public EmployeeStatusChangeJobs100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeStatusChangeJobs100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("allCbox");
        sb.append('=');
        sb.append(((this.allCbox == null)?"<null>":this.allCbox));
        sb.append(',');
        sb.append("actionList");
        sb.append('=');
        sb.append(((this.actionList == null)?"<null>":this.actionList));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("actionDate");
        sb.append('=');
        sb.append(((this.actionDate == null)?"<null>":this.actionDate));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.actionDate == null)? 0 :this.actionDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeStatusChangeJobs100GetRequest) == false) {
            return false;
        }
        EmployeeStatusChangeJobs100GetRequest rhs = ((EmployeeStatusChangeJobs100GetRequest) other);
        return ((((((this.allCbox == rhs.allCbox)||((this.allCbox!= null)&&this.allCbox.equals(rhs.allCbox)))&&((this.actionList == rhs.actionList)||((this.actionList!= null)&&this.actionList.equals(rhs.actionList))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actionDate == rhs.actionDate)||((this.actionDate!= null)&&this.actionDate.equals(rhs.actionDate))));
    }

}
