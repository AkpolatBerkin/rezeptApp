package de.htwberlin.webtech.rezeptapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor

public class Rezept {
    private String name;
    private String zutaten;
    private String zubereitung;
    private int portionen;



}
