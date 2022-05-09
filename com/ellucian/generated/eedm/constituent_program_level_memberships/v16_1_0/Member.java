
package com.ellucian.generated.eedm.constituent_program_level_memberships.v16_1_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "constituent",
    "types",
    "memberSince",
    "continuousMembershipStartOn"
})
@Generated("jsonschema2pojo")
public class Member {

    /**
     * Constituent
     * <p>
     * The person or organization who is a participant in the membership.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    @JsonPropertyDescription("The person or organization who is a participant in the membership.")
    private Object constituent;
    /**
     * Types
     * <p>
     * An indication if the member is the primary member of the membership and/or a charter member.
     * 
     */
    @JsonProperty("types")
    @JsonPropertyDescription("An indication if the member is the primary member of the membership and/or a charter member.")
    private List<Type> types = new ArrayList<Type>();
    /**
     * Member Since
     * <p>
     * The earliest date the constituent held a membership in the program regardless of level or gaps in membership.
     * 
     */
    @JsonProperty("memberSince")
    @JsonPropertyDescription("The earliest date the constituent held a membership in the program regardless of level or gaps in membership.")
    private Object memberSince;
    /**
     * Continuous Membership Start On
     * <p>
     * The earliest date from which the constituent’s membership in the program has been active without interruption.
     * 
     */
    @JsonProperty("continuousMembershipStartOn")
    @JsonPropertyDescription("The earliest date from which the constituent\u2019s membership in the program has been active without interruption.")
    private Object continuousMembershipStartOn;

    /**
     * Constituent
     * <p>
     * The person or organization who is a participant in the membership.
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
     * The person or organization who is a participant in the membership.
     * (Required)
     * 
     */
    @JsonProperty("constituent")
    public void setConstituent(Object constituent) {
        this.constituent = constituent;
    }

    public Member withConstituent(Object constituent) {
        this.constituent = constituent;
        return this;
    }

    /**
     * Types
     * <p>
     * An indication if the member is the primary member of the membership and/or a charter member.
     * 
     */
    @JsonProperty("types")
    public List<Type> getTypes() {
        return types;
    }

    /**
     * Types
     * <p>
     * An indication if the member is the primary member of the membership and/or a charter member.
     * 
     */
    @JsonProperty("types")
    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public Member withTypes(List<Type> types) {
        this.types = types;
        return this;
    }

    /**
     * Member Since
     * <p>
     * The earliest date the constituent held a membership in the program regardless of level or gaps in membership.
     * 
     */
    @JsonProperty("memberSince")
    public Object getMemberSince() {
        return memberSince;
    }

    /**
     * Member Since
     * <p>
     * The earliest date the constituent held a membership in the program regardless of level or gaps in membership.
     * 
     */
    @JsonProperty("memberSince")
    public void setMemberSince(Object memberSince) {
        this.memberSince = memberSince;
    }

    public Member withMemberSince(Object memberSince) {
        this.memberSince = memberSince;
        return this;
    }

    /**
     * Continuous Membership Start On
     * <p>
     * The earliest date from which the constituent’s membership in the program has been active without interruption.
     * 
     */
    @JsonProperty("continuousMembershipStartOn")
    public Object getContinuousMembershipStartOn() {
        return continuousMembershipStartOn;
    }

    /**
     * Continuous Membership Start On
     * <p>
     * The earliest date from which the constituent’s membership in the program has been active without interruption.
     * 
     */
    @JsonProperty("continuousMembershipStartOn")
    public void setContinuousMembershipStartOn(Object continuousMembershipStartOn) {
        this.continuousMembershipStartOn = continuousMembershipStartOn;
    }

    public Member withContinuousMembershipStartOn(Object continuousMembershipStartOn) {
        this.continuousMembershipStartOn = continuousMembershipStartOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Member.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("constituent");
        sb.append('=');
        sb.append(((this.constituent == null)?"<null>":this.constituent));
        sb.append(',');
        sb.append("types");
        sb.append('=');
        sb.append(((this.types == null)?"<null>":this.types));
        sb.append(',');
        sb.append("memberSince");
        sb.append('=');
        sb.append(((this.memberSince == null)?"<null>":this.memberSince));
        sb.append(',');
        sb.append("continuousMembershipStartOn");
        sb.append('=');
        sb.append(((this.continuousMembershipStartOn == null)?"<null>":this.continuousMembershipStartOn));
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
        result = ((result* 31)+((this.memberSince == null)? 0 :this.memberSince.hashCode()));
        result = ((result* 31)+((this.types == null)? 0 :this.types.hashCode()));
        result = ((result* 31)+((this.constituent == null)? 0 :this.constituent.hashCode()));
        result = ((result* 31)+((this.continuousMembershipStartOn == null)? 0 :this.continuousMembershipStartOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Member) == false) {
            return false;
        }
        Member rhs = ((Member) other);
        return (((((this.memberSince == rhs.memberSince)||((this.memberSince!= null)&&this.memberSince.equals(rhs.memberSince)))&&((this.types == rhs.types)||((this.types!= null)&&this.types.equals(rhs.types))))&&((this.constituent == rhs.constituent)||((this.constituent!= null)&&this.constituent.equals(rhs.constituent))))&&((this.continuousMembershipStartOn == rhs.continuousMembershipStartOn)||((this.continuousMembershipStartOn!= null)&&this.continuousMembershipStartOn.equals(rhs.continuousMembershipStartOn))));
    }

}
