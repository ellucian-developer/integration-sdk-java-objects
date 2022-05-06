
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
    "concDesc",
    "majrCodeConc"
})
@Generated("jsonschema2pojo")
public class Sorconc__1 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("concDesc")
    private String concDesc;
    /**
     * Area of Concentration
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeConc")
    @JsonPropertyDescription("Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr")
    private String majrCodeConc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("concDesc")
    public String getConcDesc() {
        return concDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("concDesc")
    public void setConcDesc(String concDesc) {
        this.concDesc = concDesc;
    }

    public Sorconc__1 withConcDesc(String concDesc) {
        this.concDesc = concDesc;
        return this;
    }

    /**
     * Area of Concentration
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeConc")
    public String getMajrCodeConc() {
        return majrCodeConc;
    }

    /**
     * Area of Concentration
     * <p>
     * Lineage reference object : SORCONC_MAJR_CODE_CONC, Lookup lineage reference object : stvmajr
     * (Required)
     * 
     */
    @JsonProperty("majrCodeConc")
    public void setMajrCodeConc(String majrCodeConc) {
        this.majrCodeConc = majrCodeConc;
    }

    public Sorconc__1 withMajrCodeConc(String majrCodeConc) {
        this.majrCodeConc = majrCodeConc;
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

    public Sorconc__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorconc__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("concDesc");
        sb.append('=');
        sb.append(((this.concDesc == null)?"<null>":this.concDesc));
        sb.append(',');
        sb.append("majrCodeConc");
        sb.append('=');
        sb.append(((this.majrCodeConc == null)?"<null>":this.majrCodeConc));
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
        result = ((result* 31)+((this.majrCodeConc == null)? 0 :this.majrCodeConc.hashCode()));
        result = ((result* 31)+((this.concDesc == null)? 0 :this.concDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorconc__1) == false) {
            return false;
        }
        Sorconc__1 rhs = ((Sorconc__1) other);
        return ((((this.majrCodeConc == rhs.majrCodeConc)||((this.majrCodeConc!= null)&&this.majrCodeConc.equals(rhs.majrCodeConc)))&&((this.concDesc == rhs.concDesc)||((this.concDesc!= null)&&this.concDesc.equals(rhs.concDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
