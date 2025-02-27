package com.shivsundar.controller;

import com.shivsundar.repos.Card;
import com.shivsundar.repos.CardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    private CardRepo cardRepo;

    @PostMapping("/save")
    public ResponseEntity<?> saveCard(@RequestBody Card card){
        try{
            cardRepo.save(card);
            return new ResponseEntity<>("saved", HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("error to save card");
        }
    }


    @GetMapping("/all")
    public ResponseEntity<List<Card>> cards(){
        List<Card> cardList = cardRepo.findAll();
        System.out.println(cardList);
        return ResponseEntity.ok(cardList);
    }
}
