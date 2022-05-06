
package com.ellucian.generated.bpapi.ban.attribute_type_sets_maintenance.v1_0_0;

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
    "locnInd",
    "allInd",
    "fundInd",
    "ftvatttDesc",
    "acctInd",
    "atttCode",
    "progInd",
    "ftvatttStatusInd",
    "actvInd",
    "orgnInd"
})
@Generated("jsonschema2pojo")
public class AttributeTypeSetsMaintenance100GetResponse {

    @JsonProperty("locnInd")
    private String locnInd;
    @JsonProperty("allInd")
    private String allInd;
    @JsonProperty("fundInd")
    private String fundInd;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvatttDesc")
    private String ftvatttDesc;
    @JsonProperty("acctInd")
    private String acctInd;
    /**
     * Ftratts Attt Code
     * <p>
     * Lineage reference object : FTRATTS_ATTT_CODE
     * (Required)
     * 
     */
    @JsonProperty("atttCode")
    @JsonPropertyDescription("Lineage reference object : FTRATTS_ATTT_CODE")
    private String atttCode;
    @JsonProperty("progInd")
    private String progInd;
    @JsonProperty("ftvatttStatusInd")
    private String ftvatttStatusInd;
    @JsonProperty("actvInd")
    private String actvInd;
    @JsonProperty("orgnInd")
    private String orgnInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("locnInd")
    public String getLocnInd() {
        return locnInd;
    }

    @JsonProperty("locnInd")
    public void setLocnInd(String locnInd) {
        this.locnInd = locnInd;
    }

    public AttributeTypeSetsMaintenance100GetResponse withLocnInd(String locnInd) {
        this.locnInd = locnInd;
        return this;
    }

    @JsonProperty("allInd")
    public String getAllInd() {
        return allInd;
    }

    @JsonProperty("allInd")
    public void setAllInd(String allInd) {
        this.allInd = allInd;
    }

    public AttributeTypeSetsMaintenance100GetResponse withAllInd(String allInd) {
        this.allInd = allInd;
        return this;
    }

    @JsonProperty("fundInd")
    public String getFundInd() {
        return fundInd;
    }

    @JsonProperty("fundInd")
    public void setFundInd(String fundInd) {
        this.fundInd = fundInd;
    }

    public AttributeTypeSetsMaintenance100GetResponse withFundInd(String fundInd) {
        this.fundInd = fundInd;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvatttDesc")
    public String getFtvatttDesc() {
        return ftvatttDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("ftvatttDesc")
    public void setFtvatttDesc(String ftvatttDesc) {
        this.ftvatttDesc = ftvatttDesc;
    }

    public AttributeTypeSetsMaintenance100GetResponse withFtvatttDesc(String ftvatttDesc) {
        this.ftvatttDesc = ftvatttDesc;
        return this;
    }

    @JsonProperty("acctInd")
    public String getAcctInd() {
        return acctInd;
    }

    @JsonProperty("acctInd")
    public void setAcctInd(String acctInd) {
        this.acctInd = acctInd;
    }

    public AttributeTypeSetsMaintenance100GetResponse withAcctInd(String acctInd) {
        this.acctInd = acctInd;
        return this;
    }

    /**
     * Ftratts Attt Code
     * <p>
     * Lineage reference object : FTRATTS_ATTT_CODE
     * (Required)
     * 
     */
    @JsonProperty("atttCode")
    public String getAtttCode() {
        return atttCode;
    }

    /**
     * Ftratts Attt Code
     * <p>
     * Lineage reference object : FTRATTS_ATTT_CODE
     * (Required)
     * 
     */
    @JsonProperty("atttCode")
    public void setAtttCode(String atttCode) {
        this.atttCode = atttCode;
    }

    public AttributeTypeSetsMaintenance100GetResponse withAtttCode(String atttCode) {
        this.atttCode = atttCode;
        return this;
    }

    @JsonProperty("progInd")
    public String getProgInd() {
        return progInd;
    }

    @JsonProperty("progInd")
    public void setProgInd(String progInd) {
        this.progInd = progInd;
    }

    public AttributeTypeSetsMaintenance100GetResponse withProgInd(String progInd) {
        this.progInd = progInd;
        return this;
    }

    @JsonProperty("ftvatttStatusInd")
    public String getFtvatttStatusInd() {
        return ftvatttStatusInd;
    }

    @JsonProperty("ftvatttStatusInd")
    public void setFtvatttStatusInd(String ftvatttStatusInd) {
        this.ftvatttStatusInd = ftvatttStatusInd;
    }

    public AttributeTypeSetsMaintenance100GetResponse withFtvatttStatusInd(String ftvatttStatusInd) {
        this.ftvatttStatusInd = ftvatttStatusInd;
        return this;
    }

    @JsonProperty("actvInd")
    public String getActvInd() {
        return actvInd;
    }

    @JsonProperty("actvInd")
    public void setActvInd(String actvInd) {
        this.actvInd = actvInd;
    }

    public AttributeTypeSetsMaintenance100GetResponse withActvInd(String actvInd) {
        this.actvInd = actvInd;
        return this;
    }

    @JsonProperty("orgnInd")
    public String getOrgnInd() {
        return orgnInd;
    }

    @JsonProperty("orgnInd")
    public void setOrgnInd(String orgnInd) {
        this.orgnInd = orgnInd;
    }

    public AttributeTypeSetsMaintenance100GetResponse withOrgnInd(String orgnInd) {
        this.orgnInd = orgnInd;
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

    public AttributeTypeSetsMaintenance100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AttributeTypeSetsMaintenance100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("locnInd");
        sb.append('=');
        sb.append(((this.locnInd == null)?"<null>":this.locnInd));
        sb.append(',');
        sb.append("allInd");
        sb.append('=');
        sb.append(((this.allInd == null)?"<null>":this.allInd));
        sb.append(',');
        sb.append("fundInd");
        sb.append('=');
        sb.append(((this.fundInd == null)?"<null>":this.fundInd));
        sb.append(',');
        sb.append("ftvatttDesc");
        sb.append('=');
        sb.append(((this.ftvatttDesc == null)?"<null>":this.ftvatttDesc));
        sb.append(',');
        sb.append("acctInd");
        sb.append('=');
        sb.append(((this.acctInd == null)?"<null>":this.acctInd));
        sb.append(',');
        sb.append("atttCode");
        sb.append('=');
        sb.append(((this.atttCode == null)?"<null>":this.atttCode));
        sb.append(',');
        sb.append("progInd");
        sb.append('=');
        sb.append(((this.progInd == null)?"<null>":this.progInd));
        sb.append(',');
        sb.append("ftvatttStatusInd");
        sb.append('=');
        sb.append(((this.ftvatttStatusInd == null)?"<null>":this.ftvatttStatusInd));
        sb.append(',');
        sb.append("actvInd");
        sb.append('=');
        sb.append(((this.actvInd == null)?"<null>":this.actvInd));
        sb.append(',');
        sb.append("orgnInd");
        sb.append('=');
        sb.append(((this.orgnInd == null)?"<null>":this.orgnInd));
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
        result = ((result* 31)+((this.locnInd == null)? 0 :this.locnInd.hashCode()));
        result = ((result* 31)+((this.allInd == null)? 0 :this.allInd.hashCode()));
        result = ((result* 31)+((this.fundInd == null)? 0 :this.fundInd.hashCode()));
        result = ((result* 31)+((this.ftvatttDesc == null)? 0 :this.ftvatttDesc.hashCode()));
        result = ((result* 31)+((this.acctInd == null)? 0 :this.acctInd.hashCode()));
        result = ((result* 31)+((this.atttCode == null)? 0 :this.atttCode.hashCode()));
        result = ((result* 31)+((this.progInd == null)? 0 :this.progInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ftvatttStatusInd == null)? 0 :this.ftvatttStatusInd.hashCode()));
        result = ((result* 31)+((this.actvInd == null)? 0 :this.actvInd.hashCode()));
        result = ((result* 31)+((this.orgnInd == null)? 0 :this.orgnInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AttributeTypeSetsMaintenance100GetResponse) == false) {
            return false;
        }
        AttributeTypeSetsMaintenance100GetResponse rhs = ((AttributeTypeSetsMaintenance100GetResponse) other);
        return ((((((((((((this.locnInd == rhs.locnInd)||((this.locnInd!= null)&&this.locnInd.equals(rhs.locnInd)))&&((this.allInd == rhs.allInd)||((this.allInd!= null)&&this.allInd.equals(rhs.allInd))))&&((this.fundInd == rhs.fundInd)||((this.fundInd!= null)&&this.fundInd.equals(rhs.fundInd))))&&((this.ftvatttDesc == rhs.ftvatttDesc)||((this.ftvatttDesc!= null)&&this.ftvatttDesc.equals(rhs.ftvatttDesc))))&&((this.acctInd == rhs.acctInd)||((this.acctInd!= null)&&this.acctInd.equals(rhs.acctInd))))&&((this.atttCode == rhs.atttCode)||((this.atttCode!= null)&&this.atttCode.equals(rhs.atttCode))))&&((this.progInd == rhs.progInd)||((this.progInd!= null)&&this.progInd.equals(rhs.progInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ftvatttStatusInd == rhs.ftvatttStatusInd)||((this.ftvatttStatusInd!= null)&&this.ftvatttStatusInd.equals(rhs.ftvatttStatusInd))))&&((this.actvInd == rhs.actvInd)||((this.actvInd!= null)&&this.actvInd.equals(rhs.actvInd))))&&((this.orgnInd == rhs.orgnInd)||((this.orgnInd!= null)&&this.orgnInd.equals(rhs.orgnInd))));
    }

}
