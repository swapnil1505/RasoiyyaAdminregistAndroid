package com.example.myadminrassoiya.remote;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {
    @SerializedName("addressList")
    @Expose
    private List<Address1> addressList =null;
    public List<Address1> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address1> addressList) {
        this.addressList = addressList;
    }
    @SerializedName("date_of_birth")
    @Expose
    private String date_of_birth;
    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }


    @SerializedName("email_id")
    @Expose
    private String email_id;
    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
    @SerializedName("first_name")
    @Expose
    private String first_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @SerializedName("gender")
    @Expose
    private String gender;
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @SerializedName("govt_id_no")
    @Expose
    private String govt_id_no;
    public String getGovt_id_no() {
        return govt_id_no;
    }

    public void setGovt_id_no(String govt_id_no) {
        this.govt_id_no = govt_id_no;
    }

    @SerializedName("govt_id_type")
    @Expose
    private String govt_id_type;
    public String getGovt_id_type() {
        return govt_id_type;
    }

    public void setGovt_id_type(String govt_id_type) {
        this.govt_id_type = govt_id_type;
    }
    @SerializedName("is_kyc_verified")
    @Expose
    private String is_kyc_verified;

    public String getIs_kyc_verified() {
        return is_kyc_verified;
    }

    public void setIs_kyc_verified(String is_kyc_verified) {
        this.is_kyc_verified = is_kyc_verified;
    }
    @SerializedName("last_name")
    @Expose
    private String last_name;

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @SerializedName("mobile_number")
    @Expose
    private String mobile_number;
    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    @SerializedName("password")
    @Expose
    private String password;
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @SerializedName("request_time")
    @Expose
    private String request_time;
    public String getRequest_time() {
        return request_time;
    }

    public void setRequest_time(String request_time) {
        this.request_time = request_time;
    }

    @SerializedName("requestuid")
    @Expose
    private String requestuid;
    public String getRequestuid() {
        return requestuid;
    }

    public void setRequestuid(String requestuid) {
        this.requestuid = requestuid;
    }

    @SerializedName("user_name")
    @Expose
    private String user_name;
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


    }



