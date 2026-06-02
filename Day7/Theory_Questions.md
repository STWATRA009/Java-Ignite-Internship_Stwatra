1)Explain the difference between a Class and an Object in Java with a real-life example.
Also explain why we cannot directly execute a class without creating an object.
ANS:- In Java, a class is like a whole picture, the main blueprint or template within which the changes or other things like objects are added, whereas an object in the class is the concrete instance of the class in real time. For example: The blueprint of a car which includes attributes like brand, color, price, etc. which is a class, whereas, a car is an object which is made on the basis of those attributes and characters in the blueprint of class. Since, class is onle a blueprint, a blueprint is useless if there is no object upon which it can be applied on, hence a class cannot be directly executed without a given object.


2)What are access modifiers in Java?
Explain the difference between public and private with examples.
Why is it not safe to make all variables public?
ANS:-Access modifiers in Java are keywords that set the accessibility (visibility) of classes, methods, constructors, and variables. They define who can access these members from other classes.

There are four primary access levels:
public: Accessible from anywhere.
private: Accessible only within the same class.
protected: Accessible within the same package and by subclasses in different packages.
Default (no modifier): Accessible only within the same package.

public class User {
    public String name; 
    public void sayHello() 
    {
      System.out.println("Hello!");
    }
}

public class BankAccount 
{
    private double balance; 
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
        }
    }
}

Making all variables public violates the core principle of Encapsulation. Here is why it creates security and stability risks:
Loss of Control (Lack of Validation): If a variable is public, any class can change its value to anything.

Example: If you have a public int age;, an outside class could accidentally set it to -500. If it were private, you could use a setter method to check if (age > 0) before allowing the change.

Code Fragility (Tight Coupling): If you expose your internal implementation (your variables) to the world, you can never change how they work without breaking every other class that relies on them.

Data Integrity: In a professional application, you often need to ensure that data remains consistent. By forcing all access through methods (getters/setters), you ensure that your object maintains control over its own internal state, preventing unauthorized or corrupting modifications.

3)Explain how encapsulation is achieved using private variables and public methods.
Give a real-life example (bank, mobile, ATM, etc.).
ANS:-Encapsulation is achieved using private variables and public methods through getters and setters, where a private variable's value is acquired using setter while it can be used to display in main class through the getter which are public methods to access their datas but if conditioned they can be restricted from ressetting the private variables. For example: In ATM, once you set your account number, your pin number, your bank details, all of it is now privately stored inside the banking system, and no one else can access it without the required credentials and you can't change the details of yours unless you proceed through certain steps and conditions.

public BankAccount(double initialBalance) {
    if (initialBalance >= 0) {
        this.balance = initialBalance;
    }
}
public double getBalance() {
    return this.balance;
}
public void deposit(double amount) {
    if (amount > 0) { // Validation rule
        this.balance += amount;
        System.out.println("Successfully deposited: $" + amount);
    } else {
        System.out.println("Invalid deposit amount!");
    }
  }
}

4)What is a constructor in Java?
Explain how the this keyword is used inside a constructor.
Why do we use constructors to initialize object values?
ANS:-A constructor in Java is a special block of code that is called automatically when an object of a class is created. Unlike regular methods, a constructor does not have a return type (not even void), and its name must exactly match the name of the class.
Its primary purpose is to initialize the state of the object—in other words, to give your object its initial values as soon as it is born in memory.


Inside a constructor, the this keyword refers to the current object being created. A common scenario is when the constructor parameters have the exact same names as the class fields (as shown in the code above).
The Conflict: Without this, the compiler would be confused: are you referring to the parameter name or the class variable name?
The Solution: Using this.name = name; tells Java: "Take the value provided in the parameter name and assign it to the name field of this specific object instance."
Without this, the code would simply assign the parameter to itself, leaving your class variables uninitialized (null or zero).

1. Guaranteed Initialization
If you use a constructor to set required values (like id or username), you guarantee that no object can ever exist in an invalid or "half-baked" state. You ensure the object is "ready to use" from the very first moment it is created.
2. Immutability
If you want an object to be constant (where its values cannot be changed after creation), you can assign the values in the constructor and provide no "setter" methods. This is essential for creating secure, predictable code.
3. Efficiency and Readability
A constructor allows you to condense multiple lines of assignment code into a single, clean statement.
