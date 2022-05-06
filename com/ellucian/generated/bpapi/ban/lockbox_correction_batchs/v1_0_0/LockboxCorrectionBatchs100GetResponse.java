
package com.ellucian.generated.bpapi.ban.lockbox_correction_batchs.v1_0_0;

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
    "batch_summary",
    "batch_detail"
})
@Generated("jsonschema2pojo")
public class LockboxCorrectionBatchs100GetResponse {

    @JsonProperty("batch_summary")
    private List<BatchSummary> batchSummary = new ArrayList<BatchSummary>();
    @JsonProperty("batch_detail")
    private List<BatchDetail> batchDetail = new ArrayList<BatchDetail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("batch_summary")
    public List<BatchSummary> getBatchSummary() {
        return batchSummary;
    }

    @JsonProperty("batch_summary")
    public void setBatchSummary(List<BatchSummary> batchSummary) {
        this.batchSummary = batchSummary;
    }

    public LockboxCorrectionBatchs100GetResponse withBatchSummary(List<BatchSummary> batchSummary) {
        this.batchSummary = batchSummary;
        return this;
    }

    @JsonProperty("batch_detail")
    public List<BatchDetail> getBatchDetail() {
        return batchDetail;
    }

    @JsonProperty("batch_detail")
    public void setBatchDetail(List<BatchDetail> batchDetail) {
        this.batchDetail = batchDetail;
    }

    public LockboxCorrectionBatchs100GetResponse withBatchDetail(List<BatchDetail> batchDetail) {
        this.batchDetail = batchDetail;
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

    public LockboxCorrectionBatchs100GetResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LockboxCorrectionBatchs100GetResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("batchSummary");
        sb.append('=');
        sb.append(((this.batchSummary == null)?"<null>":this.batchSummary));
        sb.append(',');
        sb.append("batchDetail");
        sb.append('=');
        sb.append(((this.batchDetail == null)?"<null>":this.batchDetail));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.batchSummary == null)? 0 :this.batchSummary.hashCode()));
        result = ((result* 31)+((this.batchDetail == null)? 0 :this.batchDetail.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LockboxCorrectionBatchs100GetResponse) == false) {
            return false;
        }
        LockboxCorrectionBatchs100GetResponse rhs = ((LockboxCorrectionBatchs100GetResponse) other);
        return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.batchSummary == rhs.batchSummary)||((this.batchSummary!= null)&&this.batchSummary.equals(rhs.batchSummary))))&&((this.batchDetail == rhs.batchDetail)||((this.batchDetail!= null)&&this.batchDetail.equals(rhs.batchDetail))));
    }

}
