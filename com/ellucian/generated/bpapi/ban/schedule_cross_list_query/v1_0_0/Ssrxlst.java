
package com.ellucian.generated.bpapi.ban.schedule_cross_list_query.v1_0_0;

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
    "highHours",
    "crseNumb",
    "ptrmCode",
    "lowHours",
    "subjCode",
    "seqNumb",
    "ind",
    "crn"
})
@Generated("jsonschema2pojo")
public class Ssrxlst {

    @JsonProperty("highHours")
    private Double highHours;
    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("crseNumb")
    private String crseNumb;
    /**
     * Part of Term
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrmCode")
    private String ptrmCode;
    @JsonProperty("lowHours")
    private Double lowHours;
    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("subjCode")
    private String subjCode;
    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("seqNumb")
    private String seqNumb;
    /**
     * ---------- Credits ----------
     * <p>
     * 
     * 
     */
    @JsonProperty("ind")
    private String ind;
    /**
     * CRN
     * <p>
     * Lineage reference object : SSRXLST_CRN
     * 
     */
    @JsonProperty("crn")
    @JsonPropertyDescription("Lineage reference object : SSRXLST_CRN")
    private String crn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("highHours")
    public Double getHighHours() {
        return highHours;
    }

    @JsonProperty("highHours")
    public void setHighHours(Double highHours) {
        this.highHours = highHours;
    }

    public Ssrxlst withHighHours(Double highHours) {
        this.highHours = highHours;
        return this;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("crseNumb")
    public String getCrseNumb() {
        return crseNumb;
    }

    /**
     * Course
     * <p>
     * 
     * 
     */
    @JsonProperty("crseNumb")
    public void setCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
    }

    public Ssrxlst withCrseNumb(String crseNumb) {
        this.crseNumb = crseNumb;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrmCode")
    public String getPtrmCode() {
        return ptrmCode;
    }

    /**
     * Part of Term
     * <p>
     * 
     * 
     */
    @JsonProperty("ptrmCode")
    public void setPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
    }

    public Ssrxlst withPtrmCode(String ptrmCode) {
        this.ptrmCode = ptrmCode;
        return this;
    }

    @JsonProperty("lowHours")
    public Double getLowHours() {
        return lowHours;
    }

    @JsonProperty("lowHours")
    public void setLowHours(Double lowHours) {
        this.lowHours = lowHours;
    }

    public Ssrxlst withLowHours(Double lowHours) {
        this.lowHours = lowHours;
        return this;
    }

    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("subjCode")
    public String getSubjCode() {
        return subjCode;
    }

    /**
     * Subject
     * <p>
     * 
     * 
     */
    @JsonProperty("subjCode")
    public void setSubjCode(String subjCode) {
        this.subjCode = subjCode;
    }

    public Ssrxlst withSubjCode(String subjCode) {
        this.subjCode = subjCode;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("seqNumb")
    public String getSeqNumb() {
        return seqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * 
     */
    @JsonProperty("seqNumb")
    public void setSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
    }

    public Ssrxlst withSeqNumb(String seqNumb) {
        this.seqNumb = seqNumb;
        return this;
    }

    /**
     * ---------- Credits ----------
     * <p>
     * 
     * 
     */
    @JsonProperty("ind")
    public String getInd() {
        return ind;
    }

    /**
     * ---------- Credits ----------
     * <p>
     * 
     * 
     */
    @JsonProperty("ind")
    public void setInd(String ind) {
        this.ind = ind;
    }

    public Ssrxlst withInd(String ind) {
        this.ind = ind;
        return this;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRXLST_CRN
     * 
     */
    @JsonProperty("crn")
    public String getCrn() {
        return crn;
    }

    /**
     * CRN
     * <p>
     * Lineage reference object : SSRXLST_CRN
     * 
     */
    @JsonProperty("crn")
    public void setCrn(String crn) {
        this.crn = crn;
    }

    public Ssrxlst withCrn(String crn) {
        this.crn = crn;
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

    public Ssrxlst withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ssrxlst.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("highHours");
        sb.append('=');
        sb.append(((this.highHours == null)?"<null>":this.highHours));
        sb.append(',');
        sb.append("crseNumb");
        sb.append('=');
        sb.append(((this.crseNumb == null)?"<null>":this.crseNumb));
        sb.append(',');
        sb.append("ptrmCode");
        sb.append('=');
        sb.append(((this.ptrmCode == null)?"<null>":this.ptrmCode));
        sb.append(',');
        sb.append("lowHours");
        sb.append('=');
        sb.append(((this.lowHours == null)?"<null>":this.lowHours));
        sb.append(',');
        sb.append("subjCode");
        sb.append('=');
        sb.append(((this.subjCode == null)?"<null>":this.subjCode));
        sb.append(',');
        sb.append("seqNumb");
        sb.append('=');
        sb.append(((this.seqNumb == null)?"<null>":this.seqNumb));
        sb.append(',');
        sb.append("ind");
        sb.append('=');
        sb.append(((this.ind == null)?"<null>":this.ind));
        sb.append(',');
        sb.append("crn");
        sb.append('=');
        sb.append(((this.crn == null)?"<null>":this.crn));
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
        result = ((result* 31)+((this.highHours == null)? 0 :this.highHours.hashCode()));
        result = ((result* 31)+((this.crseNumb == null)? 0 :this.crseNumb.hashCode()));
        result = ((result* 31)+((this.ptrmCode == null)? 0 :this.ptrmCode.hashCode()));
        result = ((result* 31)+((this.lowHours == null)? 0 :this.lowHours.hashCode()));
        result = ((result* 31)+((this.subjCode == null)? 0 :this.subjCode.hashCode()));
        result = ((result* 31)+((this.seqNumb == null)? 0 :this.seqNumb.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ind == null)? 0 :this.ind.hashCode()));
        result = ((result* 31)+((this.crn == null)? 0 :this.crn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ssrxlst) == false) {
            return false;
        }
        Ssrxlst rhs = ((Ssrxlst) other);
        return ((((((((((this.highHours == rhs.highHours)||((this.highHours!= null)&&this.highHours.equals(rhs.highHours)))&&((this.crseNumb == rhs.crseNumb)||((this.crseNumb!= null)&&this.crseNumb.equals(rhs.crseNumb))))&&((this.ptrmCode == rhs.ptrmCode)||((this.ptrmCode!= null)&&this.ptrmCode.equals(rhs.ptrmCode))))&&((this.lowHours == rhs.lowHours)||((this.lowHours!= null)&&this.lowHours.equals(rhs.lowHours))))&&((this.subjCode == rhs.subjCode)||((this.subjCode!= null)&&this.subjCode.equals(rhs.subjCode))))&&((this.seqNumb == rhs.seqNumb)||((this.seqNumb!= null)&&this.seqNumb.equals(rhs.seqNumb))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ind == rhs.ind)||((this.ind!= null)&&this.ind.equals(rhs.ind))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))));
    }

}
