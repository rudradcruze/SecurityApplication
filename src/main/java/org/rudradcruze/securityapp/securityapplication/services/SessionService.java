package org.rudradcruze.securityapp.securityapplication.services;

import org.rudradcruze.securityapp.securityapplication.entities.Session;
import org.rudradcruze.securityapp.securityapplication.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface SessionService {
    Session createSession(User user, String token);
    Session getSessionByUserId(Long userId);

}
