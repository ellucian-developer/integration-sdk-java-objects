
package com.ellucian.generated.eedm.housing_requests.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "roommate",
    "roommateCharacteristic"
})
@Generated("jsonschema2pojo")
public class RoommatePreference {

    /**
     * Roommate
     * <p>
     * The person's preferred roommate.
     * 
     */
    @JsonProperty("roommate")
    @JsonPropertyDescription("The person's preferred roommate.")
    private Roommate roommate;
    /**
     * Roommate Characteristic
     * <p>
     * The person's preferred roommate characteristic.
     * 
     */
    @JsonProperty("roommateCharacteristic")
    @JsonPropertyDescription("The person's preferred roommate characteristic.")
    private RoommateCharacteristic roommateCharacteristic;

    /**
     * Roommate
     * <p>
     * The person's preferred roommate.
     * 
     */
    @JsonProperty("roommate")
    public Roommate getRoommate() {
        return roommate;
    }

    /**
     * Roommate
     * <p>
     * The person's preferred roommate.
     * 
     */
    @JsonProperty("roommate")
    public void setRoommate(Roommate roommate) {
        this.roommate = roommate;
    }

    public RoommatePreference withRoommate(Roommate roommate) {
        this.roommate = roommate;
        return this;
    }

    /**
     * Roommate Characteristic
     * <p>
     * The person's preferred roommate characteristic.
     * 
     */
    @JsonProperty("roommateCharacteristic")
    public RoommateCharacteristic getRoommateCharacteristic() {
        return roommateCharacteristic;
    }

    /**
     * Roommate Characteristic
     * <p>
     * The person's preferred roommate characteristic.
     * 
     */
    @JsonProperty("roommateCharacteristic")
    public void setRoommateCharacteristic(RoommateCharacteristic roommateCharacteristic) {
        this.roommateCharacteristic = roommateCharacteristic;
    }

    public RoommatePreference withRoommateCharacteristic(RoommateCharacteristic roommateCharacteristic) {
        this.roommateCharacteristic = roommateCharacteristic;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoommatePreference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("roommate");
        sb.append('=');
        sb.append(((this.roommate == null)?"<null>":this.roommate));
        sb.append(',');
        sb.append("roommateCharacteristic");
        sb.append('=');
        sb.append(((this.roommateCharacteristic == null)?"<null>":this.roommateCharacteristic));
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
        result = ((result* 31)+((this.roommateCharacteristic == null)? 0 :this.roommateCharacteristic.hashCode()));
        result = ((result* 31)+((this.roommate == null)? 0 :this.roommate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoommatePreference) == false) {
            return false;
        }
        RoommatePreference rhs = ((RoommatePreference) other);
        return (((this.roommateCharacteristic == rhs.roommateCharacteristic)||((this.roommateCharacteristic!= null)&&this.roommateCharacteristic.equals(rhs.roommateCharacteristic)))&&((this.roommate == rhs.roommate)||((this.roommate!= null)&&this.roommate.equals(rhs.roommate))));
    }

}
