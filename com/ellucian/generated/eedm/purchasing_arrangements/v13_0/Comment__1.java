
package com.ellucian.generated.eedm.purchasing_arrangements.v13_0;

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
    "comment",
    "type"
})
@Generated("jsonschema2pojo")
public class Comment__1 {

    /**
     * Comment
     * <p>
     * A comment associated with the line item.
     * (Required)
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("A comment associated with the line item.")
    private String comment;
    /**
     * Type
     * <p>
     * An indication of whether the comment is printed or not printed.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("An indication of whether the comment is printed or not printed.")
    private Comment__1 .Type type;

    /**
     * Comment
     * <p>
     * A comment associated with the line item.
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
     * A comment associated with the line item.
     * (Required)
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment__1 withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Type
     * <p>
     * An indication of whether the comment is printed or not printed.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Comment__1 .Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * An indication of whether the comment is printed or not printed.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Comment__1 .Type type) {
        this.type = type;
    }

    public Comment__1 withType(Comment__1 .Type type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Comment__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        if ((other instanceof Comment__1) == false) {
            return false;
        }
        Comment__1 rhs = ((Comment__1) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))));
    }


    /**
     * Type
     * <p>
     * An indication of whether the comment is printed or not printed.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        PRINTED("printed"),
        NOT_PRINTED("notPrinted");
        private final String value;
        private final static Map<String, Comment__1 .Type> CONSTANTS = new HashMap<String, Comment__1 .Type>();

        static {
            for (Comment__1 .Type c: values()) {
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
        public static Comment__1 .Type fromValue(String value) {
            Comment__1 .Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
