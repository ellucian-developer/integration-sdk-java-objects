
package com.ellucian.generated.eedm.email_types.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Email Types
 * <p>
 * Custom types of email.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "emailType"
})
@Generated("jsonschema2pojo")
public class EmailTypes {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * A globally unique identifier of an email type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A globally unique identifier of an email type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of an email type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an email type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of an email type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of an email type.")
    private String description;
    /**
     * Email Type Code
     * <p>
     * The generally unique code of an email type.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The generally unique code of an email type.")
    private String code;
    /**
     * Type
     * <p>
     * A mapping to a standard type for the email type.
     * (Required)
     * 
     */
    @JsonProperty("emailType")
    @JsonPropertyDescription("A mapping to a standard type for the email type.")
    private EmailTypes.EmailType emailType;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public EmailTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A globally unique identifier of an email type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * A globally unique identifier of an email type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmailTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an email type.
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
     * The full name of an email type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public EmailTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of an email type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of an email type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EmailTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Email Type Code
     * <p>
     * The generally unique code of an email type.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Email Type Code
     * <p>
     * The generally unique code of an email type.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public EmailTypes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Type
     * <p>
     * A mapping to a standard type for the email type.
     * (Required)
     * 
     */
    @JsonProperty("emailType")
    public EmailTypes.EmailType getEmailType() {
        return emailType;
    }

    /**
     * Type
     * <p>
     * A mapping to a standard type for the email type.
     * (Required)
     * 
     */
    @JsonProperty("emailType")
    public void setEmailType(EmailTypes.EmailType emailType) {
        this.emailType = emailType;
    }

    public EmailTypes withEmailType(EmailTypes.EmailType emailType) {
        this.emailType = emailType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmailTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("emailType");
        sb.append('=');
        sb.append(((this.emailType == null)?"<null>":this.emailType));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.emailType == null)? 0 :this.emailType.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailTypes) == false) {
            return false;
        }
        EmailTypes rhs = ((EmailTypes) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.emailType == rhs.emailType)||((this.emailType!= null)&&this.emailType.equals(rhs.emailType))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))));
    }


    /**
     * Type
     * <p>
     * A mapping to a standard type for the email type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum EmailType {

        PERSONAL("personal"),
        BUSINESS("business"),
        SCHOOL("school"),
        PARENT("parent"),
        FAMILY("family"),
        SALES("sales"),
        SUPPORT("support"),
        GENERAL("general"),
        BILLING("billing"),
        LEGAL("legal"),
        HR("hr"),
        MEDIA("media"),
        MATCHING_GIFTS("matchingGifts"),
        OTHER("other");
        private final String value;
        private final static Map<String, EmailTypes.EmailType> CONSTANTS = new HashMap<String, EmailTypes.EmailType>();

        static {
            for (EmailTypes.EmailType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        EmailType(String value) {
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
        public static EmailTypes.EmailType fromValue(String value) {
            EmailTypes.EmailType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
