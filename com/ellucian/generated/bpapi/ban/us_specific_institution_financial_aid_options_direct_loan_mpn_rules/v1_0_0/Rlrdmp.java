
package com.ellucian.generated.bpapi.ban.us_specific_institution_financial_aid_options_direct_loan_mpn_rules.v1_0_0;

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
    "mpnReqInstructions",
    "reqStatus",
    "satInd",
    "displayReqStatusDesc",
    "infoAccessInd",
    "trkLtrInd",
    "mpnReqUrl",
    "reqStatusWebDesc",
    "mpnReqDesc",
    "reqInstrInd"
})
@Generated("jsonschema2pojo")
public class Rlrdmp {

    /**
     * Instructions
     * <p>
     * Lineage reference object : RLRDMPS_MPN_REQ_INSTRUCTIONS
     * 
     */
    @JsonProperty("mpnReqInstructions")
    @JsonPropertyDescription("Lineage reference object : RLRDMPS_MPN_REQ_INSTRUCTIONS")
    private String mpnReqInstructions;
    /**
     * Status
     * <p>
     * Lineage reference object : RLRDMPS_REQ_STATUS
     * 
     */
    @JsonProperty("reqStatus")
    @JsonPropertyDescription("Lineage reference object : RLRDMPS_REQ_STATUS")
    private String reqStatus;
    /**
     * Lineage reference object : RLRDMPS_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    @JsonPropertyDescription("Lineage reference object : RLRDMPS_SAT_IND")
    private String satInd;
    /**
     * Status Short Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReqStatusDesc")
    private String displayReqStatusDesc;
    /**
     * Lineage reference object : RLRDMPS_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    @JsonPropertyDescription("Lineage reference object : RLRDMPS_INFO_ACCESS_IND")
    private String infoAccessInd;
    /**
     * Lineage reference object : RLRDMPS_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    @JsonPropertyDescription("Lineage reference object : RLRDMPS_TRK_LTR_IND")
    private String trkLtrInd;
    /**
     * PN URL
     * <p>
     * Lineage reference object : RLRDMPS_MPN_REQ_URL
     * 
     */
    @JsonProperty("mpnReqUrl")
    @JsonPropertyDescription("Lineage reference object : RLRDMPS_MPN_REQ_URL")
    private String mpnReqUrl;
    /**
     * Status Long Description
     * <p>
     * Lineage reference object : RLRDMPS_REQ_STATUS_WEB_DESC
     * 
     */
    @JsonProperty("reqStatusWebDesc")
    @JsonPropertyDescription("Lineage reference object : RLRDMPS_REQ_STATUS_WEB_DESC")
    private String reqStatusWebDesc;
    /**
     * PN Description
     * <p>
     * Lineage reference object : RLRDMPS_MPN_REQ_DESC
     * 
     */
    @JsonProperty("mpnReqDesc")
    @JsonPropertyDescription("Lineage reference object : RLRDMPS_MPN_REQ_DESC")
    private String mpnReqDesc;
    /**
     * Lineage reference object : RLRDMPS_REQ_INSTR_IND
     * 
     */
    @JsonProperty("reqInstrInd")
    @JsonPropertyDescription("Lineage reference object : RLRDMPS_REQ_INSTR_IND")
    private String reqInstrInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Instructions
     * <p>
     * Lineage reference object : RLRDMPS_MPN_REQ_INSTRUCTIONS
     * 
     */
    @JsonProperty("mpnReqInstructions")
    public String getMpnReqInstructions() {
        return mpnReqInstructions;
    }

    /**
     * Instructions
     * <p>
     * Lineage reference object : RLRDMPS_MPN_REQ_INSTRUCTIONS
     * 
     */
    @JsonProperty("mpnReqInstructions")
    public void setMpnReqInstructions(String mpnReqInstructions) {
        this.mpnReqInstructions = mpnReqInstructions;
    }

    public Rlrdmp withMpnReqInstructions(String mpnReqInstructions) {
        this.mpnReqInstructions = mpnReqInstructions;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RLRDMPS_REQ_STATUS
     * 
     */
    @JsonProperty("reqStatus")
    public String getReqStatus() {
        return reqStatus;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : RLRDMPS_REQ_STATUS
     * 
     */
    @JsonProperty("reqStatus")
    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
    }

    public Rlrdmp withReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
        return this;
    }

    /**
     * Lineage reference object : RLRDMPS_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    public String getSatInd() {
        return satInd;
    }

    /**
     * Lineage reference object : RLRDMPS_SAT_IND
     * 
     */
    @JsonProperty("satInd")
    public void setSatInd(String satInd) {
        this.satInd = satInd;
    }

    public Rlrdmp withSatInd(String satInd) {
        this.satInd = satInd;
        return this;
    }

    /**
     * Status Short Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReqStatusDesc")
    public String getDisplayReqStatusDesc() {
        return displayReqStatusDesc;
    }

    /**
     * Status Short Description
     * <p>
     * 
     * 
     */
    @JsonProperty("displayReqStatusDesc")
    public void setDisplayReqStatusDesc(String displayReqStatusDesc) {
        this.displayReqStatusDesc = displayReqStatusDesc;
    }

    public Rlrdmp withDisplayReqStatusDesc(String displayReqStatusDesc) {
        this.displayReqStatusDesc = displayReqStatusDesc;
        return this;
    }

    /**
     * Lineage reference object : RLRDMPS_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    /**
     * Lineage reference object : RLRDMPS_INFO_ACCESS_IND
     * 
     */
    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public Rlrdmp withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    /**
     * Lineage reference object : RLRDMPS_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    public String getTrkLtrInd() {
        return trkLtrInd;
    }

    /**
     * Lineage reference object : RLRDMPS_TRK_LTR_IND
     * 
     */
    @JsonProperty("trkLtrInd")
    public void setTrkLtrInd(String trkLtrInd) {
        this.trkLtrInd = trkLtrInd;
    }

    public Rlrdmp withTrkLtrInd(String trkLtrInd) {
        this.trkLtrInd = trkLtrInd;
        return this;
    }

    /**
     * PN URL
     * <p>
     * Lineage reference object : RLRDMPS_MPN_REQ_URL
     * 
     */
    @JsonProperty("mpnReqUrl")
    public String getMpnReqUrl() {
        return mpnReqUrl;
    }

    /**
     * PN URL
     * <p>
     * Lineage reference object : RLRDMPS_MPN_REQ_URL
     * 
     */
    @JsonProperty("mpnReqUrl")
    public void setMpnReqUrl(String mpnReqUrl) {
        this.mpnReqUrl = mpnReqUrl;
    }

    public Rlrdmp withMpnReqUrl(String mpnReqUrl) {
        this.mpnReqUrl = mpnReqUrl;
        return this;
    }

    /**
     * Status Long Description
     * <p>
     * Lineage reference object : RLRDMPS_REQ_STATUS_WEB_DESC
     * 
     */
    @JsonProperty("reqStatusWebDesc")
    public String getReqStatusWebDesc() {
        return reqStatusWebDesc;
    }

    /**
     * Status Long Description
     * <p>
     * Lineage reference object : RLRDMPS_REQ_STATUS_WEB_DESC
     * 
     */
    @JsonProperty("reqStatusWebDesc")
    public void setReqStatusWebDesc(String reqStatusWebDesc) {
        this.reqStatusWebDesc = reqStatusWebDesc;
    }

    public Rlrdmp withReqStatusWebDesc(String reqStatusWebDesc) {
        this.reqStatusWebDesc = reqStatusWebDesc;
        return this;
    }

    /**
     * PN Description
     * <p>
     * Lineage reference object : RLRDMPS_MPN_REQ_DESC
     * 
     */
    @JsonProperty("mpnReqDesc")
    public String getMpnReqDesc() {
        return mpnReqDesc;
    }

    /**
     * PN Description
     * <p>
     * Lineage reference object : RLRDMPS_MPN_REQ_DESC
     * 
     */
    @JsonProperty("mpnReqDesc")
    public void setMpnReqDesc(String mpnReqDesc) {
        this.mpnReqDesc = mpnReqDesc;
    }

    public Rlrdmp withMpnReqDesc(String mpnReqDesc) {
        this.mpnReqDesc = mpnReqDesc;
        return this;
    }

    /**
     * Lineage reference object : RLRDMPS_REQ_INSTR_IND
     * 
     */
    @JsonProperty("reqInstrInd")
    public String getReqInstrInd() {
        return reqInstrInd;
    }

    /**
     * Lineage reference object : RLRDMPS_REQ_INSTR_IND
     * 
     */
    @JsonProperty("reqInstrInd")
    public void setReqInstrInd(String reqInstrInd) {
        this.reqInstrInd = reqInstrInd;
    }

    public Rlrdmp withReqInstrInd(String reqInstrInd) {
        this.reqInstrInd = reqInstrInd;
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

    public Rlrdmp withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rlrdmp.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("mpnReqInstructions");
        sb.append('=');
        sb.append(((this.mpnReqInstructions == null)?"<null>":this.mpnReqInstructions));
        sb.append(',');
        sb.append("reqStatus");
        sb.append('=');
        sb.append(((this.reqStatus == null)?"<null>":this.reqStatus));
        sb.append(',');
        sb.append("satInd");
        sb.append('=');
        sb.append(((this.satInd == null)?"<null>":this.satInd));
        sb.append(',');
        sb.append("displayReqStatusDesc");
        sb.append('=');
        sb.append(((this.displayReqStatusDesc == null)?"<null>":this.displayReqStatusDesc));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("trkLtrInd");
        sb.append('=');
        sb.append(((this.trkLtrInd == null)?"<null>":this.trkLtrInd));
        sb.append(',');
        sb.append("mpnReqUrl");
        sb.append('=');
        sb.append(((this.mpnReqUrl == null)?"<null>":this.mpnReqUrl));
        sb.append(',');
        sb.append("reqStatusWebDesc");
        sb.append('=');
        sb.append(((this.reqStatusWebDesc == null)?"<null>":this.reqStatusWebDesc));
        sb.append(',');
        sb.append("mpnReqDesc");
        sb.append('=');
        sb.append(((this.mpnReqDesc == null)?"<null>":this.mpnReqDesc));
        sb.append(',');
        sb.append("reqInstrInd");
        sb.append('=');
        sb.append(((this.reqInstrInd == null)?"<null>":this.reqInstrInd));
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
        result = ((result* 31)+((this.mpnReqInstructions == null)? 0 :this.mpnReqInstructions.hashCode()));
        result = ((result* 31)+((this.reqStatus == null)? 0 :this.reqStatus.hashCode()));
        result = ((result* 31)+((this.satInd == null)? 0 :this.satInd.hashCode()));
        result = ((result* 31)+((this.displayReqStatusDesc == null)? 0 :this.displayReqStatusDesc.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.trkLtrInd == null)? 0 :this.trkLtrInd.hashCode()));
        result = ((result* 31)+((this.mpnReqUrl == null)? 0 :this.mpnReqUrl.hashCode()));
        result = ((result* 31)+((this.reqStatusWebDesc == null)? 0 :this.reqStatusWebDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.mpnReqDesc == null)? 0 :this.mpnReqDesc.hashCode()));
        result = ((result* 31)+((this.reqInstrInd == null)? 0 :this.reqInstrInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rlrdmp) == false) {
            return false;
        }
        Rlrdmp rhs = ((Rlrdmp) other);
        return ((((((((((((this.mpnReqInstructions == rhs.mpnReqInstructions)||((this.mpnReqInstructions!= null)&&this.mpnReqInstructions.equals(rhs.mpnReqInstructions)))&&((this.reqStatus == rhs.reqStatus)||((this.reqStatus!= null)&&this.reqStatus.equals(rhs.reqStatus))))&&((this.satInd == rhs.satInd)||((this.satInd!= null)&&this.satInd.equals(rhs.satInd))))&&((this.displayReqStatusDesc == rhs.displayReqStatusDesc)||((this.displayReqStatusDesc!= null)&&this.displayReqStatusDesc.equals(rhs.displayReqStatusDesc))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.trkLtrInd == rhs.trkLtrInd)||((this.trkLtrInd!= null)&&this.trkLtrInd.equals(rhs.trkLtrInd))))&&((this.mpnReqUrl == rhs.mpnReqUrl)||((this.mpnReqUrl!= null)&&this.mpnReqUrl.equals(rhs.mpnReqUrl))))&&((this.reqStatusWebDesc == rhs.reqStatusWebDesc)||((this.reqStatusWebDesc!= null)&&this.reqStatusWebDesc.equals(rhs.reqStatusWebDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.mpnReqDesc == rhs.mpnReqDesc)||((this.mpnReqDesc!= null)&&this.mpnReqDesc.equals(rhs.mpnReqDesc))))&&((this.reqInstrInd == rhs.reqInstrInd)||((this.reqInstrInd!= null)&&this.reqInstrInd.equals(rhs.reqInstrInd))));
    }

}
