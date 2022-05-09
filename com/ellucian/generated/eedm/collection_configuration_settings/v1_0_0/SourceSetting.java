
package com.ellucian.generated.eedm.collection_configuration_settings.v1_0_0;

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
public class SourceSetting {

    /**
     * Title
     * <p>
     * The source title for the configuration.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The source title for the configuration.")
    private String title;
    /**
     * Value
     * <p>
     * The source value for the configuration.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The source value for the configuration.")
    private String value;

    /**
     * Title
     * <p>
     * The source title for the configuration.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The source title for the configuration.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public SourceSetting withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Value
     * <p>
     * The source value for the configuration.
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
     * The source value for the configuration.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    public SourceSetting withValue(String value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SourceSetting.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof SourceSetting) == false) {
            return false;
        }
        SourceSetting rhs = ((SourceSetting) other);
        return (((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title)))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))));
    }

}
