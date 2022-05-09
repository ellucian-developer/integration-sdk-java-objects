
package com.ellucian.generated.eedm.sections.v16_1_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "value"
})
@Generated("jsonschema2pojo")
public class AlternateId {

    /**
     * Title
     * <p>
     * The title of the alternate identifier.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The title of the alternate identifier.")
    private String title;
    /**
     * Value
     * <p>
     * The value of the alternate identifier.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The value of the alternate identifier.")
    private String value;

    /**
     * Title
     * <p>
     * The title of the alternate identifier.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The title of the alternate identifier.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AlternateId withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Value
     * <p>
     * The value of the alternate identifier.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * The value of the alternate identifier.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public AlternateId withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AlternateId.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlternateId) == false) {
            return false;
        }
        AlternateId rhs = ((AlternateId) other);
        return (((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
