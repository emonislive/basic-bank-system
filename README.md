# Java Basic Bank System

A console-based Basic Bank System developed in Java that simulates simple banking operations such as deposit, withdrawal, and balance checking, with basic rules and charges applied.

## Features

- View current balance (with $1.00 service charge)
- Deposit any amount (no charge)
- Withdraw funds (minimum $100, with 0.5% fee)
- View banking rules and regulations
- Menu-driven interface with simple navigation
- Structure ready for transaction history feature (to be implemented)

## How to Run

### Prerequisites

- Java 21 (OpenJDK)
- IDE (recommended): JetBrains IntelliJ IDEA

### Steps

1. Clone this repository or download the `BasicBankSystem.java` file.
2. Open JetBrains IntelliJ IDEA.
3. Go to `File` > `Open...`, and select the folder containing `BasicBankSystem.java`.
4. IntelliJ will automatically detect the Java SDK. If not, select Java 21 manually.
5. To run the program:
   - Right-click on `BasicBankSystem.java`
   - Choose `Run 'BasicBankSystem.main()'`

### Or run via terminal:

```bash
javac BasicBankSystem.java
java BasicBankSystem
```

## Usage

Once the program starts, you'll be presented with a menu:

```
*****************
 BANKING PROGRAM 
*****************
1. Show Balance
2. Deposit
3. Withdraw
4. Check History of The Transactions
5. Rules Regulations
6. Exit
*****************
Enter your choice (1-6): 
```

### Example Rules

- $1.00 is charged when checking the balance.
- You can deposit any positive amount for free.
- Withdrawals must be at least $100 and incur a 0.5% fee.
- Invalid or non-integer input handling is under development.

## Developer Notes

- Future work includes adding a transaction history log with timestamps.
- Input validation for non-integer entries is suggested for stability.
- Structured to allow easy extension or conversion into a GUI-based application.

## Tech Stack

- Java Version: OpenJDK 21
- IDE Used: JetBrains IntelliJ IDEA

## License

This project is open-source and available under the MIT License.
