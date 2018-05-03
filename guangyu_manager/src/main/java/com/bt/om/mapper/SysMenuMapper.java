package com.bt.om.mapper;

import com.bt.om.entity.SysMenu;
import com.bt.om.entity.vo.SysMenuVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    int insert(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    int insertSelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    SysMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    int updateByPrimaryKey(SysMenu record);

    List<SysMenuVo> findMenuListByUsername(@Param("username") String username);
}