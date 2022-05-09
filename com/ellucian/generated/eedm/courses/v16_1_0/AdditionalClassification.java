
package com.ellucian.generated.eedm.courses.v16_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cipCode"
})
@Generated("jsonschema2pojo")
public class AdditionalClassification {

    /**
     * CIP Code
     * <p>
     * The CIP code associated with the course.
     * 
     */
    @JsonProperty("cipCode")
    @JsonPropertyDescription("The CIP code associated with the course.")
    private Object cipCode;

    /**
     * CIP Code
     * <p>
     * The CIP code associated with the course.
     * 
     */
    @JsonProperty("cipCode")
    public Object getCipCode() {
        return cipCode;
    }

    /**
     * CIP Code
     * <p>
     * The CIP code associated with the course.
     * 
     */
    @JsonProperty("cipCode")
    public void setCipCode(Object cipCode) {
        this.cipCode = cipCode;
    }

    public AdditionalClassification withCipCode(Object cipCode) {
        this.cipCode = cipCode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalClassification.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cipCode");
        sb.append('=');
        sb.append(((this.cipCode == null)?"<null>":this.cipCode));
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
        result = ((result* 31)+((this.cipCode == null)? 0 :this.cipCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalClassification) == false) {
            return false;
        }
        AdditionalClassification rhs = ((AdditionalClassification) other);
        return ((this.cipCode == rhs.cipCode)||((this.cipCode!= null)&&this.cipCode.equals(rhs.cipCode)));
    }

}
