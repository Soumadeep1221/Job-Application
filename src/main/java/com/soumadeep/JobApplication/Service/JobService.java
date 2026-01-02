package com.soumadeep.JobApplication.Service;

import com.soumadeep.JobApplication.Model.JobPost;
import com.soumadeep.JobApplication.Repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost) // This type of object is called DTO // Doubt
    {
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs()
    {
        return repo.getAllJobs();
    }
}
