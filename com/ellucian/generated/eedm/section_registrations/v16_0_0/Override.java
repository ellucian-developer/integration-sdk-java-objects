
package com.ellucian.generated.eedm.section_registrations.v16_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Override
 * <p>
 * Properties defined for the section that may be overridden for individual registrations.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "academicPeriod",
    "site"
})
@Generated("jsonschema2pojo")
public class Override {

    /**
     * Academic Period
     * <p>
     * The academic period for the registration.
     * 
     */
    @JsonProperty("academicPeriod")
    @JsonPropertyDescription("The academic period for the registration.")
    private Object academicPeriod;
    /**
     * Site
     * <p>
     * The primary location within the organization where a section's meetings will be held for the registration.
     * 
     */
    @JsonProperty("site")
    @JsonPropertyDescription("The primary location within the organization where a section's meetings will be held for the registration.")
    private Object site;

    /**
     * Academic Period
     * <p>
     * The academic period for the registration.
     * 
     */
    @JsonProperty("academicPeriod")
    public Object getAcademicPeriod() {
        return academicPeriod;
    }

    /**
     * Academic Period
     * <p>
     * The academic period for the registration.
     * 
     */
    @JsonProperty("academicPeriod")
    public void setAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
    }

    public Override withAcademicPeriod(Object academicPeriod) {
        this.academicPeriod = academicPeriod;
        return this;
    }

    /**
     * Site
     * <p>
     * The primary location within the organization where a section's meetings will be held for the registration.
     * 
     */
    @JsonProperty("site")
    public Object getSite() {
        return site;
    }

    /**
     * Site
     * <p>
     * The primary location within the organization where a section's meetings will be held for the registration.
     * 
     */
    @JsonProperty("site")
    public void setSite(Object site) {
        this.site = site;
    }

    public Override withSite(Object site) {
        this.site = site;
        return this;
    }

    @java.lang.Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Override.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("academicPeriod");
        sb.append('=');
        sb.append(((this.academicPeriod == null)?"<null>":this.academicPeriod));
        sb.append(',');
        sb.append("site");
        sb.append('=');
        sb.append(((this.site == null)?"<null>":this.site));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @java.lang.Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.site == null)? 0 :this.site.hashCode()));
        result = ((result* 31)+((this.academicPeriod == null)? 0 :this.academicPeriod.hashCode()));
        return result;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Override) == false) {
            return false;
        }
        Override rhs = ((Override) other);
        return (((this.site == rhs.site)||((this.site!= null)&&this.site.equals(rhs.site)))&&((this.academicPeriod == rhs.academicPeriod)||((this.academicPeriod!= null)&&this.academicPeriod.equals(rhs.academicPeriod))));
    }

}
