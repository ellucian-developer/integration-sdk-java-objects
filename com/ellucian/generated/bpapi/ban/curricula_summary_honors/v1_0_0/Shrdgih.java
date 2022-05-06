
package com.ellucian.generated.bpapi.ban.curricula_summary_honors.v1_0_0;

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
    "honrCode",
    "commencePrtInd",
    "stvhonrDesc",
    "transcPrtInd",
    "ediDefault"
})
@Generated("jsonschema2pojo")
public class Shrdgih {

    /**
     * Code
     * <p>
     * Lineage reference object : SHRDGIH_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("honrCode")
    @JsonPropertyDescription("Lineage reference object : SHRDGIH_HONR_CODE, Lookup lineage reference object : stvhonr")
    private String honrCode;
    /**
     * Lineage reference object : SHRDGIH_COMMENCE_PRT_IND
     * 
     */
    @JsonProperty("commencePrtInd")
    @JsonPropertyDescription("Lineage reference object : SHRDGIH_COMMENCE_PRT_IND")
    private String commencePrtInd;
    /**
     * Institutional Honors Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvhonrDesc")
    private String stvhonrDesc;
    /**
     * Lineage reference object : SHRDGIH_TRANSC_PRT_IND
     * 
     */
    @JsonProperty("transcPrtInd")
    @JsonPropertyDescription("Lineage reference object : SHRDGIH_TRANSC_PRT_IND")
    private String transcPrtInd;
    /**
     * Lineage reference object : SHRDGIH_EDI_DEFAULT
     * 
     */
    @JsonProperty("ediDefault")
    @JsonPropertyDescription("Lineage reference object : SHRDGIH_EDI_DEFAULT")
    private String ediDefault;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * Lineage reference object : SHRDGIH_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("honrCode")
    public String getHonrCode() {
        return honrCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SHRDGIH_HONR_CODE, Lookup lineage reference object : stvhonr
     * 
     */
    @JsonProperty("honrCode")
    public void setHonrCode(String honrCode) {
        this.honrCode = honrCode;
    }

    public Shrdgih withHonrCode(String honrCode) {
        this.honrCode = honrCode;
        return this;
    }

    /**
     * Lineage reference object : SHRDGIH_COMMENCE_PRT_IND
     * 
     */
    @JsonProperty("commencePrtInd")
    public String getCommencePrtInd() {
        return commencePrtInd;
    }

    /**
     * Lineage reference object : SHRDGIH_COMMENCE_PRT_IND
     * 
     */
    @JsonProperty("commencePrtInd")
    public void setCommencePrtInd(String commencePrtInd) {
        this.commencePrtInd = commencePrtInd;
    }

    public Shrdgih withCommencePrtInd(String commencePrtInd) {
        this.commencePrtInd = commencePrtInd;
        return this;
    }

    /**
     * Institutional Honors Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvhonrDesc")
    public String getStvhonrDesc() {
        return stvhonrDesc;
    }

    /**
     * Institutional Honors Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvhonrDesc")
    public void setStvhonrDesc(String stvhonrDesc) {
        this.stvhonrDesc = stvhonrDesc;
    }

    public Shrdgih withStvhonrDesc(String stvhonrDesc) {
        this.stvhonrDesc = stvhonrDesc;
        return this;
    }

    /**
     * Lineage reference object : SHRDGIH_TRANSC_PRT_IND
     * 
     */
    @JsonProperty("transcPrtInd")
    public String getTranscPrtInd() {
        return transcPrtInd;
    }

    /**
     * Lineage reference object : SHRDGIH_TRANSC_PRT_IND
     * 
     */
    @JsonProperty("transcPrtInd")
    public void setTranscPrtInd(String transcPrtInd) {
        this.transcPrtInd = transcPrtInd;
    }

    public Shrdgih withTranscPrtInd(String transcPrtInd) {
        this.transcPrtInd = transcPrtInd;
        return this;
    }

    /**
     * Lineage reference object : SHRDGIH_EDI_DEFAULT
     * 
     */
    @JsonProperty("ediDefault")
    public String getEdiDefault() {
        return ediDefault;
    }

    /**
     * Lineage reference object : SHRDGIH_EDI_DEFAULT
     * 
     */
    @JsonProperty("ediDefault")
    public void setEdiDefault(String ediDefault) {
        this.ediDefault = ediDefault;
    }

    public Shrdgih withEdiDefault(String ediDefault) {
        this.ediDefault = ediDefault;
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

    public Shrdgih withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrdgih.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("honrCode");
        sb.append('=');
        sb.append(((this.honrCode == null)?"<null>":this.honrCode));
        sb.append(',');
        sb.append("commencePrtInd");
        sb.append('=');
        sb.append(((this.commencePrtInd == null)?"<null>":this.commencePrtInd));
        sb.append(',');
        sb.append("stvhonrDesc");
        sb.append('=');
        sb.append(((this.stvhonrDesc == null)?"<null>":this.stvhonrDesc));
        sb.append(',');
        sb.append("transcPrtInd");
        sb.append('=');
        sb.append(((this.transcPrtInd == null)?"<null>":this.transcPrtInd));
        sb.append(',');
        sb.append("ediDefault");
        sb.append('=');
        sb.append(((this.ediDefault == null)?"<null>":this.ediDefault));
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
        result = ((result* 31)+((this.honrCode == null)? 0 :this.honrCode.hashCode()));
        result = ((result* 31)+((this.commencePrtInd == null)? 0 :this.commencePrtInd.hashCode()));
        result = ((result* 31)+((this.stvhonrDesc == null)? 0 :this.stvhonrDesc.hashCode()));
        result = ((result* 31)+((this.transcPrtInd == null)? 0 :this.transcPrtInd.hashCode()));
        result = ((result* 31)+((this.ediDefault == null)? 0 :this.ediDefault.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrdgih) == false) {
            return false;
        }
        Shrdgih rhs = ((Shrdgih) other);
        return (((((((this.honrCode == rhs.honrCode)||((this.honrCode!= null)&&this.honrCode.equals(rhs.honrCode)))&&((this.commencePrtInd == rhs.commencePrtInd)||((this.commencePrtInd!= null)&&this.commencePrtInd.equals(rhs.commencePrtInd))))&&((this.stvhonrDesc == rhs.stvhonrDesc)||((this.stvhonrDesc!= null)&&this.stvhonrDesc.equals(rhs.stvhonrDesc))))&&((this.transcPrtInd == rhs.transcPrtInd)||((this.transcPrtInd!= null)&&this.transcPrtInd.equals(rhs.transcPrtInd))))&&((this.ediDefault == rhs.ediDefault)||((this.ediDefault!= null)&&this.ediDefault.equals(rhs.ediDefault))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
