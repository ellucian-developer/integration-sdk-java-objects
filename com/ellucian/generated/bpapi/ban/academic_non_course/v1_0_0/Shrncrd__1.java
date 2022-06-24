
package com.ellucian.generated.bpapi.ban.academic_non_course.v1_0_0;

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
    "degcCode",
    "dgmrSeqNo",
    "degcDesc"
})
@Generated("jsonschema2pojo")
public class Shrncrd__1 {

    /**
     * Code
     * <p>
     * 
     * 
     */
    @JsonProperty("degcCode")
    private String degcCode;
    /**
     * Number
     * <p>
     * Lineage reference object : SHRNCRD_DGMR_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("dgmrSeqNo")
    @JsonPropertyDescription("Lineage reference object : SHRNCRD_DGMR_SEQ_NO")
    private Double dgmrSeqNo;
    /**
     * Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degcDesc")
    private String degcDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Code
     * <p>
     * 
     * 
     */
    @JsonProperty("degcCode")
    public String getDegcCode() {
        return degcCode;
    }

    /**
     * Code
     * <p>
     * 
     * 
     */
    @JsonProperty("degcCode")
    public void setDegcCode(String degcCode) {
        this.degcCode = degcCode;
    }

    public Shrncrd__1 withDegcCode(String degcCode) {
        this.degcCode = degcCode;
        return this;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : SHRNCRD_DGMR_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("dgmrSeqNo")
    public Double getDgmrSeqNo() {
        return dgmrSeqNo;
    }

    /**
     * Number
     * <p>
     * Lineage reference object : SHRNCRD_DGMR_SEQ_NO
     * (Required)
     * 
     */
    @JsonProperty("dgmrSeqNo")
    public void setDgmrSeqNo(Double dgmrSeqNo) {
        this.dgmrSeqNo = dgmrSeqNo;
    }

    public Shrncrd__1 withDgmrSeqNo(Double dgmrSeqNo) {
        this.dgmrSeqNo = dgmrSeqNo;
        return this;
    }

    /**
     * Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degcDesc")
    public String getDegcDesc() {
        return degcDesc;
    }

    /**
     * Code Description
     * <p>
     * 
     * 
     */
    @JsonProperty("degcDesc")
    public void setDegcDesc(String degcDesc) {
        this.degcDesc = degcDesc;
    }

    public Shrncrd__1 withDegcDesc(String degcDesc) {
        this.degcDesc = degcDesc;
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

    public Shrncrd__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Shrncrd__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("degcCode");
        sb.append('=');
        sb.append(((this.degcCode == null)?"<null>":this.degcCode));
        sb.append(',');
        sb.append("dgmrSeqNo");
        sb.append('=');
        sb.append(((this.dgmrSeqNo == null)?"<null>":this.dgmrSeqNo));
        sb.append(',');
        sb.append("degcDesc");
        sb.append('=');
        sb.append(((this.degcDesc == null)?"<null>":this.degcDesc));
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
        result = ((result* 31)+((this.degcCode == null)? 0 :this.degcCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.dgmrSeqNo == null)? 0 :this.dgmrSeqNo.hashCode()));
        result = ((result* 31)+((this.degcDesc == null)? 0 :this.degcDesc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Shrncrd__1) == false) {
            return false;
        }
        Shrncrd__1 rhs = ((Shrncrd__1) other);
        return (((((this.degcCode == rhs.degcCode)||((this.degcCode!= null)&&this.degcCode.equals(rhs.degcCode)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.dgmrSeqNo == rhs.dgmrSeqNo)||((this.dgmrSeqNo!= null)&&this.dgmrSeqNo.equals(rhs.dgmrSeqNo))))&&((this.degcDesc == rhs.degcDesc)||((this.degcDesc!= null)&&this.degcDesc.equals(rhs.degcDesc))));
    }

}
