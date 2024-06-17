package com.example.demo.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Resume;
import com.example.demo.Services.ResumeService;

@RestController("/")
public class ResumeController {
  @Autowired
  private ResumeService service;



  @GetMapping("/resumes")
  public List<Resume> GetResumes(){
    return service.getResumes();
  }
  @PostMapping("/resume/add")
  public Resume AddResume(@RequestBody Resume resume){
    return service.addResume(resume);
  }
  public 
}
