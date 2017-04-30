package com.example.cantri.layoutdoctoronline;

public class CreditCard {
    private String cardNumber;
    private String ownerName;
    private String CSV;

    public CreditCard() {}

    public CreditCard(String cardNumber, String ownerName, String CSV) {
        this.cardNumber = cardNumber;
        this.ownerName = ownerName;
        this.CSV = CSV;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCSV() {
        return this.CSV;
    }

    public void setCSV(String CSV) {
        this.CSV = CSV;
    }
}
