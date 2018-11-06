package com.springboot.taotao.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表(SysUserInfo)实体类
 *
 * @author makejava
 * @since 2018-11-04 21:40:48
 */
public class SysUserInfo implements Serializable {
    private static final long serialVersionUID = -72427699945681312L;
    /**
     * 自增主键
     */

    private Integer id;
    /**
     * 登录名
     */

    private String loginName;
    /**
     * 真实姓名
     */

    private String realName;
    /**
     * 手机号码
     */

    private String phone;
    /**
     * 性别
     */

    private String sex;
    /**
     * 所属部门ID
     */

    private Integer depId;
    /**
     * 状态(1:正常,0:删除)
     */

    private String userStatus;
    /**
     * 是否启用(1:是,0:否)
     */

    private String isStart;
    /**
     * 创建时间
     */

    private Date creatTime;
    /**
     * 更新时间
     */

    private Date updateTime;
    /**
     * 密码
     */

    private String loginPassword;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getIsStart() {
        return isStart;
    }

    public void setIsStart(String isStart) {
        this.isStart = isStart;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

}