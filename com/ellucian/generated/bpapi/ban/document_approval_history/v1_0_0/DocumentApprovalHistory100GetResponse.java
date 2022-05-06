
package com.ellucian.generated.bpapi.ban.document_approval_history.v1_0_0;

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
    "fobapph2",
    "fovapph",
    "display"
})
@Generated("jsonschema2pojo")
public class DocumentApprovalHistory100GetResponse {

    @JsonProperty("fobapph2")
    private List<Fobapph2> fobapph2 = new ArrayList<Fobapph2>();
    @JsonProperty("fovapph")
    private List<Fovapph> fovapph = new ArrayList<Fovapph>();
    @JsonProperty("display")
    private List<Display> display = new ArrayList<Display>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fobapph2")
    public List<Fobapph2> getFobapph2() {
        return fobapph2;
    }

    @JsonProperty("fobapph2")
    public void setFobapph2(List<Fobapph2> fobapph2) {
        this.fobapph2 = fobapph2;
    }

    public DocumentApprovalHistory100GetResponse withFobapph2(List<Fobapph2> fobapph2) {
        this.fobapph2 = fobapph2;
        return this;
    }

    @JsonProperty("fovapph")
    public List<Fovapph> getFovapph() {
        return fovapph;
    }

    @JsonProperty("fovapph")
    public void setFovapph(List<Fovapph> fovapph) {
        this.fovapph = fovapph;
    }

    public DocumentApprovalHistory100GetResponse withFovapph(List<Fovapph> fovapph) {
        this.fovapph = fovapph;
        return this;
    }

    @JsonProperty("display")
    public List<Display> getDisplay() {
        return display;
    }

    @JsonProperty("display")
    public void setDisplay(List<Display> display) {
        this.display = display;
    }

    public DocumentApprovalHistory100GetResponse withDisplay(List<Display> display) {
        this.display = display;
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

    public DocumentApprovalHistory100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DocumentApprovalHistory100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fobapph2");
        sb.append('=');
        sb.append(((this.fobapph2 == null)?"<null>":this.fobapph2));
        sb.append(',');
        sb.append("fovapph");
        sb.append('=');
        sb.append(((this.fovapph == null)?"<null>":this.fovapph));
        sb.append(',');
        sb.append("display");
        sb.append('=');
        sb.append(((this.display == null)?"<null>":this.display));
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
        result = ((result* 31)+((this.fobapph2 == null)? 0 :this.fobapph2 .hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.fovapph == null)? 0 :this.fovapph.hashCode()));
        result = ((result* 31)+((this.display == null)? 0 :this.display.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentApprovalHistory100GetResponse) == false) {
            return false;
        }
        DocumentApprovalHistory100GetResponse rhs = ((DocumentApprovalHistory100GetResponse) other);
        return (((((this.fobapph2 == rhs.fobapph2)||((this.fobapph2 != null)&&this.fobapph2 .equals(rhs.fobapph2)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.fovapph == rhs.fovapph)||((this.fovapph!= null)&&this.fovapph.equals(rhs.fovapph))))&&((this.display == rhs.display)||((this.display!= null)&&this.display.equals(rhs.display))));
    }

}
