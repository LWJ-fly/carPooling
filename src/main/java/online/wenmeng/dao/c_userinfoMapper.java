package online.wenmeng.dao;

import online.wenmeng.bean.c_userinfo;
import online.wenmeng.bean.c_userinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface c_userinfoMapper {
    long countByExample(c_userinfoExample example);

    int deleteByExample(c_userinfoExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(c_userinfo record);

    int insertSelective(c_userinfo record);

    List<c_userinfo> selectByExample(c_userinfoExample example);

    c_userinfo selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") c_userinfo record, @Param("example") c_userinfoExample example);

    int updateByExample(@Param("record") c_userinfo record, @Param("example") c_userinfoExample example);

    int updateByPrimaryKeySelective(c_userinfo record);

    int updateByPrimaryKey(c_userinfo record);
}