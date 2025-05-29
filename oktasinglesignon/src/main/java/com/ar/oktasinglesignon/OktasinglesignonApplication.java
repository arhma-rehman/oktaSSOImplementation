//package com.ar.oktasinglesignon;
//
//import java.security.Principal;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//@SpringBootApplication
//@RestController
//@EnableWebSecurity
//
//public class OktasinglesignonApplication {
//	
//	
//	    @GetMapping("/")
//	    public ModelAndView welcomeUser(Model model, Principal principal) {
//	       
//	        return new ModelAndView("home");  // home.jsp inside WEB-INF/views/
//	    }
//	
//
//	public static void main(String[] args) {
//		SpringApplication.run(OktasinglesignonApplication.class, args);
//	}
//
//}
package com.ar.oktasinglesignon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OktasinglesignonApplication {
    public static void main(String[] args) {
        SpringApplication.run(OktasinglesignonApplication.class, args);
    }
}

