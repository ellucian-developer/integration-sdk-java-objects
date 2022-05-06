
package com.ellucian.generated.bpapi.ban.position_requisition.v1_0_0;

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
    "reqNo"
})
@Generated("jsonschema2pojo")
public class PositionRequisition100GetRequest {

    /**
     * Requisition Number
     * <p>
     * Lineage reference object : reqNo
     * 
     */
    @JsonProperty("reqNo")
    @JsonPropertyDescription("Lineage reference object : reqNo")
    private Object reqNo;
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

    public PositionRequisition100GetRequest withReqNo(Object reqNo) {
        this.reqNo = reqNo;
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

    public PositionRequisition100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PositionRequisition100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reqNo");
        sb.append('=');
        sb.append(((this.reqNo == null)?"<null>":this.reqNo));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PositionRequisition100GetRequest) == false) {
            return false;
        }
        PositionRequisition100GetRequest rhs = ((PositionRequisition100GetRequest) other);
        return (((this.reqNo == rhs.reqNo)||((this.reqNo!= null)&&this.reqNo.equals(rhs.reqNo)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
