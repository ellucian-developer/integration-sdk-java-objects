
package com.ellucian.generated.bpapi.ban.test_score_administration_type_learner_types.v1_0_0;

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
    "sgbstdnSiteCode",
    "sgbstdnResdCode",
    "sgbstdnBlckCode",
    "sgbstdnStstCode",
    "sgbstdnStypCode",
    "id",
    "stvtermTermCode",
    "sgbstdnSessCode",
    "sgbstdnScpcCode",
    "sgbstdnRateCode",
    "fullPartInd"
})
@Generated("jsonschema2pojo")
public class TestScoreAdministrationTypeLearnerTypes100PutRequest {

    /**
     * Site
     * <p>
     * Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("sgbstdnSiteCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite")
    private String sgbstdnSiteCode;
    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("sgbstdnResdCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd")
    private String sgbstdnResdCode;
    /**
     * Block
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("sgbstdnBlckCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck")
    private String sgbstdnBlckCode;
    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("sgbstdnStstCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst")
    private String sgbstdnStstCode;
    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("sgbstdnStypCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp")
    private String sgbstdnStypCode;
    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Lineage reference object : id")
    private Object id;
    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    @JsonPropertyDescription("Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm")
    private Object stvtermTermCode;
    /**
     * Session
     * <p>
     * Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sgbstdnSessCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess")
    private String sgbstdnSessCode;
    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("sgbstdnScpcCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt")
    private String sgbstdnScpcCode;
    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("sgbstdnRateCode")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate")
    private String sgbstdnRateCode;
    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    @JsonPropertyDescription("Lineage reference object : SGBSTDN_FULL_PART_IND")
    private String fullPartInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Site
     * <p>
     * Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("sgbstdnSiteCode")
    public String getSgbstdnSiteCode() {
        return sgbstdnSiteCode;
    }

    /**
     * Site
     * <p>
     * Lineage reference object : SGBSTDN_SITE_CODE, Lookup lineage reference object : stvsite
     * 
     */
    @JsonProperty("sgbstdnSiteCode")
    public void setSgbstdnSiteCode(String sgbstdnSiteCode) {
        this.sgbstdnSiteCode = sgbstdnSiteCode;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withSgbstdnSiteCode(String sgbstdnSiteCode) {
        this.sgbstdnSiteCode = sgbstdnSiteCode;
        return this;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("sgbstdnResdCode")
    public String getSgbstdnResdCode() {
        return sgbstdnResdCode;
    }

    /**
     * Residence
     * <p>
     * Lineage reference object : SGBSTDN_RESD_CODE, Lookup lineage reference object : stvresd
     * 
     */
    @JsonProperty("sgbstdnResdCode")
    public void setSgbstdnResdCode(String sgbstdnResdCode) {
        this.sgbstdnResdCode = sgbstdnResdCode;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withSgbstdnResdCode(String sgbstdnResdCode) {
        this.sgbstdnResdCode = sgbstdnResdCode;
        return this;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("sgbstdnBlckCode")
    public String getSgbstdnBlckCode() {
        return sgbstdnBlckCode;
    }

    /**
     * Block
     * <p>
     * Lineage reference object : SGBSTDN_BLCK_CODE, Lookup lineage reference object : stvblck
     * 
     */
    @JsonProperty("sgbstdnBlckCode")
    public void setSgbstdnBlckCode(String sgbstdnBlckCode) {
        this.sgbstdnBlckCode = sgbstdnBlckCode;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withSgbstdnBlckCode(String sgbstdnBlckCode) {
        this.sgbstdnBlckCode = sgbstdnBlckCode;
        return this;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("sgbstdnStstCode")
    public String getSgbstdnStstCode() {
        return sgbstdnStstCode;
    }

    /**
     * Student Status
     * <p>
     * Lineage reference object : SGBSTDN_STST_CODE, Lookup lineage reference object : stvstst
     * 
     */
    @JsonProperty("sgbstdnStstCode")
    public void setSgbstdnStstCode(String sgbstdnStstCode) {
        this.sgbstdnStstCode = sgbstdnStstCode;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withSgbstdnStstCode(String sgbstdnStstCode) {
        this.sgbstdnStstCode = sgbstdnStstCode;
        return this;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("sgbstdnStypCode")
    public String getSgbstdnStypCode() {
        return sgbstdnStypCode;
    }

    /**
     * Student Type
     * <p>
     * Lineage reference object : SGBSTDN_STYP_CODE, Lookup lineage reference object : stvstyp
     * 
     */
    @JsonProperty("sgbstdnStypCode")
    public void setSgbstdnStypCode(String sgbstdnStypCode) {
        this.sgbstdnStypCode = sgbstdnStypCode;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withSgbstdnStypCode(String sgbstdnStypCode) {
        this.sgbstdnStypCode = sgbstdnStypCode;
        return this;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public Object getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * Lineage reference object : id
     * 
     */
    @JsonProperty("id")
    public void setId(Object id) {
        this.id = id;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public Object getStvtermTermCode() {
        return stvtermTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public void setStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
        return this;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sgbstdnSessCode")
    public String getSgbstdnSessCode() {
        return sgbstdnSessCode;
    }

    /**
     * Session
     * <p>
     * Lineage reference object : SGBSTDN_SESS_CODE, Lookup lineage reference object : stvsess
     * 
     */
    @JsonProperty("sgbstdnSessCode")
    public void setSgbstdnSessCode(String sgbstdnSessCode) {
        this.sgbstdnSessCode = sgbstdnSessCode;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withSgbstdnSessCode(String sgbstdnSessCode) {
        this.sgbstdnSessCode = sgbstdnSessCode;
        return this;
    }

    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("sgbstdnScpcCode")
    public String getSgbstdnScpcCode() {
        return sgbstdnScpcCode;
    }

    /**
     * Student Centric Cycle
     * <p>
     * Lineage reference object : SGBSTDN_SCPC_CODE, Lookup lineage reference object : stvscpc,sobscps,sorscpt
     * 
     */
    @JsonProperty("sgbstdnScpcCode")
    public void setSgbstdnScpcCode(String sgbstdnScpcCode) {
        this.sgbstdnScpcCode = sgbstdnScpcCode;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withSgbstdnScpcCode(String sgbstdnScpcCode) {
        this.sgbstdnScpcCode = sgbstdnScpcCode;
        return this;
    }

    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("sgbstdnRateCode")
    public String getSgbstdnRateCode() {
        return sgbstdnRateCode;
    }

    /**
     * Fee Assessment Rate
     * <p>
     * Lineage reference object : SGBSTDN_RATE_CODE, Lookup lineage reference object : stvrate
     * 
     */
    @JsonProperty("sgbstdnRateCode")
    public void setSgbstdnRateCode(String sgbstdnRateCode) {
        this.sgbstdnRateCode = sgbstdnRateCode;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withSgbstdnRateCode(String sgbstdnRateCode) {
        this.sgbstdnRateCode = sgbstdnRateCode;
        return this;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public String getFullPartInd() {
        return fullPartInd;
    }

    /**
     * Full or Part Time
     * <p>
     * Lineage reference object : SGBSTDN_FULL_PART_IND
     * 
     */
    @JsonProperty("fullPartInd")
    public void setFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
    }

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withFullPartInd(String fullPartInd) {
        this.fullPartInd = fullPartInd;
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

    public TestScoreAdministrationTypeLearnerTypes100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestScoreAdministrationTypeLearnerTypes100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sgbstdnSiteCode");
        sb.append('=');
        sb.append(((this.sgbstdnSiteCode == null)?"<null>":this.sgbstdnSiteCode));
        sb.append(',');
        sb.append("sgbstdnResdCode");
        sb.append('=');
        sb.append(((this.sgbstdnResdCode == null)?"<null>":this.sgbstdnResdCode));
        sb.append(',');
        sb.append("sgbstdnBlckCode");
        sb.append('=');
        sb.append(((this.sgbstdnBlckCode == null)?"<null>":this.sgbstdnBlckCode));
        sb.append(',');
        sb.append("sgbstdnStstCode");
        sb.append('=');
        sb.append(((this.sgbstdnStstCode == null)?"<null>":this.sgbstdnStstCode));
        sb.append(',');
        sb.append("sgbstdnStypCode");
        sb.append('=');
        sb.append(((this.sgbstdnStypCode == null)?"<null>":this.sgbstdnStypCode));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("stvtermTermCode");
        sb.append('=');
        sb.append(((this.stvtermTermCode == null)?"<null>":this.stvtermTermCode));
        sb.append(',');
        sb.append("sgbstdnSessCode");
        sb.append('=');
        sb.append(((this.sgbstdnSessCode == null)?"<null>":this.sgbstdnSessCode));
        sb.append(',');
        sb.append("sgbstdnScpcCode");
        sb.append('=');
        sb.append(((this.sgbstdnScpcCode == null)?"<null>":this.sgbstdnScpcCode));
        sb.append(',');
        sb.append("sgbstdnRateCode");
        sb.append('=');
        sb.append(((this.sgbstdnRateCode == null)?"<null>":this.sgbstdnRateCode));
        sb.append(',');
        sb.append("fullPartInd");
        sb.append('=');
        sb.append(((this.fullPartInd == null)?"<null>":this.fullPartInd));
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
        result = ((result* 31)+((this.sgbstdnSiteCode == null)? 0 :this.sgbstdnSiteCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnResdCode == null)? 0 :this.sgbstdnResdCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnBlckCode == null)? 0 :this.sgbstdnBlckCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnStypCode == null)? 0 :this.sgbstdnStypCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnStstCode == null)? 0 :this.sgbstdnStstCode.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stvtermTermCode == null)? 0 :this.stvtermTermCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnSessCode == null)? 0 :this.sgbstdnSessCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnScpcCode == null)? 0 :this.sgbstdnScpcCode.hashCode()));
        result = ((result* 31)+((this.sgbstdnRateCode == null)? 0 :this.sgbstdnRateCode.hashCode()));
        result = ((result* 31)+((this.fullPartInd == null)? 0 :this.fullPartInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestScoreAdministrationTypeLearnerTypes100PutRequest) == false) {
            return false;
        }
        TestScoreAdministrationTypeLearnerTypes100PutRequest rhs = ((TestScoreAdministrationTypeLearnerTypes100PutRequest) other);
        return (((((((((((((this.sgbstdnSiteCode == rhs.sgbstdnSiteCode)||((this.sgbstdnSiteCode!= null)&&this.sgbstdnSiteCode.equals(rhs.sgbstdnSiteCode)))&&((this.sgbstdnResdCode == rhs.sgbstdnResdCode)||((this.sgbstdnResdCode!= null)&&this.sgbstdnResdCode.equals(rhs.sgbstdnResdCode))))&&((this.sgbstdnBlckCode == rhs.sgbstdnBlckCode)||((this.sgbstdnBlckCode!= null)&&this.sgbstdnBlckCode.equals(rhs.sgbstdnBlckCode))))&&((this.sgbstdnStypCode == rhs.sgbstdnStypCode)||((this.sgbstdnStypCode!= null)&&this.sgbstdnStypCode.equals(rhs.sgbstdnStypCode))))&&((this.sgbstdnStstCode == rhs.sgbstdnStstCode)||((this.sgbstdnStstCode!= null)&&this.sgbstdnStstCode.equals(rhs.sgbstdnStstCode))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))))&&((this.sgbstdnSessCode == rhs.sgbstdnSessCode)||((this.sgbstdnSessCode!= null)&&this.sgbstdnSessCode.equals(rhs.sgbstdnSessCode))))&&((this.sgbstdnScpcCode == rhs.sgbstdnScpcCode)||((this.sgbstdnScpcCode!= null)&&this.sgbstdnScpcCode.equals(rhs.sgbstdnScpcCode))))&&((this.sgbstdnRateCode == rhs.sgbstdnRateCode)||((this.sgbstdnRateCode!= null)&&this.sgbstdnRateCode.equals(rhs.sgbstdnRateCode))))&&((this.fullPartInd == rhs.fullPartInd)||((this.fullPartInd!= null)&&this.fullPartInd.equals(rhs.fullPartInd))));
    }

}
