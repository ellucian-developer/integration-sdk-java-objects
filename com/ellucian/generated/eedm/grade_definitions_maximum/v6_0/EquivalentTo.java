
package com.ellucian.generated.eedm.grade_definitions_maximum.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scheme",
    "grade",
    "credit",
    "detail"
})
@Generated("jsonschema2pojo")
public class EquivalentTo {

    /**
     * Grade Scheme
     * <p>
     * A named grouping of grades that can be assigned to students at a given academic level.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("A named grouping of grades that can be assigned to students at a given academic level.")
    private Scheme__1 scheme;
    /**
     * Grade
     * <p>
     * The literal value or numeric range of the grade.
     * 
     */
    @JsonProperty("grade")
    @JsonPropertyDescription("The literal value or numeric range of the grade.")
    private Object grade;
    /**
     * Credit
     * <p>
     * What degree of credit this grade qualifies for.
     * 
     */
    @JsonProperty("credit")
    @JsonPropertyDescription("What degree of credit this grade qualifies for.")
    private Object credit;
    /**
     * Detail
     * <p>
     * A grade scheme item in different grade schemes that is the equivalent to this grade scheme item.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("A grade scheme item in different grade schemes that is the equivalent to this grade scheme item.")
    private Detail__4 detail;

    /**
     * Grade Scheme
     * <p>
     * A named grouping of grades that can be assigned to students at a given academic level.
     * 
     */
    @JsonProperty("scheme")
    public Scheme__1 getScheme() {
        return scheme;
    }

    /**
     * Grade Scheme
     * <p>
     * A named grouping of grades that can be assigned to students at a given academic level.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(Scheme__1 scheme) {
        this.scheme = scheme;
    }

    public EquivalentTo withScheme(Scheme__1 scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Grade
     * <p>
     * The literal value or numeric range of the grade.
     * 
     */
    @JsonProperty("grade")
    public Object getGrade() {
        return grade;
    }

    /**
     * Grade
     * <p>
     * The literal value or numeric range of the grade.
     * 
     */
    @JsonProperty("grade")
    public void setGrade(Object grade) {
        this.grade = grade;
    }

    public EquivalentTo withGrade(Object grade) {
        this.grade = grade;
        return this;
    }

    /**
     * Credit
     * <p>
     * What degree of credit this grade qualifies for.
     * 
     */
    @JsonProperty("credit")
    public Object getCredit() {
        return credit;
    }

    /**
     * Credit
     * <p>
     * What degree of credit this grade qualifies for.
     * 
     */
    @JsonProperty("credit")
    public void setCredit(Object credit) {
        this.credit = credit;
    }

    public EquivalentTo withCredit(Object credit) {
        this.credit = credit;
        return this;
    }

    /**
     * Detail
     * <p>
     * A grade scheme item in different grade schemes that is the equivalent to this grade scheme item.
     * 
     */
    @JsonProperty("detail")
    public Detail__4 getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * A grade scheme item in different grade schemes that is the equivalent to this grade scheme item.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Detail__4 detail) {
        this.detail = detail;
    }

    public EquivalentTo withDetail(Detail__4 detail) {
        this.detail = detail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EquivalentTo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
        sb.append(',');
        sb.append("grade");
        sb.append('=');
        sb.append(((this.grade == null)?"<null>":this.grade));
        sb.append(',');
        sb.append("credit");
        sb.append('=');
        sb.append(((this.credit == null)?"<null>":this.credit));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
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
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.credit == null)? 0 :this.credit.hashCode()));
        result = ((result* 31)+((this.grade == null)? 0 :this.grade.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EquivalentTo) == false) {
            return false;
        }
        EquivalentTo rhs = ((EquivalentTo) other);
        return (((((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail)))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.credit == rhs.credit)||((this.credit!= null)&&this.credit.equals(rhs.credit))))&&((this.grade == rhs.grade)||((this.grade!= null)&&this.grade.equals(rhs.grade))));
    }

}
