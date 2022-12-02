package com.jx3robot.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jx3robot.common.annotation.Log;
import com.jx3robot.common.core.controller.BaseController;
import com.jx3robot.common.core.domain.AjaxResult;
import com.jx3robot.common.enums.BusinessType;
import com.jx3robot.system.domain.School;
import com.jx3robot.system.service.ISchoolService;
import com.jx3robot.common.utils.poi.ExcelUtil;
import com.jx3robot.common.core.page.TableDataInfo;

/**
 * 门派Controller
 * 
 * @author ruoyi
 * @date 2022-12-02
 */
@RestController
@RequestMapping("/system/school")
public class SchoolController extends BaseController
{
    @Autowired
    private ISchoolService schoolService;

    /**
     * 查询门派列表
     */
    @PreAuthorize("@ss.hasPermi('system:school:list')")
    @GetMapping("/list")
    public TableDataInfo list(School school)
    {
        startPage();
        List<School> list = schoolService.selectSchoolList(school);
        return getDataTable(list);
    }

    /**
     * 导出门派列表
     */
    @PreAuthorize("@ss.hasPermi('system:school:export')")
    @Log(title = "门派", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, School school)
    {
        List<School> list = schoolService.selectSchoolList(school);
        ExcelUtil<School> util = new ExcelUtil<School>(School.class);
        util.exportExcel(response, list, "门派数据");
    }

    /**
     * 获取门派详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:school:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(schoolService.selectSchoolById(id));
    }

    /**
     * 新增门派
     */
    @PreAuthorize("@ss.hasPermi('system:school:add')")
    @Log(title = "门派", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody School school)
    {
        return toAjax(schoolService.insertSchool(school));
    }

    /**
     * 修改门派
     */
    @PreAuthorize("@ss.hasPermi('system:school:edit')")
    @Log(title = "门派", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody School school)
    {
        return toAjax(schoolService.updateSchool(school));
    }

    /**
     * 删除门派
     */
    @PreAuthorize("@ss.hasPermi('system:school:remove')")
    @Log(title = "门派", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(schoolService.deleteSchoolByIds(ids));
    }
}
