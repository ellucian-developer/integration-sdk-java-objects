
package com.ellucian.generated.bpapi.ban.certification_information.v1_0_0;

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
    "certNo",
    "lcsvCode",
    "statCode",
    "natnCode",
    "certCode",
    "certDate",
    "endsCode",
    "expireDate",
    "id",
    "nextCertDate",
    "endsDate"
})
@Generated("jsonschema2pojo")
public class CertificationInformation100PostRequest {

    /**
     * Certification Number
     * <p>
     * Lineage reference object : PPRCERT_CERT_NO
     * 
     */
    @JsonProperty("certNo")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_CERT_NO")
    private String certNo;
    /**
     * License or Certification Status
     * <p>
     * Lineage reference object : PPRCERT_LCSV_CODE, Lookup lineage reference object : ptvlcsv
     * 
     */
    @JsonProperty("lcsvCode")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_LCSV_CODE, Lookup lineage reference object : ptvlcsv")
    private String lcsvCode;
    /**
     * State or Province
     * <p>
     * Lineage reference object : PPRCERT_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_STAT_CODE, Lookup lineage reference object : stvstat")
    private String statCode;
    /**
     * Nation or Country
     * <p>
     * Lineage reference object : PPRCERT_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String natnCode;
    /**
     * Certification Code
     * <p>
     * Lineage reference object : PPRCERT_CERT_CODE
     * (Required)
     * 
     */
    @JsonProperty("certCode")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_CERT_CODE")
    private String certCode;
    /**
     * Certification Date
     * <p>
     * Lineage reference object : PPRCERT_CERT_DATE
     * 
     */
    @JsonProperty("certDate")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_CERT_DATE")
    private Date certDate;
    /**
     * Endorsement Code
     * <p>
     * Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends
     * (Required)
     * 
     */
    @JsonProperty("endsCode")
    @JsonPropertyDescription("Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends")
    private String endsCode;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PPRCERT_EXPIRE_DATE
     * 
     */
    @JsonProperty("expireDate")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_EXPIRE_DATE")
    private Date expireDate;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Next Certification Date
     * <p>
     * Lineage reference object : PPRCERT_NEXT_CERT_DATE
     * 
     */
    @JsonProperty("nextCertDate")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_NEXT_CERT_DATE")
    private Date nextCertDate;
    /**
     * Endorsement Date
     * <p>
     * Lineage reference object : PPRENDS_ENDS_DATE
     * (Required)
     * 
     */
    @JsonProperty("endsDate")
    @JsonPropertyDescription("Lineage reference object : PPRENDS_ENDS_DATE")
    private Date endsDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Certification Number
     * <p>
     * Lineage reference object : PPRCERT_CERT_NO
     * 
     */
    @JsonProperty("certNo")
    public String getCertNo() {
        return certNo;
    }

    /**
     * Certification Number
     * <p>
     * Lineage reference object : PPRCERT_CERT_NO
     * 
     */
    @JsonProperty("certNo")
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public CertificationInformation100PostRequest withCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }

    /**
     * License or Certification Status
     * <p>
     * Lineage reference object : PPRCERT_LCSV_CODE, Lookup lineage reference object : ptvlcsv
     * 
     */
    @JsonProperty("lcsvCode")
    public String getLcsvCode() {
        return lcsvCode;
    }

    /**
     * License or Certification Status
     * <p>
     * Lineage reference object : PPRCERT_LCSV_CODE, Lookup lineage reference object : ptvlcsv
     * 
     */
    @JsonProperty("lcsvCode")
    public void setLcsvCode(String lcsvCode) {
        this.lcsvCode = lcsvCode;
    }

    public CertificationInformation100PostRequest withLcsvCode(String lcsvCode) {
        this.lcsvCode = lcsvCode;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : PPRCERT_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public String getStatCode() {
        return statCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : PPRCERT_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("statCode")
    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public CertificationInformation100PostRequest withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Nation or Country
     * <p>
     * Lineage reference object : PPRCERT_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public String getNatnCode() {
        return natnCode;
    }

    /**
     * Nation or Country
     * <p>
     * Lineage reference object : PPRCERT_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("natnCode")
    public void setNatnCode(String natnCode) {
        this.natnCode = natnCode;
    }

    public CertificationInformation100PostRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * Certification Code
     * <p>
     * Lineage reference object : PPRCERT_CERT_CODE
     * (Required)
     * 
     */
    @JsonProperty("certCode")
    public String getCertCode() {
        return certCode;
    }

    /**
     * Certification Code
     * <p>
     * Lineage reference object : PPRCERT_CERT_CODE
     * (Required)
     * 
     */
    @JsonProperty("certCode")
    public void setCertCode(String certCode) {
        this.certCode = certCode;
    }

    public CertificationInformation100PostRequest withCertCode(String certCode) {
        this.certCode = certCode;
        return this;
    }

    /**
     * Certification Date
     * <p>
     * Lineage reference object : PPRCERT_CERT_DATE
     * 
     */
    @JsonProperty("certDate")
    public Date getCertDate() {
        return certDate;
    }

    /**
     * Certification Date
     * <p>
     * Lineage reference object : PPRCERT_CERT_DATE
     * 
     */
    @JsonProperty("certDate")
    public void setCertDate(Date certDate) {
        this.certDate = certDate;
    }

    public CertificationInformation100PostRequest withCertDate(Date certDate) {
        this.certDate = certDate;
        return this;
    }

    /**
     * Endorsement Code
     * <p>
     * Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends
     * (Required)
     * 
     */
    @JsonProperty("endsCode")
    public String getEndsCode() {
        return endsCode;
    }

    /**
     * Endorsement Code
     * <p>
     * Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends
     * (Required)
     * 
     */
    @JsonProperty("endsCode")
    public void setEndsCode(String endsCode) {
        this.endsCode = endsCode;
    }

    public CertificationInformation100PostRequest withEndsCode(String endsCode) {
        this.endsCode = endsCode;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PPRCERT_EXPIRE_DATE
     * 
     */
    @JsonProperty("expireDate")
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PPRCERT_EXPIRE_DATE
     * 
     */
    @JsonProperty("expireDate")
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public CertificationInformation100PostRequest withExpireDate(Date expireDate) {
        this.expireDate = expireDate;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public CertificationInformation100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Next Certification Date
     * <p>
     * Lineage reference object : PPRCERT_NEXT_CERT_DATE
     * 
     */
    @JsonProperty("nextCertDate")
    public Date getNextCertDate() {
        return nextCertDate;
    }

    /**
     * Next Certification Date
     * <p>
     * Lineage reference object : PPRCERT_NEXT_CERT_DATE
     * 
     */
    @JsonProperty("nextCertDate")
    public void setNextCertDate(Date nextCertDate) {
        this.nextCertDate = nextCertDate;
    }

    public CertificationInformation100PostRequest withNextCertDate(Date nextCertDate) {
        this.nextCertDate = nextCertDate;
        return this;
    }

    /**
     * Endorsement Date
     * <p>
     * Lineage reference object : PPRENDS_ENDS_DATE
     * (Required)
     * 
     */
    @JsonProperty("endsDate")
    public Date getEndsDate() {
        return endsDate;
    }

    /**
     * Endorsement Date
     * <p>
     * Lineage reference object : PPRENDS_ENDS_DATE
     * (Required)
     * 
     */
    @JsonProperty("endsDate")
    public void setEndsDate(Date endsDate) {
        this.endsDate = endsDate;
    }

    public CertificationInformation100PostRequest withEndsDate(Date endsDate) {
        this.endsDate = endsDate;
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

    public CertificationInformation100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CertificationInformation100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("certNo");
        sb.append('=');
        sb.append(((this.certNo == null)?"<null>":this.certNo));
        sb.append(',');
        sb.append("lcsvCode");
        sb.append('=');
        sb.append(((this.lcsvCode == null)?"<null>":this.lcsvCode));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("certCode");
        sb.append('=');
        sb.append(((this.certCode == null)?"<null>":this.certCode));
        sb.append(',');
        sb.append("certDate");
        sb.append('=');
        sb.append(((this.certDate == null)?"<null>":this.certDate));
        sb.append(',');
        sb.append("endsCode");
        sb.append('=');
        sb.append(((this.endsCode == null)?"<null>":this.endsCode));
        sb.append(',');
        sb.append("expireDate");
        sb.append('=');
        sb.append(((this.expireDate == null)?"<null>":this.expireDate));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nextCertDate");
        sb.append('=');
        sb.append(((this.nextCertDate == null)?"<null>":this.nextCertDate));
        sb.append(',');
        sb.append("endsDate");
        sb.append('=');
        sb.append(((this.endsDate == null)?"<null>":this.endsDate));
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
        result = ((result* 31)+((this.lcsvCode == null)? 0 :this.lcsvCode.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.certCode == null)? 0 :this.certCode.hashCode()));
        result = ((result* 31)+((this.certDate == null)? 0 :this.certDate.hashCode()));
        result = ((result* 31)+((this.nextCertDate == null)? 0 :this.nextCertDate.hashCode()));
        result = ((result* 31)+((this.certNo == null)? 0 :this.certNo.hashCode()));
        result = ((result* 31)+((this.endsCode == null)? 0 :this.endsCode.hashCode()));
        result = ((result* 31)+((this.expireDate == null)? 0 :this.expireDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.endsDate == null)? 0 :this.endsDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CertificationInformation100PostRequest) == false) {
            return false;
        }
        CertificationInformation100PostRequest rhs = ((CertificationInformation100PostRequest) other);
        return (((((((((((((this.lcsvCode == rhs.lcsvCode)||((this.lcsvCode!= null)&&this.lcsvCode.equals(rhs.lcsvCode)))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.certCode == rhs.certCode)||((this.certCode!= null)&&this.certCode.equals(rhs.certCode))))&&((this.certDate == rhs.certDate)||((this.certDate!= null)&&this.certDate.equals(rhs.certDate))))&&((this.nextCertDate == rhs.nextCertDate)||((this.nextCertDate!= null)&&this.nextCertDate.equals(rhs.nextCertDate))))&&((this.certNo == rhs.certNo)||((this.certNo!= null)&&this.certNo.equals(rhs.certNo))))&&((this.endsCode == rhs.endsCode)||((this.endsCode!= null)&&this.endsCode.equals(rhs.endsCode))))&&((this.expireDate == rhs.expireDate)||((this.expireDate!= null)&&this.expireDate.equals(rhs.expireDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.endsDate == rhs.endsDate)||((this.endsDate!= null)&&this.endsDate.equals(rhs.endsDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
