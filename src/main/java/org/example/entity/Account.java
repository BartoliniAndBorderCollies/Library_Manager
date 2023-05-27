package org.example.entity;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String secondName;
    @Column
    private String lastName;
    @Column
    private int pesel;
    @Column
    private int phoneNumber;
    @Column
    private String email;
    @Column
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
