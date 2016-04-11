package ua.danni;

import ua.danni.model.UserEntity;

/**
 * Role entity.
 * 
 * @author D.Kolesnikov
 * 
 */

public enum Role_enum {
	ROLE_ADMIN, CLIENT, PROFESSOR;
	
	public static Role_enum getRole(UserEntity user) {
		int roleId = user.getIdRole();
		return Role_enum.values()[roleId];
	}
	
	public String getName() {
		return name();
	}
	
}
