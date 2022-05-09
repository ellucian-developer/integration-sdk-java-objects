
package com.ellucian.generated.eedm.wealth_screening_reports.v6_0;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Quality Of Match
 * <p>
 * Quality of match metrics
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "aircraft",
    "airmen",
    "businessRegistrations",
    "dunnAndBradstreet",
    "volunteersAndDirectors",
    "doNotMail",
    "charitableDonations",
    "federalElections",
    "guidestarFoundations",
    "guidestarDirectors",
    "householdProfile",
    "hoovers",
    "majorDonor",
    "physiciansProfiles",
    "marketGuide",
    "politicalDirectors",
    "pension",
    "philanthropy",
    "politicalOrganizations",
    "realEstate",
    "politicalDonations",
    "death",
    "securities",
    "foundationTrustees",
    "merchantVessels",
    "whosWho"
})
@Generated("jsonschema2pojo")
public class QualityOfMatch {

    /**
     * Aircraft
     * <p>
     * The quality of match for the Aircraft source
     * 
     */
    @JsonProperty("aircraft")
    @JsonPropertyDescription("The quality of match for the Aircraft source")
    private String aircraft;
    /**
     * Airmen
     * <p>
     * The quality of match for the Airmen source
     * 
     */
    @JsonProperty("airmen")
    @JsonPropertyDescription("The quality of match for the Airmen source")
    private String airmen;
    /**
     * Business Registrations
     * <p>
     * The quality of match for the D&B State Business Registrations source
     * 
     */
    @JsonProperty("businessRegistrations")
    @JsonPropertyDescription("The quality of match for the D&B State Business Registrations source")
    private String businessRegistrations;
    /**
     * Dunn And Bradstreet
     * <p>
     * The quality of match for the Dunn & Bradstreet source
     * 
     */
    @JsonProperty("dunnAndBradstreet")
    @JsonPropertyDescription("The quality of match for the Dunn & Bradstreet source")
    private String dunnAndBradstreet;
    /**
     * Volunteers And Directors
     * <p>
     * The quality of match for the Volunteers & Directors source
     * 
     */
    @JsonProperty("volunteersAndDirectors")
    @JsonPropertyDescription("The quality of match for the Volunteers & Directors source")
    private String volunteersAndDirectors;
    /**
     * Do Not Mail
     * <p>
     * The quality of match for the National Do-Not-Mail Registry source
     * 
     */
    @JsonProperty("doNotMail")
    @JsonPropertyDescription("The quality of match for the National Do-Not-Mail Registry source")
    private String doNotMail;
    /**
     * Charitable Donations
     * <p>
     * The quality of match for the Charitable Donations source
     * 
     */
    @JsonProperty("charitableDonations")
    @JsonPropertyDescription("The quality of match for the Charitable Donations source")
    private String charitableDonations;
    /**
     * Federal Elections
     * <p>
     * The quality of match for the Federal Elections Campaigns source
     * 
     */
    @JsonProperty("federalElections")
    @JsonPropertyDescription("The quality of match for the Federal Elections Campaigns source")
    private String federalElections;
    /**
     * Guidestar Foundations
     * <p>
     * The quality of match for the Guidestar Foundations source
     * 
     */
    @JsonProperty("guidestarFoundations")
    @JsonPropertyDescription("The quality of match for the Guidestar Foundations source")
    private String guidestarFoundations;
    /**
     * Guidestar Directors
     * <p>
     * The quality of match for the Guidestar Directors source
     * 
     */
    @JsonProperty("guidestarDirectors")
    @JsonPropertyDescription("The quality of match for the Guidestar Directors source")
    private String guidestarDirectors;
    /**
     * Household Profile
     * <p>
     * The quality of match for the Household Profile source
     * 
     */
    @JsonProperty("householdProfile")
    @JsonPropertyDescription("The quality of match for the Household Profile source")
    private String householdProfile;
    /**
     * Hoover's
     * <p>
     * The quality of match for the Hoover's source
     * 
     */
    @JsonProperty("hoovers")
    @JsonPropertyDescription("The quality of match for the Hoover's source")
    private String hoovers;
    /**
     * Major Donor
     * <p>
     * The quality of match for the Major Donor source
     * 
     */
    @JsonProperty("majorDonor")
    @JsonPropertyDescription("The quality of match for the Major Donor source")
    private String majorDonor;
    /**
     * Physicians Profiles
     * <p>
     * The quality of match for the National Physicians Profiles source
     * 
     */
    @JsonProperty("physiciansProfiles")
    @JsonPropertyDescription("The quality of match for the National Physicians Profiles source")
    private String physiciansProfiles;
    /**
     * Market Guide
     * <p>
     * The quality of match for the Market Guide source
     * 
     */
    @JsonProperty("marketGuide")
    @JsonPropertyDescription("The quality of match for the Market Guide source")
    private String marketGuide;
    /**
     * Political Directors
     * <p>
     * The quality of match for the Section 527 Political Directors source
     * 
     */
    @JsonProperty("politicalDirectors")
    @JsonPropertyDescription("The quality of match for the Section 527 Political Directors source")
    private String politicalDirectors;
    /**
     * Pension
     * <p>
     * The quality of match for the Pension data source
     * 
     */
    @JsonProperty("pension")
    @JsonPropertyDescription("The quality of match for the Pension data source")
    private String pension;
    /**
     * Philanthropy
     * <p>
     * The quality of match for the Philanthropic Donations source
     * 
     */
    @JsonProperty("philanthropy")
    @JsonPropertyDescription("The quality of match for the Philanthropic Donations source")
    private String philanthropy;
    /**
     * Political Organizations
     * <p>
     * The quality of match for the Section 527 Political Organizations source
     * 
     */
    @JsonProperty("politicalOrganizations")
    @JsonPropertyDescription("The quality of match for the Section 527 Political Organizations source")
    private String politicalOrganizations;
    /**
     * Real Estate
     * <p>
     * The quality of match for the Real Estate source
     * 
     */
    @JsonProperty("realEstate")
    @JsonPropertyDescription("The quality of match for the Real Estate source")
    private String realEstate;
    /**
     * Political Donations
     * <p>
     * The quality of match for the State Political Donations source
     * 
     */
    @JsonProperty("politicalDonations")
    @JsonPropertyDescription("The quality of match for the State Political Donations source")
    private String politicalDonations;
    /**
     * Death
     * <p>
     * The quality of match for the SSA Death Index source
     * 
     */
    @JsonProperty("death")
    @JsonPropertyDescription("The quality of match for the SSA Death Index source")
    private String death;
    /**
     * Securities
     * <p>
     * The quality of match for the Wealth ID Securities source
     * 
     */
    @JsonProperty("securities")
    @JsonPropertyDescription("The quality of match for the Wealth ID Securities source")
    private String securities;
    /**
     * Foundation Trustees
     * <p>
     * The quality of match for the Foundation Trustees source
     * 
     */
    @JsonProperty("foundationTrustees")
    @JsonPropertyDescription("The quality of match for the Foundation Trustees source")
    private String foundationTrustees;
    /**
     * Merchant Vessels
     * <p>
     * The quality of match for the Merchant Vessels source
     * 
     */
    @JsonProperty("merchantVessels")
    @JsonPropertyDescription("The quality of match for the Merchant Vessels source")
    private String merchantVessels;
    /**
     * Who's Who
     * <p>
     * The quality of match for the Marquis Who's Who source
     * 
     */
    @JsonProperty("whosWho")
    @JsonPropertyDescription("The quality of match for the Marquis Who's Who source")
    private String whosWho;

    /**
     * Aircraft
     * <p>
     * The quality of match for the Aircraft source
     * 
     */
    @JsonProperty("aircraft")
    public String getAircraft() {
        return aircraft;
    }

    /**
     * Aircraft
     * <p>
     * The quality of match for the Aircraft source
     * 
     */
    @JsonProperty("aircraft")
    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public QualityOfMatch withAircraft(String aircraft) {
        this.aircraft = aircraft;
        return this;
    }

    /**
     * Airmen
     * <p>
     * The quality of match for the Airmen source
     * 
     */
    @JsonProperty("airmen")
    public String getAirmen() {
        return airmen;
    }

    /**
     * Airmen
     * <p>
     * The quality of match for the Airmen source
     * 
     */
    @JsonProperty("airmen")
    public void setAirmen(String airmen) {
        this.airmen = airmen;
    }

    public QualityOfMatch withAirmen(String airmen) {
        this.airmen = airmen;
        return this;
    }

    /**
     * Business Registrations
     * <p>
     * The quality of match for the D&B State Business Registrations source
     * 
     */
    @JsonProperty("businessRegistrations")
    public String getBusinessRegistrations() {
        return businessRegistrations;
    }

    /**
     * Business Registrations
     * <p>
     * The quality of match for the D&B State Business Registrations source
     * 
     */
    @JsonProperty("businessRegistrations")
    public void setBusinessRegistrations(String businessRegistrations) {
        this.businessRegistrations = businessRegistrations;
    }

    public QualityOfMatch withBusinessRegistrations(String businessRegistrations) {
        this.businessRegistrations = businessRegistrations;
        return this;
    }

    /**
     * Dunn And Bradstreet
     * <p>
     * The quality of match for the Dunn & Bradstreet source
     * 
     */
    @JsonProperty("dunnAndBradstreet")
    public String getDunnAndBradstreet() {
        return dunnAndBradstreet;
    }

    /**
     * Dunn And Bradstreet
     * <p>
     * The quality of match for the Dunn & Bradstreet source
     * 
     */
    @JsonProperty("dunnAndBradstreet")
    public void setDunnAndBradstreet(String dunnAndBradstreet) {
        this.dunnAndBradstreet = dunnAndBradstreet;
    }

    public QualityOfMatch withDunnAndBradstreet(String dunnAndBradstreet) {
        this.dunnAndBradstreet = dunnAndBradstreet;
        return this;
    }

    /**
     * Volunteers And Directors
     * <p>
     * The quality of match for the Volunteers & Directors source
     * 
     */
    @JsonProperty("volunteersAndDirectors")
    public String getVolunteersAndDirectors() {
        return volunteersAndDirectors;
    }

    /**
     * Volunteers And Directors
     * <p>
     * The quality of match for the Volunteers & Directors source
     * 
     */
    @JsonProperty("volunteersAndDirectors")
    public void setVolunteersAndDirectors(String volunteersAndDirectors) {
        this.volunteersAndDirectors = volunteersAndDirectors;
    }

    public QualityOfMatch withVolunteersAndDirectors(String volunteersAndDirectors) {
        this.volunteersAndDirectors = volunteersAndDirectors;
        return this;
    }

    /**
     * Do Not Mail
     * <p>
     * The quality of match for the National Do-Not-Mail Registry source
     * 
     */
    @JsonProperty("doNotMail")
    public String getDoNotMail() {
        return doNotMail;
    }

    /**
     * Do Not Mail
     * <p>
     * The quality of match for the National Do-Not-Mail Registry source
     * 
     */
    @JsonProperty("doNotMail")
    public void setDoNotMail(String doNotMail) {
        this.doNotMail = doNotMail;
    }

    public QualityOfMatch withDoNotMail(String doNotMail) {
        this.doNotMail = doNotMail;
        return this;
    }

    /**
     * Charitable Donations
     * <p>
     * The quality of match for the Charitable Donations source
     * 
     */
    @JsonProperty("charitableDonations")
    public String getCharitableDonations() {
        return charitableDonations;
    }

    /**
     * Charitable Donations
     * <p>
     * The quality of match for the Charitable Donations source
     * 
     */
    @JsonProperty("charitableDonations")
    public void setCharitableDonations(String charitableDonations) {
        this.charitableDonations = charitableDonations;
    }

    public QualityOfMatch withCharitableDonations(String charitableDonations) {
        this.charitableDonations = charitableDonations;
        return this;
    }

    /**
     * Federal Elections
     * <p>
     * The quality of match for the Federal Elections Campaigns source
     * 
     */
    @JsonProperty("federalElections")
    public String getFederalElections() {
        return federalElections;
    }

    /**
     * Federal Elections
     * <p>
     * The quality of match for the Federal Elections Campaigns source
     * 
     */
    @JsonProperty("federalElections")
    public void setFederalElections(String federalElections) {
        this.federalElections = federalElections;
    }

    public QualityOfMatch withFederalElections(String federalElections) {
        this.federalElections = federalElections;
        return this;
    }

    /**
     * Guidestar Foundations
     * <p>
     * The quality of match for the Guidestar Foundations source
     * 
     */
    @JsonProperty("guidestarFoundations")
    public String getGuidestarFoundations() {
        return guidestarFoundations;
    }

    /**
     * Guidestar Foundations
     * <p>
     * The quality of match for the Guidestar Foundations source
     * 
     */
    @JsonProperty("guidestarFoundations")
    public void setGuidestarFoundations(String guidestarFoundations) {
        this.guidestarFoundations = guidestarFoundations;
    }

    public QualityOfMatch withGuidestarFoundations(String guidestarFoundations) {
        this.guidestarFoundations = guidestarFoundations;
        return this;
    }

    /**
     * Guidestar Directors
     * <p>
     * The quality of match for the Guidestar Directors source
     * 
     */
    @JsonProperty("guidestarDirectors")
    public String getGuidestarDirectors() {
        return guidestarDirectors;
    }

    /**
     * Guidestar Directors
     * <p>
     * The quality of match for the Guidestar Directors source
     * 
     */
    @JsonProperty("guidestarDirectors")
    public void setGuidestarDirectors(String guidestarDirectors) {
        this.guidestarDirectors = guidestarDirectors;
    }

    public QualityOfMatch withGuidestarDirectors(String guidestarDirectors) {
        this.guidestarDirectors = guidestarDirectors;
        return this;
    }

    /**
     * Household Profile
     * <p>
     * The quality of match for the Household Profile source
     * 
     */
    @JsonProperty("householdProfile")
    public String getHouseholdProfile() {
        return householdProfile;
    }

    /**
     * Household Profile
     * <p>
     * The quality of match for the Household Profile source
     * 
     */
    @JsonProperty("householdProfile")
    public void setHouseholdProfile(String householdProfile) {
        this.householdProfile = householdProfile;
    }

    public QualityOfMatch withHouseholdProfile(String householdProfile) {
        this.householdProfile = householdProfile;
        return this;
    }

    /**
     * Hoover's
     * <p>
     * The quality of match for the Hoover's source
     * 
     */
    @JsonProperty("hoovers")
    public String getHoovers() {
        return hoovers;
    }

    /**
     * Hoover's
     * <p>
     * The quality of match for the Hoover's source
     * 
     */
    @JsonProperty("hoovers")
    public void setHoovers(String hoovers) {
        this.hoovers = hoovers;
    }

    public QualityOfMatch withHoovers(String hoovers) {
        this.hoovers = hoovers;
        return this;
    }

    /**
     * Major Donor
     * <p>
     * The quality of match for the Major Donor source
     * 
     */
    @JsonProperty("majorDonor")
    public String getMajorDonor() {
        return majorDonor;
    }

    /**
     * Major Donor
     * <p>
     * The quality of match for the Major Donor source
     * 
     */
    @JsonProperty("majorDonor")
    public void setMajorDonor(String majorDonor) {
        this.majorDonor = majorDonor;
    }

    public QualityOfMatch withMajorDonor(String majorDonor) {
        this.majorDonor = majorDonor;
        return this;
    }

    /**
     * Physicians Profiles
     * <p>
     * The quality of match for the National Physicians Profiles source
     * 
     */
    @JsonProperty("physiciansProfiles")
    public String getPhysiciansProfiles() {
        return physiciansProfiles;
    }

    /**
     * Physicians Profiles
     * <p>
     * The quality of match for the National Physicians Profiles source
     * 
     */
    @JsonProperty("physiciansProfiles")
    public void setPhysiciansProfiles(String physiciansProfiles) {
        this.physiciansProfiles = physiciansProfiles;
    }

    public QualityOfMatch withPhysiciansProfiles(String physiciansProfiles) {
        this.physiciansProfiles = physiciansProfiles;
        return this;
    }

    /**
     * Market Guide
     * <p>
     * The quality of match for the Market Guide source
     * 
     */
    @JsonProperty("marketGuide")
    public String getMarketGuide() {
        return marketGuide;
    }

    /**
     * Market Guide
     * <p>
     * The quality of match for the Market Guide source
     * 
     */
    @JsonProperty("marketGuide")
    public void setMarketGuide(String marketGuide) {
        this.marketGuide = marketGuide;
    }

    public QualityOfMatch withMarketGuide(String marketGuide) {
        this.marketGuide = marketGuide;
        return this;
    }

    /**
     * Political Directors
     * <p>
     * The quality of match for the Section 527 Political Directors source
     * 
     */
    @JsonProperty("politicalDirectors")
    public String getPoliticalDirectors() {
        return politicalDirectors;
    }

    /**
     * Political Directors
     * <p>
     * The quality of match for the Section 527 Political Directors source
     * 
     */
    @JsonProperty("politicalDirectors")
    public void setPoliticalDirectors(String politicalDirectors) {
        this.politicalDirectors = politicalDirectors;
    }

    public QualityOfMatch withPoliticalDirectors(String politicalDirectors) {
        this.politicalDirectors = politicalDirectors;
        return this;
    }

    /**
     * Pension
     * <p>
     * The quality of match for the Pension data source
     * 
     */
    @JsonProperty("pension")
    public String getPension() {
        return pension;
    }

    /**
     * Pension
     * <p>
     * The quality of match for the Pension data source
     * 
     */
    @JsonProperty("pension")
    public void setPension(String pension) {
        this.pension = pension;
    }

    public QualityOfMatch withPension(String pension) {
        this.pension = pension;
        return this;
    }

    /**
     * Philanthropy
     * <p>
     * The quality of match for the Philanthropic Donations source
     * 
     */
    @JsonProperty("philanthropy")
    public String getPhilanthropy() {
        return philanthropy;
    }

    /**
     * Philanthropy
     * <p>
     * The quality of match for the Philanthropic Donations source
     * 
     */
    @JsonProperty("philanthropy")
    public void setPhilanthropy(String philanthropy) {
        this.philanthropy = philanthropy;
    }

    public QualityOfMatch withPhilanthropy(String philanthropy) {
        this.philanthropy = philanthropy;
        return this;
    }

    /**
     * Political Organizations
     * <p>
     * The quality of match for the Section 527 Political Organizations source
     * 
     */
    @JsonProperty("politicalOrganizations")
    public String getPoliticalOrganizations() {
        return politicalOrganizations;
    }

    /**
     * Political Organizations
     * <p>
     * The quality of match for the Section 527 Political Organizations source
     * 
     */
    @JsonProperty("politicalOrganizations")
    public void setPoliticalOrganizations(String politicalOrganizations) {
        this.politicalOrganizations = politicalOrganizations;
    }

    public QualityOfMatch withPoliticalOrganizations(String politicalOrganizations) {
        this.politicalOrganizations = politicalOrganizations;
        return this;
    }

    /**
     * Real Estate
     * <p>
     * The quality of match for the Real Estate source
     * 
     */
    @JsonProperty("realEstate")
    public String getRealEstate() {
        return realEstate;
    }

    /**
     * Real Estate
     * <p>
     * The quality of match for the Real Estate source
     * 
     */
    @JsonProperty("realEstate")
    public void setRealEstate(String realEstate) {
        this.realEstate = realEstate;
    }

    public QualityOfMatch withRealEstate(String realEstate) {
        this.realEstate = realEstate;
        return this;
    }

    /**
     * Political Donations
     * <p>
     * The quality of match for the State Political Donations source
     * 
     */
    @JsonProperty("politicalDonations")
    public String getPoliticalDonations() {
        return politicalDonations;
    }

    /**
     * Political Donations
     * <p>
     * The quality of match for the State Political Donations source
     * 
     */
    @JsonProperty("politicalDonations")
    public void setPoliticalDonations(String politicalDonations) {
        this.politicalDonations = politicalDonations;
    }

    public QualityOfMatch withPoliticalDonations(String politicalDonations) {
        this.politicalDonations = politicalDonations;
        return this;
    }

    /**
     * Death
     * <p>
     * The quality of match for the SSA Death Index source
     * 
     */
    @JsonProperty("death")
    public String getDeath() {
        return death;
    }

    /**
     * Death
     * <p>
     * The quality of match for the SSA Death Index source
     * 
     */
    @JsonProperty("death")
    public void setDeath(String death) {
        this.death = death;
    }

    public QualityOfMatch withDeath(String death) {
        this.death = death;
        return this;
    }

    /**
     * Securities
     * <p>
     * The quality of match for the Wealth ID Securities source
     * 
     */
    @JsonProperty("securities")
    public String getSecurities() {
        return securities;
    }

    /**
     * Securities
     * <p>
     * The quality of match for the Wealth ID Securities source
     * 
     */
    @JsonProperty("securities")
    public void setSecurities(String securities) {
        this.securities = securities;
    }

    public QualityOfMatch withSecurities(String securities) {
        this.securities = securities;
        return this;
    }

    /**
     * Foundation Trustees
     * <p>
     * The quality of match for the Foundation Trustees source
     * 
     */
    @JsonProperty("foundationTrustees")
    public String getFoundationTrustees() {
        return foundationTrustees;
    }

    /**
     * Foundation Trustees
     * <p>
     * The quality of match for the Foundation Trustees source
     * 
     */
    @JsonProperty("foundationTrustees")
    public void setFoundationTrustees(String foundationTrustees) {
        this.foundationTrustees = foundationTrustees;
    }

    public QualityOfMatch withFoundationTrustees(String foundationTrustees) {
        this.foundationTrustees = foundationTrustees;
        return this;
    }

    /**
     * Merchant Vessels
     * <p>
     * The quality of match for the Merchant Vessels source
     * 
     */
    @JsonProperty("merchantVessels")
    public String getMerchantVessels() {
        return merchantVessels;
    }

    /**
     * Merchant Vessels
     * <p>
     * The quality of match for the Merchant Vessels source
     * 
     */
    @JsonProperty("merchantVessels")
    public void setMerchantVessels(String merchantVessels) {
        this.merchantVessels = merchantVessels;
    }

    public QualityOfMatch withMerchantVessels(String merchantVessels) {
        this.merchantVessels = merchantVessels;
        return this;
    }

    /**
     * Who's Who
     * <p>
     * The quality of match for the Marquis Who's Who source
     * 
     */
    @JsonProperty("whosWho")
    public String getWhosWho() {
        return whosWho;
    }

    /**
     * Who's Who
     * <p>
     * The quality of match for the Marquis Who's Who source
     * 
     */
    @JsonProperty("whosWho")
    public void setWhosWho(String whosWho) {
        this.whosWho = whosWho;
    }

    public QualityOfMatch withWhosWho(String whosWho) {
        this.whosWho = whosWho;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QualityOfMatch.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aircraft");
        sb.append('=');
        sb.append(((this.aircraft == null)?"<null>":this.aircraft));
        sb.append(',');
        sb.append("airmen");
        sb.append('=');
        sb.append(((this.airmen == null)?"<null>":this.airmen));
        sb.append(',');
        sb.append("businessRegistrations");
        sb.append('=');
        sb.append(((this.businessRegistrations == null)?"<null>":this.businessRegistrations));
        sb.append(',');
        sb.append("dunnAndBradstreet");
        sb.append('=');
        sb.append(((this.dunnAndBradstreet == null)?"<null>":this.dunnAndBradstreet));
        sb.append(',');
        sb.append("volunteersAndDirectors");
        sb.append('=');
        sb.append(((this.volunteersAndDirectors == null)?"<null>":this.volunteersAndDirectors));
        sb.append(',');
        sb.append("doNotMail");
        sb.append('=');
        sb.append(((this.doNotMail == null)?"<null>":this.doNotMail));
        sb.append(',');
        sb.append("charitableDonations");
        sb.append('=');
        sb.append(((this.charitableDonations == null)?"<null>":this.charitableDonations));
        sb.append(',');
        sb.append("federalElections");
        sb.append('=');
        sb.append(((this.federalElections == null)?"<null>":this.federalElections));
        sb.append(',');
        sb.append("guidestarFoundations");
        sb.append('=');
        sb.append(((this.guidestarFoundations == null)?"<null>":this.guidestarFoundations));
        sb.append(',');
        sb.append("guidestarDirectors");
        sb.append('=');
        sb.append(((this.guidestarDirectors == null)?"<null>":this.guidestarDirectors));
        sb.append(',');
        sb.append("householdProfile");
        sb.append('=');
        sb.append(((this.householdProfile == null)?"<null>":this.householdProfile));
        sb.append(',');
        sb.append("hoovers");
        sb.append('=');
        sb.append(((this.hoovers == null)?"<null>":this.hoovers));
        sb.append(',');
        sb.append("majorDonor");
        sb.append('=');
        sb.append(((this.majorDonor == null)?"<null>":this.majorDonor));
        sb.append(',');
        sb.append("physiciansProfiles");
        sb.append('=');
        sb.append(((this.physiciansProfiles == null)?"<null>":this.physiciansProfiles));
        sb.append(',');
        sb.append("marketGuide");
        sb.append('=');
        sb.append(((this.marketGuide == null)?"<null>":this.marketGuide));
        sb.append(',');
        sb.append("politicalDirectors");
        sb.append('=');
        sb.append(((this.politicalDirectors == null)?"<null>":this.politicalDirectors));
        sb.append(',');
        sb.append("pension");
        sb.append('=');
        sb.append(((this.pension == null)?"<null>":this.pension));
        sb.append(',');
        sb.append("philanthropy");
        sb.append('=');
        sb.append(((this.philanthropy == null)?"<null>":this.philanthropy));
        sb.append(',');
        sb.append("politicalOrganizations");
        sb.append('=');
        sb.append(((this.politicalOrganizations == null)?"<null>":this.politicalOrganizations));
        sb.append(',');
        sb.append("realEstate");
        sb.append('=');
        sb.append(((this.realEstate == null)?"<null>":this.realEstate));
        sb.append(',');
        sb.append("politicalDonations");
        sb.append('=');
        sb.append(((this.politicalDonations == null)?"<null>":this.politicalDonations));
        sb.append(',');
        sb.append("death");
        sb.append('=');
        sb.append(((this.death == null)?"<null>":this.death));
        sb.append(',');
        sb.append("securities");
        sb.append('=');
        sb.append(((this.securities == null)?"<null>":this.securities));
        sb.append(',');
        sb.append("foundationTrustees");
        sb.append('=');
        sb.append(((this.foundationTrustees == null)?"<null>":this.foundationTrustees));
        sb.append(',');
        sb.append("merchantVessels");
        sb.append('=');
        sb.append(((this.merchantVessels == null)?"<null>":this.merchantVessels));
        sb.append(',');
        sb.append("whosWho");
        sb.append('=');
        sb.append(((this.whosWho == null)?"<null>":this.whosWho));
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
        result = ((result* 31)+((this.politicalDirectors == null)? 0 :this.politicalDirectors.hashCode()));
        result = ((result* 31)+((this.businessRegistrations == null)? 0 :this.businessRegistrations.hashCode()));
        result = ((result* 31)+((this.death == null)? 0 :this.death.hashCode()));
        result = ((result* 31)+((this.whosWho == null)? 0 :this.whosWho.hashCode()));
        result = ((result* 31)+((this.politicalDonations == null)? 0 :this.politicalDonations.hashCode()));
        result = ((result* 31)+((this.guidestarFoundations == null)? 0 :this.guidestarFoundations.hashCode()));
        result = ((result* 31)+((this.airmen == null)? 0 :this.airmen.hashCode()));
        result = ((result* 31)+((this.securities == null)? 0 :this.securities.hashCode()));
        result = ((result* 31)+((this.federalElections == null)? 0 :this.federalElections.hashCode()));
        result = ((result* 31)+((this.marketGuide == null)? 0 :this.marketGuide.hashCode()));
        result = ((result* 31)+((this.majorDonor == null)? 0 :this.majorDonor.hashCode()));
        result = ((result* 31)+((this.dunnAndBradstreet == null)? 0 :this.dunnAndBradstreet.hashCode()));
        result = ((result* 31)+((this.pension == null)? 0 :this.pension.hashCode()));
        result = ((result* 31)+((this.householdProfile == null)? 0 :this.householdProfile.hashCode()));
        result = ((result* 31)+((this.guidestarDirectors == null)? 0 :this.guidestarDirectors.hashCode()));
        result = ((result* 31)+((this.foundationTrustees == null)? 0 :this.foundationTrustees.hashCode()));
        result = ((result* 31)+((this.aircraft == null)? 0 :this.aircraft.hashCode()));
        result = ((result* 31)+((this.doNotMail == null)? 0 :this.doNotMail.hashCode()));
        result = ((result* 31)+((this.charitableDonations == null)? 0 :this.charitableDonations.hashCode()));
        result = ((result* 31)+((this.merchantVessels == null)? 0 :this.merchantVessels.hashCode()));
        result = ((result* 31)+((this.physiciansProfiles == null)? 0 :this.physiciansProfiles.hashCode()));
        result = ((result* 31)+((this.realEstate == null)? 0 :this.realEstate.hashCode()));
        result = ((result* 31)+((this.volunteersAndDirectors == null)? 0 :this.volunteersAndDirectors.hashCode()));
        result = ((result* 31)+((this.politicalOrganizations == null)? 0 :this.politicalOrganizations.hashCode()));
        result = ((result* 31)+((this.hoovers == null)? 0 :this.hoovers.hashCode()));
        result = ((result* 31)+((this.philanthropy == null)? 0 :this.philanthropy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QualityOfMatch) == false) {
            return false;
        }
        QualityOfMatch rhs = ((QualityOfMatch) other);
        return (((((((((((((((((((((((((((this.politicalDirectors == rhs.politicalDirectors)||((this.politicalDirectors!= null)&&this.politicalDirectors.equals(rhs.politicalDirectors)))&&((this.businessRegistrations == rhs.businessRegistrations)||((this.businessRegistrations!= null)&&this.businessRegistrations.equals(rhs.businessRegistrations))))&&((this.death == rhs.death)||((this.death!= null)&&this.death.equals(rhs.death))))&&((this.whosWho == rhs.whosWho)||((this.whosWho!= null)&&this.whosWho.equals(rhs.whosWho))))&&((this.politicalDonations == rhs.politicalDonations)||((this.politicalDonations!= null)&&this.politicalDonations.equals(rhs.politicalDonations))))&&((this.guidestarFoundations == rhs.guidestarFoundations)||((this.guidestarFoundations!= null)&&this.guidestarFoundations.equals(rhs.guidestarFoundations))))&&((this.airmen == rhs.airmen)||((this.airmen!= null)&&this.airmen.equals(rhs.airmen))))&&((this.securities == rhs.securities)||((this.securities!= null)&&this.securities.equals(rhs.securities))))&&((this.federalElections == rhs.federalElections)||((this.federalElections!= null)&&this.federalElections.equals(rhs.federalElections))))&&((this.marketGuide == rhs.marketGuide)||((this.marketGuide!= null)&&this.marketGuide.equals(rhs.marketGuide))))&&((this.majorDonor == rhs.majorDonor)||((this.majorDonor!= null)&&this.majorDonor.equals(rhs.majorDonor))))&&((this.dunnAndBradstreet == rhs.dunnAndBradstreet)||((this.dunnAndBradstreet!= null)&&this.dunnAndBradstreet.equals(rhs.dunnAndBradstreet))))&&((this.pension == rhs.pension)||((this.pension!= null)&&this.pension.equals(rhs.pension))))&&((this.householdProfile == rhs.householdProfile)||((this.householdProfile!= null)&&this.householdProfile.equals(rhs.householdProfile))))&&((this.guidestarDirectors == rhs.guidestarDirectors)||((this.guidestarDirectors!= null)&&this.guidestarDirectors.equals(rhs.guidestarDirectors))))&&((this.foundationTrustees == rhs.foundationTrustees)||((this.foundationTrustees!= null)&&this.foundationTrustees.equals(rhs.foundationTrustees))))&&((this.aircraft == rhs.aircraft)||((this.aircraft!= null)&&this.aircraft.equals(rhs.aircraft))))&&((this.doNotMail == rhs.doNotMail)||((this.doNotMail!= null)&&this.doNotMail.equals(rhs.doNotMail))))&&((this.charitableDonations == rhs.charitableDonations)||((this.charitableDonations!= null)&&this.charitableDonations.equals(rhs.charitableDonations))))&&((this.merchantVessels == rhs.merchantVessels)||((this.merchantVessels!= null)&&this.merchantVessels.equals(rhs.merchantVessels))))&&((this.physiciansProfiles == rhs.physiciansProfiles)||((this.physiciansProfiles!= null)&&this.physiciansProfiles.equals(rhs.physiciansProfiles))))&&((this.realEstate == rhs.realEstate)||((this.realEstate!= null)&&this.realEstate.equals(rhs.realEstate))))&&((this.volunteersAndDirectors == rhs.volunteersAndDirectors)||((this.volunteersAndDirectors!= null)&&this.volunteersAndDirectors.equals(rhs.volunteersAndDirectors))))&&((this.politicalOrganizations == rhs.politicalOrganizations)||((this.politicalOrganizations!= null)&&this.politicalOrganizations.equals(rhs.politicalOrganizations))))&&((this.hoovers == rhs.hoovers)||((this.hoovers!= null)&&this.hoovers.equals(rhs.hoovers))))&&((this.philanthropy == rhs.philanthropy)||((this.philanthropy!= null)&&this.philanthropy.equals(rhs.philanthropy))));
    }

}
