
package com.ellucian.generated.bpapi.ban.eu_hesa_course_delivery_details.v1_0_0;

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
    "sorpcde",
    "sorpcdr",
    "sorpcdi",
    "sorpcri",
    "sorpcca"
})
@Generated("jsonschema2pojo")
public class EuHesaCourseDeliveryDetails100GetResponse {

    @JsonProperty("sorpcde")
    private List<Sorpcde> sorpcde = new ArrayList<Sorpcde>();
    @JsonProperty("sorpcdr")
    private List<Sorpcdr> sorpcdr = new ArrayList<Sorpcdr>();
    @JsonProperty("sorpcdi")
    private List<Sorpcdi> sorpcdi = new ArrayList<Sorpcdi>();
    @JsonProperty("sorpcri")
    private List<Sorpcrus> sorpcri = new ArrayList<Sorpcrus>();
    @JsonProperty("sorpcca")
    private List<Sorpcca> sorpcca = new ArrayList<Sorpcca>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sorpcde")
    public List<Sorpcde> getSorpcde() {
        return sorpcde;
    }

    @JsonProperty("sorpcde")
    public void setSorpcde(List<Sorpcde> sorpcde) {
        this.sorpcde = sorpcde;
    }

    public EuHesaCourseDeliveryDetails100GetResponse withSorpcde(List<Sorpcde> sorpcde) {
        this.sorpcde = sorpcde;
        return this;
    }

    @JsonProperty("sorpcdr")
    public List<Sorpcdr> getSorpcdr() {
        return sorpcdr;
    }

    @JsonProperty("sorpcdr")
    public void setSorpcdr(List<Sorpcdr> sorpcdr) {
        this.sorpcdr = sorpcdr;
    }

    public EuHesaCourseDeliveryDetails100GetResponse withSorpcdr(List<Sorpcdr> sorpcdr) {
        this.sorpcdr = sorpcdr;
        return this;
    }

    @JsonProperty("sorpcdi")
    public List<Sorpcdi> getSorpcdi() {
        return sorpcdi;
    }

    @JsonProperty("sorpcdi")
    public void setSorpcdi(List<Sorpcdi> sorpcdi) {
        this.sorpcdi = sorpcdi;
    }

    public EuHesaCourseDeliveryDetails100GetResponse withSorpcdi(List<Sorpcdi> sorpcdi) {
        this.sorpcdi = sorpcdi;
        return this;
    }

    @JsonProperty("sorpcri")
    public List<Sorpcrus> getSorpcri() {
        return sorpcri;
    }

    @JsonProperty("sorpcri")
    public void setSorpcri(List<Sorpcrus> sorpcri) {
        this.sorpcri = sorpcri;
    }

    public EuHesaCourseDeliveryDetails100GetResponse withSorpcri(List<Sorpcrus> sorpcri) {
        this.sorpcri = sorpcri;
        return this;
    }

    @JsonProperty("sorpcca")
    public List<Sorpcca> getSorpcca() {
        return sorpcca;
    }

    @JsonProperty("sorpcca")
    public void setSorpcca(List<Sorpcca> sorpcca) {
        this.sorpcca = sorpcca;
    }

    public EuHesaCourseDeliveryDetails100GetResponse withSorpcca(List<Sorpcca> sorpcca) {
        this.sorpcca = sorpcca;
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

    public EuHesaCourseDeliveryDetails100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaCourseDeliveryDetails100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sorpcde");
        sb.append('=');
        sb.append(((this.sorpcde == null)?"<null>":this.sorpcde));
        sb.append(',');
        sb.append("sorpcdr");
        sb.append('=');
        sb.append(((this.sorpcdr == null)?"<null>":this.sorpcdr));
        sb.append(',');
        sb.append("sorpcdi");
        sb.append('=');
        sb.append(((this.sorpcdi == null)?"<null>":this.sorpcdi));
        sb.append(',');
        sb.append("sorpcri");
        sb.append('=');
        sb.append(((this.sorpcri == null)?"<null>":this.sorpcri));
        sb.append(',');
        sb.append("sorpcca");
        sb.append('=');
        sb.append(((this.sorpcca == null)?"<null>":this.sorpcca));
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
        result = ((result* 31)+((this.sorpcri == null)? 0 :this.sorpcri.hashCode()));
        result = ((result* 31)+((this.sorpcdr == null)? 0 :this.sorpcdr.hashCode()));
        result = ((result* 31)+((this.sorpcca == null)? 0 :this.sorpcca.hashCode()));
        result = ((result* 31)+((this.sorpcde == null)? 0 :this.sorpcde.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorpcdi == null)? 0 :this.sorpcdi.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaCourseDeliveryDetails100GetResponse) == false) {
            return false;
        }
        EuHesaCourseDeliveryDetails100GetResponse rhs = ((EuHesaCourseDeliveryDetails100GetResponse) other);
        return (((((((this.sorpcri == rhs.sorpcri)||((this.sorpcri!= null)&&this.sorpcri.equals(rhs.sorpcri)))&&((this.sorpcdr == rhs.sorpcdr)||((this.sorpcdr!= null)&&this.sorpcdr.equals(rhs.sorpcdr))))&&((this.sorpcca == rhs.sorpcca)||((this.sorpcca!= null)&&this.sorpcca.equals(rhs.sorpcca))))&&((this.sorpcde == rhs.sorpcde)||((this.sorpcde!= null)&&this.sorpcde.equals(rhs.sorpcde))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorpcdi == rhs.sorpcdi)||((this.sorpcdi!= null)&&this.sorpcdi.equals(rhs.sorpcdi))));
    }

}
