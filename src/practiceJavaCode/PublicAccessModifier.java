package practiceJavaCode;

	/*Modifier 1: Public Access Modifiers
	If a class is declared as public then we can access that class from anywhere.
	In the below example we are creating a package pack1 inside that package we declare a class A which is public and inside that class, 
	we declare a method m1 which is also public. 
	
	Now we create another package pack2 and inside that pack2 we import pack1 and declare a class B and in class B’s main method 
	we create an object of type class A and trying to access the data of method m1.
	*/
	
	/*Modifier 2: Protected Access Modifier
	This modifier can be applied to the data member, method, and constructor, 
	but this modifier can’t be applied to the top-level classes and interface.
	
	A member is declared as protected as we can access that member only within the current package 
	but only in the child class of the outside package.
	*/
	
	/*Modifier 3: Private Access Modifiers
	
	This modifier is not applicable for top-level classes or interfaces. 
	It is only applicable to constructors, methods, and fields inside the classes.  
	
	If a variable or methods or constructor is declared as private then 
	we can access them only from within the class i.e from outside the class we can’t access them.*/
	
	/*Modifier 4: Package(Default) Access Modifier  
	
	A class or method or variable declare without any access modifier then is considered 
	that it has a package(default)access modifier The default modifier act as public within 
	the same package and acts as private outside the package. 
	
	If a class is declared as default then we can access that class only within the current package 
	i.e from the outside package we can’t access it. Hence, 
	
	the default access modifier is also known as the package–level access modifier. 
	A similar rule also applies for variables and methods in java.
	*/


public class PublicAccessModifier {

	// main method
	public static void main(String[] args) {
		// creating an object of type class A
		System.out.println("Hello");
	}
}
