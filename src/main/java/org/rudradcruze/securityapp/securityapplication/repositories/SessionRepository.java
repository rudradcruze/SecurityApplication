package org.rudradcruze.securityapp.securityapplication.repositories;

import org.rudradcruze.securityapp.securityapplication.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
    Optional<Session> findByUserId(Long userId);
}
