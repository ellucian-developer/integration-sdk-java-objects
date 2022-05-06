
package com.ellucian.generated.bpapi.ban.transfer_institution_catalog_entry.v1_0_0;

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
    "shrtcat",
    "shbtatc",
    "shrtcmt"
})
@Generated("jsonschema2pojo")
public class TransferInstitutionCatalogEntry100GetResponse {

    @JsonProperty("shrtcat")
    private List<Shrtcat> shrtcat = new ArrayList<Shrtcat>();
    @JsonProperty("shbtatc")
    private List<Shbtatc> shbtatc = new ArrayList<Shbtatc>();
    @JsonProperty("shrtcmt")
    private List<Shrtcmt> shrtcmt = new ArrayList<Shrtcmt>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shrtcat")
    public List<Shrtcat> getShrtcat() {
        return shrtcat;
    }

    @JsonProperty("shrtcat")
    public void setShrtcat(List<Shrtcat> shrtcat) {
        this.shrtcat = shrtcat;
    }

    public TransferInstitutionCatalogEntry100GetResponse withShrtcat(List<Shrtcat> shrtcat) {
        this.shrtcat = shrtcat;
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

    public TransferInstitutionCatalogEntry100GetResponse withShbtatc(List<Shbtatc> shbtatc) {
        this.shbtatc = shbtatc;
        return this;
    }

    @JsonProperty("shrtcmt")
    public List<Shrtcmt> getShrtcmt() {
        return shrtcmt;
    }

    @JsonProperty("shrtcmt")
    public void setShrtcmt(List<Shrtcmt> shrtcmt) {
        this.shrtcmt = shrtcmt;
    }

    public TransferInstitutionCatalogEntry100GetResponse withShrtcmt(List<Shrtcmt> shrtcmt) {
        this.shrtcmt = shrtcmt;
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

    public TransferInstitutionCatalogEntry100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferInstitutionCatalogEntry100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shrtcat");
        sb.append('=');
        sb.append(((this.shrtcat == null)?"<null>":this.shrtcat));
        sb.append(',');
        sb.append("shbtatc");
        sb.append('=');
        sb.append(((this.shbtatc == null)?"<null>":this.shbtatc));
        sb.append(',');
        sb.append("shrtcmt");
        sb.append('=');
        sb.append(((this.shrtcmt == null)?"<null>":this.shrtcmt));
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
        result = ((result* 31)+((this.shrtcmt == null)? 0 :this.shrtcmt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shrtcat == null)? 0 :this.shrtcat.hashCode()));
        result = ((result* 31)+((this.shbtatc == null)? 0 :this.shbtatc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TransferInstitutionCatalogEntry100GetResponse) == false) {
            return false;
        }
        TransferInstitutionCatalogEntry100GetResponse rhs = ((TransferInstitutionCatalogEntry100GetResponse) other);
        return (((((this.shrtcmt == rhs.shrtcmt)||((this.shrtcmt!= null)&&this.shrtcmt.equals(rhs.shrtcmt)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shrtcat == rhs.shrtcat)||((this.shrtcat!= null)&&this.shrtcat.equals(rhs.shrtcat))))&&((this.shbtatc == rhs.shbtatc)||((this.shbtatc!= null)&&this.shbtatc.equals(rhs.shbtatc))));
    }

}
