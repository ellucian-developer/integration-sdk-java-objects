
package com.ellucian.generated.bpapi.ban.student_registration_group.v1_0_0;

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
    "keyblocId",
    "keyblocTermCode",
    "priority",
    "beginDate",
    "endDate",
    "hourBegin",
    "hourEnd"
})
@Generated("jsonschema2pojo")
public class StudentRegistrationGroup100QapiPost {

    @JsonProperty("keyblocId")
    private String keyblocId;
    @JsonProperty("keyblocTermCode")
    private String keyblocTermCode;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("beginDate")
    private String beginDate;
    @JsonProperty("endDate")
    private String endDate;
    @JsonProperty("hourBegin")
    private String hourBegin;
    @JsonProperty("hourEnd")
    private String hourEnd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keyblocId")
    public String getKeyblocId() {
        return keyblocId;
    }

    @JsonProperty("keyblocId")
    public void setKeyblocId(String keyblocId) {
        this.keyblocId = keyblocId;
    }

    public StudentRegistrationGroup100QapiPost withKeyblocId(String keyblocId) {
        this.keyblocId = keyblocId;
        return this;
    }

    @JsonProperty("keyblocTermCode")
    public String getKeyblocTermCode() {
        return keyblocTermCode;
    }

    @JsonProperty("keyblocTermCode")
    public void setKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
    }

    public StudentRegistrationGroup100QapiPost withKeyblocTermCode(String keyblocTermCode) {
        this.keyblocTermCode = keyblocTermCode;
        return this;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public StudentRegistrationGroup100QapiPost withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    @JsonProperty("beginDate")
    public String getBeginDate() {
        return beginDate;
    }

    @JsonProperty("beginDate")
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public StudentRegistrationGroup100QapiPost withBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    @JsonProperty("endDate")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public StudentRegistrationGroup100QapiPost withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    @JsonProperty("hourBegin")
    public String getHourBegin() {
        return hourBegin;
    }

    @JsonProperty("hourBegin")
    public void setHourBegin(String hourBegin) {
        this.hourBegin = hourBegin;
    }

    public StudentRegistrationGroup100QapiPost withHourBegin(String hourBegin) {
        this.hourBegin = hourBegin;
        return this;
    }

    @JsonProperty("hourEnd")
    public String getHourEnd() {
        return hourEnd;
    }

    @JsonProperty("hourEnd")
    public void setHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
    }

    public StudentRegistrationGroup100QapiPost withHourEnd(String hourEnd) {
        this.hourEnd = hourEnd;
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

    public StudentRegistrationGroup100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentRegistrationGroup100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyblocId");
        sb.append('=');
        sb.append(((this.keyblocId == null)?"<null>":this.keyblocId));
        sb.append(',');
        sb.append("keyblocTermCode");
        sb.append('=');
        sb.append(((this.keyblocTermCode == null)?"<null>":this.keyblocTermCode));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("beginDate");
        sb.append('=');
        sb.append(((this.beginDate == null)?"<null>":this.beginDate));
        sb.append(',');
        sb.append("endDate");
        sb.append('=');
        sb.append(((this.endDate == null)?"<null>":this.endDate));
        sb.append(',');
        sb.append("hourBegin");
        sb.append('=');
        sb.append(((this.hourBegin == null)?"<null>":this.hourBegin));
        sb.append(',');
        sb.append("hourEnd");
        sb.append('=');
        sb.append(((this.hourEnd == null)?"<null>":this.hourEnd));
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
        result = ((result* 31)+((this.hourEnd == null)? 0 :this.hourEnd.hashCode()));
        result = ((result* 31)+((this.beginDate == null)? 0 :this.beginDate.hashCode()));
        result = ((result* 31)+((this.endDate == null)? 0 :this.endDate.hashCode()));
        result = ((result* 31)+((this.keyblocTermCode == null)? 0 :this.keyblocTermCode.hashCode()));
        result = ((result* 31)+((this.hourBegin == null)? 0 :this.hourBegin.hashCode()));
        result = ((result* 31)+((this.keyblocId == null)? 0 :this.keyblocId.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentRegistrationGroup100QapiPost) == false) {
            return false;
        }
        StudentRegistrationGroup100QapiPost rhs = ((StudentRegistrationGroup100QapiPost) other);
        return (((((((((this.hourEnd == rhs.hourEnd)||((this.hourEnd!= null)&&this.hourEnd.equals(rhs.hourEnd)))&&((this.beginDate == rhs.beginDate)||((this.beginDate!= null)&&this.beginDate.equals(rhs.beginDate))))&&((this.endDate == rhs.endDate)||((this.endDate!= null)&&this.endDate.equals(rhs.endDate))))&&((this.keyblocTermCode == rhs.keyblocTermCode)||((this.keyblocTermCode!= null)&&this.keyblocTermCode.equals(rhs.keyblocTermCode))))&&((this.hourBegin == rhs.hourBegin)||((this.hourBegin!= null)&&this.hourBegin.equals(rhs.hourBegin))))&&((this.keyblocId == rhs.keyblocId)||((this.keyblocId!= null)&&this.keyblocId.equals(rhs.keyblocId))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))));
    }

}
