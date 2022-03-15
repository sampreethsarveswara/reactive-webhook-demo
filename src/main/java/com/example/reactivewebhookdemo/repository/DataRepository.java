package com.example.reactivewebhookdemo.repository;

import com.example.reactivewebhookdemo.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends ReactiveCrudRepository<User, Integer> {
}
