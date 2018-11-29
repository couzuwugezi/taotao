package com.springboot.taotao.dao;

import com.springboot.taotao.entity.SysUserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * 用户信息表(SysUserInfo)表数据库访问层
 *
 * @author makejava
 * @since 2018-11-29 17:24:33
 */
@Repository
public interface SysUserInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUserInfo queryById(@Param("id") Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysUserInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysUserInfo 实例对象
     * @return 对象列表
     */
    List<SysUserInfo> queryAll(SysUserInfo sysUserInfo);

    /**
     * 新增数据
     *
     * @param sysUserInfo 实例对象
     * @return 影响行数
     */
    int insert(SysUserInfo sysUserInfo);

    /**
     * 修改数据
     *
     * @param sysUserInfo 实例对象
     * @return 影响行数
     */
    int update(SysUserInfo sysUserInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(@Param("id") Integer id);

}