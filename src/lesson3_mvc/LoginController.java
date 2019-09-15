/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3_mvc;

/**
 *
 * @author mam
 */
public class LoginController {
    LoginModel user;

    public LoginController() {
        // select Login View
        new LoginView();
    }

    public LoginController(LoginModel user) {
        this.user = user;
        // select Details View 
        new LoginView(user);
    }
    
    public LoginController(String strUser, String strPass){
        if(strUser.equals("admin") && strPass.equals("abc123"))
        {
            this.user = new LoginModel(strUser, strPass);
            new LoginView(user);
        }
        else
            new LoginView();
    }
    
}
