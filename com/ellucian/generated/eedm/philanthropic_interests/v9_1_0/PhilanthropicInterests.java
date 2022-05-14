
package com.ellucian.generated.eedm.philanthropic_interests.v9_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.ellucian.generated.eedm.academic_catalogs.v6_0.Metadata;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Philanthropic Interests
 * <p>
 * A philanthropic interest identified for a person, organization or prospect.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "constituent",
    "type",
    "area",
    "purpose",
    "level",
    "philanthropyAmount",
    "contributedOn",
    "philanthropyRecipient",
    "organizationType",
    "institutionUnits",
    "startOn",
    "endOn",
    "source",
    "comment"
})
@Generated("jsonschema2pojo")
public class PhilanthropicInterests {

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
     * The global identifier of a philanthropic interest.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of a philanthropic interest.")
    private String id;
    /**
     * Constituent
     * <p>
     * The constituent for whom the interest was identified. Can be a person, organization or a prospect.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("The constituent for whom the interest was identified. Can be a person, organization or a prospect.")
    private Object constituent;
    /**
     * Interest Type
     * <p>
     * The type support the constituent is willing to give to the interest (e.g. volunteer, financial).
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("The type support the constituent is willing to give to the interest (e.g. volunteer, financial).")
    private Object type;
    /**
     * Interest Area
     * <p>
     * A broad area of interest in which a constituent has expressed a willingness to support (e.g. art and culture, athletics, education, etc.).
     * (Required)
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("A broad area of interest in which a constituent has expressed a willingness to support (e.g. art and culture, athletics, education, etc.).")
    private Area area;
    /**
     * Interest Purpose
     * <p>
     * A specific purpose within of an area of interest in which a constituent has expressed a willingness to support (e.g. museums within the area of art and culture).
     * 
     */
    @JsonProperty("purpose")
    @JsonPropertyDescription("A specific purpose within of an area of interest in which a constituent has expressed a willingness to support (e.g. museums within the area of art and culture).")
    private Object purpose;
    /**
     * Interest Level
     * <p>
     * The level of a constituent willingness to support the area of interest.
     * 
     */
    @JsonProperty("level")
    @JsonPropertyDescription("The level of a constituent willingness to support the area of interest.")
    private Object level;
    /**
     * Philanthropy Amount
     * <p>
     * The amount of money the constituent is known to have contributed within the area of interest.
     * 
     */
    @JsonProperty("philanthropyAmount")
    @JsonPropertyDescription("The amount of money the constituent is known to have contributed within the area of interest.")
    private Object philanthropyAmount;
    /**
     * Contributed On
     * <p>
     * The date when the constituent is known to have supported the area of interest.
     * 
     */
    @JsonProperty("contributedOn")
    @JsonPropertyDescription("The date when the constituent is known to have supported the area of interest.")
    private Object contributedOn;
    /**
     * Philanthropy Recipient
     * <p>
     * An organization within the area of interest that the constituent is known to support.
     * 
     */
    @JsonProperty("philanthropyRecipient")
    @JsonPropertyDescription("An organization within the area of interest that the constituent is known to support.")
    private String philanthropyRecipient;
    /**
     * Organization Type
     * <p>
     * The type of organizations that the constituent is interested in supporting.
     * 
     */
    @JsonProperty("organizationType")
    @JsonPropertyDescription("The type of organizations that the constituent is interested in supporting.")
    private Object organizationType;
    /**
     * Institution Units
     * <p>
     * The unit (college, school, division or department) with which the constituent's interest is associated.
     * 
     */
    @JsonProperty("institutionUnits")
    @JsonPropertyDescription("The unit (college, school, division or department) with which the constituent's interest is associated.")
    private List<InstitutionUnit> institutionUnits = new ArrayList<InstitutionUnit>();
    /**
     * Start Date
     * <p>
     * A date on which an interest is first identified.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("A date on which an interest is first identified.")
    private Object startOn;
    /**
     * End Date
     * <p>
     * A date on which an interest becomes invalid.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("A date on which an interest becomes invalid.")
    private Object endOn;
    /**
     * Source
     * <p>
     * The source where the constituent's interest was obtained.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source where the constituent's interest was obtained.")
    private Object source;
    /**
     * Comment
     * <p>
     * Additional information related to the constituent and the area.
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Additional information related to the constituent and the area.")
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

    public PhilanthropicInterests withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of a philanthropic interest.
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
     * The global identifier of a philanthropic interest.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public PhilanthropicInterests withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Constituent
     * <p>
     * The constituent for whom the interest was identified. Can be a person, organization or a prospect.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public Object getConstituent() {
        return constituent;
    }

    /**
     * Constituent
     * <p>
     * The constituent for whom the interest was identified. Can be a person, organization or a prospect.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public PhilanthropicInterests withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    /**
     * Interest Type
     * <p>
     * The type support the constituent is willing to give to the interest (e.g. volunteer, financial).
     * 
     */
    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    /**
     * Interest Type
     * <p>
     * The type support the constituent is willing to give to the interest (e.g. volunteer, financial).
     * 
     */
    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public PhilanthropicInterests withType(Object type) {
        this.type = type;
        return this;
    }

    /**
     * Interest Area
     * <p>
     * A broad area of interest in which a constituent has expressed a willingness to support (e.g. art and culture, athletics, education, etc.).
     * (Required)
     * 
     */
    @JsonProperty("area")
    public Area getArea() {
        return area;
    }

    /**
     * Interest Area
     * <p>
     * A broad area of interest in which a constituent has expressed a willingness to support (e.g. art and culture, athletics, education, etc.).
     * (Required)
     * 
     */
    @JsonProperty("area")
    public void setArea(Area area) {
        this.area = area;
    }

    public PhilanthropicInterests withArea(Area area) {
        this.area = area;
        return this;
    }

    /**
     * Interest Purpose
     * <p>
     * A specific purpose within of an area of interest in which a constituent has expressed a willingness to support (e.g. museums within the area of art and culture).
     * 
     */
    @JsonProperty("purpose")
    public Object getPurpose() {
        return purpose;
    }

    /**
     * Interest Purpose
     * <p>
     * A specific purpose within of an area of interest in which a constituent has expressed a willingness to support (e.g. museums within the area of art and culture).
     * 
     */
    @JsonProperty("purpose")
    public void setPurpose(Object purpose) {
        this.purpose = purpose;
    }

    public PhilanthropicInterests withPurpose(Object purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * Interest Level
     * <p>
     * The level of a constituent willingness to support the area of interest.
     * 
     */
    @JsonProperty("level")
    public Object getLevel() {
        return level;
    }

    /**
     * Interest Level
     * <p>
     * The level of a constituent willingness to support the area of interest.
     * 
     */
    @JsonProperty("level")
    public void setLevel(Object level) {
        this.level = level;
    }

    public PhilanthropicInterests withLevel(Object level) {
        this.level = level;
        return this;
    }

    /**
     * Philanthropy Amount
     * <p>
     * The amount of money the constituent is known to have contributed within the area of interest.
     * 
     */
    @JsonProperty("philanthropyAmount")
    public Object getPhilanthropyAmount() {
        return philanthropyAmount;
    }

    /**
     * Philanthropy Amount
     * <p>
     * The amount of money the constituent is known to have contributed within the area of interest.
     * 
     */
    @JsonProperty("philanthropyAmount")
    public void setPhilanthropyAmount(Object philanthropyAmount) {
        this.philanthropyAmount = philanthropyAmount;
    }

    public PhilanthropicInterests withPhilanthropyAmount(Object philanthropyAmount) {
        this.philanthropyAmount = philanthropyAmount;
        return this;
    }

    /**
     * Contributed On
     * <p>
     * The date when the constituent is known to have supported the area of interest.
     * 
     */
    @JsonProperty("contributedOn")
    public Object getContributedOn() {
        return contributedOn;
    }

    /**
     * Contributed On
     * <p>
     * The date when the constituent is known to have supported the area of interest.
     * 
     */
    @JsonProperty("contributedOn")
    public void setContributedOn(Object contributedOn) {
        this.contributedOn = contributedOn;
    }

    public PhilanthropicInterests withContributedOn(Object contributedOn) {
        this.contributedOn = contributedOn;
        return this;
    }

    /**
     * Philanthropy Recipient
     * <p>
     * An organization within the area of interest that the constituent is known to support.
     * 
     */
    @JsonProperty("philanthropyRecipient")
    public String getPhilanthropyRecipient() {
        return philanthropyRecipient;
    }

    /**
     * Philanthropy Recipient
     * <p>
     * An organization within the area of interest that the constituent is known to support.
     * 
     */
    @JsonProperty("philanthropyRecipient")
    public void setPhilanthropyRecipient(String philanthropyRecipient) {
        this.philanthropyRecipient = philanthropyRecipient;
    }

    public PhilanthropicInterests withPhilanthropyRecipient(String philanthropyRecipient) {
        this.philanthropyRecipient = philanthropyRecipient;
        return this;
    }

    /**
     * Organization Type
     * <p>
     * The type of organizations that the constituent is interested in supporting.
     * 
     */
    @JsonProperty("organizationType")
    public Object getOrganizationType() {
        return organizationType;
    }

    /**
     * Organization Type
     * <p>
     * The type of organizations that the constituent is interested in supporting.
     * 
     */
    @JsonProperty("organizationType")
    public void setOrganizationType(Object organizationType) {
        this.organizationType = organizationType;
    }

    public PhilanthropicInterests withOrganizationType(Object organizationType) {
        this.organizationType = organizationType;
        return this;
    }

    /**
     * Institution Units
     * <p>
     * The unit (college, school, division or department) with which the constituent's interest is associated.
     * 
     */
    @JsonProperty("institutionUnits")
    public List<InstitutionUnit> getInstitutionUnits() {
        return institutionUnits;
    }

    /**
     * Institution Units
     * <p>
     * The unit (college, school, division or department) with which the constituent's interest is associated.
     * 
     */
    @JsonProperty("institutionUnits")
    public void setInstitutionUnits(List<InstitutionUnit> institutionUnits) {
        this.institutionUnits = institutionUnits;
    }

    public PhilanthropicInterests withInstitutionUnits(List<InstitutionUnit> institutionUnits) {
        this.institutionUnits = institutionUnits;
        return this;
    }

    /**
     * Start Date
     * <p>
     * A date on which an interest is first identified.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start Date
     * <p>
     * A date on which an interest is first identified.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public PhilanthropicInterests withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End Date
     * <p>
     * A date on which an interest becomes invalid.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End Date
     * <p>
     * A date on which an interest becomes invalid.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public PhilanthropicInterests withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Source
     * <p>
     * The source where the constituent's interest was obtained.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source where the constituent's interest was obtained.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public PhilanthropicInterests withSource(Object source) {
        this.source = source;
        return this;
    }

    /**
     * Comment
     * <p>
     * Additional information related to the constituent and the area.
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Additional information related to the constituent and the area.
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public PhilanthropicInterests withComment(String comment) {
        this.comment = comment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PhilanthropicInterests.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("constituent");
        sb.append('=');
        sb.append(((this.constituent == null)?"<null>":this.constituent));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("purpose");
        sb.append('=');
        sb.append(((this.purpose == null)?"<null>":this.purpose));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("philanthropyAmount");
        sb.append('=');
        sb.append(((this.philanthropyAmount == null)?"<null>":this.philanthropyAmount));
        sb.append(',');
        sb.append("contributedOn");
        sb.append('=');
        sb.append(((this.contributedOn == null)?"<null>":this.contributedOn));
        sb.append(',');
        sb.append("philanthropyRecipient");
        sb.append('=');
        sb.append(((this.philanthropyRecipient == null)?"<null>":this.philanthropyRecipient));
        sb.append(',');
        sb.append("organizationType");
        sb.append('=');
        sb.append(((this.organizationType == null)?"<null>":this.organizationType));
        sb.append(',');
        sb.append("institutionUnits");
        sb.append('=');
        sb.append(((this.institutionUnits == null)?"<null>":this.institutionUnits));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.purpose == null)? 0 :this.purpose.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.institutionUnits == null)? 0 :this.institutionUnits.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.organizationType == null)? 0 :this.organizationType.hashCode()));
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        result = ((result* 31)+((this.philanthropyAmount == null)? 0 :this.philanthropyAmount.hashCode()));
        result = ((result* 31)+((this.philanthropyRecipient == null)? 0 :this.philanthropyRecipient.hashCode()));
        result = ((result* 31)+((this.contributedOn == null)? 0 :this.contributedOn.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PhilanthropicInterests) == false) {
            return false;
        }
        PhilanthropicInterests rhs = ((PhilanthropicInterests) other);
        return (((((((((((((((((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.purpose == rhs.purpose)||((this.purpose!= null)&&this.purpose.equals(rhs.purpose))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.institutionUnits == rhs.institutionUnits)||((this.institutionUnits!= null)&&this.institutionUnits.equals(rhs.institutionUnits))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.organizationType == rhs.organizationType)||((this.organizationType!= null)&&this.organizationType.equals(rhs.organizationType))))&&((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent))))&&((this.philanthropyAmount == rhs.philanthropyAmount)||((this.philanthropyAmount!= null)&&this.philanthropyAmount.equals(rhs.philanthropyAmount))))&&((this.philanthropyRecipient == rhs.philanthropyRecipient)||((this.philanthropyRecipient!= null)&&this.philanthropyRecipient.equals(rhs.philanthropyRecipient))))&&((this.contributedOn == rhs.contributedOn)||((this.contributedOn!= null)&&this.contributedOn.equals(rhs.contributedOn))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
