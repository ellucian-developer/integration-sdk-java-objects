
package com.ellucian.generated.bpapi.ban.eu_hesa_course_catalog_identifier_details.v1_0_0;

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
    "sobccid",
    "sorccms",
    "sorccdc",
    "sorccdr"
})
@Generated("jsonschema2pojo")
public class EuHesaCourseCatalogIdentifierDetails100GetResponse {

    @JsonProperty("sobccid")
    private List<Sobccid> sobccid = new ArrayList<Sobccid>();
    @JsonProperty("sorccms")
    private List<Sorccm> sorccms = new ArrayList<Sorccm>();
    @JsonProperty("sorccdc")
    private List<Sorccdc> sorccdc = new ArrayList<Sorccdc>();
    @JsonProperty("sorccdr")
    private List<Sorccdr> sorccdr = new ArrayList<Sorccdr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sobccid")
    public List<Sobccid> getSobccid() {
        return sobccid;
    }

    @JsonProperty("sobccid")
    public void setSobccid(List<Sobccid> sobccid) {
        this.sobccid = sobccid;
    }

    public EuHesaCourseCatalogIdentifierDetails100GetResponse withSobccid(List<Sobccid> sobccid) {
        this.sobccid = sobccid;
        return this;
    }

    @JsonProperty("sorccms")
    public List<Sorccm> getSorccms() {
        return sorccms;
    }

    @JsonProperty("sorccms")
    public void setSorccms(List<Sorccm> sorccms) {
        this.sorccms = sorccms;
    }

    public EuHesaCourseCatalogIdentifierDetails100GetResponse withSorccms(List<Sorccm> sorccms) {
        this.sorccms = sorccms;
        return this;
    }

    @JsonProperty("sorccdc")
    public List<Sorccdc> getSorccdc() {
        return sorccdc;
    }

    @JsonProperty("sorccdc")
    public void setSorccdc(List<Sorccdc> sorccdc) {
        this.sorccdc = sorccdc;
    }

    public EuHesaCourseCatalogIdentifierDetails100GetResponse withSorccdc(List<Sorccdc> sorccdc) {
        this.sorccdc = sorccdc;
        return this;
    }

    @JsonProperty("sorccdr")
    public List<Sorccdr> getSorccdr() {
        return sorccdr;
    }

    @JsonProperty("sorccdr")
    public void setSorccdr(List<Sorccdr> sorccdr) {
        this.sorccdr = sorccdr;
    }

    public EuHesaCourseCatalogIdentifierDetails100GetResponse withSorccdr(List<Sorccdr> sorccdr) {
        this.sorccdr = sorccdr;
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

    public EuHesaCourseCatalogIdentifierDetails100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EuHesaCourseCatalogIdentifierDetails100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sobccid");
        sb.append('=');
        sb.append(((this.sobccid == null)?"<null>":this.sobccid));
        sb.append(',');
        sb.append("sorccms");
        sb.append('=');
        sb.append(((this.sorccms == null)?"<null>":this.sorccms));
        sb.append(',');
        sb.append("sorccdc");
        sb.append('=');
        sb.append(((this.sorccdc == null)?"<null>":this.sorccdc));
        sb.append(',');
        sb.append("sorccdr");
        sb.append('=');
        sb.append(((this.sorccdr == null)?"<null>":this.sorccdr));
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
        result = ((result* 31)+((this.sobccid == null)? 0 :this.sobccid.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sorccdc == null)? 0 :this.sorccdc.hashCode()));
        result = ((result* 31)+((this.sorccms == null)? 0 :this.sorccms.hashCode()));
        result = ((result* 31)+((this.sorccdr == null)? 0 :this.sorccdr.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EuHesaCourseCatalogIdentifierDetails100GetResponse) == false) {
            return false;
        }
        EuHesaCourseCatalogIdentifierDetails100GetResponse rhs = ((EuHesaCourseCatalogIdentifierDetails100GetResponse) other);
        return ((((((this.sobccid == rhs.sobccid)||((this.sobccid!= null)&&this.sobccid.equals(rhs.sobccid)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sorccdc == rhs.sorccdc)||((this.sorccdc!= null)&&this.sorccdc.equals(rhs.sorccdc))))&&((this.sorccms == rhs.sorccms)||((this.sorccms!= null)&&this.sorccms.equals(rhs.sorccms))))&&((this.sorccdr == rhs.sorccdr)||((this.sorccdr!= null)&&this.sorccdr.equals(rhs.sorccdr))));
    }

}
