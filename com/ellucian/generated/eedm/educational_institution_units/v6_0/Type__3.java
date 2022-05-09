
package com.ellucian.generated.eedm.educational_institution_units.v6_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Social Media
 * <p>
 * A type of social media account for the unit. Includes a standard type (e.g. 'skype', 'facebook') and an optional, custom type to further identify the type of social media account.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "socialMediaType",
    "detail"
})
@Generated("jsonschema2pojo")
public class Type__3 {

    /**
     * Type
     * <p>
     * A type of social media account (e.g. 'skype', 'facebook').
     * (Required)
     * 
     */
    @JsonProperty("socialMediaType")
    @JsonPropertyDescription("A type of social media account (e.g. 'skype', 'facebook').")
    private Type__3 .SocialMediaType socialMediaType;
    /**
     * Detail
     * <p>
     * An optional, custom social media type.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("An optional, custom social media type.")
    private Object detail;

    /**
     * Type
     * <p>
     * A type of social media account (e.g. 'skype', 'facebook').
     * (Required)
     * 
     */
    @JsonProperty("socialMediaType")
    public Type__3 .SocialMediaType getSocialMediaType() {
        return socialMediaType;
    }

    /**
     * Type
     * <p>
     * A type of social media account (e.g. 'skype', 'facebook').
     * (Required)
     * 
     */
    @JsonProperty("socialMediaType")
    public void setSocialMediaType(Type__3 .SocialMediaType socialMediaType) {
        this.socialMediaType = socialMediaType;
    }

    public Type__3 withSocialMediaType(Type__3 .SocialMediaType socialMediaType) {
        this.socialMediaType = socialMediaType;
        return this;
    }

    /**
     * Detail
     * <p>
     * An optional, custom social media type.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * An optional, custom social media type.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Type__3 withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Type__3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("socialMediaType");
        sb.append('=');
        sb.append(((this.socialMediaType == null)?"<null>":this.socialMediaType));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.socialMediaType == null)? 0 :this.socialMediaType.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Type__3) == false) {
            return false;
        }
        Type__3 rhs = ((Type__3) other);
        return (((this.socialMediaType == rhs.socialMediaType)||((this.socialMediaType!= null)&&this.socialMediaType.equals(rhs.socialMediaType)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Type
     * <p>
     * A type of social media account (e.g. 'skype', 'facebook').
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SocialMediaType {

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
        private final static Map<String, Type__3 .SocialMediaType> CONSTANTS = new HashMap<String, Type__3 .SocialMediaType>();

        static {
            for (Type__3 .SocialMediaType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SocialMediaType(String value) {
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
        public static Type__3 .SocialMediaType fromValue(String value) {
            Type__3 .SocialMediaType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
