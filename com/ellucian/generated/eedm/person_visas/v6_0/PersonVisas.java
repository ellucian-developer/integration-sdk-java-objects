
package com.ellucian.generated.eedm.person_visas.v6_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Person Visas
 * <p>
 * Visas issued to a person.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "person",
    "visaType",
    "visaId",
    "status",
    "requestedOn",
    "issuedOn",
    "expiresOn",
    "entries"
})
@Generated("jsonschema2pojo")
public class PersonVisas {

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
     * A global identifier of a visa record
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A global identifier of a visa record")
    private String id;
    /**
     * Person
     * <p>
     * The person to whom the visa was issued
     * (Required)
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("The person to whom the visa was issued")
    private Person person;
    /**
     * Visa Type
     * <p>
     * A type of a visa
     * (Required)
     * 
     */
    @JsonProperty("visaType")
    @JsonPropertyDescription("A type of a visa")
    private VisaType visaType;
    /**
     * Visa Identifier
     * <p>
     * The identifier of the visa
     * 
     */
    @JsonProperty("visaId")
    @JsonPropertyDescription("The identifier of the visa")
    private String visaId;
    /**
     * Status
     * <p>
     * Visa status
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Visa status")
    private Object status;
    /**
     * Date Requested
     * <p>
     * The date when the visa was requested
     * 
     */
    @JsonProperty("requestedOn")
    @JsonPropertyDescription("The date when the visa was requested")
    private Object requestedOn;
    /**
     * Date Issued
     * <p>
     * The date when the visa was issued
     * 
     */
    @JsonProperty("issuedOn")
    @JsonPropertyDescription("The date when the visa was issued")
    private Object issuedOn;
    /**
     * Expires On
     * <p>
     * The visa expiration date
     * 
     */
    @JsonProperty("expiresOn")
    @JsonPropertyDescription("The visa expiration date")
    private Object expiresOn;
    /**
     * Entries
     * <p>
     * Entries into the country on this visa
     * 
     */
    @JsonProperty("entries")
    @JsonPropertyDescription("Entries into the country on this visa")
    private List<Entry> entries = new ArrayList<Entry>();

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

    public PersonVisas withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * A global identifier of a visa record
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
     * A global identifier of a visa record
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PersonVisas withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Person
     * <p>
     * The person to whom the visa was issued
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
     * The person to whom the visa was issued
     * (Required)
     * 
     */
    @JsonProperty("person")
    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonVisas withPerson(Person person) {
        this.person = person;
        return this;
    }

    /**
     * Visa Type
     * <p>
     * A type of a visa
     * (Required)
     * 
     */
    @JsonProperty("visaType")
    public VisaType getVisaType() {
        return visaType;
    }

    /**
     * Visa Type
     * <p>
     * A type of a visa
     * (Required)
     * 
     */
    @JsonProperty("visaType")
    public void setVisaType(VisaType visaType) {
        this.visaType = visaType;
    }

    public PersonVisas withVisaType(VisaType visaType) {
        this.visaType = visaType;
        return this;
    }

    /**
     * Visa Identifier
     * <p>
     * The identifier of the visa
     * 
     */
    @JsonProperty("visaId")
    public String getVisaId() {
        return visaId;
    }

    /**
     * Visa Identifier
     * <p>
     * The identifier of the visa
     * 
     */
    @JsonProperty("visaId")
    public void setVisaId(String visaId) {
        this.visaId = visaId;
    }

    public PersonVisas withVisaId(String visaId) {
        this.visaId = visaId;
        return this;
    }

    /**
     * Status
     * <p>
     * Visa status
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Visa status
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public PersonVisas withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Date Requested
     * <p>
     * The date when the visa was requested
     * 
     */
    @JsonProperty("requestedOn")
    public Object getRequestedOn() {
        return requestedOn;
    }

    /**
     * Date Requested
     * <p>
     * The date when the visa was requested
     * 
     */
    @JsonProperty("requestedOn")
    public void setRequestedOn(Object requestedOn) {
        this.requestedOn = requestedOn;
    }

    public PersonVisas withRequestedOn(Object requestedOn) {
        this.requestedOn = requestedOn;
        return this;
    }

    /**
     * Date Issued
     * <p>
     * The date when the visa was issued
     * 
     */
    @JsonProperty("issuedOn")
    public Object getIssuedOn() {
        return issuedOn;
    }

    /**
     * Date Issued
     * <p>
     * The date when the visa was issued
     * 
     */
    @JsonProperty("issuedOn")
    public void setIssuedOn(Object issuedOn) {
        this.issuedOn = issuedOn;
    }

    public PersonVisas withIssuedOn(Object issuedOn) {
        this.issuedOn = issuedOn;
        return this;
    }

    /**
     * Expires On
     * <p>
     * The visa expiration date
     * 
     */
    @JsonProperty("expiresOn")
    public Object getExpiresOn() {
        return expiresOn;
    }

    /**
     * Expires On
     * <p>
     * The visa expiration date
     * 
     */
    @JsonProperty("expiresOn")
    public void setExpiresOn(Object expiresOn) {
        this.expiresOn = expiresOn;
    }

    public PersonVisas withExpiresOn(Object expiresOn) {
        this.expiresOn = expiresOn;
        return this;
    }

    /**
     * Entries
     * <p>
     * Entries into the country on this visa
     * 
     */
    @JsonProperty("entries")
    public List<Entry> getEntries() {
        return entries;
    }

    /**
     * Entries
     * <p>
     * Entries into the country on this visa
     * 
     */
    @JsonProperty("entries")
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public PersonVisas withEntries(List<Entry> entries) {
        this.entries = entries;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonVisas.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("visaType");
        sb.append('=');
        sb.append(((this.visaType == null)?"<null>":this.visaType));
        sb.append(',');
        sb.append("visaId");
        sb.append('=');
        sb.append(((this.visaId == null)?"<null>":this.visaId));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("requestedOn");
        sb.append('=');
        sb.append(((this.requestedOn == null)?"<null>":this.requestedOn));
        sb.append(',');
        sb.append("issuedOn");
        sb.append('=');
        sb.append(((this.issuedOn == null)?"<null>":this.issuedOn));
        sb.append(',');
        sb.append("expiresOn");
        sb.append('=');
        sb.append(((this.expiresOn == null)?"<null>":this.expiresOn));
        sb.append(',');
        sb.append("entries");
        sb.append('=');
        sb.append(((this.entries == null)?"<null>":this.entries));
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
        result = ((result* 31)+((this.entries == null)? 0 :this.entries.hashCode()));
        result = ((result* 31)+((this.visaId == null)? 0 :this.visaId.hashCode()));
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.requestedOn == null)? 0 :this.requestedOn.hashCode()));
        result = ((result* 31)+((this.expiresOn == null)? 0 :this.expiresOn.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.visaType == null)? 0 :this.visaType.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.issuedOn == null)? 0 :this.issuedOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonVisas) == false) {
            return false;
        }
        PersonVisas rhs = ((PersonVisas) other);
        return (((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.entries == rhs.entries)||((this.entries!= null)&&this.entries.equals(rhs.entries))))&&((this.visaId == rhs.visaId)||((this.visaId!= null)&&this.visaId.equals(rhs.visaId))))&&((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person))))&&((this.requestedOn == rhs.requestedOn)||((this.requestedOn!= null)&&this.requestedOn.equals(rhs.requestedOn))))&&((this.expiresOn == rhs.expiresOn)||((this.expiresOn!= null)&&this.expiresOn.equals(rhs.expiresOn))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.visaType == rhs.visaType)||((this.visaType!= null)&&this.visaType.equals(rhs.visaType))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.issuedOn == rhs.issuedOn)||((this.issuedOn!= null)&&this.issuedOn.equals(rhs.issuedOn))));
    }

}
