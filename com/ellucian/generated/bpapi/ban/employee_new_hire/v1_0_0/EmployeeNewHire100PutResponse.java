
package com.ellucian.generated.bpapi.ban.employee_new_hire.v1_0_0;

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
    "jobs",
    "employee",
    "bio_demo",
    "spraddr"
})
@Generated("jsonschema2pojo")
public class EmployeeNewHire100PutResponse {

    @JsonProperty("jobs")
    private List<Job> jobs = new ArrayList<Job>();
    @JsonProperty("employee")
    private List<Employee> employee = new ArrayList<Employee>();
    @JsonProperty("bio_demo")
    private List<BioDemo__1> bioDemo = new ArrayList<BioDemo__1>();
    @JsonProperty("spraddr")
    private List<Spraddr> spraddr = new ArrayList<Spraddr>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("jobs")
    public List<Job> getJobs() {
        return jobs;
    }

    @JsonProperty("jobs")
    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public EmployeeNewHire100PutResponse withJobs(List<Job> jobs) {
        this.jobs = jobs;
        return this;
    }

    @JsonProperty("employee")
    public List<Employee> getEmployee() {
        return employee;
    }

    @JsonProperty("employee")
    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public EmployeeNewHire100PutResponse withEmployee(List<Employee> employee) {
        this.employee = employee;
        return this;
    }

    @JsonProperty("bio_demo")
    public List<BioDemo__1> getBioDemo() {
        return bioDemo;
    }

    @JsonProperty("bio_demo")
    public void setBioDemo(List<BioDemo__1> bioDemo) {
        this.bioDemo = bioDemo;
    }

    public EmployeeNewHire100PutResponse withBioDemo(List<BioDemo__1> bioDemo) {
        this.bioDemo = bioDemo;
        return this;
    }

    @JsonProperty("spraddr")
    public List<Spraddr> getSpraddr() {
        return spraddr;
    }

    @JsonProperty("spraddr")
    public void setSpraddr(List<Spraddr> spraddr) {
        this.spraddr = spraddr;
    }

    public EmployeeNewHire100PutResponse withSpraddr(List<Spraddr> spraddr) {
        this.spraddr = spraddr;
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

    public EmployeeNewHire100PutResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmployeeNewHire100PutResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("jobs");
        sb.append('=');
        sb.append(((this.jobs == null)?"<null>":this.jobs));
        sb.append(',');
        sb.append("employee");
        sb.append('=');
        sb.append(((this.employee == null)?"<null>":this.employee));
        sb.append(',');
        sb.append("bioDemo");
        sb.append('=');
        sb.append(((this.bioDemo == null)?"<null>":this.bioDemo));
        sb.append(',');
        sb.append("spraddr");
        sb.append('=');
        sb.append(((this.spraddr == null)?"<null>":this.spraddr));
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
        result = ((result* 31)+((this.spraddr == null)? 0 :this.spraddr.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.employee == null)? 0 :this.employee.hashCode()));
        result = ((result* 31)+((this.jobs == null)? 0 :this.jobs.hashCode()));
        result = ((result* 31)+((this.bioDemo == null)? 0 :this.bioDemo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmployeeNewHire100PutResponse) == false) {
            return false;
        }
        EmployeeNewHire100PutResponse rhs = ((EmployeeNewHire100PutResponse) other);
        return ((((((this.spraddr == rhs.spraddr)||((this.spraddr!= null)&&this.spraddr.equals(rhs.spraddr)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.employee == rhs.employee)||((this.employee!= null)&&this.employee.equals(rhs.employee))))&&((this.jobs == rhs.jobs)||((this.jobs!= null)&&this.jobs.equals(rhs.jobs))))&&((this.bioDemo == rhs.bioDemo)||((this.bioDemo!= null)&&this.bioDemo.equals(rhs.bioDemo))));
    }

}
