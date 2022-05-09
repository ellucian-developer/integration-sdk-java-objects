
package com.ellucian.generated.eedm.constituent_persons.v12_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "suffix"
})
@Generated("jsonschema2pojo")
public class InstitutionalSuffix {

    /**
     * Type
     * <p>
     * The type of institutional suffix.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of institutional suffix.")
    private Type__2 type;
    /**
     * Suffix
     * <p>
     * A institutional suffix that may be applied to the constituent.
     * (Required)
     * 
     */
    @JsonProperty("suffix")
    @JsonPropertyDescription("A institutional suffix that may be applied to the constituent.")
    private String suffix;

    /**
     * Type
     * <p>
     * The type of institutional suffix.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type__2 getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of institutional suffix.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type__2 type) {
        this.type = type;
    }

    public InstitutionalSuffix withType(Type__2 type) {
        this.type = type;
        return this;
    }

    /**
     * Suffix
     * <p>
     * A institutional suffix that may be applied to the constituent.
     * (Required)
     * 
     */
    @JsonProperty("suffix")
    public String getSuffix() {
        return suffix;
    }

    /**
     * Suffix
     * <p>
     * A institutional suffix that may be applied to the constituent.
     * (Required)
     * 
     */
    @JsonProperty("suffix")
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public InstitutionalSuffix withSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstitutionalSuffix.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("suffix");
        sb.append('=');
        sb.append(((this.suffix == null)?"<null>":this.suffix));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.suffix == null)? 0 :this.suffix.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstitutionalSuffix) == false) {
            return false;
        }
        InstitutionalSuffix rhs = ((InstitutionalSuffix) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.suffix == rhs.suffix)||((this.suffix!= null)&&this.suffix.equals(rhs.suffix))));
    }

}
