
package com.ellucian.generated.eedm.mapping_settings_options.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "value",
    "origin"
})
@Generated("jsonschema2pojo")
public class SourceOption {

    /**
     * Title
     * <p>
     * The source title for mapping.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The source title for mapping.")
    private String title;
    /**
     * Value
     * <p>
     * The source value for mapping.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The source value for mapping.")
    private String value;
    /**
     * Origin
     * <p>
     * The origin for the source mapping option.
     * 
     */
    @JsonProperty("origin")
    @JsonPropertyDescription("The origin for the source mapping option.")
    private String origin;

    /**
     * Title
     * <p>
     * The source title for mapping.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The source title for mapping.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public SourceOption withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Value
     * <p>
     * The source value for mapping.
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
     * The source value for mapping.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public SourceOption withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Origin
     * <p>
     * The origin for the source mapping option.
     * 
     */
    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    /**
     * Origin
     * <p>
     * The origin for the source mapping option.
     * 
     */
    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public SourceOption withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SourceOption.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("origin");
        sb.append('=');
        sb.append(((this.origin == null)?"<null>":this.origin));
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
        result = ((result* 31)+((this.origin == null)? 0 :this.origin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceOption) == false) {
            return false;
        }
        SourceOption rhs = ((SourceOption) other);
        return ((((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.origin == rhs.origin)||((this.origin!= null)&&this.origin.equals(rhs.origin))));
    }

}
