
package com.ellucian.generated.bpapi.ban.general_information_high_school.v1_0_0;

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
    "dplmCode",
    "classSize",
    "collPrepInd",
    "percentile",
    "graduationDate",
    "stvsbgiDesc",
    "gpa",
    "stvdplmDesc",
    "sbgiCode",
    "classRank",
    "transRecvDate"
})
@Generated("jsonschema2pojo")
public class GeneralInformationHighSchool100GetResponse {

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("dplmCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm")
    private String dplmCode;
    /**
     * High School Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("classSize")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_CLASS_SIZE")
    private Double classSize;
    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("collPrepInd")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_COLL_PREP_IND")
    private String collPrepInd;
    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_PERCENTILE")
    private Double percentile;
    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("graduationDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GRADUATION_DATE")
    private Date graduationDate;
    @JsonProperty("stvsbgiDesc")
    private String stvsbgiDesc;
    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("gpa")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_GPA")
    private String gpa;
    @JsonProperty("stvdplmDesc")
    private String stvdplmDesc;
    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_SBGI_CODE")
    private String sbgiCode;
    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("classRank")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_CLASS_RANK")
    private Double classRank;
    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    @JsonPropertyDescription("Lineage reference object : SORHSCH_TRANS_RECV_DATE")
    private Date transRecvDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("dplmCode")
    public String getDplmCode() {
        return dplmCode;
    }

    /**
     * Diploma
     * <p>
     * Lineage reference object : SORHSCH_DPLM_CODE, Lookup lineage reference object : stvdplm
     * 
     */
    @JsonProperty("dplmCode")
    public void setDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
    }

    public GeneralInformationHighSchool100GetResponse withDplmCode(String dplmCode) {
        this.dplmCode = dplmCode;
        return this;
    }

    /**
     * High School Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("classSize")
    public Double getClassSize() {
        return classSize;
    }

    /**
     * High School Class Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_SIZE
     * 
     */
    @JsonProperty("classSize")
    public void setClassSize(Double classSize) {
        this.classSize = classSize;
    }

    public GeneralInformationHighSchool100GetResponse withClassSize(Double classSize) {
        this.classSize = classSize;
        return this;
    }

    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("collPrepInd")
    public String getCollPrepInd() {
        return collPrepInd;
    }

    /**
     * College Preparation
     * <p>
     * Lineage reference object : SORHSCH_COLL_PREP_IND
     * 
     */
    @JsonProperty("collPrepInd")
    public void setCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
    }

    public GeneralInformationHighSchool100GetResponse withCollPrepInd(String collPrepInd) {
        this.collPrepInd = collPrepInd;
        return this;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    public Double getPercentile() {
        return percentile;
    }

    /**
     * Percentile
     * <p>
     * Lineage reference object : SORHSCH_PERCENTILE
     * 
     */
    @JsonProperty("percentile")
    public void setPercentile(Double percentile) {
        this.percentile = percentile;
    }

    public GeneralInformationHighSchool100GetResponse withPercentile(Double percentile) {
        this.percentile = percentile;
        return this;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("graduationDate")
    public Date getGraduationDate() {
        return graduationDate;
    }

    /**
     * Graduation Date
     * <p>
     * Lineage reference object : SORHSCH_GRADUATION_DATE
     * 
     */
    @JsonProperty("graduationDate")
    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public GeneralInformationHighSchool100GetResponse withGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
        return this;
    }

    @JsonProperty("stvsbgiDesc")
    public String getStvsbgiDesc() {
        return stvsbgiDesc;
    }

    @JsonProperty("stvsbgiDesc")
    public void setStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
    }

    public GeneralInformationHighSchool100GetResponse withStvsbgiDesc(String stvsbgiDesc) {
        this.stvsbgiDesc = stvsbgiDesc;
        return this;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("gpa")
    public String getGpa() {
        return gpa;
    }

    /**
     * GPA
     * <p>
     * Lineage reference object : SORHSCH_GPA
     * 
     */
    @JsonProperty("gpa")
    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public GeneralInformationHighSchool100GetResponse withGpa(String gpa) {
        this.gpa = gpa;
        return this;
    }

    @JsonProperty("stvdplmDesc")
    public String getStvdplmDesc() {
        return stvdplmDesc;
    }

    @JsonProperty("stvdplmDesc")
    public void setStvdplmDesc(String stvdplmDesc) {
        this.stvdplmDesc = stvdplmDesc;
    }

    public GeneralInformationHighSchool100GetResponse withStvdplmDesc(String stvdplmDesc) {
        this.stvdplmDesc = stvdplmDesc;
        return this;
    }

    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    public String getSbgiCode() {
        return sbgiCode;
    }

    /**
     * High School
     * <p>
     * Lineage reference object : SORHSCH_SBGI_CODE
     * (Required)
     * 
     */
    @JsonProperty("sbgiCode")
    public void setSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
    }

    public GeneralInformationHighSchool100GetResponse withSbgiCode(String sbgiCode) {
        this.sbgiCode = sbgiCode;
        return this;
    }

    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("classRank")
    public Double getClassRank() {
        return classRank;
    }

    /**
     * Class Rank and Size
     * <p>
     * Lineage reference object : SORHSCH_CLASS_RANK
     * 
     */
    @JsonProperty("classRank")
    public void setClassRank(Double classRank) {
        this.classRank = classRank;
    }

    public GeneralInformationHighSchool100GetResponse withClassRank(Double classRank) {
        this.classRank = classRank;
        return this;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public Date getTransRecvDate() {
        return transRecvDate;
    }

    /**
     * Transcript Received Date
     * <p>
     * Lineage reference object : SORHSCH_TRANS_RECV_DATE
     * 
     */
    @JsonProperty("transRecvDate")
    public void setTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
    }

    public GeneralInformationHighSchool100GetResponse withTransRecvDate(Date transRecvDate) {
        this.transRecvDate = transRecvDate;
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

    public GeneralInformationHighSchool100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralInformationHighSchool100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dplmCode");
        sb.append('=');
        sb.append(((this.dplmCode == null)?"<null>":this.dplmCode));
        sb.append(',');
        sb.append("classSize");
        sb.append('=');
        sb.append(((this.classSize == null)?"<null>":this.classSize));
        sb.append(',');
        sb.append("collPrepInd");
        sb.append('=');
        sb.append(((this.collPrepInd == null)?"<null>":this.collPrepInd));
        sb.append(',');
        sb.append("percentile");
        sb.append('=');
        sb.append(((this.percentile == null)?"<null>":this.percentile));
        sb.append(',');
        sb.append("graduationDate");
        sb.append('=');
        sb.append(((this.graduationDate == null)?"<null>":this.graduationDate));
        sb.append(',');
        sb.append("stvsbgiDesc");
        sb.append('=');
        sb.append(((this.stvsbgiDesc == null)?"<null>":this.stvsbgiDesc));
        sb.append(',');
        sb.append("gpa");
        sb.append('=');
        sb.append(((this.gpa == null)?"<null>":this.gpa));
        sb.append(',');
        sb.append("stvdplmDesc");
        sb.append('=');
        sb.append(((this.stvdplmDesc == null)?"<null>":this.stvdplmDesc));
        sb.append(',');
        sb.append("sbgiCode");
        sb.append('=');
        sb.append(((this.sbgiCode == null)?"<null>":this.sbgiCode));
        sb.append(',');
        sb.append("classRank");
        sb.append('=');
        sb.append(((this.classRank == null)?"<null>":this.classRank));
        sb.append(',');
        sb.append("transRecvDate");
        sb.append('=');
        sb.append(((this.transRecvDate == null)?"<null>":this.transRecvDate));
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
        result = ((result* 31)+((this.dplmCode == null)? 0 :this.dplmCode.hashCode()));
        result = ((result* 31)+((this.collPrepInd == null)? 0 :this.collPrepInd.hashCode()));
        result = ((result* 31)+((this.sbgiCode == null)? 0 :this.sbgiCode.hashCode()));
        result = ((result* 31)+((this.classRank == null)? 0 :this.classRank.hashCode()));
        result = ((result* 31)+((this.transRecvDate == null)? 0 :this.transRecvDate.hashCode()));
        result = ((result* 31)+((this.classSize == null)? 0 :this.classSize.hashCode()));
        result = ((result* 31)+((this.percentile == null)? 0 :this.percentile.hashCode()));
        result = ((result* 31)+((this.graduationDate == null)? 0 :this.graduationDate.hashCode()));
        result = ((result* 31)+((this.stvsbgiDesc == null)? 0 :this.stvsbgiDesc.hashCode()));
        result = ((result* 31)+((this.gpa == null)? 0 :this.gpa.hashCode()));
        result = ((result* 31)+((this.stvdplmDesc == null)? 0 :this.stvdplmDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralInformationHighSchool100GetResponse) == false) {
            return false;
        }
        GeneralInformationHighSchool100GetResponse rhs = ((GeneralInformationHighSchool100GetResponse) other);
        return (((((((((((((this.dplmCode == rhs.dplmCode)||((this.dplmCode!= null)&&this.dplmCode.equals(rhs.dplmCode)))&&((this.collPrepInd == rhs.collPrepInd)||((this.collPrepInd!= null)&&this.collPrepInd.equals(rhs.collPrepInd))))&&((this.sbgiCode == rhs.sbgiCode)||((this.sbgiCode!= null)&&this.sbgiCode.equals(rhs.sbgiCode))))&&((this.classRank == rhs.classRank)||((this.classRank!= null)&&this.classRank.equals(rhs.classRank))))&&((this.transRecvDate == rhs.transRecvDate)||((this.transRecvDate!= null)&&this.transRecvDate.equals(rhs.transRecvDate))))&&((this.classSize == rhs.classSize)||((this.classSize!= null)&&this.classSize.equals(rhs.classSize))))&&((this.percentile == rhs.percentile)||((this.percentile!= null)&&this.percentile.equals(rhs.percentile))))&&((this.graduationDate == rhs.graduationDate)||((this.graduationDate!= null)&&this.graduationDate.equals(rhs.graduationDate))))&&((this.stvsbgiDesc == rhs.stvsbgiDesc)||((this.stvsbgiDesc!= null)&&this.stvsbgiDesc.equals(rhs.stvsbgiDesc))))&&((this.gpa == rhs.gpa)||((this.gpa!= null)&&this.gpa.equals(rhs.gpa))))&&((this.stvdplmDesc == rhs.stvdplmDesc)||((this.stvdplmDesc!= null)&&this.stvdplmDesc.equals(rhs.stvdplmDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
