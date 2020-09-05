package com.example.myadminrassoiya.remote;

public class ApiUtils {
    public static final String BASE_URL = "http://localhost:8081/Rasoiyya/";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }
}
