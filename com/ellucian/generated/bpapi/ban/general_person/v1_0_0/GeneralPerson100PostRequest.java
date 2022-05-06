
package com.ellucian.generated.bpapi.ban.general_person.v1_0_0;

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
    "raceCde"
})
@Generated("jsonschema2pojo")
public class GeneralPerson100PostRequest {

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
     * Race
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    @JsonPropertyDescription("Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace")
    private String raceCde;
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

    public GeneralPerson100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Race
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    public String getRaceCde() {
        return raceCde;
    }

    /**
     * Race
     * <p>
     * Lineage reference object : GORPRAC_RACE_CDE, Lookup lineage reference object : gorrace
     * (Required)
     * 
     */
    @JsonProperty("raceCde")
    public void setRaceCde(String raceCde) {
        this.raceCde = raceCde;
    }

    public GeneralPerson100PostRequest withRaceCde(String raceCde) {
        this.raceCde = raceCde;
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

    public GeneralPerson100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralPerson100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("raceCde");
        sb.append('=');
        sb.append(((this.raceCde == null)?"<null>":this.raceCde));
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
        result = ((result* 31)+((this.raceCde == null)? 0 :this.raceCde.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralPerson100PostRequest) == false) {
            return false;
        }
        GeneralPerson100PostRequest rhs = ((GeneralPerson100PostRequest) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.raceCde == rhs.raceCde)||((this.raceCde!= null)&&this.raceCde.equals(rhs.raceCde))));
    }

}
