
package com.ellucian.generated.bpapi.ban.applicant_pell_grant.v1_0_0;

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
    "verPayInd",
    "pellLtHalfCoa",
    "pellDisbLockInd",
    "priSarPgi",
    "aprdCodePell",
    "sarDate",
    "sarSsnV",
    "keyblckAidyCode",
    "sarTranNo",
    "keyblckId",
    "secSarPgi",
    "displaySarInit",
    "autoZeroEfcInd"
})
@Generated("jsonschema2pojo")
public class ApplicantPellGrant100PutRequest {

    /**
     * Status
     * <p>
     * Lineage reference object : RORSTAT_VER_PAY_IND
     * 
     */
    @JsonProperty("verPayInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_VER_PAY_IND")
    private String verPayInd;
    /**
     * Less Than Half Time COA
     * <p>
     * Lineage reference object : RORSTAT_PELL_LT_HALF_COA
     * 
     */
    @JsonProperty("pellLtHalfCoa")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PELL_LT_HALF_COA")
    private Double pellLtHalfCoa;
    /**
     * Lock Pell Disbursement
     * <p>
     * Lineage reference object : RORSTAT_PELL_DISB_LOCK_IND
     * 
     */
    @JsonProperty("pellDisbLockInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PELL_DISB_LOCK_IND")
    private String pellDisbLockInd;
    /**
     * Primary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_PRI_SAR_PGI
     * 
     */
    @JsonProperty("priSarPgi")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_PRI_SAR_PGI")
    private Double priSarPgi;
    /**
     * Pell Aid Period
     * <p>
     * Lineage reference object : RORSTAT_APRD_CODE_PELL, Lookup lineage reference object : rtvaprd,robaprd
     * 
     */
    @JsonProperty("aprdCodePell")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_APRD_CODE_PELL, Lookup lineage reference object : rtvaprd,robaprd")
    private String aprdCodePell;
    /**
     * SAR Certified Date
     * <p>
     * Lineage reference object : RORSTAT_SAR_DATE
     * 
     */
    @JsonProperty("sarDate")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_SAR_DATE")
    private Date sarDate;
    @JsonProperty("sarSsnV")
    private String sarSsnV;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private String keyblckAidyCode;
    /**
     * Transaction Number
     * <p>
     * Lineage reference object : RORSTAT_SAR_TRAN_NO
     * 
     */
    @JsonProperty("sarTranNo")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_SAR_TRAN_NO")
    private String sarTranNo;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("keyblckId")
    @JsonPropertyDescription("Lineage reference object : keyblckId")
    private String keyblckId;
    /**
     * Secondary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_SEC_SAR_PGI
     * 
     */
    @JsonProperty("secSarPgi")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_SEC_SAR_PGI")
    private Double secSarPgi;
    @JsonProperty("displaySarInit")
    private String displaySarInit;
    /**
     * Auto Zero EFC
     * <p>
     * Lineage reference object : RORSTAT_AUTO_ZERO_EFC_IND
     * 
     */
    @JsonProperty("autoZeroEfcInd")
    @JsonPropertyDescription("Lineage reference object : RORSTAT_AUTO_ZERO_EFC_IND")
    private String autoZeroEfcInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : RORSTAT_VER_PAY_IND
     * 
     */
    @JsonProperty("verPayInd")
    public String getVerPayInd() {
        return verPayInd;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RORSTAT_VER_PAY_IND
     * 
     */
    @JsonProperty("verPayInd")
    public void setVerPayInd(String verPayInd) {
        this.verPayInd = verPayInd;
    }

    public ApplicantPellGrant100PutRequest withVerPayInd(String verPayInd) {
        this.verPayInd = verPayInd;
        return this;
    }

    /**
     * Less Than Half Time COA
     * <p>
     * Lineage reference object : RORSTAT_PELL_LT_HALF_COA
     * 
     */
    @JsonProperty("pellLtHalfCoa")
    public Double getPellLtHalfCoa() {
        return pellLtHalfCoa;
    }

    /**
     * Less Than Half Time COA
     * <p>
     * Lineage reference object : RORSTAT_PELL_LT_HALF_COA
     * 
     */
    @JsonProperty("pellLtHalfCoa")
    public void setPellLtHalfCoa(Double pellLtHalfCoa) {
        this.pellLtHalfCoa = pellLtHalfCoa;
    }

    public ApplicantPellGrant100PutRequest withPellLtHalfCoa(Double pellLtHalfCoa) {
        this.pellLtHalfCoa = pellLtHalfCoa;
        return this;
    }

    /**
     * Lock Pell Disbursement
     * <p>
     * Lineage reference object : RORSTAT_PELL_DISB_LOCK_IND
     * 
     */
    @JsonProperty("pellDisbLockInd")
    public String getPellDisbLockInd() {
        return pellDisbLockInd;
    }

    /**
     * Lock Pell Disbursement
     * <p>
     * Lineage reference object : RORSTAT_PELL_DISB_LOCK_IND
     * 
     */
    @JsonProperty("pellDisbLockInd")
    public void setPellDisbLockInd(String pellDisbLockInd) {
        this.pellDisbLockInd = pellDisbLockInd;
    }

    public ApplicantPellGrant100PutRequest withPellDisbLockInd(String pellDisbLockInd) {
        this.pellDisbLockInd = pellDisbLockInd;
        return this;
    }

    /**
     * Primary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_PRI_SAR_PGI
     * 
     */
    @JsonProperty("priSarPgi")
    public Double getPriSarPgi() {
        return priSarPgi;
    }

    /**
     * Primary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_PRI_SAR_PGI
     * 
     */
    @JsonProperty("priSarPgi")
    public void setPriSarPgi(Double priSarPgi) {
        this.priSarPgi = priSarPgi;
    }

    public ApplicantPellGrant100PutRequest withPriSarPgi(Double priSarPgi) {
        this.priSarPgi = priSarPgi;
        return this;
    }

    /**
     * Pell Aid Period
     * <p>
     * Lineage reference object : RORSTAT_APRD_CODE_PELL, Lookup lineage reference object : rtvaprd,robaprd
     * 
     */
    @JsonProperty("aprdCodePell")
    public String getAprdCodePell() {
        return aprdCodePell;
    }

    /**
     * Pell Aid Period
     * <p>
     * Lineage reference object : RORSTAT_APRD_CODE_PELL, Lookup lineage reference object : rtvaprd,robaprd
     * 
     */
    @JsonProperty("aprdCodePell")
    public void setAprdCodePell(String aprdCodePell) {
        this.aprdCodePell = aprdCodePell;
    }

    public ApplicantPellGrant100PutRequest withAprdCodePell(String aprdCodePell) {
        this.aprdCodePell = aprdCodePell;
        return this;
    }

    /**
     * SAR Certified Date
     * <p>
     * Lineage reference object : RORSTAT_SAR_DATE
     * 
     */
    @JsonProperty("sarDate")
    public Date getSarDate() {
        return sarDate;
    }

    /**
     * SAR Certified Date
     * <p>
     * Lineage reference object : RORSTAT_SAR_DATE
     * 
     */
    @JsonProperty("sarDate")
    public void setSarDate(Date sarDate) {
        this.sarDate = sarDate;
    }

    public ApplicantPellGrant100PutRequest withSarDate(Date sarDate) {
        this.sarDate = sarDate;
        return this;
    }

    @JsonProperty("sarSsnV")
    public String getSarSsnV() {
        return sarSsnV;
    }

    @JsonProperty("sarSsnV")
    public void setSarSsnV(String sarSsnV) {
        this.sarSsnV = sarSsnV;
    }

    public ApplicantPellGrant100PutRequest withSarSsnV(String sarSsnV) {
        this.sarSsnV = sarSsnV;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public ApplicantPellGrant100PutRequest withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : RORSTAT_SAR_TRAN_NO
     * 
     */
    @JsonProperty("sarTranNo")
    public String getSarTranNo() {
        return sarTranNo;
    }

    /**
     * Transaction Number
     * <p>
     * Lineage reference object : RORSTAT_SAR_TRAN_NO
     * 
     */
    @JsonProperty("sarTranNo")
    public void setSarTranNo(String sarTranNo) {
        this.sarTranNo = sarTranNo;
    }

    public ApplicantPellGrant100PutRequest withSarTranNo(String sarTranNo) {
        this.sarTranNo = sarTranNo;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("keyblckId")
    public String getKeyblckId() {
        return keyblckId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckId
     * 
     */
    @JsonProperty("keyblckId")
    public void setKeyblckId(String keyblckId) {
        this.keyblckId = keyblckId;
    }

    public ApplicantPellGrant100PutRequest withKeyblckId(String keyblckId) {
        this.keyblckId = keyblckId;
        return this;
    }

    /**
     * Secondary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_SEC_SAR_PGI
     * 
     */
    @JsonProperty("secSarPgi")
    public Double getSecSarPgi() {
        return secSarPgi;
    }

    /**
     * Secondary SAR EFC
     * <p>
     * Lineage reference object : RORSTAT_SEC_SAR_PGI
     * 
     */
    @JsonProperty("secSarPgi")
    public void setSecSarPgi(Double secSarPgi) {
        this.secSarPgi = secSarPgi;
    }

    public ApplicantPellGrant100PutRequest withSecSarPgi(Double secSarPgi) {
        this.secSarPgi = secSarPgi;
        return this;
    }

    @JsonProperty("displaySarInit")
    public String getDisplaySarInit() {
        return displaySarInit;
    }

    @JsonProperty("displaySarInit")
    public void setDisplaySarInit(String displaySarInit) {
        this.displaySarInit = displaySarInit;
    }

    public ApplicantPellGrant100PutRequest withDisplaySarInit(String displaySarInit) {
        this.displaySarInit = displaySarInit;
        return this;
    }

    /**
     * Auto Zero EFC
     * <p>
     * Lineage reference object : RORSTAT_AUTO_ZERO_EFC_IND
     * 
     */
    @JsonProperty("autoZeroEfcInd")
    public String getAutoZeroEfcInd() {
        return autoZeroEfcInd;
    }

    /**
     * Auto Zero EFC
     * <p>
     * Lineage reference object : RORSTAT_AUTO_ZERO_EFC_IND
     * 
     */
    @JsonProperty("autoZeroEfcInd")
    public void setAutoZeroEfcInd(String autoZeroEfcInd) {
        this.autoZeroEfcInd = autoZeroEfcInd;
    }

    public ApplicantPellGrant100PutRequest withAutoZeroEfcInd(String autoZeroEfcInd) {
        this.autoZeroEfcInd = autoZeroEfcInd;
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

    public ApplicantPellGrant100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantPellGrant100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("verPayInd");
        sb.append('=');
        sb.append(((this.verPayInd == null)?"<null>":this.verPayInd));
        sb.append(',');
        sb.append("pellLtHalfCoa");
        sb.append('=');
        sb.append(((this.pellLtHalfCoa == null)?"<null>":this.pellLtHalfCoa));
        sb.append(',');
        sb.append("pellDisbLockInd");
        sb.append('=');
        sb.append(((this.pellDisbLockInd == null)?"<null>":this.pellDisbLockInd));
        sb.append(',');
        sb.append("priSarPgi");
        sb.append('=');
        sb.append(((this.priSarPgi == null)?"<null>":this.priSarPgi));
        sb.append(',');
        sb.append("aprdCodePell");
        sb.append('=');
        sb.append(((this.aprdCodePell == null)?"<null>":this.aprdCodePell));
        sb.append(',');
        sb.append("sarDate");
        sb.append('=');
        sb.append(((this.sarDate == null)?"<null>":this.sarDate));
        sb.append(',');
        sb.append("sarSsnV");
        sb.append('=');
        sb.append(((this.sarSsnV == null)?"<null>":this.sarSsnV));
        sb.append(',');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("sarTranNo");
        sb.append('=');
        sb.append(((this.sarTranNo == null)?"<null>":this.sarTranNo));
        sb.append(',');
        sb.append("keyblckId");
        sb.append('=');
        sb.append(((this.keyblckId == null)?"<null>":this.keyblckId));
        sb.append(',');
        sb.append("secSarPgi");
        sb.append('=');
        sb.append(((this.secSarPgi == null)?"<null>":this.secSarPgi));
        sb.append(',');
        sb.append("displaySarInit");
        sb.append('=');
        sb.append(((this.displaySarInit == null)?"<null>":this.displaySarInit));
        sb.append(',');
        sb.append("autoZeroEfcInd");
        sb.append('=');
        sb.append(((this.autoZeroEfcInd == null)?"<null>":this.autoZeroEfcInd));
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
        result = ((result* 31)+((this.verPayInd == null)? 0 :this.verPayInd.hashCode()));
        result = ((result* 31)+((this.pellLtHalfCoa == null)? 0 :this.pellLtHalfCoa.hashCode()));
        result = ((result* 31)+((this.pellDisbLockInd == null)? 0 :this.pellDisbLockInd.hashCode()));
        result = ((result* 31)+((this.priSarPgi == null)? 0 :this.priSarPgi.hashCode()));
        result = ((result* 31)+((this.aprdCodePell == null)? 0 :this.aprdCodePell.hashCode()));
        result = ((result* 31)+((this.sarDate == null)? 0 :this.sarDate.hashCode()));
        result = ((result* 31)+((this.sarSsnV == null)? 0 :this.sarSsnV.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.sarTranNo == null)? 0 :this.sarTranNo.hashCode()));
        result = ((result* 31)+((this.keyblckId == null)? 0 :this.keyblckId.hashCode()));
        result = ((result* 31)+((this.secSarPgi == null)? 0 :this.secSarPgi.hashCode()));
        result = ((result* 31)+((this.displaySarInit == null)? 0 :this.displaySarInit.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.autoZeroEfcInd == null)? 0 :this.autoZeroEfcInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantPellGrant100PutRequest) == false) {
            return false;
        }
        ApplicantPellGrant100PutRequest rhs = ((ApplicantPellGrant100PutRequest) other);
        return (((((((((((((((this.verPayInd == rhs.verPayInd)||((this.verPayInd!= null)&&this.verPayInd.equals(rhs.verPayInd)))&&((this.pellLtHalfCoa == rhs.pellLtHalfCoa)||((this.pellLtHalfCoa!= null)&&this.pellLtHalfCoa.equals(rhs.pellLtHalfCoa))))&&((this.pellDisbLockInd == rhs.pellDisbLockInd)||((this.pellDisbLockInd!= null)&&this.pellDisbLockInd.equals(rhs.pellDisbLockInd))))&&((this.priSarPgi == rhs.priSarPgi)||((this.priSarPgi!= null)&&this.priSarPgi.equals(rhs.priSarPgi))))&&((this.aprdCodePell == rhs.aprdCodePell)||((this.aprdCodePell!= null)&&this.aprdCodePell.equals(rhs.aprdCodePell))))&&((this.sarDate == rhs.sarDate)||((this.sarDate!= null)&&this.sarDate.equals(rhs.sarDate))))&&((this.sarSsnV == rhs.sarSsnV)||((this.sarSsnV!= null)&&this.sarSsnV.equals(rhs.sarSsnV))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.sarTranNo == rhs.sarTranNo)||((this.sarTranNo!= null)&&this.sarTranNo.equals(rhs.sarTranNo))))&&((this.keyblckId == rhs.keyblckId)||((this.keyblckId!= null)&&this.keyblckId.equals(rhs.keyblckId))))&&((this.secSarPgi == rhs.secSarPgi)||((this.secSarPgi!= null)&&this.secSarPgi.equals(rhs.secSarPgi))))&&((this.displaySarInit == rhs.displaySarInit)||((this.displaySarInit!= null)&&this.displaySarInit.equals(rhs.displaySarInit))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.autoZeroEfcInd == rhs.autoZeroEfcInd)||((this.autoZeroEfcInd!= null)&&this.autoZeroEfcInd.equals(rhs.autoZeroEfcInd))));
    }

}
