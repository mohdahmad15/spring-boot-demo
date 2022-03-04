package com.jpa.demo.dao;

import com.jpa.demo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
