package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Resume;
import com.example.demo.Repo.ResumeRepo;

@Service
public class ResumeService {
@Autowired //Di = directory inject

    private ResumeRepo resume;
private Object other;

    public List<Resume> getResumes(){
        return resume.findAll();//finding all the values in a resume
    }
    public Resume addResume(Resume data){
        return resume.save(data);//saving the resume data
    }
    public Resume editResume(Long uid, Resume newdata){

        Resume finder = resume.findById(uid).orElse((Resume) (other=null));
        if( finder != null){
            //finder.set
            return finder;
        }
        return null;
    }
    public String deleteResume(Long uid){
        resume.deleteById(uid);
        return uid+" User Deleted !"; //delete by id
    }
    
}
