
package com.ellucian.generated.eedm.constituent_organizations.v12_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "forUseBy",
    "name"
})
@Generated("jsonschema2pojo")
public class FormattedName {

    /**
     * Type
     * <p>
     * The type of the formatted name.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the formatted name.")
    private Type type;
    /**
     * For Use By
     * <p>
     * The person for which the formatted name is always used when addressing the constituent organization.
     * 
     */
    @JsonProperty("forUseBy")
    @JsonPropertyDescription("The person for which the formatted name is always used when addressing the constituent organization.")
    private ForUseBy forUseBy;
    /**
     * Name
     * <p>
     * A formatted name for the constituent.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("A formatted name for the constituent.")
    private String name;

    /**
     * Type
     * <p>
     * The type of the formatted name.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the formatted name.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Type type) {
        this.type = type;
    }

    public FormattedName withType(Type type) {
        this.type = type;
        return this;
    }

    /**
     * For Use By
     * <p>
     * The person for which the formatted name is always used when addressing the constituent organization.
     * 
     */
    @JsonProperty("forUseBy")
    public ForUseBy getForUseBy() {
        return forUseBy;
    }

    /**
     * For Use By
     * <p>
     * The person for which the formatted name is always used when addressing the constituent organization.
     * 
     */
    @JsonProperty("forUseBy")
    public void setForUseBy(ForUseBy forUseBy) {
        this.forUseBy = forUseBy;
    }

    public FormattedName withForUseBy(ForUseBy forUseBy) {
        this.forUseBy = forUseBy;
        return this;
    }

    /**
     * Name
     * <p>
     * A formatted name for the constituent.
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
     * A formatted name for the constituent.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public FormattedName withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FormattedName.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("forUseBy");
        sb.append('=');
        sb.append(((this.forUseBy == null)?"<null>":this.forUseBy));
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
        result = ((result* 31)+((this.forUseBy == null)? 0 :this.forUseBy.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FormattedName) == false) {
            return false;
        }
        FormattedName rhs = ((FormattedName) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.forUseBy == rhs.forUseBy)||((this.forUseBy!= null)&&this.forUseBy.equals(rhs.forUseBy))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
