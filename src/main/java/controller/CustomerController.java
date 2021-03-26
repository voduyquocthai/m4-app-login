package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;
import service.CustomerServiceImpl;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();
    @GetMapping("/customer")
    public ModelAndView index() {
        return new ModelAndView("/index","customers",customerService.findAll());
    }
}
