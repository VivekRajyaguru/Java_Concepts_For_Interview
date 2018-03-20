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

/*
Object class is present in java.lang package. Every class in Java is directly or indirectly derived from the Object class. If a Class does not extend any other class then it is direct child class of Object and if extends other class then it is an indirectly derived. Therefore the Object class methods are available to all Java classes. 

toString() :  toString() provides String representation of an Object and used to convert an object to String. The default toString() method for class Object returns a string consisting of the name of the class of which the object is an instance, the at-sign character @, and the unsigned hexadecimal representation of the hash code of the object.It is always recommended to override toString() method to get our own String representation of Object.

hashCode() : For every object, JVM generates a unique number which is hashcode. It returns distinct integers for distinct objects. A common misconception about this method is that hashCode() method returns the address of object, which is not correct. It convert the internal address of object to an integer by using an algorithm. The hashCode() method is native because in Java it is impossible to find address of an object, so it uses native languages like C/C++ to find address of the object.
Use of hashCode() method : Returns a hash value that is used to search object in a collection. JVM(Java Virtual Machine) uses hashcode method while saving objects into hashing related data structures like HashSet, HashMap, Hashtable etc. The main advantage of saving objects based on hash code is that searching becomes easy.
Note : Override of hashCode() method needs to be done such that for every object we generate a unique number. For example,for a Student class we can return roll no. of student from hashCode() method as it is unique.


equals(Object obj) : Compares the given object to “this” object (the object on which the method is called). It gives a generic way to compare objects for equality. It is recommended to override equals(Object obj) method to get our own equality condition on Objects. For more on override of equals(Object obj) method refer – Overriding equals method in Java
Note : It is generally necessary to override the hashCode() method whenever this method is overridden, so as to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.

getClass() : Returns the class object of “this” object and used to get actual runtime class of the object. It can also be used to get metadata of this class. The returned Class object is the object that is locked by static synchronized methods of the represented class. As it is final so we don’t override it.
Note :After loading a .class file, JVM will create an object of the type java.lang.Class in the Heap area. We can use this class object to get Class level information. It is widely used in Reflection

finalize() method : This method is called just before an object is garbage collected. It is called by the Garbage Collector on an object when garbage collector determines that there are no more references to the object. We should override finalize() method to dispose system resources, perform clean-up activities and minimize memory leaks. For example before destroying Servlet objects web container, always called finalize method to perform clean-up activities of the session.
Note :finalize method is called just once on an object even though that object is eligible for garbage collection multiple times.

clone() : It returns a new object that is exactly the same as this object

*/
