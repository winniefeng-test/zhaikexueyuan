package com.zhaike.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@Controller
public class EchartsController {


    @RequestMapping(value="/pie",method=RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> getPieData() {
        List<Map<String, Object>> data = new ArrayList<>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "男");
        map.put("value", "20");
        data.add(map);
        map = new HashMap<String, Object>();
        map.put("name", "女");
        map.put("value", "30");
        data.add(map);
        return data;
    }

    @RequestMapping(value="/bar",method=RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> getBarData() {
        List<Map<String, Object>> data = new ArrayList<>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "三个月前");
        map.put("value", "200");
        data.add(map);
        map = new HashMap<String, Object>();
        map.put("name", "两个月前");
        map.put("value", "500");
        data.add(map);
        map = new HashMap<String, Object>();
        map.put("name", "一个月前");
        map.put("value", "700");
        data.add(map);
        map = new HashMap<String, Object>();
        map.put("name", "预测");
        map.put("value", "900");
        data.add(map);
        return data;
    }

    @RequestMapping(value="/map",method=RequestMethod.POST)
    @ResponseBody
    public List<Map<String, Object>> getMapData() {
        List<Map<String, Object>> data = new ArrayList<>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "黑龙江");
        map.put("value", "200");
        data.add(map);
        map = new HashMap<String, Object>();
        map.put("name", "北京");
        map.put("value", "500");
        data.add(map);
        map = new HashMap<String, Object>();
        map.put("name", "天津");
        map.put("value", "700");
        data.add(map);
        map = new HashMap<String, Object>();
        map.put("name", "上海");
        map.put("value", "900");
        data.add(map);
        return data;
    }
}
