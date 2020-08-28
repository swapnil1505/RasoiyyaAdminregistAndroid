package com.example.myadminrassoiya.remote;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserService {
  /*  URL :- http://localhost:8081/admin/v1/adminRegistration*/
  @POST("/admin/v1/adminRegistration")
    @FormUrlEncoded
    Call<User>adminRegistration(@Body User user);
}
