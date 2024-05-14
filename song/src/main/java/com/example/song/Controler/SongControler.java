package com.example.song.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class SongControler {

    @GetMapping("/form")
    private String readForm(@ModelAttribute String user) {

        return "form";
    }

    // @PostMapping("/form")
    // private String confirm(@ModelAttribute User user) {
    //     return "confirm";
    // }
}
