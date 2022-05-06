
package com.ellucian.generated.bpapi.ban.applicant_requirements.v1_0_0;

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
    "disbReqCompDate",
    "tgrpCodeLockInd",
    "holdHoldInd",
    "pckgReqCompDate",
    "rtvtgrpDesc",
    "tgrpCode",
    "allReqCompDate",
    "trkLtrInd",
    "addtlReqtsInd",
    "unsatTermReqtsInd",
    "unsatPromReqtsInd"
})
@Generated("jsonschema2pojo")
public class Rorstat__2 {

    /**
     * Disbursement
     * <p>
     * Lineage reference object : RORSTAT_DISB_REQ_COMP_DATE
     * 
     */
    @JsonProperty("disbReqCompDate")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_DISB_REQ_COMP_DATE")
    private Date disbReqCompDate;
    /**
     * Lock Group
     * <p>
     * Lineage reference object : RORSTAT_TGRP_CODE_LOCK_IND
     * 
     */
    @JsonProperty("tgrpCodeLockInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_TGRP_CODE_LOCK_IND")
    private String tgrpCodeLockInd;
    /**
     * Holds exist
     * <p>
     * 
     * 
     */
    @JsonProperty("holdHoldInd")
    private String holdHoldInd;
    /**
     * Packaging
     * <p>
     * Lineage reference object : RORSTAT_PCKG_REQ_COMP_DATE
     * 
     */
    @JsonProperty("pckgReqCompDate")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PCKG_REQ_COMP_DATE")
    private Date pckgReqCompDate;
    @JsonProperty("rtvtgrpDesc")
    private String rtvtgrpDesc;
    /**
     * Tracking Group
     * <p>
     * Lineage reference object : RORSTAT_TGRP_CODE, Lookup lineage reference object : rtvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_TGRP_CODE, Lookup lineage reference object : rtvtgrp")
    private String tgrpCode;
    /**
     * All
     * <p>
     * Lineage reference object : RORSTAT_ALL_REQ_COMP_DATE
     * 
     */
    @JsonProperty("allReqCompDate")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_ALL_REQ_COMP_DATE")
    private Date allReqCompDate;
    /**
     * Request Letter
     * <p>
     * Lineage reference object : RORSTAT_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_TRK_LTR_IND")
    private String trkLtrInd;
    /**
     * Additional Requirements
     * <p>
     * 
     * 
     */
    @JsonProperty("addtlReqtsInd")
    private String addtlReqtsInd;
    /**
     * Unsatisfied Period Requirements exist
     * <p>
     * 
     * 
     */
    @JsonProperty("unsatTermReqtsInd")
    private String unsatTermReqtsInd;
    /**
     * Unsatisfied Promissory Notes exist
     * <p>
     * 
     * 
     */
    @JsonProperty("unsatPromReqtsInd")
    private String unsatPromReqtsInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Disbursement
     * <p>
     * Lineage reference object : RORSTAT_DISB_REQ_COMP_DATE
     * 
     */
    @JsonProperty("disbReqCompDate")
    public Date getDisbReqCompDate() {
        return disbReqCompDate;
    }

    /**
     * Disbursement
     * <p>
     * Lineage reference object : RORSTAT_DISB_REQ_COMP_DATE
     * 
     */
    @JsonProperty("disbReqCompDate")
    public void setDisbReqCompDate(Date disbReqCompDate) {
        this.disbReqCompDate = disbReqCompDate;
    }

    public Rorstat__2 withDisbReqCompDate(Date disbReqCompDate) {
        this.disbReqCompDate = disbReqCompDate;
        return this;
    }

    /**
     * Lock Group
     * <p>
     * Lineage reference object : RORSTAT_TGRP_CODE_LOCK_IND
     * 
     */
    @JsonProperty("tgrpCodeLockInd")
    public String getTgrpCodeLockInd() {
        return tgrpCodeLockInd;
    }

    /**
     * Lock Group
     * <p>
     * Lineage reference object : RORSTAT_TGRP_CODE_LOCK_IND
     * 
     */
    @JsonProperty("tgrpCodeLockInd")
    public void setTgrpCodeLockInd(String tgrpCodeLockInd) {
        this.tgrpCodeLockInd = tgrpCodeLockInd;
    }

    public Rorstat__2 withTgrpCodeLockInd(String tgrpCodeLockInd) {
        this.tgrpCodeLockInd = tgrpCodeLockInd;
        return this;
    }

    /**
     * Holds exist
     * <p>
     * 
     * 
     */
    @JsonProperty("holdHoldInd")
    public String getHoldHoldInd() {
        return holdHoldInd;
    }

    /**
     * Holds exist
     * <p>
     * 
     * 
     */
    @JsonProperty("holdHoldInd")
    public void setHoldHoldInd(String holdHoldInd) {
        this.holdHoldInd = holdHoldInd;
    }

    public Rorstat__2 withHoldHoldInd(String holdHoldInd) {
        this.holdHoldInd = holdHoldInd;
        return this;
    }

    /**
     * Packaging
     * <p>
     * Lineage reference object : RORSTAT_PCKG_REQ_COMP_DATE
     * 
     */
    @JsonProperty("pckgReqCompDate")
    public Date getPckgReqCompDate() {
        return pckgReqCompDate;
    }

    /**
     * Packaging
     * <p>
     * Lineage reference object : RORSTAT_PCKG_REQ_COMP_DATE
     * 
     */
    @JsonProperty("pckgReqCompDate")
    public void setPckgReqCompDate(Date pckgReqCompDate) {
        this.pckgReqCompDate = pckgReqCompDate;
    }

    public Rorstat__2 withPckgReqCompDate(Date pckgReqCompDate) {
        this.pckgReqCompDate = pckgReqCompDate;
        return this;
    }

    @JsonProperty("rtvtgrpDesc")
    public String getRtvtgrpDesc() {
        return rtvtgrpDesc;
    }

    @JsonProperty("rtvtgrpDesc")
    public void setRtvtgrpDesc(String rtvtgrpDesc) {
        this.rtvtgrpDesc = rtvtgrpDesc;
    }

    public Rorstat__2 withRtvtgrpDesc(String rtvtgrpDesc) {
        this.rtvtgrpDesc = rtvtgrpDesc;
        return this;
    }

    /**
     * Tracking Group
     * <p>
     * Lineage reference object : RORSTAT_TGRP_CODE, Lookup lineage reference object : rtvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public String getTgrpCode() {
        return tgrpCode;
    }

    /**
     * Tracking Group
     * <p>
     * Lineage reference object : RORSTAT_TGRP_CODE, Lookup lineage reference object : rtvtgrp
     * 
     */
    @JsonProperty("tgrpCode")
    public void setTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
    }

    public Rorstat__2 withTgrpCode(String tgrpCode) {
        this.tgrpCode = tgrpCode;
        return this;
    }

    /**
     * All
     * <p>
     * Lineage reference object : RORSTAT_ALL_REQ_COMP_DATE
     * 
     */
    @JsonProperty("allReqCompDate")
    public Date getAllReqCompDate() {
        return allReqCompDate;
    }

    /**
     * All
     * <p>
     * Lineage reference object : RORSTAT_ALL_REQ_COMP_DATE
     * 
     */
    @JsonProperty("allReqCompDate")
    public void setAllReqCompDate(Date allReqCompDate) {
        this.allReqCompDate = allReqCompDate;
    }

    public Rorstat__2 withAllReqCompDate(Date allReqCompDate) {
        this.allReqCompDate = allReqCompDate;
        return this;
    }

    /**
     * Request Letter
     * <p>
     * Lineage reference object : RORSTAT_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    public String getTrkLtrInd() {
        return trkLtrInd;
    }

    /**
     * Request Letter
     * <p>
     * Lineage reference object : RORSTAT_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    public void setTrkLtrInd(String trkLtrInd) {
        this.trkLtrInd = trkLtrInd;
    }

    public Rorstat__2 withTrkLtrInd(String trkLtrInd) {
        this.trkLtrInd = trkLtrInd;
        return this;
    }

    /**
     * Additional Requirements
     * <p>
     * 
     * 
     */
    @JsonProperty("addtlReqtsInd")
    public String getAddtlReqtsInd() {
        return addtlReqtsInd;
    }

    /**
     * Additional Requirements
     * <p>
     * 
     * 
     */
    @JsonProperty("addtlReqtsInd")
    public void setAddtlReqtsInd(String addtlReqtsInd) {
        this.addtlReqtsInd = addtlReqtsInd;
    }

    public Rorstat__2 withAddtlReqtsInd(String addtlReqtsInd) {
        this.addtlReqtsInd = addtlReqtsInd;
        return this;
    }

    /**
     * Unsatisfied Period Requirements exist
     * <p>
     * 
     * 
     */
    @JsonProperty("unsatTermReqtsInd")
    public String getUnsatTermReqtsInd() {
        return unsatTermReqtsInd;
    }

    /**
     * Unsatisfied Period Requirements exist
     * <p>
     * 
     * 
     */
    @JsonProperty("unsatTermReqtsInd")
    public void setUnsatTermReqtsInd(String unsatTermReqtsInd) {
        this.unsatTermReqtsInd = unsatTermReqtsInd;
    }

    public Rorstat__2 withUnsatTermReqtsInd(String unsatTermReqtsInd) {
        this.unsatTermReqtsInd = unsatTermReqtsInd;
        return this;
    }

    /**
     * Unsatisfied Promissory Notes exist
     * <p>
     * 
     * 
     */
    @JsonProperty("unsatPromReqtsInd")
    public String getUnsatPromReqtsInd() {
        return unsatPromReqtsInd;
    }

    /**
     * Unsatisfied Promissory Notes exist
     * <p>
     * 
     * 
     */
    @JsonProperty("unsatPromReqtsInd")
    public void setUnsatPromReqtsInd(String unsatPromReqtsInd) {
        this.unsatPromReqtsInd = unsatPromReqtsInd;
    }

    public Rorstat__2 withUnsatPromReqtsInd(String unsatPromReqtsInd) {
        this.unsatPromReqtsInd = unsatPromReqtsInd;
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

    public Rorstat__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rorstat__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("disbReqCompDate");
        sb.append('=');
        sb.append(((this.disbReqCompDate == null)?"<null>":this.disbReqCompDate));
        sb.append(',');
        sb.append("tgrpCodeLockInd");
        sb.append('=');
        sb.append(((this.tgrpCodeLockInd == null)?"<null>":this.tgrpCodeLockInd));
        sb.append(',');
        sb.append("holdHoldInd");
        sb.append('=');
        sb.append(((this.holdHoldInd == null)?"<null>":this.holdHoldInd));
        sb.append(',');
        sb.append("pckgReqCompDate");
        sb.append('=');
        sb.append(((this.pckgReqCompDate == null)?"<null>":this.pckgReqCompDate));
        sb.append(',');
        sb.append("rtvtgrpDesc");
        sb.append('=');
        sb.append(((this.rtvtgrpDesc == null)?"<null>":this.rtvtgrpDesc));
        sb.append(',');
        sb.append("tgrpCode");
        sb.append('=');
        sb.append(((this.tgrpCode == null)?"<null>":this.tgrpCode));
        sb.append(',');
        sb.append("allReqCompDate");
        sb.append('=');
        sb.append(((this.allReqCompDate == null)?"<null>":this.allReqCompDate));
        sb.append(',');
        sb.append("trkLtrInd");
        sb.append('=');
        sb.append(((this.trkLtrInd == null)?"<null>":this.trkLtrInd));
        sb.append(',');
        sb.append("addtlReqtsInd");
        sb.append('=');
        sb.append(((this.addtlReqtsInd == null)?"<null>":this.addtlReqtsInd));
        sb.append(',');
        sb.append("unsatTermReqtsInd");
        sb.append('=');
        sb.append(((this.unsatTermReqtsInd == null)?"<null>":this.unsatTermReqtsInd));
        sb.append(',');
        sb.append("unsatPromReqtsInd");
        sb.append('=');
        sb.append(((this.unsatPromReqtsInd == null)?"<null>":this.unsatPromReqtsInd));
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
        result = ((result* 31)+((this.disbReqCompDate == null)? 0 :this.disbReqCompDate.hashCode()));
        result = ((result* 31)+((this.holdHoldInd == null)? 0 :this.holdHoldInd.hashCode()));
        result = ((result* 31)+((this.tgrpCode == null)? 0 :this.tgrpCode.hashCode()));
        result = ((result* 31)+((this.allReqCompDate == null)? 0 :this.allReqCompDate.hashCode()));
        result = ((result* 31)+((this.trkLtrInd == null)? 0 :this.trkLtrInd.hashCode()));
        result = ((result* 31)+((this.unsatPromReqtsInd == null)? 0 :this.unsatPromReqtsInd.hashCode()));
        result = ((result* 31)+((this.tgrpCodeLockInd == null)? 0 :this.tgrpCodeLockInd.hashCode()));
        result = ((result* 31)+((this.pckgReqCompDate == null)? 0 :this.pckgReqCompDate.hashCode()));
        result = ((result* 31)+((this.rtvtgrpDesc == null)? 0 :this.rtvtgrpDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.addtlReqtsInd == null)? 0 :this.addtlReqtsInd.hashCode()));
        result = ((result* 31)+((this.unsatTermReqtsInd == null)? 0 :this.unsatTermReqtsInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rorstat__2) == false) {
            return false;
        }
        Rorstat__2 rhs = ((Rorstat__2) other);
        return (((((((((((((this.disbReqCompDate == rhs.disbReqCompDate)||((this.disbReqCompDate!= null)&&this.disbReqCompDate.equals(rhs.disbReqCompDate)))&&((this.holdHoldInd == rhs.holdHoldInd)||((this.holdHoldInd!= null)&&this.holdHoldInd.equals(rhs.holdHoldInd))))&&((this.tgrpCode == rhs.tgrpCode)||((this.tgrpCode!= null)&&this.tgrpCode.equals(rhs.tgrpCode))))&&((this.allReqCompDate == rhs.allReqCompDate)||((this.allReqCompDate!= null)&&this.allReqCompDate.equals(rhs.allReqCompDate))))&&((this.trkLtrInd == rhs.trkLtrInd)||((this.trkLtrInd!= null)&&this.trkLtrInd.equals(rhs.trkLtrInd))))&&((this.unsatPromReqtsInd == rhs.unsatPromReqtsInd)||((this.unsatPromReqtsInd!= null)&&this.unsatPromReqtsInd.equals(rhs.unsatPromReqtsInd))))&&((this.tgrpCodeLockInd == rhs.tgrpCodeLockInd)||((this.tgrpCodeLockInd!= null)&&this.tgrpCodeLockInd.equals(rhs.tgrpCodeLockInd))))&&((this.pckgReqCompDate == rhs.pckgReqCompDate)||((this.pckgReqCompDate!= null)&&this.pckgReqCompDate.equals(rhs.pckgReqCompDate))))&&((this.rtvtgrpDesc == rhs.rtvtgrpDesc)||((this.rtvtgrpDesc!= null)&&this.rtvtgrpDesc.equals(rhs.rtvtgrpDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.addtlReqtsInd == rhs.addtlReqtsInd)||((this.addtlReqtsInd!= null)&&this.addtlReqtsInd.equals(rhs.addtlReqtsInd))))&&((this.unsatTermReqtsInd == rhs.unsatTermReqtsInd)||((this.unsatTermReqtsInd!= null)&&this.unsatTermReqtsInd.equals(rhs.unsatTermReqtsInd))));
    }

}
