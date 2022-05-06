
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
    "displayMpnTypeDesc",
    "mpnType",
    "createReqOption",
    "displayPnInd"
})
@Generated("jsonschema2pojo")
public class Rlrdmpo {

    @JsonProperty("displayMpnTypeDesc")
    private String displayMpnTypeDesc;
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
     * Create Requirement
     * <p>
     * Lineage reference object : RLRDMPO_CREATE_REQ_OPTION
     * 
     */
    @JsonProperty("createReqOption")
    @JsonPropertyDescription("Lineage reference object : RLRDMPO_CREATE_REQ_OPTION")
    private String createReqOption;
    /**
     * Display PN Requirement
     * <p>
     * Lineage reference object : RLRDMPO_DISPLAY_PN_IND
     * 
     */
    @JsonProperty("displayPnInd")
    @JsonPropertyDescription("Lineage reference object : RLRDMPO_DISPLAY_PN_IND")
    private String displayPnInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("displayMpnTypeDesc")
    public String getDisplayMpnTypeDesc() {
        return displayMpnTypeDesc;
    }

    @JsonProperty("displayMpnTypeDesc")
    public void setDisplayMpnTypeDesc(String displayMpnTypeDesc) {
        this.displayMpnTypeDesc = displayMpnTypeDesc;
    }

    public Rlrdmpo withDisplayMpnTypeDesc(String displayMpnTypeDesc) {
        this.displayMpnTypeDesc = displayMpnTypeDesc;
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

    public Rlrdmpo withMpnType(String mpnType) {
        this.mpnType = mpnType;
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

    public Rlrdmpo withCreateReqOption(String createReqOption) {
        this.createReqOption = createReqOption;
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

    public Rlrdmpo withDisplayPnInd(String displayPnInd) {
        this.displayPnInd = displayPnInd;
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

    public Rlrdmpo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rlrdmpo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayMpnTypeDesc");
        sb.append('=');
        sb.append(((this.displayMpnTypeDesc == null)?"<null>":this.displayMpnTypeDesc));
        sb.append(',');
        sb.append("mpnType");
        sb.append('=');
        sb.append(((this.mpnType == null)?"<null>":this.mpnType));
        sb.append(',');
        sb.append("createReqOption");
        sb.append('=');
        sb.append(((this.createReqOption == null)?"<null>":this.createReqOption));
        sb.append(',');
        sb.append("displayPnInd");
        sb.append('=');
        sb.append(((this.displayPnInd == null)?"<null>":this.displayPnInd));
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
        result = ((result* 31)+((this.mpnType == null)? 0 :this.mpnType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.createReqOption == null)? 0 :this.createReqOption.hashCode()));
        result = ((result* 31)+((this.displayMpnTypeDesc == null)? 0 :this.displayMpnTypeDesc.hashCode()));
        result = ((result* 31)+((this.displayPnInd == null)? 0 :this.displayPnInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rlrdmpo) == false) {
            return false;
        }
        Rlrdmpo rhs = ((Rlrdmpo) other);
        return ((((((this.mpnType == rhs.mpnType)||((this.mpnType!= null)&&this.mpnType.equals(rhs.mpnType)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.createReqOption == rhs.createReqOption)||((this.createReqOption!= null)&&this.createReqOption.equals(rhs.createReqOption))))&&((this.displayMpnTypeDesc == rhs.displayMpnTypeDesc)||((this.displayMpnTypeDesc!= null)&&this.displayMpnTypeDesc.equals(rhs.displayMpnTypeDesc))))&&((this.displayPnInd == rhs.displayPnInd)||((this.displayPnInd!= null)&&this.displayPnInd.equals(rhs.displayPnInd))));
    }

}
