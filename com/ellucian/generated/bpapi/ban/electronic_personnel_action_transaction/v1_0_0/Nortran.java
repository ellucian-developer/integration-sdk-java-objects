
package com.ellucian.generated.bpapi.ban.electronic_personnel_action_transaction.v1_0_0;

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
    "fieldDescription",
    "currSpecialDate",
    "applyStatusInd",
    "value",
    "currentValue"
})
@Generated("jsonschema2pojo")
public class Nortran {

    /**
     * Field Name
     * <p>
     * 
     * 
     */
    @JsonProperty("fieldDescription")
    private String fieldDescription;
    @JsonProperty("currSpecialDate")
    private String currSpecialDate;
    /**
     * Applied Status
     * <p>
     * Lineage reference object : NORTRAN_APPLY_STATUS_IND
     * 
     */
    @JsonProperty("applyStatusInd")
    @JsonPropertyDescription("Lineage reference object : NORTRAN_APPLY_STATUS_IND")
    private String applyStatusInd;
    /**
     * New Value
     * <p>
     * Lineage reference object : NORTRAN_VALUE
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("Lineage reference object : NORTRAN_VALUE")
    private String value;
    /**
     * Current Value
     * <p>
     * 
     * 
     */
    @JsonProperty("currentValue")
    private String currentValue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Field Name
     * <p>
     * 
     * 
     */
    @JsonProperty("fieldDescription")
    public String getFieldDescription() {
        return fieldDescription;
    }

    /**
     * Field Name
     * <p>
     * 
     * 
     */
    @JsonProperty("fieldDescription")
    public void setFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
    }

    public Nortran withFieldDescription(String fieldDescription) {
        this.fieldDescription = fieldDescription;
        return this;
    }

    @JsonProperty("currSpecialDate")
    public String getCurrSpecialDate() {
        return currSpecialDate;
    }

    @JsonProperty("currSpecialDate")
    public void setCurrSpecialDate(String currSpecialDate) {
        this.currSpecialDate = currSpecialDate;
    }

    public Nortran withCurrSpecialDate(String currSpecialDate) {
        this.currSpecialDate = currSpecialDate;
        return this;
    }

    /**
     * Applied Status
     * <p>
     * Lineage reference object : NORTRAN_APPLY_STATUS_IND
     * 
     */
    @JsonProperty("applyStatusInd")
    public String getApplyStatusInd() {
        return applyStatusInd;
    }

    /**
     * Applied Status
     * <p>
     * Lineage reference object : NORTRAN_APPLY_STATUS_IND
     * 
     */
    @JsonProperty("applyStatusInd")
    public void setApplyStatusInd(String applyStatusInd) {
        this.applyStatusInd = applyStatusInd;
    }

    public Nortran withApplyStatusInd(String applyStatusInd) {
        this.applyStatusInd = applyStatusInd;
        return this;
    }

    /**
     * New Value
     * <p>
     * Lineage reference object : NORTRAN_VALUE
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * New Value
     * <p>
     * Lineage reference object : NORTRAN_VALUE
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public Nortran withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Current Value
     * <p>
     * 
     * 
     */
    @JsonProperty("currentValue")
    public String getCurrentValue() {
        return currentValue;
    }

    /**
     * Current Value
     * <p>
     * 
     * 
     */
    @JsonProperty("currentValue")
    public void setCurrentValue(String currentValue) {
        this.currentValue = currentValue;
    }

    public Nortran withCurrentValue(String currentValue) {
        this.currentValue = currentValue;
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

    public Nortran withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Nortran.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fieldDescription");
        sb.append('=');
        sb.append(((this.fieldDescription == null)?"<null>":this.fieldDescription));
        sb.append(',');
        sb.append("currSpecialDate");
        sb.append('=');
        sb.append(((this.currSpecialDate == null)?"<null>":this.currSpecialDate));
        sb.append(',');
        sb.append("applyStatusInd");
        sb.append('=');
        sb.append(((this.applyStatusInd == null)?"<null>":this.applyStatusInd));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("currentValue");
        sb.append('=');
        sb.append(((this.currentValue == null)?"<null>":this.currentValue));
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
        result = ((result* 31)+((this.fieldDescription == null)? 0 :this.fieldDescription.hashCode()));
        result = ((result* 31)+((this.currSpecialDate == null)? 0 :this.currSpecialDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.applyStatusInd == null)? 0 :this.applyStatusInd.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.currentValue == null)? 0 :this.currentValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Nortran) == false) {
            return false;
        }
        Nortran rhs = ((Nortran) other);
        return (((((((this.fieldDescription == rhs.fieldDescription)||((this.fieldDescription!= null)&&this.fieldDescription.equals(rhs.fieldDescription)))&&((this.currSpecialDate == rhs.currSpecialDate)||((this.currSpecialDate!= null)&&this.currSpecialDate.equals(rhs.currSpecialDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.applyStatusInd == rhs.applyStatusInd)||((this.applyStatusInd!= null)&&this.applyStatusInd.equals(rhs.applyStatusInd))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.currentValue == rhs.currentValue)||((this.currentValue!= null)&&this.currentValue.equals(rhs.currentValue))));
    }

}
