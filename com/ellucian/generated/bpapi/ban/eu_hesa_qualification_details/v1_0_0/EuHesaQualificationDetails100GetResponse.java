
package com.ellucian.generated.bpapi.ban.eu_hesa_qualification_details.v1_0_0;

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
    "sorqual",
    "sorqusb",
    "sorawbr"
})
@Generated("jsonschema2pojo")
public class EuHesaQualificationDetails100GetResponse {

    @JsonProperty("sorqual")
    private List<Sorqual> sorqual = new ArrayList<Sorqual>();
    @JsonProperty("sorqusb")
    private List<Sorqusb> sorqusb = new ArrayList<Sorqusb>();
    @JsonProperty("sorawbr")
    private List<Sorawbr> sorawbr = new ArrayList<Sorawbr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorqual")
    public List<Sorqual> getSorqual() {
        return sorqual;
    }

    @JsonProperty("sorqual")
    public void setSorqual(List<Sorqual> sorqual) {
        this.sorqual = sorqual;
    }

    public EuHesaQualificationDetails100GetResponse withSorqual(List<Sorqual> sorqual) {
        this.sorqual = sorqual;
        return this;
    }

    @JsonProperty("sorqusb")
    public List<Sorqusb> getSorqusb() {
        return sorqusb;
    }

    @JsonProperty("sorqusb")
    public void setSorqusb(List<Sorqusb> sorqusb) {
        this.sorqusb = sorqusb;
    }

    public EuHesaQualificationDetails100GetResponse withSorqusb(List<Sorqusb> sorqusb) {
        this.sorqusb = sorqusb;
        return this;
    }

    @JsonProperty("sorawbr")
    public List<Sorawbr> getSorawbr() {
        return sorawbr;
    }

    @JsonProperty("sorawbr")
    public void setSorawbr(List<Sorawbr> sorawbr) {
        this.sorawbr = sorawbr;
    }

    public EuHesaQualificationDetails100GetResponse withSorawbr(List<Sorawbr> sorawbr) {
        this.sorawbr = sorawbr;
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

    public EuHesaQualificationDetails100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaQualificationDetails100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorqual");
        sb.append('=');
        sb.append(((this.sorqual == null)?"<null>":this.sorqual));
        sb.append(',');
        sb.append("sorqusb");
        sb.append('=');
        sb.append(((this.sorqusb == null)?"<null>":this.sorqusb));
        sb.append(',');
        sb.append("sorawbr");
        sb.append('=');
        sb.append(((this.sorawbr == null)?"<null>":this.sorawbr));
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
        result = ((result* 31)+((this.sorqusb == null)? 0 :this.sorqusb.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorawbr == null)? 0 :this.sorawbr.hashCode()));
        result = ((result* 31)+((this.sorqual == null)? 0 :this.sorqual.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaQualificationDetails100GetResponse) == false) {
            return false;
        }
        EuHesaQualificationDetails100GetResponse rhs = ((EuHesaQualificationDetails100GetResponse) other);
        return (((((this.sorqusb == rhs.sorqusb)||((this.sorqusb!= null)&&this.sorqusb.equals(rhs.sorqusb)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorawbr == rhs.sorawbr)||((this.sorawbr!= null)&&this.sorawbr.equals(rhs.sorawbr))))&&((this.sorqual == rhs.sorqual)||((this.sorqual!= null)&&this.sorqual.equals(rhs.sorqual))));
    }

}
