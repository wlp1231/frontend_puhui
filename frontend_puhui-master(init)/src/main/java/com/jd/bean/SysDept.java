package com.jd.bean;



/**
 * 部门对象 sys_dept
 * 
 * @author qst
 * @date 2021-09-04
 */
public class SysDept {

    /** 部门id */
    private Long deptId;

    /** 父部门id */
//    @Excel(name = "父部门id")
    private Long parentId;

    /** 祖级列表 */
//    @Excel(name = "祖级列表")
    private String ancestors;

    /** 部门名称 */
//    @Excel(name = "部门名称")
    private String deptName;

    /** 显示顺序 */
//    @Excel(name = "显示顺序")
    private Integer orderNum;

    /** 负责人 */
//    @Excel(name = "负责人")
    private String leader;

    /** 联系电话 */
//    @Excel(name = "联系电话")
    private String phone;

    /** 邮箱 */
//    @Excel(name = "邮箱")
    private String email;

    /** 部门状态（0正常 1停用） */
//    @Excel(name = "部门状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setAncestors(String ancestors) 
    {
        this.ancestors = ancestors;
    }

    public String getAncestors() 
    {
        return ancestors;
    }
    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }
    public void setOrderNum(Integer orderNum) 
    {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum() 
    {
        return orderNum;
    }
    public void setLeader(String leader) 
    {
        this.leader = leader;
    }

    public String getLeader() 
    {
        return leader;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
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


}
