package com.fux.afk.auth.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * Created by fuxj on 2019/3/6
 */
@Entity
@Table(name="sys_role_permission")
public class SysRolePermission implements Serializable {

	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "id_sys_role_permission_generator")
    @TableGenerator(name = "id_sys_role_permission_generator",
            table = "sys_identity",
            pkColumnName = "table_name",
            pkColumnValue = "sys_role_permission",
            valueColumnName = "next_increment_val",
            initialValue = 10000000, allocationSize = 1)
    private BigDecimal id;

	@Column(name="permission_id")
	private BigDecimal permissionId;

	@Column(name="role_id")
	private BigDecimal roleId;

	public SysRolePermission() {
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getPermissionId() {
		return this.permissionId;
	}

	public void setPermissionId(BigDecimal permissionId) {
		this.permissionId = permissionId;
	}

	public BigDecimal getRoleId() {
		return this.roleId;
	}

	public void setRoleId(BigDecimal roleId) {
		this.roleId = roleId;
	}

}