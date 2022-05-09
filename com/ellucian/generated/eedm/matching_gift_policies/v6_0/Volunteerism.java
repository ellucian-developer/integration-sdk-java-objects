
package com.ellucian.generated.eedm.matching_gift_policies.v6_0;

import java.net.URI;
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
 * Volunteerism
 * <p>
 * Details about gift matching for volunteers.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "matching",
    "minimumHours",
    "involvedPeriod",
    "maximumMatchedAmount",
    "giftFormUrl",
    "guideUrl"
})
@Generated("jsonschema2pojo")
public class Volunteerism {

    /**
     * Matching
     * <p>
     * Company matching volunteers gifts.
     * 
     */
    @JsonProperty("matching")
    @JsonPropertyDescription("Company matching volunteers gifts.")
    private Volunteerism.Matching matching;
    /**
     * Minimum Hours
     * <p>
     * Minimum number of hours per period to be eligible for volunteer matching program
     * 
     */
    @JsonProperty("minimumHours")
    @JsonPropertyDescription("Minimum number of hours per period to be eligible for volunteer matching program")
    private Object minimumHours;
    /**
     * Involved Period
     * <p>
     * Period involved in minimum number of hours.
     * 
     */
    @JsonProperty("involvedPeriod")
    @JsonPropertyDescription("Period involved in minimum number of hours.")
    private Object involvedPeriod;
    /**
     * Maximum Matched Amount
     * <p>
     * Maximum dollar amount matched per year
     * 
     */
    @JsonProperty("maximumMatchedAmount")
    @JsonPropertyDescription("Maximum dollar amount matched per year")
    private Object maximumMatchedAmount;
    /**
     * Gift Form URL
     * <p>
     * Website link for volunteer program guidelines.
     * 
     */
    @JsonProperty("giftFormUrl")
    @JsonPropertyDescription("Website link for volunteer program guidelines.")
    private URI giftFormUrl;
    /**
     * Guide URL
     * <p>
     * Website link for volunteer program guidelines.
     * 
     */
    @JsonProperty("guideUrl")
    @JsonPropertyDescription("Website link for volunteer program guidelines.")
    private URI guideUrl;

    /**
     * Matching
     * <p>
     * Company matching volunteers gifts.
     * 
     */
    @JsonProperty("matching")
    public Volunteerism.Matching getMatching() {
        return matching;
    }

    /**
     * Matching
     * <p>
     * Company matching volunteers gifts.
     * 
     */
    @JsonProperty("matching")
    public void setMatching(Volunteerism.Matching matching) {
        this.matching = matching;
    }

    public Volunteerism withMatching(Volunteerism.Matching matching) {
        this.matching = matching;
        return this;
    }

    /**
     * Minimum Hours
     * <p>
     * Minimum number of hours per period to be eligible for volunteer matching program
     * 
     */
    @JsonProperty("minimumHours")
    public Object getMinimumHours() {
        return minimumHours;
    }

    /**
     * Minimum Hours
     * <p>
     * Minimum number of hours per period to be eligible for volunteer matching program
     * 
     */
    @JsonProperty("minimumHours")
    public void setMinimumHours(Object minimumHours) {
        this.minimumHours = minimumHours;
    }

    public Volunteerism withMinimumHours(Object minimumHours) {
        this.minimumHours = minimumHours;
        return this;
    }

    /**
     * Involved Period
     * <p>
     * Period involved in minimum number of hours.
     * 
     */
    @JsonProperty("involvedPeriod")
    public Object getInvolvedPeriod() {
        return involvedPeriod;
    }

    /**
     * Involved Period
     * <p>
     * Period involved in minimum number of hours.
     * 
     */
    @JsonProperty("involvedPeriod")
    public void setInvolvedPeriod(Object involvedPeriod) {
        this.involvedPeriod = involvedPeriod;
    }

    public Volunteerism withInvolvedPeriod(Object involvedPeriod) {
        this.involvedPeriod = involvedPeriod;
        return this;
    }

    /**
     * Maximum Matched Amount
     * <p>
     * Maximum dollar amount matched per year
     * 
     */
    @JsonProperty("maximumMatchedAmount")
    public Object getMaximumMatchedAmount() {
        return maximumMatchedAmount;
    }

    /**
     * Maximum Matched Amount
     * <p>
     * Maximum dollar amount matched per year
     * 
     */
    @JsonProperty("maximumMatchedAmount")
    public void setMaximumMatchedAmount(Object maximumMatchedAmount) {
        this.maximumMatchedAmount = maximumMatchedAmount;
    }

    public Volunteerism withMaximumMatchedAmount(Object maximumMatchedAmount) {
        this.maximumMatchedAmount = maximumMatchedAmount;
        return this;
    }

    /**
     * Gift Form URL
     * <p>
     * Website link for volunteer program guidelines.
     * 
     */
    @JsonProperty("giftFormUrl")
    public URI getGiftFormUrl() {
        return giftFormUrl;
    }

    /**
     * Gift Form URL
     * <p>
     * Website link for volunteer program guidelines.
     * 
     */
    @JsonProperty("giftFormUrl")
    public void setGiftFormUrl(URI giftFormUrl) {
        this.giftFormUrl = giftFormUrl;
    }

    public Volunteerism withGiftFormUrl(URI giftFormUrl) {
        this.giftFormUrl = giftFormUrl;
        return this;
    }

    /**
     * Guide URL
     * <p>
     * Website link for volunteer program guidelines.
     * 
     */
    @JsonProperty("guideUrl")
    public URI getGuideUrl() {
        return guideUrl;
    }

    /**
     * Guide URL
     * <p>
     * Website link for volunteer program guidelines.
     * 
     */
    @JsonProperty("guideUrl")
    public void setGuideUrl(URI guideUrl) {
        this.guideUrl = guideUrl;
    }

    public Volunteerism withGuideUrl(URI guideUrl) {
        this.guideUrl = guideUrl;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Volunteerism.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("matching");
        sb.append('=');
        sb.append(((this.matching == null)?"<null>":this.matching));
        sb.append(',');
        sb.append("minimumHours");
        sb.append('=');
        sb.append(((this.minimumHours == null)?"<null>":this.minimumHours));
        sb.append(',');
        sb.append("involvedPeriod");
        sb.append('=');
        sb.append(((this.involvedPeriod == null)?"<null>":this.involvedPeriod));
        sb.append(',');
        sb.append("maximumMatchedAmount");
        sb.append('=');
        sb.append(((this.maximumMatchedAmount == null)?"<null>":this.maximumMatchedAmount));
        sb.append(',');
        sb.append("giftFormUrl");
        sb.append('=');
        sb.append(((this.giftFormUrl == null)?"<null>":this.giftFormUrl));
        sb.append(',');
        sb.append("guideUrl");
        sb.append('=');
        sb.append(((this.guideUrl == null)?"<null>":this.guideUrl));
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
        result = ((result* 31)+((this.minimumHours == null)? 0 :this.minimumHours.hashCode()));
        result = ((result* 31)+((this.maximumMatchedAmount == null)? 0 :this.maximumMatchedAmount.hashCode()));
        result = ((result* 31)+((this.giftFormUrl == null)? 0 :this.giftFormUrl.hashCode()));
        result = ((result* 31)+((this.guideUrl == null)? 0 :this.guideUrl.hashCode()));
        result = ((result* 31)+((this.involvedPeriod == null)? 0 :this.involvedPeriod.hashCode()));
        result = ((result* 31)+((this.matching == null)? 0 :this.matching.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Volunteerism) == false) {
            return false;
        }
        Volunteerism rhs = ((Volunteerism) other);
        return (((((((this.minimumHours == rhs.minimumHours)||((this.minimumHours!= null)&&this.minimumHours.equals(rhs.minimumHours)))&&((this.maximumMatchedAmount == rhs.maximumMatchedAmount)||((this.maximumMatchedAmount!= null)&&this.maximumMatchedAmount.equals(rhs.maximumMatchedAmount))))&&((this.giftFormUrl == rhs.giftFormUrl)||((this.giftFormUrl!= null)&&this.giftFormUrl.equals(rhs.giftFormUrl))))&&((this.guideUrl == rhs.guideUrl)||((this.guideUrl!= null)&&this.guideUrl.equals(rhs.guideUrl))))&&((this.involvedPeriod == rhs.involvedPeriod)||((this.involvedPeriod!= null)&&this.involvedPeriod.equals(rhs.involvedPeriod))))&&((this.matching == rhs.matching)||((this.matching!= null)&&this.matching.equals(rhs.matching))));
    }


    /**
     * Matching
     * <p>
     * Company matching volunteers gifts.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Matching {

        AVAILABLE("available"),
        UN_AVAILABLE("unAvailable");
        private final String value;
        private final static Map<String, Volunteerism.Matching> CONSTANTS = new HashMap<String, Volunteerism.Matching>();

        static {
            for (Volunteerism.Matching c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Matching(String value) {
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
        public static Volunteerism.Matching fromValue(String value) {
            Volunteerism.Matching constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
