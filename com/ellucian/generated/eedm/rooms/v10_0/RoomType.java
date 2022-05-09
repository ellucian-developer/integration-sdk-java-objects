
package com.ellucian.generated.eedm.rooms.v10_0;

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
    "detail"
})
@Generated("jsonschema2pojo")
public class RoomType {

    /**
     * Room Type
     * <p>
     * The type or style of a of room's layout, for example, "Classroom" style, "Lecture Hall" style, etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type or style of a of room's layout, for example, \"Classroom\" style, \"Lecture Hall\" style, etc.")
    private RoomType.Type type;
    /**
     * Detail
     * <p>
     * 
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("")
    private Object detail;

    /**
     * Room Type
     * <p>
     * The type or style of a of room's layout, for example, "Classroom" style, "Lecture Hall" style, etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public RoomType.Type getType() {
        return type;
    }

    /**
     * Room Type
     * <p>
     * The type or style of a of room's layout, for example, "Classroom" style, "Lecture Hall" style, etc.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(RoomType.Type type) {
        this.type = type;
    }

    public RoomType withType(RoomType.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Detail
     * <p>
     * 
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * 
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public RoomType withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomType) == false) {
            return false;
        }
        RoomType rhs = ((RoomType) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))));
    }


    /**
     * Room Type
     * <p>
     * The type or style of a of room's layout, for example, "Classroom" style, "Lecture Hall" style, etc.
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
        private final static Map<String, RoomType.Type> CONSTANTS = new HashMap<String, RoomType.Type>();

        static {
            for (RoomType.Type c: values()) {
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
        public static RoomType.Type fromValue(String value) {
            RoomType.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
