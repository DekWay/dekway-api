package sn.dialibah.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import sn.dialibah.common.authentication.model.DekWayUserDetails;
import sn.dialibah.user.model.UserDataBean;

/**
 * Created by nureynisow on 15/04/2017.
 * for DekWay
 */
@Configuration
class DekWAyUserDetailsService implements UserDetailsService {

    @Autowired
    private IUserAccountService userAccountService;

    @Override
    public DekWayUserDetails loadUserByUsername(final String usernameOrEmail) throws UsernameNotFoundException {
        final UserDataBean userDataBean = userAccountService.getUserDetails(usernameOrEmail);
        return DekWayUserDetails.builder()
                .user(userDataBean).build();
    }
}
