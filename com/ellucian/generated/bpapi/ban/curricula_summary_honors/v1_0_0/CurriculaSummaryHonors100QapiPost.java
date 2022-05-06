
package com.ellucian.generated.bpapi.ban.curricula_summary_honors.v1_0_0;

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
    "id",
    "dgmrSeqNo",
    "viewCurrent",
    "degsCode",
    "honrCode"
})
@Generated("jsonschema2pojo")
public class CurriculaSummaryHonors100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("dgmrSeqNo")
    private String dgmrSeqNo;
    @JsonProperty("viewCurrent")
    private String viewCurrent;
    @JsonProperty("degsCode")
    private String degsCode;
    @JsonProperty("honrCode")
    private String honrCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public CurriculaSummaryHonors100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("dgmrSeqNo")
    public String getDgmrSeqNo() {
        return dgmrSeqNo;
    }

    @JsonProperty("dgmrSeqNo")
    public void setDgmrSeqNo(String dgmrSeqNo) {
        this.dgmrSeqNo = dgmrSeqNo;
    }

    public CurriculaSummaryHonors100QapiPost withDgmrSeqNo(String dgmrSeqNo) {
        this.dgmrSeqNo = dgmrSeqNo;
        return this;
    }

    @JsonProperty("viewCurrent")
    public String getViewCurrent() {
        return viewCurrent;
    }

    @JsonProperty("viewCurrent")
    public void setViewCurrent(String viewCurrent) {
        this.viewCurrent = viewCurrent;
    }

    public CurriculaSummaryHonors100QapiPost withViewCurrent(String viewCurrent) {
        this.viewCurrent = viewCurrent;
        return this;
    }

    @JsonProperty("degsCode")
    public String getDegsCode() {
        return degsCode;
    }

    @JsonProperty("degsCode")
    public void setDegsCode(String degsCode) {
        this.degsCode = degsCode;
    }

    public CurriculaSummaryHonors100QapiPost withDegsCode(String degsCode) {
        this.degsCode = degsCode;
        return this;
    }

    @JsonProperty("honrCode")
    public String getHonrCode() {
        return honrCode;
    }

    @JsonProperty("honrCode")
    public void setHonrCode(String honrCode) {
        this.honrCode = honrCode;
    }

    public CurriculaSummaryHonors100QapiPost withHonrCode(String honrCode) {
        this.honrCode = honrCode;
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

    public CurriculaSummaryHonors100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurriculaSummaryHonors100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("dgmrSeqNo");
        sb.append('=');
        sb.append(((this.dgmrSeqNo == null)?"<null>":this.dgmrSeqNo));
        sb.append(',');
        sb.append("viewCurrent");
        sb.append('=');
        sb.append(((this.viewCurrent == null)?"<null>":this.viewCurrent));
        sb.append(',');
        sb.append("degsCode");
        sb.append('=');
        sb.append(((this.degsCode == null)?"<null>":this.degsCode));
        sb.append(',');
        sb.append("honrCode");
        sb.append('=');
        sb.append(((this.honrCode == null)?"<null>":this.honrCode));
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
        result = ((result* 31)+((this.honrCode == null)? 0 :this.honrCode.hashCode()));
        result = ((result* 31)+((this.degsCode == null)? 0 :this.degsCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dgmrSeqNo == null)? 0 :this.dgmrSeqNo.hashCode()));
        result = ((result* 31)+((this.viewCurrent == null)? 0 :this.viewCurrent.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurriculaSummaryHonors100QapiPost) == false) {
            return false;
        }
        CurriculaSummaryHonors100QapiPost rhs = ((CurriculaSummaryHonors100QapiPost) other);
        return (((((((this.honrCode == rhs.honrCode)||((this.honrCode!= null)&&this.honrCode.equals(rhs.honrCode)))&&((this.degsCode == rhs.degsCode)||((this.degsCode!= null)&&this.degsCode.equals(rhs.degsCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dgmrSeqNo == rhs.dgmrSeqNo)||((this.dgmrSeqNo!= null)&&this.dgmrSeqNo.equals(rhs.dgmrSeqNo))))&&((this.viewCurrent == rhs.viewCurrent)||((this.viewCurrent!= null)&&this.viewCurrent.equals(rhs.viewCurrent))));
    }

}
