# Strategy Design Pattern - Robot Example

## Output
```
i am talking
i cant talk
i am flying
```

## What is Strategy Design Pattern?
Separates **changeable behaviors** from the **fixed Robot class**.
Behaviors can be swapped at runtime without changing the Robot.

## Project Structure
```
strategic-design-algo/
├── implementations/
│   ├── flyingrelated/
│   │   ├── flying.java
│   │   └── noflying.java
│   ├── talkrelated/
│   │   ├── talking.java
│   │   └── notalking.java
│   └── walkrelated/
│       ├── walking.java
│       └── nowalking.java
├── interfaces/
│   ├── flyinginterface.java
│   ├── walkinginterface.java
│   └── Talkhinginterface.java
├── Robot.java
├── Main.java
└── README.md
```

## How to Run
```bash
javac "Main.java"
java Main
```

## Key Takeaway
- Robot class never changes ✅
- Just swap flying/walking/talking behavior anytime ✅"# Strategic-design-algo-system-design-" 
"# Strategic-design-algo-system-design-" 
