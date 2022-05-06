
package com.ellucian.generated.bpapi.ban.document_approval_history.v1_0_0;

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
    "fobapphQueueId",
    "fobapphActivityDate",
    "fobapphQueueLevel",
    "userName"
})
@Generated("jsonschema2pojo")
public class Fobapph2 {

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FOBAPPH_QUEUE_ID
     * 
     */
    @JsonProperty("fobapphQueueId")
    @JsonPropertyDescription("Lineage reference object : FOBAPPH_QUEUE_ID")
    private String fobapphQueueId;
    /**
     * Approved Date
     * <p>
     * Lineage reference object : FOBAPPH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("fobapphActivityDate")
    @JsonPropertyDescription("Lineage reference object : FOBAPPH_ACTIVITY_DATE")
    private Date fobapphActivityDate;
    /**
     * Level
     * <p>
     * Lineage reference object : FOBAPPH_QUEUE_LEVEL
     * 
     */
    @JsonProperty("fobapphQueueLevel")
    @JsonPropertyDescription("Lineage reference object : FOBAPPH_QUEUE_LEVEL")
    private Double fobapphQueueLevel;
    /**
     * Approver's Name
     * <p>
     * 
     * 
     */
    @JsonProperty("userName")
    private String userName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FOBAPPH_QUEUE_ID
     * 
     */
    @JsonProperty("fobapphQueueId")
    public String getFobapphQueueId() {
        return fobapphQueueId;
    }

    /**
     * Queue ID
     * <p>
     * Lineage reference object : FOBAPPH_QUEUE_ID
     * 
     */
    @JsonProperty("fobapphQueueId")
    public void setFobapphQueueId(String fobapphQueueId) {
        this.fobapphQueueId = fobapphQueueId;
    }

    public Fobapph2 withFobapphQueueId(String fobapphQueueId) {
        this.fobapphQueueId = fobapphQueueId;
        return this;
    }

    /**
     * Approved Date
     * <p>
     * Lineage reference object : FOBAPPH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("fobapphActivityDate")
    public Date getFobapphActivityDate() {
        return fobapphActivityDate;
    }

    /**
     * Approved Date
     * <p>
     * Lineage reference object : FOBAPPH_ACTIVITY_DATE
     * 
     */
    @JsonProperty("fobapphActivityDate")
    public void setFobapphActivityDate(Date fobapphActivityDate) {
        this.fobapphActivityDate = fobapphActivityDate;
    }

    public Fobapph2 withFobapphActivityDate(Date fobapphActivityDate) {
        this.fobapphActivityDate = fobapphActivityDate;
        return this;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : FOBAPPH_QUEUE_LEVEL
     * 
     */
    @JsonProperty("fobapphQueueLevel")
    public Double getFobapphQueueLevel() {
        return fobapphQueueLevel;
    }

    /**
     * Level
     * <p>
     * Lineage reference object : FOBAPPH_QUEUE_LEVEL
     * 
     */
    @JsonProperty("fobapphQueueLevel")
    public void setFobapphQueueLevel(Double fobapphQueueLevel) {
        this.fobapphQueueLevel = fobapphQueueLevel;
    }

    public Fobapph2 withFobapphQueueLevel(Double fobapphQueueLevel) {
        this.fobapphQueueLevel = fobapphQueueLevel;
        return this;
    }

    /**
     * Approver's Name
     * <p>
     * 
     * 
     */
    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    /**
     * Approver's Name
     * <p>
     * 
     * 
     */
    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Fobapph2 withUserName(String userName) {
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

    public Fobapph2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fobapph2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fobapphQueueId");
        sb.append('=');
        sb.append(((this.fobapphQueueId == null)?"<null>":this.fobapphQueueId));
        sb.append(',');
        sb.append("fobapphActivityDate");
        sb.append('=');
        sb.append(((this.fobapphActivityDate == null)?"<null>":this.fobapphActivityDate));
        sb.append(',');
        sb.append("fobapphQueueLevel");
        sb.append('=');
        sb.append(((this.fobapphQueueLevel == null)?"<null>":this.fobapphQueueLevel));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.userName == null)? 0 :this.userName.hashCode()));
        result = ((result* 31)+((this.fobapphQueueId == null)? 0 :this.fobapphQueueId.hashCode()));
        result = ((result* 31)+((this.fobapphActivityDate == null)? 0 :this.fobapphActivityDate.hashCode()));
        result = ((result* 31)+((this.fobapphQueueLevel == null)? 0 :this.fobapphQueueLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fobapph2) == false) {
            return false;
        }
        Fobapph2 rhs = ((Fobapph2) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.userName == rhs.userName)||((this.userName!= null)&&this.userName.equals(rhs.userName))))&&((this.fobapphQueueId == rhs.fobapphQueueId)||((this.fobapphQueueId!= null)&&this.fobapphQueueId.equals(rhs.fobapphQueueId))))&&((this.fobapphActivityDate == rhs.fobapphActivityDate)||((this.fobapphActivityDate!= null)&&this.fobapphActivityDate.equals(rhs.fobapphActivityDate))))&&((this.fobapphQueueLevel == rhs.fobapphQueueLevel)||((this.fobapphQueueLevel!= null)&&this.fobapphQueueLevel.equals(rhs.fobapphQueueLevel))));
    }

}
