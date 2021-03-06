package com.lzhpo.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lzhpo.admin.entity.Role;

import java.util.List;

/**
 * <p> Author：lzhpo </p>
 * <p> Title：</p>
 * <p> Description：</p>
 */
public interface RoleService extends IService<Role> {

    long getRoleNameCount(String name);

    Role saveRole(Role role);

    Role getRoleById(String id);

    void updateRole(Role role);

    void deleteRole(Role role);

    List<Role> selectAll();
}
