
package com.ellucian.generated.bpapi.ban.term_control_part_of_term_and_web_registration_controls.v1_0_0;

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
    "xxxxxxxTermCode",
    "copyBtn",
    "crnOneup"
})
@Generated("jsonschema2pojo")
public class TermControlPartOfTermAndWebRegistrationControls100QapiPost {

    @JsonProperty("xxxxxxxTermCode")
    private String xxxxxxxTermCode;
    @JsonProperty("copyBtn")
    private String copyBtn;
    @JsonProperty("crnOneup")
    private String crnOneup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("xxxxxxxTermCode")
    public String getXxxxxxxTermCode() {
        return xxxxxxxTermCode;
    }

    @JsonProperty("xxxxxxxTermCode")
    public void setXxxxxxxTermCode(String xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
    }

    public TermControlPartOfTermAndWebRegistrationControls100QapiPost withXxxxxxxTermCode(String xxxxxxxTermCode) {
        this.xxxxxxxTermCode = xxxxxxxTermCode;
        return this;
    }

    @JsonProperty("copyBtn")
    public String getCopyBtn() {
        return copyBtn;
    }

    @JsonProperty("copyBtn")
    public void setCopyBtn(String copyBtn) {
        this.copyBtn = copyBtn;
    }

    public TermControlPartOfTermAndWebRegistrationControls100QapiPost withCopyBtn(String copyBtn) {
        this.copyBtn = copyBtn;
        return this;
    }

    @JsonProperty("crnOneup")
    public String getCrnOneup() {
        return crnOneup;
    }

    @JsonProperty("crnOneup")
    public void setCrnOneup(String crnOneup) {
        this.crnOneup = crnOneup;
    }

    public TermControlPartOfTermAndWebRegistrationControls100QapiPost withCrnOneup(String crnOneup) {
        this.crnOneup = crnOneup;
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

    public TermControlPartOfTermAndWebRegistrationControls100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TermControlPartOfTermAndWebRegistrationControls100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("xxxxxxxTermCode");
        sb.append('=');
        sb.append(((this.xxxxxxxTermCode == null)?"<null>":this.xxxxxxxTermCode));
        sb.append(',');
        sb.append("copyBtn");
        sb.append('=');
        sb.append(((this.copyBtn == null)?"<null>":this.copyBtn));
        sb.append(',');
        sb.append("crnOneup");
        sb.append('=');
        sb.append(((this.crnOneup == null)?"<null>":this.crnOneup));
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
        result = ((result* 31)+((this.copyBtn == null)? 0 :this.copyBtn.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.crnOneup == null)? 0 :this.crnOneup.hashCode()));
        result = ((result* 31)+((this.xxxxxxxTermCode == null)? 0 :this.xxxxxxxTermCode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermControlPartOfTermAndWebRegistrationControls100QapiPost) == false) {
            return false;
        }
        TermControlPartOfTermAndWebRegistrationControls100QapiPost rhs = ((TermControlPartOfTermAndWebRegistrationControls100QapiPost) other);
        return (((((this.copyBtn == rhs.copyBtn)||((this.copyBtn!= null)&&this.copyBtn.equals(rhs.copyBtn)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.crnOneup == rhs.crnOneup)||((this.crnOneup!= null)&&this.crnOneup.equals(rhs.crnOneup))))&&((this.xxxxxxxTermCode == rhs.xxxxxxxTermCode)||((this.xxxxxxxTermCode!= null)&&this.xxxxxxxTermCode.equals(rhs.xxxxxxxTermCode))));
    }

}
