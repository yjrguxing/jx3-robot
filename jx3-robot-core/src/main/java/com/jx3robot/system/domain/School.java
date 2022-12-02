package com.jx3robot.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.jx3robot.common.annotation.Excel;
import com.jx3robot.common.core.domain.BaseEntity;

/**
 * 门派对象 school
 * 
 * @author ruoyi
 * @date 2022-12-02
 */
public class School extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    @Excel(name = "主键ID")
    private Long id;

    /** 门派名称 */
    @Excel(name = "门派名称")
    private String schoolName;

    /** 是否已删除/弃用 */
    @Excel(name = "是否已删除/弃用")
    private Long deleteFlag;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdUser;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatedUser;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;

    /** 删除人 */
    @Excel(name = "删除人")
    private String deleteBy;

    /** 删除时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "删除时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deleteTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }
    public void setDeleteFlag(Long deleteFlag) 
    {
        this.deleteFlag = deleteFlag;
    }

    public Long getDeleteFlag() 
    {
        return deleteFlag;
    }
    public void setCreatedUser(String createdUser) 
    {
        this.createdUser = createdUser;
    }

    public String getCreatedUser() 
    {
        return createdUser;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setUpdatedUser(String updatedUser) 
    {
        this.updatedUser = updatedUser;
    }

    public String getUpdatedUser() 
    {
        return updatedUser;
    }
    public void setUpdatedTime(Date updatedTime) 
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime() 
    {
        return updatedTime;
    }
    public void setDeleteBy(String deleteBy) 
    {
        this.deleteBy = deleteBy;
    }

    public String getDeleteBy() 
    {
        return deleteBy;
    }
    public void setDeleteTime(Date deleteTime) 
    {
        this.deleteTime = deleteTime;
    }

    public Date getDeleteTime() 
    {
        return deleteTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("schoolName", getSchoolName())
            .append("deleteFlag", getDeleteFlag())
            .append("createdUser", getCreatedUser())
            .append("createdTime", getCreatedTime())
            .append("updatedUser", getUpdatedUser())
            .append("updatedTime", getUpdatedTime())
            .append("deleteBy", getDeleteBy())
            .append("deleteTime", getDeleteTime())
            .toString();
    }
}
