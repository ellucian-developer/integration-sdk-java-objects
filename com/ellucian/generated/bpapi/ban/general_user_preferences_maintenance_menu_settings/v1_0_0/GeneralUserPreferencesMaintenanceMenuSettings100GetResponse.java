
package com.ellucian.generated.bpapi.ban.general_user_preferences_maintenance_menu_settings.v1_0_0;

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
    "defltDesc",
    "guruprfValue",
    "defltKey",
    "defltKeyDesc"
})
@Generated("jsonschema2pojo")
public class GeneralUserPreferencesMaintenanceMenuSettings100GetResponse {

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
     * 
     * 
     */
    @JsonProperty("defltDesc")
    private String defltDesc;
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
    /**
     * Guruprf Value
     * <p>
     * 
     * 
     */
    @JsonProperty("defltKeyDesc")
    private String defltKeyDesc;
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

    public GeneralUserPreferencesMaintenanceMenuSettings100GetResponse withDefltValue(String defltValue) {
        this.defltValue = defltValue;
        return this;
    }

    /**
     * Guruprf Value
     * <p>
     * 
     * 
     */
    @JsonProperty("defltDesc")
    public String getDefltDesc() {
        return defltDesc;
    }

    /**
     * Guruprf Value
     * <p>
     * 
     * 
     */
    @JsonProperty("defltDesc")
    public void setDefltDesc(String defltDesc) {
        this.defltDesc = defltDesc;
    }

    public GeneralUserPreferencesMaintenanceMenuSettings100GetResponse withDefltDesc(String defltDesc) {
        this.defltDesc = defltDesc;
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

    public GeneralUserPreferencesMaintenanceMenuSettings100GetResponse withGuruprfValue(String guruprfValue) {
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

    public GeneralUserPreferencesMaintenanceMenuSettings100GetResponse withDefltKey(String defltKey) {
        this.defltKey = defltKey;
        return this;
    }

    /**
     * Guruprf Value
     * <p>
     * 
     * 
     */
    @JsonProperty("defltKeyDesc")
    public String getDefltKeyDesc() {
        return defltKeyDesc;
    }

    /**
     * Guruprf Value
     * <p>
     * 
     * 
     */
    @JsonProperty("defltKeyDesc")
    public void setDefltKeyDesc(String defltKeyDesc) {
        this.defltKeyDesc = defltKeyDesc;
    }

    public GeneralUserPreferencesMaintenanceMenuSettings100GetResponse withDefltKeyDesc(String defltKeyDesc) {
        this.defltKeyDesc = defltKeyDesc;
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

    public GeneralUserPreferencesMaintenanceMenuSettings100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralUserPreferencesMaintenanceMenuSettings100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("defltValue");
        sb.append('=');
        sb.append(((this.defltValue == null)?"<null>":this.defltValue));
        sb.append(',');
        sb.append("defltDesc");
        sb.append('=');
        sb.append(((this.defltDesc == null)?"<null>":this.defltDesc));
        sb.append(',');
        sb.append("guruprfValue");
        sb.append('=');
        sb.append(((this.guruprfValue == null)?"<null>":this.guruprfValue));
        sb.append(',');
        sb.append("defltKey");
        sb.append('=');
        sb.append(((this.defltKey == null)?"<null>":this.defltKey));
        sb.append(',');
        sb.append("defltKeyDesc");
        sb.append('=');
        sb.append(((this.defltKeyDesc == null)?"<null>":this.defltKeyDesc));
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
        result = ((result* 31)+((this.defltDesc == null)? 0 :this.defltDesc.hashCode()));
        result = ((result* 31)+((this.guruprfValue == null)? 0 :this.guruprfValue.hashCode()));
        result = ((result* 31)+((this.defltKey == null)? 0 :this.defltKey.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.defltKeyDesc == null)? 0 :this.defltKeyDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralUserPreferencesMaintenanceMenuSettings100GetResponse) == false) {
            return false;
        }
        GeneralUserPreferencesMaintenanceMenuSettings100GetResponse rhs = ((GeneralUserPreferencesMaintenanceMenuSettings100GetResponse) other);
        return (((((((this.defltValue == rhs.defltValue)||((this.defltValue!= null)&&this.defltValue.equals(rhs.defltValue)))&&((this.defltDesc == rhs.defltDesc)||((this.defltDesc!= null)&&this.defltDesc.equals(rhs.defltDesc))))&&((this.guruprfValue == rhs.guruprfValue)||((this.guruprfValue!= null)&&this.guruprfValue.equals(rhs.guruprfValue))))&&((this.defltKey == rhs.defltKey)||((this.defltKey!= null)&&this.defltKey.equals(rhs.defltKey))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.defltKeyDesc == rhs.defltKeyDesc)||((this.defltKeyDesc!= null)&&this.defltKeyDesc.equals(rhs.defltKeyDesc))));
    }

}
