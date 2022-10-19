package controller;

import model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {
    @GetMapping("/pick")
    public String showPickForm(Model model){
        model.addAttribute("email",new Email());
        return "/EmailOption";
    }
    @PostMapping("/create")
    public ModelAndView save(@ModelAttribute Email email){
        ModelAndView modelAndView=new ModelAndView("/result","email",email);
            return modelAndView;
    }
}
