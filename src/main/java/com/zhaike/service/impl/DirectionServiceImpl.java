package com.zhaike.service.impl;

import com.zhaike.entity.Direction;
import com.zhaike.entity.DirectionExample;
import com.zhaike.mapping.DirectionMapper;
import com.zhaike.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DirectionServiceImpl implements DirectionService {
    @Autowired
    DirectionMapper directionMapper;

    @Override
    public List<Direction> allDirections() {
        return directionMapper.selectByExample(new DirectionExample());
    }
}
