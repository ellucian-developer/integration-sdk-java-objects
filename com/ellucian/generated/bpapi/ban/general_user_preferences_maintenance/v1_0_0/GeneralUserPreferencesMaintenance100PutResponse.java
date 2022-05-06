
package com.ellucian.generated.bpapi.ban.general_user_preferences_maintenance.v1_0_0;

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
    "display_options",
    "guruprf_ui"
})
@Generated("jsonschema2pojo")
public class GeneralUserPreferencesMaintenance100PutResponse {

    @JsonProperty("display_options")
    private List<DisplayOption__1> displayOptions = new ArrayList<DisplayOption__1>();
    @JsonProperty("guruprf_ui")
    private List<GuruprfUi__1> guruprfUi = new ArrayList<GuruprfUi__1>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("display_options")
    public List<DisplayOption__1> getDisplayOptions() {
        return displayOptions;
    }

    @JsonProperty("display_options")
    public void setDisplayOptions(List<DisplayOption__1> displayOptions) {
        this.displayOptions = displayOptions;
    }

    public GeneralUserPreferencesMaintenance100PutResponse withDisplayOptions(List<DisplayOption__1> displayOptions) {
        this.displayOptions = displayOptions;
        return this;
    }

    @JsonProperty("guruprf_ui")
    public List<GuruprfUi__1> getGuruprfUi() {
        return guruprfUi;
    }

    @JsonProperty("guruprf_ui")
    public void setGuruprfUi(List<GuruprfUi__1> guruprfUi) {
        this.guruprfUi = guruprfUi;
    }

    public GeneralUserPreferencesMaintenance100PutResponse withGuruprfUi(List<GuruprfUi__1> guruprfUi) {
        this.guruprfUi = guruprfUi;
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

    public GeneralUserPreferencesMaintenance100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GeneralUserPreferencesMaintenance100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("displayOptions");
        sb.append('=');
        sb.append(((this.displayOptions == null)?"<null>":this.displayOptions));
        sb.append(',');
        sb.append("guruprfUi");
        sb.append('=');
        sb.append(((this.guruprfUi == null)?"<null>":this.guruprfUi));
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
        result = ((result* 31)+((this.guruprfUi == null)? 0 :this.guruprfUi.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.displayOptions == null)? 0 :this.displayOptions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GeneralUserPreferencesMaintenance100PutResponse) == false) {
            return false;
        }
        GeneralUserPreferencesMaintenance100PutResponse rhs = ((GeneralUserPreferencesMaintenance100PutResponse) other);
        return ((((this.guruprfUi == rhs.guruprfUi)||((this.guruprfUi!= null)&&this.guruprfUi.equals(rhs.guruprfUi)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.displayOptions == rhs.displayOptions)||((this.displayOptions!= null)&&this.displayOptions.equals(rhs.displayOptions))));
    }

}
