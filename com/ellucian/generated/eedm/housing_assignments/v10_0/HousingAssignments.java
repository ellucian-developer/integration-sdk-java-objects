
package com.ellucian.generated.eedm.housing_assignments.v10_0;

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
 * Housing Assignments
 * <p>
 * The assignment of a person to institution provided housing.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "room",
    "academicPeriod",
    "startOn",
    "endOn",
    "status",
    "statusDate",
    "request",
    "roomRate",
    "ratePeriod",
    "rateOverride",
    "additionalCharges",
    "residentType",
    "contractNumber",
    "comment"
})
@Generated("jsonschema2pojo")
public class HousingAssignments {

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
     * The global identifier of the housing assignment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the housing assignment.")
    private String id;
    /**
     * Person
     * <p>
     * A reference to the person assigned a room.
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("A reference to the person assigned a room.")
    private Person person;
    /**
     * Room
     * <p>
     * The room assigned to the person.
     * (Required)
     * 
     */
    @JsonProperty("room")
    @JsonPropertyDescription("The room assigned to the person.")
    private Room room;
    /**
     * Academic Period
     * <p>
     * The academic period associated with the housing assignment.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period associated with the housing assignment.")
    private Object academicPeriod;
    /**
     * Start On
     * <p>
     * The date the housing assignment starts.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date the housing assignment starts.")
    private Date startOn;
    /**
     * End On
     * <p>
     * The date the housing assignment ends.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The date the housing assignment ends.")
    private Object endOn;
    /**
     * Status
     * <p>
     * The status of the room assignment.
     * (Required)
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the room assignment.")
    private HousingAssignments.Status status;
    /**
     * Status Date
     * <p>
     * The date when the status was updated.
     * 
     */
    @JsonProperty("statusDate")
    @JsonPropertyDescription("The date when the status was updated.")
    private Object statusDate;
    /**
     * Request
     * <p>
     * A reference to the person's request for housing.
     * 
     */
    @JsonProperty("request")
    @JsonPropertyDescription("A reference to the person's request for housing.")
    private Object request;
    /**
     * Room Rate
     * <p>
     * A reference to the charge to the person for the housing assignment.
     * 
     */
    @JsonProperty("roomRate")
    @JsonPropertyDescription("A reference to the charge to the person for the housing assignment.")
    private Object roomRate;
    /**
     * Rate Period
     * <p>
     * The interval for which rate is defined.
     * 
     */
    @JsonProperty("ratePeriod")
    @JsonPropertyDescription("The interval for which rate is defined.")
    private Object ratePeriod;
    /**
     * Rate Override
     * <p>
     * The override rate for the room assignment.
     * 
     */
    @JsonProperty("rateOverride")
    @JsonPropertyDescription("The override rate for the room assignment.")
    private Object rateOverride;
    /**
     * Additional Charges
     * <p>
     * The additional charges applied to the person for the housing assignment.
     * 
     */
    @JsonProperty("additionalCharges")
    @JsonPropertyDescription("The additional charges applied to the person for the housing assignment.")
    private List<AdditionalCharge> additionalCharges = new ArrayList<AdditionalCharge>();
    /**
     * Resident Type
     * <p>
     * The resident type of the person for this housing assignment.
     * 
     */
    @JsonProperty("residentType")
    @JsonPropertyDescription("The resident type of the person for this housing assignment.")
    private Object residentType;
    /**
     * Contract Number
     * <p>
     * The contract number associated with the housing assignment.
     * 
     */
    @JsonProperty("contractNumber")
    @JsonPropertyDescription("The contract number associated with the housing assignment.")
    private String contractNumber;
    /**
     * Comment
     * <p>
     * The comment associated with the housing assignment.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("The comment associated with the housing assignment.")
    private String comment;

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

    public HousingAssignments withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the housing assignment.
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
     * The global identifier of the housing assignment.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public HousingAssignments withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * A reference to the person assigned a room.
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
     * A reference to the person assigned a room.
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public HousingAssignments withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Room
     * <p>
     * The room assigned to the person.
     * (Required)
     * 
     */
    @JsonProperty("room")
    public Room getRoom() {
        return room;
    }

    /**
     * Room
     * <p>
     * The room assigned to the person.
     * (Required)
     * 
     */
    @JsonProperty("room")
    public void setRoom(Room room) {
        this.room = room;
    }

    public HousingAssignments withRoom(Room room) {
        this.room = room;
        return this;
    }

    /**
     * Academic Period
     * <p>
     * The academic period associated with the housing assignment.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period associated with the housing assignment.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public HousingAssignments withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date the housing assignment starts.
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
     * The date the housing assignment starts.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Date startOn) {
        this.startOn = startOn;
    }

    public HousingAssignments withStartOn(Date startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The date the housing assignment ends.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The date the housing assignment ends.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public HousingAssignments withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the room assignment.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public HousingAssignments.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the room assignment.
     * (Required)
     * 
     */
    @JsonProperty("status")
    public void setStatus(HousingAssignments.Status status) {
        this.status = status;
    }

    public HousingAssignments withStatus(HousingAssignments.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Status Date
     * <p>
     * The date when the status was updated.
     * 
     */
    @JsonProperty("statusDate")
    public Object getStatusDate() {
        return statusDate;
    }

    /**
     * Status Date
     * <p>
     * The date when the status was updated.
     * 
     */
    @JsonProperty("statusDate")
    public void setStatusDate(Object statusDate) {
        this.statusDate = statusDate;
    }

    public HousingAssignments withStatusDate(Object statusDate) {
        this.statusDate = statusDate;
        return this;
    }

    /**
     * Request
     * <p>
     * A reference to the person's request for housing.
     * 
     */
    @JsonProperty("request")
    public Object getRequest() {
        return request;
    }

    /**
     * Request
     * <p>
     * A reference to the person's request for housing.
     * 
     */
    @JsonProperty("request")
    public void setRequest(Object request) {
        this.request = request;
    }

    public HousingAssignments withRequest(Object request) {
        this.request = request;
        return this;
    }

    /**
     * Room Rate
     * <p>
     * A reference to the charge to the person for the housing assignment.
     * 
     */
    @JsonProperty("roomRate")
    public Object getRoomRate() {
        return roomRate;
    }

    /**
     * Room Rate
     * <p>
     * A reference to the charge to the person for the housing assignment.
     * 
     */
    @JsonProperty("roomRate")
    public void setRoomRate(Object roomRate) {
        this.roomRate = roomRate;
    }

    public HousingAssignments withRoomRate(Object roomRate) {
        this.roomRate = roomRate;
        return this;
    }

    /**
     * Rate Period
     * <p>
     * The interval for which rate is defined.
     * 
     */
    @JsonProperty("ratePeriod")
    public Object getRatePeriod() {
        return ratePeriod;
    }

    /**
     * Rate Period
     * <p>
     * The interval for which rate is defined.
     * 
     */
    @JsonProperty("ratePeriod")
    public void setRatePeriod(Object ratePeriod) {
        this.ratePeriod = ratePeriod;
    }

    public HousingAssignments withRatePeriod(Object ratePeriod) {
        this.ratePeriod = ratePeriod;
        return this;
    }

    /**
     * Rate Override
     * <p>
     * The override rate for the room assignment.
     * 
     */
    @JsonProperty("rateOverride")
    public Object getRateOverride() {
        return rateOverride;
    }

    /**
     * Rate Override
     * <p>
     * The override rate for the room assignment.
     * 
     */
    @JsonProperty("rateOverride")
    public void setRateOverride(Object rateOverride) {
        this.rateOverride = rateOverride;
    }

    public HousingAssignments withRateOverride(Object rateOverride) {
        this.rateOverride = rateOverride;
        return this;
    }

    /**
     * Additional Charges
     * <p>
     * The additional charges applied to the person for the housing assignment.
     * 
     */
    @JsonProperty("additionalCharges")
    public List<AdditionalCharge> getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     * Additional Charges
     * <p>
     * The additional charges applied to the person for the housing assignment.
     * 
     */
    @JsonProperty("additionalCharges")
    public void setAdditionalCharges(List<AdditionalCharge> additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    public HousingAssignments withAdditionalCharges(List<AdditionalCharge> additionalCharges) {
        this.additionalCharges = additionalCharges;
        return this;
    }

    /**
     * Resident Type
     * <p>
     * The resident type of the person for this housing assignment.
     * 
     */
    @JsonProperty("residentType")
    public Object getResidentType() {
        return residentType;
    }

    /**
     * Resident Type
     * <p>
     * The resident type of the person for this housing assignment.
     * 
     */
    @JsonProperty("residentType")
    public void setResidentType(Object residentType) {
        this.residentType = residentType;
    }

    public HousingAssignments withResidentType(Object residentType) {
        this.residentType = residentType;
        return this;
    }

    /**
     * Contract Number
     * <p>
     * The contract number associated with the housing assignment.
     * 
     */
    @JsonProperty("contractNumber")
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Contract Number
     * <p>
     * The contract number associated with the housing assignment.
     * 
     */
    @JsonProperty("contractNumber")
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public HousingAssignments withContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
        return this;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the housing assignment.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * The comment associated with the housing assignment.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public HousingAssignments withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HousingAssignments.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("room");
        sb.append('=');
        sb.append(((this.room == null)?"<null>":this.room));
        sb.append(',');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
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
        sb.append("statusDate");
        sb.append('=');
        sb.append(((this.statusDate == null)?"<null>":this.statusDate));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
        sb.append(',');
        sb.append("roomRate");
        sb.append('=');
        sb.append(((this.roomRate == null)?"<null>":this.roomRate));
        sb.append(',');
        sb.append("ratePeriod");
        sb.append('=');
        sb.append(((this.ratePeriod == null)?"<null>":this.ratePeriod));
        sb.append(',');
        sb.append("rateOverride");
        sb.append('=');
        sb.append(((this.rateOverride == null)?"<null>":this.rateOverride));
        sb.append(',');
        sb.append("additionalCharges");
        sb.append('=');
        sb.append(((this.additionalCharges == null)?"<null>":this.additionalCharges));
        sb.append(',');
        sb.append("residentType");
        sb.append('=');
        sb.append(((this.residentType == null)?"<null>":this.residentType));
        sb.append(',');
        sb.append("contractNumber");
        sb.append('=');
        sb.append(((this.contractNumber == null)?"<null>":this.contractNumber));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.statusDate == null)? 0 :this.statusDate.hashCode()));
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.ratePeriod == null)? 0 :this.ratePeriod.hashCode()));
        result = ((result* 31)+((this.contractNumber == null)? 0 :this.contractNumber.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        result = ((result* 31)+((this.room == null)? 0 :this.room.hashCode()));
        result = ((result* 31)+((this.roomRate == null)? 0 :this.roomRate.hashCode()));
        result = ((result* 31)+((this.additionalCharges == null)? 0 :this.additionalCharges.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.rateOverride == null)? 0 :this.rateOverride.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.residentType == null)? 0 :this.residentType.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HousingAssignments) == false) {
            return false;
        }
        HousingAssignments rhs = ((HousingAssignments) other);
        return ((((((((((((((((((this.statusDate == rhs.statusDate)||((this.statusDate!= null)&&this.statusDate.equals(rhs.statusDate)))&&((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.ratePeriod == rhs.ratePeriod)||((this.ratePeriod!= null)&&this.ratePeriod.equals(rhs.ratePeriod))))&&((this.contractNumber == rhs.contractNumber)||((this.contractNumber!= null)&&this.contractNumber.equals(rhs.contractNumber))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))))&&((this.room == rhs.room)||((this.room!= null)&&this.room.equals(rhs.room))))&&((this.roomRate == rhs.roomRate)||((this.roomRate!= null)&&this.roomRate.equals(rhs.roomRate))))&&((this.additionalCharges == rhs.additionalCharges)||((this.additionalCharges!= null)&&this.additionalCharges.equals(rhs.additionalCharges))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.rateOverride == rhs.rateOverride)||((this.rateOverride!= null)&&this.rateOverride.equals(rhs.rateOverride))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.residentType == rhs.residentType)||((this.residentType!= null)&&this.residentType.equals(rhs.residentType))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }


    /**
     * Status
     * <p>
     * The status of the room assignment.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Status {

        PENDING("pending"),
        ASSIGNED("assigned"),
        CANCELED("canceled"),
        TERMINATED("terminated"),
        PRORATED("prorated");
        private final String value;
        private final static Map<String, HousingAssignments.Status> CONSTANTS = new HashMap<String, HousingAssignments.Status>();

        static {
            for (HousingAssignments.Status c: values()) {
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
        public static HousingAssignments.Status fromValue(String value) {
            HousingAssignments.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
