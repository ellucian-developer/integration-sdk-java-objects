
package com.ellucian.generated.bpapi.ban.electronic_approval_summary_other_information_and_comments.v1_0_0;

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
    "norcmnt",
    "nobtran_info_1"
})
@Generated("jsonschema2pojo")
public class ElectronicApprovalSummaryOtherInformationAndComments100PostResponse {

    @JsonProperty("norcmnt")
    private List<Norcmnt__1> norcmnt = new ArrayList<Norcmnt__1>();
    @JsonProperty("nobtran_info_1")
    private List<NobtranInfo1__1> nobtranInfo1 = new ArrayList<NobtranInfo1__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("norcmnt")
    public List<Norcmnt__1> getNorcmnt() {
        return norcmnt;
    }

    @JsonProperty("norcmnt")
    public void setNorcmnt(List<Norcmnt__1> norcmnt) {
        this.norcmnt = norcmnt;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100PostResponse withNorcmnt(List<Norcmnt__1> norcmnt) {
        this.norcmnt = norcmnt;
        return this;
    }

    @JsonProperty("nobtran_info_1")
    public List<NobtranInfo1__1> getNobtranInfo1() {
        return nobtranInfo1;
    }

    @JsonProperty("nobtran_info_1")
    public void setNobtranInfo1(List<NobtranInfo1__1> nobtranInfo1) {
        this.nobtranInfo1 = nobtranInfo1;
    }

    public ElectronicApprovalSummaryOtherInformationAndComments100PostResponse withNobtranInfo1(List<NobtranInfo1__1> nobtranInfo1) {
        this.nobtranInfo1 = nobtranInfo1;
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

    public ElectronicApprovalSummaryOtherInformationAndComments100PostResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ElectronicApprovalSummaryOtherInformationAndComments100PostResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("norcmnt");
        sb.append('=');
        sb.append(((this.norcmnt == null)?"<null>":this.norcmnt));
        sb.append(',');
        sb.append("nobtranInfo1");
        sb.append('=');
        sb.append(((this.nobtranInfo1 == null)?"<null>":this.nobtranInfo1));
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
        result = ((result* 31)+((this.nobtranInfo1 == null)? 0 :this.nobtranInfo1 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.norcmnt == null)? 0 :this.norcmnt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ElectronicApprovalSummaryOtherInformationAndComments100PostResponse) == false) {
            return false;
        }
        ElectronicApprovalSummaryOtherInformationAndComments100PostResponse rhs = ((ElectronicApprovalSummaryOtherInformationAndComments100PostResponse) other);
        return ((((this.nobtranInfo1 == rhs.nobtranInfo1)||((this.nobtranInfo1 != null)&&this.nobtranInfo1 .equals(rhs.nobtranInfo1)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.norcmnt == rhs.norcmnt)||((this.norcmnt!= null)&&this.norcmnt.equals(rhs.norcmnt))));
    }

}
