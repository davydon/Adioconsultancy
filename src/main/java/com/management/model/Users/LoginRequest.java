package com.management.model.Users;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Lukman.Arogundade on 10/31/2016.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginRequest {

    private String username;
    private String password;

    private String hospitalId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }
}
