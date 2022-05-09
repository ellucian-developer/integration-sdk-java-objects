
package com.ellucian.generated.eedm.person_matching_requests_initiations_prospects.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Names
 * <p>
 * The names associated with a prospect.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "legal",
    "former",
    "favored"
})
@Generated("jsonschema2pojo")
public class Names {

    /**
     * Legal
     * <p>
     * The legal name of the prospect.
     * (Required)
     * 
     */
    @JsonProperty("legal")
    @JsonPropertyDescription("The legal name of the prospect.")
    private Legal legal;
    /**
     * Former
     * <p>
     * The former name of the prospect.
     * 
     */
    @JsonProperty("former")
    @JsonPropertyDescription("The former name of the prospect.")
    private Object former;
    /**
     * Favored
     * <p>
     * The favored name of the prospect.
     * 
     */
    @JsonProperty("favored")
    @JsonPropertyDescription("The favored name of the prospect.")
    private Favored favored;

    /**
     * Legal
     * <p>
     * The legal name of the prospect.
     * (Required)
     * 
     */
    @JsonProperty("legal")
    public Legal getLegal() {
        return legal;
    }

    /**
     * Legal
     * <p>
     * The legal name of the prospect.
     * (Required)
     * 
     */
    @JsonProperty("legal")
    public void setLegal(Legal legal) {
        this.legal = legal;
    }

    public Names withLegal(Legal legal) {
        this.legal = legal;
        return this;
    }

    /**
     * Former
     * <p>
     * The former name of the prospect.
     * 
     */
    @JsonProperty("former")
    public Object getFormer() {
        return former;
    }

    /**
     * Former
     * <p>
     * The former name of the prospect.
     * 
     */
    @JsonProperty("former")
    public void setFormer(Object former) {
        this.former = former;
    }

    public Names withFormer(Object former) {
        this.former = former;
        return this;
    }

    /**
     * Favored
     * <p>
     * The favored name of the prospect.
     * 
     */
    @JsonProperty("favored")
    public Favored getFavored() {
        return favored;
    }

    /**
     * Favored
     * <p>
     * The favored name of the prospect.
     * 
     */
    @JsonProperty("favored")
    public void setFavored(Favored favored) {
        this.favored = favored;
    }

    public Names withFavored(Favored favored) {
        this.favored = favored;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Names.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("legal");
        sb.append('=');
        sb.append(((this.legal == null)?"<null>":this.legal));
        sb.append(',');
        sb.append("former");
        sb.append('=');
        sb.append(((this.former == null)?"<null>":this.former));
        sb.append(',');
        sb.append("favored");
        sb.append('=');
        sb.append(((this.favored == null)?"<null>":this.favored));
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
        result = ((result* 31)+((this.legal == null)? 0 :this.legal.hashCode()));
        result = ((result* 31)+((this.favored == null)? 0 :this.favored.hashCode()));
        result = ((result* 31)+((this.former == null)? 0 :this.former.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Names) == false) {
            return false;
        }
        Names rhs = ((Names) other);
        return ((((this.legal == rhs.legal)||((this.legal!= null)&&this.legal.equals(rhs.legal)))&&((this.favored == rhs.favored)||((this.favored!= null)&&this.favored.equals(rhs.favored))))&&((this.former == rhs.former)||((this.former!= null)&&this.former.equals(rhs.former))));
    }

}
