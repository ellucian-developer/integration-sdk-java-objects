
package com.ellucian.generated.bpapi.ban.student_course_registrations.v1_0_0;

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
    "errorMessage"
})
@Generated("jsonschema2pojo")
public class Sftdwer {

    /**
     * Message
     * <p>
     * Lineage reference object : SFTDWER_ERROR_MESSAGE
     * 
     */
    @JsonProperty("errorMessage")
    @JsonPropertyDescription("Lineage reference object : SFTDWER_ERROR_MESSAGE")
    private String errorMessage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Message
     * <p>
     * Lineage reference object : SFTDWER_ERROR_MESSAGE
     * 
     */
    @JsonProperty("errorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : SFTDWER_ERROR_MESSAGE
     * 
     */
    @JsonProperty("errorMessage")
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Sftdwer withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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

    public Sftdwer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sftdwer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("errorMessage");
        sb.append('=');
        sb.append(((this.errorMessage == null)?"<null>":this.errorMessage));
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
        result = ((result* 31)+((this.errorMessage == null)? 0 :this.errorMessage.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sftdwer) == false) {
            return false;
        }
        Sftdwer rhs = ((Sftdwer) other);
        return (((this.errorMessage == rhs.errorMessage)||((this.errorMessage!= null)&&this.errorMessage.equals(rhs.errorMessage)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
