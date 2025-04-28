package com.example.hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.hms.model.User;
import com.example.hms.repository.UserRepository;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String loginPage() {
        return "index"; // index.html
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {

        User user = userRepository.findByUsernameAndPassword(username, password);
        
        if (user != null) {
            return "redirect:/dashboard"; // Redirect to a dashboard page
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "index";
        }
    }

    @PostMapping("/addUser")
    public String addUser(User user) {
    userRepository.save(user);
    return "redirect:/settings"; // or show a success page
}



    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard"; // Create dashboard.html in templates
    }

    

    @GetMapping("/adddoctor")
    public String adddoctor() {
        return "adddoctor"; 
    }

    @GetMapping("/appointment")
    public String appointment() {
        return "appointment"; 
    }

    @GetMapping("/docscedule")
    public String docscedule() {
        return "docscedule"; 
    }

    @GetMapping("/alldoctor")
    public String alldoctor() {
        return "alldoctor"; 
    }

    @GetMapping("/patientlist")
    public String patientlist() {
        return "patientlist"; 
    }

    @GetMapping("/addpatient")
    public String addpatient() {
        return "addpatient"; 
    }

    @GetMapping("/patientpayment")
    public String patientpayment() {
        return "patientpayment"; 
    }

    @GetMapping("/roombook")
    public String roombook() {
        return "roombook"; 
    }

    @GetMapping("/report")
    public String report() {
        return "report"; 
    }

    @GetMapping("/transactions")
    public String transactions() {
        return "transactions"; 
    }

    @GetMapping("/profile")
    public String profile() {
        return "profile"; 
    }

    @GetMapping("/settings")
    public String settings() {
        return "settings"; 
    }

    @GetMapping("/index")
    public String index() {
        return "index"; 
    }



}
