
package com.ellucian.generated.eedm.room_types.v6_0;

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
 * Room Types
 * <p>
 * A list of custom room types.
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
public class RoomTypes {

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
     * A globally unique identifier of a room type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A globally unique identifier of a room type.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of a room type
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a room type")
    private String title;
    /**
     * Description
     * <p>
     * The description of a room type.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of a room type.")
    private String description;
    /**
     * Room Type Code
     * <p>
     * 
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("")
    private String code;
    /**
     * Type
     * <p>
     * The type or style of a of room's layout. For example, "Classroom" or "Banquet" style.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type or style of a of room's layout. For example, \"Classroom\" or \"Banquet\" style.")
    private RoomTypes.Type type;

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

    public RoomTypes withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A globally unique identifier of a room type.
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
     * A globally unique identifier of a room type.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RoomTypes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a room type
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
     * The full name of a room type
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public RoomTypes withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of a room type.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of a room type.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public RoomTypes withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Room Type Code
     * <p>
     * 
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Room Type Code
     * <p>
     * 
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public RoomTypes withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Type
     * <p>
     * The type or style of a of room's layout. For example, "Classroom" or "Banquet" style.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public RoomTypes.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type or style of a of room's layout. For example, "Classroom" or "Banquet" style.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(RoomTypes.Type type) {
        this.type = type;
    }

    public RoomTypes withType(RoomTypes.Type type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomTypes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof RoomTypes) == false) {
            return false;
        }
        RoomTypes rhs = ((RoomTypes) other);
        return (((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Type
     * <p>
     * The type or style of a of room's layout. For example, "Classroom" or "Banquet" style.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        RESIDENCEHALLROOM("residencehallroom"),
        RESIDENTIALSINGLEROOM("residentialsingleroom"),
        RESIDENTIALDOUBLEROOM("residentialdoubleroom"),
        RESIDENTIALTRIPLEROOM("residentialtripleroom"),
        RESIDENTIALSUITEROOM("residentialsuiteroom"),
        APARTMENT("apartment"),
        HOUSE("house"),
        CLASSROOM("classroom"),
        LECTUREHALL("lecturehall"),
        SEMINARROOM("seminarroom"),
        CONFERENCEROOM("conferenceroom"),
        SCIENCELABORATORY("sciencelaboratory"),
        COMPUTERLABORATORY("computerlaboratory"),
        MECHANICSLAB("mechanicslab"),
        AUDIOVISUALLAB("audiovisuallab"),
        ARTSTUDIO("artstudio"),
        MUSICROOM("musicroom"),
        PERFORMINGARTSSTUDIO("performingartsstudio"),
        BALLROOM("ballroom"),
        OFFICE("office"),
        STUDYFACILITY("studyfacility"),
        CLINIC("clinic"),
        ANIMALQUARTERS("animalquarters"),
        GREENHOUSE("greenhouse"),
        SPECIALUSEFACILITY("specialusefacility"),
        GENERALUSEFACILITY("generalusefacility"),
        FOODFACILITY("foodfacility"),
        DAYCARE("daycare"),
        LOUNGE("lounge"),
        MERCHANDISINGROOM("merchandisingroom"),
        SUPPORTFACILITY("supportfacility"),
        HEALTHCAREFACILITY("healthcarefacility"),
        ATRIUM("atrium"),
        AMPHITHEATER("amphitheater"),
        AUDITORIUM("auditorium"),
        BOOTH("booth"),
        OTHER("other");
        private final String value;
        private final static Map<String, RoomTypes.Type> CONSTANTS = new HashMap<String, RoomTypes.Type>();

        static {
            for (RoomTypes.Type c: values()) {
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
        public static RoomTypes.Type fromValue(String value) {
            RoomTypes.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
