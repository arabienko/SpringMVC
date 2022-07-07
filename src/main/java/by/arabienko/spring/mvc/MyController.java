package by.arabienko.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showMyFirstView() {
        System.out.println("method run");
        return "firstView";
    }
}
