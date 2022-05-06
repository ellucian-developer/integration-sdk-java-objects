
package com.ellucian.generated.bpapi.ban.eu_hesa_course_catalog_identifier_details.v1_0_0;

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
    "keyblockModId",
    "keyblockCourseId",
    "copyKeyblockModId"
})
@Generated("jsonschema2pojo")
public class EuHesaCourseCatalogIdentifierDetails100QapiPost {

    @JsonProperty("keyblockModId")
    private String keyblockModId;
    @JsonProperty("keyblockCourseId")
    private String keyblockCourseId;
    @JsonProperty("copyKeyblockModId")
    private String copyKeyblockModId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblockModId")
    public String getKeyblockModId() {
        return keyblockModId;
    }

    @JsonProperty("keyblockModId")
    public void setKeyblockModId(String keyblockModId) {
        this.keyblockModId = keyblockModId;
    }

    public EuHesaCourseCatalogIdentifierDetails100QapiPost withKeyblockModId(String keyblockModId) {
        this.keyblockModId = keyblockModId;
        return this;
    }

    @JsonProperty("keyblockCourseId")
    public String getKeyblockCourseId() {
        return keyblockCourseId;
    }

    @JsonProperty("keyblockCourseId")
    public void setKeyblockCourseId(String keyblockCourseId) {
        this.keyblockCourseId = keyblockCourseId;
    }

    public EuHesaCourseCatalogIdentifierDetails100QapiPost withKeyblockCourseId(String keyblockCourseId) {
        this.keyblockCourseId = keyblockCourseId;
        return this;
    }

    @JsonProperty("copyKeyblockModId")
    public String getCopyKeyblockModId() {
        return copyKeyblockModId;
    }

    @JsonProperty("copyKeyblockModId")
    public void setCopyKeyblockModId(String copyKeyblockModId) {
        this.copyKeyblockModId = copyKeyblockModId;
    }

    public EuHesaCourseCatalogIdentifierDetails100QapiPost withCopyKeyblockModId(String copyKeyblockModId) {
        this.copyKeyblockModId = copyKeyblockModId;
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

    public EuHesaCourseCatalogIdentifierDetails100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaCourseCatalogIdentifierDetails100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblockModId");
        sb.append('=');
        sb.append(((this.keyblockModId == null)?"<null>":this.keyblockModId));
        sb.append(',');
        sb.append("keyblockCourseId");
        sb.append('=');
        sb.append(((this.keyblockCourseId == null)?"<null>":this.keyblockCourseId));
        sb.append(',');
        sb.append("copyKeyblockModId");
        sb.append('=');
        sb.append(((this.copyKeyblockModId == null)?"<null>":this.copyKeyblockModId));
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
        result = ((result* 31)+((this.copyKeyblockModId == null)? 0 :this.copyKeyblockModId.hashCode()));
        result = ((result* 31)+((this.keyblockCourseId == null)? 0 :this.keyblockCourseId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.keyblockModId == null)? 0 :this.keyblockModId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaCourseCatalogIdentifierDetails100QapiPost) == false) {
            return false;
        }
        EuHesaCourseCatalogIdentifierDetails100QapiPost rhs = ((EuHesaCourseCatalogIdentifierDetails100QapiPost) other);
        return (((((this.copyKeyblockModId == rhs.copyKeyblockModId)||((this.copyKeyblockModId!= null)&&this.copyKeyblockModId.equals(rhs.copyKeyblockModId)))&&((this.keyblockCourseId == rhs.keyblockCourseId)||((this.keyblockCourseId!= null)&&this.keyblockCourseId.equals(rhs.keyblockCourseId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblockModId == rhs.keyblockModId)||((this.keyblockModId!= null)&&this.keyblockModId.equals(rhs.keyblockModId))));
    }

}
