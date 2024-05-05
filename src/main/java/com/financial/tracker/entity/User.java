package com.financial.tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table
public class User {

    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private String currentBalance;
    @OneToMany(targetEntity=Transaction.class,fetch=FetchType.EAGER)
    private List<Transaction> transactions;

}
