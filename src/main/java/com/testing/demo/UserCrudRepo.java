package com.testing.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepo extends CrudRepository<User, Integer> {

}
