
package com.ellucian.generated.bpapi.ban.prior_college_prior_college_and_degree.v1_0_0;

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
    "admrCode",
    "stvsbgiDesc",
    "officialTrans",
    "transRevDate",
    "stvadmrDesc",
    "sbgiCode",
    "epsCode",
    "transRecvDate"
})
@Generated("jsonschema2pojo")
public class Sorpcol {

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Prior College Description
     * <p>
     * 
     * 
     */
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
     * Admissions Request Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmrDesc")
    private String stvadmrDesc;
    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORPCOL_SBGI_CODE")
    private String sbgiCode;
    /**
     * Enrollment Planning Service Code
     * <p>
     * 
     * 
     */
    @JsonProperty("epsCode")
    private String epsCode;
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

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : SORPCOL_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public Sorpcol withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Prior College Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvsbgiDesc")
    public String getStvsbgiDesc() {
        return stvsbgiDesc;
    }

    /**
     * Prior College Description
     * <p>
     * 
     * 
     */
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
     * Admissions Request Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmrDesc")
    public String getStvadmrDesc() {
        return stvadmrDesc;
    }

    /**
     * Admissions Request Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmrDesc")
    public void setStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
    }

    public Sorpcol withStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
        return this;
    }

    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * Prior College
     * <p>
     * Lineage reference object : SORPCOL_SBGI_CODE
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
     * Enrollment Planning Service Code
     * <p>
     * 
     * 
     */
    @JsonProperty("epsCode")
    public String getEpsCode() {
        return epsCode;
    }

    /**
     * Enrollment Planning Service Code
     * <p>
     * 
     * 
     */
    @JsonProperty("epsCode")
    public void setEpsCode(String epsCode) {
        this.epsCode = epsCode;
    }

    public Sorpcol withEpsCode(String epsCode) {
        this.epsCode = epsCode;
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
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
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
        sb.append("stvadmrDesc");
        sb.append('=');
        sb.append(((this.stvadmrDesc == null)?"<null>":this.stvadmrDesc));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("epsCode");
        sb.append('=');
        sb.append(((this.epsCode == null)?"<null>":this.epsCode));
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
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.stvsbgiDesc == null)? 0 :this.stvsbgiDesc.hashCode()));
        result = ((result* 31)+((this.officialTrans == null)? 0 :this.officialTrans.hashCode()));
        result = ((result* 31)+((this.transRevDate == null)? 0 :this.transRevDate.hashCode()));
        result = ((result* 31)+((this.stvadmrDesc == null)? 0 :this.stvadmrDesc.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.epsCode == null)? 0 :this.epsCode.hashCode()));
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
        return ((((((((((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode)))&&((this.stvsbgiDesc == rhs.stvsbgiDesc)||((this.stvsbgiDesc!= null)&&this.stvsbgiDesc.equals(rhs.stvsbgiDesc))))&&((this.officialTrans == rhs.officialTrans)||((this.officialTrans!= null)&&this.officialTrans.equals(rhs.officialTrans))))&&((this.transRevDate == rhs.transRevDate)||((this.transRevDate!= null)&&this.transRevDate.equals(rhs.transRevDate))))&&((this.stvadmrDesc == rhs.stvadmrDesc)||((this.stvadmrDesc!= null)&&this.stvadmrDesc.equals(rhs.stvadmrDesc))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.epsCode == rhs.epsCode)||((this.epsCode!= null)&&this.epsCode.equals(rhs.epsCode))))&&((this.transRecvDate == rhs.transRecvDate)||((this.transRecvDate!= null)&&this.transRecvDate.equals(rhs.transRecvDate))));
    }

}
