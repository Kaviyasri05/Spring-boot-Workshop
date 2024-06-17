package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Models.Resume;
public interface ResumeRepo extends JpaRepository<Resume, Long>{
    
}
