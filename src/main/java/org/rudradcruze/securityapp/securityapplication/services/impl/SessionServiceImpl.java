package org.rudradcruze.securityapp.securityapplication.services.impl;

import lombok.RequiredArgsConstructor;
import org.rudradcruze.securityapp.securityapplication.entities.Session;
import org.rudradcruze.securityapp.securityapplication.entities.User;
import org.rudradcruze.securityapp.securityapplication.repositories.SessionRepository;
import org.rudradcruze.securityapp.securityapplication.services.SessionService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SessionServiceImpl implements SessionService {

    private final SessionRepository sessionRepository;

    @Override
    public Session createSession(User user, String token) {
        Session session = sessionRepository.findByUserId(user.getId()).orElse(new Session());
        session.setUser(user);
        session.setToken(token);
        return sessionRepository.save(session);
    }

    @Override
    public Session getSessionByUserId(Long userId) {
        return sessionRepository.findByUserId(userId).orElse(null);
    }
}
