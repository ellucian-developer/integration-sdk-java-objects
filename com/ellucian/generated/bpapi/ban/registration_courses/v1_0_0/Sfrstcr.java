
package com.ellucian.generated.bpapi.ban.registration_courses.v1_0_0;

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
    "preqOver",
    "levlOver",
    "duplOver",
    "linkOver",
    "reptOver",
    "timeOver",
    "collOver",
    "deptOver",
    "progOver",
    "capcOver",
    "corqOver",
    "apprOver",
    "campOver",
    "chrtOver",
    "attsOver",
    "degcOver",
    "rpthOver",
    "clasOver",
    "majrOver"
})
@Generated("jsonschema2pojo")
public class Sfrstcr {

    /**
     * Prerequisite
     * <p>
     * Lineage reference object : SFRSTCR_PREQ_OVER
     * 
     */
    @JsonProperty("preqOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_PREQ_OVER")
    private String preqOver;
    /**
     * Level
     * <p>
     * Lineage reference object : SFRSTCR_LEVL_OVER
     * 
     */
    @JsonProperty("levlOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_LEVL_OVER")
    private String levlOver;
    /**
     * Duplicate
     * <p>
     * Lineage reference object : SFRSTCR_DUPL_OVER
     * 
     */
    @JsonProperty("duplOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_DUPL_OVER")
    private String duplOver;
    /**
     * Link
     * <p>
     * Lineage reference object : SFRSTCR_LINK_OVER
     * 
     */
    @JsonProperty("linkOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_LINK_OVER")
    private String linkOver;
    /**
     * Repeat Limit
     * <p>
     * Lineage reference object : SFRSTCR_REPT_OVER
     * 
     */
    @JsonProperty("reptOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_REPT_OVER")
    private String reptOver;
    /**
     * Time
     * <p>
     * Lineage reference object : SFRSTCR_TIME_OVER
     * 
     */
    @JsonProperty("timeOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_TIME_OVER")
    private String timeOver;
    /**
     * College
     * <p>
     * Lineage reference object : SFRSTCR_COLL_OVER
     * 
     */
    @JsonProperty("collOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_COLL_OVER")
    private String collOver;
    /**
     * Department
     * <p>
     * Lineage reference object : SFRSTCR_DEPT_OVER
     * 
     */
    @JsonProperty("deptOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_DEPT_OVER")
    private String deptOver;
    /**
     * Program
     * <p>
     * Lineage reference object : SFRSTCR_PROG_OVER
     * 
     */
    @JsonProperty("progOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_PROG_OVER")
    private String progOver;
    /**
     * Capacity
     * <p>
     * Lineage reference object : SFRSTCR_CAPC_OVER
     * 
     */
    @JsonProperty("capcOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CAPC_OVER")
    private String capcOver;
    /**
     * Corequisite
     * <p>
     * Lineage reference object : SFRSTCR_CORQ_OVER
     * 
     */
    @JsonProperty("corqOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CORQ_OVER")
    private String corqOver;
    /**
     * Approval
     * <p>
     * Lineage reference object : SFRSTCR_APPR_OVER
     * 
     */
    @JsonProperty("apprOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_APPR_OVER")
    private String apprOver;
    /**
     * Campus
     * <p>
     * Lineage reference object : SFRSTCR_CAMP_OVER
     * 
     */
    @JsonProperty("campOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CAMP_OVER")
    private String campOver;
    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRSTCR_CHRT_OVER
     * 
     */
    @JsonProperty("chrtOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CHRT_OVER")
    private String chrtOver;
    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRSTCR_ATTS_OVER
     * 
     */
    @JsonProperty("attsOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_ATTS_OVER")
    private String attsOver;
    /**
     * Degree
     * <p>
     * Lineage reference object : SFRSTCR_DEGC_OVER
     * 
     */
    @JsonProperty("degcOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_DEGC_OVER")
    private String degcOver;
    /**
     * Repeat Hours
     * <p>
     * Lineage reference object : SFRSTCR_RPTH_OVER
     * 
     */
    @JsonProperty("rpthOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_RPTH_OVER")
    private String rpthOver;
    /**
     * Class
     * <p>
     * Lineage reference object : SFRSTCR_CLAS_OVER
     * 
     */
    @JsonProperty("clasOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_CLAS_OVER")
    private String clasOver;
    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRSTCR_MAJR_OVER
     * 
     */
    @JsonProperty("majrOver")
    @JsonPropertyDescription("Lineage reference object : SFRSTCR_MAJR_OVER")
    private String majrOver;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Prerequisite
     * <p>
     * Lineage reference object : SFRSTCR_PREQ_OVER
     * 
     */
    @JsonProperty("preqOver")
    public String getPreqOver() {
        return preqOver;
    }

    /**
     * Prerequisite
     * <p>
     * Lineage reference object : SFRSTCR_PREQ_OVER
     * 
     */
    @JsonProperty("preqOver")
    public void setPreqOver(String preqOver) {
        this.preqOver = preqOver;
    }

    public Sfrstcr withPreqOver(String preqOver) {
        this.preqOver = preqOver;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRSTCR_LEVL_OVER
     * 
     */
    @JsonProperty("levlOver")
    public String getLevlOver() {
        return levlOver;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : SFRSTCR_LEVL_OVER
     * 
     */
    @JsonProperty("levlOver")
    public void setLevlOver(String levlOver) {
        this.levlOver = levlOver;
    }

    public Sfrstcr withLevlOver(String levlOver) {
        this.levlOver = levlOver;
        return this;
    }

    /**
     * Duplicate
     * <p>
     * Lineage reference object : SFRSTCR_DUPL_OVER
     * 
     */
    @JsonProperty("duplOver")
    public String getDuplOver() {
        return duplOver;
    }

    /**
     * Duplicate
     * <p>
     * Lineage reference object : SFRSTCR_DUPL_OVER
     * 
     */
    @JsonProperty("duplOver")
    public void setDuplOver(String duplOver) {
        this.duplOver = duplOver;
    }

    public Sfrstcr withDuplOver(String duplOver) {
        this.duplOver = duplOver;
        return this;
    }

    /**
     * Link
     * <p>
     * Lineage reference object : SFRSTCR_LINK_OVER
     * 
     */
    @JsonProperty("linkOver")
    public String getLinkOver() {
        return linkOver;
    }

    /**
     * Link
     * <p>
     * Lineage reference object : SFRSTCR_LINK_OVER
     * 
     */
    @JsonProperty("linkOver")
    public void setLinkOver(String linkOver) {
        this.linkOver = linkOver;
    }

    public Sfrstcr withLinkOver(String linkOver) {
        this.linkOver = linkOver;
        return this;
    }

    /**
     * Repeat Limit
     * <p>
     * Lineage reference object : SFRSTCR_REPT_OVER
     * 
     */
    @JsonProperty("reptOver")
    public String getReptOver() {
        return reptOver;
    }

    /**
     * Repeat Limit
     * <p>
     * Lineage reference object : SFRSTCR_REPT_OVER
     * 
     */
    @JsonProperty("reptOver")
    public void setReptOver(String reptOver) {
        this.reptOver = reptOver;
    }

    public Sfrstcr withReptOver(String reptOver) {
        this.reptOver = reptOver;
        return this;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SFRSTCR_TIME_OVER
     * 
     */
    @JsonProperty("timeOver")
    public String getTimeOver() {
        return timeOver;
    }

    /**
     * Time
     * <p>
     * Lineage reference object : SFRSTCR_TIME_OVER
     * 
     */
    @JsonProperty("timeOver")
    public void setTimeOver(String timeOver) {
        this.timeOver = timeOver;
    }

    public Sfrstcr withTimeOver(String timeOver) {
        this.timeOver = timeOver;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRSTCR_COLL_OVER
     * 
     */
    @JsonProperty("collOver")
    public String getCollOver() {
        return collOver;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SFRSTCR_COLL_OVER
     * 
     */
    @JsonProperty("collOver")
    public void setCollOver(String collOver) {
        this.collOver = collOver;
    }

    public Sfrstcr withCollOver(String collOver) {
        this.collOver = collOver;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRSTCR_DEPT_OVER
     * 
     */
    @JsonProperty("deptOver")
    public String getDeptOver() {
        return deptOver;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SFRSTCR_DEPT_OVER
     * 
     */
    @JsonProperty("deptOver")
    public void setDeptOver(String deptOver) {
        this.deptOver = deptOver;
    }

    public Sfrstcr withDeptOver(String deptOver) {
        this.deptOver = deptOver;
        return this;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRSTCR_PROG_OVER
     * 
     */
    @JsonProperty("progOver")
    public String getProgOver() {
        return progOver;
    }

    /**
     * Program
     * <p>
     * Lineage reference object : SFRSTCR_PROG_OVER
     * 
     */
    @JsonProperty("progOver")
    public void setProgOver(String progOver) {
        this.progOver = progOver;
    }

    public Sfrstcr withProgOver(String progOver) {
        this.progOver = progOver;
        return this;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SFRSTCR_CAPC_OVER
     * 
     */
    @JsonProperty("capcOver")
    public String getCapcOver() {
        return capcOver;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SFRSTCR_CAPC_OVER
     * 
     */
    @JsonProperty("capcOver")
    public void setCapcOver(String capcOver) {
        this.capcOver = capcOver;
    }

    public Sfrstcr withCapcOver(String capcOver) {
        this.capcOver = capcOver;
        return this;
    }

    /**
     * Corequisite
     * <p>
     * Lineage reference object : SFRSTCR_CORQ_OVER
     * 
     */
    @JsonProperty("corqOver")
    public String getCorqOver() {
        return corqOver;
    }

    /**
     * Corequisite
     * <p>
     * Lineage reference object : SFRSTCR_CORQ_OVER
     * 
     */
    @JsonProperty("corqOver")
    public void setCorqOver(String corqOver) {
        this.corqOver = corqOver;
    }

    public Sfrstcr withCorqOver(String corqOver) {
        this.corqOver = corqOver;
        return this;
    }

    /**
     * Approval
     * <p>
     * Lineage reference object : SFRSTCR_APPR_OVER
     * 
     */
    @JsonProperty("apprOver")
    public String getApprOver() {
        return apprOver;
    }

    /**
     * Approval
     * <p>
     * Lineage reference object : SFRSTCR_APPR_OVER
     * 
     */
    @JsonProperty("apprOver")
    public void setApprOver(String apprOver) {
        this.apprOver = apprOver;
    }

    public Sfrstcr withApprOver(String apprOver) {
        this.apprOver = apprOver;
        return this;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRSTCR_CAMP_OVER
     * 
     */
    @JsonProperty("campOver")
    public String getCampOver() {
        return campOver;
    }

    /**
     * Campus
     * <p>
     * Lineage reference object : SFRSTCR_CAMP_OVER
     * 
     */
    @JsonProperty("campOver")
    public void setCampOver(String campOver) {
        this.campOver = campOver;
    }

    public Sfrstcr withCampOver(String campOver) {
        this.campOver = campOver;
        return this;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRSTCR_CHRT_OVER
     * 
     */
    @JsonProperty("chrtOver")
    public String getChrtOver() {
        return chrtOver;
    }

    /**
     * Cohort
     * <p>
     * Lineage reference object : SFRSTCR_CHRT_OVER
     * 
     */
    @JsonProperty("chrtOver")
    public void setChrtOver(String chrtOver) {
        this.chrtOver = chrtOver;
    }

    public Sfrstcr withChrtOver(String chrtOver) {
        this.chrtOver = chrtOver;
        return this;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRSTCR_ATTS_OVER
     * 
     */
    @JsonProperty("attsOver")
    public String getAttsOver() {
        return attsOver;
    }

    /**
     * Student Attribute
     * <p>
     * Lineage reference object : SFRSTCR_ATTS_OVER
     * 
     */
    @JsonProperty("attsOver")
    public void setAttsOver(String attsOver) {
        this.attsOver = attsOver;
    }

    public Sfrstcr withAttsOver(String attsOver) {
        this.attsOver = attsOver;
        return this;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRSTCR_DEGC_OVER
     * 
     */
    @JsonProperty("degcOver")
    public String getDegcOver() {
        return degcOver;
    }

    /**
     * Degree
     * <p>
     * Lineage reference object : SFRSTCR_DEGC_OVER
     * 
     */
    @JsonProperty("degcOver")
    public void setDegcOver(String degcOver) {
        this.degcOver = degcOver;
    }

    public Sfrstcr withDegcOver(String degcOver) {
        this.degcOver = degcOver;
        return this;
    }

    /**
     * Repeat Hours
     * <p>
     * Lineage reference object : SFRSTCR_RPTH_OVER
     * 
     */
    @JsonProperty("rpthOver")
    public String getRpthOver() {
        return rpthOver;
    }

    /**
     * Repeat Hours
     * <p>
     * Lineage reference object : SFRSTCR_RPTH_OVER
     * 
     */
    @JsonProperty("rpthOver")
    public void setRpthOver(String rpthOver) {
        this.rpthOver = rpthOver;
    }

    public Sfrstcr withRpthOver(String rpthOver) {
        this.rpthOver = rpthOver;
        return this;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SFRSTCR_CLAS_OVER
     * 
     */
    @JsonProperty("clasOver")
    public String getClasOver() {
        return clasOver;
    }

    /**
     * Class
     * <p>
     * Lineage reference object : SFRSTCR_CLAS_OVER
     * 
     */
    @JsonProperty("clasOver")
    public void setClasOver(String clasOver) {
        this.clasOver = clasOver;
    }

    public Sfrstcr withClasOver(String clasOver) {
        this.clasOver = clasOver;
        return this;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRSTCR_MAJR_OVER
     * 
     */
    @JsonProperty("majrOver")
    public String getMajrOver() {
        return majrOver;
    }

    /**
     * Field of Study
     * <p>
     * Lineage reference object : SFRSTCR_MAJR_OVER
     * 
     */
    @JsonProperty("majrOver")
    public void setMajrOver(String majrOver) {
        this.majrOver = majrOver;
    }

    public Sfrstcr withMajrOver(String majrOver) {
        this.majrOver = majrOver;
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

    public Sfrstcr withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sfrstcr.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("preqOver");
        sb.append('=');
        sb.append(((this.preqOver == null)?"<null>":this.preqOver));
        sb.append(',');
        sb.append("levlOver");
        sb.append('=');
        sb.append(((this.levlOver == null)?"<null>":this.levlOver));
        sb.append(',');
        sb.append("duplOver");
        sb.append('=');
        sb.append(((this.duplOver == null)?"<null>":this.duplOver));
        sb.append(',');
        sb.append("linkOver");
        sb.append('=');
        sb.append(((this.linkOver == null)?"<null>":this.linkOver));
        sb.append(',');
        sb.append("reptOver");
        sb.append('=');
        sb.append(((this.reptOver == null)?"<null>":this.reptOver));
        sb.append(',');
        sb.append("timeOver");
        sb.append('=');
        sb.append(((this.timeOver == null)?"<null>":this.timeOver));
        sb.append(',');
        sb.append("collOver");
        sb.append('=');
        sb.append(((this.collOver == null)?"<null>":this.collOver));
        sb.append(',');
        sb.append("deptOver");
        sb.append('=');
        sb.append(((this.deptOver == null)?"<null>":this.deptOver));
        sb.append(',');
        sb.append("progOver");
        sb.append('=');
        sb.append(((this.progOver == null)?"<null>":this.progOver));
        sb.append(',');
        sb.append("capcOver");
        sb.append('=');
        sb.append(((this.capcOver == null)?"<null>":this.capcOver));
        sb.append(',');
        sb.append("corqOver");
        sb.append('=');
        sb.append(((this.corqOver == null)?"<null>":this.corqOver));
        sb.append(',');
        sb.append("apprOver");
        sb.append('=');
        sb.append(((this.apprOver == null)?"<null>":this.apprOver));
        sb.append(',');
        sb.append("campOver");
        sb.append('=');
        sb.append(((this.campOver == null)?"<null>":this.campOver));
        sb.append(',');
        sb.append("chrtOver");
        sb.append('=');
        sb.append(((this.chrtOver == null)?"<null>":this.chrtOver));
        sb.append(',');
        sb.append("attsOver");
        sb.append('=');
        sb.append(((this.attsOver == null)?"<null>":this.attsOver));
        sb.append(',');
        sb.append("degcOver");
        sb.append('=');
        sb.append(((this.degcOver == null)?"<null>":this.degcOver));
        sb.append(',');
        sb.append("rpthOver");
        sb.append('=');
        sb.append(((this.rpthOver == null)?"<null>":this.rpthOver));
        sb.append(',');
        sb.append("clasOver");
        sb.append('=');
        sb.append(((this.clasOver == null)?"<null>":this.clasOver));
        sb.append(',');
        sb.append("majrOver");
        sb.append('=');
        sb.append(((this.majrOver == null)?"<null>":this.majrOver));
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
        result = ((result* 31)+((this.preqOver == null)? 0 :this.preqOver.hashCode()));
        result = ((result* 31)+((this.levlOver == null)? 0 :this.levlOver.hashCode()));
        result = ((result* 31)+((this.duplOver == null)? 0 :this.duplOver.hashCode()));
        result = ((result* 31)+((this.linkOver == null)? 0 :this.linkOver.hashCode()));
        result = ((result* 31)+((this.reptOver == null)? 0 :this.reptOver.hashCode()));
        result = ((result* 31)+((this.timeOver == null)? 0 :this.timeOver.hashCode()));
        result = ((result* 31)+((this.collOver == null)? 0 :this.collOver.hashCode()));
        result = ((result* 31)+((this.deptOver == null)? 0 :this.deptOver.hashCode()));
        result = ((result* 31)+((this.progOver == null)? 0 :this.progOver.hashCode()));
        result = ((result* 31)+((this.capcOver == null)? 0 :this.capcOver.hashCode()));
        result = ((result* 31)+((this.corqOver == null)? 0 :this.corqOver.hashCode()));
        result = ((result* 31)+((this.apprOver == null)? 0 :this.apprOver.hashCode()));
        result = ((result* 31)+((this.campOver == null)? 0 :this.campOver.hashCode()));
        result = ((result* 31)+((this.chrtOver == null)? 0 :this.chrtOver.hashCode()));
        result = ((result* 31)+((this.attsOver == null)? 0 :this.attsOver.hashCode()));
        result = ((result* 31)+((this.degcOver == null)? 0 :this.degcOver.hashCode()));
        result = ((result* 31)+((this.rpthOver == null)? 0 :this.rpthOver.hashCode()));
        result = ((result* 31)+((this.clasOver == null)? 0 :this.clasOver.hashCode()));
        result = ((result* 31)+((this.majrOver == null)? 0 :this.majrOver.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sfrstcr) == false) {
            return false;
        }
        Sfrstcr rhs = ((Sfrstcr) other);
        return (((((((((((((((((((((this.preqOver == rhs.preqOver)||((this.preqOver!= null)&&this.preqOver.equals(rhs.preqOver)))&&((this.levlOver == rhs.levlOver)||((this.levlOver!= null)&&this.levlOver.equals(rhs.levlOver))))&&((this.duplOver == rhs.duplOver)||((this.duplOver!= null)&&this.duplOver.equals(rhs.duplOver))))&&((this.linkOver == rhs.linkOver)||((this.linkOver!= null)&&this.linkOver.equals(rhs.linkOver))))&&((this.reptOver == rhs.reptOver)||((this.reptOver!= null)&&this.reptOver.equals(rhs.reptOver))))&&((this.timeOver == rhs.timeOver)||((this.timeOver!= null)&&this.timeOver.equals(rhs.timeOver))))&&((this.collOver == rhs.collOver)||((this.collOver!= null)&&this.collOver.equals(rhs.collOver))))&&((this.deptOver == rhs.deptOver)||((this.deptOver!= null)&&this.deptOver.equals(rhs.deptOver))))&&((this.progOver == rhs.progOver)||((this.progOver!= null)&&this.progOver.equals(rhs.progOver))))&&((this.capcOver == rhs.capcOver)||((this.capcOver!= null)&&this.capcOver.equals(rhs.capcOver))))&&((this.corqOver == rhs.corqOver)||((this.corqOver!= null)&&this.corqOver.equals(rhs.corqOver))))&&((this.apprOver == rhs.apprOver)||((this.apprOver!= null)&&this.apprOver.equals(rhs.apprOver))))&&((this.campOver == rhs.campOver)||((this.campOver!= null)&&this.campOver.equals(rhs.campOver))))&&((this.chrtOver == rhs.chrtOver)||((this.chrtOver!= null)&&this.chrtOver.equals(rhs.chrtOver))))&&((this.attsOver == rhs.attsOver)||((this.attsOver!= null)&&this.attsOver.equals(rhs.attsOver))))&&((this.degcOver == rhs.degcOver)||((this.degcOver!= null)&&this.degcOver.equals(rhs.degcOver))))&&((this.rpthOver == rhs.rpthOver)||((this.rpthOver!= null)&&this.rpthOver.equals(rhs.rpthOver))))&&((this.clasOver == rhs.clasOver)||((this.clasOver!= null)&&this.clasOver.equals(rhs.clasOver))))&&((this.majrOver == rhs.majrOver)||((this.majrOver!= null)&&this.majrOver.equals(rhs.majrOver))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
