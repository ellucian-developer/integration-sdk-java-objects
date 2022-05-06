
package com.ellucian.generated.bpapi.ban._2021_2022_applicant_override.v1_0_0;

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
    "displayImLock",
    "rcrapp1InfcCode",
    "rcrapp1VerificationMsg",
    "rcrapp1SeqNo",
    "displayVerifyMsgDesc",
    "displaySeqNo",
    "displayInfcCode",
    "displayLockCurrentInd"
})
@Generated("jsonschema2pojo")
public class Rorstat__1 {

    /**
     * Lock IM Record
     * <p>
     * 
     * 
     */
    @JsonProperty("displayImLock")
    private String displayImLock;
    /**
     * New FM Record Source
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1InfcCode")
    private String rcrapp1InfcCode;
    /**
     * Verification Message
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationMsg")
    private String rcrapp1VerificationMsg;
    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1SeqNo")
    private Double rcrapp1SeqNo;
    @JsonProperty("displayVerifyMsgDesc")
    private String displayVerifyMsgDesc;
    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySeqNo")
    private Double displaySeqNo;
    /**
     * Current FM Record Source
     * <p>
     * Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("displayInfcCode")
    @JsonPropertyDescription("Lookup lineage reference object : rtvinfc")
    private String displayInfcCode;
    /**
     * Lock Current Record
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLockCurrentInd")
    private String displayLockCurrentInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lock IM Record
     * <p>
     * 
     * 
     */
    @JsonProperty("displayImLock")
    public String getDisplayImLock() {
        return displayImLock;
    }

    /**
     * Lock IM Record
     * <p>
     * 
     * 
     */
    @JsonProperty("displayImLock")
    public void setDisplayImLock(String displayImLock) {
        this.displayImLock = displayImLock;
    }

    public Rorstat__1 withDisplayImLock(String displayImLock) {
        this.displayImLock = displayImLock;
        return this;
    }

    /**
     * New FM Record Source
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1InfcCode")
    public String getRcrapp1InfcCode() {
        return rcrapp1InfcCode;
    }

    /**
     * New FM Record Source
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1InfcCode")
    public void setRcrapp1InfcCode(String rcrapp1InfcCode) {
        this.rcrapp1InfcCode = rcrapp1InfcCode;
    }

    public Rorstat__1 withRcrapp1InfcCode(String rcrapp1InfcCode) {
        this.rcrapp1InfcCode = rcrapp1InfcCode;
        return this;
    }

    /**
     * Verification Message
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationMsg")
    public String getRcrapp1VerificationMsg() {
        return rcrapp1VerificationMsg;
    }

    /**
     * Verification Message
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1VerificationMsg")
    public void setRcrapp1VerificationMsg(String rcrapp1VerificationMsg) {
        this.rcrapp1VerificationMsg = rcrapp1VerificationMsg;
    }

    public Rorstat__1 withRcrapp1VerificationMsg(String rcrapp1VerificationMsg) {
        this.rcrapp1VerificationMsg = rcrapp1VerificationMsg;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1SeqNo")
    public Double getRcrapp1SeqNo() {
        return rcrapp1SeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1SeqNo")
    public void setRcrapp1SeqNo(Double rcrapp1SeqNo) {
        this.rcrapp1SeqNo = rcrapp1SeqNo;
    }

    public Rorstat__1 withRcrapp1SeqNo(Double rcrapp1SeqNo) {
        this.rcrapp1SeqNo = rcrapp1SeqNo;
        return this;
    }

    @JsonProperty("displayVerifyMsgDesc")
    public String getDisplayVerifyMsgDesc() {
        return displayVerifyMsgDesc;
    }

    @JsonProperty("displayVerifyMsgDesc")
    public void setDisplayVerifyMsgDesc(String displayVerifyMsgDesc) {
        this.displayVerifyMsgDesc = displayVerifyMsgDesc;
    }

    public Rorstat__1 withDisplayVerifyMsgDesc(String displayVerifyMsgDesc) {
        this.displayVerifyMsgDesc = displayVerifyMsgDesc;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySeqNo")
    public Double getDisplaySeqNo() {
        return displaySeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * 
     * 
     */
    @JsonProperty("displaySeqNo")
    public void setDisplaySeqNo(Double displaySeqNo) {
        this.displaySeqNo = displaySeqNo;
    }

    public Rorstat__1 withDisplaySeqNo(Double displaySeqNo) {
        this.displaySeqNo = displaySeqNo;
        return this;
    }

    /**
     * Current FM Record Source
     * <p>
     * Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("displayInfcCode")
    public String getDisplayInfcCode() {
        return displayInfcCode;
    }

    /**
     * Current FM Record Source
     * <p>
     * Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("displayInfcCode")
    public void setDisplayInfcCode(String displayInfcCode) {
        this.displayInfcCode = displayInfcCode;
    }

    public Rorstat__1 withDisplayInfcCode(String displayInfcCode) {
        this.displayInfcCode = displayInfcCode;
        return this;
    }

    /**
     * Lock Current Record
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLockCurrentInd")
    public String getDisplayLockCurrentInd() {
        return displayLockCurrentInd;
    }

    /**
     * Lock Current Record
     * <p>
     * 
     * 
     */
    @JsonProperty("displayLockCurrentInd")
    public void setDisplayLockCurrentInd(String displayLockCurrentInd) {
        this.displayLockCurrentInd = displayLockCurrentInd;
    }

    public Rorstat__1 withDisplayLockCurrentInd(String displayLockCurrentInd) {
        this.displayLockCurrentInd = displayLockCurrentInd;
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

    public Rorstat__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rorstat__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayImLock");
        sb.append('=');
        sb.append(((this.displayImLock == null)?"<null>":this.displayImLock));
        sb.append(',');
        sb.append("rcrapp1InfcCode");
        sb.append('=');
        sb.append(((this.rcrapp1InfcCode == null)?"<null>":this.rcrapp1InfcCode));
        sb.append(',');
        sb.append("rcrapp1VerificationMsg");
        sb.append('=');
        sb.append(((this.rcrapp1VerificationMsg == null)?"<null>":this.rcrapp1VerificationMsg));
        sb.append(',');
        sb.append("rcrapp1SeqNo");
        sb.append('=');
        sb.append(((this.rcrapp1SeqNo == null)?"<null>":this.rcrapp1SeqNo));
        sb.append(',');
        sb.append("displayVerifyMsgDesc");
        sb.append('=');
        sb.append(((this.displayVerifyMsgDesc == null)?"<null>":this.displayVerifyMsgDesc));
        sb.append(',');
        sb.append("displaySeqNo");
        sb.append('=');
        sb.append(((this.displaySeqNo == null)?"<null>":this.displaySeqNo));
        sb.append(',');
        sb.append("displayInfcCode");
        sb.append('=');
        sb.append(((this.displayInfcCode == null)?"<null>":this.displayInfcCode));
        sb.append(',');
        sb.append("displayLockCurrentInd");
        sb.append('=');
        sb.append(((this.displayLockCurrentInd == null)?"<null>":this.displayLockCurrentInd));
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
        result = ((result* 31)+((this.displayImLock == null)? 0 :this.displayImLock.hashCode()));
        result = ((result* 31)+((this.rcrapp1InfcCode == null)? 0 :this.rcrapp1InfcCode.hashCode()));
        result = ((result* 31)+((this.rcrapp1VerificationMsg == null)? 0 :this.rcrapp1VerificationMsg.hashCode()));
        result = ((result* 31)+((this.rcrapp1SeqNo == null)? 0 :this.rcrapp1SeqNo.hashCode()));
        result = ((result* 31)+((this.displayVerifyMsgDesc == null)? 0 :this.displayVerifyMsgDesc.hashCode()));
        result = ((result* 31)+((this.displaySeqNo == null)? 0 :this.displaySeqNo.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayInfcCode == null)? 0 :this.displayInfcCode.hashCode()));
        result = ((result* 31)+((this.displayLockCurrentInd == null)? 0 :this.displayLockCurrentInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rorstat__1) == false) {
            return false;
        }
        Rorstat__1 rhs = ((Rorstat__1) other);
        return ((((((((((this.displayImLock == rhs.displayImLock)||((this.displayImLock!= null)&&this.displayImLock.equals(rhs.displayImLock)))&&((this.rcrapp1InfcCode == rhs.rcrapp1InfcCode)||((this.rcrapp1InfcCode!= null)&&this.rcrapp1InfcCode.equals(rhs.rcrapp1InfcCode))))&&((this.rcrapp1VerificationMsg == rhs.rcrapp1VerificationMsg)||((this.rcrapp1VerificationMsg!= null)&&this.rcrapp1VerificationMsg.equals(rhs.rcrapp1VerificationMsg))))&&((this.rcrapp1SeqNo == rhs.rcrapp1SeqNo)||((this.rcrapp1SeqNo!= null)&&this.rcrapp1SeqNo.equals(rhs.rcrapp1SeqNo))))&&((this.displayVerifyMsgDesc == rhs.displayVerifyMsgDesc)||((this.displayVerifyMsgDesc!= null)&&this.displayVerifyMsgDesc.equals(rhs.displayVerifyMsgDesc))))&&((this.displaySeqNo == rhs.displaySeqNo)||((this.displaySeqNo!= null)&&this.displaySeqNo.equals(rhs.displaySeqNo))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayInfcCode == rhs.displayInfcCode)||((this.displayInfcCode!= null)&&this.displayInfcCode.equals(rhs.displayInfcCode))))&&((this.displayLockCurrentInd == rhs.displayLockCurrentInd)||((this.displayLockCurrentInd!= null)&&this.displayLockCurrentInd.equals(rhs.displayLockCurrentInd))));
    }

}
