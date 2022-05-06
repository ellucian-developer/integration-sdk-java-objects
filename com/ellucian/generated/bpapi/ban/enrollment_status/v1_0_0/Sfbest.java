
package com.ellucian.generated.bpapi.ban.enrollment_status.v1_0_0;

import java.util.Date;
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
    "estsCode",
    "endDate",
    "stvestsDesc",
    "startDate"
})
@Generated("jsonschema2pojo")
public class Sfbest {

    /**
     * Status Code
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests")
    private String estsCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_END_DATE")
    private Date endDate;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvestsDesc")
    private String stvestsDesc;
    /**
     * Start Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : SFBESTS_START_DATE")
    private Date startDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status Code
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    public String getEstsCode() {
        return estsCode;
    }

    /**
     * Status Code
     * <p>
     * Lineage reference object : SFBESTS_ESTS_CODE, Lookup lineage reference object : stvests
     * 
     */
    @JsonProperty("estsCode")
    public void setEstsCode(String estsCode) {
        this.estsCode = estsCode;
    }

    public Sfbest withEstsCode(String estsCode) {
        this.estsCode = estsCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : SFBESTS_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Sfbest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvestsDesc")
    public String getStvestsDesc() {
        return stvestsDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvestsDesc")
    public void setStvestsDesc(String stvestsDesc) {
        this.stvestsDesc = stvestsDesc;
    }

    public Sfbest withStvestsDesc(String stvestsDesc) {
        this.stvestsDesc = stvestsDesc;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : SFBESTS_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Sfbest withStartDate(Date startDate) {
        this.startDate = startDate;
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

    public Sfbest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfbest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("estsCode");
        sb.append('=');
        sb.append(((this.estsCode == null)?"<null>":this.estsCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("stvestsDesc");
        sb.append('=');
        sb.append(((this.stvestsDesc == null)?"<null>":this.stvestsDesc));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.estsCode == null)? 0 :this.estsCode.hashCode()));
        result = ((result* 31)+((this.stvestsDesc == null)? 0 :this.stvestsDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfbest) == false) {
            return false;
        }
        Sfbest rhs = ((Sfbest) other);
        return ((((((this.estsCode == rhs.estsCode)||((this.estsCode!= null)&&this.estsCode.equals(rhs.estsCode)))&&((this.stvestsDesc == rhs.stvestsDesc)||((this.stvestsDesc!= null)&&this.stvestsDesc.equals(rhs.stvestsDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
