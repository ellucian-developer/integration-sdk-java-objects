
package com.ellucian.generated.eedm.contributions.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "solicitor"
})
@Generated("jsonschema2pojo")
public class Solicitor {

    /**
     * Solicitor
     * <p>
     * A person, team, or organization responsible for generating the contribution.
     * (Required)
     * 
     */
    @JsonProperty("solicitor")
    @JsonPropertyDescription("A person, team, or organization responsible for generating the contribution.")
    private Object solicitor;

    /**
     * Solicitor
     * <p>
     * A person, team, or organization responsible for generating the contribution.
     * (Required)
     * 
     */
    @JsonProperty("solicitor")
    public Object getSolicitor() {
        return solicitor;
    }

    /**
     * Solicitor
     * <p>
     * A person, team, or organization responsible for generating the contribution.
     * (Required)
     * 
     */
    @JsonProperty("solicitor")
    public void setSolicitor(Object solicitor) {
        this.solicitor = solicitor;
    }

    public Solicitor withSolicitor(Object solicitor) {
        this.solicitor = solicitor;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Solicitor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("solicitor");
        sb.append('=');
        sb.append(((this.solicitor == null)?"<null>":this.solicitor));
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
        result = ((result* 31)+((this.solicitor == null)? 0 :this.solicitor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Solicitor) == false) {
            return false;
        }
        Solicitor rhs = ((Solicitor) other);
        return ((this.solicitor == rhs.solicitor)||((this.solicitor!= null)&&this.solicitor.equals(rhs.solicitor)));
    }

}
