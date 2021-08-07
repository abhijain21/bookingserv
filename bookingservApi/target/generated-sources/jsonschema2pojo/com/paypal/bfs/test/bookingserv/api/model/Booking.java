
package com.paypal.bfs.test.bookingserv.api.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


/**
 * Booking resource
 * <p>
 * Booking resource object
 * 
 */
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "first_name",
    "last_name",
    "date_of_birth",
    "checkin",
    "checkout",
    "totalprice",
    "deposit",
    "address"
})
public class Booking {

    /**
     * Booking id
     * 
     */
    @Id
    @GeneratedValue
    @JsonProperty("id")
    @JsonPropertyDescription("Booking id")
    private Integer id;
    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("First name")
    private String firstName;
    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    @JsonPropertyDescription("Last name")
    private String lastName;
    /**
     * Date of Birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    @JsonPropertyDescription("Date of Birth")
    private String dateOfBirth;
    /**
     * Checkin Date & time
     * (Required)
     * 
     */
    @JsonProperty("checkin")
    @JsonPropertyDescription("Checkin Date & time")
    private Date checkin;
    /**
     * Checkout Date & time
     * (Required)
     * 
     */
    @JsonProperty("checkout")
    @JsonPropertyDescription("Checkout Date & time")
    private Date checkout;
    /**
     * Total Price
     * (Required)
     * 
     */
    @JsonProperty("totalprice")
    @JsonPropertyDescription("Total Price")
    private Double totalprice;
    /**
     * Deposit
     * (Required)
     * 
     */
    @JsonProperty("deposit")
    @JsonPropertyDescription("Deposit")
    private Double deposit;
    /**
     * Address
     * (Required)
     * 
     */
    @OneToOne(targetEntity = Address.class, orphanRemoval = true, cascade = CascadeType.ALL)
    @JsonProperty("address")
    @JsonPropertyDescription("Address")
    private Address address;

    /**
     * Booking id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Booking id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * Last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Date of Birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Date of Birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Checkin Date & time
     * (Required)
     * 
     */
    @JsonProperty("checkin")
    public Date getCheckin() {
        return checkin;
    }

    /**
     * Checkin Date & time
     * (Required)
     * 
     */
    @JsonProperty("checkin")
    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    /**
     * Checkout Date & time
     * (Required)
     * 
     */
    @JsonProperty("checkout")
    public Date getCheckout() {
        return checkout;
    }

    /**
     * Checkout Date & time
     * (Required)
     * 
     */
    @JsonProperty("checkout")
    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    /**
     * Total Price
     * (Required)
     * 
     */
    @JsonProperty("totalprice")
    public Double getTotalprice() {
        return totalprice;
    }

    /**
     * Total Price
     * (Required)
     * 
     */
    @JsonProperty("totalprice")
    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * Deposit
     * (Required)
     * 
     */
    @JsonProperty("deposit")
    public Double getDeposit() {
        return deposit;
    }

    /**
     * Deposit
     * (Required)
     * 
     */
    @JsonProperty("deposit")
    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    /**
     * Address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * Address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Booking.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("checkin");
        sb.append('=');
        sb.append(((this.checkin == null)?"<null>":this.checkin));
        sb.append(',');
        sb.append("checkout");
        sb.append('=');
        sb.append(((this.checkout == null)?"<null>":this.checkout));
        sb.append(',');
        sb.append("totalprice");
        sb.append('=');
        sb.append(((this.totalprice == null)?"<null>":this.totalprice));
        sb.append(',');
        sb.append("deposit");
        sb.append('=');
        sb.append(((this.deposit == null)?"<null>":this.deposit));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
