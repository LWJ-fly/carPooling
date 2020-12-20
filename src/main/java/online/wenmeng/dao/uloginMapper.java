package online.wenmeng.dao;

import online.wenmeng.bean.ulogin;
import online.wenmeng.bean.uloginExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface uloginMapper {
    long countByExample(uloginExample example);

    int deleteByExample(uloginExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(ulogin record);

    int insertSelective(ulogin record);

    List<ulogin> selectByExample(uloginExample example);

    ulogin selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") ulogin record, @Param("example") uloginExample example);

    int updateByExample(@Param("record") ulogin record, @Param("example") uloginExample example);

    int updateByPrimaryKeySelective(ulogin record);

    int updateByPrimaryKey(ulogin record);
}