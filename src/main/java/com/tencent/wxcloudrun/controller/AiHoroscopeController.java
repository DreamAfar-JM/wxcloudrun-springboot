package com.tencent.wxcloudrun.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.AiHoroscopeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.List;

/**
 * counter控制器
 */
@RestController

public class AiHoroscopeController {

  final Logger logger;

  public AiHoroscopeController() {
    this.logger = LoggerFactory.getLogger(AiHoroscopeController.class);
  }


  /**
   * 更新计数，自增或者清零
   * @param request {@link CounterRequest}
   * @return API response json
   */
  @PostMapping(value = "/horoscope/query")
  ApiResponse create(@RequestBody AiHoroscopeRequest request) {
    logger.info("/horoscope/query post request, action: {}", request.getContent());
    return ApiResponse.ok("收到了：" + request.getContent());
  }
  
}