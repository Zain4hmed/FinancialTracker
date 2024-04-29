package com.financial.tracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transaction {
    @Id
    private String transactionId;
    private String senderUserId;
    private String recipentUserId;
    private String transactionAmount;
    private TransactionType transactionType;
    private Category category;
}
