
package com.ellucian.generated.bpapi.ban.alternate_personal_identification_numbers.v1_0_0;

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
    "pin",
    "processName",
    "termCodeKey",
    "id",
    "termCode"
})
@Generated("jsonschema2pojo")
public class AlternatePersonalIdentificationNumbers100PostRequest {

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
     * Process Name
     * <p>
     * Lineage reference object : SPRAPIN_PROCESS_NAME
     * (Required)
     * 
     */
    @JsonProperty("processName")
    @JsonPropertyDescription("Lineage reference object : SPRAPIN_PROCESS_NAME")
    private String processName;
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
    @JsonProperty("termCode")
    @JsonPropertyDescription("Lineage reference object : SPRAPIN_TERM_CODE, Lookup lineage reference object : stvterm")
    private String termCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public AlternatePersonalIdentificationNumbers100PostRequest withPin(String pin) {
        this.pin = pin;
        return this;
    }

    /**
     * Process Name
     * <p>
     * Lineage reference object : SPRAPIN_PROCESS_NAME
     * (Required)
     * 
     */
    @JsonProperty("processName")
    public String getProcessName() {
        return processName;
    }

    /**
     * Process Name
     * <p>
     * Lineage reference object : SPRAPIN_PROCESS_NAME
     * (Required)
     * 
     */
    @JsonProperty("processName")
    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public AlternatePersonalIdentificationNumbers100PostRequest withProcessName(String processName) {
        this.processName = processName;
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

    public AlternatePersonalIdentificationNumbers100PostRequest withTermCodeKey(Object termCodeKey) {
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

    public AlternatePersonalIdentificationNumbers100PostRequest withId(Object id) {
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

    public AlternatePersonalIdentificationNumbers100PostRequest withTermCode(String termCode) {
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

    public AlternatePersonalIdentificationNumbers100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AlternatePersonalIdentificationNumbers100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pin");
        sb.append('=');
        sb.append(((this.pin == null)?"<null>":this.pin));
        sb.append(',');
        sb.append("processName");
        sb.append('=');
        sb.append(((this.processName == null)?"<null>":this.processName));
        sb.append(',');
        sb.append("termCodeKey");
        sb.append('=');
        sb.append(((this.termCodeKey == null)?"<null>":this.termCodeKey));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.pin == null)? 0 :this.pin.hashCode()));
        result = ((result* 31)+((this.processName == null)? 0 :this.processName.hashCode()));
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
        if ((other instanceof AlternatePersonalIdentificationNumbers100PostRequest) == false) {
            return false;
        }
        AlternatePersonalIdentificationNumbers100PostRequest rhs = ((AlternatePersonalIdentificationNumbers100PostRequest) other);
        return (((((((this.pin == rhs.pin)||((this.pin!= null)&&this.pin.equals(rhs.pin)))&&((this.processName == rhs.processName)||((this.processName!= null)&&this.processName.equals(rhs.processName))))&&((this.termCodeKey == rhs.termCodeKey)||((this.termCodeKey!= null)&&this.termCodeKey.equals(rhs.termCodeKey))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.termCode == rhs.termCode)||((this.termCode!= null)&&this.termCode.equals(rhs.termCode))));
    }

}
