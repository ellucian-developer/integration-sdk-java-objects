
package com.ellucian.generated.bpapi.ban.schedule_details_degree_program_attributes.v1_0_0;

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
    "attrCode",
    "attrDescription"
})
@Generated("jsonschema2pojo")
public class ScheduleDetailsDegreeProgramAttributes100GetResponse {

    /**
     * Attribute
     * <p>
     * Lineage reference object : SSRATTR_ATTR_CODE, Lookup lineage reference object : stvattr
     * (Required)
     * 
     */
    @JsonProperty("attrCode")
    @JsonPropertyDescription("Lineage reference object : SSRATTR_ATTR_CODE, Lookup lineage reference object : stvattr")
    private String attrCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attrDescription")
    private String attrDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Attribute
     * <p>
     * Lineage reference object : SSRATTR_ATTR_CODE, Lookup lineage reference object : stvattr
     * (Required)
     * 
     */
    @JsonProperty("attrCode")
    public String getAttrCode() {
        return attrCode;
    }

    /**
     * Attribute
     * <p>
     * Lineage reference object : SSRATTR_ATTR_CODE, Lookup lineage reference object : stvattr
     * (Required)
     * 
     */
    @JsonProperty("attrCode")
    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode;
    }

    public ScheduleDetailsDegreeProgramAttributes100GetResponse withAttrCode(String attrCode) {
        this.attrCode = attrCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attrDescription")
    public String getAttrDescription() {
        return attrDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attrDescription")
    public void setAttrDescription(String attrDescription) {
        this.attrDescription = attrDescription;
    }

    public ScheduleDetailsDegreeProgramAttributes100GetResponse withAttrDescription(String attrDescription) {
        this.attrDescription = attrDescription;
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

    public ScheduleDetailsDegreeProgramAttributes100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScheduleDetailsDegreeProgramAttributes100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attrCode");
        sb.append('=');
        sb.append(((this.attrCode == null)?"<null>":this.attrCode));
        sb.append(',');
        sb.append("attrDescription");
        sb.append('=');
        sb.append(((this.attrDescription == null)?"<null>":this.attrDescription));
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
        result = ((result* 31)+((this.attrCode == null)? 0 :this.attrCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.attrDescription == null)? 0 :this.attrDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScheduleDetailsDegreeProgramAttributes100GetResponse) == false) {
            return false;
        }
        ScheduleDetailsDegreeProgramAttributes100GetResponse rhs = ((ScheduleDetailsDegreeProgramAttributes100GetResponse) other);
        return ((((this.attrCode == rhs.attrCode)||((this.attrCode!= null)&&this.attrCode.equals(rhs.attrCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.attrDescription == rhs.attrDescription)||((this.attrDescription!= null)&&this.attrDescription.equals(rhs.attrDescription))));
    }

}
