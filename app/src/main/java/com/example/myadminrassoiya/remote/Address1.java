package com.example.myadminrassoiya.remote;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address1 {
    @SerializedName("address_line1")
    @Expose
    private String address_line1;
    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }
    @SerializedName("address_line2")
    @Expose
    private String address_line2;

    public String getAddress_line2() {
        return address_line2;
    }

    public void setAddress_line2(String address_line2) {
        this.address_line2 = address_line2;
    }

    @SerializedName("address_type")
    @Expose
    private String address_type;
    public String getAddress_type() {
        return address_type;
    }

    public void setAddress_type(String address_type) {
        this.address_type = address_type;
    }

    @SerializedName("city")
    @Expose
    private String city;
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @SerializedName("district")
    @Expose
    private String district;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @SerializedName("geo_location")
    @Expose
    private String geo_location;
    public String getGeo_location() {
        return geo_location;
    }

    public void setGeo_location(String geo_location) {
        this.geo_location = geo_location;
    }
    @SerializedName("pin_code")
    @Expose
    private String pin_code;

    public String getPin_code() {
        return pin_code;
    }

    public void setPin_code(String pin_code) {
        this.pin_code = pin_code;
    }

    @SerializedName("state")
    @Expose
    private String state;
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @SerializedName("is_current_address")
    @Expose
    private String is_current_address;

    public String getIs_current_address() {
        return is_current_address;
    }

    public void setIs_current_address(String is_current_address) {
        this.is_current_address = is_current_address;
    }


}
