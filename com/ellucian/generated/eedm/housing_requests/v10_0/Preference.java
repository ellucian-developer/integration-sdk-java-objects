
package com.ellucian.generated.eedm.housing_requests.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "site",
    "building",
    "wing",
    "floor",
    "room"
})
@Generated("jsonschema2pojo")
public class Preference {

    /**
     * Site
     * <p>
     * The person's preferred location or campus.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The person's preferred location or campus.")
    private Object site;
    /**
     * Building
     * <p>
     * The person's preferred building.
     * 
     */
    @JsonProperty("building")
    @JsonPropertyDescription("The person's preferred building.")
    private Object building;
    /**
     * Wing
     * <p>
     * The person's preferred building wing.
     * 
     */
    @JsonProperty("wing")
    @JsonPropertyDescription("The person's preferred building wing.")
    private Object wing;
    /**
     * Floor
     * <p>
     * A person's preferred floor.
     * 
     */
    @JsonProperty("floor")
    @JsonPropertyDescription("A person's preferred floor.")
    private Object floor;
    /**
     * Room
     * <p>
     * A person's preferred room.
     * 
     */
    @JsonProperty("room")
    @JsonPropertyDescription("A person's preferred room.")
    private Object room;

    /**
     * Site
     * <p>
     * The person's preferred location or campus.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The person's preferred location or campus.
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public Preference withSite(Object site) {
        this.site = site;
        return this;
    }

    /**
     * Building
     * <p>
     * The person's preferred building.
     * 
     */
    @JsonProperty("building")
    public Object getBuilding() {
        return building;
    }

    /**
     * Building
     * <p>
     * The person's preferred building.
     * 
     */
    @JsonProperty("building")
    public void setBuilding(Object building) {
        this.building = building;
    }

    public Preference withBuilding(Object building) {
        this.building = building;
        return this;
    }

    /**
     * Wing
     * <p>
     * The person's preferred building wing.
     * 
     */
    @JsonProperty("wing")
    public Object getWing() {
        return wing;
    }

    /**
     * Wing
     * <p>
     * The person's preferred building wing.
     * 
     */
    @JsonProperty("wing")
    public void setWing(Object wing) {
        this.wing = wing;
    }

    public Preference withWing(Object wing) {
        this.wing = wing;
        return this;
    }

    /**
     * Floor
     * <p>
     * A person's preferred floor.
     * 
     */
    @JsonProperty("floor")
    public Object getFloor() {
        return floor;
    }

    /**
     * Floor
     * <p>
     * A person's preferred floor.
     * 
     */
    @JsonProperty("floor")
    public void setFloor(Object floor) {
        this.floor = floor;
    }

    public Preference withFloor(Object floor) {
        this.floor = floor;
        return this;
    }

    /**
     * Room
     * <p>
     * A person's preferred room.
     * 
     */
    @JsonProperty("room")
    public Object getRoom() {
        return room;
    }

    /**
     * Room
     * <p>
     * A person's preferred room.
     * 
     */
    @JsonProperty("room")
    public void setRoom(Object room) {
        this.room = room;
    }

    public Preference withRoom(Object room) {
        this.room = room;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Preference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("floor");
        sb.append('=');
        sb.append(((this.floor == null)?"<null>":this.floor));
        sb.append(',');
        sb.append("room");
        sb.append('=');
        sb.append(((this.room == null)?"<null>":this.room));
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
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.wing == null)? 0 :this.wing.hashCode()));
        result = ((result* 31)+((this.floor == null)? 0 :this.floor.hashCode()));
        result = ((result* 31)+((this.building == null)? 0 :this.building.hashCode()));
        result = ((result* 31)+((this.room == null)? 0 :this.room.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Preference) == false) {
            return false;
        }
        Preference rhs = ((Preference) other);
        return ((((((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site)))&&((this.wing == rhs.wing)||((this.wing!= null)&&this.wing.equals(rhs.wing))))&&((this.floor == rhs.floor)||((this.floor!= null)&&this.floor.equals(rhs.floor))))&&((this.building == rhs.building)||((this.building!= null)&&this.building.equals(rhs.building))))&&((this.room == rhs.room)||((this.room!= null)&&this.room.equals(rhs.room))));
    }

}
