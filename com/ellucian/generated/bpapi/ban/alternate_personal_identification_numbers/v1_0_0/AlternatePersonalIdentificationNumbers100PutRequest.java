
package com.ellucian.generated.bpapi.ban.alternate_personal_identification_numbers.v1_0_0;

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
    "criteria.activityDate",
    "pin",
    "criteria.pin",
    "criteria.processName",
    "termCodeKey",
    "id",
    "criteria.termCode",
    "termCode"
})
@Generated("jsonschema2pojo")
public class AlternatePersonalIdentificationNumbers100PutRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRAPIN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SPRAPIN_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Alternate PIN
     * <p>
     * Lineage reference object : SPRAPIN_PIN
     * (Required)
     * 
     */
    @JsonProperty("pin")
    @JsonPropertyDescription("Lineage reference object : SPRAPIN_PIN")
    private String pin;
    /**
     * Alternate PIN
     * <p>
     * Lineage reference object : SPRAPIN_PIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.pin")
    @JsonPropertyDescription("Lineage reference object : SPRAPIN_PIN")
    private String criteriaPin;
    /**
     * Process Name
     * <p>
     * Lineage reference object : SPRAPIN_PROCESS_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.processName")
    @JsonPropertyDescription("Lineage reference object : SPRAPIN_PROCESS_NAME")
    private String criteriaProcessName;
    /**
     * From Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeKey")
    @JsonPropertyDescription("Lineage reference object : termCode, Lookup lineage reference object : stvterm")
    private Object termCodeKey;
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
     * Term Code
     * <p>
     * Lineage reference object : SPRAPIN_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    @JsonPropertyDescription("Lineage reference object : SPRAPIN_TERM_CODE, Lookup lineage reference object : stvterm")
    private String criteriaTermCode;
    /**
     * Term Code
     * <p>
     * Lineage reference object : SPRAPIN_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SPRAPIN_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRAPIN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : SPRAPIN_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public AlternatePersonalIdentificationNumbers100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Alternate PIN
     * <p>
     * Lineage reference object : SPRAPIN_PIN
     * (Required)
     * 
     */
    @JsonProperty("pin")
    public String getPin() {
        return pin;
    }

    /**
     * Alternate PIN
     * <p>
     * Lineage reference object : SPRAPIN_PIN
     * (Required)
     * 
     */
    @JsonProperty("pin")
    public void setPin(String pin) {
        this.pin = pin;
    }

    public AlternatePersonalIdentificationNumbers100PutRequest withPin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * Alternate PIN
     * <p>
     * Lineage reference object : SPRAPIN_PIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.pin")
    public String getCriteriaPin() {
        return criteriaPin;
    }

    /**
     * Alternate PIN
     * <p>
     * Lineage reference object : SPRAPIN_PIN
     * (Required)
     * 
     */
    @JsonProperty("criteria.pin")
    public void setCriteriaPin(String criteriaPin) {
        this.criteriaPin = criteriaPin;
    }

    public AlternatePersonalIdentificationNumbers100PutRequest withCriteriaPin(String criteriaPin) {
        this.criteriaPin = criteriaPin;
        return this;
    }

    /**
     * Process Name
     * <p>
     * Lineage reference object : SPRAPIN_PROCESS_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.processName")
    public String getCriteriaProcessName() {
        return criteriaProcessName;
    }

    /**
     * Process Name
     * <p>
     * Lineage reference object : SPRAPIN_PROCESS_NAME
     * (Required)
     * 
     */
    @JsonProperty("criteria.processName")
    public void setCriteriaProcessName(String criteriaProcessName) {
        this.criteriaProcessName = criteriaProcessName;
    }

    public AlternatePersonalIdentificationNumbers100PutRequest withCriteriaProcessName(String criteriaProcessName) {
        this.criteriaProcessName = criteriaProcessName;
        return this;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeKey")
    public Object getTermCodeKey() {
        return termCodeKey;
    }

    /**
     * From Term
     * <p>
     * Lineage reference object : termCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("termCodeKey")
    public void setTermCodeKey(Object termCodeKey) {
        this.termCodeKey = termCodeKey;
    }

    public AlternatePersonalIdentificationNumbers100PutRequest withTermCodeKey(Object termCodeKey) {
        this.termCodeKey = termCodeKey;
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

    public AlternatePersonalIdentificationNumbers100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Term Code
     * <p>
     * Lineage reference object : SPRAPIN_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public String getCriteriaTermCode() {
        return criteriaTermCode;
    }

    /**
     * Term Code
     * <p>
     * Lineage reference object : SPRAPIN_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCode")
    public void setCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
    }

    public AlternatePersonalIdentificationNumbers100PutRequest withCriteriaTermCode(String criteriaTermCode) {
        this.criteriaTermCode = criteriaTermCode;
        return this;
    }

    /**
     * Term Code
     * <p>
     * Lineage reference object : SPRAPIN_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public String getTermCode() {
        return termCode;
    }

    /**
     * Term Code
     * <p>
     * Lineage reference object : SPRAPIN_TERM_CODE, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCode")
    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    public AlternatePersonalIdentificationNumbers100PutRequest withTermCode(String termCode) {
        this.termCode = termCode;
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

    public AlternatePersonalIdentificationNumbers100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AlternatePersonalIdentificationNumbers100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("pin");
        sb.append('=');
        sb.append(((this.pin == null)?"<null>":this.pin));
        sb.append(',');
        sb.append("criteriaPin");
        sb.append('=');
        sb.append(((this.criteriaPin == null)?"<null>":this.criteriaPin));
        sb.append(',');
        sb.append("criteriaProcessName");
        sb.append('=');
        sb.append(((this.criteriaProcessName == null)?"<null>":this.criteriaProcessName));
        sb.append(',');
        sb.append("termCodeKey");
        sb.append('=');
        sb.append(((this.termCodeKey == null)?"<null>":this.termCodeKey));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("criteriaTermCode");
        sb.append('=');
        sb.append(((this.criteriaTermCode == null)?"<null>":this.criteriaTermCode));
        sb.append(',');
        sb.append("termCode");
        sb.append('=');
        sb.append(((this.termCode == null)?"<null>":this.termCode));
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
        result = ((result* 31)+((this.criteriaProcessName == null)? 0 :this.criteriaProcessName.hashCode()));
        result = ((result* 31)+((this.pin == null)? 0 :this.pin.hashCode()));
        result = ((result* 31)+((this.criteriaPin == null)? 0 :this.criteriaPin.hashCode()));
        result = ((result* 31)+((this.criteriaTermCode == null)? 0 :this.criteriaTermCode.hashCode()));
        result = ((result* 31)+((this.termCodeKey == null)? 0 :this.termCodeKey.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.termCode == null)? 0 :this.termCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlternatePersonalIdentificationNumbers100PutRequest) == false) {
            return false;
        }
        AlternatePersonalIdentificationNumbers100PutRequest rhs = ((AlternatePersonalIdentificationNumbers100PutRequest) other);
        return ((((((((((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate)))&&((this.criteriaProcessName == rhs.criteriaProcessName)||((this.criteriaProcessName!= null)&&this.criteriaProcessName.equals(rhs.criteriaProcessName))))&&((this.pin == rhs.pin)||((this.pin!= null)&&this.pin.equals(rhs.pin))))&&((this.criteriaPin == rhs.criteriaPin)||((this.criteriaPin!= null)&&this.criteriaPin.equals(rhs.criteriaPin))))&&((this.criteriaTermCode == rhs.criteriaTermCode)||((this.criteriaTermCode!= null)&&this.criteriaTermCode.equals(rhs.criteriaTermCode))))&&((this.termCodeKey == rhs.termCodeKey)||((this.termCodeKey!= null)&&this.termCodeKey.equals(rhs.termCodeKey))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
