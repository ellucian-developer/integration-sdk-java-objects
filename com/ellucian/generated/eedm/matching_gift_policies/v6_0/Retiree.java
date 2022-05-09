
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Retiree
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ratio",
    "limit"
})
@Generated("jsonschema2pojo")
public class Retiree {

    /**
     * Ratio
     * <p>
     * The ratio of donation matched by the company for a retiree.
     * 
     */
    @JsonProperty("ratio")
    @JsonPropertyDescription("The ratio of donation matched by the company for a retiree.")
    private String ratio;
    /**
     * Limit
     * <p>
     * Maximum amount of donation matched by the company for an retiree.
     * 
     */
    @JsonProperty("limit")
    @JsonPropertyDescription("Maximum amount of donation matched by the company for an retiree.")
    private Limit__1 limit;

    /**
     * Ratio
     * <p>
     * The ratio of donation matched by the company for a retiree.
     * 
     */
    @JsonProperty("ratio")
    public String getRatio() {
        return ratio;
    }

    /**
     * Ratio
     * <p>
     * The ratio of donation matched by the company for a retiree.
     * 
     */
    @JsonProperty("ratio")
    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public Retiree withRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }

    /**
     * Limit
     * <p>
     * Maximum amount of donation matched by the company for an retiree.
     * 
     */
    @JsonProperty("limit")
    public Limit__1 getLimit() {
        return limit;
    }

    /**
     * Limit
     * <p>
     * Maximum amount of donation matched by the company for an retiree.
     * 
     */
    @JsonProperty("limit")
    public void setLimit(Limit__1 limit) {
        this.limit = limit;
    }

    public Retiree withLimit(Limit__1 limit) {
        this.limit = limit;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Retiree.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ratio");
        sb.append('=');
        sb.append(((this.ratio == null)?"<null>":this.ratio));
        sb.append(',');
        sb.append("limit");
        sb.append('=');
        sb.append(((this.limit == null)?"<null>":this.limit));
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
        result = ((result* 31)+((this.limit == null)? 0 :this.limit.hashCode()));
        result = ((result* 31)+((this.ratio == null)? 0 :this.ratio.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Retiree) == false) {
            return false;
        }
        Retiree rhs = ((Retiree) other);
        return (((this.limit == rhs.limit)||((this.limit!= null)&&this.limit.equals(rhs.limit)))&&((this.ratio == rhs.ratio)||((this.ratio!= null)&&this.ratio.equals(rhs.ratio))));
    }

}
