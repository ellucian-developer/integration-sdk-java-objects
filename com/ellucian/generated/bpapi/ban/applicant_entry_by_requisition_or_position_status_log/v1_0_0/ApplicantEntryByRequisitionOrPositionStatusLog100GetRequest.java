
package com.ellucian.generated.bpapi.ban.applicant_entry_by_requisition_or_position_status_log.v1_0_0;

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
    "reqNo",
    "pclsCode",
    "posn"
})
@Generated("jsonschema2pojo")
public class ApplicantEntryByRequisitionOrPositionStatusLog100GetRequest {

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : reqNo
     * 
     */
    @JsonProperty("reqNo")
    @JsonPropertyDescription("Lineage reference object : reqNo")
    private Object reqNo;
    /**
     * Position Class
     * <p>
     * Lineage reference object : pclsCode
     * 
     */
    @JsonProperty("pclsCode")
    @JsonPropertyDescription("Lineage reference object : pclsCode")
    private Object pclsCode;
    /**
     * Position Number
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    @JsonPropertyDescription("Lineage reference object : posn")
    private Object posn;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : reqNo
     * 
     */
    @JsonProperty("reqNo")
    public Object getReqNo() {
        return reqNo;
    }

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : reqNo
     * 
     */
    @JsonProperty("reqNo")
    public void setReqNo(Object reqNo) {
        this.reqNo = reqNo;
    }

    public ApplicantEntryByRequisitionOrPositionStatusLog100GetRequest withReqNo(Object reqNo) {
        this.reqNo = reqNo;
        return this;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : pclsCode
     * 
     */
    @JsonProperty("pclsCode")
    public Object getPclsCode() {
        return pclsCode;
    }

    /**
     * Position Class
     * <p>
     * Lineage reference object : pclsCode
     * 
     */
    @JsonProperty("pclsCode")
    public void setPclsCode(Object pclsCode) {
        this.pclsCode = pclsCode;
    }

    public ApplicantEntryByRequisitionOrPositionStatusLog100GetRequest withPclsCode(Object pclsCode) {
        this.pclsCode = pclsCode;
        return this;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public Object getPosn() {
        return posn;
    }

    /**
     * Position Number
     * <p>
     * Lineage reference object : posn
     * 
     */
    @JsonProperty("posn")
    public void setPosn(Object posn) {
        this.posn = posn;
    }

    public ApplicantEntryByRequisitionOrPositionStatusLog100GetRequest withPosn(Object posn) {
        this.posn = posn;
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

    public ApplicantEntryByRequisitionOrPositionStatusLog100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantEntryByRequisitionOrPositionStatusLog100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqNo");
        sb.append('=');
        sb.append(((this.reqNo == null)?"<null>":this.reqNo));
        sb.append(',');
        sb.append("pclsCode");
        sb.append('=');
        sb.append(((this.pclsCode == null)?"<null>":this.pclsCode));
        sb.append(',');
        sb.append("posn");
        sb.append('=');
        sb.append(((this.posn == null)?"<null>":this.posn));
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
        if ((other instanceof ApplicantEntryByRequisitionOrPositionStatusLog100GetRequest) == false) {
            return false;
        }
        ApplicantEntryByRequisitionOrPositionStatusLog100GetRequest rhs = ((ApplicantEntryByRequisitionOrPositionStatusLog100GetRequest) other);
        return (((((this.reqNo == rhs.reqNo)||((this.reqNo!= null)&&this.reqNo.equals(rhs.reqNo)))&&((this.pclsCode == rhs.pclsCode)||((this.pclsCode!= null)&&this.pclsCode.equals(rhs.pclsCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.posn == rhs.posn)||((this.posn!= null)&&this.posn.equals(rhs.posn))));
    }

}
