
package com.ellucian.generated.bpapi.ban.fund_hierarchy.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "coasCode",
    "fundCode",
    "fundTitle",
    "effDateYmdhms",
    "fundCodePred"
})
@Generated("jsonschema2pojo")
public class FundHierarchy100QapiPost {

    @JsonProperty("coasCode")
    private String coasCode;
    @JsonProperty("fundCode")
    private String fundCode;
    @JsonProperty("fundTitle")
    private String fundTitle;
    @JsonProperty("effDateYmdhms")
    private String effDateYmdhms;
    @JsonProperty("fundCodePred")
    private String fundCodePred;
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

    public FundHierarchy100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public FundHierarchy100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    @JsonProperty("fundTitle")
    public String getFundTitle() {
        return fundTitle;
    }

    @JsonProperty("fundTitle")
    public void setFundTitle(String fundTitle) {
        this.fundTitle = fundTitle;
    }

    public FundHierarchy100QapiPost withFundTitle(String fundTitle) {
        this.fundTitle = fundTitle;
        return this;
    }

    @JsonProperty("effDateYmdhms")
    public String getEffDateYmdhms() {
        return effDateYmdhms;
    }

    @JsonProperty("effDateYmdhms")
    public void setEffDateYmdhms(String effDateYmdhms) {
        this.effDateYmdhms = effDateYmdhms;
    }

    public FundHierarchy100QapiPost withEffDateYmdhms(String effDateYmdhms) {
        this.effDateYmdhms = effDateYmdhms;
        return this;
    }

    @JsonProperty("fundCodePred")
    public String getFundCodePred() {
        return fundCodePred;
    }

    @JsonProperty("fundCodePred")
    public void setFundCodePred(String fundCodePred) {
        this.fundCodePred = fundCodePred;
    }

    public FundHierarchy100QapiPost withFundCodePred(String fundCodePred) {
        this.fundCodePred = fundCodePred;
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

    public FundHierarchy100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FundHierarchy100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("fundTitle");
        sb.append('=');
        sb.append(((this.fundTitle == null)?"<null>":this.fundTitle));
        sb.append(',');
        sb.append("effDateYmdhms");
        sb.append('=');
        sb.append(((this.effDateYmdhms == null)?"<null>":this.effDateYmdhms));
        sb.append(',');
        sb.append("fundCodePred");
        sb.append('=');
        sb.append(((this.fundCodePred == null)?"<null>":this.fundCodePred));
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
        result = ((result* 31)+((this.fundCodePred == null)? 0 :this.fundCodePred.hashCode()));
        result = ((result* 31)+((this.fundTitle == null)? 0 :this.fundTitle.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.effDateYmdhms == null)? 0 :this.effDateYmdhms.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FundHierarchy100QapiPost) == false) {
            return false;
        }
        FundHierarchy100QapiPost rhs = ((FundHierarchy100QapiPost) other);
        return (((((((this.fundCodePred == rhs.fundCodePred)||((this.fundCodePred!= null)&&this.fundCodePred.equals(rhs.fundCodePred)))&&((this.fundTitle == rhs.fundTitle)||((this.fundTitle!= null)&&this.fundTitle.equals(rhs.fundTitle))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.effDateYmdhms == rhs.effDateYmdhms)||((this.effDateYmdhms!= null)&&this.effDateYmdhms.equals(rhs.effDateYmdhms))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
