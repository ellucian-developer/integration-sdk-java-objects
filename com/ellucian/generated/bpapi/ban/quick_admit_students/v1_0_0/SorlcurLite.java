
package com.ellucian.generated.bpapi.ban.quick_admit_students.v1_0_0;

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
    "sorlcurKeySeqno",
    "sorlcurTermCode",
    "sorlcurCollCode",
    "sorlcurDegcDesc",
    "sorlcurPriorityNo",
    "sorlcurTermDesc",
    "sorlcurCollDesc",
    "sorlcurDegcCode",
    "sorlcurCampDesc",
    "sorlcurCatlgTermDesc",
    "sorlcurCampCode",
    "sorlcurTermCodeCtlg",
    "sorlcurLevlDesc",
    "sorlcurProgram",
    "sorlcurLevlCode"
})
@Generated("jsonschema2pojo")
public class SorlcurLite {

    /**
     * Study Path
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("sorlcurKeySeqno")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp")
    private Double sorlcurKeySeqno;
    /**
     * Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlcurTermCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm")
    private String sorlcurTermCode;
    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sorlcurCollCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String sorlcurCollCode;
    /**
     * Degree Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurDegcDesc")
    private String sorlcurDegcDesc;
    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlcurPriorityNo")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_PRIORITY_NO")
    private Double sorlcurPriorityNo;
    /**
     * Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurTermDesc")
    private String sorlcurTermDesc;
    @JsonProperty("sorlcurCollDesc")
    private String sorlcurCollDesc;
    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sorlcurDegcCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc")
    private String sorlcurDegcCode;
    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurCampDesc")
    private String sorlcurCampDesc;
    /**
     * Catalog Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurCatlgTermDesc")
    private String sorlcurCatlgTermDesc;
    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("sorlcurCampCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp")
    private String sorlcurCampCode;
    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlcurTermCodeCtlg")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm")
    private String sorlcurTermCodeCtlg;
    /**
     * Level Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurLevlDesc")
    private String sorlcurLevlDesc;
    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("sorlcurProgram")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle")
    private String sorlcurProgram;
    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("sorlcurLevlCode")
    @JsonPropertyDescription("Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl")
    private String sorlcurLevlCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Study Path
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("sorlcurKeySeqno")
    public Double getSorlcurKeySeqno() {
        return sorlcurKeySeqno;
    }

    /**
     * Study Path
     * <p>
     * Lineage reference object : SOVLCUR_KEY_SEQNO, Lookup lineage reference object : sgvstsp,sgrstsp
     * 
     */
    @JsonProperty("sorlcurKeySeqno")
    public void setSorlcurKeySeqno(Double sorlcurKeySeqno) {
        this.sorlcurKeySeqno = sorlcurKeySeqno;
    }

    public SorlcurLite withSorlcurKeySeqno(Double sorlcurKeySeqno) {
        this.sorlcurKeySeqno = sorlcurKeySeqno;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlcurTermCode")
    public String getSorlcurTermCode() {
        return sorlcurTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlcurTermCode")
    public void setSorlcurTermCode(String sorlcurTermCode) {
        this.sorlcurTermCode = sorlcurTermCode;
    }

    public SorlcurLite withSorlcurTermCode(String sorlcurTermCode) {
        this.sorlcurTermCode = sorlcurTermCode;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sorlcurCollCode")
    public String getSorlcurCollCode() {
        return sorlcurCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SOVLCUR_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("sorlcurCollCode")
    public void setSorlcurCollCode(String sorlcurCollCode) {
        this.sorlcurCollCode = sorlcurCollCode;
    }

    public SorlcurLite withSorlcurCollCode(String sorlcurCollCode) {
        this.sorlcurCollCode = sorlcurCollCode;
        return this;
    }

    /**
     * Degree Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurDegcDesc")
    public String getSorlcurDegcDesc() {
        return sorlcurDegcDesc;
    }

    /**
     * Degree Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurDegcDesc")
    public void setSorlcurDegcDesc(String sorlcurDegcDesc) {
        this.sorlcurDegcDesc = sorlcurDegcDesc;
    }

    public SorlcurLite withSorlcurDegcDesc(String sorlcurDegcDesc) {
        this.sorlcurDegcDesc = sorlcurDegcDesc;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlcurPriorityNo")
    public Double getSorlcurPriorityNo() {
        return sorlcurPriorityNo;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SOVLCUR_PRIORITY_NO
     * 
     */
    @JsonProperty("sorlcurPriorityNo")
    public void setSorlcurPriorityNo(Double sorlcurPriorityNo) {
        this.sorlcurPriorityNo = sorlcurPriorityNo;
    }

    public SorlcurLite withSorlcurPriorityNo(Double sorlcurPriorityNo) {
        this.sorlcurPriorityNo = sorlcurPriorityNo;
        return this;
    }

    /**
     * Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurTermDesc")
    public String getSorlcurTermDesc() {
        return sorlcurTermDesc;
    }

    /**
     * Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurTermDesc")
    public void setSorlcurTermDesc(String sorlcurTermDesc) {
        this.sorlcurTermDesc = sorlcurTermDesc;
    }

    public SorlcurLite withSorlcurTermDesc(String sorlcurTermDesc) {
        this.sorlcurTermDesc = sorlcurTermDesc;
        return this;
    }

    @JsonProperty("sorlcurCollDesc")
    public String getSorlcurCollDesc() {
        return sorlcurCollDesc;
    }

    @JsonProperty("sorlcurCollDesc")
    public void setSorlcurCollDesc(String sorlcurCollDesc) {
        this.sorlcurCollDesc = sorlcurCollDesc;
    }

    public SorlcurLite withSorlcurCollDesc(String sorlcurCollDesc) {
        this.sorlcurCollDesc = sorlcurCollDesc;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sorlcurDegcCode")
    public String getSorlcurDegcCode() {
        return sorlcurDegcCode;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SOVLCUR_DEGC_CODE, Lookup lineage reference object : stvdegc
     * 
     */
    @JsonProperty("sorlcurDegcCode")
    public void setSorlcurDegcCode(String sorlcurDegcCode) {
        this.sorlcurDegcCode = sorlcurDegcCode;
    }

    public SorlcurLite withSorlcurDegcCode(String sorlcurDegcCode) {
        this.sorlcurDegcCode = sorlcurDegcCode;
        return this;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurCampDesc")
    public String getSorlcurCampDesc() {
        return sorlcurCampDesc;
    }

    /**
     * Campus Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurCampDesc")
    public void setSorlcurCampDesc(String sorlcurCampDesc) {
        this.sorlcurCampDesc = sorlcurCampDesc;
    }

    public SorlcurLite withSorlcurCampDesc(String sorlcurCampDesc) {
        this.sorlcurCampDesc = sorlcurCampDesc;
        return this;
    }

    /**
     * Catalog Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurCatlgTermDesc")
    public String getSorlcurCatlgTermDesc() {
        return sorlcurCatlgTermDesc;
    }

    /**
     * Catalog Term Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurCatlgTermDesc")
    public void setSorlcurCatlgTermDesc(String sorlcurCatlgTermDesc) {
        this.sorlcurCatlgTermDesc = sorlcurCatlgTermDesc;
    }

    public SorlcurLite withSorlcurCatlgTermDesc(String sorlcurCatlgTermDesc) {
        this.sorlcurCatlgTermDesc = sorlcurCatlgTermDesc;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("sorlcurCampCode")
    public String getSorlcurCampCode() {
        return sorlcurCampCode;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SOVLCUR_CAMP_CODE, Lookup lineage reference object : stvcamp
     * 
     */
    @JsonProperty("sorlcurCampCode")
    public void setSorlcurCampCode(String sorlcurCampCode) {
        this.sorlcurCampCode = sorlcurCampCode;
    }

    public SorlcurLite withSorlcurCampCode(String sorlcurCampCode) {
        this.sorlcurCampCode = sorlcurCampCode;
        return this;
    }

    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlcurTermCodeCtlg")
    public String getSorlcurTermCodeCtlg() {
        return sorlcurTermCodeCtlg;
    }

    /**
     * Catalog Term
     * <p>
     * Lineage reference object : SOVLCUR_TERM_CODE_CTLG, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("sorlcurTermCodeCtlg")
    public void setSorlcurTermCodeCtlg(String sorlcurTermCodeCtlg) {
        this.sorlcurTermCodeCtlg = sorlcurTermCodeCtlg;
    }

    public SorlcurLite withSorlcurTermCodeCtlg(String sorlcurTermCodeCtlg) {
        this.sorlcurTermCodeCtlg = sorlcurTermCodeCtlg;
        return this;
    }

    /**
     * Level Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurLevlDesc")
    public String getSorlcurLevlDesc() {
        return sorlcurLevlDesc;
    }

    /**
     * Level Description
     * <p>
     * 
     * 
     */
    @JsonProperty("sorlcurLevlDesc")
    public void setSorlcurLevlDesc(String sorlcurLevlDesc) {
        this.sorlcurLevlDesc = sorlcurLevlDesc;
    }

    public SorlcurLite withSorlcurLevlDesc(String sorlcurLevlDesc) {
        this.sorlcurLevlDesc = sorlcurLevlDesc;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("sorlcurProgram")
    public String getSorlcurProgram() {
        return sorlcurProgram;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SOVLCUR_PROGRAM, Lookup lineage reference object : smrprle
     * 
     */
    @JsonProperty("sorlcurProgram")
    public void setSorlcurProgram(String sorlcurProgram) {
        this.sorlcurProgram = sorlcurProgram;
    }

    public SorlcurLite withSorlcurProgram(String sorlcurProgram) {
        this.sorlcurProgram = sorlcurProgram;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("sorlcurLevlCode")
    public String getSorlcurLevlCode() {
        return sorlcurLevlCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SOVLCUR_LEVL_CODE, Lookup lineage reference object : stvlevl
     * 
     */
    @JsonProperty("sorlcurLevlCode")
    public void setSorlcurLevlCode(String sorlcurLevlCode) {
        this.sorlcurLevlCode = sorlcurLevlCode;
    }

    public SorlcurLite withSorlcurLevlCode(String sorlcurLevlCode) {
        this.sorlcurLevlCode = sorlcurLevlCode;
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

    public SorlcurLite withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SorlcurLite.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorlcurKeySeqno");
        sb.append('=');
        sb.append(((this.sorlcurKeySeqno == null)?"<null>":this.sorlcurKeySeqno));
        sb.append(',');
        sb.append("sorlcurTermCode");
        sb.append('=');
        sb.append(((this.sorlcurTermCode == null)?"<null>":this.sorlcurTermCode));
        sb.append(',');
        sb.append("sorlcurCollCode");
        sb.append('=');
        sb.append(((this.sorlcurCollCode == null)?"<null>":this.sorlcurCollCode));
        sb.append(',');
        sb.append("sorlcurDegcDesc");
        sb.append('=');
        sb.append(((this.sorlcurDegcDesc == null)?"<null>":this.sorlcurDegcDesc));
        sb.append(',');
        sb.append("sorlcurPriorityNo");
        sb.append('=');
        sb.append(((this.sorlcurPriorityNo == null)?"<null>":this.sorlcurPriorityNo));
        sb.append(',');
        sb.append("sorlcurTermDesc");
        sb.append('=');
        sb.append(((this.sorlcurTermDesc == null)?"<null>":this.sorlcurTermDesc));
        sb.append(',');
        sb.append("sorlcurCollDesc");
        sb.append('=');
        sb.append(((this.sorlcurCollDesc == null)?"<null>":this.sorlcurCollDesc));
        sb.append(',');
        sb.append("sorlcurDegcCode");
        sb.append('=');
        sb.append(((this.sorlcurDegcCode == null)?"<null>":this.sorlcurDegcCode));
        sb.append(',');
        sb.append("sorlcurCampDesc");
        sb.append('=');
        sb.append(((this.sorlcurCampDesc == null)?"<null>":this.sorlcurCampDesc));
        sb.append(',');
        sb.append("sorlcurCatlgTermDesc");
        sb.append('=');
        sb.append(((this.sorlcurCatlgTermDesc == null)?"<null>":this.sorlcurCatlgTermDesc));
        sb.append(',');
        sb.append("sorlcurCampCode");
        sb.append('=');
        sb.append(((this.sorlcurCampCode == null)?"<null>":this.sorlcurCampCode));
        sb.append(',');
        sb.append("sorlcurTermCodeCtlg");
        sb.append('=');
        sb.append(((this.sorlcurTermCodeCtlg == null)?"<null>":this.sorlcurTermCodeCtlg));
        sb.append(',');
        sb.append("sorlcurLevlDesc");
        sb.append('=');
        sb.append(((this.sorlcurLevlDesc == null)?"<null>":this.sorlcurLevlDesc));
        sb.append(',');
        sb.append("sorlcurProgram");
        sb.append('=');
        sb.append(((this.sorlcurProgram == null)?"<null>":this.sorlcurProgram));
        sb.append(',');
        sb.append("sorlcurLevlCode");
        sb.append('=');
        sb.append(((this.sorlcurLevlCode == null)?"<null>":this.sorlcurLevlCode));
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
        result = ((result* 31)+((this.sorlcurKeySeqno == null)? 0 :this.sorlcurKeySeqno.hashCode()));
        result = ((result* 31)+((this.sorlcurTermCode == null)? 0 :this.sorlcurTermCode.hashCode()));
        result = ((result* 31)+((this.sorlcurCollCode == null)? 0 :this.sorlcurCollCode.hashCode()));
        result = ((result* 31)+((this.sorlcurDegcDesc == null)? 0 :this.sorlcurDegcDesc.hashCode()));
        result = ((result* 31)+((this.sorlcurPriorityNo == null)? 0 :this.sorlcurPriorityNo.hashCode()));
        result = ((result* 31)+((this.sorlcurTermDesc == null)? 0 :this.sorlcurTermDesc.hashCode()));
        result = ((result* 31)+((this.sorlcurCollDesc == null)? 0 :this.sorlcurCollDesc.hashCode()));
        result = ((result* 31)+((this.sorlcurDegcCode == null)? 0 :this.sorlcurDegcCode.hashCode()));
        result = ((result* 31)+((this.sorlcurCampDesc == null)? 0 :this.sorlcurCampDesc.hashCode()));
        result = ((result* 31)+((this.sorlcurCatlgTermDesc == null)? 0 :this.sorlcurCatlgTermDesc.hashCode()));
        result = ((result* 31)+((this.sorlcurCampCode == null)? 0 :this.sorlcurCampCode.hashCode()));
        result = ((result* 31)+((this.sorlcurTermCodeCtlg == null)? 0 :this.sorlcurTermCodeCtlg.hashCode()));
        result = ((result* 31)+((this.sorlcurLevlDesc == null)? 0 :this.sorlcurLevlDesc.hashCode()));
        result = ((result* 31)+((this.sorlcurProgram == null)? 0 :this.sorlcurProgram.hashCode()));
        result = ((result* 31)+((this.sorlcurLevlCode == null)? 0 :this.sorlcurLevlCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SorlcurLite) == false) {
            return false;
        }
        SorlcurLite rhs = ((SorlcurLite) other);
        return (((((((((((((((((this.sorlcurKeySeqno == rhs.sorlcurKeySeqno)||((this.sorlcurKeySeqno!= null)&&this.sorlcurKeySeqno.equals(rhs.sorlcurKeySeqno)))&&((this.sorlcurTermCode == rhs.sorlcurTermCode)||((this.sorlcurTermCode!= null)&&this.sorlcurTermCode.equals(rhs.sorlcurTermCode))))&&((this.sorlcurCollCode == rhs.sorlcurCollCode)||((this.sorlcurCollCode!= null)&&this.sorlcurCollCode.equals(rhs.sorlcurCollCode))))&&((this.sorlcurDegcDesc == rhs.sorlcurDegcDesc)||((this.sorlcurDegcDesc!= null)&&this.sorlcurDegcDesc.equals(rhs.sorlcurDegcDesc))))&&((this.sorlcurPriorityNo == rhs.sorlcurPriorityNo)||((this.sorlcurPriorityNo!= null)&&this.sorlcurPriorityNo.equals(rhs.sorlcurPriorityNo))))&&((this.sorlcurTermDesc == rhs.sorlcurTermDesc)||((this.sorlcurTermDesc!= null)&&this.sorlcurTermDesc.equals(rhs.sorlcurTermDesc))))&&((this.sorlcurCollDesc == rhs.sorlcurCollDesc)||((this.sorlcurCollDesc!= null)&&this.sorlcurCollDesc.equals(rhs.sorlcurCollDesc))))&&((this.sorlcurDegcCode == rhs.sorlcurDegcCode)||((this.sorlcurDegcCode!= null)&&this.sorlcurDegcCode.equals(rhs.sorlcurDegcCode))))&&((this.sorlcurCampDesc == rhs.sorlcurCampDesc)||((this.sorlcurCampDesc!= null)&&this.sorlcurCampDesc.equals(rhs.sorlcurCampDesc))))&&((this.sorlcurCatlgTermDesc == rhs.sorlcurCatlgTermDesc)||((this.sorlcurCatlgTermDesc!= null)&&this.sorlcurCatlgTermDesc.equals(rhs.sorlcurCatlgTermDesc))))&&((this.sorlcurCampCode == rhs.sorlcurCampCode)||((this.sorlcurCampCode!= null)&&this.sorlcurCampCode.equals(rhs.sorlcurCampCode))))&&((this.sorlcurTermCodeCtlg == rhs.sorlcurTermCodeCtlg)||((this.sorlcurTermCodeCtlg!= null)&&this.sorlcurTermCodeCtlg.equals(rhs.sorlcurTermCodeCtlg))))&&((this.sorlcurLevlDesc == rhs.sorlcurLevlDesc)||((this.sorlcurLevlDesc!= null)&&this.sorlcurLevlDesc.equals(rhs.sorlcurLevlDesc))))&&((this.sorlcurProgram == rhs.sorlcurProgram)||((this.sorlcurProgram!= null)&&this.sorlcurProgram.equals(rhs.sorlcurProgram))))&&((this.sorlcurLevlCode == rhs.sorlcurLevlCode)||((this.sorlcurLevlCode!= null)&&this.sorlcurLevlCode.equals(rhs.sorlcurLevlCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
