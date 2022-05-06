
package com.ellucian.generated.bpapi.ban.student_course_registrations.v1_0_0;

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
    "stvrgreDesc",
    "arInd",
    "rgreCode",
    "stvestsDesc",
    "frDiscountDisplay",
    "deleteAllCrnsInd",
    "minHrs",
    "maxhSrceCde",
    "holdBlckCode",
    "estsCode",
    "estsDate",
    "processBlockInd",
    "mhrsOver",
    "minhSrceCde"
})
@Generated("jsonschema2pojo")
public class Sfbetrm {

    @JsonProperty("stvrgreDesc")
    private String stvrgreDesc;
    /**
     * Acceptance
     * <p>
     * Lineage reference object : SFBETRM_AR_IND
     * 
     */
    @JsonProperty("arInd")
    @JsonPropertyDescription("Lineage reference object : SFBETRM_AR_IND")
    private String arInd;
    /**
     * Reason
     * <p>
     * Lineage reference object : SFBETRM_RGRE_CODE, Lookup lineage reference object : stvrgre
     * 
     */
    @JsonProperty("rgreCode")
    @JsonPropertyDescription("Lineage reference object : SFBETRM_RGRE_CODE, Lookup lineage reference object : stvrgre")
    private String rgreCode;
    @JsonProperty("stvestsDesc")
    private String stvestsDesc;
    @JsonProperty("frDiscountDisplay")
    private String frDiscountDisplay;
    /**
     * Delete All CRNs
     * <p>
     * 
     * 
     */
    @JsonProperty("deleteAllCrnsInd")
    private String deleteAllCrnsInd;
    /**
     * Minimum
     * <p>
     * Lineage reference object : SFBETRM_MIN_HRS, Lookup lineage reference object : stvastd
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    @JsonPropertyDescription("Lineage reference object : SFBETRM_MIN_HRS, Lookup lineage reference object : stvastd")
    private Double minHrs;
    @JsonProperty("maxhSrceCde")
    private String maxhSrceCde;
    /**
     * Process Block
     * <p>
     * 
     * 
     */
    @JsonProperty("holdBlckCode")
    private String holdBlckCode;
    /**
     * Status
     * <p>
     * Lineage reference object : SFBETRM_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("estsCode")
    @JsonPropertyDescription("Lineage reference object : SFBETRM_ESTS_CODE, Lookup lineage reference object : stvests")
    private String estsCode;
    /**
     * Status Date
     * <p>
     * Lineage reference object : SFBETRM_ESTS_DATE
     * 
     */
    @JsonProperty("estsDate")
    @JsonPropertyDescription("Lineage reference object : SFBETRM_ESTS_DATE")
    private Date estsDate;
    @JsonProperty("processBlockInd")
    private String processBlockInd;
    /**
     * Maximum
     * <p>
     * Lineage reference object : SFBETRM_MHRS_OVER, Lookup lineage reference object : stvastd
     * (Required)
     * 
     */
    @JsonProperty("mhrsOver")
    @JsonPropertyDescription("Lineage reference object : SFBETRM_MHRS_OVER, Lookup lineage reference object : stvastd")
    private Double mhrsOver;
    /**
     * Source
     * <p>
     * 
     * 
     */
    @JsonProperty("minhSrceCde")
    private String minhSrceCde;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stvrgreDesc")
    public String getStvrgreDesc() {
        return stvrgreDesc;
    }

    @JsonProperty("stvrgreDesc")
    public void setStvrgreDesc(String stvrgreDesc) {
        this.stvrgreDesc = stvrgreDesc;
    }

    public Sfbetrm withStvrgreDesc(String stvrgreDesc) {
        this.stvrgreDesc = stvrgreDesc;
        return this;
    }

    /**
     * Acceptance
     * <p>
     * Lineage reference object : SFBETRM_AR_IND
     * 
     */
    @JsonProperty("arInd")
    public String getArInd() {
        return arInd;
    }

    /**
     * Acceptance
     * <p>
     * Lineage reference object : SFBETRM_AR_IND
     * 
     */
    @JsonProperty("arInd")
    public void setArInd(String arInd) {
        this.arInd = arInd;
    }

    public Sfbetrm withArInd(String arInd) {
        this.arInd = arInd;
        return this;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SFBETRM_RGRE_CODE, Lookup lineage reference object : stvrgre
     * 
     */
    @JsonProperty("rgreCode")
    public String getRgreCode() {
        return rgreCode;
    }

    /**
     * Reason
     * <p>
     * Lineage reference object : SFBETRM_RGRE_CODE, Lookup lineage reference object : stvrgre
     * 
     */
    @JsonProperty("rgreCode")
    public void setRgreCode(String rgreCode) {
        this.rgreCode = rgreCode;
    }

    public Sfbetrm withRgreCode(String rgreCode) {
        this.rgreCode = rgreCode;
        return this;
    }

    @JsonProperty("stvestsDesc")
    public String getStvestsDesc() {
        return stvestsDesc;
    }

    @JsonProperty("stvestsDesc")
    public void setStvestsDesc(String stvestsDesc) {
        this.stvestsDesc = stvestsDesc;
    }

    public Sfbetrm withStvestsDesc(String stvestsDesc) {
        this.stvestsDesc = stvestsDesc;
        return this;
    }

    @JsonProperty("frDiscountDisplay")
    public String getFrDiscountDisplay() {
        return frDiscountDisplay;
    }

    @JsonProperty("frDiscountDisplay")
    public void setFrDiscountDisplay(String frDiscountDisplay) {
        this.frDiscountDisplay = frDiscountDisplay;
    }

    public Sfbetrm withFrDiscountDisplay(String frDiscountDisplay) {
        this.frDiscountDisplay = frDiscountDisplay;
        return this;
    }

    /**
     * Delete All CRNs
     * <p>
     * 
     * 
     */
    @JsonProperty("deleteAllCrnsInd")
    public String getDeleteAllCrnsInd() {
        return deleteAllCrnsInd;
    }

    /**
     * Delete All CRNs
     * <p>
     * 
     * 
     */
    @JsonProperty("deleteAllCrnsInd")
    public void setDeleteAllCrnsInd(String deleteAllCrnsInd) {
        this.deleteAllCrnsInd = deleteAllCrnsInd;
    }

    public Sfbetrm withDeleteAllCrnsInd(String deleteAllCrnsInd) {
        this.deleteAllCrnsInd = deleteAllCrnsInd;
        return this;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : SFBETRM_MIN_HRS, Lookup lineage reference object : stvastd
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    public Double getMinHrs() {
        return minHrs;
    }

    /**
     * Minimum
     * <p>
     * Lineage reference object : SFBETRM_MIN_HRS, Lookup lineage reference object : stvastd
     * (Required)
     * 
     */
    @JsonProperty("minHrs")
    public void setMinHrs(Double minHrs) {
        this.minHrs = minHrs;
    }

    public Sfbetrm withMinHrs(Double minHrs) {
        this.minHrs = minHrs;
        return this;
    }

    @JsonProperty("maxhSrceCde")
    public String getMaxhSrceCde() {
        return maxhSrceCde;
    }

    @JsonProperty("maxhSrceCde")
    public void setMaxhSrceCde(String maxhSrceCde) {
        this.maxhSrceCde = maxhSrceCde;
    }

    public Sfbetrm withMaxhSrceCde(String maxhSrceCde) {
        this.maxhSrceCde = maxhSrceCde;
        return this;
    }

    /**
     * Process Block
     * <p>
     * 
     * 
     */
    @JsonProperty("holdBlckCode")
    public String getHoldBlckCode() {
        return holdBlckCode;
    }

    /**
     * Process Block
     * <p>
     * 
     * 
     */
    @JsonProperty("holdBlckCode")
    public void setHoldBlckCode(String holdBlckCode) {
        this.holdBlckCode = holdBlckCode;
    }

    public Sfbetrm withHoldBlckCode(String holdBlckCode) {
        this.holdBlckCode = holdBlckCode;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFBETRM_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("estsCode")
    public String getEstsCode() {
        return estsCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SFBETRM_ESTS_CODE, Lookup lineage reference object : stvests
     * (Required)
     * 
     */
    @JsonProperty("estsCode")
    public void setEstsCode(String estsCode) {
        this.estsCode = estsCode;
    }

    public Sfbetrm withEstsCode(String estsCode) {
        this.estsCode = estsCode;
        return this;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFBETRM_ESTS_DATE
     * 
     */
    @JsonProperty("estsDate")
    public Date getEstsDate() {
        return estsDate;
    }

    /**
     * Status Date
     * <p>
     * Lineage reference object : SFBETRM_ESTS_DATE
     * 
     */
    @JsonProperty("estsDate")
    public void setEstsDate(Date estsDate) {
        this.estsDate = estsDate;
    }

    public Sfbetrm withEstsDate(Date estsDate) {
        this.estsDate = estsDate;
        return this;
    }

    @JsonProperty("processBlockInd")
    public String getProcessBlockInd() {
        return processBlockInd;
    }

    @JsonProperty("processBlockInd")
    public void setProcessBlockInd(String processBlockInd) {
        this.processBlockInd = processBlockInd;
    }

    public Sfbetrm withProcessBlockInd(String processBlockInd) {
        this.processBlockInd = processBlockInd;
        return this;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SFBETRM_MHRS_OVER, Lookup lineage reference object : stvastd
     * (Required)
     * 
     */
    @JsonProperty("mhrsOver")
    public Double getMhrsOver() {
        return mhrsOver;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SFBETRM_MHRS_OVER, Lookup lineage reference object : stvastd
     * (Required)
     * 
     */
    @JsonProperty("mhrsOver")
    public void setMhrsOver(Double mhrsOver) {
        this.mhrsOver = mhrsOver;
    }

    public Sfbetrm withMhrsOver(Double mhrsOver) {
        this.mhrsOver = mhrsOver;
        return this;
    }

    /**
     * Source
     * <p>
     * 
     * 
     */
    @JsonProperty("minhSrceCde")
    public String getMinhSrceCde() {
        return minhSrceCde;
    }

    /**
     * Source
     * <p>
     * 
     * 
     */
    @JsonProperty("minhSrceCde")
    public void setMinhSrceCde(String minhSrceCde) {
        this.minhSrceCde = minhSrceCde;
    }

    public Sfbetrm withMinhSrceCde(String minhSrceCde) {
        this.minhSrceCde = minhSrceCde;
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

    public Sfbetrm withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfbetrm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvrgreDesc");
        sb.append('=');
        sb.append(((this.stvrgreDesc == null)?"<null>":this.stvrgreDesc));
        sb.append(',');
        sb.append("arInd");
        sb.append('=');
        sb.append(((this.arInd == null)?"<null>":this.arInd));
        sb.append(',');
        sb.append("rgreCode");
        sb.append('=');
        sb.append(((this.rgreCode == null)?"<null>":this.rgreCode));
        sb.append(',');
        sb.append("stvestsDesc");
        sb.append('=');
        sb.append(((this.stvestsDesc == null)?"<null>":this.stvestsDesc));
        sb.append(',');
        sb.append("frDiscountDisplay");
        sb.append('=');
        sb.append(((this.frDiscountDisplay == null)?"<null>":this.frDiscountDisplay));
        sb.append(',');
        sb.append("deleteAllCrnsInd");
        sb.append('=');
        sb.append(((this.deleteAllCrnsInd == null)?"<null>":this.deleteAllCrnsInd));
        sb.append(',');
        sb.append("minHrs");
        sb.append('=');
        sb.append(((this.minHrs == null)?"<null>":this.minHrs));
        sb.append(',');
        sb.append("maxhSrceCde");
        sb.append('=');
        sb.append(((this.maxhSrceCde == null)?"<null>":this.maxhSrceCde));
        sb.append(',');
        sb.append("holdBlckCode");
        sb.append('=');
        sb.append(((this.holdBlckCode == null)?"<null>":this.holdBlckCode));
        sb.append(',');
        sb.append("estsCode");
        sb.append('=');
        sb.append(((this.estsCode == null)?"<null>":this.estsCode));
        sb.append(',');
        sb.append("estsDate");
        sb.append('=');
        sb.append(((this.estsDate == null)?"<null>":this.estsDate));
        sb.append(',');
        sb.append("processBlockInd");
        sb.append('=');
        sb.append(((this.processBlockInd == null)?"<null>":this.processBlockInd));
        sb.append(',');
        sb.append("mhrsOver");
        sb.append('=');
        sb.append(((this.mhrsOver == null)?"<null>":this.mhrsOver));
        sb.append(',');
        sb.append("minhSrceCde");
        sb.append('=');
        sb.append(((this.minhSrceCde == null)?"<null>":this.minhSrceCde));
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
        result = ((result* 31)+((this.stvrgreDesc == null)? 0 :this.stvrgreDesc.hashCode()));
        result = ((result* 31)+((this.arInd == null)? 0 :this.arInd.hashCode()));
        result = ((result* 31)+((this.rgreCode == null)? 0 :this.rgreCode.hashCode()));
        result = ((result* 31)+((this.stvestsDesc == null)? 0 :this.stvestsDesc.hashCode()));
        result = ((result* 31)+((this.frDiscountDisplay == null)? 0 :this.frDiscountDisplay.hashCode()));
        result = ((result* 31)+((this.deleteAllCrnsInd == null)? 0 :this.deleteAllCrnsInd.hashCode()));
        result = ((result* 31)+((this.minHrs == null)? 0 :this.minHrs.hashCode()));
        result = ((result* 31)+((this.maxhSrceCde == null)? 0 :this.maxhSrceCde.hashCode()));
        result = ((result* 31)+((this.holdBlckCode == null)? 0 :this.holdBlckCode.hashCode()));
        result = ((result* 31)+((this.estsCode == null)? 0 :this.estsCode.hashCode()));
        result = ((result* 31)+((this.estsDate == null)? 0 :this.estsDate.hashCode()));
        result = ((result* 31)+((this.processBlockInd == null)? 0 :this.processBlockInd.hashCode()));
        result = ((result* 31)+((this.mhrsOver == null)? 0 :this.mhrsOver.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.minhSrceCde == null)? 0 :this.minhSrceCde.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfbetrm) == false) {
            return false;
        }
        Sfbetrm rhs = ((Sfbetrm) other);
        return ((((((((((((((((this.stvrgreDesc == rhs.stvrgreDesc)||((this.stvrgreDesc!= null)&&this.stvrgreDesc.equals(rhs.stvrgreDesc)))&&((this.arInd == rhs.arInd)||((this.arInd!= null)&&this.arInd.equals(rhs.arInd))))&&((this.rgreCode == rhs.rgreCode)||((this.rgreCode!= null)&&this.rgreCode.equals(rhs.rgreCode))))&&((this.stvestsDesc == rhs.stvestsDesc)||((this.stvestsDesc!= null)&&this.stvestsDesc.equals(rhs.stvestsDesc))))&&((this.frDiscountDisplay == rhs.frDiscountDisplay)||((this.frDiscountDisplay!= null)&&this.frDiscountDisplay.equals(rhs.frDiscountDisplay))))&&((this.deleteAllCrnsInd == rhs.deleteAllCrnsInd)||((this.deleteAllCrnsInd!= null)&&this.deleteAllCrnsInd.equals(rhs.deleteAllCrnsInd))))&&((this.minHrs == rhs.minHrs)||((this.minHrs!= null)&&this.minHrs.equals(rhs.minHrs))))&&((this.maxhSrceCde == rhs.maxhSrceCde)||((this.maxhSrceCde!= null)&&this.maxhSrceCde.equals(rhs.maxhSrceCde))))&&((this.holdBlckCode == rhs.holdBlckCode)||((this.holdBlckCode!= null)&&this.holdBlckCode.equals(rhs.holdBlckCode))))&&((this.estsCode == rhs.estsCode)||((this.estsCode!= null)&&this.estsCode.equals(rhs.estsCode))))&&((this.estsDate == rhs.estsDate)||((this.estsDate!= null)&&this.estsDate.equals(rhs.estsDate))))&&((this.processBlockInd == rhs.processBlockInd)||((this.processBlockInd!= null)&&this.processBlockInd.equals(rhs.processBlockInd))))&&((this.mhrsOver == rhs.mhrsOver)||((this.mhrsOver!= null)&&this.mhrsOver.equals(rhs.mhrsOver))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.minhSrceCde == rhs.minhSrceCde)||((this.minhSrceCde!= null)&&this.minhSrceCde.equals(rhs.minhSrceCde))));
    }

}
