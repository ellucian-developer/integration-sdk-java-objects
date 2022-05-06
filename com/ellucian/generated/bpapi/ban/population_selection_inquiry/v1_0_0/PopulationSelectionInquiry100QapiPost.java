
package com.ellucian.generated.bpapi.ban.population_selection_inquiry.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keyblckApplication",
    "selection",
    "desc",
    "creatorId",
    "lockInd",
    "typeInd",
    "activityDate"
})
@Generated("jsonschema2pojo")
public class PopulationSelectionInquiry100QapiPost {

    @JsonProperty("keyblckApplication")
    private String keyblckApplication;
    @JsonProperty("selection")
    private String selection;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("creatorId")
    private String creatorId;
    @JsonProperty("lockInd")
    private String lockInd;
    @JsonProperty("typeInd")
    private String typeInd;
    @JsonProperty("activityDate")
    private String activityDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblckApplication")
    public String getKeyblckApplication() {
        return keyblckApplication;
    }

    @JsonProperty("keyblckApplication")
    public void setKeyblckApplication(String keyblckApplication) {
        this.keyblckApplication = keyblckApplication;
    }

    public PopulationSelectionInquiry100QapiPost withKeyblckApplication(String keyblckApplication) {
        this.keyblckApplication = keyblckApplication;
        return this;
    }

    @JsonProperty("selection")
    public String getSelection() {
        return selection;
    }

    @JsonProperty("selection")
    public void setSelection(String selection) {
        this.selection = selection;
    }

    public PopulationSelectionInquiry100QapiPost withSelection(String selection) {
        this.selection = selection;
        return this;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public PopulationSelectionInquiry100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @JsonProperty("creatorId")
    public String getCreatorId() {
        return creatorId;
    }

    @JsonProperty("creatorId")
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public PopulationSelectionInquiry100QapiPost withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    @JsonProperty("lockInd")
    public String getLockInd() {
        return lockInd;
    }

    @JsonProperty("lockInd")
    public void setLockInd(String lockInd) {
        this.lockInd = lockInd;
    }

    public PopulationSelectionInquiry100QapiPost withLockInd(String lockInd) {
        this.lockInd = lockInd;
        return this;
    }

    @JsonProperty("typeInd")
    public String getTypeInd() {
        return typeInd;
    }

    @JsonProperty("typeInd")
    public void setTypeInd(String typeInd) {
        this.typeInd = typeInd;
    }

    public PopulationSelectionInquiry100QapiPost withTypeInd(String typeInd) {
        this.typeInd = typeInd;
        return this;
    }

    @JsonProperty("activityDate")
    public String getActivityDate() {
        return activityDate;
    }

    @JsonProperty("activityDate")
    public void setActivityDate(String activityDate) {
        this.activityDate = activityDate;
    }

    public PopulationSelectionInquiry100QapiPost withActivityDate(String activityDate) {
        this.activityDate = activityDate;
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

    public PopulationSelectionInquiry100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PopulationSelectionInquiry100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblckApplication");
        sb.append('=');
        sb.append(((this.keyblckApplication == null)?"<null>":this.keyblckApplication));
        sb.append(',');
        sb.append("selection");
        sb.append('=');
        sb.append(((this.selection == null)?"<null>":this.selection));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("creatorId");
        sb.append('=');
        sb.append(((this.creatorId == null)?"<null>":this.creatorId));
        sb.append(',');
        sb.append("lockInd");
        sb.append('=');
        sb.append(((this.lockInd == null)?"<null>":this.lockInd));
        sb.append(',');
        sb.append("typeInd");
        sb.append('=');
        sb.append(((this.typeInd == null)?"<null>":this.typeInd));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
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
        result = ((result* 31)+((this.typeInd == null)? 0 :this.typeInd.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.selection == null)? 0 :this.selection.hashCode()));
        result = ((result* 31)+((this.keyblckApplication == null)? 0 :this.keyblckApplication.hashCode()));
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
        if ((other instanceof PopulationSelectionInquiry100QapiPost) == false) {
            return false;
        }
        PopulationSelectionInquiry100QapiPost rhs = ((PopulationSelectionInquiry100QapiPost) other);
        return (((((((((this.typeInd == rhs.typeInd)||((this.typeInd!= null)&&this.typeInd.equals(rhs.typeInd)))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.selection == rhs.selection)||((this.selection!= null)&&this.selection.equals(rhs.selection))))&&((this.keyblckApplication == rhs.keyblckApplication)||((this.keyblckApplication!= null)&&this.keyblckApplication.equals(rhs.keyblckApplication))))&&((this.creatorId == rhs.creatorId)||((this.creatorId!= null)&&this.creatorId.equals(rhs.creatorId))))&&((this.lockInd == rhs.lockInd)||((this.lockInd!= null)&&this.lockInd.equals(rhs.lockInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
