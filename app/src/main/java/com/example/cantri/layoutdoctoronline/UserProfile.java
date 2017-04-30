package com.example.cantri.layoutdoctoronline;

public class UserProfile {
    private String key;
    private String fullName;
    private String type;
    private int yearOfBirth;
    private CreditCard creditCard;

    public UserProfile() {}

    public UserProfile(String key, String fullName, String type, int yearOfBirth, CreditCard creditCard) {
        this.key = key;
        this.fullName = fullName;
        this.type = type;
        this.yearOfBirth = yearOfBirth;
        this.creditCard = creditCard;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return this.type;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
