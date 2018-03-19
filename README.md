# Java_Concepts_For_Interview

// Steps For Creating Immutable Class
/*
 * 1. Make Class Final. so No Class can override it.
 * 2. Make All Fields Final and Initialze them from Constructor
 * 3. Hide Setter Method or Just Create Getters only.
 * 4. When Exposing Any Method which Change State/value of Class Objects then always return new Instance of Class
 * 5. If Class has Any Mutable Objects than while returning always return clone copy of that mutable object.
 * */

