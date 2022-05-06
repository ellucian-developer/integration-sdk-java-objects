
package com.ellucian.generated.bpapi.ban.course_registration_class_and_level_restrictions.v1_0_0;

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
    "clasCode",
    "classDescription"
})
@Generated("jsonschema2pojo")
public class Scrrcl__2 {

    /**
     * Class
     * <p>
     * Lineage reference object : SCRRCLS_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    @JsonPropertyDescription("Lineage reference object : SCRRCLS_CLAS_CODE, Lookup lineage reference object : stvclas")
    private String clasCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("classDescription")
    private String classDescription;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Class
     * <p>
     * Lineage reference object : SCRRCLS_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    public String getClasCode() {
        return clasCode;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SCRRCLS_CLAS_CODE, Lookup lineage reference object : stvclas
     * 
     */
    @JsonProperty("clasCode")
    public void setClasCode(String clasCode) {
        this.clasCode = clasCode;
    }

    public Scrrcl__2 withClasCode(String clasCode) {
        this.clasCode = clasCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("classDescription")
    public String getClassDescription() {
        return classDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("classDescription")
    public void setClassDescription(String classDescription) {
        this.classDescription = classDescription;
    }

    public Scrrcl__2 withClassDescription(String classDescription) {
        this.classDescription = classDescription;
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

    public Scrrcl__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrrcl__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clasCode");
        sb.append('=');
        sb.append(((this.clasCode == null)?"<null>":this.clasCode));
        sb.append(',');
        sb.append("classDescription");
        sb.append('=');
        sb.append(((this.classDescription == null)?"<null>":this.classDescription));
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
        result = ((result* 31)+((this.clasCode == null)? 0 :this.clasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.classDescription == null)? 0 :this.classDescription.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrrcl__2) == false) {
            return false;
        }
        Scrrcl__2 rhs = ((Scrrcl__2) other);
        return ((((this.clasCode == rhs.clasCode)||((this.clasCode!= null)&&this.clasCode.equals(rhs.clasCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.classDescription == rhs.classDescription)||((this.classDescription!= null)&&this.classDescription.equals(rhs.classDescription))));
    }

}
