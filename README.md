# 🎮 Game Service Project – CS 230 Milestone

Hey there! I'm Julliane Pamfilo, and this is my take on a fun little Java project where I got to play with two really important design patterns: **Singleton** and **Iterator**. The goal? Build a system that lets us create and manage games without accidentally duplicating the core service behind it.

## ✨ What I Built

- ✅ A `GameService` that **only exists once** (thanks, Singleton pattern!)
- 🔄 A way to look through and manage games using Java’s **Iterator**
- 🧪 A test setup to double-check that I’m really working with one `GameService`
- 🎮 Creating multiple games with unique IDs and names

## 🚀 How to Run This

Here’s how you can get it running on your machine:

### 1. Clone the Repo (if it's on GitHub)

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

### 2. Open in VS Code (or any IDE you like)

I used VS Code, but you could use Eclipse, IntelliJ, or NetBeans too.

### 3. Compile Everything

In the terminal, run:

```bash
javac src/com/gamingroom/*.java
```

### 4. Run the App

Then run this to see it in action:

```bash
java com.gamingroom.ProgramDriver
```

### 5. What You’ll See

- Two games being created: “Game #1” and “Game #2”
- A message confirming the Singleton pattern is working properly
- A total count of games in memory (should only be 2!)

---

## 🗂️ What’s Inside

| File                    | What It Does                                               |
|-------------------------|------------------------------------------------------------|
| `GameService.java`      | My main logic — it handles creating games & is a Singleton |
| `ProgramDriver.java`    | Where it all begins — starts the app and adds games        |
| `SingletonTester.java`  | Just a helper to double-check my Singleton really works     |
| `Game.java`             | A basic game model (ID + name)                             |
| `Team.java` & `Player.java` | Included but not used for now — maybe later 😄         |

---

## 💬 Why This Project Matters

This was all about **thinking like a real developer** — making smart choices about how code is shared and reused. Singleton helps make sure I’m not creating unnecessary duplicates, and the Iterator lets me look through my list of games in a clean, efficient way.

Thanks for checking out my project! 😊 Feel free to explore the code, give feedback, or try making your own version of it!
