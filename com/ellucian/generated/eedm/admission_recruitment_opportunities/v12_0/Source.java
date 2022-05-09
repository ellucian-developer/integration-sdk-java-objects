
package com.ellucian.generated.eedm.admission_recruitment_opportunities.v12_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "source"
})
@Generated("jsonschema2pojo")
public class Source {

    /**
     * Type
     * <p>
     * The type of the source.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the source.")
    private Source.Type type;
    /**
     * Source
     * <p>
     * The identifier of the source.
     * (Required)
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The identifier of the source.")
    private Source__1 source;

    /**
     * Type
     * <p>
     * The type of the source.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Source.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the source.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Source.Type type) {
        this.type = type;
    }

    public Source withType(Source.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Source
     * <p>
     * The identifier of the source.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public Source__1 getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The identifier of the source.
     * (Required)
     * 
     */
    @JsonProperty("source")
    public void setSource(Source__1 source) {
        this.source = source;
    }

    public Source withSource(Source__1 source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Source.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))));
    }


    /**
     * Type
     * <p>
     * The type of the source.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        PROSPECT("prospect"),
        INQUIRY("inquiry");
        private final String value;
        private final static Map<String, Source.Type> CONSTANTS = new HashMap<String, Source.Type>();

        static {
            for (Source.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Source.Type fromValue(String value) {
            Source.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
