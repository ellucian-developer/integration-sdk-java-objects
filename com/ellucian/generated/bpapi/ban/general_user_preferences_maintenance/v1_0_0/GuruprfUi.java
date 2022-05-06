
package com.ellucian.generated.bpapi.ban.general_user_preferences_maintenance.v1_0_0;

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
    "defltValue",
    "guruprfValue",
    "defltKey"
})
@Generated("jsonschema2pojo")
public class GuruprfUi {

    /**
     * Guruprf Value
     * <p>
     * 
     * 
     */
    @JsonProperty("defltValue")
    private String defltValue;
    /**
     * Guruprf Value
     * <p>
     * Lineage reference object : GURUPRF_VALUE
     * 
     */
    @JsonProperty("guruprfValue")
    @JsonPropertyDescription("Lineage reference object : GURUPRF_VALUE")
    private String guruprfValue;
    /**
     * Guruprf Key
     * <p>
     * 
     * 
     */
    @JsonProperty("defltKey")
    private String defltKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Guruprf Value
     * <p>
     * 
     * 
     */
    @JsonProperty("defltValue")
    public String getDefltValue() {
        return defltValue;
    }

    /**
     * Guruprf Value
     * <p>
     * 
     * 
     */
    @JsonProperty("defltValue")
    public void setDefltValue(String defltValue) {
        this.defltValue = defltValue;
    }

    public GuruprfUi withDefltValue(String defltValue) {
        this.defltValue = defltValue;
        return this;
    }

    /**
     * Guruprf Value
     * <p>
     * Lineage reference object : GURUPRF_VALUE
     * 
     */
    @JsonProperty("guruprfValue")
    public String getGuruprfValue() {
        return guruprfValue;
    }

    /**
     * Guruprf Value
     * <p>
     * Lineage reference object : GURUPRF_VALUE
     * 
     */
    @JsonProperty("guruprfValue")
    public void setGuruprfValue(String guruprfValue) {
        this.guruprfValue = guruprfValue;
    }

    public GuruprfUi withGuruprfValue(String guruprfValue) {
        this.guruprfValue = guruprfValue;
        return this;
    }

    /**
     * Guruprf Key
     * <p>
     * 
     * 
     */
    @JsonProperty("defltKey")
    public String getDefltKey() {
        return defltKey;
    }

    /**
     * Guruprf Key
     * <p>
     * 
     * 
     */
    @JsonProperty("defltKey")
    public void setDefltKey(String defltKey) {
        this.defltKey = defltKey;
    }

    public GuruprfUi withDefltKey(String defltKey) {
        this.defltKey = defltKey;
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

    public GuruprfUi withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GuruprfUi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("defltValue");
        sb.append('=');
        sb.append(((this.defltValue == null)?"<null>":this.defltValue));
        sb.append(',');
        sb.append("guruprfValue");
        sb.append('=');
        sb.append(((this.guruprfValue == null)?"<null>":this.guruprfValue));
        sb.append(',');
        sb.append("defltKey");
        sb.append('=');
        sb.append(((this.defltKey == null)?"<null>":this.defltKey));
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
        result = ((result* 31)+((this.defltValue == null)? 0 :this.defltValue.hashCode()));
        result = ((result* 31)+((this.guruprfValue == null)? 0 :this.guruprfValue.hashCode()));
        result = ((result* 31)+((this.defltKey == null)? 0 :this.defltKey.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GuruprfUi) == false) {
            return false;
        }
        GuruprfUi rhs = ((GuruprfUi) other);
        return (((((this.defltValue == rhs.defltValue)||((this.defltValue!= null)&&this.defltValue.equals(rhs.defltValue)))&&((this.guruprfValue == rhs.guruprfValue)||((this.guruprfValue!= null)&&this.guruprfValue.equals(rhs.guruprfValue))))&&((this.defltKey == rhs.defltKey)||((this.defltKey!= null)&&this.defltKey.equals(rhs.defltKey))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
