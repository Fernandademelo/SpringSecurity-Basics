package com.workshop.fernanda.controllers;

import com.workshop.fernanda.forjunittesting.SimpleCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void threePlusSevenEqualTen(){
        var calculator = new SimpleCalculator();
        assertEquals(10,calculator.add(3,7));
    }

}