# Calculator with Antlr4(4.7.2) + Java 8

[![Build Status](https://travis-ci.com/guoliang-dev/calcuator-with-antlr4-java8.svg?branch=master)](https://travis-ci.com/guoliang-dev/calcuator-with-antlr4-java8)

**How to use?**
 - `CalculatorTest` shows how to use it. 
 - `Calculator` has a main method

to generate java code:
```
antlr4 -no-listener -visitor Calculator.g4 -o ../java/com/liguoliang/calc/parser -package com.liguoliang.calc.parser
```

the grammar file was copied from: https://github.com/arothuis/antlr4-calculator/blob/master/src/main/antlr4/parser/Calculator.g4