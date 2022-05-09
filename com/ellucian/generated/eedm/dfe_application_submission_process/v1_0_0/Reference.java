
package com.ellucian.generated.eedm.dfe_application_submission_process.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "email",
    "relationship",
    "reference"
})
@Generated("jsonschema2pojo")
public class Reference {

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
     * The referee’s relationship to the candidate.
     * 
     */
    @JsonProperty("relationship")
    @JsonPropertyDescription("The referee\u2019s relationship to the candidate.")
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
     * The referee’s relationship to the candidate.
     * 
     */
    @JsonProperty("relationship")
    public String getRelationship() {
        return relationship;
    }

    /**
     * Relationship
     * <p>
     * The referee’s relationship to the candidate.
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.reference == null)? 0 :this.reference.hashCode()));
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
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.reference == rhs.reference)||((this.reference!= null)&&this.reference.equals(rhs.reference))))&&((this.relationship == rhs.relationship)||((this.relationship!= null)&&this.relationship.equals(rhs.relationship))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))));
    }

}
