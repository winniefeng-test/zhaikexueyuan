package com.zhaike.mapping;

import com.zhaike.entity.Lecturer;
import com.zhaike.entity.LecturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LecturerMapper {
    long countByExample(LecturerExample example);

    int deleteByExample(LecturerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lecturer record);

    int insertSelective(Lecturer record);

    List<Lecturer> selectByExample(LecturerExample example);

    Lecturer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lecturer record, @Param("example") LecturerExample example);

    int updateByExample(@Param("record") Lecturer record, @Param("example") LecturerExample example);

    int updateByPrimaryKeySelective(Lecturer record);

    int updateByPrimaryKey(Lecturer record);
}