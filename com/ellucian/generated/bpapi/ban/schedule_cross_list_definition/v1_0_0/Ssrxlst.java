
package com.ellucian.generated.bpapi.ban.schedule_cross_list_definition.v1_0_0;

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
    "ssbsectCreditHrs",
    "ssbsectSeqNumb",
    "orTo",
    "ssbsectReservedInd",
    "ssbsectSubjCode",
    "blockInd",
    "ssbsectCrseNumb",
    "ssbsectSeatsAvail",
    "ssbsectCampCode",
    "ssbsectEnrl",
    "ssbsectPtrmCode",
    "ssbsectWaitCount",
    "scbcrseCreditHrs",
    "ssbsectMaxEnrl",
    "ssbsectWaitCapacity",
    "ssbsectWaitAvail",
    "crn"
})
@Generated("jsonschema2pojo")
public class Ssrxlst {

    @JsonProperty("ssbsectCreditHrs")
    private Double ssbsectCreditHrs;
    /**
     * Section
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    private String ssbsectSeqNumb;
    @JsonProperty("orTo")
    private String orTo;
    /**
     * Reserved Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectReservedInd")
    private String ssbsectReservedInd;
    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvsubj")
    private String ssbsectSubjCode;
    /**
     * Block
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    private String blockInd;
    /**
     * Course Number
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    private String ssbsectCrseNumb;
    /**
     * Enrollment Remaining
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSeatsAvail")
    private Object ssbsectSeatsAvail;
    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("ssbsectCampCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvcamp")
    private String ssbsectCampCode;
    /**
     * Enrollment Actual
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectEnrl")
    private Object ssbsectEnrl;
    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ssbsectPtrmCode")
    @JsonPropertyDescription("Lookup lineage reference object : stvptrm")
    private String ssbsectPtrmCode;
    /**
     * Wait List Actual
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitCount")
    private Object ssbsectWaitCount;
    @JsonProperty("scbcrseCreditHrs")
    private Double scbcrseCreditHrs;
    /**
     * Enrollment Maximum
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectMaxEnrl")
    private Object ssbsectMaxEnrl;
    /**
     * Wait List Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitCapacity")
    private Object ssbsectWaitCapacity;
    /**
     * Wait List Remaining
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitAvail")
    private Object ssbsectWaitAvail;
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

    @JsonProperty("ssbsectCreditHrs")
    public Double getSsbsectCreditHrs() {
        return ssbsectCreditHrs;
    }

    @JsonProperty("ssbsectCreditHrs")
    public void setSsbsectCreditHrs(Double ssbsectCreditHrs) {
        this.ssbsectCreditHrs = ssbsectCreditHrs;
    }

    public Ssrxlst withSsbsectCreditHrs(Double ssbsectCreditHrs) {
        this.ssbsectCreditHrs = ssbsectCreditHrs;
        return this;
    }

    /**
     * Section
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    public String getSsbsectSeqNumb() {
        return ssbsectSeqNumb;
    }

    /**
     * Section
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSeqNumb")
    public void setSsbsectSeqNumb(String ssbsectSeqNumb) {
        this.ssbsectSeqNumb = ssbsectSeqNumb;
    }

    public Ssrxlst withSsbsectSeqNumb(String ssbsectSeqNumb) {
        this.ssbsectSeqNumb = ssbsectSeqNumb;
        return this;
    }

    @JsonProperty("orTo")
    public String getOrTo() {
        return orTo;
    }

    @JsonProperty("orTo")
    public void setOrTo(String orTo) {
        this.orTo = orTo;
    }

    public Ssrxlst withOrTo(String orTo) {
        this.orTo = orTo;
        return this;
    }

    /**
     * Reserved Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectReservedInd")
    public String getSsbsectReservedInd() {
        return ssbsectReservedInd;
    }

    /**
     * Reserved Indicator
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectReservedInd")
    public void setSsbsectReservedInd(String ssbsectReservedInd) {
        this.ssbsectReservedInd = ssbsectReservedInd;
    }

    public Ssrxlst withSsbsectReservedInd(String ssbsectReservedInd) {
        this.ssbsectReservedInd = ssbsectReservedInd;
        return this;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public String getSsbsectSubjCode() {
        return ssbsectSubjCode;
    }

    /**
     * Subject
     * <p>
     * Lookup lineage reference object : stvsubj
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSubjCode")
    public void setSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
    }

    public Ssrxlst withSsbsectSubjCode(String ssbsectSubjCode) {
        this.ssbsectSubjCode = ssbsectSubjCode;
        return this;
    }

    /**
     * Block
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    public String getBlockInd() {
        return blockInd;
    }

    /**
     * Block
     * <p>
     * 
     * 
     */
    @JsonProperty("blockInd")
    public void setBlockInd(String blockInd) {
        this.blockInd = blockInd;
    }

    public Ssrxlst withBlockInd(String blockInd) {
        this.blockInd = blockInd;
        return this;
    }

    /**
     * Course Number
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public String getSsbsectCrseNumb() {
        return ssbsectCrseNumb;
    }

    /**
     * Course Number
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectCrseNumb")
    public void setSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
    }

    public Ssrxlst withSsbsectCrseNumb(String ssbsectCrseNumb) {
        this.ssbsectCrseNumb = ssbsectCrseNumb;
        return this;
    }

    /**
     * Enrollment Remaining
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSeatsAvail")
    public Object getSsbsectSeatsAvail() {
        return ssbsectSeatsAvail;
    }

    /**
     * Enrollment Remaining
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectSeatsAvail")
    public void setSsbsectSeatsAvail(Object ssbsectSeatsAvail) {
        this.ssbsectSeatsAvail = ssbsectSeatsAvail;
    }

    public Ssrxlst withSsbsectSeatsAvail(Object ssbsectSeatsAvail) {
        this.ssbsectSeatsAvail = ssbsectSeatsAvail;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("ssbsectCampCode")
    public String getSsbsectCampCode() {
        return ssbsectCampCode;
    }

    /**
     * Campus
     * <p>
     * Lookup lineage reference object : stvcamp
     * (Required)
     * 
     */
    @JsonProperty("ssbsectCampCode")
    public void setSsbsectCampCode(String ssbsectCampCode) {
        this.ssbsectCampCode = ssbsectCampCode;
    }

    public Ssrxlst withSsbsectCampCode(String ssbsectCampCode) {
        this.ssbsectCampCode = ssbsectCampCode;
        return this;
    }

    /**
     * Enrollment Actual
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectEnrl")
    public Object getSsbsectEnrl() {
        return ssbsectEnrl;
    }

    /**
     * Enrollment Actual
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectEnrl")
    public void setSsbsectEnrl(Object ssbsectEnrl) {
        this.ssbsectEnrl = ssbsectEnrl;
    }

    public Ssrxlst withSsbsectEnrl(Object ssbsectEnrl) {
        this.ssbsectEnrl = ssbsectEnrl;
        return this;
    }

    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ssbsectPtrmCode")
    public String getSsbsectPtrmCode() {
        return ssbsectPtrmCode;
    }

    /**
     * Part of Term
     * <p>
     * Lookup lineage reference object : stvptrm
     * 
     */
    @JsonProperty("ssbsectPtrmCode")
    public void setSsbsectPtrmCode(String ssbsectPtrmCode) {
        this.ssbsectPtrmCode = ssbsectPtrmCode;
    }

    public Ssrxlst withSsbsectPtrmCode(String ssbsectPtrmCode) {
        this.ssbsectPtrmCode = ssbsectPtrmCode;
        return this;
    }

    /**
     * Wait List Actual
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitCount")
    public Object getSsbsectWaitCount() {
        return ssbsectWaitCount;
    }

    /**
     * Wait List Actual
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitCount")
    public void setSsbsectWaitCount(Object ssbsectWaitCount) {
        this.ssbsectWaitCount = ssbsectWaitCount;
    }

    public Ssrxlst withSsbsectWaitCount(Object ssbsectWaitCount) {
        this.ssbsectWaitCount = ssbsectWaitCount;
        return this;
    }

    @JsonProperty("scbcrseCreditHrs")
    public Double getScbcrseCreditHrs() {
        return scbcrseCreditHrs;
    }

    @JsonProperty("scbcrseCreditHrs")
    public void setScbcrseCreditHrs(Double scbcrseCreditHrs) {
        this.scbcrseCreditHrs = scbcrseCreditHrs;
    }

    public Ssrxlst withScbcrseCreditHrs(Double scbcrseCreditHrs) {
        this.scbcrseCreditHrs = scbcrseCreditHrs;
        return this;
    }

    /**
     * Enrollment Maximum
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectMaxEnrl")
    public Object getSsbsectMaxEnrl() {
        return ssbsectMaxEnrl;
    }

    /**
     * Enrollment Maximum
     * <p>
     * 
     * 
     */
    @JsonProperty("ssbsectMaxEnrl")
    public void setSsbsectMaxEnrl(Object ssbsectMaxEnrl) {
        this.ssbsectMaxEnrl = ssbsectMaxEnrl;
    }

    public Ssrxlst withSsbsectMaxEnrl(Object ssbsectMaxEnrl) {
        this.ssbsectMaxEnrl = ssbsectMaxEnrl;
        return this;
    }

    /**
     * Wait List Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitCapacity")
    public Object getSsbsectWaitCapacity() {
        return ssbsectWaitCapacity;
    }

    /**
     * Wait List Maximum
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitCapacity")
    public void setSsbsectWaitCapacity(Object ssbsectWaitCapacity) {
        this.ssbsectWaitCapacity = ssbsectWaitCapacity;
    }

    public Ssrxlst withSsbsectWaitCapacity(Object ssbsectWaitCapacity) {
        this.ssbsectWaitCapacity = ssbsectWaitCapacity;
        return this;
    }

    /**
     * Wait List Remaining
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitAvail")
    public Object getSsbsectWaitAvail() {
        return ssbsectWaitAvail;
    }

    /**
     * Wait List Remaining
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("ssbsectWaitAvail")
    public void setSsbsectWaitAvail(Object ssbsectWaitAvail) {
        this.ssbsectWaitAvail = ssbsectWaitAvail;
    }

    public Ssrxlst withSsbsectWaitAvail(Object ssbsectWaitAvail) {
        this.ssbsectWaitAvail = ssbsectWaitAvail;
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
        sb.append("ssbsectCreditHrs");
        sb.append('=');
        sb.append(((this.ssbsectCreditHrs == null)?"<null>":this.ssbsectCreditHrs));
        sb.append(',');
        sb.append("ssbsectSeqNumb");
        sb.append('=');
        sb.append(((this.ssbsectSeqNumb == null)?"<null>":this.ssbsectSeqNumb));
        sb.append(',');
        sb.append("orTo");
        sb.append('=');
        sb.append(((this.orTo == null)?"<null>":this.orTo));
        sb.append(',');
        sb.append("ssbsectReservedInd");
        sb.append('=');
        sb.append(((this.ssbsectReservedInd == null)?"<null>":this.ssbsectReservedInd));
        sb.append(',');
        sb.append("ssbsectSubjCode");
        sb.append('=');
        sb.append(((this.ssbsectSubjCode == null)?"<null>":this.ssbsectSubjCode));
        sb.append(',');
        sb.append("blockInd");
        sb.append('=');
        sb.append(((this.blockInd == null)?"<null>":this.blockInd));
        sb.append(',');
        sb.append("ssbsectCrseNumb");
        sb.append('=');
        sb.append(((this.ssbsectCrseNumb == null)?"<null>":this.ssbsectCrseNumb));
        sb.append(',');
        sb.append("ssbsectSeatsAvail");
        sb.append('=');
        sb.append(((this.ssbsectSeatsAvail == null)?"<null>":this.ssbsectSeatsAvail));
        sb.append(',');
        sb.append("ssbsectCampCode");
        sb.append('=');
        sb.append(((this.ssbsectCampCode == null)?"<null>":this.ssbsectCampCode));
        sb.append(',');
        sb.append("ssbsectEnrl");
        sb.append('=');
        sb.append(((this.ssbsectEnrl == null)?"<null>":this.ssbsectEnrl));
        sb.append(',');
        sb.append("ssbsectPtrmCode");
        sb.append('=');
        sb.append(((this.ssbsectPtrmCode == null)?"<null>":this.ssbsectPtrmCode));
        sb.append(',');
        sb.append("ssbsectWaitCount");
        sb.append('=');
        sb.append(((this.ssbsectWaitCount == null)?"<null>":this.ssbsectWaitCount));
        sb.append(',');
        sb.append("scbcrseCreditHrs");
        sb.append('=');
        sb.append(((this.scbcrseCreditHrs == null)?"<null>":this.scbcrseCreditHrs));
        sb.append(',');
        sb.append("ssbsectMaxEnrl");
        sb.append('=');
        sb.append(((this.ssbsectMaxEnrl == null)?"<null>":this.ssbsectMaxEnrl));
        sb.append(',');
        sb.append("ssbsectWaitCapacity");
        sb.append('=');
        sb.append(((this.ssbsectWaitCapacity == null)?"<null>":this.ssbsectWaitCapacity));
        sb.append(',');
        sb.append("ssbsectWaitAvail");
        sb.append('=');
        sb.append(((this.ssbsectWaitAvail == null)?"<null>":this.ssbsectWaitAvail));
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
        result = ((result* 31)+((this.ssbsectCreditHrs == null)? 0 :this.ssbsectCreditHrs.hashCode()));
        result = ((result* 31)+((this.ssbsectSeqNumb == null)? 0 :this.ssbsectSeqNumb.hashCode()));
        result = ((result* 31)+((this.orTo == null)? 0 :this.orTo.hashCode()));
        result = ((result* 31)+((this.ssbsectReservedInd == null)? 0 :this.ssbsectReservedInd.hashCode()));
        result = ((result* 31)+((this.ssbsectSubjCode == null)? 0 :this.ssbsectSubjCode.hashCode()));
        result = ((result* 31)+((this.blockInd == null)? 0 :this.blockInd.hashCode()));
        result = ((result* 31)+((this.ssbsectCrseNumb == null)? 0 :this.ssbsectCrseNumb.hashCode()));
        result = ((result* 31)+((this.ssbsectSeatsAvail == null)? 0 :this.ssbsectSeatsAvail.hashCode()));
        result = ((result* 31)+((this.ssbsectCampCode == null)? 0 :this.ssbsectCampCode.hashCode()));
        result = ((result* 31)+((this.ssbsectEnrl == null)? 0 :this.ssbsectEnrl.hashCode()));
        result = ((result* 31)+((this.ssbsectPtrmCode == null)? 0 :this.ssbsectPtrmCode.hashCode()));
        result = ((result* 31)+((this.ssbsectWaitCount == null)? 0 :this.ssbsectWaitCount.hashCode()));
        result = ((result* 31)+((this.scbcrseCreditHrs == null)? 0 :this.scbcrseCreditHrs.hashCode()));
        result = ((result* 31)+((this.ssbsectMaxEnrl == null)? 0 :this.ssbsectMaxEnrl.hashCode()));
        result = ((result* 31)+((this.ssbsectWaitCapacity == null)? 0 :this.ssbsectWaitCapacity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ssbsectWaitAvail == null)? 0 :this.ssbsectWaitAvail.hashCode()));
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
        return (((((((((((((((((((this.ssbsectCreditHrs == rhs.ssbsectCreditHrs)||((this.ssbsectCreditHrs!= null)&&this.ssbsectCreditHrs.equals(rhs.ssbsectCreditHrs)))&&((this.ssbsectSeqNumb == rhs.ssbsectSeqNumb)||((this.ssbsectSeqNumb!= null)&&this.ssbsectSeqNumb.equals(rhs.ssbsectSeqNumb))))&&((this.orTo == rhs.orTo)||((this.orTo!= null)&&this.orTo.equals(rhs.orTo))))&&((this.ssbsectReservedInd == rhs.ssbsectReservedInd)||((this.ssbsectReservedInd!= null)&&this.ssbsectReservedInd.equals(rhs.ssbsectReservedInd))))&&((this.ssbsectSubjCode == rhs.ssbsectSubjCode)||((this.ssbsectSubjCode!= null)&&this.ssbsectSubjCode.equals(rhs.ssbsectSubjCode))))&&((this.blockInd == rhs.blockInd)||((this.blockInd!= null)&&this.blockInd.equals(rhs.blockInd))))&&((this.ssbsectCrseNumb == rhs.ssbsectCrseNumb)||((this.ssbsectCrseNumb!= null)&&this.ssbsectCrseNumb.equals(rhs.ssbsectCrseNumb))))&&((this.ssbsectSeatsAvail == rhs.ssbsectSeatsAvail)||((this.ssbsectSeatsAvail!= null)&&this.ssbsectSeatsAvail.equals(rhs.ssbsectSeatsAvail))))&&((this.ssbsectCampCode == rhs.ssbsectCampCode)||((this.ssbsectCampCode!= null)&&this.ssbsectCampCode.equals(rhs.ssbsectCampCode))))&&((this.ssbsectEnrl == rhs.ssbsectEnrl)||((this.ssbsectEnrl!= null)&&this.ssbsectEnrl.equals(rhs.ssbsectEnrl))))&&((this.ssbsectPtrmCode == rhs.ssbsectPtrmCode)||((this.ssbsectPtrmCode!= null)&&this.ssbsectPtrmCode.equals(rhs.ssbsectPtrmCode))))&&((this.ssbsectWaitCount == rhs.ssbsectWaitCount)||((this.ssbsectWaitCount!= null)&&this.ssbsectWaitCount.equals(rhs.ssbsectWaitCount))))&&((this.scbcrseCreditHrs == rhs.scbcrseCreditHrs)||((this.scbcrseCreditHrs!= null)&&this.scbcrseCreditHrs.equals(rhs.scbcrseCreditHrs))))&&((this.ssbsectMaxEnrl == rhs.ssbsectMaxEnrl)||((this.ssbsectMaxEnrl!= null)&&this.ssbsectMaxEnrl.equals(rhs.ssbsectMaxEnrl))))&&((this.ssbsectWaitCapacity == rhs.ssbsectWaitCapacity)||((this.ssbsectWaitCapacity!= null)&&this.ssbsectWaitCapacity.equals(rhs.ssbsectWaitCapacity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ssbsectWaitAvail == rhs.ssbsectWaitAvail)||((this.ssbsectWaitAvail!= null)&&this.ssbsectWaitAvail.equals(rhs.ssbsectWaitAvail))))&&((this.crn == rhs.crn)||((this.crn!= null)&&this.crn.equals(rhs.crn))));
    }

}
