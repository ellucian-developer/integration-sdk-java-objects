
package com.ellucian.generated.bpapi.ban.section_restriction_department_and_field_of_study.v1_0_0;

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
    "deptDesc",
    "userId",
    "deptCode"
})
@Generated("jsonschema2pojo")
public class Ssrrdep__1 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDesc")
    private String deptDesc;
    /**
     * Ssrrdep User Id
     * <p>
     * Lineage reference object : SSRRDEP_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SSRRDEP_USER_ID")
    private String userId;
    /**
     * Department
     * <p>
     * Lineage reference object : SSRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SSRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDesc")
    public String getDeptDesc() {
        return deptDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("deptDesc")
    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    public Ssrrdep__1 withDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
        return this;
    }

    /**
     * Ssrrdep User Id
     * <p>
     * Lineage reference object : SSRRDEP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Ssrrdep User Id
     * <p>
     * Lineage reference object : SSRRDEP_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Ssrrdep__1 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SSRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SSRRDEP_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Ssrrdep__1 withDeptCode(String deptCode) {
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

    public Ssrrdep__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrrdep__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("deptDesc");
        sb.append('=');
        sb.append(((this.deptDesc == null)?"<null>":this.deptDesc));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
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
        result = ((result* 31)+((this.deptDesc == null)? 0 :this.deptDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrrdep__1) == false) {
            return false;
        }
        Ssrrdep__1 rhs = ((Ssrrdep__1) other);
        return (((((this.deptDesc == rhs.deptDesc)||((this.deptDesc!= null)&&this.deptDesc.equals(rhs.deptDesc)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))));
    }

}
