# Java_Concepts_For_Interview

// Steps For Creating Immutable Class
/*
 * 1. Make Class Final. so No Class can override it.
 * 2. Make All Fields Final and Initialze them from Constructor
 * 3. Hide Setter Method or Just Create Getters only.
 * 4. When Exposing Any Method which Change State/value of Class Objects then always return new Instance of Class
 * 5. If Class has Any Mutable Objects than while returning always return clone copy of that mutable object.
 * */


// Steps For Creating SingleTon Class
/*
 * 1. Make constructor as private.
 * 2. Write a static method that has return type object of this singleton class. Here, the concept of Lazy initialization in used to write this static method.
 
 Difference in normal and singleton class in terms of instantiation is that, For normal class we use constructor, whereas for singleton class we use getInstance() method
 * */
 
 Default assigned values By Compiler.

boolean : false
int : 0
double : 0.0
String : null
User Defined Type : null


/**
Difference between Scanner and BufferReader Class in Java

java.util.Scanner class is a simple text scanner which can parse primitive types and strings. It internally uses regular expressions to read different types.

Java.io.BufferedReader class reads text from a character-input stream, buffering characters so as to provide for the efficient reading of sequence of characters


1)BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with multiple threads.
2)BufferedReader has significantly larger buffer memory than Scanner.
The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), but it’s more than enough.
BufferedReader is a bit faster as compared to scanner because scanner does parsing of input data and BufferedReader simply reads sequence of characters.



**/
