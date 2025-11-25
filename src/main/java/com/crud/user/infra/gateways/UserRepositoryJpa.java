package com.crud.user.infra.gateways;

import com.crud.user.application.gateways.UserRepositoryApp;
import com.crud.user.domain.User;
import com.crud.user.infra.persistence.UserEntity;
import com.crud.user.infra.persistence.UserRepository;

public class UserRepositoryJpa implements UserRepositoryApp {

    private final UserRepository repository;
    private final UserEntityMapper mapper;

    public UserRepositoryJpa(UserRepository repository, UserEntityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public User createUser(User user) {
        UserEntity entity = mapper.toEntity(user);
        repository.save(entity);
        return mapper.toDomain(entity);
    }

}
