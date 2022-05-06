
package com.ellucian.generated.bpapi.ban.applicant_messages.v1_0_0;

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
    "keyblckAidyCode",
    "mesgCode",
    "id",
    "fullDesc",
    "expirationDate"
})
@Generated("jsonschema2pojo")
public class ApplicantMessages100PostRequest {

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private Object keyblckAidyCode;
    /**
     * Message Code
     * <p>
     * Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg
     * 
     */
    @JsonProperty("mesgCode")
    @JsonPropertyDescription("Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg")
    private String mesgCode;
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
     * Message
     * <p>
     * Lineage reference object : RORMESG_FULL_DESC
     * 
     */
    @JsonProperty("fullDesc")
    @JsonPropertyDescription("Lineage reference object : RORMESG_FULL_DESC")
    private String fullDesc;
    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RORMESG_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    @JsonPropertyDescription("Lineage reference object : RORMESG_EXPIRATION_DATE")
    private Date expirationDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public Object getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(Object keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public ApplicantMessages100PostRequest withKeyblckAidyCode(Object keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    /**
     * Message Code
     * <p>
     * Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg
     * 
     */
    @JsonProperty("mesgCode")
    public String getMesgCode() {
        return mesgCode;
    }

    /**
     * Message Code
     * <p>
     * Lineage reference object : RORMESG_MESG_CODE, Lookup lineage reference object : rtvmesg
     * 
     */
    @JsonProperty("mesgCode")
    public void setMesgCode(String mesgCode) {
        this.mesgCode = mesgCode;
    }

    public ApplicantMessages100PostRequest withMesgCode(String mesgCode) {
        this.mesgCode = mesgCode;
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

    public ApplicantMessages100PostRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : RORMESG_FULL_DESC
     * 
     */
    @JsonProperty("fullDesc")
    public String getFullDesc() {
        return fullDesc;
    }

    /**
     * Message
     * <p>
     * Lineage reference object : RORMESG_FULL_DESC
     * 
     */
    @JsonProperty("fullDesc")
    public void setFullDesc(String fullDesc) {
        this.fullDesc = fullDesc;
    }

    public ApplicantMessages100PostRequest withFullDesc(String fullDesc) {
        this.fullDesc = fullDesc;
        return this;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RORMESG_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Expiration Date
     * <p>
     * Lineage reference object : RORMESG_EXPIRATION_DATE
     * 
     */
    @JsonProperty("expirationDate")
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public ApplicantMessages100PostRequest withExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    public ApplicantMessages100PostRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantMessages100PostRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("mesgCode");
        sb.append('=');
        sb.append(((this.mesgCode == null)?"<null>":this.mesgCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("fullDesc");
        sb.append('=');
        sb.append(((this.fullDesc == null)?"<null>":this.fullDesc));
        sb.append(',');
        sb.append("expirationDate");
        sb.append('=');
        sb.append(((this.expirationDate == null)?"<null>":this.expirationDate));
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
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.mesgCode == null)? 0 :this.mesgCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fullDesc == null)? 0 :this.fullDesc.hashCode()));
        result = ((result* 31)+((this.expirationDate == null)? 0 :this.expirationDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantMessages100PostRequest) == false) {
            return false;
        }
        ApplicantMessages100PostRequest rhs = ((ApplicantMessages100PostRequest) other);
        return (((((((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode)))&&((this.mesgCode == rhs.mesgCode)||((this.mesgCode!= null)&&this.mesgCode.equals(rhs.mesgCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fullDesc == rhs.fullDesc)||((this.fullDesc!= null)&&this.fullDesc.equals(rhs.fullDesc))))&&((this.expirationDate == rhs.expirationDate)||((this.expirationDate!= null)&&this.expirationDate.equals(rhs.expirationDate))));
    }

}
