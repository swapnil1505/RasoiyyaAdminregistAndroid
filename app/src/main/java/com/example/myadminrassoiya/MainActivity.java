package com.example.myadminrassoiya;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myadminrassoiya.model.ResObj;
import com.example.myadminrassoiya.remote.Address1;
import com.example.myadminrassoiya.remote.ApiUtils;
import com.example.myadminrassoiya.remote.User;
import com.example.myadminrassoiya.remote.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    Context context;
    EditText editaddressline1;
    EditText editaddressline11;
    EditText editaddressline2;
    EditText editaddressline22;
    EditText editaddresslinetype;
    EditText editaddresslinetype1;
    EditText editcity;
    EditText editcity1;
    EditText distedit;
    EditText distedit1;
    EditText geoedit;
    EditText geoedit1;
    EditText pincodeedit;
    EditText pincodeedit1;
    EditText stateedit;
    EditText stateedit1;
    EditText iscurrentedit;
    EditText iscurrentedit1;
    EditText dobedittext;
    EditText emailidedittext;
    EditText firstnameedittext;
    EditText genderedittext;
    EditText govtidnoedittext;
    EditText govtidtype;
    EditText kycedittext;
    EditText lastnameedittext;
    EditText mobnoedittext;
    EditText passwordedittext;
    EditText usernameedittext;
    Button signup;
    UserService userService;
    List<Address1> list = new ArrayList<Address1>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);
        editaddressline1 = (EditText)findViewById(R.id.addressline1edittext);
        editaddressline11 = (EditText) findViewById(R.id.addresslineedittext1);
        editaddressline2 = (EditText)findViewById(R.id.addressline2edittext);
        editaddressline22 =(EditText)findViewById(R.id.addressline2editext1);
        editaddresslinetype = (EditText)findViewById(R.id.addresstypeedittext);
        editaddresslinetype1 = (EditText)findViewById(R.id.addresstypeedittext1);
        editcity = (EditText)findViewById(R.id.cityedittext);
        editcity1 = (EditText)findViewById(R.id.cityedittext1);
        distedit = (EditText)findViewById(R.id.distedittext);
        distedit1 = (EditText)findViewById(R.id.districtedittext1);
        geoedit = (EditText)findViewById(R.id.geoedittext);
        geoedit1 = (EditText)findViewById(R.id.geolocedittext1);
        pincodeedit = (EditText)findViewById(R.id.pincodeedittext);
        pincodeedit1 = (EditText)findViewById(R.id.pincodeedittext1);
        stateedit = (EditText)findViewById(R.id.stateedittext);
        stateedit1 = (EditText)findViewById(R.id.stateedittext1);
        iscurrentedit = (EditText)findViewById(R.id.iscurrentaddedittext);
        iscurrentedit1 = (EditText)findViewById(R.id.iscurrentadd1);
        dobedittext = (EditText)findViewById(R.id.editTextdateofbirth);
        emailidedittext = (EditText)findViewById(R.id.edittextemailid);
        firstnameedittext = (EditText)findViewById(R.id.firstnameedittext);
        genderedittext = (EditText)findViewById(R.id.edittextgender);
        govtidnoedittext = (EditText)findViewById(R.id.govidedittext);
         govtidtype= (EditText)findViewById(R.id.govtidtypededittext);
         kycedittext=(EditText)findViewById(R.id.kycverifyedittext);
         lastnameedittext=(EditText)findViewById(R.id.lastnamedittext);
         mobnoedittext = (EditText)findViewById(R.id.mobilenoedittext);
         passwordedittext=(EditText)findViewById(R.id.passwordedittext);
         usernameedittext=(EditText)findViewById(R.id.usernameedittext);

        signup = (Button)findViewById(R.id.btnsignup);
        userService = ApiUtils.getUserService();
        signup.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                dowork();
                User use = new User();
                use.setAddressList(list);
                use.setDate_of_birth(dobedittext.getText().toString());
                use.setEmail_id(emailidedittext.getText().toString());
                use.setFirst_name(firstnameedittext.getText().toString());
                use.setGender(genderedittext.getText().toString());
                use.setGovt_id_no(govtidnoedittext.getText().toString());
                use.setGovt_id_type(govtidtype.getText().toString());
                use.setIs_kyc_verified(kycedittext.getText().toString());
                use.setLast_name(lastnameedittext.getText().toString());
                use.setMobile_number( mobnoedittext.getText().toString());
                use.setPassword(passwordedittext.getText().toString());
                use.setRequest_time(requesttime());
                use.setRequestuid(requestid());
                use.setUser_name(usernameedittext.getText().toString());
                doSignup(use);

            }
        });










    }

    private String requestid() {
        Random rand =new Random();
        String m =String.valueOf(rand.nextInt(1000));
        return m;
    }


    private String requesttime() {
        String m = String.valueOf(java.time.LocalTime.now());
        return m;

    }

    private void doSignup(User use) {
        Call<ResObj> call = userService.adminRegistration( use);
        call.enqueue(new Callback<ResObj>() {
            @Override
            public void onResponse(Call<ResObj> call, Response<ResObj> response) {
                if(response.isSuccessful()){
                    ResObj resObj = response.body();
                    if(resObj.getStatus().equals("SUCCESS")){
                        //login start main activity
                        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                        intent.putExtra("username", resObj.getStatus_message());
                        startActivity(intent);

                    } else {
                        Toast.makeText(MainActivity.this, "The username or password is incorrect", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Error! Please try again!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResObj> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show() ;
            }


        });

    }

    private void dowork() {
        Address1 add = new Address1();
        Address1 add1 = new Address1();

        String editAddline1 = editaddressline1.getText().toString();
        String editAddline2 =  editaddressline2.getText().toString();
        String editAddtype = editaddresslinetype.getText().toString();
        String mycity = editcity.getText().toString();
        String mydistrict = distedit.getText().toString();
        String mygeoedit = geoedit.getText().toString();
        String mypincode =  pincodeedit.getText().toString();
        String mystate = stateedit.getText().toString();
        String ismycurrentadd = iscurrentedit.getText().toString();

        String editAddline11 =  editaddressline11.getText().toString();
        String editAddline22 =  editaddressline22.getText().toString();
        String editAddtype1 = editaddresslinetype1.getText().toString();
        String mycity1 = editcity1.getText().toString();
        String mydistrict1 = distedit1.getText().toString();
        String mygeoedit1 = geoedit1.getText().toString();
        String mypincode1 =  pincodeedit1.getText().toString();
        String mystate1 = stateedit1.getText().toString();
        String ismycurrentadd1 = iscurrentedit1.getText().toString();

        add.setAddress_line1(editAddline1);
        add1.setAddress_line1(editAddline11);
        add.setAddress_line2(editAddline2);
        add1.setAddress_line2(editAddline22);
        add.setAddress_type(editAddtype);
        add1.setAddress_type(editAddtype1);
        add1.setState(mystate1);
        add.setCity(mycity);
        add1.setCity(mycity1);
        add.setDistrict(mydistrict);
        add1.setDistrict(mydistrict1);
        add.setGeo_location(mygeoedit);
        add1.setGeo_location(mygeoedit1);
        add.setIs_current_address(ismycurrentadd);
        add1.setIs_current_address(ismycurrentadd1);
        add.setPin_code(mypincode);
        add.setPin_code(mypincode1);
        add.setState(mystate);
        list.add(add);
        list.add(add1);



    }
}