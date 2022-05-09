
package com.ellucian.generated.eedm.admission_application_reviews.v12_0;

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
    "detail",
    "rating"
})
@Generated("jsonschema2pojo")
public class Rating {

    /**
     * Type
     * <p>
     * The type of rating.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of rating.")
    private Rating.Type type;
    /**
     * Detail
     * <p>
     * The user defined rating type.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The user defined rating type.")
    private Object detail;
    /**
     * Rating
     * <p>
     * The rating of the application.
     * (Required)
     * 
     */
    @JsonProperty("rating")
    @JsonPropertyDescription("The rating of the application.")
    private String rating;

    /**
     * Type
     * <p>
     * The type of rating.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Rating.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of rating.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Rating.Type type) {
        this.type = type;
    }

    public Rating withType(Rating.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Detail
     * <p>
     * The user defined rating type.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The user defined rating type.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Rating withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Rating
     * <p>
     * The rating of the application.
     * (Required)
     * 
     */
    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    /**
     * Rating
     * <p>
     * The rating of the application.
     * (Required)
     * 
     */
    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    public Rating withRating(String rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rating.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("rating");
        sb.append('=');
        sb.append(((this.rating == null)?"<null>":this.rating));
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
        result = ((result* 31)+((this.rating == null)? 0 :this.rating.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rating) == false) {
            return false;
        }
        Rating rhs = ((Rating) other);
        return ((((this.rating == rhs.rating)||((this.rating!= null)&&this.rating.equals(rhs.rating)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Type
     * <p>
     * The type of rating.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        ACADEMIC("academic"),
        APPLICATION("application"),
        COMMITTEE("committee"),
        PERSONAL("personal");
        private final String value;
        private final static Map<String, Rating.Type> CONSTANTS = new HashMap<String, Rating.Type>();

        static {
            for (Rating.Type c: values()) {
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
        public static Rating.Type fromValue(String value) {
            Rating.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
