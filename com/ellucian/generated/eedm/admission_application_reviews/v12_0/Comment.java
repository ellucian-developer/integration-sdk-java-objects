
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
    "comment"
})
@Generated("jsonschema2pojo")
public class Comment {

    /**
     * Type
     * <p>
     * The type of comment (academic, activities, essay, recommendation, overall).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of comment (academic, activities, essay, recommendation, overall).")
    private Comment.Type type;
    /**
     * Comment
     * <p>
     * The comment associated with the application during review process.
     * (Required)
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the application during review process.")
    private String comment;

    /**
     * Type
     * <p>
     * The type of comment (academic, activities, essay, recommendation, overall).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Comment.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of comment (academic, activities, essay, recommendation, overall).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Comment.Type type) {
        this.type = type;
    }

    public Comment withType(Comment.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the application during review process.
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the application during review process.
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Comment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Comment) == false) {
            return false;
        }
        Comment rhs = ((Comment) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))));
    }


    /**
     * Type
     * <p>
     * The type of comment (academic, activities, essay, recommendation, overall).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        ACADEMIC("academic"),
        ACTIVITIES("activities"),
        ESSAY("essay"),
        RECOMMENDATION("recommendation"),
        OVERALL("overall");
        private final String value;
        private final static Map<String, Comment.Type> CONSTANTS = new HashMap<String, Comment.Type>();

        static {
            for (Comment.Type c: values()) {
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
        public static Comment.Type fromValue(String value) {
            Comment.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
