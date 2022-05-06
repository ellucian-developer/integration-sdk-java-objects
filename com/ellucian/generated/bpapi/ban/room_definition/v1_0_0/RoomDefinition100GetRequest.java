
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
    "bcatCode",
    "phoneExtension",
    "keyNumber",
    "ctryCodePhone",
    "capacity",
    "activityDate",
    "partitionCode",
    "maximumCapacity",
    "stvtermTermCode",
    "roomType",
    "slardefBldgCode",
    "area",
    "utilityRate",
    "termCodeEff",
    "rmstCode",
    "sex",
    "prcdCode",
    "priority",
    "userId",
    "room",
    "rrcdCode",
    "phoneNumber",
    "utilityRatePeriod",
    "phoneArea",
    "collCode",
    "deptCode",
    "desc"
})
@Generated("jsonschema2pojo")
public class RoomDefinition100GetRequest {

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
     * Lineage reference object : SLBRDEF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_ACTIVITY_DATE")
    private Date activityDate;
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
    private Object stvtermTermCode;
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
     * Building
     * <p>
     * Lineage reference object : slardefBldgCode, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("slardefBldgCode")
    @JsonPropertyDescription("Lineage reference object : slardefBldgCode, Lookup lineage reference object : stvbldg")
    private Object slardefBldgCode;
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
     * Utility Rate
     * <p>
     * Lineage reference object : SLBRDEF_UTILITY_RATE
     * 
     */
    @JsonProperty("utilityRate")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_UTILITY_RATE")
    private Double utilityRate;
    /**
     * New Term
     * <p>
     * Lineage reference object : SLBRDEF_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEff")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_TERM_CODE_EFF, Lookup lineage reference object : stvterm")
    private String termCodeEff;
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
     * Gender
     * <p>
     * Lineage reference object : SLBRDEF_SEX
     * 
     */
    @JsonProperty("sex")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_SEX")
    private String sex;
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
     * Priority
     * <p>
     * Lineage reference object : SLBRDEF_PRIORITY
     * 
     */
    @JsonProperty("priority")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PRIORITY")
    private String priority;
    /**
     * Lineage reference object : SLBRDEF_USER_ID
     * 
     */
    @JsonProperty("userId")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_USER_ID")
    private String userId;
    /**
     * Room
     * <p>
     * Lineage reference object : room
     * 
     */
    @JsonProperty("room")
    @JsonPropertyDescription("Lineage reference object : room")
    private Object room;
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
     * Phone Number
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_NUMBER
     * 
     */
    @JsonProperty("phoneNumber")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PHONE_NUMBER")
    private String phoneNumber;
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
     * Area Code
     * <p>
     * Lineage reference object : SLBRDEF_PHONE_AREA
     * 
     */
    @JsonProperty("phoneArea")
    @JsonPropertyDescription("Lineage reference object : SLBRDEF_PHONE_AREA")
    private String phoneArea;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public RoomDefinition100GetRequest withBcatCode(String bcatCode) {
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

    public RoomDefinition100GetRequest withPhoneExtension(String phoneExtension) {
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

    public RoomDefinition100GetRequest withKeyNumber(String keyNumber) {
        this.keyNumber = keyNumber;
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

    public RoomDefinition100GetRequest withCtryCodePhone(String ctryCodePhone) {
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

    public RoomDefinition100GetRequest withCapacity(Double capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Lineage reference object : SLBRDEF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public Date getActivityDate() {
        return activityDate;
    }

    /**
     * Lineage reference object : SLBRDEF_ACTIVITY_DATE
     * 
     */
    @JsonProperty("activityDate")
    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public RoomDefinition100GetRequest withActivityDate(Date activityDate) {
        this.activityDate = activityDate;
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

    public RoomDefinition100GetRequest withPartitionCode(String partitionCode) {
        this.partitionCode = partitionCode;
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

    public RoomDefinition100GetRequest withMaximumCapacity(Double maximumCapacity) {
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
    public Object getStvtermTermCode() {
        return stvtermTermCode;
    }

    /**
     * Term
     * <p>
     * Lineage reference object : stvtermTermCode, Lookup lineage reference object : stvterm
     * 
     */
    @JsonProperty("stvtermTermCode")
    public void setStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
    }

    public RoomDefinition100GetRequest withStvtermTermCode(Object stvtermTermCode) {
        this.stvtermTermCode = stvtermTermCode;
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

    public RoomDefinition100GetRequest withRoomType(String roomType) {
        this.roomType = roomType;
        return this;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : slardefBldgCode, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("slardefBldgCode")
    public Object getSlardefBldgCode() {
        return slardefBldgCode;
    }

    /**
     * Building
     * <p>
     * Lineage reference object : slardefBldgCode, Lookup lineage reference object : stvbldg
     * 
     */
    @JsonProperty("slardefBldgCode")
    public void setSlardefBldgCode(Object slardefBldgCode) {
        this.slardefBldgCode = slardefBldgCode;
    }

    public RoomDefinition100GetRequest withSlardefBldgCode(Object slardefBldgCode) {
        this.slardefBldgCode = slardefBldgCode;
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

    public RoomDefinition100GetRequest withArea(Double area) {
        this.area = area;
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

    public RoomDefinition100GetRequest withUtilityRate(Double utilityRate) {
        this.utilityRate = utilityRate;
        return this;
    }

    /**
     * New Term
     * <p>
     * Lineage reference object : SLBRDEF_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEff")
    public String getTermCodeEff() {
        return termCodeEff;
    }

    /**
     * New Term
     * <p>
     * Lineage reference object : SLBRDEF_TERM_CODE_EFF, Lookup lineage reference object : stvterm
     * (Required)
     * 
     */
    @JsonProperty("termCodeEff")
    public void setTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
    }

    public RoomDefinition100GetRequest withTermCodeEff(String termCodeEff) {
        this.termCodeEff = termCodeEff;
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

    public RoomDefinition100GetRequest withRmstCode(String rmstCode) {
        this.rmstCode = rmstCode;
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

    public RoomDefinition100GetRequest withSex(String sex) {
        this.sex = sex;
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

    public RoomDefinition100GetRequest withPrcdCode(String prcdCode) {
        this.prcdCode = prcdCode;
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

    public RoomDefinition100GetRequest withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Lineage reference object : SLBRDEF_USER_ID
     * 
     */
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Lineage reference object : SLBRDEF_USER_ID
     * 
     */
    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RoomDefinition100GetRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : room
     * 
     */
    @JsonProperty("room")
    public Object getRoom() {
        return room;
    }

    /**
     * Room
     * <p>
     * Lineage reference object : room
     * 
     */
    @JsonProperty("room")
    public void setRoom(Object room) {
        this.room = room;
    }

    public RoomDefinition100GetRequest withRoom(Object room) {
        this.room = room;
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

    public RoomDefinition100GetRequest withRrcdCode(String rrcdCode) {
        this.rrcdCode = rrcdCode;
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

    public RoomDefinition100GetRequest withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public RoomDefinition100GetRequest withUtilityRatePeriod(String utilityRatePeriod) {
        this.utilityRatePeriod = utilityRatePeriod;
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

    public RoomDefinition100GetRequest withPhoneArea(String phoneArea) {
        this.phoneArea = phoneArea;
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

    public RoomDefinition100GetRequest withCollCode(String collCode) {
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

    public RoomDefinition100GetRequest withDeptCode(String deptCode) {
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

    public RoomDefinition100GetRequest withDesc(String desc) {
        this.desc = desc;
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

    public RoomDefinition100GetRequest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RoomDefinition100GetRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("ctryCodePhone");
        sb.append('=');
        sb.append(((this.ctryCodePhone == null)?"<null>":this.ctryCodePhone));
        sb.append(',');
        sb.append("capacity");
        sb.append('=');
        sb.append(((this.capacity == null)?"<null>":this.capacity));
        sb.append(',');
        sb.append("activityDate");
        sb.append('=');
        sb.append(((this.activityDate == null)?"<null>":this.activityDate));
        sb.append(',');
        sb.append("partitionCode");
        sb.append('=');
        sb.append(((this.partitionCode == null)?"<null>":this.partitionCode));
        sb.append(',');
        sb.append("maximumCapacity");
        sb.append('=');
        sb.append(((this.maximumCapacity == null)?"<null>":this.maximumCapacity));
        sb.append(',');
        sb.append("stvtermTermCode");
        sb.append('=');
        sb.append(((this.stvtermTermCode == null)?"<null>":this.stvtermTermCode));
        sb.append(',');
        sb.append("roomType");
        sb.append('=');
        sb.append(((this.roomType == null)?"<null>":this.roomType));
        sb.append(',');
        sb.append("slardefBldgCode");
        sb.append('=');
        sb.append(((this.slardefBldgCode == null)?"<null>":this.slardefBldgCode));
        sb.append(',');
        sb.append("area");
        sb.append('=');
        sb.append(((this.area == null)?"<null>":this.area));
        sb.append(',');
        sb.append("utilityRate");
        sb.append('=');
        sb.append(((this.utilityRate == null)?"<null>":this.utilityRate));
        sb.append(',');
        sb.append("termCodeEff");
        sb.append('=');
        sb.append(((this.termCodeEff == null)?"<null>":this.termCodeEff));
        sb.append(',');
        sb.append("rmstCode");
        sb.append('=');
        sb.append(((this.rmstCode == null)?"<null>":this.rmstCode));
        sb.append(',');
        sb.append("sex");
        sb.append('=');
        sb.append(((this.sex == null)?"<null>":this.sex));
        sb.append(',');
        sb.append("prcdCode");
        sb.append('=');
        sb.append(((this.prcdCode == null)?"<null>":this.prcdCode));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null)?"<null>":this.userId));
        sb.append(',');
        sb.append("room");
        sb.append('=');
        sb.append(((this.room == null)?"<null>":this.room));
        sb.append(',');
        sb.append("rrcdCode");
        sb.append('=');
        sb.append(((this.rrcdCode == null)?"<null>":this.rrcdCode));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("utilityRatePeriod");
        sb.append('=');
        sb.append(((this.utilityRatePeriod == null)?"<null>":this.utilityRatePeriod));
        sb.append(',');
        sb.append("phoneArea");
        sb.append('=');
        sb.append(((this.phoneArea == null)?"<null>":this.phoneArea));
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
        result = ((result* 31)+((this.keyNumber == null)? 0 :this.keyNumber.hashCode()));
        result = ((result* 31)+((this.ctryCodePhone == null)? 0 :this.ctryCodePhone.hashCode()));
        result = ((result* 31)+((this.capacity == null)? 0 :this.capacity.hashCode()));
        result = ((result* 31)+((this.activityDate == null)? 0 :this.activityDate.hashCode()));
        result = ((result* 31)+((this.partitionCode == null)? 0 :this.partitionCode.hashCode()));
        result = ((result* 31)+((this.maximumCapacity == null)? 0 :this.maximumCapacity.hashCode()));
        result = ((result* 31)+((this.stvtermTermCode == null)? 0 :this.stvtermTermCode.hashCode()));
        result = ((result* 31)+((this.roomType == null)? 0 :this.roomType.hashCode()));
        result = ((result* 31)+((this.slardefBldgCode == null)? 0 :this.slardefBldgCode.hashCode()));
        result = ((result* 31)+((this.area == null)? 0 :this.area.hashCode()));
        result = ((result* 31)+((this.utilityRate == null)? 0 :this.utilityRate.hashCode()));
        result = ((result* 31)+((this.termCodeEff == null)? 0 :this.termCodeEff.hashCode()));
        result = ((result* 31)+((this.rmstCode == null)? 0 :this.rmstCode.hashCode()));
        result = ((result* 31)+((this.sex == null)? 0 :this.sex.hashCode()));
        result = ((result* 31)+((this.prcdCode == null)? 0 :this.prcdCode.hashCode()));
        result = ((result* 31)+((this.priority == null)? 0 :this.priority.hashCode()));
        result = ((result* 31)+((this.userId == null)? 0 :this.userId.hashCode()));
        result = ((result* 31)+((this.room == null)? 0 :this.room.hashCode()));
        result = ((result* 31)+((this.rrcdCode == null)? 0 :this.rrcdCode.hashCode()));
        result = ((result* 31)+((this.phoneNumber == null)? 0 :this.phoneNumber.hashCode()));
        result = ((result* 31)+((this.utilityRatePeriod == null)? 0 :this.utilityRatePeriod.hashCode()));
        result = ((result* 31)+((this.phoneArea == null)? 0 :this.phoneArea.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.collCode == null)? 0 :this.collCode.hashCode()));
        result = ((result* 31)+((this.deptCode == null)? 0 :this.deptCode.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoomDefinition100GetRequest) == false) {
            return false;
        }
        RoomDefinition100GetRequest rhs = ((RoomDefinition100GetRequest) other);
        return (((((((((((((((((((((((((((((this.bcatCode == rhs.bcatCode)||((this.bcatCode!= null)&&this.bcatCode.equals(rhs.bcatCode)))&&((this.phoneExtension == rhs.phoneExtension)||((this.phoneExtension!= null)&&this.phoneExtension.equals(rhs.phoneExtension))))&&((this.keyNumber == rhs.keyNumber)||((this.keyNumber!= null)&&this.keyNumber.equals(rhs.keyNumber))))&&((this.ctryCodePhone == rhs.ctryCodePhone)||((this.ctryCodePhone!= null)&&this.ctryCodePhone.equals(rhs.ctryCodePhone))))&&((this.capacity == rhs.capacity)||((this.capacity!= null)&&this.capacity.equals(rhs.capacity))))&&((this.activityDate == rhs.activityDate)||((this.activityDate!= null)&&this.activityDate.equals(rhs.activityDate))))&&((this.partitionCode == rhs.partitionCode)||((this.partitionCode!= null)&&this.partitionCode.equals(rhs.partitionCode))))&&((this.maximumCapacity == rhs.maximumCapacity)||((this.maximumCapacity!= null)&&this.maximumCapacity.equals(rhs.maximumCapacity))))&&((this.stvtermTermCode == rhs.stvtermTermCode)||((this.stvtermTermCode!= null)&&this.stvtermTermCode.equals(rhs.stvtermTermCode))))&&((this.roomType == rhs.roomType)||((this.roomType!= null)&&this.roomType.equals(rhs.roomType))))&&((this.slardefBldgCode == rhs.slardefBldgCode)||((this.slardefBldgCode!= null)&&this.slardefBldgCode.equals(rhs.slardefBldgCode))))&&((this.area == rhs.area)||((this.area!= null)&&this.area.equals(rhs.area))))&&((this.utilityRate == rhs.utilityRate)||((this.utilityRate!= null)&&this.utilityRate.equals(rhs.utilityRate))))&&((this.termCodeEff == rhs.termCodeEff)||((this.termCodeEff!= null)&&this.termCodeEff.equals(rhs.termCodeEff))))&&((this.rmstCode == rhs.rmstCode)||((this.rmstCode!= null)&&this.rmstCode.equals(rhs.rmstCode))))&&((this.sex == rhs.sex)||((this.sex!= null)&&this.sex.equals(rhs.sex))))&&((this.prcdCode == rhs.prcdCode)||((this.prcdCode!= null)&&this.prcdCode.equals(rhs.prcdCode))))&&((this.priority == rhs.priority)||((this.priority!= null)&&this.priority.equals(rhs.priority))))&&((this.userId == rhs.userId)||((this.userId!= null)&&this.userId.equals(rhs.userId))))&&((this.room == rhs.room)||((this.room!= null)&&this.room.equals(rhs.room))))&&((this.rrcdCode == rhs.rrcdCode)||((this.rrcdCode!= null)&&this.rrcdCode.equals(rhs.rrcdCode))))&&((this.phoneNumber == rhs.phoneNumber)||((this.phoneNumber!= null)&&this.phoneNumber.equals(rhs.phoneNumber))))&&((this.utilityRatePeriod == rhs.utilityRatePeriod)||((this.utilityRatePeriod!= null)&&this.utilityRatePeriod.equals(rhs.utilityRatePeriod))))&&((this.phoneArea == rhs.phoneArea)||((this.phoneArea!= null)&&this.phoneArea.equals(rhs.phoneArea))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.collCode == rhs.collCode)||((this.collCode!= null)&&this.collCode.equals(rhs.collCode))))&&((this.deptCode == rhs.deptCode)||((this.deptCode!= null)&&this.deptCode.equals(rhs.deptCode))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
