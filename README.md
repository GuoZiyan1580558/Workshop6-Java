# Workshop 6 – Java Collections & OOP Concepts

Java 21. Every exercise is a standalone class with a `main` method, and no third-party libraries are required.

## Project structure

```
Workshop6_Java/
├── src/
│   ├── Exercise1.java   Exercise 1 – 10 favourite songs and their artists (arrays)
│   ├── Exercise2.java   Exercise 2 – bubble sort, songs printed in alphabetical order
│   ├── Exercise3.java   Exercise 3 – reverse the letters of every word in a sentence
│   ├── Exercise4.java   Exercise 4 – decode "G tgsl Qefe." with the given key
│   ├── Exercise5.java   Exercise 5 – search a phrase in 10 paragraphs
│   ├── Exercise6.java   Exercise 6 – class variable / instance variable and its output
│   ├── Boxes.java       Exercise 7 – Boxes class (constructor, setSize, toString, draw)
│   └── Exercise7.java   Exercise 7 – driver class that tests Boxes
├── bin/                 compiled output (ignored by Git, regenerated on build)
├── .vscode/settings.json
├── .gitignore
└── README.md
```

## How to run

1. Open VS Code, choose **File → Open Folder** and select the `Workshop6_Java` folder.
2. Open any `ExerciseN.java` file under `src` and click the **Run Java** button (▷) in the top-right corner of the editor. The result appears in the **Terminal** panel.
3. Alternatively, run the commands below in the VS Code terminal:

```powershell
javac -encoding UTF-8 -d bin src\*.java
java -cp bin Exercise1
```

Replace `Exercise1` with `Exercise2` … `Exercise7` to run the other exercises. For Exercise 7 run `Exercise7`, because it calls the `Boxes` class.

## Implementation notes

| Exercise | File | Approach |
|---|---|---|
| 1 | Exercise1.java | Two `String[]` arrays (songs and artists) are paired by the same index and printed in a loop. |
| 2 | Exercise2.java | Bubble sort compares neighbouring titles with `compareToIgnoreCase`. When two titles are swapped, the matching artists are swapped too, so the pairs stay correct. |
| 3 | Exercise3.java | The sentence is split on spaces, each word is converted to a `char[]` and its letters are copied from the end to the start. Trailing punctuation stays in place. |
| 4 | Exercise4.java | Two arrays, `alphabet` and `key`, are mapped by the same index. Upper-case input stays upper-case, and spaces or punctuation are printed unchanged. |
| 5 | Exercise5.java | `String.contains()` checks each paragraph. Matching paragraphs are printed with their array index, and a "not found" message is printed when nothing matches. Change the `phrase` variable to search for something else. |
| 6 | Exercise6.java | Reproduces the code from the worksheet and prints its output; the answers are below. |
| 7 | Boxes.java + Exercise7.java | `Boxes` provides a constructor, `setSize`, `toString` and `draw()`. The box uses `-` for the top and bottom edges and `|` for the sides; `drawWithUnicodeLine()` draws the horizontal edges with `\u2500`. Sizes are limited to 1–10. |

## Exercise 6 answers

**Class variable:** `x`, declared as `public static int x = 7`. It belongs to the class itself, so every object shares the same copy.

**Instance variable:** `y`, declared as `public int y = 3`. Each object gets its own copy, and the copies are independent.

**Program output:**

```
a.y = 5
b.y = 6
a.x = 2
b.x = 2
IdentifyMyParts.x = 2
```

Why: `y` is an instance variable, so `a.y = 5` and `b.y = 6` change separate copies. `x` is static, so `a.x = 1` is overwritten by `b.x = 2`, and all three ways of reading it return the last value, 2.

## Sample output

```
Exercise 3  →  Reversed: oT eb ro ton ot eb.
Exercise 4  →  Decoded message: I like Java.
Exercise 7  →  Box size: 5 x 5 followed by a 5 x 5 box, then Box size: 8 x 8 followed by an 8 x 8 box
```

## Notes

- The source files contain no comments in Chinese, so they can be used directly in the answer screenshots.
- Screenshots are best taken with both the code and the terminal output visible, one screenshot per exercise class.
