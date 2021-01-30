package com.example.fragments;

import android.os.Parcel;
import android.os.Parcelable;

public class Models implements Parcelable {
    String name;

    public Models(String name) {
        this.name = name;
    }

    protected Models(Parcel in) {
        name = in.readString();
    }

    public static final Creator<Models> CREATOR = new Creator<Models>() {
        @Override
        public Models createFromParcel(Parcel in) {
            return new Models(in);
        }

        @Override
        public Models[] newArray(int size) {
            return new Models[size];
        }
    };

    public String getName() {
        return name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
    }
}
