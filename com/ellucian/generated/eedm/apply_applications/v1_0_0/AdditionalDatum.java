
package com.ellucian.generated.eedm.apply_applications.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "propertyName",
    "propertyValues"
})
@Generated("jsonschema2pojo")
public class AdditionalDatum {

    /**
     * Property Name
     * <p>
     * The name of the additional property
     * 
     */
    @JsonProperty("propertyName")
    @JsonPropertyDescription("The name of the additional property")
    private String propertyName;
    /**
     * Property Values
     * <p>
     * The property values
     * 
     */
    @JsonProperty("propertyValues")
    @JsonPropertyDescription("The property values")
    private List<String> propertyValues = new ArrayList<String>();

    /**
     * Property Name
     * <p>
     * The name of the additional property
     * 
     */
    @JsonProperty("propertyName")
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Property Name
     * <p>
     * The name of the additional property
     * 
     */
    @JsonProperty("propertyName")
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public AdditionalDatum withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * Property Values
     * <p>
     * The property values
     * 
     */
    @JsonProperty("propertyValues")
    public List<String> getPropertyValues() {
        return propertyValues;
    }

    /**
     * Property Values
     * <p>
     * The property values
     * 
     */
    @JsonProperty("propertyValues")
    public void setPropertyValues(List<String> propertyValues) {
        this.propertyValues = propertyValues;
    }

    public AdditionalDatum withPropertyValues(List<String> propertyValues) {
        this.propertyValues = propertyValues;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdditionalDatum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("propertyName");
        sb.append('=');
        sb.append(((this.propertyName == null)?"<null>":this.propertyName));
        sb.append(',');
        sb.append("propertyValues");
        sb.append('=');
        sb.append(((this.propertyValues == null)?"<null>":this.propertyValues));
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
        result = ((result* 31)+((this.propertyName == null)? 0 :this.propertyName.hashCode()));
        result = ((result* 31)+((this.propertyValues == null)? 0 :this.propertyValues.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalDatum) == false) {
            return false;
        }
        AdditionalDatum rhs = ((AdditionalDatum) other);
        return (((this.propertyName == rhs.propertyName)||((this.propertyName!= null)&&this.propertyName.equals(rhs.propertyName)))&&((this.propertyValues == rhs.propertyValues)||((this.propertyValues!= null)&&this.propertyValues.equals(rhs.propertyValues))));
    }

}
