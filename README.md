# Java-Assignment-005 - Switch it Up

## Part 1: - Tracing the Code
As a new Java developer, you will be required to familiarize yourself with existing code before beginning to develop. That's what this section is about, developing your code tracing skills and familiarizing yourself with parts you may be able to use.
* Scan through all the existing code and note what you have to work with.
    * Method names
    * Variables
* Using Java terminology, break down every piece of the method **convertF2K**.
    * What is the access modifier?
  * 
  * Public
  * 
    * Is it a class or object method, how do you know?
  * 
  * I believe its a class method because it doesnt look like its creating an object
  * 
    * What is its return type?
  * 
  * double
  * 
    * What parameters does it require, and what are the parameter(s) datatype(s)?
  * 
  * It looks like F2K has the parameter Fahrenheit and its datatype is double.
  * 
    * Describe for me how the body of the method executes (i.e. its flow of execution).
*
* For F2K I think its taking the entered Fahrenheit and then calling on C2K and asking it to take
* the Celsius from F2C.
*
* Using Java terminology, break down method **getUnitChoice**.
* 
* getUnitChoice is basically a menu screen asking you to select what temp you'd like to convert
* 
    * What is the access modifier?
* 
* public
* 
  * Is it a class or object method, how do you know?
* 
* I would say this is an object because it's a new method outside the class with a String return type
* 
  * What is its return type?
* 
* String
* 
  * What parameters does it require, and what are the parameter(s) datatype(s)?
* 
*  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
* 
  * Describe for me how the body of the method executes (i.e. its flow of execution).
* 
* It prints Four lines to the terminal and will hopefully take your input to convert your desired temperature.
* 
  * How do the format specifiers differ than what you've seen before and what do they do?
*
* I haven't paid enough attention to the Format specifiers ,so I am not sure how they are really different
* however they seem to mean String and new line
*

## Part 2: - Implement Missing Method: convertK2F
This Part is aimed at teaching you to use methods and code you have to add new functionality to existing code. In this case you will add the missing conversion method, but you don't need to know math :-)
* Hint: You can use existing methods!

## Part 3: - Switch it Up
Part 3 is all about learning how to use the **switch** conditional statement, or the **enhanced switch** statement. You've learned about **if/else** now you will learn about **switch**.
* Using the provided method and class variables, write a program in the **while** loop of the **main** method that:
    * Requests a temperature Unit to convert from
    * Requests a temperature Unit to convert to
    * Quits the program if Q is entered for either choice
    * Requests the double temperature value to convert
    * Uses a **switch** or **enhanced switch** conditional to call the proper conversion method.
    * Prints out the result as indicated below:

          Result 40.000000°C is 104.000000°F

## Part 4: Pull Request
Part 4, as usual, is repetition of duties you will be doing in industry.
* Make sure to use the Git tab at the bottom of IntelliJ to create a Sprint2023 feature branch
* Commit and Push your running code back to your GitHub account
* Issue a Pull request back to my Java-Assignment-005 repo
* Cut and Paste the Pull request URL into your Canvas assignment to turn it in.
