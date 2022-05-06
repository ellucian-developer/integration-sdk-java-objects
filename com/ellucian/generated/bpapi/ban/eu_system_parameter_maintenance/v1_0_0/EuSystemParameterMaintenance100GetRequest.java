
package com.ellucian.generated.bpapi.ban.eu_system_parameter_maintenance.v1_0_0;

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
    "notes",
    "description",
    "restrictValuesInd",
    "gkvksysCode",
    "paramName",
    "value",
    "group"
})
@Generated("jsonschema2pojo")
public class EuSystemParameterMaintenance100GetRequest {

    /**
     * Notes
     * <p>
     * Lineage reference object : GKBKSYS_NOTES
     * 
     */
    @JsonProperty("notes")
    @JsonPropertyDescription("Lineage reference object : GKBKSYS_NOTES")
    private String notes;
    /**
     * Description
     * <p>
     * Lineage reference object : GKBKSYS_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Lineage reference object : GKBKSYS_DESCRIPTION")
    private String description;
    /**
     * Lineage reference object : GKBKSYS_RESTRICT_VALUES_IND
     * 
     */
    @JsonProperty("restrictValuesInd")
    @JsonPropertyDescription("Lineage reference object : GKBKSYS_RESTRICT_VALUES_IND")
    private String restrictValuesInd;
    /**
     * System
     * <p>
     * Lineage reference object : gkvksysCode, Lookup lineage reference object : GKVKSYS
     * (Required)
     * 
     */
    @JsonProperty("gkvksysCode")
    @JsonPropertyDescription("Lineage reference object : gkvksysCode, Lookup lineage reference object : GKVKSYS")
    private Object gkvksysCode;
    /**
     * Name
     * <p>
     * Lineage reference object : GKBKSYS_PARAM_NAME
     * (Required)
     * 
     */
    @JsonProperty("paramName")
    @JsonPropertyDescription("Lineage reference object : GKBKSYS_PARAM_NAME")
    private String paramName;
    /**
     * Value
     * <p>
     * Lineage reference object : GKBKSYS_VALUE, Lookup lineage reference object : GKRKSYV
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Lineage reference object : GKBKSYS_VALUE, Lookup lineage reference object : GKRKSYV")
    private String value;
    /**
     * Name
     * <p>
     * Lineage reference object : GKBKSYS_GROUP, Lookup lineage reference object : gkbksys
     * 
     */
    @JsonProperty("group")
    @JsonPropertyDescription("Lineage reference object : GKBKSYS_GROUP, Lookup lineage reference object : gkbksys")
    private String group;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Notes
     * <p>
     * Lineage reference object : GKBKSYS_NOTES
     * 
     */
    @JsonProperty("notes")
    public String getNotes() {
        return notes;
    }

    /**
     * Notes
     * <p>
     * Lineage reference object : GKBKSYS_NOTES
     * 
     */
    @JsonProperty("notes")
    public void setNotes(String notes) {
        this.notes = notes;
    }

    public EuSystemParameterMaintenance100GetRequest withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GKBKSYS_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GKBKSYS_DESCRIPTION
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EuSystemParameterMaintenance100GetRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Lineage reference object : GKBKSYS_RESTRICT_VALUES_IND
     * 
     */
    @JsonProperty("restrictValuesInd")
    public String getRestrictValuesInd() {
        return restrictValuesInd;
    }

    /**
     * Lineage reference object : GKBKSYS_RESTRICT_VALUES_IND
     * 
     */
    @JsonProperty("restrictValuesInd")
    public void setRestrictValuesInd(String restrictValuesInd) {
        this.restrictValuesInd = restrictValuesInd;
    }

    public EuSystemParameterMaintenance100GetRequest withRestrictValuesInd(String restrictValuesInd) {
        this.restrictValuesInd = restrictValuesInd;
        return this;
    }

    /**
     * System
     * <p>
     * Lineage reference object : gkvksysCode, Lookup lineage reference object : GKVKSYS
     * (Required)
     * 
     */
    @JsonProperty("gkvksysCode")
    public Object getGkvksysCode() {
        return gkvksysCode;
    }

    /**
     * System
     * <p>
     * Lineage reference object : gkvksysCode, Lookup lineage reference object : GKVKSYS
     * (Required)
     * 
     */
    @JsonProperty("gkvksysCode")
    public void setGkvksysCode(Object gkvksysCode) {
        this.gkvksysCode = gkvksysCode;
    }

    public EuSystemParameterMaintenance100GetRequest withGkvksysCode(Object gkvksysCode) {
        this.gkvksysCode = gkvksysCode;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : GKBKSYS_PARAM_NAME
     * (Required)
     * 
     */
    @JsonProperty("paramName")
    public String getParamName() {
        return paramName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : GKBKSYS_PARAM_NAME
     * (Required)
     * 
     */
    @JsonProperty("paramName")
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public EuSystemParameterMaintenance100GetRequest withParamName(String paramName) {
        this.paramName = paramName;
        return this;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : GKBKSYS_VALUE, Lookup lineage reference object : GKRKSYV
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * Lineage reference object : GKBKSYS_VALUE, Lookup lineage reference object : GKRKSYV
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public EuSystemParameterMaintenance100GetRequest withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : GKBKSYS_GROUP, Lookup lineage reference object : gkbksys
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : GKBKSYS_GROUP, Lookup lineage reference object : gkbksys
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public EuSystemParameterMaintenance100GetRequest withGroup(String group) {
        this.group = group;
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

    public EuSystemParameterMaintenance100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuSystemParameterMaintenance100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("notes");
        sb.append('=');
        sb.append(((this.notes == null)?"<null>":this.notes));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("restrictValuesInd");
        sb.append('=');
        sb.append(((this.restrictValuesInd == null)?"<null>":this.restrictValuesInd));
        sb.append(',');
        sb.append("gkvksysCode");
        sb.append('=');
        sb.append(((this.gkvksysCode == null)?"<null>":this.gkvksysCode));
        sb.append(',');
        sb.append("paramName");
        sb.append('=');
        sb.append(((this.paramName == null)?"<null>":this.paramName));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
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
        result = ((result* 31)+((this.notes == null)? 0 :this.notes.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.restrictValuesInd == null)? 0 :this.restrictValuesInd.hashCode()));
        result = ((result* 31)+((this.gkvksysCode == null)? 0 :this.gkvksysCode.hashCode()));
        result = ((result* 31)+((this.paramName == null)? 0 :this.paramName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuSystemParameterMaintenance100GetRequest) == false) {
            return false;
        }
        EuSystemParameterMaintenance100GetRequest rhs = ((EuSystemParameterMaintenance100GetRequest) other);
        return (((((((((this.notes == rhs.notes)||((this.notes!= null)&&this.notes.equals(rhs.notes)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.restrictValuesInd == rhs.restrictValuesInd)||((this.restrictValuesInd!= null)&&this.restrictValuesInd.equals(rhs.restrictValuesInd))))&&((this.gkvksysCode == rhs.gkvksysCode)||((this.gkvksysCode!= null)&&this.gkvksysCode.equals(rhs.gkvksysCode))))&&((this.paramName == rhs.paramName)||((this.paramName!= null)&&this.paramName.equals(rhs.paramName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
