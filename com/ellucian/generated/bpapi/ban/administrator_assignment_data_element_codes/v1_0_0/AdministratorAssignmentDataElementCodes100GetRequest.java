
package com.ellucian.generated.bpapi.ban.administrator_assignment_data_element_codes.v1_0_0;

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
    "valTable",
    "activityDate",
    "code",
    "systemReq",
    "baseTable",
    "desc"
})
@Generated("jsonschema2pojo")
public class AdministratorAssignmentDataElementCodes100GetRequest {

    /**
     * Validation Table
     * <p>
     * Lineage reference object : STVADDA_VAL_TABLE
     * 
     */
    @JsonProperty("valTable")
    @JsonPropertyDescription("Lineage reference object : STVADDA_VAL_TABLE")
    private String valTable;
    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVADDA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : STVADDA_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Data Element
     * <p>
     * Lineage reference object : STVADDA_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVADDA_CODE")
    private String code;
    /**
     * Lineage reference object : STVADDA_SYSTEM_REQ
     * 
     */
    @JsonProperty("systemReq")
    @JsonPropertyDescription("Lineage reference object : STVADDA_SYSTEM_REQ")
    private String systemReq;
    /**
     * Base Table
     * <p>
     * Lineage reference object : STVADDA_BASE_TABLE
     * (Required)
     * 
     */
    @JsonProperty("baseTable")
    @JsonPropertyDescription("Lineage reference object : STVADDA_BASE_TABLE")
    private String baseTable;
    /**
     * Description
     * <p>
     * Lineage reference object : STVADDA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVADDA_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Validation Table
     * <p>
     * Lineage reference object : STVADDA_VAL_TABLE
     * 
     */
    @JsonProperty("valTable")
    public String getValTable() {
        return valTable;
    }

    /**
     * Validation Table
     * <p>
     * Lineage reference object : STVADDA_VAL_TABLE
     * 
     */
    @JsonProperty("valTable")
    public void setValTable(String valTable) {
        this.valTable = valTable;
    }

    public AdministratorAssignmentDataElementCodes100GetRequest withValTable(String valTable) {
        this.valTable = valTable;
        return this;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVADDA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : STVADDA_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public AdministratorAssignmentDataElementCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Data Element
     * <p>
     * Lineage reference object : STVADDA_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Data Element
     * <p>
     * Lineage reference object : STVADDA_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AdministratorAssignmentDataElementCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : STVADDA_SYSTEM_REQ
     * 
     */
    @JsonProperty("systemReq")
    public String getSystemReq() {
        return systemReq;
    }

    /**
     * Lineage reference object : STVADDA_SYSTEM_REQ
     * 
     */
    @JsonProperty("systemReq")
    public void setSystemReq(String systemReq) {
        this.systemReq = systemReq;
    }

    public AdministratorAssignmentDataElementCodes100GetRequest withSystemReq(String systemReq) {
        this.systemReq = systemReq;
        return this;
    }

    /**
     * Base Table
     * <p>
     * Lineage reference object : STVADDA_BASE_TABLE
     * (Required)
     * 
     */
    @JsonProperty("baseTable")
    public String getBaseTable() {
        return baseTable;
    }

    /**
     * Base Table
     * <p>
     * Lineage reference object : STVADDA_BASE_TABLE
     * (Required)
     * 
     */
    @JsonProperty("baseTable")
    public void setBaseTable(String baseTable) {
        this.baseTable = baseTable;
    }

    public AdministratorAssignmentDataElementCodes100GetRequest withBaseTable(String baseTable) {
        this.baseTable = baseTable;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVADDA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVADDA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AdministratorAssignmentDataElementCodes100GetRequest withDesc(String desc) {
        this.desc = desc;
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

    public AdministratorAssignmentDataElementCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdministratorAssignmentDataElementCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("valTable");
        sb.append('=');
        sb.append(((this.valTable == null)?"<null>":this.valTable));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("systemReq");
        sb.append('=');
        sb.append(((this.systemReq == null)?"<null>":this.systemReq));
        sb.append(',');
        sb.append("baseTable");
        sb.append('=');
        sb.append(((this.baseTable == null)?"<null>":this.baseTable));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.valTable == null)? 0 :this.valTable.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.systemReq == null)? 0 :this.systemReq.hashCode()));
        result = ((result* 31)+((this.baseTable == null)? 0 :this.baseTable.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdministratorAssignmentDataElementCodes100GetRequest) == false) {
            return false;
        }
        AdministratorAssignmentDataElementCodes100GetRequest rhs = ((AdministratorAssignmentDataElementCodes100GetRequest) other);
        return ((((((((this.valTable == rhs.valTable)||((this.valTable!= null)&&this.valTable.equals(rhs.valTable)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.systemReq == rhs.systemReq)||((this.systemReq!= null)&&this.systemReq.equals(rhs.systemReq))))&&((this.baseTable == rhs.baseTable)||((this.baseTable!= null)&&this.baseTable.equals(rhs.baseTable))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
