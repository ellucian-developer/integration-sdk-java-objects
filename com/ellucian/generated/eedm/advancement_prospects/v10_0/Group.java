
package com.ellucian.generated.eedm.advancement_prospects.v10_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "groupType",
    "college",
    "targetGiftLevel",
    "startOn",
    "endOn"
})
@Generated("jsonschema2pojo")
public class Group {

    /**
     * Group Type
     * <p>
     * The type of group.
     * (Required)
     * 
     */
    @JsonProperty("groupType")
    @JsonPropertyDescription("The type of group.")
    private GroupType groupType;
    /**
     * College
     * <p>
     * The college or institutional unit associated with the prospect.
     * 
     */
    @JsonProperty("college")
    @JsonPropertyDescription("The college or institutional unit associated with the prospect.")
    private Object college;
    /**
     * Target Gift Level
     * <p>
     * The target gift level associated with the group.
     * 
     */
    @JsonProperty("targetGiftLevel")
    @JsonPropertyDescription("The target gift level associated with the group.")
    private Object targetGiftLevel;
    /**
     * Start On
     * <p>
     * The date the group was assigned to the prospect.
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The date the group was assigned to the prospect.")
    private Object startOn;
    /**
     * End On
     * <p>
     * The last date the group was assigned to the prospect.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date the group was assigned to the prospect.")
    private Object endOn;

    /**
     * Group Type
     * <p>
     * The type of group.
     * (Required)
     * 
     */
    @JsonProperty("groupType")
    public GroupType getGroupType() {
        return groupType;
    }

    /**
     * Group Type
     * <p>
     * The type of group.
     * (Required)
     * 
     */
    @JsonProperty("groupType")
    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    public Group withGroupType(GroupType groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * College
     * <p>
     * The college or institutional unit associated with the prospect.
     * 
     */
    @JsonProperty("college")
    public Object getCollege() {
        return college;
    }

    /**
     * College
     * <p>
     * The college or institutional unit associated with the prospect.
     * 
     */
    @JsonProperty("college")
    public void setCollege(Object college) {
        this.college = college;
    }

    public Group withCollege(Object college) {
        this.college = college;
        return this;
    }

    /**
     * Target Gift Level
     * <p>
     * The target gift level associated with the group.
     * 
     */
    @JsonProperty("targetGiftLevel")
    public Object getTargetGiftLevel() {
        return targetGiftLevel;
    }

    /**
     * Target Gift Level
     * <p>
     * The target gift level associated with the group.
     * 
     */
    @JsonProperty("targetGiftLevel")
    public void setTargetGiftLevel(Object targetGiftLevel) {
        this.targetGiftLevel = targetGiftLevel;
    }

    public Group withTargetGiftLevel(Object targetGiftLevel) {
        this.targetGiftLevel = targetGiftLevel;
        return this;
    }

    /**
     * Start On
     * <p>
     * The date the group was assigned to the prospect.
     * 
     */
    @JsonProperty("startOn")
    public Object getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The date the group was assigned to the prospect.
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(Object startOn) {
        this.startOn = startOn;
    }

    public Group withStartOn(Object startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date the group was assigned to the prospect.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date the group was assigned to the prospect.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Group withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Group.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("groupType");
        sb.append('=');
        sb.append(((this.groupType == null)?"<null>":this.groupType));
        sb.append(',');
        sb.append("college");
        sb.append('=');
        sb.append(((this.college == null)?"<null>":this.college));
        sb.append(',');
        sb.append("targetGiftLevel");
        sb.append('=');
        sb.append(((this.targetGiftLevel == null)?"<null>":this.targetGiftLevel));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
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
        result = ((result* 31)+((this.college == null)? 0 :this.college.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.groupType == null)? 0 :this.groupType.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.targetGiftLevel == null)? 0 :this.targetGiftLevel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Group) == false) {
            return false;
        }
        Group rhs = ((Group) other);
        return ((((((this.college == rhs.college)||((this.college!= null)&&this.college.equals(rhs.college)))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.groupType == rhs.groupType)||((this.groupType!= null)&&this.groupType.equals(rhs.groupType))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.targetGiftLevel == rhs.targetGiftLevel)||((this.targetGiftLevel!= null)&&this.targetGiftLevel.equals(rhs.targetGiftLevel))));
    }

}
