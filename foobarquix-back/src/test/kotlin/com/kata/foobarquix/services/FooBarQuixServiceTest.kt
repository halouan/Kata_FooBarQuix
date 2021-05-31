package com.kata.foobarquix.services

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class FooBarQuixServiceTest {



    lateinit var fooBarQuixService:FooBarQuixService

    @BeforeEach
    fun init() {
        fooBarQuixService = FooBarQuixService();
    }

    @Test
    fun shouldReturn1IfNumberIs1() {
        assertEquals("1", fooBarQuixService.convertNumber(1))
    }

    @Test
    fun shouldReturnFooFooIfNumberIs3() {
        assertEquals("FooFoo", fooBarQuixService.convertNumber(3))
    }

    @Test
    fun shouldReturnBarIfNumberIs5(){
        assertEquals("BarBar", fooBarQuixService.convertNumber(5))
    }

    @Test
    fun shouldReturnFooBarIfNumberIs51(){
        assertEquals("FooBar", fooBarQuixService.convertNumber(51))
    }

    @Test
    fun shouldReturnBarFooIfNumberIs53(){
        assertEquals("BarFoo", fooBarQuixService.convertNumber(53))
    }


    @Test
    fun shouldReturnFooBarBarIfNumberIs15() {
        assertEquals("FooBarBar", fooBarQuixService.convertNumber(15))
    }

    @Test
    fun shouldReturnFooFooFooIfNumberIs33() {
        assertEquals("FooFooFoo", fooBarQuixService.convertNumber(33))
    }

    @Test
    fun shouldReturnFooQuixIfNumberIs27() {
        assertEquals("FooQuix", fooBarQuixService.convertNumber(27))

    }


}