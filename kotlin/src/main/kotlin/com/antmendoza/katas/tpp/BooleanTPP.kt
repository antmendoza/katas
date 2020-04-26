package com.antmendoza.katas.tpp

import java.util.*


val AND = "AND"
val OR = "OR"
val NOT = "NOT"

class BooleanTPP {
    fun fromString(input: String): Boolean {


        val inputToProcess = input.replace("(", "( ")
            .replace(")", " )")

        val inputAsList = LinkedList(inputToProcess.split(" "));


        if (inputAsList.contains("(")) {
            return computeOperationWithParenthesis(inputAsList)
        }


        if (inputAsList.contains(NOT)) {
            return computeOperationWithNot(inputAsList)
        }


        if (complexOperation(inputAsList)) {

            if (inputAsList.contains(AND)) {
                return computeComplexOperationWithAnd(inputAsList)
            }


            if (inputAsList.contains(OR)) {
                return computeComplexOperationWithOr(inputAsList)
            }
        }

        if (simpleOperation(inputAsList)) {

            if (inputToProcess.contains(OR)) {
                return computeSimpleOperationWithOr(inputAsList)
            }

            if (inputAsList.contains(AND)) {
                return computeSimpleOperationWithAnd(inputAsList)
            }

        }

        return booleanValueOf(inputToProcess)

    }

    private fun computeComplexOperationWithOr(inputAsList: LinkedList<String>): Boolean {
        val position = inputAsList.indexOf(OR)
        val firstBoolean = inputAsList.get(position - 1)
        val secondBoolean = inputAsList.get(position + 1)
        val fromString = fromString(toInputFormat(listOf(firstBoolean, OR, secondBoolean)))
        inputAsList.removeAt(position - 1)
        inputAsList.removeAt(position - 1)
        inputAsList.removeAt(position - 1)
        inputAsList.add(position - 1, stringOfBooleanValue(fromString))
        return fromString(toInputFormat(inputAsList))
    }

    private fun computeComplexOperationWithAnd(inputAsList: LinkedList<String>): Boolean {
        val position = inputAsList.indexOf(AND)
        val firstBoolean = inputAsList.get(position - 1)
        val secondBoolean = inputAsList.get(position + 1)
        val fromString = fromString(toInputFormat(listOf(firstBoolean, AND, secondBoolean)))
        inputAsList.removeAt(position - 1)
        inputAsList.removeAt(position - 1)
        inputAsList.removeAt(position - 1)
        inputAsList.add(position - 1, stringOfBooleanValue(fromString))
        return fromString(toInputFormat(inputAsList))
    }

    private fun computeOperationWithNot(inputAsList: LinkedList<String>): Boolean {
        val position = inputAsList.indexOf(NOT)
        val booleanValue = inputAsList.get(position + 1)
        inputAsList.removeAt(position)
        inputAsList.removeAt(position)
        val result = !booleanValueOf(booleanValue)
        inputAsList.add(position, stringOfBooleanValue(result))
        return fromString(toInputFormat(inputAsList))
    }

    private fun computeOperationWithParenthesis(inputAsList: LinkedList<String>): Boolean {
        val positionInit = inputAsList.indexOf("(")
        val positionFin = inputAsList.lastIndexOf(")")
        var resultInParenthesis = stringOfBooleanValue(
            fromString(
                toInputFormat(inputAsList.subList(positionInit + 1, positionFin))
            )
        )
        for (a in positionInit..positionFin) {
            inputAsList.removeAt(positionInit)
        }
        inputAsList.add(positionInit, resultInParenthesis)
        return fromString(toInputFormat(inputAsList))
    }

    private fun computeSimpleOperationWithAnd(inputAsList: LinkedList<String>): Boolean {
        val firstBoolean = inputAsList.get(0)
        val secondBoolean = inputAsList.get(2)
        return booleanValueOf(firstBoolean).and(booleanValueOf(secondBoolean))
    }

    private fun computeSimpleOperationWithOr(inputAsList: LinkedList<String>): Boolean {
        val firstBoolean = inputAsList.get(0)
        val secondBoolean = inputAsList.get(2)
        return booleanValueOf(firstBoolean).or(booleanValueOf(secondBoolean))
    }

    private fun simpleOperation(inputAsList: LinkedList<String>) = inputAsList.size === 3

    private fun complexOperation(inputAsList: LinkedList<String>) = inputAsList.size > 3

    private fun toInputFormat(inputAsList: List<String>) = inputAsList.joinToString(" ")

    private fun booleanValueOf(s: String): Boolean {
        if (s.equals("TRUE")) {
            return true
        }

        return false;
    }


    private fun stringOfBooleanValue(b: Boolean): String {
        if (b) {
            return "TRUE"
        }

        return "FALSE";
    }

}
