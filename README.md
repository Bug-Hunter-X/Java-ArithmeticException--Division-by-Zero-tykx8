# Java ArithmeticException: Division by Zero

This repository demonstrates a common but easily missed Java error: the `ArithmeticException` that results from division by zero.  The `Bug.java` file shows the problematic code, while `BugSolution.java` provides a solution.

## Problem

The code attempts to divide an integer by zero, leading to an unexpected program crash. This is a runtime exception, so it doesn't halt compilation but rather stops execution at the point of the error.

## Solution

The `BugSolution.java` file demonstrates how to mitigate this issue by adding a check to prevent division by zero.