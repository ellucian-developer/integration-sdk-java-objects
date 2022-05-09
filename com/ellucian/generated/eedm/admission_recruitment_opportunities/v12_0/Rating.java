
package com.ellucian.generated.eedm.admission_recruitment_opportunities.v12_0;

import java.util.Date;
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
    "ratingType",
    "scale",
    "value",
    "ratedOn",
    "adjustment"
})
@Generated("jsonschema2pojo")
public class Rating {

    /**
     * Rating Type
     * <p>
     * The type of the rating (desirability, probability).
     * (Required)
     * 
     */
    @JsonProperty("ratingType")
    @JsonPropertyDescription("The type of the rating (desirability, probability).")
    private Rating.RatingType ratingType;
    /**
     * Scale
     * <p>
     * The scale of the rating.
     * (Required)
     * 
     */
    @JsonProperty("scale")
    @JsonPropertyDescription("The scale of the rating.")
    private String scale;
    /**
     * Value
     * <p>
     * The value of the rating.
     * (Required)
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The value of the rating.")
    private Double value;
    /**
     * Rated On
     * <p>
     * The date of the rating.
     * (Required)
     * 
     */
    @JsonProperty("ratedOn")
    @JsonPropertyDescription("The date of the rating.")
    private Date ratedOn;
    /**
     * Adjustment
     * <p>
     * The adjustment for the rating value.
     * 
     */
    @JsonProperty("adjustment")
    @JsonPropertyDescription("The adjustment for the rating value.")
    private Object adjustment;

    /**
     * Rating Type
     * <p>
     * The type of the rating (desirability, probability).
     * (Required)
     * 
     */
    @JsonProperty("ratingType")
    public Rating.RatingType getRatingType() {
        return ratingType;
    }

    /**
     * Rating Type
     * <p>
     * The type of the rating (desirability, probability).
     * (Required)
     * 
     */
    @JsonProperty("ratingType")
    public void setRatingType(Rating.RatingType ratingType) {
        this.ratingType = ratingType;
    }

    public Rating withRatingType(Rating.RatingType ratingType) {
        this.ratingType = ratingType;
        return this;
    }

    /**
     * Scale
     * <p>
     * The scale of the rating.
     * (Required)
     * 
     */
    @JsonProperty("scale")
    public String getScale() {
        return scale;
    }

    /**
     * Scale
     * <p>
     * The scale of the rating.
     * (Required)
     * 
     */
    @JsonProperty("scale")
    public void setScale(String scale) {
        this.scale = scale;
    }

    public Rating withScale(String scale) {
        this.scale = scale;
        return this;
    }

    /**
     * Value
     * <p>
     * The value of the rating.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * Value
     * <p>
     * The value of the rating.
     * (Required)
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    public Rating withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Rated On
     * <p>
     * The date of the rating.
     * (Required)
     * 
     */
    @JsonProperty("ratedOn")
    public Date getRatedOn() {
        return ratedOn;
    }

    /**
     * Rated On
     * <p>
     * The date of the rating.
     * (Required)
     * 
     */
    @JsonProperty("ratedOn")
    public void setRatedOn(Date ratedOn) {
        this.ratedOn = ratedOn;
    }

    public Rating withRatedOn(Date ratedOn) {
        this.ratedOn = ratedOn;
        return this;
    }

    /**
     * Adjustment
     * <p>
     * The adjustment for the rating value.
     * 
     */
    @JsonProperty("adjustment")
    public Object getAdjustment() {
        return adjustment;
    }

    /**
     * Adjustment
     * <p>
     * The adjustment for the rating value.
     * 
     */
    @JsonProperty("adjustment")
    public void setAdjustment(Object adjustment) {
        this.adjustment = adjustment;
    }

    public Rating withAdjustment(Object adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rating.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ratingType");
        sb.append('=');
        sb.append(((this.ratingType == null)?"<null>":this.ratingType));
        sb.append(',');
        sb.append("scale");
        sb.append('=');
        sb.append(((this.scale == null)?"<null>":this.scale));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("ratedOn");
        sb.append('=');
        sb.append(((this.ratedOn == null)?"<null>":this.ratedOn));
        sb.append(',');
        sb.append("adjustment");
        sb.append('=');
        sb.append(((this.adjustment == null)?"<null>":this.adjustment));
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
        result = ((result* 31)+((this.scale == null)? 0 :this.scale.hashCode()));
        result = ((result* 31)+((this.adjustment == null)? 0 :this.adjustment.hashCode()));
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.ratedOn == null)? 0 :this.ratedOn.hashCode()));
        result = ((result* 31)+((this.ratingType == null)? 0 :this.ratingType.hashCode()));
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
        return ((((((this.scale == rhs.scale)||((this.scale!= null)&&this.scale.equals(rhs.scale)))&&((this.adjustment == rhs.adjustment)||((this.adjustment!= null)&&this.adjustment.equals(rhs.adjustment))))&&((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value))))&&((this.ratedOn == rhs.ratedOn)||((this.ratedOn!= null)&&this.ratedOn.equals(rhs.ratedOn))))&&((this.ratingType == rhs.ratingType)||((this.ratingType!= null)&&this.ratingType.equals(rhs.ratingType))));
    }


    /**
     * Rating Type
     * <p>
     * The type of the rating (desirability, probability).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RatingType {

        DESIRABILITY("desirability"),
        PROBABILITY("probability");
        private final String value;
        private final static Map<String, Rating.RatingType> CONSTANTS = new HashMap<String, Rating.RatingType>();

        static {
            for (Rating.RatingType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RatingType(String value) {
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
        public static Rating.RatingType fromValue(String value) {
            Rating.RatingType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
