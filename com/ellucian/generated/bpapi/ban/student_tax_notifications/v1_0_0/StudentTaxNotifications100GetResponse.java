
package com.ellucian.generated.bpapi.ban.student_tax_notifications.v1_0_0;

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
    "ttbtaxn",
    "ttvxrpt",
    "ttvxrcn",
    "ttvxrct",
    "ttrtaxr",
    "ttvxsum"
})
@Generated("jsonschema2pojo")
public class StudentTaxNotifications100GetResponse {

    @JsonProperty("ttbtaxn")
    private List<Ttbtaxn> ttbtaxn = new ArrayList<Ttbtaxn>();
    @JsonProperty("ttvxrpt")
    private List<Ttvxrpt> ttvxrpt = new ArrayList<Ttvxrpt>();
    @JsonProperty("ttvxrcn")
    private List<Ttvxrcn> ttvxrcn = new ArrayList<Ttvxrcn>();
    @JsonProperty("ttvxrct")
    private List<Ttvxrct> ttvxrct = new ArrayList<Ttvxrct>();
    @JsonProperty("ttrtaxr")
    private List<Ttrtaxr> ttrtaxr = new ArrayList<Ttrtaxr>();
    @JsonProperty("ttvxsum")
    private List<Ttvxsum> ttvxsum = new ArrayList<Ttvxsum>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ttbtaxn")
    public List<Ttbtaxn> getTtbtaxn() {
        return ttbtaxn;
    }

    @JsonProperty("ttbtaxn")
    public void setTtbtaxn(List<Ttbtaxn> ttbtaxn) {
        this.ttbtaxn = ttbtaxn;
    }

    public StudentTaxNotifications100GetResponse withTtbtaxn(List<Ttbtaxn> ttbtaxn) {
        this.ttbtaxn = ttbtaxn;
        return this;
    }

    @JsonProperty("ttvxrpt")
    public List<Ttvxrpt> getTtvxrpt() {
        return ttvxrpt;
    }

    @JsonProperty("ttvxrpt")
    public void setTtvxrpt(List<Ttvxrpt> ttvxrpt) {
        this.ttvxrpt = ttvxrpt;
    }

    public StudentTaxNotifications100GetResponse withTtvxrpt(List<Ttvxrpt> ttvxrpt) {
        this.ttvxrpt = ttvxrpt;
        return this;
    }

    @JsonProperty("ttvxrcn")
    public List<Ttvxrcn> getTtvxrcn() {
        return ttvxrcn;
    }

    @JsonProperty("ttvxrcn")
    public void setTtvxrcn(List<Ttvxrcn> ttvxrcn) {
        this.ttvxrcn = ttvxrcn;
    }

    public StudentTaxNotifications100GetResponse withTtvxrcn(List<Ttvxrcn> ttvxrcn) {
        this.ttvxrcn = ttvxrcn;
        return this;
    }

    @JsonProperty("ttvxrct")
    public List<Ttvxrct> getTtvxrct() {
        return ttvxrct;
    }

    @JsonProperty("ttvxrct")
    public void setTtvxrct(List<Ttvxrct> ttvxrct) {
        this.ttvxrct = ttvxrct;
    }

    public StudentTaxNotifications100GetResponse withTtvxrct(List<Ttvxrct> ttvxrct) {
        this.ttvxrct = ttvxrct;
        return this;
    }

    @JsonProperty("ttrtaxr")
    public List<Ttrtaxr> getTtrtaxr() {
        return ttrtaxr;
    }

    @JsonProperty("ttrtaxr")
    public void setTtrtaxr(List<Ttrtaxr> ttrtaxr) {
        this.ttrtaxr = ttrtaxr;
    }

    public StudentTaxNotifications100GetResponse withTtrtaxr(List<Ttrtaxr> ttrtaxr) {
        this.ttrtaxr = ttrtaxr;
        return this;
    }

    @JsonProperty("ttvxsum")
    public List<Ttvxsum> getTtvxsum() {
        return ttvxsum;
    }

    @JsonProperty("ttvxsum")
    public void setTtvxsum(List<Ttvxsum> ttvxsum) {
        this.ttvxsum = ttvxsum;
    }

    public StudentTaxNotifications100GetResponse withTtvxsum(List<Ttvxsum> ttvxsum) {
        this.ttvxsum = ttvxsum;
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

    public StudentTaxNotifications100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StudentTaxNotifications100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ttbtaxn");
        sb.append('=');
        sb.append(((this.ttbtaxn == null)?"<null>":this.ttbtaxn));
        sb.append(',');
        sb.append("ttvxrpt");
        sb.append('=');
        sb.append(((this.ttvxrpt == null)?"<null>":this.ttvxrpt));
        sb.append(',');
        sb.append("ttvxrcn");
        sb.append('=');
        sb.append(((this.ttvxrcn == null)?"<null>":this.ttvxrcn));
        sb.append(',');
        sb.append("ttvxrct");
        sb.append('=');
        sb.append(((this.ttvxrct == null)?"<null>":this.ttvxrct));
        sb.append(',');
        sb.append("ttrtaxr");
        sb.append('=');
        sb.append(((this.ttrtaxr == null)?"<null>":this.ttrtaxr));
        sb.append(',');
        sb.append("ttvxsum");
        sb.append('=');
        sb.append(((this.ttvxsum == null)?"<null>":this.ttvxsum));
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
        result = ((result* 31)+((this.ttbtaxn == null)? 0 :this.ttbtaxn.hashCode()));
        result = ((result* 31)+((this.ttvxsum == null)? 0 :this.ttvxsum.hashCode()));
        result = ((result* 31)+((this.ttvxrcn == null)? 0 :this.ttvxrcn.hashCode()));
        result = ((result* 31)+((this.ttvxrpt == null)? 0 :this.ttvxrpt.hashCode()));
        result = ((result* 31)+((this.ttrtaxr == null)? 0 :this.ttrtaxr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.ttvxrct == null)? 0 :this.ttvxrct.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StudentTaxNotifications100GetResponse) == false) {
            return false;
        }
        StudentTaxNotifications100GetResponse rhs = ((StudentTaxNotifications100GetResponse) other);
        return ((((((((this.ttbtaxn == rhs.ttbtaxn)||((this.ttbtaxn!= null)&&this.ttbtaxn.equals(rhs.ttbtaxn)))&&((this.ttvxsum == rhs.ttvxsum)||((this.ttvxsum!= null)&&this.ttvxsum.equals(rhs.ttvxsum))))&&((this.ttvxrcn == rhs.ttvxrcn)||((this.ttvxrcn!= null)&&this.ttvxrcn.equals(rhs.ttvxrcn))))&&((this.ttvxrpt == rhs.ttvxrpt)||((this.ttvxrpt!= null)&&this.ttvxrpt.equals(rhs.ttvxrpt))))&&((this.ttrtaxr == rhs.ttrtaxr)||((this.ttrtaxr!= null)&&this.ttrtaxr.equals(rhs.ttrtaxr))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.ttvxrct == rhs.ttvxrct)||((this.ttvxrct!= null)&&this.ttvxrct.equals(rhs.ttvxrct))));
    }

}
