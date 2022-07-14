package by.arabienko.spring.mvc;

import by.arabienko.spring.mvc.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/")
public class ControllerModelEmployee {

    @RequestMapping("/askModel")
    public String showFirstViewDetail() {
        return "askDetail";
    }

    @RequestMapping("/askModelEmployee")
    public String askModelEmployeeDetail(Model model) {
        Employee employee = new Employee("Name", "Surname", 500, "IT");
        model.addAttribute("employee",employee);
        return "ask-model-employee-detail";
    }

    @RequestMapping("/showModelEmployee")
    public String showModelEmployeeDetail(@ModelAttribute("employee") Employee employee) {

        return "show-model-employee-detail";
    }
}
