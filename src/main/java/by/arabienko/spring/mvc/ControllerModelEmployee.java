package by.arabienko.spring.mvc;

import by.arabienko.spring.mvc.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

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
        model.addAttribute("employee", employee);
        return "ask-model-employee-detail";
    }

    @RequestMapping("/showModelEmployee")
    public String showModelEmployeeDetail(@Valid @ModelAttribute("employee") Employee employee,
                                          BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-model-employee-detail";
        }
        return "show-model-employee-detail";
    }
}
