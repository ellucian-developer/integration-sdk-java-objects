
package com.ellucian.generated.bpapi.ban.source_background_institution_codes.v1_0_0;

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
    "code",
    "typeInd",
    "stvadmrDesc",
    "srceInd",
    "fice",
    "vrMsgNo",
    "ediCapable",
    "desc"
})
@Generated("jsonschema2pojo")
public class SourceBackgroundInstitutionCodes100PutResponse {

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr")
    private String admrCode;
    /**
     * Source or Background Institution
     * <p>
     * Lineage reference object : STVSBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_CODE")
    private String code;
    /**
     * Type
     * <p>
     * Lineage reference object : STVSBGI_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_TYPE_IND")
    private String typeInd;
    /**
     * Admissions Request Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvadmrDesc")
    private String stvadmrDesc;
    /**
     * Lineage reference object : STVSBGI_SRCE_IND
     * 
     */
    @JsonProperty("srceInd")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_SRCE_IND")
    private String srceInd;
    /**
     * FICE
     * <p>
     * Lineage reference object : STVSBGI_FICE
     * 
     */
    @JsonProperty("fice")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_FICE")
    private String fice;
    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSBGI_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_VR_MSG_NO")
    private Double vrMsgNo;
    /**
     * Electronic
     * <p>
     * Lineage reference object : STVSBGI_EDI_CAPABLE
     * 
     */
    @JsonProperty("ediCapable")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_EDI_CAPABLE")
    private String ediCapable;
    /**
     * Description
     * <p>
     * Lineage reference object : STVSBGI_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : STVSBGI_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    /**
     * Admissions Request
     * <p>
     * Lineage reference object : STVSBGI_ADMR_CODE, Lookup lineage reference object : stvadmr
     * 
     */
    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public SourceBackgroundInstitutionCodes100PutResponse withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    /**
     * Source or Background Institution
     * <p>
     * Lineage reference object : STVSBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Source or Background Institution
     * <p>
     * Lineage reference object : STVSBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public SourceBackgroundInstitutionCodes100PutResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : STVSBGI_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    /**
     * Type
     * <p>
     * Lineage reference object : STVSBGI_TYPE_IND
     * (Required)
     * 
     */
    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public SourceBackgroundInstitutionCodes100PutResponse withTypeInd(String typeInd) {
        this.typeInd = typeInd;
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

    public SourceBackgroundInstitutionCodes100PutResponse withStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
        return this;
    }

    /**
     * Lineage reference object : STVSBGI_SRCE_IND
     * 
     */
    @JsonProperty("srceInd")
    public String getSrceInd() {
        return srceInd;
    }

    /**
     * Lineage reference object : STVSBGI_SRCE_IND
     * 
     */
    @JsonProperty("srceInd")
    public void setSrceInd(String srceInd) {
        this.srceInd = srceInd;
    }

    public SourceBackgroundInstitutionCodes100PutResponse withSrceInd(String srceInd) {
        this.srceInd = srceInd;
        return this;
    }

    /**
     * FICE
     * <p>
     * Lineage reference object : STVSBGI_FICE
     * 
     */
    @JsonProperty("fice")
    public String getFice() {
        return fice;
    }

    /**
     * FICE
     * <p>
     * Lineage reference object : STVSBGI_FICE
     * 
     */
    @JsonProperty("fice")
    public void setFice(String fice) {
        this.fice = fice;
    }

    public SourceBackgroundInstitutionCodes100PutResponse withFice(String fice) {
        this.fice = fice;
        return this;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSBGI_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public Double getVrMsgNo() {
        return vrMsgNo;
    }

    /**
     * Voice Response Message Number
     * <p>
     * Lineage reference object : STVSBGI_VR_MSG_NO
     * 
     */
    @JsonProperty("vrMsgNo")
    public void setVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
    }

    public SourceBackgroundInstitutionCodes100PutResponse withVrMsgNo(Double vrMsgNo) {
        this.vrMsgNo = vrMsgNo;
        return this;
    }

    /**
     * Electronic
     * <p>
     * Lineage reference object : STVSBGI_EDI_CAPABLE
     * 
     */
    @JsonProperty("ediCapable")
    public String getEdiCapable() {
        return ediCapable;
    }

    /**
     * Electronic
     * <p>
     * Lineage reference object : STVSBGI_EDI_CAPABLE
     * 
     */
    @JsonProperty("ediCapable")
    public void setEdiCapable(String ediCapable) {
        this.ediCapable = ediCapable;
    }

    public SourceBackgroundInstitutionCodes100PutResponse withEdiCapable(String ediCapable) {
        this.ediCapable = ediCapable;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVSBGI_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : STVSBGI_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public SourceBackgroundInstitutionCodes100PutResponse withDesc(String desc) {
        this.desc = desc;
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

    public SourceBackgroundInstitutionCodes100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SourceBackgroundInstitutionCodes100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("stvadmrDesc");
        sb.append('=');
        sb.append(((this.stvadmrDesc == null)?"<null>":this.stvadmrDesc));
        sb.append(',');
        sb.append("srceInd");
        sb.append('=');
        sb.append(((this.srceInd == null)?"<null>":this.srceInd));
        sb.append(',');
        sb.append("fice");
        sb.append('=');
        sb.append(((this.fice == null)?"<null>":this.fice));
        sb.append(',');
        sb.append("vrMsgNo");
        sb.append('=');
        sb.append(((this.vrMsgNo == null)?"<null>":this.vrMsgNo));
        sb.append(',');
        sb.append("ediCapable");
        sb.append('=');
        sb.append(((this.ediCapable == null)?"<null>":this.ediCapable));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.stvadmrDesc == null)? 0 :this.stvadmrDesc.hashCode()));
        result = ((result* 31)+((this.srceInd == null)? 0 :this.srceInd.hashCode()));
        result = ((result* 31)+((this.fice == null)? 0 :this.fice.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.vrMsgNo == null)? 0 :this.vrMsgNo.hashCode()));
        result = ((result* 31)+((this.ediCapable == null)? 0 :this.ediCapable.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceBackgroundInstitutionCodes100PutResponse) == false) {
            return false;
        }
        SourceBackgroundInstitutionCodes100PutResponse rhs = ((SourceBackgroundInstitutionCodes100PutResponse) other);
        return (((((((((((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.stvadmrDesc == rhs.stvadmrDesc)||((this.stvadmrDesc!= null)&&this.stvadmrDesc.equals(rhs.stvadmrDesc))))&&((this.srceInd == rhs.srceInd)||((this.srceInd!= null)&&this.srceInd.equals(rhs.srceInd))))&&((this.fice == rhs.fice)||((this.fice!= null)&&this.fice.equals(rhs.fice))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.vrMsgNo == rhs.vrMsgNo)||((this.vrMsgNo!= null)&&this.vrMsgNo.equals(rhs.vrMsgNo))))&&((this.ediCapable == rhs.ediCapable)||((this.ediCapable!= null)&&this.ediCapable.equals(rhs.ediCapable))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
