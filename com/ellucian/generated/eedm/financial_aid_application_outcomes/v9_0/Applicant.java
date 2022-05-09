
package com.ellucian.generated.eedm.financial_aid_application_outcomes.v9_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Applicant
 * <p>
 * The person who applied for financial aid.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "person",
    "financialAidApplicant"
})
@Generated("jsonschema2pojo")
public class Applicant {

    /**
     * Person
     * <p>
     * A reference link to the common Persons entity for an applicant who is known to the student information system.
     * 
     */
    @JsonProperty("person")
    @JsonPropertyDescription("A reference link to the common Persons entity for an applicant who is known to the student information system.")
    private Object person;
    /**
     * Financial Aid Applicant
     * <p>
     * A reference link to the Financial Aid Applicants entity for an applicant who may not be known to the student information system.
     * 
     */
    @JsonProperty("financialAidApplicant")
    @JsonPropertyDescription("A reference link to the Financial Aid Applicants entity for an applicant who may not be known to the student information system.")
    private Object financialAidApplicant;

    /**
     * Person
     * <p>
     * A reference link to the common Persons entity for an applicant who is known to the student information system.
     * 
     */
    @JsonProperty("person")
    public Object getPerson() {
        return person;
    }

    /**
     * Person
     * <p>
     * A reference link to the common Persons entity for an applicant who is known to the student information system.
     * 
     */
    @JsonProperty("person")
    public void setPerson(Object person) {
        this.person = person;
    }

    public Applicant withPerson(Object person) {
        this.person = person;
        return this;
    }

    /**
     * Financial Aid Applicant
     * <p>
     * A reference link to the Financial Aid Applicants entity for an applicant who may not be known to the student information system.
     * 
     */
    @JsonProperty("financialAidApplicant")
    public Object getFinancialAidApplicant() {
        return financialAidApplicant;
    }

    /**
     * Financial Aid Applicant
     * <p>
     * A reference link to the Financial Aid Applicants entity for an applicant who may not be known to the student information system.
     * 
     */
    @JsonProperty("financialAidApplicant")
    public void setFinancialAidApplicant(Object financialAidApplicant) {
        this.financialAidApplicant = financialAidApplicant;
    }

    public Applicant withFinancialAidApplicant(Object financialAidApplicant) {
        this.financialAidApplicant = financialAidApplicant;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Applicant.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("person");
        sb.append('=');
        sb.append(((this.person == null)?"<null>":this.person));
        sb.append(',');
        sb.append("financialAidApplicant");
        sb.append('=');
        sb.append(((this.financialAidApplicant == null)?"<null>":this.financialAidApplicant));
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
        result = ((result* 31)+((this.person == null)? 0 :this.person.hashCode()));
        result = ((result* 31)+((this.financialAidApplicant == null)? 0 :this.financialAidApplicant.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Applicant) == false) {
            return false;
        }
        Applicant rhs = ((Applicant) other);
        return (((this.person == rhs.person)||((this.person!= null)&&this.person.equals(rhs.person)))&&((this.financialAidApplicant == rhs.financialAidApplicant)||((this.financialAidApplicant!= null)&&this.financialAidApplicant.equals(rhs.financialAidApplicant))));
    }

}
