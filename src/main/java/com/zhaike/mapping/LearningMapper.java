package com.zhaike.mapping;

import com.zhaike.entity.Learning;
import com.zhaike.entity.LearningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LearningMapper {
    long countByExample(LearningExample example);

    int deleteByExample(LearningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Learning record);

    int insertSelective(Learning record);

    List<Learning> selectByExample(LearningExample example);

    Learning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Learning record, @Param("example") LearningExample example);

    int updateByExample(@Param("record") Learning record, @Param("example") LearningExample example);

    int updateByPrimaryKeySelective(Learning record);

    int updateByPrimaryKey(Learning record);
}