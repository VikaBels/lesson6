package com.example.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.textservice.TextInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText loginText;
    private EditText passwordText;

    private Button loginButton;
    private Button registerButton;

    private String login;
    private String password;

    public void setLoginText(EditText loginText){
        this.loginText=loginText;
    }
    public EditText getLoginText(){
        return loginText;
    }

    public void setPasswordText(EditText passwordText){
        this.passwordText=passwordText;
    }
    public EditText getPasswordText(){
        return passwordText;
    }

    public void setLoginButton(Button loginButton){
        this.loginButton=loginButton;
    }
    public Button getLoginButton(){
        return loginButton;
    }

    public void setRegisterButton(Button registerButton){
        this.registerButton=registerButton;
    }
    public Button getRegisterButton(){
        return registerButton;
    }


    public void setLogin(String login){
        this.login=login;
    }
    public String getLogin(){
        return login;
    }

    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setLoginText(findViewById(R.id.textEditLogin));
        setPasswordText(findViewById(R.id.textEditPassword));

        setLogin("vika");
        setPassword("12345v");

        setLoginButton(findViewById(R.id.buttonLogin));
        setRegisterButton(findViewById(R.id.buttonRegister));

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickOnLogReg();
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickOnLogReg();
            }
        });
    }

    public void clickOnLogReg(){
        if(TextUtils.isEmpty(getLoginText().getText().toString())||TextUtils.isEmpty(getPasswordText().getText().toString())){
            loginText.setError("Incorrect input");
            passwordText.setError("Incorrect input");
        }else if(getLoginText().getText().toString().equals(getLogin()) && getPasswordText().getText().toString().equals(getPassword())){
            Toast toast =Toast.makeText(getApplicationContext(),"Hi",Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            Toast toast =Toast.makeText(getApplicationContext(),"Incorrect input",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}