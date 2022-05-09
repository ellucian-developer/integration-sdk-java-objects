
package com.ellucian.generated.eedm.persons.v12_2_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "preference"
})
@Generated("jsonschema2pojo")
public class Language {

    /**
     * Code
     * <p>
     * The ISO 639-3 alpha-3 language code.
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The ISO 639-3 alpha-3 language code.")
    private String code;
    /**
     * Preference
     * <p>
     * Language preference indicator. Only one language should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    @JsonPropertyDescription("Language preference indicator. Only one language should be set to primary for a person.")
    private Object preference;

    /**
     * Code
     * <p>
     * The ISO 639-3 alpha-3 language code.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The ISO 639-3 alpha-3 language code.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Language withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Preference
     * <p>
     * Language preference indicator. Only one language should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    public Object getPreference() {
        return preference;
    }

    /**
     * Preference
     * <p>
     * Language preference indicator. Only one language should be set to primary for a person.
     * 
     */
    @JsonProperty("preference")
    public void setPreference(Object preference) {
        this.preference = preference;
    }

    public Language withPreference(Object preference) {
        this.preference = preference;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Language.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("preference");
        sb.append('=');
        sb.append(((this.preference == null)?"<null>":this.preference));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.preference == null)? 0 :this.preference.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Language) == false) {
            return false;
        }
        Language rhs = ((Language) other);
        return (((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.preference == rhs.preference)||((this.preference!= null)&&this.preference.equals(rhs.preference))));
    }

}
