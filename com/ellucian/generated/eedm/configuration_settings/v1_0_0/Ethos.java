
package com.ellucian.generated.eedm.configuration_settings.v1_0_0;

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
 * The Ethos resource(s) to which the configuration applies.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "resources"
})
@Generated("jsonschema2pojo")
public class Ethos {

    /**
     * Resources
     * <p>
     * The Ethos resource(s) to which the configuration applies.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("The Ethos resource(s) to which the configuration applies.")
    private List<String> resources = new ArrayList<String>();

    /**
     * Resources
     * <p>
     * The Ethos resource(s) to which the configuration applies.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public List<String> getResources() {
        return resources;
    }

    /**
     * Resources
     * <p>
     * The Ethos resource(s) to which the configuration applies.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public Ethos withResources(List<String> resources) {
        this.resources = resources;
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
        return ((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources)));
    }

}
