package com.example.cantri.layoutdoctoronline;

import android.os.Parcel;
import android.os.Parcelable;

public class Doctor implements Parcelable {
    private String user;
    private String specialty;
    private String description;

    public Doctor() {}

    public Doctor(String user, String specialty) {
        this.user = user;
        this.specialty = specialty;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.user);
        dest.writeString(this.specialty);
        dest.writeString(this.description);
    }

    protected Doctor(Parcel in) {
        this.user = in.readString();
        this.specialty = in.readString();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<Doctor> CREATOR = new Parcelable.Creator<Doctor>() {
        @Override
        public Doctor createFromParcel(Parcel source) {
            return new Doctor(source);
        }

        @Override
        public Doctor[] newArray(int size) {
            return new Doctor[size];
        }
    };
}
