package com.jd.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户信息对象 sys_user
 * 
 * @author qst
 * @date 2021-09-04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser
{

    /** 用户ID */
    private Long userId;

    /** 部门ID */
//    @Excel(name = "部门ID")
    private Long deptId;

    /** 用户账号 */
//    @Excel(name = "用户账号")
    private String userName;

    /** 用户昵称 */
//    @Excel(name = "用户昵称")
    private String nickName;

    /** 用户类型（00系统用户） */
//    @Excel(name = "用户类型", readConverterExp = "0=0系统用户")
    private String userType;

    /** 用户邮箱 */
//    @Excel(name = "用户邮箱")
    private String email;

    /** 手机号码 */
//    @Excel(name = "手机号码")
    private String phonenumber;

    /** 用户性别（0男 1女 2未知） */
//    @Excel(name = "用户性别", readConverterExp = "0=男,1=女,2=未知")
    private String sex;

    /** 头像地址 */
//    @Excel(name = "头像地址")
    private String avatar;

    /** 密码 */
//    @Excel(name = "密码")
    private String password;

    /** 帐号状态（0正常 1停用 2未激活） */
//    @Excel(name = "帐号状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 最后登录IP */
//    @Excel(name = "最后登录IP")
    private String loginIp;

    /** 最后登录时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
//    @Excel(name = "最后登录时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date loginDate;
//创建者
    private String createBy;
//创建时间
    private Date createTime;
//    修改人
    private String updateBy;
//    修改时间
    private String updateTime;
    //激活码
    private String remark;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setNickName(String nickName) 
    {
        this.nickName = nickName;
    }

    public String getNickName() 
    {
        return nickName;
    }
    public void setUserType(String userType) 
    {
        this.userType = userType;
    }

    public String getUserType() 
    {
        return userType;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setPhonenumber(String phonenumber) 
    {
        this.phonenumber = phonenumber;
    }

    public String getPhonenumber() 
    {
        return phonenumber;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setAvatar(String avatar) 
    {
        this.avatar = avatar;
    }

    public String getAvatar() 
    {
        return avatar;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setLoginIp(String loginIp) 
    {
        this.loginIp = loginIp;
    }

    public String getLoginIp() 
    {
        return loginIp;
    }
    public void setLoginDate(Date loginDate) 
    {
        this.loginDate = loginDate;
    }

    public Date getLoginDate() 
    {
        return loginDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }


    @Override
    public String toString() {
        return "SysUser{" +
                "userId=" + userId +
                ", deptId=" + deptId +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userType='" + userType + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", sex='" + sex + '\'' +
                ", avatar='" + avatar + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", loginIp='" + loginIp + '\'' +
                ", loginDate=" + loginDate +
                '}';
    }
}
