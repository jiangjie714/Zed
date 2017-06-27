package com.fufang.bi;

import io.swagger.annotations.ApiOperation;

import java.util.Map;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("demo")
public class DemoController {
	
//	@Autowired
//    private DemoService demoService;
	
	private Logger logger = LoggerFactory.getLogger(DemoController.class);
	// 从 application.properties 中读取配置，如取不到默认值为Hello Shanhy
    @Value("${application.hello:Hello Angel}")
    private String hello;
   
      
//       @RequestMapping("/Demo")
//       public String helloJsp(Map<String,Object> map){
//              System.out.println("HelloController.helloJsp().hello="+hello);
//              map.put("hello", hello);
//              return "Demo";
//       }
	
	
//	@RequestMapping("/getDemoJosn")
//	public HashMap getDemoJosn(){  
//		HashMap map = new HashMap();
//		ArrayList list = new ArrayList();
//		for(int i =0;i<10;i++){
//			User user = new User();
//			user.setName("张"+i);
//			user.setAge(23+i);
//			user.setAdd("74号汪曼春住处");
//			user.setPhone("135653232"+i);
//			list.add(user);
//		}
//		map.put("code", "100");
//		map.put("msg", "SUCCESS");
//		map.put("data", list);
//		
//	    return map;  
//	  }
	
//	@RequestMapping("/getUser")
//	public ArrayList<User> getUser(String name){
//		ArrayList <User> list =  new ArrayList<User>();
//		PageHelper.startPage(1,5);
//		//list =  demoService.likeName(name);
//		return list;
//	}
	
	/**
     * JSON请求一个对象<br/>
     * （Ajax Post Data：{"name":"名称","phone":"内容"}）
     *
     * @param version
     * @return
     */
    @ResponseBody 
    @RequestMapping(value = "/jsonTest2", method = RequestMethod.GET)
    public ModelMap jsonTest2( String data ) {
        logger.info("Name：" +data);
        logger.info("Phone：" );
        ModelMap map = new ModelMap();
        map.addAttribute("result", "ok");
        return map;
    }
    
    /**
     * 直接读取URL参数值<br/>
     * /demo/jsonTest6.do?name=Hello&content=World
     *
     * @param demoName
     * @param content
     * @return
     */
//    @ResponseBody
//    @RequestMapping(value = "/jsonTest6", method = RequestMethod.GET)
//    public ModelMap jsonTest6(@RequestParam("name") String demoName, @RequestParam String content) {
//        logger.info("demoName：" + demoName);
//        ModelMap map = new ModelMap();
//        map.addAttribute("name",demoName + "AAA");
//        map.addAttribute("content",content + "BBB");
//        map.addAttribute("date",new java.util.Date());
//        return map;
//    }
 
    /**
     * JSON请求一个对象，将RequestBody自动转换为JSONObject对象<br/>
     * （Ajax Post Data：{"name":"名称","content":"内容"}）
     *
     * 使用JSONObject请添加依赖
     *  <dependency>
     *      <groupId>net.sf.json-lib</groupId>
     *      <artifactId>json-lib</artifactId>
     *      <version>2.4</version>
     *      <!--指定jdk版本 -->
     *      <classifier>jdk15</classifier>
     *  </dependency>
     *
     * @param version
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/jsonTest5", method = RequestMethod.GET)
    @ApiOperation(value="测试接口", notes="测试接口详细描述")
    public ModelMap jsonTest5(@RequestBody JSONObject jsonObject) {
        String name = jsonObject.getString("name");
        logger.info("demoName：" + name);
        ModelMap map = new ModelMap();
        map.addAttribute("demoName",name);
        return map;
    }
 
    /**
     * 输入和输出为JSON格式的数据的方式 HttpEntity<?> ResponseEntity<?>
     *
     * @param u
     * @return
     */
//    @ResponseBody
//    @RequestMapping(value = "/jsonTest4", method = RequestMethod.POST)
//    public ResponseEntity<String> jsonTest4(HttpEntity<Message> user,
//            HttpServletRequest request, HttpSession session) {
//        //获取Headers方法
//        HttpHeaders headers = user.getHeaders();
// 
//        // 获取内容
//        String demoContent = user.getBody().getContent();
// 
//        // 这里直接new一个对象（HttpHeaders headers = new HttpHeaders();）
//        HttpHeaders responseHeaders = new HttpHeaders();
//        responseHeaders.add("MyHeaderName", "SHANHY");
// 
//        ResponseEntity<String> responseResult = new ResponseEntity<String>(
//                demoContent, responseHeaders, HttpStatus.OK);
//        return responseResult;
//    }
}
