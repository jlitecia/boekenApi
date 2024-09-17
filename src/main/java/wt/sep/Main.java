package wt.sep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public String greet() {
        return "Hello World";
    }

    @GetMapping("/getUser")
        public User getUser(){
            User user = new User( 1,  "joey");
            return user;
        }
    @GetMapping("/name")
    public String getName(){
        User user = new User(2, "Nik");
                return user.getName();
    }
    }

