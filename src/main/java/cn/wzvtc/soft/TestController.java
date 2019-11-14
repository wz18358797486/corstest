package cn.wzvtc.soft;

import org.omg.CORBA.ORB;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController("/" )
public class TestController {


    @RequestMapping(value="/data.json")
    public Map<String,String> bookById(){
        Map<String,String> resultMap=new HashMap<>();
        resultMap.put("myname","苏圣扬");
        resultMap.put("mynumber","28002090131");
        return resultMap;
    }
    @RequestMapping(value="/login")
    public Map<String,String> login(@RequestBody Map<String,String> map){
        String password=map.get("password");
        String number=map.get("number");
        Map<String,String> resultMap=new HashMap<>();
        if("28002090131".equals(number) && "28002090131".equals(password)){
            resultMap.put("result","success");
        }
        return resultMap;
    }
}
