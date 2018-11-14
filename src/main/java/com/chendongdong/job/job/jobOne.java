package com.chendongdong.job.job;

import com.chendongdong.job.jobDao.offerJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Map;


public class jobOne implements job,Serializable {

    @Autowired
    private offerJob offer;

    public jobOne(){}

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        List<Map<String, Object>> all = offer.getUserAll();
        System.out.print(all.toString());
    }

}
