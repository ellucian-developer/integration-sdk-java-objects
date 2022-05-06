
package com.ellucian.generated.bpapi.ban.applicant_requirements.v1_0_0;

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
    "keyblckAidyCode",
    "keyblckId",
    "treqCode",
    "displayTreqDesc",
    "trstCode",
    "statDate",
    "estDate",
    "satInd",
    "fundCode",
    "period",
    "displayPckgInd1",
    "displayMemoInd1",
    "displayDisbInd1",
    "displayTrkLtrInd1",
    "infoAccessInd",
    "rtvtreqPerkMpnFlag",
    "sysInd",
    "sbgiTypeInd",
    "sbgiCode",
    "sbgiDesc"
})
@Generated("jsonschema2pojo")
public class ApplicantRequirements100QapiPost {

    @JsonProperty("keyblckAidyCode")
    private String keyblckAidyCode;
    @JsonProperty("keyblckId")
    private String keyblckId;
    @JsonProperty("treqCode")
    private String treqCode;
    @JsonProperty("displayTreqDesc")
    private String displayTreqDesc;
    @JsonProperty("trstCode")
    private String trstCode;
    @JsonProperty("statDate")
    private String statDate;
    @JsonProperty("estDate")
    private String estDate;
    @JsonProperty("satInd")
    private String satInd;
    @JsonProperty("fundCode")
    private String fundCode;
    @JsonProperty("period")
    private String period;
    @JsonProperty("displayPckgInd1")
    private String displayPckgInd1;
    @JsonProperty("displayMemoInd1")
    private String displayMemoInd1;
    @JsonProperty("displayDisbInd1")
    private String displayDisbInd1;
    @JsonProperty("displayTrkLtrInd1")
    private String displayTrkLtrInd1;
    @JsonProperty("infoAccessInd")
    private String infoAccessInd;
    @JsonProperty("rtvtreqPerkMpnFlag")
    private String rtvtreqPerkMpnFlag;
    @JsonProperty("sysInd")
    private String sysInd;
    @JsonProperty("sbgiTypeInd")
    private String sbgiTypeInd;
    @JsonProperty("sbgiCode")
    private String sbgiCode;
    @JsonProperty("sbgiDesc")
    private String sbgiDesc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckAidyCode")
    public String getKeyblckAidyCode() {
        return keyblckAidyCode;
    }

    @JsonProperty("keyblckAidyCode")
    public void setKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
    }

    public ApplicantRequirements100QapiPost withKeyblckAidyCode(String keyblckAidyCode) {
        this.keyblckAidyCode = keyblckAidyCode;
        return this;
    }

    @JsonProperty("keyblckId")
    public String getKeyblckId() {
        return keyblckId;
    }

    @JsonProperty("keyblckId")
    public void setKeyblckId(String keyblckId) {
        this.keyblckId = keyblckId;
    }

    public ApplicantRequirements100QapiPost withKeyblckId(String keyblckId) {
        this.keyblckId = keyblckId;
        return this;
    }

    @JsonProperty("treqCode")
    public String getTreqCode() {
        return treqCode;
    }

    @JsonProperty("treqCode")
    public void setTreqCode(String treqCode) {
        this.treqCode = treqCode;
    }

    public ApplicantRequirements100QapiPost withTreqCode(String treqCode) {
        this.treqCode = treqCode;
        return this;
    }

    @JsonProperty("displayTreqDesc")
    public String getDisplayTreqDesc() {
        return displayTreqDesc;
    }

    @JsonProperty("displayTreqDesc")
    public void setDisplayTreqDesc(String displayTreqDesc) {
        this.displayTreqDesc = displayTreqDesc;
    }

    public ApplicantRequirements100QapiPost withDisplayTreqDesc(String displayTreqDesc) {
        this.displayTreqDesc = displayTreqDesc;
        return this;
    }

    @JsonProperty("trstCode")
    public String getTrstCode() {
        return trstCode;
    }

    @JsonProperty("trstCode")
    public void setTrstCode(String trstCode) {
        this.trstCode = trstCode;
    }

    public ApplicantRequirements100QapiPost withTrstCode(String trstCode) {
        this.trstCode = trstCode;
        return this;
    }

    @JsonProperty("statDate")
    public String getStatDate() {
        return statDate;
    }

    @JsonProperty("statDate")
    public void setStatDate(String statDate) {
        this.statDate = statDate;
    }

    public ApplicantRequirements100QapiPost withStatDate(String statDate) {
        this.statDate = statDate;
        return this;
    }

    @JsonProperty("estDate")
    public String getEstDate() {
        return estDate;
    }

    @JsonProperty("estDate")
    public void setEstDate(String estDate) {
        this.estDate = estDate;
    }

    public ApplicantRequirements100QapiPost withEstDate(String estDate) {
        this.estDate = estDate;
        return this;
    }

    @JsonProperty("satInd")
    public String getSatInd() {
        return satInd;
    }

    @JsonProperty("satInd")
    public void setSatInd(String satInd) {
        this.satInd = satInd;
    }

    public ApplicantRequirements100QapiPost withSatInd(String satInd) {
        this.satInd = satInd;
        return this;
    }

    @JsonProperty("fundCode")
    public String getFundCode() {
        return fundCode;
    }

    @JsonProperty("fundCode")
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public ApplicantRequirements100QapiPost withFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    public ApplicantRequirements100QapiPost withPeriod(String period) {
        this.period = period;
        return this;
    }

    @JsonProperty("displayPckgInd1")
    public String getDisplayPckgInd1() {
        return displayPckgInd1;
    }

    @JsonProperty("displayPckgInd1")
    public void setDisplayPckgInd1(String displayPckgInd1) {
        this.displayPckgInd1 = displayPckgInd1;
    }

    public ApplicantRequirements100QapiPost withDisplayPckgInd1(String displayPckgInd1) {
        this.displayPckgInd1 = displayPckgInd1;
        return this;
    }

    @JsonProperty("displayMemoInd1")
    public String getDisplayMemoInd1() {
        return displayMemoInd1;
    }

    @JsonProperty("displayMemoInd1")
    public void setDisplayMemoInd1(String displayMemoInd1) {
        this.displayMemoInd1 = displayMemoInd1;
    }

    public ApplicantRequirements100QapiPost withDisplayMemoInd1(String displayMemoInd1) {
        this.displayMemoInd1 = displayMemoInd1;
        return this;
    }

    @JsonProperty("displayDisbInd1")
    public String getDisplayDisbInd1() {
        return displayDisbInd1;
    }

    @JsonProperty("displayDisbInd1")
    public void setDisplayDisbInd1(String displayDisbInd1) {
        this.displayDisbInd1 = displayDisbInd1;
    }

    public ApplicantRequirements100QapiPost withDisplayDisbInd1(String displayDisbInd1) {
        this.displayDisbInd1 = displayDisbInd1;
        return this;
    }

    @JsonProperty("displayTrkLtrInd1")
    public String getDisplayTrkLtrInd1() {
        return displayTrkLtrInd1;
    }

    @JsonProperty("displayTrkLtrInd1")
    public void setDisplayTrkLtrInd1(String displayTrkLtrInd1) {
        this.displayTrkLtrInd1 = displayTrkLtrInd1;
    }

    public ApplicantRequirements100QapiPost withDisplayTrkLtrInd1(String displayTrkLtrInd1) {
        this.displayTrkLtrInd1 = displayTrkLtrInd1;
        return this;
    }

    @JsonProperty("infoAccessInd")
    public String getInfoAccessInd() {
        return infoAccessInd;
    }

    @JsonProperty("infoAccessInd")
    public void setInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
    }

    public ApplicantRequirements100QapiPost withInfoAccessInd(String infoAccessInd) {
        this.infoAccessInd = infoAccessInd;
        return this;
    }

    @JsonProperty("rtvtreqPerkMpnFlag")
    public String getRtvtreqPerkMpnFlag() {
        return rtvtreqPerkMpnFlag;
    }

    @JsonProperty("rtvtreqPerkMpnFlag")
    public void setRtvtreqPerkMpnFlag(String rtvtreqPerkMpnFlag) {
        this.rtvtreqPerkMpnFlag = rtvtreqPerkMpnFlag;
    }

    public ApplicantRequirements100QapiPost withRtvtreqPerkMpnFlag(String rtvtreqPerkMpnFlag) {
        this.rtvtreqPerkMpnFlag = rtvtreqPerkMpnFlag;
        return this;
    }

    @JsonProperty("sysInd")
    public String getSysInd() {
        return sysInd;
    }

    @JsonProperty("sysInd")
    public void setSysInd(String sysInd) {
        this.sysInd = sysInd;
    }

    public ApplicantRequirements100QapiPost withSysInd(String sysInd) {
        this.sysInd = sysInd;
        return this;
    }

    @JsonProperty("sbgiTypeInd")
    public String getSbgiTypeInd() {
        return sbgiTypeInd;
    }

    @JsonProperty("sbgiTypeInd")
    public void setSbgiTypeInd(String sbgiTypeInd) {
        this.sbgiTypeInd = sbgiTypeInd;
    }

    public ApplicantRequirements100QapiPost withSbgiTypeInd(String sbgiTypeInd) {
        this.sbgiTypeInd = sbgiTypeInd;
        return this;
    }

    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public ApplicantRequirements100QapiPost withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    @JsonProperty("sbgiDesc")
    public String getSbgiDesc() {
        return sbgiDesc;
    }

    @JsonProperty("sbgiDesc")
    public void setSbgiDesc(String sbgiDesc) {
        this.sbgiDesc = sbgiDesc;
    }

    public ApplicantRequirements100QapiPost withSbgiDesc(String sbgiDesc) {
        this.sbgiDesc = sbgiDesc;
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

    public ApplicantRequirements100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicantRequirements100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckAidyCode");
        sb.append('=');
        sb.append(((this.keyblckAidyCode == null)?"<null>":this.keyblckAidyCode));
        sb.append(',');
        sb.append("keyblckId");
        sb.append('=');
        sb.append(((this.keyblckId == null)?"<null>":this.keyblckId));
        sb.append(',');
        sb.append("treqCode");
        sb.append('=');
        sb.append(((this.treqCode == null)?"<null>":this.treqCode));
        sb.append(',');
        sb.append("displayTreqDesc");
        sb.append('=');
        sb.append(((this.displayTreqDesc == null)?"<null>":this.displayTreqDesc));
        sb.append(',');
        sb.append("trstCode");
        sb.append('=');
        sb.append(((this.trstCode == null)?"<null>":this.trstCode));
        sb.append(',');
        sb.append("statDate");
        sb.append('=');
        sb.append(((this.statDate == null)?"<null>":this.statDate));
        sb.append(',');
        sb.append("estDate");
        sb.append('=');
        sb.append(((this.estDate == null)?"<null>":this.estDate));
        sb.append(',');
        sb.append("satInd");
        sb.append('=');
        sb.append(((this.satInd == null)?"<null>":this.satInd));
        sb.append(',');
        sb.append("fundCode");
        sb.append('=');
        sb.append(((this.fundCode == null)?"<null>":this.fundCode));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("displayPckgInd1");
        sb.append('=');
        sb.append(((this.displayPckgInd1 == null)?"<null>":this.displayPckgInd1));
        sb.append(',');
        sb.append("displayMemoInd1");
        sb.append('=');
        sb.append(((this.displayMemoInd1 == null)?"<null>":this.displayMemoInd1));
        sb.append(',');
        sb.append("displayDisbInd1");
        sb.append('=');
        sb.append(((this.displayDisbInd1 == null)?"<null>":this.displayDisbInd1));
        sb.append(',');
        sb.append("displayTrkLtrInd1");
        sb.append('=');
        sb.append(((this.displayTrkLtrInd1 == null)?"<null>":this.displayTrkLtrInd1));
        sb.append(',');
        sb.append("infoAccessInd");
        sb.append('=');
        sb.append(((this.infoAccessInd == null)?"<null>":this.infoAccessInd));
        sb.append(',');
        sb.append("rtvtreqPerkMpnFlag");
        sb.append('=');
        sb.append(((this.rtvtreqPerkMpnFlag == null)?"<null>":this.rtvtreqPerkMpnFlag));
        sb.append(',');
        sb.append("sysInd");
        sb.append('=');
        sb.append(((this.sysInd == null)?"<null>":this.sysInd));
        sb.append(',');
        sb.append("sbgiTypeInd");
        sb.append('=');
        sb.append(((this.sbgiTypeInd == null)?"<null>":this.sbgiTypeInd));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("sbgiDesc");
        sb.append('=');
        sb.append(((this.sbgiDesc == null)?"<null>":this.sbgiDesc));
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
        result = ((result* 31)+((this.statDate == null)? 0 :this.statDate.hashCode()));
        result = ((result* 31)+((this.estDate == null)? 0 :this.estDate.hashCode()));
        result = ((result* 31)+((this.trstCode == null)? 0 :this.trstCode.hashCode()));
        result = ((result* 31)+((this.period == null)? 0 :this.period.hashCode()));
        result = ((result* 31)+((this.displayDisbInd1 == null)? 0 :this.displayDisbInd1 .hashCode()));
        result = ((result* 31)+((this.rtvtreqPerkMpnFlag == null)? 0 :this.rtvtreqPerkMpnFlag.hashCode()));
        result = ((result* 31)+((this.infoAccessInd == null)? 0 :this.infoAccessInd.hashCode()));
        result = ((result* 31)+((this.sbgiTypeInd == null)? 0 :this.sbgiTypeInd.hashCode()));
        result = ((result* 31)+((this.sysInd == null)? 0 :this.sysInd.hashCode()));
        result = ((result* 31)+((this.displayTrkLtrInd1 == null)? 0 :this.displayTrkLtrInd1 .hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.keyblckAidyCode == null)? 0 :this.keyblckAidyCode.hashCode()));
        result = ((result* 31)+((this.keyblckId == null)? 0 :this.keyblckId.hashCode()));
        result = ((result* 31)+((this.satInd == null)? 0 :this.satInd.hashCode()));
        result = ((result* 31)+((this.fundCode == null)? 0 :this.fundCode.hashCode()));
        result = ((result* 31)+((this.displayMemoInd1 == null)? 0 :this.displayMemoInd1 .hashCode()));
        result = ((result* 31)+((this.treqCode == null)? 0 :this.treqCode.hashCode()));
        result = ((result* 31)+((this.displayPckgInd1 == null)? 0 :this.displayPckgInd1 .hashCode()));
        result = ((result* 31)+((this.sbgiDesc == null)? 0 :this.sbgiDesc.hashCode()));
        result = ((result* 31)+((this.displayTreqDesc == null)? 0 :this.displayTreqDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicantRequirements100QapiPost) == false) {
            return false;
        }
        ApplicantRequirements100QapiPost rhs = ((ApplicantRequirements100QapiPost) other);
        return ((((((((((((((((((((((this.statDate == rhs.statDate)||((this.statDate!= null)&&this.statDate.equals(rhs.statDate)))&&((this.estDate == rhs.estDate)||((this.estDate!= null)&&this.estDate.equals(rhs.estDate))))&&((this.trstCode == rhs.trstCode)||((this.trstCode!= null)&&this.trstCode.equals(rhs.trstCode))))&&((this.period == rhs.period)||((this.period!= null)&&this.period.equals(rhs.period))))&&((this.displayDisbInd1 == rhs.displayDisbInd1)||((this.displayDisbInd1 != null)&&this.displayDisbInd1 .equals(rhs.displayDisbInd1))))&&((this.rtvtreqPerkMpnFlag == rhs.rtvtreqPerkMpnFlag)||((this.rtvtreqPerkMpnFlag!= null)&&this.rtvtreqPerkMpnFlag.equals(rhs.rtvtreqPerkMpnFlag))))&&((this.infoAccessInd == rhs.infoAccessInd)||((this.infoAccessInd!= null)&&this.infoAccessInd.equals(rhs.infoAccessInd))))&&((this.sbgiTypeInd == rhs.sbgiTypeInd)||((this.sbgiTypeInd!= null)&&this.sbgiTypeInd.equals(rhs.sbgiTypeInd))))&&((this.sysInd == rhs.sysInd)||((this.sysInd!= null)&&this.sysInd.equals(rhs.sysInd))))&&((this.displayTrkLtrInd1 == rhs.displayTrkLtrInd1)||((this.displayTrkLtrInd1 != null)&&this.displayTrkLtrInd1 .equals(rhs.displayTrkLtrInd1))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.keyblckAidyCode == rhs.keyblckAidyCode)||((this.keyblckAidyCode!= null)&&this.keyblckAidyCode.equals(rhs.keyblckAidyCode))))&&((this.keyblckId == rhs.keyblckId)||((this.keyblckId!= null)&&this.keyblckId.equals(rhs.keyblckId))))&&((this.satInd == rhs.satInd)||((this.satInd!= null)&&this.satInd.equals(rhs.satInd))))&&((this.fundCode == rhs.fundCode)||((this.fundCode!= null)&&this.fundCode.equals(rhs.fundCode))))&&((this.displayMemoInd1 == rhs.displayMemoInd1)||((this.displayMemoInd1 != null)&&this.displayMemoInd1 .equals(rhs.displayMemoInd1))))&&((this.treqCode == rhs.treqCode)||((this.treqCode!= null)&&this.treqCode.equals(rhs.treqCode))))&&((this.displayPckgInd1 == rhs.displayPckgInd1)||((this.displayPckgInd1 != null)&&this.displayPckgInd1 .equals(rhs.displayPckgInd1))))&&((this.sbgiDesc == rhs.sbgiDesc)||((this.sbgiDesc!= null)&&this.sbgiDesc.equals(rhs.sbgiDesc))))&&((this.displayTreqDesc == rhs.displayTreqDesc)||((this.displayTreqDesc!= null)&&this.displayTreqDesc.equals(rhs.displayTreqDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
