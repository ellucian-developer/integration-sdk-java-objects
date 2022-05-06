
package com.ellucian.generated.bpapi.ban.course_maintenance.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "firstName",
    "lastName",
    "id",
    "mi",
    "primaryInd"
})
@Generated("jsonschema2pojo")
public class Shrinst {

    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("firstName")
    private String firstName;
    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("lastName")
    private String lastName;
    /**
     * ID
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("mi")
    private String mi;
    /**
     * Lineage reference object : SHRINST_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    @JsonPropertyDescription("Lineage reference object : SHRINST_PRIMARY_IND")
    private String primaryInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First Name
     * <p>
     * 
     * 
     */
    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Shrinst withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last Name
     * <p>
     * 
     * 
     */
    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Shrinst withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * ID
     * <p>
     * 
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
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Shrinst withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("mi")
    public String getMi() {
        return mi;
    }

    /**
     * Middle Name
     * <p>
     * 
     * 
     */
    @JsonProperty("mi")
    public void setMi(String mi) {
        this.mi = mi;
    }

    public Shrinst withMi(String mi) {
        this.mi = mi;
        return this;
    }

    /**
     * Lineage reference object : SHRINST_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public String getPrimaryInd() {
        return primaryInd;
    }

    /**
     * Lineage reference object : SHRINST_PRIMARY_IND
     * 
     */
    @JsonProperty("primaryInd")
    public void setPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
    }

    public Shrinst withPrimaryInd(String primaryInd) {
        this.primaryInd = primaryInd;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Shrinst withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrinst.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("mi");
        sb.append('=');
        sb.append(((this.mi == null)?"<null>":this.mi));
        sb.append(',');
        sb.append("primaryInd");
        sb.append('=');
        sb.append(((this.primaryInd == null)?"<null>":this.primaryInd));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.firstName == null)? 0 :this.firstName.hashCode()));
        result = ((result* 31)+((this.lastName == null)? 0 :this.lastName.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mi == null)? 0 :this.mi.hashCode()));
        result = ((result* 31)+((this.primaryInd == null)? 0 :this.primaryInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrinst) == false) {
            return false;
        }
        Shrinst rhs = ((Shrinst) other);
        return (((((((this.firstName == rhs.firstName)||((this.firstName!= null)&&this.firstName.equals(rhs.firstName)))&&((this.lastName == rhs.lastName)||((this.lastName!= null)&&this.lastName.equals(rhs.lastName))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mi == rhs.mi)||((this.mi!= null)&&this.mi.equals(rhs.mi))))&&((this.primaryInd == rhs.primaryInd)||((this.primaryInd!= null)&&this.primaryInd.equals(rhs.primaryInd))));
    }

}
