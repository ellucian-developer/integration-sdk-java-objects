
package com.ellucian.generated.bpapi.ban._2021_2022_need_analysis_result_federal_match_indicators.v1_0_0;

import java.util.Date;
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
    "rcrapp4SecInsMatchInd",
    "rorstatNsldsOvrdInd",
    "rcrapp4DodParDeathDate",
    "keyblckInfcCode",
    "rcrapp4SsRegFlag",
    "rcrapp4DodMatchFlag",
    "rcrapp3SocSec",
    "rcrapp3FathSsnMatch",
    "keyblckSeqNo",
    "rcrapp4SsaCitizenInd",
    "rcrapp3MothSsnMatch",
    "rcrapp4VaMatchFlag",
    "rcrapp1Ins",
    "keyblckStudentId",
    "rcrapp4SsMatch"
})
@Generated("jsonschema2pojo")
public class _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest {

    /**
     * Secondary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SecInsMatchInd")
    private String rcrapp4SecInsMatchInd;
    /**
     * NSLDS Override
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatNsldsOvrdInd")
    private String rorstatNsldsOvrdInd;
    /**
     * DOD Parent Date of Death
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodParDeathDate")
    private Date rcrapp4DodParDeathDate;
    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    @JsonPropertyDescription("Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc")
    private Object keyblckInfcCode;
    /**
     * Selective Service Request Results
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsRegFlag")
    private String rcrapp4SsRegFlag;
    /**
     * DOD Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodMatchFlag")
    private String rcrapp4DodMatchFlag;
    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SocSec")
    private String rcrapp3SocSec;
    /**
     * Parent 1 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FathSsnMatch")
    private String rcrapp3FathSsnMatch;
    /**
     * Sequence Number
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    @JsonPropertyDescription("Lineage reference object : keyblckSeqNo")
    private Object keyblckSeqNo;
    /**
     * SSA Citizenship
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsaCitizenInd")
    private String rcrapp4SsaCitizenInd;
    /**
     * Parent 2 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MothSsnMatch")
    private String rcrapp3MothSsnMatch;
    /**
     * VA Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4VaMatchFlag")
    private String rcrapp4VaMatchFlag;
    /**
     * Primary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1Ins")
    private String rcrapp1Ins;
    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    @JsonPropertyDescription("Lineage reference object : keyblckStudentId")
    private Object keyblckStudentId;
    /**
     * Selective Service Match Flag.
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsMatch")
    private String rcrapp4SsMatch;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Secondary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SecInsMatchInd")
    public String getRcrapp4SecInsMatchInd() {
        return rcrapp4SecInsMatchInd;
    }

    /**
     * Secondary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SecInsMatchInd")
    public void setRcrapp4SecInsMatchInd(String rcrapp4SecInsMatchInd) {
        this.rcrapp4SecInsMatchInd = rcrapp4SecInsMatchInd;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp4SecInsMatchInd(String rcrapp4SecInsMatchInd) {
        this.rcrapp4SecInsMatchInd = rcrapp4SecInsMatchInd;
        return this;
    }

    /**
     * NSLDS Override
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatNsldsOvrdInd")
    public String getRorstatNsldsOvrdInd() {
        return rorstatNsldsOvrdInd;
    }

    /**
     * NSLDS Override
     * <p>
     * 
     * 
     */
    @JsonProperty("rorstatNsldsOvrdInd")
    public void setRorstatNsldsOvrdInd(String rorstatNsldsOvrdInd) {
        this.rorstatNsldsOvrdInd = rorstatNsldsOvrdInd;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRorstatNsldsOvrdInd(String rorstatNsldsOvrdInd) {
        this.rorstatNsldsOvrdInd = rorstatNsldsOvrdInd;
        return this;
    }

    /**
     * DOD Parent Date of Death
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodParDeathDate")
    public Date getRcrapp4DodParDeathDate() {
        return rcrapp4DodParDeathDate;
    }

    /**
     * DOD Parent Date of Death
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodParDeathDate")
    public void setRcrapp4DodParDeathDate(Date rcrapp4DodParDeathDate) {
        this.rcrapp4DodParDeathDate = rcrapp4DodParDeathDate;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp4DodParDeathDate(Date rcrapp4DodParDeathDate) {
        this.rcrapp4DodParDeathDate = rcrapp4DodParDeathDate;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    public Object getKeyblckInfcCode() {
        return keyblckInfcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : keyblckInfcCode, Lookup lineage reference object : rtvinfc
     * 
     */
    @JsonProperty("keyblckInfcCode")
    public void setKeyblckInfcCode(Object keyblckInfcCode) {
        this.keyblckInfcCode = keyblckInfcCode;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withKeyblckInfcCode(Object keyblckInfcCode) {
        this.keyblckInfcCode = keyblckInfcCode;
        return this;
    }

    /**
     * Selective Service Request Results
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsRegFlag")
    public String getRcrapp4SsRegFlag() {
        return rcrapp4SsRegFlag;
    }

    /**
     * Selective Service Request Results
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsRegFlag")
    public void setRcrapp4SsRegFlag(String rcrapp4SsRegFlag) {
        this.rcrapp4SsRegFlag = rcrapp4SsRegFlag;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp4SsRegFlag(String rcrapp4SsRegFlag) {
        this.rcrapp4SsRegFlag = rcrapp4SsRegFlag;
        return this;
    }

    /**
     * DOD Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodMatchFlag")
    public String getRcrapp4DodMatchFlag() {
        return rcrapp4DodMatchFlag;
    }

    /**
     * DOD Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4DodMatchFlag")
    public void setRcrapp4DodMatchFlag(String rcrapp4DodMatchFlag) {
        this.rcrapp4DodMatchFlag = rcrapp4DodMatchFlag;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp4DodMatchFlag(String rcrapp4DodMatchFlag) {
        this.rcrapp4DodMatchFlag = rcrapp4DodMatchFlag;
        return this;
    }

    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SocSec")
    public String getRcrapp3SocSec() {
        return rcrapp3SocSec;
    }

    /**
     * SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3SocSec")
    public void setRcrapp3SocSec(String rcrapp3SocSec) {
        this.rcrapp3SocSec = rcrapp3SocSec;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp3SocSec(String rcrapp3SocSec) {
        this.rcrapp3SocSec = rcrapp3SocSec;
        return this;
    }

    /**
     * Parent 1 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FathSsnMatch")
    public String getRcrapp3FathSsnMatch() {
        return rcrapp3FathSsnMatch;
    }

    /**
     * Parent 1 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3FathSsnMatch")
    public void setRcrapp3FathSsnMatch(String rcrapp3FathSsnMatch) {
        this.rcrapp3FathSsnMatch = rcrapp3FathSsnMatch;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp3FathSsnMatch(String rcrapp3FathSsnMatch) {
        this.rcrapp3FathSsnMatch = rcrapp3FathSsnMatch;
        return this;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    public Object getKeyblckSeqNo() {
        return keyblckSeqNo;
    }

    /**
     * Sequence Number
     * <p>
     * Lineage reference object : keyblckSeqNo
     * 
     */
    @JsonProperty("keyblckSeqNo")
    public void setKeyblckSeqNo(Object keyblckSeqNo) {
        this.keyblckSeqNo = keyblckSeqNo;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withKeyblckSeqNo(Object keyblckSeqNo) {
        this.keyblckSeqNo = keyblckSeqNo;
        return this;
    }

    /**
     * SSA Citizenship
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsaCitizenInd")
    public String getRcrapp4SsaCitizenInd() {
        return rcrapp4SsaCitizenInd;
    }

    /**
     * SSA Citizenship
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsaCitizenInd")
    public void setRcrapp4SsaCitizenInd(String rcrapp4SsaCitizenInd) {
        this.rcrapp4SsaCitizenInd = rcrapp4SsaCitizenInd;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp4SsaCitizenInd(String rcrapp4SsaCitizenInd) {
        this.rcrapp4SsaCitizenInd = rcrapp4SsaCitizenInd;
        return this;
    }

    /**
     * Parent 2 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MothSsnMatch")
    public String getRcrapp3MothSsnMatch() {
        return rcrapp3MothSsnMatch;
    }

    /**
     * Parent 2 SSN
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp3MothSsnMatch")
    public void setRcrapp3MothSsnMatch(String rcrapp3MothSsnMatch) {
        this.rcrapp3MothSsnMatch = rcrapp3MothSsnMatch;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp3MothSsnMatch(String rcrapp3MothSsnMatch) {
        this.rcrapp3MothSsnMatch = rcrapp3MothSsnMatch;
        return this;
    }

    /**
     * VA Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4VaMatchFlag")
    public String getRcrapp4VaMatchFlag() {
        return rcrapp4VaMatchFlag;
    }

    /**
     * VA Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4VaMatchFlag")
    public void setRcrapp4VaMatchFlag(String rcrapp4VaMatchFlag) {
        this.rcrapp4VaMatchFlag = rcrapp4VaMatchFlag;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp4VaMatchFlag(String rcrapp4VaMatchFlag) {
        this.rcrapp4VaMatchFlag = rcrapp4VaMatchFlag;
        return this;
    }

    /**
     * Primary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1Ins")
    public String getRcrapp1Ins() {
        return rcrapp1Ins;
    }

    /**
     * Primary DHS Match Flag
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp1Ins")
    public void setRcrapp1Ins(String rcrapp1Ins) {
        this.rcrapp1Ins = rcrapp1Ins;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp1Ins(String rcrapp1Ins) {
        this.rcrapp1Ins = rcrapp1Ins;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public Object getKeyblckStudentId() {
        return keyblckStudentId;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : keyblckStudentId
     * 
     */
    @JsonProperty("keyblckStudentId")
    public void setKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withKeyblckStudentId(Object keyblckStudentId) {
        this.keyblckStudentId = keyblckStudentId;
        return this;
    }

    /**
     * Selective Service Match Flag.
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsMatch")
    public String getRcrapp4SsMatch() {
        return rcrapp4SsMatch;
    }

    /**
     * Selective Service Match Flag.
     * <p>
     * 
     * 
     */
    @JsonProperty("rcrapp4SsMatch")
    public void setRcrapp4SsMatch(String rcrapp4SsMatch) {
        this.rcrapp4SsMatch = rcrapp4SsMatch;
    }

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withRcrapp4SsMatch(String rcrapp4SsMatch) {
        this.rcrapp4SsMatch = rcrapp4SsMatch;
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

    public _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_20212022NeedAnalysisResultFederalMatchIndicators100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rcrapp4SecInsMatchInd");
        sb.append('=');
        sb.append(((this.rcrapp4SecInsMatchInd == null)?"<null>":this.rcrapp4SecInsMatchInd));
        sb.append(',');
        sb.append("rorstatNsldsOvrdInd");
        sb.append('=');
        sb.append(((this.rorstatNsldsOvrdInd == null)?"<null>":this.rorstatNsldsOvrdInd));
        sb.append(',');
        sb.append("rcrapp4DodParDeathDate");
        sb.append('=');
        sb.append(((this.rcrapp4DodParDeathDate == null)?"<null>":this.rcrapp4DodParDeathDate));
        sb.append(',');
        sb.append("keyblckInfcCode");
        sb.append('=');
        sb.append(((this.keyblckInfcCode == null)?"<null>":this.keyblckInfcCode));
        sb.append(',');
        sb.append("rcrapp4SsRegFlag");
        sb.append('=');
        sb.append(((this.rcrapp4SsRegFlag == null)?"<null>":this.rcrapp4SsRegFlag));
        sb.append(',');
        sb.append("rcrapp4DodMatchFlag");
        sb.append('=');
        sb.append(((this.rcrapp4DodMatchFlag == null)?"<null>":this.rcrapp4DodMatchFlag));
        sb.append(',');
        sb.append("rcrapp3SocSec");
        sb.append('=');
        sb.append(((this.rcrapp3SocSec == null)?"<null>":this.rcrapp3SocSec));
        sb.append(',');
        sb.append("rcrapp3FathSsnMatch");
        sb.append('=');
        sb.append(((this.rcrapp3FathSsnMatch == null)?"<null>":this.rcrapp3FathSsnMatch));
        sb.append(',');
        sb.append("keyblckSeqNo");
        sb.append('=');
        sb.append(((this.keyblckSeqNo == null)?"<null>":this.keyblckSeqNo));
        sb.append(',');
        sb.append("rcrapp4SsaCitizenInd");
        sb.append('=');
        sb.append(((this.rcrapp4SsaCitizenInd == null)?"<null>":this.rcrapp4SsaCitizenInd));
        sb.append(',');
        sb.append("rcrapp3MothSsnMatch");
        sb.append('=');
        sb.append(((this.rcrapp3MothSsnMatch == null)?"<null>":this.rcrapp3MothSsnMatch));
        sb.append(',');
        sb.append("rcrapp4VaMatchFlag");
        sb.append('=');
        sb.append(((this.rcrapp4VaMatchFlag == null)?"<null>":this.rcrapp4VaMatchFlag));
        sb.append(',');
        sb.append("rcrapp1Ins");
        sb.append('=');
        sb.append(((this.rcrapp1Ins == null)?"<null>":this.rcrapp1Ins));
        sb.append(',');
        sb.append("keyblckStudentId");
        sb.append('=');
        sb.append(((this.keyblckStudentId == null)?"<null>":this.keyblckStudentId));
        sb.append(',');
        sb.append("rcrapp4SsMatch");
        sb.append('=');
        sb.append(((this.rcrapp4SsMatch == null)?"<null>":this.rcrapp4SsMatch));
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
        result = ((result* 31)+((this.rcrapp4SecInsMatchInd == null)? 0 :this.rcrapp4SecInsMatchInd.hashCode()));
        result = ((result* 31)+((this.rorstatNsldsOvrdInd == null)? 0 :this.rorstatNsldsOvrdInd.hashCode()));
        result = ((result* 31)+((this.rcrapp4DodParDeathDate == null)? 0 :this.rcrapp4DodParDeathDate.hashCode()));
        result = ((result* 31)+((this.keyblckInfcCode == null)? 0 :this.keyblckInfcCode.hashCode()));
        result = ((result* 31)+((this.rcrapp4SsRegFlag == null)? 0 :this.rcrapp4SsRegFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp4DodMatchFlag == null)? 0 :this.rcrapp4DodMatchFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp3SocSec == null)? 0 :this.rcrapp3SocSec.hashCode()));
        result = ((result* 31)+((this.rcrapp3FathSsnMatch == null)? 0 :this.rcrapp3FathSsnMatch.hashCode()));
        result = ((result* 31)+((this.keyblckSeqNo == null)? 0 :this.keyblckSeqNo.hashCode()));
        result = ((result* 31)+((this.rcrapp4SsaCitizenInd == null)? 0 :this.rcrapp4SsaCitizenInd.hashCode()));
        result = ((result* 31)+((this.rcrapp3MothSsnMatch == null)? 0 :this.rcrapp3MothSsnMatch.hashCode()));
        result = ((result* 31)+((this.rcrapp4VaMatchFlag == null)? 0 :this.rcrapp4VaMatchFlag.hashCode()));
        result = ((result* 31)+((this.rcrapp1Ins == null)? 0 :this.rcrapp1Ins.hashCode()));
        result = ((result* 31)+((this.keyblckStudentId == null)? 0 :this.keyblckStudentId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rcrapp4SsMatch == null)? 0 :this.rcrapp4SsMatch.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest) == false) {
            return false;
        }
        _20212022NeedAnalysisResultFederalMatchIndicators100PutRequest rhs = ((_20212022NeedAnalysisResultFederalMatchIndicators100PutRequest) other);
        return (((((((((((((((((this.rcrapp4SecInsMatchInd == rhs.rcrapp4SecInsMatchInd)||((this.rcrapp4SecInsMatchInd!= null)&&this.rcrapp4SecInsMatchInd.equals(rhs.rcrapp4SecInsMatchInd)))&&((this.rorstatNsldsOvrdInd == rhs.rorstatNsldsOvrdInd)||((this.rorstatNsldsOvrdInd!= null)&&this.rorstatNsldsOvrdInd.equals(rhs.rorstatNsldsOvrdInd))))&&((this.rcrapp4DodParDeathDate == rhs.rcrapp4DodParDeathDate)||((this.rcrapp4DodParDeathDate!= null)&&this.rcrapp4DodParDeathDate.equals(rhs.rcrapp4DodParDeathDate))))&&((this.keyblckInfcCode == rhs.keyblckInfcCode)||((this.keyblckInfcCode!= null)&&this.keyblckInfcCode.equals(rhs.keyblckInfcCode))))&&((this.rcrapp4SsRegFlag == rhs.rcrapp4SsRegFlag)||((this.rcrapp4SsRegFlag!= null)&&this.rcrapp4SsRegFlag.equals(rhs.rcrapp4SsRegFlag))))&&((this.rcrapp4DodMatchFlag == rhs.rcrapp4DodMatchFlag)||((this.rcrapp4DodMatchFlag!= null)&&this.rcrapp4DodMatchFlag.equals(rhs.rcrapp4DodMatchFlag))))&&((this.rcrapp3SocSec == rhs.rcrapp3SocSec)||((this.rcrapp3SocSec!= null)&&this.rcrapp3SocSec.equals(rhs.rcrapp3SocSec))))&&((this.rcrapp3FathSsnMatch == rhs.rcrapp3FathSsnMatch)||((this.rcrapp3FathSsnMatch!= null)&&this.rcrapp3FathSsnMatch.equals(rhs.rcrapp3FathSsnMatch))))&&((this.keyblckSeqNo == rhs.keyblckSeqNo)||((this.keyblckSeqNo!= null)&&this.keyblckSeqNo.equals(rhs.keyblckSeqNo))))&&((this.rcrapp4SsaCitizenInd == rhs.rcrapp4SsaCitizenInd)||((this.rcrapp4SsaCitizenInd!= null)&&this.rcrapp4SsaCitizenInd.equals(rhs.rcrapp4SsaCitizenInd))))&&((this.rcrapp3MothSsnMatch == rhs.rcrapp3MothSsnMatch)||((this.rcrapp3MothSsnMatch!= null)&&this.rcrapp3MothSsnMatch.equals(rhs.rcrapp3MothSsnMatch))))&&((this.rcrapp4VaMatchFlag == rhs.rcrapp4VaMatchFlag)||((this.rcrapp4VaMatchFlag!= null)&&this.rcrapp4VaMatchFlag.equals(rhs.rcrapp4VaMatchFlag))))&&((this.rcrapp1Ins == rhs.rcrapp1Ins)||((this.rcrapp1Ins!= null)&&this.rcrapp1Ins.equals(rhs.rcrapp1Ins))))&&((this.keyblckStudentId == rhs.keyblckStudentId)||((this.keyblckStudentId!= null)&&this.keyblckStudentId.equals(rhs.keyblckStudentId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rcrapp4SsMatch == rhs.rcrapp4SsMatch)||((this.rcrapp4SsMatch!= null)&&this.rcrapp4SsMatch.equals(rhs.rcrapp4SsMatch))));
    }

}
