
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
    "stvhondDesc",
    "commencePrtInd",
    "transcPrtInd",
    "hondCode"
})
@Generated("jsonschema2pojo")
public class Shrdgdh {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvhondDesc")
    private String stvhondDesc;
    /**
     * Lineage reference object : SHRDGDH_COMMENCE_PRT_IND
     * 
     */
    @JsonProperty("commencePrtInd")
    @JsonPropertyDescription("Lineage reference object : SHRDGDH_COMMENCE_PRT_IND")
    private String commencePrtInd;
    /**
     * Lineage reference object : SHRDGDH_TRANSC_PRT_IND
     * 
     */
    @JsonProperty("transcPrtInd")
    @JsonPropertyDescription("Lineage reference object : SHRDGDH_TRANSC_PRT_IND")
    private String transcPrtInd;
    /**
     * Code
     * <p>
     * Lineage reference object : SHRDGDH_HOND_CODE, Lookup lineage reference object : stvhond
     * 
     */
    @JsonProperty("hondCode")
    @JsonPropertyDescription("Lineage reference object : SHRDGDH_HOND_CODE, Lookup lineage reference object : stvhond")
    private String hondCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvhondDesc")
    public String getStvhondDesc() {
        return stvhondDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvhondDesc")
    public void setStvhondDesc(String stvhondDesc) {
        this.stvhondDesc = stvhondDesc;
    }

    public Shrdgdh withStvhondDesc(String stvhondDesc) {
        this.stvhondDesc = stvhondDesc;
        return this;
    }

    /**
     * Lineage reference object : SHRDGDH_COMMENCE_PRT_IND
     * 
     */
    @JsonProperty("commencePrtInd")
    public String getCommencePrtInd() {
        return commencePrtInd;
    }

    /**
     * Lineage reference object : SHRDGDH_COMMENCE_PRT_IND
     * 
     */
    @JsonProperty("commencePrtInd")
    public void setCommencePrtInd(String commencePrtInd) {
        this.commencePrtInd = commencePrtInd;
    }

    public Shrdgdh withCommencePrtInd(String commencePrtInd) {
        this.commencePrtInd = commencePrtInd;
        return this;
    }

    /**
     * Lineage reference object : SHRDGDH_TRANSC_PRT_IND
     * 
     */
    @JsonProperty("transcPrtInd")
    public String getTranscPrtInd() {
        return transcPrtInd;
    }

    /**
     * Lineage reference object : SHRDGDH_TRANSC_PRT_IND
     * 
     */
    @JsonProperty("transcPrtInd")
    public void setTranscPrtInd(String transcPrtInd) {
        this.transcPrtInd = transcPrtInd;
    }

    public Shrdgdh withTranscPrtInd(String transcPrtInd) {
        this.transcPrtInd = transcPrtInd;
        return this;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SHRDGDH_HOND_CODE, Lookup lineage reference object : stvhond
     * 
     */
    @JsonProperty("hondCode")
    public String getHondCode() {
        return hondCode;
    }

    /**
     * Code
     * <p>
     * Lineage reference object : SHRDGDH_HOND_CODE, Lookup lineage reference object : stvhond
     * 
     */
    @JsonProperty("hondCode")
    public void setHondCode(String hondCode) {
        this.hondCode = hondCode;
    }

    public Shrdgdh withHondCode(String hondCode) {
        this.hondCode = hondCode;
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

    public Shrdgdh withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrdgdh.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvhondDesc");
        sb.append('=');
        sb.append(((this.stvhondDesc == null)?"<null>":this.stvhondDesc));
        sb.append(',');
        sb.append("commencePrtInd");
        sb.append('=');
        sb.append(((this.commencePrtInd == null)?"<null>":this.commencePrtInd));
        sb.append(',');
        sb.append("transcPrtInd");
        sb.append('=');
        sb.append(((this.transcPrtInd == null)?"<null>":this.transcPrtInd));
        sb.append(',');
        sb.append("hondCode");
        sb.append('=');
        sb.append(((this.hondCode == null)?"<null>":this.hondCode));
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
        result = ((result* 31)+((this.stvhondDesc == null)? 0 :this.stvhondDesc.hashCode()));
        result = ((result* 31)+((this.transcPrtInd == null)? 0 :this.transcPrtInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.hondCode == null)? 0 :this.hondCode.hashCode()));
        result = ((result* 31)+((this.commencePrtInd == null)? 0 :this.commencePrtInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrdgdh) == false) {
            return false;
        }
        Shrdgdh rhs = ((Shrdgdh) other);
        return ((((((this.stvhondDesc == rhs.stvhondDesc)||((this.stvhondDesc!= null)&&this.stvhondDesc.equals(rhs.stvhondDesc)))&&((this.transcPrtInd == rhs.transcPrtInd)||((this.transcPrtInd!= null)&&this.transcPrtInd.equals(rhs.transcPrtInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.hondCode == rhs.hondCode)||((this.hondCode!= null)&&this.hondCode.equals(rhs.hondCode))))&&((this.commencePrtInd == rhs.commencePrtInd)||((this.commencePrtInd!= null)&&this.commencePrtInd.equals(rhs.commencePrtInd))));
    }

}
