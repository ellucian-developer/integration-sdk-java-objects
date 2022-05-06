
package com.ellucian.generated.bpapi.ban.attribute_association.v1_0_0;

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
    "attvDesc",
    "beginDate",
    "atttStatusInd",
    "ftrfndaAttvCode",
    "endDate",
    "ftrfndaAtttCode",
    "atttDesc"
})
@Generated("jsonschema2pojo")
public class AttributeAssociation100GetResponse {

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attvDesc")
    private String attvDesc;
    /**
     * Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("beginDate")
    private Date beginDate;
    @JsonProperty("atttStatusInd")
    private String atttStatusInd;
    /**
     * Ftrfnda Attv Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTV_CODE, Lookup lineage reference object : ftrattv
     * 
     */
    @JsonProperty("ftrfndaAttvCode")
    @JsonPropertyDescription("Lineage reference object : FTRFNDA_ATTV_CODE, Lookup lineage reference object : ftrattv")
    private String ftrfndaAttvCode;
    /**
     * End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("endDate")
    private Date endDate;
    /**
     * Ftrfnda Attt Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTT_CODE, Lookup lineage reference object : ftvsatv
     * 
     */
    @JsonProperty("ftrfndaAtttCode")
    @JsonPropertyDescription("Lineage reference object : FTRFNDA_ATTT_CODE, Lookup lineage reference object : ftvsatv")
    private String ftrfndaAtttCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("atttDesc")
    private String atttDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attvDesc")
    public String getAttvDesc() {
        return attvDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("attvDesc")
    public void setAttvDesc(String attvDesc) {
        this.attvDesc = attvDesc;
    }

    public AttributeAssociation100GetResponse withAttvDesc(String attvDesc) {
        this.attvDesc = attvDesc;
        return this;
    }

    /**
     * Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("beginDate")
    public Date getBeginDate() {
        return beginDate;
    }

    /**
     * Begin Date
     * <p>
     * 
     * 
     */
    @JsonProperty("beginDate")
    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public AttributeAssociation100GetResponse withBeginDate(Date beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    @JsonProperty("atttStatusInd")
    public String getAtttStatusInd() {
        return atttStatusInd;
    }

    @JsonProperty("atttStatusInd")
    public void setAtttStatusInd(String atttStatusInd) {
        this.atttStatusInd = atttStatusInd;
    }

    public AttributeAssociation100GetResponse withAtttStatusInd(String atttStatusInd) {
        this.atttStatusInd = atttStatusInd;
        return this;
    }

    /**
     * Ftrfnda Attv Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTV_CODE, Lookup lineage reference object : ftrattv
     * 
     */
    @JsonProperty("ftrfndaAttvCode")
    public String getFtrfndaAttvCode() {
        return ftrfndaAttvCode;
    }

    /**
     * Ftrfnda Attv Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTV_CODE, Lookup lineage reference object : ftrattv
     * 
     */
    @JsonProperty("ftrfndaAttvCode")
    public void setFtrfndaAttvCode(String ftrfndaAttvCode) {
        this.ftrfndaAttvCode = ftrfndaAttvCode;
    }

    public AttributeAssociation100GetResponse withFtrfndaAttvCode(String ftrfndaAttvCode) {
        this.ftrfndaAttvCode = ftrfndaAttvCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * 
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public AttributeAssociation100GetResponse withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Ftrfnda Attt Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTT_CODE, Lookup lineage reference object : ftvsatv
     * 
     */
    @JsonProperty("ftrfndaAtttCode")
    public String getFtrfndaAtttCode() {
        return ftrfndaAtttCode;
    }

    /**
     * Ftrfnda Attt Code
     * <p>
     * Lineage reference object : FTRFNDA_ATTT_CODE, Lookup lineage reference object : ftvsatv
     * 
     */
    @JsonProperty("ftrfndaAtttCode")
    public void setFtrfndaAtttCode(String ftrfndaAtttCode) {
        this.ftrfndaAtttCode = ftrfndaAtttCode;
    }

    public AttributeAssociation100GetResponse withFtrfndaAtttCode(String ftrfndaAtttCode) {
        this.ftrfndaAtttCode = ftrfndaAtttCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("atttDesc")
    public String getAtttDesc() {
        return atttDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("atttDesc")
    public void setAtttDesc(String atttDesc) {
        this.atttDesc = atttDesc;
    }

    public AttributeAssociation100GetResponse withAtttDesc(String atttDesc) {
        this.atttDesc = atttDesc;
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

    public AttributeAssociation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttributeAssociation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attvDesc");
        sb.append('=');
        sb.append(((this.attvDesc == null)?"<null>":this.attvDesc));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("atttStatusInd");
        sb.append('=');
        sb.append(((this.atttStatusInd == null)?"<null>":this.atttStatusInd));
        sb.append(',');
        sb.append("ftrfndaAttvCode");
        sb.append('=');
        sb.append(((this.ftrfndaAttvCode == null)?"<null>":this.ftrfndaAttvCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("ftrfndaAtttCode");
        sb.append('=');
        sb.append(((this.ftrfndaAtttCode == null)?"<null>":this.ftrfndaAtttCode));
        sb.append(',');
        sb.append("atttDesc");
        sb.append('=');
        sb.append(((this.atttDesc == null)?"<null>":this.atttDesc));
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
        result = ((result* 31)+((this.attvDesc == null)? 0 :this.attvDesc.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.atttStatusInd == null)? 0 :this.atttStatusInd.hashCode()));
        result = ((result* 31)+((this.ftrfndaAttvCode == null)? 0 :this.ftrfndaAttvCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.ftrfndaAtttCode == null)? 0 :this.ftrfndaAtttCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.atttDesc == null)? 0 :this.atttDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttributeAssociation100GetResponse) == false) {
            return false;
        }
        AttributeAssociation100GetResponse rhs = ((AttributeAssociation100GetResponse) other);
        return (((((((((this.attvDesc == rhs.attvDesc)||((this.attvDesc!= null)&&this.attvDesc.equals(rhs.attvDesc)))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.atttStatusInd == rhs.atttStatusInd)||((this.atttStatusInd!= null)&&this.atttStatusInd.equals(rhs.atttStatusInd))))&&((this.ftrfndaAttvCode == rhs.ftrfndaAttvCode)||((this.ftrfndaAttvCode!= null)&&this.ftrfndaAttvCode.equals(rhs.ftrfndaAttvCode))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.ftrfndaAtttCode == rhs.ftrfndaAtttCode)||((this.ftrfndaAtttCode!= null)&&this.ftrfndaAtttCode.equals(rhs.ftrfndaAtttCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.atttDesc == rhs.atttDesc)||((this.atttDesc!= null)&&this.atttDesc.equals(rhs.atttDesc))));
    }

}
