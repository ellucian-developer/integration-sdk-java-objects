
package com.ellucian.generated.bpapi.ban.block_schedule_control.v1_0_0;

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
    "keyblocTermCode",
    "keyblocBlckCode"
})
@Generated("jsonschema2pojo")
public class BlockScheduleControl100GetRequest {

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    @JsonPropertyDescription("Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm")
    private String keyblocTermCode;
    /**
     * Block
     * <p>
     * Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("keyblocBlckCode")
    @JsonPropertyDescription("Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck")
    private String keyblocBlckCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : keyblocTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public BlockScheduleControl100GetRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("keyblocBlckCode")
    public String getKeyblocBlckCode() {
        return keyblocBlckCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : keyblocBlckCode, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("keyblocBlckCode")
    public void setKeyblocBlckCode(String keyblocBlckCode) {
        this.keyblocBlckCode = keyblocBlckCode;
    }

    public BlockScheduleControl100GetRequest withKeyblocBlckCode(String keyblocBlckCode) {
        this.keyblocBlckCode = keyblocBlckCode;
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

    public BlockScheduleControl100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BlockScheduleControl100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("keyblocBlckCode");
        sb.append('=');
        sb.append(((this.keyblocBlckCode == null)?"<null>":this.keyblocBlckCode));
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
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.keyblocBlckCode == null)? 0 :this.keyblocBlckCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlockScheduleControl100GetRequest) == false) {
            return false;
        }
        BlockScheduleControl100GetRequest rhs = ((BlockScheduleControl100GetRequest) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.keyblocBlckCode == rhs.keyblocBlckCode)||((this.keyblocBlckCode!= null)&&this.keyblocBlckCode.equals(rhs.keyblocBlckCode))));
    }

}
