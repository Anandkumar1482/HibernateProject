package com.secure.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends CrudRepository<User, Integer> {

	User findByusername(String username);
}
