/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author quyen
 */
public class Login extends ActionSupport {
    public String username;
	public String password;
	public  Login(){
            username=null;
            password=null;
        }
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword(){
		return password;
    
        }
        public void setPassword(String password) {
		this.password = password;
	}
        
        public String execute() {
		if(this.username.equals("admin") && this.password.equals("123456")) {
                    System.out.println(this.username);
			return "success";
		} else {
			return "error";
		}
	}
}
