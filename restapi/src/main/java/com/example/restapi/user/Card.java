package com.example.restapi.user;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Аннотация @AllArgsConstructor заменяет конструктор со всеми полями класса
@NoArgsConstructor
@Data
@Entity(name = "Card")
@Table(name = "card")
//Создание публичного класса User
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Card {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "card_number")
    //Создание приватного поля cardNumber с типом данных String
    private String cardNumber;

    @Column(name = "card_username")
    //Создание приватного поля cardUsername с типом данных String
    private String cardUsername;

    @Column(name = "card_surname")
    //Создание приватного поля cardSurname с типом данных String
    private String cardSurname;

    @Column(name = "bank_name")
    //Создание приватного поля bankName с типом данных String
    private String bankName;

}
