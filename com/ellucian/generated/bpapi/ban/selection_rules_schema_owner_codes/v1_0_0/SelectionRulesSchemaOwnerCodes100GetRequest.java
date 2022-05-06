
package com.ellucian.generated.bpapi.ban.selection_rules_schema_owner_codes.v1_0_0;

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
    "activityDate",
    "schemaOwner",
    "sysReqInd",
    "comment"
})
@Generated("jsonschema2pojo")
public class SelectionRulesSchemaOwnerCodes100GetRequest {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVRULO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : RTVRULO_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Schema Owner
     * <p>
     * Lineage reference object : RTVRULO_SCHEMA_OWNER
     * (Required)
     * 
     */
    @JsonProperty("schemaOwner")
    @JsonPropertyDescription("Lineage reference object : RTVRULO_SCHEMA_OWNER")
    private String schemaOwner;
    /**
     * Lineage reference object : RTVRULO_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    @JsonPropertyDescription("Lineage reference object : RTVRULO_SYS_REQ_IND")
    private String sysReqInd;
    /**
     * Comment
     * <p>
     * Lineage reference object : RTVRULO_COMMENT
     * 
     */
    @JsonProperty("comment")
    @JsonPropertyDescription("Lineage reference object : RTVRULO_COMMENT")
    private String comment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVRULO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : RTVRULO_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public SelectionRulesSchemaOwnerCodes100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Schema Owner
     * <p>
     * Lineage reference object : RTVRULO_SCHEMA_OWNER
     * (Required)
     * 
     */
    @JsonProperty("schemaOwner")
    public String getSchemaOwner() {
        return schemaOwner;
    }

    /**
     * Schema Owner
     * <p>
     * Lineage reference object : RTVRULO_SCHEMA_OWNER
     * (Required)
     * 
     */
    @JsonProperty("schemaOwner")
    public void setSchemaOwner(String schemaOwner) {
        this.schemaOwner = schemaOwner;
    }

    public SelectionRulesSchemaOwnerCodes100GetRequest withSchemaOwner(String schemaOwner) {
        this.schemaOwner = schemaOwner;
        return this;
    }

    /**
     * Lineage reference object : RTVRULO_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    public String getSysReqInd() {
        return sysReqInd;
    }

    /**
     * Lineage reference object : RTVRULO_SYS_REQ_IND
     * 
     */
    @JsonProperty("sysReqInd")
    public void setSysReqInd(String sysReqInd) {
        this.sysReqInd = sysReqInd;
    }

    public SelectionRulesSchemaOwnerCodes100GetRequest withSysReqInd(String sysReqInd) {
        this.sysReqInd = sysReqInd;
        return this;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : RTVRULO_COMMENT
     * 
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * Comment
     * <p>
     * Lineage reference object : RTVRULO_COMMENT
     * 
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public SelectionRulesSchemaOwnerCodes100GetRequest withComment(String comment) {
        this.comment = comment;
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

    public SelectionRulesSchemaOwnerCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SelectionRulesSchemaOwnerCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("schemaOwner");
        sb.append('=');
        sb.append(((this.schemaOwner == null)?"<null>":this.schemaOwner));
        sb.append(',');
        sb.append("sysReqInd");
        sb.append('=');
        sb.append(((this.sysReqInd == null)?"<null>":this.sysReqInd));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null)?"<null>":this.comment));
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
        result = ((result* 31)+((this.comment == null)? 0 :this.comment.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.schemaOwner == null)? 0 :this.schemaOwner.hashCode()));
        result = ((result* 31)+((this.sysReqInd == null)? 0 :this.sysReqInd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SelectionRulesSchemaOwnerCodes100GetRequest) == false) {
            return false;
        }
        SelectionRulesSchemaOwnerCodes100GetRequest rhs = ((SelectionRulesSchemaOwnerCodes100GetRequest) other);
        return ((((((this.comment == rhs.comment)||((this.comment!= null)&&this.comment.equals(rhs.comment)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.schemaOwner == rhs.schemaOwner)||((this.schemaOwner!= null)&&this.schemaOwner.equals(rhs.schemaOwner))))&&((this.sysReqInd == rhs.sysReqInd)||((this.sysReqInd!= null)&&this.sysReqInd.equals(rhs.sysReqInd))));
    }

}
