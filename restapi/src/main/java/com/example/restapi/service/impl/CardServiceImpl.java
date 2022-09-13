package com.example.restapi.service.impl;


import com.example.restapi.repository.CardRepository;

import com.example.restapi.model.Card;
import com.example.restapi.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardRepository cardRepository;

    @Override
    public Card addCard(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card putCard(Integer id,Card card) {
        card.setId(id);
        cardRepository.save(card);
        return getCard(id) ;
    }

    @Override
    public Card getCard(Integer id) {
        return cardRepository.getById(id);
    }

    @Override
    public String deleteCard(Integer id) {
        cardRepository.deleteById(id);
        return "Card has been deleted with id " + id;
    }

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @Override
    public List<Card> getListCard() {
        List<Card> cards = cardRepository.getListCardBetween();
        cards.get(0).setCardNumber("24-5824-7246-33");
        return cards;
    }


}
