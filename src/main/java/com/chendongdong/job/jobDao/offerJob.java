package com.chendongdong.job.jobDao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@FeignClient(value = "offer")
public interface offerJob {
    @PostMapping(value = "getUserAll")
    List<Map<String,Object>> getUserAll();
}
