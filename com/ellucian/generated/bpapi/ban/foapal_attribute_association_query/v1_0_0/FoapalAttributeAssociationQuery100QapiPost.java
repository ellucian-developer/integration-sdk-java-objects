
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
    "coasCode",
    "foapalType",
    "queryBy",
    "ftvsatvFoapalCode",
    "ftvsatvFoapalTitle",
    "ftvsatvAtttCode",
    "ftvsatvAtttDesc",
    "ftvsatvAttvCode",
    "tempAttvDesc"
})
@Generated("jsonschema2pojo")
public class FoapalAttributeAssociationQuery100QapiPost {

    @JsonProperty("coasCode")
    private String coasCode;
    @JsonProperty("foapalType")
    private String foapalType;
    @JsonProperty("queryBy")
    private String queryBy;
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
     * Ftvsatv Foapal Title
     * <p>
     * Lineage reference object : FTVSATV_FOAPAL_TITLE
     * 
     */
    @JsonProperty("ftvsatvFoapalTitle")
    @JsonPropertyDescription("Lineage reference object : FTVSATV_FOAPAL_TITLE")
    private String ftvsatvFoapalTitle;
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
     * Ftvsatv Attv Desc
     * <p>
     * 
     * 
     */
    @JsonProperty("tempAttvDesc")
    private String tempAttvDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public FoapalAttributeAssociationQuery100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("foapalType")
    public String getFoapalType() {
        return foapalType;
    }

    @JsonProperty("foapalType")
    public void setFoapalType(String foapalType) {
        this.foapalType = foapalType;
    }

    public FoapalAttributeAssociationQuery100QapiPost withFoapalType(String foapalType) {
        this.foapalType = foapalType;
        return this;
    }

    @JsonProperty("queryBy")
    public String getQueryBy() {
        return queryBy;
    }

    @JsonProperty("queryBy")
    public void setQueryBy(String queryBy) {
        this.queryBy = queryBy;
    }

    public FoapalAttributeAssociationQuery100QapiPost withQueryBy(String queryBy) {
        this.queryBy = queryBy;
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

    public FoapalAttributeAssociationQuery100QapiPost withFtvsatvFoapalCode(String ftvsatvFoapalCode) {
        this.ftvsatvFoapalCode = ftvsatvFoapalCode;
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

    public FoapalAttributeAssociationQuery100QapiPost withFtvsatvFoapalTitle(String ftvsatvFoapalTitle) {
        this.ftvsatvFoapalTitle = ftvsatvFoapalTitle;
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

    public FoapalAttributeAssociationQuery100QapiPost withFtvsatvAtttCode(String ftvsatvAtttCode) {
        this.ftvsatvAtttCode = ftvsatvAtttCode;
        return this;
    }

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

    public FoapalAttributeAssociationQuery100QapiPost withFtvsatvAtttDesc(String ftvsatvAtttDesc) {
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

    public FoapalAttributeAssociationQuery100QapiPost withFtvsatvAttvCode(String ftvsatvAttvCode) {
        this.ftvsatvAttvCode = ftvsatvAttvCode;
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

    public FoapalAttributeAssociationQuery100QapiPost withTempAttvDesc(String tempAttvDesc) {
        this.tempAttvDesc = tempAttvDesc;
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

    public FoapalAttributeAssociationQuery100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FoapalAttributeAssociationQuery100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("foapalType");
        sb.append('=');
        sb.append(((this.foapalType == null)?"<null>":this.foapalType));
        sb.append(',');
        sb.append("queryBy");
        sb.append('=');
        sb.append(((this.queryBy == null)?"<null>":this.queryBy));
        sb.append(',');
        sb.append("ftvsatvFoapalCode");
        sb.append('=');
        sb.append(((this.ftvsatvFoapalCode == null)?"<null>":this.ftvsatvFoapalCode));
        sb.append(',');
        sb.append("ftvsatvFoapalTitle");
        sb.append('=');
        sb.append(((this.ftvsatvFoapalTitle == null)?"<null>":this.ftvsatvFoapalTitle));
        sb.append(',');
        sb.append("ftvsatvAtttCode");
        sb.append('=');
        sb.append(((this.ftvsatvAtttCode == null)?"<null>":this.ftvsatvAtttCode));
        sb.append(',');
        sb.append("ftvsatvAtttDesc");
        sb.append('=');
        sb.append(((this.ftvsatvAtttDesc == null)?"<null>":this.ftvsatvAtttDesc));
        sb.append(',');
        sb.append("ftvsatvAttvCode");
        sb.append('=');
        sb.append(((this.ftvsatvAttvCode == null)?"<null>":this.ftvsatvAttvCode));
        sb.append(',');
        sb.append("tempAttvDesc");
        sb.append('=');
        sb.append(((this.tempAttvDesc == null)?"<null>":this.tempAttvDesc));
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
        result = ((result* 31)+((this.queryBy == null)? 0 :this.queryBy.hashCode()));
        result = ((result* 31)+((this.ftvsatvAtttCode == null)? 0 :this.ftvsatvAtttCode.hashCode()));
        result = ((result* 31)+((this.tempAttvDesc == null)? 0 :this.tempAttvDesc.hashCode()));
        result = ((result* 31)+((this.foapalType == null)? 0 :this.foapalType.hashCode()));
        result = ((result* 31)+((this.ftvsatvFoapalTitle == null)? 0 :this.ftvsatvFoapalTitle.hashCode()));
        result = ((result* 31)+((this.ftvsatvFoapalCode == null)? 0 :this.ftvsatvFoapalCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FoapalAttributeAssociationQuery100QapiPost) == false) {
            return false;
        }
        FoapalAttributeAssociationQuery100QapiPost rhs = ((FoapalAttributeAssociationQuery100QapiPost) other);
        return (((((((((((this.ftvsatvAtttDesc == rhs.ftvsatvAtttDesc)||((this.ftvsatvAtttDesc!= null)&&this.ftvsatvAtttDesc.equals(rhs.ftvsatvAtttDesc)))&&((this.ftvsatvAttvCode == rhs.ftvsatvAttvCode)||((this.ftvsatvAttvCode!= null)&&this.ftvsatvAttvCode.equals(rhs.ftvsatvAttvCode))))&&((this.queryBy == rhs.queryBy)||((this.queryBy!= null)&&this.queryBy.equals(rhs.queryBy))))&&((this.ftvsatvAtttCode == rhs.ftvsatvAtttCode)||((this.ftvsatvAtttCode!= null)&&this.ftvsatvAtttCode.equals(rhs.ftvsatvAtttCode))))&&((this.tempAttvDesc == rhs.tempAttvDesc)||((this.tempAttvDesc!= null)&&this.tempAttvDesc.equals(rhs.tempAttvDesc))))&&((this.foapalType == rhs.foapalType)||((this.foapalType!= null)&&this.foapalType.equals(rhs.foapalType))))&&((this.ftvsatvFoapalTitle == rhs.ftvsatvFoapalTitle)||((this.ftvsatvFoapalTitle!= null)&&this.ftvsatvFoapalTitle.equals(rhs.ftvsatvFoapalTitle))))&&((this.ftvsatvFoapalCode == rhs.ftvsatvFoapalCode)||((this.ftvsatvFoapalCode!= null)&&this.ftvsatvFoapalCode.equals(rhs.ftvsatvFoapalCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
