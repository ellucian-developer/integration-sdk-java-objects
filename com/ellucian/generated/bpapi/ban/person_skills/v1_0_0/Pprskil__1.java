
package com.ellucian.generated.bpapi.ban.person_skills.v1_0_0;

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
    "comments",
    "sklvCode",
    "endDate",
    "skillDesc",
    "skilCode",
    "readInd",
    "teachInd",
    "speakInd",
    "nativeInd",
    "transInd",
    "writeInd",
    "levelDesc",
    "startDate",
    "lastDate"
})
@Generated("jsonschema2pojo")
public class Pprskil__1 {

    /**
     * Comments
     * <p>
     * Lineage reference object : PPRSKIL_COMMENTS
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_COMMENTS")
    private String comments;
    /**
     * Level
     * <p>
     * Lineage reference object : PPRSKIL_SKLV_CODE
     * 
     */
    @JsonProperty("sklvCode")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_SKLV_CODE")
    private String sklvCode;
    /**
     * End Date
     * <p>
     * Lineage reference object : PPRSKIL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_END_DATE")
    private Date endDate;
    @JsonProperty("skillDesc")
    private String skillDesc;
    /**
     * Skill
     * <p>
     * Lineage reference object : PPRSKIL_SKIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("skilCode")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_SKIL_CODE")
    private String skilCode;
    /**
     * Read
     * <p>
     * Lineage reference object : PPRSKIL_READ_IND
     * 
     */
    @JsonProperty("readInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_READ_IND")
    private String readInd;
    /**
     * Teach
     * <p>
     * Lineage reference object : PPRSKIL_TEACH_IND
     * 
     */
    @JsonProperty("teachInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_TEACH_IND")
    private String teachInd;
    /**
     * Speak
     * <p>
     * Lineage reference object : PPRSKIL_SPEAK_IND
     * 
     */
    @JsonProperty("speakInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_SPEAK_IND")
    private String speakInd;
    /**
     * Native Language
     * <p>
     * Lineage reference object : PPRSKIL_NATIVE_IND
     * 
     */
    @JsonProperty("nativeInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_NATIVE_IND")
    private String nativeInd;
    /**
     * Translate
     * <p>
     * Lineage reference object : PPRSKIL_TRANS_IND
     * 
     */
    @JsonProperty("transInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_TRANS_IND")
    private String transInd;
    /**
     * Write
     * <p>
     * Lineage reference object : PPRSKIL_WRITE_IND
     * 
     */
    @JsonProperty("writeInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_WRITE_IND")
    private String writeInd;
    @JsonProperty("levelDesc")
    private String levelDesc;
    /**
     * Start Date
     * <p>
     * Lineage reference object : PPRSKIL_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_START_DATE")
    private Date startDate;
    /**
     * Last Used
     * <p>
     * Lineage reference object : PPRSKIL_LAST_DATE
     * 
     */
    @JsonProperty("lastDate")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_LAST_DATE")
    private Date lastDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Comments
     * <p>
     * Lineage reference object : PPRSKIL_COMMENTS
     * 
     */
    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PPRSKIL_COMMENTS
     * 
     */
    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    public Pprskil__1 withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : PPRSKIL_SKLV_CODE
     * 
     */
    @JsonProperty("sklvCode")
    public String getSklvCode() {
        return sklvCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : PPRSKIL_SKLV_CODE
     * 
     */
    @JsonProperty("sklvCode")
    public void setSklvCode(String sklvCode) {
        this.sklvCode = sklvCode;
    }

    public Pprskil__1 withSklvCode(String sklvCode) {
        this.sklvCode = sklvCode;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PPRSKIL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public Date getEndDate() {
        return endDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PPRSKIL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Pprskil__1 withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("skillDesc")
    public String getSkillDesc() {
        return skillDesc;
    }

    @JsonProperty("skillDesc")
    public void setSkillDesc(String skillDesc) {
        this.skillDesc = skillDesc;
    }

    public Pprskil__1 withSkillDesc(String skillDesc) {
        this.skillDesc = skillDesc;
        return this;
    }

    /**
     * Skill
     * <p>
     * Lineage reference object : PPRSKIL_SKIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("skilCode")
    public String getSkilCode() {
        return skilCode;
    }

    /**
     * Skill
     * <p>
     * Lineage reference object : PPRSKIL_SKIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("skilCode")
    public void setSkilCode(String skilCode) {
        this.skilCode = skilCode;
    }

    public Pprskil__1 withSkilCode(String skilCode) {
        this.skilCode = skilCode;
        return this;
    }

    /**
     * Read
     * <p>
     * Lineage reference object : PPRSKIL_READ_IND
     * 
     */
    @JsonProperty("readInd")
    public String getReadInd() {
        return readInd;
    }

    /**
     * Read
     * <p>
     * Lineage reference object : PPRSKIL_READ_IND
     * 
     */
    @JsonProperty("readInd")
    public void setReadInd(String readInd) {
        this.readInd = readInd;
    }

    public Pprskil__1 withReadInd(String readInd) {
        this.readInd = readInd;
        return this;
    }

    /**
     * Teach
     * <p>
     * Lineage reference object : PPRSKIL_TEACH_IND
     * 
     */
    @JsonProperty("teachInd")
    public String getTeachInd() {
        return teachInd;
    }

    /**
     * Teach
     * <p>
     * Lineage reference object : PPRSKIL_TEACH_IND
     * 
     */
    @JsonProperty("teachInd")
    public void setTeachInd(String teachInd) {
        this.teachInd = teachInd;
    }

    public Pprskil__1 withTeachInd(String teachInd) {
        this.teachInd = teachInd;
        return this;
    }

    /**
     * Speak
     * <p>
     * Lineage reference object : PPRSKIL_SPEAK_IND
     * 
     */
    @JsonProperty("speakInd")
    public String getSpeakInd() {
        return speakInd;
    }

    /**
     * Speak
     * <p>
     * Lineage reference object : PPRSKIL_SPEAK_IND
     * 
     */
    @JsonProperty("speakInd")
    public void setSpeakInd(String speakInd) {
        this.speakInd = speakInd;
    }

    public Pprskil__1 withSpeakInd(String speakInd) {
        this.speakInd = speakInd;
        return this;
    }

    /**
     * Native Language
     * <p>
     * Lineage reference object : PPRSKIL_NATIVE_IND
     * 
     */
    @JsonProperty("nativeInd")
    public String getNativeInd() {
        return nativeInd;
    }

    /**
     * Native Language
     * <p>
     * Lineage reference object : PPRSKIL_NATIVE_IND
     * 
     */
    @JsonProperty("nativeInd")
    public void setNativeInd(String nativeInd) {
        this.nativeInd = nativeInd;
    }

    public Pprskil__1 withNativeInd(String nativeInd) {
        this.nativeInd = nativeInd;
        return this;
    }

    /**
     * Translate
     * <p>
     * Lineage reference object : PPRSKIL_TRANS_IND
     * 
     */
    @JsonProperty("transInd")
    public String getTransInd() {
        return transInd;
    }

    /**
     * Translate
     * <p>
     * Lineage reference object : PPRSKIL_TRANS_IND
     * 
     */
    @JsonProperty("transInd")
    public void setTransInd(String transInd) {
        this.transInd = transInd;
    }

    public Pprskil__1 withTransInd(String transInd) {
        this.transInd = transInd;
        return this;
    }

    /**
     * Write
     * <p>
     * Lineage reference object : PPRSKIL_WRITE_IND
     * 
     */
    @JsonProperty("writeInd")
    public String getWriteInd() {
        return writeInd;
    }

    /**
     * Write
     * <p>
     * Lineage reference object : PPRSKIL_WRITE_IND
     * 
     */
    @JsonProperty("writeInd")
    public void setWriteInd(String writeInd) {
        this.writeInd = writeInd;
    }

    public Pprskil__1 withWriteInd(String writeInd) {
        this.writeInd = writeInd;
        return this;
    }

    @JsonProperty("levelDesc")
    public String getLevelDesc() {
        return levelDesc;
    }

    @JsonProperty("levelDesc")
    public void setLevelDesc(String levelDesc) {
        this.levelDesc = levelDesc;
    }

    public Pprskil__1 withLevelDesc(String levelDesc) {
        this.levelDesc = levelDesc;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : PPRSKIL_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : PPRSKIL_START_DATE
     * 
     */
    @JsonProperty("startDate")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Pprskil__1 withStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Last Used
     * <p>
     * Lineage reference object : PPRSKIL_LAST_DATE
     * 
     */
    @JsonProperty("lastDate")
    public Date getLastDate() {
        return lastDate;
    }

    /**
     * Last Used
     * <p>
     * Lineage reference object : PPRSKIL_LAST_DATE
     * 
     */
    @JsonProperty("lastDate")
    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public Pprskil__1 withLastDate(Date lastDate) {
        this.lastDate = lastDate;
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

    public Pprskil__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Pprskil__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("sklvCode");
        sb.append('=');
        sb.append(((this.sklvCode == null)?"<null>":this.sklvCode));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("skillDesc");
        sb.append('=');
        sb.append(((this.skillDesc == null)?"<null>":this.skillDesc));
        sb.append(',');
        sb.append("skilCode");
        sb.append('=');
        sb.append(((this.skilCode == null)?"<null>":this.skilCode));
        sb.append(',');
        sb.append("readInd");
        sb.append('=');
        sb.append(((this.readInd == null)?"<null>":this.readInd));
        sb.append(',');
        sb.append("teachInd");
        sb.append('=');
        sb.append(((this.teachInd == null)?"<null>":this.teachInd));
        sb.append(',');
        sb.append("speakInd");
        sb.append('=');
        sb.append(((this.speakInd == null)?"<null>":this.speakInd));
        sb.append(',');
        sb.append("nativeInd");
        sb.append('=');
        sb.append(((this.nativeInd == null)?"<null>":this.nativeInd));
        sb.append(',');
        sb.append("transInd");
        sb.append('=');
        sb.append(((this.transInd == null)?"<null>":this.transInd));
        sb.append(',');
        sb.append("writeInd");
        sb.append('=');
        sb.append(((this.writeInd == null)?"<null>":this.writeInd));
        sb.append(',');
        sb.append("levelDesc");
        sb.append('=');
        sb.append(((this.levelDesc == null)?"<null>":this.levelDesc));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
        sb.append(',');
        sb.append("lastDate");
        sb.append('=');
        sb.append(((this.lastDate == null)?"<null>":this.lastDate));
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
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.sklvCode == null)? 0 :this.sklvCode.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.skillDesc == null)? 0 :this.skillDesc.hashCode()));
        result = ((result* 31)+((this.skilCode == null)? 0 :this.skilCode.hashCode()));
        result = ((result* 31)+((this.readInd == null)? 0 :this.readInd.hashCode()));
        result = ((result* 31)+((this.teachInd == null)? 0 :this.teachInd.hashCode()));
        result = ((result* 31)+((this.speakInd == null)? 0 :this.speakInd.hashCode()));
        result = ((result* 31)+((this.nativeInd == null)? 0 :this.nativeInd.hashCode()));
        result = ((result* 31)+((this.transInd == null)? 0 :this.transInd.hashCode()));
        result = ((result* 31)+((this.writeInd == null)? 0 :this.writeInd.hashCode()));
        result = ((result* 31)+((this.levelDesc == null)? 0 :this.levelDesc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        result = ((result* 31)+((this.lastDate == null)? 0 :this.lastDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pprskil__1) == false) {
            return false;
        }
        Pprskil__1 rhs = ((Pprskil__1) other);
        return ((((((((((((((((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments)))&&((this.sklvCode == rhs.sklvCode)||((this.sklvCode!= null)&&this.sklvCode.equals(rhs.sklvCode))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.skillDesc == rhs.skillDesc)||((this.skillDesc!= null)&&this.skillDesc.equals(rhs.skillDesc))))&&((this.skilCode == rhs.skilCode)||((this.skilCode!= null)&&this.skilCode.equals(rhs.skilCode))))&&((this.readInd == rhs.readInd)||((this.readInd!= null)&&this.readInd.equals(rhs.readInd))))&&((this.teachInd == rhs.teachInd)||((this.teachInd!= null)&&this.teachInd.equals(rhs.teachInd))))&&((this.speakInd == rhs.speakInd)||((this.speakInd!= null)&&this.speakInd.equals(rhs.speakInd))))&&((this.nativeInd == rhs.nativeInd)||((this.nativeInd!= null)&&this.nativeInd.equals(rhs.nativeInd))))&&((this.transInd == rhs.transInd)||((this.transInd!= null)&&this.transInd.equals(rhs.transInd))))&&((this.writeInd == rhs.writeInd)||((this.writeInd!= null)&&this.writeInd.equals(rhs.writeInd))))&&((this.levelDesc == rhs.levelDesc)||((this.levelDesc!= null)&&this.levelDesc.equals(rhs.levelDesc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))))&&((this.lastDate == rhs.lastDate)||((this.lastDate!= null)&&this.lastDate.equals(rhs.lastDate))));
    }

}
