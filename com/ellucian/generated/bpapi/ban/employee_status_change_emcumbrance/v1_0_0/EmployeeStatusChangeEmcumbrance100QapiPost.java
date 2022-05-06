
package com.ellucian.generated.bpapi.ban.employee_status_change_emcumbrance.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "actionList",
    "allCbox",
    "actionDate"
})
@Generated("jsonschema2pojo")
public class EmployeeStatusChangeEmcumbrance100QapiPost {

    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actionList")
    private String actionList;
    @JsonProperty("allCbox")
    private String allCbox;
    @JsonProperty("actionDate")
    private String actionDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmployeeStatusChangeEmcumbrance100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actionList")
    public String getActionList() {
        return actionList;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("actionList")
    public void setActionList(String actionList) {
        this.actionList = actionList;
    }

    public EmployeeStatusChangeEmcumbrance100QapiPost withActionList(String actionList) {
        this.actionList = actionList;
        return this;
    }

    @JsonProperty("allCbox")
    public String getAllCbox() {
        return allCbox;
    }

    @JsonProperty("allCbox")
    public void setAllCbox(String allCbox) {
        this.allCbox = allCbox;
    }

    public EmployeeStatusChangeEmcumbrance100QapiPost withAllCbox(String allCbox) {
        this.allCbox = allCbox;
        return this;
    }

    @JsonProperty("actionDate")
    public String getActionDate() {
        return actionDate;
    }

    @JsonProperty("actionDate")
    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }

    public EmployeeStatusChangeEmcumbrance100QapiPost withActionDate(String actionDate) {
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

    public EmployeeStatusChangeEmcumbrance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeStatusChangeEmcumbrance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("actionList");
        sb.append('=');
        sb.append(((this.actionList == null)?"<null>":this.actionList));
        sb.append(',');
        sb.append("allCbox");
        sb.append('=');
        sb.append(((this.allCbox == null)?"<null>":this.allCbox));
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
        if ((other instanceof EmployeeStatusChangeEmcumbrance100QapiPost) == false) {
            return false;
        }
        EmployeeStatusChangeEmcumbrance100QapiPost rhs = ((EmployeeStatusChangeEmcumbrance100QapiPost) other);
        return ((((((this.allCbox == rhs.allCbox)||((this.allCbox!= null)&&this.allCbox.equals(rhs.allCbox)))&&((this.actionList == rhs.actionList)||((this.actionList!= null)&&this.actionList.equals(rhs.actionList))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.actionDate == rhs.actionDate)||((this.actionDate!= null)&&this.actionDate.equals(rhs.actionDate))));
    }

}
