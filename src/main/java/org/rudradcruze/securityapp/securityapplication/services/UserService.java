package org.rudradcruze.securityapp.securityapplication.services;

import lombok.RequiredArgsConstructor;
import org.rudradcruze.securityapp.securityapplication.exceptions.ResourceNotFoundException;
import org.rudradcruze.securityapp.securityapplication.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username).orElseThrow(() -> new ResourceNotFoundException("User with email " + username + " not found"));
    }
}
