# Workshop 6 – Java Collections & OOP Concepts

Java 21 环境，每题一个独立可运行的类，无需第三方库。

## 目录结构

```
Workshop6_Java/
├── src/
│   ├── Exercise1.java   第 1 题：10 首歌与歌手（数组）
│   ├── Exercise2.java   第 2 题：冒泡排序，按歌名字母顺序输出
│   ├── Exercise3.java   第 3 题：翻转句子中每个单词的字母
│   ├── Exercise4.java   第 4 题：按密码表解码 "G tgsl Qefe."
│   ├── Exercise5.java   第 5 题：在 10 段文字中搜索短语
│   ├── Exercise6.java   第 6 题：类变量 / 实例变量 + 输出验证
│   ├── Boxes.java       第 7 题：Boxes 类（构造器、setSize、toString、draw）
│   └── Exercise7.java   第 7 题：驱动类，测试 Boxes
├── bin/                 编译输出（可删除，重新编译会自动生成）
├── .vscode/settings.json
└── README.md
```

## 在 VS Code 里运行

1. 打开 VS Code，File → Open Folder，选择 `Workshop6_Java` 文件夹。
2. 打开 `src` 下任意一个 `ExerciseN.java`，点编辑器右上角的 ▷（Run Java）即可运行，输出在"终端 / TERMINAL"面板。
3. 也可以打开终端（Terminal → New Terminal）手动执行：

```powershell
javac -encoding UTF-8 -d bin src\*.java
java -cp bin Exercise1
```

把 `Exercise1` 换成 `Exercise2` … `Exercise7` 即可运行其它题。第 7 题请运行 `Exercise7`（它会调用 `Boxes`）。

## 各题实现要点

| 题号 | 文件 | 关键做法 |
|---|---|---|
| 1 | Exercise1.java | 两个 `String[]` 数组按同一下标配对，循环逐一输出 |
| 2 | Exercise2.java | 冒泡排序，用 `compareToIgnoreCase` 比较歌名；交换歌名时同时交换对应歌手，保证配对不乱 |
| 3 | Exercise3.java | 按空格 `split` 成单词数组，对每个单词转 `char[]` 后从尾到头复制字母；句尾标点留在原位置 |
| 4 | Exercise4.java | 用字母表 `alphabet` 与密码表 `key` 两个数组同下标映射；大写字母输出时保持大写，空格和标点原样保留 |
| 5 | Exercise5.java | `String.contains()` 判断，命中则输出数组下标和段落；未命中输出提示。改 `phrase` 变量即可换搜索词 |
| 6 | Exercise6.java | 复现题目代码并输出结果，答案见下一节 |
| 7 | Boxes.java + Exercise7.java | `Boxes` 提供构造器、`setSize`、`toString`、`draw()`；`draw()` 用 `-` 画上下边、`|` 画两侧；另有 `drawWithUnicodeLine()` 用 `\u2500` 画横线；尺寸限定 1–10 |

## Exercise 6 答案

**类变量（class variable）**：`x`。它被声明为 `public static int x = 7`，属于类本身，所有对象共享同一份。

**实例变量（instance variable）**：`y`。它被声明为 `public int y = 3`，每个对象各有一份，互不影响。

**程序输出**：

```
a.y = 5
b.y = 6
a.x = 2
b.x = 2
IdentifyMyParts.x = 2
```

原因：`y` 是实例变量，`a.y = 5`、`b.y = 6` 分别改的是两个对象自己的副本；`x` 是静态变量，`a.x = 1` 后又被 `b.x = 2` 覆盖，三个入口读到的都是最后赋的 2。

## 各题实际运行结果

```
Exercise3  →  Reversed: oT eb ro ton ot eb.
Exercise4  →  Decoded message: I like Java.
Exercise7  →  Box size: 5 x 5 / 5 x 5 的方框，Box size: 8 x 8 / 8 x 8 的方框
```

## 备注

- 代码中未使用中文注释，可直接截图提交。
- 作业要求把代码上传 GitHub 并在文档里填链接，这一步需要你自己在 GitHub 建仓库后推送：

```powershell
git init
git add .
git commit -m "Workshop 6 Java exercises"
git branch -M main
git remote add origin https://github.com/<你的用户名>/<仓库名>.git
git push -u origin main
```

- 截图时建议只截"代码 + 终端输出"两部分，每个 `ExerciseN.java` 单独截一张。
