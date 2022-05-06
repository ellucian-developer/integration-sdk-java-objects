
package com.ellucian.generated.bpapi.ban.message_codes.v1_0_0;

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
    "code",
    "infoAccessInd",
    "mesgDesc",
    "stopAwrdProcess"
})
@Generated("jsonschema2pojo")
public class MessageCodes100QapiPost {

    /**
     * Message Code
     * <p>
     * Lineage reference object : RTVMESG_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVMESG_CODE")
    private String code;
    /**
     * Information Access
     * <p>
     * Lineage reference object : RTVMESG_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RTVMESG_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * Text
     * <p>
     * Lineage reference object : RTVMESG_MESG_DESC
     * 
     */
    @JsonProperty("mesgDesc")
    @JsonPropertyDescription("Lineage reference object : RTVMESG_MESG_DESC")
    private String mesgDesc;
    /**
     * Stop Electronic Award Process
     * <p>
     * Lineage reference object : RTVMESG_STOP_AWRD_PROCESS
     * 
     */
    @JsonProperty("stopAwrdProcess")
    @JsonPropertyDescription("Lineage reference object : RTVMESG_STOP_AWRD_PROCESS")
    private String stopAwrdProcess;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Message Code
     * <p>
     * Lineage reference object : RTVMESG_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Message Code
     * <p>
     * Lineage reference object : RTVMESG_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public MessageCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Information Access
     * <p>
     * Lineage reference object : RTVMESG_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Information Access
     * <p>
     * Lineage reference object : RTVMESG_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public MessageCodes100QapiPost withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * Text
     * <p>
     * Lineage reference object : RTVMESG_MESG_DESC
     * 
     */
    @JsonProperty("mesgDesc")
    public String getMesgDesc() {
        return mesgDesc;
    }

    /**
     * Text
     * <p>
     * Lineage reference object : RTVMESG_MESG_DESC
     * 
     */
    @JsonProperty("mesgDesc")
    public void setMesgDesc(String mesgDesc) {
        this.mesgDesc = mesgDesc;
    }

    public MessageCodes100QapiPost withMesgDesc(String mesgDesc) {
        this.mesgDesc = mesgDesc;
        return this;
    }

    /**
     * Stop Electronic Award Process
     * <p>
     * Lineage reference object : RTVMESG_STOP_AWRD_PROCESS
     * 
     */
    @JsonProperty("stopAwrdProcess")
    public String getStopAwrdProcess() {
        return stopAwrdProcess;
    }

    /**
     * Stop Electronic Award Process
     * <p>
     * Lineage reference object : RTVMESG_STOP_AWRD_PROCESS
     * 
     */
    @JsonProperty("stopAwrdProcess")
    public void setStopAwrdProcess(String stopAwrdProcess) {
        this.stopAwrdProcess = stopAwrdProcess;
    }

    public MessageCodes100QapiPost withStopAwrdProcess(String stopAwrdProcess) {
        this.stopAwrdProcess = stopAwrdProcess;
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

    public MessageCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MessageCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("mesgDesc");
        sb.append('=');
        sb.append(((this.mesgDesc == null)?"<null>":this.mesgDesc));
        sb.append(',');
        sb.append("stopAwrdProcess");
        sb.append('=');
        sb.append(((this.stopAwrdProcess == null)?"<null>":this.stopAwrdProcess));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.mesgDesc == null)? 0 :this.mesgDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stopAwrdProcess == null)? 0 :this.stopAwrdProcess.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MessageCodes100QapiPost) == false) {
            return false;
        }
        MessageCodes100QapiPost rhs = ((MessageCodes100QapiPost) other);
        return ((((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.mesgDesc == rhs.mesgDesc)||((this.mesgDesc!= null)&&this.mesgDesc.equals(rhs.mesgDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stopAwrdProcess == rhs.stopAwrdProcess)||((this.stopAwrdProcess!= null)&&this.stopAwrdProcess.equals(rhs.stopAwrdProcess))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))));
    }

}
