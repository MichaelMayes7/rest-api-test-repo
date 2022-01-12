package com.example.rest.api.demo.Controller;

import com.example.rest.api.demo.Model.Cat6;
import com.example.rest.api.demo.Service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @Autowired
    private CatService catService;

    @GetMapping("/api/v1/test")
    public Cat6 test() {
        return catService.save(new Cat6("test"));
    }
}
