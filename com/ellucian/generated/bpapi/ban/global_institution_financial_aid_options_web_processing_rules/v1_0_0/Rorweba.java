
package com.ellucian.generated.bpapi.ban.global_institution_financial_aid_options_web_processing_rules.v1_0_0;

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
    "trstCode",
    "treqCode",
    "treqDesc",
    "typeCode",
    "trstDesc"
})
@Generated("jsonschema2pojo")
public class Rorweba {

    /**
     * Rorweba Trst Code
     * <p>
     * Lineage reference object : RORWEBA_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCode")
    @JsonPropertyDescription("Lineage reference object : RORWEBA_TRST_CODE, Lookup lineage reference object : rtvtrst")
    private String trstCode;
    /**
     * Rorweba Treq Code
     * <p>
     * Lineage reference object : RORWEBA_TREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("treqCode")
    @JsonPropertyDescription("Lineage reference object : RORWEBA_TREQ_CODE")
    private String treqCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("treqDesc")
    private String treqDesc;
    /**
     * Type Code
     * <p>
     * Lineage reference object : RORWEBA_TYPE_CODE
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    @JsonPropertyDescription("Lineage reference object : RORWEBA_TYPE_CODE")
    private String typeCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("trstDesc")
    private String trstDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Rorweba Trst Code
     * <p>
     * Lineage reference object : RORWEBA_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCode")
    public String getTrstCode() {
        return trstCode;
    }

    /**
     * Rorweba Trst Code
     * <p>
     * Lineage reference object : RORWEBA_TRST_CODE, Lookup lineage reference object : rtvtrst
     * (Required)
     * 
     */
    @JsonProperty("trstCode")
    public void setTrstCode(String trstCode) {
        this.trstCode = trstCode;
    }

    public Rorweba withTrstCode(String trstCode) {
        this.trstCode = trstCode;
        return this;
    }

    /**
     * Rorweba Treq Code
     * <p>
     * Lineage reference object : RORWEBA_TREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("treqCode")
    public String getTreqCode() {
        return treqCode;
    }

    /**
     * Rorweba Treq Code
     * <p>
     * Lineage reference object : RORWEBA_TREQ_CODE
     * (Required)
     * 
     */
    @JsonProperty("treqCode")
    public void setTreqCode(String treqCode) {
        this.treqCode = treqCode;
    }

    public Rorweba withTreqCode(String treqCode) {
        this.treqCode = treqCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("treqDesc")
    public String getTreqDesc() {
        return treqDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("treqDesc")
    public void setTreqDesc(String treqDesc) {
        this.treqDesc = treqDesc;
    }

    public Rorweba withTreqDesc(String treqDesc) {
        this.treqDesc = treqDesc;
        return this;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : RORWEBA_TYPE_CODE
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : RORWEBA_TYPE_CODE
     * (Required)
     * 
     */
    @JsonProperty("typeCode")
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Rorweba withTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("trstDesc")
    public String getTrstDesc() {
        return trstDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("trstDesc")
    public void setTrstDesc(String trstDesc) {
        this.trstDesc = trstDesc;
    }

    public Rorweba withTrstDesc(String trstDesc) {
        this.trstDesc = trstDesc;
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

    public Rorweba withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rorweba.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("trstCode");
        sb.append('=');
        sb.append(((this.trstCode == null)?"<null>":this.trstCode));
        sb.append(',');
        sb.append("treqCode");
        sb.append('=');
        sb.append(((this.treqCode == null)?"<null>":this.treqCode));
        sb.append(',');
        sb.append("treqDesc");
        sb.append('=');
        sb.append(((this.treqDesc == null)?"<null>":this.treqDesc));
        sb.append(',');
        sb.append("typeCode");
        sb.append('=');
        sb.append(((this.typeCode == null)?"<null>":this.typeCode));
        sb.append(',');
        sb.append("trstDesc");
        sb.append('=');
        sb.append(((this.trstDesc == null)?"<null>":this.trstDesc));
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
        result = ((result* 31)+((this.trstCode == null)? 0 :this.trstCode.hashCode()));
        result = ((result* 31)+((this.treqCode == null)? 0 :this.treqCode.hashCode()));
        result = ((result* 31)+((this.treqDesc == null)? 0 :this.treqDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.typeCode == null)? 0 :this.typeCode.hashCode()));
        result = ((result* 31)+((this.trstDesc == null)? 0 :this.trstDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rorweba) == false) {
            return false;
        }
        Rorweba rhs = ((Rorweba) other);
        return (((((((this.trstCode == rhs.trstCode)||((this.trstCode!= null)&&this.trstCode.equals(rhs.trstCode)))&&((this.treqCode == rhs.treqCode)||((this.treqCode!= null)&&this.treqCode.equals(rhs.treqCode))))&&((this.treqDesc == rhs.treqDesc)||((this.treqDesc!= null)&&this.treqDesc.equals(rhs.treqDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.typeCode == rhs.typeCode)||((this.typeCode!= null)&&this.typeCode.equals(rhs.typeCode))))&&((this.trstDesc == rhs.trstDesc)||((this.trstDesc!= null)&&this.trstDesc.equals(rhs.trstDesc))));
    }

}
