
package com.ellucian.generated.eedm.housing_requests.v10_0;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
 * Housing Requests
 * <p>
 * A persons's request for housing including room and roommate preferences.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "academicPeriods",
    "startOn",
    "endOn",
    "status",
    "priorityNumber",
    "preferences",
    "roomCharacteristics",
    "floorCharacteristic",
    "roommatePreferences"
})
@Generated("jsonschema2pojo")
public class HousingRequests {

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
     * The global identifier of the Housing Request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the Housing Request.")
    private String id;
    /**
     * Person
     * <p>
     * The person requesting housing.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person requesting housing.")
    private Person person;
    /**
     * Academic Periods
     * <p>
     * The academic periods for which a person is requesting housing.
     * 
     */
    @JsonProperty("academicPeriods")
    @JsonPropertyDescription("The academic periods for which a person is requesting housing.")
    private List<AcademicPeriod> academicPeriods = new ArrayList<AcademicPeriod>();
    /**
     * Start On
     * <p>
     * The first date for which housing is requested.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date for which housing is requested.")
    private Date startOn;
    /**
     * End On
     * <p>
     * The last date for which housing is requested.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date for which housing is requested.")
    private Object endOn;
    /**
     * Status
     * <p>
     * The status of the housing request.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the housing request.")
    private HousingRequests.Status status;
    /**
     * Priority Number
     * <p>
     * A number that indicates relative priority of housing requests.
     * 
     */
    @JsonProperty("priorityNumber")
    @JsonPropertyDescription("A number that indicates relative priority of housing requests.")
    private Object priorityNumber;
    /**
     * Preferences
     * <p>
     * The person's housing preferences.
     * 
     */
    @JsonProperty("preferences")
    @JsonPropertyDescription("The person's housing preferences.")
    private List<Preference> preferences = new ArrayList<Preference>();
    /**
     * Room Characteristics
     * <p>
     * A person's preferred room characteristics.
     * 
     */
    @JsonProperty("roomCharacteristics")
    @JsonPropertyDescription("A person's preferred room characteristics.")
    private List<RoomCharacteristic> roomCharacteristics = new ArrayList<RoomCharacteristic>();
    /**
     * Floor Characteristic
     * <p>
     * A person's preferred floor characteristic.
     * 
     */
    @JsonProperty("floorCharacteristic")
    @JsonPropertyDescription("A person's preferred floor characteristic.")
    private Object floorCharacteristic;
    /**
     * Roommate Preferences
     * <p>
     * A list of requested roommates or roommate attributes.
     * 
     */
    @JsonProperty("roommatePreferences")
    @JsonPropertyDescription("A list of requested roommates or roommate attributes.")
    private List<RoommatePreference> roommatePreferences = new ArrayList<RoommatePreference>();

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

    public HousingRequests withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the Housing Request.
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
     * The global identifier of the Housing Request.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public HousingRequests withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person requesting housing.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public Person getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * The person requesting housing.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public HousingRequests withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Academic Periods
     * <p>
     * The academic periods for which a person is requesting housing.
     * 
     */
    @JsonProperty("academicPeriods")
    public List<AcademicPeriod> getAcademicPeriods() {
        return academicPeriods;
    }

    /**
     * Academic Periods
     * <p>
     * The academic periods for which a person is requesting housing.
     * 
     */
    @JsonProperty("academicPeriods")
    public void setAcademicPeriods(List<AcademicPeriod> academicPeriods) {
        this.academicPeriods = academicPeriods;
    }

    public HousingRequests withAcademicPeriods(List<AcademicPeriod> academicPeriods) {
        this.academicPeriods = academicPeriods;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date for which housing is requested.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public Date getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date for which housing is requested.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public HousingRequests withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date for which housing is requested.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date for which housing is requested.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public HousingRequests withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the housing request.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public HousingRequests.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the housing request.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(HousingRequests.Status status) {
        this.status = status;
    }

    public HousingRequests withStatus(HousingRequests.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Priority Number
     * <p>
     * A number that indicates relative priority of housing requests.
     * 
     */
    @JsonProperty("priorityNumber")
    public Object getPriorityNumber() {
        return priorityNumber;
    }

    /**
     * Priority Number
     * <p>
     * A number that indicates relative priority of housing requests.
     * 
     */
    @JsonProperty("priorityNumber")
    public void setPriorityNumber(Object priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public HousingRequests withPriorityNumber(Object priorityNumber) {
        this.priorityNumber = priorityNumber;
        return this;
    }

    /**
     * Preferences
     * <p>
     * The person's housing preferences.
     * 
     */
    @JsonProperty("preferences")
    public List<Preference> getPreferences() {
        return preferences;
    }

    /**
     * Preferences
     * <p>
     * The person's housing preferences.
     * 
     */
    @JsonProperty("preferences")
    public void setPreferences(List<Preference> preferences) {
        this.preferences = preferences;
    }

    public HousingRequests withPreferences(List<Preference> preferences) {
        this.preferences = preferences;
        return this;
    }

    /**
     * Room Characteristics
     * <p>
     * A person's preferred room characteristics.
     * 
     */
    @JsonProperty("roomCharacteristics")
    public List<RoomCharacteristic> getRoomCharacteristics() {
        return roomCharacteristics;
    }

    /**
     * Room Characteristics
     * <p>
     * A person's preferred room characteristics.
     * 
     */
    @JsonProperty("roomCharacteristics")
    public void setRoomCharacteristics(List<RoomCharacteristic> roomCharacteristics) {
        this.roomCharacteristics = roomCharacteristics;
    }

    public HousingRequests withRoomCharacteristics(List<RoomCharacteristic> roomCharacteristics) {
        this.roomCharacteristics = roomCharacteristics;
        return this;
    }

    /**
     * Floor Characteristic
     * <p>
     * A person's preferred floor characteristic.
     * 
     */
    @JsonProperty("floorCharacteristic")
    public Object getFloorCharacteristic() {
        return floorCharacteristic;
    }

    /**
     * Floor Characteristic
     * <p>
     * A person's preferred floor characteristic.
     * 
     */
    @JsonProperty("floorCharacteristic")
    public void setFloorCharacteristic(Object floorCharacteristic) {
        this.floorCharacteristic = floorCharacteristic;
    }

    public HousingRequests withFloorCharacteristic(Object floorCharacteristic) {
        this.floorCharacteristic = floorCharacteristic;
        return this;
    }

    /**
     * Roommate Preferences
     * <p>
     * A list of requested roommates or roommate attributes.
     * 
     */
    @JsonProperty("roommatePreferences")
    public List<RoommatePreference> getRoommatePreferences() {
        return roommatePreferences;
    }

    /**
     * Roommate Preferences
     * <p>
     * A list of requested roommates or roommate attributes.
     * 
     */
    @JsonProperty("roommatePreferences")
    public void setRoommatePreferences(List<RoommatePreference> roommatePreferences) {
        this.roommatePreferences = roommatePreferences;
    }

    public HousingRequests withRoommatePreferences(List<RoommatePreference> roommatePreferences) {
        this.roommatePreferences = roommatePreferences;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HousingRequests.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("academicPeriods");
        sb.append('=');
        sb.append(((this.academicPeriods == null)?"<null>":this.academicPeriods));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("priorityNumber");
        sb.append('=');
        sb.append(((this.priorityNumber == null)?"<null>":this.priorityNumber));
        sb.append(',');
        sb.append("preferences");
        sb.append('=');
        sb.append(((this.preferences == null)?"<null>":this.preferences));
        sb.append(',');
        sb.append("roomCharacteristics");
        sb.append('=');
        sb.append(((this.roomCharacteristics == null)?"<null>":this.roomCharacteristics));
        sb.append(',');
        sb.append("floorCharacteristic");
        sb.append('=');
        sb.append(((this.floorCharacteristic == null)?"<null>":this.floorCharacteristic));
        sb.append(',');
        sb.append("roommatePreferences");
        sb.append('=');
        sb.append(((this.roommatePreferences == null)?"<null>":this.roommatePreferences));
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
        result = ((result* 31)+((this.floorCharacteristic == null)? 0 :this.floorCharacteristic.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.preferences == null)? 0 :this.preferences.hashCode()));
        result = ((result* 31)+((this.priorityNumber == null)? 0 :this.priorityNumber.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.roommatePreferences == null)? 0 :this.roommatePreferences.hashCode()));
        result = ((result* 31)+((this.roomCharacteristics == null)? 0 :this.roomCharacteristics.hashCode()));
        result = ((result* 31)+((this.academicPeriods == null)? 0 :this.academicPeriods.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HousingRequests) == false) {
            return false;
        }
        HousingRequests rhs = ((HousingRequests) other);
        return (((((((((((((this.floorCharacteristic == rhs.floorCharacteristic)||((this.floorCharacteristic!= null)&&this.floorCharacteristic.equals(rhs.floorCharacteristic)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.preferences == rhs.preferences)||((this.preferences!= null)&&this.preferences.equals(rhs.preferences))))&&((this.priorityNumber == rhs.priorityNumber)||((this.priorityNumber!= null)&&this.priorityNumber.equals(rhs.priorityNumber))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.roommatePreferences == rhs.roommatePreferences)||((this.roommatePreferences!= null)&&this.roommatePreferences.equals(rhs.roommatePreferences))))&&((this.roomCharacteristics == rhs.roomCharacteristics)||((this.roomCharacteristics!= null)&&this.roomCharacteristics.equals(rhs.roomCharacteristics))))&&((this.academicPeriods == rhs.academicPeriods)||((this.academicPeriods!= null)&&this.academicPeriods.equals(rhs.academicPeriods))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of the housing request.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        SUBMITTED("submitted"),
        APPROVED("approved"),
        REJECTED("rejected"),
        WITHDRAWN("withdrawn");
        private final String value;
        private final static Map<String, HousingRequests.Status> CONSTANTS = new HashMap<String, HousingRequests.Status>();

        static {
            for (HousingRequests.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Status(String value) {
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
        public static HousingRequests.Status fromValue(String value) {
            HousingRequests.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
