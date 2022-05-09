
package com.ellucian.generated.eedm.grants.v11_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Grants
 * <p>
 * Information about grants that are offered by various sponsors to help fund research efforts.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "title",
    "referenceCode",
    "sponsorReferenceCode",
    "reportingSegment",
    "startOn",
    "endOn",
    "sponsor",
    "status",
    "accountingStrings",
    "amount",
    "category",
    "reportingPeriods",
    "principalInvestigator"
})
@Generated("jsonschema2pojo")
public class Grants {

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    @JsonPropertyDescription("Metadata about the JSON payload")
    private Metadata metadata;
    /**
     * ID
     * <p>
     * The global identifier of the grant.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the grant.")
    private String id;
    /**
     * Title
     * <p>
     * The full name of the grant.
     * (Required)
     * 
     */
    @JsonProperty("title")
    @JsonPropertyDescription("The full name of the grant.")
    private String title;
    /**
     * Reference Code
     * <p>
     * The reference code used to identify the grant or project.
     * (Required)
     * 
     */
    @JsonProperty("referenceCode")
    @JsonPropertyDescription("The reference code used to identify the grant or project.")
    private String referenceCode;
    /**
     * Sponsor Reference Code
     * <p>
     * The reference code used by the sponsor.
     * 
     */
    @JsonProperty("sponsorReferenceCode")
    @JsonPropertyDescription("The reference code used by the sponsor.")
    private String sponsorReferenceCode;
    /**
     * Reporting Segment
     * <p>
     * The segment of the educational institution used for reporting purposes.
     * 
     */
    @JsonProperty("reportingSegment")
    @JsonPropertyDescription("The segment of the educational institution used for reporting purposes.")
    private String reportingSegment;
    /**
     * Start On
     * <p>
     * The first date when transactions can be processed for the grant or project.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    @JsonPropertyDescription("The first date when transactions can be processed for the grant or project.")
    private String startOn;
    /**
     * End On
     * <p>
     * The last date when transactions can be processed for the grant or project.
     * 
     */
    @JsonProperty("endOn")
    @JsonPropertyDescription("The last date when transactions can be processed for the grant or project.")
    private Object endOn;
    /**
     * Sponsor
     * <p>
     * The person or organization sponsoring the grant.
     * 
     */
    @JsonProperty("sponsor")
    @JsonPropertyDescription("The person or organization sponsoring the grant.")
    private Object sponsor;
    /**
     * Status
     * <p>
     * The status of the grant.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the grant.")
    private Object status;
    /**
     * Accounting Strings
     * <p>
     * The formatted accounting strings associated with the grant.
     * 
     */
    @JsonProperty("accountingStrings")
    @JsonPropertyDescription("The formatted accounting strings associated with the grant.")
    private List<String> accountingStrings = new ArrayList<String>();
    /**
     * Amount
     * <p>
     * The total amount budgeted for the grant or project.
     * 
     */
    @JsonProperty("amount")
    @JsonPropertyDescription("The total amount budgeted for the grant or project.")
    private Object amount;
    /**
     * Category
     * <p>
     * The category of the grant. (For example, research grant, construction project, etc.)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("The category of the grant. (For example, research grant, construction project, etc.)")
    private String category;
    /**
     * Reporting Periods
     * <p>
     * The reporting periods associated with the grant.
     * 
     */
    @JsonProperty("reportingPeriods")
    @JsonPropertyDescription("The reporting periods associated with the grant.")
    private List<ReportingPeriod> reportingPeriods = new ArrayList<ReportingPeriod>();
    /**
     * Principal Investigator
     * <p>
     * The principal investigator associated with the grant or project.
     * 
     */
    @JsonProperty("principalInvestigator")
    @JsonPropertyDescription("The principal investigator associated with the grant or project.")
    private Object principalInvestigator;

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Metadata
     * <p>
     * Metadata about the JSON payload
     * 
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Grants withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the grant.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * ID
     * <p>
     * The global identifier of the grant.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Grants withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Title
     * <p>
     * The full name of the grant.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Title
     * <p>
     * The full name of the grant.
     * (Required)
     * 
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Grants withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Reference Code
     * <p>
     * The reference code used to identify the grant or project.
     * (Required)
     * 
     */
    @JsonProperty("referenceCode")
    public String getReferenceCode() {
        return referenceCode;
    }

    /**
     * Reference Code
     * <p>
     * The reference code used to identify the grant or project.
     * (Required)
     * 
     */
    @JsonProperty("referenceCode")
    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public Grants withReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
        return this;
    }

    /**
     * Sponsor Reference Code
     * <p>
     * The reference code used by the sponsor.
     * 
     */
    @JsonProperty("sponsorReferenceCode")
    public String getSponsorReferenceCode() {
        return sponsorReferenceCode;
    }

    /**
     * Sponsor Reference Code
     * <p>
     * The reference code used by the sponsor.
     * 
     */
    @JsonProperty("sponsorReferenceCode")
    public void setSponsorReferenceCode(String sponsorReferenceCode) {
        this.sponsorReferenceCode = sponsorReferenceCode;
    }

    public Grants withSponsorReferenceCode(String sponsorReferenceCode) {
        this.sponsorReferenceCode = sponsorReferenceCode;
        return this;
    }

    /**
     * Reporting Segment
     * <p>
     * The segment of the educational institution used for reporting purposes.
     * 
     */
    @JsonProperty("reportingSegment")
    public String getReportingSegment() {
        return reportingSegment;
    }

    /**
     * Reporting Segment
     * <p>
     * The segment of the educational institution used for reporting purposes.
     * 
     */
    @JsonProperty("reportingSegment")
    public void setReportingSegment(String reportingSegment) {
        this.reportingSegment = reportingSegment;
    }

    public Grants withReportingSegment(String reportingSegment) {
        this.reportingSegment = reportingSegment;
        return this;
    }

    /**
     * Start On
     * <p>
     * The first date when transactions can be processed for the grant or project.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public String getStartOn() {
        return startOn;
    }

    /**
     * Start On
     * <p>
     * The first date when transactions can be processed for the grant or project.
     * (Required)
     * 
     */
    @JsonProperty("startOn")
    public void setStartOn(String startOn) {
        this.startOn = startOn;
    }

    public Grants withStartOn(String startOn) {
        this.startOn = startOn;
        return this;
    }

    /**
     * End On
     * <p>
     * The last date when transactions can be processed for the grant or project.
     * 
     */
    @JsonProperty("endOn")
    public Object getEndOn() {
        return endOn;
    }

    /**
     * End On
     * <p>
     * The last date when transactions can be processed for the grant or project.
     * 
     */
    @JsonProperty("endOn")
    public void setEndOn(Object endOn) {
        this.endOn = endOn;
    }

    public Grants withEndOn(Object endOn) {
        this.endOn = endOn;
        return this;
    }

    /**
     * Sponsor
     * <p>
     * The person or organization sponsoring the grant.
     * 
     */
    @JsonProperty("sponsor")
    public Object getSponsor() {
        return sponsor;
    }

    /**
     * Sponsor
     * <p>
     * The person or organization sponsoring the grant.
     * 
     */
    @JsonProperty("sponsor")
    public void setSponsor(Object sponsor) {
        this.sponsor = sponsor;
    }

    public Grants withSponsor(Object sponsor) {
        this.sponsor = sponsor;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the grant.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the grant.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public Grants withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Accounting Strings
     * <p>
     * The formatted accounting strings associated with the grant.
     * 
     */
    @JsonProperty("accountingStrings")
    public List<String> getAccountingStrings() {
        return accountingStrings;
    }

    /**
     * Accounting Strings
     * <p>
     * The formatted accounting strings associated with the grant.
     * 
     */
    @JsonProperty("accountingStrings")
    public void setAccountingStrings(List<String> accountingStrings) {
        this.accountingStrings = accountingStrings;
    }

    public Grants withAccountingStrings(List<String> accountingStrings) {
        this.accountingStrings = accountingStrings;
        return this;
    }

    /**
     * Amount
     * <p>
     * The total amount budgeted for the grant or project.
     * 
     */
    @JsonProperty("amount")
    public Object getAmount() {
        return amount;
    }

    /**
     * Amount
     * <p>
     * The total amount budgeted for the grant or project.
     * 
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {
        this.amount = amount;
    }

    public Grants withAmount(Object amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Category
     * <p>
     * The category of the grant. (For example, research grant, construction project, etc.)
     * 
     */
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }

    /**
     * Category
     * <p>
     * The category of the grant. (For example, research grant, construction project, etc.)
     * 
     */
    @JsonProperty("category")
    public void setCategory(String category) {
        this.category = category;
    }

    public Grants withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Reporting Periods
     * <p>
     * The reporting periods associated with the grant.
     * 
     */
    @JsonProperty("reportingPeriods")
    public List<ReportingPeriod> getReportingPeriods() {
        return reportingPeriods;
    }

    /**
     * Reporting Periods
     * <p>
     * The reporting periods associated with the grant.
     * 
     */
    @JsonProperty("reportingPeriods")
    public void setReportingPeriods(List<ReportingPeriod> reportingPeriods) {
        this.reportingPeriods = reportingPeriods;
    }

    public Grants withReportingPeriods(List<ReportingPeriod> reportingPeriods) {
        this.reportingPeriods = reportingPeriods;
        return this;
    }

    /**
     * Principal Investigator
     * <p>
     * The principal investigator associated with the grant or project.
     * 
     */
    @JsonProperty("principalInvestigator")
    public Object getPrincipalInvestigator() {
        return principalInvestigator;
    }

    /**
     * Principal Investigator
     * <p>
     * The principal investigator associated with the grant or project.
     * 
     */
    @JsonProperty("principalInvestigator")
    public void setPrincipalInvestigator(Object principalInvestigator) {
        this.principalInvestigator = principalInvestigator;
    }

    public Grants withPrincipalInvestigator(Object principalInvestigator) {
        this.principalInvestigator = principalInvestigator;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Grants.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("referenceCode");
        sb.append('=');
        sb.append(((this.referenceCode == null)?"<null>":this.referenceCode));
        sb.append(',');
        sb.append("sponsorReferenceCode");
        sb.append('=');
        sb.append(((this.sponsorReferenceCode == null)?"<null>":this.sponsorReferenceCode));
        sb.append(',');
        sb.append("reportingSegment");
        sb.append('=');
        sb.append(((this.reportingSegment == null)?"<null>":this.reportingSegment));
        sb.append(',');
        sb.append("startOn");
        sb.append('=');
        sb.append(((this.startOn == null)?"<null>":this.startOn));
        sb.append(',');
        sb.append("endOn");
        sb.append('=');
        sb.append(((this.endOn == null)?"<null>":this.endOn));
        sb.append(',');
        sb.append("sponsor");
        sb.append('=');
        sb.append(((this.sponsor == null)?"<null>":this.sponsor));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("accountingStrings");
        sb.append('=');
        sb.append(((this.accountingStrings == null)?"<null>":this.accountingStrings));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("reportingPeriods");
        sb.append('=');
        sb.append(((this.reportingPeriods == null)?"<null>":this.reportingPeriods));
        sb.append(',');
        sb.append("principalInvestigator");
        sb.append('=');
        sb.append(((this.principalInvestigator == null)?"<null>":this.principalInvestigator));
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
        result = ((result* 31)+((this.sponsor == null)? 0 :this.sponsor.hashCode()));
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.amount == null)? 0 :this.amount.hashCode()));
        result = ((result* 31)+((this.startOn == null)? 0 :this.startOn.hashCode()));
        result = ((result* 31)+((this.title == null)? 0 :this.title.hashCode()));
        result = ((result* 31)+((this.reportingSegment == null)? 0 :this.reportingSegment.hashCode()));
        result = ((result* 31)+((this.sponsorReferenceCode == null)? 0 :this.sponsorReferenceCode.hashCode()));
        result = ((result* 31)+((this.endOn == null)? 0 :this.endOn.hashCode()));
        result = ((result* 31)+((this.reportingPeriods == null)? 0 :this.reportingPeriods.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.referenceCode == null)? 0 :this.referenceCode.hashCode()));
        result = ((result* 31)+((this.accountingStrings == null)? 0 :this.accountingStrings.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.principalInvestigator == null)? 0 :this.principalInvestigator.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Grants) == false) {
            return false;
        }
        Grants rhs = ((Grants) other);
        return ((((((((((((((((this.sponsor == rhs.sponsor)||((this.sponsor!= null)&&this.sponsor.equals(rhs.sponsor)))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&((this.amount == rhs.amount)||((this.amount!= null)&&this.amount.equals(rhs.amount))))&&((this.startOn == rhs.startOn)||((this.startOn!= null)&&this.startOn.equals(rhs.startOn))))&&((this.title == rhs.title)||((this.title!= null)&&this.title.equals(rhs.title))))&&((this.reportingSegment == rhs.reportingSegment)||((this.reportingSegment!= null)&&this.reportingSegment.equals(rhs.reportingSegment))))&&((this.sponsorReferenceCode == rhs.sponsorReferenceCode)||((this.sponsorReferenceCode!= null)&&this.sponsorReferenceCode.equals(rhs.sponsorReferenceCode))))&&((this.endOn == rhs.endOn)||((this.endOn!= null)&&this.endOn.equals(rhs.endOn))))&&((this.reportingPeriods == rhs.reportingPeriods)||((this.reportingPeriods!= null)&&this.reportingPeriods.equals(rhs.reportingPeriods))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.referenceCode == rhs.referenceCode)||((this.referenceCode!= null)&&this.referenceCode.equals(rhs.referenceCode))))&&((this.accountingStrings == rhs.accountingStrings)||((this.accountingStrings!= null)&&this.accountingStrings.equals(rhs.accountingStrings))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.principalInvestigator == rhs.principalInvestigator)||((this.principalInvestigator!= null)&&this.principalInvestigator.equals(rhs.principalInvestigator))));
    }

}
