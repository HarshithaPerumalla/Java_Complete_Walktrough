Inner classes introduced in Java 1,1 version to fix GUI bugs as a part of event Handling.
But because of poweful features of inner classess, slowly programmers started using it in regular coding also.

When to use INner classes?
When an object only exists or can function while other object exists . then we have go for inner classess.

Example: university consists of several departments , without existing university thre is no chance of existence od dept on its own. hence dept should exist inside university class.
class Uiversity{
    class Department{

    }
}

Inner classes divided into 4 types based on their position and behaviour.

1) Member inner class: inner class is declared as an instance  member of an class
2) Local Inner class: Defined within a method body, these classes are not allowed to use private, public, or protected access modifiers. They can only use abstract or final modifiers. 
3) Static Nested class: inner class is defined using static keyword
4) Anonymous inner class: These are local inner classes without a name. They always extend a class or implement an interface. 

compilation:
class Outer{
    class Inner{

    }
}
 javac Outer.java
 class files genereated:
 1) Outer.class
 2) Outer$Inner.class - $  denotes inner class
 running:
 java Outer
 java OUter\$Inner

