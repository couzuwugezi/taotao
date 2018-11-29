package com.springboot.taotao.service;

import com.springboot.taotao.entity.SysUserInfo;

import java.util.List;

/**
 * 用户信息表(SysUserInfo)表服务接口
 *
 * @author makejava
 * @since 2018-11-29 14:10:42
 */
public interface SysUserInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUserInfo queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysUserInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysUserInfo 实例对象
     * @return 实例对象
     */
    SysUserInfo insert(SysUserInfo sysUserInfo);

    /**
     * 根据给定字段查询数据
     *
     * @param sysUserInfo 实例对象
     * @return 实例对象
     */
    List<SysUserInfo> queryAll(SysUserInfo sysUserInfo);

    /**
     * 修改数据
     *
     * @param sysUserInfo 实例对象
     * @return 实例对象
     */
    SysUserInfo update(SysUserInfo sysUserInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}