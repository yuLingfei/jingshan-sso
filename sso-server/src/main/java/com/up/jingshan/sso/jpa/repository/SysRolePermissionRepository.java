package com.up.jingshan.sso.jpa.repository;

import com.up.jingshan.sso.jpa.entity.SysRolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author YuanJingshan
 * @version 1.0
 * @description
 * @date 2019/12/19
 */
public interface SysRolePermissionRepository extends JpaSpecificationExecutor<SysRolePermission>, JpaRepository<SysRolePermission, Integer> {

    @Query(value = "SELECT * FROM sys_role_permission WHERE role_id IN (:roleIds)", nativeQuery = true)
    List<SysRolePermission> findByRoleIds(@Param("roleIds") List<Integer> roleIds);
}
