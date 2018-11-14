package com.chendongdong.job.controller;

import com.chendongdong.job.job.jobService;
import com.chendongdong.job.jobDao.offerJob;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class jobController {

    @Autowired
    private jobService jobService;

    @Autowired
    private offerJob offer;

    /**
     * 创建任务
     * @param jobClassName
     * @param jobGroupName
     * @param cronExpression
     * @throws Exception
     */
    @PostMapping(value = "/addjob")
    public void addjob(@RequestParam(value = "jobClassName") String jobClassName, @RequestParam(value = "jobGroupName") String jobGroupName, @RequestParam(value = "cronExpression") String cronExpression) throws Exception {
        jobService.addJob(jobClassName, jobGroupName, cronExpression);
    }

    /**
     * 暂停任务
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    @PostMapping(value = "/pausejob")
    public void pausejob(@RequestParam(value = "jobClassName") String jobClassName, @RequestParam(value = "jobGroupName") String jobGroupName) throws Exception {
        jobService.jobPause(jobClassName, jobGroupName);
    }

    /**
     * 继续任务
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    @PostMapping(value = "/resumejob")
    public void resumejob(@RequestParam(value = "jobClassName") String jobClassName, @RequestParam(value = "jobGroupName") String jobGroupName) throws Exception {
        jobService.jobresume(jobClassName, jobGroupName);
    }

    /**
     * 重启任务
     * @param jobClassName
     * @param jobGroupName
     * @param cronExpression
     * @throws Exception
     */
    @PostMapping(value = "/reschedulejob")
    public void rescheduleJob(@RequestParam(value = "jobClassName") String jobClassName, @RequestParam(value = "jobGroupName") String jobGroupName, @RequestParam(value = "cronExpression") String cronExpression) throws Exception {
        jobService.jobreschedule(jobClassName, jobGroupName, cronExpression);
    }

    /**
     * 删除任务
     * @param jobClassName
     * @param jobGroupName
     * @throws Exception
     */
    @PostMapping(value = "/deletejob")
    public void deletejob(@RequestParam(value = "jobClassName") String jobClassName, @RequestParam(value = "jobGroupName") String jobGroupName) throws Exception {
        jobService.jobdelete(jobClassName, jobGroupName);
    }

    @PostMapping(value = "/queryjob")
    public Map<String, Object> queryjob() {
        List<Map<String, Object>> userAll = offer.getUserAll();
        return null;
    }


}
