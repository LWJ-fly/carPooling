package online.wenmeng.dao;

import online.wenmeng.bean.c_user;
import online.wenmeng.bean.c_userExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface c_userMapper {
    long countByExample(c_userExample example);

    int deleteByExample(c_userExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(c_user record);

    int insertSelective(c_user record);

    List<c_user> selectByExample(c_userExample example);

    c_user selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") c_user record, @Param("example") c_userExample example);

    int updateByExample(@Param("record") c_user record, @Param("example") c_userExample example);

    int updateByPrimaryKeySelective(c_user record);

    int updateByPrimaryKey(c_user record);
}