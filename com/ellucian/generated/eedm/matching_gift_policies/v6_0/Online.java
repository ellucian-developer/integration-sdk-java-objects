
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Online
 * <p>
 * Online Forms details
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "form",
    "giftFormUrl",
    "guideUrl",
    "additionalInfoUrl",
    "mode"
})
@Generated("jsonschema2pojo")
public class Online {

    /**
     * Form
     * <p>
     * Company have an on-line matching gift form
     * 
     */
    @JsonProperty("form")
    @JsonPropertyDescription("Company have an on-line matching gift form")
    private Online.Form form;
    /**
     * Gift Form URL
     * <p>
     * URL of an on-line matching gift form
     * 
     */
    @JsonProperty("giftFormUrl")
    @JsonPropertyDescription("URL of an on-line matching gift form")
    private URI giftFormUrl;
    /**
     * Guide URL
     * <p>
     * URL for company's own description of their program guidelines
     * 
     */
    @JsonProperty("guideUrl")
    @JsonPropertyDescription("URL for company's own description of their program guidelines")
    private URI guideUrl;
    /**
     * Additional Info URL
     * <p>
     * Additional information URL
     * 
     */
    @JsonProperty("additionalInfoUrl")
    @JsonPropertyDescription("Additional information URL")
    private URI additionalInfoUrl;
    /**
     * Mode
     * <p>
     * Online matching form available mode
     * 
     */
    @JsonProperty("mode")
    @JsonPropertyDescription("Online matching form available mode")
    private List<Mode> mode = new ArrayList<Mode>();

    /**
     * Form
     * <p>
     * Company have an on-line matching gift form
     * 
     */
    @JsonProperty("form")
    public Online.Form getForm() {
        return form;
    }

    /**
     * Form
     * <p>
     * Company have an on-line matching gift form
     * 
     */
    @JsonProperty("form")
    public void setForm(Online.Form form) {
        this.form = form;
    }

    public Online withForm(Online.Form form) {
        this.form = form;
        return this;
    }

    /**
     * Gift Form URL
     * <p>
     * URL of an on-line matching gift form
     * 
     */
    @JsonProperty("giftFormUrl")
    public URI getGiftFormUrl() {
        return giftFormUrl;
    }

    /**
     * Gift Form URL
     * <p>
     * URL of an on-line matching gift form
     * 
     */
    @JsonProperty("giftFormUrl")
    public void setGiftFormUrl(URI giftFormUrl) {
        this.giftFormUrl = giftFormUrl;
    }

    public Online withGiftFormUrl(URI giftFormUrl) {
        this.giftFormUrl = giftFormUrl;
        return this;
    }

    /**
     * Guide URL
     * <p>
     * URL for company's own description of their program guidelines
     * 
     */
    @JsonProperty("guideUrl")
    public URI getGuideUrl() {
        return guideUrl;
    }

    /**
     * Guide URL
     * <p>
     * URL for company's own description of their program guidelines
     * 
     */
    @JsonProperty("guideUrl")
    public void setGuideUrl(URI guideUrl) {
        this.guideUrl = guideUrl;
    }

    public Online withGuideUrl(URI guideUrl) {
        this.guideUrl = guideUrl;
        return this;
    }

    /**
     * Additional Info URL
     * <p>
     * Additional information URL
     * 
     */
    @JsonProperty("additionalInfoUrl")
    public URI getAdditionalInfoUrl() {
        return additionalInfoUrl;
    }

    /**
     * Additional Info URL
     * <p>
     * Additional information URL
     * 
     */
    @JsonProperty("additionalInfoUrl")
    public void setAdditionalInfoUrl(URI additionalInfoUrl) {
        this.additionalInfoUrl = additionalInfoUrl;
    }

    public Online withAdditionalInfoUrl(URI additionalInfoUrl) {
        this.additionalInfoUrl = additionalInfoUrl;
        return this;
    }

    /**
     * Mode
     * <p>
     * Online matching form available mode
     * 
     */
    @JsonProperty("mode")
    public List<Mode> getMode() {
        return mode;
    }

    /**
     * Mode
     * <p>
     * Online matching form available mode
     * 
     */
    @JsonProperty("mode")
    public void setMode(List<Mode> mode) {
        this.mode = mode;
    }

    public Online withMode(List<Mode> mode) {
        this.mode = mode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Online.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("giftFormUrl");
        sb.append('=');
        sb.append(((this.giftFormUrl == null)?"<null>":this.giftFormUrl));
        sb.append(',');
        sb.append("guideUrl");
        sb.append('=');
        sb.append(((this.guideUrl == null)?"<null>":this.guideUrl));
        sb.append(',');
        sb.append("additionalInfoUrl");
        sb.append('=');
        sb.append(((this.additionalInfoUrl == null)?"<null>":this.additionalInfoUrl));
        sb.append(',');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null)?"<null>":this.mode));
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
        result = ((result* 31)+((this.additionalInfoUrl == null)? 0 :this.additionalInfoUrl.hashCode()));
        result = ((result* 31)+((this.mode == null)? 0 :this.mode.hashCode()));
        result = ((result* 31)+((this.form == null)? 0 :this.form.hashCode()));
        result = ((result* 31)+((this.giftFormUrl == null)? 0 :this.giftFormUrl.hashCode()));
        result = ((result* 31)+((this.guideUrl == null)? 0 :this.guideUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Online) == false) {
            return false;
        }
        Online rhs = ((Online) other);
        return ((((((this.additionalInfoUrl == rhs.additionalInfoUrl)||((this.additionalInfoUrl!= null)&&this.additionalInfoUrl.equals(rhs.additionalInfoUrl)))&&((this.mode == rhs.mode)||((this.mode!= null)&&this.mode.equals(rhs.mode))))&&((this.form == rhs.form)||((this.form!= null)&&this.form.equals(rhs.form))))&&((this.giftFormUrl == rhs.giftFormUrl)||((this.giftFormUrl!= null)&&this.giftFormUrl.equals(rhs.giftFormUrl))))&&((this.guideUrl == rhs.guideUrl)||((this.guideUrl!= null)&&this.guideUrl.equals(rhs.guideUrl))));
    }


    /**
     * Form
     * <p>
     * Company have an on-line matching gift form
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Form {

        AVAILABLE("available"),
        UN_AVAILABLE("unAvailable");
        private final String value;
        private final static Map<String, Online.Form> CONSTANTS = new HashMap<String, Online.Form>();

        static {
            for (Online.Form c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Form(String value) {
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
        public static Online.Form fromValue(String value) {
            Online.Form constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
