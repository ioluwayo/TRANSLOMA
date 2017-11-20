package com.ioluwayo.translator.controllers;

import com.ioluwayo.translator.models.Translation;
import com.ioluwayo.translator.models.Translator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TranslatorController {

    @RequestMapping(method = RequestMethod.GET,path = "/translate")
    public Translation translate(@RequestParam(value = "sequence")String sequence){
        Translator translator = new Translator();
        Translation translation = translator.translate(sequence);
        return translation;
    }
}
