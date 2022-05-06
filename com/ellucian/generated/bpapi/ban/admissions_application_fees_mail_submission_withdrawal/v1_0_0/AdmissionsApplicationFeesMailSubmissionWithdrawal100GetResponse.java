
package com.ellucian.generated.bpapi.ban.admissions_application_fees_mail_submission_withdrawal.v1_0_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "saradap",
    "gurmail"
})
@Generated("jsonschema2pojo")
public class AdmissionsApplicationFeesMailSubmissionWithdrawal100GetResponse {

    @JsonProperty("saradap")
    private List<Saradap> saradap = new ArrayList<Saradap>();
    @JsonProperty("gurmail")
    private List<Gurmail> gurmail = new ArrayList<Gurmail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("saradap")
    public List<Saradap> getSaradap() {
        return saradap;
    }

    @JsonProperty("saradap")
    public void setSaradap(List<Saradap> saradap) {
        this.saradap = saradap;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100GetResponse withSaradap(List<Saradap> saradap) {
        this.saradap = saradap;
        return this;
    }

    @JsonProperty("gurmail")
    public List<Gurmail> getGurmail() {
        return gurmail;
    }

    @JsonProperty("gurmail")
    public void setGurmail(List<Gurmail> gurmail) {
        this.gurmail = gurmail;
    }

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100GetResponse withGurmail(List<Gurmail> gurmail) {
        this.gurmail = gurmail;
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

    public AdmissionsApplicationFeesMailSubmissionWithdrawal100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AdmissionsApplicationFeesMailSubmissionWithdrawal100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saradap");
        sb.append('=');
        sb.append(((this.saradap == null)?"<null>":this.saradap));
        sb.append(',');
        sb.append("gurmail");
        sb.append('=');
        sb.append(((this.gurmail == null)?"<null>":this.gurmail));
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
        result = ((result* 31)+((this.saradap == null)? 0 :this.saradap.hashCode()));
        result = ((result* 31)+((this.gurmail == null)? 0 :this.gurmail.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdmissionsApplicationFeesMailSubmissionWithdrawal100GetResponse) == false) {
            return false;
        }
        AdmissionsApplicationFeesMailSubmissionWithdrawal100GetResponse rhs = ((AdmissionsApplicationFeesMailSubmissionWithdrawal100GetResponse) other);
        return ((((this.saradap == rhs.saradap)||((this.saradap!= null)&&this.saradap.equals(rhs.saradap)))&&((this.gurmail == rhs.gurmail)||((this.gurmail!= null)&&this.gurmail.equals(rhs.gurmail))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
