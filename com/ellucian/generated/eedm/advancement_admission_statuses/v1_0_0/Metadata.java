
package com.ellucian.generated.eedm.advancement_admission_statuses.v1_0_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Metadata
 * <p>
 * Metadata about the JSON payload
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "createdBy",
    "createdOn",
    "modifiedBy",
    "modifiedOn"
})
@Generated("jsonschema2pojo")
public class Metadata {

    /**
     * Created By
     * <p>
     * The name of the originator (user or system) of the data. This is informational only, do not use in business logic!
     * 
     */
    @JsonProperty("createdBy")
    @JsonPropertyDescription("The name of the originator (user or system) of the data. This is informational only, do not use in business logic!")
    private String createdBy;
    /**
     * Created On
     * <p>
     * The date and time when the entity instance was created
     * 
     */
    @JsonProperty("createdOn")
    @JsonPropertyDescription("The date and time when the entity instance was created")
    private Object createdOn;
    /**
     * Modified By
     * <p>
     * The name of the modifier (user or system) of the data. This is informational only, do not use in business logic!
     * 
     */
    @JsonProperty("modifiedBy")
    @JsonPropertyDescription("The name of the modifier (user or system) of the data. This is informational only, do not use in business logic!")
    private String modifiedBy;
    /**
     * Modified On
     * <p>
     * The date and time when the entity instance was last modified
     * 
     */
    @JsonProperty("modifiedOn")
    @JsonPropertyDescription("The date and time when the entity instance was last modified")
    private Object modifiedOn;

    /**
     * Created By
     * <p>
     * The name of the originator (user or system) of the data. This is informational only, do not use in business logic!
     * 
     */
    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Created By
     * <p>
     * The name of the originator (user or system) of the data. This is informational only, do not use in business logic!
     * 
     */
    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Metadata withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Created On
     * <p>
     * The date and time when the entity instance was created
     * 
     */
    @JsonProperty("createdOn")
    public Object getCreatedOn() {
        return createdOn;
    }

    /**
     * Created On
     * <p>
     * The date and time when the entity instance was created
     * 
     */
    @JsonProperty("createdOn")
    public void setCreatedOn(Object createdOn) {
        this.createdOn = createdOn;
    }

    public Metadata withCreatedOn(Object createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * Modified By
     * <p>
     * The name of the modifier (user or system) of the data. This is informational only, do not use in business logic!
     * 
     */
    @JsonProperty("modifiedBy")
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * Modified By
     * <p>
     * The name of the modifier (user or system) of the data. This is informational only, do not use in business logic!
     * 
     */
    @JsonProperty("modifiedBy")
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Metadata withModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * Modified On
     * <p>
     * The date and time when the entity instance was last modified
     * 
     */
    @JsonProperty("modifiedOn")
    public Object getModifiedOn() {
        return modifiedOn;
    }

    /**
     * Modified On
     * <p>
     * The date and time when the entity instance was last modified
     * 
     */
    @JsonProperty("modifiedOn")
    public void setModifiedOn(Object modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public Metadata withModifiedOn(Object modifiedOn) {
        this.modifiedOn = modifiedOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("createdOn");
        sb.append('=');
        sb.append(((this.createdOn == null)?"<null>":this.createdOn));
        sb.append(',');
        sb.append("modifiedBy");
        sb.append('=');
        sb.append(((this.modifiedBy == null)?"<null>":this.modifiedBy));
        sb.append(',');
        sb.append("modifiedOn");
        sb.append('=');
        sb.append(((this.modifiedOn == null)?"<null>":this.modifiedOn));
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
        result = ((result* 31)+((this.modifiedBy == null)? 0 :this.modifiedBy.hashCode()));
        result = ((result* 31)+((this.modifiedOn == null)? 0 :this.modifiedOn.hashCode()));
        result = ((result* 31)+((this.createdBy == null)? 0 :this.createdBy.hashCode()));
        result = ((result* 31)+((this.createdOn == null)? 0 :this.createdOn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata) == false) {
            return false;
        }
        Metadata rhs = ((Metadata) other);
        return (((((this.modifiedBy == rhs.modifiedBy)||((this.modifiedBy!= null)&&this.modifiedBy.equals(rhs.modifiedBy)))&&((this.modifiedOn == rhs.modifiedOn)||((this.modifiedOn!= null)&&this.modifiedOn.equals(rhs.modifiedOn))))&&((this.createdBy == rhs.createdBy)||((this.createdBy!= null)&&this.createdBy.equals(rhs.createdBy))))&&((this.createdOn == rhs.createdOn)||((this.createdOn!= null)&&this.createdOn.equals(rhs.createdOn))));
    }

}
