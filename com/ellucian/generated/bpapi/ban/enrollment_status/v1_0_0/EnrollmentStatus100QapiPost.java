
package com.ellucian.generated.bpapi.ban.enrollment_status.v1_0_0;

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
    "globalTerm",
    "globalDate",
    "xxxxxxxtermcode"
})
@Generated("jsonschema2pojo")
public class EnrollmentStatus100QapiPost {

    @JsonProperty("globalTerm")
    private String globalTerm;
    @JsonProperty("globalDate")
    private String globalDate;
    @JsonProperty("xxxxxxxtermcode")
    private String xxxxxxxtermcode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("globalTerm")
    public String getGlobalTerm() {
        return globalTerm;
    }

    @JsonProperty("globalTerm")
    public void setGlobalTerm(String globalTerm) {
        this.globalTerm = globalTerm;
    }

    public EnrollmentStatus100QapiPost withGlobalTerm(String globalTerm) {
        this.globalTerm = globalTerm;
        return this;
    }

    @JsonProperty("globalDate")
    public String getGlobalDate() {
        return globalDate;
    }

    @JsonProperty("globalDate")
    public void setGlobalDate(String globalDate) {
        this.globalDate = globalDate;
    }

    public EnrollmentStatus100QapiPost withGlobalDate(String globalDate) {
        this.globalDate = globalDate;
        return this;
    }

    @JsonProperty("xxxxxxxtermcode")
    public String getXxxxxxxtermcode() {
        return xxxxxxxtermcode;
    }

    @JsonProperty("xxxxxxxtermcode")
    public void setXxxxxxxtermcode(String xxxxxxxtermcode) {
        this.xxxxxxxtermcode = xxxxxxxtermcode;
    }

    public EnrollmentStatus100QapiPost withXxxxxxxtermcode(String xxxxxxxtermcode) {
        this.xxxxxxxtermcode = xxxxxxxtermcode;
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

    public EnrollmentStatus100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnrollmentStatus100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("globalTerm");
        sb.append('=');
        sb.append(((this.globalTerm == null)?"<null>":this.globalTerm));
        sb.append(',');
        sb.append("globalDate");
        sb.append('=');
        sb.append(((this.globalDate == null)?"<null>":this.globalDate));
        sb.append(',');
        sb.append("xxxxxxxtermcode");
        sb.append('=');
        sb.append(((this.xxxxxxxtermcode == null)?"<null>":this.xxxxxxxtermcode));
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
        result = ((result* 31)+((this.globalDate == null)? 0 :this.globalDate.hashCode()));
        result = ((result* 31)+((this.xxxxxxxtermcode == null)? 0 :this.xxxxxxxtermcode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.globalTerm == null)? 0 :this.globalTerm.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnrollmentStatus100QapiPost) == false) {
            return false;
        }
        EnrollmentStatus100QapiPost rhs = ((EnrollmentStatus100QapiPost) other);
        return (((((this.globalDate == rhs.globalDate)||((this.globalDate!= null)&&this.globalDate.equals(rhs.globalDate)))&&((this.xxxxxxxtermcode == rhs.xxxxxxxtermcode)||((this.xxxxxxxtermcode!= null)&&this.xxxxxxxtermcode.equals(rhs.xxxxxxxtermcode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.globalTerm == rhs.globalTerm)||((this.globalTerm!= null)&&this.globalTerm.equals(rhs.globalTerm))));
    }

}
