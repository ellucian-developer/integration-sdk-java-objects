
package com.ellucian.generated.bpapi.ban.admissions_decision_prior_college_and_degree_review.v1_0_0;

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
    "stvsbgiDesc",
    "officialTrans",
    "transRevDate",
    "sbgiCode",
    "transRecvDate"
})
@Generated("jsonschema2pojo")
public class Sorpcol {

    @JsonProperty("stvsbgiDesc")
    private String stvsbgiDesc;
    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("officialTrans")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_OFFICIAL_TRANS")
    private String officialTrans;
    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_REV_DATE")
    private Date transRevDate;
    /**
     * College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi")
    private String sbgiCode;
    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_TRANS_RECV_DATE")
    private Date transRecvDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("stvsbgiDesc")
    public String getStvsbgiDesc() {
        return stvsbgiDesc;
    }

    @JsonProperty("stvsbgiDesc")
    public void setStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
    }

    public Sorpcol withStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
        return this;
    }

    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("officialTrans")
    public String getOfficialTrans() {
        return officialTrans;
    }

    /**
     * Official Transcript
     * <p>
     * Lineage reference object : SORPCOL_OFFICIAL_TRANS
     * 
     */
    @JsonProperty("officialTrans")
    public void setOfficialTrans(String officialTrans) {
        this.officialTrans = officialTrans;
    }

    public Sorpcol withOfficialTrans(String officialTrans) {
        this.officialTrans = officialTrans;
        return this;
    }

    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    public Date getTransRevDate() {
        return transRevDate;
    }

    /**
     * Transcript Reviewed Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_REV_DATE
     * 
     */
    @JsonProperty("transRevDate")
    public void setTransRevDate(Date transRevDate) {
        this.transRevDate = transRevDate;
    }

    public Sorpcol withTransRevDate(Date transRevDate) {
        this.transRevDate = transRevDate;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE, Lookup lineage reference object : stvsbgi
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public Sorpcol withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public Date getTransRecvDate() {
        return transRecvDate;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORPCOL_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public void setTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
    }

    public Sorpcol withTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
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

    public Sorpcol withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorpcol.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stvsbgiDesc");
        sb.append('=');
        sb.append(((this.stvsbgiDesc == null)?"<null>":this.stvsbgiDesc));
        sb.append(',');
        sb.append("officialTrans");
        sb.append('=');
        sb.append(((this.officialTrans == null)?"<null>":this.officialTrans));
        sb.append(',');
        sb.append("transRevDate");
        sb.append('=');
        sb.append(((this.transRevDate == null)?"<null>":this.transRevDate));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("transRecvDate");
        sb.append('=');
        sb.append(((this.transRecvDate == null)?"<null>":this.transRecvDate));
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
        result = ((result* 31)+((this.stvsbgiDesc == null)? 0 :this.stvsbgiDesc.hashCode()));
        result = ((result* 31)+((this.officialTrans == null)? 0 :this.officialTrans.hashCode()));
        result = ((result* 31)+((this.transRevDate == null)? 0 :this.transRevDate.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.transRecvDate == null)? 0 :this.transRecvDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorpcol) == false) {
            return false;
        }
        Sorpcol rhs = ((Sorpcol) other);
        return (((((((this.stvsbgiDesc == rhs.stvsbgiDesc)||((this.stvsbgiDesc!= null)&&this.stvsbgiDesc.equals(rhs.stvsbgiDesc)))&&((this.officialTrans == rhs.officialTrans)||((this.officialTrans!= null)&&this.officialTrans.equals(rhs.officialTrans))))&&((this.transRevDate == rhs.transRevDate)||((this.transRevDate!= null)&&this.transRevDate.equals(rhs.transRevDate))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.transRecvDate == rhs.transRecvDate)||((this.transRecvDate!= null)&&this.transRecvDate.equals(rhs.transRecvDate))));
    }

}
