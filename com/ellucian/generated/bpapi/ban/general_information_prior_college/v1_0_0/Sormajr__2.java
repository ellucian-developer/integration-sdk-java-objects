
package com.ellucian.generated.bpapi.ban.general_information_prior_college.v1_0_0;

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
    "majrDesc",
    "majrCodeMajor"
})
@Generated("jsonschema2pojo")
public class Sormajr__2 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("majrDesc")
    private String majrDesc;
    /**
     * Major
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMajor")
    @JsonPropertyDescription("Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr")
    private String majrCodeMajor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("majrDesc")
    public String getMajrDesc() {
        return majrDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("majrDesc")
    public void setMajrDesc(String majrDesc) {
        this.majrDesc = majrDesc;
    }

    public Sormajr__2 withMajrDesc(String majrDesc) {
        this.majrDesc = majrDesc;
        return this;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMajor")
    public String getMajrCodeMajor() {
        return majrCodeMajor;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SORMAJR_MAJR_CODE_MAJOR, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeMajor")
    public void setMajrCodeMajor(String majrCodeMajor) {
        this.majrCodeMajor = majrCodeMajor;
    }

    public Sormajr__2 withMajrCodeMajor(String majrCodeMajor) {
        this.majrCodeMajor = majrCodeMajor;
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

    public Sormajr__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sormajr__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("majrDesc");
        sb.append('=');
        sb.append(((this.majrDesc == null)?"<null>":this.majrDesc));
        sb.append(',');
        sb.append("majrCodeMajor");
        sb.append('=');
        sb.append(((this.majrCodeMajor == null)?"<null>":this.majrCodeMajor));
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
        result = ((result* 31)+((this.majrDesc == null)? 0 :this.majrDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.majrCodeMajor == null)? 0 :this.majrCodeMajor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sormajr__2) == false) {
            return false;
        }
        Sormajr__2 rhs = ((Sormajr__2) other);
        return ((((this.majrDesc == rhs.majrDesc)||((this.majrDesc!= null)&&this.majrDesc.equals(rhs.majrDesc)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.majrCodeMajor == rhs.majrCodeMajor)||((this.majrCodeMajor!= null)&&this.majrCodeMajor.equals(rhs.majrCodeMajor))));
    }

}
