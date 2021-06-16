package models;

public class User {

    private String customerFirstName;
    private String customerLastName;
    private String password;
    private String dayOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;
    private String company;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private String mobilePhone;
    private String addressAlias;


    public User(String customerFirstName, String customerLastName, String password, String dayOfBirth, String monthOfBirth,
                String yearOfBirth, String company, String address, String city, String state, String postalCode,
                String country, String mobilePhone, String addressAlias) {
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.password = password;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.company = company;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.mobilePhone = mobilePhone;
        this.addressAlias = addressAlias;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getPassword() {
        return password;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getAddressAlias() {
        return addressAlias;
    }


}
