
package com.ellucian.generated.eedm.rooms_room_availability.v10_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Rooms Room Availability
 * <p>
 * A list of rooms that are available with given parameters.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "recurrence",
    "site",
    "building",
    "occupancies",
    "roomTypes"
})
@Generated("jsonschema2pojo")
public class RoomsRoomAvailability {

    /**
     * Recurrence
     * <p>
     * 
     * 
     */
    @JsonProperty("recurrence")
    @JsonPropertyDescription("")
    private Object recurrence;
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
     * The building at the selected site.
     * 
     */
    @JsonProperty("building")
    @JsonPropertyDescription("The building at the selected site.")
    private Object building;
    /**
     * Occupancy
     * <p>
     * For rooms with multiple layout, this can be used. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, "Default" can be used.
     * 
     */
    @JsonProperty("occupancies")
    @JsonPropertyDescription("For rooms with multiple layout, this can be used. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, \"Default\" can be used.")
    private List<Occupancy> occupancies = new ArrayList<Occupancy>();
    /**
     * Room Types
     * <p>
     * The type or style of a of room's layout. For example, "Classroom" or "Lecture Hall" style. A room may support multiple types of layouts.
     * 
     */
    @JsonProperty("roomTypes")
    @JsonPropertyDescription("The type or style of a of room's layout. For example, \"Classroom\" or \"Lecture Hall\" style. A room may support multiple types of layouts.")
    private List<RoomType> roomTypes = new ArrayList<RoomType>();

    /**
     * Recurrence
     * <p>
     * 
     * 
     */
    @JsonProperty("recurrence")
    public Object getRecurrence() {
        return recurrence;
    }

    /**
     * Recurrence
     * <p>
     * 
     * 
     */
    @JsonProperty("recurrence")
    public void setRecurrence(Object recurrence) {
        this.recurrence = recurrence;
    }

    public RoomsRoomAvailability withRecurrence(Object recurrence) {
        this.recurrence = recurrence;
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

    public RoomsRoomAvailability withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Building
     * <p>
     * The building at the selected site.
     * 
     */
    @JsonProperty("building")
    public Object getBuilding() {
        return building;
    }

    /**
     * Building
     * <p>
     * The building at the selected site.
     * 
     */
    @JsonProperty("building")
    public void setBuilding(Object building) {
        this.building = building;
    }

    public RoomsRoomAvailability withBuilding(Object building) {
        this.building = building;
        return this;
    }

    /**
     * Occupancy
     * <p>
     * For rooms with multiple layout, this can be used. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, "Default" can be used.
     * 
     */
    @JsonProperty("occupancies")
    public List<Occupancy> getOccupancies() {
        return occupancies;
    }

    /**
     * Occupancy
     * <p>
     * For rooms with multiple layout, this can be used. For example, a gymnasium can be used for a seminar or a conference, with different maximum occupancies. For rooms with single occupancy type, "Default" can be used.
     * 
     */
    @JsonProperty("occupancies")
    public void setOccupancies(List<Occupancy> occupancies) {
        this.occupancies = occupancies;
    }

    public RoomsRoomAvailability withOccupancies(List<Occupancy> occupancies) {
        this.occupancies = occupancies;
        return this;
    }

    /**
     * Room Types
     * <p>
     * The type or style of a of room's layout. For example, "Classroom" or "Lecture Hall" style. A room may support multiple types of layouts.
     * 
     */
    @JsonProperty("roomTypes")
    public List<RoomType> getRoomTypes() {
        return roomTypes;
    }

    /**
     * Room Types
     * <p>
     * The type or style of a of room's layout. For example, "Classroom" or "Lecture Hall" style. A room may support multiple types of layouts.
     * 
     */
    @JsonProperty("roomTypes")
    public void setRoomTypes(List<RoomType> roomTypes) {
        this.roomTypes = roomTypes;
    }

    public RoomsRoomAvailability withRoomTypes(List<RoomType> roomTypes) {
        this.roomTypes = roomTypes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomsRoomAvailability.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("recurrence");
        sb.append('=');
        sb.append(((this.recurrence == null)?"<null>":this.recurrence));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        sb.append("building");
        sb.append('=');
        sb.append(((this.building == null)?"<null>":this.building));
        sb.append(',');
        sb.append("occupancies");
        sb.append('=');
        sb.append(((this.occupancies == null)?"<null>":this.occupancies));
        sb.append(',');
        sb.append("roomTypes");
        sb.append('=');
        sb.append(((this.roomTypes == null)?"<null>":this.roomTypes));
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
        result = ((result* 31)+((this.recurrence == null)? 0 :this.recurrence.hashCode()));
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.building == null)? 0 :this.building.hashCode()));
        result = ((result* 31)+((this.occupancies == null)? 0 :this.occupancies.hashCode()));
        result = ((result* 31)+((this.roomTypes == null)? 0 :this.roomTypes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomsRoomAvailability) == false) {
            return false;
        }
        RoomsRoomAvailability rhs = ((RoomsRoomAvailability) other);
        return ((((((this.recurrence == rhs.recurrence)||((this.recurrence!= null)&&this.recurrence.equals(rhs.recurrence)))&&((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site))))&&((this.building == rhs.building)||((this.building!= null)&&this.building.equals(rhs.building))))&&((this.occupancies == rhs.occupancies)||((this.occupancies!= null)&&this.occupancies.equals(rhs.occupancies))))&&((this.roomTypes == rhs.roomTypes)||((this.roomTypes!= null)&&this.roomTypes.equals(rhs.roomTypes))));
    }

}
