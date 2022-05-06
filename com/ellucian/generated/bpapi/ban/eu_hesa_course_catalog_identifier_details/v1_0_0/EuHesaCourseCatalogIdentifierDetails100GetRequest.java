
package com.ellucian.generated.bpapi.ban.eu_hesa_course_catalog_identifier_details.v1_0_0;

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
    "keyblockCourseId",
    "copyKeyblockModId",
    "keyblockModId"
})
@Generated("jsonschema2pojo")
public class EuHesaCourseCatalogIdentifierDetails100GetRequest {

    /**
     * Lineage reference object : keyblockCourseId
     * 
     */
    @JsonProperty("keyblockCourseId")
    @JsonPropertyDescription("Lineage reference object : keyblockCourseId")
    private Object keyblockCourseId;
    /**
     * Lineage reference object : copyKeyblockModId, Lookup lineage reference object : SOBCCID,SCBCRSE
     * 
     */
    @JsonProperty("copyKeyblockModId")
    @JsonPropertyDescription("Lineage reference object : copyKeyblockModId, Lookup lineage reference object : SOBCCID,SCBCRSE")
    private Object copyKeyblockModId;
    /**
     * Lineage reference object : keyblockModId, Lookup lineage reference object : SOBCCID,SCBCRSE
     * 
     */
    @JsonProperty("keyblockModId")
    @JsonPropertyDescription("Lineage reference object : keyblockModId, Lookup lineage reference object : SOBCCID,SCBCRSE")
    private Object keyblockModId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : keyblockCourseId
     * 
     */
    @JsonProperty("keyblockCourseId")
    public Object getKeyblockCourseId() {
        return keyblockCourseId;
    }

    /**
     * Lineage reference object : keyblockCourseId
     * 
     */
    @JsonProperty("keyblockCourseId")
    public void setKeyblockCourseId(Object keyblockCourseId) {
        this.keyblockCourseId = keyblockCourseId;
    }

    public EuHesaCourseCatalogIdentifierDetails100GetRequest withKeyblockCourseId(Object keyblockCourseId) {
        this.keyblockCourseId = keyblockCourseId;
        return this;
    }

    /**
     * Lineage reference object : copyKeyblockModId, Lookup lineage reference object : SOBCCID,SCBCRSE
     * 
     */
    @JsonProperty("copyKeyblockModId")
    public Object getCopyKeyblockModId() {
        return copyKeyblockModId;
    }

    /**
     * Lineage reference object : copyKeyblockModId, Lookup lineage reference object : SOBCCID,SCBCRSE
     * 
     */
    @JsonProperty("copyKeyblockModId")
    public void setCopyKeyblockModId(Object copyKeyblockModId) {
        this.copyKeyblockModId = copyKeyblockModId;
    }

    public EuHesaCourseCatalogIdentifierDetails100GetRequest withCopyKeyblockModId(Object copyKeyblockModId) {
        this.copyKeyblockModId = copyKeyblockModId;
        return this;
    }

    /**
     * Lineage reference object : keyblockModId, Lookup lineage reference object : SOBCCID,SCBCRSE
     * 
     */
    @JsonProperty("keyblockModId")
    public Object getKeyblockModId() {
        return keyblockModId;
    }

    /**
     * Lineage reference object : keyblockModId, Lookup lineage reference object : SOBCCID,SCBCRSE
     * 
     */
    @JsonProperty("keyblockModId")
    public void setKeyblockModId(Object keyblockModId) {
        this.keyblockModId = keyblockModId;
    }

    public EuHesaCourseCatalogIdentifierDetails100GetRequest withKeyblockModId(Object keyblockModId) {
        this.keyblockModId = keyblockModId;
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

    public EuHesaCourseCatalogIdentifierDetails100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaCourseCatalogIdentifierDetails100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblockCourseId");
        sb.append('=');
        sb.append(((this.keyblockCourseId == null)?"<null>":this.keyblockCourseId));
        sb.append(',');
        sb.append("copyKeyblockModId");
        sb.append('=');
        sb.append(((this.copyKeyblockModId == null)?"<null>":this.copyKeyblockModId));
        sb.append(',');
        sb.append("keyblockModId");
        sb.append('=');
        sb.append(((this.keyblockModId == null)?"<null>":this.keyblockModId));
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
        if ((other instanceof EuHesaCourseCatalogIdentifierDetails100GetRequest) == false) {
            return false;
        }
        EuHesaCourseCatalogIdentifierDetails100GetRequest rhs = ((EuHesaCourseCatalogIdentifierDetails100GetRequest) other);
        return (((((this.copyKeyblockModId == rhs.copyKeyblockModId)||((this.copyKeyblockModId!= null)&&this.copyKeyblockModId.equals(rhs.copyKeyblockModId)))&&((this.keyblockCourseId == rhs.keyblockCourseId)||((this.keyblockCourseId!= null)&&this.keyblockCourseId.equals(rhs.keyblockCourseId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.keyblockModId == rhs.keyblockModId)||((this.keyblockModId!= null)&&this.keyblockModId.equals(rhs.keyblockModId))));
    }

}
