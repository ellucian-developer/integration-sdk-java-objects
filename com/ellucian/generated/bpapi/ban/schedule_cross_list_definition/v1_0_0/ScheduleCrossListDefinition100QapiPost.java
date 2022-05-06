
package com.ellucian.generated.bpapi.ban.schedule_cross_list_definition.v1_0_0;

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
    "keyblocTermCode",
    "keyblocXlstGroup"
})
@Generated("jsonschema2pojo")
public class ScheduleCrossListDefinition100QapiPost {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocXlstGroup")
    private String keyblocXlstGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public ScheduleCrossListDefinition100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocXlstGroup")
    public String getKeyblocXlstGroup() {
        return keyblocXlstGroup;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keyblocXlstGroup")
    public void setKeyblocXlstGroup(String keyblocXlstGroup) {
        this.keyblocXlstGroup = keyblocXlstGroup;
    }

    public ScheduleCrossListDefinition100QapiPost withKeyblocXlstGroup(String keyblocXlstGroup) {
        this.keyblocXlstGroup = keyblocXlstGroup;
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

    public ScheduleCrossListDefinition100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleCrossListDefinition100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("keyblocXlstGroup");
        sb.append('=');
        sb.append(((this.keyblocXlstGroup == null)?"<null>":this.keyblocXlstGroup));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblocXlstGroup == null)? 0 :this.keyblocXlstGroup.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleCrossListDefinition100QapiPost) == false) {
            return false;
        }
        ScheduleCrossListDefinition100QapiPost rhs = ((ScheduleCrossListDefinition100QapiPost) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.keyblocXlstGroup == rhs.keyblocXlstGroup)||((this.keyblocXlstGroup!= null)&&this.keyblocXlstGroup.equals(rhs.keyblocXlstGroup))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))));
    }

}
