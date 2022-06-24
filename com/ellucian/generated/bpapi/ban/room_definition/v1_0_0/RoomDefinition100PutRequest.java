
package com.ellucian.generated.bpapi.ban.room_definition.v1_0_0;

import java.util.Date;
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
    "criteria.userId",
    "bcatCode",
    "phoneExtension",
    "keyNumber",
    "criteria.ctryCodePhone",
    "criteria.collCode",
    "criteria.desc",
    "criteria.utilityRatePeriod",
    "partitionCode",
    "roomType",
    "area",
    "priority",
    "criteria.phoneExtension",
    "phoneNumber",
    "criteria.priority",
    "phoneArea",
    "criteria.capacity",
    "criteria.phoneNumber",
    "collCode",
    "deptCode",
    "desc",
    "criteria.utilityRate",
    "criteria.termCodeEff",
    "criteria.activityDate",
    "criteria.deptCode",
    "criteria.phoneArea",
    "ctryCodePhone",
    "capacity",
    "criteria.bcatCode",
    "criteria.keyNumber",
    "maximumCapacity",
    "stvtermTermCode",
    "slardefBldgCode",
    "utilityRate",
    "rmstCode",
    "criteria.rrcdCode",
    "criteria.prcdCode",
    "criteria.partitionCode",
    "sex",
    "length",
    "prcdCode",
    "criteria.roomType",
    "room",
    "criteria.rmstCode",
    "rrcdCode",
    "criteria.sex",
    "criteria.maximumCapacity",
    "criteria.area",
    "utilityRatePeriod",
    "width"
})
@Generated("jsonschema2pojo")
public class RoomDefinition100PutRequest {

    /**
     * Lineage reference object : SLBRDEF_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_USER_ID")
    private String criteriaUserId;
    /**
     * Category
     * <p>
     * Lineage reference object : SLBRDEF_BCAT_CODE
     * 
     */
    @JsonProperty("bcatCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_BCAT_CODE")
    private String bcatCode;
    /**
     * Extension
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_EXTENSION
     * 
     */
    @JsonProperty("phoneExtension")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PHONE_EXTENSION")
    private String phoneExtension;
    /**
     * Key Number
     * <p>
     * Lineage reference object : SLBRDEF_KEY_NUMBER
     * 
     */
    @JsonProperty("keyNumber")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_KEY_NUMBER")
    private String keyNumber;
    /**
     * Phone Country Code
     * <p>
     * Lineage reference object : SLBRDEF_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_CTRY_CODE_PHONE")
    private String criteriaCtryCodePhone;
    /**
     * College
     * <p>
     * Lineage reference object : SLBRDEF_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String criteriaCollCode;
    /**
     * Description
     * <p>
     * Lineage reference object : SLBRDEF_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_DESC")
    private String criteriaDesc;
    /**
     * Time Period
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE_PERIOD
     * 
     */
    @JsonProperty("criteria.utilityRatePeriod")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_UTILITY_RATE_PERIOD")
    private String criteriaUtilityRatePeriod;
    /**
     * Partition
     * <p>
     * Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("partitionCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvpars")
    private String partitionCode;
    /**
     * Room Type
     * <p>
     * Lineage reference object : SLBRDEF_ROOM_TYPE
     * (Required)
     * 
     */
    @JsonProperty("roomType")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_ROOM_TYPE")
    private String roomType;
    /**
     * Area(Square Feet)
     * <p>
     * Lineage reference object : SLBRDEF_AREA
     * 
     */
    @JsonProperty("area")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_AREA")
    private Double area;
    /**
     * Priority
     * <p>
     * Lineage reference object : SLBRDEF_PRIORITY
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PRIORITY")
    private String priority;
    /**
     * Extension
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_EXTENSION
     * 
     */
    @JsonProperty("criteria.phoneExtension")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PHONE_EXTENSION")
    private String criteriaPhoneExtension;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PHONE_NUMBER")
    private String phoneNumber;
    /**
     * Priority
     * <p>
     * Lineage reference object : SLBRDEF_PRIORITY
     * 
     */
    @JsonProperty("criteria.priority")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PRIORITY")
    private String criteriaPriority;
    /**
     * Area Code
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PHONE_AREA")
    private String phoneArea;
    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBRDEF_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.capacity")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_CAPACITY")
    private Double criteriaCapacity;
    /**
     * Phone Number
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PHONE_NUMBER")
    private String criteriaPhoneNumber;
    /**
     * College
     * <p>
     * Lineage reference object : SLBRDEF_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_COLL_CODE, Lookup lineage reference object : stvcoll")
    private String collCode;
    /**
     * Department
     * <p>
     * Lineage reference object : SLBRDEF_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String deptCode;
    /**
     * Description
     * <p>
     * Lineage reference object : SLBRDEF_DESC
     * 
     */
    @JsonProperty("desc")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_DESC")
    private String desc;
    /**
     * Utility Rate
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE
     * 
     */
    @JsonProperty("criteria.utilityRate")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_UTILITY_RATE")
    private Double criteriaUtilityRate;
    /**
     * New Term
     * <p>
     * Lineage reference object : SLBRDEF_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_TERM_CODE_EFF, Lookup lineage reference object : stvterm")
    private String criteriaTermCodeEff;
    /**
     * Lineage reference object : SLBRDEF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_ACTIVITY_DATE")
    private Date criteriaActivityDate;
    /**
     * Department
     * <p>
     * Lineage reference object : SLBRDEF_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_DEPT_CODE, Lookup lineage reference object : stvdept")
    private String criteriaDeptCode;
    /**
     * Area Code
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PHONE_AREA")
    private String criteriaPhoneArea;
    /**
     * Phone Country Code
     * <p>
     * Lineage reference object : SLBRDEF_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_CTRY_CODE_PHONE")
    private String ctryCodePhone;
    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBRDEF_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("capacity")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_CAPACITY")
    private Double capacity;
    /**
     * Category
     * <p>
     * Lineage reference object : SLBRDEF_BCAT_CODE
     * 
     */
    @JsonProperty("criteria.bcatCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_BCAT_CODE")
    private String criteriaBcatCode;
    /**
     * Key Number
     * <p>
     * Lineage reference object : SLBRDEF_KEY_NUMBER
     * 
     */
    @JsonProperty("criteria.keyNumber")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_KEY_NUMBER")
    private String criteriaKeyNumber;
    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBRDEF_MAXIMUM_CAPACITY
     * 
     */
    @JsonProperty("maximumCapacity")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_MAXIMUM_CAPACITY")
    private Double maximumCapacity;
    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    @JsonPropertyDescription("Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm")
    private String stvtermTermCode;
    /**
     * Building
     * <p>
     * Lineage reference object : slardefBldgCode, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("slardefBldgCode")
    @JsonPropertyDescription("Lineage reference object : slardefBldgCode, Lookup lineage reference object : stvbldg")
    private String slardefBldgCode;
    /**
     * Utility Rate
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE
     * 
     */
    @JsonProperty("utilityRate")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_UTILITY_RATE")
    private Double utilityRate;
    /**
     * Status
     * <p>
     * Lineage reference object : SLBRDEF_RMST_CODE, Lookup lineage reference object : stvrmst
     * 
     */
    @JsonProperty("rmstCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_RMST_CODE, Lookup lineage reference object : stvrmst")
    private String rmstCode;
    /**
     * Room Rate
     * <p>
     * Lineage reference object : SLBRDEF_RRCD_CODE, Lookup lineage reference object : stvrrcd
     * 
     */
    @JsonProperty("criteria.rrcdCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_RRCD_CODE, Lookup lineage reference object : stvrrcd")
    private String criteriaRrcdCode;
    /**
     * Phone Rate
     * <p>
     * Lineage reference object : SLBRDEF_PRCD_CODE, Lookup lineage reference object : stvprcd
     * 
     */
    @JsonProperty("criteria.prcdCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PRCD_CODE, Lookup lineage reference object : stvprcd")
    private String criteriaPrcdCode;
    /**
     * Partition
     * <p>
     * Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("criteria.partitionCode")
    @JsonPropertyDescription("Lookup lineage reference object : gtvpars")
    private String criteriaPartitionCode;
    /**
     * Gender
     * <p>
     * Lineage reference object : SLBRDEF_SEX
     * 
     */
    @JsonProperty("sex")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_SEX")
    private String sex;
    /**
     * Length (feet)
     * <p>
     * Lineage reference object : SLBRDEF_LENGTH
     * 
     */
    @JsonProperty("length")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_LENGTH")
    private Double length;
    /**
     * Phone Rate
     * <p>
     * Lineage reference object : SLBRDEF_PRCD_CODE, Lookup lineage reference object : stvprcd
     * 
     */
    @JsonProperty("prcdCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PRCD_CODE, Lookup lineage reference object : stvprcd")
    private String prcdCode;
    /**
     * Room Type
     * <p>
     * Lineage reference object : SLBRDEF_ROOM_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.roomType")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_ROOM_TYPE")
    private String criteriaRoomType;
    /**
     * Room
     * <p>
     * Lineage reference object : room
     * 
     */
    @JsonProperty("room")
    @JsonPropertyDescription("Lineage reference object : room")
    private String room;
    /**
     * Status
     * <p>
     * Lineage reference object : SLBRDEF_RMST_CODE, Lookup lineage reference object : stvrmst
     * 
     */
    @JsonProperty("criteria.rmstCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_RMST_CODE, Lookup lineage reference object : stvrmst")
    private String criteriaRmstCode;
    /**
     * Room Rate
     * <p>
     * Lineage reference object : SLBRDEF_RRCD_CODE, Lookup lineage reference object : stvrrcd
     * 
     */
    @JsonProperty("rrcdCode")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_RRCD_CODE, Lookup lineage reference object : stvrrcd")
    private String rrcdCode;
    /**
     * Gender
     * <p>
     * Lineage reference object : SLBRDEF_SEX
     * 
     */
    @JsonProperty("criteria.sex")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_SEX")
    private String criteriaSex;
    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBRDEF_MAXIMUM_CAPACITY
     * 
     */
    @JsonProperty("criteria.maximumCapacity")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_MAXIMUM_CAPACITY")
    private Double criteriaMaximumCapacity;
    /**
     * Area(Square Feet)
     * <p>
     * Lineage reference object : SLBRDEF_AREA
     * 
     */
    @JsonProperty("criteria.area")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_AREA")
    private Double criteriaArea;
    /**
     * Time Period
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE_PERIOD
     * 
     */
    @JsonProperty("utilityRatePeriod")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_UTILITY_RATE_PERIOD")
    private String utilityRatePeriod;
    /**
     * Width (feet)
     * <p>
     * Lineage reference object : SLBRDEF_WIDTH
     * 
     */
    @JsonProperty("width")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_WIDTH")
    private Double width;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Lineage reference object : SLBRDEF_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public String getCriteriaUserId() {
        return criteriaUserId;
    }

    /**
     * Lineage reference object : SLBRDEF_USER_ID
     * 
     */
    @JsonProperty("criteria.userId")
    public void setCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
    }

    public RoomDefinition100PutRequest withCriteriaUserId(String criteriaUserId) {
        this.criteriaUserId = criteriaUserId;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : SLBRDEF_BCAT_CODE
     * 
     */
    @JsonProperty("bcatCode")
    public String getBcatCode() {
        return bcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : SLBRDEF_BCAT_CODE
     * 
     */
    @JsonProperty("bcatCode")
    public void setBcatCode(String bcatCode) {
        this.bcatCode = bcatCode;
    }

    public RoomDefinition100PutRequest withBcatCode(String bcatCode) {
        this.bcatCode = bcatCode;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_EXTENSION
     * 
     */
    @JsonProperty("phoneExtension")
    public String getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_EXTENSION
     * 
     */
    @JsonProperty("phoneExtension")
    public void setPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }

    public RoomDefinition100PutRequest withPhoneExtension(String phoneExtension) {
        this.phoneExtension = phoneExtension;
        return this;
    }

    /**
     * Key Number
     * <p>
     * Lineage reference object : SLBRDEF_KEY_NUMBER
     * 
     */
    @JsonProperty("keyNumber")
    public String getKeyNumber() {
        return keyNumber;
    }

    /**
     * Key Number
     * <p>
     * Lineage reference object : SLBRDEF_KEY_NUMBER
     * 
     */
    @JsonProperty("keyNumber")
    public void setKeyNumber(String keyNumber) {
        this.keyNumber = keyNumber;
    }

    public RoomDefinition100PutRequest withKeyNumber(String keyNumber) {
        this.keyNumber = keyNumber;
        return this;
    }

    /**
     * Phone Country Code
     * <p>
     * Lineage reference object : SLBRDEF_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public String getCriteriaCtryCodePhone() {
        return criteriaCtryCodePhone;
    }

    /**
     * Phone Country Code
     * <p>
     * Lineage reference object : SLBRDEF_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("criteria.ctryCodePhone")
    public void setCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
    }

    public RoomDefinition100PutRequest withCriteriaCtryCodePhone(String criteriaCtryCodePhone) {
        this.criteriaCtryCodePhone = criteriaCtryCodePhone;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SLBRDEF_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public String getCriteriaCollCode() {
        return criteriaCollCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SLBRDEF_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("criteria.collCode")
    public void setCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
    }

    public RoomDefinition100PutRequest withCriteriaCollCode(String criteriaCollCode) {
        this.criteriaCollCode = criteriaCollCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SLBRDEF_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    public String getCriteriaDesc() {
        return criteriaDesc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SLBRDEF_DESC
     * 
     */
    @JsonProperty("criteria.desc")
    public void setCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
    }

    public RoomDefinition100PutRequest withCriteriaDesc(String criteriaDesc) {
        this.criteriaDesc = criteriaDesc;
        return this;
    }

    /**
     * Time Period
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE_PERIOD
     * 
     */
    @JsonProperty("criteria.utilityRatePeriod")
    public String getCriteriaUtilityRatePeriod() {
        return criteriaUtilityRatePeriod;
    }

    /**
     * Time Period
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE_PERIOD
     * 
     */
    @JsonProperty("criteria.utilityRatePeriod")
    public void setCriteriaUtilityRatePeriod(String criteriaUtilityRatePeriod) {
        this.criteriaUtilityRatePeriod = criteriaUtilityRatePeriod;
    }

    public RoomDefinition100PutRequest withCriteriaUtilityRatePeriod(String criteriaUtilityRatePeriod) {
        this.criteriaUtilityRatePeriod = criteriaUtilityRatePeriod;
        return this;
    }

    /**
     * Partition
     * <p>
     * Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("partitionCode")
    public String getPartitionCode() {
        return partitionCode;
    }

    /**
     * Partition
     * <p>
     * Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("partitionCode")
    public void setPartitionCode(String partitionCode) {
        this.partitionCode = partitionCode;
    }

    public RoomDefinition100PutRequest withPartitionCode(String partitionCode) {
        this.partitionCode = partitionCode;
        return this;
    }

    /**
     * Room Type
     * <p>
     * Lineage reference object : SLBRDEF_ROOM_TYPE
     * (Required)
     * 
     */
    @JsonProperty("roomType")
    public String getRoomType() {
        return roomType;
    }

    /**
     * Room Type
     * <p>
     * Lineage reference object : SLBRDEF_ROOM_TYPE
     * (Required)
     * 
     */
    @JsonProperty("roomType")
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public RoomDefinition100PutRequest withRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    /**
     * Area(Square Feet)
     * <p>
     * Lineage reference object : SLBRDEF_AREA
     * 
     */
    @JsonProperty("area")
    public Double getArea() {
        return area;
    }

    /**
     * Area(Square Feet)
     * <p>
     * Lineage reference object : SLBRDEF_AREA
     * 
     */
    @JsonProperty("area")
    public void setArea(Double area) {
        this.area = area;
    }

    public RoomDefinition100PutRequest withArea(Double area) {
        this.area = area;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SLBRDEF_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SLBRDEF_PRIORITY
     * 
     */
    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public RoomDefinition100PutRequest withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_EXTENSION
     * 
     */
    @JsonProperty("criteria.phoneExtension")
    public String getCriteriaPhoneExtension() {
        return criteriaPhoneExtension;
    }

    /**
     * Extension
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_EXTENSION
     * 
     */
    @JsonProperty("criteria.phoneExtension")
    public void setCriteriaPhoneExtension(String criteriaPhoneExtension) {
        this.criteriaPhoneExtension = criteriaPhoneExtension;
    }

    public RoomDefinition100PutRequest withCriteriaPhoneExtension(String criteriaPhoneExtension) {
        this.criteriaPhoneExtension = criteriaPhoneExtension;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public RoomDefinition100PutRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SLBRDEF_PRIORITY
     * 
     */
    @JsonProperty("criteria.priority")
    public String getCriteriaPriority() {
        return criteriaPriority;
    }

    /**
     * Priority
     * <p>
     * Lineage reference object : SLBRDEF_PRIORITY
     * 
     */
    @JsonProperty("criteria.priority")
    public void setCriteriaPriority(String criteriaPriority) {
        this.criteriaPriority = criteriaPriority;
    }

    public RoomDefinition100PutRequest withCriteriaPriority(String criteriaPriority) {
        this.criteriaPriority = criteriaPriority;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public String getPhoneArea() {
        return phoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    public void setPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
    }

    public RoomDefinition100PutRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
        return this;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBRDEF_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.capacity")
    public Double getCriteriaCapacity() {
        return criteriaCapacity;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBRDEF_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("criteria.capacity")
    public void setCriteriaCapacity(Double criteriaCapacity) {
        this.criteriaCapacity = criteriaCapacity;
    }

    public RoomDefinition100PutRequest withCriteriaCapacity(Double criteriaCapacity) {
        this.criteriaCapacity = criteriaCapacity;
        return this;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    public String getCriteriaPhoneNumber() {
        return criteriaPhoneNumber;
    }

    /**
     * Phone Number
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_NUMBER
     * 
     */
    @JsonProperty("criteria.phoneNumber")
    public void setCriteriaPhoneNumber(String criteriaPhoneNumber) {
        this.criteriaPhoneNumber = criteriaPhoneNumber;
    }

    public RoomDefinition100PutRequest withCriteriaPhoneNumber(String criteriaPhoneNumber) {
        this.criteriaPhoneNumber = criteriaPhoneNumber;
        return this;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SLBRDEF_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public String getCollCode() {
        return collCode;
    }

    /**
     * College
     * <p>
     * Lineage reference object : SLBRDEF_COLL_CODE, Lookup lineage reference object : stvcoll
     * 
     */
    @JsonProperty("collCode")
    public void setCollCode(String collCode) {
        this.collCode = collCode;
    }

    public RoomDefinition100PutRequest withCollCode(String collCode) {
        this.collCode = collCode;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SLBRDEF_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SLBRDEF_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("deptCode")
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public RoomDefinition100PutRequest withDeptCode(String deptCode) {
        this.deptCode = deptCode;
        return this;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SLBRDEF_DESC
     * 
     */
    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    /**
     * Description
     * <p>
     * Lineage reference object : SLBRDEF_DESC
     * 
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public RoomDefinition100PutRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Utility Rate
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE
     * 
     */
    @JsonProperty("criteria.utilityRate")
    public Double getCriteriaUtilityRate() {
        return criteriaUtilityRate;
    }

    /**
     * Utility Rate
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE
     * 
     */
    @JsonProperty("criteria.utilityRate")
    public void setCriteriaUtilityRate(Double criteriaUtilityRate) {
        this.criteriaUtilityRate = criteriaUtilityRate;
    }

    public RoomDefinition100PutRequest withCriteriaUtilityRate(Double criteriaUtilityRate) {
        this.criteriaUtilityRate = criteriaUtilityRate;
        return this;
    }

    /**
     * New Term
     * <p>
     * Lineage reference object : SLBRDEF_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeEff")
    public String getCriteriaTermCodeEff() {
        return criteriaTermCodeEff;
    }

    /**
     * New Term
     * <p>
     * Lineage reference object : SLBRDEF_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("criteria.termCodeEff")
    public void setCriteriaTermCodeEff(String criteriaTermCodeEff) {
        this.criteriaTermCodeEff = criteriaTermCodeEff;
    }

    public RoomDefinition100PutRequest withCriteriaTermCodeEff(String criteriaTermCodeEff) {
        this.criteriaTermCodeEff = criteriaTermCodeEff;
        return this;
    }

    /**
     * Lineage reference object : SLBRDEF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public Date getCriteriaActivityDate() {
        return criteriaActivityDate;
    }

    /**
     * Lineage reference object : SLBRDEF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("criteria.activityDate")
    public void setCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
    }

    public RoomDefinition100PutRequest withCriteriaActivityDate(Date criteriaActivityDate) {
        this.criteriaActivityDate = criteriaActivityDate;
        return this;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SLBRDEF_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public String getCriteriaDeptCode() {
        return criteriaDeptCode;
    }

    /**
     * Department
     * <p>
     * Lineage reference object : SLBRDEF_DEPT_CODE, Lookup lineage reference object : stvdept
     * 
     */
    @JsonProperty("criteria.deptCode")
    public void setCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
    }

    public RoomDefinition100PutRequest withCriteriaDeptCode(String criteriaDeptCode) {
        this.criteriaDeptCode = criteriaDeptCode;
        return this;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public String getCriteriaPhoneArea() {
        return criteriaPhoneArea;
    }

    /**
     * Area Code
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_AREA
     * 
     */
    @JsonProperty("criteria.phoneArea")
    public void setCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
    }

    public RoomDefinition100PutRequest withCriteriaPhoneArea(String criteriaPhoneArea) {
        this.criteriaPhoneArea = criteriaPhoneArea;
        return this;
    }

    /**
     * Phone Country Code
     * <p>
     * Lineage reference object : SLBRDEF_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public String getCtryCodePhone() {
        return ctryCodePhone;
    }

    /**
     * Phone Country Code
     * <p>
     * Lineage reference object : SLBRDEF_CTRY_CODE_PHONE
     * 
     */
    @JsonProperty("ctryCodePhone")
    public void setCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
    }

    public RoomDefinition100PutRequest withCtryCodePhone(String ctryCodePhone) {
        this.ctryCodePhone = ctryCodePhone;
        return this;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBRDEF_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("capacity")
    public Double getCapacity() {
        return capacity;
    }

    /**
     * Capacity
     * <p>
     * Lineage reference object : SLBRDEF_CAPACITY
     * (Required)
     * 
     */
    @JsonProperty("capacity")
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public RoomDefinition100PutRequest withCapacity(Double capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : SLBRDEF_BCAT_CODE
     * 
     */
    @JsonProperty("criteria.bcatCode")
    public String getCriteriaBcatCode() {
        return criteriaBcatCode;
    }

    /**
     * Category
     * <p>
     * Lineage reference object : SLBRDEF_BCAT_CODE
     * 
     */
    @JsonProperty("criteria.bcatCode")
    public void setCriteriaBcatCode(String criteriaBcatCode) {
        this.criteriaBcatCode = criteriaBcatCode;
    }

    public RoomDefinition100PutRequest withCriteriaBcatCode(String criteriaBcatCode) {
        this.criteriaBcatCode = criteriaBcatCode;
        return this;
    }

    /**
     * Key Number
     * <p>
     * Lineage reference object : SLBRDEF_KEY_NUMBER
     * 
     */
    @JsonProperty("criteria.keyNumber")
    public String getCriteriaKeyNumber() {
        return criteriaKeyNumber;
    }

    /**
     * Key Number
     * <p>
     * Lineage reference object : SLBRDEF_KEY_NUMBER
     * 
     */
    @JsonProperty("criteria.keyNumber")
    public void setCriteriaKeyNumber(String criteriaKeyNumber) {
        this.criteriaKeyNumber = criteriaKeyNumber;
    }

    public RoomDefinition100PutRequest withCriteriaKeyNumber(String criteriaKeyNumber) {
        this.criteriaKeyNumber = criteriaKeyNumber;
        return this;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBRDEF_MAXIMUM_CAPACITY
     * 
     */
    @JsonProperty("maximumCapacity")
    public Double getMaximumCapacity() {
        return maximumCapacity;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBRDEF_MAXIMUM_CAPACITY
     * 
     */
    @JsonProperty("maximumCapacity")
    public void setMaximumCapacity(Double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public RoomDefinition100PutRequest withMaximumCapacity(Double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        return this;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public String getStvtermTermCode() {
        return stvtermTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public void setStvtermTermCode(String stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
    }

    public RoomDefinition100PutRequest withStvtermTermCode(String stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
        return this;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : slardefBldgCode, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("slardefBldgCode")
    public String getSlardefBldgCode() {
        return slardefBldgCode;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : slardefBldgCode, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("slardefBldgCode")
    public void setSlardefBldgCode(String slardefBldgCode) {
        this.slardefBldgCode = slardefBldgCode;
    }

    public RoomDefinition100PutRequest withSlardefBldgCode(String slardefBldgCode) {
        this.slardefBldgCode = slardefBldgCode;
        return this;
    }

    /**
     * Utility Rate
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE
     * 
     */
    @JsonProperty("utilityRate")
    public Double getUtilityRate() {
        return utilityRate;
    }

    /**
     * Utility Rate
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE
     * 
     */
    @JsonProperty("utilityRate")
    public void setUtilityRate(Double utilityRate) {
        this.utilityRate = utilityRate;
    }

    public RoomDefinition100PutRequest withUtilityRate(Double utilityRate) {
        this.utilityRate = utilityRate;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SLBRDEF_RMST_CODE, Lookup lineage reference object : stvrmst
     * 
     */
    @JsonProperty("rmstCode")
    public String getRmstCode() {
        return rmstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SLBRDEF_RMST_CODE, Lookup lineage reference object : stvrmst
     * 
     */
    @JsonProperty("rmstCode")
    public void setRmstCode(String rmstCode) {
        this.rmstCode = rmstCode;
    }

    public RoomDefinition100PutRequest withRmstCode(String rmstCode) {
        this.rmstCode = rmstCode;
        return this;
    }

    /**
     * Room Rate
     * <p>
     * Lineage reference object : SLBRDEF_RRCD_CODE, Lookup lineage reference object : stvrrcd
     * 
     */
    @JsonProperty("criteria.rrcdCode")
    public String getCriteriaRrcdCode() {
        return criteriaRrcdCode;
    }

    /**
     * Room Rate
     * <p>
     * Lineage reference object : SLBRDEF_RRCD_CODE, Lookup lineage reference object : stvrrcd
     * 
     */
    @JsonProperty("criteria.rrcdCode")
    public void setCriteriaRrcdCode(String criteriaRrcdCode) {
        this.criteriaRrcdCode = criteriaRrcdCode;
    }

    public RoomDefinition100PutRequest withCriteriaRrcdCode(String criteriaRrcdCode) {
        this.criteriaRrcdCode = criteriaRrcdCode;
        return this;
    }

    /**
     * Phone Rate
     * <p>
     * Lineage reference object : SLBRDEF_PRCD_CODE, Lookup lineage reference object : stvprcd
     * 
     */
    @JsonProperty("criteria.prcdCode")
    public String getCriteriaPrcdCode() {
        return criteriaPrcdCode;
    }

    /**
     * Phone Rate
     * <p>
     * Lineage reference object : SLBRDEF_PRCD_CODE, Lookup lineage reference object : stvprcd
     * 
     */
    @JsonProperty("criteria.prcdCode")
    public void setCriteriaPrcdCode(String criteriaPrcdCode) {
        this.criteriaPrcdCode = criteriaPrcdCode;
    }

    public RoomDefinition100PutRequest withCriteriaPrcdCode(String criteriaPrcdCode) {
        this.criteriaPrcdCode = criteriaPrcdCode;
        return this;
    }

    /**
     * Partition
     * <p>
     * Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("criteria.partitionCode")
    public String getCriteriaPartitionCode() {
        return criteriaPartitionCode;
    }

    /**
     * Partition
     * <p>
     * Lookup lineage reference object : gtvpars
     * 
     */
    @JsonProperty("criteria.partitionCode")
    public void setCriteriaPartitionCode(String criteriaPartitionCode) {
        this.criteriaPartitionCode = criteriaPartitionCode;
    }

    public RoomDefinition100PutRequest withCriteriaPartitionCode(String criteriaPartitionCode) {
        this.criteriaPartitionCode = criteriaPartitionCode;
        return this;
    }

    /**
     * Gender
     * <p>
     * Lineage reference object : SLBRDEF_SEX
     * 
     */
    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    /**
     * Gender
     * <p>
     * Lineage reference object : SLBRDEF_SEX
     * 
     */
    @JsonProperty("sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    public RoomDefinition100PutRequest withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * Length (feet)
     * <p>
     * Lineage reference object : SLBRDEF_LENGTH
     * 
     */
    @JsonProperty("length")
    public Double getLength() {
        return length;
    }

    /**
     * Length (feet)
     * <p>
     * Lineage reference object : SLBRDEF_LENGTH
     * 
     */
    @JsonProperty("length")
    public void setLength(Double length) {
        this.length = length;
    }

    public RoomDefinition100PutRequest withLength(Double length) {
        this.length = length;
        return this;
    }

    /**
     * Phone Rate
     * <p>
     * Lineage reference object : SLBRDEF_PRCD_CODE, Lookup lineage reference object : stvprcd
     * 
     */
    @JsonProperty("prcdCode")
    public String getPrcdCode() {
        return prcdCode;
    }

    /**
     * Phone Rate
     * <p>
     * Lineage reference object : SLBRDEF_PRCD_CODE, Lookup lineage reference object : stvprcd
     * 
     */
    @JsonProperty("prcdCode")
    public void setPrcdCode(String prcdCode) {
        this.prcdCode = prcdCode;
    }

    public RoomDefinition100PutRequest withPrcdCode(String prcdCode) {
        this.prcdCode = prcdCode;
        return this;
    }

    /**
     * Room Type
     * <p>
     * Lineage reference object : SLBRDEF_ROOM_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.roomType")
    public String getCriteriaRoomType() {
        return criteriaRoomType;
    }

    /**
     * Room Type
     * <p>
     * Lineage reference object : SLBRDEF_ROOM_TYPE
     * (Required)
     * 
     */
    @JsonProperty("criteria.roomType")
    public void setCriteriaRoomType(String criteriaRoomType) {
        this.criteriaRoomType = criteriaRoomType;
    }

    public RoomDefinition100PutRequest withCriteriaRoomType(String criteriaRoomType) {
        this.criteriaRoomType = criteriaRoomType;
        return this;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : room
     * 
     */
    @JsonProperty("room")
    public String getRoom() {
        return room;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : room
     * 
     */
    @JsonProperty("room")
    public void setRoom(String room) {
        this.room = room;
    }

    public RoomDefinition100PutRequest withRoom(String room) {
        this.room = room;
        return this;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SLBRDEF_RMST_CODE, Lookup lineage reference object : stvrmst
     * 
     */
    @JsonProperty("criteria.rmstCode")
    public String getCriteriaRmstCode() {
        return criteriaRmstCode;
    }

    /**
     * Status
     * <p>
     * Lineage reference object : SLBRDEF_RMST_CODE, Lookup lineage reference object : stvrmst
     * 
     */
    @JsonProperty("criteria.rmstCode")
    public void setCriteriaRmstCode(String criteriaRmstCode) {
        this.criteriaRmstCode = criteriaRmstCode;
    }

    public RoomDefinition100PutRequest withCriteriaRmstCode(String criteriaRmstCode) {
        this.criteriaRmstCode = criteriaRmstCode;
        return this;
    }

    /**
     * Room Rate
     * <p>
     * Lineage reference object : SLBRDEF_RRCD_CODE, Lookup lineage reference object : stvrrcd
     * 
     */
    @JsonProperty("rrcdCode")
    public String getRrcdCode() {
        return rrcdCode;
    }

    /**
     * Room Rate
     * <p>
     * Lineage reference object : SLBRDEF_RRCD_CODE, Lookup lineage reference object : stvrrcd
     * 
     */
    @JsonProperty("rrcdCode")
    public void setRrcdCode(String rrcdCode) {
        this.rrcdCode = rrcdCode;
    }

    public RoomDefinition100PutRequest withRrcdCode(String rrcdCode) {
        this.rrcdCode = rrcdCode;
        return this;
    }

    /**
     * Gender
     * <p>
     * Lineage reference object : SLBRDEF_SEX
     * 
     */
    @JsonProperty("criteria.sex")
    public String getCriteriaSex() {
        return criteriaSex;
    }

    /**
     * Gender
     * <p>
     * Lineage reference object : SLBRDEF_SEX
     * 
     */
    @JsonProperty("criteria.sex")
    public void setCriteriaSex(String criteriaSex) {
        this.criteriaSex = criteriaSex;
    }

    public RoomDefinition100PutRequest withCriteriaSex(String criteriaSex) {
        this.criteriaSex = criteriaSex;
        return this;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBRDEF_MAXIMUM_CAPACITY
     * 
     */
    @JsonProperty("criteria.maximumCapacity")
    public Double getCriteriaMaximumCapacity() {
        return criteriaMaximumCapacity;
    }

    /**
     * Maximum
     * <p>
     * Lineage reference object : SLBRDEF_MAXIMUM_CAPACITY
     * 
     */
    @JsonProperty("criteria.maximumCapacity")
    public void setCriteriaMaximumCapacity(Double criteriaMaximumCapacity) {
        this.criteriaMaximumCapacity = criteriaMaximumCapacity;
    }

    public RoomDefinition100PutRequest withCriteriaMaximumCapacity(Double criteriaMaximumCapacity) {
        this.criteriaMaximumCapacity = criteriaMaximumCapacity;
        return this;
    }

    /**
     * Area(Square Feet)
     * <p>
     * Lineage reference object : SLBRDEF_AREA
     * 
     */
    @JsonProperty("criteria.area")
    public Double getCriteriaArea() {
        return criteriaArea;
    }

    /**
     * Area(Square Feet)
     * <p>
     * Lineage reference object : SLBRDEF_AREA
     * 
     */
    @JsonProperty("criteria.area")
    public void setCriteriaArea(Double criteriaArea) {
        this.criteriaArea = criteriaArea;
    }

    public RoomDefinition100PutRequest withCriteriaArea(Double criteriaArea) {
        this.criteriaArea = criteriaArea;
        return this;
    }

    /**
     * Time Period
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE_PERIOD
     * 
     */
    @JsonProperty("utilityRatePeriod")
    public String getUtilityRatePeriod() {
        return utilityRatePeriod;
    }

    /**
     * Time Period
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE_PERIOD
     * 
     */
    @JsonProperty("utilityRatePeriod")
    public void setUtilityRatePeriod(String utilityRatePeriod) {
        this.utilityRatePeriod = utilityRatePeriod;
    }

    public RoomDefinition100PutRequest withUtilityRatePeriod(String utilityRatePeriod) {
        this.utilityRatePeriod = utilityRatePeriod;
        return this;
    }

    /**
     * Width (feet)
     * <p>
     * Lineage reference object : SLBRDEF_WIDTH
     * 
     */
    @JsonProperty("width")
    public Double getWidth() {
        return width;
    }

    /**
     * Width (feet)
     * <p>
     * Lineage reference object : SLBRDEF_WIDTH
     * 
     */
    @JsonProperty("width")
    public void setWidth(Double width) {
        this.width = width;
    }

    public RoomDefinition100PutRequest withWidth(Double width) {
        this.width = width;
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

    public RoomDefinition100PutRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomDefinition100PutRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("criteriaUserId");
        sb.append('=');
        sb.append(((this.criteriaUserId == null)?"<null>":this.criteriaUserId));
        sb.append(',');
        sb.append("bcatCode");
        sb.append('=');
        sb.append(((this.bcatCode == null)?"<null>":this.bcatCode));
        sb.append(',');
        sb.append("phoneExtension");
        sb.append('=');
        sb.append(((this.phoneExtension == null)?"<null>":this.phoneExtension));
        sb.append(',');
        sb.append("keyNumber");
        sb.append('=');
        sb.append(((this.keyNumber == null)?"<null>":this.keyNumber));
        sb.append(',');
        sb.append("criteriaCtryCodePhone");
        sb.append('=');
        sb.append(((this.criteriaCtryCodePhone == null)?"<null>":this.criteriaCtryCodePhone));
        sb.append(',');
        sb.append("criteriaCollCode");
        sb.append('=');
        sb.append(((this.criteriaCollCode == null)?"<null>":this.criteriaCollCode));
        sb.append(',');
        sb.append("criteriaDesc");
        sb.append('=');
        sb.append(((this.criteriaDesc == null)?"<null>":this.criteriaDesc));
        sb.append(',');
        sb.append("criteriaUtilityRatePeriod");
        sb.append('=');
        sb.append(((this.criteriaUtilityRatePeriod == null)?"<null>":this.criteriaUtilityRatePeriod));
        sb.append(',');
        sb.append("partitionCode");
        sb.append('=');
        sb.append(((this.partitionCode == null)?"<null>":this.partitionCode));
        sb.append(',');
        sb.append("roomType");
        sb.append('=');
        sb.append(((this.roomType == null)?"<null>":this.roomType));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("criteriaPhoneExtension");
        sb.append('=');
        sb.append(((this.criteriaPhoneExtension == null)?"<null>":this.criteriaPhoneExtension));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("criteriaPriority");
        sb.append('=');
        sb.append(((this.criteriaPriority == null)?"<null>":this.criteriaPriority));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
        sb.append(',');
        sb.append("criteriaCapacity");
        sb.append('=');
        sb.append(((this.criteriaCapacity == null)?"<null>":this.criteriaCapacity));
        sb.append(',');
        sb.append("criteriaPhoneNumber");
        sb.append('=');
        sb.append(((this.criteriaPhoneNumber == null)?"<null>":this.criteriaPhoneNumber));
        sb.append(',');
        sb.append("collCode");
        sb.append('=');
        sb.append(((this.collCode == null)?"<null>":this.collCode));
        sb.append(',');
        sb.append("deptCode");
        sb.append('=');
        sb.append(((this.deptCode == null)?"<null>":this.deptCode));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("criteriaUtilityRate");
        sb.append('=');
        sb.append(((this.criteriaUtilityRate == null)?"<null>":this.criteriaUtilityRate));
        sb.append(',');
        sb.append("criteriaTermCodeEff");
        sb.append('=');
        sb.append(((this.criteriaTermCodeEff == null)?"<null>":this.criteriaTermCodeEff));
        sb.append(',');
        sb.append("criteriaActivityDate");
        sb.append('=');
        sb.append(((this.criteriaActivityDate == null)?"<null>":this.criteriaActivityDate));
        sb.append(',');
        sb.append("criteriaDeptCode");
        sb.append('=');
        sb.append(((this.criteriaDeptCode == null)?"<null>":this.criteriaDeptCode));
        sb.append(',');
        sb.append("criteriaPhoneArea");
        sb.append('=');
        sb.append(((this.criteriaPhoneArea == null)?"<null>":this.criteriaPhoneArea));
        sb.append(',');
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("capacity");
        sb.append('=');
        sb.append(((this.capacity == null)?"<null>":this.capacity));
        sb.append(',');
        sb.append("criteriaBcatCode");
        sb.append('=');
        sb.append(((this.criteriaBcatCode == null)?"<null>":this.criteriaBcatCode));
        sb.append(',');
        sb.append("criteriaKeyNumber");
        sb.append('=');
        sb.append(((this.criteriaKeyNumber == null)?"<null>":this.criteriaKeyNumber));
        sb.append(',');
        sb.append("maximumCapacity");
        sb.append('=');
        sb.append(((this.maximumCapacity == null)?"<null>":this.maximumCapacity));
        sb.append(',');
        sb.append("stvtermTermCode");
        sb.append('=');
        sb.append(((this.stvtermTermCode == null)?"<null>":this.stvtermTermCode));
        sb.append(',');
        sb.append("slardefBldgCode");
        sb.append('=');
        sb.append(((this.slardefBldgCode == null)?"<null>":this.slardefBldgCode));
        sb.append(',');
        sb.append("utilityRate");
        sb.append('=');
        sb.append(((this.utilityRate == null)?"<null>":this.utilityRate));
        sb.append(',');
        sb.append("rmstCode");
        sb.append('=');
        sb.append(((this.rmstCode == null)?"<null>":this.rmstCode));
        sb.append(',');
        sb.append("criteriaRrcdCode");
        sb.append('=');
        sb.append(((this.criteriaRrcdCode == null)?"<null>":this.criteriaRrcdCode));
        sb.append(',');
        sb.append("criteriaPrcdCode");
        sb.append('=');
        sb.append(((this.criteriaPrcdCode == null)?"<null>":this.criteriaPrcdCode));
        sb.append(',');
        sb.append("criteriaPartitionCode");
        sb.append('=');
        sb.append(((this.criteriaPartitionCode == null)?"<null>":this.criteriaPartitionCode));
        sb.append(',');
        sb.append("sex");
        sb.append('=');
        sb.append(((this.sex == null)?"<null>":this.sex));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("prcdCode");
        sb.append('=');
        sb.append(((this.prcdCode == null)?"<null>":this.prcdCode));
        sb.append(',');
        sb.append("criteriaRoomType");
        sb.append('=');
        sb.append(((this.criteriaRoomType == null)?"<null>":this.criteriaRoomType));
        sb.append(',');
        sb.append("room");
        sb.append('=');
        sb.append(((this.room == null)?"<null>":this.room));
        sb.append(',');
        sb.append("criteriaRmstCode");
        sb.append('=');
        sb.append(((this.criteriaRmstCode == null)?"<null>":this.criteriaRmstCode));
        sb.append(',');
        sb.append("rrcdCode");
        sb.append('=');
        sb.append(((this.rrcdCode == null)?"<null>":this.rrcdCode));
        sb.append(',');
        sb.append("criteriaSex");
        sb.append('=');
        sb.append(((this.criteriaSex == null)?"<null>":this.criteriaSex));
        sb.append(',');
        sb.append("criteriaMaximumCapacity");
        sb.append('=');
        sb.append(((this.criteriaMaximumCapacity == null)?"<null>":this.criteriaMaximumCapacity));
        sb.append(',');
        sb.append("criteriaArea");
        sb.append('=');
        sb.append(((this.criteriaArea == null)?"<null>":this.criteriaArea));
        sb.append(',');
        sb.append("utilityRatePeriod");
        sb.append('=');
        sb.append(((this.utilityRatePeriod == null)?"<null>":this.utilityRatePeriod));
        sb.append(',');
        sb.append("width");
        sb.append('=');
        sb.append(((this.width == null)?"<null>":this.width));
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
        result = ((result* 31)+((this.bcatCode == null)? 0 :this.bcatCode.hashCode()));
        result = ((result* 31)+((this.phoneExtension == null)? 0 :this.phoneExtension.hashCode()));
        result = ((result* 31)+((this.criteriaCapacity == null)? 0 :this.criteriaCapacity.hashCode()));
        result = ((result* 31)+((this.keyNumber == null)? 0 :this.keyNumber.hashCode()));
        result = ((result* 31)+((this.criteriaRrcdCode == null)? 0 :this.criteriaRrcdCode.hashCode()));
        result = ((result* 31)+((this.criteriaPrcdCode == null)? 0 :this.criteriaPrcdCode.hashCode()));
        result = ((result* 31)+((this.criteriaSex == null)? 0 :this.criteriaSex.hashCode()));
        result = ((result* 31)+((this.partitionCode == null)? 0 :this.partitionCode.hashCode()));
        result = ((result* 31)+((this.roomType == null)? 0 :this.roomType.hashCode()));
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.criteriaActivityDate == null)? 0 :this.criteriaActivityDate.hashCode()));
        result = ((result* 31)+((this.criteriaArea == null)? 0 :this.criteriaArea.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.criteriaCtryCodePhone == null)? 0 :this.criteriaCtryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteriaUserId == null)? 0 :this.criteriaUserId.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneNumber == null)? 0 :this.criteriaPhoneNumber.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.criteriaMaximumCapacity == null)? 0 :this.criteriaMaximumCapacity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.criteriaDesc == null)? 0 :this.criteriaDesc.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        result = ((result* 31)+((this.criteriaRmstCode == null)? 0 :this.criteriaRmstCode.hashCode()));
        result = ((result* 31)+((this.criteriaRoomType == null)? 0 :this.criteriaRoomType.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.criteriaUtilityRatePeriod == null)? 0 :this.criteriaUtilityRatePeriod.hashCode()));
        result = ((result* 31)+((this.capacity == null)? 0 :this.capacity.hashCode()));
        result = ((result* 31)+((this.criteriaBcatCode == null)? 0 :this.criteriaBcatCode.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneArea == null)? 0 :this.criteriaPhoneArea.hashCode()));
        result = ((result* 31)+((this.maximumCapacity == null)? 0 :this.maximumCapacity.hashCode()));
        result = ((result* 31)+((this.stvtermTermCode == null)? 0 :this.stvtermTermCode.hashCode()));
        result = ((result* 31)+((this.slardefBldgCode == null)? 0 :this.slardefBldgCode.hashCode()));
        result = ((result* 31)+((this.utilityRate == null)? 0 :this.utilityRate.hashCode()));
        result = ((result* 31)+((this.criteriaPhoneExtension == null)? 0 :this.criteriaPhoneExtension.hashCode()));
        result = ((result* 31)+((this.rmstCode == null)? 0 :this.rmstCode.hashCode()));
        result = ((result* 31)+((this.criteriaDeptCode == null)? 0 :this.criteriaDeptCode.hashCode()));
        result = ((result* 31)+((this.sex == null)? 0 :this.sex.hashCode()));
        result = ((result* 31)+((this.length == null)? 0 :this.length.hashCode()));
        result = ((result* 31)+((this.prcdCode == null)? 0 :this.prcdCode.hashCode()));
        result = ((result* 31)+((this.criteriaKeyNumber == null)? 0 :this.criteriaKeyNumber.hashCode()));
        result = ((result* 31)+((this.room == null)? 0 :this.room.hashCode()));
        result = ((result* 31)+((this.criteriaPartitionCode == null)? 0 :this.criteriaPartitionCode.hashCode()));
        result = ((result* 31)+((this.criteriaPriority == null)? 0 :this.criteriaPriority.hashCode()));
        result = ((result* 31)+((this.rrcdCode == null)? 0 :this.rrcdCode.hashCode()));
        result = ((result* 31)+((this.criteriaUtilityRate == null)? 0 :this.criteriaUtilityRate.hashCode()));
        result = ((result* 31)+((this.criteriaCollCode == null)? 0 :this.criteriaCollCode.hashCode()));
        result = ((result* 31)+((this.criteriaTermCodeEff == null)? 0 :this.criteriaTermCodeEff.hashCode()));
        result = ((result* 31)+((this.utilityRatePeriod == null)? 0 :this.utilityRatePeriod.hashCode()));
        result = ((result* 31)+((this.width == null)? 0 :this.width.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomDefinition100PutRequest) == false) {
            return false;
        }
        RoomDefinition100PutRequest rhs = ((RoomDefinition100PutRequest) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.bcatCode == rhs.bcatCode)||((this.bcatCode!= null)&&this.bcatCode.equals(rhs.bcatCode)))&&((this.phoneExtension == rhs.phoneExtension)||((this.phoneExtension!= null)&&this.phoneExtension.equals(rhs.phoneExtension))))&&((this.criteriaCapacity == rhs.criteriaCapacity)||((this.criteriaCapacity!= null)&&this.criteriaCapacity.equals(rhs.criteriaCapacity))))&&((this.keyNumber == rhs.keyNumber)||((this.keyNumber!= null)&&this.keyNumber.equals(rhs.keyNumber))))&&((this.criteriaRrcdCode == rhs.criteriaRrcdCode)||((this.criteriaRrcdCode!= null)&&this.criteriaRrcdCode.equals(rhs.criteriaRrcdCode))))&&((this.criteriaPrcdCode == rhs.criteriaPrcdCode)||((this.criteriaPrcdCode!= null)&&this.criteriaPrcdCode.equals(rhs.criteriaPrcdCode))))&&((this.criteriaSex == rhs.criteriaSex)||((this.criteriaSex!= null)&&this.criteriaSex.equals(rhs.criteriaSex))))&&((this.partitionCode == rhs.partitionCode)||((this.partitionCode!= null)&&this.partitionCode.equals(rhs.partitionCode))))&&((this.roomType == rhs.roomType)||((this.roomType!= null)&&this.roomType.equals(rhs.roomType))))&&((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area))))&&((this.criteriaActivityDate == rhs.criteriaActivityDate)||((this.criteriaActivityDate!= null)&&this.criteriaActivityDate.equals(rhs.criteriaActivityDate))))&&((this.criteriaArea == rhs.criteriaArea)||((this.criteriaArea!= null)&&this.criteriaArea.equals(rhs.criteriaArea))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.criteriaCtryCodePhone == rhs.criteriaCtryCodePhone)||((this.criteriaCtryCodePhone!= null)&&this.criteriaCtryCodePhone.equals(rhs.criteriaCtryCodePhone))))&&((this.criteriaUserId == rhs.criteriaUserId)||((this.criteriaUserId!= null)&&this.criteriaUserId.equals(rhs.criteriaUserId))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.criteriaPhoneNumber == rhs.criteriaPhoneNumber)||((this.criteriaPhoneNumber!= null)&&this.criteriaPhoneNumber.equals(rhs.criteriaPhoneNumber))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.criteriaMaximumCapacity == rhs.criteriaMaximumCapacity)||((this.criteriaMaximumCapacity!= null)&&this.criteriaMaximumCapacity.equals(rhs.criteriaMaximumCapacity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.criteriaDesc == rhs.criteriaDesc)||((this.criteriaDesc!= null)&&this.criteriaDesc.equals(rhs.criteriaDesc))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))))&&((this.criteriaRmstCode == rhs.criteriaRmstCode)||((this.criteriaRmstCode!= null)&&this.criteriaRmstCode.equals(rhs.criteriaRmstCode))))&&((this.criteriaRoomType == rhs.criteriaRoomType)||((this.criteriaRoomType!= null)&&this.criteriaRoomType.equals(rhs.criteriaRoomType))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.criteriaUtilityRatePeriod == rhs.criteriaUtilityRatePeriod)||((this.criteriaUtilityRatePeriod!= null)&&this.criteriaUtilityRatePeriod.equals(rhs.criteriaUtilityRatePeriod))))&&((this.capacity == rhs.capacity)||((this.capacity!= null)&&this.capacity.equals(rhs.capacity))))&&((this.criteriaBcatCode == rhs.criteriaBcatCode)||((this.criteriaBcatCode!= null)&&this.criteriaBcatCode.equals(rhs.criteriaBcatCode))))&&((this.criteriaPhoneArea == rhs.criteriaPhoneArea)||((this.criteriaPhoneArea!= null)&&this.criteriaPhoneArea.equals(rhs.criteriaPhoneArea))))&&((this.maximumCapacity == rhs.maximumCapacity)||((this.maximumCapacity!= null)&&this.maximumCapacity.equals(rhs.maximumCapacity))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))))&&((this.slardefBldgCode == rhs.slardefBldgCode)||((this.slardefBldgCode!= null)&&this.slardefBldgCode.equals(rhs.slardefBldgCode))))&&((this.utilityRate == rhs.utilityRate)||((this.utilityRate!= null)&&this.utilityRate.equals(rhs.utilityRate))))&&((this.criteriaPhoneExtension == rhs.criteriaPhoneExtension)||((this.criteriaPhoneExtension!= null)&&this.criteriaPhoneExtension.equals(rhs.criteriaPhoneExtension))))&&((this.rmstCode == rhs.rmstCode)||((this.rmstCode!= null)&&this.rmstCode.equals(rhs.rmstCode))))&&((this.criteriaDeptCode == rhs.criteriaDeptCode)||((this.criteriaDeptCode!= null)&&this.criteriaDeptCode.equals(rhs.criteriaDeptCode))))&&((this.sex == rhs.sex)||((this.sex!= null)&&this.sex.equals(rhs.sex))))&&((this.length == rhs.length)||((this.length!= null)&&this.length.equals(rhs.length))))&&((this.prcdCode == rhs.prcdCode)||((this.prcdCode!= null)&&this.prcdCode.equals(rhs.prcdCode))))&&((this.criteriaKeyNumber == rhs.criteriaKeyNumber)||((this.criteriaKeyNumber!= null)&&this.criteriaKeyNumber.equals(rhs.criteriaKeyNumber))))&&((this.room == rhs.room)||((this.room!= null)&&this.room.equals(rhs.room))))&&((this.criteriaPartitionCode == rhs.criteriaPartitionCode)||((this.criteriaPartitionCode!= null)&&this.criteriaPartitionCode.equals(rhs.criteriaPartitionCode))))&&((this.criteriaPriority == rhs.criteriaPriority)||((this.criteriaPriority!= null)&&this.criteriaPriority.equals(rhs.criteriaPriority))))&&((this.rrcdCode == rhs.rrcdCode)||((this.rrcdCode!= null)&&this.rrcdCode.equals(rhs.rrcdCode))))&&((this.criteriaUtilityRate == rhs.criteriaUtilityRate)||((this.criteriaUtilityRate!= null)&&this.criteriaUtilityRate.equals(rhs.criteriaUtilityRate))))&&((this.criteriaCollCode == rhs.criteriaCollCode)||((this.criteriaCollCode!= null)&&this.criteriaCollCode.equals(rhs.criteriaCollCode))))&&((this.criteriaTermCodeEff == rhs.criteriaTermCodeEff)||((this.criteriaTermCodeEff!= null)&&this.criteriaTermCodeEff.equals(rhs.criteriaTermCodeEff))))&&((this.utilityRatePeriod == rhs.utilityRatePeriod)||((this.utilityRatePeriod!= null)&&this.utilityRatePeriod.equals(rhs.utilityRatePeriod))))&&((this.width == rhs.width)||((this.width!= null)&&this.width.equals(rhs.width))));
    }

}
