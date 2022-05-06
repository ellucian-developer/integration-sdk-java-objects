
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
    "endDate",
    "criteria.endDate",
    "criteria.skilCode",
    "criteria.lastDate",
    "criteria.startDate",
    "readInd",
    "transInd",
    "criteria.readInd",
    "criteria.comments",
    "id",
    "lastDate",
    "criteria.writeInd",
    "sklvCode",
    "comments",
    "skilCode",
    "teachInd",
    "speakInd",
    "nativeInd",
    "criteria.transInd",
    "writeInd",
    "criteria.sklvCode",
    "criteria.teachInd",
    "criteria.speakInd",
    "criteria.nativeInd",
    "startDate"
})
@Generated("jsonschema2pojo")
public class PersonSkills100PutRequest {

    /**
     * End Date
     * <p>
     * Lineage reference object : PPRSKIL_END_DATE
     * 
     */
    @JsonProperty("endDate")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_END_DATE")
    private Date endDate;
    /**
     * End Date
     * <p>
     * Lineage reference object : PPRSKIL_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_END_DATE")
    private Date criteriaEndDate;
    /**
     * Skill
     * <p>
     * Lineage reference object : PPRSKIL_SKIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.skilCode")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_SKIL_CODE")
    private String criteriaSkilCode;
    /**
     * Last Used
     * <p>
     * Lineage reference object : PPRSKIL_LAST_DATE
     * 
     */
    @JsonProperty("criteria.lastDate")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_LAST_DATE")
    private Date criteriaLastDate;
    /**
     * Start Date
     * <p>
     * Lineage reference object : PPRSKIL_START_DATE
     * 
     */
    @JsonProperty("criteria.startDate")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_START_DATE")
    private Date criteriaStartDate;
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
     * Translate
     * <p>
     * Lineage reference object : PPRSKIL_TRANS_IND
     * 
     */
    @JsonProperty("transInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_TRANS_IND")
    private String transInd;
    /**
     * Read
     * <p>
     * Lineage reference object : PPRSKIL_READ_IND
     * 
     */
    @JsonProperty("criteria.readInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_READ_IND")
    private String criteriaReadInd;
    /**
     * Comments
     * <p>
     * Lineage reference object : PPRSKIL_COMMENTS
     * 
     */
    @JsonProperty("criteria.comments")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_COMMENTS")
    private String criteriaComments;
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
     * Last Used
     * <p>
     * Lineage reference object : PPRSKIL_LAST_DATE
     * 
     */
    @JsonProperty("lastDate")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_LAST_DATE")
    private Date lastDate;
    /**
     * Write
     * <p>
     * Lineage reference object : PPRSKIL_WRITE_IND
     * 
     */
    @JsonProperty("criteria.writeInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_WRITE_IND")
    private String criteriaWriteInd;
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
     * Comments
     * <p>
     * Lineage reference object : PPRSKIL_COMMENTS
     * 
     */
    @JsonProperty("comments")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_COMMENTS")
    private String comments;
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
    @JsonProperty("criteria.transInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_TRANS_IND")
    private String criteriaTransInd;
    /**
     * Write
     * <p>
     * Lineage reference object : PPRSKIL_WRITE_IND
     * 
     */
    @JsonProperty("writeInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_WRITE_IND")
    private String writeInd;
    /**
     * Level
     * <p>
     * Lineage reference object : PPRSKIL_SKLV_CODE
     * 
     */
    @JsonProperty("criteria.sklvCode")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_SKLV_CODE")
    private String criteriaSklvCode;
    /**
     * Teach
     * <p>
     * Lineage reference object : PPRSKIL_TEACH_IND
     * 
     */
    @JsonProperty("criteria.teachInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_TEACH_IND")
    private String criteriaTeachInd;
    /**
     * Speak
     * <p>
     * Lineage reference object : PPRSKIL_SPEAK_IND
     * 
     */
    @JsonProperty("criteria.speakInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_SPEAK_IND")
    private String criteriaSpeakInd;
    /**
     * Native Language
     * <p>
     * Lineage reference object : PPRSKIL_NATIVE_IND
     * 
     */
    @JsonProperty("criteria.nativeInd")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_NATIVE_IND")
    private String criteriaNativeInd;
    /**
     * Start Date
     * <p>
     * Lineage reference object : PPRSKIL_START_DATE
     * 
     */
    @JsonProperty("startDate")
    @JsonPropertyDescription("Lineage reference object : PPRSKIL_START_DATE")
    private Date startDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public PersonSkills100PutRequest withEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PPRSKIL_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public Date getCriteriaEndDate() {
        return criteriaEndDate;
    }

    /**
     * End Date
     * <p>
     * Lineage reference object : PPRSKIL_END_DATE
     * 
     */
    @JsonProperty("criteria.endDate")
    public void setCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
    }

    public PersonSkills100PutRequest withCriteriaEndDate(Date criteriaEndDate) {
        this.criteriaEndDate = criteriaEndDate;
        return this;
    }

    /**
     * Skill
     * <p>
     * Lineage reference object : PPRSKIL_SKIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.skilCode")
    public String getCriteriaSkilCode() {
        return criteriaSkilCode;
    }

    /**
     * Skill
     * <p>
     * Lineage reference object : PPRSKIL_SKIL_CODE
     * (Required)
     * 
     */
    @JsonProperty("criteria.skilCode")
    public void setCriteriaSkilCode(String criteriaSkilCode) {
        this.criteriaSkilCode = criteriaSkilCode;
    }

    public PersonSkills100PutRequest withCriteriaSkilCode(String criteriaSkilCode) {
        this.criteriaSkilCode = criteriaSkilCode;
        return this;
    }

    /**
     * Last Used
     * <p>
     * Lineage reference object : PPRSKIL_LAST_DATE
     * 
     */
    @JsonProperty("criteria.lastDate")
    public Date getCriteriaLastDate() {
        return criteriaLastDate;
    }

    /**
     * Last Used
     * <p>
     * Lineage reference object : PPRSKIL_LAST_DATE
     * 
     */
    @JsonProperty("criteria.lastDate")
    public void setCriteriaLastDate(Date criteriaLastDate) {
        this.criteriaLastDate = criteriaLastDate;
    }

    public PersonSkills100PutRequest withCriteriaLastDate(Date criteriaLastDate) {
        this.criteriaLastDate = criteriaLastDate;
        return this;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : PPRSKIL_START_DATE
     * 
     */
    @JsonProperty("criteria.startDate")
    public Date getCriteriaStartDate() {
        return criteriaStartDate;
    }

    /**
     * Start Date
     * <p>
     * Lineage reference object : PPRSKIL_START_DATE
     * 
     */
    @JsonProperty("criteria.startDate")
    public void setCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
    }

    public PersonSkills100PutRequest withCriteriaStartDate(Date criteriaStartDate) {
        this.criteriaStartDate = criteriaStartDate;
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

    public PersonSkills100PutRequest withReadInd(String readInd) {
        this.readInd = readInd;
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

    public PersonSkills100PutRequest withTransInd(String transInd) {
        this.transInd = transInd;
        return this;
    }

    /**
     * Read
     * <p>
     * Lineage reference object : PPRSKIL_READ_IND
     * 
     */
    @JsonProperty("criteria.readInd")
    public String getCriteriaReadInd() {
        return criteriaReadInd;
    }

    /**
     * Read
     * <p>
     * Lineage reference object : PPRSKIL_READ_IND
     * 
     */
    @JsonProperty("criteria.readInd")
    public void setCriteriaReadInd(String criteriaReadInd) {
        this.criteriaReadInd = criteriaReadInd;
    }

    public PersonSkills100PutRequest withCriteriaReadInd(String criteriaReadInd) {
        this.criteriaReadInd = criteriaReadInd;
        return this;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PPRSKIL_COMMENTS
     * 
     */
    @JsonProperty("criteria.comments")
    public String getCriteriaComments() {
        return criteriaComments;
    }

    /**
     * Comments
     * <p>
     * Lineage reference object : PPRSKIL_COMMENTS
     * 
     */
    @JsonProperty("criteria.comments")
    public void setCriteriaComments(String criteriaComments) {
        this.criteriaComments = criteriaComments;
    }

    public PersonSkills100PutRequest withCriteriaComments(String criteriaComments) {
        this.criteriaComments = criteriaComments;
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

    public PersonSkills100PutRequest withId(Object id) {
        this.id = id;
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

    public PersonSkills100PutRequest withLastDate(Date lastDate) {
        this.lastDate = lastDate;
        return this;
    }

    /**
     * Write
     * <p>
     * Lineage reference object : PPRSKIL_WRITE_IND
     * 
     */
    @JsonProperty("criteria.writeInd")
    public String getCriteriaWriteInd() {
        return criteriaWriteInd;
    }

    /**
     * Write
     * <p>
     * Lineage reference object : PPRSKIL_WRITE_IND
     * 
     */
    @JsonProperty("criteria.writeInd")
    public void setCriteriaWriteInd(String criteriaWriteInd) {
        this.criteriaWriteInd = criteriaWriteInd;
    }

    public PersonSkills100PutRequest withCriteriaWriteInd(String criteriaWriteInd) {
        this.criteriaWriteInd = criteriaWriteInd;
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

    public PersonSkills100PutRequest withSklvCode(String sklvCode) {
        this.sklvCode = sklvCode;
        return this;
    }

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

    public PersonSkills100PutRequest withComments(String comments) {
        this.comments = comments;
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

    public PersonSkills100PutRequest withSkilCode(String skilCode) {
        this.skilCode = skilCode;
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

    public PersonSkills100PutRequest withTeachInd(String teachInd) {
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

    public PersonSkills100PutRequest withSpeakInd(String speakInd) {
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

    public PersonSkills100PutRequest withNativeInd(String nativeInd) {
        this.nativeInd = nativeInd;
        return this;
    }

    /**
     * Translate
     * <p>
     * Lineage reference object : PPRSKIL_TRANS_IND
     * 
     */
    @JsonProperty("criteria.transInd")
    public String getCriteriaTransInd() {
        return criteriaTransInd;
    }

    /**
     * Translate
     * <p>
     * Lineage reference object : PPRSKIL_TRANS_IND
     * 
     */
    @JsonProperty("criteria.transInd")
    public void setCriteriaTransInd(String criteriaTransInd) {
        this.criteriaTransInd = criteriaTransInd;
    }

    public PersonSkills100PutRequest withCriteriaTransInd(String criteriaTransInd) {
        this.criteriaTransInd = criteriaTransInd;
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

    public PersonSkills100PutRequest withWriteInd(String writeInd) {
        this.writeInd = writeInd;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : PPRSKIL_SKLV_CODE
     * 
     */
    @JsonProperty("criteria.sklvCode")
    public String getCriteriaSklvCode() {
        return criteriaSklvCode;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : PPRSKIL_SKLV_CODE
     * 
     */
    @JsonProperty("criteria.sklvCode")
    public void setCriteriaSklvCode(String criteriaSklvCode) {
        this.criteriaSklvCode = criteriaSklvCode;
    }

    public PersonSkills100PutRequest withCriteriaSklvCode(String criteriaSklvCode) {
        this.criteriaSklvCode = criteriaSklvCode;
        return this;
    }

    /**
     * Teach
     * <p>
     * Lineage reference object : PPRSKIL_TEACH_IND
     * 
     */
    @JsonProperty("criteria.teachInd")
    public String getCriteriaTeachInd() {
        return criteriaTeachInd;
    }

    /**
     * Teach
     * <p>
     * Lineage reference object : PPRSKIL_TEACH_IND
     * 
     */
    @JsonProperty("criteria.teachInd")
    public void setCriteriaTeachInd(String criteriaTeachInd) {
        this.criteriaTeachInd = criteriaTeachInd;
    }

    public PersonSkills100PutRequest withCriteriaTeachInd(String criteriaTeachInd) {
        this.criteriaTeachInd = criteriaTeachInd;
        return this;
    }

    /**
     * Speak
     * <p>
     * Lineage reference object : PPRSKIL_SPEAK_IND
     * 
     */
    @JsonProperty("criteria.speakInd")
    public String getCriteriaSpeakInd() {
        return criteriaSpeakInd;
    }

    /**
     * Speak
     * <p>
     * Lineage reference object : PPRSKIL_SPEAK_IND
     * 
     */
    @JsonProperty("criteria.speakInd")
    public void setCriteriaSpeakInd(String criteriaSpeakInd) {
        this.criteriaSpeakInd = criteriaSpeakInd;
    }

    public PersonSkills100PutRequest withCriteriaSpeakInd(String criteriaSpeakInd) {
        this.criteriaSpeakInd = criteriaSpeakInd;
        return this;
    }

    /**
     * Native Language
     * <p>
     * Lineage reference object : PPRSKIL_NATIVE_IND
     * 
     */
    @JsonProperty("criteria.nativeInd")
    public String getCriteriaNativeInd() {
        return criteriaNativeInd;
    }

    /**
     * Native Language
     * <p>
     * Lineage reference object : PPRSKIL_NATIVE_IND
     * 
     */
    @JsonProperty("criteria.nativeInd")
    public void setCriteriaNativeInd(String criteriaNativeInd) {
        this.criteriaNativeInd = criteriaNativeInd;
    }

    public PersonSkills100PutRequest withCriteriaNativeInd(String criteriaNativeInd) {
        this.criteriaNativeInd = criteriaNativeInd;
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

    public PersonSkills100PutRequest withStartDate(Date startDate) {
        this.startDate = startDate;
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

    public PersonSkills100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PersonSkills100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("criteriaEndDate");
        sb.append('=');
        sb.append(((this.criteriaEndDate == null)?"<null>":this.criteriaEndDate));
        sb.append(',');
        sb.append("criteriaSkilCode");
        sb.append('=');
        sb.append(((this.criteriaSkilCode == null)?"<null>":this.criteriaSkilCode));
        sb.append(',');
        sb.append("criteriaLastDate");
        sb.append('=');
        sb.append(((this.criteriaLastDate == null)?"<null>":this.criteriaLastDate));
        sb.append(',');
        sb.append("criteriaStartDate");
        sb.append('=');
        sb.append(((this.criteriaStartDate == null)?"<null>":this.criteriaStartDate));
        sb.append(',');
        sb.append("readInd");
        sb.append('=');
        sb.append(((this.readInd == null)?"<null>":this.readInd));
        sb.append(',');
        sb.append("transInd");
        sb.append('=');
        sb.append(((this.transInd == null)?"<null>":this.transInd));
        sb.append(',');
        sb.append("criteriaReadInd");
        sb.append('=');
        sb.append(((this.criteriaReadInd == null)?"<null>":this.criteriaReadInd));
        sb.append(',');
        sb.append("criteriaComments");
        sb.append('=');
        sb.append(((this.criteriaComments == null)?"<null>":this.criteriaComments));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("lastDate");
        sb.append('=');
        sb.append(((this.lastDate == null)?"<null>":this.lastDate));
        sb.append(',');
        sb.append("criteriaWriteInd");
        sb.append('=');
        sb.append(((this.criteriaWriteInd == null)?"<null>":this.criteriaWriteInd));
        sb.append(',');
        sb.append("sklvCode");
        sb.append('=');
        sb.append(((this.sklvCode == null)?"<null>":this.sklvCode));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("skilCode");
        sb.append('=');
        sb.append(((this.skilCode == null)?"<null>":this.skilCode));
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
        sb.append("criteriaTransInd");
        sb.append('=');
        sb.append(((this.criteriaTransInd == null)?"<null>":this.criteriaTransInd));
        sb.append(',');
        sb.append("writeInd");
        sb.append('=');
        sb.append(((this.writeInd == null)?"<null>":this.writeInd));
        sb.append(',');
        sb.append("criteriaSklvCode");
        sb.append('=');
        sb.append(((this.criteriaSklvCode == null)?"<null>":this.criteriaSklvCode));
        sb.append(',');
        sb.append("criteriaTeachInd");
        sb.append('=');
        sb.append(((this.criteriaTeachInd == null)?"<null>":this.criteriaTeachInd));
        sb.append(',');
        sb.append("criteriaSpeakInd");
        sb.append('=');
        sb.append(((this.criteriaSpeakInd == null)?"<null>":this.criteriaSpeakInd));
        sb.append(',');
        sb.append("criteriaNativeInd");
        sb.append('=');
        sb.append(((this.criteriaNativeInd == null)?"<null>":this.criteriaNativeInd));
        sb.append(',');
        sb.append("startDate");
        sb.append('=');
        sb.append(((this.startDate == null)?"<null>":this.startDate));
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
        result = ((result* 31)+((this.criteriaReadInd == null)? 0 :this.criteriaReadInd.hashCode()));
        result = ((result* 31)+((this.criteriaNativeInd == null)? 0 :this.criteriaNativeInd.hashCode()));
        result = ((result* 31)+((this.criteriaStartDate == null)? 0 :this.criteriaStartDate.hashCode()));
        result = ((result* 31)+((this.criteriaWriteInd == null)? 0 :this.criteriaWriteInd.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.readInd == null)? 0 :this.readInd.hashCode()));
        result = ((result* 31)+((this.transInd == null)? 0 :this.transInd.hashCode()));
        result = ((result* 31)+((this.criteriaComments == null)? 0 :this.criteriaComments.hashCode()));
        result = ((result* 31)+((this.criteriaEndDate == null)? 0 :this.criteriaEndDate.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.lastDate == null)? 0 :this.lastDate.hashCode()));
        result = ((result* 31)+((this.criteriaSpeakInd == null)? 0 :this.criteriaSpeakInd.hashCode()));
        result = ((result* 31)+((this.sklvCode == null)? 0 :this.sklvCode.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.criteriaLastDate == null)? 0 :this.criteriaLastDate.hashCode()));
        result = ((result* 31)+((this.skilCode == null)? 0 :this.skilCode.hashCode()));
        result = ((result* 31)+((this.criteriaSkilCode == null)? 0 :this.criteriaSkilCode.hashCode()));
        result = ((result* 31)+((this.teachInd == null)? 0 :this.teachInd.hashCode()));
        result = ((result* 31)+((this.speakInd == null)? 0 :this.speakInd.hashCode()));
        result = ((result* 31)+((this.nativeInd == null)? 0 :this.nativeInd.hashCode()));
        result = ((result* 31)+((this.writeInd == null)? 0 :this.writeInd.hashCode()));
        result = ((result* 31)+((this.criteriaTransInd == null)? 0 :this.criteriaTransInd.hashCode()));
        result = ((result* 31)+((this.criteriaSklvCode == null)? 0 :this.criteriaSklvCode.hashCode()));
        result = ((result* 31)+((this.criteriaTeachInd == null)? 0 :this.criteriaTeachInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.startDate == null)? 0 :this.startDate.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonSkills100PutRequest) == false) {
            return false;
        }
        PersonSkills100PutRequest rhs = ((PersonSkills100PutRequest) other);
        return (((((((((((((((((((((((((((this.criteriaReadInd == rhs.criteriaReadInd)||((this.criteriaReadInd!= null)&&this.criteriaReadInd.equals(rhs.criteriaReadInd)))&&((this.criteriaNativeInd == rhs.criteriaNativeInd)||((this.criteriaNativeInd!= null)&&this.criteriaNativeInd.equals(rhs.criteriaNativeInd))))&&((this.criteriaStartDate == rhs.criteriaStartDate)||((this.criteriaStartDate!= null)&&this.criteriaStartDate.equals(rhs.criteriaStartDate))))&&((this.criteriaWriteInd == rhs.criteriaWriteInd)||((this.criteriaWriteInd!= null)&&this.criteriaWriteInd.equals(rhs.criteriaWriteInd))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.readInd == rhs.readInd)||((this.readInd!= null)&&this.readInd.equals(rhs.readInd))))&&((this.transInd == rhs.transInd)||((this.transInd!= null)&&this.transInd.equals(rhs.transInd))))&&((this.criteriaComments == rhs.criteriaComments)||((this.criteriaComments!= null)&&this.criteriaComments.equals(rhs.criteriaComments))))&&((this.criteriaEndDate == rhs.criteriaEndDate)||((this.criteriaEndDate!= null)&&this.criteriaEndDate.equals(rhs.criteriaEndDate))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.lastDate == rhs.lastDate)||((this.lastDate!= null)&&this.lastDate.equals(rhs.lastDate))))&&((this.criteriaSpeakInd == rhs.criteriaSpeakInd)||((this.criteriaSpeakInd!= null)&&this.criteriaSpeakInd.equals(rhs.criteriaSpeakInd))))&&((this.sklvCode == rhs.sklvCode)||((this.sklvCode!= null)&&this.sklvCode.equals(rhs.sklvCode))))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.criteriaLastDate == rhs.criteriaLastDate)||((this.criteriaLastDate!= null)&&this.criteriaLastDate.equals(rhs.criteriaLastDate))))&&((this.skilCode == rhs.skilCode)||((this.skilCode!= null)&&this.skilCode.equals(rhs.skilCode))))&&((this.criteriaSkilCode == rhs.criteriaSkilCode)||((this.criteriaSkilCode!= null)&&this.criteriaSkilCode.equals(rhs.criteriaSkilCode))))&&((this.teachInd == rhs.teachInd)||((this.teachInd!= null)&&this.teachInd.equals(rhs.teachInd))))&&((this.speakInd == rhs.speakInd)||((this.speakInd!= null)&&this.speakInd.equals(rhs.speakInd))))&&((this.nativeInd == rhs.nativeInd)||((this.nativeInd!= null)&&this.nativeInd.equals(rhs.nativeInd))))&&((this.writeInd == rhs.writeInd)||((this.writeInd!= null)&&this.writeInd.equals(rhs.writeInd))))&&((this.criteriaTransInd == rhs.criteriaTransInd)||((this.criteriaTransInd!= null)&&this.criteriaTransInd.equals(rhs.criteriaTransInd))))&&((this.criteriaSklvCode == rhs.criteriaSklvCode)||((this.criteriaSklvCode!= null)&&this.criteriaSklvCode.equals(rhs.criteriaSklvCode))))&&((this.criteriaTeachInd == rhs.criteriaTeachInd)||((this.criteriaTeachInd!= null)&&this.criteriaTeachInd.equals(rhs.criteriaTeachInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.startDate == rhs.startDate)||((this.startDate!= null)&&this.startDate.equals(rhs.startDate))));
    }

}
