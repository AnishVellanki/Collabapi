package com.ani.Colllabapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.CollabapiBackend.model.Jobs;




@RestController
public class JobController {

	
	@RequestMapping("/addJobs")
	 public List<Jobs> getAllJobs()
	    {
	 Jobs job1=new Jobs();
	 Jobs job2=new Jobs();
	    
    job1.setCompanyName("Microsoft");
    job1.setJobRole("Web Developer");
    job1.setJobQualifications("BTech");
    job1.setJobSalary("75000");
    job2.setCompanyName("Facebook");
    job2.setJobRole("Android Developer");
    job2.setJobQualifications("BTech/MS");
    job2.setJobSalary("85000");
	
    List<Jobs> jobList=new ArrayList<Jobs>();
    jobList.add(job1);
    jobList.add(job2);
    return jobList;
}
}
