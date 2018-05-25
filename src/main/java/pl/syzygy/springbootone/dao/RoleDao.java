package pl.syzygy.springbootone.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.syzygy.springbootone.model.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {
}
