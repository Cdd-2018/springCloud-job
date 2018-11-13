package com.chendongdong.job.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class jobOne implements job {

    public jobOne(){

    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("======================定时任务======================");
    }

}
