
package com.ellucian.generated.bpapi.ban.enrollment_status.v1_0_0;

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
    "xxxxxxxtermcode"
})
@Generated("jsonschema2pojo")
public class EnrollmentStatus100GetRequest {

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode
     * 
     */
    @JsonProperty("xxxxxxxtermcode")
    @JsonPropertyDescription("Lineage reference object : xxxxxxxTermCode")
    private Object xxxxxxxtermcode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode
     * 
     */
    @JsonProperty("xxxxxxxtermcode")
    public Object getXxxxxxxtermcode() {
        return xxxxxxxtermcode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : xxxxxxxTermCode
     * 
     */
    @JsonProperty("xxxxxxxtermcode")
    public void setXxxxxxxtermcode(Object xxxxxxxtermcode) {
        this.xxxxxxxtermcode = xxxxxxxtermcode;
    }

    public EnrollmentStatus100GetRequest withXxxxxxxtermcode(Object xxxxxxxtermcode) {
        this.xxxxxxxtermcode = xxxxxxxtermcode;
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

    public EnrollmentStatus100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollmentStatus100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xxxxxxxtermcode");
        sb.append('=');
        sb.append(((this.xxxxxxxtermcode == null)?"<null>":this.xxxxxxxtermcode));
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
        result = ((result* 31)+((this.xxxxxxxtermcode == null)? 0 :this.xxxxxxxtermcode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollmentStatus100GetRequest) == false) {
            return false;
        }
        EnrollmentStatus100GetRequest rhs = ((EnrollmentStatus100GetRequest) other);
        return (((this.xxxxxxxtermcode == rhs.xxxxxxxtermcode)||((this.xxxxxxxtermcode!= null)&&this.xxxxxxxtermcode.equals(rhs.xxxxxxxtermcode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
