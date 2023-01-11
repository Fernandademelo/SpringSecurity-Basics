package com.workshop.fernanda.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }

}