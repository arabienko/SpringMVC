package by.arabienko.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/employees") -URL Controller- URL for all RequestMapping Methods
public class MyController {

    @RequestMapping("/")
    public String showMyFirstView() {
        System.out.println("method run");
        return "firstView";
    }

    @RequestMapping("/askDetails")
    public String askDetailsEmployees(){
        return "ask-details-employees";
    }

//    @RequestMapping("showDetails")
//    public String showDetailsYEmployees(){
//        return "show-details-employees";
//    }

//    @RequestMapping("/showDetails")
//    public String showDetailsYEmployees(HttpServletRequest request, Model model){
//
//        String empName = request.getParameter("employeeName");
//        empName = "Ms. "+empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", " - it's the surname...");
//        return "show-details-employees";
//    }

    @RequestMapping("/showDetails")
    public String showDetailsYEmployees( @RequestParam("employeeName") String empName, Model model){
        empName = "Ms. "+empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " - it's the surname...");
        return "show-details-employees";
    }
}
