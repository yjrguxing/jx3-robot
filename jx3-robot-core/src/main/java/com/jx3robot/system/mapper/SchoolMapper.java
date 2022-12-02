package com.jx3robot.system.mapper;

import java.util.List;
import com.jx3robot.system.domain.School;

/**
 * 门派Mapper接口
 * 
 * @author ruoyi
 * @date 2022-12-02
 */
public interface SchoolMapper 
{
    /**
     * 查询门派
     * 
     * @param id 门派主键
     * @return 门派
     */
    public School selectSchoolById(Long id);

    /**
     * 查询门派列表
     * 
     * @param school 门派
     * @return 门派集合
     */
    public List<School> selectSchoolList(School school);

    /**
     * 新增门派
     * 
     * @param school 门派
     * @return 结果
     */
    public int insertSchool(School school);

    /**
     * 修改门派
     * 
     * @param school 门派
     * @return 结果
     */
    public int updateSchool(School school);

    /**
     * 删除门派
     * 
     * @param id 门派主键
     * @return 结果
     */
    public int deleteSchoolById(Long id);

    /**
     * 批量删除门派
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSchoolByIds(Long[] ids);
}
