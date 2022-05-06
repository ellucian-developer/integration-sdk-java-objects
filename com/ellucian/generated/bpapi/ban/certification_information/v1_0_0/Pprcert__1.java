
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
    "certDesc",
    "natnDesc",
    "comments",
    "lcsvCode",
    "statCode",
    "natnCode",
    "certCode",
    "statDesc",
    "certDate",
    "nextCertDate",
    "lcsvDesc",
    "certNo",
    "expireDate"
})
@Generated("jsonschema2pojo")
public class Pprcert__1 {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("certDesc")
    private String certDesc;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("natnDesc")
    private String natnDesc;
    /**
     * Comments
     * <p>
     * Lineage reference object : PPRCERT_COMMENTS
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_COMMENTS")
    private String comments;
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
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("statDesc")
    private String statDesc;
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
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lcsvDesc")
    private String lcsvDesc;
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
     * Expiration Date
     * <p>
     * Lineage reference object : PPRCERT_EXPIRE_DATE
     * 
     */
    @JsonProperty("expireDate")
    @JsonPropertyDescription("Lineage reference object : PPRCERT_EXPIRE_DATE")
    private Date expireDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("certDesc")
    public String getCertDesc() {
        return certDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("certDesc")
    public void setCertDesc(String certDesc) {
        this.certDesc = certDesc;
    }

    public Pprcert__1 withCertDesc(String certDesc) {
        this.certDesc = certDesc;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("natnDesc")
    public String getNatnDesc() {
        return natnDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("natnDesc")
    public void setNatnDesc(String natnDesc) {
        this.natnDesc = natnDesc;
    }

    public Pprcert__1 withNatnDesc(String natnDesc) {
        this.natnDesc = natnDesc;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PPRCERT_COMMENTS
     * 
     */
    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PPRCERT_COMMENTS
     * 
     */
    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    public Pprcert__1 withComments(String comments) {
        this.comments = comments;
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

    public Pprcert__1 withLcsvCode(String lcsvCode) {
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

    public Pprcert__1 withStatCode(String statCode) {
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

    public Pprcert__1 withNatnCode(String natnCode) {
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

    public Pprcert__1 withCertCode(String certCode) {
        this.certCode = certCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("statDesc")
    public String getStatDesc() {
        return statDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("statDesc")
    public void setStatDesc(String statDesc) {
        this.statDesc = statDesc;
    }

    public Pprcert__1 withStatDesc(String statDesc) {
        this.statDesc = statDesc;
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

    public Pprcert__1 withCertDate(Date certDate) {
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

    public Pprcert__1 withNextCertDate(Date nextCertDate) {
        this.nextCertDate = nextCertDate;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lcsvDesc")
    public String getLcsvDesc() {
        return lcsvDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("lcsvDesc")
    public void setLcsvDesc(String lcsvDesc) {
        this.lcsvDesc = lcsvDesc;
    }

    public Pprcert__1 withLcsvDesc(String lcsvDesc) {
        this.lcsvDesc = lcsvDesc;
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

    public Pprcert__1 withCertNo(String certNo) {
        this.certNo = certNo;
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

    public Pprcert__1 withExpireDate(Date expireDate) {
        this.expireDate = expireDate;
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

    public Pprcert__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pprcert__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("certDesc");
        sb.append('=');
        sb.append(((this.certDesc == null)?"<null>":this.certDesc));
        sb.append(',');
        sb.append("natnDesc");
        sb.append('=');
        sb.append(((this.natnDesc == null)?"<null>":this.natnDesc));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
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
        sb.append("statDesc");
        sb.append('=');
        sb.append(((this.statDesc == null)?"<null>":this.statDesc));
        sb.append(',');
        sb.append("certDate");
        sb.append('=');
        sb.append(((this.certDate == null)?"<null>":this.certDate));
        sb.append(',');
        sb.append("nextCertDate");
        sb.append('=');
        sb.append(((this.nextCertDate == null)?"<null>":this.nextCertDate));
        sb.append(',');
        sb.append("lcsvDesc");
        sb.append('=');
        sb.append(((this.lcsvDesc == null)?"<null>":this.lcsvDesc));
        sb.append(',');
        sb.append("certNo");
        sb.append('=');
        sb.append(((this.certNo == null)?"<null>":this.certNo));
        sb.append(',');
        sb.append("expireDate");
        sb.append('=');
        sb.append(((this.expireDate == null)?"<null>":this.expireDate));
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
        result = ((result* 31)+((this.certDesc == null)? 0 :this.certDesc.hashCode()));
        result = ((result* 31)+((this.natnDesc == null)? 0 :this.natnDesc.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.lcsvCode == null)? 0 :this.lcsvCode.hashCode()));
        result = ((result* 31)+((this.statCode == null)? 0 :this.statCode.hashCode()));
        result = ((result* 31)+((this.natnCode == null)? 0 :this.natnCode.hashCode()));
        result = ((result* 31)+((this.certCode == null)? 0 :this.certCode.hashCode()));
        result = ((result* 31)+((this.statDesc == null)? 0 :this.statDesc.hashCode()));
        result = ((result* 31)+((this.certDate == null)? 0 :this.certDate.hashCode()));
        result = ((result* 31)+((this.nextCertDate == null)? 0 :this.nextCertDate.hashCode()));
        result = ((result* 31)+((this.lcsvDesc == null)? 0 :this.lcsvDesc.hashCode()));
        result = ((result* 31)+((this.certNo == null)? 0 :this.certNo.hashCode()));
        result = ((result* 31)+((this.expireDate == null)? 0 :this.expireDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pprcert__1) == false) {
            return false;
        }
        Pprcert__1 rhs = ((Pprcert__1) other);
        return (((((((((((((((this.certDesc == rhs.certDesc)||((this.certDesc!= null)&&this.certDesc.equals(rhs.certDesc)))&&((this.natnDesc == rhs.natnDesc)||((this.natnDesc!= null)&&this.natnDesc.equals(rhs.natnDesc))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.lcsvCode == rhs.lcsvCode)||((this.lcsvCode!= null)&&this.lcsvCode.equals(rhs.lcsvCode))))&&((this.statCode == rhs.statCode)||((this.statCode!= null)&&this.statCode.equals(rhs.statCode))))&&((this.natnCode == rhs.natnCode)||((this.natnCode!= null)&&this.natnCode.equals(rhs.natnCode))))&&((this.certCode == rhs.certCode)||((this.certCode!= null)&&this.certCode.equals(rhs.certCode))))&&((this.statDesc == rhs.statDesc)||((this.statDesc!= null)&&this.statDesc.equals(rhs.statDesc))))&&((this.certDate == rhs.certDate)||((this.certDate!= null)&&this.certDate.equals(rhs.certDate))))&&((this.nextCertDate == rhs.nextCertDate)||((this.nextCertDate!= null)&&this.nextCertDate.equals(rhs.nextCertDate))))&&((this.lcsvDesc == rhs.lcsvDesc)||((this.lcsvDesc!= null)&&this.lcsvDesc.equals(rhs.lcsvDesc))))&&((this.certNo == rhs.certNo)||((this.certNo!= null)&&this.certNo.equals(rhs.certNo))))&&((this.expireDate == rhs.expireDate)||((this.expireDate!= null)&&this.expireDate.equals(rhs.expireDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
