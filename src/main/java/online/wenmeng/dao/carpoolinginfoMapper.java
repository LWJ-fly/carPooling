package online.wenmeng.dao;

import online.wenmeng.bean.carpoolinginfo;
import online.wenmeng.bean.carpoolinginfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface carpoolinginfoMapper {
    long countByExample(carpoolinginfoExample example);

    int deleteByExample(carpoolinginfoExample example);

    int deleteByPrimaryKey(Integer carid);

    int insert(carpoolinginfo record);

    int insertSelective(carpoolinginfo record);

    List<carpoolinginfo> selectByExample(carpoolinginfoExample example);

    carpoolinginfo selectByPrimaryKey(Integer carid);

    int updateByExampleSelective(@Param("record") carpoolinginfo record, @Param("example") carpoolinginfoExample example);

    int updateByExample(@Param("record") carpoolinginfo record, @Param("example") carpoolinginfoExample example);

    int updateByPrimaryKeySelective(carpoolinginfo record);

    int updateByPrimaryKey(carpoolinginfo record);
}