package org.example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="PasswordGeneartor")
public class PasswordGeneartor {

@WebMethod
    public String run(String nom, String prenom){
        return nom+prenom;
    }
}
