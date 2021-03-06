package com.bt.om.entity;

import java.util.Date;

public class Invitation {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invitation.id
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invitation.inviter_mobile
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	private String inviterMobile;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invitation.be_inviter_mobile
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	private String beInviterMobile;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invitation.status
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invitation.reward
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	private Integer reward;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invitation.create_time
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column invitation.update_time
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	private Date updateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invitation.id
	 * @return  the value of invitation.id
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invitation.id
	 * @param id  the value for invitation.id
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invitation.inviter_mobile
	 * @return  the value of invitation.inviter_mobile
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public String getInviterMobile() {
		return inviterMobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invitation.inviter_mobile
	 * @param inviterMobile  the value for invitation.inviter_mobile
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public void setInviterMobile(String inviterMobile) {
		this.inviterMobile = inviterMobile == null ? null : inviterMobile.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invitation.be_inviter_mobile
	 * @return  the value of invitation.be_inviter_mobile
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public String getBeInviterMobile() {
		return beInviterMobile;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invitation.be_inviter_mobile
	 * @param beInviterMobile  the value for invitation.be_inviter_mobile
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public void setBeInviterMobile(String beInviterMobile) {
		this.beInviterMobile = beInviterMobile == null ? null : beInviterMobile.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invitation.status
	 * @return  the value of invitation.status
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invitation.status
	 * @param status  the value for invitation.status
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invitation.reward
	 * @return  the value of invitation.reward
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public Integer getReward() {
		return reward;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invitation.reward
	 * @param reward  the value for invitation.reward
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public void setReward(Integer reward) {
		this.reward = reward;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invitation.create_time
	 * @return  the value of invitation.create_time
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invitation.create_time
	 * @param createTime  the value for invitation.create_time
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column invitation.update_time
	 * @return  the value of invitation.update_time
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column invitation.update_time
	 * @param updateTime  the value for invitation.update_time
	 * @mbg.generated  Sat Apr 28 17:54:51 CST 2018
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}