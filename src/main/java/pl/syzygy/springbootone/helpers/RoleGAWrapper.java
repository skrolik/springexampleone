package pl.syzygy.springbootone.helpers;

import org.springframework.security.core.GrantedAuthority;
import pl.syzygy.springbootone.model.Role;

public class RoleGAWrapper implements GrantedAuthority {
    private Role role;

    public RoleGAWrapper(final Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String getAuthority() {
        return role.getName();
    }
}
