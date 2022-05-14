
package com.ellucian.generated.eedm.rooms.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Rooms
 * <p>
 * A room within a building on a floor.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "description",
    "number",
    "floor",
    "roomTypes",
    "occupancies",
    "site",
    "building",
    "wing",
    "roomCharacteristics"
})
@Generated("jsonschema2pojo")
public class Rooms {

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
     * A global identifier of a room to be used in all external references to the room.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a room to be used in all external references to the room.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of a room.
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of a room.")
    private String title;
    /**
     * Description
     * <p>
     * A description of a room.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A description of a room.")
    private String description;
    /**
     * Number
     * <p>
     * A numbering scheme to distinguish different buildings, floors, and rooms located in the same site. Typically, this is a string.
     * 
     */
    @JsonProperty("number")
    @JsonPropertyDescription("A numbering scheme to distinguish different buildings, floors, and rooms located in the same site. Typically, this is a string.")
    private String number;
    /**
     * Floor
     * <p>
     * The name of the floor where a room is located.
     * 
     */
    @JsonProperty("floor")
    @JsonPropertyDescription("The name of the floor where a room is located.")
    private String floor;
    /**
     * Room Types
     * <p>
     * The type or style of a room's layout. For example, "Classroom" or "Lecture Hall" style. A room may support multiple types of layouts.
     * 
     */
    @JsonProperty("roomTypes")
    @JsonPropertyDescription("The type or style of a room's layout. For example, \"Classroom\" or \"Lecture Hall\" style. A room may support multiple types of layouts.")
    private List<RoomType> roomTypes = new ArrayList<RoomType>();
    /**
     * Occupancies
     * <p>
     * For rooms with multiple layouts. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, "Default" can be used.
     * 
     */
    @JsonProperty("occupancies")
    @JsonPropertyDescription("For rooms with multiple layouts. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, \"Default\" can be used.")
    private List<Occupancy> occupancies = new ArrayList<Occupancy>();
    /**
     * Site
     * <p>
     * The institution's site.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The institution's site.")
    private Object site;
    /**
     * Building
     * <p>
     * A physical structure, usually containing rooms, that is located at a specified physical location.
     * (Required)
     * 
     */
    @JsonProperty("building")
    @JsonPropertyDescription("A physical structure, usually containing rooms, that is located at a specified physical location.")
    private Building building;
    /**
     * Wing
     * <p>
     * The named section of a building in which the resides.
     * 
     */
    @JsonProperty("wing")
    @JsonPropertyDescription("The named section of a building in which the resides.")
    private Object wing;
    /**
     * Room Characteristics
     * <p>
     * The list of characteristics specified for the room.
     * 
     */
    @JsonProperty("roomCharacteristics")
    @JsonPropertyDescription("The list of characteristics specified for the room.")
    private List<RoomCharacteristic> roomCharacteristics = new ArrayList<RoomCharacteristic>();

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

    public Rooms withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of a room to be used in all external references to the room.
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
     * A global identifier of a room to be used in all external references to the room.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Rooms withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of a room.
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of a room.
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Rooms withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Description
     * <p>
     * A description of a room.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * A description of a room.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Rooms withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Number
     * <p>
     * A numbering scheme to distinguish different buildings, floors, and rooms located in the same site. Typically, this is a string.
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * Number
     * <p>
     * A numbering scheme to distinguish different buildings, floors, and rooms located in the same site. Typically, this is a string.
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Rooms withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Floor
     * <p>
     * The name of the floor where a room is located.
     * 
     */
    @JsonProperty("floor")
    public String getFloor() {
        return floor;
    }

    /**
     * Floor
     * <p>
     * The name of the floor where a room is located.
     * 
     */
    @JsonProperty("floor")
    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Rooms withFloor(String floor) {
        this.floor = floor;
        return this;
    }

    /**
     * Room Types
     * <p>
     * The type or style of a room's layout. For example, "Classroom" or "Lecture Hall" style. A room may support multiple types of layouts.
     * 
     */
    @JsonProperty("roomTypes")
    public List<RoomType> getRoomTypes() {
        return roomTypes;
    }

    /**
     * Room Types
     * <p>
     * The type or style of a room's layout. For example, "Classroom" or "Lecture Hall" style. A room may support multiple types of layouts.
     * 
     */
    @JsonProperty("roomTypes")
    public void setRoomTypes(List<RoomType> roomTypes) {
        this.roomTypes = roomTypes;
    }

    public Rooms withRoomTypes(List<RoomType> roomTypes) {
        this.roomTypes = roomTypes;
        return this;
    }

    /**
     * Occupancies
     * <p>
     * For rooms with multiple layouts. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, "Default" can be used.
     * 
     */
    @JsonProperty("occupancies")
    public List<Occupancy> getOccupancies() {
        return occupancies;
    }

    /**
     * Occupancies
     * <p>
     * For rooms with multiple layouts. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, "Default" can be used.
     * 
     */
    @JsonProperty("occupancies")
    public void setOccupancies(List<Occupancy> occupancies) {
        this.occupancies = occupancies;
    }

    public Rooms withOccupancies(List<Occupancy> occupancies) {
        this.occupancies = occupancies;
        return this;
    }

    /**
     * Site
     * <p>
     * The institution's site.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The institution's site.
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public Rooms withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Building
     * <p>
     * A physical structure, usually containing rooms, that is located at a specified physical location.
     * (Required)
     * 
     */
    @JsonProperty("building")
    public Building getBuilding() {
        return building;
    }

    /**
     * Building
     * <p>
     * A physical structure, usually containing rooms, that is located at a specified physical location.
     * (Required)
     * 
     */
    @JsonProperty("building")
    public void setBuilding(Building building) {
        this.building = building;
    }

    public Rooms withBuilding(Building building) {
        this.building = building;
        return this;
    }

    /**
     * Wing
     * <p>
     * The named section of a building in which the resides.
     * 
     */
    @JsonProperty("wing")
    public Object getWing() {
        return wing;
    }

    /**
     * Wing
     * <p>
     * The named section of a building in which the resides.
     * 
     */
    @JsonProperty("wing")
    public void setWing(Object wing) {
        this.wing = wing;
    }

    public Rooms withWing(Object wing) {
        this.wing = wing;
        return this;
    }

    /**
     * Room Characteristics
     * <p>
     * The list of characteristics specified for the room.
     * 
     */
    @JsonProperty("roomCharacteristics")
    public List<RoomCharacteristic> getRoomCharacteristics() {
        return roomCharacteristics;
    }

    /**
     * Room Characteristics
     * <p>
     * The list of characteristics specified for the room.
     * 
     */
    @JsonProperty("roomCharacteristics")
    public void setRoomCharacteristics(List<RoomCharacteristic> roomCharacteristics) {
        this.roomCharacteristics = roomCharacteristics;
    }

    public Rooms withRoomCharacteristics(List<RoomCharacteristic> roomCharacteristics) {
        this.roomCharacteristics = roomCharacteristics;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rooms.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("floor");
        sb.append('=');
        sb.append(((this.floor == null)?"<null>":this.floor));
        sb.append(',');
        sb.append("roomTypes");
        sb.append('=');
        sb.append(((this.roomTypes == null)?"<null>":this.roomTypes));
        sb.append(',');
        sb.append("occupancies");
        sb.append('=');
        sb.append(((this.occupancies == null)?"<null>":this.occupancies));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("building");
        sb.append('=');
        sb.append(((this.building == null)?"<null>":this.building));
        sb.append(',');
        sb.append("wing");
        sb.append('=');
        sb.append(((this.wing == null)?"<null>":this.wing));
        sb.append(',');
        sb.append("roomCharacteristics");
        sb.append('=');
        sb.append(((this.roomCharacteristics == null)?"<null>":this.roomCharacteristics));
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
        result = ((result* 31)+((this.occupancies == null)? 0 :this.occupancies.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.roomCharacteristics == null)? 0 :this.roomCharacteristics.hashCode()));
        result = ((result* 31)+((this.building == null)? 0 :this.building.hashCode()));
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.roomTypes == null)? 0 :this.roomTypes.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.floor == null)? 0 :this.floor.hashCode()));
        result = ((result* 31)+((this.wing == null)? 0 :this.wing.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rooms) == false) {
            return false;
        }
        Rooms rhs = ((Rooms) other);
        return (((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.occupancies == rhs.occupancies)||((this.occupancies!= null)&&this.occupancies.equals(rhs.occupancies))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.roomCharacteristics == rhs.roomCharacteristics)||((this.roomCharacteristics!= null)&&this.roomCharacteristics.equals(rhs.roomCharacteristics))))&&((this.building == rhs.building)||((this.building!= null)&&this.building.equals(rhs.building))))&&((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number))))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.roomTypes == rhs.roomTypes)||((this.roomTypes!= null)&&this.roomTypes.equals(rhs.roomTypes))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.floor == rhs.floor)||((this.floor!= null)&&this.floor.equals(rhs.floor))))&&((this.wing == rhs.wing)||((this.wing!= null)&&this.wing.equals(rhs.wing))));
    }

}
