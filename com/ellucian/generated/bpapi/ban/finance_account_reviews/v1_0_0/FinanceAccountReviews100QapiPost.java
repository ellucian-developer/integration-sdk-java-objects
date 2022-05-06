
package com.ellucian.generated.bpapi.ban.finance_account_reviews.v1_0_0;

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
    "id",
    "colId",
    "installmentPlan",
    "desc",
    "refNumber",
    "planAmount"
})
@Generated("jsonschema2pojo")
public class FinanceAccountReviews100QapiPost {

    @JsonProperty("id")
    private String id;
    @JsonProperty("colId")
    private String colId;
    @JsonProperty("installmentPlan")
    private String installmentPlan;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("refNumber")
    private String refNumber;
    @JsonProperty("planAmount")
    private String planAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FinanceAccountReviews100QapiPost withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("colId")
    public String getColId() {
        return colId;
    }

    @JsonProperty("colId")
    public void setColId(String colId) {
        this.colId = colId;
    }

    public FinanceAccountReviews100QapiPost withColId(String colId) {
        this.colId = colId;
        return this;
    }

    @JsonProperty("installmentPlan")
    public String getInstallmentPlan() {
        return installmentPlan;
    }

    @JsonProperty("installmentPlan")
    public void setInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    public FinanceAccountReviews100QapiPost withInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
        return this;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FinanceAccountReviews100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    @JsonProperty("refNumber")
    public String getRefNumber() {
        return refNumber;
    }

    @JsonProperty("refNumber")
    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public FinanceAccountReviews100QapiPost withRefNumber(String refNumber) {
        this.refNumber = refNumber;
        return this;
    }

    @JsonProperty("planAmount")
    public String getPlanAmount() {
        return planAmount;
    }

    @JsonProperty("planAmount")
    public void setPlanAmount(String planAmount) {
        this.planAmount = planAmount;
    }

    public FinanceAccountReviews100QapiPost withPlanAmount(String planAmount) {
        this.planAmount = planAmount;
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

    public FinanceAccountReviews100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FinanceAccountReviews100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("colId");
        sb.append('=');
        sb.append(((this.colId == null)?"<null>":this.colId));
        sb.append(',');
        sb.append("installmentPlan");
        sb.append('=');
        sb.append(((this.installmentPlan == null)?"<null>":this.installmentPlan));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("refNumber");
        sb.append('=');
        sb.append(((this.refNumber == null)?"<null>":this.refNumber));
        sb.append(',');
        sb.append("planAmount");
        sb.append('=');
        sb.append(((this.planAmount == null)?"<null>":this.planAmount));
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
        result = ((result* 31)+((this.refNumber == null)? 0 :this.refNumber.hashCode()));
        result = ((result* 31)+((this.installmentPlan == null)? 0 :this.installmentPlan.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.colId == null)? 0 :this.colId.hashCode()));
        result = ((result* 31)+((this.planAmount == null)? 0 :this.planAmount.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FinanceAccountReviews100QapiPost) == false) {
            return false;
        }
        FinanceAccountReviews100QapiPost rhs = ((FinanceAccountReviews100QapiPost) other);
        return ((((((((this.refNumber == rhs.refNumber)||((this.refNumber!= null)&&this.refNumber.equals(rhs.refNumber)))&&((this.installmentPlan == rhs.installmentPlan)||((this.installmentPlan!= null)&&this.installmentPlan.equals(rhs.installmentPlan))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.colId == rhs.colId)||((this.colId!= null)&&this.colId.equals(rhs.colId))))&&((this.planAmount == rhs.planAmount)||((this.planAmount!= null)&&this.planAmount.equals(rhs.planAmount))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
