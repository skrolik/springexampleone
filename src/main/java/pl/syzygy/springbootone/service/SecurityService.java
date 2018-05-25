package pl.syzygy.springbootone.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.syzygy.springbootone.dao.RoleDao;
import pl.syzygy.springbootone.dao.UserDao;
import pl.syzygy.springbootone.helpers.UserIntoUserDetailsWrapper;
import pl.syzygy.springbootone.model.User;


@Service
@Transactional()
public class  SecurityService implements UserDetailsService {
    private RoleDao roleDao;
    private UserDao userDao;

    public SecurityService(final RoleDao roleDao, final UserDao userDao) {
        this.roleDao = roleDao;
        this.userDao = userDao;
    }

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        User user = userDao.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Not found "+username);
        }

        return new UserIntoUserDetailsWrapper(user);
    }

    @Secured({"ADMIN"})
    @Transactional(readOnly = true)
    public Iterable<User> getAllUsers() {
        return userDao.findAll();
    }
}
