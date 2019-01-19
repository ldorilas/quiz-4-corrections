# Quiz 4 Corrections: APCSA

Question 4: Consider the following method definition.
```
public double randomNumber(int seed) {
    if (seed > 1000) {
        return Math.random() * seed;
    } else if (seed > 500) { 
        return Math.random() * seed * -1;
    }
}
```
I keep getting an error message telling me that my method must return a value of type double. What's wrong with my code?

My answer:  Math.random returns a value of type int. You need to cast it to a double. 
Correct Answer: For seed values less than or equal to 500, the method does not return a value.

Question 5: Consider the following requirements for a method I need to write.

- Accepts a single parameter
- If that parameter is a whole number, return the parameter unchanged.
- If that parameter contains a fractional component, return the next largest whole number.

Here's my method definition.
```
public double mystery(double x) {

}
```
Which single line of code will adequately complete this method?
My answer: return Math.round(x);
Correct answer: return Math.ceil(x);

