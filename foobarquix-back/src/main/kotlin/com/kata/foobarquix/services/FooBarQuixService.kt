package com.kata.foobarquix.services

import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.*

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {

        var result:String = "";

        result = replaceDivibleNumber(inputNumber)
        result += replaceContainNumber(inputNumber)


        if(result.isEmpty())
            return inputNumber.toString();
        else
            return result
    }

     private fun replaceDivibleNumber(inputNumber: Int) : String {

        var resultOfDivibility:String = "";
        if(inputNumber % 3 == 0) {
            resultOfDivibility += "Foo";
        }
        if(inputNumber % 5 == 0) {
            resultOfDivibility += "Bar";
        }

        return resultOfDivibility;
    }

    private fun replaceContainNumber(inputNumber: Int) : String {

        var resultContainNumber:String = "";

        var stringOfInputNumber:String = inputNumber.toString();
        for(i in 0 until stringOfInputNumber.length){
            if(stringOfInputNumber[i] == '3')
                resultContainNumber += "Foo";
            if(stringOfInputNumber[i] == '5')
                resultContainNumber += "Bar";
            if(stringOfInputNumber[i] == '7')
                resultContainNumber += "Quix";
        }

        return  resultContainNumber
    }
}