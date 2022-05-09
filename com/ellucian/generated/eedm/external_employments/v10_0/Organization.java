
package com.ellucian.generated.eedm.external_employments.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Organization
 * <p>
 * The organization associated with the external employment.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "detail",
    "region",
    "country"
})
@Generated("jsonschema2pojo")
public class Organization {

    /**
     * Name
     * <p>
     * The name of the organization.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("The name of the organization.")
    private String name;
    /**
     * Detail
     * <p>
     * The organization associated with the external employment.
     * 
     */
    @JsonProperty("detail")
    @JsonPropertyDescription("The organization associated with the external employment.")
    private Object detail;
    /**
     * Region
     * <p>
     * The region where the organization is located.
     * 
     */
    @JsonProperty("region")
    @JsonPropertyDescription("The region where the organization is located.")
    private String region;
    /**
     * Country
     * <p>
     * The country where the organization is located.
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("The country where the organization is located.")
    private String country;

    /**
     * Name
     * <p>
     * The name of the organization.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * The name of the organization.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Organization withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Detail
     * <p>
     * The organization associated with the external employment.
     * 
     */
    @JsonProperty("detail")
    public Object getDetail() {
        return detail;
    }

    /**
     * Detail
     * <p>
     * The organization associated with the external employment.
     * 
     */
    @JsonProperty("detail")
    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public Organization withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Region
     * <p>
     * The region where the organization is located.
     * 
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * Region
     * <p>
     * The region where the organization is located.
     * 
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    public Organization withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Country
     * <p>
     * The country where the organization is located.
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country
     * <p>
     * The country where the organization is located.
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Organization withCountry(String country) {
        this.country = country;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Organization.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("detail");
        sb.append('=');
        sb.append(((this.detail == null)?"<null>":this.detail));
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
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
        result = ((result* 31)+((this.country == null)? 0 :this.country.hashCode()));
        result = ((result* 31)+((this.detail == null)? 0 :this.detail.hashCode()));
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Organization) == false) {
            return false;
        }
        Organization rhs = ((Organization) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.country == rhs.country)||((this.country!= null)&&this.country.equals(rhs.country))))&&((this.detail == rhs.detail)||((this.detail!= null)&&this.detail.equals(rhs.detail))))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))));
    }

}
