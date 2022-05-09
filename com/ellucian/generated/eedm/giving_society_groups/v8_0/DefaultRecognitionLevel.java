
package com.ellucian.generated.eedm.giving_society_groups.v8_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rank",
    "name"
})
@Generated("jsonschema2pojo")
public class DefaultRecognitionLevel {

    /**
     * Rank
     * <p>
     * The rank of the recognition level.
     * (Required)
     * 
     */
    @JsonProperty("rank")
    @JsonPropertyDescription("The rank of the recognition level.")
    private Double rank;
    /**
     * Name
     * <p>
     * Name of the recognition level.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the recognition level.")
    private String name;

    /**
     * Rank
     * <p>
     * The rank of the recognition level.
     * (Required)
     * 
     */
    @JsonProperty("rank")
    public Double getRank() {
        return rank;
    }

    /**
     * Rank
     * <p>
     * The rank of the recognition level.
     * (Required)
     * 
     */
    @JsonProperty("rank")
    public void setRank(Double rank) {
        this.rank = rank;
    }

    public DefaultRecognitionLevel withRank(Double rank) {
        this.rank = rank;
        return this;
    }

    /**
     * Name
     * <p>
     * Name of the recognition level.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Name of the recognition level.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public DefaultRecognitionLevel withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefaultRecognitionLevel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rank");
        sb.append('=');
        sb.append(((this.rank == null)?"<null>":this.rank));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.rank == null)? 0 :this.rank.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultRecognitionLevel) == false) {
            return false;
        }
        DefaultRecognitionLevel rhs = ((DefaultRecognitionLevel) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.rank == rhs.rank)||((this.rank!= null)&&this.rank.equals(rhs.rank))));
    }

}
