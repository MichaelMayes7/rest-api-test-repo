package com.example.rest.api.demo.Service;

import com.example.rest.api.demo.Model.Cat6;
import com.example.rest.api.demo.Repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;

    public Cat6 save(Cat6 cat6) {
        return catRepository.save(cat6);
    }

}
