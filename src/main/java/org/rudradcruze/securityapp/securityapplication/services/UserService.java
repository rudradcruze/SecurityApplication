package org.rudradcruze.securityapp.securityapplication.services;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.rudradcruze.securityapp.securityapplication.dto.LoginDto;
import org.rudradcruze.securityapp.securityapplication.dto.SignUpDto;
import org.rudradcruze.securityapp.securityapplication.dto.UserDto;
import org.rudradcruze.securityapp.securityapplication.entities.User;
import org.rudradcruze.securityapp.securityapplication.exceptions.ResourceNotFoundException;
import org.rudradcruze.securityapp.securityapplication.repositories.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username).orElseThrow(() -> new ResourceNotFoundException("User with email " + username + " not found"));
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with id " + id + " not found"));
    }

    public UserDto signUp(SignUpDto signUpDto) {
        userRepository.findByEmail(signUpDto.getEmail()).ifPresent(user -> {
            throw new IllegalArgumentException("User with email " + signUpDto.getEmail() + " already exists");
        });
        User user = modelMapper.map(signUpDto, User.class);
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
        return modelMapper.map(userRepository.save(user), UserDto.class);
    }
}











