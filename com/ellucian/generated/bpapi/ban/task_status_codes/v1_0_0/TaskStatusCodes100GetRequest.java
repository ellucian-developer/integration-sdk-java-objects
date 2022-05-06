
package com.ellucian.generated.bpapi.ban.task_status_codes.v1_0_0;

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
    "code",
    "complInd",
    "desc"
})
@Generated("jsonschema2pojo")
public class TaskStatusCodes100GetRequest {

    /**
     * Status
     * <p>
     * Lineage reference object : GTVTSTA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : GTVTSTA_CODE")
    private String code;
    /**
     * Lineage reference object : GTVTSTA_COMPL_IND
     * 
     */
    @JsonProperty("complInd")
    @JsonPropertyDescription("Lineage reference object : GTVTSTA_COMPL_IND")
    private String complInd;
    /**
     * Description
     * <p>
     * Lineage reference object : GTVTSTA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : GTVTSTA_DESC")
    private String desc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Status
     * <p>
     * Lineage reference object : GTVTSTA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : GTVTSTA_CODE
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public TaskStatusCodes100GetRequest withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Lineage reference object : GTVTSTA_COMPL_IND
     * 
     */
    @JsonProperty("complInd")
    public String getComplInd() {
        return complInd;
    }

    /**
     * Lineage reference object : GTVTSTA_COMPL_IND
     * 
     */
    @JsonProperty("complInd")
    public void setComplInd(String complInd) {
        this.complInd = complInd;
    }

    public TaskStatusCodes100GetRequest withComplInd(String complInd) {
        this.complInd = complInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVTSTA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : GTVTSTA_DESC
     * (Required)
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public TaskStatusCodes100GetRequest withDesc(String desc) {
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

    public TaskStatusCodes100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TaskStatusCodes100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("complInd");
        sb.append('=');
        sb.append(((this.complInd == null)?"<null>":this.complInd));
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
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.complInd == null)? 0 :this.complInd.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskStatusCodes100GetRequest) == false) {
            return false;
        }
        TaskStatusCodes100GetRequest rhs = ((TaskStatusCodes100GetRequest) other);
        return (((((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.complInd == rhs.complInd)||((this.complInd!= null)&&this.complInd.equals(rhs.complInd))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
