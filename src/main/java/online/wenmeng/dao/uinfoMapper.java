package online.wenmeng.dao;

import online.wenmeng.bean.uinfo;
import online.wenmeng.bean.uinfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface uinfoMapper {
    long countByExample(uinfoExample example);

    int deleteByExample(uinfoExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(uinfo record);

    int insertSelective(uinfo record);

    List<uinfo> selectByExample(uinfoExample example);

    uinfo selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") uinfo record, @Param("example") uinfoExample example);

    int updateByExample(@Param("record") uinfo record, @Param("example") uinfoExample example);

    int updateByPrimaryKeySelective(uinfo record);

    int updateByPrimaryKey(uinfo record);
}