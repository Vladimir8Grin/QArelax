package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resurces.csv")
    public void testCalculateRelax() {

        Freelancer freelancer = new Freelancer();
        int actual = freelancer.calculate(10_000, 3000, 20_000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    /*
    @Test
    public void testCalculateRelax2() {

        Freelancer freelancer = new Freelancer();
        int actual = freelancer.calculate(100_000, 60_000, 150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

     */
}