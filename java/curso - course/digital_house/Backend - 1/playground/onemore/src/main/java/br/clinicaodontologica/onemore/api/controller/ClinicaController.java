package br.clinicaodontologica.onemore.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClinicaController {

    @RequestMapping("/v1/clinicas")
    public @ResponseBody String testController(){
        return "Controller Ok";
    }
}
