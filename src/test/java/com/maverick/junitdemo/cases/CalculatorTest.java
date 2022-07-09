package com.maverick.junitdemo.cases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    /**
     * Naming convention: UnitOfWork_ExpectedBehavior_ScenarioUnderTest
     */
    @Test
    @DisplayName("Addition Test")
    void GIVEN_TwoIntegerAsInput_WHEN_TheInputIsTwoInteger_THEN_PrintTheirSum() {
        Calculator calculator = new Calculator();
        calculator.add(1, 2);
        Assertions.assertEquals(3, calculator.add(1, 2));
    }

    // assetEquals
    // assertFalse
}