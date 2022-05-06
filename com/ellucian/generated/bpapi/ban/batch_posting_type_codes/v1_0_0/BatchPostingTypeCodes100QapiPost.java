
package com.ellucian.generated.bpapi.ban.batch_posting_type_codes.v1_0_0;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "amtReqInd",
    "code",
    "commentRjctCdeInd",
    "commentRjctTypeInd",
    "dateReqInd",
    "desc",
    "miscCde2ReqInd",
    "miscCdeReqInd",
    "periodReqInd",
    "postCodeReqInd",
    "statusReqInd",
    "termReqInd"
})
@Generated("jsonschema2pojo")
public class BatchPostingTypeCodes100QapiPost {

    /**
     * Amount Required
     * <p>
     * Lineage reference object : RTVPTYP_AMT_REQ_IND
     * 
     */
    @JsonProperty("amtReqInd")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_AMT_REQ_IND")
    private String amtReqInd;
    /**
     * Type Code
     * <p>
     * Lineage reference object : RTVPTYP_CODE
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_CODE")
    private String code;
    /**
     * Reject Code
     * <p>
     * Lineage reference object : RTVPTYP_COMMENT_RJCT_CDE_IND
     * 
     */
    @JsonProperty("commentRjctCdeInd")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_COMMENT_RJCT_CDE_IND")
    private String commentRjctCdeInd;
    /**
     * Reject Type
     * <p>
     * Lineage reference object : RTVPTYP_COMMENT_RJCT_TYPE_IND
     * 
     */
    @JsonProperty("commentRjctTypeInd")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_COMMENT_RJCT_TYPE_IND")
    private String commentRjctTypeInd;
    /**
     * Date Required
     * <p>
     * Lineage reference object : RTVPTYP_DATE_REQ_IND
     * 
     */
    @JsonProperty("dateReqInd")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_DATE_REQ_IND")
    private String dateReqInd;
    /**
     * Description
     * <p>
     * Lineage reference object : RTVPTYP_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_DESC")
    private String desc;
    /**
     * Misc Code 2 Required
     * <p>
     * Lineage reference object : RTVPTYP_MISC_CDE_2_REQ_IND
     * 
     */
    @JsonProperty("miscCde2ReqInd")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_MISC_CDE_2_REQ_IND")
    private String miscCde2ReqInd;
    /**
     * Misc Code 1 Required
     * <p>
     * Lineage reference object : RTVPTYP_MISC_CDE_REQ_IND
     * 
     */
    @JsonProperty("miscCdeReqInd")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_MISC_CDE_REQ_IND")
    private String miscCdeReqInd;
    /**
     * Period Required
     * <p>
     * Lineage reference object : RTVPTYP_PERIOD_REQ_IND
     * 
     */
    @JsonProperty("periodReqInd")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_PERIOD_REQ_IND")
    private String periodReqInd;
    /**
     * Code Required
     * <p>
     * Lineage reference object : RTVPTYP_POST_CODE_REQ_IND
     * 
     */
    @JsonProperty("postCodeReqInd")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_POST_CODE_REQ_IND")
    private String postCodeReqInd;
    /**
     * Status Required
     * <p>
     * Lineage reference object : RTVPTYP_STATUS_REQ_IND
     * 
     */
    @JsonProperty("statusReqInd")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_STATUS_REQ_IND")
    private String statusReqInd;
    /**
     * Term Required
     * <p>
     * Lineage reference object : RTVPTYP_TERM_REQ_IND
     * 
     */
    @JsonProperty("termReqInd")
    @JsonPropertyDescription("Lineage reference object : RTVPTYP_TERM_REQ_IND")
    private String termReqInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Amount Required
     * <p>
     * Lineage reference object : RTVPTYP_AMT_REQ_IND
     * 
     */
    @JsonProperty("amtReqInd")
    public String getAmtReqInd() {
        return amtReqInd;
    }

    /**
     * Amount Required
     * <p>
     * Lineage reference object : RTVPTYP_AMT_REQ_IND
     * 
     */
    @JsonProperty("amtReqInd")
    public void setAmtReqInd(String amtReqInd) {
        this.amtReqInd = amtReqInd;
    }

    public BatchPostingTypeCodes100QapiPost withAmtReqInd(String amtReqInd) {
        this.amtReqInd = amtReqInd;
        return this;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : RTVPTYP_CODE
     * 
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Type Code
     * <p>
     * Lineage reference object : RTVPTYP_CODE
     * 
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public BatchPostingTypeCodes100QapiPost withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Reject Code
     * <p>
     * Lineage reference object : RTVPTYP_COMMENT_RJCT_CDE_IND
     * 
     */
    @JsonProperty("commentRjctCdeInd")
    public String getCommentRjctCdeInd() {
        return commentRjctCdeInd;
    }

    /**
     * Reject Code
     * <p>
     * Lineage reference object : RTVPTYP_COMMENT_RJCT_CDE_IND
     * 
     */
    @JsonProperty("commentRjctCdeInd")
    public void setCommentRjctCdeInd(String commentRjctCdeInd) {
        this.commentRjctCdeInd = commentRjctCdeInd;
    }

    public BatchPostingTypeCodes100QapiPost withCommentRjctCdeInd(String commentRjctCdeInd) {
        this.commentRjctCdeInd = commentRjctCdeInd;
        return this;
    }

    /**
     * Reject Type
     * <p>
     * Lineage reference object : RTVPTYP_COMMENT_RJCT_TYPE_IND
     * 
     */
    @JsonProperty("commentRjctTypeInd")
    public String getCommentRjctTypeInd() {
        return commentRjctTypeInd;
    }

    /**
     * Reject Type
     * <p>
     * Lineage reference object : RTVPTYP_COMMENT_RJCT_TYPE_IND
     * 
     */
    @JsonProperty("commentRjctTypeInd")
    public void setCommentRjctTypeInd(String commentRjctTypeInd) {
        this.commentRjctTypeInd = commentRjctTypeInd;
    }

    public BatchPostingTypeCodes100QapiPost withCommentRjctTypeInd(String commentRjctTypeInd) {
        this.commentRjctTypeInd = commentRjctTypeInd;
        return this;
    }

    /**
     * Date Required
     * <p>
     * Lineage reference object : RTVPTYP_DATE_REQ_IND
     * 
     */
    @JsonProperty("dateReqInd")
    public String getDateReqInd() {
        return dateReqInd;
    }

    /**
     * Date Required
     * <p>
     * Lineage reference object : RTVPTYP_DATE_REQ_IND
     * 
     */
    @JsonProperty("dateReqInd")
    public void setDateReqInd(String dateReqInd) {
        this.dateReqInd = dateReqInd;
    }

    public BatchPostingTypeCodes100QapiPost withDateReqInd(String dateReqInd) {
        this.dateReqInd = dateReqInd;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVPTYP_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : RTVPTYP_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BatchPostingTypeCodes100QapiPost withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Misc Code 2 Required
     * <p>
     * Lineage reference object : RTVPTYP_MISC_CDE_2_REQ_IND
     * 
     */
    @JsonProperty("miscCde2ReqInd")
    public String getMiscCde2ReqInd() {
        return miscCde2ReqInd;
    }

    /**
     * Misc Code 2 Required
     * <p>
     * Lineage reference object : RTVPTYP_MISC_CDE_2_REQ_IND
     * 
     */
    @JsonProperty("miscCde2ReqInd")
    public void setMiscCde2ReqInd(String miscCde2ReqInd) {
        this.miscCde2ReqInd = miscCde2ReqInd;
    }

    public BatchPostingTypeCodes100QapiPost withMiscCde2ReqInd(String miscCde2ReqInd) {
        this.miscCde2ReqInd = miscCde2ReqInd;
        return this;
    }

    /**
     * Misc Code 1 Required
     * <p>
     * Lineage reference object : RTVPTYP_MISC_CDE_REQ_IND
     * 
     */
    @JsonProperty("miscCdeReqInd")
    public String getMiscCdeReqInd() {
        return miscCdeReqInd;
    }

    /**
     * Misc Code 1 Required
     * <p>
     * Lineage reference object : RTVPTYP_MISC_CDE_REQ_IND
     * 
     */
    @JsonProperty("miscCdeReqInd")
    public void setMiscCdeReqInd(String miscCdeReqInd) {
        this.miscCdeReqInd = miscCdeReqInd;
    }

    public BatchPostingTypeCodes100QapiPost withMiscCdeReqInd(String miscCdeReqInd) {
        this.miscCdeReqInd = miscCdeReqInd;
        return this;
    }

    /**
     * Period Required
     * <p>
     * Lineage reference object : RTVPTYP_PERIOD_REQ_IND
     * 
     */
    @JsonProperty("periodReqInd")
    public String getPeriodReqInd() {
        return periodReqInd;
    }

    /**
     * Period Required
     * <p>
     * Lineage reference object : RTVPTYP_PERIOD_REQ_IND
     * 
     */
    @JsonProperty("periodReqInd")
    public void setPeriodReqInd(String periodReqInd) {
        this.periodReqInd = periodReqInd;
    }

    public BatchPostingTypeCodes100QapiPost withPeriodReqInd(String periodReqInd) {
        this.periodReqInd = periodReqInd;
        return this;
    }

    /**
     * Code Required
     * <p>
     * Lineage reference object : RTVPTYP_POST_CODE_REQ_IND
     * 
     */
    @JsonProperty("postCodeReqInd")
    public String getPostCodeReqInd() {
        return postCodeReqInd;
    }

    /**
     * Code Required
     * <p>
     * Lineage reference object : RTVPTYP_POST_CODE_REQ_IND
     * 
     */
    @JsonProperty("postCodeReqInd")
    public void setPostCodeReqInd(String postCodeReqInd) {
        this.postCodeReqInd = postCodeReqInd;
    }

    public BatchPostingTypeCodes100QapiPost withPostCodeReqInd(String postCodeReqInd) {
        this.postCodeReqInd = postCodeReqInd;
        return this;
    }

    /**
     * Status Required
     * <p>
     * Lineage reference object : RTVPTYP_STATUS_REQ_IND
     * 
     */
    @JsonProperty("statusReqInd")
    public String getStatusReqInd() {
        return statusReqInd;
    }

    /**
     * Status Required
     * <p>
     * Lineage reference object : RTVPTYP_STATUS_REQ_IND
     * 
     */
    @JsonProperty("statusReqInd")
    public void setStatusReqInd(String statusReqInd) {
        this.statusReqInd = statusReqInd;
    }

    public BatchPostingTypeCodes100QapiPost withStatusReqInd(String statusReqInd) {
        this.statusReqInd = statusReqInd;
        return this;
    }

    /**
     * Term Required
     * <p>
     * Lineage reference object : RTVPTYP_TERM_REQ_IND
     * 
     */
    @JsonProperty("termReqInd")
    public String getTermReqInd() {
        return termReqInd;
    }

    /**
     * Term Required
     * <p>
     * Lineage reference object : RTVPTYP_TERM_REQ_IND
     * 
     */
    @JsonProperty("termReqInd")
    public void setTermReqInd(String termReqInd) {
        this.termReqInd = termReqInd;
    }

    public BatchPostingTypeCodes100QapiPost withTermReqInd(String termReqInd) {
        this.termReqInd = termReqInd;
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

    public BatchPostingTypeCodes100QapiPost withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BatchPostingTypeCodes100QapiPost.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("amtReqInd");
        sb.append('=');
        sb.append(((this.amtReqInd == null)?"<null>":this.amtReqInd));
        sb.append(',');
        sb.append("code");
        sb.append('=');
        sb.append(((this.code == null)?"<null>":this.code));
        sb.append(',');
        sb.append("commentRjctCdeInd");
        sb.append('=');
        sb.append(((this.commentRjctCdeInd == null)?"<null>":this.commentRjctCdeInd));
        sb.append(',');
        sb.append("commentRjctTypeInd");
        sb.append('=');
        sb.append(((this.commentRjctTypeInd == null)?"<null>":this.commentRjctTypeInd));
        sb.append(',');
        sb.append("dateReqInd");
        sb.append('=');
        sb.append(((this.dateReqInd == null)?"<null>":this.dateReqInd));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("miscCde2ReqInd");
        sb.append('=');
        sb.append(((this.miscCde2ReqInd == null)?"<null>":this.miscCde2ReqInd));
        sb.append(',');
        sb.append("miscCdeReqInd");
        sb.append('=');
        sb.append(((this.miscCdeReqInd == null)?"<null>":this.miscCdeReqInd));
        sb.append(',');
        sb.append("periodReqInd");
        sb.append('=');
        sb.append(((this.periodReqInd == null)?"<null>":this.periodReqInd));
        sb.append(',');
        sb.append("postCodeReqInd");
        sb.append('=');
        sb.append(((this.postCodeReqInd == null)?"<null>":this.postCodeReqInd));
        sb.append(',');
        sb.append("statusReqInd");
        sb.append('=');
        sb.append(((this.statusReqInd == null)?"<null>":this.statusReqInd));
        sb.append(',');
        sb.append("termReqInd");
        sb.append('=');
        sb.append(((this.termReqInd == null)?"<null>":this.termReqInd));
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
        result = ((result* 31)+((this.dateReqInd == null)? 0 :this.dateReqInd.hashCode()));
        result = ((result* 31)+((this.code == null)? 0 :this.code.hashCode()));
        result = ((result* 31)+((this.miscCde2ReqInd == null)? 0 :this.miscCde2ReqInd.hashCode()));
        result = ((result* 31)+((this.termReqInd == null)? 0 :this.termReqInd.hashCode()));
        result = ((result* 31)+((this.postCodeReqInd == null)? 0 :this.postCodeReqInd.hashCode()));
        result = ((result* 31)+((this.commentRjctTypeInd == null)? 0 :this.commentRjctTypeInd.hashCode()));
        result = ((result* 31)+((this.miscCdeReqInd == null)? 0 :this.miscCdeReqInd.hashCode()));
        result = ((result* 31)+((this.commentRjctCdeInd == null)? 0 :this.commentRjctCdeInd.hashCode()));
        result = ((result* 31)+((this.statusReqInd == null)? 0 :this.statusReqInd.hashCode()));
        result = ((result* 31)+((this.periodReqInd == null)? 0 :this.periodReqInd.hashCode()));
        result = ((result* 31)+((this.amtReqInd == null)? 0 :this.amtReqInd.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BatchPostingTypeCodes100QapiPost) == false) {
            return false;
        }
        BatchPostingTypeCodes100QapiPost rhs = ((BatchPostingTypeCodes100QapiPost) other);
        return ((((((((((((((this.dateReqInd == rhs.dateReqInd)||((this.dateReqInd!= null)&&this.dateReqInd.equals(rhs.dateReqInd)))&&((this.code == rhs.code)||((this.code!= null)&&this.code.equals(rhs.code))))&&((this.miscCde2ReqInd == rhs.miscCde2ReqInd)||((this.miscCde2ReqInd!= null)&&this.miscCde2ReqInd.equals(rhs.miscCde2ReqInd))))&&((this.termReqInd == rhs.termReqInd)||((this.termReqInd!= null)&&this.termReqInd.equals(rhs.termReqInd))))&&((this.postCodeReqInd == rhs.postCodeReqInd)||((this.postCodeReqInd!= null)&&this.postCodeReqInd.equals(rhs.postCodeReqInd))))&&((this.commentRjctTypeInd == rhs.commentRjctTypeInd)||((this.commentRjctTypeInd!= null)&&this.commentRjctTypeInd.equals(rhs.commentRjctTypeInd))))&&((this.miscCdeReqInd == rhs.miscCdeReqInd)||((this.miscCdeReqInd!= null)&&this.miscCdeReqInd.equals(rhs.miscCdeReqInd))))&&((this.commentRjctCdeInd == rhs.commentRjctCdeInd)||((this.commentRjctCdeInd!= null)&&this.commentRjctCdeInd.equals(rhs.commentRjctCdeInd))))&&((this.statusReqInd == rhs.statusReqInd)||((this.statusReqInd!= null)&&this.statusReqInd.equals(rhs.statusReqInd))))&&((this.periodReqInd == rhs.periodReqInd)||((this.periodReqInd!= null)&&this.periodReqInd.equals(rhs.periodReqInd))))&&((this.amtReqInd == rhs.amtReqInd)||((this.amtReqInd!= null)&&this.amtReqInd.equals(rhs.amtReqInd))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
