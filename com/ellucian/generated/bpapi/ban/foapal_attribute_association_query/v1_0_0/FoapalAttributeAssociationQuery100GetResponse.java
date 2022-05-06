
package com.ellucian.generated.bpapi.ban.foapal_attribute_association_query.v1_0_0;

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
    "ftvsatvAtttDesc",
    "ftvsatvAttvCode",
    "ftvsatvAtttCode",
    "tempAttvDesc",
    "ftvsatvFoapalTitle",
    "ftvsatvFoapalCode",
    "ftvsatvSetCode"
})
@Generated("jsonschema2pojo")
public class FoapalAttributeAssociationQuery100GetResponse {

    /**
     * Ftvsatv Attt Desc
     * <p>
     * Lineage reference object : FTVSATV_ATTT_DESC
     * 
     */
    @JsonProperty("ftvsatvAtttDesc")
    @JsonPropertyDescription("Lineage reference object : FTVSATV_ATTT_DESC")
    private String ftvsatvAtttDesc;
    /**
     * Ftvsatv Attv Code
     * <p>
     * Lineage reference object : FTVSATV_ATTV_CODE, Lookup lineage reference object : ftvfatv
     * 
     */
    @JsonProperty("ftvsatvAttvCode")
    @JsonPropertyDescription("Lineage reference object : FTVSATV_ATTV_CODE, Lookup lineage reference object : ftvfatv")
    private String ftvsatvAttvCode;
    /**
     * Ftvsatv Attt Code
     * <p>
     * Lineage reference object : FTVSATV_ATTT_CODE, Lookup lineage reference object : ftvsatv
     * 
     */
    @JsonProperty("ftvsatvAtttCode")
    @JsonPropertyDescription("Lineage reference object : FTVSATV_ATTT_CODE, Lookup lineage reference object : ftvsatv")
    private String ftvsatvAtttCode;
    /**
     * Ftvsatv Attv Desc
     * <p>
     * 
     * 
     */
    @JsonProperty("tempAttvDesc")
    private String tempAttvDesc;
    /**
     * Ftvsatv Foapal Title
     * <p>
     * Lineage reference object : FTVSATV_FOAPAL_TITLE
     * 
     */
    @JsonProperty("ftvsatvFoapalTitle")
    @JsonPropertyDescription("Lineage reference object : FTVSATV_FOAPAL_TITLE")
    private String ftvsatvFoapalTitle;
    /**
     * Ftvsatv Foapal Code
     * <p>
     * Lineage reference object : FTVSATV_FOAPAL_CODE
     * 
     */
    @JsonProperty("ftvsatvFoapalCode")
    @JsonPropertyDescription("Lineage reference object : FTVSATV_FOAPAL_CODE")
    private String ftvsatvFoapalCode;
    /**
     * Ftvsatv Set Code
     * <p>
     * Lineage reference object : FTVSATV_SET_CODE
     * 
     */
    @JsonProperty("ftvsatvSetCode")
    @JsonPropertyDescription("Lineage reference object : FTVSATV_SET_CODE")
    private String ftvsatvSetCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Ftvsatv Attt Desc
     * <p>
     * Lineage reference object : FTVSATV_ATTT_DESC
     * 
     */
    @JsonProperty("ftvsatvAtttDesc")
    public String getFtvsatvAtttDesc() {
        return ftvsatvAtttDesc;
    }

    /**
     * Ftvsatv Attt Desc
     * <p>
     * Lineage reference object : FTVSATV_ATTT_DESC
     * 
     */
    @JsonProperty("ftvsatvAtttDesc")
    public void setFtvsatvAtttDesc(String ftvsatvAtttDesc) {
        this.ftvsatvAtttDesc = ftvsatvAtttDesc;
    }

    public FoapalAttributeAssociationQuery100GetResponse withFtvsatvAtttDesc(String ftvsatvAtttDesc) {
        this.ftvsatvAtttDesc = ftvsatvAtttDesc;
        return this;
    }

    /**
     * Ftvsatv Attv Code
     * <p>
     * Lineage reference object : FTVSATV_ATTV_CODE, Lookup lineage reference object : ftvfatv
     * 
     */
    @JsonProperty("ftvsatvAttvCode")
    public String getFtvsatvAttvCode() {
        return ftvsatvAttvCode;
    }

    /**
     * Ftvsatv Attv Code
     * <p>
     * Lineage reference object : FTVSATV_ATTV_CODE, Lookup lineage reference object : ftvfatv
     * 
     */
    @JsonProperty("ftvsatvAttvCode")
    public void setFtvsatvAttvCode(String ftvsatvAttvCode) {
        this.ftvsatvAttvCode = ftvsatvAttvCode;
    }

    public FoapalAttributeAssociationQuery100GetResponse withFtvsatvAttvCode(String ftvsatvAttvCode) {
        this.ftvsatvAttvCode = ftvsatvAttvCode;
        return this;
    }

    /**
     * Ftvsatv Attt Code
     * <p>
     * Lineage reference object : FTVSATV_ATTT_CODE, Lookup lineage reference object : ftvsatv
     * 
     */
    @JsonProperty("ftvsatvAtttCode")
    public String getFtvsatvAtttCode() {
        return ftvsatvAtttCode;
    }

    /**
     * Ftvsatv Attt Code
     * <p>
     * Lineage reference object : FTVSATV_ATTT_CODE, Lookup lineage reference object : ftvsatv
     * 
     */
    @JsonProperty("ftvsatvAtttCode")
    public void setFtvsatvAtttCode(String ftvsatvAtttCode) {
        this.ftvsatvAtttCode = ftvsatvAtttCode;
    }

    public FoapalAttributeAssociationQuery100GetResponse withFtvsatvAtttCode(String ftvsatvAtttCode) {
        this.ftvsatvAtttCode = ftvsatvAtttCode;
        return this;
    }

    /**
     * Ftvsatv Attv Desc
     * <p>
     * 
     * 
     */
    @JsonProperty("tempAttvDesc")
    public String getTempAttvDesc() {
        return tempAttvDesc;
    }

    /**
     * Ftvsatv Attv Desc
     * <p>
     * 
     * 
     */
    @JsonProperty("tempAttvDesc")
    public void setTempAttvDesc(String tempAttvDesc) {
        this.tempAttvDesc = tempAttvDesc;
    }

    public FoapalAttributeAssociationQuery100GetResponse withTempAttvDesc(String tempAttvDesc) {
        this.tempAttvDesc = tempAttvDesc;
        return this;
    }

    /**
     * Ftvsatv Foapal Title
     * <p>
     * Lineage reference object : FTVSATV_FOAPAL_TITLE
     * 
     */
    @JsonProperty("ftvsatvFoapalTitle")
    public String getFtvsatvFoapalTitle() {
        return ftvsatvFoapalTitle;
    }

    /**
     * Ftvsatv Foapal Title
     * <p>
     * Lineage reference object : FTVSATV_FOAPAL_TITLE
     * 
     */
    @JsonProperty("ftvsatvFoapalTitle")
    public void setFtvsatvFoapalTitle(String ftvsatvFoapalTitle) {
        this.ftvsatvFoapalTitle = ftvsatvFoapalTitle;
    }

    public FoapalAttributeAssociationQuery100GetResponse withFtvsatvFoapalTitle(String ftvsatvFoapalTitle) {
        this.ftvsatvFoapalTitle = ftvsatvFoapalTitle;
        return this;
    }

    /**
     * Ftvsatv Foapal Code
     * <p>
     * Lineage reference object : FTVSATV_FOAPAL_CODE
     * 
     */
    @JsonProperty("ftvsatvFoapalCode")
    public String getFtvsatvFoapalCode() {
        return ftvsatvFoapalCode;
    }

    /**
     * Ftvsatv Foapal Code
     * <p>
     * Lineage reference object : FTVSATV_FOAPAL_CODE
     * 
     */
    @JsonProperty("ftvsatvFoapalCode")
    public void setFtvsatvFoapalCode(String ftvsatvFoapalCode) {
        this.ftvsatvFoapalCode = ftvsatvFoapalCode;
    }

    public FoapalAttributeAssociationQuery100GetResponse withFtvsatvFoapalCode(String ftvsatvFoapalCode) {
        this.ftvsatvFoapalCode = ftvsatvFoapalCode;
        return this;
    }

    /**
     * Ftvsatv Set Code
     * <p>
     * Lineage reference object : FTVSATV_SET_CODE
     * 
     */
    @JsonProperty("ftvsatvSetCode")
    public String getFtvsatvSetCode() {
        return ftvsatvSetCode;
    }

    /**
     * Ftvsatv Set Code
     * <p>
     * Lineage reference object : FTVSATV_SET_CODE
     * 
     */
    @JsonProperty("ftvsatvSetCode")
    public void setFtvsatvSetCode(String ftvsatvSetCode) {
        this.ftvsatvSetCode = ftvsatvSetCode;
    }

    public FoapalAttributeAssociationQuery100GetResponse withFtvsatvSetCode(String ftvsatvSetCode) {
        this.ftvsatvSetCode = ftvsatvSetCode;
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

    public FoapalAttributeAssociationQuery100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FoapalAttributeAssociationQuery100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ftvsatvAtttDesc");
        sb.append('=');
        sb.append(((this.ftvsatvAtttDesc == null)?"<null>":this.ftvsatvAtttDesc));
        sb.append(',');
        sb.append("ftvsatvAttvCode");
        sb.append('=');
        sb.append(((this.ftvsatvAttvCode == null)?"<null>":this.ftvsatvAttvCode));
        sb.append(',');
        sb.append("ftvsatvAtttCode");
        sb.append('=');
        sb.append(((this.ftvsatvAtttCode == null)?"<null>":this.ftvsatvAtttCode));
        sb.append(',');
        sb.append("tempAttvDesc");
        sb.append('=');
        sb.append(((this.tempAttvDesc == null)?"<null>":this.tempAttvDesc));
        sb.append(',');
        sb.append("ftvsatvFoapalTitle");
        sb.append('=');
        sb.append(((this.ftvsatvFoapalTitle == null)?"<null>":this.ftvsatvFoapalTitle));
        sb.append(',');
        sb.append("ftvsatvFoapalCode");
        sb.append('=');
        sb.append(((this.ftvsatvFoapalCode == null)?"<null>":this.ftvsatvFoapalCode));
        sb.append(',');
        sb.append("ftvsatvSetCode");
        sb.append('=');
        sb.append(((this.ftvsatvSetCode == null)?"<null>":this.ftvsatvSetCode));
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
        result = ((result* 31)+((this.ftvsatvAtttDesc == null)? 0 :this.ftvsatvAtttDesc.hashCode()));
        result = ((result* 31)+((this.ftvsatvAttvCode == null)? 0 :this.ftvsatvAttvCode.hashCode()));
        result = ((result* 31)+((this.ftvsatvAtttCode == null)? 0 :this.ftvsatvAtttCode.hashCode()));
        result = ((result* 31)+((this.tempAttvDesc == null)? 0 :this.tempAttvDesc.hashCode()));
        result = ((result* 31)+((this.ftvsatvFoapalTitle == null)? 0 :this.ftvsatvFoapalTitle.hashCode()));
        result = ((result* 31)+((this.ftvsatvFoapalCode == null)? 0 :this.ftvsatvFoapalCode.hashCode()));
        result = ((result* 31)+((this.ftvsatvSetCode == null)? 0 :this.ftvsatvSetCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FoapalAttributeAssociationQuery100GetResponse) == false) {
            return false;
        }
        FoapalAttributeAssociationQuery100GetResponse rhs = ((FoapalAttributeAssociationQuery100GetResponse) other);
        return (((((((((this.ftvsatvAtttDesc == rhs.ftvsatvAtttDesc)||((this.ftvsatvAtttDesc!= null)&&this.ftvsatvAtttDesc.equals(rhs.ftvsatvAtttDesc)))&&((this.ftvsatvAttvCode == rhs.ftvsatvAttvCode)||((this.ftvsatvAttvCode!= null)&&this.ftvsatvAttvCode.equals(rhs.ftvsatvAttvCode))))&&((this.ftvsatvAtttCode == rhs.ftvsatvAtttCode)||((this.ftvsatvAtttCode!= null)&&this.ftvsatvAtttCode.equals(rhs.ftvsatvAtttCode))))&&((this.tempAttvDesc == rhs.tempAttvDesc)||((this.tempAttvDesc!= null)&&this.tempAttvDesc.equals(rhs.tempAttvDesc))))&&((this.ftvsatvFoapalTitle == rhs.ftvsatvFoapalTitle)||((this.ftvsatvFoapalTitle!= null)&&this.ftvsatvFoapalTitle.equals(rhs.ftvsatvFoapalTitle))))&&((this.ftvsatvFoapalCode == rhs.ftvsatvFoapalCode)||((this.ftvsatvFoapalCode!= null)&&this.ftvsatvFoapalCode.equals(rhs.ftvsatvFoapalCode))))&&((this.ftvsatvSetCode == rhs.ftvsatvSetCode)||((this.ftvsatvSetCode!= null)&&this.ftvsatvSetCode.equals(rhs.ftvsatvSetCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
