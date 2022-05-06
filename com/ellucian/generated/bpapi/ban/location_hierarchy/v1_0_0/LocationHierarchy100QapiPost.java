
package com.ellucian.generated.bpapi.ban.location_hierarchy.v1_0_0;

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
    "locnCode",
    "locnTitle",
    "effDateYmdhms",
    "locnCodePredTitle",
    "locnCodePred"
})
@Generated("jsonschema2pojo")
public class LocationHierarchy100QapiPost {

    @JsonProperty("coasCode")
    private String coasCode;
    @JsonProperty("locnCode")
    private String locnCode;
    @JsonProperty("locnTitle")
    private String locnTitle;
    @JsonProperty("effDateYmdhms")
    private String effDateYmdhms;
    @JsonProperty("locnCodePredTitle")
    private String locnCodePredTitle;
    @JsonProperty("locnCodePred")
    private String locnCodePred;
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

    public LocationHierarchy100QapiPost withCoasCode(String coasCode) {
        this.coasCode = coasCode;
        return this;
    }

    @JsonProperty("locnCode")
    public String getLocnCode() {
        return locnCode;
    }

    @JsonProperty("locnCode")
    public void setLocnCode(String locnCode) {
        this.locnCode = locnCode;
    }

    public LocationHierarchy100QapiPost withLocnCode(String locnCode) {
        this.locnCode = locnCode;
        return this;
    }

    @JsonProperty("locnTitle")
    public String getLocnTitle() {
        return locnTitle;
    }

    @JsonProperty("locnTitle")
    public void setLocnTitle(String locnTitle) {
        this.locnTitle = locnTitle;
    }

    public LocationHierarchy100QapiPost withLocnTitle(String locnTitle) {
        this.locnTitle = locnTitle;
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

    public LocationHierarchy100QapiPost withEffDateYmdhms(String effDateYmdhms) {
        this.effDateYmdhms = effDateYmdhms;
        return this;
    }

    @JsonProperty("locnCodePredTitle")
    public String getLocnCodePredTitle() {
        return locnCodePredTitle;
    }

    @JsonProperty("locnCodePredTitle")
    public void setLocnCodePredTitle(String locnCodePredTitle) {
        this.locnCodePredTitle = locnCodePredTitle;
    }

    public LocationHierarchy100QapiPost withLocnCodePredTitle(String locnCodePredTitle) {
        this.locnCodePredTitle = locnCodePredTitle;
        return this;
    }

    @JsonProperty("locnCodePred")
    public String getLocnCodePred() {
        return locnCodePred;
    }

    @JsonProperty("locnCodePred")
    public void setLocnCodePred(String locnCodePred) {
        this.locnCodePred = locnCodePred;
    }

    public LocationHierarchy100QapiPost withLocnCodePred(String locnCodePred) {
        this.locnCodePred = locnCodePred;
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

    public LocationHierarchy100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LocationHierarchy100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("coasCode");
        sb.append('=');
        sb.append(((this.coasCode == null)?"<null>":this.coasCode));
        sb.append(',');
        sb.append("locnCode");
        sb.append('=');
        sb.append(((this.locnCode == null)?"<null>":this.locnCode));
        sb.append(',');
        sb.append("locnTitle");
        sb.append('=');
        sb.append(((this.locnTitle == null)?"<null>":this.locnTitle));
        sb.append(',');
        sb.append("effDateYmdhms");
        sb.append('=');
        sb.append(((this.effDateYmdhms == null)?"<null>":this.effDateYmdhms));
        sb.append(',');
        sb.append("locnCodePredTitle");
        sb.append('=');
        sb.append(((this.locnCodePredTitle == null)?"<null>":this.locnCodePredTitle));
        sb.append(',');
        sb.append("locnCodePred");
        sb.append('=');
        sb.append(((this.locnCodePred == null)?"<null>":this.locnCodePred));
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
        result = ((result* 31)+((this.effDateYmdhms == null)? 0 :this.effDateYmdhms.hashCode()));
        result = ((result* 31)+((this.locnCodePredTitle == null)? 0 :this.locnCodePredTitle.hashCode()));
        result = ((result* 31)+((this.coasCode == null)? 0 :this.coasCode.hashCode()));
        result = ((result* 31)+((this.locnTitle == null)? 0 :this.locnTitle.hashCode()));
        result = ((result* 31)+((this.locnCodePred == null)? 0 :this.locnCodePred.hashCode()));
        result = ((result* 31)+((this.locnCode == null)? 0 :this.locnCode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocationHierarchy100QapiPost) == false) {
            return false;
        }
        LocationHierarchy100QapiPost rhs = ((LocationHierarchy100QapiPost) other);
        return ((((((((this.effDateYmdhms == rhs.effDateYmdhms)||((this.effDateYmdhms!= null)&&this.effDateYmdhms.equals(rhs.effDateYmdhms)))&&((this.locnCodePredTitle == rhs.locnCodePredTitle)||((this.locnCodePredTitle!= null)&&this.locnCodePredTitle.equals(rhs.locnCodePredTitle))))&&((this.coasCode == rhs.coasCode)||((this.coasCode!= null)&&this.coasCode.equals(rhs.coasCode))))&&((this.locnTitle == rhs.locnTitle)||((this.locnTitle!= null)&&this.locnTitle.equals(rhs.locnTitle))))&&((this.locnCodePred == rhs.locnCodePred)||((this.locnCodePred!= null)&&this.locnCodePred.equals(rhs.locnCodePred))))&&((this.locnCode == rhs.locnCode)||((this.locnCode!= null)&&this.locnCode.equals(rhs.locnCode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
