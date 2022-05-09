
package com.ellucian.generated.eedm.constituent_assets.v13_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Owner
 * <p>
 * The owner of the asset.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "prospect",
    "constituent"
})
@Generated("jsonschema2pojo")
public class Owner {

    /**
     * Prospect
     * <p>
     * The prospect that owns the asset.
     * 
     */
    @JsonProperty("prospect")
    @JsonPropertyDescription("The prospect that owns the asset.")
    private Object prospect;
    /**
     * Constituent
     * <p>
     * The constituent that owns the asset.
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("The constituent that owns the asset.")
    private Object constituent;

    /**
     * Prospect
     * <p>
     * The prospect that owns the asset.
     * 
     */
    @JsonProperty("prospect")
    public Object getProspect() {
        return prospect;
    }

    /**
     * Prospect
     * <p>
     * The prospect that owns the asset.
     * 
     */
    @JsonProperty("prospect")
    public void setProspect(Object prospect) {
        this.prospect = prospect;
    }

    public Owner withProspect(Object prospect) {
        this.prospect = prospect;
        return this;
    }

    /**
     * Constituent
     * <p>
     * The constituent that owns the asset.
     * 
     */
    @JsonProperty("constituent")
    public Object getConstituent() {
        return constituent;
    }

    /**
     * Constituent
     * <p>
     * The constituent that owns the asset.
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public Owner withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Owner.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("prospect");
        sb.append('=');
        sb.append(((this.prospect == null)?"<null>":this.prospect));
        sb.append(',');
        sb.append("constituent");
        sb.append('=');
        sb.append(((this.constituent == null)?"<null>":this.constituent));
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
        result = ((result* 31)+((this.prospect == null)? 0 :this.prospect.hashCode()));
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Owner) == false) {
            return false;
        }
        Owner rhs = ((Owner) other);
        return (((this.prospect == rhs.prospect)||((this.prospect!= null)&&this.prospect.equals(rhs.prospect)))&&((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent))));
    }

}
