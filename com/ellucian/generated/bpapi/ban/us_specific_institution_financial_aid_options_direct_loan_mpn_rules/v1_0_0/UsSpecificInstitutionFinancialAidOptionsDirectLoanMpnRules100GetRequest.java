
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
    "infoAccessInd",
    "trkLtrInd",
    "reqStatusWebDesc",
    "mpnReqDesc",
    "displayPnInd",
    "reqInstrInd",
    "keyblckAidyCode",
    "mpnReqInstructions",
    "reqStatus",
    "satInd",
    "mpnType",
    "mpnReqUrl",
    "createReqOption"
})
@Generated("jsonschema2pojo")
public class UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest {

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
     * Display PN Requirement
     * <p>
     * Lineage reference object : RLRDMPO_DISPLAY_PN_IND
     * 
     */
    @JsonProperty("displayPnInd")
    @JsonPropertyDescription("Lineage reference object : RLRDMPO_DISPLAY_PN_IND")
    private String displayPnInd;
    /**
     * Lineage reference object : RLRDMPS_REQ_INSTR_IND
     * 
     */
    @JsonProperty("reqInstrInd")
    @JsonPropertyDescription("Lineage reference object : RLRDMPS_REQ_INSTR_IND")
    private String reqInstrInd;
    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    @JsonPropertyDescription("Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst")
    private String keyblckAidyCode;
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
     * MPN Type
     * <p>
     * Lineage reference object : RLRDMPO_MPN_TYPE
     * 
     */
    @JsonProperty("mpnType")
    @JsonPropertyDescription("Lineage reference object : RLRDMPO_MPN_TYPE")
    private String mpnType;
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
     * Create Requirement
     * <p>
     * Lineage reference object : RLRDMPO_CREATE_REQ_OPTION
     * 
     */
    @JsonProperty("createReqOption")
    @JsonPropertyDescription("Lineage reference object : RLRDMPO_CREATE_REQ_OPTION")
    private String createReqOption;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withInfoAccessInd(String infoAccessInd) {
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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withTrkLtrInd(String trkLtrInd) {
        this.trkLtrInd = trkLtrInd;
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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withReqStatusWebDesc(String reqStatusWebDesc) {
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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withMpnReqDesc(String mpnReqDesc) {
        this.mpnReqDesc = mpnReqDesc;
        return this;
    }

    /**
     * Display PN Requirement
     * <p>
     * Lineage reference object : RLRDMPO_DISPLAY_PN_IND
     * 
     */
    @JsonProperty("displayPnInd")
    public String getDisplayPnInd() {
        return displayPnInd;
    }

    /**
     * Display PN Requirement
     * <p>
     * Lineage reference object : RLRDMPO_DISPLAY_PN_IND
     * 
     */
    @JsonProperty("displayPnInd")
    public void setDisplayPnInd(String displayPnInd) {
        this.displayPnInd = displayPnInd;
    }

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withDisplayPnInd(String displayPnInd) {
        this.displayPnInd = displayPnInd;
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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withReqInstrInd(String reqInstrInd) {
        this.reqInstrInd = reqInstrInd;
        return this;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    /**
     * Aid Year
     * <p>
     * Lineage reference object : keyblckAidyCode, Lookup lineage reference object : robinst
     * 
     */
    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withMpnReqInstructions(String mpnReqInstructions) {
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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withReqStatus(String reqStatus) {
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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withSatInd(String satInd) {
        this.satInd = satInd;
        return this;
    }

    /**
     * MPN Type
     * <p>
     * Lineage reference object : RLRDMPO_MPN_TYPE
     * 
     */
    @JsonProperty("mpnType")
    public String getMpnType() {
        return mpnType;
    }

    /**
     * MPN Type
     * <p>
     * Lineage reference object : RLRDMPO_MPN_TYPE
     * 
     */
    @JsonProperty("mpnType")
    public void setMpnType(String mpnType) {
        this.mpnType = mpnType;
    }

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withMpnType(String mpnType) {
        this.mpnType = mpnType;
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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withMpnReqUrl(String mpnReqUrl) {
        this.mpnReqUrl = mpnReqUrl;
        return this;
    }

    /**
     * Create Requirement
     * <p>
     * Lineage reference object : RLRDMPO_CREATE_REQ_OPTION
     * 
     */
    @JsonProperty("createReqOption")
    public String getCreateReqOption() {
        return createReqOption;
    }

    /**
     * Create Requirement
     * <p>
     * Lineage reference object : RLRDMPO_CREATE_REQ_OPTION
     * 
     */
    @JsonProperty("createReqOption")
    public void setCreateReqOption(String createReqOption) {
        this.createReqOption = createReqOption;
    }

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withCreateReqOption(String createReqOption) {
        this.createReqOption = createReqOption;
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

    public UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("trkLtrInd");
        sb.append('=');
        sb.append(((this.trkLtrInd == null)?"<null>":this.trkLtrInd));
        sb.append(',');
        sb.append("reqStatusWebDesc");
        sb.append('=');
        sb.append(((this.reqStatusWebDesc == null)?"<null>":this.reqStatusWebDesc));
        sb.append(',');
        sb.append("mpnReqDesc");
        sb.append('=');
        sb.append(((this.mpnReqDesc == null)?"<null>":this.mpnReqDesc));
        sb.append(',');
        sb.append("displayPnInd");
        sb.append('=');
        sb.append(((this.displayPnInd == null)?"<null>":this.displayPnInd));
        sb.append(',');
        sb.append("reqInstrInd");
        sb.append('=');
        sb.append(((this.reqInstrInd == null)?"<null>":this.reqInstrInd));
        sb.append(',');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
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
        sb.append("mpnType");
        sb.append('=');
        sb.append(((this.mpnType == null)?"<null>":this.mpnType));
        sb.append(',');
        sb.append("mpnReqUrl");
        sb.append('=');
        sb.append(((this.mpnReqUrl == null)?"<null>":this.mpnReqUrl));
        sb.append(',');
        sb.append("createReqOption");
        sb.append('=');
        sb.append(((this.createReqOption == null)?"<null>":this.createReqOption));
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
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.trkLtrInd == null)? 0 :this.trkLtrInd.hashCode()));
        result = ((result* 31)+((this.reqStatusWebDesc == null)? 0 :this.reqStatusWebDesc.hashCode()));
        result = ((result* 31)+((this.mpnReqDesc == null)? 0 :this.mpnReqDesc.hashCode()));
        result = ((result* 31)+((this.displayPnInd == null)? 0 :this.displayPnInd.hashCode()));
        result = ((result* 31)+((this.reqInstrInd == null)? 0 :this.reqInstrInd.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.mpnReqInstructions == null)? 0 :this.mpnReqInstructions.hashCode()));
        result = ((result* 31)+((this.reqStatus == null)? 0 :this.reqStatus.hashCode()));
        result = ((result* 31)+((this.satInd == null)? 0 :this.satInd.hashCode()));
        result = ((result* 31)+((this.mpnType == null)? 0 :this.mpnType.hashCode()));
        result = ((result* 31)+((this.mpnReqUrl == null)? 0 :this.mpnReqUrl.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.createReqOption == null)? 0 :this.createReqOption.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest) == false) {
            return false;
        }
        UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest rhs = ((UsSpecificInstitutionFinancialAidOptionsDirectLoanMpnRules100GetRequest) other);
        return (((((((((((((((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd)))&&((this.trkLtrInd == rhs.trkLtrInd)||((this.trkLtrInd!= null)&&this.trkLtrInd.equals(rhs.trkLtrInd))))&&((this.reqStatusWebDesc == rhs.reqStatusWebDesc)||((this.reqStatusWebDesc!= null)&&this.reqStatusWebDesc.equals(rhs.reqStatusWebDesc))))&&((this.mpnReqDesc == rhs.mpnReqDesc)||((this.mpnReqDesc!= null)&&this.mpnReqDesc.equals(rhs.mpnReqDesc))))&&((this.displayPnInd == rhs.displayPnInd)||((this.displayPnInd!= null)&&this.displayPnInd.equals(rhs.displayPnInd))))&&((this.reqInstrInd == rhs.reqInstrInd)||((this.reqInstrInd!= null)&&this.reqInstrInd.equals(rhs.reqInstrInd))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.mpnReqInstructions == rhs.mpnReqInstructions)||((this.mpnReqInstructions!= null)&&this.mpnReqInstructions.equals(rhs.mpnReqInstructions))))&&((this.reqStatus == rhs.reqStatus)||((this.reqStatus!= null)&&this.reqStatus.equals(rhs.reqStatus))))&&((this.satInd == rhs.satInd)||((this.satInd!= null)&&this.satInd.equals(rhs.satInd))))&&((this.mpnType == rhs.mpnType)||((this.mpnType!= null)&&this.mpnType.equals(rhs.mpnType))))&&((this.mpnReqUrl == rhs.mpnReqUrl)||((this.mpnReqUrl!= null)&&this.mpnReqUrl.equals(rhs.mpnReqUrl))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.createReqOption == rhs.createReqOption)||((this.createReqOption!= null)&&this.createReqOption.equals(rhs.createReqOption))));
    }

}
