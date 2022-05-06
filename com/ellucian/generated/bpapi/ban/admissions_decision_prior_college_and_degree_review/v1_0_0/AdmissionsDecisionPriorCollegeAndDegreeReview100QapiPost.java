
package com.ellucian.generated.bpapi.ban.admissions_decision_prior_college_and_degree_review.v1_0_0;

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
    "id",
    "keyblocTermCode",
    "termCodeEntry",
    "sarappdApdcCode",
    "apstCode",
    "applDate",
    "applNo",
    "admtCode",
    "sessCode",
    "reqDocInd",
    "applPreference",
    "stypCode",
    "resdCode",
    "fullPartInd",
    "sorpcolSbgiCode",
    "sorpcolTransRevDate",
    "sorpcolTransRecvDate",
    "sorpcolOfficialTrans",
    "sordegrDegcCode",
    "sordegrDegcDate",
    "sordegrAttendFrom",
    "sordegrAttendTo",
    "sordegrDegcYear",
    "sordegrCollCode",
    "sordegrHonrCode",
    "sordegrHoursTransferred",
    "sordegrGpaTransDisplay"
})
@Generated("jsonschema2pojo")
public class AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    @JsonProperty("termCodeEntry")
    private String termCodeEntry;
    @JsonProperty("sarappdApdcCode")
    private String sarappdApdcCode;
    @JsonProperty("apstCode")
    private String apstCode;
    @JsonProperty("applDate")
    private String applDate;
    @JsonProperty("applNo")
    private String applNo;
    @JsonProperty("admtCode")
    private String admtCode;
    @JsonProperty("sessCode")
    private String sessCode;
    @JsonProperty("reqDocInd")
    private String reqDocInd;
    @JsonProperty("applPreference")
    private String applPreference;
    @JsonProperty("stypCode")
    private String stypCode;
    @JsonProperty("resdCode")
    private String resdCode;
    @JsonProperty("fullPartInd")
    private String fullPartInd;
    @JsonProperty("sorpcolSbgiCode")
    private String sorpcolSbgiCode;
    @JsonProperty("sorpcolTransRevDate")
    private String sorpcolTransRevDate;
    @JsonProperty("sorpcolTransRecvDate")
    private String sorpcolTransRecvDate;
    @JsonProperty("sorpcolOfficialTrans")
    private String sorpcolOfficialTrans;
    @JsonProperty("sordegrDegcCode")
    private String sordegrDegcCode;
    @JsonProperty("sordegrDegcDate")
    private String sordegrDegcDate;
    @JsonProperty("sordegrAttendFrom")
    private String sordegrAttendFrom;
    @JsonProperty("sordegrAttendTo")
    private String sordegrAttendTo;
    @JsonProperty("sordegrDegcYear")
    private String sordegrDegcYear;
    @JsonProperty("sordegrCollCode")
    private String sordegrCollCode;
    @JsonProperty("sordegrHonrCode")
    private String sordegrHonrCode;
    @JsonProperty("sordegrHoursTransferred")
    private String sordegrHoursTransferred;
    @JsonProperty("sordegrGpaTransDisplay")
    private String sordegrGpaTransDisplay;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    @JsonProperty("termCodeEntry")
    public String getTermCodeEntry() {
        return termCodeEntry;
    }

    @JsonProperty("termCodeEntry")
    public void setTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withTermCodeEntry(String termCodeEntry) {
        this.termCodeEntry = termCodeEntry;
        return this;
    }

    @JsonProperty("sarappdApdcCode")
    public String getSarappdApdcCode() {
        return sarappdApdcCode;
    }

    @JsonProperty("sarappdApdcCode")
    public void setSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSarappdApdcCode(String sarappdApdcCode) {
        this.sarappdApdcCode = sarappdApdcCode;
        return this;
    }

    @JsonProperty("apstCode")
    public String getApstCode() {
        return apstCode;
    }

    @JsonProperty("apstCode")
    public void setApstCode(String apstCode) {
        this.apstCode = apstCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withApstCode(String apstCode) {
        this.apstCode = apstCode;
        return this;
    }

    @JsonProperty("applDate")
    public String getApplDate() {
        return applDate;
    }

    @JsonProperty("applDate")
    public void setApplDate(String applDate) {
        this.applDate = applDate;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withApplDate(String applDate) {
        this.applDate = applDate;
        return this;
    }

    @JsonProperty("applNo")
    public String getApplNo() {
        return applNo;
    }

    @JsonProperty("applNo")
    public void setApplNo(String applNo) {
        this.applNo = applNo;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withApplNo(String applNo) {
        this.applNo = applNo;
        return this;
    }

    @JsonProperty("admtCode")
    public String getAdmtCode() {
        return admtCode;
    }

    @JsonProperty("admtCode")
    public void setAdmtCode(String admtCode) {
        this.admtCode = admtCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withAdmtCode(String admtCode) {
        this.admtCode = admtCode;
        return this;
    }

    @JsonProperty("sessCode")
    public String getSessCode() {
        return sessCode;
    }

    @JsonProperty("sessCode")
    public void setSessCode(String sessCode) {
        this.sessCode = sessCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSessCode(String sessCode) {
        this.sessCode = sessCode;
        return this;
    }

    @JsonProperty("reqDocInd")
    public String getReqDocInd() {
        return reqDocInd;
    }

    @JsonProperty("reqDocInd")
    public void setReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withReqDocInd(String reqDocInd) {
        this.reqDocInd = reqDocInd;
        return this;
    }

    @JsonProperty("applPreference")
    public String getApplPreference() {
        return applPreference;
    }

    @JsonProperty("applPreference")
    public void setApplPreference(String applPreference) {
        this.applPreference = applPreference;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withApplPreference(String applPreference) {
        this.applPreference = applPreference;
        return this;
    }

    @JsonProperty("stypCode")
    public String getStypCode() {
        return stypCode;
    }

    @JsonProperty("stypCode")
    public void setStypCode(String stypCode) {
        this.stypCode = stypCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withStypCode(String stypCode) {
        this.stypCode = stypCode;
        return this;
    }

    @JsonProperty("resdCode")
    public String getResdCode() {
        return resdCode;
    }

    @JsonProperty("resdCode")
    public void setResdCode(String resdCode) {
        this.resdCode = resdCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withResdCode(String resdCode) {
        this.resdCode = resdCode;
        return this;
    }

    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
        return this;
    }

    @JsonProperty("sorpcolSbgiCode")
    public String getSorpcolSbgiCode() {
        return sorpcolSbgiCode;
    }

    @JsonProperty("sorpcolSbgiCode")
    public void setSorpcolSbgiCode(String sorpcolSbgiCode) {
        this.sorpcolSbgiCode = sorpcolSbgiCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSorpcolSbgiCode(String sorpcolSbgiCode) {
        this.sorpcolSbgiCode = sorpcolSbgiCode;
        return this;
    }

    @JsonProperty("sorpcolTransRevDate")
    public String getSorpcolTransRevDate() {
        return sorpcolTransRevDate;
    }

    @JsonProperty("sorpcolTransRevDate")
    public void setSorpcolTransRevDate(String sorpcolTransRevDate) {
        this.sorpcolTransRevDate = sorpcolTransRevDate;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSorpcolTransRevDate(String sorpcolTransRevDate) {
        this.sorpcolTransRevDate = sorpcolTransRevDate;
        return this;
    }

    @JsonProperty("sorpcolTransRecvDate")
    public String getSorpcolTransRecvDate() {
        return sorpcolTransRecvDate;
    }

    @JsonProperty("sorpcolTransRecvDate")
    public void setSorpcolTransRecvDate(String sorpcolTransRecvDate) {
        this.sorpcolTransRecvDate = sorpcolTransRecvDate;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSorpcolTransRecvDate(String sorpcolTransRecvDate) {
        this.sorpcolTransRecvDate = sorpcolTransRecvDate;
        return this;
    }

    @JsonProperty("sorpcolOfficialTrans")
    public String getSorpcolOfficialTrans() {
        return sorpcolOfficialTrans;
    }

    @JsonProperty("sorpcolOfficialTrans")
    public void setSorpcolOfficialTrans(String sorpcolOfficialTrans) {
        this.sorpcolOfficialTrans = sorpcolOfficialTrans;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSorpcolOfficialTrans(String sorpcolOfficialTrans) {
        this.sorpcolOfficialTrans = sorpcolOfficialTrans;
        return this;
    }

    @JsonProperty("sordegrDegcCode")
    public String getSordegrDegcCode() {
        return sordegrDegcCode;
    }

    @JsonProperty("sordegrDegcCode")
    public void setSordegrDegcCode(String sordegrDegcCode) {
        this.sordegrDegcCode = sordegrDegcCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSordegrDegcCode(String sordegrDegcCode) {
        this.sordegrDegcCode = sordegrDegcCode;
        return this;
    }

    @JsonProperty("sordegrDegcDate")
    public String getSordegrDegcDate() {
        return sordegrDegcDate;
    }

    @JsonProperty("sordegrDegcDate")
    public void setSordegrDegcDate(String sordegrDegcDate) {
        this.sordegrDegcDate = sordegrDegcDate;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSordegrDegcDate(String sordegrDegcDate) {
        this.sordegrDegcDate = sordegrDegcDate;
        return this;
    }

    @JsonProperty("sordegrAttendFrom")
    public String getSordegrAttendFrom() {
        return sordegrAttendFrom;
    }

    @JsonProperty("sordegrAttendFrom")
    public void setSordegrAttendFrom(String sordegrAttendFrom) {
        this.sordegrAttendFrom = sordegrAttendFrom;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSordegrAttendFrom(String sordegrAttendFrom) {
        this.sordegrAttendFrom = sordegrAttendFrom;
        return this;
    }

    @JsonProperty("sordegrAttendTo")
    public String getSordegrAttendTo() {
        return sordegrAttendTo;
    }

    @JsonProperty("sordegrAttendTo")
    public void setSordegrAttendTo(String sordegrAttendTo) {
        this.sordegrAttendTo = sordegrAttendTo;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSordegrAttendTo(String sordegrAttendTo) {
        this.sordegrAttendTo = sordegrAttendTo;
        return this;
    }

    @JsonProperty("sordegrDegcYear")
    public String getSordegrDegcYear() {
        return sordegrDegcYear;
    }

    @JsonProperty("sordegrDegcYear")
    public void setSordegrDegcYear(String sordegrDegcYear) {
        this.sordegrDegcYear = sordegrDegcYear;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSordegrDegcYear(String sordegrDegcYear) {
        this.sordegrDegcYear = sordegrDegcYear;
        return this;
    }

    @JsonProperty("sordegrCollCode")
    public String getSordegrCollCode() {
        return sordegrCollCode;
    }

    @JsonProperty("sordegrCollCode")
    public void setSordegrCollCode(String sordegrCollCode) {
        this.sordegrCollCode = sordegrCollCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSordegrCollCode(String sordegrCollCode) {
        this.sordegrCollCode = sordegrCollCode;
        return this;
    }

    @JsonProperty("sordegrHonrCode")
    public String getSordegrHonrCode() {
        return sordegrHonrCode;
    }

    @JsonProperty("sordegrHonrCode")
    public void setSordegrHonrCode(String sordegrHonrCode) {
        this.sordegrHonrCode = sordegrHonrCode;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSordegrHonrCode(String sordegrHonrCode) {
        this.sordegrHonrCode = sordegrHonrCode;
        return this;
    }

    @JsonProperty("sordegrHoursTransferred")
    public String getSordegrHoursTransferred() {
        return sordegrHoursTransferred;
    }

    @JsonProperty("sordegrHoursTransferred")
    public void setSordegrHoursTransferred(String sordegrHoursTransferred) {
        this.sordegrHoursTransferred = sordegrHoursTransferred;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSordegrHoursTransferred(String sordegrHoursTransferred) {
        this.sordegrHoursTransferred = sordegrHoursTransferred;
        return this;
    }

    @JsonProperty("sordegrGpaTransDisplay")
    public String getSordegrGpaTransDisplay() {
        return sordegrGpaTransDisplay;
    }

    @JsonProperty("sordegrGpaTransDisplay")
    public void setSordegrGpaTransDisplay(String sordegrGpaTransDisplay) {
        this.sordegrGpaTransDisplay = sordegrGpaTransDisplay;
    }

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withSordegrGpaTransDisplay(String sordegrGpaTransDisplay) {
        this.sordegrGpaTransDisplay = sordegrGpaTransDisplay;
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

    public AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("termCodeEntry");
        sb.append('=');
        sb.append(((this.termCodeEntry == null)?"<null>":this.termCodeEntry));
        sb.append(',');
        sb.append("sarappdApdcCode");
        sb.append('=');
        sb.append(((this.sarappdApdcCode == null)?"<null>":this.sarappdApdcCode));
        sb.append(',');
        sb.append("apstCode");
        sb.append('=');
        sb.append(((this.apstCode == null)?"<null>":this.apstCode));
        sb.append(',');
        sb.append("applDate");
        sb.append('=');
        sb.append(((this.applDate == null)?"<null>":this.applDate));
        sb.append(',');
        sb.append("applNo");
        sb.append('=');
        sb.append(((this.applNo == null)?"<null>":this.applNo));
        sb.append(',');
        sb.append("admtCode");
        sb.append('=');
        sb.append(((this.admtCode == null)?"<null>":this.admtCode));
        sb.append(',');
        sb.append("sessCode");
        sb.append('=');
        sb.append(((this.sessCode == null)?"<null>":this.sessCode));
        sb.append(',');
        sb.append("reqDocInd");
        sb.append('=');
        sb.append(((this.reqDocInd == null)?"<null>":this.reqDocInd));
        sb.append(',');
        sb.append("applPreference");
        sb.append('=');
        sb.append(((this.applPreference == null)?"<null>":this.applPreference));
        sb.append(',');
        sb.append("stypCode");
        sb.append('=');
        sb.append(((this.stypCode == null)?"<null>":this.stypCode));
        sb.append(',');
        sb.append("resdCode");
        sb.append('=');
        sb.append(((this.resdCode == null)?"<null>":this.resdCode));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
        sb.append(',');
        sb.append("sorpcolSbgiCode");
        sb.append('=');
        sb.append(((this.sorpcolSbgiCode == null)?"<null>":this.sorpcolSbgiCode));
        sb.append(',');
        sb.append("sorpcolTransRevDate");
        sb.append('=');
        sb.append(((this.sorpcolTransRevDate == null)?"<null>":this.sorpcolTransRevDate));
        sb.append(',');
        sb.append("sorpcolTransRecvDate");
        sb.append('=');
        sb.append(((this.sorpcolTransRecvDate == null)?"<null>":this.sorpcolTransRecvDate));
        sb.append(',');
        sb.append("sorpcolOfficialTrans");
        sb.append('=');
        sb.append(((this.sorpcolOfficialTrans == null)?"<null>":this.sorpcolOfficialTrans));
        sb.append(',');
        sb.append("sordegrDegcCode");
        sb.append('=');
        sb.append(((this.sordegrDegcCode == null)?"<null>":this.sordegrDegcCode));
        sb.append(',');
        sb.append("sordegrDegcDate");
        sb.append('=');
        sb.append(((this.sordegrDegcDate == null)?"<null>":this.sordegrDegcDate));
        sb.append(',');
        sb.append("sordegrAttendFrom");
        sb.append('=');
        sb.append(((this.sordegrAttendFrom == null)?"<null>":this.sordegrAttendFrom));
        sb.append(',');
        sb.append("sordegrAttendTo");
        sb.append('=');
        sb.append(((this.sordegrAttendTo == null)?"<null>":this.sordegrAttendTo));
        sb.append(',');
        sb.append("sordegrDegcYear");
        sb.append('=');
        sb.append(((this.sordegrDegcYear == null)?"<null>":this.sordegrDegcYear));
        sb.append(',');
        sb.append("sordegrCollCode");
        sb.append('=');
        sb.append(((this.sordegrCollCode == null)?"<null>":this.sordegrCollCode));
        sb.append(',');
        sb.append("sordegrHonrCode");
        sb.append('=');
        sb.append(((this.sordegrHonrCode == null)?"<null>":this.sordegrHonrCode));
        sb.append(',');
        sb.append("sordegrHoursTransferred");
        sb.append('=');
        sb.append(((this.sordegrHoursTransferred == null)?"<null>":this.sordegrHoursTransferred));
        sb.append(',');
        sb.append("sordegrGpaTransDisplay");
        sb.append('=');
        sb.append(((this.sordegrGpaTransDisplay == null)?"<null>":this.sordegrGpaTransDisplay));
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
        result = ((result* 31)+((this.sordegrAttendFrom == null)? 0 :this.sordegrAttendFrom.hashCode()));
        result = ((result* 31)+((this.reqDocInd == null)? 0 :this.reqDocInd.hashCode()));
        result = ((result* 31)+((this.sordegrCollCode == null)? 0 :this.sordegrCollCode.hashCode()));
        result = ((result* 31)+((this.applDate == null)? 0 :this.applDate.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.sorpcolSbgiCode == null)? 0 :this.sorpcolSbgiCode.hashCode()));
        result = ((result* 31)+((this.sordegrHonrCode == null)? 0 :this.sordegrHonrCode.hashCode()));
        result = ((result* 31)+((this.apstCode == null)? 0 :this.apstCode.hashCode()));
        result = ((result* 31)+((this.sessCode == null)? 0 :this.sessCode.hashCode()));
        result = ((result* 31)+((this.admtCode == null)? 0 :this.admtCode.hashCode()));
        result = ((result* 31)+((this.sordegrHoursTransferred == null)? 0 :this.sordegrHoursTransferred.hashCode()));
        result = ((result* 31)+((this.sordegrGpaTransDisplay == null)? 0 :this.sordegrGpaTransDisplay.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.termCodeEntry == null)? 0 :this.termCodeEntry.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        result = ((result* 31)+((this.sordegrDegcYear == null)? 0 :this.sordegrDegcYear.hashCode()));
        result = ((result* 31)+((this.sorpcolTransRevDate == null)? 0 :this.sorpcolTransRevDate.hashCode()));
        result = ((result* 31)+((this.applNo == null)? 0 :this.applNo.hashCode()));
        result = ((result* 31)+((this.resdCode == null)? 0 :this.resdCode.hashCode()));
        result = ((result* 31)+((this.sarappdApdcCode == null)? 0 :this.sarappdApdcCode.hashCode()));
        result = ((result* 31)+((this.sorpcolOfficialTrans == null)? 0 :this.sorpcolOfficialTrans.hashCode()));
        result = ((result* 31)+((this.applPreference == null)? 0 :this.applPreference.hashCode()));
        result = ((result* 31)+((this.sordegrDegcCode == null)? 0 :this.sordegrDegcCode.hashCode()));
        result = ((result* 31)+((this.sordegrDegcDate == null)? 0 :this.sordegrDegcDate.hashCode()));
        result = ((result* 31)+((this.sordegrAttendTo == null)? 0 :this.sordegrAttendTo.hashCode()));
        result = ((result* 31)+((this.stypCode == null)? 0 :this.stypCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorpcolTransRecvDate == null)? 0 :this.sorpcolTransRecvDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost) == false) {
            return false;
        }
        AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost rhs = ((AdmissionsDecisionPriorCollegeAndDegreeReview100QapiPost) other);
        return (((((((((((((((((((((((((((((this.sordegrAttendFrom == rhs.sordegrAttendFrom)||((this.sordegrAttendFrom!= null)&&this.sordegrAttendFrom.equals(rhs.sordegrAttendFrom)))&&((this.reqDocInd == rhs.reqDocInd)||((this.reqDocInd!= null)&&this.reqDocInd.equals(rhs.reqDocInd))))&&((this.sordegrCollCode == rhs.sordegrCollCode)||((this.sordegrCollCode!= null)&&this.sordegrCollCode.equals(rhs.sordegrCollCode))))&&((this.applDate == rhs.applDate)||((this.applDate!= null)&&this.applDate.equals(rhs.applDate))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.sorpcolSbgiCode == rhs.sorpcolSbgiCode)||((this.sorpcolSbgiCode!= null)&&this.sorpcolSbgiCode.equals(rhs.sorpcolSbgiCode))))&&((this.sordegrHonrCode == rhs.sordegrHonrCode)||((this.sordegrHonrCode!= null)&&this.sordegrHonrCode.equals(rhs.sordegrHonrCode))))&&((this.apstCode == rhs.apstCode)||((this.apstCode!= null)&&this.apstCode.equals(rhs.apstCode))))&&((this.sessCode == rhs.sessCode)||((this.sessCode!= null)&&this.sessCode.equals(rhs.sessCode))))&&((this.admtCode == rhs.admtCode)||((this.admtCode!= null)&&this.admtCode.equals(rhs.admtCode))))&&((this.sordegrHoursTransferred == rhs.sordegrHoursTransferred)||((this.sordegrHoursTransferred!= null)&&this.sordegrHoursTransferred.equals(rhs.sordegrHoursTransferred))))&&((this.sordegrGpaTransDisplay == rhs.sordegrGpaTransDisplay)||((this.sordegrGpaTransDisplay!= null)&&this.sordegrGpaTransDisplay.equals(rhs.sordegrGpaTransDisplay))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.termCodeEntry == rhs.termCodeEntry)||((this.termCodeEntry!= null)&&this.termCodeEntry.equals(rhs.termCodeEntry))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))))&&((this.sordegrDegcYear == rhs.sordegrDegcYear)||((this.sordegrDegcYear!= null)&&this.sordegrDegcYear.equals(rhs.sordegrDegcYear))))&&((this.sorpcolTransRevDate == rhs.sorpcolTransRevDate)||((this.sorpcolTransRevDate!= null)&&this.sorpcolTransRevDate.equals(rhs.sorpcolTransRevDate))))&&((this.applNo == rhs.applNo)||((this.applNo!= null)&&this.applNo.equals(rhs.applNo))))&&((this.resdCode == rhs.resdCode)||((this.resdCode!= null)&&this.resdCode.equals(rhs.resdCode))))&&((this.sarappdApdcCode == rhs.sarappdApdcCode)||((this.sarappdApdcCode!= null)&&this.sarappdApdcCode.equals(rhs.sarappdApdcCode))))&&((this.sorpcolOfficialTrans == rhs.sorpcolOfficialTrans)||((this.sorpcolOfficialTrans!= null)&&this.sorpcolOfficialTrans.equals(rhs.sorpcolOfficialTrans))))&&((this.applPreference == rhs.applPreference)||((this.applPreference!= null)&&this.applPreference.equals(rhs.applPreference))))&&((this.sordegrDegcCode == rhs.sordegrDegcCode)||((this.sordegrDegcCode!= null)&&this.sordegrDegcCode.equals(rhs.sordegrDegcCode))))&&((this.sordegrDegcDate == rhs.sordegrDegcDate)||((this.sordegrDegcDate!= null)&&this.sordegrDegcDate.equals(rhs.sordegrDegcDate))))&&((this.sordegrAttendTo == rhs.sordegrAttendTo)||((this.sordegrAttendTo!= null)&&this.sordegrAttendTo.equals(rhs.sordegrAttendTo))))&&((this.stypCode == rhs.stypCode)||((this.stypCode!= null)&&this.stypCode.equals(rhs.stypCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorpcolTransRecvDate == rhs.sorpcolTransRecvDate)||((this.sorpcolTransRecvDate!= null)&&this.sorpcolTransRecvDate.equals(rhs.sorpcolTransRecvDate))));
    }

}
