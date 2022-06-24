
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_2_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "email",
    "relationship",
    "reference",
    "safeguardingConcerns",
    "refereeType"
})
@Generated("jsonschema2pojo")
public class Reference {

    /**
     * ID
     * <p>
     * A unique reference ID.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A unique reference ID.")
    private String id;
    /**
     * Name
     * <p>
     * The referee’s name.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The referee\u2019s name.")
    private String name;
    /**
     * Email
     * <p>
     * The referee’s email.
     * 
     */
    @JsonProperty("email")
    @JsonPropertyDescription("The referee\u2019s email.")
    private String email;
    /**
     * Relationship
     * <p>
     * The candidate’s description of their relationship with the referee.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("The candidate\u2019s description of their relationship with the referee.")
    private String relationship;
    /**
     * Reference
     * <p>
     * The reference content provided by the referee.
     * 
     */
    @JsonProperty("reference")
    @JsonPropertyDescription("The reference content provided by the referee.")
    private String reference;
    /**
     * Safeguarding Concerns
     * <p>
     * Indicates whether the referee flagged safeguarding concerns about this candidate.
     * 
     */
    @JsonProperty("safeguardingConcerns")
    @JsonPropertyDescription("Indicates whether the referee flagged safeguarding concerns about this candidate.")
    private String safeguardingConcerns;
    /**
     * Referee Type
     * <p>
     * The referee’s relationship to the candidate.
     * 
     */
    @JsonProperty("refereeType")
    @JsonPropertyDescription("The referee\u2019s relationship to the candidate.")
    private String refereeType;

    /**
     * ID
     * <p>
     * A unique reference ID.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * A unique reference ID.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Reference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Name
     * <p>
     * The referee’s name.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The referee’s name.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Reference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Email
     * <p>
     * The referee’s email.
     * 
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * Email
     * <p>
     * The referee’s email.
     * 
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Reference withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Relationship
     * <p>
     * The candidate’s description of their relationship with the referee.
     * 
     */
    @JsonProperty("relationship")
    public String getRelationship() {
        return relationship;
    }

    /**
     * Relationship
     * <p>
     * The candidate’s description of their relationship with the referee.
     * 
     */
    @JsonProperty("relationship")
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Reference withRelationship(String relationship) {
        this.relationship = relationship;
        return this;
    }

    /**
     * Reference
     * <p>
     * The reference content provided by the referee.
     * 
     */
    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    /**
     * Reference
     * <p>
     * The reference content provided by the referee.
     * 
     */
    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    public Reference withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Safeguarding Concerns
     * <p>
     * Indicates whether the referee flagged safeguarding concerns about this candidate.
     * 
     */
    @JsonProperty("safeguardingConcerns")
    public String getSafeguardingConcerns() {
        return safeguardingConcerns;
    }

    /**
     * Safeguarding Concerns
     * <p>
     * Indicates whether the referee flagged safeguarding concerns about this candidate.
     * 
     */
    @JsonProperty("safeguardingConcerns")
    public void setSafeguardingConcerns(String safeguardingConcerns) {
        this.safeguardingConcerns = safeguardingConcerns;
    }

    public Reference withSafeguardingConcerns(String safeguardingConcerns) {
        this.safeguardingConcerns = safeguardingConcerns;
        return this;
    }

    /**
     * Referee Type
     * <p>
     * The referee’s relationship to the candidate.
     * 
     */
    @JsonProperty("refereeType")
    public String getRefereeType() {
        return refereeType;
    }

    /**
     * Referee Type
     * <p>
     * The referee’s relationship to the candidate.
     * 
     */
    @JsonProperty("refereeType")
    public void setRefereeType(String refereeType) {
        this.refereeType = refereeType;
    }

    public Reference withRefereeType(String refereeType) {
        this.refereeType = refereeType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("relationship");
        sb.append('=');
        sb.append(((this.relationship == null)?"<null>":this.relationship));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("safeguardingConcerns");
        sb.append('=');
        sb.append(((this.safeguardingConcerns == null)?"<null>":this.safeguardingConcerns));
        sb.append(',');
        sb.append("refereeType");
        sb.append('=');
        sb.append(((this.refereeType == null)?"<null>":this.refereeType));
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
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.safeguardingConcerns == null)? 0 :this.safeguardingConcerns.hashCode()));
        result = ((result* 31)+((this.refereeType == null)? 0 :this.refereeType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.relationship == null)? 0 :this.relationship.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Reference) == false) {
            return false;
        }
        Reference rhs = ((Reference) other);
        return ((((((((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference)))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.safeguardingConcerns == rhs.safeguardingConcerns)||((this.safeguardingConcerns!= null)&&this.safeguardingConcerns.equals(rhs.safeguardingConcerns))))&&((this.refereeType == rhs.refereeType)||((this.refereeType!= null)&&this.refereeType.equals(rhs.refereeType))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
