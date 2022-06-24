
package com.ellucian.generated.bpapi.ban.schedule_cross_list_definition.v1_0_0;

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
    "keyblocXlstGroup",
    "keyblocTermCode",
    "ssbsectWaitCapacity",
    "maxEnrl",
    "crn"
})
@Generated("jsonschema2pojo")
public class ScheduleCrossListDefinition100PostRequest {

    /**
     * Cross List Group Identifier
     * <p>
     * Lineage reference object : keyblocXlstGroup
     * 
     */
    @JsonProperty("keyblocXlstGroup")
    @JsonPropertyDescription("Lineage reference object : keyblocXlstGroup")
    private String keyblocXlstGroup;
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
     * Wait List Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitCapacity")
    private Object ssbsectWaitCapacity;
    /**
     * Maximum Enrollment:
     * <p>
     * Lineage reference object : SSBXLST_MAX_ENRL
     * 
     */
    @JsonProperty("maxEnrl")
    @JsonPropertyDescription("Lineage reference object : SSBXLST_MAX_ENRL")
    private Double maxEnrl;
    /**
     * CRN
     * <p>
     * Lineage reference object : SSRXLST_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SSRXLST_CRN")
    private String crn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Cross List Group Identifier
     * <p>
     * Lineage reference object : keyblocXlstGroup
     * 
     */
    @JsonProperty("keyblocXlstGroup")
    public String getKeyblocXlstGroup() {
        return keyblocXlstGroup;
    }

    /**
     * Cross List Group Identifier
     * <p>
     * Lineage reference object : keyblocXlstGroup
     * 
     */
    @JsonProperty("keyblocXlstGroup")
    public void setKeyblocXlstGroup(String keyblocXlstGroup) {
        this.keyblocXlstGroup = keyblocXlstGroup;
    }

    public ScheduleCrossListDefinition100PostRequest withKeyblocXlstGroup(String keyblocXlstGroup) {
        this.keyblocXlstGroup = keyblocXlstGroup;
        return this;
    }

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

    public ScheduleCrossListDefinition100PostRequest withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    /**
     * Wait List Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitCapacity")
    public Object getSsbsectWaitCapacity() {
        return ssbsectWaitCapacity;
    }

    /**
     * Wait List Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitCapacity")
    public void setSsbsectWaitCapacity(Object ssbsectWaitCapacity) {
        this.ssbsectWaitCapacity = ssbsectWaitCapacity;
    }

    public ScheduleCrossListDefinition100PostRequest withSsbsectWaitCapacity(Object ssbsectWaitCapacity) {
        this.ssbsectWaitCapacity = ssbsectWaitCapacity;
        return this;
    }

    /**
     * Maximum Enrollment:
     * <p>
     * Lineage reference object : SSBXLST_MAX_ENRL
     * 
     */
    @JsonProperty("maxEnrl")
    public Double getMaxEnrl() {
        return maxEnrl;
    }

    /**
     * Maximum Enrollment:
     * <p>
     * Lineage reference object : SSBXLST_MAX_ENRL
     * 
     */
    @JsonProperty("maxEnrl")
    public void setMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
    }

    public ScheduleCrossListDefinition100PostRequest withMaxEnrl(Double maxEnrl) {
        this.maxEnrl = maxEnrl;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRXLST_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRXLST_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public ScheduleCrossListDefinition100PostRequest withCrn(String crn) {
        this.crn = crn;
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

    public ScheduleCrossListDefinition100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleCrossListDefinition100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocXlstGroup");
        sb.append('=');
        sb.append(((this.keyblocXlstGroup == null)?"<null>":this.keyblocXlstGroup));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("ssbsectWaitCapacity");
        sb.append('=');
        sb.append(((this.ssbsectWaitCapacity == null)?"<null>":this.ssbsectWaitCapacity));
        sb.append(',');
        sb.append("maxEnrl");
        sb.append('=');
        sb.append(((this.maxEnrl == null)?"<null>":this.maxEnrl));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
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
        result = ((result* 31)+((this.keyblocXlstGroup == null)? 0 :this.keyblocXlstGroup.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.ssbsectWaitCapacity == null)? 0 :this.ssbsectWaitCapacity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.maxEnrl == null)? 0 :this.maxEnrl.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleCrossListDefinition100PostRequest) == false) {
            return false;
        }
        ScheduleCrossListDefinition100PostRequest rhs = ((ScheduleCrossListDefinition100PostRequest) other);
        return (((((((this.keyblocXlstGroup == rhs.keyblocXlstGroup)||((this.keyblocXlstGroup!= null)&&this.keyblocXlstGroup.equals(rhs.keyblocXlstGroup)))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.ssbsectWaitCapacity == rhs.ssbsectWaitCapacity)||((this.ssbsectWaitCapacity!= null)&&this.ssbsectWaitCapacity.equals(rhs.ssbsectWaitCapacity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.maxEnrl == rhs.maxEnrl)||((this.maxEnrl!= null)&&this.maxEnrl.equals(rhs.maxEnrl))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))));
    }

}
