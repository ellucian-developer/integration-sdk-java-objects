
package com.ellucian.generated.bpapi.ban.document_approval_history.v1_0_0;

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
    "origUserId",
    "origUserName"
})
@Generated("jsonschema2pojo")
public class Display {

    /**
     * Originating User
     * <p>
     * Lineage reference object : origUserId
     * 
     */
    @JsonProperty("origUserId")
    @JsonPropertyDescription("Lineage reference object : origUserId")
    private Object origUserId;
    /**
     * Name
     * <p>
     * Lineage reference object : origUserName
     * 
     */
    @JsonProperty("origUserName")
    @JsonPropertyDescription("Lineage reference object : origUserName")
    private Object origUserName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Originating User
     * <p>
     * Lineage reference object : origUserId
     * 
     */
    @JsonProperty("origUserId")
    public Object getOrigUserId() {
        return origUserId;
    }

    /**
     * Originating User
     * <p>
     * Lineage reference object : origUserId
     * 
     */
    @JsonProperty("origUserId")
    public void setOrigUserId(Object origUserId) {
        this.origUserId = origUserId;
    }

    public Display withOrigUserId(Object origUserId) {
        this.origUserId = origUserId;
        return this;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : origUserName
     * 
     */
    @JsonProperty("origUserName")
    public Object getOrigUserName() {
        return origUserName;
    }

    /**
     * Name
     * <p>
     * Lineage reference object : origUserName
     * 
     */
    @JsonProperty("origUserName")
    public void setOrigUserName(Object origUserName) {
        this.origUserName = origUserName;
    }

    public Display withOrigUserName(Object origUserName) {
        this.origUserName = origUserName;
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

    public Display withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Display.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("origUserId");
        sb.append('=');
        sb.append(((this.origUserId == null)?"<null>":this.origUserId));
        sb.append(',');
        sb.append("origUserName");
        sb.append('=');
        sb.append(((this.origUserName == null)?"<null>":this.origUserName));
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
        result = ((result* 31)+((this.origUserId == null)? 0 :this.origUserId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.origUserName == null)? 0 :this.origUserName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Display) == false) {
            return false;
        }
        Display rhs = ((Display) other);
        return ((((this.origUserId == rhs.origUserId)||((this.origUserId!= null)&&this.origUserId.equals(rhs.origUserId)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.origUserName == rhs.origUserName)||((this.origUserName!= null)&&this.origUserName.equals(rhs.origUserName))));
    }

}
