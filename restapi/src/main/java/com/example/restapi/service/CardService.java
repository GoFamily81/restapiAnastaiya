package com.example.restapi.service;

import com.example.restapi.user.Card;

import java.util.List;

public interface CardService {
    Card addCard(Card card);

    Card putCard(Integer id, Card card);

    Card getCard(Integer id);

    String deleteCard(Integer id);

    List<Card> getAllCards();

    List<Card> getListCard();


}
