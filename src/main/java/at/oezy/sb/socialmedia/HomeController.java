package at.oezy.sb.socialmedia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HomeController
 */
@RestController
public class HomeController {

    @GetMapping(path = "/greet")
    public String greet(
        @RequestParam(required=false, defaultValue = "") String name
    ) {
        return name.isEmpty() ? "Hey!" : "Hey, " + name;
    }

    @GetMapping(path = "/helloWorld")
    public String yetAnotherGreeting() {
        return "Hello World!";
    }
}