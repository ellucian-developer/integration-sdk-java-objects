
package com.ellucian.generated.bpapi.ban.person_experience.v1_0_0;

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
    "id",
    "emprName"
})
@Generated("jsonschema2pojo")
public class PersonExperience100GetRequest {

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Employer Name
     * <p>
     * Lineage reference object : PPREXPE_EMPR_NAME
     * 
     */
    @JsonProperty("emprName")
    @JsonPropertyDescription("Lineage reference object : PPREXPE_EMPR_NAME")
    private String emprName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public PersonExperience100GetRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Employer Name
     * <p>
     * Lineage reference object : PPREXPE_EMPR_NAME
     * 
     */
    @JsonProperty("emprName")
    public String getEmprName() {
        return emprName;
    }

    /**
     * Employer Name
     * <p>
     * Lineage reference object : PPREXPE_EMPR_NAME
     * 
     */
    @JsonProperty("emprName")
    public void setEmprName(String emprName) {
        this.emprName = emprName;
    }

    public PersonExperience100GetRequest withEmprName(String emprName) {
        this.emprName = emprName;
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

    public PersonExperience100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonExperience100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("emprName");
        sb.append('=');
        sb.append(((this.emprName == null)?"<null>":this.emprName));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.emprName == null)? 0 :this.emprName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonExperience100GetRequest) == false) {
            return false;
        }
        PersonExperience100GetRequest rhs = ((PersonExperience100GetRequest) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.emprName == rhs.emprName)||((this.emprName!= null)&&this.emprName.equals(rhs.emprName))));
    }

}
