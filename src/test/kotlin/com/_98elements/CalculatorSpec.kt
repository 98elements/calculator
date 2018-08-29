package com._98elements

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

object CalculatorSpec: Spek({
    describe("adding numbers") {
        it("adds 2 to 2") {
            assertEquals(4, Calculator.add(2, 2))
        }
    }

    describe("dividing numbers") {
        it("divides 4 by 2") {
            assertEquals(2, Calculator.divide(4, 2))
        }

        context("when dividing by 0") {
            it("throws ArithmeticException") {
                assertThrows<ArithmeticException> { Calculator.divide(2, 0) }
            }
        }
    }
})
