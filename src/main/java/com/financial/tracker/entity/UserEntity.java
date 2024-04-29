package com.financial.tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserEntity {

    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private String currentBalance;
    private List<Transaction> transactions;

}
