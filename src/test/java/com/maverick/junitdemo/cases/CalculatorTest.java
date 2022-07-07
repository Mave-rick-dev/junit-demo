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
    @DisplayName("ADDITION-TEST-1")
    void GIVE_ValidInputNumbers_WHEN_FunctionAddIsCalled_THEN_ReturnTheAccurateAddedResult() {
        Calculator calculator = new Calculator();
        Integer actual = calculator.add(1, 2);
        Integer expected = 3;
        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(() -> false, "message after falsification!!");

    }
}