package com.springboot.taotao.service.impl;

import com.springboot.taotao.entity.SysUserInfo;
import com.springboot.taotao.dao.SysUserInfoDao;
import com.springboot.taotao.service.SysUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户信息表(SysUserInfo)表服务实现类
 *
 * @author makejava
 * @since 2018-11-29 14:10:43
 */
@Service("sysUserInfoService")
@Transactional(rollbackFor = Exception.class)
public class SysUserInfoServiceImpl implements SysUserInfoService {
    @Autowired
    private SysUserInfoDao sysUserInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUserInfo queryById(Integer id) {
        return this.sysUserInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUserInfo> queryAllByLimit(int offset, int limit) {
        return this.sysUserInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUserInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserInfo insert(SysUserInfo sysUserInfo) {
        this.sysUserInfoDao.insert(sysUserInfo);
        return sysUserInfo;
    }

    /**
     * 根据给定字段查询数据
     *
     * @param sysUserInfo 实例对象
     * @return 实例对象
     */
    @Override
    public List<SysUserInfo> queryAll(SysUserInfo sysUserInfo) {
        return this.sysUserInfoDao.queryAll(sysUserInfo);
    }

    /**
     * 修改数据
     *
     * @param sysUserInfo 实例对象
     * @return 实例对象
     */
    @Override
    public SysUserInfo update(SysUserInfo sysUserInfo) {
        this.sysUserInfoDao.update(sysUserInfo);
        return this.queryById(sysUserInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysUserInfoDao.deleteById(id) > 0;
    }
}