# Group 3: Bank System 
**Date Given**: 10/28/2024 </br> **Date Started**: 11/04/2024 </br> **Deadline**: 12/10/2024

## CLI/GUI Bank System Requirements:
- [x] Create Bank Account
- [x] Check balance
- [x] Deposit
- [x] Withdraw
- [x] Transfer money
- [x] Receipt
- [x] Transaction History

## How to Run
### 1. Using Netbeans
- ```Main.java``` is the main method. Select then ```Shift + F6``` to run.

#### Java version incompatible fix:
- Open "pom.xml" and change maven compiler ```23``` version to system's current java version. Use ```java --version``` in cmd to check the current java version.

``` 
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.release>23</maven.compiler.release>
    <exec.mainClass>com.mycompany.banksystem.BankSystem</exec.mainClass>
</properties>
```

### 2. Using JAR file (If installed java version is 23)
- Location: ```"...\BankSystem\target\BankSystem"```
- Run executable jar file