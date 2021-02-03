package dev.masuareb.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FragmentsController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/fragments")
    public String getHome() {
        return "fragments";
    }

    @GetMapping("/markup")
    public String markupPage() {
        return "markup";
    }

    @GetMapping("/params")
    public String paramsPage() {
        return "params";
    }

}
