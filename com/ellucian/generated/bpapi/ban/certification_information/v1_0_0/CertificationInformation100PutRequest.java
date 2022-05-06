
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
    "lcsvCode",
    "certCode",
    "certDate",
    "nextCertDate",
    "criteria.expireDate",
    "criteria.endsDate",
    "criteria.endsCode",
    "criteria.lcsvCode",
    "criteria.statDesc",
    "criteria.natnCode",
    "criteria.certDesc",
    "endsCode",
    "expireDate",
    "id",
    "endsDate",
    "statCode",
    "criteria.endsDesc",
    "criteria.nextCertDate",
    "natnCode",
    "criteria.statCode",
    "criteria.natnDesc",
    "certNo",
    "criteria.certCode",
    "criteria.certDate",
    "criteria.certNo",
    "criteria.lcsvDesc"
})
@Generated("jsonschema2pojo")
public class CertificationInformation100PutRequest {

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
     * Next Certification Date
     * <p>
     * Lineage reference object : PPRCERT_NEXT_CERT_DATE
     * 
     */
    @JsonProperty("nextCertDate")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_NEXT_CERT_DATE")
    private Date nextCertDate;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PPRCERT_EXPIRE_DATE
     * 
     */
    @JsonProperty("criteria.expireDate")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_EXPIRE_DATE")
    private Date criteriaExpireDate;
    /**
     * Endorsement Date
     * <p>
     * Lineage reference object : PPRENDS_ENDS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endsDate")
    @JsonPropertyDescription("Lineage reference object : PPRENDS_ENDS_DATE")
    private Date criteriaEndsDate;
    /**
     * Endorsement Code
     * <p>
     * Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends
     * (Required)
     * 
     */
    @JsonProperty("criteria.endsCode")
    @JsonPropertyDescription("Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends")
    private String criteriaEndsCode;
    /**
     * License or Certification Status
     * <p>
     * Lineage reference object : PPRCERT_LCSV_CODE, Lookup lineage reference object : ptvlcsv
     * 
     */
    @JsonProperty("criteria.lcsvCode")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_LCSV_CODE, Lookup lineage reference object : ptvlcsv")
    private String criteriaLcsvCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.statDesc")
    private String criteriaStatDesc;
    /**
     * Nation or Country
     * <p>
     * Lineage reference object : PPRCERT_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_NATN_CODE, Lookup lineage reference object : stvnatn")
    private String criteriaNatnCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.certDesc")
    private String criteriaCertDesc;
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
     * Endorsement Date
     * <p>
     * Lineage reference object : PPRENDS_ENDS_DATE
     * (Required)
     * 
     */
    @JsonProperty("endsDate")
    @JsonPropertyDescription("Lineage reference object : PPRENDS_ENDS_DATE")
    private Date endsDate;
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
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.endsDesc")
    private String criteriaEndsDesc;
    /**
     * Next Certification Date
     * <p>
     * Lineage reference object : PPRCERT_NEXT_CERT_DATE
     * 
     */
    @JsonProperty("criteria.nextCertDate")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_NEXT_CERT_DATE")
    private Date criteriaNextCertDate;
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
     * State or Province
     * <p>
     * Lineage reference object : PPRCERT_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_STAT_CODE, Lookup lineage reference object : stvstat")
    private String criteriaStatCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.natnDesc")
    private String criteriaNatnDesc;
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
     * Certification Code
     * <p>
     * Lineage reference object : PPRCERT_CERT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.certCode")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_CERT_CODE")
    private String criteriaCertCode;
    /**
     * Certification Date
     * <p>
     * Lineage reference object : PPRCERT_CERT_DATE
     * 
     */
    @JsonProperty("criteria.certDate")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_CERT_DATE")
    private Date criteriaCertDate;
    /**
     * Certification Number
     * <p>
     * Lineage reference object : PPRCERT_CERT_NO
     * 
     */
    @JsonProperty("criteria.certNo")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_CERT_NO")
    private String criteriaCertNo;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.lcsvDesc")
    private String criteriaLcsvDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public CertificationInformation100PutRequest withLcsvCode(String lcsvCode) {
        this.lcsvCode = lcsvCode;
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

    public CertificationInformation100PutRequest withCertCode(String certCode) {
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

    public CertificationInformation100PutRequest withCertDate(Date certDate) {
        this.certDate = certDate;
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

    public CertificationInformation100PutRequest withNextCertDate(Date nextCertDate) {
        this.nextCertDate = nextCertDate;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PPRCERT_EXPIRE_DATE
     * 
     */
    @JsonProperty("criteria.expireDate")
    public Date getCriteriaExpireDate() {
        return criteriaExpireDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : PPRCERT_EXPIRE_DATE
     * 
     */
    @JsonProperty("criteria.expireDate")
    public void setCriteriaExpireDate(Date criteriaExpireDate) {
        this.criteriaExpireDate = criteriaExpireDate;
    }

    public CertificationInformation100PutRequest withCriteriaExpireDate(Date criteriaExpireDate) {
        this.criteriaExpireDate = criteriaExpireDate;
        return this;
    }

    /**
     * Endorsement Date
     * <p>
     * Lineage reference object : PPRENDS_ENDS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endsDate")
    public Date getCriteriaEndsDate() {
        return criteriaEndsDate;
    }

    /**
     * Endorsement Date
     * <p>
     * Lineage reference object : PPRENDS_ENDS_DATE
     * (Required)
     * 
     */
    @JsonProperty("criteria.endsDate")
    public void setCriteriaEndsDate(Date criteriaEndsDate) {
        this.criteriaEndsDate = criteriaEndsDate;
    }

    public CertificationInformation100PutRequest withCriteriaEndsDate(Date criteriaEndsDate) {
        this.criteriaEndsDate = criteriaEndsDate;
        return this;
    }

    /**
     * Endorsement Code
     * <p>
     * Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends
     * (Required)
     * 
     */
    @JsonProperty("criteria.endsCode")
    public String getCriteriaEndsCode() {
        return criteriaEndsCode;
    }

    /**
     * Endorsement Code
     * <p>
     * Lineage reference object : PPRENDS_ENDS_CODE, Lookup lineage reference object : ptvends
     * (Required)
     * 
     */
    @JsonProperty("criteria.endsCode")
    public void setCriteriaEndsCode(String criteriaEndsCode) {
        this.criteriaEndsCode = criteriaEndsCode;
    }

    public CertificationInformation100PutRequest withCriteriaEndsCode(String criteriaEndsCode) {
        this.criteriaEndsCode = criteriaEndsCode;
        return this;
    }

    /**
     * License or Certification Status
     * <p>
     * Lineage reference object : PPRCERT_LCSV_CODE, Lookup lineage reference object : ptvlcsv
     * 
     */
    @JsonProperty("criteria.lcsvCode")
    public String getCriteriaLcsvCode() {
        return criteriaLcsvCode;
    }

    /**
     * License or Certification Status
     * <p>
     * Lineage reference object : PPRCERT_LCSV_CODE, Lookup lineage reference object : ptvlcsv
     * 
     */
    @JsonProperty("criteria.lcsvCode")
    public void setCriteriaLcsvCode(String criteriaLcsvCode) {
        this.criteriaLcsvCode = criteriaLcsvCode;
    }

    public CertificationInformation100PutRequest withCriteriaLcsvCode(String criteriaLcsvCode) {
        this.criteriaLcsvCode = criteriaLcsvCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.statDesc")
    public String getCriteriaStatDesc() {
        return criteriaStatDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.statDesc")
    public void setCriteriaStatDesc(String criteriaStatDesc) {
        this.criteriaStatDesc = criteriaStatDesc;
    }

    public CertificationInformation100PutRequest withCriteriaStatDesc(String criteriaStatDesc) {
        this.criteriaStatDesc = criteriaStatDesc;
        return this;
    }

    /**
     * Nation or Country
     * <p>
     * Lineage reference object : PPRCERT_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public String getCriteriaNatnCode() {
        return criteriaNatnCode;
    }

    /**
     * Nation or Country
     * <p>
     * Lineage reference object : PPRCERT_NATN_CODE, Lookup lineage reference object : stvnatn
     * 
     */
    @JsonProperty("criteria.natnCode")
    public void setCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
    }

    public CertificationInformation100PutRequest withCriteriaNatnCode(String criteriaNatnCode) {
        this.criteriaNatnCode = criteriaNatnCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.certDesc")
    public String getCriteriaCertDesc() {
        return criteriaCertDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.certDesc")
    public void setCriteriaCertDesc(String criteriaCertDesc) {
        this.criteriaCertDesc = criteriaCertDesc;
    }

    public CertificationInformation100PutRequest withCriteriaCertDesc(String criteriaCertDesc) {
        this.criteriaCertDesc = criteriaCertDesc;
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

    public CertificationInformation100PutRequest withEndsCode(String endsCode) {
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

    public CertificationInformation100PutRequest withExpireDate(Date expireDate) {
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

    public CertificationInformation100PutRequest withId(Object id) {
        this.id = id;
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

    public CertificationInformation100PutRequest withEndsDate(Date endsDate) {
        this.endsDate = endsDate;
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

    public CertificationInformation100PutRequest withStatCode(String statCode) {
        this.statCode = statCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.endsDesc")
    public String getCriteriaEndsDesc() {
        return criteriaEndsDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.endsDesc")
    public void setCriteriaEndsDesc(String criteriaEndsDesc) {
        this.criteriaEndsDesc = criteriaEndsDesc;
    }

    public CertificationInformation100PutRequest withCriteriaEndsDesc(String criteriaEndsDesc) {
        this.criteriaEndsDesc = criteriaEndsDesc;
        return this;
    }

    /**
     * Next Certification Date
     * <p>
     * Lineage reference object : PPRCERT_NEXT_CERT_DATE
     * 
     */
    @JsonProperty("criteria.nextCertDate")
    public Date getCriteriaNextCertDate() {
        return criteriaNextCertDate;
    }

    /**
     * Next Certification Date
     * <p>
     * Lineage reference object : PPRCERT_NEXT_CERT_DATE
     * 
     */
    @JsonProperty("criteria.nextCertDate")
    public void setCriteriaNextCertDate(Date criteriaNextCertDate) {
        this.criteriaNextCertDate = criteriaNextCertDate;
    }

    public CertificationInformation100PutRequest withCriteriaNextCertDate(Date criteriaNextCertDate) {
        this.criteriaNextCertDate = criteriaNextCertDate;
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

    public CertificationInformation100PutRequest withNatnCode(String natnCode) {
        this.natnCode = natnCode;
        return this;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : PPRCERT_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    public String getCriteriaStatCode() {
        return criteriaStatCode;
    }

    /**
     * State or Province
     * <p>
     * Lineage reference object : PPRCERT_STAT_CODE, Lookup lineage reference object : stvstat
     * 
     */
    @JsonProperty("criteria.statCode")
    public void setCriteriaStatCode(String criteriaStatCode) {
        this.criteriaStatCode = criteriaStatCode;
    }

    public CertificationInformation100PutRequest withCriteriaStatCode(String criteriaStatCode) {
        this.criteriaStatCode = criteriaStatCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.natnDesc")
    public String getCriteriaNatnDesc() {
        return criteriaNatnDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.natnDesc")
    public void setCriteriaNatnDesc(String criteriaNatnDesc) {
        this.criteriaNatnDesc = criteriaNatnDesc;
    }

    public CertificationInformation100PutRequest withCriteriaNatnDesc(String criteriaNatnDesc) {
        this.criteriaNatnDesc = criteriaNatnDesc;
        return this;
    }

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

    public CertificationInformation100PutRequest withCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }

    /**
     * Certification Code
     * <p>
     * Lineage reference object : PPRCERT_CERT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.certCode")
    public String getCriteriaCertCode() {
        return criteriaCertCode;
    }

    /**
     * Certification Code
     * <p>
     * Lineage reference object : PPRCERT_CERT_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.certCode")
    public void setCriteriaCertCode(String criteriaCertCode) {
        this.criteriaCertCode = criteriaCertCode;
    }

    public CertificationInformation100PutRequest withCriteriaCertCode(String criteriaCertCode) {
        this.criteriaCertCode = criteriaCertCode;
        return this;
    }

    /**
     * Certification Date
     * <p>
     * Lineage reference object : PPRCERT_CERT_DATE
     * 
     */
    @JsonProperty("criteria.certDate")
    public Date getCriteriaCertDate() {
        return criteriaCertDate;
    }

    /**
     * Certification Date
     * <p>
     * Lineage reference object : PPRCERT_CERT_DATE
     * 
     */
    @JsonProperty("criteria.certDate")
    public void setCriteriaCertDate(Date criteriaCertDate) {
        this.criteriaCertDate = criteriaCertDate;
    }

    public CertificationInformation100PutRequest withCriteriaCertDate(Date criteriaCertDate) {
        this.criteriaCertDate = criteriaCertDate;
        return this;
    }

    /**
     * Certification Number
     * <p>
     * Lineage reference object : PPRCERT_CERT_NO
     * 
     */
    @JsonProperty("criteria.certNo")
    public String getCriteriaCertNo() {
        return criteriaCertNo;
    }

    /**
     * Certification Number
     * <p>
     * Lineage reference object : PPRCERT_CERT_NO
     * 
     */
    @JsonProperty("criteria.certNo")
    public void setCriteriaCertNo(String criteriaCertNo) {
        this.criteriaCertNo = criteriaCertNo;
    }

    public CertificationInformation100PutRequest withCriteriaCertNo(String criteriaCertNo) {
        this.criteriaCertNo = criteriaCertNo;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.lcsvDesc")
    public String getCriteriaLcsvDesc() {
        return criteriaLcsvDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("criteria.lcsvDesc")
    public void setCriteriaLcsvDesc(String criteriaLcsvDesc) {
        this.criteriaLcsvDesc = criteriaLcsvDesc;
    }

    public CertificationInformation100PutRequest withCriteriaLcsvDesc(String criteriaLcsvDesc) {
        this.criteriaLcsvDesc = criteriaLcsvDesc;
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

    public CertificationInformation100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CertificationInformation100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("lcsvCode");
        sb.append('=');
        sb.append(((this.lcsvCode == null)?"<null>":this.lcsvCode));
        sb.append(',');
        sb.append("certCode");
        sb.append('=');
        sb.append(((this.certCode == null)?"<null>":this.certCode));
        sb.append(',');
        sb.append("certDate");
        sb.append('=');
        sb.append(((this.certDate == null)?"<null>":this.certDate));
        sb.append(',');
        sb.append("nextCertDate");
        sb.append('=');
        sb.append(((this.nextCertDate == null)?"<null>":this.nextCertDate));
        sb.append(',');
        sb.append("criteriaExpireDate");
        sb.append('=');
        sb.append(((this.criteriaExpireDate == null)?"<null>":this.criteriaExpireDate));
        sb.append(',');
        sb.append("criteriaEndsDate");
        sb.append('=');
        sb.append(((this.criteriaEndsDate == null)?"<null>":this.criteriaEndsDate));
        sb.append(',');
        sb.append("criteriaEndsCode");
        sb.append('=');
        sb.append(((this.criteriaEndsCode == null)?"<null>":this.criteriaEndsCode));
        sb.append(',');
        sb.append("criteriaLcsvCode");
        sb.append('=');
        sb.append(((this.criteriaLcsvCode == null)?"<null>":this.criteriaLcsvCode));
        sb.append(',');
        sb.append("criteriaStatDesc");
        sb.append('=');
        sb.append(((this.criteriaStatDesc == null)?"<null>":this.criteriaStatDesc));
        sb.append(',');
        sb.append("criteriaNatnCode");
        sb.append('=');
        sb.append(((this.criteriaNatnCode == null)?"<null>":this.criteriaNatnCode));
        sb.append(',');
        sb.append("criteriaCertDesc");
        sb.append('=');
        sb.append(((this.criteriaCertDesc == null)?"<null>":this.criteriaCertDesc));
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
        sb.append("endsDate");
        sb.append('=');
        sb.append(((this.endsDate == null)?"<null>":this.endsDate));
        sb.append(',');
        sb.append("statCode");
        sb.append('=');
        sb.append(((this.statCode == null)?"<null>":this.statCode));
        sb.append(',');
        sb.append("criteriaEndsDesc");
        sb.append('=');
        sb.append(((this.criteriaEndsDesc == null)?"<null>":this.criteriaEndsDesc));
        sb.append(',');
        sb.append("criteriaNextCertDate");
        sb.append('=');
        sb.append(((this.criteriaNextCertDate == null)?"<null>":this.criteriaNextCertDate));
        sb.append(',');
        sb.append("natnCode");
        sb.append('=');
        sb.append(((this.natnCode == null)?"<null>":this.natnCode));
        sb.append(',');
        sb.append("criteriaStatCode");
        sb.append('=');
        sb.append(((this.criteriaStatCode == null)?"<null>":this.criteriaStatCode));
        sb.append(',');
        sb.append("criteriaNatnDesc");
        sb.append('=');
        sb.append(((this.criteriaNatnDesc == null)?"<null>":this.criteriaNatnDesc));
        sb.append(',');
        sb.append("certNo");
        sb.append('=');
        sb.append(((this.certNo == null)?"<null>":this.certNo));
        sb.append(',');
        sb.append("criteriaCertCode");
        sb.append('=');
        sb.append(((this.criteriaCertCode == null)?"<null>":this.criteriaCertCode));
        sb.append(',');
        sb.append("criteriaCertDate");
        sb.append('=');
        sb.append(((this.criteriaCertDate == null)?"<null>":this.criteriaCertDate));
        sb.append(',');
        sb.append("criteriaCertNo");
        sb.append('=');
        sb.append(((this.criteriaCertNo == null)?"<null>":this.criteriaCertNo));
        sb.append(',');
        sb.append("criteriaLcsvDesc");
        sb.append('=');
        sb.append(((this.criteriaLcsvDesc == null)?"<null>":this.criteriaLcsvDesc));
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
        result = ((result* 31)+((this.criteriaEndsDesc == null)? 0 :this.criteriaEndsDesc.hashCode()));
        result = ((result* 31)+((this.lcsvCode == null)? 0 :this.lcsvCode.hashCode()));
        result = ((result* 31)+((this.criteriaCertNo == null)? 0 :this.criteriaCertNo.hashCode()));
        result = ((result* 31)+((this.certCode == null)? 0 :this.certCode.hashCode()));
        result = ((result* 31)+((this.certDate == null)? 0 :this.certDate.hashCode()));
        result = ((result* 31)+((this.criteriaLcsvCode == null)? 0 :this.criteriaLcsvCode.hashCode()));
        result = ((result* 31)+((this.criteriaStatDesc == null)? 0 :this.criteriaStatDesc.hashCode()));
        result = ((result* 31)+((this.nextCertDate == null)? 0 :this.nextCertDate.hashCode()));
        result = ((result* 31)+((this.criteriaCertDate == null)? 0 :this.criteriaCertDate.hashCode()));
        result = ((result* 31)+((this.criteriaCertCode == null)? 0 :this.criteriaCertCode.hashCode()));
        result = ((result* 31)+((this.criteriaNatnCode == null)? 0 :this.criteriaNatnCode.hashCode()));
        result = ((result* 31)+((this.endsCode == null)? 0 :this.endsCode.hashCode()));
        result = ((result* 31)+((this.expireDate == null)? 0 :this.expireDate.hashCode()));
        result = ((result* 31)+((this.criteriaExpireDate == null)? 0 :this.criteriaExpireDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.endsDate == null)? 0 :this.endsDate.hashCode()));
        result = ((result* 31)+((this.criteriaEndsCode == null)? 0 :this.criteriaEndsCode.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.criteriaLcsvDesc == null)? 0 :this.criteriaLcsvDesc.hashCode()));
        result = ((result* 31)+((this.criteriaCertDesc == null)? 0 :this.criteriaCertDesc.hashCode()));
        result = ((result* 31)+((this.criteriaEndsDate == null)? 0 :this.criteriaEndsDate.hashCode()));
        result = ((result* 31)+((this.criteriaStatCode == null)? 0 :this.criteriaStatCode.hashCode()));
        result = ((result* 31)+((this.certNo == null)? 0 :this.certNo.hashCode()));
        result = ((result* 31)+((this.criteriaNatnDesc == null)? 0 :this.criteriaNatnDesc.hashCode()));
        result = ((result* 31)+((this.criteriaNextCertDate == null)? 0 :this.criteriaNextCertDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CertificationInformation100PutRequest) == false) {
            return false;
        }
        CertificationInformation100PutRequest rhs = ((CertificationInformation100PutRequest) other);
        return ((((((((((((((((((((((((((((this.criteriaEndsDesc == rhs.criteriaEndsDesc)||((this.criteriaEndsDesc!= null)&&this.criteriaEndsDesc.equals(rhs.criteriaEndsDesc)))&&((this.lcsvCode == rhs.lcsvCode)||((this.lcsvCode!= null)&&this.lcsvCode.equals(rhs.lcsvCode))))&&((this.criteriaCertNo == rhs.criteriaCertNo)||((this.criteriaCertNo!= null)&&this.criteriaCertNo.equals(rhs.criteriaCertNo))))&&((this.certCode == rhs.certCode)||((this.certCode!= null)&&this.certCode.equals(rhs.certCode))))&&((this.certDate == rhs.certDate)||((this.certDate!= null)&&this.certDate.equals(rhs.certDate))))&&((this.criteriaLcsvCode == rhs.criteriaLcsvCode)||((this.criteriaLcsvCode!= null)&&this.criteriaLcsvCode.equals(rhs.criteriaLcsvCode))))&&((this.criteriaStatDesc == rhs.criteriaStatDesc)||((this.criteriaStatDesc!= null)&&this.criteriaStatDesc.equals(rhs.criteriaStatDesc))))&&((this.nextCertDate == rhs.nextCertDate)||((this.nextCertDate!= null)&&this.nextCertDate.equals(rhs.nextCertDate))))&&((this.criteriaCertDate == rhs.criteriaCertDate)||((this.criteriaCertDate!= null)&&this.criteriaCertDate.equals(rhs.criteriaCertDate))))&&((this.criteriaCertCode == rhs.criteriaCertCode)||((this.criteriaCertCode!= null)&&this.criteriaCertCode.equals(rhs.criteriaCertCode))))&&((this.criteriaNatnCode == rhs.criteriaNatnCode)||((this.criteriaNatnCode!= null)&&this.criteriaNatnCode.equals(rhs.criteriaNatnCode))))&&((this.endsCode == rhs.endsCode)||((this.endsCode!= null)&&this.endsCode.equals(rhs.endsCode))))&&((this.expireDate == rhs.expireDate)||((this.expireDate!= null)&&this.expireDate.equals(rhs.expireDate))))&&((this.criteriaExpireDate == rhs.criteriaExpireDate)||((this.criteriaExpireDate!= null)&&this.criteriaExpireDate.equals(rhs.criteriaExpireDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.endsDate == rhs.endsDate)||((this.endsDate!= null)&&this.endsDate.equals(rhs.endsDate))))&&((this.criteriaEndsCode == rhs.criteriaEndsCode)||((this.criteriaEndsCode!= null)&&this.criteriaEndsCode.equals(rhs.criteriaEndsCode))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.criteriaLcsvDesc == rhs.criteriaLcsvDesc)||((this.criteriaLcsvDesc!= null)&&this.criteriaLcsvDesc.equals(rhs.criteriaLcsvDesc))))&&((this.criteriaCertDesc == rhs.criteriaCertDesc)||((this.criteriaCertDesc!= null)&&this.criteriaCertDesc.equals(rhs.criteriaCertDesc))))&&((this.criteriaEndsDate == rhs.criteriaEndsDate)||((this.criteriaEndsDate!= null)&&this.criteriaEndsDate.equals(rhs.criteriaEndsDate))))&&((this.criteriaStatCode == rhs.criteriaStatCode)||((this.criteriaStatCode!= null)&&this.criteriaStatCode.equals(rhs.criteriaStatCode))))&&((this.certNo == rhs.certNo)||((this.certNo!= null)&&this.certNo.equals(rhs.certNo))))&&((this.criteriaNatnDesc == rhs.criteriaNatnDesc)||((this.criteriaNatnDesc!= null)&&this.criteriaNatnDesc.equals(rhs.criteriaNatnDesc))))&&((this.criteriaNextCertDate == rhs.criteriaNextCertDate)||((this.criteriaNextCertDate!= null)&&this.criteriaNextCertDate.equals(rhs.criteriaNextCertDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
