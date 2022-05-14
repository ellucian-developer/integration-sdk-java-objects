
package com.ellucian.generated.eedm.contributions.v9_0;

import java.util.ArrayList;
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
 * Contributions
 * <p>
 * The contributions (gifts, pledges, pledge payments, etc.) made to the institution.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "type",
    "activityDates",
    "proposal",
    "amounts",
    "anonymity",
    "reference",
    "allocations",
    "specifics",
    "solicitors"
})
@Generated("jsonschema2pojo")
public class Contributions {

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
     * The global identifier of the contributions.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the contributions.")
    private String id;
    /**
     * Type
     * <p>
     * The type of the contribution (e.g. gift, pledge).
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type of the contribution (e.g. gift, pledge).")
    private Contributions.Type type;
    /**
     * Activity Dates
     * <p>
     * A list of event dates associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("activityDates")
    @JsonPropertyDescription("A list of event dates associated with the contribution.")
    private List<ActivityDate> activityDates = new ArrayList<ActivityDate>();
    /**
     * Proposal
     * <p>
     * The proposal associated with the contribution.
     * 
     */
    @JsonProperty("proposal")
    @JsonPropertyDescription("The proposal associated with the contribution.")
    private Object proposal;
    /**
     * Amounts
     * <p>
     * The monetary amounts associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amounts")
    @JsonPropertyDescription("The monetary amounts associated with the contribution.")
    private Amounts amounts;
    /**
     * anonymity
     * <p>
     * The level of anonymity that should be applied to the contribution.
     * 
     */
    @JsonProperty("anonymity")
    @JsonPropertyDescription("The level of anonymity that should be applied to the contribution.")
    private Object anonymity;
    /**
     * Reference
     * <p>
     * Information on a related contribution.
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("Information on a related contribution.")
    private Object reference;
    /**
     * Allocations
     * <p>
     * Allocation of the contribution among donors to assign donation credit and to map to designations.
     * (Required)
     * 
     */
    @JsonProperty("allocations")
    @JsonPropertyDescription("Allocation of the contribution among donors to assign donation credit and to map to designations.")
    private List<Allocation> allocations = new ArrayList<Allocation>();
    /**
     * Specifics
     * <p>
     * Attributes that are specific to the type of contribution.
     * 
     */
    @JsonProperty("specifics")
    @JsonPropertyDescription("Attributes that are specific to the type of contribution.")
    private Object specifics;
    /**
     * Solicitors
     * <p>
     * The people, teams, or organizations responsible for generating the contribution
     * 
     */
    @JsonProperty("solicitors")
    @JsonPropertyDescription("The people, teams, or organizations responsible for generating the contribution")
    private List<Solicitor> solicitors = new ArrayList<Solicitor>();

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

    public Contributions withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the contributions.
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
     * The global identifier of the contributions.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Contributions withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Type
     * <p>
     * The type of the contribution (e.g. gift, pledge).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Contributions.Type getType() {
        return type;
    }

    /**
     * Type
     * <p>
     * The type of the contribution (e.g. gift, pledge).
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Contributions.Type type) {
        this.type = type;
    }

    public Contributions withType(Contributions.Type type) {
        this.type = type;
        return this;
    }

    /**
     * Activity Dates
     * <p>
     * A list of event dates associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("activityDates")
    public List<ActivityDate> getActivityDates() {
        return activityDates;
    }

    /**
     * Activity Dates
     * <p>
     * A list of event dates associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("activityDates")
    public void setActivityDates(List<ActivityDate> activityDates) {
        this.activityDates = activityDates;
    }

    public Contributions withActivityDates(List<ActivityDate> activityDates) {
        this.activityDates = activityDates;
        return this;
    }

    /**
     * Proposal
     * <p>
     * The proposal associated with the contribution.
     * 
     */
    @JsonProperty("proposal")
    public Object getProposal() {
        return proposal;
    }

    /**
     * Proposal
     * <p>
     * The proposal associated with the contribution.
     * 
     */
    @JsonProperty("proposal")
    public void setProposal(Object proposal) {
        this.proposal = proposal;
    }

    public Contributions withProposal(Object proposal) {
        this.proposal = proposal;
        return this;
    }

    /**
     * Amounts
     * <p>
     * The monetary amounts associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amounts")
    public Amounts getAmounts() {
        return amounts;
    }

    /**
     * Amounts
     * <p>
     * The monetary amounts associated with the contribution.
     * (Required)
     * 
     */
    @JsonProperty("amounts")
    public void setAmounts(Amounts amounts) {
        this.amounts = amounts;
    }

    public Contributions withAmounts(Amounts amounts) {
        this.amounts = amounts;
        return this;
    }

    /**
     * anonymity
     * <p>
     * The level of anonymity that should be applied to the contribution.
     * 
     */
    @JsonProperty("anonymity")
    public Object getAnonymity() {
        return anonymity;
    }

    /**
     * anonymity
     * <p>
     * The level of anonymity that should be applied to the contribution.
     * 
     */
    @JsonProperty("anonymity")
    public void setAnonymity(Object anonymity) {
        this.anonymity = anonymity;
    }

    public Contributions withAnonymity(Object anonymity) {
        this.anonymity = anonymity;
        return this;
    }

    /**
     * Reference
     * <p>
     * Information on a related contribution.
     * 
     */
    @JsonProperty("reference")
    public Object getReference() {
        return reference;
    }

    /**
     * Reference
     * <p>
     * Information on a related contribution.
     * 
     */
    @JsonProperty("reference")
    public void setReference(Object reference) {
        this.reference = reference;
    }

    public Contributions withReference(Object reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Allocations
     * <p>
     * Allocation of the contribution among donors to assign donation credit and to map to designations.
     * (Required)
     * 
     */
    @JsonProperty("allocations")
    public List<Allocation> getAllocations() {
        return allocations;
    }

    /**
     * Allocations
     * <p>
     * Allocation of the contribution among donors to assign donation credit and to map to designations.
     * (Required)
     * 
     */
    @JsonProperty("allocations")
    public void setAllocations(List<Allocation> allocations) {
        this.allocations = allocations;
    }

    public Contributions withAllocations(List<Allocation> allocations) {
        this.allocations = allocations;
        return this;
    }

    /**
     * Specifics
     * <p>
     * Attributes that are specific to the type of contribution.
     * 
     */
    @JsonProperty("specifics")
    public Object getSpecifics() {
        return specifics;
    }

    /**
     * Specifics
     * <p>
     * Attributes that are specific to the type of contribution.
     * 
     */
    @JsonProperty("specifics")
    public void setSpecifics(Object specifics) {
        this.specifics = specifics;
    }

    public Contributions withSpecifics(Object specifics) {
        this.specifics = specifics;
        return this;
    }

    /**
     * Solicitors
     * <p>
     * The people, teams, or organizations responsible for generating the contribution
     * 
     */
    @JsonProperty("solicitors")
    public List<Solicitor> getSolicitors() {
        return solicitors;
    }

    /**
     * Solicitors
     * <p>
     * The people, teams, or organizations responsible for generating the contribution
     * 
     */
    @JsonProperty("solicitors")
    public void setSolicitors(List<Solicitor> solicitors) {
        this.solicitors = solicitors;
    }

    public Contributions withSolicitors(List<Solicitor> solicitors) {
        this.solicitors = solicitors;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Contributions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("activityDates");
        sb.append('=');
        sb.append(((this.activityDates == null)?"<null>":this.activityDates));
        sb.append(',');
        sb.append("proposal");
        sb.append('=');
        sb.append(((this.proposal == null)?"<null>":this.proposal));
        sb.append(',');
        sb.append("amounts");
        sb.append('=');
        sb.append(((this.amounts == null)?"<null>":this.amounts));
        sb.append(',');
        sb.append("anonymity");
        sb.append('=');
        sb.append(((this.anonymity == null)?"<null>":this.anonymity));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("allocations");
        sb.append('=');
        sb.append(((this.allocations == null)?"<null>":this.allocations));
        sb.append(',');
        sb.append("specifics");
        sb.append('=');
        sb.append(((this.specifics == null)?"<null>":this.specifics));
        sb.append(',');
        sb.append("solicitors");
        sb.append('=');
        sb.append(((this.solicitors == null)?"<null>":this.solicitors));
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
        result = ((result* 31)+((this.proposal == null)? 0 :this.proposal.hashCode()));
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.amounts == null)? 0 :this.amounts.hashCode()));
        result = ((result* 31)+((this.allocations == null)? 0 :this.allocations.hashCode()));
        result = ((result* 31)+((this.anonymity == null)? 0 :this.anonymity.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.activityDates == null)? 0 :this.activityDates.hashCode()));
        result = ((result* 31)+((this.solicitors == null)? 0 :this.solicitors.hashCode()));
        result = ((result* 31)+((this.specifics == null)? 0 :this.specifics.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contributions) == false) {
            return false;
        }
        Contributions rhs = ((Contributions) other);
        return ((((((((((((this.proposal == rhs.proposal)||((this.proposal!= null)&&this.proposal.equals(rhs.proposal)))&&((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference))))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.amounts == rhs.amounts)||((this.amounts!= null)&&this.amounts.equals(rhs.amounts))))&&((this.allocations == rhs.allocations)||((this.allocations!= null)&&this.allocations.equals(rhs.allocations))))&&((this.anonymity == rhs.anonymity)||((this.anonymity!= null)&&this.anonymity.equals(rhs.anonymity))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.activityDates == rhs.activityDates)||((this.activityDates!= null)&&this.activityDates.equals(rhs.activityDates))))&&((this.solicitors == rhs.solicitors)||((this.solicitors!= null)&&this.solicitors.equals(rhs.solicitors))))&&((this.specifics == rhs.specifics)||((this.specifics!= null)&&this.specifics.equals(rhs.specifics))));
    }


    /**
     * Type
     * <p>
     * The type of the contribution (e.g. gift, pledge).
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Type {

        GIFT("gift"),
        PLEDGE("pledge"),
        PLEDGE_PAYMENT("pledgePayment"),
        RECURRING_CONTRIBUTION("recurringContribution"),
        MATCHING_GIFT("matchingGift"),
        PLANNED_GIFT("plannedGift"),
        REALIZED_GIFT("realizedGift");
        private final String value;
        private final static Map<String, Contributions.Type> CONSTANTS = new HashMap<String, Contributions.Type>();

        static {
            for (Contributions.Type c: values()) {
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
        public static Contributions.Type fromValue(String value) {
            Contributions.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
