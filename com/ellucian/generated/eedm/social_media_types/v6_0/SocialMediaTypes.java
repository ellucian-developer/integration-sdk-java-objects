
package com.ellucian.generated.eedm.social_media_types.v6_0;

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
 * Social Media Types
 * <p>
 * Types of social media accounts.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "code",
    "type"
})
@Generated("jsonschema2pojo")
public class SocialMediaTypes {

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
     * A globally unique identifier of social media account types.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A globally unique identifier of social media account types.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of a Social Media type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a Social Media type.")
    private String title;
    /**
     * Description
     * <p>
     * The description of a Social Media type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of a Social Media type.")
    private String description;
    /**
     * Code
     * <p>
     * The code of the social media type
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The code of the social media type")
    private String code;
    /**
     * Type
     * <p>
     * A type of social media account.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A type of social media account.")
    private SocialMediaTypes.Type type;

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

    public SocialMediaTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A globally unique identifier of social media account types.
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
     * A globally unique identifier of social media account types.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public SocialMediaTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a Social Media type.
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
     * The full name of a Social Media type.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public SocialMediaTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of a Social Media type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of a Social Media type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public SocialMediaTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Code
     * <p>
     * The code of the social media type
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * The code of the social media type
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public SocialMediaTypes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Type
     * <p>
     * A type of social media account.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public SocialMediaTypes.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A type of social media account.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(SocialMediaTypes.Type type) {
        this.type = type;
    }

    public SocialMediaTypes withType(SocialMediaTypes.Type type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SocialMediaTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SocialMediaTypes) == false) {
            return false;
        }
        SocialMediaTypes rhs = ((SocialMediaTypes) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Type
     * <p>
     * A type of social media account.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        WINDOWS_LIVE("windowsLive"),
        YAHOO("yahoo"),
        SKYPE("skype"),
        QQ("qq"),
        HANGOUTS("hangouts"),
        ICQ("icq"),
        JABBER("jabber"),
        FACEBOOK("facebook"),
        TWITTER("twitter"),
        INSTAGRAM("instagram"),
        TUMBLR("tumblr"),
        PINTEREST("pinterest"),
        LINKEDIN("linkedin"),
        FOURSQUARE("foursquare"),
        YOUTUBE("youtube"),
        BLOG("blog"),
        WEBSITE("website"),
        OTHER("other");
        private final String value;
        private final static Map<String, SocialMediaTypes.Type> CONSTANTS = new HashMap<String, SocialMediaTypes.Type>();

        static {
            for (SocialMediaTypes.Type c: values()) {
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
        public static SocialMediaTypes.Type fromValue(String value) {
            SocialMediaTypes.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
