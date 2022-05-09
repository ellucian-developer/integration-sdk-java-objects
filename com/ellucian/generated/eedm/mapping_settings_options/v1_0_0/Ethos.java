
package com.ellucian.generated.eedm.mapping_settings_options.v1_0_0;

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
 * The Ethos options for mapping.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resources",
    "enumerations"
})
@Generated("jsonschema2pojo")
public class Ethos {

    /**
     * Resources
     * <p>
     * The Ethos resources and property names.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("The Ethos resources and property names.")
    private List<Resource> resources = new ArrayList<Resource>();
    /**
     * Enumerations
     * <p>
     * The Ethos enumerations for mapping.
     * 
     */
    @JsonProperty("enumerations")
    @JsonPropertyDescription("The Ethos enumerations for mapping.")
    private List<String> enumerations = new ArrayList<String>();

    /**
     * Resources
     * <p>
     * The Ethos resources and property names.
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
     * The Ethos resources and property names.
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
     * Enumerations
     * <p>
     * The Ethos enumerations for mapping.
     * 
     */
    @JsonProperty("enumerations")
    public List<String> getEnumerations() {
        return enumerations;
    }

    /**
     * Enumerations
     * <p>
     * The Ethos enumerations for mapping.
     * 
     */
    @JsonProperty("enumerations")
    public void setEnumerations(List<String> enumerations) {
        this.enumerations = enumerations;
    }

    public Ethos withEnumerations(List<String> enumerations) {
        this.enumerations = enumerations;
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
        sb.append("enumerations");
        sb.append('=');
        sb.append(((this.enumerations == null)?"<null>":this.enumerations));
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
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.enumerations == null)? 0 :this.enumerations.hashCode()));
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
        return (((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources)))&&((this.enumerations == rhs.enumerations)||((this.enumerations!= null)&&this.enumerations.equals(rhs.enumerations))));
    }

}
