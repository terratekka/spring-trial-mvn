package com.example.springtrial;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class InfoController {

    @GetMapping("/")
    public String info() {
        return "Here is Spring Trial: " + new Date().toString();
    }

}
