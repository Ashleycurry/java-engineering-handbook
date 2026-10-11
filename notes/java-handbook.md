# Java 学习笔记

## 第一阶段：Java核心与AI基础开发

**课程介绍与学习路线**（依据《课程简介》课件整理）

- 课程定位：培养 AI 新时代 Java 工程师。Java SE 基础篇包含的主要内容：Java 开发环境搭建、IDEA 开发工具、Java 基础语法、面向对象思想（封装、继承、多态、抽象类、接口）。
- 课程背景：AI（Artificial Intelligence，人工智能）大模型是指具有极大规模、高度复杂性和强大能力的人工智能系统。围绕大模型有三种方向：
  - 开发大模型：通过开发大模型，开发智能产品；
  - 微调大模型：通过行业数据，优化大模型；
  - 应用大模型：信息检索、内容分析、生成、辅助编程（自动补全代码、生成代码片段等）。
- 学习三步走：**01 扎实的基本功 → 02 建立编程思维 → 03 结合 AI 编码**。

### 第一章：Java开发环境搭建

本章内容总览：Java 背景介绍、JDK 工具的下载和安装、第一个 Java 程序 HelloWorld、Java 程序执行原理、Java 环境配置。

**Java 背景介绍**

核心结论：Java 是由 James Gosling（詹姆斯·高斯林）于 1995 年在 Sun 公司开发的一门计算机高级编程语言，在 2009 年被 Oracle 公司收购。高斯林被称为"Java 之父"。

人物信息补充：詹姆斯·高斯林 1955 年出生于加拿大，1977 年获得卡尔加里大学计算机学士学位，1983 年获得卡内基梅隆大学计算机博士学位。

学习 Java 能做什么（Java 的应用领域）：

- 桌面应用开发：如 IDEA、Eclipse；
- 企业级应用开发：微服务、大型互联网应用（这是 Java 的主要应用方向）；
- 移动应用开发：Android；
- 服务器系统：应用的后台；
- 大数据开发：hadoop；
- 游戏开发：我的世界 MineCraft。

Java 的三大技术平台：

| 平台 | 英文全称 | 定位 |
| --- | --- | --- |
| Java SE | Java Standard Edition | 标准版，Java 技术的核心和基础 |
| Java EE | Java Enterprise Edition | 企业版，企业级应用开发的一套解决方案 |
| Java ME | Java Micro Edition | 小型版，针对移动设备应用的解决方案 |

本节问答巩固（对应课件总结页）：

- Java 是什么？—— 一门高级编程语言。
- Java 是哪家公司研发的、现在属于哪家公司？—— Sun 公司研发，现在属于 Oracle 公司。
- Java 之父是谁？—— 詹姆斯·高斯林。
- Java 能做什么？—— 基本上什么都可以干，主要做企业服务端开发。
- Java 有哪三大使用平台？—— JavaSE（标准版）、JavaEE（企业版）、JavaME（小型版）。

**JDK 工具的下载和安装**

核心结论：开发 Java 程序必须先安装好 JDK（Java Development Kit），也就是 Java 开发工具包。

- LTS 版本（Long-Term-Support，长期支持版本）：JDK 7、JDK 8、JDK 11、JDK 17、JDK 21；很多企业还在使用 JDK 8 / JDK 11。
- 下载渠道：在 Oracle 的官网可以找到 JDK 的下载链接（课件引用页面标题：Java Downloads | Oracle 中国）。
- 安装完成后，通过 CMD 命令行测试是否安装成功，步骤为：
  1. 同时按下键盘上的 Win + R 键，会打开一个运行窗口；
  2. 在窗口中输入 `cmd`，然后按下键盘上的 Enter 键，弹出 DOS 窗口；
  3. 在 DOS 窗口输入命令，测试 Java 工具及其版本是否正确。

```bash
java -version
javac -version
```

- javac、java 命令的作用：我们写好的 Java 程序都是高级语言，计算机底层是硬件，不能识别这些语言，必须先通过 javac 编译工具进行翻译，然后再通过 java 执行工具执行，才可以驱动机器干活。

JDK 的组成（由外到内）：

- JDK（Java Development Kit）：Java 开发工具包，包括下面的所有内容；
- JRE（Java Runtime Environment）：Java 的运行环境；
- JVM（Java Virtual Machine）：Java 虚拟机，真正运行 Java 程序的地方；
- 核心类库：Java 自己写好的程序，给程序员的程序调用的；
- 开发工具：javac、java 等命令程序。

本节问答巩固：

- 要使用 Java 必须先安装什么？去哪里下载？—— JDK（Java Development Kit，开发者工具包）；Oracle 官网。
- LTS 版本有哪些？很多企业还在使用哪个 JDK 版本？—— JDK 8、11、17、21；很多企业还在使用 JDK 8 / JDK 11。
- 如何验证 JDK 是否安装成功？—— 打开命令行窗口，输入 `java -version`、`javac -version` 看版本号。
- JDK 中最重要的 2 个命令程序是什么？各自的作用是啥？—— `javac`（编译工具）、`java`（执行工具）。

⚠️ 问题：课件中多处把命令写成 `java –version`，其中"–"是排版用的长破折号，会在命令行中导致"命令不存在"类错误。
修正建议：实际输入时使用半角连字符 `-`，即 `java -version`、`javac -version`。

**DOS 常用命令（课件补充）**

核心结论：DOS 窗口（命令行窗口）是后续编译、运行 Java 程序的主要场所，以下命令必须熟练。

| 命令 | 作用 |
| --- | --- |
| 盘符: | 切换盘符：D:、E: |
| dir | 查看当前路径下的文件信息 |
| cd | 进入单级目录：cd itheima；回退到上一级目录：cd ..；回退到盘符根目录：cd / |
| cls | 清屏 |
| tab | 自动补全指定字符开头的单词 |
| ↑键 | 查看历史命令 |
| ↓键 | 查看历史命令 |
| exit | 退出 |

**第一个 Java 程序 HelloWorld**

核心结论：Java 程序的开发步骤一共三步——1. 编写代码；2. 编译代码；3. 运行代码。编译命令为 `javac 程序名.java`，运行命令为 `java 程序名`。编写好的文件叫 HelloWorld.java，是源代码文件。

Hello World 程序：

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(" Hello World !");
    }
}
```

代码逐行说明（课件标注）：

- `class`：定义一个类，后面跟上的是类名称；
- `main` 方法：程序执行时的入口点，main 方法也称之为"主方法"；
- `System.out.println(...)`：打印语句，使程序在控制台打印双引号所包裹的内容；
- `public`：权限修饰符，后面会详细讲解；对于 public 暂时可以理解为：限制类名称和文件名需要保持一致。

Java 代码编写的基本要求：

- 文件名称的后缀必须是 `.java` 结尾；
- 文件名称必须与代码的类名称一致；
- 必须使用英文模式下的符号。

初学者写 HelloWorld 常遇到的 6 个错误（课件逐一示例并给出解决办法）：

1. Windows 的文件扩展名没有勾选。解决方案：必须勾选文件扩展名，再新建 Java 文件；
2. 代码写了，但是忘记保存了；
3. 文件名和类名不一致；
4. 大小写错误、单词拼写错误、存在中文符号、找不到 main 方法；
5. 括号不配对；
6. 编译、执行工具使用不当。

**Java 程序执行原理**

核心结论：计算机底层都是硬件电路，可以通过不通电和通电表示 0、1；机器语言就是由 0 和 1 组成的指令（例如 00011100 00110101）。最早期的程序员就是通过机器语言编程的。高级语言更简单，使用接近人类自己的语言书写代码，但最终都要被翻译成计算机能理解的机器指令。

编程语言发展历程：机器语言 → 汇编语言 → 高级语言。

Java 程序的编译运行过程：

1. 编写 `.java` 源代码文件（高级语言代码）；
2. 用 `javac` 编译工具把源代码"翻译"成可供 JVM 执行的 class 文件；
3. 用 `java` 执行工具启动 JVM 运行程序，JVM 把程序最终翻译成机器指令驱动机器干活。

Java 跨平台：在需要运行 Java 应用程序的操作系统上，安装一个与操作系统对应的 Java 虚拟机（JVM，Java Virtual Machine）即可——Windows 装 Windows 版 JVM、Linux 装 Linux 版 JVM、MacOS 装 MacOS 版 JVM。因此同样的 Java 程序可以在不同的操作系统中运行，这就是 Java 的"跨平台"。

本节问答巩固：

- Java 程序的执行原理是什么样的？—— 不管是什么样的高级编程语言，最终要翻译成计算机底层可以识别的机器语言；
- 机器语言是由什么组成的？—— 0 和 1；
- Java 跨平台指的是什么？原理又是什么？—— Java 程序可以在任意操作系统中运行；原理是在不同的操作系统中，安装与之对应版本的 JVM 虚拟机。

**Java 环境配置（Path 与 JAVA_HOME）**

核心结论：Path 环境变量用于记住程序路径，方便在命令行窗口的任意目录启动程序。

关键操作与细节：

- Path 环境变量的位置：此电脑 → 属性 → 高级系统设置 → 高级 → 环境变量；
- Path 环境变量的原理：当在 Path 中配置了某个程序路径后，在命令行窗口启动程序时，系统会到 Path 记录的路径中查找该程序，所以配置之后，在命令行窗口的任意目录都可以使用 javac 和 java；
- 配置值示例：`E:\develop\Java\jdk21\bin`（这是课件中的本机路径，不要照抄，要按自己电脑上 JDK 的实际安装路径去复制）；
- 版本差异：目前较新的 JDK 安装时会自动配置 javac、java 程序的路径到 Path 环境变量中去，因此 javac、java 可以直接使用；以前的老版本 JDK 在安装时没有自动配置 Path 环境变量，此时必须自己配置；
- 重新配置了环境变量后，必须检测是否配置成功：打开命令行窗口，输入 `java -version` 看版本提示；
- JAVA_HOME：告诉操作系统 JDK 安装在了哪个位置（将来其他技术要通过这个环境变量找 JDK）。

本节问答巩固：

- 什么是 Path 环境变量？—— 用于配置程序的路径，方便我们在命令行窗口的任意目录下启动该程序；
- JDK 安装时，关于环境变量的配置需要注意什么？—— 较新版本的 JDK 会自动配置 PATH 环境变量，较老的 JDK 版本则不会；建议还是自己配置一下 PATH、JAVA_HOME。

本节收束：本章要记住四件事——Java 的出身与三大平台；JDK 是开发 Java 的必备工具包（内部包含 JRE、JVM、核心类库、javac/java 等开发工具）；程序开发三步走"编写 → 编译 → 运行"；通过 Path/JAVA_HOME 让 javac、java 命令在任何目录都能使用。

### 第二章：IDEA开发工具

本章内容总览：IDEA 介绍和安装、IDEA 中的第一个代码、IDEA 使用操作。课件主题词：工欲善其事必先利其器。

**IDEA 的介绍和安装**

核心结论：IDE 集成环境就是把代码编写、编译、执行、调试等多种功能综合到一起的开发工具；使用高级开发工具可以帮助我们编写程序、提高开发效率。IDEA 全称 IntelliJ IDEA，是目前使用最多的 Java 开发集成环境。

- 常见 Java 开发工具：IntelliJ IDEA、Eclipse、NetBeans；
- IDEA 官方网站（课件引用）：IntelliJ IDEA – the Leading Java and Kotlin IDE（jetbrains.com）。

**IDEA 中的第一个代码（项目代码结构）**

核心结论：IDEA 创建 Java 项目的代码结构层次为：Project（项目）→ Module（模块）→ Package（包）→ Class（类）。

- Project、Module、Package 本质来讲都是文件夹，用来管理类文件；
- 项目结构的例子：一个项目中有商品模块、搜索模块、购物车模块、订单模块；每个模块内部又可以划分为前端交互代码、业务代码、数据访问代码；
- 课件建议：整个基础篇创建一个 Project，今后每一天都创建一个新的 Module；
- 快捷键入门：生成 main 方法的快捷键是 psvm、main；生成打印数据的快捷键是 sout；
- 界面语言提示：英文看不习惯的同学可以考虑暂时安装一个中文插件，但实际工作中是英文界面。

本节问答巩固：IDEA 中的层级结构是 Project、Module、Package、Class；它们本质是文件夹，用于管理类文件。

**IDEA 使用操作**

核心结论：IDEA 的日常操作分为类操作、模块操作、项目操作三大类，不急于一时，慢慢熟练就好。

IDEA 中的第一个代码——操作步骤：

1. 创建 Project（项目）；
2. 创建 Module（模块）；
3. 常规来说还需要继续在下面创建 Package（包），但第一天可以先忽略，等积累到一些代码量之后，再融入进来；
4. 创建 class 类；
5. 类中编写代码；
6. 完成代码的运行。

类操作：

- 新建类：与创建第一个代码时的方式一样；
- 删除类；
- 修改类。

模块操作：

- 新建模块；
- 删除模块：在 IDEA 中删除模块后，硬盘中这个模块还是存在的，想要完全删除需要手动到硬盘中删除（这是正常现象，不是删除失败）；
- 导入模块；
- 修改模块。

项目操作：

- 新建项目；
- 删除项目；
- 打开项目；
- 修改项目（含关闭项目）。

**常用快捷键（依据 IDEA 使用文档）**

| 快捷键 | 作用 |
| --- | --- |
| psvm + 回车 | 快速生成 main 方法 |
| sout + 回车 | 快速生成输出语句 |
| Ctrl + Alt + L | 格式化代码 |
| Alt + Shift + ↑ | 上移当前行 |
| Alt + Shift + ↓ | 下移当前行 |
| Alt + 回车 | 导入包，自动修正 |
| Ctrl + N | 查找类 |
| Ctrl + R | 替换文本 |
| Ctrl + F | 查找文本 |
| Shift + F6 | 重构-重命名 |
| Ctrl + X | 剪切当前行 |
| Ctrl + D | 复制行 |
| Ctrl + / | 批量加入单行注释，再按一次就是取消 |
| Ctrl + Shift + / | 批量加入多行注释，再按一次就是取消 |
| Alt + 1 | 快速打开或隐藏工程面板 |
| F2 | 高亮错误或警告快速定位 |
| Ctrl + F12 | 可以显示当前文件的结构 |

本节收束：要建立"Project → Module → Package → Class"四个层级的结构意识，掌握类、模块、项目的增删改查操作，并把 psvm、sout 等高频快捷键练成肌肉记忆。

### 第三章：Java基础语法

本章内容总览：注释、关键字、字面量、变量、标识符、数据类型。课件主题词：根基稳，万事可成。

**注释**

核心结论：注释是写在程序中对代码进行解释说明的文字，方便自己和其他人查看，以便理解程序的。

Java 注释的三种写法：

```java
// 单行注释：有效范围是从 // 开始到当前行结尾，只能写一行

/*
多行注释：
注释内容1
注释内容2
*/

/**
文档注释：
注释内容
注释内容
*/
```

课件示例（在 HelloWorld 中加注释）：

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }
}

/**
 * 通过class关键字定义了一个类，类名叫做 HelloWorld
 * public 起到限制作用，限制文件名和类名保持一致
 */
```

细节说明：

- 单行注释：只能写一行；多行注释：可以写多行；文档注释：写在类、方法上用于生成说明文档；
- 注释内容不会参与编译和运行。

本节问答巩固：

- 注释是什么？—— 写在程序中对程序进行解释说明的文字；
- 三种注释的区别？—— 单行注释 `//`、多行注释 `/* */`、文档注释 `/** */`；
- 注释有什么特点？为什么？—— 不影响程序的执行；因为编译后的 class 文件中已经没有注释了。

**关键字**

核心结论：关键字是被 Java 赋予了特定涵义的英文单词。

- Java 中的关键字已经被赋予了特殊的涵义，这些单词不允许使用（不能拿来当类名、变量名等名字）；
- 例如创建类时使用的 `class` 就是一个关键字。

课件列举的关键字（按字母序排列，便于查询）：

abstract、assert、boolean、break、byte、case、catch、char、class、const、continue、default、double、else、enum、extends、final、finally、float、for、goto、if、implements、import、instanceof、int、interface、long、native、new、package、private、protected、public、return、short、static、strictfp、super、switch、synchronized、this、throw、throws、transient、try、void、volatile、while。

容易误解：关键字不只是"语法符号"，它们在任何位置都不能当作标识符（名字）来使用，写代码时看到 IDE 中变色的单词就要警觉。

**字面量**

核心结论：字面量就是程序中能直接书写的数据，学这个知识的重点是搞清楚 Java 程序中数据的书写格式。

常用数据及写法对照：

| 常用数据 | 生活中的写法 | 程序中的写法 | 说明 |
| --- | --- | --- | --- |
| 整数 | 666，-88 | 666，-88 | 写法一致 |
| 小数 | 13.14，-5.21 | 13.14，-5.21 | 写法一致 |
| 字符串 | 黑马程序员 | "HelloWorld"，"黑马程序员" | 程序中必须使用双引号 |
| 字符 | A, 0, 我 | 'A', '0', '我' | 程序中必须使用单引号，有且仅能一个字符 |
| 布尔值 | 真、假 | true、false | 只有两个值：true 代表真，false 代表假 |
| 空值 | （无） | null | 一个特殊的值，空值（后面会讲解作用，暂时不管） |

课件示例代码：

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        System.out.println(10086);
        System.out.println(180.1);
        System.out.println("男");   // 字符串要加双引号
    }
}
```

⚠️ 问题：课件示例中有一行写成 `System.out.println(男);`，`男` 没有加引号，会被当成变量名，代码无法编译。
修正建议：改为 `System.out.println("男");`。

⚠️ 问题：课件的"程序中的写法"一列中，字符串示例使用了中文全角引号（""），复制到代码中无法通过编译。
修正建议：代码中的字符串必须使用英文半角双引号 `"..."`，字符使用英文单引号 `'...'`。

练习：请将自己的个人信息打印在控制台（姓名，年龄，性别，身高，婚姻状况）——字符串信息用双引号包裹、整数/小数直接书写、婚姻状况可以用布尔值 true/false 表示。

本节问答巩固：

- 关键字指的是被 Java 赋予了特定含义的英文单词，关键字我们不允许使用；
- 字面量这个知识要求学会：数据在程序中的书写格式；
- 字符、字符串的书写格式要求：字符必须单引号围起来且有且仅能一个字符；字符串必须用双引号围起来；
- 几个常见的特殊值：true、false、null。

**变量**

核心结论：变量就是内存中的一块区域，可以理解成一个盒子，用来装程序要处理的数据。

变量的完整定义格式：

```java
数据类型 变量名称 = 变量值;
// 例如：
int age = 18;
```

- 数据类型：限制盒子中只能存储某种数据形式，例如 int（整数类型）、double（小数类型）；
- 变量名称：自己起的名字；
- 变量值：要赋给变量的值。

变量的特点：变量里装的数据是可以被替换的。

```java
int age = 18;
age = 19;
System.out.println(age);   // 输出 19
age = age + 1;             // 取出 19 加 1 再装回去
System.out.println(age);   // 输出 20
```

变量的应用场景：写程序对数据进行处理时很方便——使用变量记住要处理的数据，编写的代码更灵活，管理代码更方便。

变量的注意事项（共 6 条）：

1. 变量要先声明才能使用；
2. 变量是什么类型，就必须装什么类型的数据；
3. 变量只在自己所归属的 `{ }` 范围内有效；
4. 同一个范围内，变量的名称不能一样；
5. 变量定义的时候可以不赋初始值，但在使用时，变量里必须有值；
6. 一条语句可以定义多个变量，中间使用逗号分隔。

本节问答巩固：变量是内存中的一块区域（盒子）；定义格式为"数据类型 变量名称 = 数据；"；用变量的好处是代码更灵活、管理更方便；变量的数据可以被替换，所以适合存放程序中会变化的数据。

**标识符**

核心结论：标识符就是给类、方法、变量等起名字的符号。

课件示例：

```java
public class Demo {
    public static void main(String[] args) {
        int salary = 12000;
        System.out.println(salary);
        salary = 15000;
        System.out.println(salary);
        int age = 18;
        System.out.println(age);
    }
}
```

标识符命名规则（硬性要求，必须遵守）：

- 由数字、字母、下划线（_）和美元符（$）组成；
- 不能以数字开头；
- 不能是关键字；
- 区分大小写。

规则判断题（课件练习题）：bj、b2、2b、class、_2b、#itheima、ak47、Class、helloworld 中：

- `2b` 不合法（数字开头）；
- `class` 不合法（是关键字）；
- `#itheima` 不合法（含有不允许的特殊符号 #）；
- `Class` 合法（Java 区分大小写，class 是关键字而 Class 不是），但类名规范性上不推荐这样随意使用大小写变体。

标识符命名规范（软性要求，建议遵守）：

- 小驼峰命名法（用于变量、方法）：标识符是一个单词的时候，所有字母小写（范例：name）；标识符由多个单词组成的时候，从第二个单词开始首字母大写（范例：firstName）；
- 大驼峰命名法（用于类）：标识符是一个单词的时候，首字母大写（范例：Student）；多个单词时每个单词首字母大写（范例：GoodStudent）。

细节说明：不能使用特殊符号（&、%）；命名要做到"见名知义，驼峰命名"。

**数据类型**

核心结论：Java 中的数据类型大体分为两类——基本数据类型、引用数据类型。本阶段重点关注 8 种基本数据类型。

基本数据类型总表（关键字、取值范围、内存占用）：

| 大类 | 关键字 | 取值范围 | 内存占用（字节） |
| --- | --- | --- | --- |
| 整数 | byte | -128~127 | 1 |
| 整数 | short | -32768~32767 | 2 |
| 整数 | int（默认） | -2147483648~2147483647（10 位数） | 4 |
| 整数 | long | -9223372036854775808~9223372036854775807（19 位数） | 8 |
| 浮点数 | float | 1.401298e-45 到 3.402823e+38 | 4 |
| 浮点数 | double（默认） | 4.9000000e-324 到 1.797693e+308 | 8 |
| 字符 | char | 0~65535 | 2 |
| 布尔 | boolean | true、false | 1 |

细节说明：

- e+38 表示乘以 10 的 38 次方，e-45 表示乘以 10 的负 45 次方；
- 所有整数默认是 int 类型，所有小数默认是 double 类型；
- 编码表：是计算机中字节到字符的一套对应关系；课件提到的 ASCII 码表（American Standard Code for Information Interchange，美国信息交换标准代码）就是最常见的编码表之一。

课件示例：

```java
public class Test {
    public static void main(String[] args) {
        System.out.println(10);     // 10 默认是 int
        System.out.println(12.3);   // 12.3 默认是 double
    }
}
```

练习：请将自己的个人信息，使用变量保存，并展示在控制台（与字面量练习相同的需求，这次用变量改写）。

容易误解：

- 整数类型首选 int，小数类型首选 double；
- 定义字符串类型的变量，类型选的是 String（String 属于引用数据类型，不是基本数据类型）；
- char 类型的变量可以接收整数类型的数据——范围 0~65535 内的整数常量可以赋给 char，表示编码表中对应的字符（例如 65 对应 'A'）；char 参与运算时又会按编码提升为 int；
- 由于小数默认是 double，把小数直接赋值给 float 类型变量时不能直接写（需要特殊处理后缀），而 `float f = 3.14;` 这种写法会编译报错。

本节问答巩固：

- Java 中的数据类型大体分为两类，分别是？—— 基本数据类型、引用数据类型；
- 整数类型首选？小数类型首选？—— int、double；
- 定义字符串类型的变量，类型选的是？—— String；
- 所有整数默认是？小数默认是？—— int、double；
- char 类型的变量，可以接收整数类型的数据吗？—— 可以，接收 0~65535 的整数，按编码表对应成字符。

本章收束：本章是 Java 语法的地基——注释用于说明代码；关键字有特殊含义不能乱用；字面量规定数据的书写格式；变量是内存中的盒子（注意 6 条注意事项）；标识符要遵守命名规则和驼峰规范；8 种基本数据类型的取值范围和默认类型要记牢。

### 第四章：运算符

本章内容总览：算数运算符、字符串拼接、自增自减运算符、类型转换、赋值运算符、关系运算符、逻辑运算符、三元运算符、运算符优先级、Scanner 键盘录入。运算符的定义：对变量和字面量操作的符号。

**算数运算符**

核心结论：算数运算符用于对两个数据进行数学运算，包含 `+`（加）、`-`（减）、`*`（乘）、`/`（除）、`%`（取余）。

符号与作用：

| 符号 | 作用 | 说明 |
| --- | --- | --- |
| + | 加 | 与"+"相同 |
| - | 减 | 与"-"相同 |
| * | 乘 | 与"×"相同 |
| / | 除 | 与"÷"相同 |
| % | 取余 | 获取的是两个数据做除法的余数 |

注意事项：

- `/` 和 `%` 的区别：两个数据做除法，`/` 取结果的商，`%` 取结果的余数；
- 整数操作只能得到整数，要想得到小数，必须有浮点数参与运算。

数值拆分案例——需求：将数字 123 拆分出个位、十位、百位后，打印在控制台。

分析过程：

- 个位的计算：数值 % 10 → 123 除以 10（商 12，余数为 3）→ 3；
- 十位的计算：数值 / 10 % 10 → 123 / 10 得 12（整数相除只能得到整数），12 % 10 得 2；
- 百位的计算：数值 / 10 / 10 % 10 → 123 / 10 得 12，12 / 10 得 1，1 % 10 得 1。

公式总结（通用规律）：

- 个位：数值 / 10 % 10 之前的第一步，即 `数值 % 10`；
- 十位：`数值 / 10 % 10`；
- 百位：`数值 / 10 / 10 % 10`；
- 千位：`数值 / 10 / 10 / 10 % 10`；
- 依次类推（每多一位，就多除一次 10）。

输出结果：

```text
整数123的个位为:3
整数123的十位为:2
整数123的百位为:1
```

本节问答巩固：

- 整数相除可以直接得到小数结果吗？—— 不可以，需要加入小数运算；
- 假设给定一个五位数 65536，获取千位的计算公式是？—— `数值 / 10 / 10 / 10 % 10`（65536 → 6553 → 655 → 65，65 % 10 = 5）。

**字符串拼接操作**

核心结论：当 `+` 操作中遇到了字符串，这时 `+` 就是字符串连接符，而不是算术运算。

课件示例与输出结果：

```java
System.out.println(1 + 23);              // 24
System.out.println("年龄为:" + 23);       // 年龄为:23
System.out.println(1 + 99 + "年黑马");    // 100年黑马（先算 1+99=100，再拼接）
System.out.println("年龄为:" + 23 + 1);   // 年龄为:231
System.out.println("年龄为:" + (23 + 1)); // 年龄为:24
```

执行过程拆解（课件示意）：

- `"年龄为:" + 23` → 得到字符串 `"年龄为:23"`（左边是字符串，做拼接）；
- 再 `+ 1` → 得到 `"年龄为:231"`（又变成字符串拼接）。

容易误解：字符串拼接是从左到右依次计算的；一旦前面出现了字符串，后面的 `+` 全部是拼接。想让后面的数字先做加法，必须用括号括起来。

**自增自减运算符**

核心结论：`++` 是自增运算符（变量自身的值加 1），`--` 是自减运算符（变量自身的值减 1）。它们既可以放在变量的后边，也可以放在变量的前边。

使用规律：

- 单独使用时（自己一行，不参与其他运算），`++` 和 `--` 放在前在后没有区别；
- 参与运算使用时：`++` 在前，先自增再操作（即先加 1，再拿新值参与运算）；`++` 在后，先操作再自增（先拿原值参与运算，再加 1）；
- `++`、`--` 只能操作变量，不能操作字面量（例如 `10++` 是错误的写法）。

本节收束：自增自减写起来简单，但"先操作还是先自增"的差别是初学阶段的经典易错点，动手写两个小例子对比输出结果即可掌握。

**类型转换**

核心结论：数据类型之间可以互相转换，分两种——隐式转换（自动发生）和强制转换（手动书写）。转换的取值范围规律：小的可以自动转成大的，大的转小必须强制且可能损失精度。

（1）隐式转换介绍

把一个取值范围小的数值或者变量，赋值给另一个取值范围大的变量（课件比喻：小杯子的水倒进大杯子，4 升 → 8 升）。

```java
public class Test {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println(b);   // 10.0
    }
}
```

数据范围从小到大：byte → short → int → long → float → double（char 也可以参与提升，与 int 按编码表对应）。

（2）运算过程中的隐式转换

规律一：取值范围小的数据，和取值范围大的数据进行运算，小的会先提升为大的之后，再进行运算。

```java
public class Test {
    public static void main(String[] args) {
        int a = 10;
        double b = 12.3;
        double c = a + b;   // a 先提升为 double，再做加法
    }
}
```

规律二：byte、short、char 三种数据在运算的时候，都会提升为 int，然后再进行运算。

```java
public class Test {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = a + b;   // 报错：a + b 已提升为 int，byte 装不下 int 结果
    }
}
```

正确写法（改为 int 接收）：

```java
public class Test {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a + b;
    }
}
```

char 参与运算的案例（字符和数字相加）：

```java
public class Test {
    public static void main(String[] args) {
        int a = 1;
        char b = 'a';
        int c = a + b;
        System.out.println(c);   // 98（'a' 对应编码 97，97 + 1 = 98）
    }
}
```

（3）强制类型转换

把一个取值范围大的数值或者变量，赋值给另一个取值范围小的变量时，不允许直接赋值，需要加入强制转换。

格式：

```java
目标数据类型 变量名 = (目标数据类型) 被强转的数据;
```

```java
public class Test {
    public static void main(String[] args) {
        double a = 12.3;
        int b = a;          // 报错：double 不能直接赋给 int
        int b = (int) a;    // 正确：强制转换
        System.out.println(b);   // 12（小数部分被舍弃）
    }
}
```

细节说明与容易误解：

- 强制类型转换有可能造成精度损失（如上例 12.3 → 12，小数部分直接丢掉）；
- 隐式转换发生在"赋值"和"运算"两个场景：赋值时小的给大的，运算时小的先提升为大的；
- byte、short、char 一参与运算就会提升为 int，因此 `byte c = a + b;` 这类写法必错，要用 int 接收。

本节问答巩固总结（课件总结页）：基本隐式转换——取值范围小的数值/变量赋值给范围大的变量；运算中的隐式转换——小的先提升为大的，byte/short/char 提升为 int；强制类型转换——大的给小的赋值需要强转，且可能精度损失。

**赋值运算符**

核心结论：赋值运算符用于把数据存到变量中，分为基本赋值运算符和扩展赋值运算符。

| 符号 | 作用 | 说明 |
| --- | --- | --- |
| = | 赋值 | a=10，将 10 赋值给变量 a |
| += | 加后赋值 | a+=b，将 a + b 的值给 a |
| -= | 减后赋值 | a-=b，将 a - b 的值给 a |
| *= | 乘后赋值 | a*=b，将 a × b 的值给 a |
| /= | 除后赋值 | a/=b，将 a ÷ b 的商给 a |
| %= | 取余后赋值 | a%=b，将 a ÷ b 的余数给 a |

细节说明：扩展赋值运算符隐含了强转效果，例如 `byte b = 10; b += 5;` 相当于 `b = (byte)(b + 5);`，所以写起来不会像 `b = b + 5;` 那样报类型错误。

**关系运算符**

核心结论：关系运算符用于判断两个数据之间的关系，最终返回 boolean 类型的结果（成立为 true，不成立为 false）。

| 符号 | 说明 |
| --- | --- |
| == | a==b，判断 a 和 b 的值是否相等 |
| != | a!=b，判断 a 和 b 的值是否不相等 |
| > | a>b，判断 a 是否大于 b |
| >= | a>=b，判断 a 是否大于等于 b |
| < | a<b，判断 a 是否小于 b |
| <= | a<=b，判断 a 是否小于等于 b |

容易误解：`==` 和 `=` 不要弄混——`=` 是赋值（把右边的值放进左边），`==` 是比较（左边和右边是否相等）。

**逻辑运算符**

核心结论：逻辑运算符用于把多个条件（布尔类型的表达式或值）连接在一起运算，最终返回布尔类型的值 true、false。

引入案例——需求：在程序中判断一个学生成绩是否在 90~100 之间，是的话程序输出优秀。

```java
public class Test {
    public static void main(String[] args) {
        int score = 95;
        System.out.println(score >= 90);    // true
        System.out.println(score <= 100);   // true
    }
}
```

两个条件各自输出 true，但这样并没有"合并"成一个判断；逻辑运算符的作用就是把两个条件合并在一起判断。

基本逻辑运算符：

| 符号 | 介绍 | 说明 |
| --- | --- | --- |
| & | 逻辑与 | 并且，遇 false 则 false |
| \| | 逻辑或 | 或者，遇 true 则 true |
| ! | 逻辑非 | 取反 |
| ^ | 逻辑异或 | 相同为 false，不同为 true |

短路逻辑运算符：

| 符号 | 介绍 | 说明 |
| --- | --- | --- |
| && | 短路与 | 作用和 & 相同，但是有短路效果 |
| \|\| | 短路或 | 作用和 \| 相同，但是有短路效果 |

短路效果详解：

- 逻辑与 `&`：无论左边 true 还是 false，右边都要执行；
- 短路与 `&&`：如果左边为 true，右边执行；如果左边为 false，右边不执行（左边已经能决定结果为 false 了）；
- 逻辑或 `|`：无论左边 true 还是 false，右边都要执行；
- 短路或 `||`：如果左边为 false，右边执行；如果左边为 true，右边不执行（左边已经能决定结果为 true 了）。

细节说明：实际开发中最常用的逻辑运算符是 `&&`、`||`、`!`。

本节问答巩固：

- `&`：遇 false 则 false；
- `&&`：左边为 false，右边不执行；
- `|`：遇 true 则 true；
- `||`：左边为 true，右边不执行了；
- `!`：取反；
- `^`：相同是 false、不同是 true。

**三元运算符**

核心结论：三元运算符用于根据判断条件，从两份数据中二者选其一。

格式：

```java
判断条件 ? 值1 : 值2;
```

执行流程：

1. 首先计算判断条件的值；
2. 如果值为 true，值 1 就是运算结果；
3. 如果值为 false，值 2 就是运算结果。

**运算符优先级**

核心结论：不同运算符的优先级不同，课件通过一个综合案例来理解——`&&` 的优先级高于 `||`。

```java
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a > b || a < b && a > b);
    }
}
```

结果分析：由于 `&&` 优先级高于 `||`，上面表达式等价于下面的加括号写法：

```java
System.out.println(a > b || ( a < b && a > b ));
```

计算过程：a > b 为 false；a < b 为 true；a > b 为 false → `false || (true && false)` → `false || false` → 最终输出 false。

括号演示（课件对比案例）：

```java
System.out.println((a > b || a < b) && a > b);   // (false || true) && false → true && false → false
```

细节说明：括号可以改变运算的先后顺序；当不确定优先级时，加括号是最稳妥的做法（也让代码可读性更好）。

**Scanner 键盘录入**

核心结论：使用 Java 提供的 Scanner 类来接收用户键盘输入的数据（Scanner 是 Java 已经写好的实现程序，我们调用即可）。

需求：请在程序中，提示用户通过键盘输入自己的姓名、年龄，并能在程序中收到这些数据。

使用 Scanner 需要三个步骤：

1. 导包：告诉程序去 JDK 的哪个包中找扫描器技术 → `import java.util.Scanner;`（写在类上面，目前照抄）；
2. 抄代码（创建对象）：代表得到键盘扫描器对象 → `Scanner sc = new Scanner(System.in);`（目前照抄）；
3. 抄代码（调用方法接收数据）：等待接收用户输入数据。

完整代码：

```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("年龄是：" + age);
        System.out.println("请输入您的名称： ");
        String name = sc.next();
        System.out.println("欢迎： " + name);
    }
}
```

接收数据的常用方法：

- `sc.nextInt()`：接收整数；
- `sc.next()`：接收字符串；
- `sc.nextDouble()`：接收浮点数。

容易误解：导包语句必须写在类的外面（程序最上方），写在 main 方法里会报错；三个步骤缺一不可。

本节收束：运算符是程序的"计算引擎"——算数运算符负责四则运算与取余，`+` 遇到字符串变成拼接，自增自减注意先后位置，类型转换牢记"小转大自动、大转小强制"，逻辑运算优先使用 `&&`、`||`，三元运算符实现二选一，Scanner 让程序能与用户交互。

### 第五章：方法

本章内容总览：方法的介绍、方法的基本定义和调用、方法的执行流程、带参数的方法、带返回值的方法、方法通用定义格式、方法注意事项、方法重载、IDEA 安装 AI 插件。方法的定义：函数，实现特定功能的操作步骤集合。

**方法的介绍**

核心结论：方法（method，也叫函数）是一段具有独立功能的代码块，不调用就不执行。

问题引入（黑马商城案例）：查看全部商品（50 行代码）、上架商品（50 行代码）、下架商品（50 行代码）、修改商品（50 行代码）全挤在 main 方法里，非常臃肿。

改造思路：把每个功能封装成独立的方法——`showGoodsInfo()`（查看全部商品）、`addGoods()`（上架商品）、`deleteGoods()`（下架商品）、`updateGoods()`（修改商品）：

```java
public class Test {
    public static void main(String[] args) {
        showGoodsInfo();
        addGoods();
        deleteGoods();
        updateGoods();
    }

    /** 查看全部商品 */
    public static void showGoodsInfo(){ ... }
    /** 上架商品 */
    public static void addGoods(){ ... }
    /** 下架商品 */
    public static void deleteGoods(){ ... }
    /** 修改商品 */
    public static void updateGoods(){ ... }
}
```

方法出现的好处：

- 可以将挤在一起的臃肿代码，按照功能进行分类管理，提高维护性；
- 提高代码的复用性。

**方法的基本定义和调用**

核心结论：无参数无返回值的方法，定义格式为 `public static void 方法名() { 方法体 }`，调用格式为 `方法名();`。

定义格式：

```java
public static void 方法名() {
    // 方法体
}
```

举例：

```java
public static void show() {
    // ...
}
```

调用格式：

```java
方法名();   // 例如：show();
```

案例——需求：定义一个方法，方法中定义两个整数变量，求出最大值并打印在控制台。

分析：

- 根据格式编写方法，方法名自己给出（见名知意，小驼峰命名法）；
- 方法内部定义出两个 int 类型变量；
- 使用三元运算符求出最大值；
- 调用该方法，让内部的逻辑执行起来。

```java
public class MethodDemo1 {
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax() {
        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}
```

**方法的执行流程（内存图解）**

核心结论：方法没有被调用的时候，在方法区中的字节码文件里存放；方法被调用的时候，需要进入到栈内存中运行。

- 方法区：字节码文件加载时进入的内存；
- 栈内存：方法运行时所进入的内存——方法运行时入栈，方法运行结束出栈。

案例一（顺序调用）：

```java
public class MethodDemo1 {
    public static void main(String[] args) {
        System.out.println("开始");
        getMax();
        System.out.println("结束");
    }

    public static void getMax() {
        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}
```

执行流程：main 方法入栈 → 打印"开始" → 调用 getMax，getMax 方法入栈并运行（打印 20）→ getMax 运行结束出栈 → 回到 main 打印"结束" → main 运行结束出栈。最终输出：

```text
开始
20
结束
```

案例二（方法调用方法）：

```java
public class MethodDemo2 {
    public static void main(String[] args) {
        study();
    }

    public static void sleep(){
        System.out.println("睡觉");
    }

    public static void eat(){
        System.out.println("吃饭");
    }

    public static void study(){
        eat();
        System.out.println("学习");
        sleep();
    }
}
```

执行流程：main 入栈 → 调用 study，study 入栈 → 在 study 中先调用 eat，eat 入栈运行（打印"吃饭"）后出栈 → study 继续打印"学习" → 调用 sleep，sleep 入栈运行（打印"睡觉"）后出栈 → study 出栈 → main 出栈。最终输出：

```text
吃饭
学习
睡觉
```

容易误解：栈内存是"先进后出"的，方法没执行完不会出栈；理解"入栈/出栈"就能理解为什么先打印"吃饭"再打印"学习"。

**带参数的方法**

问题引入：前面例子里的 getMax() 只在方法内部写死了 10 和 20，只能计算 10 和 20——方法不够灵活。给方法传入参数后，同一个方法就能计算任意两个数。

带参数方法的定义格式：

```java
public static void 方法名 (数据类型 变量名) {
    // 方法体
}

public static void 方法名(数据类型 变量名1，数据类型 变量名2... ) {
    // 方法体
}
```

举例：

```java
public static void call (String name) {
    // ...
}

public static void add (int a, int b) {
    // ...
}
```

调用格式：

```java
方法名(参数);          // 举例：call("钢门吹雪");
方法名(参数1, 参数2);  // 举例：add(10, 20);
```

改造后的完整例子：

```java
public class MethodDemo1 {
    public static void main(String[] args) {
        getMax(10, 20);
        getMax(30, 40);
    }

    public static void getMax(int num1, int num2) {
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max);
    }
}
```

内存图解要点：调用 `getMax(10, 20)` 时，实参 10 传给形参 num1、实参 20 传给形参 num2；方法运行结束后出栈，再调用 `getMax(30, 40)` 重新入栈，参数重新赋值。案例输出：

```text
20
--------
40
```

形参和实参：

- 形参：全称形式参数，是指在定义方法时，所声明的参数（如 num1、num2）；
- 实参：全称实际参数，调用方法时，所传入的参数（如 10、20）。

细节说明：带参数的方法可以提高方法的灵活性。

⚠️ 问题：课件"带参数的方法"演示页中，中间过渡帧同时出现了"带参数的 getMax 定义"和"不带参数的 getMax() 调用"，两帧放在一起看会误以为能这样调用。
修正建议：方法的调用参数必须与定义匹配，即定义 `getMax(int num1, int num2)` 后必须写成 `getMax(10, 20)` 这样传两个实参调用。

**带返回值的方法**

核心结论：A 方法产生的数据，B 方法想要使用的话，就需要定义带返回值的方法——通过 return 关键字，将结果数据返回，返回到方法的调用处。

问题引入：

```java
public static void methodA (int a, int b) {
    int sum = a + b;   // sum 是 methodA 内部的局部数据，外部方法拿不到
}

public static void methodB () {
    System.out.println(sum % 2 == 0);   // 拿不到 sum，无法编译
}
```

改造为带返回值的方法：

```java
public static int methodA (int a, int b) {
    int sum = a + b;
    return sum;
}

public static void methodB () {
    int result = methodA(10, 20);        // 用变量接收返回值
    System.out.println(result % 2 == 0);
}
```

带返回值方法的定义格式：

```java
public static 数据类型 方法名 (数据类型 变量名1，数据类型 变量名2... ) {
    return 数据值;
}
```

举例：

```java
public static double getNum () {
    return 12.3;
}

public static int add (int a, int b) {
    int c = a + b;
    return c;
}
```

调用格式：

```java
方法名(参数...);                          // 直接调用，范例：add(10, 20);
数据类型 变量名 = 方法名(参数...);          // 赋值调用，范例：int result = add(10, 20);
```

**方法通用定义格式**

核心结论：方法的完整格式为 `public static 返回值类型 方法名( 参数 ) { 方法体; return 数据; }`。

```java
public static 返回值类型 方法名( 参数 ) {
    方法体;
    return 数据 ;
}
```

课件比喻（方便记忆）：参数 = 制作材料（面粉、酵母、糖……）；方法体 = 使用材料干活（搅拌……）；返回值 = 成品（面包）。

定义方法时，要做到"两个明确"：

1. 明确参数：主要是明确参数的类型和数量；
2. 明确返回值类型：主要是明确方法操作完毕之后是否有结果数据——如果有，写对应的数据类型；如果没有，写 void。

调用方法时：

- void 类型的方法，直接调用即可；
- 非 void 类型的方法，推荐用变量接收调用。

课件练习需求：

- 需求 1：设计一个方法，方法能够计算出 2 个小数的和；
- 需求 2：设计一个方法，能够计算出 3 个整数的最小值；
- 需求 3：设计一个方法，方法能够打印出用户的个人信息（姓名、年龄、身高、性别）。

**方法注意事项**

核心结论：方法的使用有 5 条硬性规则，违反会直接报错。

1. 方法不调用就不执行；
2. 方法与方法之间是平级关系，不能嵌套定义；
3. 方法的编写顺序和执行顺序无关；
4. 方法的返回值类型为 void，表示该方法没有返回值，没有返回值的方法可以省略 return 语句不写；如果要编写 return，后面不能跟具体的数据（只能写 `return;`）；
5. return 语句下面，不能编写代码，因为永远执行不到，属于无效的代码。

课件对比代码（4 种情况）：

```java
// 情况1：正常，无返回值不写 return
public class MethodDemo {
    public static void method() {
        // 代码片段
    }
}

// 情况2：正常，无返回值可以写 return;
public class MethodDemo {
    public static void method() {
        // 代码片段
        return;
    }
}

// 情况3：错误，void 方法 return 后不能跟数据
public class MethodDemo {
    public static void method() {
        // 代码片段
        return 100;   // 报错
    }
}

// 情况4：错误，return 后面还有代码，永远执行不到
public class MethodDemo {
    public static void method() {
        // 代码片段
        return;
        System.out.println("卑微代码");   // 无效代码，报错
    }
}
```

**方法重载**

核心结论：方法重载（Overload）指在同一个类中，定义了多个同名的方法，但每个方法具有不同的参数类型或参数个数，这些同名的方法就构成了重载关系。简单记：同一个类中，方法名相同，参数不同的方法。

需求引入：提供 4 个计算方法——1. 计算两个整数相加的和；2. 计算两个小数相加的和；3. 计算三个整数相加的和；4. 计算三个小数相加的和。

不用重载的写法（方法名各不相同，调用时要记 4 个名字）：

```java
public class Test {
    public static int add1(int a, int b) {
        return a + b;
    }
    public static double add2(double a, double b) {
        return a + b;
    }
    public static int add3(int a, int b, int c) {
        return a + b + c;
    }
    public static double add4(double a, double b, double c) {
        return a + b + c;
    }
}
```

使用重载的写法（全部叫 add）：

```java
public class Test {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    public static double add(double a, double b, double c) {
        return a + b + c;
    }
}
```

调用方法的时候，Java 虚拟机（JVM）会通过参数的不同来区分同名的方法：

```java
add(10, 20);
add(10, 20, 30);
add(12.3, 12.3);
add(12.3, 12.3, 12.3);
```

重载判断规则：参数不同指——个数不同、类型不同、顺序不同。注意：识别方法之间是否是重载关系，只看方法名和参数，跟返回值无关。

课件判断练习：

```java
// 练习1：不是重载（参数完全相同，返回值不同也不行，属于重复定义，直接报错）
public class MethodDemo {
    public static void fn(int a) {
        // 方法体
    }
    public static int fn(int a) {
        // 方法体
    }
}

// 练习2：是重载（参数类型不同）
public class MethodDemo {
    public static void fn(int a) {
        // 方法体
    }
    public static int fn(double a) {
        // 方法体
    }
}

// 练习3：是重载（参数个数不同）
public class MethodDemo {
    public static float fn(int a) {
        // 方法体
    }
    public static int fn(int a , int b) {
        // 方法体
    }
}

// 练习4：不是重载（不在同一个类中）
public class MethodDemo01 {
    public static void fn(int a) {
        // 方法体
    }
}
public class MethodDemo02 {
    public static int fn(double a) {
        // 方法体
    }
}

// 练习5：是重载（参数顺序不同）
public class MethodDemo {
    public static void fn(int a, double b) {
        // 方法体
    }
    public static void fn(double a, int b) {
        // 方法体
    }
}

// 练习6：不是重载（参数类型和个数都相同，只是变量名不同，属于重复定义）
public class MethodDemo {
    public static void fn(int a, double b) {
        // 方法体
    }
    public static void fn(int c, double d) {
        // 方法体
    }
}
```

方法重载的好处：不用记忆过多繁琐的方法名字。例如学习过的输出语句 System.out.println 就是重载的代表——`System.out.println(10);`、`System.out.println(10.1);`、`System.out.println(true);` 用的都是同一个方法名。

本节问答巩固：方法重载看返回值吗？—— 不看，只看参数类型、参数个数、参数顺序；方法重载有啥好处？—— 不需要记忆太多方法名字。

⚠️ 问题：课件"带参数的方法内存图解"中，有一帧把三元运算符写成 `int max = num1 > num2 ? num2 : num2;`，两个分支都是 num2，逻辑前后矛盾（输入 getMax(40, 30) 时会得到错误结果）。
修正建议：应写成 `int max = num1 > num2 ? num1 : num2;`。

**IDEA 安装 AI 插件**

核心结论：IDEA 之前的编程方式是程序编码工作必须由程序员思考并逐行编写；AI 出现后，IDEA 可以集成很多辅助编程的 AI 编程插件（但程序编码工作仍需要程序员思考与编写）。

- 课件示例：阿里巴巴的通义灵码；
- IDEA 集成通义灵码下载链接（课件给出）：https://lingma.aliyun.com/lingma/download

本章收束：方法是"一段具有独立功能的代码块"——先掌握定义/调用格式，再理解"参数（形参/实参）传入"与"返回值 return 传出"两条数据通道，牢记 5 条注意事项，最后用"方法名相同、参数不同、与返回值无关"判断重载。

### 第六章：流程控制语句

本章内容总览：流程控制语句分类、分支结构 if、分支结构 switch、Debug 工具、循环结构 for、循环结构 while、循环结构 do…while、break、continue、Random 生成随机数。流程控制语句的作用：控制程序代码执行顺序。

**流程控制语句分类**

核心结论：Java 的流程控制语句分为三类——顺序结构、分支结构、循环结构。

- 顺序结构（程序默认）：Java 程序默认的执行流程，没有特定的语法结构，按照代码的先后顺序，依次执行；程序中大多数的代码都是这样执行的；

```java
public class Test {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
    }
}
```

- 分支结构：if、switch；
- 循环结构：for、while、do…while。

**分支结构 if**

核心结论：if 分支可以根据条件，选择执行某段程序，共有三种格式。

第一种格式：

```java
if (判断条件) {
    语句体;
}
```

执行流程：首先计算判断条件的结果；如果条件的结果为 true 就执行语句体；如果条件的结果为 false 就不执行语句体。

第二种格式：

```java
if (判断条件) {
    语句体1;
} else {
    语句体2;
}
```

执行流程：条件为 true 就执行语句体 1；条件为 false 就执行语句体 2。

第三种格式：

```java
if (判断条件1) {
    语句体1;
} else if (判断条件2) {
    语句体2;
} else if (判断条件3) {
    语句体3;
}
...
else {
    语句体n+1;
}
```

执行流程：首先计算判断条件 1 的值；如果值为 true 就执行语句体 1；如果值为 false 就计算判断条件 2 的值……如果没有任何判断条件为 true，就执行语句体 n+1（最后的 else）。

课件案例——考试奖励：需求：键盘录入考试成绩，根据成绩所在的区间，程序打印出不同的奖励，成绩区间为 95~100 分、90~94 分、80~89 分、80 分以下。

分析思路：用 Scanner 录入成绩后，使用 if…else if…else 从高到低（或从低到高）依次判断成绩落在哪个区间，每个区间对应打印不同奖励。

if 语句注意事项：

- if 语句中，如果大括号控制的是一条语句，大括号可以省略不写；
- if 语句的 `()` 和 `{}` 之间不要写分号；
- if 语句的 `()` 中需要产生 boolean 类型的结果，根据结果决定程序的走向。

**分支结构 switch**

核心结论：switch 分支通过比较"值"来决定执行哪条分支，适合条件是比较值的情况。

格式：

```java
switch(表达式) {
    case 值1：
        语句体1;
        break;
    case 值2：
        语句体2;
        break;
    …
    default：
        语句体n+1;
        break;
}
```

执行流程：

1. 先计算表达式的值，再拿着这个值去与 case 后的值进行匹配；
2. 与哪个 case 后的值匹配为 true 就执行哪个 case 块的代码，遇到 break 就跳出 switch 分支；
3. 如果全部 case 后的值与之匹配都是 false，则执行 default 块的代码。

if 与 switch 的比较（课件对比总结）：

- if 适合做条件是"区间判断"的情况；
- switch 适合做条件是比较"值"的情况，代码优雅、性能较好。

switch 语句注意事项：

- 表达式类型只能是 byte、short、int、char，不支持 double、float、long；
- JDK5 开始支持枚举；
- JDK7 开始支持 String；
- case 给出的值不允许重复，且只能是字面量，不能是变量；
- 正常使用 switch 的时候，不要忘记写 break，否则会出现穿透现象。

本节问答巩固：

- switch 表达式的值可以是？—— byte、short、int、char（以及 JDK5 后的枚举、JDK7 后的 String）；
- 如果省略了 break，将会出现什么现象？—— 穿透现象（继续往下执行后面的 case 内容）；
- case 后面的值可以是变量吗？—— 不可以，只能是字面量。

**Debug 工具**

核心结论：Debug 是供程序员使用的程序调试工具，它可以用于查看程序的执行流程，也可以用于追踪程序执行过程来调试程序。

- Debug 调试又被称为断点调试；断点其实是一个标记，告诉 Debug 从标记的地方开始查看；
- 界面功能说明：程序向下执行一步（单步执行）、控制台、正在执行的方法（调用栈）、进入方法查看详情、变量的变化过程、跳出当前方法；
- 操作细节：再点一次可以取消断点；可以结束 Debug 模式。

容易误解：Debug 不是"运行报错才用"的工具，它是理解程序执行流程的最佳手段——把之前学的"方法入栈/出栈""变量变化"用 Debug 单步走一遍，比看文字更直观。

**循环结构 for**

核心结论：循环可以让一段代码重复执行很多次。for 循环格式：`for (初始化语句; 条件判断语句; 条件控制语句) { 循环体语句; }`。

问题引入（登录案例）：一个 login 实现只能登录一次，程序需要"3 次登录机会"，就需要循环：

```java
public static void login() {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您的密码：");
    int password = sc.nextInt();
    if (password == 123456) {
        System.out.println("登录成功");
    } else {
        System.out.println("登录失败");
    }
}
```

for 循环格式：

```java
for (初始化语句; 条件判断语句; 条件控制语句 )  {
    循环体语句;
}
```

"跑圈"比喻对照理解（课件）：

- 循环任务：跑圈 → 循环体语句 `System.out.println("跑圈");`
- 控制循环：根据心中 1 2 3 4 数字的变化进行控制 → 条件控制语句 `i++;`
- 循环条件：心中的数小于 4，就开始循环任务 → 条件判断语句 `i < 4`
- 初始化语句：定义变量 `int i = 1;`

for 循环执行流程：

1. 执行初始化语句；
2. 执行条件判断语句，看结果是 true 还是 false——false 结束循环，true 继续；
3. 执行循环体语句；
4. 执行条件控制语句；
5. 回到第 2 步继续。

课件练习与案例：

- 需求：请使用循环，在控制台打印出 10 次"黑马程序员"；
- 模拟计时器：请使用循环在控制台打印数字 1~3 和 3~1 的数据。细节积累：循环中用于控制循环的变量还可以放在循环体中继续使用；条件控制语句并不一定是 `++`（也可以是 `--` 等）。

求和案例——需求：求 1-100 之间的偶数和，并把求和结果在控制台输出。

分析：

1. 定义求和变量 sum，准备记录累加的结果；
2. 使用 for 循环，分别获取数据 1–100；
3. 循环使用 if 语句，筛选出偶数数据；
4. 将每一个偶数数据，和 sum 变量进行累加；
5. 循环结束后，打印求和后的结果。

按课件思路整理出的实现：

```java
int sum = 0;                        // 求和变量
for (int i = 1; i <= 100; i++) {    // 获取 1~100
    if (i % 2 == 0) {               // 筛选偶数
        sum = sum + i;              // 累加
    }
}
System.out.println(sum);            // 2550
```

思路积累（课件强调）：今后若遇到的需求是"求 xxx 的和"，就要联想到求和变量 sum。

水仙花数案例——需求：在控制台输出所有的"水仙花数"。

什么是"水仙花数"：水仙花数是一个三位数，其个位、十位、百位的数字立方和等于原数。

课件举例验证：

- 123：1³+2³+3³ = 1 + 8 + 27 = 36 ≠ 123，不是水仙花数；
- 371：3³+7³+1³ = 27 + 343 + 1 = 371，是水仙花数。

分析：

1. 通过 for 循环，获取到所有的三位数 100 - 999；
2. 在循环内部，将每一个三位数拆分为（个位，十位，百位）；
3. 加入 if 筛选条件：`if (ge*ge*ge + shi*shi*shi + bai*bai*bai == 原数)`；
4. 满足条件则输出水仙花数。

判断条件中的变量名与拆位公式（ge 个位、shi 十位、bai 百位）对应第四章的数值拆分公式。

统计水仙花数——需求：在控制台输出所有的"水仙花数"，并统计出水仙花数的个数。

分析：

1. 定义计数器变量 count，准备统计水仙花数的个数；
2. 通过 for 循环，获取到所有的三位数 100 - 999；
3. 在循环内部，将每一个三位数拆分为（个位，十位，百位）；
4. 加入 if 筛选条件；
5. 满足条件则输出水仙花数，count 变量 `++`；
6. 打印 count 所记录的值。

水仙花数共有 4 个：153、370、371、407（即统计结果 count = 4）。

思路积累（课件强调）：今后若遇到的需求是"统计 xxx"，就要联想到计数器变量 count。

for 循环语句注意事项：

- 循环 `{}` 中定义的变量，在每一轮循环结束后，都会从内存中释放；
- 循环 `()` 中定义的变量，在整个循环结束后，从内存中释放；
- 循环语句 `()` 和 `{}` 之间不要写分号。

本节问答巩固：

- 循环 `()` 中定义的变量，在循环结束后还可以继续使用吗？—— 不可以，随循环结束从内存释放；
- 循环 `{}` 中定义的变量，什么时候从内存中消失？—— 每一轮循环结束就释放；
- 循环 `()` 和 `{}` 之间写分号，还可以控制循环体吗？—— 不可以，分号会作为 for 的"空循环体"结束循环语句，后面 `{}` 中的代码不再属于循环体（只会执行一次）。

循环嵌套：

核心结论：循环嵌套就是在循环语句中继续出现循环语句；执行流程为"外循环执行一次，内循环执行一圈"。

```java
for(int i = 1; i <= 5; i++) {
    for(int j = 1; j <= 5; j++) {
        System.out.println("HelloWorld");
    }
}
```

课件循环嵌套案例：

- 使用 `*` 在控制台打印出 4 行 5 列的矩形：

```text
*****
*****
*****
*****
```

- 使用 `*` 在控制台打印出 5 行的直角三角形：

```text
*
**
***
****
*****
```

循环嵌套理解要点（课件总结）：执行流程——外循环执行一次，内循环执行一圈；思路——如果一个循环任务还要继续执行多次，使用外循环包裹。

**循环结构 while**

核心结论：while 循环格式为"初始化语句; while (判断语句) { 循环体语句; 控制语句; }"。

格式：

```java
初始化语句;
while (判断语句) {
    循环体语句;
    控制语句;
}
```

珠穆朗玛峰案例——需求：世界最高山峰珠穆朗玛峰高度是 8848.86 米 = 8848860 毫米，假如有一张足够大的纸，它的厚度是 0.1 毫米。请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？

分析：

1. 定义变量存储珠穆朗玛峰的高度、纸张的高度：

```java
double peakHeight = 8848860;   // 山峰高度
double paperThickness = 0.1;   // 纸张厚度
```

2. 使用 while 循环来控制纸张折叠，循环条件是（纸张厚度 < 山峰高度）；循环每执行一次，就表示纸张折叠一次，并把纸张厚度变为原来两倍；
3. 循环外定义计数变量 count，循环每折叠一次纸张，让 count 变量 +1；
4. 循环结束后打印 count，结果为折叠 27 次即可超过珠峰高度。

本节问答巩固：

- while 循环的格式、执行流程是怎么样的？

```java
初始化语句;
while (循环条件) {
    循环体语句;
    迭代语句;
}

int i = 1;
while (i <= 3) {
    System.out.println("HelloWorld");
    i++;
}
```

- while 和 for 有什么区别？什么时候用 for，什么时候用 while？—— 功能上是完全一样的，for 能解决的 while 也能解决，反之亦然；使用规范：知道循环次数使用 for；不知道循环次数建议使用 while。

**循环结构 do…while**

核心结论：do…while 循环的特点是"先执行后判断"，循环体至少会执行一次。

格式：

```java
初始化语句;
do {
    循环体语句;
    条件控制语句;
} while (循环条件);
```

举例：

```java
int i = 0;
do {
    System.out.println("Hello World!");
    i++;
} while( i < 3);
```

三种循环的区别（课件总结）：

- for 循环和 while 循环：先判断后执行；
- do...while：先执行后判断；
- for 循环和 while 循环的执行流程是一模一样的，功能上无区别，for 能做的 while 也能做，反之亦然；
- 使用规范：如果已知循环次数建议使用 for 循环，如果不清楚要循环多少次建议使用 while 循环；
- 其他区别：for 循环中，控制循环的变量只在循环中使用；while 循环中，控制循环的变量在循环后还可以继续使用。

```java
int i = 0;
while (i < 3) {
    System.out.println("Hello World");
    i++;
}
System.out.println(i);   // while：循环结束后 i 仍能使用，输出 3
```

```java
for (int i = 0; i < 3; i++ ) {
    System.out.println("Hello World");
}
System.out.println(i);   // for：报错，i 只在循环内有效
```

课件结论：for 和 while 是先判断后执行，do...while 是先执行后判断；明确循环次数推荐使用 for，不明确循环次数推荐使用 while；for 循环结束后，控制循环的变量不可以继续使用，while 则相反。

**break、continue**

核心结论：break 用于终止循环体内容的执行，也就是说结束当前的整个循环；continue 用于跳过某次循环体内容的执行，继续下一次的执行。

注意事项：

- break：只能在循环和 switch 当中进行使用；
- continue：只能在循环中进行使用。

细节说明：

- break 结束循环，结束 switch 语句；
- continue 跳过某次循环，继续下一次；
- 如果出现循环嵌套，默认操作内层循环，如需改动，可以使用标号控制：

```java
lo:for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 5; j++) {
        if (j == 2) {
            break lo;   // 标号 lo：直接跳出外层循环
        }
    }
}
```

**Random 生成随机数**

核心结论：使用 Random 生成随机数需要三个步骤——导包、创建对象、生成随机数。

```java
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(10);
    }
}
```

三个步骤说明：

1. 导包：`import java.util.Random;`——告诉程序去 JDK 的哪个包中找随机数生成器；
2. 抄代码：`Random r = new Random();`——代表得到随机数生成器对象；
3. 抄代码：`int num1 = r.nextInt(10);`——生成一个随机数，指定随机范围。

注意：`r.nextInt(n)` 生成的范围是 0~n，但是不包含 n。

需求：产生一个 1~100 的随机数，只传入一个参数怎么做？

```java
int num = r.nextInt(100) + 1;   // 先取 0~99 再加 1，得到 1~100
```

猜数字小游戏（课件综合案例）：产生一个 1~100 之间的随机数作为中奖数字；随后键盘录入用户猜的数字进行比对；没有猜中的话给出提示，直到用户猜对为止，程序结束。

按课件需求整理的参考实现（综合运用 Random + Scanner + 循环 + 分支）：

```java
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int target = r.nextInt(100) + 1;   // 中奖数字：1~100

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您猜的数字（1~100）：");
            int guess = sc.nextInt();
            if (guess > target) {
                System.out.println("猜大了");
            } else if (guess < target) {
                System.out.println("猜小了");
            } else {
                System.out.println("恭喜您猜中了！");
                break;   // 猜对后结束程序
            }
        }
    }
}
```

本章收束：流程控制是程序"会思考"的开始——顺序结构按部就班；if 三格式负责区间判断；switch 负责等值判断（注意 break 和类型限制）；for/while 先判断后执行、do…while 先执行后判断；break/continue 控制循环走向；Random + Scanner 组合可以写出猜数字这样的小游戏。

### 第七章：数组

本章内容总览：数组介绍、数组的定义和静态初始化、数组元素访问、数组遍历操作、数组动态初始化、数组内存图、数组常见问题、二维数组。数组的定义：数组指一种容器，可以存储同种类型的多个值。

**数组介绍**

核心结论：数组指的是一种容器，可以用来存储同种数据类型的多个值。

问题引入（课件案例）：程序里有 a=10、b=20、c=30、d=40、e=50、f=60、g=70、h=80、i=90 九个变量，想要"找出最大值、找出最小值、计算销售总额"，用零散变量写会非常麻烦——这时候就应该用数组把这些"同种类型、属于一个整体"的数据装起来。

什么时候使用数组：如果要操作的数据有多个，并且还属于一个整体，就可以考虑使用数组。

容易误解：数组只能存"同种数据类型"的数据；不同类型的数据不能用同一个数组存储。

**数组的定义和静态初始化**

数组的两种定义格式：

```java
// 格式一：数据类型[] 数组名
int[] array;

// 格式二：数据类型 数组名[]
int array[];
```

细节说明：只定义、不初始化的数组变量不能直接使用（编译报错：变量未初始化）。课件演示：

```java
public class Demo1Array {
    public static void main(String[] args) {
        int[] array1;
        int array2[];
        System.out.println(array1);   // 报错：可能尚未初始化变量
        System.out.println(array2);   // 报错：可能尚未初始化变量
        int a;
        System.out.println(a);        // 报错：可能尚未初始化变量
    }
}
```

静态初始化的概念：初始化就是在内存中，为数组容器开辟空间，并将数据存入容器中的过程。

静态初始化的两种书写格式：

```java
// 完整格式：数据类型[] 数组名 = new 数据类型[] { 元素1，元素2，元素3… };
int[] array = new int[]{ 11，22，33 };
double[] array2 = new double[] { 11.1，22.2，33.3};

// 简化格式：数据类型[] 数组名 = { 元素1，元素2，元素3… };
int[] array = { 11，22，33 };
double[] array2 = { 11.1，22.2，33.3};
```

课件示例（打印数组名）：

```java
public class Demo1Array {
    public static void main(String[] args) {
        int[] array1 = {11, 22, 33};
        System.out.println(array1);        // [I@10f87f48
        double[] array2 = {44.4, 55.5, 66.6};
        System.out.println(array2);        // [D@b4c966a
    }
}
```

注意事项：直接打印数组名，会看到数组在内存中的十六进制地址值（[I@10f87f48、[D@b4c966a 这种形式），而不是数组里存的内容。

本节问答巩固：

- 数组的定义格式为？—— `数据类型[] 数组名;`；
- 数组的静态初始化格式为？—— `数据类型[] 数组名 = new 数据类型[]{元素1, 元素2, 元素3...};` 或 `数据类型[] 数组名 = {元素1, 元素2, 元素3...};`；
- 打印数组名会看到什么？—— 十六进制内存地址。

**数组元素访问**

核心结论：访问数组元素的格式为 `数组名[索引];`。

- 索引（也叫角标、下标）：索引是数组容器中空间的编号，编号从 0 开始，逐个 +1 增长；
- `数组名.length`：动态获取数组的长度（元素的个数）。

课件的"报数"比喻：数组 array 里的员工编号从 0 开始报数（0、1、2、3……），"array 小组，2 号员工出列"对应的就是 `array[2]`。

**数组遍历操作**

核心结论：数组遍历就是依次访问数组中的每一个元素（从头到尾，配合索引逐个 +1 访问）。

案例一：数组遍历求偶数和——需求：已知数组元素为 {11,22,33,44,55}，请将数组中偶数元素取出并求和，最后打印求和结果。

分析：

1. 静态初始化数组；
2. 定义求和变量；
3. 遍历数组取出每一个元素；
4. 判断当前元素是否是偶数，是的话跟求和变量做累加操作；
5. 打印求和变量。

按课件分析整理出的实现：

```java
int[] arr = {11, 22, 33, 44, 55};
int sum = 0;                            // 求和变量
for (int i = 0; i < arr.length; i++) {  // 遍历数组
    if (arr[i] % 2 == 0) {              // 筛选偶数
        sum = sum + arr[i];             // 累加
    }
}
System.out.println(sum);                // 66
```

案例二：数组遍历求最大值——需求：已知数组元素为 {5,44,33,55,22}，请找出数组中最大值并打印在控制台。

课件"打擂台"思想：

- 定义 max 变量来记录擂台上不断变化的数据；
- 数组中 0 号选手先上台，因此 `int max = arr[0];`；
- 遍历数组取出每一个元素，索引从 1 开始；
- 逐个进行比较，找到更大的，max 变量记录更大的数据；
- 遍历后打印 max 变量所记录的值。

按课件分析整理出的实现：

```java
int[] arr = {5, 44, 33, 55, 22};
int max = arr[0];                        // 0号元素先上擂台
for (int i = 1; i < arr.length; i++) {   // 从索引1开始逐个挑战
    if (arr[i] > max) {
        max = arr[i];                    // 更大的记录到 max
    }
}
System.out.println(max);                 // 55
```

细节说明：为什么 max 不初始化为 0？如果数组里全是负数，初始 0 会导致结果错误；用"0 号元素先上台"就没有这个问题。

案例三：数组元素反转——需求：已知一个数组 arr = {11, 22, 33, 44, 55}; 用程序实现把数组中的元素值交换，交换后的数组 arr = {55, 44, 33, 22, 11}; 并在控制台输出交换后的数组元素。

前置知识：两个变量交换需要定义第三个变量：

```java
int a = 10;
int b = 20;
int c = a;   // 先把 a 的值存到 c
a = b;       // 再把 b 的值给 a
b = c;       // 最后把 c 里存的旧 a 值给 b
```

反转思路（课件指针模拟）：

- 使用两个变量模拟出两个指针：`int start = 0，end = arr.length - 1;`
- 交换条件：`start < end`；
- 交换内容：`arr[start]` 和 `arr[end]`；
- 交换后：`start++`，`end--`；
- 第一次交换 arr[0] 和 arr[end]；第二次交换 arr[1] 和 arr[end-1]；依次向中间逼近。

按课件思路整理出的实现：

```java
int[] arr = {11, 22, 33, 44, 55};
for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
}
// 输出交换后的数组元素
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
// 输出：55 44 33 22 11
```

⚠️ 问题：反转案例中，需求写的是 arr = {11, 22, 33, 44, 55}（5 个元素），但配套动画里数组有 6 个元素（多了一个 66），交换操作写的是"arr[0] 和 arr[5]"——对 5 个元素的数组来说 arr[5] 已越界（合法索引只有 0~4）。
修正建议：要么把需求改为 6 个元素 {11,22,33,44,55,66} 并交换 arr[0] 和 arr[5]；要么保持 5 个元素，交换 arr[0] 和 arr[end]（end = arr.length - 1 = 4）。写代码时统一用 `end = arr.length - 1` 就不会出错。

**数组动态初始化**

核心结论：动态初始化只指定数组长度，由系统为数组分配初始值。格式：`数据类型[] 数组名 = new 数据类型[数组长度];`

```java
int[] arr = new int[3];
```

各种数据类型的默认初始值（系统自动分配）：

| 数据类型 | 明细 | 默认值 |
| --- | --- | --- |
| 基本数据类型 | 整数（byte、short、int、long） | 0 |
| 基本数据类型 | 小数（float、double） | 0.0 |
| 基本数据类型 | 字符（char） | '\u0000'，常见体现为空白字符 |
| 基本数据类型 | 布尔（boolean） | false |
| 引用数据类型 | 类、接口、数组 | null |

静态初始化与动态初始化的对比：

| 对比项 | 动态初始化 | 静态初始化 |
| --- | --- | --- |
| 格式 | `数据类型[] 数组名 = new 数据类型[长度];` | `数据类型[] 数组名 = {元素1, 元素2, 元素3...};` |
| 特点 | 手动指定长度，系统自动分配默认初始化值 | 手动指定元素，系统计算出数组长度 |
| 场景 | 不明确要操作的元素的时候 | 明确具体要操作的元素 |

竞争案例——评委打分：需求：在编程竞赛中，有 6 个评委为参赛的选手打分，分数为 0-100 的整数分。选手的最后得分为：去掉一个最高分和一个最低分后的 4 个评委平均值。

分析思路（综合运用动态初始化 + 遍历 + 求最值 + 求和）：

1. 因为暂时不明确具体分数，用动态初始化创建长度为 6 的数组存 6 个分数（配合 Scanner 录入）;
2. 遍历求最高分 max、最低分 min、总分 sum；
3. 最后得分 = (sum - max - min) / 4.0（除以 4.0 保证得到小数）。

**数组内存图**

核心结论：理解数组的内存，关键在于理解"数组名变量存的是地址，真正的数据在堆内存"。

Java 内存分配介绍（课件列出的 5 个区域）：栈、堆、方法区、本地方法栈、寄存器。本阶段重点关注三个：

- 堆内存：new 出来的东西会在这块内存中开辟空间并产生地址；
- 栈内存：方法运行时所进入的内存；
- 方法区：字节码文件加载时进入的内存。

单个数组内存图案例：

```java
public class Test {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        arr[0] = 44;
        arr[1] = 55;
        arr[2] = 66;
        System.out.println(arr[0]);   // 66
        System.out.println(arr[1]);   // 55
        System.out.println(arr[2]);   // 44
    }
}
```

内存流程：栈中 main 方法入栈，`int[] arr` 变量持有堆内存地址（如 10f87f48）；堆中开辟数组空间，包含 0、1、2 三个格子及 length=3，初始值 11、22、33；然后通过 `arr[索引]` 逐一修改为 44、55、66。细节说明：课件强调"简化格式只是简化了代码书写，真正运行期间还是按照完整格式运行的"——`int[] arr = {11,22,33};` 等价于 `int[] arr = new int[]{11,22,33};`。

两个数组指向相同内存图案例：

```java
public class Test {
    public static void main(String[] args) {
        int[] array1 = {11, 22, 33};
        int[] array2 = array1;            // 把 array1 的地址赋给 array2
        System.out.println(array1[0]);    // 11
        System.out.println(array2[0]);    // 11
        array2[0] = 100;                  // 通过 array2 修改堆内存数据
        System.out.println(array1[0]);    // 100（array1 看到的也跟着变了）
    }
}
```

细节说明：`int[] array2 = array1;` 传递的是地址！两个数组名指向同一块堆内存，通过任意一个引用修改数据，另一个看到的都会变化。

方法参数传递内存图（3 个案例）：

案例 1（基本数据类型传参，方法内修改不影响外部）：

```java
public class ArgsTest1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);
        change(number);
        System.out.println("调用change方法后:" + number);
    }
    public static void change(int number) {
        number = 200;
    }
}
```

输出：调用 change 方法前:100 / 调用 change 方法后:100。原因：基本类型传的是"值的拷贝"，change 方法里的 number 是另一个变量，改它不影响 main 里的 number。

案例 2（用返回值把结果带回来）：

```java
public class ArgsTest1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);
        number = change(number);
        System.out.println("调用change方法后:" + number);
    }
    public static int change(int number) {
        number = 200;
        return number;
    }
}
```

输出：调用 change 方法前:100 / 调用 change 方法后:200。

案例 3（数组传参，方法内修改会影响外部）：

```java
public class ArgsTest2 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        System.out.println("调用change方法之前:" + arr[0]);
        change(arr);
        System.out.println("调用change方法之后:" + arr[0]);
    }
    public static void change(int[] arr) {
        arr[0] = 66;
    }
}
```

输出：调用 change 方法之前: 11 / 调用 change 方法之后: 66。原因：数组传参传的是地址，方法里通过地址找到同一块堆内存改了数据，所以外部也能看到变化。

容易误解：方法参数传递分为"传递基本类型（传值，不影响外部）"和"传递引用类型/数组（传地址，可能影响外部）"两种情况，初学阶段最容易在这里出错，务必结合内存图理解。

**数组常见问题**

问题一：索引越界异常。

- 异常名：ArrayIndexOutOfBoundsException；
- 原因：当访问了数组中不存在的索引，就会引发索引越界异常。

问题二：空指针异常。

```java
public static void main(String[] args) {
    int[] arr = new int[2];
    // 把null赋值给数组
    arr = null;
    // 输出元素
    System.out.println(arr[0]);   // 空指针异常
}
```

- 原因：当引用数据类型变量被赋值为 null 之后，地址的指向被切断，还继续访问堆内存数据，就会引发空指针异常（NullPointerException）。

容易误解：越界是"索引超范围"，空指针是"地址被切断还去访问"，两者报错类型不同，要会看报错信息定位问题。

**二维数组（了解）**

核心结论：二维数组是一种容器，该容器用于存储一维数组。

应用场景示例（课件）：季度数据——第一季度：22,66,44；第二季度：77,33,88；第三季度：25,45,65；第四季度：11,66,99。每个季度的数据是一个一维数组，4 个一维数组属于同一个整体，就可以用二维数组存起来。

使用思路：要操作的一维数组有多个，并且属于同一个整体，可以考虑使用二维数组。

定义格式：

```java
// 完整格式
数据类型[][] 数组名 = new 数据类型[][] {{元素1,元素2},{元素1, 元素2}};
int[][] arr = new int[][]{{11,22},{33,44}};

// 简化格式
数据类型[][] 数组名 = {{元素1,元素2}, {元素1, 元素2}};
int[][] arr = {{11,22},{33,44}};
```

元素访问格式：`数组名[索引][索引];`

```java
int[][] arr = new int[][]{{11,22},{33,44}};
arr[1][0];   // 33（第2个一维数组的第1个元素）
```

二维数组遍历——需求：已知一个二维数组 arr = { {11, 22, 33} , {33, 44, 55} }; 遍历该数组，取出所有元素并打印。

分析：

1. 遍历二维数组，取出里面每一个一维数组；
2. 在遍历的过程中，对每一个一维数组继续完成遍历，获取内部存储的每一个元素。

```java
for (int i = 0; i < arr.length; i++) {
    // arr[i] 就是每一个一维数组
    for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);   // 每一个元素
    }
}
```

本章收束：数组是第一个"引用类型"容器——静态初始化用于已知元素、动态初始化用于只知长度；索引从 0 开始、length 取长度；遍历、求最值、求和、反转是四大基本套路；内存图抓住"变量存地址、数据在堆中"这一核心；最后记住两个经典异常（越界、空指针）。

### 第八章：面向对象基础

**面向对象介绍**

核心结论：面向对象并不是一个技术，而是一种**编程的指导思想**——它回答两个问题：以什么形式组织代码、以什么思路解决问题。

关键逻辑：

1. 为什么要学习面向对象？因为生活中我们解决问题时，采用的就是这种指导思想；把它搬到程序里，写代码的思路会更贴切于生活，程序也变得简单、便于人理解。
2. 在被正式介绍之前，我们其实已经"用过"面向对象了：

```java
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;   // 生成 1~100 的随机数
        System.out.println("请输入:");
        int scNum = sc.nextInt();
        if (scNum > randomNum) {
            System.out.println("猜大了");
        } else if (scNum < randomNum) {
            System.out.println("猜小了");
        } else {
            System.out.println("猜中了");
        }
    }
}
```

`Scanner` 和 `Random` 都是 Java 已经写好的类——我们只需要 `new` 一个对象就能使用它们的功能，完全不用关心内部怎么实现的。那如果 Java 没提供我要解决的问题对应的类怎么办？答案是：**学习自己如何设计对象，同时学习已有的对象如何使用**。

学习目标（本章想要达成的两点）：
1. 自己设计对象使用；
2. 掌握已有对象的使用。

本节收束：面向对象思想可以让我们写代码的思路更贴切于生活；本章将依次学习：类和对象、类和对象内存图、成员变量和局部变量的区别、this 关键字、构造方法、封装、JavaBean、static 关键字。

**类和对象**

核心结论：Java 中想要创建对象，必须先要有类的存在。类指的是一组相关**属性**和**行为**的集合，可以理解为一张"对象的设计图"；对象是照这张设计图"造"出来的具体事物。

类和对象的关系：
- Java 中需要根据类来创建对象；
- 一个类可以创建出多个对象。

**类的组成——成员变量与成员方法**

以学生类为例：

```java
public class Student {
    String name = "张三";   // 成员变量
    int age = 23;           // 成员变量

    public void study() {   // 成员方法
        System.out.println("学习Java");
    }

    public void eat() {     // 成员方法
        System.out.println("吃饭");
    }
}
```

- **成员变量**：跟之前定义变量的格式一样，只不过位置需要放在**方法的外面**；
- **成员方法**：跟之前定义方法的格式一样，只不过需要**去掉 static 关键字**。

**创建对象、使用对象**

1. 创建对象格式：`类名 对象名 = new 类名();`
2. 成员变量使用格式：`对象名.变量名;`
3. 成员方法使用格式：`对象名.方法名(实际参数);`

```java
// 创建对象格式: 类名 对象名 = new 类名();
Student stu = new Student();

// 使用成员变量格式: 对象名.变量名
System.out.println(stu.name);
System.out.println(stu.age);
stu.name = "李四";
stu.age = 24;

// 使用成员方法格式: 对象名.方法名(实际参数);
stu.study();
stu.eat();
```

**手机类案例（类的定义与对象的创建和使用）**

需求：
- 定义一个手机类（Phone）：属性有品牌 brand、颜色 color、价格 price；行为有打电话 call（输出"给 xxx 打电话"）、发短信 sendMessage（输出"群发短信"）；
- 编写一个手机测试类（PhoneTest）：创建两个手机对象并给属性赋值——①小米、白色、4999；②华为、黑色、6999；赋值之后用打印语句校验赋值是否成功，并调用两个对象各自的成员方法。

**细节说明**
- 属性 = 成员变量，指描述事物的**名词**（品牌、颜色、价格）；
- 行为 = 成员方法，指描述事物的**动词**（打电话、发短信）；
- 测试类中的 main 方法负责"创建对象 → 赋值 → 校验 → 调用方法"这套流程。

**容易误解的地方**
- 类是"设计图"，对象是"实物"：`new Student()` 这一句才真正在内存中造出对象，光写一个类不占对象内存；
- 一个类可以 new 出无数个对象，它们互不干扰（各自有各自的成员变量值）。

本节收束：先定义类（成员变量写在方法外、成员方法去掉 static），再 `new` 出对象，最后用 `对象名.xxx` 访问属性和行为——这是面向对象编程最基础的"三步走"。

**类和对象内存图**

核心结论：理解内存图是理解面向对象的关键。三个内存区域各司其职：
- **方法区**：字节码文件（.class）加载时进入的内存，存放类信息（成员变量、成员方法）；
- **栈内存**：方法运行时进入的内存，方法执行完就出栈（main 方法也在栈中运行）；
- **堆内存**：`new` 出来的对象住在堆中，对象里的成员变量跟随对象一起在堆中；成员方法在堆中只存一个"引用地址"，指向方法区中真正的字节码。

**单个对象内存图**

```java
public class Student {
    String name;
    int age;
    public void study() {
        System.out.println("学习Java");
    }
    public void eat() {
        System.out.println("吃饭");
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu);        // 输出: 地址值 例如 7ef20235
        System.out.println(stu.name);   // 输出: null（默认初始化值）
        System.out.println(stu.age);    // 输出: 0（默认初始化值）
        stu.name = "张三";
        stu.age = 23;
        System.out.println(stu.name);   // 输出: 张三
        System.out.println(stu.age);    // 输出: 23
        stu.study();                    // 输出: 学习Java
        stu.eat();                      // 输出: 吃饭
    }
}
```

执行过程拆解：
1. `TestStudent.class` 和 `Student.class` 加载进方法区；
2. main 方法进栈运行；
3. `new Student()`：在堆中开辟空间，成员变量 `name` 默认值 null、`age` 默认值 0，成员方法记录一个引用地址（指向方法区的 study/eat）；同时把堆中的地址值（如 7ef20235）分配给栈中的变量 `stu`；
4. `System.out.println(stu);` 打印的就是这个地址值；
5. `stu.name = "张三";` 通过地址找到堆中的对象，把 name 改为"张三"；age 改为 23；
6. `stu.study();` 通过地址找到对象、通过方法引用地址找到方法区中的 study 执行，输出"学习Java"。

**两个对象内存图**

```java
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 23;

        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.age = 24;

        System.out.println(stu1.name);   // 张三
        System.out.println(stu2.age);    // 24
        stu1.study();                    // 学习Java
        stu2.study();                    // 学习Java
    }
}
```

要点：两次 `new` 分别开辟两块独立的堆空间（如 stu1 → 7ef20235、stu2 → 27d6c5e0），两个对象的成员变量各存各的；但成员方法在方法区只有一份，两个对象共享。

**两个引用指向相同对象内存图**

```java
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "钢门吹雪";

        Student stu2 = stu1;       // 没有 new，只是把地址复制给 stu2
        stu2.name = "西域狂鸭";

        System.out.println(stu1.name);   // 西域狂鸭
        System.out.println(stu2.name);   // 西域狂鸭
    }
}
```

**容易误解的地方**：`Student stu2 = stu1;` 不是造了一个新对象，而是让两个变量保存同一个地址，指向堆中的同一个对象。所以通过 stu2 修改 name，stu1 看到的值也跟着变——两次打印都是"西域狂鸭"。

本节收束：记住一句话——**变量存地址，数据在堆中**。单对象、双对象、双引用共指这三种内存图，是后面所有面向对象内容的底层模型。

**成员变量和局部变量的区别**

核心结论：定义在方法外的变量叫成员变量，定义在方法中的变量叫局部变量；它们有五个维度的区别。

| 区别 | 成员变量 | 局部变量 |
| --- | --- | --- |
| 类中位置不同 | 方法外 | 方法中 |
| 初始化值不同 | 有默认初始化值 | 没有，使用之前需要完成赋值 |
| 内存位置不同 | 堆内存 | 栈内存 |
| 生命周期不同 | 随着对象的创建而存在，随着对象的消失而消失 | 随着方法的调用而存在，随着方法的运行结束而消失 |
| 作用域 | 在自己所归属的大括号中（类中）| 从定义处开始到所在大括号结束 |

```java
public class Student {
    String name;    // 成员变量：方法外，有默认值 null
    int age;        // 成员变量：方法外，有默认值 0
}
```

```java
public class Test {
    public static void main(String[] args) {
        int num1 = 10;   // 局部变量：方法中，必须手动赋值才能使用
    }
}
```

局部变量内存图示例：

```java
public class StudentTest {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method() {
        Student stu = new Student();
        stu.name = "钢门吹雪";
    }
}
```

执行过程：main 进栈 → 打印"开始" → 调用 method，method 进栈 → `new Student()` 在堆中创建对象（地址 7ef20235），栈中的局部变量 stu 保存该地址，name 赋值为"钢门吹雪" → **method 执行结束出栈**，局部变量 stu 随之消失，堆中对象失去引用（此时成为垃圾，等待 GC 回收）→ 回到 main 打印"结束"。这演示了局部变量"随着方法调用而生、随方法结束而亡"的特点。

**容易误解的地方**
- 成员变量有默认值（整数 0、小数 0.0、布尔 false、引用类型 null），局部变量没有默认值，不赋值直接使用会编译报错；
- 成员变量虽然写在类里，但它的内存其实在**堆中对象里**；栈中只是引用对象的地址。

本节收束：判断成员变量还是局部变量，最直接的方法是看它写在大括号的哪一层——方法外是成员变量（跟对象同生共死）、方法中是局部变量（跟方法同生共死）。

**this 关键字**

核心结论：当局部变量和成员变量**出现重名**时，Java 使用的是**就近原则**——方法里直接写变量名，访问的是离自己最近的局部变量。如果想访问成员变量，需要用 `this.` 来指明。

先看问题的出现：

```java
public class Student {
    String name;
    int age;
    public void sayHello(String name) {
        System.out.println(name);   // 输出的究竟是哪个 name?
    }
}
```

```java
Student stu = new Student();
stu.name = "钢门吹雪";            // 成员变量 name = 钢门吹雪
stu.age = 23;
stu.sayHello("西域狂鸭");          // 实参传给局部变量 name
```

`sayHello` 里打印的 name，方法内能"就近"找到的是参数（局部变量）name，所以输出的是"西域狂鸭"。如果想输出成员变量，写成 `System.out.println(this.name);` 即可。

**this 介绍**：this 代表**当前类对象的引用（地址）**——哪个对象调用了这个方法，方法里的 this 就指向哪个对象。

**this 内存图**

```java
public static void main(String[] args) {
    Student stu = new Student();
    stu.name = "钢门吹雪";
    stu.age = 23;
    stu.sayHello("西域狂鸭");
}

class Student {
    String name;
    int age;
    public void sayHello(String name) {
        System.out.println("局部变量:" + name);
        System.out.println("成员变量:" + this.name);
    }
}
```

执行过程：
1. main 进栈，`new Student()` 在堆中创建对象（地址 0011），栈中 stu 保存 0011，name、age 赋值为"钢门吹雪"、23；
2. `stu.sayHello("西域狂鸭")` 调用方法，sayHello 进栈，栈帧中有一个**隐藏的 this 变量**，保存调用者地址 0011（因为是 stu 调用的）；
3. 参数局部变量 name = "西域狂鸭"；
4. `name` 就近取到局部变量，输出"局部变量:西域狂鸭"；
5. `this.name` 通过 this 保存的地址 0011 找到堆中对象，取成员变量，输出"成员变量:钢门吹雪"。

**this 的用法总结**
- `this.本类成员变量;` —— 当局部变量和成员变量重名时使用；如果不涉及变量重复，`this.` 可以省略；
- `this.本类成员方法();` —— 访问本类成员方法；没有前提条件，`this.` 可以直接省略。

**容易误解的地方**：this 不是"关键字修饰的一个固定对象"，而是"谁调用、就指向谁"的动态引用。同一份 sayHello 字节码，stu1 调用时 this 就是 stu1 的地址，stu2 调用时 this 就是 stu2 的地址。

本节收束：一句话记住 this 的两个考点——重名时用它区分成员变量与局部变量；它的本质是"当前调用对象的地址"。

**构造方法**

核心结论：构造方法（也叫构造器）是**构建、创造对象的时候所调用的方法**，作用是初始化一个新建的对象。

**格式（三要素）**
1. 方法名与**类名相同**，大小写也要一致；
2. **没有返回值类型**，连 void 都没有；
3. **没有具体的返回值**（不能由 return 带回结果数据）。

**执行时机**
- 创建对象的时候调用，每创建一次对象，就会执行一次构造方法；
- **不能手动调用**构造方法（只能由 new 触发）。

```java
public class Test {
    public static void main(String[] args) {
        Student stu = new Student();   // 这一句就会执行 Student 类的构造方法
    }
}
```

**构造方法的作用**
- 本质作用：创建对象；
- 结合执行时机：给对象中的属性（成员变量）进行初始化。

**构造方法注意事项**

1. 构造方法的创建：
   - 如果没有定义构造方法，系统将给出一个默认的无参数构造方法；
   - 如果定义了构造方法，系统将**不再提供**默认的构造方法。
2. 构造方法的重载：构造方法也是方法，允许重载关系出现（可以写多个参数列表不同的构造方法）。
3. 推荐的使用方式：无参数构造方法和带参数构造方法，都自己手动给出（防止系统默认构造丢失后无法 `new Student()`）。

```java
class Student {
    int age;
    public Student() {
    }
    public Student(int age) {
        this.age = age;   // 用参数给成员变量赋值
    }
}
```

⚠️ 问题：课件此处的带参构造方法写成了 `this.age = 18;`，把参数直接写死成 18，那么无论传入什么 age，成员变量都会被赋成 18，参数失去意义。
修正建议：应写为 `this.age = age;`（this.age 是成员变量，等号右边的 age 是参数）。

**构造方法执行流程（内存图）**

```java
public static void main(String[] args) {
    Student stu = new Student("钢门吹雪", 23);
    stu.show();
}

public class Student {
    String name;
    int age;
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void show() {
        System.out.println(name + "---" + age);
    }
}
```

执行过程：
1. main 进栈；
2. `new Student("钢门吹雪", 23)`：先在堆中开辟对象空间（地址 0011），name 默认 null、age 默认 0；
3. 然后调用**带参构造方法**（栈中运行），栈帧中有隐藏的 this = 0011，参数局部变量 name = "钢门吹雪"、age = 23；
4. 执行 `this.name = name;`：通过 this 的地址 0011 找到堆中对象，把参数"钢门吹雪"赋给成员变量 name；同理 `this.age = age;` 把 23 赋给 age；
5. 构造方法出栈，对象初始化完成，把地址 0011 赋给栈中的 stu；
6. `stu.show()` 调用 show 方法，输出"钢门吹雪---23"。

**容易误解的地方**
- `Student stu = new Student();` 里的 `Student()` 不是普通方法调用，而是**构造方法由 new 触发**——写代码时不能像 `stu.Student()` 这样手动调用构造方法；
- 一旦自己写了带参构造，系统就不再补默认无参构造，此时再写 `new Student()` 会编译报错——所以养成"无参带参都手写"的习惯。

本节收束：构造方法 = 方法名同类名 + 无返回值类型 + new 时自动执行；它的使命是"建对象 + 初始化属性"。

**封装**

核心结论：封装是面向对象三大特征（封装、继承、多态）中的第一个。**封装就是将数据（属性）和操作数据的方法捆绑在一起组成一个整体，也就是类；同时通过访问修饰符来控制对类中属性和方法的访问权限，从而实现信息隐藏。**

以学生成绩场景为例，不用封装时只能平铺变量：

```java
int id1 = 1;
String name1 = "张三";
double chineseScore1 = 87;
double mathScore1 = 90;
int age1 = 23;
int id2 = 2;
String name2 = "李四";
double chineseScore2 = 91;
double mathScore2 = 69;
int age2 = 24;
```

用类把"数据 + 处理数据的方法"设计到一起：

```java
public class Student {
    int id;
    String name;
    int age;
    double mathScore;
    double chineseScore;

    public Student(int id, String name, int age, double mathScore, double chineseScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
    }

    // 计算学生总成绩
    public double getTotalScore() {
        return mathScore + chineseScore;
    }

    // 展示学生所有信息
    public void showStudentInfos() {
        System.out.println("学号: " + id);
        System.out.println("姓名: " + name);
        System.out.println("年龄:" + age);
        System.out.println("数学成绩:" + mathScore);
        System.out.println("语文成绩:" + chineseScore);
    }
}
```

```java
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "张三", 23, 90, 87);
        stu1.showStudentInfos();
        Student stu2 = new Student(2, "李四", 24, 69, 91);
        stu2.showStudentInfos();
    }
}
```

封装的好处：
- 更好的维护数据；
- 使用者无需关心内部实现，只要知道如何使用即可——这其实就是我们一直在用的 `Random`、`Scanner`：

```java
Random r = new Random();
int num = r.nextInt(100) + 1;

Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
```

**封装思想：合理隐藏，合理暴露**

案例：手机类中，打电话 call 时会顺带保存通话记录 saveLog。通话记录属于内部细节，调用者不需要（也不应该）手动调用它，所以把 saveLog 私有化：

```java
public class Phone {
    public void call(String name) {
        System.out.println("给" + name + "打电话");
        saveLog();
    }
    private void saveLog() {   // 私有化: 只允许本类内部使用
        System.out.println("通话记录");
        System.out.println("将联系人-时间-通话时长保存到本地");
    }
}
```

```java
public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.saveLog();   // 编译报错: saveLog() 在 Phone 中是 private 访问控制
    }
}
```

⚠️ 问题：课件修正帧中把调用写成了 `p.call();`，但 `call` 方法的定义是 `call(String name)`，需要一个 String 实参，缺参数调用无法编译。
修正建议：应写为 `p.call("张三");`（传入联系人名字）或调用其他带参形式。

修正后的正确调用：

```java
public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("张三");   // 打电话的同时内部自动保存通话记录
    }
}
```

**权限修饰符**

| 权限修饰符 | 说明 |
| --- | --- |
| `private` | 私有，只能在本类中访问 |
| `(default)` | 默认，同一个包中可以访问（不写修饰符时即为此权限）|
| `protected` | 受保护的，同一个包中或其他包的子类可访问 |
| `public` | 公开，任意位置可访问 |

可以修饰：成员变量、成员方法、构造方法。

⚠️ 问题：课件权限修饰符表格中写成了 `(defalut)`，单词拼写错误（e 和 a 位置颠倒）。
修正建议：正确拼写为 `(default)`。

**容易误解的地方**
- 封装不等于"写个类就完了"——还要主动用访问修饰符做"合理隐藏、合理暴露"；
- `private` 只是"隐藏"，常常配合 getter/setter 方法（见下节 JavaBean）实现"可控暴露"。

本节收束：封装 = 数据 + 方法的捆绑（成类）+ 权限修饰符控制访问（信息隐藏）；判断一个类写得好不好，先看它有没有做到合理隐藏、合理暴露。

**JavaBean**

核心结论：标准 JavaBean（也叫实体类）有两条硬性规范：
1. 类中的成员变量都要**私有**（private），并且要对外提供相应的 `getXxx`、`setXxx` 方法；
2. 类中提供**无参构造方法、带参构造方法**。

```java
public class Student {
    private String name;
    private double score;
    // getter setter 方法
    // 无参、带参构造方法
}
```

**实体类的应用场景**：实体类只负责**数据存取**，而对数据的处理交给其他类来完成，以实现**数据和数据业务处理相分离**。例如计算学生总成绩、展示学生所有信息，可以放到一个独立的"操作类"里：

```java
public class StudentOperator {
    private Student s;
    public StudentOperator(Student s) {
        this.s = s;   // 私有的成员变量 s 保存传入的学生对象
    }
    // 计算学生总成绩、展示学生所有信息等方法
}
```

⚠️ 问题：课件此处构造方法写成了 `this.Student = s;`，字段名拼写不一致——类中定义的私有成员变量名是 `s`，写成 `Student` 既不是成员变量名（编译报错），也有大小写困惑。
修正建议：应写为 `this.s = s;`（this.s 指成员变量 s，右边是参数 s）。

**容易误解的地方**
- JavaBean 的 getter/setter 不是"必须手写"的体力活，但初学阶段要亲手写一遍理解它的作用：私有字段 + 公开取值赋值入口；
- 构造方法建议无参、带参都给：带参用于创建时直接初始化，无参用于框架后续配套 setter 赋值。

本节收束：JavaBean = 私有成员变量 + getter/setter + 无参/带参构造；实体类管数据、其它类管业务，这就是"数据的存取与业务处理相分离"。

**static 关键字**

核心结论：static 是**静态**的意思，可以修饰成员变量，也可以修饰成员方法。

**static 修饰成员的特点（三条）**
1. 被其修饰的成员，被该类的**所有对象共享**；
2. 多了一种调用方式，可以**通过类名调用**；
3. 随着类的加载而加载，**优先于对象存在**。

**static 内存图（共享数据的例子）**

```java
class User {
    String name;
    int age;
    static int onLineNumber;   // 静态成员变量: 在线人数
}

public class StaticTest1 {
    public static void main(String[] args) {
        User.onLineNumber++;       // 可以直接用类名访问
        User u1 = new User();
        u1.name = "张三";
        u1.age = 23;
        System.out.println(u1.name + "---" + u1.age + "---" + u1.onLineNumber);
        // 张三---23---1

        User.onLineNumber++;
        User u2 = new User();
        u2.name = "李四";
        u2.age = 24;
        System.out.println(u2.name + "---" + u2.age + "---" + u2.onLineNumber);
        // 李四---24---2
    }
}
```

内存要点：
- 非静态的 name、age 每 new 一个对象就各存一份（堆中 u1、u2 各有一套）；
- `static int onLineNumber` 不在对象里，而是存于**方法区的静态成员变量区**，全程只有一份：第一个人上线后为 1，第二个人上线后为 2，所有对象（以及类名）看到的都是这同一个值。

**static 的使用场景**
- static 成员变量：存放**共享数据**（如在线人数）；
- static 成员方法：常用于**工具类**。

**数组工具类案例**

编写一个类 ArrayTools，内部编写三个方法：
1. 从数组中找最大值；
2. 从数组中找最小值；
3. 打印出数组中所有的元素。

（工具类的典型用法：方法都写为 static，调用时直接用 `ArrayTools.方法名(数组)`，不需要创建对象。）

**static 的注意事项**
- static 方法中，**只能直接访问静态成员**（想访问非静态成员必须先创建对象）；
- static 中**不允许使用 this 关键字**（this 代表当前对象，而静态方法优先于对象存在，没有对象可指）。

**容易误解的地方**
- "类名调用"不是唯一方式——用对象名也能调静态成员（如 `u1.onLineNumber`），只是编译器会自动转换成类名调用，不推荐这样写；
- 静态成员随类加载而存在、程序结束才消失，生命周期比对象长，因此它**不能直接**访问在"堆里"的实例成员。

本节收束：static 三特点（共享、类名调用、优先于对象）+ 两注意（只能直接访问静态成员、无 this）+ 两场景（共享数据、工具类方法）。

**重新认识 main 方法**

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
    }
}
```

main 方法每个部分修饰的意义：
- `public`：被 JVM 调用，访问权限足够大；
- `static`：被 JVM 调用，不用创建对象（所以 main 是静态的；也正因为 main 是静态的，测试类中其他方法也需要是静态的，才能被 main 直接调用）；
- `void`：被 JVM 调用，不需要给 JVM 返回值；
- `main`：一个通用的名称，虽然不是关键字，但是被 JVM 识别；
- `String[] args`：以前用于接收键盘录入数据的，现在没用了。

**容易误解的地方**：main 方法的名字、修饰符、参数类型一个都不能改——JVM 是按这个固定格式找到程序入口的，改了就不是入口了。

本节收束：第八章围绕"类与对象"展开：类是设计图、对象是实物；三个内存图是底层模型；成员变量与局部变量差异、this、构造方法、封装、JavaBean、static 是围绕"造对象、管数据、控权限、做共享"的七个关键点。到这一步，你已经具备自己设计"学生类、手机类"这类程序内对象的能力。

### 第九章：面向对象高级

本章知识地图：继承 → Object 类 → final 关键字 → 抽象类 → 接口 → 多态 → 代码块 → 内部类 → Lambda 表达式（另有"包"的内容穿插在内部类之前）。

**继承**

核心结论：继承是面向对象三大特征之一，**让类与类之间产生关系（子父类关系），子类可以直接使用父类中非私有的成员**。

先看问题：程序里有程序员 Coder 和项目经理 Manager 两个类，都有姓名、年龄、工资三个成员变量——重复代码出现了。把共性抽到一个父类 Employee 里：

```java
public class Employee {
    String name;    // 姓名
    int age;        // 年龄
    double salary;  // 工资
}

public class Coder extends Employee {
}

public class Manager extends Employee {
}
```

继承的格式：`public class 子类名 extends 父类名 { }`
- `Fu`（父类）也被称为基类、超类；
- `Zi`（子类）也被称为派生类。

**什么时候使用继承？** 当类与类之间，存在相同（共性）的内容，并且产生了 **is a** 的关系，就可以考虑使用继承来优化代码。例如：
- 学生 is a 人、老师 is a 人 → 父类：人（姓名、年龄）；
- 项目经理 is a 员工、程序员 is a 员工 → 父类：员工（姓名、工号、工资）。

反例（错误示范）：程序员（id、姓名、年龄）和商品（id、品牌、价格）都有 id，就把父类硬写成"id、姓名、年龄、品牌、价格"——它们没有 is a 关系，不能这样抽父类。

**继承的好处**：提高代码的复用性、维护性。

**继承中的成员访问特点——成员变量**

```java
public class Fu {
    int num = 10;
}

public class Zi extends Fu {
    int num = 20;
    public void method() {
        System.out.println(num);   // 根据就近原则，优先使用子类的 → 20
    }
}
```

思考：子父类中出现重名的成员变量，优先使用谁？——根据**就近原则**，优先使用子类的。如果就要用父类的，需要用 `super` 关键字来访问。

三个层次的访问演示（方法内局部变量 30、子类成员变量 20、父类成员变量 10）：

```java
public class Fu {
    int num = 10;
}

class Zi extends Fu {
    int num = 20;
    public void method() {
        int num = 30;
        System.out.println(num);        // 30（局部变量）
        System.out.println(this.num);   // 20（本类成员变量）
        System.out.println(super.num);  // 10（父类成员变量）
    }
}
```

- `this`：调用本类成员；
- `super`：调用父类成员。

**继承中的成员访问特点——成员方法**

思考：子类继承了父类之后，是否可以自己继续定义方法？可以（写子类自己的方法）。那如果子类想改掉父类方法的实现呢？

```java
public class Fu {
    public void method() {
        System.out.println("父类method...");
    }
}

class Zi extends Fu {
    public void method() {
        System.out.println("子类method...");
    }
}
```

**方法的重写（Override，又称方法覆盖）**：在继承体系中，子类可以继承到父类的方法，但有时子类并不想原封不动地继承，而是想作一定的修改，这就需要重写。使用场景：子类需要父类的方法，但觉得父类的方法不好，想要修改或者增强，就可以重写父类方法。

格式要求：**子类重写父类方法的时候，方法声明需要和父类完全一致**（方法名、参数、返回值类型保持一致）。

注意事项：
1. 父类中私有方法不能被重写；
2. 子类重写父类方法时，访问权限必须**大于等于**父类。

**权限修饰符访问能力表**

| 权限修饰符 | 同一个类中 | 同一个包中 | 不同包的子类 | 不同包的无关类 |
| --- | --- | --- | --- | --- |
| `private` | √ | | | |
| `(default)` | √ | √ | | |
| `protected` | √ | √ | √ | |
| `public` | √ | √ | √ | √ |

**Java 中继承的特点**：Java 只支持**单继承**，不支持多继承，但支持**多层继承**。

- 为什么不支持多继承？假设父类 A 和父类 B 都有 `method()`（一个输出"复习数学"、一个输出"复习语文"），子类同时继承两个父类后调用 `method()`——继承来的方法到底听谁的？就懵了，所以 Java 禁止多继承；
- 为什么多层继承可以？`C extends B`，`B extends A`，调用链是单线的：C 没有就找 B，B 没有就找 A，不存在二义性。例如 C 继承 B、B 重写了 A 的方法，`c.method()` 输出的是最近一次重写的结果（复习数学）。

**继承中的成员访问特点——构造方法**

问题一：构造方法能否被继承？——不能。子类需要自己手动编写构造方法。

```java
public class Fu {
    public Fu() {
    }
}

public class Zi extends Fu {
}
```

问题二：子类在初始化之前，是否需要先完成父类的初始化？——需要。因为子类要用到父类的成员数据，得先让父类数据存在。用什么方法完成初始化？构造方法！

那么子类是如何调用到父类构造方法的呢？——**在所有的构造方法中，都默认隐藏了一句话 `super();`**，通过这句代码来访问父类的空参构造方法。

```java
public class Fu {
    int num = 10;
}

public class Zi extends Fu {
    public Zi() {
        super();              // 默认隐藏的代码
        System.out.println(super.num);   // 父类初始化完成后，这里可以拿到 10
    }
}
```

小结：子类不能继承父类的构造方法、需手写构造方法；子类所有构造方法中默认隐藏 `super();`。

**继承中的构造方法执行流程（内存图解）**

```java
public static void main(String[] args) {
    Student stu = new Student("钢门吹雪", 23, 100);
    System.out.println(stu.getName() + "---" + stu.getAge() + "---" + stu.getScore());
}

public class Student extends Person {
    private int score;
    public Student(String name, int age, int score) {
        super(name, age);      // 第1步：调用父类带参构造
        this.score = score;    // 第2步：初始化本类成员
    }
}

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

执行流程拆解：
1. main 进栈，`new Student("钢门吹雪", 23, 100)` 先在堆中为子类对象开辟空间（地址 0x0011），其中包含父类存储空间标识（图中记作 Person(super)）和子类自己的部分；所有成员变量先有默认值（name=null、age=0、score=0）；
2. 调用子类构造方法 Student()，栈帧中 this = 0x0011，参数 name="钢门吹雪"、age=23、score=100；
3. 第一句 `super(name, age);` 调用父类构造方法 Person()，它同样通过 this = 0x0011 找到堆中对象的父类区域，把 name、age 赋值为"钢门吹雪"、23；
4. 回到子类构造方法，执行 `this.score = score;` 把 score 赋值为 100；
5. 子类构造执行完毕出栈，对象初始化完成，地址 0x0011 赋给栈中的 stu；
6. 打印时通过 getName()、getAge()（父类区域）和 getScore()（子类区域）取出数据：钢门吹雪---23---100。

**this 与 super 对比表**

- this：代表**本类对象的引用**（地址）；
- super：代表**父类存储空间的标识**（可以理解为"指向父类区域"）。

| 关键字 | 访问成员变量 | 访问成员方法 | 访问构造方法 |
| --- | --- | --- | --- |
| `this` | `this.本类成员变量;` | `this.本类成员方法();` | `this(); this(…);` 调用本类构造方法 |
| `super` | `super.父类成员变量;` | `super.父类成员方法();` | `super(); super(…);` 调用父类构造方法 |

注意：`this()` 和 `super()` 二者都在争夺构造方法的第一行位置，**所以二者不能共存**（一个构造方法里只能二选一）。

**继承必掌握案例**

需求：
- 员工类 Employee：成员变量（姓名、年龄、工资）、成员方法（work 方法），要求私有成员变量、提供空参带参构造、提供 setXxx/getXxx 方法、编写 work 方法；
- 程序员类 Coder 继承 Employee：提供空参带参构造、重写 work 方法（输出"姓名为张三，年龄为 23，工资为 15000 的程序员正在编写代码"）；
- 项目经理类 Manager 继承 Employee：编写子类特有的成员变量"奖金"，私有化并提供 setXxx/getXxx、提供空参带参构造、重写 work 方法（输出"姓名为李四，年龄为 24，工资为 18000，奖金为 5000 的项目经理正在分配任务…"）。

这个案例演示了继承的标准套路：**父类抽共性（数据 + 行为）→ 子类补特有成员 → 子类重写父类方法做差异化**。

本节收束：继承这一节的四个高频考点——① 什么时候用（共性 + is a）；② 成员变量就近原则（super 破局）；③ 方法重写（声明一致、权限不缩小、私有不能重写）；④ 构造方法不能被继承、子类构造默认隐藏 `super();`。

**Object 类**

核心结论：**所有的类，都直接或者间接地继承了 Object 类（祖宗类）**。Object 类的方法是一切子类都可以直接使用的，所以要学习 Object 类的方法。

**toString 方法**

| 方法名 | 说明 |
| --- | --- |
| `public String toString()` | 默认是返回当前对象在堆内存中的地址信息：类的全限名@内存地址（更准确说是"类的全类名 @ 十六进制哈希值"）|

开发中直接输出对象，默认输出对象的地址其实是毫无意义的；更多的时候是希望看到对象的内容数据而不是对象的地址信息。所以**开发中建议重写 toString 方法，以便展示对象属性信息**。

**equals 方法**

| 方法名 | 说明 |
| --- | --- |
| `public boolean equals(Object o)` | 比较两个对象是否相同 |

父类 equals 方法存在的意义，就是为了被子类重写，以便子类自己来定制比较规则。

**== 和 equals 的区别**（高频面试点）：
- `==` 号可以比较基本数据类型，也可以比较引用数据类型——基本类型比较**数据值**，引用类型比较**地址值**；
- `equals` 方法用于比较引用数据类型——此方法来自于 Object 类，默认比较对象**地址值**；如果不希望比较地址值，可重写该方法，自定义比较规则。

**Objects 类**

（注意：Objects 类与 Object 是两回事，并不构成继承关系。）Objects 类是从 JDK 1.7 开始之后才有的工具类。

| 方法名 | 说明 |
| --- | --- |
| `public static boolean equals(Object a, Object b)` | 比较两个对象，底层会先进行非空判断，从而可以避免空指针异常，再进行 equals 比较 |
| `public static boolean isNull(Object obj)` | 判断变量是否为 null |

Objects 中 equals 方法的源码：

```java
public static boolean equals(Object a, Object b) {
    return (a == b) || (a != null && a.equals(b));
}
```

**容易误解的地方**：Objects 中的 equals 方法仅仅是个工具类中的方法，底层依赖于我们自己编写的 equals 方法——它的优势只是加入了健壮性判断（先判 null 避免空指针异常），比较规则仍然由被比较对象的 equals 决定。

本节收束：Object 是祖宗类，toString 和 equals 是最常被重写的两个方法；`==` 比地址（基本类型比值）、`equals` 默认也比地址但可重写定制；Objects.equals 是防空指针的工具版。

**final 关键字**

核心结论：final 关键字是**最终**的意思，可以修饰方法、类、变量。

final 修饰的特点：
- 修饰方法：表明该方法是最终方法，**不能被重写**；
- 修饰类：表明该类是最终类，**不能被继承**；
- 修饰变量：表明该变量是常量，**不能再次被赋值**。

命名示例：普通变量 `max` → 常量 `MAX`；多个单词 `maxValue` → `MAX_VALUE`（常量名建议全大写、下划线分隔）。

**final 修饰变量的细节补充**
1. 变量是基本类型：final 修饰指的是基本类型的**数据值**不能发生改变；
2. 变量是引用类型：final 修饰指的是引用类型的**地址值**不能发生改变，**但地址里面的内容是可以发生改变的**；
3. 成员变量如果被 final 修饰，需要在**构造方法结束之前**完成赋值。

**容易误解的地方**：`final int[] arr = {1, 2, 3};` 之后 `arr[0] = 100;` 是合法的——final 锁的是 arr 保存的地址（不能换成另一个数组），不锁数组里的元素。

本节收束：final 三修饰——方法不能重写、类不能继承、变量不能改；基本类型锁"值"、引用类型锁"地址"；成员变量赋值时机是定义时或构造方法中。

**抽象类**

核心结论：抽象类是一种**特殊的父类**，特殊点在于**内部可以编写抽象方法**。定义抽象类和抽象方法使用的关键字是 `abstract`。

**抽象方法的定义由来**：将共性的行为（方法）抽取到父类之后，发现该方法的实现逻辑无法在父类中给出具体明确，该方法就可以定义为抽象方法。

以上一节的员工案例为例：员工类里要写"工作（Work）"方法，但"工作"具体怎么干，程序员和项目经理各不相同——父类里写不出统一的实现，就把它定义为抽象方法，交给子类各自去重写。

```java
public abstract class Employee {
    private String name;
    private int age;
    private double salary;

    public abstract void work();   // 抽象方法：没有方法体，交给子类实现
}
```

**抽象类注意事项**
1. 抽象类**不能实例化**；
2. 抽象类**存在构造方法**；
3. 抽象类中可以存在**普通方法**；
4. 抽象类的子类：要么重写抽象类中的**所有**抽象方法，要么子类**也是抽象类**。

**abstract 关键字的冲突问题**
- `final`：被 abstract 修饰的方法，强制要求子类重写；被 final 修饰的方法子类不能重写——二者矛盾，冲突；
- `private`：被 abstract 修饰的方法，强制要求子类重写；被 private 修饰的方法子类不能重写（根本访问不到）——冲突；
- `static`：被 static 修饰的方法可以类名调用，而类名调用抽象方法没有意义（抽象方法没有方法体）——冲突。

**小结问答**：
- 抽象类是否可以实例化？不可以，避免调用内部的抽象方法；
- 抽象类不允许创建对象，内部是否可以编写构造方法？可以，子类可以通过 super() 访问；
- 抽象类中可以写普通的方法吗？可以，子类可以直接继承使用；
- 抽象类的子类需要做什么？要么重写所有抽象方法，要么将子类变成抽象类；
- abstract 与哪些关键字冲突？private、final、static。

**模板设计模式**

模板设计模式：把抽象类整体看成一个**模板**，模板中不能决定的东西定义成**抽象方法**，让使用模板的类（继承抽象类的类）去重写抽象方法实现需求。

设计模式是软件开发中针对反复出现问题总结归纳出的通用解决方案。

生活化理解：写作文《我的爸爸》时，开头"…"、结尾"啊~ 这就是我的爸爸"是固定的（模板已定义的通用结构），中间的内容由每个学生自己写（使用者只关心自己需要实现的功能）。

**容易误解的地方**：模板设计模式的核心不是"多写抽象方法"，而是"固定流程 + 可变细节分离"——流程骨架放在父类（普通方法里按顺序调用抽象方法），细节留给子类重写。

本节收束：抽象类 = 写不出具体实现的共性方法的容身处；四注意（不能实例化、有构造方法、可有普通方法、子类要么全重写要么也是抽象类）；与 private、final、static 冲突；配合模板设计模式是它的典型用途。

**接口**

核心结论：**接口体现的思想是对规则的声明**。日常生活中，规则是一句句的声明（能干什么）；Java 中的接口更多体现的是**对行为的抽象**。

对照理解：抽象类对事物做抽象（描述事物是什么），接口对行为抽象（制定做什么的规则）。

**接口的定义与实现**
- 接口用关键字 `interface` 来定义：`public interface 接口名 {}`
- 接口**不能实例化**；
- 接口和类之间是**实现关系**，通过 `implements` 关键字表示：`public class 类名 implements 接口名 {}`
- 接口的子类（实现类）：要么重写接口中的所有抽象方法，要么是抽象类。

```java
public interface Inter {
    public abstract void method1();
    public abstract void method2();
}

public class InterImpl implements Inter {
    @Override
    public void method1() {
    }
    @Override
    public void method2() {
    }
}
```

**接口中的成员特点**
- 成员变量：只能是**常量**，默认修饰符 `public static final`；
- 构造方法：**没有**；
- 成员方法：只能是**抽象方法**，默认修饰符 `public abstract`（JDK8 和 JDK9 中有一些新特性，见后文）。

**类和接口之间的各种关系**
- 类和类的关系：**继承关系**，只能单继承，但是可以多层继承；
- 类和接口的关系：**实现关系**，可以单实现，也可以多实现，还可以在**继承一个类的同时实现多个接口**；
- 接口和接口的关系：**继承关系**，可以单继承，也可以多继承。

**抽象类和接口的对比**

| 对比项 | 抽象类 | 接口 |
| --- | --- | --- |
| 成员变量 | 可以定义变量，也可以定义常量 | 只能定义常量 |
| 成员方法 | 可以定义具体方法，也可以定义抽象方法 | 只能定义抽象方法（JDK8 后增加默认/静态方法，见后文）|
| 构造方法 | 有 | 没有 |

**接口的应用场景**

接口可以为程序制定规则，让代码更加规范。看一个反例（也是例子）：订单业务类 OrderService 直接写成实现类：

```java
public class OrderService {
    public void method1() {
        System.out.println("创建订单");
    }
    public void method2() {
        System.out.println("查询单个订单");
    }
    public void method3() {
        System.out.println("查询订单列表");
    }
    public void method4() {
        System.out.println("取消订单");
    }
    public void method5() {
        System.out.println("完结订单");
    }
}
```

问题：method1~method5 看不出业务含义、名字起得随意，接手的人没法规范地修改。规范做法是先声明接口、再写实现类：

```java
/**
 * 订单业务接口
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create();
    /**
     * 查询单个订单
     */
    void findOne();
    /**
     * 查询订单列表
     */
    void findList();
    /**
     * 取消订单
     */
    void cancel();
    /**
     * 完结订单
     */
    void finish();
    /**
     * 支付订单
     */
    void paid();
}

public class OrderServiceImpl implements OrderService {
    @Override
    public void create() {
        // ...
    }
    @Override
    public void findOne() {
        // ...
    }
    @Override
    public void findList() {
        // ...
    }
    @Override
    public void cancel() {
        // ...
    }
    @Override
    public void finish() {
        // ...
    }
    @Override
    public void paid() {
        // ...
    }
}
```

**JDK8 接口新特性（一）：默认方法**

场景：项目 Version1.0 成功上线（Inter 接口、AInterImpl、BInterImpl 两个实现类都正常）；Version2.0 需要对 Inter 接口丰富，加入 10 个新的方法——如果直接加抽象方法，所有实现类全部编译报错。如何能丰富接口功能的同时，又不对实现类代码更改呢？

答案：允许在接口中定义非抽象方法，但需要使用关键字 **default** 修饰，这些方法就是**默认方法**。作用：**解决接口升级的问题**。

- 定义格式：`public default 返回值类型 方法名(参数列表) {}`，范例：`public default void show() {}`；
- 默认方法不是抽象方法，所以**不强制被重写**（但是可以被重写，重写的时候去掉 default 关键字）；
- `public` 可以省略，**default 不能省略**；
- 如果实现了多个接口，多个接口中存在相同的方法声明，子类就必须对该方法进行重写。

**JDK8 接口新特性（二）：静态方法**

- 接口中允许定义 static 静态方法：`public static 返回值类型 方法名(参数列表) {}`，范例：`public static void show() {}`；
- 静态方法**只能通过接口名调用**，不能通过实现类名或者对象名调用；
- `public` 可以省略，**static 不能省略**。

**JDK9 接口新特性：私有方法**

- 接口中允许定义 private 私有方法；
- 格式1：`private 返回值类型 方法名(参数列表) {}`，范例：`private void show() {}`；
- 格式2：`private static 返回值类型 方法名(参数列表) {}`，范例：`private static void method() {}`。

引入过程示例：接口中两个默认方法 start() 和 end() 都要打印"日志记录"，代码重复——先把日志记录抽取成一个默认方法 log()：

```java
interface Inter {
    public default void start() {
        System.out.println("start方法执行...");
        log();
    }
    public default void end() {
        System.out.println("end方法执行...");
        log();
    }
    public default void log() {
        System.out.println("日志记录");
    }
}
```

但 log() 是给接口内部方法用的，不应该暴露给实现类——JDK9 后可以用 private 修饰：

```java
interface Inter {
    public default void start() {
        System.out.println("start方法执行...");
        log();
    }
    public default void end() {
        System.out.println("end方法执行...");
        log();
    }
    private void log() {
        System.out.println("日志记录");
    }
}
```

本节收束：接口是"规则声明书"——成员变量是常量（public static final）、没有构造方法、方法默认 public abstract；类与接口是多实现关系；JDK8 加入默认方法和静态方法（解决接口升级）、JDK9 加入私有方法（内部复用）。

**多态**

核心结论：多态即**同一个行为具有多个不同表现形式或形态的能力**。

**多态的三个前提（缺一不可）**
1. 有继承 / 实现关系；
2. 有方法重写；
3. 有父类引用指向子类对象。

**多态的成员访问特点**（重要）：
- 成员变量：**编译看左边（父类），执行也看左边（父类）**；
- 成员方法：**编译看左边（父类），执行看右边（子类）**（因为方法被重写了）；
- 静态成员：编译看父类，运行看父类。

**多态的好处和弊端**
- 好处：提高了程序的扩展性。
  - 对象多态：将方法的形参定义为父类类型，这个方法可以接收该父类的任意子类对象；
  - 行为多态：同一个行为，具有多个不同表现形式或形态的能力。
- 弊端：**不能使用子类特有的成员**。

```java
public static void main(String[] args) {
    useAnimal(new Dog());
    useAnimal(new Cat());
}
public static void useAnimal(Animal a) {
    // Animal a = new Dog();
    // Animal a = new Cat();
    a.eat();
}
```

因为形参是 Animal 类型，所以只有 Animal 里定义过的成员才能通过 a 访问到——想用 Dog 特有的方法就要向下转型（见下）。

**多态中的转型**

- **向上转型**：从子到父（父类引用指向子类对象），如 `Fu f = new Zi();`；
- **向下转型**：从父到子（将父类引用所指向的对象，转交给子类类型），如 `Zi z = (Zi)f;`。

**容易误解的地方**：向下转型必须写强制类型转换 `(Zi)`——写成 `Zi z = f;` 会编译报错（父类类型不能自动转成子类类型）。转换的本质是"把地址交给子类类型的变量"，并没有造新对象。

**多态中的转型问题**：如果被转的引用类型变量，对应的实际类型和目标类型不是同一种类型，那么在转换的时候就会出现 `ClassCastException`（类型转换异常）。

解决工具：关键字 **instanceof**。
- 使用格式：`对象名 instanceof 类型`
- 作用：判断一个对象是否是一个类的实例；
- 通俗理解：判断关键字左边的对象，是否是右边的类型，返回 boolean 类型结果。

**多态综合案例：模拟支付接口**

某网站需要开发一个支付功能，需要支持多种支付方式（支付平台支付、银行卡网银支付、信用卡快捷支付）。这类"同一行为、多种实现"的需求，正是接口 + 多态的典型应用：接口声明支付规则（行为抽象），各支付方式写自己的实现类，调用方用父类型（接口类型）的引用统一处理，扩展时新增实现类即可。

**延伸：Object 的 equals 与多态的关系**

上一节提到的 equals 方法（`public boolean equals(Object o)`）形参就是 Object 类型——任何对象都能传进去，这就是对象多态的应用；子类重写 equals 定制比较规则，运行时执行子类版本，这就是行为多态的应用。

本节收束：多态三前提（继承/实现、重写、父类引用指向子类对象）+ 成员访问口诀（成员变量看父类、成员方法执行看子类、静态成员都看父类）+ 转型规则（向上自动、向下强制、越级强转抛 ClassCastException，用 instanceof 先判断）。

**代码块**

核心结论：在 Java 类下，使用 `{ }` 括起来的代码被称为**代码块**。分类：局部代码块、构造代码块、静态代码块、同步代码块（同步代码块在多线程章节学习）。

- **局部代码块**
  - 位置：方法中定义；
  - 作用：限定变量的生命周期，提早释放，提高内存利用率。

- **构造代码块**
  - 位置：类中方法外定义；
  - 特点：构造方法执行时，都会执行该代码块中的代码，并且在构造方法执行**前**执行；
  - 作用：将多个构造方法中相同的代码，抽取到构造代码块中，提高代码的复用性。

- **静态代码块**
  - 位置：类中方法外定义；
  - 特点：需要通过 static 关键字修饰，随着类的加载而加载，并且**只执行一次**；
  - 作用：在类加载的时候做一些数据初始化的操作。

**容易误解的地方**：构造代码块在每次创建对象时都会执行（每个构造方法调用前）；静态代码块只在类加载时执行一次，与创建多少个对象无关。

本节收束：四种代码块中，静态代码块（一次性初始化）和构造代码块（构造前统一执行）最常用，局部代码块用于控制变量作用域，同步代码块留待多线程章节。

**包**

核心结论：**包（package）本质来说就是文件夹，用来管理类文件的**。

建包：
- 语法格式：`package 公司域名倒写.技术名称`，包名建议全部英文小写，且具备意义；
- 建包语句必须在**第一行**，一般 IDEA 工具会帮助创建。

```java
package com.itheima.pojo;

public class Student {
}
```

导包（import）：
- 相同包下的类可以直接访问，不同包下的类必须导包才可以使用，导包格式：`import 包名.类名;`；
- 如果导入的类在 `java.lang` 包（核心包），就不需要编写 import 导包代码（如 String、System）；
- 假如一个类中需要用到两个不同包但名称一样的类，那么默认只能导入一个，另一个类要**带包名访问**（用全限定名）。

本节收束：包 = 文件夹式管理 + 首行声明 + 域名倒写命名；跨包用 import、同名类用全限定名、java.lang 免导包。

**内部类**

核心结论：**内部类就是定义在一个类里面的类**。

```java
class Outer {
    // 内部类
    class Inner {
    }
}
```

**创建对象的格式**：`外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();`
范例：`Outer.Inner in = new Outer().new Inner();`

（对比:如果是在外部类的内部直接使用，可以简写成 `Inner i = new Inner();`。）

**访问特点**
- 内部类中，访问外部类成员：直接访问，包括私有；
- 外部类中，访问内部类成员：需要创建对象访问。

**三层重名变量案例（78/110/150）**

```java
class Outer {
    int num = 150;
    class Inner {
        int num = 110;
        public void show() {
            int num = 78;
            System.out.println(num);             // 78  局部变量
            System.out.println(this.num);        // 110 内部类成员变量
            System.out.println(Outer.this.num);  // 150 外部类成员变量
        }
    }
}
```

要点：多层重名时，直接用名字取最近的（局部变量）；`this.num` 取本类（内部类）的；`Outer.this.num` 取外部类的。

**为什么学习内部类？** 比如写一个 JavaBean 描述汽车，属性包括汽车品牌、车龄、颜色和发动机的品牌、使用年限——发动机显然"属于"汽车，作为独立类平铺在外面的封装性不够好；把它定义为 Car 的内部类，封装性更好（内部类可以直接访问外部类成员包括私有，外部类访问内部类则要创建对象）。**但是使用起来较为麻烦，建议少用。**

**内部类的分类**：成员内部类、静态内部类、局部内部类、匿名内部类。

**静态内部类**：有 static 修饰的成员内部类。

```java
class Outer {
    static class Inner {
    }
}
```

创建对象格式：`外部类名.内部类名 对象名 = new 外部类名.内部类对象();`
范例：`Outer.Inner in = new Outer.Inner();`（不需要先创建外部类对象了）。

**局部内部类**：放在方法、代码块、构造器等执行体中（鸡肋语法，了解即可）。

**匿名内部类**
- 概述：匿名内部类本质上是一个**特殊的局部内部类**（定义在方法内部）；
- 前提：需要存在一个接口或类；
- 格式：`new 类名 / 接口 () { }`；
- 作用：匿名内部类可以使代码更加简洁，**定义一个类的同时对其进行实例化**。

本节收束：内部类五种访问姿势记牢——成员内部类 `new Outer().new Inner()`、静态内部类 `new Outer.Inner()`、局部内部类在方法里、匿名内部类 `new 接口() {}` 边定义边实例化；重名变量用 this、Outer.this 逐层区分。

**Lambda 表达式**

核心结论：Lambda 表达式是 **JDK8 开始后的一种新语法形式**，作用是**简化匿名内部类的代码写法**。

**什么是函数式接口？**
- 首先必须是接口，其次接口中有且仅有一个抽象方法；
- 通常会在接口上加上一个 `@FunctionalInterface` 注解，标记该接口必须是满足函数式接口。

**Lambda 表达式的简化格式**

```java
(匿名内部类被重写方法的形参列表) -> {
    被重写方法的方法体代码。
}
```

注：`->` 是语法形式，无实际含义。最简形式可写作 `() -> {}`。

**注意：Lambda 表达式只能简化函数式接口的匿名内部类的写法形式**（普通类、多抽象方法的接口不可以）。

**Lambda 表达式的省略写法**（省略规则）
1. 参数类型可以省略不写；
2. 如果只有一个参数，参数类型可以省略，同时 `()` 也可以省略；
3. 如果 Lambda 表达式的方法体代码只有一行代码：可以省略大括号不写，同时要省略分号；
4. 此时，如果这行代码是 return 语句，必须省略 return 不写，同时也必须省略 `;` 不写。

**Lambda 表达式和匿名内部类的区别**
- 使用限制不同：匿名内部类可以操作类、接口；Lambda 表达式只能操作函数式接口；
- 实现原理不同：匿名内部类编译之后产生一个单独的 `.class` 字节码文件；Lambda 表达式编译之后没有一个单独的 `.class` 字节码文件。

本节收束：Lambda 三问——格式（`() -> {}`）、前提（函数式接口：有且仅有一个抽象方法，常配 @FunctionalInterface 注解）、细节（省略规则、不生成独立 .class 文件）；它是匿名内部类的"轻量写法"，两者能互相印证理解。

第一阶段收官小结：第九章把面向对象从"会用"推进到"用得好"——继承与多态解决了代码复用和扩展性，抽象类与接口解决了规则的抽象与实现分离，Object/final/代码块/内部类/Lambda 补齐了 Java 语法的工具箱。至此，Java 基础语法与面向对象体系已经闭环。

### 第十章：常用API

**API 是什么**

核心结论：API（Application Programming Interface）即**应用程序编程接口**——就是别人写好的一些类，给咱们程序员直接拿去调用即可解决问题。

已经学习过的 API：`Scanner`（键盘录入）、`Random`（随机数）。后续还会遇到一大批常用类：AbstractCollection、SimpleDateFormat、Collection、Comparator、ConcurrentModificationException、Date、StringBuilder、LinkedList、BigDecimal、Math、HashMap、HashSet、BufferedOutputStream、BufferedReader、LinkedHashSet、Map、ArrayList、Runnable、Optional、String、BufferedInputStream、Thread、BufferedWriter、Iterator、ArrayIndexOutOfBoundsException、StringIndexOutOfBoundsException、TreeSet、Set、Socket、DatagramPacket、DatagramSocket 等。

查阅工具：**JDK-API帮助文档.CHM**（课件中提供的离线帮助文档，日常查类、查方法用）。

本章聚焦两个最常用的类：**String 类**、**StringBuilder 类**。

**String 类**

字符串在开发中的场景：登录时把用户输入的字符串跟正确的用户名和密码比较；聊天中把敏感词（如 TMD）替换成 ***……

**String 类的特点**
1. Java 程序中所有**双引号**字符串，都是 String 类的对象；
2. 字符串在创建之后，其**内容不可更改**；
3. 字符串虽然不可改变，但是**可以被共享**。

**String 类的常见构造方法**

| 构造方法 | 说明 |
| --- | --- |
| `public String()` | 创建空白字符串，不含任何内容 |
| `public String(String original)` | 根据传入的字符串，创建字符串对象 |
| `public String(char[] chs)` | 根据字符数组，创建字符串对象 |

**String 类的常见面试题（内存分析）**

面试题一：

```java
public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
    }
}
```

输出 true。原因：`"abc"` 作为字面量存放在**方法区的字符串常量池（StringTable）**中，s1 先指向池中的 "abc"；s2 再次取字面量时，池中已有，直接复用同一个地址——所以 `s1 == s2` 为 true（地址相同）。

面试题二：

```java
public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);
    }
}
```

输出 false。原因：`new String("abc")` 会在**堆内存中新建一个 String 对象**（对象内部持有 byte 数组存放 97、98、99 对应的字符），s2 保存的是这个**新对象的地址**；而 s1 保存的是常量池的地址。两个地址不同，== 为 false。

面试题三：

```java
public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";
        System.out.println(s1 == s3);
    }
}
```

输出 false。原因：**变量参与的字符串拼接**底层不是直接把结果放进常量池——s2 + "c" 会先创建 `new StringBuilder()`，把 "ab"、"c" 追加进去，再调用 toString() 生成一个**新的 String 对象**。所以 s3 是堆中的新对象，与常量池中的 s1 地址不同。

面试题四：

```java
public class StringTest1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a" + "b" + "c";
        System.out.println(s1 == s2);
    }
}
```

输出 true。原因：**纯字面量的拼接在编译期就完成了**（编译后等价于 String s2 = "abc";），仍然指向常量池中同一个对象。

**容易误解的地方**：== 比较的是地址（引用类型），四道题的答案不同，本质区别是"常量池复用的地址"还是"运行时 new 出来的新地址"。

**String 类用于比较的方法**

```java
public boolean equals(要比较的字符串)         // 完全一样结果才是 true，否则为 false
public boolean equalsIgnoreCase(要比较的字符串) // 忽略大小写的比较
```

字符串比较要比较"内容"时，用 equals 而不是 ==。

**案例：模拟用户登录**

需求：已知正确的用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后给出相应的提示。

实现思路：循环 3 次 → 键盘录入用户名、密码 → 用 equals 与正确用户名、密码比较 → 相同则提示登录成功并结束循环，3 次都错则提示机会用尽。

**String 字符串的遍历**

```java
public char[] toCharArray()        // 将字符串转换为字符数组
public char charAt(int index)      // 根据索引找字符
public int length()                // 返回字符串的长度
```

⚠️ 问题：课件中把 `charAt` 写成了 `chatAt`（两处：方法列表、方法小结），a 和 t 位置颠倒，照着写会提示"找不到方法"。
修正建议：正确方法名是 `charAt`，如 `s.charAt(0)`。

**案例：统计字符次数**

需求：键盘录入一个字符串，统计该字符串中大写字母字符、小写字母字符、数字字符出现的次数（不考虑其他字符）。例如输入 `aAb3&c2B*4CD1`，输出：

```text
小写字母: 3个
大写字母: 4个
数字字符: 4个
```

（说明：忽略大小写之外的符号 & * 不统计。）

⚠️ 问题：课件在输出示意中把"数字字符: 4个"写成了"数字字母: 4个"，与需求中"数字字符出现的次数"的说法不一致。
修正建议：应统一称为"数字字符"。

**String 字符串的截取方法**

```java
public String substring(int beginIndex, int endIndex)   // 截取
public String substring(int beginIndex)                 // 截取到末尾
```

注意点：
- 包头不包尾，包左不包右（包含 beginIndex，不包含 endIndex）；
- 只有返回值才是截取的子串（原字符串不变）。

**案例：手机号屏蔽**

需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽，最终效果为：156****1234。

思路：substring(0, 3) 取前 3 位 + "****" + substring(7) 取后 4 位。

**String 字符串的替换方法**

```java
public String replace(旧值, 新值)   // 替换
```

注意点：返回值才是替换之后的结果（原字符串不变）。

**案例：敏感词替换**

需求：键盘录入一个字符串，如果字符串中包含（TMD），则使用 *** 替换。

**String 字符串的切割方法**

```java
public String[] split(String regex)
```

根据传入的字符串作为规则进行切割，将切割后的内容存入字符串数组中，并将字符串数组返回。

**String 方法小结**

```java
public boolean equals(要比较的字符串)          // 比较内容
public boolean equalsIgnoreCase(要比较的字符串) // 比较内容，忽略大小写
public char[] toCharArray()                   // 将字符串转换为字符数组
public char charAt(int index)                 // 根据索引找字符
public int length()                           // 返回字符串的长度
public String substring(int beginIndex)       // 截取到末尾
public String substring(int beginIndex, int endIndex) // 根据开始和结束索引做截取，包含头不包含尾
public String replace(旧值, 新值)              // 替换
public String[] split(String regex)           // 切割
```

本节收束：String 三特点（双引号即对象、内容不可改、可共享）+ 四道面试题（常量池复用 / new 新对象 / 变量拼接走 StringBuilder / 字面量拼接编译期完成）；比较用 equals、遍历用 charAt/length/toCharArray、截取 substring（包左不包右）、替换 replace、切割 split。

**StringBuilder 类**

核心结论：StringBuilder 引入的目的是**提高字符串操作效率**。StringBuilder 是**字符串的缓冲区**，可以理解为一种容器；它是一种**可变的字符序列**（与 String 的"内容不可更改"相对）。

**StringBuilder 构造方法**

| 构造方法 | 说明 |
| --- | --- |
| `public StringBuilder()` | 创建一个空的字符串缓冲区（容器）|
| `public StringBuilder(String str)` | 创建一个字符串缓冲区，并初始化好指定的参数内容 |

**StringBuilder 常用方法**

| 方法名 | 说明 |
| --- | --- |
| `public StringBuilder append(任意类型)` | 添加数据，并返回对象本身 |
| `public StringBuilder reverse()` | 反转容器中的内容 |
| `public int length()` | 返回长度（字符出现的个数）|
| `public String toString()` | 通过 toString() 就可以实现把 StringBuilder 转换为 String |

⚠️ 问题：课件多处标题把 `StringBuilder` 拼成了 `StringBuiler`（漏掉字母 d，共 4 处小标题："StringBuiler 引入/介绍/构造方法/常用方法"）。
修正建议：正确类名是 `StringBuilder`，漏 d 的写法在代码中无法编译。

**案例：回文字符串**

需求：键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是。
- 对称字符串：123321、111；
- 非对称字符串：123123。

实现思路：把字符串反转后与原串比较（可用 StringBuilder 的 reverse()，也可用字符数组首尾双指针对照）。

**案例：按照指定的格式拼接字符串**

需求：定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回。调用该方法，并在控制台输出结果。
例如：数组为 `int[] arr = {1,2,3};`，执行方法后的输出结果为：`[1, 2, 3]`。

思路：用 StringBuilder 遍历拼接，注意最后一位后不加逗号。

**StringBuilder 原理（为什么要用它）**

用 "+" 拼接字符串的内存实况：

```java
public class Test {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = s1 + "b";
        String s3 = s2 + "c";
        System.out.println(s3);
    }
}
```

执行过程：`s1 + "b"` 时底层先 `new StringBuilder()`，把 "a"、"b" 装进去，再 `toString()` 生成一个新的 String 对象赋给 s2；`s2 + "c"` 又要 new 一个 StringBuilder，装 "ab"、"c"，再 toString() 生成新 String 对象赋给 s3。**一个加号，堆内存中俩对象**（StringBuilder + 新 String），拼接次数越多，垃圾对象越多。

用 StringBuilder 拼接的实况：

```java
public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        System.out.println(sb);
    }
}
```

执行过程：只创建了一个 StringBuilder 容器（地址 001），append("a")、append("b")、append("c") 都是往**同一个容器**里追加内容（append 返回对象本身，支持链式调用），最终容器里是 "abc"，打印即输出。

**结论**：StringBuilder 可以大幅度提升字符串操作效率。今后若频繁进行字符拼接操作，建议使用 StringBuilder。

**容易误解的地方**：StringBuilder 对象的 toString() 才把它变成"字符串"；直接打印 sb 之所以能输出内容，是因为打印时会自动调用它的 toString()。

本节收束：StringBuilder = 可变字符序列容器；append（返回自身）、reverse、length、toString 四件套要记牢；"一个加号堆内俩对象"说明频繁拼接要用 StringBuilder。

### 第十一章：集合基础

**什么是集合？有数组了，为啥还学习集合？**

核心结论：**集合是一种容器，用来装数据的，类似于数组**。区别在于：
- 数组：定义完成并启动后，**长度就固定了**，适合存储元素个数固定不变的情况；
- 集合：**大小可变**（元素个数经常发生改变时用），开发中用的更多。

**集合家族介绍**：ArrayList、LinkedList、Vector、HashSet、Collection、Map、TreeSet、LinkedHashSet、HashMap、TreeMap、LinkedHashMap 等。本章先学最常用的 **ArrayList**。

⚠️ 问题：课件在集合家族列表中把 `LinkedHashMap` 拼写成了 `LinedHashMap`（漏掉字母 k）。
修正建议：正确类名是 `LinkedHashMap`。

**ArrayList 长度可变原理**

1. 当创建 ArrayList 集合容器的时候，底层会存在一个长度为 10 个大小的空数组；
2. 数组装满后（例如已有 10 个元素，还要添加"元素11"），会**扩容原数组 1.5 倍大小的新数组**；
3. 将原数组数据，**拷贝到新数组中**；
4. 将新元素添加到新数组。

⚠️ 问题：课件说"创建 ArrayList 时底层就会存在一个长度为 10 的数组"，这是教学简化说法。严格来说 JDK 的 ArrayList 是延迟初始化：`new ArrayList<>()` 时底层是空数组，**第一次 add 元素时**才创建（或扩容到）长度为 10 的数组；后续容量不够时按 1.5 倍扩容。
修正建议：记忆要点是"初始容量 10、扩容 1.5 倍、扩容靠拷贝"；面试中不要答"一创建就有 10 长度的数组"。

**创建集合**

方案 1（不写泛型）：

```java
ArrayList list = new ArrayList();
list.add(1);
list.add(12.3);
list.add('a');
list.add("abc");
list.add(false);
```

方案 2（加泛型）：

```java
ArrayList<String> list = new ArrayList<>();
list.add("abc");
```

**建议使用方案 2，创建集合的时候加入泛型，可以使数据严谨和规范。**

⚠️ 问题：课件方案 2 的示例代码写了 `ArrayList<String> list = new ArrayList<>();` 之后却继续 `list.add(1); list.add(12.3); list.add('a'); list.add(false);`——泛型声明为 String 后再添加整数、小数、字符、布尔值都无法编译。
修正建议：加了 `<String>` 泛型后只能添加字符串，如 `list.add("abc");`；要装多种类型就不能加泛型（或使用 Object 泛型）。课件应是把方案 1 的五行 add 复制了过来。

细节说明：
- 集合在创建的时候如果不加泛型 `<>`，添加数据的时候可以是任意类型；
- 建议创建的时候加入泛型，保证数据的严谨和规范；
- **JDK7 版本开始，右侧 `<>` 中可以省略类型**（如 `new ArrayList<>()`）。

**集合常用成员方法（ArrayList 常用成员方法）**

| 方法名 | 说明 |
| --- | --- |
| `public boolean add(E e)` | 将指定的元素添加到此集合的末尾 |
| `public void add(int index, E element)` | 在此集合中的指定位置插入指定的元素 |
| `public E get(int index)` | 返回指定索引处的元素 |
| `public int size()` | 返回集合中的元素的个数 |
| `public E remove(int index)` | 删除指定索引处的元素，返回被删除的元素 |
| `public boolean remove(Object o)` | 删除指定的元素，返回删除是否成功 |
| `public E set(int index, E element)` | 修改指定索引处的元素，返回被修改的元素 |

**容易误解的地方**：`remove` 有两个重载——传 int 是按**索引**删，传元素对象是按**内容**删；集合没有 length（那是数组的），取长度用 `size()`。

**集合练习**

1. **集合存储字符串并遍历**：创建一个存储字符串的集合，内部存储 3 个字符串元素，使用程序实现在控制台遍历该集合。

2. **集合存储学生对象并遍历**：创建一个存储学生对象的集合，存储 3 个学生对象，使用程序实现在控制台遍历该集合；进阶版：学生的姓名和年龄来自于键盘录入。

```java
public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        addStudent(list);
        addStudent(list);
        addStudent(list);
    }

    private static void addStudent(ArrayList<Student> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.next();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        Student stu = new Student(name, age);
        list.add(stu);
    }
}
```

3. **集合存储对象内存图**（理解集合里存的到底是什么）：

执行过程：
- main 进栈，`new ArrayList<>()` 在堆中创建集合对象（地址 001），栈中变量 list 保存 001；
- 调用 `addStudent(list)`：方法进栈，**参数 list 也是把 001 这个地址复制过来**（传引用），方法内操作的是同一个集合对象；
- 方法内键盘录入得到 name="张三"、age=23，`new Student(name, age)` 在堆中创建学生对象（地址 00A），对象里存放"张三"、23；
- `list.add(stu);` 把学生对象的地址 00A 存入集合（集合里存的是**对象的引用地址**，不是对象本身）；
- 方法出栈，main 中再调用 addStudent 两次，依次把 00B（李四 24）、00C（王五 25）两个学生对象的地址加入集合；
- 最终集合内部依次保存 **00A、00B、00C** 三个地址，指向堆中三个学生对象。

**容易误解的地方**：集合存对象，存的是"地址"（引用）；打印集合时看到的是每个对象的地址信息（除非重写了 toString）。

4. **集合删除元素**：创建一个存储 String 的集合，内部存储（test，张三，李四，test，test）字符串；删除所有的 test 字符串，删除后，将集合剩余元素打印在控制台。

（注意：遍历中边遍历边删除容易漏删/报错，正向遍历删除时要对索引做修正，或倒序遍历删除。）

5. **集合元素筛选**：定义一个方法，方法接收一个集合对象（泛型为 Student）；方法内部将年龄低于 18 的学生对象找出，并存入新集合对象，方法返回新集合。

**综合案例：商品管理系统**（集合基础阶段的大练习：用 ArrayList 存储商品信息，实现添加、查看、删除等功能，为后续阶段打基础。）

本章收束：集合是"大小可变"的容器（数组长度固定、集合更常用了）；ArrayList 原理（初始 10、1.5 倍扩容、拷贝）；创建集合建议加泛型（JDK7 起右边 `<>` 可省略）；七个常用方法（add×2、get、size、remove×2、set）要背熟；集合里存的是对象的引用地址。

第一阶段内容到此全部学完：从环境搭建、IDEA、基础语法、运算符、方法、流程控制、数组、面向对象基础与高级，到 String/StringBuilder 常用 API 和 ArrayList 集合基础——这套地基会支撑起第二阶段（集合高级、Stream 流、异常、File、IO 流、多线程、网络编程等）的学习。

## 第二阶段：Java核心与AI开发进阶

### 第十二章：集合高级

本章知识地图：集合体系结构介绍 → Collection 的使用 → 集合的通用遍历方式 → 方法引用 → List 接口 → 数据结构（栈、队列、数组、链表）→ ArrayList 类、LinkedList 类 → 泛型 → Set 集合（TreeSet、HashSet、LinkedHashSet）→ Collections 工具类 → Map 集合（介绍、三种遍历方式、实现类）。

**集合体系结构介绍**

核心结论：集合是一个长度可变的容器，整个体系分成两大分支：
- **单列集合**：一次添加一个元素，顶层接口是 `Collection`；
- **双列集合**：一次添加两个元素（键值对），顶层接口是 `Map`。

```java
单列集合.add(元素1);
单列集合.add(元素2);

双列集合.put(元素1, 元素1);
双列集合.put(元素2, 元素2);
```

单列集合（Collection）又分为两大子接口：
- **List 接口**（ArrayList、LinkedList 的实现标准）：存取有序、有索引、可以存储重复的；
- **Set 接口**（HashSet、LinkedHashSet、TreeSet 的实现标准）：存取无序、没有索引、不可以存储重复的。

双列集合（Map）的实现类：HashMap、LinkedHashMap、TreeMap。

**Collection 的使用**

核心结论：Collection 是所有单列集合的父接口，内部的方法，所有单列集合都可以使用。

重要细节：**remove()、contains() 底层依赖对象的 equals 方法**——所以自定义类型要按内容去重、按内容查找，就必须重写 equals。

**集合的通用遍历方式**

核心结论：所有单列集合都可以用三种通用方式遍历——**迭代器、增强 for 循环、foreach 方法**。（List 因为有索引，还多了普通 for 循环和列表迭代器两种。）

**迭代器遍历**

```java
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    String s = it.next();
    System.out.println(s);
}
```

- `hasNext()`：判断集合中是否还有元素；
- `next()`：**取出集合元素，并将指针向后移动一位**；
- 注意：在循环过程中 next 方法最好只调用一次（调用多次会取走多个元素）。

⚠️ 问题：课件在方法说明处把 `hasNext()` 写成了 `hashNext()`（多了字母 h），照着写会提示"找不到方法"。
修正建议：正确方法名是 `hasNext()`。

**迭代器源码解析**（理解 hasNext/next 的工作机制）

ArrayList 内部有一个私有内部类 Itr 实现了 Iterator 接口：

```java
private class Itr implements Iterator<E> {
    int cursor;   // 光标，默认 0，代表下一个元素的索引
    public boolean hasNext() {
        return cursor != size;   // 光标与元素个数相等时，说明没有元素了
    }
    public E next() {
        int i = cursor;          // 记录当前光标位置
        cursor = i + 1;          // 光标后移一位
        return (E) elementData[lastRet = i];   // 取出数组 i 位置元素，并记录本次取出的位置
    }
}
```

以集合 [元素A, 元素B, 元素C, 元素D]（size=4）为例：初始 cursor=0，hasNext() 判断 0 != 4 成立；调用 next()，取出 elementData[0]=元素A，cursor 变为 1；继续判断 1 != 4……直到取出 elementData[3]=元素D 后 cursor 变为 4，hasNext() 判断 4 != 4 不成立，循环结束。

**增强 for 循环**

作用：简化迭代器的代码书写。它是 JDK5 之后出现的，**内部原理就是一个 Iterator 迭代器**。

格式：

```java
for (元素的数据类型 变量名 : 数组或者集合) {
}

for (String s : list) {
    System.out.println(s);
}
```

**foreach 方法**

| 方法名 | 说明 |
| --- | --- |
| `default void forEach(Consumer<? super T> action)` | 遍历集合 |

**容易误解的地方**：三种遍历方式能在单列集合上通用，是因为它们都基于 Collection 的迭代器机制；增强 for 底层也是迭代器，所以遍历时同样不能直接调用集合的增删方法。

本节收束：三种通用遍历（迭代器、增强 for、foreach 方法）覆盖所有单列集合；迭代器两板斧 hasNext/next（next 取出元素并移指针）；源码层面 Itr 用 cursor 与 size 的比较判断是否还有元素。

**方法引用**

核心结论：方法引用是 **JDK8 开始出现**，主要的作用是对 **Lambda 表达式进行进一步的简化**。

- 方法引用使用一对冒号 `::`；
- 通过方法的名字来指向一个方法；
- 可以使语言的构造更紧凑简洁，减少冗余代码。

工作机制（可推导可省略原则）：Lambda 的形参列表和要调用的方法参数一致时，参数可以直接省略——例如 foreach 的 accept 中正好有一个参数，change 方法也需要一个 String 参数，那么 `s -> change(s)` 可以简写成 `方法引用::change`。

**容易误解的地方**：方法引用不是"调用方法"，而是"引用一个已有的方法作为函数式接口的实现"；它有使用前提——引用的方法的参数、返回值要和函数式接口的抽象方法对得上。

本节收束：方法引用 = Lambda 的进一步简化；`::` 语法 + "可推导可省略"是理解它的两把钥匙。

**List 接口**

核心结论：List 因为支持索引，所以多了很多索引操作的独特 API：

| 方法名称 | 说明 |
| --- | --- |
| `void add(int index, E element)` | 在此集合中的指定位置插入指定的元素 |
| `E remove(int index)` | 删除指定索引处的元素，返回被删除的元素 |
| `E set(int index, E element)` | 修改指定索引处的元素，返回被修改的元素 |
| `E get(int index)` | 返回指定索引处的元素 |

List 集合的特点：
- 存取有序：存入元素和取出元素的顺序一致；
- 有索引：提供了跟索引有关的 API；
- 可以存储重复的。

**List 接口遍历方式（5 种）**：迭代器 Iterator、增强 for、foreach 方法（通用 3 种）+ 普通 for 循环配合索引遍历、**ListIterator 列表迭代器**。

**并发修改异常（ConcurrentModificationException）**：使用迭代器遍历集合的过程中，调用了集合对象的添加、删除方法，就会出现此异常。

解决办法：
- 迭代过程中做删除：使用 **Iterator 自带的 remove 方法**；
- 迭代过程中做添加：使用 **ListIterator 自带的 add 方法**。

**容易误解的地方**：异常的原因不是"删除"本身，而是"集合被改动了，而迭代器不知道"——用迭代器自己的增删方法就能保持同步。

本节收束：List 三大特点（有序、有索引、可重复）+ 五种遍历；"遍历中想增删"必须用迭代器自带方法，否则触发并发修改异常。

**数据结构（栈、队列、数组、链表）**

核心结论：数据结构是计算机底层存储、组织数据的方式，是指数据相互之间是以什么方式排列在一起的；精心选择的数据结构可以带来更高的运行或者存储效率。常见数据结构：栈、队列、数组、链表、二叉树、二叉查找树、平衡二叉树、红黑树、哈希表。

**栈**：
- 一端开口、一端封闭，开口端是栈顶、封闭端是栈底；
- 进栈（压栈）、出栈（弹栈）；
- 特点：**后进先出，先进后出**。

**队列**：
- 两端都开口，后端入队列、前端出队列；
- 特点：**先进先出，后进后出**。

**数组**：
- 内存连续区域；
- 查询速度快：查询数据通过地址值和索引定位，查询任意数据耗时相同；
- 增删效率低：新增或删除数据的时候，都有可能大批量地移动数组中的其他元素。

**链表**：
- 由一个个**结点**组成，结点包含两部分：存储具体的数据（数据值）、下一个结点的地址；
- **链表中的结点是独立的对象，在内存中是不连续的**；
- 链表查询慢：无论查询哪个数据都要从头开始找；
- 链表增删相对快：比如在 A 与 C 之间插入 B，只需① 把 B 的下一个地址指向 C、② 把 A 的下一个地址指向 B；删除 C 时，只需把 B 的下一个地址直接指向 D 再删掉 C 即可——不需要大搬家；
- 分类：单向链表（结点只记录下一个结点地址）、双向链表（结点同时记录前一个、下一个结点地址）。

一句话小结：栈：后进先出、先进后出；队列：先进先出、后进后出；数组：内存连续区域，查询快，增删慢；链表：元素是游离的，查询慢，首尾操作极快。

本节收束：四种基础结构对应后续集合的底层——ArrayList 的数组、LinkedList 的链表、栈和队列的操作思想会在后续（如栈-回溯、队列-排队）反复出现。

**ArrayList 类**

核心结论：**ArrayList 底层是基于数组实现的**，查询元素快，增删相对慢。

ArrayList 长度可变原理：
1. 当创建 ArrayList 集合容器的时候，底层会存在一个长度为 10 个大小的空数组；
2. 数组装满后，扩容原数组 1.5 倍大小的新数组；
3. 将原数组数据，拷贝到新数组中；
4. 将新元素添加到新数组。

课件随后给出的源码解析（更精确的版本）：使用空参构造器创建的集合，在底层创建一个**默认长度为 0 的数组**；添加第一个元素时，底层会创建一个新的**长度为 10 的数组**；存满时，会扩容 1.5 倍。

⚠️ 问题：课件前面说"创建 ArrayList 时底层会存在一个长度为 10 的空数组"，与后面源码解析中"空参构造器先创建长度为 0 的数组、添加第一个元素时才创建长度 10 的数组"前后不一致（实际 JDK 为后者）。
修正建议：按源码解析版本理解——初始容量 10、扩容 1.5 倍、扩容靠拷贝；"创建即有 10 长度数组"是教学简化说法。

**LinkedList 类**

核心结论：**LinkedList 底层基于双链表实现**的，查询元素慢，增删首尾元素是非常快的。

注意细节：LinkedList 也有 get 方法——表面看起来是根据索引获取元素，实际上是（需要从链表头或尾开始逐个遍历找过去的，所以按索引访问并不快）。

**容易误解的地方**：ArrayList 和 LinkedList 的取舍看操作类型——查询多用 ArrayList，增删（尤其是首尾）多用 LinkedList。

本节收束：ArrayList（数组、查询快增删慢、1.5 倍扩容）与 LinkedList（双链表、增删首尾快）是 List 的两大门面，理解底层结构就理解了各自的性能。

**泛型**

核心结论：泛型是 **JDK5 引入**的，可以在**编译阶段约束操作的数据类型，并进行检查**。

对比示例：

```java
// 没有泛型: 什么都能装，取出时需要自己判断类型
ArrayList list = new ArrayList();
list.add(666);
list.add("aaa");
list.add("bbb");
list.add("ccc");
list.add(66.66666);

// 加了泛型: 只能装字符串，类型不对直接编译报错
ArrayList<String> list = new ArrayList<>();
list.add(666);        // 编译错误！
list.add("aaa");
```

**泛型的好处**：
- 统一数据类型；
- 将运行期的错误提升到了编译期。

**注意事项**：泛型中只能编写**引用数据类型**（要装 int 用 `Integer`，以此类推）。

**泛型的学习路径**：泛型类、泛型方法、泛型接口、通配符。

**泛型类**：类声明时定义类型变量，创建对象的时候确定具体类型。

```java
public class ArrayList<E> {
    public boolean add(E e) {
    }
}
```

（理解为：类里不知道使用者到底想添加个啥类型，就声明个泛型让他们自己定。）

**泛型方法**：
- 非静态方法：泛型是根据类的泛型去匹配的；
- 静态方法：需要声明出自己独立的泛型。

```java
public static <T> void printArray(T[] array) {
}
```

**泛型接口**：类实现接口的时候，如果接口带有泛型，有两种操作方式：
1. 类实现接口的时候，直接确定类型；
2. 保持接口的泛型，等创建对象的时候再确定。

```java
public interface List<E> {
}

public class ArrayList<E> implements List<E> {
}
```

**泛型通配符**：
- `?`：任意类型；
- `? extends E`：只能接收 E 或者是 E 的子类；
- `? super E`：只能接收 E 或者是 E 的父类。

本节收束：泛型四件套——泛型类（创建对象时确定）、泛型方法（非静态随类、静态独立声明）、泛型接口（实现时确定或保持）、通配符（? / ? extends E / ? super E）；核心价值是"把运行期错误提前到编译期"。

**Set 集合介绍**

核心结论：Set 接口的实现类有 TreeSet、HashSet、LinkedHashSet。Set 集合特点：**存取顺序不一致，没有跟索引有关的方法，不能存储重复的**；遍历方式只有三种通用遍历方式。

三个实现类的特点速览：
- **TreeSet** 特点：元素排序；
- **HashSet** 特点：元素唯一；
- **LinkedHashSet** 特点：元素唯一，保证存取顺序。

**TreeSet 集合**

核心结论：TreeSet 的作用是**对集合中的元素进行排序操作**，底层**红黑树**实现。

**TreeSet 底层数据结构演进**（从二叉树到红黑树）：

1. **普通的二叉树**：每个节点最多两个子节点；
2. **二叉查找树（二叉排序树）**：任意节点：左边节点比它小、右边节点比它大；
   - 存在的问题：当数据已经是排好序的，树会退化成一条链，查询的性能与单链表一样，查询速度变慢；
3. **平衡二叉树**：在满足查找二叉树的大小规则下，让树尽可能矮小，以此提高查数据的性能；
4. **红黑树**：就是可以自平衡的二叉树，是一种增删改查数据性能相对都较好的结构。

TreeSet 底层就是红黑树结构，基本特点：
- 任意节点开始，左边的节点都比当前节点小，右边的节点都比当前节点大；
- 每一次添加节点，都从根节点开始比大小，小的左边走，大的右边走，**一样的不存**。

**TreeSet 的两种排序方式**：自然排序、比较器排序。

**TreeSet 排序（自然排序）**：
- 类实现 Comparable 接口；
- 重写 compareTo 方法；
- 根据方法的返回值来组织排序规则：负数——左边走、正数——右边走、**0——不存**。

```java
public class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
```

```java
TreeSet<Student> ts = new TreeSet<>();
ts.add(new Student("李四", 24));
ts.add(new Student("张三", 23));
ts.add(new Student("王五", 25));
ts.add(new Student("赵六", 26));
```

添加过程：李四（24）先做根；张三（23）与根比较，23-24 为负，走左边；王五（25）与根比较为正，走右边；赵六（26）与根比为正（大），走右边，再与王五比 26-25 为正，继续走右边。**取出元素的过程（左，中，右）**：张三 23 → 李四 24 → 王五 25 → 赵六 26。

小结：
- 让类实现 Comparable 接口、重写 compareTo 方法；
- 根据方法的返回值来指定排序规则：`this.xxx - o.xxx` 正序，`o.xxx - this.xxx` 降序；
- 取出元素的过程是"左，中，右"。

**TreeSet 排序（比较器排序）**：
- 在 TreeSet 的构造方法中，传入 Comparator 接口的实现类对象；
- 重写 compare 方法；
- 根据方法的返回值，来组织排序规则：负数——左边走、正数——右边走、0——不存。

为什么需要比较器排序？——Java 已经写好的类，大多数都具有自然排序的规则（String 默认是字典顺序排序、Integer 默认是升序排序、Double 默认是升序排序），这些规则放在源代码中，我们无法修改；如果我们要实现的排序规则跟已有的自然排序不一样，这时就要使用比较器排序。

**重点：如果同时具备自然排序和比较器排序，会优先按照比较器进行排序操作**（可通过比较器排序来覆盖自然排序的规则）。

操作流程：
1. 在 TreeSet 集合的构造方法中，传入比较器对象（Comparator 接口的实现类对象）；
2. 重写 compare 方法；
3. 根据方法的返回值组织排序规则：`参数1.xxx - 参数2.xxx` 正序、`参数2.xxx - 参数1.xxx` 倒序。

**容易误解的地方**：compareTo/compare 返回 0 在 TreeSet 里意味着"判定为重复元素，不存"——所以自定义排序规则里不能把不同元素比出 0（例如只按年龄排序会把同龄的不同人弄丢，需要再按姓名等二级条件区分）。

本节收束：TreeSet = 红黑树 + 排序 + 去重（按比较结果为 0 去重）；两种排序方式（Comparable 自然排序 / Comparator 比较器排序），比较器优先级更高。

**HashSet 集合**

核心结论：**HashSet 集合底层采取哈希表存储数据，确保元素的唯一性**；哈希表是一种对于增删改查数据性能都较好的结构。

**HashSet 想要保证元素唯一，需要同时重写对象中的 hashCode 方法和 equals 方法。**

**hashCode 和 equals 的配合流程**（添加对象时）：
1. 先调用对象的 hashCode 方法计算出一个应该存入的索引位置；
2. 查看该位置上是否存在元素：
   - 不存在：直接存；
   - 存在：调用 equals 方法比较内容——false：存；true：不存。

课件用固定 `return 1;` 的 hashCode 演示：如果 hashCode 方法固定返回相同的值，数据都会挂在一个索引下面（形成长长的链表），性能变差——所以要重写 hashCode 方法，**根据对象的属性值计算出哈希值**。

**哈希值**：`public int hashCode()` 是 Object 类的 API——调用底层 C++ 代码计算出的一个随机数（常被人称作地址值），就是一个 int 类型的随机值，Java 中每个对象都有一个哈希值。

细节：不同对象根据内容生成的 hash 值**也有可能会相等**（哈希碰撞，如"重地"“通话”）；重写 hashCode 后按属性值计算哈希值，（不同属性的对象）哈希值就可能不同了。

**哈希表结构**：
- JDK8 之前，哈希表 = 数组 + 链表；
- JDK8 开始，哈希表 = 数组 + 链表 + 红黑树。

**HashSet 集合的底层原理（存储流程）**：
1. 创建一个默认长度 16、默认加载因子为 0.75 的数组，数组名 table；
2. 使用元素的哈希值对数组的长度做运算计算出应存入的位置；
3. 判断当前位置是否为 null，如果是 null 直接存入；
4. 如果不为 null，表示有元素，则调用 equals 方法比较——相等，则不存；不相等，则存入数组（**JDK8 之前，新元素存入数组，占老元素位置，老元素挂下面；JDK8 开始之后，新元素直接挂在老元素下面**）；
5. 当数组存满到 16 * 0.75 = 12 时，就自动扩容，每次扩容成原先的两倍；
6. JDK8 开始，当链表长度超过 8，且数组长度 >= 64 时，自动将链表转成红黑树（引入红黑树后进一步提高了操作数据的性能）。

**容易误解的地方**：只重写 equals 不重写 hashCode，HashSet 的去重会失效（哈希值不同就不会调用 equals）——两个方法必须一起重写。

本节收束：HashSet 三问——为什么唯一（hashCode 定位置 + equals 定去重）；结构怎样（数组+链表+红黑树、16 长度、0.75 加载因子、扩容两倍）；注意什么（自定义对象必须同时重写 hashCode 和 equals）。

**LinkedHashSet 集合**

核心结论：LinkedHashSet 的底层原理**依然是基于哈希表（数组、链表、红黑树）实现的**；但是，它的**每个元素都额外多了一个双链表的机制记录它前后元素的位置**——因此在去重的同时保证了存取顺序。

**Set 家族选择指南**（结合单列集合整体）：
1. 如果想要集合中的元素可重复：用 **ArrayList**，基于数组的（用的最多）；
2. 如果想要集合中的元素可重复，而且当前的增删操作明显多于查询：用 **LinkedList**，基于链表的；
3. 如果想对集合中的元素去重：用 **HashSet**，基于哈希表的（用的最多）；
4. 如果想对集合中的元素去重，而且保证存取顺序：用 **LinkedHashSet**，基于哈希表和双链表，效率低于 HashSet；
5. 如果想对集合中的元素进行排序：用 **TreeSet**，基于红黑树。

本节收束：LinkedHashSet = HashSet（去重）+ 双链表（记顺序）；五条选择指南覆盖 List 和 Set 的全部常用场景。

**Collections 工具类**

核心结论：`java.utils.Collections` 是**集合工具类**——Collections 并不属于集合，是用来操作集合的工具类。

先认识**可变参数**（学习工具类的前置知识）：
- 可变参数用在形参中可以接收多个数据；
- 可变参数的格式：`数据类型...参数名称`；
- 传输参数非常灵活、方便：可以不传参数，可以传 1 个或者多个，也可以传一个数组；
- 可变参数在方法内部**本质上就是一个数组**。

注意事项：
1. 一个形参列表中可变参数只能有一个；
2. 可变参数必须放在形参列表的最后面。

**Collections 集合工具类常用方法**：

| 方法名称 | 说明 |
| --- | --- |
| `public static <T> boolean addAll(Collection<? super T> c, T... elements)` | 给集合对象批量添加元素 |
| `public static void shuffle(List<?> list)` | 打乱 List 集合元素的顺序 |
| `public static <T> void max/min(Collection<T> coll)` | 根据默认的自然排序获取最大/小值 |
| `public static <T> void sort(List<T> list)` | 将集合中元素按照默认规则排序 |
| `public static <T> void sort(List<T> list, Comparator<? super T> c)` | 将集合中元素按照指定规则排序 |

注意：sort 单参方式不可以直接对自定义类型的 List 集合排序，除非自定义类型实现了比较规则 Comparable 接口。

⚠️ 问题：课件把 `max/min` 的返回值写成了 `void`——获取最大值/最小值必须把结果返回出来，返回 void 方法就没法用了。
修正建议：max/min 应返回 T 类型，即 `public static <T> T max(Collection<? extends T> coll)` 形式。

本节收束：记住"可变参数（本质数组、只能一个且在最后）+ 五个常用方法（addAll 批量添加、shuffle 打乱、max/min 最值、sort 两种排序）"。

**Map 集合**

核心结论：Map 集合是一种**双列集合**，每个元素包含两个数据。Map 集合的每个元素的格式：`key = value`（键值对元素）。
- key（键）：不允许重复；
- value（值）：允许重复；
- 键和值是一一对应的，每个键只能找到自己对应的值；
- key + value 这个整体，我们称之为"键值对"或"键值对对象"，在 Java 中使用 **Entry 对象**表示。

**什么时候使用 Map 集合？** 需要存储一一对应的数据时，就可以考虑使用 Map 集合来做。例如嵌套结构：`Map<店铺对象, List<商品对象>>`。

**Map 集合的实现类及各自特点**：
- **HashMap**：元素按照键是**无序**、不重复、无索引，值不做要求；
- **LinkedHashMap**：元素按照键是**有序**、不重复、无索引，值不做要求；
- **TreeMap**：元素按照键是**排序**、不重复、无索引的，值不做要求。

**Map 的常见 API**（Map 是双列集合的顶层接口，它的功能是全部双列集合都可以使用的）：

| 方法名称 | 说明 |
| --- | --- |
| `V put(K key, V value)` | 添加元素 |
| `V remove(Object key)` | 根据键删除键值对元素 |
| `void clear()` | 移除所有的键值对元素 |
| `boolean containsKey(Object key)` | 判断集合是否包含指定的键 |
| `boolean containsValue(Object value)` | 判断集合是否包含指定的值 |
| `boolean isEmpty()` | 判断集合是否为空 |
| `int size()` | 集合的长度，也就是集合中键值对的个数 |

**Map 集合的三种遍历方式**

1. **通过键找值**：
   - `Set<K> keySet()` 获取 Map 集合中所有的键；
   - `V get(Object key)` 根据键查找对应的值；
   - 步骤：调用 keySet 方法获取所有的键（得到的是 Set 集合）→ 遍历 Set 集合，获取每一个键 → 遍历的过程中调用 get 方法，根据键找值。

2. **通过键值对对象获取键和值**：
   - `Set<Map.Entry<K, V>> entrySet()` 获取集合中所有的键值对对象；
   - 键值对对象的方法：`getKey()` 获取键、`getValue()` 获取值；
   - 步骤：调用 entrySet 方法获取所有的键值对对象（得到的是 Set 集合）→ 遍历 Set 集合，获取每一个键值对对象 → 通过键值对对象的 getKey()、getValue() 获取键和值。

3. **通过 foreach 方法遍历**：
   
   | 方法名称 | 说明 |
   | --- | --- |
   | `default void forEach(BiConsumer<? super K, ? super V> action)` | 遍历 Map 集合，获取键和值 |

**Map 集合的实现类（底层结构）**

- **HashMap**：查找快。底层原理——利用**键**计算哈希值，**跟值无关**；底层结构演进同哈希表：JDK8 以前是数组+链表；JDK8 开始是数组+链表+红黑树（链表长度超过 8 且数组长度 >= 64 时自动转成红黑树）。
- **TreeMap**：键（红黑树）——键排序。
- **LinkedHashMap**：键（哈希表 + 双向链表）——键唯一并保证存取顺序。

**重点细节：双列集合的数据结构，都只针对于键有效，和值没有关系。**

**案例：统计字符出现的次数**

需求：字符串 `aababcabcdabcde`，请统计字符串中每一个字符出现的次数，并按照以下格式输出。

输出结果：`a(5)b(4)c(3)d(2)e(1)`

思路：遍历字符串的每个字符 → 用 Map 集合（或 TreeMap 保证输出顺序）存储"字符 → 次数" → 键不存在则 put(c, 1)，键存在则 put(c, 已存在次数+1) → 遍历输出。

**案例：集合嵌套**

需求：定义一个 Map 集合，键用来表示省份名称，值表示市，但是市会有多个；添加完毕后按格式遍历输出：

```text
江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
四川省 = 成都市，绵阳市，自贡市，攀枝花市，泸州市
```

（键是 String 省份，值是 List<String> 市列表——这就是"Map 嵌套 List"的结构。）

本章收束：集合高级十二章把"容器"这棵树补全了——单列（List 有序可重复 / Set 去重）双列（Map 键值对）两大分支；遍历三方式（迭代器、增强 for、foreach）打通用；数据结构（数组、链表、红黑树、哈希表）解释了性能差异的来源；泛型、方法引用、Collections、可变参数是配套工具。选容器先问三个问题：要不要重复？要不要顺序？按不按 key 找？

### 第十三章：Stream流

**Stream 流介绍与作用体验**

核心结论：Stream 流配合 Lambda 表达式，可以**简化集合和数组的操作**。可以把流想象成一条"流水线"：数据从一端进去，中间经过一道道"处理工序"（过滤、截取、转换……），最后从另一端出来结果——每一道工序都用 Lambda 表达式描述"要做什么"。

需求案例（按下面的要求完成集合的创建和遍历）：
1. 创建一个集合，存储多个字符串元素；
2. 把集合中所有以"张"开头的元素存储到一个新的集合；
3. 把"张"开头的集合中的长度为 3 的元素存储到一个新的集合；
4. 遍历上一步得到的集合中的元素输出。

课件给出的原始集合数据：

```java
List<String> list = new ArrayList<>();
list.add("张无忌");
list.add("张良");
list.add("王二麻子");
list.add("谢广坤");
list.add("张三丰");
list.add("张翠山");
```

如果用传统的"循环 + 判断 + 建新集合 + add"来做，要写好几轮循环；而用 Stream 流，一行链式代码就能完成"两次过滤 + 遍历输出"：

```java
list.stream()
        .filter(name -> name.startsWith("张"))    // 工序1：只留"张"开头的
        .filter(name -> name.length() == 3)       // 工序2：再只留长度为 3 的
        .forEach(name -> System.out.println(name)); // 收尾：逐个输出
```

如果要求严格"存回到新集合"再遍历，把最后的 forEach 换成收集操作 `collect(Collectors.toList())` 即可（收集操作在本节后面详细讲）。

**Stream 流思想（三个阶段）**

Stream 流的一整套操作固定为三个阶段：
1. **将数据放到流中（获取流对象）**：数据源（集合、数组、零散数据）先变成一条流；
2. **中间方法**：对流中的数据进行加工处理（过滤 filter、截取 limit/skip、去重 distinct、转换 map、合并 concat 等）；
3. **终结方法**：执行最终操作（遍历 forEach、统计 count、收集 collect），终结之后整条流就"用完了"。

**获取 Stream 流对象的三种方式**

| 数据来源 | 方法 | 说明 | 由谁提供 |
| --- | --- | --- | --- |
| 集合 | `default Stream<E> stream()` | 获取当前集合对象的 Stream 流 | Collection 接口中的默认方法 |
| 数组 | `static <T> Stream<T> stream(T[] array)` | 将传入的数组封装到 Stream 流对象中 | Arrays 数组工具类中的静态方法 |
| 零散数据 | `static <T> Stream<T> of(T... values)` | 把一堆零散的数据封装到 Stream 流对象中 | Stream 类中的静态方法 |

细节说明：
- 集合获取流：任何 Collection 的子类（ArrayList、HashSet……）都能直接调用 `stream()`；
- 数组获取流：使用 `Arrays.stream(数组)`；
- 零散数据获取流：使用 `Stream.of(值1, 值2, 值3...)`，参数是可变参数，可以传任意多个值。

**Stream 流中间操作方法**

| 名称 | 说明 |
| --- | --- |
| `Stream<T> filter(Predicate<? super T> predicate)` | 用于对流中的数据进行过滤 |
| `Stream<T> limit(long maxSize)` | 获取前几个元素 |
| `Stream<T> skip(long n)` | 跳过前几个元素 |
| `Stream<T> distinct()` | 去除流中重复的元素（依赖 hashCode 和 equals 方法） |
| `static <T> Stream<T> concat(Stream a, Stream b)` | 合并 a 和 b 两个流为一个流 |
| `Stream<R> map(Function<? super T, ? extends R> mapper)` | 对流中的每一个元素进行转换 |

细节说明：
- **中间方法调用完成后返回新的 Stream 流，可以继续使用，支持链式编程**——这就是为什么可以一行写上好几个方法；
- `filter`：Lambda 的返回值是 boolean，返回 true 的元素留下，false 的丢弃；
- `limit(n)`：只要前 n 个元素；`skip(n)`：丢掉最前面 n 个元素，取剩下的；
- `distinct()`：去重，判断"是否重复"依靠元素的 hashCode 和 equals 方法（和 HashSet 的去重原理一致，自定义对象必须重写这两个方法才有去重效果）；
- `concat(a, b)`：把 a、b 两条流拼接成一条新流，是静态方法，用 `Stream.concat(...)` 调用；
- `map`：把流中的每个元素"转换"成另一个对象/值，常用于"取出对象的某个属性"或"把姓名转成对象"。

**注意事项**

**如果流对象已经被消费过，就不允许再次使用了**。也就是说，一个流对象只能被终结方法消费一次，消费完之后这个流就作废了；还想再操作，必须从数据源重新获取一条新的流。

**Stream 流终结操作方法**

| 名称 | 说明 |
| --- | --- |
| `void forEach(Consumer action)` | 对此流的每个元素执行遍历操作 |
| `long count()` | 返回此流中的元素数 |

细节说明：forEach 的 Lambda 负责"拿到每个元素后做什么"；count 返回的是 long 类型的元素个数。终结方法执行后流被消费关闭。

**Stream 收集操作**

核心结论：**把 Stream 流操作后的结果数据转回到集合**（因为 Stream 流本身不存数据，处理完的数据要落回到容器里）。另有一个重要特点：**Stream 流操作，不会修改数据源**——原集合原数组的内容不会被动到，流的处理只是在"管道"里进行。

- `R collect(Collector collector)`：开始收集 Stream 流，指定收集器；
- Collectors 工具类提供了具体的收集方式：

| 名称 | 说明 |
| --- | --- |
| `public static <T> Collector toList()` | 把元素收集到 List 集合中 |
| `public static <T> Collector toSet()` | 把元素收集到 Set 集合中 |
| `public static Collector toMap(Function keyMapper, Function valueMapper)` | 把元素收集到 Map 集合中 |

使用写法：`流对象.collect(Collectors.toList())`、`流对象.collect(Collectors.toSet())`、`流对象.collect(Collectors.toMap(键的规则, 值的规则))`。

**案例：Stream 流中数据收集到 Map**

需求：创建一个 ArrayList 集合，并添加以下字符串——`"zhangsan,23"`、`"lisi,24"`、`"wangwu,25"`，并将数据收集到 Map 集合中，**姓名为键，年龄为值**。

思路：每个字符串形如"姓名,年龄"，用逗号切割后，"0 号位置"是姓名（做键），"1 号位置"是年龄（做值）；toMap 需要传两个规则——keyMapper 负责根据流中元素算出键，valueMapper 负责算出值。

```java
List<String> list = new ArrayList<>();
list.add("zhangsan,23");
list.add("lisi,24");
list.add("wangwu,25");

Map<String, String> map = list.stream().collect(Collectors.toMap(
        s -> s.split(",")[0],   // keyMapper：切分后第 0 段是姓名，作为键
        s -> s.split(",")[1]    // valueMapper：切分后第 1 段是年龄，作为值
));
System.out.println(map);   // 输出形如 {lisi=24, zhangsan=23, wangwu=25}
```

细节说明：`split(",")` 是 String 的按分隔符切割方法，返回 String[]；这里取出的年龄是字符串形式，如需数字类型可再转换。HashMap 遍历顺序不保证与添加顺序一致。

**综合案例：男女演员筛选**

需求：现在有两个 ArrayList 集合，分别存储 6 名男演员和 6 名女演员，要求完成如下的操作：
1. 男演员只要名字为 3 个字的前两人；
2. 女演员只要姓林的，并且不要第一个；
3. 把过滤后的男演员姓名和女演员姓名合并到一起；
4. 把上一步操作后的元素作为构造方法的参数创建演员对象，遍历数据。

演员类 Actor，里面有一个成员变量，一个带参构造方法，以及成员变量对应的 get/set 方法：

```java
public class Actor {
    private String name;

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

主程序实现：

```java
public static void main(String[] args) {
    List<String> manList = new ArrayList<>();
    manList.add("张国立");
    manList.add("刘烨");
    manList.add("郑伊健");
    manList.add("徐峥");
    manList.add("王宝强");
    manList.add("成龙");

    List<String> womanList = new ArrayList<>();
    womanList.add("林心如");
    womanList.add("张曼玉");
    womanList.add("林青霞");
    womanList.add("柳岩");
    womanList.add("林志玲");
    womanList.add("王祖贤");

    // 1. 男演员只要名字为 3 个字的前两人
    Stream<String> manStream = manList.stream()
            .filter(name -> name.length() == 3)
            .limit(2);

    // 2. 女演员只要姓林的，并且不要第一个
    Stream<String> womanStream = womanList.stream()
            .filter(name -> name.startsWith("林"))
            .skip(1);

    // 3. 合并两个流；4. 姓名作构造参数创建 Actor 对象并遍历
    Stream.concat(manStream, womanStream)
            .map(name -> new Actor(name))          // 每个姓名转换成一个 Actor 对象
            .forEach(actor -> System.out.println(actor.getName()));
}
```

容易误解的地方：
- **"前两人"的顺序**：要求是"名字为 3 个字的前两人"，必须先 `filter`（筛出 3 个字的）再 `limit(2)`，两者写反结果就不对；
- `skip(1)` 的位置同理：先筛"姓林"，再跳过第一个，即"姓林的里面不要第一个"；
- `map` 之后流中的元素类型变了：合并时流里还是 String 姓名，`map` 之后变成了 Actor 对象，所以后面的 forEach 处理的是 Actor；
- 遍历时调用的是 `actor.getName()` 取名字输出；如果直接打印对象本身，打印的是地址值（Object 默认的 toString 行为），除非 Actor 类重写了 toString；
- 一个流被终结（forEach/collect/count）后不能复用：manStream、womanStream 合并后被消费，不能再拿着它们做别的操作。

本节收束：Stream 三件套——"获取流（集合 stream / 数组 Arrays.stream / 零散数据 Stream.of）→ 中间方法（filter、limit、skip、distinct、concat、map，返回新流可链式）→ 终结方法（forEach、count、collect 收集回集合）"；记牢三个原则：流被消费过不能再用、流操作不修改数据源、distinct 去重靠 hashCode 和 equals。

### 第十四章：异常

**异常的介绍和体系**

核心结论：异常指的是**程序在编译或执行过程中，出现的非正常的情况（错误）**。常见的有：`ArrayIndexOutOfBoundsException`（数组索引越界异常）、`ClassCastException`（类型转换异常）、`NullPointerException`（空指针异常）等。
注意：**语法错误不是异常**——语法都写错了，代码根本编译不过去，不属于"异常"讨论的范畴。

**异常体系结构**

最顶层父类是 Throwable，往下分两大分支：
- **Error**：严重级别问题，通常跟系统有关。常见的：栈内存溢出（`StackOverflowError`）、堆内存溢出（`OutOfMemoryError`）。这类问题程序本身通常处理不了。
- **Exception**：异常类，程序常见的错误。又分两类：
  - RuntimeException 及其子类：**运行时异常**；
  - 除 RuntimeException 之外所有的异常：**编译时异常**。

**异常的分类**

**编译时异常**：
- 说明：**编译阶段就出现的错误**；主要起到提醒作用；
- 定义：没有继承 RuntimeException 的异常（即 Exception 家族中不属于 RuntimeException 这一支的），编译阶段就会出错，必须处理才能通过编译。

⚠️ 问题：课件把类名 RuntimeException 拼写成了 "RuntimeExcpetion"（e 和 p 位置颠倒）。
修正建议：正确类名为 RuntimeException。

**运行时异常**：
- 说明：**编译阶段没有错误，运行时【可能】会出现的错误**；这类错误通常都是程序员代码不严谨所造成的；
- 典型例子：数组索引越界异常 `ArrayIndexOutOfBoundsException`、空指针异常 `NullPointerException`、类型转换异常 `ClassCastException`。

容易误解的地方：判断"编译时异常还是运行时异常"看的是继承关系，不是"有没有报错"——编译阶段不强制处理、运行起来才可能出事的是运行时异常；编译阶段不处理就直接编译报错的是编译时异常。另外 Error 不属于编译时异常，它和异常是并列的两个分支。

**异常的默认处理流程**

当程序出现异常、程序员又没有处理时，虚拟机的默认处理分为 4 步：
1. 虚拟机会在出现异常的代码那里**自动创建一个异常对象**（例：ArithmeticException，算术异常）；
2. 异常会从方法中出现的点**抛出给调用者**，调用者最终抛出给 JVM 虚拟机；
3. 虚拟机接收到异常对象后，**先在控制台直接输出异常信息数据**；
4. **终止 Java 程序的运行**。

容易误解的地方：默认处理下异常信息虽然打印出来了，但程序会停在第 4 步——异常点之后的代码都不会再执行。想让程序"出了错还能继续跑"，就要用下面的两种处理方式。

**异常处理方式一：try...catch...（捕获）**

格式：

```java
try {
    // 可能会出现异常的代码
} catch (异常类型1 变量) {
    // 处理异常的方案
}
```

说明：try...catch 能够将抛出的异常对象**捕获**，然后执行异常的处理方案。
好处：**程序可以继续往下执行**。

多个 catch 的写法：

```java
try {
    // 可能会出现异常的代码
} catch (异常类型1 变量) {
    // 处理异常的方案
} catch (异常类型2 变量) {
    // 处理异常的方案
}
```

注意：**如果使用多个 catch，最大的异常需要放在最后**。（原因：catch 是按书写顺序逐个匹配的，如果把父类异常（如 Exception）写在前面，后面所有子类异常的 catch 永远轮不到，Java 会直接报编译错误。）

**Throwable 的常见方法**

| 方法名 | 说明 |
| --- | --- |
| `public String getMessage()` | 获取异常的错误原因 |
| `public void printStackTrace()` | 展示完整的异常错误信息 |

细节说明：在 catch 块中通过"异常变量"调用这两个方法：`getMessage()` 拿到简短原因，`printStackTrace()` 打印完整的错误堆栈（错误类型、原因、出错代码行号），排查问题时最常用。

**异常处理方式二：throws（抛出声明）**

throws 用在方法上，作用是**声明**——声明这个方法中的异常是抛出处理：

```java
public void method() throws 异常1, 异常2, 异常3... {

}
```

格式写法：在方法签名小括号后面写 `throws`，后面跟异常类型列表。

细节：**子类重写父类方法时，不能抛出父类没有的异常，或者比父类更大的异常**。（原因：父类方法没声明异常，调用者就不会去做处理准备；子类突然多抛出一个受检异常，调用者会措手不及。）

**两种处理方式该怎么选？**

- **try...catch 捕获异常**：出现问题，程序可以继续执行；
- **throws 抛出异常**：出现问题，程序会在错误点停止，不会继续执行；
- 选择思路：**看这个问题是否需要暴露出来**——需要：抛出；不需要：try…catch。

**throw 和 throws 的区别**

- `throw`：**用在方法中**，后面跟的是**异常对象**，其作用是**抛出异常对象**；
- `throws`：**用在方法名后面**，起到**声明作用**——声明此方法中存在异常，如果出现问题，做抛出处理；
- 细节：抛出的异常对象如果是**编译时异常，必须使用 throws 声明**；如果是**运行时异常，则不需要写 throws**。

容易误解的地方：throw 是"动作"（此刻真的扔出一个异常对象），throws 是"告示"（提前声明这个方法可能会扔异常）；两者名字像，但一个出现在方法体里、一个出现在方法签名上。

**自定义异常**

**自定义异常的作用**：Java 无法为这个世界上全部的问题提供异常类。如果企业想通过异常的方式来管理自己的某个业务问题，就需要自定义异常类了——通过自定义异常可以**精准表达特定错误**。

**自定义异常的分类**：
1. **自定义编译时异常**：定义一个异常类**继承 Exception**，编写构造器；
2. **自定义运行时异常**：定义一个异常类**继承 RuntimeException**，编写构造器。

⚠️ 问题：课件把"定义构造方法"表述为"重写构造器"——构造方法不存在"重写"（子类不能重写父类的构造方法），自定义异常里是"新定义一个构造方法"并在其中调用父类构造。
修正建议：准确说法是"定义构造方法"，如 `public MyException(String message) { super(message); }`。

示范写法：

```java
// 自定义编译时异常：继承 Exception
public class AgeOutOfBoundsException extends Exception {
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);   // 异常信息交给父类保存，之后可用 getMessage() 取出
    }
}

// 自定义运行时异常：继承 RuntimeException
public class NameIsNullException extends RuntimeException {
    public NameIsNullException() {
    }

    public NameIsNullException(String message) {
        super(message);
    }
}
```

细节说明：带参构造方法里的 `super(message)` 是把"错误原因"传给父类 Throwable 保存，之后在 catch 中用 `getMessage()` 就能读出这段原因文字；自定义编译时异常抛出后必须处理（try...catch 或 throws），自定义运行时异常不强制。

本节收束：异常一章记四条——"体系两分支（Error 系统级 / Exception 程序级）、异常分两类（编译时–必须处理 / 运行时–可不处理）、处理有两招（try...catch 可继续执行 / throws 遇错即停）、细节两个（多个 catch 大异常放最后、throw 抛对象与 throws 作声明）"，再加上自定义异常"继承对应父类 + 定义构造方法"的套路。

### 第十五章：File类、递归

**File 介绍**

核心结论：**File 类代表操作系统的文件对象（文件、文件夹）**。Java 用 File 对象来描述磁盘上的一个文件或文件夹，从而对它们进行判断、创建、删除、遍历等操作。

**File 类创建对象（构造方法）**：

| 方法名称 | 说明 |
| --- | --- |
| `public File(String pathname)` | 根据文件路径创建文件对象 |
| `public File(String parent, String child)` | 根据父路径名字符串和子路径名字符串创建文件对象 |
| `public File(File parent, String child)` | 根据父路径对应文件对象和子路径名字符串创建文件对象 |

细节说明：**File 封装的对象仅仅是一个路径名，这个路径可以是存在的，也可以是不存在的**——换句话说，`new File("xx")` 不会去检查也没有能力去检查磁盘上有没有这个文件，它只是把"路径"包起来而已。要判断真实情况，得调用 exists() 等方法。

**绝对路径和相对路径**：
- **绝对路径**：从盘符根目录开始，一直到某个具体的文件或文件夹（如 `D:\aaa\bbb.java`）；
- **相对路径**：相对于当前项目（的所在目录），如直接写 `"aaa\bbb.java"`。

**File 类的判断方法**：

| 方法名称 | 说明 |
| --- | --- |
| `public boolean isDirectory()` | 判断此路径名表示的 File 是否为文件夹 |
| `public boolean isFile()` | 判断此路径名表示的 File 是否为文件 |
| `public boolean exists()` | 判断此路径名表示的 File 是否存在 |

**案例：键盘录入文件夹路径**

需求：键盘录入一个文件夹路径，如果输入错误就给出提示，并继续录入，直到正确为止。
分析：
1. 输入的路径有可能不存在；
2. 输入的路径有可能是文件路径（我们要的是文件夹）。

实现三步：封装为 File 对象 → 调用 exists() 判断是否存在 → 调用 isFile() 判断是否是文件。

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("请输入一个文件夹路径：");
        String path = sc.nextLine();
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("路径不存在，请重新输入");
        } else if (dir.isFile()) {
            System.out.println("输入的是文件路径，请重新输入");
        } else {
            System.out.println("输入正确，开始处理：" + dir.getAbsolutePath());
            break;
        }
    }
}
```

**File 类的常用方法**：

| 方法名称 | 说明 |
| --- | --- |
| `public long length()` | 返回文件的大小（字节数量） |
| `public String getAbsolutePath()` | 返回文件的绝对路径 |
| `public String getPath()` | 返回定义文件时使用的路径 |
| `public String getName()` | 返回文件的名称，带后缀 |
| `public long lastModified()` | 返回文件的最后修改时间（时间毫秒值） |

**File 类的创建和删除方法**：

| 方法名称 | 说明 |
| --- | --- |
| `public boolean createNewFile()` | 创建一个新的空的文件 |
| `public boolean mkdir()` | 只能创建一级文件夹 |
| `public boolean mkdirs()` | 可以创建多级文件夹 |
| `public boolean delete()` | 删除由此抽象路径名表示的文件或空文件夹 |

注意事项：**delete() 方法只能删除空文件夹，且不走回收站**（删掉就找不回来了）。

容易误解的地方：mkdir() 与 mkdirs() 的区别——父文件夹不存在时，mkdir() 会失败，mkdirs() 会连同缺失的父级一起创建；createNewFile() 创建的是文件（路径父目录也必须存在），mkdir/mkdirs 创建的是文件夹，不要混用。

**File 类的遍历方法**：

| 方法名称 | 说明 |
| --- | --- |
| `public File[] listFiles()` | 获取当前目录下所有的"一级文件对象"，返回 File 数组 |

需求（引出递归）：键盘录入一个文件夹路径，找出这个文件夹下所有的 .java 文件。问题来了——**子文件夹中是否可能还有 .java 文件？如何进入查找？** 这就需要用到"递归"。

**递归介绍**

核心结论：**递归就是方法直接或者间接调用本身**。

注意事项：**递归如果没有控制好终止，会出现递归死循环，导致栈内存溢出现象**（StackOverflowError）。

**案例：使用递归求 5 的阶乘**

5 的阶乘（5!）：5 * 4 * 3 * 2 * 1。
找规律（把大问题变成小一号的同型问题）：
- 5! = 5 * 4!
- 4! = 4 * 3!
- 3! = 3 * 2!
- 2! = 2 * 1!
- 1! = 1（终止条件）

```java
public class RecursionDemo1 {
    public static void main(String[] args) {
        int result = jc(5);
        System.out.println(result);   // 120
    }

    public static int jc(int num) {
        if (num == 1) {
            return 1;                 // 出口：1 的阶乘就是 1
        } else {
            return num * jc(num - 1); // 自己调用自己，问题规模不断变小
        }
    }
}
```

执行流程（栈内存图解）：每调用一次 jc 方法，就在栈内存中开辟一块空间（栈帧）——
1. main 方法入栈，调用 jc(5)；
2. jc(5) 入栈（num=5），执行到 `num * jc(num - 1)` 时暂停，去调 jc(4)；
3. jc(4)（num=4）暂停去调 jc(3)，jc(3) 暂停去调 jc(2)，jc(2) 暂停去调 jc(1)；
4. **jc(1) 到达出口 `return 1`，算出 1 后出栈，返回到 jc(2)**；
5. jc(2) 接着算出 2 * 1 = 2 出栈，jc(3) 算出 3 * 2 = 6 出栈，jc(4) 算出 4 * 6 = 24 出栈，jc(5) 算出 5 * 24 = 120 出栈；
6. main 拿到 120，打印输出。

这就是"**将大问题，层层转化为一个与原问题相似的、规模更小的问题来解决**"的过程。

**案例：不死神兔（斐波那契数列）**

需求：有一对兔子，从出生后第 3 个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第二十个月的兔子对数为多少？

分析规律：1、1、2、3、5、8、13、21……**从第三个月开始，兔子的对数是前两个月相加的和**。

```java
public static int getRabbits(int month) {
    if (month == 1 || month == 2) {
        return 1;                       // 前两个月都是 1 对
    }
    return getRabbits(month - 1) + getRabbits(month - 2);
}
```

调用 `getRabbits(20)` 得到第二十个月的兔子对数 6765 对。

递归小结：
- 递归：方法直接或者间接调用本身；
- 递归的思路：将大问题，层层转化为一个与原问题相似的、规模更小的问题来解决；
- 递归的使用场景：常用于一些逻辑类似的业务。

**递归案例**

**案例一：找出文件夹下所有的 .java 文件（包括子文件夹）**

需求：键盘录入一个文件夹路径，找出这个文件夹下所有的 .java 文件。

思路：进入文件夹 → 拿到里面所有的"一级文件对象" → 逐个判断：是 .java 文件就输出；**是文件夹就再"进入查找"（递归调用自己）**。

```java
public static void findJavaFile(File dir) {
    File[] files = dir.listFiles();
    if (files != null) {                          // listFiles 可能返回 null，先判空
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".java")) {
                System.out.println(file.getAbsolutePath());   // 是 .java 文件，输出
            } else if (file.isDirectory()) {
                findJavaFile(file);               // 是文件夹，递归进去继续找
            }
        }
    }
}
```

**listFiles() 方法的返回细节（务必记住）**：
- 当调用者 File 表示的路径不存在时，返回 null；
- 当调用者 File 表示的路径是文件时，返回 null；
- 当调用者 File 表示的路径是一个空文件夹时，返回一个长度为 0 的数组；
- 当调用者 File 表示的路径是需要权限才能访问的文件夹时，返回 null。

容易误解的地方：listFiles() 返回 null 和返回"长度为 0 的数组"是两回事——空文件夹返回空数组（for 循环安全），路径不存在/是文件/无权限才返回 null（直接 for 循环会空指针异常）。所以遍历前先判空是必要的。

**案例二：递归删除文件夹**

需求：设计一个方法，删除文件夹。注意：**delete() 只能删除空文件夹**。

思路：一个文件夹里有文件也有文件夹——是文件直接删；是文件夹先递归删掉它里面的内容（删空之后），最后再删自己。

```java
public static void deleteDir(File dir) {
    File[] files = dir.listFiles();
    if (files != null) {
        for (File file : files) {
            if (file.isFile()) {
                file.delete();        // 是文件，直接删除
            } else {
                deleteDir(file);      // 是文件夹，递归先删里面的内容
            }
        }
    }
    dir.delete();                     // 内容清空（或本来就是空文件夹）后，删除自己
}
```

**案例三：递归统计文件夹大小**

需求：键盘录入一个文件夹路径，统计文件夹的大小。

思路：文件夹本身没有大小，大小是所有子文件大小之和——遍历一级文件对象：是文件就把 `length()` 累加；是文件夹就递归求它的大小再累加。

```java
public static long getDirLength(File dir) {
    long total = 0;
    File[] files = dir.listFiles();
    if (files != null) {
        for (File file : files) {
            if (file.isFile()) {
                total += file.length();        // 是文件，累加字节数
            } else {
                total += getDirLength(file);   // 是文件夹，递归累加
            }
        }
    }
    return total;
}
```

本节收束：File 是"磁盘对象的遥控器"——构造只是记路径，判断用 exists/isFile/isDirectory，读写信息用 length/getName/getAbsolutePath 等，创建删除用 createNewFile/mkdir(s)/delete，遍历用 listFiles（注意 null 陷阱）；递归就是"方法自己调用自己 + 出口"，写递归先想两件事：**出口条件**（什么时候停）和**递推公式**（怎么把问题变小一号），File + 递归是"遍历任意深度文件夹"的黄金搭档。

### 第十六章：常用API

**Math 类**

核心结论：Math 类**包含执行基本数字运算的方法**，全部是静态方法，直接用类名调用。

| 方法名 | 说明 |
| --- | --- |
| `public static int abs(int a)` | 获取参数绝对值 |
| `public static double ceil(double a)` | 向上取整 |
| `public static double floor(double a)` | 向下取整 |
| `public static int round(float a)` | 四舍五入 |
| `public static int max(int a, int b)` | 获取两个 int 值中的较大值 |
| `public static double pow(double a, double b)` | 返回 a 的 b 次幂的值 |
| `public static double random()` | 返回值为 double 的随机值，范围 [0.0, 1.0) |

容易误解的地方：ceil 是"往大了取"（4.1 → 5.0，-4.1 → -4.0）；floor 是"往小了取"（4.9 → 4.0，-4.9 → -5.0）；round 看小数位四舍五入返回 int。random() 返回 [0.0, 1.0) 区间，取 0 不要 1.0。

**System 类**

核心结论：System 也是一个工具类，提供了一些与系统相关的方法；**System 的功能是静态的，都是直接用类名调用即可**。

| 方法名 | 说明 |
| --- | --- |
| `public static void exit(int status)` | 终止当前运行的 Java 虚拟机，非零表示异常终止 |
| `public static long currentTimeMillis()` | 返回当前系统的时间毫秒值形式 |
| `public static void arraycopy(数据源数组, 起始索引, 目的地数组, 起始索引, 拷贝个数)` | 数组拷贝 |

**计算机中的时间原点**：1970 年 1 月 1 日 00:00:00。原因：1969 年 8 月，贝尔实验室的程序员肯·汤普逊利用妻儿离开一个月的机会，开始着手创造一个全新的革命性的操作系统；他使用 B 编译语言在老旧的 PDP-7 机器上开发出了 Unix 的一个版本；随后，汤普逊和同事丹尼斯·里奇改进了 B 语言，开发出了 C 语言，重写了 UNIX。**1970 年 1 月 1 日算作 C 语言的生日**，后来被定为计算机计时的时间原点。由于时区关系，北京时间对应的是 **1970 年 1 月 1 日 08:00:00**。

容易误解的地方：currentTimeMillis() 返回的是"当前时间距离时间原点走过的总毫秒数"（long 类型），想换算成"现在几点"不能直接看得懂，需要用 Date 或时间 API 转换；arraycopy 拷贝前要保证目的地数组装得下，否则会抛数组索引越界异常。

**包装类**

核心结论：**将基本数据类型包装成类（变成引用数据类型）**——变成类就可以创建对象了，对象就可以调用方法方便地解决问题了。

基本数据类型与引用数据类型的对应关系：

| 基本数据类型 | 引用数据类型 |
| --- | --- |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| char | Character |
| float | Float |
| double | Double |
| boolean | Boolean |

**将基本数据类型手动包装为类（以 Integer 为例）**：
- `public Integer(int value)`：通过构造方法把 int 包装成对象；
- `public static Integer valueOf(int i)`：通过静态方法把 int 包装成对象。

**自动装箱与自动拆箱**：
- **自动装箱**：基本类型的数据和变量可以直接赋值给包装类型的变量；
- **自动拆箱**：包装类型的变量可以直接赋值给基本数据类型的变量；
- 有了自动拆装箱，基本数据类型和对应的包装类可以直接运算，操作起来非常便捷。

课件示例（体会"包装成类之后就能用方法"）：

```java
public class IntegerDemo {
    public static void main(String[] args) {
        String s = "123";
        System.out.println(s + 100);      // 223
        // 转换为十六进制, 八进制, 二进制...
        int num = 666;
    }
}
```

⚠️ 问题：课件注释写 `System.out.println(s + 100); // 223`，但 s 是 String 类型，"123" + 100 是字符串拼接，实际输出 "123100"；只有先把字符串转成整数再相加才等于 223。
修正建议：`int num = Integer.parseInt(s); System.out.println(num + 100); // 223`。Integer 还提供 toHexString/toOctalString/toBinaryString 等方法把数字转成十六进制、八进制、二进制字符串。

**包装类练习**

已知字符串 `String s = "10,50,30,20,40";`，请将该字符串转换为整数并存入数组，随后求出最大值打印在控制台。

思路：split(",") 按逗号切割成 5 段 → 逐段用 Integer.parseInt 转成 int 放进数组 → 遍历数组比大小求最大值。

```java
String s = "10,50,30,20,40";
String[] strArr = s.split(",");
int[] arr = new int[strArr.length];
for (int i = 0; i < strArr.length; i++) {
    arr[i] = Integer.parseInt(strArr[i]);
}
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
System.out.println("最大值：" + max);   // 50
```

**BigDecimal 类**

核心结论：**用于解决小数运算中出现的不精确问题**。例如：

```java
public class BigDecimalDemo {
    public static void main(String[] args) {
        double num1 = 0.1;
        double num2 = 0.2;
        System.out.println(num1 + num2);   // 结果不是 0.3，而是 0.30000000000000004
    }
}
```

原因：计算机底层是二进制，很多十进制小数（如 0.1）无法用二进制精确表示，double/float 运算会产生精度丢失。涉及金额等要求精确的小数运算，就要用 BigDecimal。

**创建对象**：
- `public BigDecimal(double val)`（不推荐，仍可能带入 double 的不精确值）；
- `public BigDecimal(String val)`（推荐，用字符串构造精确值）；
- `public static BigDecimal valueOf(double val)`（推荐，内部把 double 转成字符串再构造）。

**常用方法**：

| 方法名 | 说明 |
| --- | --- |
| `public BigDecimal add(BigDecimal b)` | 加法 |
| `public BigDecimal subtract(BigDecimal b)` | 减法 |
| `public BigDecimal multiply(BigDecimal b)` | 乘法 |
| `public BigDecimal divide(BigDecimal b)` | 除法 |
| `public BigDecimal divide(另一个BigDecimal对象, 精确几位, 舍入模式)` | 除法（处理除不尽的情况） |

**divide 除法细节**：

```java
BigDecimal divide = bd1.divide(参与运算的对象, 小数点后精确到多少位, 舍入模式);
```

- 参数 1：表示参与运算的 BigDecimal 对象；
- 参数 2：表示小数点后面精确到多少位；
- 参数 3：舍入模式——`RoundingMode.UP` 进一法、`RoundingMode.DOWN` 去尾法、`RoundingMode.HALF_UP` 四舍五入。

完整示例：

```java
BigDecimal bd1 = new BigDecimal("0.1");
BigDecimal bd2 = new BigDecimal("0.2");
System.out.println(bd1.add(bd2));        // 0.3
System.out.println(bd1.subtract(bd2));   // -0.1
System.out.println(bd1.multiply(bd2));   // 0.02
System.out.println(new BigDecimal("10").divide(new BigDecimal("3"), 2, RoundingMode.HALF_UP)); // 3.33
```

要点回顾：BigDecimal 解决小数运算的精度损失问题；创建对象优先用 `BigDecimal(String val)` 或 `static BigDecimal valueOf(double val)`；**除法运算需要注意除不尽的情况**——不指定精确位数和舍入模式，除不尽时会直接抛 ArithmeticException 异常。

容易误解的地方：运算方法（add/subtract 等）返回的是**新的 BigDecimal 对象**，不会修改原来参与运算的对象——即 BigDecimal 是不可变的，这和 String 类似。

**Arrays 类**

核心结论：Arrays 是**数组操作工具类，专门用于操作数组元素**，全是静态方法。

| 方法名 | 说明 |
| --- | --- |
| `public static String toString(类型[] a)` | 将数组元素拼接为带有格式的字符串 |
| `public static boolean equals(类型[] a, 类型[] b)` | 比较两个数组内容是否相同 |
| `public static int binarySearch(int[] a, int key)` | 查找元素在数组中的索引（二分查找法） |
| `public static void sort(类型[] a)` | 对数组进行默认升序排序 |

**二分查找原理**（binarySearch 的底层过程）：对排好序的数组 [11, 22, 33, 44, 55, 66, 77, 88, 99, 100] 查找 88——先看中间位置的 55，不是 88，那就比大小：88 比 55 大，说明 88 只可能在右半边，于是抛弃左半边、在 [66, 77, 88, 99, 100] 里继续二分，重复"看中间元素 → 比大小 → 缩小一半范围"，直到找到 88。

**二分查找的前提：必须是排好序的数据**。拿乱序数组去 binarySearch，查不查得到全凭运气。

容易误解的地方：toString/equals/sort 等都是"工具方法"，不影响数组对象本身的能力（数组本身只有一个 length 属性）；sort 默认升序，若要降序需要借助其他手段；binarySearch 找不到时返回负数（不是 -1 简单结论，按 JDK 规则是 -(插入点)-1，考试重点记住"找不到返回负数"）。

**Date 类**

核心结论：Date 类**代表的是日期和时间**。

构造器：

| 构造器 | 说明 |
| --- | --- |
| `public Date()` | 创建一个 Date 对象，代表的是系统当前此刻日期时间 |
| `public Date(long time)` | 把时间毫秒值转换成 Date 日期对象 |

常见方法：

| 方法 | 说明 |
| --- | --- |
| `public long getTime()` | 返回从 1970 年 1 月 1 日 00:00:00 走到此刻的总的毫秒数 |
| `public void setTime(long time)` | 设置日期对象的时间为当前时间毫秒值对应的时间 |

要点整理（课件自问自答）：
1. 日期对象如何创建，如何获取时间毫秒值？——`public Date();` 创建当前时间对象、`public long getTime();` 获取毫秒值；
2. 时间毫秒值怎么转成日期对象？——`public Date(long time);` 或 `public void setTime(long time);`。

**SimpleDateFormat 类**

核心结论：**用于日期格式化**，是一个"格式转换器"。

构造器：

| 构造器 | 说明 |
| --- | --- |
| `public SimpleDateFormat()` | 构造一个 SimpleDateFormat，使用默认格式 |
| `public SimpleDateFormat(String pattern)` | 构造一个 SimpleDateFormat，使用指定的格式 |

格式化方法：

| 方法 | 说明 |
| --- | --- |
| `public final String format(Date date)` | 将日期格式化成日期/时间字符串 |
| `public final Date parse(String source)` | 将字符串解析为日期类型 |

要点整理（课件自问自答）：
1. SimpleDateFormat 代表什么，有什么作用？——**可以把日期对象格式化成我们想要的形式**（如"yyyy年MM月dd日 HH:mm:ss"）；**可以把字符串的时间形式解析成 Date 日期对象**；
2. SimpleDateFormat 的对象如何创建？——`public SimpleDateFormat(String pattern)` 用指定格式创建；
3. 格式化和解析的方法是哪些？——`public final String format(Date d)` 格式化日期对象；`public Date parse(String source)` 解析字符串时间。

细节说明：format 是"Date → 字符串"（格式化），parse 是"字符串 → Date"（解析），方向相反；parse 时字符串必须与构造时指定的 pattern 匹配，否则抛 ParseException。

**JDK8 新增时间 API：LocalDateTime、LocalDate、LocalTime**

为什么新增：**JDK8 开始之后**提供的新时间 API——
1. 设计更合理，功能丰富，使用更方便；
2. 都是不可变对象，修改后会返回新的时间对象，不会丢失最开始的时间；
3. 线程安全；
4. 能精确到毫秒、纳秒。

三个类的分工：
- **LocalDate**：代表本地日期（年、月、日、星期）；
- **LocalTime**：代表本地时间（时、分、秒、纳秒）；
- **LocalDateTime**：代表本地日期、时间（年、月、日、星期、时、分、秒、纳秒）。

⚠️ 问题：课件章节标题把类名写成了 "LocaldateTime"（中间 d 小写）。
修正建议：标准类名为 LocalDateTime。

**获取对象**：

| 方法名 | 示例 |
| --- | --- |
| `public static Xxxx now()`：获取系统当前时间对应的该对象 | `LocalDate ld = LocalDate.now();` `LocalTime lt = LocalTime.now();` `LocalDateTime ldt = LocalDateTime.now();` |
| `public static Xxxx of(…)`：获取指定时间的对象 | `LocalDate localDate1 = LocalDate.of(2099, 11, 11);` `LocalTime localTime1 = LocalTime.of(9, 8, 59);` `LocalDateTime localDateTime1 = LocalDateTime.of(2025, 11, 16, 14, 30, 01);` |

⚠️ 问题：课件该表格第一行示例把类型名写成了 `LocaDate ld = LocalDate.now();`——"LocaDate"少了一个字母 l，无法编译（同一行右边的 LocalDate.now() 拼写是对的，前后不一致）。
修正建议：`LocalDate ld = LocalDate.now();`。

**获取年月日时分秒相关的方法**：

| 方法名 | 功能 |
| --- | --- |
| `int getYear()` | 获取年份字段 |
| `Month getMonth()` | 使用 Month 枚举获取月份字段 |
| `int getMonthValue()` | 获取 1 到 12 之间的月份字段 |
| `int getDayOfMonth()` | 获取日期字段 |
| `DayOfWeek getDayOfWeek()` | 获取星期几字段，即枚举 DayOfWeek |
| `int getHour()` | 获取小时字段 |
| `int getMinute()` | 获取分钟字段 |
| `int getSecond()` | 获取秒字段 |

⚠️ 问题：课件把 `Month getMonth()` 的说明写成"使用 Month 枚举获取年份字段"——getMonth 获取的是**月份**，与年份无关，说法矛盾。
修正建议：应说明为"使用 Month 枚举获取月份字段"。

⚠️ 问题：课件把 `int getSecond()` 的说明写成"获取第二分钟字段"——getSecond() 获取的是当前分钟内的"秒"（0~59），不存在"第二分钟字段"这种说法。
修正建议：应说明为"获取秒字段"。

**修改年月日时分秒相关的方法**：

| 方法名 | 说明 |
| --- | --- |
| withHour、withMinute、withSecond、withNano | 修改时间，返回新时间对象 |
| plusHours、plusMinutes、plusSeconds、plusNanos | 把某个信息加多少，返回新时间对象 |
| minusHours、minusMinutes、minusSeconds、minusNanos | 把某个信息减多少，返回新时间对象 |
| equals、isBefore、isAfter | 判断 2 个时间对象，是否相等、在前还是在后 |

注意：**LocalDateTime、LocalDate、LocalTime 都是不可变的**，上述方法**返回的是一个新的对象**（原对象不受影响）。

要点整理（课件自问自答）：
1. LocalDate、LocalTime、LocalDateTime 对象如何创建？——now：当前时间；of：指定时间；
2. 获取的相关方法是？——getXxx()：getYear()、getMonth()、getMonthValue()…；
3. 修改的相关方法是？——withXxx：修改；minusXxx：减；plusXxx：加；
4. 注意点：都是不可变的，调用修改的相关方法，返回的都是新的对象。

容易误解的地方：不要像旧 API 那样"调用方法改掉原对象"——新时间 API 就像 String，"改动"永远是产生新对象；想要结果必须接收返回值。

**DateTimeFormatter 类**

核心结论：**用于时间的格式化和解析**（对应新时间 API 的"SimpleDateFormat"角色）。

| 方法名 | 说明 |
| --- | --- |
| `static DateTimeFormatter ofPattern(格式)` | 获取格式对象 |
| `String format(时间对象)` | 按照指定方式格式化 |

**ChronoUnit 类（含 Period、Duration）**

核心结论：**计算时间间隔的工具类**：
- **Period**：用于计算两个"日期"间隔（年、月、日）；
- **Duration**：用于计算两个"时间"间隔（秒，纳秒）；
- **ChronoUnit**：计算时间间隔的工具类（用于计算两个"日期"间隔）。

**案例：计算用户年龄**

需求：已知生日，计算用户年龄。

思路：拿到生日日期和当前日期 → 用 Period 算两个"日期"之间的间隔 → 取间隔中的年数。

```java
LocalDate birthday = LocalDate.of(2000, 5, 20);
LocalDate today = LocalDate.now();
Period period = Period.between(birthday, today);
System.out.println("年龄为：" + period.getYears() + "岁");
```

（用 ChronoUnit 也可以：`ChronoUnit.YEARS.between(birthday, today)` 直接得到相差整年数。）

本节收束：本章是"工具库巡礼"——Math/System/Arrays 管基础运算、系统信息、数组操作；包装类是基本类型与对象之间的桥梁（自动装箱拆箱、parseInt 解析字符串）；BigDecimal 专治小数精度（金额运算首选）；日期时间分两代：老 API（Date + SimpleDateFormat，"格式化 format / 解析 parse"）和新 API（LocalXxx 不可变 + DateTimeFormatter + ChronoUnit/Period/Duration 算间隔）。选型口诀：新项目用新 API，求间隔记三件套。

### 第十七章：IO流

**IO 介绍和分类**

核心结论：**I 代表 input（输入/读取），O 代表 output（输出/写出）**。IO 流研究的就是 Java 程序与外部数据（文件、网络……）之间的数据传输：把数据从外部读进程序用"输入流管道"，把程序的数据写出去用"输出流管道"。数据就像水管里的水，通过一根根"管道"在程序和文件之间流动。

典型场景（结合课件动画场景）：
- 程序向 `D:\user.txt` 写出注册账号信息（SanLian666 888888）——输出流管道；
- 程序从 `D:\user.txt` 读取已有账号信息（Ashen_666 123456、Ajie_888 111111）——输入流管道；
- 常见应用：读写配置文件、日志文件；客户端与服务端的通讯；文件上传下载等。

**IO 流体系结构**：

- **字节流（万能流）**：
  - `InputStream`：字节输入流的抽象类 → 子类 `FileInputStream`；
  - `OutputStream`：字节输出流的抽象类 → 子类 `FileOutputStream`；
- **字符流（适合纯文本文件）**：
  - `Reader`：字符输入流的抽象类 → 子类 `FileReader`；
  - `Writer`：字符输出流的抽象类 → 子类 `FileWriter`。

细节说明：抽象类定义"输入/输出"的统一规范，两类具体子类负责操作文件。字节流是"万能流"（任何文件都能处理），字符流专门处理纯文本文件。

**FileOutputStream 字节输出流**

核心结论：Java 程序通过 FileOutputStream 把字节写进文件（图中：`D:\A.txt` 中的 97 对应写出字符 a）。

构造方法：

| 构造方法 | 说明 |
| --- | --- |
| `FileOutputStream(String name)` | 输出流关联文件，文件路径以字符串形式给出 |
| `FileOutputStream(String name, boolean append)` | 第二个参数是追加写入的开关 |
| `FileOutputStream(File file)` | 输出流关联文件，文件路径以 File 对象形式给出 |
| `FileOutputStream(File file, boolean append)` | 第二个参数是追加写入的开关 |

注意事项：关联的文件**如果不存在：自动创建**；**存在：会清空现有的，再开始写入**（append 为 false 时）。append 传 true 则保留原内容，在末尾追加。

成员方法：

| 成员方法 | 说明 |
| --- | --- |
| `void write(int b)` | 写出单个字节 |
| `void write(byte[] b)` | 写出一个字节数组 |
| `void write(byte[] b, int off, int len)` | 写出字节数组的一部分 |

使用示例：

```java
public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("D:\\A.txt");
    fos.write(97);                       // 写出单个字节 97，文件中看到字符 a
    byte[] bytes = "abcde".getBytes();
    fos.write(bytes);                    // 写出整个字节数组：abcde
    fos.write(bytes, 1, 3);              // 写出字节数组的一部分（索引 1 起 3 个）：bcd
    fos.close();
}
```

细节说明：字符 a 在计算机底层就是数字 97（ASCII 码表），所以 write(97) 写出的就是 'a'；write(int b) 的参数虽然写的是 int，实际只会写出一个字节。

**关流**：**流对象使用完毕后，记得调用 close 方法关闭，不然会占用资源**。

**标准的 IO 异常处理**：
- JDK7 版本之前：手动 try...catch...finally，在 finally 里关流（老写法，代码繁琐）；
- JDK7 版本之后：使用 try-with-resources，格式：

```java
try (需要调用close方法的对象) {
    // 逻辑代码...
} catch (异常类名 对象名) {
    // 异常的处理方式
}
```

注意事项：**try () 中的对象，需要实现过 AutoCloseable 接口**——满足这个条件，代码块执行完毕后 Java 会自动调用它的 close 方法，不再需要手写关流。

```java
try (FileOutputStream fos = new FileOutputStream("D:\\A.txt")) {
    fos.write(97);
} catch (IOException e) {
    e.printStackTrace();
}
```

**FileInputStream 字节输入流**

核心结论：Java 程序通过 FileInputStream 从文件中读取字节（`D:\A.txt` 内容 "abc"，读到的就是 97、98、99）。

构造方法：

| 构造方法 | 说明 |
| --- | --- |
| `FileInputStream(String name)` | 输入流关联文件，文件路径以字符串形式给出 |
| `FileInputStream(File file)` | 输入流关联文件，文件路径以 File 对象形式给出 |

注意事项：**关联的文件不存在会抛出 FileNotFoundException 异常**；传入的如果是文件夹的话会拒绝访问。

成员方法：

| 成员方法 | 说明 |
| --- | --- |
| `int read()` | 读取一个字节并返回，如果到达文件结尾则返回 -1 |
| `int read(byte[] b)` | 将读取到的字节放到传入的数组，返回读取到的有效字节个数，如果到达文件结尾则返回 -1 |

使用步骤：**创建对象的时候关联文件（文件不存在就会抛出异常）→ 调用 read 方法读取字节**。

```java
FileInputStream fis = new FileInputStream("D:\\A.txt");

// 方式一：一次读取一个字节
int b;
while ((b = fis.read()) != -1) {
    System.out.println((char) b);     // 转成字符后输出
}

// 方式二：一次读取一个字节数组
byte[] buffer = new byte[2];
int len;
while ((len = fis.read(buffer)) != -1) {
    System.out.println(new String(buffer, 0, len));   // 只转换读到的有效个数
}

fis.close();
```

读取过程图解读懂（课件用 "abcde" + byte 数组演示）：文件内容 abcde 对应字节 97~101；用一个长度为 2 的数组 `byte[] bys` 去读——第一次读满 2 个（97、98 放进数组），返回有效个数 2；第二次再读 2 个（99、100），返回 2；第三次读到 1 个（101），数组里 0 号位被覆盖，返回 1；第四次到达文件结尾，返回 -1，循环结束。

**字节数组转字符串的构造方法**：

| 构造方法 | 说明 |
| --- | --- |
| `public String(byte[] bytes, int offset, int length)` | 将字节数组转换为字符串——参数 1：字节数组；参数 2：起始索引；参数 3：转换的个数 |

这里必须用 `new String(buffer, 0, len)`（转换"有效个数"个字节），如果写成 `new String(buffer)`，会把数组里没被覆盖的"上次读到的旧字节"也转进去，导致数据错乱。

**案例：文件拷贝**

需求：将 `D:\嘿嘿.jpg` 拷贝到 `E:\` 根目录下。

四步流程：**创建输入流对象读取文件 → 创建输出流对象关联数据目的 → 读写操作 → 关流释放资源**。

```java
public static void main(String[] args) throws IOException {
    // 1. 创建输入流对象读取文件
    FileInputStream fis = new FileInputStream("D:\\嘿嘿.jpg");
    // 2. 创建输出流对象关联数据目的
    FileOutputStream fos = new FileOutputStream("E:\\嘿嘿.jpg");
    // 3. 读写操作：一车一车地搬（一次一桶"字节数组"）
    byte[] buffer = new byte[1024];
    int len;
    while ((len = fis.read(buffer)) != -1) {
        fos.write(buffer, 0, len);
    }
    // 4. 关流释放资源
    fos.close();
    fis.close();
}
```

容易误解的地方：拷贝图片必须用**字节流**（图片不是纯文本）；`fos.write(buffer, 0, len)` 的 len 必须是"读到的有效字节数"，否则最后一批数据会把旧内容多写进去。

**FileReader 字符输入流**

核心结论：字符输入流**用于读取纯文本文件，解决中文乱码问题**（中文按字符读取，不会出现"半个汉字"的乱码）。

构造方法：

| 构造方法 | 说明 |
| --- | --- |
| `FileReader(String fileName)` | 字符输入流关联文件，路径以字符串形式给出 |
| `FileReader(File file)` | 字符输入流关联文件，路径以 File 对象形式给出 |

成员方法：

| 成员方法 | 说明 |
| --- | --- |
| `public int read()` | 读取单个字符 |
| `public int read(char[] cbuf)` | 读取一个字符数组，返回读取到的有效字符个数 |

```java
FileReader fr = new FileReader("D:\\A.txt");
char[] cbuf = new char[3];
int len;
while ((len = fr.read(cbuf)) != -1) {
    System.out.println(new String(cbuf, 0, len));
}
fr.close();
```

**FileWriter 字符输出流**

构造方法：

| 构造方法 | 说明 |
| --- | --- |
| `FileWriter(String fileName)` | 字符输出流关联文件，路径以字符串形式给出 |
| `FileWriter(String fileName, boolean append)` | 参数 2：追加写入的开关 |
| `FileWriter(File file)` | 字符输出流关联文件，路径以 File 对象形式给出 |
| `FileWriter(File file, boolean append)` | 参数 2：追加写入的开关 |

成员方法：

| 成员方法 | 说明 |
| --- | --- |
| `public void write(int c)` | 写出单个字符 |
| `public void write(char[] cbuf)` | 写出一个字符数组 |
| `public void write(char[] cbuf, int off, int len)` | 写出字符数组的一部分 |
| `public void write(String str)` | 写出字符串 |
| `public void write(String str, int off, int len)` | 写出字符串的一部分 |

⚠️ 问题：课件 `write(char[] cbuf, int off, int len)` 这条漏写了返回类型 void（其余条目都写作 public void write(...)）。
修正建议：完整签名是 `public void write(char[] cbuf, int off, int len)`。

注意事项：**字符输出流写出数据，需要调用 flush 或 close 方法，数据才会写出**——**Flush 后可以继续写出；Close 后不能继续写出**。

```java
FileWriter fw = new FileWriter("D:\\A.txt", true);   // true：追加写入
fw.write('a');
fw.write("你好世界".toCharArray());
fw.write("Hello");
fw.write("HelloWorld", 5, 5);     // 从索引 5 开始写 5 个字符：World
fw.flush();                        // 刷新：数据此刻真正写出到文件
fw.write("~~~");                   // flush 之后还能继续写
fw.close();                        // 关闭：既写出数据又释放资源，之后不能再写
```

容易误解的地方：写了 write 不等于"写进文件"——数据先进缓冲区，flush/close 时才落盘；close 自带 flush 效果，所以如果马上要关流，flush 可以省，但如果后面还要继续写，就必须先 flush。

**字符流和字节流的使用场景**

- **字符流使用场景：读写纯文本文件**（.txt、.java 等能直接看懂的文本）；
- **字节流使用场景：不是纯文本文件都用字节流**（图片、音频、视频、压缩包……）；此外字节流也能处理文本，是"万能流"。

**Properties 集合**

核心结论：**Properties 其实就是一个 Map 集合**，内部键和值都是 String 字符串；它内部存在着"两个"方法，可以很方便地把集合中的键值对写入文件，也可以很方便地从文件中读取——**将来加载配置文件的时候很方便**。

作为集合使用的方法：

| 方法 | 说明 |
| --- | --- |
| `Object setProperty(String key, String value)` | 添加（修改）一个键值对 |
| `String getProperty(String key)` | 根据键获取值 |
| `Set<String> stringPropertyNames()` | 获取集合中所有的键 |

和 IO 有关的方法：

| 方法 | 说明 |
| --- | --- |
| `void load(InputStream inStream)` | 从输入字节流读取属性列表（键和元素对） |
| `void load(Reader reader)` | 从输入字符流读取属性列表（键和元素对） |
| `void store(OutputStream out, String comments)` | 将此属性列表（键和元素对）以适合使用 load(InputStream) 方法的格式写入输出字节流 |
| `void store(Writer writer, String comments)` | 将此属性列表（键和元素对）以适合使用 load(Reader) 方法的格式写入输出字符流 |

重点掌握的方法：
```
setProperty(键,值);      添加键值对
getProperty(键);         根据键获取值
load(字节流 | 字符流);    从流中加载键值对
store(字节流 | 字符流);   将键值对写出到文件
```

使用示例（结合课件账号数据）：

```java
// 写出键值对到配置文件
Properties prop = new Properties();
prop.setProperty("Ashen_666", "123456");
prop.setProperty("Ajie_888", "111111");
prop.store(new FileOutputStream("D:\\user.properties"), "用户信息");

// 从配置文件加载键值对
Properties prop2 = new Properties();
prop2.load(new FileInputStream("D:\\user.properties"));
System.out.println(prop2.getProperty("Ashen_666"));   // 123456
```

**Hutool 工具**

核心结论：**Hutool 是一个小而全的 Java 工具类库，通过静态方法封装，降低相关 API 的学习成本，提高工作效率**。

IOUtil 类提供的部分方法：

| 方法 | 说明 |
| --- | --- |
| `copy(InputStream in, OutputStream out, int bufferSize)` | 字节流拷贝 |
| `copy(Reader reader, Writer writer)` | 字符流拷贝 |
| `readLines(Reader reader, Collection<String> collection)` | 按行读取内容到集合 |
| `close(Closeable closeables)` | 安全关闭流 |

FileUtil 类提供的部分方法：

| 方法 | 说明 |
| --- | --- |
| `touch(filePath)` | 创建文件（自动创建父目录） |
| `mkdir(dirPath)` | 创建目录（支持多级目录） |
| `copy(srcPath, destPath, isOverride)` | 复制文件或目录（可选覆盖） |
| `move(srcFile, destDir, isOverride)` | 移动文件或目录 |

使用示例：

```java
// IOUtil：拷贝、按行读、安全关闭
IOUtil.copy(new FileInputStream("D:\\嘿嘿.jpg"), new FileOutputStream("E:\\嘿嘿.jpg"), 1024);
List<String> lines = new ArrayList<>();
IOUtil.readLines(new FileReader("D:\\A.txt"), lines);
IOUtil.close(fis);

// FileUtil：建文件、建目录、复制、移动
FileUtil.touch("D:\\aaa\\bbb\\c.txt");     // 父目录不存在也能建
FileUtil.mkdir("D:\\aaa\\bbb\\ccc");       // 多级目录
FileUtil.copy("D:\\a.txt", "E:\\a.txt", true);        // 复制并覆盖
FileUtil.move(new File("D:\\a.txt"), new File("E:\\"), true);   // 移动
```

引入 Hutool：**Hutool 该工具不属于 JDK，使用的时候需要导入 jar 包**。Tips：这种手导 jar 包的方式较为繁琐，后面学到 Maven 的时候可以简化（在 pom.xml 里加依赖即可）。

本节收束：IO 一章记住"两条管道、四兄弟、一个工具"——管道分字节（InputStream/OutputStream，万能流）和字符（Reader/Writer，只管纯文本）；具体落地是四兄弟 FileInputStream/FileOutputStream/FileReader/FileWriter，套路统一：**关联文件 → 读写（read/write，-1 是结尾信号）→ 关流（close，或用 try-with-resources 自动关）**；字符流写要 flush/close 才落盘；Properties 负责"配置文件读写"（setProperty/getProperty/load/store）；Hutool 是偷懒利器（IOUtil/FileUtil），但记得引 jar 包。

### 第十八章：多线程

**进程和线程**

核心结论：
- **进程（Process）是计算机中的程序关于某数据集合上的一次运行活动**，是系统进行资源分配的**基本单位**；简单理解：**程序的执行过程**；
- **线程（Thread）：进程可以同时执行多个任务，每个任务就是线程**。

进程的三个特性：
- **独立性**：每一个进程都有自己的空间，在没有经过进程本身允许的情况下，一个进程不可以直接访问其它的进程空间；
- **动态性**：进程是动态产生，动态消亡的；
- **并发性**：任何进程都可以同其它进程一起并发执行。

多进程同时工作：对于一个 CPU 而言，它是在多个进程间轮换执行的。

**并行和并发**（一字之差，务必分清）：
- **并行**：在同一时刻，有多个指令在**多个 CPU** 上【同时】执行；
- **并发**：在同一时刻，有多个指令在**单个 CPU** 上【交替】执行。
- 简单记：并行是"真同时"，并发是"快到我以为你同时"。

**多线程的意义**：
- 随着处理器上的核心数量越来越多，现在大多数计算机都比以往更加擅长并行计算；
- **一个线程，在一个时刻，只能运行在一个处理器核心上**；
- 多线程的用处：**提高执行效率**、**同时处理多个任务**。

细节说明：课件展示了 2核4线程、4核8线程、8核16线程、16核32线程、32核64线程的常见 CPU 规格——这里的"几核几线程"就是指物理核心数和支持的并行线程数，说明多线程已经是现代计算机的标配能力。

**Java 开启线程的方式**

Java 开启线程有三种方式：
1. **继承 Thread 类**——线程任务无返回值；
2. **实现 Runnable 接口**——线程任务无返回值；
3. **实现 Callable 接口**——线程任务有返回值。

细节说明：**推荐后两种方式（Runnable、Callable），扩展性更好**——因为 Java 是单继承，继承 Thread 类之后就不能再继承别的类了；而实现接口不影响类的继承结构。Runnable 和 Callable 的区别在于：Runnable 的 run 方法没有返回值，Callable 的 call 方法有返回值。

方式一：继承 Thread 类

```java
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + "正在执行：" + i);
        }
    }
}

public static void main(String[] args) {
    MyThread t1 = new MyThread();
    t1.setName("线程一");
    t1.start();     // 注意是 start() 开启新线程，不是调用 run()
}
```

方式二：实现 Runnable 接口

```java
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "正在执行：" + i);
        }
    }
}

public static void main(String[] args) {
    Thread t1 = new Thread(new MyRunnable(), "线程一");
    t1.start();
}
```

方式三：实现 Callable 接口（有返回值）

```java
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;      // 线程跑完的结果可以返回
    }
}

public static void main(String[] args) throws Exception {
    FutureTask<Integer> ft = new FutureTask<>(new MyCallable());
    Thread t = new Thread(ft);
    t.start();
    System.out.println("计算结果：" + ft.get());   // 5050
}
```

细节说明：Callable 不能直接塞给 Thread，要先包装成 FutureTask（它是 Runnable 的实现类），线程跑完用 `ft.get()` 取返回值。

容易误解的地方：开启新线程必须调用 **start()** 方法；如果直接调用 run()，那只是"普通方法调用"，代码会在当前线程（通常是 main 线程）里顺序执行，不会创建新线程。

**线程相关方法**

| 方法名称 | 说明 |
| --- | --- |
| `String getName()` | 返回此线程的名称 |
| `void setName(String name)` | 设置线程的名字（构造方法也可以设置名字） |
| `static Thread currentThread()` | 获取当前线程的对象 |
| `static void sleep(long time)` | 让线程休眠指定的时间，单位为毫秒 |
| `setPriority(int newPriority)` | 设置线程的优先级 |
| `final int getPriority()` | 获取线程的优先级 |
| `final void setDaemon(boolean on)` | 设置为守护线程 |

细节说明：
- **优先级范围：1 ~ 10，默认为 5**；优先级高的线程抢到 CPU 的概率更大，但不是绝对的；
- 线程调度方式分两种——**抢占式调度**（多个线程抢占 CPU，谁抢到谁执行，优先级高的概率大）和**非抢占式调度**（一个线程执行完才轮到下一个）；Java 的线程调度是抢占式的；
- **守护线程**：陪伴线程，当程序中所有的非守护线程都结束后，守护线程也会自动结束。课件图示：聊天线程 + 传输线程——把传输线程设为守护线程，聊天线程（非守护）结束时，传输线程随之结束，程序正常退出。

```java
public static void main(String[] args) {
    Thread t = Thread.currentThread();
    System.out.println(t.getName());   // main——主线程的名字

    Thread t1 = new Thread(() -> {
        try {
            Thread.sleep(2000);        // 休眠 2000 毫秒（2 秒）
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("休眠结束");
    }, "线程一");
    t1.setPriority(10);                // 设置优先级 1~10
    t1.start();
}
```

容易误解的地方：sleep 是静态方法，写在哪个线程里执行就休眠哪个线程；sleep 期间会抛出 InterruptedException，必须处理；设置优先级只是"提高概率"，不能控制执行顺序。

**线程安全和同步**

**需求：某电影院目前正在上映国产大片，共有 100 张票，而它有 3 个窗口卖票，请设计一个程序模拟该电影院卖票。**

课件先用极简数据（tickets = 1）演示了线程安全问题的发生过程：

```java
class Tickets implements Runnable {
    int tickets = 1;   // 课件演示：用 1 张票直观放大"重复卖出"的问题

    @Override
    public void run() {
        while (true) {
            if (tickets <= 0) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
            tickets--;
        }
    }
}
```

问题演示结果：**线程一卖出了第 1 号票、线程二卖出了第 1 号票、线程三卖出了第 1 号票**——同一张票被卖了三次；动画里 tickets 还从 1 减到了 0、又减到 -1，卖出了不存在的"越界票"。

为什么会这样？**一个线程还在"判断票数 → 输出 → 减票"的过程中，CPU 执行权被别的线程抢走了**，多个线程交叉执行同一段代码，导致判断与修改脱节。

**安全问题出现的条件**（三个同时满足才会出问题）：
1. 是多线程环境；
2. 有共享数据；
3. 有多条语句操作共享数据。

**线程同步技术**：**将多条语句操作共享数据的代码给锁起来，让任意时刻只能有一个线程可以执行**。三种实现：同步代码块、同步方法、Lock 锁。

**同步代码块**：

```java
synchronized (锁对象) {
    // 多条语句操作共享数据的代码
}
```

注意事项：**锁对象可以是任意对象，但是需要保证多条线程的锁对象，是同一把锁**；同步可以解决多线程的数据安全问题，**但是也会降低程序的运行效率**。

完整卖票实现（100 张票、3 个窗口、加锁）：

```java
class Tickets implements Runnable {
    int tickets = 100;
    Object lock = new Object();   // 唯一的锁对象：三个线程共用

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (tickets <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
                tickets--;
            }
        }
    }
}

public static void main(String[] args) {
    Tickets task = new Tickets();              // 三个线程共享同一个任务对象
    Thread t1 = new Thread(task, "线程一");
    Thread t2 = new Thread(task, "线程二");
    Thread t3 = new Thread(task, "线程三");
    t1.start();
    t2.start();
    t3.start();
}
```

**同步方法**：在方法的返回值类型前面加入 synchronized 关键字。

```java
public synchronized void method() {
}
```

小细节：方法分为静态和非静态——**静态方法的锁对象是字节码对象，非静态方法的锁对象是 this**。

```java
class Tickets implements Runnable {
    int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (!sellTicket()) {
                break;
            }
        }
    }

    public synchronized boolean sellTicket() {   // 非静态同步方法，锁对象是 this（同一个任务对象，天然同一把锁）
        if (tickets <= 0) {
            return false;
        }
        System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
        tickets--;
        return true;
    }
}
```

**Lock 锁**：使用 Lock 锁，我们可以更清晰地看到哪里加了锁、哪里释放了锁。

```java
lock.lock();
...
lock.unlock();
```

Lock 是接口，无法直接创建对象，用它的实现类 ReentrantLock：

| 构造方法 | 说明 |
| --- | --- |
| `public ReentrantLock()` | 创建一个 ReentrantLock 的实例 |

| 成员方法 | 说明 |
| --- | --- |
| `void lock()` | 加锁 |
| `void unlock()` | 释放锁 |

```java
class Tickets implements Runnable {
    int tickets = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (tickets <= 0) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "卖出了第" + tickets + "号票");
                tickets--;
            } finally {
                lock.unlock();     // 放在 finally 里，保证一定会释放锁
            }
        }
    }
}
```

容易误解的地方：同步代码块的锁对象必须"所有线程都是同一把锁"才有意义——比如三个线程各自 new 一个 Object 当锁，等于没锁；同步会排队执行，降低效率，所以只锁"操作共享数据的必要代码"，不要把整个方法体一股脑锁上。

**线程池介绍**

核心结论：**系统创建一个线程的成本是比较高的（因为它涉及到与操作系统交互）**；当程序中需要创建大量生存期很短暂的线程时，频繁地创建和销毁线程，就会严重浪费系统资源。于是把**线程对象交给线程池维护，可以降低系统成本，从而提升程序的性能**。

课件用"卖炊饼"的故事讲透了道理：店里没服务员（没有线程）→ 客人来了现去招人（临时创建线程）→ 客人吃完就把人开除（线程用完销毁）→ 如此反复，又慢又浪费；正确的做法是"雇一批固定员工待命"（线程池里的线程可以反复复用、空闲了也不销毁）。

线程池学习路径：**使用 JDK 提供的线程池 → 理解线程池的好处 → 自定义线程池**。

**使用 JDK 提供的线程池**——Executors 中提供静态方法来创建线程池：

| 方法 | 介绍 |
| --- | --- |
| `static ExecutorService newCachedThreadPool()` | 创建一个默认的线程池 |
| `static ExecutorService newFixedThreadPool(int nThreads)` | 创建一个指定最多线程数量的线程池 |

```java
// 创建一个最多 3 个线程的线程池
ExecutorService pool = Executors.newFixedThreadPool(3);

// 提交 5 个任务，线程池会复用 3 个线程轮流执行
for (int i = 1; i <= 5; i++) {
    pool.submit(new MyRunnable());
}

pool.shutdown();   // 任务跑完后关闭线程池
```

**自定义线程池**

核心结论：用 **ThreadPoolExecutor 类**自己 new 一个线程池，才能精确控制它的每一个参数（JDK 提供的工厂方法其实就是帮你填好了这些参数）。

**ThreadPoolExecutor 的 7 个参数**（配合"卖炊饼"故事的对应关系）：

| 参数 | 含义 | 故事隐喻 |
| --- | --- | --- |
| 参数 1 | 核心线程数量 | 正式员工（长期雇佣，不轻易裁） |
| 参数 2 | 最大线程数量 | 正式员工 + 临时工（忙不过来时招临时工） |
| 参数 3 | 空闲时间 | 临时工空闲多久就被裁掉 |
| 参数 4 | 时间单位 | 空闲时间的单位 |
| 参数 5 | 任务队列 | 排队区（指定排队人数） |
| 参数 6 | 线程对象工厂 | 负责创建线程对象的"招聘主管" |
| 参数 7 | 拒绝策略 | 队伍也满了，怎么拒绝新客人 |

**参数的取值约束**：核心线程数量不能小于 0；最大线程数量不能小于等于 0，且**最大数量 >= 核心线程数量**；空闲时间不能小于 0；时间单位不能为 null；任务队列不能为 null；线程对象工厂不能为 null；拒绝策略不能为 null。

**线程池拒绝策略**（对应故事里"咋拒绝他呢？打走 / 放狗 / 亲他一口"的三种趣味方案）：

| 策略选项 | 说明 |
| --- | --- |
| `ThreadPoolExecutor.AbortPolicy` | 丢弃任务并抛出 RejectedExecutionException 异常（默认） |
| `ThreadPoolExecutor.DiscardPolicy` | 丢弃任务，但是不抛出异常——这是不推荐的做法 |
| `ThreadPoolExecutor.DiscardOldestPolicy` | 抛弃队列中等待最久的任务，然后把当前任务加入队列中 |
| `ThreadPoolExecutor.CallerRunsPolicy` | 调用任务的 run() 方法，绕过线程池直接执行 |

**两个关键问答**（课件自问自答）：
1. **临时线程什么时候创建？** 线程任务数 > 核心线程数 + 任务队列的数量（准确地说：核心线程都在忙、任务队列也排满时，新来的任务会创建临时线程，前提是当前线程总数还小于最大线程数量）；
2. **什么时候会开启拒绝策略？** 线程任务数 > 最大线程数 + 任务队列的数量（核心线程满、临时线程也满、队列也满，再也塞不下新任务时）。

自定义线程池代码示例：

```java
ThreadPoolExecutor pool = new ThreadPoolExecutor(
        3,                                    // 参数1：核心线程数量（正式员工）
        5,                                    // 参数2：最大线程数量（正式员工 + 临时工）
        60,                                   // 参数3：空闲时间
        TimeUnit.SECONDS,                     // 参数4：时间单位
        new ArrayBlockingQueue<>(5),          // 参数5：任务队列（排队人数 5）
        Executors.defaultThreadFactory(),     // 参数6：线程对象工厂
        new ThreadPoolExecutor.AbortPolicy()  // 参数7：拒绝策略（默认）
);

pool.submit(new MyRunnable());   // 提交任务
pool.shutdown();                 // 关闭线程池
```

本节收束：多线程一章抓住一条主线——"为什么（并发/并行提高效率）→ 怎么开（Thread/Runnable/Callable 三种方式，start 才开新线程）→ 怎么管（getName/sleep/优先级/守护线程）→ 怎么不出事（安全三条件 + 三种锁：同步代码块/同步方法/Lock）→ 怎么高效（线程池复用线程；ThreadPoolExecutor 七参数 + 四种拒绝策略 + 两问两答）"。

### 第十九章：网络编程

**网络编程基本概念**

核心结论：**网络编程指可以让设备中的程序与网络上其他设备中的程序进行数据交互的技术（实现网络通信）**。

基本的通信架构有 2 种形式：**CS 架构（Client 客户端 / Server 服务端）**、**BS 架构（Browser 浏览器 / Server 服务端）**。

- CS 架构：客户端需要程序员开发客户端软件；需要用户下载安装客户端软件；服务端需要程序员开发服务端程序；
- BS 架构：浏览器不需要程序员开发；需要用户下载安装浏览器；服务端需要程序员开发服务端程序。

无论是 CS 架构，还是 BS 架构的软件都必须依赖网络编程！Java 提供的网络编程解决方案在 **java.net.\* 包**下。

**网络编程三要素**

| 要素 | 含义 |
| --- | --- |
| 01 IP 地址 | 设备在网络中的地址，是设备在网络中的唯一标识 |
| 02 端口 | 应用程序在设备中的唯一标识 |
| 03 协议 | 连接和数据在网络中传输的规则 |

理解案例（课件动画）：用微信给"唔西迪西"发送"爱你哟"——先靠 **IP 地址**找到对方设备，再靠**端口号（8888）**找到对方设备上的微信程序，数据按**传输协议**的规则传输过去。

**IP 地址**

核心结论：**IP（Internet Protocol），全称"互联网协议地址"，是分配给上网设备的唯一标识**。目前被广泛采用的 IP 地址形式有两种：IPv4、IPv6。

- **IPv4**：Internet Protocol version 4 的缩写，**使用 32 位地址，通常以点分十进制表示**（32 位 = 4 个字节）。例：`11000000 10101000 00000001 01000010` = `192.168.1.66`。特点：目前的主流方案；**最多只有 2^32 个 IP，目前已经用完了**；
- **IPv6**：Internet Protocol version 6 的缩写，**使用 128 位地址（16 个字节），号称可以为地球上的每一粒沙子编号**。IPv6 分成 8 段，每段每四位编码成一个十六进制位表示，每段之间用冒号（:）分开，这种方式称为**冒分十六进制**。例：`2001:0db8:0000:0023:0008:0800:200c:417a`。特点：**为了解决 IPv4 不够用而出现**的，最多有 2^128 个 IP。

**特殊 IP 地址**：
- **公网地址（万维网使用）和私有地址（局域网使用）**：192.168. 开头的就是私有地址，范围即为 192.168.0.0 -- 192.168.255.255；专门为组织机构内部使用（网吧、公寓、商场、办公楼等场景），以此节省 IP；
- **127.0.0.1，也可以是 localhost**：是回送地址，也称**本地回环地址**，也称**本机 IP**，**永远只会寻找当前所在本机**。建议：自己练习就写 127.0.0.1。

课件的思考题：假设 192.168.1.100 是我电脑的 IP，那么这个 IP 跟 127.0.0.1 是一样的吗？——**不一样**：192.168.1.100 是局域网内其他设备可以找到"我"的地址；而 127.0.0.1 永远只能自己找自己。

**常用的 CMD 命令**：
- `ipconfig`：查看本机 IP 地址；
- `ping`：检查网络是否连通。

**IP 和网址的关系**：平时上网用的是网址（域名）——计算机把网址交给 DNS 服务器，DNS 把网址解析成 IP 地址，再按 IP 去访问服务器，返回的数据展示在浏览器上。

**InetAddress 对象**：为了方便对 IP 地址的获取和操作，Java 提供了一个类 InetAddress 供我们使用——"此类表示 Internet 协议（IP）地址"。

| 方法名 | 说明 |
| --- | --- |
| `static InetAddress getByName(String host)` | 确定主机名称的 IP 地址。主机名称可以是机器名称，也可以是 IP 地址 |
| `String getHostName()` | 获取此 IP 地址的主机名 |
| `String getHostAddress()` | 返回文本显示中的 IP 地址字符串 |

```java
InetAddress ip = InetAddress.getByName("127.0.0.1");
System.out.println(ip.getHostName());      // 主机名
System.out.println(ip.getHostAddress());   // 127.0.0.1
```

**端口号**

核心结论：**端口号是应用程序在设备中唯一的标识**。

- 端口号：**由两个字节表示的整数，取值范围：0~65535**；
- 其中 0~1023 之间的端口号用于一些知名的网络服务或者应用；
- 我们自己使用 **1024 以上**的端口号就可以了；
- 注意：**一个端口号只能被一个应用程序使用**（同一台电脑上，两个程序不能抢同一个端口）。

**协议**

核心结论：**计算机网络中，连接和通信的规则被称为网络通信协议**。

- **UDP 协议**：用户数据报协议（User Datagram Protocol）；**面向无连接**通信协议（不管是否已经连接成功）；**速度快，有大小限制一次最多发送 64K，数据不安全，易丢失数据**；
- **TCP 协议**：传输控制协议（Transmission Control Protocol）；**面向连接**的通信协议（确保连接成功）；**速度慢，没有大小限制，数据安全**。

应用场景对比（课件图示）：发送邮件、文字聊天、下载软件、网络会议、语言通话、在线视频——这些"确保连接成功"的场景都用 TCP。

**UDP 协议收发数据**

用"寄快递"理解 UDP 收发（课件比喻）：
- **发送端**：找快递公司（创建发送端的 DatagramSocket 对象）→ 打包礼物（数据打包 DatagramPacket）→ 快递公司发送包裹（send 方法发送数据）→ 付钱走人（释放资源）；
- **接收端**：找快递公司（创建接收端的 DatagramSocket 对象）→ 接收箱子（receive 方法接收打包好的数据）→ 从箱子里面获取礼物（解析数据包）→ 签收走人（释放资源）。

小结：**使用 DatagramSocket 搭建站点；使用 DatagramPacket 打包数据；send 方法用于发送；receive 方法用于接收**。

发送端代码：

```java
public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 1. 找快递公司：创建发送端的 DatagramSocket 对象（不指定端口，系统自动分配）
        DatagramSocket ds = new DatagramSocket();
        // 2. 打包礼物：数据、数据长度、目的 IP、目的端口
        String message = "你好，我来了";
        byte[] bytes = message.getBytes();
        DatagramPacket dp = new DatagramPacket(
                bytes,
                bytes.length,
                InetAddress.getByName("127.0.0.1"),
                10086);
        // 3. 快递公司发送包裹
        ds.send(dp);
        // 4. 付钱走人
        ds.close();
    }
}
```

接收端代码：

```java
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        // 1. 找快递公司：创建接收端的 DatagramSocket 对象（必须指定端口，别人才知道往哪发）
        DatagramSocket ds = new DatagramSocket(10086);
        // 2. 接收箱子
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);   // 程序会停在这里，等包裹到了才继续
        // 3. 从箱子里面获取礼物（解析数据包）
        System.out.println(new String(dp.getData(), 0, dp.getLength()));
        // 4. 签收走人
        ds.close();
    }
}
```

细节说明：先启动接收端（运行顺序无所谓，但 UDP 发出去就"不管了"，先有接收端才能真正收到）；`dp.getData()` 取出箱子里的字节数组，`dp.getLength()` 是实际收到的有效长度，转字符串要用这两个配合。

**TCP 协议收发数据**

核心结论：**TCP 协议是面向连接的通信协议**；速度慢、没有大小限制、数据安全；通过**三次握手**建立连接，通过**四次挥手**断开连接。

**三次握手（确保连接建立）**：
1. 客户端向服务器发出连接请求，等待服务器确认；
2. 服务器向客户端返回一个响应，告诉客户端收到了请求；
3. 客户端向服务器再次发出确认信息，连接建立。

**四次挥手（确保连接断开，且数据处理完毕）**：
1. 客户端向服务器发出取消连接请求；
2. 服务器向客户端返回一个响应，表示收到客户端取消请求；
3. 服务器将最后的数据处理完毕；
4. 客户端再次发送确认消息，连接取消。

**TCP 客户端的 4 个步骤**：
1. 创建 Socket 对象指定 ip 和端口——`Socket(String host, int port)`；
2. 通过 socket 对象获取传输数据的流对象——`OutputStream getOutputStream()`、`InputStream getInputStream()`；
3. 通过流对象收发数据；
4. 释放资源。

提示（课件原话）：**这里的流对象不是读写文件中的数据**——输出流：写出数据到服务端；输入流：读取服务端发送过来的数据。

**TCP 服务端的 5 个步骤**：
1. 创建 ServerSocket 对象指定端口——`ServerSocket(int port)`；
2. 响应客户端发送的请求——`Socket accept()`；
3. 通过 socket 对象获取传输数据的流对象；
4. 通过流对象收发数据；
5. 释放资源。

要点整理（课件自问自答）：TCP 协议区分客户端和服务端；客户端创建 Socket 对象，指定 IP 和端口号；服务端创建 ServerSocket 对象，指定端口号；**调用 accept 响应请求，得到 Socket 对象**；两端通过 socket 对象获取输入输出流，收发数据。

客户端代码：

```java
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建 Socket 对象指定 ip 和端口（连接服务端）
        Socket socket = new Socket("127.0.0.1", 10086);
        // 2. 获取传输数据的流对象
        OutputStream os = socket.getOutputStream();
        // 3. 通过流对象收发数据：写出数据到服务端
        os.write("你好，服务端".getBytes());
        // 4. 释放资源
        socket.close();
    }
}
```

服务端代码：

```java
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 1. 创建 ServerSocket 对象指定端口
        ServerSocket ss = new ServerSocket(10086);
        // 2. 响应客户端发送的请求（accept 会阻塞，等到有客户端连接才往下走）
        Socket socket = ss.accept();
        // 3. 获取传输数据的流对象
        InputStream is = socket.getInputStream();
        // 4. 通过流对象收发数据：读取客户端发送过来的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes, 0, len));
        // 5. 释放资源
        socket.close();
        ss.close();
    }
}
```

容易误解的地方：**先启动服务端，再启动客户端**（客户端一启动就去连服务端，连不上会报错）；accept() 和 receive() 都是"阻塞方法"——没等到连接/数据就停在那里等；TCP 通信用的还是 IO 章节的流（getOutputStream/getInputStream），只是流向变成了"设备与设备之间"而不是"程序与文件之间"。

本节收束：网络编程记住"三要素 + 两协议"——三要素（IP 定位设备、端口定位程序、协议定规则）；IP 会看 IPv4/IPv6、127.0.0.1 与私有地址（192.168.）的区别；UDP 像寄快递（DatagramSocket + DatagramPacket，send/receive，快但不可靠），TCP 像打电话（Socket 客户端 / ServerSocket 服务端 + accept，三次握手四次挥手，可靠）；通信两端拿到输入输出流之后，就是 IO 流的读写操作。

### 第二十章：Java高级技术

**枚举**

核心结论：**枚举是 Java 中的一种特殊类型，一般用来做信息的标记和分类**。课件用"四季"打比方：用标记来区分春、夏、秋、冬四个季节——**确保这个类的对象只有四个**（不会多也不会少，也不会出现"春、夏、秋、冬"之外的非法值）。

**枚举定义格式**：

```java
修饰符 enum 枚举类名 {
    枚举项1, 枚举项2, 枚举项3...
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;
}
```

**枚举的特点**（逐条理解）：
1. 每一个枚举项其实就是该枚举的一个对象（SPRING、SUMMER 各是一个 Season 对象）；
2. 通过枚举类名去访问指定的枚举项（`Season.SPRING`）；
3. 所有枚举类都是 **Enum** 的子类；
4. 枚举也是类，可以定义成员变量；
5. 枚举类的第一行上必须是枚举项，最后一个枚举项后的分号是可以省略的；但是如果枚举类有其他的东西（成员变量、方法等），这个分号就不能省略（**建议不要省略**）；
6. 枚举类可以有构造器，但**必须是 private 的，它默认也是 private**（正因如此，外部无法 new 出新的枚举对象，数量才可控）；
7. 枚举类也可以有抽象方法，但是**枚举项必须重写该方法**。

**枚举的使用场景**：用来做信息的标记和分类。例如商品状态——需要变量标记商品预售、需要变量标记商品在售、需要变量标记商品售罄……与其散落一堆魔法数字/字符串，不如"干脆搞个枚举"。好处：**代码可读性更高，入参约束严谨，代码优雅**。

**类加载器**

核心结论：**类加载器负责将类的字节码载入方法区中**。

用法示意：

```java
enum GoodsStatus {
    PRESALE, ON_SALE, SOLD_OUT;   // 预售、在售、售罄
}

GoodsStatus status = GoodsStatus.ON_SALE;   // 通过枚举类名访问枚举项
```

**加载时机：用到就加载**，具体时机包括：
- 创建对象；
- 调用类的静态成员；
- 初始化继承体系（用到了子类，先要加载父类）；
- 使用反射加载类的字节码。

**加载过程：加载 → 链接（验证、准备、解析）→ 初始化**：
1. **加载**：通过包名 + 类名获取这个类，准备用流进行传输；将类加载到内存中；**加载完毕创建一个 class 对象**（例如 Student.class 中记录着成员变量、成员方法等信息）；
2. **链接**：
   - **验证**：验证类是否符合 JVM 规范，安全性检查；
   - **准备**：为 static 变量**分配空间，设置默认值**（如 `String school = null;`）；
   - **解析**：将常量池中的符号引用解析为直接引用；
3. **初始化**：根据程序员程序编码制定的主观计划去初始化类变量和其他资源（如把 `String school = "传智大学";` 真正赋值给静态变量）。

调试 JVM 的小工具（课件介绍）：
- **jps**：jdk 提供的一个查看当前 java 进程的小工具；
- **HSDB（Hotspot Debugger）**：一款内置于 SA 中的 GUI 调试工具，可用于调试 JVM 运行时数据；启动命令：`java -cp ./lib/sa-jdi.jar sun.jvm.hotspot.HSDB`。

**类加载器的分类**：

| 类加载器 | 说明 |
| --- | --- |
| **Bootstrap class loader** | 启动类加载器，虚拟机的内置类加载器，通常表示为 null（C++ 实现，获取到的只能是 null） |
| **Platform class loader** | 平台类加载器，负责加载 JDK 中一些特殊的模块（负责加载 lib\modules 内部的类）。JDK9 之前是 Extension Class Loader（扩展类加载器），负责加载 jre\lib\ext 目录下的类 |
| **Application class loader** | 应用程序类加载器，负责加载自己写的类 |
| **自定义类加载器** | 上级为 Application（目前不做讲解） |

获取类加载器对象的方法：`public ClassLoader getClassLoader()`——获取该类的类加载器对象。

**双亲委派模式**：
- 如果一个类加载器收到了类加载请求，它并不会自己先去加载，而是把这个请求**委托给父类的加载器去执行**；
- 如果父类加载器还存在其父类加载器，则进一步向上委托，依次递归；
- 请求最终将到达顶层的启动类加载器；
- 如果父类加载器可以完成类加载任务，就成功返回；
- 倘若父类加载器无法完成此加载任务，子加载器才会尝试自己去加载——**这就是双亲委派模式**。

流程图解读（课件）：AppClassLoader 开始 → 问自己"是否加载过"（加载过就不再加载、直接返回）→ 没加载过则向上委托 PlatformClassLoader"是否加载过" → 再上升到 BootStrapClassLoader"是否加载过" → 再往上没有父加载器了，则从上往下依次判断"是否可以加载"——**只要有一层能加载就成功返回；所有层都不能加载，最终抛出 ClassNotFoundException**。

双亲委派模式的好处：**避免类的重复加载**。

**反射**

核心结论（课件原话）：反射是**框架技术的灵魂**——"是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；对于任意一个对象，都能够调用它的任意属性和方法。这种动态获取信息以及动态调用对象方法的功能称为 Java 语言的反射机制。"

理解方式（课件图示）：正常写代码是"我告诉程序怎么做"；反射是把**字节码对象**拿在手里"解剖"——字节码对象里记录着构造方法、成员变量、成员方法，反射就是把这些一个个"拆"成构造方法对象、成员变量对象、成员方法对象，然后用它们来创建对象、赋值获取、调用方法。

**反射技术的学习路径**：
1. 获取类的字节码对象；
2. 反射类中的构造方法，随后创建对象；
3. 反射类中的成员变量，完成赋值和获取；
4. 反射类中的成员方法，调用成员方法。

**获取类的字节码对象（三种方式）**：

```java
Class.forName("全类名");   // 方式一：通过全类名（包名+类名），常用于配置文件读取
类名.class                // 方式二：通过类名
对象.getClass();           // 方式三：通过对象
```

**反射类中的构造方法**：

| 方法 | 功能 |
| --- | --- |
| `Constructor<?>[] getConstructors()` | 返回所有公共构造方法对象的数组 |
| `Constructor<?>[] getDeclaredConstructors()` | 返回所有构造方法对象的数组 |
| `Constructor<T> getConstructor(Class<?>... parameterTypes)` | 返回单个公共构造方法对象 |
| `Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)` | 返回单个构造方法对象 |

Constructor 类用于创建对象的方法：

| 方法 | 功能 |
| --- | --- |
| `T newInstance(Object... initargs)` | 根据指定的构造方法创建对象 |
| `setAccessible(boolean flag)` | 设置为 true，表示取消访问检查 |

```java
Class<?> clazz = Class.forName("com.itheima.Student");
Constructor<?> con = clazz.getConstructor(String.class, int.class);   // 有参构造
Object stu = con.newInstance("张三", 23);                             // 创建对象

Constructor<?> con2 = clazz.getDeclaredConstructor();                 // 拿到私有构造
con2.setAccessible(true);                                             // 取消访问检查后才能创建
Object stu2 = con2.newInstance();
```

**反射类中的成员变量**：

| 方法 | 功能 |
| --- | --- |
| `Field[] getFields()` | 返回所有公共成员变量对象的数组 |
| `Field[] getDeclaredFields()` | 返回所有成员变量对象的数组 |
| `Field getField(String name)` | 返回单个公共成员变量对象 |
| `Field getDeclaredField(String name)` | 返回单个成员变量对象 |

Field 类的设置和获取方法：

| 方法 | 功能 |
| --- | --- |
| `void set(Object obj, Object value)` | 赋值 |
| `Object get(Object obj)` | 获取值 |

细节说明（课件图示）：一个 Field 对象代表"Student 类的 name"这个属性，"都归我管"——但操作时要告诉它"你要操作哪个对象"（stu1 还是 stu2），也就是 set/get 的第一个参数就是目标对象。

```java
Class<?> clazz = Class.forName("com.itheima.Student");
Object stu = clazz.getConstructor().newInstance();
Field nameField = clazz.getDeclaredField("name");    // 拿到 name 属性对象
nameField.setAccessible(true);
nameField.set(stu, "张三");                           // 给这个对象的 name 赋值
System.out.println(nameField.get(stu));              // 获取这个对象的 name 值
```

**反射建议：禁止暴力反射操作**——setAccessible(true) 是"强行撬锁"，能不用就不用；正常情况下私有成员应该通过它提供的公共方法去访问。

**反射类中的成员方法**：

| 方法 | 功能 |
| --- | --- |
| `Method[] getMethods()` | 返回所有公共成员方法对象的数组，**包括继承的** |
| `Method[] getDeclaredMethods()` | 返回所有成员方法对象的数组，**不包括继承的** |
| `Method getMethod(String name, Class<?>... parameterTypes)` | 返回单个公共成员方法对象 |
| `Method getDeclaredMethod(String name, Class<?>... parameterTypes)` | 返回单个成员方法对象 |

Method 类用于执行方法的方法：

| 方法 | 功能 |
| --- | --- |
| `Object invoke(Object obj, Object... args)` | 运行方法 |

```java
Class<?> clazz = Class.forName("com.itheima.Student");
Object stu = clazz.getConstructor().newInstance();
Method study = clazz.getMethod("study");   // 无参方法
study.invoke(stu);                          // 运行方法
```

**反射练习一：伪泛型**

需求：请向一个泛型为 Integer 的集合，添加一个 String 字符串。
思路：**Java 中的泛型是假的，只在编译的时候有效**——编译后泛型被"擦除"，所以可以用反射拿到集合的 add 方法，绕过编译期的泛型检查。

```java
ArrayList<Integer> list = new ArrayList<>();
Class<? extends ArrayList> clazz = list.getClass();
Method add = clazz.getDeclaredMethod("add", Object.class);   // 参数类型用 Object，绕过泛型
add.invoke(list, "我是字符串");       // 成功把 String 放进泛型 Integer 的集合
System.out.println(list);             // [我是字符串]
```

**反射练习二：配置文件驱动程序（Spring 思路雏形）**

需求：
- 编写三个任意的 Javabean 类：Student 类、Teacher 类、Worker 类，属性均为 name、age；方法要求：Student 里面写学习 study 和吃饭 eat 的方法（无参无返回）；Teacher 里面写上课 teach 和吃饭 eat 的方法；Worker 里面写工作 work 和睡觉 sleep 的方法；
- 本地新建配置文件 properties，属性：`className=Student类的全类名`、`methodName=study`；
- 在测试类中读取 properties 文件中的两个属性值；
- 利用反射创建学生类的对象，并调用方法；
- **修改配置文件，不修改代码**，运行老师类中的上课方法；**修改配置文件，不修改代码**，运行工人类中的工作方法。

```java
public static void main(String[] args) throws Exception {
    // 1. 读取配置文件
    Properties prop = new Properties();
    prop.load(new FileInputStream("D:\\config.properties"));
    String className = prop.getProperty("className");
    String methodName = prop.getProperty("methodName");

    // 2. 反射创建对象并调用方法
    Class<?> clazz = Class.forName(className);           // 全类名获取字节码对象
    Object obj = clazz.getConstructor().newInstance();   // 反射创建对象
    Method method = clazz.getMethod(methodName);         // 获取要调用的方法
    method.invoke(obj);                                  // 运行方法
}
```

细节说明：这个练习展示了反射的核心价值——**同一套代码，改配置文件就能跑不同的类和方法**（把 className 换成 Teacher、methodName 换成 teach，就变成老师上课），这就是后面框架"配置驱动"思想的雏形。

**注解**

核心结论：**Annotation 表示注解，是 JDK1.5 的新特性**。注解的主要作用：**对程序进行标注**——理解：**注释是给人看的，注解是给虚拟机看的**；通过注解可以给类增加额外的信息，**编译器或 JVM 可以根据注解来完成对应的功能**。

JDK 中常见注解：
- `@Override`：表示方法的重写；
- `@Deprecated`：表示修饰的方法已过时；
- `@SuppressWarnings("all")`：压制警告。

**自定义注解**：自定义注解单独存在意义不大，**一般会跟反射结合起来使用**。

**自定义注解格式**：

```java
public @interface 注解名称 {
    public 属性类型 属性名() default 默认值;
}

public @interface Anno {
    String show() default "show...";
}
```

属性的类型只能是：**基本数据类型、String、Class、注解、枚举、以上类型的一维数组**。

完整示例：

```java
public @interface MyAnno {
    public static final int num1 = 100;                          // 注解里可以定义常量
    public static final String num2 = "abc";
    public static final Class num4 = String.class;

    public abstract String show1() default "show1";              // 各种类型的属性
    public abstract int show2() default 132;
    public abstract MyAnno2 show3() default @MyAnno2;
    public abstract Class show4() default String.class;
    public abstract int[] show5() default {1, 2, 3};
}
```

**自定义注解的使用**：
- 常用位置：类、方法；
- 注意：**在使用注解时，如果注解的属性没有给出默认值，需要手动给出**（如 `@Anno(name="张三")`）；
- 如果数组中只有一个属性值，在使用时 `{}` 是可以省略的（写 `@MyAnno(show5 = 1)` 即可）。

⚠️ 问题：课件定义注解时属性名是 `show`（`public @interface Anno { String show() default "show..."; }`），而使用示例却写成 `@Anno(name="张三")`——属性名对不上，照抄会编译错误（Anno 中并不存在 name 属性）。
修正建议：使用时属性名必须与定义一致；若目的是演示"属性没有默认值必须手动赋值"，定义里应提供没有默认值的属性，如 `String name();`，使用 `@Anno(name="张三")`。

**特殊的属性 value**：如果只有一个属性名字为 **value** 且没有赋值（没有默认值），使用时**直接给出值，不需要写属性名**——例如 `@SuppressWarnings("all")` 就是 value 的特殊写法。

**自定义测试注解案例**

需求：自定义一个注解 @Test，用于指定类的方法上；如果类中的某个方法上使用了该注解，就执行该方法。

```java
@Target(ElementType.METHOD)            // 元注解：只能用在方法上
@Retention(RetentionPolicy.RUNTIME)    // 元注解：保留到运行阶段（反射才能读到）
public @interface Test {
}
```

```java
public class TestDemo {
    @Test
    public void method1() {
        System.out.println("method1 执行了");
    }

    public void method2() {   // 没有 @Test，不执行
        System.out.println("method2 执行了");
    }
}
```

```java
// 测试类：遍历所有方法，带 @Test 注解的就运行它
public static void main(String[] args) throws Exception {
    Class<?> clazz = TestDemo.class;
    Object obj = clazz.getConstructor().newInstance();
    Method[] methods = clazz.getDeclaredMethods();
    for (Method method : methods) {
        if (method.isAnnotationPresent(Test.class)) {   // 判断方法上有没有 @Test 注解
            method.invoke(obj);
        }
    }
}
```

**元注解**：**元注解就是用在注解上的注解**。

| 元注解名 | 说明 |
| --- | --- |
| `@Target` | 指定了注解能在哪里使用 |
| `@Retention` | 可以理解为保留时间（生命周期） |

**@Target**：用来标识注解使用的位置，如果没有使用该注解标识，则自定义的注解可以使用在任意位置。可使用的值定义在 **ElementType** 枚举类中，常用值：
- TYPE：类，接口；
- FIELD：成员变量；
- METHOD：成员方法；
- PARAMETER：方法参数；
- CONSTRUCTOR：构造方法；
- LOCAL_VARIABLE：局部变量。

**@Retention**：用来标识注解的生命周期（有效范围）。可使用的值定义在 **RetentionPolicy** 枚举类中，常用值：
- **SOURCE**：注解只作用在源码阶段，生成的字节码文件中不存在；
- **CLASS**：注解作用在源码阶段、字节码文件阶段，运行阶段不存在——**默认值**；
- **RUNTIME**：注解作用在源码阶段、字节码文件阶段、运行阶段（反射要读取注解，必须用 RUNTIME）。

**动态代理**

核心结论：**动态代理是对象的另外一种创建方式，这种方式可以在不修改源码的情况下，增强方法**。它和普通创建对象（`Dog d = new Dog();`）、反射创建对象（`Dog.class.getConstructor().newInstance();`）、多态（`Animal a = new Dog();`）一样，都是"得到一个对象"的手段；典型应用场景：比如计算某个方法的耗时——原方法代码一行不改，套一层代理就能统计。

**代理的理解（房产中介比喻）**：业主有"售卖房产、房屋出租"的功能；中介作为**代理对象对功能增强**（加价、加服务），真正的**被代理对象处理执行原有功能**。就像代驾、喂养宠物这些"帮忙办事"的角色。

**静态代理代码**：

```java
public interface Sale {
    void sale(double money);
    void hire(double money);
}

public class Owner implements Sale {          // 被代理对象：业主
    public void sale(double money) {
        System.out.println("售卖房产" + money + "元");
    }
    public void hire(double money) {
        System.out.println("出租房产" + money + "元");
    }
}

public class SaleImpl implements Sale {        // 代理对象：中介
    private Owner owner;

    public SaleImpl(Owner owner) {
        this.owner = owner;
    }

    @Override
    public void sale(double money) {
        money += 20000;                        // 增强：中介加价
        owner.sale(money);                     // 调用被代理对象的原有功能
    }

    @Override
    public void hire(double money) {
        money += 1000;
        owner.hire(money);
    }
}

// 使用
Owner owner = new Owner();
Sale sale = new SaleImpl(owner);
sale.sale(1000000);
sale.hire(3000);
```

静态代理的问题：**为每个目标类都要手写一个代理类**（再来一个 Owner2，就要再写一个 SaleImpl2），代码重复、麻烦。

**动态代理**：**在运行时动态生成代理类，无需手动为每个目标类编写代理类**。

java.lang.reflect.**Proxy** 类：提供了使用动态代理方式创建对象的 API——

```java
static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
```

参数介绍：
- 参数一：用于指定用哪个类加载器，去加载生成的实现类；
- 参数二：指定接口，这些接口用于指定生成的实现类中有什么，也就是有哪些方法；
- 参数三：用来指定生成的实现类中不同方法的实现方案。

```java
public static void main(String[] args) {
    Owner owner = new Owner();
    // 动态生成代理对象
    Sale sale = (Sale) Proxy.newProxyInstance(
            owner.getClass().getClassLoader(),    // 参数一：类加载器
            owner.getClass().getInterfaces(),     // 参数二：代理要实现的接口
            new InvocationHandler() {             // 参数三：方法的实现方案
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    double money = (double) args[0];
                    money += 20000;                       // 增强：加价
                    return method.invoke(owner, money);   // 调用被代理对象的原有功能
                }
            });
    sale.sale(1000000);   // 走的其实是代理对象增强后的逻辑
}
```

容易误解的地方：动态代理要求目标类**必须实现接口**（参数二就是接口数组，JDK 动态代理是通过"实现相同接口"生成代理类的）；代理对象调用的任何方法都会进到 invoke 里，方法名、参数都在 method 和 args 中，增强了哪个方法、怎么增强由参数三決定。

本节收束：Java 高级技术一章围绕"让程序更灵活"——枚举把"标记和分类"约束成有限几个对象；类加载器解释了"类是怎么进内存的"（加载-链接-初始化、三类加载器、双亲委派）；反射是"解剖字节码、动态操作任意类"（三方式获取字节码、Constructor/Field/Method 三件套、泛型擦除与配置驱动练习）；注解是"给 JVM 看的标注"（@Target/@Retention 元注解 + 反射读取）；动态代理是"不改源码增强方法"（Proxy.newProxyInstance 三参数、InvocationHandler）。这一章是后面框架学习的理论地基。

## 第三阶段：AI赋能Web开发

### 第一章：Web开发介绍

**什么是Web**

核心结论：Web 是全球广域网，也称为万维网（www，World Wide Web），是**能够通过浏览器访问的网站**。

关键逻辑：Web 网站不是一个程序，而是协作运行的一组角色——浏览器、前端服务器、后端服务器、数据库服务器。学习 Web 开发，既要理解这套协作流程（前端发请求 → 后端处理 → 数据库存取 → 响应回到浏览器），也要分别掌握前端和后端的开发技术。

**Web网站的工作流程**

核心结论：浏览器访问网站时，请求依次经过前端服务器、后端服务器、数据库服务器，再按原路把响应和数据送回浏览器。

执行步骤（以"访问商品列表"为例）：

1. 浏览器向**前端服务器**发请求，前端服务器返回前端程序（前端代码 HTML/CSS/JS）；
2. 浏览器解析渲染页面后，页面里的前端程序再向**后端服务器**发送请求（Java 程序接收）；
3. 后端服务器向**数据库服务器**发起请求取出数据；
4. 数据沿"数据库 → 后端 → 前端 → 浏览器"原路返回，浏览器把数据渲染进页面。

课件中前端代码向后端发请求的示例：

```html
<el-table-column prop="brandName" label="品牌名称">
<el-table-column prop="companyName" label="企业名称">
<el-table-column prop="status" label="当前状态">
```

```js
selectAll() {
    axios({
        method:"get",
        url:"http://localhost:8080/item/selectAll"
    }).then(resp => {
        this.tableData = resp.data;
    })
}
```

- 请求地址 `http://localhost:8080/item/selectAll` 是后端服务器对外提供的接口地址；
- `el-table-column` 是前端表格组件（ElementPlus）的列标签，`prop` 指定该列绑定数据的字段名；
- 前端通过 axios 调用接口拿到数据（`resp.data`），再赋值给 `tableData` 渲染表格。

**Web网站的开发模式**

核心结论：Web 网站有两种开发模式——**前后端分离开发**和**混合开发**。

- **前后端分离开发**（目前主流）：前端程序（前端工程师开发）与 Java 程序（后端工程师开发）分开开发、分开部署，分别运行在前端服务器和后端服务器上，通过接口交互；
- **混合开发**：页面代码里直接含数据，由"前端程序 + Java 程序"一体处理（后端服务器），浏览器请求到的是拼好的页面。

**课程安排**

- **后端Web开发（12天）**：Web基础（Maven、HTTP...）、Web实战（IOC、DI、MySQL...）、Web原理（SpringBoot原理）；
- **前端Web开发-基础（2天）**：HTML、CSS、JavaScript、Vue、Ajax；
- **前端Web开发-案例（4天）**：Vue工程化、ElementPlus、案例-Vue3项目；
- **项目部署（2天）**：Linux、Docker。

**容易误解的地方**：浏览器地址栏输入网站地址后"看到页面"只是第一步——页面上的数据（如商品列表）往往是页面加载后前端程序再发请求、经过后端和数据库才取回来的，这也是"前后端分离"下页面能与数据分开发布的原因。

本节收束：Web = 浏览器访问的网站；一次访问的完整链路是"浏览器 → 前端服务器 → 后端服务器 → 数据库服务器"再原路返回；开发模式以"前后端分离"为主；后续课程按"后端 Web 开发、前端 Web 基础、前端 Web 案例、项目部署"四块推进。

<!--CONTINUE-->
