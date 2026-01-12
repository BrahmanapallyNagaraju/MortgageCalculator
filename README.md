# Mortgage Calculator 🏠💸

**Simple console program that calculates monthly mortgage payments.**

---

## Overview

This small Java console app prompts for the loan principal, annual interest rate, and loan period (years), then computes and prints the monthly mortgage payment.

## Features ✅

- Interactive command-line input
- Input validation for sensible ranges
- Formatted currency output

## Prerequisites 🔧

- Java 8 or later installed
- A terminal (Command Prompt, PowerShell) or an IDE (e.g., IntelliJ IDEA, Eclipse)

## Build & Run (command line) 🔁

From the project root:

1. Compile:

```bash
javac -d out src/com/learnjava/Main.java
```

2. Run:

```bash
java -cp out com.learnjava.Main
```

Tip: You can also import the project into an IDE and run the `com.learnjava.Main` class directly.

## Usage Example ✍️

Run the program and enter values when prompted (example input shown):

```
Principal ($1k - $1M): 200000
Annual Interest Rate: 3.75
Period (Years): 20
Mortgage: $1,185.98
```

> Note: The application validates inputs:
> - Principal must be between 1,000 and 1,000,000
> - Annual interest must be between 1 and 30
> - Period must be between 1 and 30 years

## Project Structure 📁

```
README.md
src/
  com/learnjava/
    Main.java
```

## Acknowledgements 🙏

This project follows the mortgage calculator implementation from the **Programming with Mosh** YouTube channel: https://www.youtube.com/watch?v=eIrMbAQSU34

## Contributing 🤝

Contributions are welcome. Open an issue or submit a pull request with suggested improvements (examples: input tests, CLI flags, unit tests).
