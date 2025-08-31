package com.github.theapache64.expekt

import kotlin.test.assertEquals
import kotlin.test.fail

fun fails(fn: () -> Unit) {
    var failed = false
    try {
        fn()
    } catch(e: AssertionError) {
        failed = true
    }

    if (!failed) {
        throw IllegalStateException("fn did not fail")
    }
}

fun fails(message: String, fn: () -> Unit) {
    var failed = false
    try {
        fn()
    } catch(e: AssertionError) {
        assertEquals(message, e.message)
        failed = true
    }

    if (!failed) {
        throw IllegalStateException("fn did not fail")
    }
}

fun passes(fn: () -> Unit) {
    try {
        fn()
    } catch(e: AssertionError) {
        throw IllegalStateException("fn did not pass", e)
    }
}