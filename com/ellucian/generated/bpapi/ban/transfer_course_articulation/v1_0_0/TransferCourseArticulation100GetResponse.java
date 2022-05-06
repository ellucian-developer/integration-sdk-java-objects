
package com.ellucian.generated.bpapi.ban.transfer_course_articulation.v1_0_0;

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
    "shrtrat",
    "shricmt",
    "shbtatc",
    "shrtatc",
    "shrtcat"
})
@Generated("jsonschema2pojo")
public class TransferCourseArticulation100GetResponse {

    @JsonProperty("shrtrat")
    private List<Shrtrat> shrtrat = new ArrayList<Shrtrat>();
    @JsonProperty("shricmt")
    private List<Shricmt> shricmt = new ArrayList<Shricmt>();
    @JsonProperty("shbtatc")
    private List<Shbtatc> shbtatc = new ArrayList<Shbtatc>();
    @JsonProperty("shrtatc")
    private List<Shrtatc> shrtatc = new ArrayList<Shrtatc>();
    @JsonProperty("shrtcat")
    private List<Shrtcat> shrtcat = new ArrayList<Shrtcat>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrtrat")
    public List<Shrtrat> getShrtrat() {
        return shrtrat;
    }

    @JsonProperty("shrtrat")
    public void setShrtrat(List<Shrtrat> shrtrat) {
        this.shrtrat = shrtrat;
    }

    public TransferCourseArticulation100GetResponse withShrtrat(List<Shrtrat> shrtrat) {
        this.shrtrat = shrtrat;
        return this;
    }

    @JsonProperty("shricmt")
    public List<Shricmt> getShricmt() {
        return shricmt;
    }

    @JsonProperty("shricmt")
    public void setShricmt(List<Shricmt> shricmt) {
        this.shricmt = shricmt;
    }

    public TransferCourseArticulation100GetResponse withShricmt(List<Shricmt> shricmt) {
        this.shricmt = shricmt;
        return this;
    }

    @JsonProperty("shbtatc")
    public List<Shbtatc> getShbtatc() {
        return shbtatc;
    }

    @JsonProperty("shbtatc")
    public void setShbtatc(List<Shbtatc> shbtatc) {
        this.shbtatc = shbtatc;
    }

    public TransferCourseArticulation100GetResponse withShbtatc(List<Shbtatc> shbtatc) {
        this.shbtatc = shbtatc;
        return this;
    }

    @JsonProperty("shrtatc")
    public List<Shrtatc> getShrtatc() {
        return shrtatc;
    }

    @JsonProperty("shrtatc")
    public void setShrtatc(List<Shrtatc> shrtatc) {
        this.shrtatc = shrtatc;
    }

    public TransferCourseArticulation100GetResponse withShrtatc(List<Shrtatc> shrtatc) {
        this.shrtatc = shrtatc;
        return this;
    }

    @JsonProperty("shrtcat")
    public List<Shrtcat> getShrtcat() {
        return shrtcat;
    }

    @JsonProperty("shrtcat")
    public void setShrtcat(List<Shrtcat> shrtcat) {
        this.shrtcat = shrtcat;
    }

    public TransferCourseArticulation100GetResponse withShrtcat(List<Shrtcat> shrtcat) {
        this.shrtcat = shrtcat;
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

    public TransferCourseArticulation100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferCourseArticulation100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrtrat");
        sb.append('=');
        sb.append(((this.shrtrat == null)?"<null>":this.shrtrat));
        sb.append(',');
        sb.append("shricmt");
        sb.append('=');
        sb.append(((this.shricmt == null)?"<null>":this.shricmt));
        sb.append(',');
        sb.append("shbtatc");
        sb.append('=');
        sb.append(((this.shbtatc == null)?"<null>":this.shbtatc));
        sb.append(',');
        sb.append("shrtatc");
        sb.append('=');
        sb.append(((this.shrtatc == null)?"<null>":this.shrtatc));
        sb.append(',');
        sb.append("shrtcat");
        sb.append('=');
        sb.append(((this.shrtcat == null)?"<null>":this.shrtcat));
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
        result = ((result* 31)+((this.shricmt == null)? 0 :this.shricmt.hashCode()));
        result = ((result* 31)+((this.shbtatc == null)? 0 :this.shbtatc.hashCode()));
        result = ((result* 31)+((this.shrtatc == null)? 0 :this.shrtatc.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrtcat == null)? 0 :this.shrtcat.hashCode()));
        result = ((result* 31)+((this.shrtrat == null)? 0 :this.shrtrat.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransferCourseArticulation100GetResponse) == false) {
            return false;
        }
        TransferCourseArticulation100GetResponse rhs = ((TransferCourseArticulation100GetResponse) other);
        return (((((((this.shricmt == rhs.shricmt)||((this.shricmt!= null)&&this.shricmt.equals(rhs.shricmt)))&&((this.shbtatc == rhs.shbtatc)||((this.shbtatc!= null)&&this.shbtatc.equals(rhs.shbtatc))))&&((this.shrtatc == rhs.shrtatc)||((this.shrtatc!= null)&&this.shrtatc.equals(rhs.shrtatc))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrtcat == rhs.shrtcat)||((this.shrtcat!= null)&&this.shrtcat.equals(rhs.shrtcat))))&&((this.shrtrat == rhs.shrtrat)||((this.shrtrat!= null)&&this.shrtrat.equals(rhs.shrtrat))));
    }

}
