package com.fufang.bi.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("test")
public class TestController {

	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	
  @ResponseBody 
  @RequestMapping(value = "/jsonTest2/{data}", method = RequestMethod.GET)
  public ModelMap jsonTest2( String data ) {
      logger.info("Name：" +data);
      logger.info("Phone：" );
      ModelMap map = new ModelMap();
      map.addAttribute("result", "ok");
      return map;
  }
}
