
package com.ellucian.generated.bpapi.ban.attribute_type_sets_maintenance.v1_0_0;

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
    "ftvattsCoasCode",
    "ftvattsValidFoapal",
    "ftvattsCode",
    "atttCode"
})
@Generated("jsonschema2pojo")
public class AttributeTypeSetsMaintenance100QapiPost {

    @JsonProperty("ftvattsCoasCode")
    private String ftvattsCoasCode;
    @JsonProperty("ftvattsValidFoapal")
    private String ftvattsValidFoapal;
    @JsonProperty("ftvattsCode")
    private String ftvattsCode;
    /**
     * Ftratts Attt Code
     * <p>
     * Lineage reference object : FTRATTS_ATTT_CODE
     * 
     */
    @JsonProperty("atttCode")
    @JsonPropertyDescription("Lineage reference object : FTRATTS_ATTT_CODE")
    private String atttCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ftvattsCoasCode")
    public String getFtvattsCoasCode() {
        return ftvattsCoasCode;
    }

    @JsonProperty("ftvattsCoasCode")
    public void setFtvattsCoasCode(String ftvattsCoasCode) {
        this.ftvattsCoasCode = ftvattsCoasCode;
    }

    public AttributeTypeSetsMaintenance100QapiPost withFtvattsCoasCode(String ftvattsCoasCode) {
        this.ftvattsCoasCode = ftvattsCoasCode;
        return this;
    }

    @JsonProperty("ftvattsValidFoapal")
    public String getFtvattsValidFoapal() {
        return ftvattsValidFoapal;
    }

    @JsonProperty("ftvattsValidFoapal")
    public void setFtvattsValidFoapal(String ftvattsValidFoapal) {
        this.ftvattsValidFoapal = ftvattsValidFoapal;
    }

    public AttributeTypeSetsMaintenance100QapiPost withFtvattsValidFoapal(String ftvattsValidFoapal) {
        this.ftvattsValidFoapal = ftvattsValidFoapal;
        return this;
    }

    @JsonProperty("ftvattsCode")
    public String getFtvattsCode() {
        return ftvattsCode;
    }

    @JsonProperty("ftvattsCode")
    public void setFtvattsCode(String ftvattsCode) {
        this.ftvattsCode = ftvattsCode;
    }

    public AttributeTypeSetsMaintenance100QapiPost withFtvattsCode(String ftvattsCode) {
        this.ftvattsCode = ftvattsCode;
        return this;
    }

    /**
     * Ftratts Attt Code
     * <p>
     * Lineage reference object : FTRATTS_ATTT_CODE
     * 
     */
    @JsonProperty("atttCode")
    public String getAtttCode() {
        return atttCode;
    }

    /**
     * Ftratts Attt Code
     * <p>
     * Lineage reference object : FTRATTS_ATTT_CODE
     * 
     */
    @JsonProperty("atttCode")
    public void setAtttCode(String atttCode) {
        this.atttCode = atttCode;
    }

    public AttributeTypeSetsMaintenance100QapiPost withAtttCode(String atttCode) {
        this.atttCode = atttCode;
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

    public AttributeTypeSetsMaintenance100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttributeTypeSetsMaintenance100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvattsCoasCode");
        sb.append('=');
        sb.append(((this.ftvattsCoasCode == null)?"<null>":this.ftvattsCoasCode));
        sb.append(',');
        sb.append("ftvattsValidFoapal");
        sb.append('=');
        sb.append(((this.ftvattsValidFoapal == null)?"<null>":this.ftvattsValidFoapal));
        sb.append(',');
        sb.append("ftvattsCode");
        sb.append('=');
        sb.append(((this.ftvattsCode == null)?"<null>":this.ftvattsCode));
        sb.append(',');
        sb.append("atttCode");
        sb.append('=');
        sb.append(((this.atttCode == null)?"<null>":this.atttCode));
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
        result = ((result* 31)+((this.atttCode == null)? 0 :this.atttCode.hashCode()));
        result = ((result* 31)+((this.ftvattsCode == null)? 0 :this.ftvattsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftvattsCoasCode == null)? 0 :this.ftvattsCoasCode.hashCode()));
        result = ((result* 31)+((this.ftvattsValidFoapal == null)? 0 :this.ftvattsValidFoapal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttributeTypeSetsMaintenance100QapiPost) == false) {
            return false;
        }
        AttributeTypeSetsMaintenance100QapiPost rhs = ((AttributeTypeSetsMaintenance100QapiPost) other);
        return ((((((this.atttCode == rhs.atttCode)||((this.atttCode!= null)&&this.atttCode.equals(rhs.atttCode)))&&((this.ftvattsCode == rhs.ftvattsCode)||((this.ftvattsCode!= null)&&this.ftvattsCode.equals(rhs.ftvattsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftvattsCoasCode == rhs.ftvattsCoasCode)||((this.ftvattsCoasCode!= null)&&this.ftvattsCoasCode.equals(rhs.ftvattsCoasCode))))&&((this.ftvattsValidFoapal == rhs.ftvattsValidFoapal)||((this.ftvattsValidFoapal!= null)&&this.ftvattsValidFoapal.equals(rhs.ftvattsValidFoapal))));
    }

}
