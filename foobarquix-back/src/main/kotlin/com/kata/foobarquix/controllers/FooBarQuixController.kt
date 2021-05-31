package com.kata.foobarquix.controllers

import com.kata.foobarquix.services.FooBarQuixService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/foo-bar-quix")
class FooBarQuixController(private val  fooBarQuixService: FooBarQuixService) {
	
    @GetMapping( "/{inputNumber}")
    @CrossOrigin(origins = ["http://localhost:4200", "http://localhost:8080"])
    fun convertNumber(@PathVariable(name = "inputNumber") inputNumber : Int) : ResultDto{
        return ResultDto(fooBarQuixService.convertNumber(inputNumber))
    }

    data class ResultDto(val result : String)

}