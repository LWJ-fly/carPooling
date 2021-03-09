package online.wenmeng.dao;

import online.wenmeng.bean.Carpoolinginfo;
import online.wenmeng.bean.CarpoolinginfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarpoolinginfoMapper {
    long countByExample(CarpoolinginfoExample example);

    int deleteByExample(CarpoolinginfoExample example);

    int deleteByPrimaryKey(Integer carid);

    int insert(Carpoolinginfo record);

    int insertSelective(Carpoolinginfo record);

    List<Carpoolinginfo> selectByExample(CarpoolinginfoExample example);

    Carpoolinginfo selectByPrimaryKey(Integer carid);

    int updateByExampleSelective(@Param("record") Carpoolinginfo record, @Param("example") CarpoolinginfoExample example);

    int updateByExample(@Param("record") Carpoolinginfo record, @Param("example") CarpoolinginfoExample example);

    int updateByPrimaryKeySelective(Carpoolinginfo record);

    int updateByPrimaryKey(Carpoolinginfo record);
}