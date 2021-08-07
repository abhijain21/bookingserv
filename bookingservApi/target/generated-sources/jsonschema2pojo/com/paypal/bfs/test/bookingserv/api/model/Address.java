
package com.paypal.bfs.test.bookingserv.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Address resource
 * <p>
 * Address resource object
 * 
 */
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "line1",
    "line2",
    "city",
    "state",
    "country",
    "zipcode"
})
public class Address {

    /**
     * Address id
     * 
     */
    @Id
    @GeneratedValue
    @JsonProperty("id")
    @JsonPropertyDescription("Address id")
    private Integer id;
    /**
     * Address line 1
     * (Required)
     * 
     */
    @JsonProperty("line1")
    @JsonPropertyDescription("Address line 1")
    private String line1;
    /**
     * Address line 2
     * 
     */
    @JsonProperty("line2")
    @JsonPropertyDescription("Address line 2")
    private String line2;
    /**
     * City
     * (Required)
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City")
    private String city;
    /**
     * State
     * (Required)
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("State")
    private String state;
    /**
     * Country
     * (Required)
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("Country")
    private String country;
    /**
     * Zipcode
     * (Required)
     * 
     */
    @JsonProperty("zipcode")
    @JsonPropertyDescription("Zipcode")
    private String zipcode;

    /**
     * Address id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Address id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Address line 1
     * (Required)
     * 
     */
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    /**
     * Address line 1
     * (Required)
     * 
     */
    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * Address line 2
     * 
     */
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    /**
     * Address line 2
     * 
     */
    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * City
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * State
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * State
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Country
     * (Required)
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * Country
     * (Required)
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Zipcode
     * (Required)
     * 
     */
    @JsonProperty("zipcode")
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Zipcode
     * (Required)
     * 
     */
    @JsonProperty("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("line1");
        sb.append('=');
        sb.append(((this.line1 == null)?"<null>":this.line1));
        sb.append(',');
        sb.append("line2");
        sb.append('=');
        sb.append(((this.line2 == null)?"<null>":this.line2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipcode");
        sb.append('=');
        sb.append(((this.zipcode == null)?"<null>":this.zipcode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
