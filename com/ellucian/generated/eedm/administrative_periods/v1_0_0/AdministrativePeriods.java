
package com.ellucian.generated.eedm.administrative_periods.v1_0_0;

import java.util.Date;
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
 * Administrative Periods
 * <p>
 * A custom defined time period for administrative purposes.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "code",
    "title",
    "description",
    "startOn",
    "endOn",
    "type"
})
@Generated("jsonschema2pojo")
public class AdministrativePeriods {

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
     * A global identifier of an administrative time period.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of an administrative time period.")
    private String id;
    /**
     * Code
     * <p>
     * A code that identifies an administrative time period.
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("A code that identifies an administrative time period.")
    private String code;
    /**
     * Title
     * <p>
     * The full name of an administrative time period (for example, '2014-2015 Reporting Year').
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of an administrative time period (for example, '2014-2015 Reporting Year').")
    private String title;
    /**
     * Description
     * <p>
     * The description of an administrative time period.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of an administrative time period.")
    private String description;
    /**
     * Period Start Date
     * <p>
     * The date when an administrative period begins.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date when an administrative period begins.")
    private Date startOn;
    /**
     * Period End Date
     * <p>
     * The date when an administrative period ends.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date when an administrative period ends.")
    private Date endOn;
    /**
     * Type
     * <p>
     * A categorization of an administrative period.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A categorization of an administrative period.")
    private AdministrativePeriods.Type type;

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

    public AdministrativePeriods withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of an administrative time period.
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
     * A global identifier of an administrative time period.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdministrativePeriods withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Code
     * <p>
     * A code that identifies an administrative time period.
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Code
     * <p>
     * A code that identifies an administrative time period.
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AdministrativePeriods withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of an administrative time period (for example, '2014-2015 Reporting Year').
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
     * The full name of an administrative time period (for example, '2014-2015 Reporting Year').
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public AdministrativePeriods withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of an administrative time period.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of an administrative time period.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AdministrativePeriods withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Period Start Date
     * <p>
     * The date when an administrative period begins.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public Date getStartOn() {
        return startOn;
    }

    /**
     * Period Start Date
     * <p>
     * The date when an administrative period begins.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public AdministrativePeriods withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * Period End Date
     * <p>
     * The date when an administrative period ends.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public Date getEndOn() {
        return endOn;
    }

    /**
     * Period End Date
     * <p>
     * The date when an administrative period ends.
     * (Required)
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Date endOn) {
        this.endOn = endOn;
    }

    public AdministrativePeriods withEndOn(Date endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Type
     * <p>
     * A categorization of an administrative period.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AdministrativePeriods.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * A categorization of an administrative period.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AdministrativePeriods.Type type) {
        this.type = type;
    }

    public AdministrativePeriods withType(AdministrativePeriods.Type type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdministrativePeriods.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
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
        if ((other instanceof AdministrativePeriods) == false) {
            return false;
        }
        AdministrativePeriods rhs = ((AdministrativePeriods) other);
        return (((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Type
     * <p>
     * A categorization of an administrative period.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        TERM("term");
        private final String value;
        private final static Map<String, AdministrativePeriods.Type> CONSTANTS = new HashMap<String, AdministrativePeriods.Type>();

        static {
            for (AdministrativePeriods.Type c: values()) {
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
        public static AdministrativePeriods.Type fromValue(String value) {
            AdministrativePeriods.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
