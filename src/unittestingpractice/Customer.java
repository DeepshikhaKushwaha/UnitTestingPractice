/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingpractice;

/**
 *
 * @author deepshikha
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String name;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    
     public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {

        if (address == null || address.length() == 0) {
            throw new IllegalArgumentException("Address cannot be null");
        }
        this.address = address;
    }
    
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        
        if (phone == null || phone.length() == 0) {
            throw new IllegalArgumentException("Phone numbers cannot be null");
        }
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if ((this.phone == null) ? (other.phone != null) : !this.phone.equals(other.phone)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.phone != null ? this.phone.hashCode() : 0);
        return hash;
    }

    public String toString() {
        return name + ", " + phone;
    }
}
