
package com.ellucian.generated.bpapi.ban.population_selection_inquiry.v1_0_0;

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
    "typeInd",
    "selection",
    "creatorId",
    "lockInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class Glbslct {

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GLBSLCT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : GLBSLCT_ACTIVITY_DATE")
    private Date activityDate;
    /**
     * Lineage reference object : GLBSLCT_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    @JsonPropertyDescription("Lineage reference object : GLBSLCT_TYPE_IND")
    private String typeInd;
    /**
     * Selection ID
     * <p>
     * Lineage reference object : GLBSLCT_SELECTION
     * 
     */
    @JsonProperty("selection")
    @JsonPropertyDescription("Lineage reference object : GLBSLCT_SELECTION")
    private String selection;
    /**
     * Creator
     * <p>
     * Lineage reference object : GLBSLCT_CREATOR_ID
     * 
     */
    @JsonProperty("creatorId")
    @JsonPropertyDescription("Lineage reference object : GLBSLCT_CREATOR_ID")
    private String creatorId;
    /**
     * Lineage reference object : GLBSLCT_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    @JsonPropertyDescription("Lineage reference object : GLBSLCT_LOCK_IND")
    private String lockInd;
    /**
     * Description
     * <p>
     * Lineage reference object : GLBSLCT_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GLBSLCT_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GLBSLCT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Activity Date
     * <p>
     * Lineage reference object : GLBSLCT_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public Glbslct withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    /**
     * Lineage reference object : GLBSLCT_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    /**
     * Lineage reference object : GLBSLCT_TYPE_IND
     * 
     */
    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public Glbslct withTypeInd(String typeInd) {
        this.typeInd = typeInd;
        return this;
    }

    /**
     * Selection ID
     * <p>
     * Lineage reference object : GLBSLCT_SELECTION
     * 
     */
    @JsonProperty("selection")
    public String getSelection() {
        return selection;
    }

    /**
     * Selection ID
     * <p>
     * Lineage reference object : GLBSLCT_SELECTION
     * 
     */
    @JsonProperty("selection")
    public void setSelection(String selection) {
        this.selection = selection;
    }

    public Glbslct withSelection(String selection) {
        this.selection = selection;
        return this;
    }

    /**
     * Creator
     * <p>
     * Lineage reference object : GLBSLCT_CREATOR_ID
     * 
     */
    @JsonProperty("creatorId")
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * Creator
     * <p>
     * Lineage reference object : GLBSLCT_CREATOR_ID
     * 
     */
    @JsonProperty("creatorId")
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Glbslct withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * Lineage reference object : GLBSLCT_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    public String getLockInd() {
        return lockInd;
    }

    /**
     * Lineage reference object : GLBSLCT_LOCK_IND
     * 
     */
    @JsonProperty("lockInd")
    public void setLockInd(String lockInd) {
        this.lockInd = lockInd;
    }

    public Glbslct withLockInd(String lockInd) {
        this.lockInd = lockInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GLBSLCT_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GLBSLCT_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Glbslct withDesc(String desc) {
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

    public Glbslct withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Glbslct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("selection");
        sb.append('=');
        sb.append(((this.selection == null)?"<null>":this.selection));
        sb.append(',');
        sb.append("creatorId");
        sb.append('=');
        sb.append(((this.creatorId == null)?"<null>":this.creatorId));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
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
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.selection == null)? 0 :this.selection.hashCode()));
        result = ((result* 31)+((this.creatorId == null)? 0 :this.creatorId.hashCode()));
        result = ((result* 31)+((this.lockInd == null)? 0 :this.lockInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Glbslct) == false) {
            return false;
        }
        Glbslct rhs = ((Glbslct) other);
        return ((((((((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate)))&&((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd))))&&((this.selection == rhs.selection)||((this.selection!= null)&&this.selection.equals(rhs.selection))))&&((this.creatorId == rhs.creatorId)||((this.creatorId!= null)&&this.creatorId.equals(rhs.creatorId))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
