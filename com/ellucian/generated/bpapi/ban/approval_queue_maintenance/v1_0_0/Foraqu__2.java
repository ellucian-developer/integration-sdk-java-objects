
package com.ellucian.generated.bpapi.ban.approval_queue_maintenance.v1_0_0;

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
    "queueLimit",
    "effDate",
    "queueLevel",
    "userIdAppr",
    "nchgDate",
    "termDate",
    "userName"
})
@Generated("jsonschema2pojo")
public class Foraqu__2 {

    /**
     * Approval Limit
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    @JsonPropertyDescription("Lineage reference object : FORAQUS_QUEUE_LIMIT")
    private Double queueLimit;
    /**
     * Effective Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    private Date effDate;
    /**
     * Level
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LEVEL
     * (Required)
     * 
     */
    @JsonProperty("queueLevel")
    @JsonPropertyDescription("Lineage reference object : FORAQUS_QUEUE_LEVEL")
    private Double queueLevel;
    /**
     * User ID
     * <p>
     * Lineage reference object : FORAQUS_USER_ID_APPR
     * (Required)
     * 
     */
    @JsonProperty("userIdAppr")
    @JsonPropertyDescription("Lineage reference object : FORAQUS_USER_ID_APPR")
    private String userIdAppr;
    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nchgDate")
    private Date nchgDate;
    /**
     * Termination Date
     * <p>
     * 
     * 
     */
    @JsonProperty("termDate")
    private Date termDate;
    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("userName")
    private String userName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Approval Limit
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    public Double getQueueLimit() {
        return queueLimit;
    }

    /**
     * Approval Limit
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LIMIT
     * 
     */
    @JsonProperty("queueLimit")
    public void setQueueLimit(Double queueLimit) {
        this.queueLimit = queueLimit;
    }

    public Foraqu__2 withQueueLimit(Double queueLimit) {
        this.queueLimit = queueLimit;
        return this;
    }

    /**
     * Effective Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public Date getEffDate() {
        return effDate;
    }

    /**
     * Effective Date
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("effDate")
    public void setEffDate(Date effDate) {
        this.effDate = effDate;
    }

    public Foraqu__2 withEffDate(Date effDate) {
        this.effDate = effDate;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LEVEL
     * (Required)
     * 
     */
    @JsonProperty("queueLevel")
    public Double getQueueLevel() {
        return queueLevel;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : FORAQUS_QUEUE_LEVEL
     * (Required)
     * 
     */
    @JsonProperty("queueLevel")
    public void setQueueLevel(Double queueLevel) {
        this.queueLevel = queueLevel;
    }

    public Foraqu__2 withQueueLevel(Double queueLevel) {
        this.queueLevel = queueLevel;
        return this;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FORAQUS_USER_ID_APPR
     * (Required)
     * 
     */
    @JsonProperty("userIdAppr")
    public String getUserIdAppr() {
        return userIdAppr;
    }

    /**
     * User ID
     * <p>
     * Lineage reference object : FORAQUS_USER_ID_APPR
     * (Required)
     * 
     */
    @JsonProperty("userIdAppr")
    public void setUserIdAppr(String userIdAppr) {
        this.userIdAppr = userIdAppr;
    }

    public Foraqu__2 withUserIdAppr(String userIdAppr) {
        this.userIdAppr = userIdAppr;
        return this;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nchgDate")
    public Date getNchgDate() {
        return nchgDate;
    }

    /**
     * Next Change Date
     * <p>
     * 
     * 
     */
    @JsonProperty("nchgDate")
    public void setNchgDate(Date nchgDate) {
        this.nchgDate = nchgDate;
    }

    public Foraqu__2 withNchgDate(Date nchgDate) {
        this.nchgDate = nchgDate;
        return this;
    }

    /**
     * Termination Date
     * <p>
     * 
     * 
     */
    @JsonProperty("termDate")
    public Date getTermDate() {
        return termDate;
    }

    /**
     * Termination Date
     * <p>
     * 
     * 
     */
    @JsonProperty("termDate")
    public void setTermDate(Date termDate) {
        this.termDate = termDate;
    }

    public Foraqu__2 withTermDate(Date termDate) {
        this.termDate = termDate;
        return this;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Name
     * <p>
     * 
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Foraqu__2 withUserName(String userName) {
        this.userName = userName;
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

    public Foraqu__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Foraqu__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("queueLimit");
        sb.append('=');
        sb.append(((this.queueLimit == null)?"<null>":this.queueLimit));
        sb.append(',');
        sb.append("effDate");
        sb.append('=');
        sb.append(((this.effDate == null)?"<null>":this.effDate));
        sb.append(',');
        sb.append("queueLevel");
        sb.append('=');
        sb.append(((this.queueLevel == null)?"<null>":this.queueLevel));
        sb.append(',');
        sb.append("userIdAppr");
        sb.append('=');
        sb.append(((this.userIdAppr == null)?"<null>":this.userIdAppr));
        sb.append(',');
        sb.append("nchgDate");
        sb.append('=');
        sb.append(((this.nchgDate == null)?"<null>":this.nchgDate));
        sb.append(',');
        sb.append("termDate");
        sb.append('=');
        sb.append(((this.termDate == null)?"<null>":this.termDate));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
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
        result = ((result* 31)+((this.queueLimit == null)? 0 :this.queueLimit.hashCode()));
        result = ((result* 31)+((this.effDate == null)? 0 :this.effDate.hashCode()));
        result = ((result* 31)+((this.queueLevel == null)? 0 :this.queueLevel.hashCode()));
        result = ((result* 31)+((this.userIdAppr == null)? 0 :this.userIdAppr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nchgDate == null)? 0 :this.nchgDate.hashCode()));
        result = ((result* 31)+((this.termDate == null)? 0 :this.termDate.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Foraqu__2) == false) {
            return false;
        }
        Foraqu__2 rhs = ((Foraqu__2) other);
        return (((((((((this.queueLimit == rhs.queueLimit)||((this.queueLimit!= null)&&this.queueLimit.equals(rhs.queueLimit)))&&((this.effDate == rhs.effDate)||((this.effDate!= null)&&this.effDate.equals(rhs.effDate))))&&((this.queueLevel == rhs.queueLevel)||((this.queueLevel!= null)&&this.queueLevel.equals(rhs.queueLevel))))&&((this.userIdAppr == rhs.userIdAppr)||((this.userIdAppr!= null)&&this.userIdAppr.equals(rhs.userIdAppr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nchgDate == rhs.nchgDate)||((this.nchgDate!= null)&&this.nchgDate.equals(rhs.nchgDate))))&&((this.termDate == rhs.termDate)||((this.termDate!= null)&&this.termDate.equals(rhs.termDate))))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))));
    }

}
