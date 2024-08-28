package com.tecmave.service;

import org.beangle.security.authc.UsernameNotFoundException;
import org.joyqueue.security.UserDetails;




public interface UsuarioDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
