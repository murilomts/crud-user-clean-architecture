package com.crud.user.infra.gateways;

import com.crud.user.domain.User;
import com.crud.user.infra.persistence.UserEntity;

public class UserEntityMapper {

    public UserEntity toEntity(User user) {
        return new UserEntity(user.getCpf(), user.getName(), user.getEmail(), user.getPhone());
    }

    public User toDomain(UserEntity entity) {
        return new User(entity.getCpf(), entity.getName(), entity.getEmail(), entity.getPhone());
    }

}
