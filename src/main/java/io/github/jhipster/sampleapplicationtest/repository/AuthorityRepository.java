package io.github.jhipster.sampleapplicationtest.repository;

import io.github.jhipster.sampleapplicationtest.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
