
package com.ellucian.generated.eedm.mapping_settings.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resource",
    "propertyName"
})
@Generated("jsonschema2pojo")
public class Resource {

    /**
     * Resource
     * <p>
     * The Ethos schema name for the resource.
     * (Required)
     * 
     */
    @JsonProperty("resource")
    @JsonPropertyDescription("The Ethos schema name for the resource.")
    private String resource;
    /**
     * Property Name
     * <p>
     * The Ethos property name for which the enumerations are defined.
     * (Required)
     * 
     */
    @JsonProperty("propertyName")
    @JsonPropertyDescription("The Ethos property name for which the enumerations are defined.")
    private String propertyName;

    /**
     * Resource
     * <p>
     * The Ethos schema name for the resource.
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public String getResource() {
        return resource;
    }

    /**
     * Resource
     * <p>
     * The Ethos schema name for the resource.
     * (Required)
     * 
     */
    @JsonProperty("resource")
    public void setResource(String resource) {
        this.resource = resource;
    }

    public Resource withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Property Name
     * <p>
     * The Ethos property name for which the enumerations are defined.
     * (Required)
     * 
     */
    @JsonProperty("propertyName")
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Property Name
     * <p>
     * The Ethos property name for which the enumerations are defined.
     * (Required)
     * 
     */
    @JsonProperty("propertyName")
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Resource withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resource");
        sb.append('=');
        sb.append(((this.resource == null)?"<null>":this.resource));
        sb.append(',');
        sb.append("propertyName");
        sb.append('=');
        sb.append(((this.propertyName == null)?"<null>":this.propertyName));
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
        result = ((result* 31)+((this.resource == null)? 0 :this.resource.hashCode()));
        result = ((result* 31)+((this.propertyName == null)? 0 :this.propertyName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resource) == false) {
            return false;
        }
        Resource rhs = ((Resource) other);
        return (((this.resource == rhs.resource)||((this.resource!= null)&&this.resource.equals(rhs.resource)))&&((this.propertyName == rhs.propertyName)||((this.propertyName!= null)&&this.propertyName.equals(rhs.propertyName))));
    }

}
