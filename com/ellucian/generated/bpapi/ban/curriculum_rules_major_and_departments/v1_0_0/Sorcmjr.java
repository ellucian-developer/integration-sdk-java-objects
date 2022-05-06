
package com.ellucian.generated.bpapi.ban.curriculum_rules_major_and_departments.v1_0_0;

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
    "displayConc",
    "cmjrRule",
    "majorDisplay",
    "recInd",
    "admInd",
    "majrCode",
    "degrCde",
    "autoDecInd",
    "dauInd",
    "dispWebInd",
    "hisInd",
    "ediQlfr",
    "deptDisplay",
    "ediValue",
    "stuInd",
    "deptCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class Sorcmjr {

    /**
     * Concentration
     * <p>
     * 
     * 
     */
    @JsonProperty("displayConc")
    private String displayConc;
    /**
     * Major Rule
     * <p>
     * Lineage reference object : SORCMJR_CMJR_RULE
     * 
     */
    @JsonProperty("cmjrRule")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_CMJR_RULE")
    private Double cmjrRule;
    @JsonProperty("majorDisplay")
    private String majorDisplay;
    /**
     * Lineage reference object : SORCMJR_REC_IND
     * 
     */
    @JsonProperty("recInd")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_REC_IND")
    private String recInd;
    /**
     * Lineage reference object : SORCMJR_ADM_IND
     * 
     */
    @JsonProperty("admInd")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_ADM_IND")
    private String admInd;
    /**
     * Major
     * <p>
     * Lineage reference object : SORCMJR_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_MAJR_CODE, Lookup lineage reference object : stvmajr")
    private String majrCode;
    /**
     * EDI Degree
     * <p>
     * Lineage reference object : SORCMJR_DEGR_CDE, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("degrCde")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_DEGR_CDE, Lookup lineage reference object : sorxref")
    private String degrCde;
    /**
     * Lineage reference object : SORCMJR_AUTO_DEC_IND
     * 
     */
    @JsonProperty("autoDecInd")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_AUTO_DEC_IND")
    private String autoDecInd;
    /**
     * Lineage reference object : SORCMJR_DAU_IND
     * 
     */
    @JsonProperty("dauInd")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_DAU_IND")
    private String dauInd;
    /**
     * Lineage reference object : SORCMJR_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_DISP_WEB_IND")
    private String dispWebInd;
    /**
     * Lineage reference object : SORCMJR_HIS_IND
     * 
     */
    @JsonProperty("hisInd")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_HIS_IND")
    private String hisInd;
    /**
     * EDI Level
     * <p>
     * Lineage reference object : SORCMJR_EDI_QLFR, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediQlfr")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_EDI_QLFR, Lookup lineage reference object : sorxref")
    private String ediQlfr;
    @JsonProperty("deptDisplay")
    private String deptDisplay;
    /**
     * EDI Identification
     * <p>
     * Lineage reference object : SORCMJR_EDI_VALUE, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediValue")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_EDI_VALUE, Lookup lineage reference object : sorxref")
    private String ediValue;
    /**
     * Lineage reference object : SORCMJR_STU_IND
     * 
     */
    @JsonProperty("stuInd")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_STU_IND")
    private String stuInd;
    /**
     * Department
     * <p>
     * Lineage reference object : SORCMJR_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Self Service Description
     * <p>
     * Lineage reference object : SORCMJR_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SORCMJR_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Concentration
     * <p>
     * 
     * 
     */
    @JsonProperty("displayConc")
    public String getDisplayConc() {
        return displayConc;
    }

    /**
     * Concentration
     * <p>
     * 
     * 
     */
    @JsonProperty("displayConc")
    public void setDisplayConc(String displayConc) {
        this.displayConc = displayConc;
    }

    public Sorcmjr withDisplayConc(String displayConc) {
        this.displayConc = displayConc;
        return this;
    }

    /**
     * Major Rule
     * <p>
     * Lineage reference object : SORCMJR_CMJR_RULE
     * 
     */
    @JsonProperty("cmjrRule")
    public Double getCmjrRule() {
        return cmjrRule;
    }

    /**
     * Major Rule
     * <p>
     * Lineage reference object : SORCMJR_CMJR_RULE
     * 
     */
    @JsonProperty("cmjrRule")
    public void setCmjrRule(Double cmjrRule) {
        this.cmjrRule = cmjrRule;
    }

    public Sorcmjr withCmjrRule(Double cmjrRule) {
        this.cmjrRule = cmjrRule;
        return this;
    }

    @JsonProperty("majorDisplay")
    public String getMajorDisplay() {
        return majorDisplay;
    }

    @JsonProperty("majorDisplay")
    public void setMajorDisplay(String majorDisplay) {
        this.majorDisplay = majorDisplay;
    }

    public Sorcmjr withMajorDisplay(String majorDisplay) {
        this.majorDisplay = majorDisplay;
        return this;
    }

    /**
     * Lineage reference object : SORCMJR_REC_IND
     * 
     */
    @JsonProperty("recInd")
    public String getRecInd() {
        return recInd;
    }

    /**
     * Lineage reference object : SORCMJR_REC_IND
     * 
     */
    @JsonProperty("recInd")
    public void setRecInd(String recInd) {
        this.recInd = recInd;
    }

    public Sorcmjr withRecInd(String recInd) {
        this.recInd = recInd;
        return this;
    }

    /**
     * Lineage reference object : SORCMJR_ADM_IND
     * 
     */
    @JsonProperty("admInd")
    public String getAdmInd() {
        return admInd;
    }

    /**
     * Lineage reference object : SORCMJR_ADM_IND
     * 
     */
    @JsonProperty("admInd")
    public void setAdmInd(String admInd) {
        this.admInd = admInd;
    }

    public Sorcmjr withAdmInd(String admInd) {
        this.admInd = admInd;
        return this;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SORCMJR_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public String getMajrCode() {
        return majrCode;
    }

    /**
     * Major
     * <p>
     * Lineage reference object : SORCMJR_MAJR_CODE, Lookup lineage reference object : stvmajr
     * 
     */
    @JsonProperty("majrCode")
    public void setMajrCode(String majrCode) {
        this.majrCode = majrCode;
    }

    public Sorcmjr withMajrCode(String majrCode) {
        this.majrCode = majrCode;
        return this;
    }

    /**
     * EDI Degree
     * <p>
     * Lineage reference object : SORCMJR_DEGR_CDE, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("degrCde")
    public String getDegrCde() {
        return degrCde;
    }

    /**
     * EDI Degree
     * <p>
     * Lineage reference object : SORCMJR_DEGR_CDE, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("degrCde")
    public void setDegrCde(String degrCde) {
        this.degrCde = degrCde;
    }

    public Sorcmjr withDegrCde(String degrCde) {
        this.degrCde = degrCde;
        return this;
    }

    /**
     * Lineage reference object : SORCMJR_AUTO_DEC_IND
     * 
     */
    @JsonProperty("autoDecInd")
    public String getAutoDecInd() {
        return autoDecInd;
    }

    /**
     * Lineage reference object : SORCMJR_AUTO_DEC_IND
     * 
     */
    @JsonProperty("autoDecInd")
    public void setAutoDecInd(String autoDecInd) {
        this.autoDecInd = autoDecInd;
    }

    public Sorcmjr withAutoDecInd(String autoDecInd) {
        this.autoDecInd = autoDecInd;
        return this;
    }

    /**
     * Lineage reference object : SORCMJR_DAU_IND
     * 
     */
    @JsonProperty("dauInd")
    public String getDauInd() {
        return dauInd;
    }

    /**
     * Lineage reference object : SORCMJR_DAU_IND
     * 
     */
    @JsonProperty("dauInd")
    public void setDauInd(String dauInd) {
        this.dauInd = dauInd;
    }

    public Sorcmjr withDauInd(String dauInd) {
        this.dauInd = dauInd;
        return this;
    }

    /**
     * Lineage reference object : SORCMJR_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public String getDispWebInd() {
        return dispWebInd;
    }

    /**
     * Lineage reference object : SORCMJR_DISP_WEB_IND
     * 
     */
    @JsonProperty("dispWebInd")
    public void setDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
    }

    public Sorcmjr withDispWebInd(String dispWebInd) {
        this.dispWebInd = dispWebInd;
        return this;
    }

    /**
     * Lineage reference object : SORCMJR_HIS_IND
     * 
     */
    @JsonProperty("hisInd")
    public String getHisInd() {
        return hisInd;
    }

    /**
     * Lineage reference object : SORCMJR_HIS_IND
     * 
     */
    @JsonProperty("hisInd")
    public void setHisInd(String hisInd) {
        this.hisInd = hisInd;
    }

    public Sorcmjr withHisInd(String hisInd) {
        this.hisInd = hisInd;
        return this;
    }

    /**
     * EDI Level
     * <p>
     * Lineage reference object : SORCMJR_EDI_QLFR, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediQlfr")
    public String getEdiQlfr() {
        return ediQlfr;
    }

    /**
     * EDI Level
     * <p>
     * Lineage reference object : SORCMJR_EDI_QLFR, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediQlfr")
    public void setEdiQlfr(String ediQlfr) {
        this.ediQlfr = ediQlfr;
    }

    public Sorcmjr withEdiQlfr(String ediQlfr) {
        this.ediQlfr = ediQlfr;
        return this;
    }

    @JsonProperty("deptDisplay")
    public String getDeptDisplay() {
        return deptDisplay;
    }

    @JsonProperty("deptDisplay")
    public void setDeptDisplay(String deptDisplay) {
        this.deptDisplay = deptDisplay;
    }

    public Sorcmjr withDeptDisplay(String deptDisplay) {
        this.deptDisplay = deptDisplay;
        return this;
    }

    /**
     * EDI Identification
     * <p>
     * Lineage reference object : SORCMJR_EDI_VALUE, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediValue")
    public String getEdiValue() {
        return ediValue;
    }

    /**
     * EDI Identification
     * <p>
     * Lineage reference object : SORCMJR_EDI_VALUE, Lookup lineage reference object : sorxref
     * 
     */
    @JsonProperty("ediValue")
    public void setEdiValue(String ediValue) {
        this.ediValue = ediValue;
    }

    public Sorcmjr withEdiValue(String ediValue) {
        this.ediValue = ediValue;
        return this;
    }

    /**
     * Lineage reference object : SORCMJR_STU_IND
     * 
     */
    @JsonProperty("stuInd")
    public String getStuInd() {
        return stuInd;
    }

    /**
     * Lineage reference object : SORCMJR_STU_IND
     * 
     */
    @JsonProperty("stuInd")
    public void setStuInd(String stuInd) {
        this.stuInd = stuInd;
    }

    public Sorcmjr withStuInd(String stuInd) {
        this.stuInd = stuInd;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SORCMJR_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SORCMJR_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Sorcmjr withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Self Service Description
     * <p>
     * Lineage reference object : SORCMJR_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Self Service Description
     * <p>
     * Lineage reference object : SORCMJR_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Sorcmjr withDesc(String desc) {
        this.desc = desc;
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

    public Sorcmjr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sorcmjr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayConc");
        sb.append('=');
        sb.append(((this.displayConc == null)?"<null>":this.displayConc));
        sb.append(',');
        sb.append("cmjrRule");
        sb.append('=');
        sb.append(((this.cmjrRule == null)?"<null>":this.cmjrRule));
        sb.append(',');
        sb.append("majorDisplay");
        sb.append('=');
        sb.append(((this.majorDisplay == null)?"<null>":this.majorDisplay));
        sb.append(',');
        sb.append("recInd");
        sb.append('=');
        sb.append(((this.recInd == null)?"<null>":this.recInd));
        sb.append(',');
        sb.append("admInd");
        sb.append('=');
        sb.append(((this.admInd == null)?"<null>":this.admInd));
        sb.append(',');
        sb.append("majrCode");
        sb.append('=');
        sb.append(((this.majrCode == null)?"<null>":this.majrCode));
        sb.append(',');
        sb.append("degrCde");
        sb.append('=');
        sb.append(((this.degrCde == null)?"<null>":this.degrCde));
        sb.append(',');
        sb.append("autoDecInd");
        sb.append('=');
        sb.append(((this.autoDecInd == null)?"<null>":this.autoDecInd));
        sb.append(',');
        sb.append("dauInd");
        sb.append('=');
        sb.append(((this.dauInd == null)?"<null>":this.dauInd));
        sb.append(',');
        sb.append("dispWebInd");
        sb.append('=');
        sb.append(((this.dispWebInd == null)?"<null>":this.dispWebInd));
        sb.append(',');
        sb.append("hisInd");
        sb.append('=');
        sb.append(((this.hisInd == null)?"<null>":this.hisInd));
        sb.append(',');
        sb.append("ediQlfr");
        sb.append('=');
        sb.append(((this.ediQlfr == null)?"<null>":this.ediQlfr));
        sb.append(',');
        sb.append("deptDisplay");
        sb.append('=');
        sb.append(((this.deptDisplay == null)?"<null>":this.deptDisplay));
        sb.append(',');
        sb.append("ediValue");
        sb.append('=');
        sb.append(((this.ediValue == null)?"<null>":this.ediValue));
        sb.append(',');
        sb.append("stuInd");
        sb.append('=');
        sb.append(((this.stuInd == null)?"<null>":this.stuInd));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
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
        result = ((result* 31)+((this.displayConc == null)? 0 :this.displayConc.hashCode()));
        result = ((result* 31)+((this.cmjrRule == null)? 0 :this.cmjrRule.hashCode()));
        result = ((result* 31)+((this.majorDisplay == null)? 0 :this.majorDisplay.hashCode()));
        result = ((result* 31)+((this.recInd == null)? 0 :this.recInd.hashCode()));
        result = ((result* 31)+((this.admInd == null)? 0 :this.admInd.hashCode()));
        result = ((result* 31)+((this.majrCode == null)? 0 :this.majrCode.hashCode()));
        result = ((result* 31)+((this.degrCde == null)? 0 :this.degrCde.hashCode()));
        result = ((result* 31)+((this.autoDecInd == null)? 0 :this.autoDecInd.hashCode()));
        result = ((result* 31)+((this.dauInd == null)? 0 :this.dauInd.hashCode()));
        result = ((result* 31)+((this.dispWebInd == null)? 0 :this.dispWebInd.hashCode()));
        result = ((result* 31)+((this.hisInd == null)? 0 :this.hisInd.hashCode()));
        result = ((result* 31)+((this.ediQlfr == null)? 0 :this.ediQlfr.hashCode()));
        result = ((result* 31)+((this.deptDisplay == null)? 0 :this.deptDisplay.hashCode()));
        result = ((result* 31)+((this.ediValue == null)? 0 :this.ediValue.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.stuInd == null)? 0 :this.stuInd.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sorcmjr) == false) {
            return false;
        }
        Sorcmjr rhs = ((Sorcmjr) other);
        return (((((((((((((((((((this.displayConc == rhs.displayConc)||((this.displayConc!= null)&&this.displayConc.equals(rhs.displayConc)))&&((this.cmjrRule == rhs.cmjrRule)||((this.cmjrRule!= null)&&this.cmjrRule.equals(rhs.cmjrRule))))&&((this.majorDisplay == rhs.majorDisplay)||((this.majorDisplay!= null)&&this.majorDisplay.equals(rhs.majorDisplay))))&&((this.recInd == rhs.recInd)||((this.recInd!= null)&&this.recInd.equals(rhs.recInd))))&&((this.admInd == rhs.admInd)||((this.admInd!= null)&&this.admInd.equals(rhs.admInd))))&&((this.majrCode == rhs.majrCode)||((this.majrCode!= null)&&this.majrCode.equals(rhs.majrCode))))&&((this.degrCde == rhs.degrCde)||((this.degrCde!= null)&&this.degrCde.equals(rhs.degrCde))))&&((this.autoDecInd == rhs.autoDecInd)||((this.autoDecInd!= null)&&this.autoDecInd.equals(rhs.autoDecInd))))&&((this.dauInd == rhs.dauInd)||((this.dauInd!= null)&&this.dauInd.equals(rhs.dauInd))))&&((this.dispWebInd == rhs.dispWebInd)||((this.dispWebInd!= null)&&this.dispWebInd.equals(rhs.dispWebInd))))&&((this.hisInd == rhs.hisInd)||((this.hisInd!= null)&&this.hisInd.equals(rhs.hisInd))))&&((this.ediQlfr == rhs.ediQlfr)||((this.ediQlfr!= null)&&this.ediQlfr.equals(rhs.ediQlfr))))&&((this.deptDisplay == rhs.deptDisplay)||((this.deptDisplay!= null)&&this.deptDisplay.equals(rhs.deptDisplay))))&&((this.ediValue == rhs.ediValue)||((this.ediValue!= null)&&this.ediValue.equals(rhs.ediValue))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.stuInd == rhs.stuInd)||((this.stuInd!= null)&&this.stuInd.equals(rhs.stuInd))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
