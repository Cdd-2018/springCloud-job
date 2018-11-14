package com.chendongdong.job.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class jobTwo implements job {

    public jobTwo(){

    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("======================定时ererer任务======================");
    }

}
