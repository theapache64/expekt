package com.example

import com.github.theapache64.expekt.expect
import com.github.theapache64.expekt.should
import kotlin.test.Test
import kotlin.test.fail


class ExampleTest {

    @Test
    fun failingTest1() {
        try {
            3.4.should.be.closeTo(3.2, delta = 0.1)
            fail()
        } catch (e: AssertionError) {
            // ok
        }
    }

    @Test
    fun failingTest2() {
        try {
            expect(3.4).to.be.closeTo(3.2, delta = 0.1)
            fail()
        } catch (e: AssertionError) {
            // ok
        }
    }

}