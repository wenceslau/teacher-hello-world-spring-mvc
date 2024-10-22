package br.com.wenceslau;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(@RequestParam String nome, Model model) {

        String msg = String.format("Hi %s. Spring MVC Com Thymeleaf Get Request received: %s", nome, LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        //Here I am adding the message to the model.
        //The model is a map that will be sent to the view
        model.addAttribute("mensagem", msg);

        //Here I am returning the name of the view
        return "hello";
    }
}
