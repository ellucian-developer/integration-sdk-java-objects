
package com.ellucian.generated.bpapi.ban.course_registration_department_and_field_of_study_restrictions.v1_0_0;

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
    "deptDescription",
    "deptCode"
})
@Generated("jsonschema2pojo")
public class Scrrdep__1 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDescription")
    private String deptDescription;
    /**
     * Department
     * <p>
     * Lineage reference object : SCRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SCRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDescription")
    public String getDeptDescription() {
        return deptDescription;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDescription")
    public void setDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
    }

    public Scrrdep__1 withDeptDescription(String deptDescription) {
        this.deptDescription = deptDescription;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SCRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SCRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Scrrdep__1 withDeptCode(String deptCode) {
        this.deptCode = deptCode;
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

    public Scrrdep__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Scrrdep__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("deptDescription");
        sb.append('=');
        sb.append(((this.deptDescription == null)?"<null>":this.deptDescription));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
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
        result = ((result* 31)+((this.deptDescription == null)? 0 :this.deptDescription.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Scrrdep__1) == false) {
            return false;
        }
        Scrrdep__1 rhs = ((Scrrdep__1) other);
        return ((((this.deptDescription == rhs.deptDescription)||((this.deptDescription!= null)&&this.deptDescription.equals(rhs.deptDescription)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
