package com.soumadeep.Job.Application.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor // Doubt
@AllArgsConstructor
@Component
public class JobPost {
    private int postId;
    private String PostProfile;
    private String PostDesc;
    private int ReqExperience;
    private List<String> PostTechStack;
}
