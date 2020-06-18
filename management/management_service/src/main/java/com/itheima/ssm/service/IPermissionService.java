package com.itheima.ssm.service;

import com.itheima.ssm.domain.Permission;

import javax.jnlp.IntegrationService;
import java.util.List;

public interface IPermissionService {
    List<Permission> findAll() throws Exception;

    void save(Permission permission) throws Exception;

    Permission findById(Integer id) throws Exception;

    void deleteById(Integer id) throws Exception;
}
