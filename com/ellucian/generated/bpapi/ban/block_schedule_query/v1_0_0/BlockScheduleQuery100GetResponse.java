
package com.ellucian.generated.bpapi.ban.block_schedule_query.v1_0_0;

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
    "blckDescription",
    "blckCode"
})
@Generated("jsonschema2pojo")
public class BlockScheduleQuery100GetResponse {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("blckDescription")
    private String blckDescription;
    /**
     * Block Code
     * <p>
     * Lineage reference object : SSRBLCK_BLCK_CODE
     * 
     */
    @JsonProperty("blckCode")
    @JsonPropertyDescription("Lineage reference object : SSRBLCK_BLCK_CODE")
    private String blckCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("blckDescription")
    public String getBlckDescription() {
        return blckDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("blckDescription")
    public void setBlckDescription(String blckDescription) {
        this.blckDescription = blckDescription;
    }

    public BlockScheduleQuery100GetResponse withBlckDescription(String blckDescription) {
        this.blckDescription = blckDescription;
        return this;
    }

    /**
     * Block Code
     * <p>
     * Lineage reference object : SSRBLCK_BLCK_CODE
     * 
     */
    @JsonProperty("blckCode")
    public String getBlckCode() {
        return blckCode;
    }

    /**
     * Block Code
     * <p>
     * Lineage reference object : SSRBLCK_BLCK_CODE
     * 
     */
    @JsonProperty("blckCode")
    public void setBlckCode(String blckCode) {
        this.blckCode = blckCode;
    }

    public BlockScheduleQuery100GetResponse withBlckCode(String blckCode) {
        this.blckCode = blckCode;
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

    public BlockScheduleQuery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BlockScheduleQuery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("blckDescription");
        sb.append('=');
        sb.append(((this.blckDescription == null)?"<null>":this.blckDescription));
        sb.append(',');
        sb.append("blckCode");
        sb.append('=');
        sb.append(((this.blckCode == null)?"<null>":this.blckCode));
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
        result = ((result* 31)+((this.blckDescription == null)? 0 :this.blckDescription.hashCode()));
        result = ((result* 31)+((this.blckCode == null)? 0 :this.blckCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BlockScheduleQuery100GetResponse) == false) {
            return false;
        }
        BlockScheduleQuery100GetResponse rhs = ((BlockScheduleQuery100GetResponse) other);
        return ((((this.blckDescription == rhs.blckDescription)||((this.blckDescription!= null)&&this.blckDescription.equals(rhs.blckDescription)))&&((this.blckCode == rhs.blckCode)||((this.blckCode!= null)&&this.blckCode.equals(rhs.blckCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
