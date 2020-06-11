package com.zhaike.controller;

import com.zhaike.entity.Direction;
import com.zhaike.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DirectionController {

    @Autowired
    DirectionService directionService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/allDirections")
    @ResponseBody
    public List<Direction>  allDirections(){
        return directionService.allDirections();
    }
}
