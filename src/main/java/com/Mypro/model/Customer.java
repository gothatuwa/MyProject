package com.Mypro.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    private int cusid;
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private String job;
    private String title;
    private String company;
    private String email;
    private int phonenumber;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int getCusid() {
        return cusid;
    }

    public void setCusid(int cusid) {
        this.cusid = cusid;
    }
    @Column(name="first_name", nullable=false)
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    @Column(name="last_name", nullable=false)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Column(name="address", nullable=false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Column(name="city", nullable=false)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Column(name="state", nullable=false)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Column(name="job", nullable=false)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    @Column(name="title", nullable=false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name="company", nullable=false)
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Column(name="email", nullable=false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name="phone", nullable=false)
    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public int hashCode() {
        int result = cusid;
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + phonenumber;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (cusid != customer.cusid) return false;
        if (phonenumber != customer.phonenumber) return false;
        if (!firstname.equals(customer.firstname)) return false;
        if (!lastname.equals(customer.lastname)) return false;
        if (!address.equals(customer.address)) return false;
        if (!city.equals(customer.city)) return false;
        if (!state.equals(customer.state)) return false;
        if (!job.equals(customer.job)) return false;
        if (!title.equals(customer.title)) return false;
        if (!company.equals(customer.company)) return false;
        return email.equals(customer.email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusid=" + cusid +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", job='" + job + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
