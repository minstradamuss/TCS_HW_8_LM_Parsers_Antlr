# Homework.Parsers.LM

**How to use?**
 - `CalculatorTest` shows how to use it. 
 - `Calculator` has a main method

to generate java code:
```
antlr4 -no-listener -visitor Calculator.g4 -o ../java/com/liguoliang/calc/parser -package com.liguoliang.calc.parser
```