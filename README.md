# Java Grade Calculator

A console-based Java program that calculates class statistics from student scores — average, highest, lowest, and an overall letter grade (A–F).

## Features
- Reads the number of students and their scores via console input (`Scanner`)
- Stores scores in an array
- Computes average, maximum, and minimum score
- Assigns a letter grade (A/B/C/D/F) based on the class average using an if/else if chain

## How to run
```bash
javac Main.java
java Main
```

## Example

Nhập số lượng học sinh: 3
Nhập điểm học sinh 1: 85
Nhập điểm học sinh 2: 92
Nhập điểm học sinh 3: 78
Điểm trung bình của lớp là: 85.0
Điểm cao nhất của cả lớp là: 92.0
Điểm thấp nhất của cả lớp là: 78.0
Xếp loại cả lớp là: B


## What I learned
- Java requires explicit type declarations (`int`, `double`, `char`) — unlike Python's dynamic typing
- Arrays in Java have a fixed size, set at creation with `new`
- `Scanner` is used for console input, requiring `import java.util.Scanner`
- Every statement ends with `;`, and blocks are grouped with `{ }` instead of indentation
- `if / else if / else` chains stop at the first true condition, so branch order matters