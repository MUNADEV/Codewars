## Binomial Expansion
#### Level: 3 Kyu
#### Estado: No completado

The purpose of this kata is to write a program that can do some algebra.

Write a function that takes in an expression with a single, one character variable, and expands it. The expression is in the form where and are integers which may be positive or negative, is any single character variable, and is a natural number. If a = 1, no coefficient will be placed in front of the variable. If a = -1, a "-" will be placed in front of the variable. `expand` `(ax+b)^n` `a` `b` `x` `n`

The expanded form should be returned as a string in the form where , , and are the coefficients of the term, is the original one character variable that was passed in the original expression and , , and , are the powers that is being raised to in each term and are in decreasing order.`ax^b+cx^d+ex^f...` `a` `c` `e` `x` `b` `d` `f` `x`

If the coefficient of a term is zero, the term should not be included. If the coefficient of a term is one, the coefficient should not be included. If the coefficient of a term is -1, only the "-" should be included. If the power of the term is 0, only the coefficient should be included. If the power of the term is 1, the caret and power should be excluded.

#### Examples:
```
KataSolution.expand("(x+1)^2");      // returns "x^2+2x+1"
KataSolution.expand("(p-1)^3");      // returns "p^3-3p^2+3p-1"
KataSolution.expand("(2f+4)^6");     // returns "64f^6+768f^5+3840f^4+10240f^3+15360f^2+12288f+4096"
KataSolution.expand("(-2a-4)^0");    // returns "1"
KataSolution.expand("(-12t+43)^2");  // returns "144t^2-1032t+1849"
KataSolution.expand("(r+0)^203");    // returns "r^203"
KataSolution.expand("(-x-1)^2");     // returns "x^2+2x+1"
```

#### Codewars


#### IntelliJ

##### Test
- testBPositive(): Comprueba el funcionamiento del programa en base a una operacion algebraica, en donde la parte `B` es positiva.
- testBNegative(): Comprueba el funcionamiento del programa en base a una operacion algebraica, en donde la parte `B` es negativa.
- testAPositive(): Comprueba el funcionamiento del programa en base a una operacion algebraica, en donde la parte `A` es positiva.
- testANegative(): Comprueba el funcionamiento del programa en base a una operacion algebraica, en donde la parte `A` es negativa.
