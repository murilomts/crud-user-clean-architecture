package com.crud.user.infra.persistence;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cpf;
    private String name;
    private String email;
    private String phone;

    public UserEntity() {
    }

    public UserEntity(String cpf, String name, String email, String phone) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

}
