package org.example.springaccessjpawithrest.repository;

import org.example.springaccessjpawithrest.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByLastName(String lastName);

    List<Person> searchPersonByNameContaining(String name);
}
