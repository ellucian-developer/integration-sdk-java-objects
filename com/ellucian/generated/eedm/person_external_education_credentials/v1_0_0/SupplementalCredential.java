
package com.ellucian.generated.eedm.person_external_education_credentials.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "credential",
    "earnedOn"
})
@Generated("jsonschema2pojo")
public class SupplementalCredential {

    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) the person earned at the institution.
     * (Required)
     * 
     */
    @JsonProperty("credential")
    @JsonPropertyDescription("The academic credential (degree, diploma, etc.) the person earned at the institution.")
    private Credential__1 credential;
    /**
     * Earned On
     * <p>
     * The date when the person earned the credential.
     * 
     */
    @JsonProperty("earnedOn")
    @JsonPropertyDescription("The date when the person earned the credential.")
    private Object earnedOn;

    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) the person earned at the institution.
     * (Required)
     * 
     */
    @JsonProperty("credential")
    public Credential__1 getCredential() {
        return credential;
    }

    /**
     * Credential
     * <p>
     * The academic credential (degree, diploma, etc.) the person earned at the institution.
     * (Required)
     * 
     */
    @JsonProperty("credential")
    public void setCredential(Credential__1 credential) {
        this.credential = credential;
    }

    public SupplementalCredential withCredential(Credential__1 credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Earned On
     * <p>
     * The date when the person earned the credential.
     * 
     */
    @JsonProperty("earnedOn")
    public Object getEarnedOn() {
        return earnedOn;
    }

    /**
     * Earned On
     * <p>
     * The date when the person earned the credential.
     * 
     */
    @JsonProperty("earnedOn")
    public void setEarnedOn(Object earnedOn) {
        this.earnedOn = earnedOn;
    }

    public SupplementalCredential withEarnedOn(Object earnedOn) {
        this.earnedOn = earnedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SupplementalCredential.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("credential");
        sb.append('=');
        sb.append(((this.credential == null)?"<null>":this.credential));
        sb.append(',');
        sb.append("earnedOn");
        sb.append('=');
        sb.append(((this.earnedOn == null)?"<null>":this.earnedOn));
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
        result = ((result* 31)+((this.credential == null)? 0 :this.credential.hashCode()));
        result = ((result* 31)+((this.earnedOn == null)? 0 :this.earnedOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SupplementalCredential) == false) {
            return false;
        }
        SupplementalCredential rhs = ((SupplementalCredential) other);
        return (((this.credential == rhs.credential)||((this.credential!= null)&&this.credential.equals(rhs.credential)))&&((this.earnedOn == rhs.earnedOn)||((this.earnedOn!= null)&&this.earnedOn.equals(rhs.earnedOn))));
    }

}
