
package com.ellucian.generated.bpapi.ban.program_hierarchy.v1_0_0;

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
    "coasCode",
    "progCode",
    "progTitle",
    "effDateYmdhms",
    "progCodePredTitle",
    "progCodePred"
})
@Generated("jsonschema2pojo")
public class ProgramHierarchy100QapiPost {

    @JsonProperty("coasCode")
    private String coasCode;
    @JsonProperty("progCode")
    private String progCode;
    @JsonProperty("progTitle")
    private String progTitle;
    @JsonProperty("effDateYmdhms")
    private String effDateYmdhms;
    @JsonProperty("progCodePredTitle")
    private String progCodePredTitle;
    @JsonProperty("progCodePred")
    private String progCodePred;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("coasCode")
    public String getCoasCode() {
        return coasCode;
    }

    @JsonProperty("coasCode")
    public void setCoasCode(String coasCode) {
        this.coasCode = coasCode;
    }

    public ProgramHierarchy100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("progCode")
    public String getProgCode() {
        return progCode;
    }

    @JsonProperty("progCode")
    public void setProgCode(String progCode) {
        this.progCode = progCode;
    }

    public ProgramHierarchy100QapiPost withProgCode(String progCode) {
        this.progCode = progCode;
        return this;
    }

    @JsonProperty("progTitle")
    public String getProgTitle() {
        return progTitle;
    }

    @JsonProperty("progTitle")
    public void setProgTitle(String progTitle) {
        this.progTitle = progTitle;
    }

    public ProgramHierarchy100QapiPost withProgTitle(String progTitle) {
        this.progTitle = progTitle;
        return this;
    }

    @JsonProperty("effDateYmdhms")
    public String getEffDateYmdhms() {
        return effDateYmdhms;
    }

    @JsonProperty("effDateYmdhms")
    public void setEffDateYmdhms(String effDateYmdhms) {
        this.effDateYmdhms = effDateYmdhms;
    }

    public ProgramHierarchy100QapiPost withEffDateYmdhms(String effDateYmdhms) {
        this.effDateYmdhms = effDateYmdhms;
        return this;
    }

    @JsonProperty("progCodePredTitle")
    public String getProgCodePredTitle() {
        return progCodePredTitle;
    }

    @JsonProperty("progCodePredTitle")
    public void setProgCodePredTitle(String progCodePredTitle) {
        this.progCodePredTitle = progCodePredTitle;
    }

    public ProgramHierarchy100QapiPost withProgCodePredTitle(String progCodePredTitle) {
        this.progCodePredTitle = progCodePredTitle;
        return this;
    }

    @JsonProperty("progCodePred")
    public String getProgCodePred() {
        return progCodePred;
    }

    @JsonProperty("progCodePred")
    public void setProgCodePred(String progCodePred) {
        this.progCodePred = progCodePred;
    }

    public ProgramHierarchy100QapiPost withProgCodePred(String progCodePred) {
        this.progCodePred = progCodePred;
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

    public ProgramHierarchy100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProgramHierarchy100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("progCode");
        sb.append('=');
        sb.append(((this.progCode == null)?"<null>":this.progCode));
        sb.append(',');
        sb.append("progTitle");
        sb.append('=');
        sb.append(((this.progTitle == null)?"<null>":this.progTitle));
        sb.append(',');
        sb.append("effDateYmdhms");
        sb.append('=');
        sb.append(((this.effDateYmdhms == null)?"<null>":this.effDateYmdhms));
        sb.append(',');
        sb.append("progCodePredTitle");
        sb.append('=');
        sb.append(((this.progCodePredTitle == null)?"<null>":this.progCodePredTitle));
        sb.append(',');
        sb.append("progCodePred");
        sb.append('=');
        sb.append(((this.progCodePred == null)?"<null>":this.progCodePred));
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
        result = ((result* 31)+((this.progTitle == null)? 0 :this.progTitle.hashCode()));
        result = ((result* 31)+((this.effDateYmdhms == null)? 0 :this.effDateYmdhms.hashCode()));
        result = ((result* 31)+((this.progCodePred == null)? 0 :this.progCodePred.hashCode()));
        result = ((result* 31)+((this.progCode == null)? 0 :this.progCode.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.progCodePredTitle == null)? 0 :this.progCodePredTitle.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProgramHierarchy100QapiPost) == false) {
            return false;
        }
        ProgramHierarchy100QapiPost rhs = ((ProgramHierarchy100QapiPost) other);
        return ((((((((this.progTitle == rhs.progTitle)||((this.progTitle!= null)&&this.progTitle.equals(rhs.progTitle)))&&((this.effDateYmdhms == rhs.effDateYmdhms)||((this.effDateYmdhms!= null)&&this.effDateYmdhms.equals(rhs.effDateYmdhms))))&&((this.progCodePred == rhs.progCodePred)||((this.progCodePred!= null)&&this.progCodePred.equals(rhs.progCodePred))))&&((this.progCode == rhs.progCode)||((this.progCode!= null)&&this.progCode.equals(rhs.progCode))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.progCodePredTitle == rhs.progCodePredTitle)||((this.progCodePredTitle!= null)&&this.progCodePredTitle.equals(rhs.progCodePredTitle))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
