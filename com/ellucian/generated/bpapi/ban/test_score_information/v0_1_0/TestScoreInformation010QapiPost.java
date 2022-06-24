
package com.ellucian.generated.bpapi.ban.test_score_information.v0_1_0;

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
    "tescCode",
    "stvtescDesc",
    "testScore",
    "testDate",
    "queryTestDate",
    "dispTestDate",
    "admrCode",
    "stvadmrDesc",
    "equivInd",
    "tsrcCode",
    "stvtsrcDesc",
    "rcrvInd"
})
@Generated("jsonschema2pojo")
public class TestScoreInformation010QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("tescCode")
    private String tescCode;
    @JsonProperty("stvtescDesc")
    private String stvtescDesc;
    @JsonProperty("testScore")
    private String testScore;
    @JsonProperty("testDate")
    private String testDate;
    @JsonProperty("queryTestDate")
    private String queryTestDate;
    @JsonProperty("dispTestDate")
    private String dispTestDate;
    @JsonProperty("admrCode")
    private String admrCode;
    @JsonProperty("stvadmrDesc")
    private String stvadmrDesc;
    @JsonProperty("equivInd")
    private String equivInd;
    @JsonProperty("tsrcCode")
    private String tsrcCode;
    @JsonProperty("stvtsrcDesc")
    private String stvtsrcDesc;
    @JsonProperty("rcrvInd")
    private String rcrvInd;
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

    public TestScoreInformation010QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("tescCode")
    public String getTescCode() {
        return tescCode;
    }

    @JsonProperty("tescCode")
    public void setTescCode(String tescCode) {
        this.tescCode = tescCode;
    }

    public TestScoreInformation010QapiPost withTescCode(String tescCode) {
        this.tescCode = tescCode;
        return this;
    }

    @JsonProperty("stvtescDesc")
    public String getStvtescDesc() {
        return stvtescDesc;
    }

    @JsonProperty("stvtescDesc")
    public void setStvtescDesc(String stvtescDesc) {
        this.stvtescDesc = stvtescDesc;
    }

    public TestScoreInformation010QapiPost withStvtescDesc(String stvtescDesc) {
        this.stvtescDesc = stvtescDesc;
        return this;
    }

    @JsonProperty("testScore")
    public String getTestScore() {
        return testScore;
    }

    @JsonProperty("testScore")
    public void setTestScore(String testScore) {
        this.testScore = testScore;
    }

    public TestScoreInformation010QapiPost withTestScore(String testScore) {
        this.testScore = testScore;
        return this;
    }

    @JsonProperty("testDate")
    public String getTestDate() {
        return testDate;
    }

    @JsonProperty("testDate")
    public void setTestDate(String testDate) {
        this.testDate = testDate;
    }

    public TestScoreInformation010QapiPost withTestDate(String testDate) {
        this.testDate = testDate;
        return this;
    }

    @JsonProperty("queryTestDate")
    public String getQueryTestDate() {
        return queryTestDate;
    }

    @JsonProperty("queryTestDate")
    public void setQueryTestDate(String queryTestDate) {
        this.queryTestDate = queryTestDate;
    }

    public TestScoreInformation010QapiPost withQueryTestDate(String queryTestDate) {
        this.queryTestDate = queryTestDate;
        return this;
    }

    @JsonProperty("dispTestDate")
    public String getDispTestDate() {
        return dispTestDate;
    }

    @JsonProperty("dispTestDate")
    public void setDispTestDate(String dispTestDate) {
        this.dispTestDate = dispTestDate;
    }

    public TestScoreInformation010QapiPost withDispTestDate(String dispTestDate) {
        this.dispTestDate = dispTestDate;
        return this;
    }

    @JsonProperty("admrCode")
    public String getAdmrCode() {
        return admrCode;
    }

    @JsonProperty("admrCode")
    public void setAdmrCode(String admrCode) {
        this.admrCode = admrCode;
    }

    public TestScoreInformation010QapiPost withAdmrCode(String admrCode) {
        this.admrCode = admrCode;
        return this;
    }

    @JsonProperty("stvadmrDesc")
    public String getStvadmrDesc() {
        return stvadmrDesc;
    }

    @JsonProperty("stvadmrDesc")
    public void setStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
    }

    public TestScoreInformation010QapiPost withStvadmrDesc(String stvadmrDesc) {
        this.stvadmrDesc = stvadmrDesc;
        return this;
    }

    @JsonProperty("equivInd")
    public String getEquivInd() {
        return equivInd;
    }

    @JsonProperty("equivInd")
    public void setEquivInd(String equivInd) {
        this.equivInd = equivInd;
    }

    public TestScoreInformation010QapiPost withEquivInd(String equivInd) {
        this.equivInd = equivInd;
        return this;
    }

    @JsonProperty("tsrcCode")
    public String getTsrcCode() {
        return tsrcCode;
    }

    @JsonProperty("tsrcCode")
    public void setTsrcCode(String tsrcCode) {
        this.tsrcCode = tsrcCode;
    }

    public TestScoreInformation010QapiPost withTsrcCode(String tsrcCode) {
        this.tsrcCode = tsrcCode;
        return this;
    }

    @JsonProperty("stvtsrcDesc")
    public String getStvtsrcDesc() {
        return stvtsrcDesc;
    }

    @JsonProperty("stvtsrcDesc")
    public void setStvtsrcDesc(String stvtsrcDesc) {
        this.stvtsrcDesc = stvtsrcDesc;
    }

    public TestScoreInformation010QapiPost withStvtsrcDesc(String stvtsrcDesc) {
        this.stvtsrcDesc = stvtsrcDesc;
        return this;
    }

    @JsonProperty("rcrvInd")
    public String getRcrvInd() {
        return rcrvInd;
    }

    @JsonProperty("rcrvInd")
    public void setRcrvInd(String rcrvInd) {
        this.rcrvInd = rcrvInd;
    }

    public TestScoreInformation010QapiPost withRcrvInd(String rcrvInd) {
        this.rcrvInd = rcrvInd;
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

    public TestScoreInformation010QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreInformation010QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("stvtescDesc");
        sb.append('=');
        sb.append(((this.stvtescDesc == null)?"<null>":this.stvtescDesc));
        sb.append(',');
        sb.append("testScore");
        sb.append('=');
        sb.append(((this.testScore == null)?"<null>":this.testScore));
        sb.append(',');
        sb.append("testDate");
        sb.append('=');
        sb.append(((this.testDate == null)?"<null>":this.testDate));
        sb.append(',');
        sb.append("queryTestDate");
        sb.append('=');
        sb.append(((this.queryTestDate == null)?"<null>":this.queryTestDate));
        sb.append(',');
        sb.append("dispTestDate");
        sb.append('=');
        sb.append(((this.dispTestDate == null)?"<null>":this.dispTestDate));
        sb.append(',');
        sb.append("admrCode");
        sb.append('=');
        sb.append(((this.admrCode == null)?"<null>":this.admrCode));
        sb.append(',');
        sb.append("stvadmrDesc");
        sb.append('=');
        sb.append(((this.stvadmrDesc == null)?"<null>":this.stvadmrDesc));
        sb.append(',');
        sb.append("equivInd");
        sb.append('=');
        sb.append(((this.equivInd == null)?"<null>":this.equivInd));
        sb.append(',');
        sb.append("tsrcCode");
        sb.append('=');
        sb.append(((this.tsrcCode == null)?"<null>":this.tsrcCode));
        sb.append(',');
        sb.append("stvtsrcDesc");
        sb.append('=');
        sb.append(((this.stvtsrcDesc == null)?"<null>":this.stvtsrcDesc));
        sb.append(',');
        sb.append("rcrvInd");
        sb.append('=');
        sb.append(((this.rcrvInd == null)?"<null>":this.rcrvInd));
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
        result = ((result* 31)+((this.tescCode == null)? 0 :this.tescCode.hashCode()));
        result = ((result* 31)+((this.stvtsrcDesc == null)? 0 :this.stvtsrcDesc.hashCode()));
        result = ((result* 31)+((this.tsrcCode == null)? 0 :this.tsrcCode.hashCode()));
        result = ((result* 31)+((this.queryTestDate == null)? 0 :this.queryTestDate.hashCode()));
        result = ((result* 31)+((this.admrCode == null)? 0 :this.admrCode.hashCode()));
        result = ((result* 31)+((this.equivInd == null)? 0 :this.equivInd.hashCode()));
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
        result = ((result* 31)+((this.stvadmrDesc == null)? 0 :this.stvadmrDesc.hashCode()));
        result = ((result* 31)+((this.rcrvInd == null)? 0 :this.rcrvInd.hashCode()));
        result = ((result* 31)+((this.stvtescDesc == null)? 0 :this.stvtescDesc.hashCode()));
        result = ((result* 31)+((this.dispTestDate == null)? 0 :this.dispTestDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.testDate == null)? 0 :this.testDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreInformation010QapiPost) == false) {
            return false;
        }
        TestScoreInformation010QapiPost rhs = ((TestScoreInformation010QapiPost) other);
        return (((((((((((((((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode)))&&((this.stvtsrcDesc == rhs.stvtsrcDesc)||((this.stvtsrcDesc!= null)&&this.stvtsrcDesc.equals(rhs.stvtsrcDesc))))&&((this.tsrcCode == rhs.tsrcCode)||((this.tsrcCode!= null)&&this.tsrcCode.equals(rhs.tsrcCode))))&&((this.queryTestDate == rhs.queryTestDate)||((this.queryTestDate!= null)&&this.queryTestDate.equals(rhs.queryTestDate))))&&((this.admrCode == rhs.admrCode)||((this.admrCode!= null)&&this.admrCode.equals(rhs.admrCode))))&&((this.equivInd == rhs.equivInd)||((this.equivInd!= null)&&this.equivInd.equals(rhs.equivInd))))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.stvadmrDesc == rhs.stvadmrDesc)||((this.stvadmrDesc!= null)&&this.stvadmrDesc.equals(rhs.stvadmrDesc))))&&((this.rcrvInd == rhs.rcrvInd)||((this.rcrvInd!= null)&&this.rcrvInd.equals(rhs.rcrvInd))))&&((this.stvtescDesc == rhs.stvtescDesc)||((this.stvtescDesc!= null)&&this.stvtescDesc.equals(rhs.stvtescDesc))))&&((this.dispTestDate == rhs.dispTestDate)||((this.dispTestDate!= null)&&this.dispTestDate.equals(rhs.dispTestDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.testDate == rhs.testDate)||((this.testDate!= null)&&this.testDate.equals(rhs.testDate))));
    }

}
