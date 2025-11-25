package com.crud.user.application.usecases;

import com.crud.user.application.gateways.UserRepositoryApp;
import com.crud.user.domain.User;

public class CreateUserUseCase {

    private final UserRepositoryApp repositoryApp;

    public CreateUserUseCase(UserRepositoryApp repositoryApp) {
        this.repositoryApp = repositoryApp;
    }

    public User execute(User user) {
        return repositoryApp.createUser(user);
    }
}
