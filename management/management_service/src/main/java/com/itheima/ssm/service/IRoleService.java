package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;
import com.itheima.ssm.domain.Role;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();

    void save(Role role);

    List<Permission> findOtherPermissions(Integer roleId);

    Role findById(Integer roleId);

    void addPermissionToRole(Integer roleId, Integer[] permissionIds);

    void deleteRoleById(Integer roleId);
}
