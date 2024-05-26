package com.worro.repositories2.programmingLanguages;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PLRepositories extends JpaRepository<ProgrammingLanguages,Long> {
}
