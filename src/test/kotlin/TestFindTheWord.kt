import org.junit.Test
import kotlin.test.assertEquals

/*
A precedence rule is given as "P>E", which means that letter "P" is followed directly by the letter "E". Write a function, given an array of precedence rules, that finds the word represented by the given rules.

Note: Each represented word contains a set of unique characters, i.e. the word does not contain duplicate letters.

Examples:
findWord(["P>E","E>R","R>U"]) // PERU
findWord(["I>N","A>I","P>A","S>P"]) // SPAIN


findWord(["U>N", "G>A", "R>Y", "H>U", "N>G", "A>R"]) // HUNGARY
findWord(["I>F", "W>I", "S>W", "F>T"]) // SWIFT
findWord(["R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G"]) // PORTUGAL
findWord(["W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T"]) // SWITZERLAND
 */

// Start:  10:49
// End:    11:51
// Actual: 11:25

class TestFindTheWord {

    @Test
    fun `test0`() {
        val input = mutableListOf<String>()
        val task = FindTheWord()
        val solution = task.solve(input)
        assertEquals("", solution)
    }

    @Test
    fun `test1`() {
        val input = mutableListOf("P>E")
        val task = FindTheWord()
        val solution = task.solve(input)
        assertEquals("PE", solution)
    }

    @Test
    fun `test3`() {
        val input = mutableListOf("P>E", "E>R")
        val task = FindTheWord()
        val solution = task.solve(input)
        assertEquals("PER", solution)
    }

    @Test
    fun `test4`() {
        val input = mutableListOf("P>E", "E>R", "R>U")
        val task = FindTheWord()
        val solution = task.solve(input)
        assertEquals("PERU", solution)
    }

    @Test
    fun `test6`() {
        val input = mutableListOf("U>N", "G>A", "R>Y", "H>U", "N>G", "A>R")
        val task = FindTheWord()
        val solution = task.solve(input)
        assertEquals("HUNGARY", solution)
    }

    @Test
    fun `test7`() {
        val input = mutableListOf("I>F", "W>I", "S>W", "F>T")
        val task = FindTheWord()
        val solution = task.solve(input)
        assertEquals("SWIFT", solution)
    }

    @Test
    fun `test8`() {
        val input = mutableListOf("R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G")
        val task = FindTheWord()
        val solution = task.solve(input)
        assertEquals("PORTUGAL", solution)
    }

    @Test
    fun `test9`() {
        val input = mutableListOf("W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T")
        val task = FindTheWord()
        val solution = task.solve(input)
        assertEquals("SWITZERLAND", solution)
    }

    @Test
    fun `test5`() {
        val input = mutableListOf("I>N","A>I","P>A","S>P")
        val task = FindTheWord()
        val solution = task.solve(input)
        assertEquals("SPAIN", solution)
    }

}
