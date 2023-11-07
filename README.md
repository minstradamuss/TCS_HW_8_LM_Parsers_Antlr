# Homework.Parsers.LM

**Как пользоваться?**
 - `CalculatorTest` - тесты
 - `Calculator` - main method

(нужно загрузить как maven project, и потом, возможно это всё-таки работает:
рядом с CalculatorTest и Calculator есть зеленые стрелочки и при нажатии на них
все автоматически запускается)

Собрать:
```
antlr4 -no-listener -visitor Calculator.g4 -o ../java/com/liguoliang/calc/parser -package com.lmr.calc.parser
```