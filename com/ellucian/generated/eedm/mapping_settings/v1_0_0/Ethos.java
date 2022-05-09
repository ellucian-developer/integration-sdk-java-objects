
package com.ellucian.generated.eedm.mapping_settings.v1_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Ethos
 * <p>
 * The Ethos information to be mapped.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resources",
    "enumeration"
})
@Generated("jsonschema2pojo")
public class Ethos {

    /**
     * Resources
     * <p>
     * The Ethos resources and property names to be mapped.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("The Ethos resources and property names to be mapped.")
    private List<Resource> resources = new ArrayList<Resource>();
    /**
     * Enumeration
     * <p>
     * The Ethos enumeration.
     * 
     */
    @JsonProperty("enumeration")
    @JsonPropertyDescription("The Ethos enumeration.")
    private String enumeration;

    /**
     * Resources
     * <p>
     * The Ethos resources and property names to be mapped.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public List<Resource> getResources() {
        return resources;
    }

    /**
     * Resources
     * <p>
     * The Ethos resources and property names to be mapped.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public Ethos withResources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Enumeration
     * <p>
     * The Ethos enumeration.
     * 
     */
    @JsonProperty("enumeration")
    public String getEnumeration() {
        return enumeration;
    }

    /**
     * Enumeration
     * <p>
     * The Ethos enumeration.
     * 
     */
    @JsonProperty("enumeration")
    public void setEnumeration(String enumeration) {
        this.enumeration = enumeration;
    }

    public Ethos withEnumeration(String enumeration) {
        this.enumeration = enumeration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ethos.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
        sb.append(',');
        sb.append("enumeration");
        sb.append('=');
        sb.append(((this.enumeration == null)?"<null>":this.enumeration));
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
        result = ((result* 31)+((this.enumeration == null)? 0 :this.enumeration.hashCode()));
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ethos) == false) {
            return false;
        }
        Ethos rhs = ((Ethos) other);
        return (((this.enumeration == rhs.enumeration)||((this.enumeration!= null)&&this.enumeration.equals(rhs.enumeration)))&&((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources))));
    }

}
