package com.jx3robot.system.service.impl;

import java.util.Date;
import java.util.List;

import com.jx3robot.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jx3robot.system.mapper.SchoolMapper;
import com.jx3robot.system.domain.School;
import com.jx3robot.system.service.ISchoolService;

/**
 * 门派Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-12-02
 */
@Service
public class SchoolServiceImpl implements ISchoolService 
{
    @Autowired
    private SchoolMapper schoolMapper;

    /**
     * 查询门派
     * 
     * @param id 门派主键
     * @return 门派
     */
    @Override
    public School selectSchoolById(Long id)
    {
        return schoolMapper.selectSchoolById(id);
    }

    /**
     * 查询门派列表
     * 
     * @param school 门派
     * @return 门派
     */
    @Override
    public List<School> selectSchoolList(School school)
    {
        return schoolMapper.selectSchoolList(school);
    }

    /**
     * 新增门派
     * 
     * @param school 门派
     * @return 结果
     */
    @Override
    public int insertSchool(School school)
    {
        school.setCreatedUser(SecurityUtils.getUserId().toString());
        school.setCreatedTime(new Date());
        return schoolMapper.insertSchool(school);
    }

    /**
     * 修改门派
     * 
     * @param school 门派
     * @return 结果
     */
    @Override
    public int updateSchool(School school)
    {
        school.setUpdatedUser(SecurityUtils.getUserId().toString());
        school.setUpdatedTime(new Date());
        return schoolMapper.updateSchool(school);
    }

    /**
     * 批量删除门派
     * 
     * @param ids 需要删除的门派主键
     * @return 结果
     */
    @Override
    public int deleteSchoolByIds(Long[] ids)
    {
        return schoolMapper.deleteSchoolByIds(ids);
    }

    /**
     * 删除门派信息
     * 
     * @param id 门派主键
     * @return 结果
     */
    @Override
    public int deleteSchoolById(Long id)
    {
        return schoolMapper.deleteSchoolById(id);
    }
}
