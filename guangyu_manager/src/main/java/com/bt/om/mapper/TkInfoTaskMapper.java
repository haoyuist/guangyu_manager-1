package com.bt.om.mapper;

import com.bt.om.entity.TkInfoTask;

public interface TkInfoTaskMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tk_info_task
	 * @mbg.generated  Sun Apr 22 13:08:47 CST 2018
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tk_info_task
	 * @mbg.generated  Sun Apr 22 13:08:47 CST 2018
	 */
	int insert(TkInfoTask record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tk_info_task
	 * @mbg.generated  Sun Apr 22 13:08:47 CST 2018
	 */
	int insertSelective(TkInfoTask record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tk_info_task
	 * @mbg.generated  Sun Apr 22 13:08:47 CST 2018
	 */
	TkInfoTask selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tk_info_task
	 * @mbg.generated  Sun Apr 22 13:08:47 CST 2018
	 */
	int updateByPrimaryKeySelective(TkInfoTask record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tk_info_task
	 * @mbg.generated  Sun Apr 22 13:08:47 CST 2018
	 */
	int updateByPrimaryKey(TkInfoTask record);

	TkInfoTask selectBySign(String sign);
}