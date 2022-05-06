
package com.ellucian.generated.bpapi.ban.faculty_assignment.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "keyblocTermCodeEff"
})
@Generated("jsonschema2pojo")
public class FacultyAssignment100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblocTermCodeEff")
    private String keyblocTermCodeEff;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FacultyAssignment100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblocTermCodeEff")
    public String getKeyblocTermCodeEff() {
        return keyblocTermCodeEff;
    }

    @JsonProperty("keyblocTermCodeEff")
    public void setKeyblocTermCodeEff(String keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
    }

    public FacultyAssignment100QapiPost withKeyblocTermCodeEff(String keyblocTermCodeEff) {
        this.keyblocTermCodeEff = keyblocTermCodeEff;
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

    public FacultyAssignment100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FacultyAssignment100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblocTermCodeEff");
        sb.append('=');
        sb.append(((this.keyblocTermCodeEff == null)?"<null>":this.keyblocTermCodeEff));
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
        result = ((result* 31)+((this.keyblocTermCodeEff == null)? 0 :this.keyblocTermCodeEff.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FacultyAssignment100QapiPost) == false) {
            return false;
        }
        FacultyAssignment100QapiPost rhs = ((FacultyAssignment100QapiPost) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblocTermCodeEff == rhs.keyblocTermCodeEff)||((this.keyblocTermCodeEff!= null)&&this.keyblocTermCodeEff.equals(rhs.keyblocTermCodeEff))));
    }

}
