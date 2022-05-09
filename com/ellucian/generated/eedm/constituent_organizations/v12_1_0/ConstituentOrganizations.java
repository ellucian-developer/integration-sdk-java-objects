
package com.ellucian.generated.eedm.constituent_organizations.v12_1_0;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Constituent Organizations
 * <p>
 * An organization that is of interest to an advancement system, may or may not be part of the standard organizations entity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metadata",
    "id",
    "organization",
    "names",
    "description",
    "status",
    "established",
    "preferredLanguage",
    "parentOrganization",
    "primaryContact",
    "matchingProgram",
    "matchingPolicyHolder",
    "webSite",
    "numberOfEmployees",
    "annualRevenue",
    "affiliation",
    "industry",
    "credentials",
    "addresses",
    "phones",
    "emails",
    "socialMedia",
    "referenceId",
    "source"
})
@Generated("jsonschema2pojo")
public class ConstituentOrganizations {

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
     * The global identifier of the constituent organization.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("The global identifier of the constituent organization.")
    private String id;
    /**
     * Organization
     * <p>
     * An optional reference to link a constituent organization to the common organization entity.
     * 
     */
    @JsonProperty("organization")
    @JsonPropertyDescription("An optional reference to link a constituent organization to the common organization entity.")
    private Object organization;
    /**
     * Names
     * <p>
     * The names associated with an organizations, specified by type (for example, "legal" or "birth").
     * (Required)
     * 
     */
    @JsonProperty("names")
    @JsonPropertyDescription("The names associated with an organizations, specified by type (for example, \"legal\" or \"birth\").")
    private Names names;
    /**
     * Description
     * <p>
     * The description of the organization
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The description of the organization")
    private String description;
    /**
     * Status
     * <p>
     * The status of the organization.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("The status of the organization.")
    private Object status;
    /**
     * Established
     * <p>
     * The year the organization was established (founded or incorporated).
     * 
     */
    @JsonProperty("established")
    @JsonPropertyDescription("The year the organization was established (founded or incorporated).")
    private Object established;
    /**
     * Preferred Language
     * <p>
     * The preferred language of the organization.
     * 
     */
    @JsonProperty("preferredLanguage")
    @JsonPropertyDescription("The preferred language of the organization.")
    private Object preferredLanguage;
    /**
     * Parent Organization
     * <p>
     * The parent organization
     * 
     */
    @JsonProperty("parentOrganization")
    @JsonPropertyDescription("The parent organization")
    private Object parentOrganization;
    /**
     * Primary Contact
     * <p>
     * The primary contact for the organization.
     * 
     */
    @JsonProperty("primaryContact")
    @JsonPropertyDescription("The primary contact for the organization.")
    private Object primaryContact;
    /**
     * Matching Program
     * <p>
     * An indicator specifying if the organization has a matching gift program.
     * 
     */
    @JsonProperty("matchingProgram")
    @JsonPropertyDescription("An indicator specifying if the organization has a matching gift program.")
    private Object matchingProgram;
    /**
     * Matching Policy Holder
     * <p>
     * The organization that makes matching gift contributions for the organization.
     * 
     */
    @JsonProperty("matchingPolicyHolder")
    @JsonPropertyDescription("The organization that makes matching gift contributions for the organization.")
    private Object matchingPolicyHolder;
    /**
     * Web Site
     * <p>
     * The organization's main web site.
     * 
     */
    @JsonProperty("webSite")
    @JsonPropertyDescription("The organization's main web site.")
    private URI webSite;
    /**
     * Number Of Employees
     * <p>
     * The number of employees (members) of the organization.
     * 
     */
    @JsonProperty("numberOfEmployees")
    @JsonPropertyDescription("The number of employees (members) of the organization.")
    private Object numberOfEmployees;
    /**
     * Annual Revenue
     * <p>
     * The annual revenue of the organization
     * 
     */
    @JsonProperty("annualRevenue")
    @JsonPropertyDescription("The annual revenue of the organization")
    private Object annualRevenue;
    /**
     * Affiliation
     * <p>
     * The constituents relationship to the institution.
     * (Required)
     * 
     */
    @JsonProperty("affiliation")
    @JsonPropertyDescription("The constituents relationship to the institution.")
    private List<Affiliation> affiliation = new ArrayList<Affiliation>();
    /**
     * Industry
     * <p>
     * The industry classification associated with the organization
     * 
     */
    @JsonProperty("industry")
    @JsonPropertyDescription("The industry classification associated with the organization")
    private List<Industry> industry = new ArrayList<Industry>();
    /**
     * Credentials
     * <p>
     * Information that identifies an organization to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("Information that identifies an organization to a system such as a network or computer.")
    private List<Credential> credentials = new ArrayList<Credential>();
    /**
     * Addresses
     * <p>
     * The physical locations where the organization resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    @JsonPropertyDescription("The physical locations where the organization resides or may be contacted by mail.")
    private List<Address> addresses = new ArrayList<Address>();
    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the organization can be contacted
     * 
     */
    @JsonProperty("phones")
    @JsonPropertyDescription("The phones and phone-connected devices at which the organization can be contacted")
    private List<Phone> phones = new ArrayList<Phone>();
    /**
     * Email
     * <p>
     * The email addresses at which the organization can be contacted
     * 
     */
    @JsonProperty("emails")
    @JsonPropertyDescription("The email addresses at which the organization can be contacted")
    private List<Email> emails = new ArrayList<Email>();
    /**
     * Social Media
     * <p>
     * The social media account at which the organization can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    @JsonPropertyDescription("The social media account at which the organization can be contacted.")
    private List<SocialMedium> socialMedia = new ArrayList<SocialMedium>();
    /**
     * Reference Id
     * <p>
     * The authoritative system’s reference identifier of the organization.
     * 
     */
    @JsonProperty("referenceId")
    @JsonPropertyDescription("The authoritative system\u2019s reference identifier of the organization.")
    private String referenceId;
    /**
     * Source
     * <p>
     * The source of the organization.
     * 
     */
    @JsonProperty("source")
    @JsonPropertyDescription("The source of the organization.")
    private Object source;

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

    public ConstituentOrganizations withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * ID
     * <p>
     * The global identifier of the constituent organization.
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
     * The global identifier of the constituent organization.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public ConstituentOrganizations withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Organization
     * <p>
     * An optional reference to link a constituent organization to the common organization entity.
     * 
     */
    @JsonProperty("organization")
    public Object getOrganization() {
        return organization;
    }

    /**
     * Organization
     * <p>
     * An optional reference to link a constituent organization to the common organization entity.
     * 
     */
    @JsonProperty("organization")
    public void setOrganization(Object organization) {
        this.organization = organization;
    }

    public ConstituentOrganizations withOrganization(Object organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Names
     * <p>
     * The names associated with an organizations, specified by type (for example, "legal" or "birth").
     * (Required)
     * 
     */
    @JsonProperty("names")
    public Names getNames() {
        return names;
    }

    /**
     * Names
     * <p>
     * The names associated with an organizations, specified by type (for example, "legal" or "birth").
     * (Required)
     * 
     */
    @JsonProperty("names")
    public void setNames(Names names) {
        this.names = names;
    }

    public ConstituentOrganizations withNames(Names names) {
        this.names = names;
        return this;
    }

    /**
     * Description
     * <p>
     * The description of the organization
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description
     * <p>
     * The description of the organization
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public ConstituentOrganizations withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Status
     * <p>
     * The status of the organization.
     * 
     */
    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * The status of the organization.
     * 
     */
    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    public ConstituentOrganizations withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Established
     * <p>
     * The year the organization was established (founded or incorporated).
     * 
     */
    @JsonProperty("established")
    public Object getEstablished() {
        return established;
    }

    /**
     * Established
     * <p>
     * The year the organization was established (founded or incorporated).
     * 
     */
    @JsonProperty("established")
    public void setEstablished(Object established) {
        this.established = established;
    }

    public ConstituentOrganizations withEstablished(Object established) {
        this.established = established;
        return this;
    }

    /**
     * Preferred Language
     * <p>
     * The preferred language of the organization.
     * 
     */
    @JsonProperty("preferredLanguage")
    public Object getPreferredLanguage() {
        return preferredLanguage;
    }

    /**
     * Preferred Language
     * <p>
     * The preferred language of the organization.
     * 
     */
    @JsonProperty("preferredLanguage")
    public void setPreferredLanguage(Object preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public ConstituentOrganizations withPreferredLanguage(Object preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
        return this;
    }

    /**
     * Parent Organization
     * <p>
     * The parent organization
     * 
     */
    @JsonProperty("parentOrganization")
    public Object getParentOrganization() {
        return parentOrganization;
    }

    /**
     * Parent Organization
     * <p>
     * The parent organization
     * 
     */
    @JsonProperty("parentOrganization")
    public void setParentOrganization(Object parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    public ConstituentOrganizations withParentOrganization(Object parentOrganization) {
        this.parentOrganization = parentOrganization;
        return this;
    }

    /**
     * Primary Contact
     * <p>
     * The primary contact for the organization.
     * 
     */
    @JsonProperty("primaryContact")
    public Object getPrimaryContact() {
        return primaryContact;
    }

    /**
     * Primary Contact
     * <p>
     * The primary contact for the organization.
     * 
     */
    @JsonProperty("primaryContact")
    public void setPrimaryContact(Object primaryContact) {
        this.primaryContact = primaryContact;
    }

    public ConstituentOrganizations withPrimaryContact(Object primaryContact) {
        this.primaryContact = primaryContact;
        return this;
    }

    /**
     * Matching Program
     * <p>
     * An indicator specifying if the organization has a matching gift program.
     * 
     */
    @JsonProperty("matchingProgram")
    public Object getMatchingProgram() {
        return matchingProgram;
    }

    /**
     * Matching Program
     * <p>
     * An indicator specifying if the organization has a matching gift program.
     * 
     */
    @JsonProperty("matchingProgram")
    public void setMatchingProgram(Object matchingProgram) {
        this.matchingProgram = matchingProgram;
    }

    public ConstituentOrganizations withMatchingProgram(Object matchingProgram) {
        this.matchingProgram = matchingProgram;
        return this;
    }

    /**
     * Matching Policy Holder
     * <p>
     * The organization that makes matching gift contributions for the organization.
     * 
     */
    @JsonProperty("matchingPolicyHolder")
    public Object getMatchingPolicyHolder() {
        return matchingPolicyHolder;
    }

    /**
     * Matching Policy Holder
     * <p>
     * The organization that makes matching gift contributions for the organization.
     * 
     */
    @JsonProperty("matchingPolicyHolder")
    public void setMatchingPolicyHolder(Object matchingPolicyHolder) {
        this.matchingPolicyHolder = matchingPolicyHolder;
    }

    public ConstituentOrganizations withMatchingPolicyHolder(Object matchingPolicyHolder) {
        this.matchingPolicyHolder = matchingPolicyHolder;
        return this;
    }

    /**
     * Web Site
     * <p>
     * The organization's main web site.
     * 
     */
    @JsonProperty("webSite")
    public URI getWebSite() {
        return webSite;
    }

    /**
     * Web Site
     * <p>
     * The organization's main web site.
     * 
     */
    @JsonProperty("webSite")
    public void setWebSite(URI webSite) {
        this.webSite = webSite;
    }

    public ConstituentOrganizations withWebSite(URI webSite) {
        this.webSite = webSite;
        return this;
    }

    /**
     * Number Of Employees
     * <p>
     * The number of employees (members) of the organization.
     * 
     */
    @JsonProperty("numberOfEmployees")
    public Object getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Number Of Employees
     * <p>
     * The number of employees (members) of the organization.
     * 
     */
    @JsonProperty("numberOfEmployees")
    public void setNumberOfEmployees(Object numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public ConstituentOrganizations withNumberOfEmployees(Object numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
        return this;
    }

    /**
     * Annual Revenue
     * <p>
     * The annual revenue of the organization
     * 
     */
    @JsonProperty("annualRevenue")
    public Object getAnnualRevenue() {
        return annualRevenue;
    }

    /**
     * Annual Revenue
     * <p>
     * The annual revenue of the organization
     * 
     */
    @JsonProperty("annualRevenue")
    public void setAnnualRevenue(Object annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public ConstituentOrganizations withAnnualRevenue(Object annualRevenue) {
        this.annualRevenue = annualRevenue;
        return this;
    }

    /**
     * Affiliation
     * <p>
     * The constituents relationship to the institution.
     * (Required)
     * 
     */
    @JsonProperty("affiliation")
    public List<Affiliation> getAffiliation() {
        return affiliation;
    }

    /**
     * Affiliation
     * <p>
     * The constituents relationship to the institution.
     * (Required)
     * 
     */
    @JsonProperty("affiliation")
    public void setAffiliation(List<Affiliation> affiliation) {
        this.affiliation = affiliation;
    }

    public ConstituentOrganizations withAffiliation(List<Affiliation> affiliation) {
        this.affiliation = affiliation;
        return this;
    }

    /**
     * Industry
     * <p>
     * The industry classification associated with the organization
     * 
     */
    @JsonProperty("industry")
    public List<Industry> getIndustry() {
        return industry;
    }

    /**
     * Industry
     * <p>
     * The industry classification associated with the organization
     * 
     */
    @JsonProperty("industry")
    public void setIndustry(List<Industry> industry) {
        this.industry = industry;
    }

    public ConstituentOrganizations withIndustry(List<Industry> industry) {
        this.industry = industry;
        return this;
    }

    /**
     * Credentials
     * <p>
     * Information that identifies an organization to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    public List<Credential> getCredentials() {
        return credentials;
    }

    /**
     * Credentials
     * <p>
     * Information that identifies an organization to a system such as a network or computer.
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(List<Credential> credentials) {
        this.credentials = credentials;
    }

    public ConstituentOrganizations withCredentials(List<Credential> credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Addresses
     * <p>
     * The physical locations where the organization resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    /**
     * Addresses
     * <p>
     * The physical locations where the organization resides or may be contacted by mail.
     * 
     */
    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public ConstituentOrganizations withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the organization can be contacted
     * 
     */
    @JsonProperty("phones")
    public List<Phone> getPhones() {
        return phones;
    }

    /**
     * Phone
     * <p>
     * The phones and phone-connected devices at which the organization can be contacted
     * 
     */
    @JsonProperty("phones")
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public ConstituentOrganizations withPhones(List<Phone> phones) {
        this.phones = phones;
        return this;
    }

    /**
     * Email
     * <p>
     * The email addresses at which the organization can be contacted
     * 
     */
    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    /**
     * Email
     * <p>
     * The email addresses at which the organization can be contacted
     * 
     */
    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public ConstituentOrganizations withEmails(List<Email> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Social Media
     * <p>
     * The social media account at which the organization can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    public List<SocialMedium> getSocialMedia() {
        return socialMedia;
    }

    /**
     * Social Media
     * <p>
     * The social media account at which the organization can be contacted.
     * 
     */
    @JsonProperty("socialMedia")
    public void setSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
    }

    public ConstituentOrganizations withSocialMedia(List<SocialMedium> socialMedia) {
        this.socialMedia = socialMedia;
        return this;
    }

    /**
     * Reference Id
     * <p>
     * The authoritative system’s reference identifier of the organization.
     * 
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Reference Id
     * <p>
     * The authoritative system’s reference identifier of the organization.
     * 
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public ConstituentOrganizations withReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Source
     * <p>
     * The source of the organization.
     * 
     */
    @JsonProperty("source")
    public Object getSource() {
        return source;
    }

    /**
     * Source
     * <p>
     * The source of the organization.
     * 
     */
    @JsonProperty("source")
    public void setSource(Object source) {
        this.source = source;
    }

    public ConstituentOrganizations withSource(Object source) {
        this.source = source;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConstituentOrganizations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("organization");
        sb.append('=');
        sb.append(((this.organization == null)?"<null>":this.organization));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null)?"<null>":this.names));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("established");
        sb.append('=');
        sb.append(((this.established == null)?"<null>":this.established));
        sb.append(',');
        sb.append("preferredLanguage");
        sb.append('=');
        sb.append(((this.preferredLanguage == null)?"<null>":this.preferredLanguage));
        sb.append(',');
        sb.append("parentOrganization");
        sb.append('=');
        sb.append(((this.parentOrganization == null)?"<null>":this.parentOrganization));
        sb.append(',');
        sb.append("primaryContact");
        sb.append('=');
        sb.append(((this.primaryContact == null)?"<null>":this.primaryContact));
        sb.append(',');
        sb.append("matchingProgram");
        sb.append('=');
        sb.append(((this.matchingProgram == null)?"<null>":this.matchingProgram));
        sb.append(',');
        sb.append("matchingPolicyHolder");
        sb.append('=');
        sb.append(((this.matchingPolicyHolder == null)?"<null>":this.matchingPolicyHolder));
        sb.append(',');
        sb.append("webSite");
        sb.append('=');
        sb.append(((this.webSite == null)?"<null>":this.webSite));
        sb.append(',');
        sb.append("numberOfEmployees");
        sb.append('=');
        sb.append(((this.numberOfEmployees == null)?"<null>":this.numberOfEmployees));
        sb.append(',');
        sb.append("annualRevenue");
        sb.append('=');
        sb.append(((this.annualRevenue == null)?"<null>":this.annualRevenue));
        sb.append(',');
        sb.append("affiliation");
        sb.append('=');
        sb.append(((this.affiliation == null)?"<null>":this.affiliation));
        sb.append(',');
        sb.append("industry");
        sb.append('=');
        sb.append(((this.industry == null)?"<null>":this.industry));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
        sb.append(',');
        sb.append("addresses");
        sb.append('=');
        sb.append(((this.addresses == null)?"<null>":this.addresses));
        sb.append(',');
        sb.append("phones");
        sb.append('=');
        sb.append(((this.phones == null)?"<null>":this.phones));
        sb.append(',');
        sb.append("emails");
        sb.append('=');
        sb.append(((this.emails == null)?"<null>":this.emails));
        sb.append(',');
        sb.append("socialMedia");
        sb.append('=');
        sb.append(((this.socialMedia == null)?"<null>":this.socialMedia));
        sb.append(',');
        sb.append("referenceId");
        sb.append('=');
        sb.append(((this.referenceId == null)?"<null>":this.referenceId));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
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
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+((this.preferredLanguage == null)? 0 :this.preferredLanguage.hashCode()));
        result = ((result* 31)+((this.addresses == null)? 0 :this.addresses.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.phones == null)? 0 :this.phones.hashCode()));
        result = ((result* 31)+((this.industry == null)? 0 :this.industry.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.parentOrganization == null)? 0 :this.parentOrganization.hashCode()));
        result = ((result* 31)+((this.referenceId == null)? 0 :this.referenceId.hashCode()));
        result = ((result* 31)+((this.matchingPolicyHolder == null)? 0 :this.matchingPolicyHolder.hashCode()));
        result = ((result* 31)+((this.webSite == null)? 0 :this.webSite.hashCode()));
        result = ((result* 31)+((this.emails == null)? 0 :this.emails.hashCode()));
        result = ((result* 31)+((this.affiliation == null)? 0 :this.affiliation.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.matchingProgram == null)? 0 :this.matchingProgram.hashCode()));
        result = ((result* 31)+((this.established == null)? 0 :this.established.hashCode()));
        result = ((result* 31)+((this.socialMedia == null)? 0 :this.socialMedia.hashCode()));
        result = ((result* 31)+((this.numberOfEmployees == null)? 0 :this.numberOfEmployees.hashCode()));
        result = ((result* 31)+((this.names == null)? 0 :this.names.hashCode()));
        result = ((result* 31)+((this.organization == null)? 0 :this.organization.hashCode()));
        result = ((result* 31)+((this.primaryContact == null)? 0 :this.primaryContact.hashCode()));
        result = ((result* 31)+((this.annualRevenue == null)? 0 :this.annualRevenue.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConstituentOrganizations) == false) {
            return false;
        }
        ConstituentOrganizations rhs = ((ConstituentOrganizations) other);
        return (((((((((((((((((((((((((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata)))&&((this.preferredLanguage == rhs.preferredLanguage)||((this.preferredLanguage!= null)&&this.preferredLanguage.equals(rhs.preferredLanguage))))&&((this.addresses == rhs.addresses)||((this.addresses!= null)&&this.addresses.equals(rhs.addresses))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.phones == rhs.phones)||((this.phones!= null)&&this.phones.equals(rhs.phones))))&&((this.industry == rhs.industry)||((this.industry!= null)&&this.industry.equals(rhs.industry))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.parentOrganization == rhs.parentOrganization)||((this.parentOrganization!= null)&&this.parentOrganization.equals(rhs.parentOrganization))))&&((this.referenceId == rhs.referenceId)||((this.referenceId!= null)&&this.referenceId.equals(rhs.referenceId))))&&((this.matchingPolicyHolder == rhs.matchingPolicyHolder)||((this.matchingPolicyHolder!= null)&&this.matchingPolicyHolder.equals(rhs.matchingPolicyHolder))))&&((this.webSite == rhs.webSite)||((this.webSite!= null)&&this.webSite.equals(rhs.webSite))))&&((this.emails == rhs.emails)||((this.emails!= null)&&this.emails.equals(rhs.emails))))&&((this.affiliation == rhs.affiliation)||((this.affiliation!= null)&&this.affiliation.equals(rhs.affiliation))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.matchingProgram == rhs.matchingProgram)||((this.matchingProgram!= null)&&this.matchingProgram.equals(rhs.matchingProgram))))&&((this.established == rhs.established)||((this.established!= null)&&this.established.equals(rhs.established))))&&((this.socialMedia == rhs.socialMedia)||((this.socialMedia!= null)&&this.socialMedia.equals(rhs.socialMedia))))&&((this.numberOfEmployees == rhs.numberOfEmployees)||((this.numberOfEmployees!= null)&&this.numberOfEmployees.equals(rhs.numberOfEmployees))))&&((this.names == rhs.names)||((this.names!= null)&&this.names.equals(rhs.names))))&&((this.organization == rhs.organization)||((this.organization!= null)&&this.organization.equals(rhs.organization))))&&((this.primaryContact == rhs.primaryContact)||((this.primaryContact!= null)&&this.primaryContact.equals(rhs.primaryContact))))&&((this.annualRevenue == rhs.annualRevenue)||((this.annualRevenue!= null)&&this.annualRevenue.equals(rhs.annualRevenue))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
