
package com.ellucian.generated.bpapi.ban.project_maintenance.v1_0_0;

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
    "ftmprojProjCode",
    "projDesc"
})
@Generated("jsonschema2pojo")
public class ProjectMaintenance100QapiPost {

    @JsonProperty("ftmprojProjCode")
    private String ftmprojProjCode;
    @JsonProperty("projDesc")
    private String projDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftmprojProjCode")
    public String getFtmprojProjCode() {
        return ftmprojProjCode;
    }

    @JsonProperty("ftmprojProjCode")
    public void setFtmprojProjCode(String ftmprojProjCode) {
        this.ftmprojProjCode = ftmprojProjCode;
    }

    public ProjectMaintenance100QapiPost withFtmprojProjCode(String ftmprojProjCode) {
        this.ftmprojProjCode = ftmprojProjCode;
        return this;
    }

    @JsonProperty("projDesc")
    public String getProjDesc() {
        return projDesc;
    }

    @JsonProperty("projDesc")
    public void setProjDesc(String projDesc) {
        this.projDesc = projDesc;
    }

    public ProjectMaintenance100QapiPost withProjDesc(String projDesc) {
        this.projDesc = projDesc;
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

    public ProjectMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProjectMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftmprojProjCode");
        sb.append('=');
        sb.append(((this.ftmprojProjCode == null)?"<null>":this.ftmprojProjCode));
        sb.append(',');
        sb.append("projDesc");
        sb.append('=');
        sb.append(((this.projDesc == null)?"<null>":this.projDesc));
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
        result = ((result* 31)+((this.ftmprojProjCode == null)? 0 :this.ftmprojProjCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.projDesc == null)? 0 :this.projDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectMaintenance100QapiPost) == false) {
            return false;
        }
        ProjectMaintenance100QapiPost rhs = ((ProjectMaintenance100QapiPost) other);
        return ((((this.ftmprojProjCode == rhs.ftmprojProjCode)||((this.ftmprojProjCode!= null)&&this.ftmprojProjCode.equals(rhs.ftmprojProjCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.projDesc == rhs.projDesc)||((this.projDesc!= null)&&this.projDesc.equals(rhs.projDesc))));
    }

}
