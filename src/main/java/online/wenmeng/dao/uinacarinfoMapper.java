package online.wenmeng.dao;

import online.wenmeng.bean.uinacarinfo;
import online.wenmeng.bean.uinacarinfoExample;
import online.wenmeng.bean.uinacarinfoKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface uinacarinfoMapper {
    long countByExample(uinacarinfoExample example);

    int deleteByExample(uinacarinfoExample example);

    int deleteByPrimaryKey(uinacarinfoKey key);

    int insert(uinacarinfo record);

    int insertSelective(uinacarinfo record);

    List<uinacarinfo> selectByExample(uinacarinfoExample example);

    uinacarinfo selectByPrimaryKey(uinacarinfoKey key);

    int updateByExampleSelective(@Param("record") uinacarinfo record, @Param("example") uinacarinfoExample example);

    int updateByExample(@Param("record") uinacarinfo record, @Param("example") uinacarinfoExample example);

    int updateByPrimaryKeySelective(uinacarinfo record);

    int updateByPrimaryKey(uinacarinfo record);
}