
package com.ellucian.generated.bpapi.ban.admissions_decision_test_score_review.v1_0_0;

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
    "tescCode",
    "testScore",
    "tadmCode",
    "stvtescDesc",
    "tsrcCode",
    "testDate"
})
@Generated("jsonschema2pojo")
public class Sortest {

    /**
     * Test
     * <p>
     * Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc")
    private String tescCode;
    /**
     * Score
     * <p>
     * Lineage reference object : SORTEST_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEST_SCORE")
    private String testScore;
    /**
     * Administrative Type
     * <p>
     * Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm
     * 
     */
    @JsonProperty("tadmCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm")
    private String tadmCode;
    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtescDesc")
    private String stvtescDesc;
    /**
     * Source
     * <p>
     * Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("tsrcCode")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc")
    private String tsrcCode;
    /**
     * Test Date
     * <p>
     * Lineage reference object : SORTEST_TEST_DATE
     * 
     */
    @JsonProperty("testDate")
    @JsonPropertyDescription("Lineage reference object : SORTEST_TEST_DATE")
    private Date testDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Test
     * <p>
     * Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public String getTescCode() {
        return tescCode;
    }

    /**
     * Test
     * <p>
     * Lineage reference object : SORTEST_TESC_CODE, Lookup lineage reference object : stvtesc
     * 
     */
    @JsonProperty("tescCode")
    public void setTescCode(String tescCode) {
        this.tescCode = tescCode;
    }

    public Sortest withTescCode(String tescCode) {
        this.tescCode = tescCode;
        return this;
    }

    /**
     * Score
     * <p>
     * Lineage reference object : SORTEST_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    public String getTestScore() {
        return testScore;
    }

    /**
     * Score
     * <p>
     * Lineage reference object : SORTEST_TEST_SCORE
     * 
     */
    @JsonProperty("testScore")
    public void setTestScore(String testScore) {
        this.testScore = testScore;
    }

    public Sortest withTestScore(String testScore) {
        this.testScore = testScore;
        return this;
    }

    /**
     * Administrative Type
     * <p>
     * Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm
     * 
     */
    @JsonProperty("tadmCode")
    public String getTadmCode() {
        return tadmCode;
    }

    /**
     * Administrative Type
     * <p>
     * Lineage reference object : SORTEST_TADM_CODE, Lookup lineage reference object : stvtadm
     * 
     */
    @JsonProperty("tadmCode")
    public void setTadmCode(String tadmCode) {
        this.tadmCode = tadmCode;
    }

    public Sortest withTadmCode(String tadmCode) {
        this.tadmCode = tadmCode;
        return this;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtescDesc")
    public String getStvtescDesc() {
        return stvtescDesc;
    }

    /**
     * Description
     * <p>
     * 
     * 
     */
    @JsonProperty("stvtescDesc")
    public void setStvtescDesc(String stvtescDesc) {
        this.stvtescDesc = stvtescDesc;
    }

    public Sortest withStvtescDesc(String stvtescDesc) {
        this.stvtescDesc = stvtescDesc;
        return this;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("tsrcCode")
    public String getTsrcCode() {
        return tsrcCode;
    }

    /**
     * Source
     * <p>
     * Lineage reference object : SORTEST_TSRC_CODE, Lookup lineage reference object : stvtsrc
     * 
     */
    @JsonProperty("tsrcCode")
    public void setTsrcCode(String tsrcCode) {
        this.tsrcCode = tsrcCode;
    }

    public Sortest withTsrcCode(String tsrcCode) {
        this.tsrcCode = tsrcCode;
        return this;
    }

    /**
     * Test Date
     * <p>
     * Lineage reference object : SORTEST_TEST_DATE
     * 
     */
    @JsonProperty("testDate")
    public Date getTestDate() {
        return testDate;
    }

    /**
     * Test Date
     * <p>
     * Lineage reference object : SORTEST_TEST_DATE
     * 
     */
    @JsonProperty("testDate")
    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public Sortest withTestDate(Date testDate) {
        this.testDate = testDate;
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

    public Sortest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sortest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tescCode");
        sb.append('=');
        sb.append(((this.tescCode == null)?"<null>":this.tescCode));
        sb.append(',');
        sb.append("testScore");
        sb.append('=');
        sb.append(((this.testScore == null)?"<null>":this.testScore));
        sb.append(',');
        sb.append("tadmCode");
        sb.append('=');
        sb.append(((this.tadmCode == null)?"<null>":this.tadmCode));
        sb.append(',');
        sb.append("stvtescDesc");
        sb.append('=');
        sb.append(((this.stvtescDesc == null)?"<null>":this.stvtescDesc));
        sb.append(',');
        sb.append("tsrcCode");
        sb.append('=');
        sb.append(((this.tsrcCode == null)?"<null>":this.tsrcCode));
        sb.append(',');
        sb.append("testDate");
        sb.append('=');
        sb.append(((this.testDate == null)?"<null>":this.testDate));
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
        result = ((result* 31)+((this.testScore == null)? 0 :this.testScore.hashCode()));
        result = ((result* 31)+((this.tadmCode == null)? 0 :this.tadmCode.hashCode()));
        result = ((result* 31)+((this.stvtescDesc == null)? 0 :this.stvtescDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.tsrcCode == null)? 0 :this.tsrcCode.hashCode()));
        result = ((result* 31)+((this.testDate == null)? 0 :this.testDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sortest) == false) {
            return false;
        }
        Sortest rhs = ((Sortest) other);
        return ((((((((this.tescCode == rhs.tescCode)||((this.tescCode!= null)&&this.tescCode.equals(rhs.tescCode)))&&((this.testScore == rhs.testScore)||((this.testScore!= null)&&this.testScore.equals(rhs.testScore))))&&((this.tadmCode == rhs.tadmCode)||((this.tadmCode!= null)&&this.tadmCode.equals(rhs.tadmCode))))&&((this.stvtescDesc == rhs.stvtescDesc)||((this.stvtescDesc!= null)&&this.stvtescDesc.equals(rhs.stvtescDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.tsrcCode == rhs.tsrcCode)||((this.tsrcCode!= null)&&this.tsrcCode.equals(rhs.tsrcCode))))&&((this.testDate == rhs.testDate)||((this.testDate!= null)&&this.testDate.equals(rhs.testDate))));
    }

}
