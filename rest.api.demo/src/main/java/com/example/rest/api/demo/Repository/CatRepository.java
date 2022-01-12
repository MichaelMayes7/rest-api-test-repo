package com.example.rest.api.demo.Repository;

import com.example.rest.api.demo.Model.Cat6;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat6, Integer> {
}
