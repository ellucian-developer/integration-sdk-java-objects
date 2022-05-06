
package com.ellucian.generated.bpapi.ban.registration_sections.v1_0_0;

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
    "globalTermCode",
    "globalPtrmCode",
    "globalCrn",
    "globalPidm",
    "globalSubjCode",
    "globalCrseNumb",
    "globallinkIdent",
    "criteria.queryCrn",
    "criteria.queryPtrmCode",
    "criteria.querySubjCode",
    "criteria.queryCrseNumb",
    "criteria.querySeqNumb",
    "criteria.seatsAvail",
    "criteria.waitCount",
    "criteria.beginTime",
    "criteria.endTime",
    "criteria.queryLinkIdent",
    "criteria.queryXlstGroup",
    "criteria.queryCampCode",
    "criteria.querySchdCode",
    "criteria.querySstsCode",
    "criteria.blockInd"
})
@Generated("jsonschema2pojo")
public class RegistrationSections100QapiPost {

    @JsonProperty("globalTermCode")
    private String globalTermCode;
    @JsonProperty("globalPtrmCode")
    private String globalPtrmCode;
    @JsonProperty("globalCrn")
    private String globalCrn;
    @JsonProperty("globalPidm")
    private String globalPidm;
    @JsonProperty("globalSubjCode")
    private String globalSubjCode;
    @JsonProperty("globalCrseNumb")
    private String globalCrseNumb;
    @JsonProperty("globallinkIdent")
    private String globallinkIdent;
    @JsonProperty("criteria.queryCrn")
    private String criteriaQueryCrn;
    @JsonProperty("criteria.queryPtrmCode")
    private String criteriaQueryPtrmCode;
    @JsonProperty("criteria.querySubjCode")
    private String criteriaQuerySubjCode;
    @JsonProperty("criteria.queryCrseNumb")
    private String criteriaQueryCrseNumb;
    @JsonProperty("criteria.querySeqNumb")
    private String criteriaQuerySeqNumb;
    @JsonProperty("criteria.seatsAvail")
    private String criteriaSeatsAvail;
    @JsonProperty("criteria.waitCount")
    private String criteriaWaitCount;
    @JsonProperty("criteria.beginTime")
    private String criteriaBeginTime;
    @JsonProperty("criteria.endTime")
    private String criteriaEndTime;
    @JsonProperty("criteria.queryLinkIdent")
    private String criteriaQueryLinkIdent;
    @JsonProperty("criteria.queryXlstGroup")
    private String criteriaQueryXlstGroup;
    @JsonProperty("criteria.queryCampCode")
    private String criteriaQueryCampCode;
    @JsonProperty("criteria.querySchdCode")
    private String criteriaQuerySchdCode;
    @JsonProperty("criteria.querySstsCode")
    private String criteriaQuerySstsCode;
    @JsonProperty("criteria.blockInd")
    private String criteriaBlockInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("globalTermCode")
    public String getGlobalTermCode() {
        return globalTermCode;
    }

    @JsonProperty("globalTermCode")
    public void setGlobalTermCode(String globalTermCode) {
        this.globalTermCode = globalTermCode;
    }

    public RegistrationSections100QapiPost withGlobalTermCode(String globalTermCode) {
        this.globalTermCode = globalTermCode;
        return this;
    }

    @JsonProperty("globalPtrmCode")
    public String getGlobalPtrmCode() {
        return globalPtrmCode;
    }

    @JsonProperty("globalPtrmCode")
    public void setGlobalPtrmCode(String globalPtrmCode) {
        this.globalPtrmCode = globalPtrmCode;
    }

    public RegistrationSections100QapiPost withGlobalPtrmCode(String globalPtrmCode) {
        this.globalPtrmCode = globalPtrmCode;
        return this;
    }

    @JsonProperty("globalCrn")
    public String getGlobalCrn() {
        return globalCrn;
    }

    @JsonProperty("globalCrn")
    public void setGlobalCrn(String globalCrn) {
        this.globalCrn = globalCrn;
    }

    public RegistrationSections100QapiPost withGlobalCrn(String globalCrn) {
        this.globalCrn = globalCrn;
        return this;
    }

    @JsonProperty("globalPidm")
    public String getGlobalPidm() {
        return globalPidm;
    }

    @JsonProperty("globalPidm")
    public void setGlobalPidm(String globalPidm) {
        this.globalPidm = globalPidm;
    }

    public RegistrationSections100QapiPost withGlobalPidm(String globalPidm) {
        this.globalPidm = globalPidm;
        return this;
    }

    @JsonProperty("globalSubjCode")
    public String getGlobalSubjCode() {
        return globalSubjCode;
    }

    @JsonProperty("globalSubjCode")
    public void setGlobalSubjCode(String globalSubjCode) {
        this.globalSubjCode = globalSubjCode;
    }

    public RegistrationSections100QapiPost withGlobalSubjCode(String globalSubjCode) {
        this.globalSubjCode = globalSubjCode;
        return this;
    }

    @JsonProperty("globalCrseNumb")
    public String getGlobalCrseNumb() {
        return globalCrseNumb;
    }

    @JsonProperty("globalCrseNumb")
    public void setGlobalCrseNumb(String globalCrseNumb) {
        this.globalCrseNumb = globalCrseNumb;
    }

    public RegistrationSections100QapiPost withGlobalCrseNumb(String globalCrseNumb) {
        this.globalCrseNumb = globalCrseNumb;
        return this;
    }

    @JsonProperty("globallinkIdent")
    public String getGloballinkIdent() {
        return globallinkIdent;
    }

    @JsonProperty("globallinkIdent")
    public void setGloballinkIdent(String globallinkIdent) {
        this.globallinkIdent = globallinkIdent;
    }

    public RegistrationSections100QapiPost withGloballinkIdent(String globallinkIdent) {
        this.globallinkIdent = globallinkIdent;
        return this;
    }

    @JsonProperty("criteria.queryCrn")
    public String getCriteriaQueryCrn() {
        return criteriaQueryCrn;
    }

    @JsonProperty("criteria.queryCrn")
    public void setCriteriaQueryCrn(String criteriaQueryCrn) {
        this.criteriaQueryCrn = criteriaQueryCrn;
    }

    public RegistrationSections100QapiPost withCriteriaQueryCrn(String criteriaQueryCrn) {
        this.criteriaQueryCrn = criteriaQueryCrn;
        return this;
    }

    @JsonProperty("criteria.queryPtrmCode")
    public String getCriteriaQueryPtrmCode() {
        return criteriaQueryPtrmCode;
    }

    @JsonProperty("criteria.queryPtrmCode")
    public void setCriteriaQueryPtrmCode(String criteriaQueryPtrmCode) {
        this.criteriaQueryPtrmCode = criteriaQueryPtrmCode;
    }

    public RegistrationSections100QapiPost withCriteriaQueryPtrmCode(String criteriaQueryPtrmCode) {
        this.criteriaQueryPtrmCode = criteriaQueryPtrmCode;
        return this;
    }

    @JsonProperty("criteria.querySubjCode")
    public String getCriteriaQuerySubjCode() {
        return criteriaQuerySubjCode;
    }

    @JsonProperty("criteria.querySubjCode")
    public void setCriteriaQuerySubjCode(String criteriaQuerySubjCode) {
        this.criteriaQuerySubjCode = criteriaQuerySubjCode;
    }

    public RegistrationSections100QapiPost withCriteriaQuerySubjCode(String criteriaQuerySubjCode) {
        this.criteriaQuerySubjCode = criteriaQuerySubjCode;
        return this;
    }

    @JsonProperty("criteria.queryCrseNumb")
    public String getCriteriaQueryCrseNumb() {
        return criteriaQueryCrseNumb;
    }

    @JsonProperty("criteria.queryCrseNumb")
    public void setCriteriaQueryCrseNumb(String criteriaQueryCrseNumb) {
        this.criteriaQueryCrseNumb = criteriaQueryCrseNumb;
    }

    public RegistrationSections100QapiPost withCriteriaQueryCrseNumb(String criteriaQueryCrseNumb) {
        this.criteriaQueryCrseNumb = criteriaQueryCrseNumb;
        return this;
    }

    @JsonProperty("criteria.querySeqNumb")
    public String getCriteriaQuerySeqNumb() {
        return criteriaQuerySeqNumb;
    }

    @JsonProperty("criteria.querySeqNumb")
    public void setCriteriaQuerySeqNumb(String criteriaQuerySeqNumb) {
        this.criteriaQuerySeqNumb = criteriaQuerySeqNumb;
    }

    public RegistrationSections100QapiPost withCriteriaQuerySeqNumb(String criteriaQuerySeqNumb) {
        this.criteriaQuerySeqNumb = criteriaQuerySeqNumb;
        return this;
    }

    @JsonProperty("criteria.seatsAvail")
    public String getCriteriaSeatsAvail() {
        return criteriaSeatsAvail;
    }

    @JsonProperty("criteria.seatsAvail")
    public void setCriteriaSeatsAvail(String criteriaSeatsAvail) {
        this.criteriaSeatsAvail = criteriaSeatsAvail;
    }

    public RegistrationSections100QapiPost withCriteriaSeatsAvail(String criteriaSeatsAvail) {
        this.criteriaSeatsAvail = criteriaSeatsAvail;
        return this;
    }

    @JsonProperty("criteria.waitCount")
    public String getCriteriaWaitCount() {
        return criteriaWaitCount;
    }

    @JsonProperty("criteria.waitCount")
    public void setCriteriaWaitCount(String criteriaWaitCount) {
        this.criteriaWaitCount = criteriaWaitCount;
    }

    public RegistrationSections100QapiPost withCriteriaWaitCount(String criteriaWaitCount) {
        this.criteriaWaitCount = criteriaWaitCount;
        return this;
    }

    @JsonProperty("criteria.beginTime")
    public String getCriteriaBeginTime() {
        return criteriaBeginTime;
    }

    @JsonProperty("criteria.beginTime")
    public void setCriteriaBeginTime(String criteriaBeginTime) {
        this.criteriaBeginTime = criteriaBeginTime;
    }

    public RegistrationSections100QapiPost withCriteriaBeginTime(String criteriaBeginTime) {
        this.criteriaBeginTime = criteriaBeginTime;
        return this;
    }

    @JsonProperty("criteria.endTime")
    public String getCriteriaEndTime() {
        return criteriaEndTime;
    }

    @JsonProperty("criteria.endTime")
    public void setCriteriaEndTime(String criteriaEndTime) {
        this.criteriaEndTime = criteriaEndTime;
    }

    public RegistrationSections100QapiPost withCriteriaEndTime(String criteriaEndTime) {
        this.criteriaEndTime = criteriaEndTime;
        return this;
    }

    @JsonProperty("criteria.queryLinkIdent")
    public String getCriteriaQueryLinkIdent() {
        return criteriaQueryLinkIdent;
    }

    @JsonProperty("criteria.queryLinkIdent")
    public void setCriteriaQueryLinkIdent(String criteriaQueryLinkIdent) {
        this.criteriaQueryLinkIdent = criteriaQueryLinkIdent;
    }

    public RegistrationSections100QapiPost withCriteriaQueryLinkIdent(String criteriaQueryLinkIdent) {
        this.criteriaQueryLinkIdent = criteriaQueryLinkIdent;
        return this;
    }

    @JsonProperty("criteria.queryXlstGroup")
    public String getCriteriaQueryXlstGroup() {
        return criteriaQueryXlstGroup;
    }

    @JsonProperty("criteria.queryXlstGroup")
    public void setCriteriaQueryXlstGroup(String criteriaQueryXlstGroup) {
        this.criteriaQueryXlstGroup = criteriaQueryXlstGroup;
    }

    public RegistrationSections100QapiPost withCriteriaQueryXlstGroup(String criteriaQueryXlstGroup) {
        this.criteriaQueryXlstGroup = criteriaQueryXlstGroup;
        return this;
    }

    @JsonProperty("criteria.queryCampCode")
    public String getCriteriaQueryCampCode() {
        return criteriaQueryCampCode;
    }

    @JsonProperty("criteria.queryCampCode")
    public void setCriteriaQueryCampCode(String criteriaQueryCampCode) {
        this.criteriaQueryCampCode = criteriaQueryCampCode;
    }

    public RegistrationSections100QapiPost withCriteriaQueryCampCode(String criteriaQueryCampCode) {
        this.criteriaQueryCampCode = criteriaQueryCampCode;
        return this;
    }

    @JsonProperty("criteria.querySchdCode")
    public String getCriteriaQuerySchdCode() {
        return criteriaQuerySchdCode;
    }

    @JsonProperty("criteria.querySchdCode")
    public void setCriteriaQuerySchdCode(String criteriaQuerySchdCode) {
        this.criteriaQuerySchdCode = criteriaQuerySchdCode;
    }

    public RegistrationSections100QapiPost withCriteriaQuerySchdCode(String criteriaQuerySchdCode) {
        this.criteriaQuerySchdCode = criteriaQuerySchdCode;
        return this;
    }

    @JsonProperty("criteria.querySstsCode")
    public String getCriteriaQuerySstsCode() {
        return criteriaQuerySstsCode;
    }

    @JsonProperty("criteria.querySstsCode")
    public void setCriteriaQuerySstsCode(String criteriaQuerySstsCode) {
        this.criteriaQuerySstsCode = criteriaQuerySstsCode;
    }

    public RegistrationSections100QapiPost withCriteriaQuerySstsCode(String criteriaQuerySstsCode) {
        this.criteriaQuerySstsCode = criteriaQuerySstsCode;
        return this;
    }

    @JsonProperty("criteria.blockInd")
    public String getCriteriaBlockInd() {
        return criteriaBlockInd;
    }

    @JsonProperty("criteria.blockInd")
    public void setCriteriaBlockInd(String criteriaBlockInd) {
        this.criteriaBlockInd = criteriaBlockInd;
    }

    public RegistrationSections100QapiPost withCriteriaBlockInd(String criteriaBlockInd) {
        this.criteriaBlockInd = criteriaBlockInd;
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

    public RegistrationSections100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegistrationSections100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("globalTermCode");
        sb.append('=');
        sb.append(((this.globalTermCode == null)?"<null>":this.globalTermCode));
        sb.append(',');
        sb.append("globalPtrmCode");
        sb.append('=');
        sb.append(((this.globalPtrmCode == null)?"<null>":this.globalPtrmCode));
        sb.append(',');
        sb.append("globalCrn");
        sb.append('=');
        sb.append(((this.globalCrn == null)?"<null>":this.globalCrn));
        sb.append(',');
        sb.append("globalPidm");
        sb.append('=');
        sb.append(((this.globalPidm == null)?"<null>":this.globalPidm));
        sb.append(',');
        sb.append("globalSubjCode");
        sb.append('=');
        sb.append(((this.globalSubjCode == null)?"<null>":this.globalSubjCode));
        sb.append(',');
        sb.append("globalCrseNumb");
        sb.append('=');
        sb.append(((this.globalCrseNumb == null)?"<null>":this.globalCrseNumb));
        sb.append(',');
        sb.append("globallinkIdent");
        sb.append('=');
        sb.append(((this.globallinkIdent == null)?"<null>":this.globallinkIdent));
        sb.append(',');
        sb.append("criteriaQueryCrn");
        sb.append('=');
        sb.append(((this.criteriaQueryCrn == null)?"<null>":this.criteriaQueryCrn));
        sb.append(',');
        sb.append("criteriaQueryPtrmCode");
        sb.append('=');
        sb.append(((this.criteriaQueryPtrmCode == null)?"<null>":this.criteriaQueryPtrmCode));
        sb.append(',');
        sb.append("criteriaQuerySubjCode");
        sb.append('=');
        sb.append(((this.criteriaQuerySubjCode == null)?"<null>":this.criteriaQuerySubjCode));
        sb.append(',');
        sb.append("criteriaQueryCrseNumb");
        sb.append('=');
        sb.append(((this.criteriaQueryCrseNumb == null)?"<null>":this.criteriaQueryCrseNumb));
        sb.append(',');
        sb.append("criteriaQuerySeqNumb");
        sb.append('=');
        sb.append(((this.criteriaQuerySeqNumb == null)?"<null>":this.criteriaQuerySeqNumb));
        sb.append(',');
        sb.append("criteriaSeatsAvail");
        sb.append('=');
        sb.append(((this.criteriaSeatsAvail == null)?"<null>":this.criteriaSeatsAvail));
        sb.append(',');
        sb.append("criteriaWaitCount");
        sb.append('=');
        sb.append(((this.criteriaWaitCount == null)?"<null>":this.criteriaWaitCount));
        sb.append(',');
        sb.append("criteriaBeginTime");
        sb.append('=');
        sb.append(((this.criteriaBeginTime == null)?"<null>":this.criteriaBeginTime));
        sb.append(',');
        sb.append("criteriaEndTime");
        sb.append('=');
        sb.append(((this.criteriaEndTime == null)?"<null>":this.criteriaEndTime));
        sb.append(',');
        sb.append("criteriaQueryLinkIdent");
        sb.append('=');
        sb.append(((this.criteriaQueryLinkIdent == null)?"<null>":this.criteriaQueryLinkIdent));
        sb.append(',');
        sb.append("criteriaQueryXlstGroup");
        sb.append('=');
        sb.append(((this.criteriaQueryXlstGroup == null)?"<null>":this.criteriaQueryXlstGroup));
        sb.append(',');
        sb.append("criteriaQueryCampCode");
        sb.append('=');
        sb.append(((this.criteriaQueryCampCode == null)?"<null>":this.criteriaQueryCampCode));
        sb.append(',');
        sb.append("criteriaQuerySchdCode");
        sb.append('=');
        sb.append(((this.criteriaQuerySchdCode == null)?"<null>":this.criteriaQuerySchdCode));
        sb.append(',');
        sb.append("criteriaQuerySstsCode");
        sb.append('=');
        sb.append(((this.criteriaQuerySstsCode == null)?"<null>":this.criteriaQuerySstsCode));
        sb.append(',');
        sb.append("criteriaBlockInd");
        sb.append('=');
        sb.append(((this.criteriaBlockInd == null)?"<null>":this.criteriaBlockInd));
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
        result = ((result* 31)+((this.globalCrn == null)? 0 :this.globalCrn.hashCode()));
        result = ((result* 31)+((this.criteriaQuerySchdCode == null)? 0 :this.criteriaQuerySchdCode.hashCode()));
        result = ((result* 31)+((this.criteriaBeginTime == null)? 0 :this.criteriaBeginTime.hashCode()));
        result = ((result* 31)+((this.criteriaQueryLinkIdent == null)? 0 :this.criteriaQueryLinkIdent.hashCode()));
        result = ((result* 31)+((this.criteriaQueryXlstGroup == null)? 0 :this.criteriaQueryXlstGroup.hashCode()));
        result = ((result* 31)+((this.criteriaQueryPtrmCode == null)? 0 :this.criteriaQueryPtrmCode.hashCode()));
        result = ((result* 31)+((this.criteriaQuerySeqNumb == null)? 0 :this.criteriaQuerySeqNumb.hashCode()));
        result = ((result* 31)+((this.criteriaSeatsAvail == null)? 0 :this.criteriaSeatsAvail.hashCode()));
        result = ((result* 31)+((this.globalPidm == null)? 0 :this.globalPidm.hashCode()));
        result = ((result* 31)+((this.globallinkIdent == null)? 0 :this.globallinkIdent.hashCode()));
        result = ((result* 31)+((this.criteriaQueryCrseNumb == null)? 0 :this.criteriaQueryCrseNumb.hashCode()));
        result = ((result* 31)+((this.globalPtrmCode == null)? 0 :this.globalPtrmCode.hashCode()));
        result = ((result* 31)+((this.criteriaQuerySstsCode == null)? 0 :this.criteriaQuerySstsCode.hashCode()));
        result = ((result* 31)+((this.globalSubjCode == null)? 0 :this.globalSubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaQuerySubjCode == null)? 0 :this.criteriaQuerySubjCode.hashCode()));
        result = ((result* 31)+((this.criteriaQueryCampCode == null)? 0 :this.criteriaQueryCampCode.hashCode()));
        result = ((result* 31)+((this.globalCrseNumb == null)? 0 :this.globalCrseNumb.hashCode()));
        result = ((result* 31)+((this.criteriaWaitCount == null)? 0 :this.criteriaWaitCount.hashCode()));
        result = ((result* 31)+((this.criteriaEndTime == null)? 0 :this.criteriaEndTime.hashCode()));
        result = ((result* 31)+((this.globalTermCode == null)? 0 :this.globalTermCode.hashCode()));
        result = ((result* 31)+((this.criteriaQueryCrn == null)? 0 :this.criteriaQueryCrn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.criteriaBlockInd == null)? 0 :this.criteriaBlockInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RegistrationSections100QapiPost) == false) {
            return false;
        }
        RegistrationSections100QapiPost rhs = ((RegistrationSections100QapiPost) other);
        return ((((((((((((((((((((((((this.globalCrn == rhs.globalCrn)||((this.globalCrn!= null)&&this.globalCrn.equals(rhs.globalCrn)))&&((this.criteriaQuerySchdCode == rhs.criteriaQuerySchdCode)||((this.criteriaQuerySchdCode!= null)&&this.criteriaQuerySchdCode.equals(rhs.criteriaQuerySchdCode))))&&((this.criteriaBeginTime == rhs.criteriaBeginTime)||((this.criteriaBeginTime!= null)&&this.criteriaBeginTime.equals(rhs.criteriaBeginTime))))&&((this.criteriaQueryLinkIdent == rhs.criteriaQueryLinkIdent)||((this.criteriaQueryLinkIdent!= null)&&this.criteriaQueryLinkIdent.equals(rhs.criteriaQueryLinkIdent))))&&((this.criteriaQueryXlstGroup == rhs.criteriaQueryXlstGroup)||((this.criteriaQueryXlstGroup!= null)&&this.criteriaQueryXlstGroup.equals(rhs.criteriaQueryXlstGroup))))&&((this.criteriaQueryPtrmCode == rhs.criteriaQueryPtrmCode)||((this.criteriaQueryPtrmCode!= null)&&this.criteriaQueryPtrmCode.equals(rhs.criteriaQueryPtrmCode))))&&((this.criteriaQuerySeqNumb == rhs.criteriaQuerySeqNumb)||((this.criteriaQuerySeqNumb!= null)&&this.criteriaQuerySeqNumb.equals(rhs.criteriaQuerySeqNumb))))&&((this.criteriaSeatsAvail == rhs.criteriaSeatsAvail)||((this.criteriaSeatsAvail!= null)&&this.criteriaSeatsAvail.equals(rhs.criteriaSeatsAvail))))&&((this.globalPidm == rhs.globalPidm)||((this.globalPidm!= null)&&this.globalPidm.equals(rhs.globalPidm))))&&((this.globallinkIdent == rhs.globallinkIdent)||((this.globallinkIdent!= null)&&this.globallinkIdent.equals(rhs.globallinkIdent))))&&((this.criteriaQueryCrseNumb == rhs.criteriaQueryCrseNumb)||((this.criteriaQueryCrseNumb!= null)&&this.criteriaQueryCrseNumb.equals(rhs.criteriaQueryCrseNumb))))&&((this.globalPtrmCode == rhs.globalPtrmCode)||((this.globalPtrmCode!= null)&&this.globalPtrmCode.equals(rhs.globalPtrmCode))))&&((this.criteriaQuerySstsCode == rhs.criteriaQuerySstsCode)||((this.criteriaQuerySstsCode!= null)&&this.criteriaQuerySstsCode.equals(rhs.criteriaQuerySstsCode))))&&((this.globalSubjCode == rhs.globalSubjCode)||((this.globalSubjCode!= null)&&this.globalSubjCode.equals(rhs.globalSubjCode))))&&((this.criteriaQuerySubjCode == rhs.criteriaQuerySubjCode)||((this.criteriaQuerySubjCode!= null)&&this.criteriaQuerySubjCode.equals(rhs.criteriaQuerySubjCode))))&&((this.criteriaQueryCampCode == rhs.criteriaQueryCampCode)||((this.criteriaQueryCampCode!= null)&&this.criteriaQueryCampCode.equals(rhs.criteriaQueryCampCode))))&&((this.globalCrseNumb == rhs.globalCrseNumb)||((this.globalCrseNumb!= null)&&this.globalCrseNumb.equals(rhs.globalCrseNumb))))&&((this.criteriaWaitCount == rhs.criteriaWaitCount)||((this.criteriaWaitCount!= null)&&this.criteriaWaitCount.equals(rhs.criteriaWaitCount))))&&((this.criteriaEndTime == rhs.criteriaEndTime)||((this.criteriaEndTime!= null)&&this.criteriaEndTime.equals(rhs.criteriaEndTime))))&&((this.globalTermCode == rhs.globalTermCode)||((this.globalTermCode!= null)&&this.globalTermCode.equals(rhs.globalTermCode))))&&((this.criteriaQueryCrn == rhs.criteriaQueryCrn)||((this.criteriaQueryCrn!= null)&&this.criteriaQueryCrn.equals(rhs.criteriaQueryCrn))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.criteriaBlockInd == rhs.criteriaBlockInd)||((this.criteriaBlockInd!= null)&&this.criteriaBlockInd.equals(rhs.criteriaBlockInd))));
    }

}
