package com.bt.om.entity;

import java.util.Date;

public class SysRole extends ID{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.id
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.platform
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private Integer platform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.role_name
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.desc
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.update_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.id
     *
     * @return the value of sys_role.id
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.id
     *
     * @param id the value for sys_role.id
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.platform
     *
     * @return the value of sys_role.platform
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.platform
     *
     * @param platform the value for sys_role.platform
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.role_name
     *
     * @return the value of sys_role.role_name
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.role_name
     *
     * @param roleName the value for sys_role.role_name
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.desc
     *
     * @return the value of sys_role.desc
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.desc
     *
     * @param desc the value for sys_role.desc
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_time
     *
     * @return the value of sys_role.create_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_time
     *
     * @param createTime the value for sys_role.create_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.update_time
     *
     * @return the value of sys_role.update_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.update_time
     *
     * @param updateTime the value for sys_role.update_time
     *
     * @mbggenerated Tue Jan 16 19:05:23 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}