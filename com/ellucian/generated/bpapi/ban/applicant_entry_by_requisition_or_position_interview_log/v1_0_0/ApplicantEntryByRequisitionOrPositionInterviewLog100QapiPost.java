
package com.ellucian.generated.bpapi.ban.applicant_entry_by_requisition_or_position_interview_log.v1_0_0;

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
    "reqNo",
    "posn",
    "pclsCode"
})
@Generated("jsonschema2pojo")
public class ApplicantEntryByRequisitionOrPositionInterviewLog100QapiPost {

    @JsonProperty("reqNo")
    private String reqNo;
    @JsonProperty("posn")
    private String posn;
    @JsonProperty("pclsCode")
    private String pclsCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reqNo")
    public String getReqNo() {
        return reqNo;
    }

    @JsonProperty("reqNo")
    public void setReqNo(String reqNo) {
        this.reqNo = reqNo;
    }

    public ApplicantEntryByRequisitionOrPositionInterviewLog100QapiPost withReqNo(String reqNo) {
        this.reqNo = reqNo;
        return this;
    }

    @JsonProperty("posn")
    public String getPosn() {
        return posn;
    }

    @JsonProperty("posn")
    public void setPosn(String posn) {
        this.posn = posn;
    }

    public ApplicantEntryByRequisitionOrPositionInterviewLog100QapiPost withPosn(String posn) {
        this.posn = posn;
        return this;
    }

    @JsonProperty("pclsCode")
    public String getPclsCode() {
        return pclsCode;
    }

    @JsonProperty("pclsCode")
    public void setPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
    }

    public ApplicantEntryByRequisitionOrPositionInterviewLog100QapiPost withPclsCode(String pclsCode) {
        this.pclsCode = pclsCode;
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

    public ApplicantEntryByRequisitionOrPositionInterviewLog100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantEntryByRequisitionOrPositionInterviewLog100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqNo");
        sb.append('=');
        sb.append(((this.reqNo == null)?"<null>":this.reqNo));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
        sb.append(',');
        sb.append("pclsCode");
        sb.append('=');
        sb.append(((this.pclsCode == null)?"<null>":this.pclsCode));
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
        result = ((result* 31)+((this.reqNo == null)? 0 :this.reqNo.hashCode()));
        result = ((result* 31)+((this.pclsCode == null)? 0 :this.pclsCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.posn == null)? 0 :this.posn.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantEntryByRequisitionOrPositionInterviewLog100QapiPost) == false) {
            return false;
        }
        ApplicantEntryByRequisitionOrPositionInterviewLog100QapiPost rhs = ((ApplicantEntryByRequisitionOrPositionInterviewLog100QapiPost) other);
        return (((((this.reqNo == rhs.reqNo)||((this.reqNo!= null)&&this.reqNo.equals(rhs.reqNo)))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))));
    }

}
