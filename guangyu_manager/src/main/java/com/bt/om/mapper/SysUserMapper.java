package com.bt.om.mapper;

import com.bt.om.entity.SysUser;
import com.bt.om.entity.vo.SysUserVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

public interface SysUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jan 16 16:41:44 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jan 16 16:41:44 CST 2018
     */
    int insert(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jan 16 16:41:44 CST 2018
     */
    int insertSelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jan 16 16:41:44 CST 2018
     */
    SysUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jan 16 16:41:44 CST 2018
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Tue Jan 16 16:41:44 CST 2018
     */
    int updatPrimaryKey(SysUser record);



    SysUserVo findUserinfoById(@Param("id") Integer id);

    SysUserVo findByUsername(@Param("username") String username);

    int getPageCount(Map<String, Object> searchMap);

    List<SysUserVo> getPageData(Map<String, Object> searchMap, RowBounds rowBounds);

    List<SysUser> isExistsName(@Param("username") String username);
}