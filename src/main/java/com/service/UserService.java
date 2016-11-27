package com.service;

import com.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Nagendra on 27-11-2016.
 */
public interface UserService extends MongoRepository<User , String>{

    User findByName(String name);


}
