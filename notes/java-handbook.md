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

### 第二章：HTML与CSS

**初始Web前端**

核心结论：我们看到的网页由文字、图片、视频、音频、超链接等组成；其背后的本质是**程序员写的前端代码**，通过浏览器解析渲染后转换成用户眼中的网页。

- 浏览器对代码进行解析渲染的部分，称为**浏览器内核**；
- 提示：不同浏览器内核不同，对于相同的前端代码解析的效果可能会存在差异。

**Web标准**

核心结论：Web标准也称网页标准，由一系列的标准组成，大部分由 W3C（World Wide Web Consortium，万维网联盟）负责制定。三个组成部分各司其职：

| 标准 | 负责内容 | 说明 |
| --- | --- | --- |
| HTML | 网页的**结构** | 页面元素和内容 |
| CSS | 网页的**表现** | 页面元素的外观、位置等页面样式，如：颜色、大小等 |
| JavaScript | 网页的**行为** | 交互效果 |

Web 前端课程安排：**Web前端基础**为 HTML+CSS+JS、Vue3+Ajax（2天）；**Web前端实战**为 Vue工程化+ElementPlus、Vue3案例（4天）。

**什么是HTML**

核心结论：HTML（HyperText Markup Language）即**超文本标记语言**，负责网页的结构。

- **超文本**：超越了文本的限制，比普通文本更强大。除了文字信息，还可以定义图片、音频、视频等内容；
- **标记语言**：由标签 `<标签名>` 构成的语言；
- HTML 标签都是预定义好的。例如：使用 `<h1>` 展示标题，使用 `<img>` 展示图片，使用 `<video>` 展示视频；
- HTML 代码直接在浏览器中运行，HTML 标签由浏览器解析。

标签的组成结构：

```html
<h1>HTML入门程序</h1>
<img src="img/1.png">
```

- `<h1>` 是开始标签，`</h1>` 是结束标签，中间的"HTML入门程序"是内容；
- `<img>` 标签通过 `src` 属性指定图片来源 `img/1.png`（属性写在开始标签中）。

**什么是CSS**

核心结论：CSS（Cascading Style Sheet）即**层叠样式表**，用于控制页面的样式（表现）。

同一个 `<h1>` 标题，加上 CSS 样式后文字变红：

```html
<h1>HTML入门程序</h1>
<h1 style="color:red;">HTML入门程序</h1>
```

**HTML快速入门**

执行步骤：

1. 新建文本文件，后缀名改为 `.html`；
2. 编写 HTML 的基本骨架，定义标题；
3. 在 `<body>` 中填写内容。

```html
<html>
    <head>
        <title>HTML快速入门</title>
    </head>
    <body>
        <h1>Hello HTML</h1>
        <img src="img/1.png">
    </body>
</html>
```

- **网页头部 `<head>`**：用来存放给浏览器看的信息，如：CSS 样式；`<title>` 是网页标题；
- **网页主体 `<body>`**：用来存放给用户看的信息，如：文字、图片、视频。

HTML 标签特点：

- html 标签**不区分大小写**，建议小写；
- html 标签的属性值使用**单引号/双引号都可以**；
- html 语法结构松散，但是建议规范书写。

**前端开发工具**

核心结论：前端开发常用 **Visual Studio Code（简称 VS Code）**——Microsoft 于 2015 年 4 月发布的一款代码编辑器。

- VS Code 对前端代码有非常强大的支持，同时也支持其他编程语言（例如：C++、Java、Python、PHP、Go 等）；
- VS Code 提供了非常强大的插件库，大大提高了开发效率；
- 官网：https://code.visualstudio.com

安装使用注意：

- 不仅要安装软件，还得安装插件；
- 安装在一个**没有中文、不带空格**的目录下；
- 由于安装了 IDEA 快捷键映射插件，VSCode 快捷键与 IDEA **一致**。

**央视新闻案例——标题制作**

核心结论：html 页面在渲染展示的时候，是**从上往下逐行解析展示**的。所以，编写页面的时候，根据页面的布局，从上往下编写。

标题部分用到的标签：

- **标题标签**：`<h1>` - `<h6>`；
- **超链接标签**：`<a href="" target="">...</a>`
  - `href`：指定资源访问的 url；
  - `target`：指定在何处打开资源链接；`_self`：默认值，在当前页面打开；`_blank`：在空白页面打开。

```html
<body>
    <!-- 定义一个标题，标题内容为：推进长江十年禁渔 谱写长江大保护新篇章 -->
    <h1>推进长江十年禁渔 谱写长江大保护新篇章</h1>
    <!-- 定义一个超链接，里面显示 央视网 -->
    <a href="https://www.cctv.com/">央视网</a> 2024年05月15日 20:07
</body>
```

**央视新闻案例——标题样式**

核心结论：CSS 有三种引入方式——行内样式、内部样式、外部样式，区别在于"样式写在哪里"。

| 引入方式 | 写法 | 说明 |
| --- | --- | --- |
| 行内样式 | 写在标签的 `style` 属性中 | 配合 JavaScript 使用 |
| 内部样式 | 写在 `<style>` 标签中 | 可以写在页面任何位置，但通常约定写在 head 标签中 |
| 外部样式 | 写在一个单独的 `.css` 文件中 | 需要通过 link 标签在网页中引入 |

```html
<!-- 行内样式 -->
<span style="color: gray;">2024年05月15日 20:07</span>

<!-- 内部样式：写在 style 标签中 -->
<style>
    span {
        color: gray;
    }
</style>

<!-- 外部样式：news.css 文件中写 span { color: gray; } -->
<link rel="stylesheet" href="css/news.css">
```

颜色表示形式：

| 表示方式 | 属性值 | 说明 | 示例 |
| --- | --- | --- | --- |
| 关键字 | 颜色英文单词 | red、green、blue... | red、green、blue... |
| rgb表示法 | rgb(r,g,b) | 红绿蓝三原色，取值：0-255 | rgb(0,0,0)、rgb(255,0,0) |
| rgba表示法 | rgba(r,g,b,a) | 红绿蓝三原色，a表示透明度，取值：0-1 | rgba(0,0,0,0.3)、rgba(255,0,0,0.5) |
| 十六进制表示法 | #rrggbb | #开头，将数字转换成十六进制表示 | #000000、#ff0000，简写：#000、#f00 |

课件中的 `color` 属性总结：`color: 设置文本内容的颜色`。

**CSS选择器**

核心结论：CSS 选择器是用来**选取需要设置样式的元素（标签）**的；先选中标签，再在大括号中写样式。

| 选择器 | 写法 | 示例 | 示例说明 |
| --- | --- | --- | --- |
| 元素选择器 | 元素名称 {...} | h1 {...} | 选择页面上所有的 `<h1>` 标签 |
| 类选择器 | .class属性值 {...} | .cls {...} | 选择页面上所有 class 属性为 cls 的标签 |
| id选择器 | #id属性值 {...} | #hid {...} | 选择页面上 id 属性为 hid 的标签 |
| 分组选择器 | 选择器1,选择器2 {...} | h1,h2 {...} | 选择页面上所有的 `<h1>` 和 `<h2>` 标签 |
| 属性选择器 | 元素名称[属性] {...} | input[type] {...} | 选择页面上有 type 属性的 `<input>` 标签 |
| 属性选择器 | 元素名称[属性名="值"] {...} | input[type="text"] {...} | 选择页面上 type 属性为 text 的 `<input>` 标签 |
| 后代选择器 | 元素1 元素2 {...} | form input {...} | 选择 `<form>` 标签内的所有 `<input>` 标签 |

最为常见的三类选择器与优先级：**id 选择器 -> 类选择器 -> 元素选择器**（id 最"专一"，优先级最高）。

课件中标题时间样式的最终写法（把颜色从 gray 换成十六进制）：

```html
<style>
    span {
        color: #b2b2b2;
    }
</style>
```

**央视新闻案例——正文排版与样式**

资源路径写法（引用图片、视频、CSS 文件时使用）：

- **绝对路径**：绝对磁盘路径（`D:/xxx.jpg`）、绝对网络路径（`https://xxx.jpg`）；
- **相对路径**：当前目录 `./`（可以省略）、上一级目录 `../`。

正文相关标签：

| 标签 | 作用 | 属性/说明 |
| --- | --- | --- |
| `<video>` | 视频标签 | src：指定视频的 url（绝对路径/相对路径）；controls：是否显示播放控件；width：宽度（像素/相对于父元素百分比）；height：高度（像素/相对于父元素百分比） |
| `<img>` | 图片标签 | src、width、height |
| `<p>` | 段落标签 | — |

文本格式标签（两两一组，语义化标签带"强调"含义）：

| 标签 | 作用 | 属性/说明 |
| --- | --- | --- |
| `<b>` / `<strong>` | 加粗 | `<strong>` 具有强调语义 |
| `<u>` / `<ins>` | 下划线 | `<ins>` 具有强调语义 |
| `<i>` / `<em>` | 倾斜 | `<em>` 具有强调语义 |
| `<s>` / `<del>` | 删除线 | `<del>` 具有强调语义 |

字符实体（某些符号会被浏览器当作标签解析，需要用实体写法）：

| 字符实体 | 说明 |
| --- | --- |
| `&nbsp;` | 空格 |
| `&lt;` | < |
| `&gt;` | > |

CSS 属性：

- `line-height`：设置行高；
- `text-indent`：首行缩进。

页面布局需求（Prompt 案例）："你是一名前端开发工程师，如何设置 html 网页的整体页面占版面的 70%，并居中显示。"

**盒子模型**

核心结论：页面中所有的元素（标签），都可以看做是一个**盒子**，由盒子将页面中的元素包含在一个矩形区域内，通过盒子的视角更方便地进行页面布局。

盒子模型组成：**内容区域（content）、内边距区域（padding）、边框区域（border）、外边距区域（margin）**。

布局标签：网页开发中，会使用 `div` 和 `span` 这两个没有语义的布局标签。

| 标签 | 特点 |
| --- | --- |
| `<div>` | 一行只显示一个（独占一行）；宽度默认是父元素的宽度，高度默认由内容撑开；可以设置宽高（width、height） |
| `<span>` | 一行可以显示多个；宽度和高度默认由内容撑开；不可以设置宽高（width、height） |

盒子模型相关 CSS 写法（padding、border、margin 的简写规律）：

```css
/* 上下 左右 */
div {
    width: 200px;
    height: 100px;
    background-color: #05a5d2;
    padding: 20px 20px;
    border: 20px solid #6bd5d7;
    margin: 30px 30px;
}

/* 上 右 下 左 */
div {
    width: 200px;
    height: 100px;
    background-color: #05a5d2;
    padding: 20px 20px 20px 20px;
    border: 20px solid #6bd5d7;
    margin: 30px 30px 30px 30px;
}

/* 四个方向相同 */
div {
    width: 200px;
    height: 100px;
    background-color: #05a5d2;
    padding: 20px;
    border: 20px solid #6bd5d7;
    margin: 30px;
}
```

注意事项：如果只需要设置某一个方位的边框、内边距、外边距，可以在属性名后加上 `-位置`，如：`padding-top`、`padding-left`、`padding-right` …

**员工管理页面案例（综合案例）**

页面原型：指在应用程序开发初期，由产品经理制作的一个早期项目模型，它用于展示页面的基本布局、功能和交互设计。通常用来帮助设计师、开发者等更好地理解和讨论最终产品的外观和行为。

参照页面原型，员工管理页面整体由 4 个部分组成：顶部导航栏、搜索表单区域、表格数据展示区域、底部版权区域。

**（1）顶部导航栏——flex布局**

flex 是 flexible Box 的缩写，意为"弹性布局"，是一种**一维的布局模型**。flex 布局可以为元素之间提供强大的空间分布和对齐能力。通过给**父容器**添加 flex 的相关属性，来控制子元素的位置和排列方式。

| 属性 | 取值 | 含义 |
| --- | --- | --- |
| display | flex | 使用 flex 布局 |
| flex-direction（设置主轴） | row | 主轴方向为 x 轴，水平向右（默认） |
| flex-direction | column | 主轴方向为 y 轴，垂直向下 |
| justify-content（子元素在主轴上的对齐方式） | flex-start | 从头开始排列 |
| justify-content | flex-end | 从尾部开始排列 |
| justify-content | center | 在主轴居中对齐 |
| justify-content | space-around | 平分剩余空间 |
| justify-content | space-between | 先两边贴边，再平分剩余空间 |

Prompt 案例："你是一名前端开发工程师，帮我生成一个HTML页面，页面整体有4个部分组成，先来实现第一个部分：1. 顶栏。内容：包含左侧的标题'Tlias智能学习辅助系统'，字体需加大加粗，以突出显示；右侧则放置'退出登录'文字链接。布局：确保标题与退出登录文本位于同一行内，分别左对齐与右对齐。"

**（2）搜索表单区域——表单标签**

- **表单**：在网页中主要负责数据采集功能，如注册、登录等数据采集；
- **表单项**：表单项是组成表单的基本元素，允许用户输入或选择数据，并将这些数据提交给服务器。

| 标签 | 说明 |
| --- | --- |
| `<form>` | 表单标签 |
| `<input>` | 定义表单项，通过 type 属性控制输入形式（text/password/...） |
| `<button>` | 按钮，submit、reset、button |
| `<select>` | 定义下拉列表 |
| `<textarea>` | 定义文本域 |

表单属性：

- `action`：规定当提交表单时向何处发送表单数据，URL；
- `method`：规定用于发送表单数据的方式。GET、POST：
  - get：表单数据拼接在 url 后面，`?username=java&age=18`，大小有限制；
  - post：表单数据在请求体中携带，大小没有限制。

Prompt 案例："再继续帮我生成第二个部分: 2. 搜索表单区域。组成：包括三个输入控件和两个操作按钮。输入控件具体为：姓名（文本输入框）、性别（下拉选择，选项包括 男/女，默认为空）、职位（下拉选择，选项包括班主任、讲师、学工主管、教研主管、咨询师，默认为空）。按钮：'查询'与'清空'按钮，用于提交表单或重置表单项。布局：所有表单项及按钮需水平排列于一行，确保美观大气。"

**（3）表格数据展示区域——表格标签**

| 标签 | 描述 |
| --- | --- |
| `<table>` | 定义表格整体 |
| `<thead>` | 用于定义表格头部(可选) |
| `<tbody>` | 定义表格中的主体部分(可选) |
| `<tr>` | 表格的行，可以包裹多个 `<td>` |
| `<td>` | 表格单元格(普通)，可以包裹内容；如果是表头单元格，可以替换为 `<th>` |

Prompt 案例："再继续帮我生成第三个部分: 3. 表格展示区。表格结构：展示列包括姓名、性别（显示男/女）、头像（小图标展示）、所属部门、职位（显示班主任/讲师/学工主管/教研主管/咨询师）、入职日期、最后操作时间、操作（里包含两个按钮 编辑 与 删除）。数据模拟：基于《笑傲江湖》小说人物生成10条虚拟数据，每条数据应包含上述所有列的信息，以体现实际应用场景。样式：可适当调整表格样式，确保美观大气。"

**（4）页脚版权区域**

Prompt 案例："再继续帮我生成第四个部分: 4. 页脚版权区域。内容：第一行显示公司全称'江苏传智播客教育科技股份有限公司'；第二行展示版权信息，'版权所有 Copyright 2006-2024 All Rights Reserved'。设计：该区域应具有灰色背景，字体颜色为白色，居中对齐，以营造专业且统一的视觉效果。"

**容易误解的地方**：`<div>` 可以设置宽高、`<span>` 不可以设置宽高，这是由它们默认的 CSS 显示方式决定的；表格的 `<thead>`、`<tbody>` 都是可选的，不分表头表体直接写 `<tr>` 也能显示，但结构中带上它们更清晰。另外表单 GET/POST 的区分不要只记"大小限制"：GET 把参数拼在 URL 上（可见），POST 放在请求体里（不可见）。

本节收束：HTML 管结构（标题/超链接/图片/视频/段落/表格/表单项），CSS 管表现（三种引入方式、颜色表示、选择器、盒子模型、flex 布局）；央视新闻案例串起了标题、正文、布局的完整制作流程，员工管理案例则预演了后面 Tlias 项目页面的四大区域。

### 第三章：JavaScript

**什么是JavaScript**

核心结论：JavaScript（简称：JS）是一门**跨平台、面向对象的脚本语言**，用来控制网页行为，实现页面的交互效果。JavaScript 和 Java 是完全不同的语言，不论是概念还是设计，但是基础语法类似。

回忆 Web 标准三兄弟的分工：HTML 负责网页的结构、CSS 负责网页的表现、JavaScript 负责网页的**行为**（交互效果）。

JS 的组成：

- **ECMAScript**：规定了JS基础语法核心知识，包括变量、数据类型、流程控制、函数、对象等；
- **BOM**（浏览器对象模型）：用于操作浏览器本身，如：页面弹窗、地址栏操作、关闭窗口等；
- **DOM**（文档对象模型）：用于操作HTML文档，如：改变标签内的内容、改变标签内字体样式等。

ECMA 国际（前身为欧洲计算机制造商协会）制定了标准化的脚本程序设计语言 ECMAScript，这种语言得到广泛应用；JavaScript 是遵守 ECMAScript 标准的（ES2024 是最新版本）。

**JS引入方式**

- **内部脚本**：将 JS 代码定义在 HTML 页面中（`<script></script>` 标签之间）
  - JavaScript 代码必须位于 `<script></script>` 标签之间；
  - 在 HTML 文档中，可以在任意地方，放置任意数量的 `<script>`；
  - 一般会把脚本置于 `<body>` 元素的底部，可改善显示速度。
- **外部脚本**：将 JS 代码定义在外部 JS 文件中，然后引入到 HTML 页面中（`<script src="js/demo.js"></script>`）

```html
<body>
    <!-- 页面内容 -->
    <script>
        alert('Hello World');
    </script>
</body>
```

```js
// demo.js 文件内容
alert('Hello World');
```

JS 书写规范：结束符——每行结尾以分号结尾，结尾分号可有可无。

**变量与常量**

核心结论：JS 中用 `let` 关键字声明变量，用 `const` 关键字声明常量。JS 是**弱类型语言**，变量可以存放不同类型的值。

变量名命名规则：

- 只能用字母、数字、下划线（_）、美元符号（$）组成，且数字不能开头；
- 变量名严格区分大小写，如 name 和 Name 是不同的变量；
- 不能使用关键字，如：let、var、if、for 等。

```html
<script>
    //变量
    let a = 20;
    a = "Hello";
    alert(a);   // 弱类型：同一个变量可以先存数字，再存字符串

    //常量
    const PI = 3.14;
    console.log(PI);
    // PI = 3.5;   // 常量一旦声明，值不能改变（不可以重新赋值）
</script>
```

注意：在早期的 js 中，声明变量还可以使用 `var`，但是并不严谨（不推荐）。

**输出语句**

| 语句 | 效果 |
| --- | --- |
| `window.alert()` | 弹出警告框（使用频次较高） |
| `console.log()` | 写入浏览器控制台（使用频次较高） |
| `document.write()` | 向 HTML 的 body 内输出内容 |

**数据类型**

JavaScript 的数据类型分为：基本数据类型和引用数据类型（对象）。基本数据类型：

- **number**：数字（整数、小数、NaN(Not a Number)）；
- **boolean**：布尔，true、false；
- **null**：对象为空。JavaScript 是大小写敏感的，因此 null、Null、NULL 是完全不同的；
- **undefined**：当声明的变量未初始化时，该变量的默认值是 undefined；
- **string**：字符串，单引号、双引号、反引号皆可，推荐使用单引号。

使用 `typeof` 运算符可以获取数据类型：

```html
<script>
    let a = 20;
    alert(typeof a);    // 获取数据类型：number
</script>
```

**模板字符串**（字符串拼接的优雅写法）：

- 语法：用反引号 `` ` ` `` 包裹（反引号在英文输入模式下按键盘的 tab 键上方波浪线 ~ 那个键）；
- 内容拼接变量时，使用 `${}` 包住变量。

```html
<script>
    let name = 'Tom';
    let age = 18;
    // 旧写法：用 + 号拼接
    console.log('大家好, 我是新入职的' + name + ', 今年' + age + '岁了, 请多多关照');
    // 模板字符串写法
    console.log(`大家好, 我是新入职的${name}, 今年${age}岁了, 请多多关照`);
</script>
```

**函数**

介绍：函数（function）是被设计用来执行特定任务的代码块，方便程序的封装复用。

定义与调用：

```js
// 定义：通过 function 关键字
function functionName(参数1, 参数2 ...){
    // 要执行的代码
}

function add(a, b){
    return a + b;
}

// 调用：函数名称(实际参数列表)
let result = add(10,20);
alert(result);
```

注意：由于 JS 是弱类型语言，形参、返回值都不需要指定类型。在调用函数时，实参个数与形参个数可以不一致，但是建议一致。

**匿名函数**：一种没有名称的函数，可以通过两种方式定义——函数表达式 和 箭头函数。

```js
// 函数表达式
let add = function(a, b){
    return a + b;
}

// 箭头函数
let add = (a, b) => {
    return a + b;
}
```

匿名函数定义后，可以通过变量名直接调用：`let result = add(10,20); alert(result);`。

**自定义对象**

定义格式：

```js
let 对象名 = {
    属性名1: 属性值1,
    属性名2: 属性值2,
    属性名3: 属性值3,
    方法名: function (形参列表) {}
}
```

两种写法（方法也可以简写）：

```js
let user = {
    name: 'Tom',
    age: 20,
    gender: '男',
    sing: function () {
        alert('悠悠的唱着最炫的民族风')
    }
}

// 方法简写形式
let user = {
    name: 'Tom',
    age: 20,
    gender: '男',
    sing() {
        alert('悠悠的唱着最炫的民族风')
    }
}
```

调用格式：

```js
console.log(user.name);   // 对象名.属性名
user.sing();              // 对象名.方法名()
```

**JSON**

核心结论：JSON（JavaScript Object Notation，JavaScript 对象标记法）是 JS 对象标记法书写的**文本**。由于其语法简单，层次结构鲜明，现多用于作为数据载体，在网络中进行数据传输（请求/响应之间来回传递的就是 JSON）。

JS 对象与 JSON 文本的区别：

```js
// JS对象：key 可以不加引号
{
    name: "Tom",
    age: 20,
    gender: "男"
}
```

```json
// json文本：所有的key必须使用双引号引起来
{
    "name": "Tom",
    "age": 20,
    "gender": "男"
}
```

JSON 对象的两个方法：

| 方法 | 作用 |
| --- | --- |
| `JSON.parse(..)` | 将 json 字符串转为 js 对象 |
| `JSON.stringify(..)` | 将 js 对象转为 json 字符串 |

**DOM**

核心结论：DOM（Document Object Model，文档对象模型）将标记语言的各个组成部分封装为对应的对象，JavaScript 通过 DOM 就能够对 HTML 进行操作。

DOM 把文档解析成一棵"DOM树"，各部分封装为对象：

- **Document**：整个文档对象；
- **Element**：元素对象；
- **Attribute**：属性对象；
- **Text**：文本对象；
- **Comment**：注释对象。

JavaScript 通过 DOM，能够对 HTML 进行操作：

- 改变 HTML 元素的内容；
- 改变 HTML 元素的样式（CSS）；
- 对 HTML DOM 事件作出反应；
- 添加和删除 HTML 元素。

DOM 操作核心思想：将网页中所有的元素当做对象来处理（标签的所有属性在该对象上都可以找到）。操作步骤：

1. 获取要操作的 DOM 元素对象；
2. 操作 DOM 对象的属性或方法（查文档或AI）。

获取 DOM 对象（根据 CSS 选择器）：

| 方式 | 说明 |
| --- | --- |
| `document.querySelector('选择器')` | 获取匹配到的**第一个**元素 |
| `document.querySelectorAll('选择器')` | 获取匹配到的**所有**元素（得到的是一个 NodeList 节点集合，是一个伪数组——有长度、有索引的数组） |

其他方式（了解）：`document.getElementById('id')`、`document.getElementsByTagName('div')`、`document.getElementsByClassName('cls')`。

**JS事件监听**

核心结论：事件是 HTML 事件是发生在 HTML 元素上的"事情"，比如：按钮被点击、鼠标移动到元素上、按下键盘按键。事件监听就是 JavaScript 在事件触发时，立即调用一个函数做出响应（也称为事件绑定或注册事件）。

语法：

```js
事件源.addEventListener('事件类型', 事件触发执行的函数);
```

事件监听三要素：

1. **事件源**：哪个 dom 元素触发了事件，要获取 dom 元素；
2. **事件类型**：用什么方式触发，比如：鼠标单击 click；
3. **事件触发执行的函数**：要做什么事。

早期版本写法（了解）：`事件源.on事件 = function() { ... }`。区别：on 方式会被覆盖，addEventListener 方式可以绑定多次，拥有更多特性，推荐使用。

```html
<input id="btn" type="button" value="点我一下试试2">

<!-- 早期 on 写法（了解） -->
<script>
document.querySelector('#btn').onclick = function () {
    alert('试试就试试');
}
</script>

<!-- addEventListener 写法（推荐） -->
<script>
document.querySelector('#btn').addEventListener('click',()=>{
    alert('试试就试试');
})
</script>
```

常见事件分类：

| 分类 | 事件 |
| --- | --- |
| 鼠标事件 | click：鼠标点击；mouseenter：鼠标移入；mouseleave：鼠标移出 |
| 键盘事件 | keydown：键盘按下触发；keyup：键盘抬起触发 |
| 焦点事件 | focus：获得焦点触发；blur：失去焦点触发 |
| 表单事件 | input：用户输入时触发；submit：表单提交时触发 |

**JS程序优化（模块化）**

问题引入（复用?? 维护??）：多个页面要反复写同样的 JS 会难以复用、难以维护——解决办法是把可复用的代码抽成模块文件。

事件监听示例文件 `js/eventDemo.js`：

```js
//click: 鼠标点击事件
document.querySelector('#b2').addEventListener('click', () => {
    console.log("我被点击了...");
})

//mouseenter: 鼠标移入
document.querySelector('#last').addEventListener('mouseenter', () => {
    console.log("鼠标移入了...");
})

//mouseleave: 鼠标移出
document.querySelector('#last').addEventListener('mouseleave', () => {
    console.log("鼠标移出了...");
})
```

把公共函数抽到 `js/utils.js` 并使用模块化（export、import）：

```js
// js/utils.js
export function printLog(msg){
    console.log(msg);
}
```

```html
<!-- xxxx.html 中引入模块化脚本 -->
<script src="./js/eventDemo.js" type="module"></script>
```

**案例——表格隔行换色与鼠标移入移出**

- 隔行换色需求：通过 js 实现表格数据行的隔行换色效果，奇数行背景色为 `#f2e2e2`，偶数行背景色为 `#e6f7ff`（JS新语法实现）；
- 鼠标移入移出需求：实现鼠标移入数据行时，背景色改为 `#f2e2e2`，鼠标移出时，再将背景色改为白色。

**容易误解的地方**：`querySelector` 只返回**第一个**匹配元素（想操作所有同名元素要用 `querySelectorAll`）；`null` 与 `undefined` 是两个不同的值（null 表示对象为空，undefined 表示"声明了但还没初始化"）；JSON 的 key 必须用**双引号**，这不是"可有可无的美化"。事件绑定时 on 方式重复绑定会覆盖前面的处理函数，addEventListener 不会。

本节收束：JS 核心语法围绕"声明（let/const）、类型（弱类型 + typeof）、函数（function/匿名函数）、对象（自定义对象 + JSON）、DOM（选择器获取元素）"五块；事件监听三要素 + addEventListener 是页面交互的入口；模块化（export/import）解决复用与维护问题。

### 第四章：Vue3基础

**什么是Vue**

核心结论：Vue 是一款用于构建用户界面的**渐进式的 JavaScript 框架**（官方：https://cn.vuejs.org/），它的工作方式是基于数据渲染出用户看到的界面。

Vue 是一个框架，也是一个生态（按需渐进使用）：

- **声明式渲染** → Vue 核心包开发（局部模块改造）；
- **组件系统** → 插件工程化开发；
- **客户端路由 VueRouter、状态管理 Pinia/Vuex、构建工具 Vite/Webpack** → 整站开发。

框架的定位：

- **框架**：就是一套完整的项目解决方案，用于快速构建项目；
- 优点：大大提升前端项目的开发效率；
- 缺点：需要理解记忆框架的使用规则（参照官网）。

课件中准备渲染的数据示例（数据在 JS 中，页面根据它渲染）：

```js
userList: [
{"id": 1, "name": "谢逊", "image": "1.jpg", "gender": 1, "job": 1},
{"id": 2, "name": "韦一笑", "image": "2.jpg", "gender": 1, "job": 1}
]
```

**Vue快速入门**

核心思路——**数据驱动视图**：页面不再手写死数据，而是"准备好数据，通过插值表达式渲染出来"。

使用步骤：

1. 准备工作：引入 Vue 模块（官方提供）、创建 Vue 程序的应用实例并控制视图的元素、准备元素(div)交给 Vue 控制；
2. 数据驱动视图：准备数据、通过插值表达式渲染页面。

```html
<script type="module">
import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js';
createApp({
    data() {
        return {
            message: "Hello Vue"
        }
    }
}).mount("#app");
</script>

<div id="app">
    <h1>{{message}}</h1>
</div>
```

- `data()` 返回的对象就是数据模型（message: 'Hello Vue'）；
- `{{message}}` 是**插值表达式**，把数据渲染到页面对应位置；
- `.mount("#app")` 表示 Vue 实例控制 id 为 app 的元素。

**Vue常用指令**

核心结论：指令是 HTML 标签上带有 `v-` 前缀的特殊属性，不同的指令具有不同的含义，可以实现不同的功能。

| 指令 | 作用 |
| --- | --- |
| v-for | 列表渲染，遍历容器的元素或者对象的属性 |
| v-bind | 为 HTML 标签绑定属性值，如设置 href、css 样式等 |
| v-if/v-else-if/v-else | 条件性的渲染某元素，判定为 true 时渲染，否则不渲染 |
| v-show | 根据条件展示某元素，区别在于切换的是 display 属性的值 |
| v-model | 在表单元素上创建双向数据绑定 |
| v-on | 为 HTML 标签绑定事件 |

**v-for（员工列表数据渲染）**

作用：列表渲染，遍历容器的元素或者对象的属性。

语法：

```html
<tr v-for="(item,index) in items" :key="item.id"> {{item}}</tr>
```

参数说明：

- `items` 为遍历的数组；
- `item` 为遍历出来的元素；
- `index` 为索引/下标，从 0 开始；可以省略，省略 index 语法：`v-for="item in items"`。

key 的作用与选择：

- 给元素添加的**唯一标识**，便于 vue 进行列表项的正确排序复用，提升渲染性能；
- 推荐使用 id 作为 key（唯一），不推荐使用 index 作为 key（会变化，不对应）。

注意：遍历的数组，必须在 data 中定义；要想让哪个标签循环展示多次，就在哪个标签上使用 v-for 指令。

**v-bind（绑定标签属性）**

作用：动态为 HTML 标签绑定属性值，如设置 href、src、style 样式等。

语法：`v-bind:属性名="属性值"`，简化为 `:属性名="属性值"`。

```html
<img v-bind:src="item.image" width="30px">
<img :src="item.image" width="30px">
```

注意：动态的为标签的属性绑定值，**不能使用插值表达式**，得使用 v-bind 指令；且绑定的数据，必须在 data 中定义。

**v-if & v-show（元素显示与隐藏）**

作用：这两类指令，都是用来控制元素的显示与隐藏的。

| 指令 | 语法 | 原理 | 场景 |
| --- | --- | --- | --- |
| v-if | v-if="表达式"，表达式值为 true，显示；false，隐藏 | 基于条件判断，来控制创建或移除元素节点（条件渲染） | 要么显示，要么不显示，不频繁切换的场景 |
| v-show | v-show="表达式"，表达式值为 true，显示；false，隐藏 | 基于 CSS 样式 display 来控制显示与隐藏 | 频繁切换显示隐藏的场景 |

v-if 可以配合 v-else-if / v-else 进行链式调用条件判断：

```html
<span v-if="gender == 1">男生</span>
<span v-else-if="gender == 2">女生</span>
<span v-else>未知</span>
```

注意：v-else-if 必须出现在 v-if 之后，可以出现多个；v-else 必须出现在 v-if/v-else-if 之后。

课件中的练习场景（员工列表中把数字渲染成文字）：

```text
job:
1: 班主任
2: 讲师
3: 学工主管
4：教研主管
5：咨询师
```

**v-model（表单项数据采集）**

作用：在表单元素上使用，双向数据绑定。可以方便的**获取**或**设置**表单项数据。

语法：`v-model="变量名"`。

注意：v-model 中绑定的变量，必须在 data 中定义。

```js
createApp({
    data() {
        return {
            //定义数据模型，采集员工搜索表单数据
            searchForm: {
                name: '',
                gender: '',
                job: ''
            }
        }
    }
}).mount('#container')
```

```html
<input type="text" id="name" v-model="searchForm.name">
```

**v-on（事件绑定）**

作用：为 html 标签绑定事件（添加事件监听）。

语法：`v-on:事件名="方法名"`，简写为 `@事件名="…"`。

```html
<div id="app">
    <button type="button" v-on:click="handle">点我</button>
    <button type="button" @click="handle">再点我</button>
</div>
```

```js
const app = createApp({
    data() {
        //...
    },
    methods: {
        handle() {
            console.log('试试就试试');
        }
    },
}).mount("#app");
```

注意：methods 函数中的 this 指向 Vue 实例，可以通过 this 获取到 data 中定义的数据。

**Ajax**

核心结论：Ajax（Asynchronous JavaScript And XML，异步的 JavaScript 和 XML）用于给服务器发送请求并获取响应数据，实现**在不重新加载整个页面的情况下**与服务器交换数据并更新部分网页（如：搜索联想、用户名是否可用的校验等等）。

- **数据交换**：通过 Ajax 可以给服务器发送请求，并获取服务器响应的数据；
- **异步交互**：局部更新页面，不用整页刷新；
- XML（Extensible Markup Language，可扩展标记语言）：本质是一种数据格式，可以用来存储复杂的数据结构。

同步与异步的区别（按时间轴理解）：

- **同步**：客户端请求服务器后"等待"，服务器处理的 3 秒期间客户端不能执行其他操作；
- **异步**：客户端请求服务器后不等待，服务器处理期间客户端可以执行其他操作。

**Axios**

核心结论：Axios 对原生的 Ajax 进行了封装，简化书写，快速开发。官网：https://www.axios-http.cn/

步骤：

1. 引入 Axios 的 js 文件（参照官网）；
2. 使用 Axios 发送请求，并获取响应结果。

```html
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
```

```js
axios({
    method: 'GET',
    url: 'https://web-server.itheima.net/emps/list'
}).then((result) => {
    console.log(result.data);
}).catch((err) => {
    alert(err);
});
```

- `.then(...)` 里是**成功回调函数**；`.catch(...)` 里是**失败回调函数**；
- 常用参数：`method`：请求方式，GET/POST；`url`：请求路径；`data`：请求数据(POST)；`params`：发送请求时携带的 url 参数，如：`...?key=val`。

**Axios-请求方式别名**（推荐）：格式 `axios.请求方式(url [, data [, config]])`。

```js
axios.get('https://mock.apifox.cn/m1/3083103-0-default/emps/list').then((result) => {
    console.log(result.data);
}).catch((err) => {
    console.log(err);
});

axios.post('https://mock.apifox.cn/m1/3083103-0-default/emps/update','id=1').then((result) => {
    console.log(result.data);
}).catch((err) => {
    console.log(err);
});
```

小结：Axios 发送异步请求——GET: `axios.get(url).then((res)=>{…}).catch((err)=>{…})`；POST: `axios.post(url).then((res)=>{…}).catch((err)=>{…})`。

**async & await**

核心结论：可以通过 async、await 让异步变为同步操作。async 用来声明一个异步方法，await 用来等待异步任务执行——可读性强、便于维护。

```js
methods: {
    async search(){
        //根据用户输入的搜索条件，基于axios发送异步请求(https://web-server.itheima.net/emps/list)到服务端...
        let result = await axios.get('https://web-server.itheima.net/emps/list?name=xxx&gender=xxx&job=xxx');
        this.employees = result.data.data;
    }
}
```

注意：await 关键字只在 async 函数内有效，await 关键字取代 then 函数，等待获取到请求成功的结果值。

**Vue生命周期**

核心结论：生命周期指一个对象从创建到销毁的整个过程；Vue 生命周期共分为**八个阶段**，每触发一个生命周期事件，会自动执行一个生命周期方法（钩子）。

| 状态 | 阶段周期 |
| --- | --- |
| beforeCreate | 创建前 |
| created | 创建后 |
| beforeMount | 载入前 |
| mounted | 挂载完成 |
| beforeUpdate | 数据更新前 |
| updated | 数据更新后 |
| beforeUnmount | 组件销毁前 |
| unmounted | 组件销毁后 |

典型应用场景：在**页面加载完毕时**，发起异步请求，加载数据，渲染页面。

```html
<script type="module">
import { createApp } from 'https://.../vue.esm-browser.js'
const app = createApp({
    data() {
        return {
            message: "Hello Vue"
        }
    },
    //生命周期-钩子函数 mounted
    mounted() {
        console.log('Vue挂载完毕, 发送请求获取数据 ...');
    }
}).mount("#app");
</script>
```

**案例——从服务器端动态获取数据渲染展示列表**

需求：页面中写死的员工列表 empList 数据其实来自服务端，现需要从服务端获取：

1. 根据输入的条件进行查询，从服务器端（https://web-server.itheima.net/emps/list?name=xxx&gender=xxx&job=xxx）获取数据，查询时可以传入 name、gender、job 等查询条件；
2. 点击查询按钮时，根据输入的条件进行查询；
3. 页面加载完毕之后，自动加载数据，渲染展示；
4. 不要修改原有页面的结构和内容。

**容易误解的地方**：v-if 与 v-show 的"隐藏"本质不同——v-if 把元素从 DOM 里移除（重建），v-show 只是改 CSS 的 display；v-bind 不能写成插值表达式（`<img src="{{...}}">` 是错误用法），绑定标签属性必须用 v-bind 或 `:`；生命周期钩子名字必须写对（如 mounted 写成 mount 不会报错但不执行）。

本节收束：Vue 的核心思想是"数据驱动视图"；六个常用指令（v-for 列表渲染、v-bind 属性绑定、v-if/v-show 显示控制、v-model 双向绑定、v-on 事件）覆盖页面渲染与交互；Ajax/Axios 负责与服务器通信（含 async/await）；生命周期给出"页面加载完毕自动请求数据"的标准时点（mounted）。

### 第五章：Maven基础

**什么是Maven**

核心结论：Maven 是一款用于管理和构建 Java 项目的工具，是 apache 旗下的一个开源项目。

- Apache 软件基金会，成立于 1999 年 7 月，是目前世界上最大的最受欢迎的开源软件基金会，也是一个专门为支持开源项目而生的非盈利性组织；
- 开源项目地址：https://www.apache.org/index.html#projects-list

**Maven的作用**

Maven 的三大作用：

1. **依赖管理**：方便快捷的管理项目依赖的资源（jar包）；
2. **项目构建**：标准化的跨平台（Linux、Windows、MacOS）的自动化项目构建方式（编译 compile、测试 test、打包 package、发布 deploy）；
3. **统一项目结构**：提供标准、统一的项目结构。

依赖管理在 pom.xml 中的写法示例：

```xml
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.11.0</version>
</dependency>
```

**Maven核心概念**

核心结论：Apache Maven 是一个项目管理和构建工具，它基于**项目对象模型(POM)**的概念，通过一小段描述信息来管理项目的构建。官网：http://maven.apache.org/

Maven 的构成要素：

- **项目对象模型（POM）**：对应 pom.xml 文件；
- **依赖管理模型（Dependency）**：管理 jar 包依赖；
- **构建生命周期/阶段（Build lifecycle & phases）**：统一构建过程；
- **插件**：执行具体构建任务的工具；
- **仓库**：用于存储资源，管理各种 jar 包。

仓库的分类：

| 仓库 | 说明 |
| --- | --- |
| 本地仓库 | 自己计算机上的一个目录 |
| 中央仓库 | 由 Maven 团队维护的全球唯一的仓库，地址：https://repo1.maven.org/maven2/ |
| 远程仓库(私服) | 一般由公司团队搭建的私有仓库 |

查找依赖（jar）的顺序：**本地仓库（1）→ 远程仓库（2）→ 中央仓库（3）**。

**Maven安装**

安装步骤：

1. 解压 `apache-maven-3.9.4-bin.zip`；
2. 配置本地仓库：修改 `conf/settings.xml` 中的 `<localRepository>` 为一个指定目录；
3. 配置阿里云私服：修改 `conf/settings.xml` 中的 `<mirrors>` 标签，为其添加如下子标签；
4. 配置环境变量：`MAVEN_HOME` 为 maven 的解压目录，并将其 bin 目录加入 `PATH` 环境变量。

```xml
<localRepository>D:\develop\apache-maven-3.9.4\mvn_repo</localRepository>
```

```xml
<mirror>
    <id>alimaven</id>
    <name>aliyun maven</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
    <mirrorOf>central</mirrorOf>
</mirror>
```

安装测试（命令行）：

```text
mvn -v
```

注意：配置 settings.xml 中的本地仓库、私服时，一定要仔细，注意配置信息的位置和标签。

**IDEA集成Maven**

（1）配置 Maven 环境（全局）：配置 maven 安装目录、maven 配置文件、maven 仓库目录。

（2）创建 Maven 项目：创建模块，选择 New Module，填写模块信息，选择构建工具为 Maven，点击 create，创建完成。然后编写 HelloWorld，并运行。

（3）导入 Maven 项目（两种方式）：

- 方式一：File -> Project Structure -> Modules -> Import Module -> 选择 maven 项目的 pom.xml；
- 方式二：Maven 面板 -> +（Add Maven Projects）-> 选择 maven 项目的 pom.xml。

建议：将要导入的 maven 项目复制到你的项目目录下；建议选择 maven 项目的 pom.xml 文件进行导入。

**Maven坐标**

核心结论：Maven 中的坐标是资源(jar)的**唯一标识**，通过该坐标可以唯一定位资源位置。使用坐标来定义项目或引入项目中需要的依赖。

Maven 坐标主要组成：

- `groupId`：定义当前 Maven 项目隶属组织名称（通常是域名反写，例如：com.itheima）；
- `artifactId`：定义当前 Maven 项目名称（通常是模块名称，例如 order-service、goods-service）；
- `version`：定义当前项目版本号。

版本分类：

- **SNAPSHOT**：功能不稳定、尚处于开发中的版本，即快照版本；
- **RELEASE**：功能趋于稳定、当前更新停止，可以用于发行的版本。

自己项目的坐标（pom.xml）：

```xml
<groupId>com.itheima</groupId>
<artifactId>maven-project01</artifactId>
<version>1.0-SNAPSHOT</version>
```

引入依赖的坐标（pom.xml）：

```xml
<dependency>
    <groupId>cn.hutool</groupId>
    <artifactId>hutool-all</artifactId>
    <version>5.8.27</version>
</dependency>
```

**依赖管理**

（1）依赖配置：

- 依赖：指当前项目运行所需要的 jar 包，一个项目中可以引入多个依赖；
- 配置步骤：在 pom.xml 中编写 `<dependencies>` 标签 → 在 `<dependencies>` 标签中使用 `<dependency>` 引入坐标 → 定义坐标的 groupId，artifactId，version → 点击刷新按钮，引入最新加入的坐标。

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.1.4</version>
</dependency>
```

注意：如果不知道依赖的坐标信息，可以到 https://mvnrepository.com/ 中搜索。

（2）排除依赖：指主动断开依赖的资源，被排除的资源无需指定版本。

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.1.4</version>
    <exclusions>
        <exclusion>
            <groupId>io.micrometer</groupId>
            <artifactId>micrometer-observation</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```

依赖配置小结：配置依赖用 `<dependencies>...<dependency>...</dependency>...</dependencies>`；排除依赖用 `<exclusions>...</exclusions>`。注意事项：一旦依赖配置变更了，记得重新加载；引入的依赖本地仓库不存在，记得联网。

**生命周期**

核心结论：Maven 的生命周期就是为了对所有的 maven 项目构建过程进行抽象和统一。Maven 中有 **3 套相互独立的生命周期**：

- **clean**：清理工作；
- **default**：核心工作，如：编译、测试、打包、安装、部署等；
- **site**：生成报告、发布站点等。

每套生命周期包含一些阶段（phase），阶段是有顺序的，后面的阶段依赖于前面的阶段。

三套生命周期的完整阶段链：

- **clean**：pre-clean → clean → post-clean；
- **default**：validate → initialize → generate-sources → process-sources → generate-resources → process-resources → compile → process-classes → generate-test-sources → process-test-sources → generate-test-resources → process-test-resources → test-compile → process-test-classes → test → prepare-package → package → verify → install → deploy；
- **site**：pre-site → site → post-site → site-deploy。

常用生命周期阶段的含义：

| 阶段 | 作用 |
| --- | --- |
| clean | 移除上一次构建生成的文件 |
| compile | 编译项目源代码 |
| test | 使用合适的单元测试框架运行测试(junit) |
| package | 将编译后的文件打包，如：jar、war等 |
| install | 安装项目到本地仓库 |

注意：在同一套生命周期中，**当运行后面的阶段时，前面的阶段都会运行**。

执行指定生命周期阶段的两种方式：

1. 在 idea 中，右侧的 maven 工具栏，选中对应的生命周期，双击执行；
2. 在命令行中，通过命令执行：

```text
mvn clean
mvn compile
mvn package
…
```

**单元测试——测试基础概念**

测试：是一种用来促进鉴定软件的正确性、完整性、安全性和质量的过程。

阶段划分（4 个阶段）：

| 阶段 | 介绍 | 目的 | 测试人员 |
| --- | --- | --- | --- |
| 单元测试 | 对软件的基本组成单位进行测试，最小测试单位 | 检验软件基本组成单位的正确性 | 开发人员 |
| 集成测试 | 将已分别通过测试的单元，按设计要求组合成系统或子系统，再进行的测试 | 检查单元之间的协作是否正确 | 开发人员 |
| 系统测试 | 对已经集成好的软件系统进行彻底的测试 | 验证软件系统的正确性、性能是否满足指定的要求 | 测试人员 |
| 验收测试 | 交付测试，是针对用户需求、业务流程进行的正式的测试 | 验证软件系统是否满足验收标准 | 客户/需求方 |

测试方法（3 种）：

- **白盒测试**：清楚软件内部结构、代码逻辑。用于验证代码、逻辑正确性；
- **黑盒测试**：不清楚软件内部结构、代码逻辑。用于验证软件的功能、兼容性等方面；
- **灰盒测试**：结合了白盒测试和黑盒测试的特点，既关注软件的内部结构又考虑外部表现（功能）。

组合关系：单元测试用白盒测试；集成测试用灰盒测试；系统测试和验收测试用黑盒测试。

**JUnit单元测试**

核心结论：单元测试就是针对最小的功能单元(方法)，编写测试代码对其正确性进行测试；**JUnit** 是最流行的 Java 测试框架之一，提供了一些功能，方便程序进行单元测试（第三方公司提供）。

main 方法测试 vs JUnit 单元测试：

| 对比项 | main方法测试 | JUnit单元测试 |
| --- | --- | --- |
| 代码组织 | 测试代码与源代码未分开，难维护 | 测试代码与源代码分开，便于维护 |
| 相互影响 | 一个方法测试失败，影响后面方法 | 一个测试方法执行失败，不会影响其它测试方法 |
| 自动化 | 无法自动化测试，得到测试报告 | 可根据需要进行自动化测试；可自动分析测试结果，产出测试报告 |

快速入门（使用 JUnit，对 UserService 中业务方法进行单元测试）：

1. 在 pom.xml 中，引入 JUnit 的依赖；
2. 在 test/java 目录下，创建测试类，并编写对应的测试方法，并在方法上声明 `@Test` 注解；
3. 运行单元测试（测试通过：绿色；测试失败：红色）。

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.1</version>
</dependency>
```

```java
@Test
public void testGetAge(){
    Integer age = new UserService().getAge("110002200505091218");
    System.out.println(age);
}
```

注意：JUnit 单元测试类名命名规范为：`XxxxxTest`【规范】。JUnit 单元测试的方法，必须声明为 public void【规定】。

思考：单元测试运行不报错（绿色），就代表代码没问题，测试通过？——**并不是**（所以需要断言）。

**断言**

核心结论：JUnit 提供了一些辅助方法，用来帮我们确定被测试的方法是否按照预期的效果正常工作，这种方式称为**断言**。

| 断言方法 | 描述 |
| --- | --- |
| `Assertions.assertEquals(Object exp, Object act, String msg)` | 检查两个值是否相等，不相等就报错 |
| `Assertions.assertNotEquals(Object unexp, Object act, String msg)` | 检查两个值是否不相等，相等就报错 |
| `Assertions.assertNull(Object act, String msg)` | 检查对象是否为null，不为null，就报错 |
| `Assertions.assertNotNull(Object act, String msg)` | 检查对象是否不为null，为null，就报错 |
| `Assertions.assertTrue(boolean condition, String msg)` | 检查条件是否为true，不为true，就报错 |
| `Assertions.assertFalse(boolean condition, String msg)` | 检查条件是否为false，不为false，就报错 |
| `Assertions.assertThrows(Class expType, Executable exec, String msg)` | 检查程序运行抛出的异常，是否符合预期 |

提示：上述方法形参中的最后一个参数 msg，表示错误提示信息，可以不指定（有对应的重载方法）。

为什么要使用断言：单元测试方法运行不报错，不代表业务方法没问题。通过断言可以检测方法运行结果是否和预期一致，从而判断业务方法的正确性。写法：`Assertions.assertXxxx(...)`。

**JUnit常见注解**

| 注解 | 说明 | 备注 |
| --- | --- | --- |
| `@Test` | 测试类中的方法用它修饰才能成为测试方法，才能启动执行 | 单元测试 |
| `@ParameterizedTest` | 参数化测试的注解（可以让单个测试运行多次，每次运行时仅参数不同） | 用了该注解，就不需要 @Test 注解了 |
| `@ValueSource` | 参数化测试的参数来源，赋予测试方法参数 | 与参数化测试注解配合使用 |
| `@DisplayName` | 指定测试类、测试方法显示的名称（默认为类名、方法名） | — |
| `@BeforeEach` | 用来修饰一个实例方法，该方法会在每一个测试方法执行之前执行一次 | 初始化资源(准备工作) |
| `@AfterEach` | 用来修饰一个实例方法，该方法会在每一个测试方法执行之后执行一次 | 释放资源(清理工作) |
| `@BeforeAll` | 用来修饰一个静态方法，该方法会在所有测试方法之前只执行一次 | 初始化资源(准备工作) |
| `@AfterAll` | 用来修饰一个静态方法，该方法会在所有测试方法之后只执行一次 | 释放资源(清理工作) |

常见问题小结：

- JUnit 单元测试的方法，是否可以声明方法形参？——可以的，参数化测试：`@ParameterizedTest` + `@ValueSource`；
- 如何实现在单元测试方法运行之前，做一些初始化操作？——`@BeforeEach`、`@BeforeAll`；
- 如何实现在单元测试方法运行之后，释放对应的资源？——`@AfterEach`、`@AfterAll`；
- 在 maven 项目中，test 目录存放单元测试的代码，是否可以在 main 目录中编写单元测试呢？——可以，但是不规范。

实战练习：基于 AI，测试 UserService 中的 getGender 方法。

**依赖范围**

核心结论：依赖的 jar 包，默认情况下，可以在任何地方使用。可以通过 `<scope>…</scope>` 设置其作用范围。

作用范围三个维度：主程序范围有效（main 文件夹范围内）、测试程序范围有效（test 文件夹范围内）、是否参与打包运行（package 指令范围内）。

| scope值 | 主程序 | 测试程序 | 打包（运行） | 范例 |
| --- | --- | --- | --- | --- |
| compile（默认） | Y | Y | Y | log4j |
| test | - | Y | - | junit |
| provided | Y | Y | - | servlet-api |
| runtime | - | Y | Y | jdbc驱动 |

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.3</version>
    <scope>test</scope>
</dependency>
```

**Maven常见问题解决方案**

依赖下载失败示例问题：产生原因——由于网络原因，依赖没有下载完整导致的，在 maven 仓库中生成了 `xxx.lastUpdated` 文件，该文件不删除，不会再重新下载。

解决方案：

1. 根据 maven 依赖的坐标，找到仓库中对应的 `xxx.lastUpdated` 文件，删除，删除之后重新加载项目即可；
2. 通过命令（`del /s *.lastUpdated`）批量递归删除指定目录下的 `xxx.lastUpdated` 文件，删除之后重新加载项目即可；
3. 重新加载依赖，依赖下载了之后，maven 面板可能还会报红，此时可以关闭 IDEA，重新打开 IDEA 加载此项目即可。

**容易误解的地方**：生命周期的 3 套之间相互独立——执行 clean 不会影响 default 的各阶段；但同一套生命周期内部，运行后面的阶段时，前面的阶段都会运行（如执行 package 会先执行 compile 和 test）。另外 scope 为 test 的依赖（如 junit）不会被打入最终包，而 runtime 依赖（如 jdbc 驱动）编码时用不到但运行/打包需要。

本节收束：Maven 用"坐标"唯一定位 jar，用"仓库（本地→私服→中央）"下载依赖，用"生命周期"标准化构建过程；JUnit + 断言 + 注解构成单元测试的标准写法；这些都是后续所有 Maven 工程（含 SpringBoot 项目）的基础设施。

### 第六章：Web基础知识

**Web服务器与资源分类**

核心结论：Web 服务器上的资源分为静态资源和动态资源，与之对应的是两种软件架构模式。

- **静态资源**：服务器上存储的不会改变的数据，通常不会根据用户的请求而变化。比如：HTML、CSS、JS、图片、视频等（负责页面展示）；
- **动态资源**：服务器端根据用户请求和其他数据动态生成的，内容可能会在每次请求时都发生变化。比如：Servlet、JSP等（负责逻辑处理）。

两种架构模式：

- **B/S 架构**：Browser/Server，浏览器/服务器架构模式。客户端只需浏览器，应用程序的逻辑和数据都存在服务器端。（维护方便，体验一般）；
- **C/S 架构**：Client/Server，客户端/服务器架构模式。需要单独开发维护客户端。（体验不错，开发维护麻烦）。

本章内容结构：SpringBoot Web入门、HTTP协议、SpringBoot Web案例、分层解耦。

**SpringBoot Web入门——Spring与SpringBoot**

核心结论：Spring 发展到今天已经形成了一种开发生态圈，Spring 提供了若干个子项目（Spring全家桶），每个项目用于完成特定的功能，官网：spring.io。

- 传统 Spring 的问题：入门难度大、配置繁琐；
- **SpringBoot** 的价值：简化配置、快速开发——Spring Boot 可以帮助我们非常快速的构建应用程序、简化开发、提高效率。

**SpringBoot Web入门程序**

需求：基于 SpringBoot 开发一个 Web 应用，浏览器发起请求 `/hello` 之后，给浏览器返回一个字符串"Hello Xxx"。

快速入门步骤：

1. 创建 springboot 工程，并勾选 web 开发相关依赖；
2. 定义 HelloController 类，添加方法 hello，并添加注解；
3. 运行启动类，测试。

```java
@RestController //标识当前类是一个请求处理类
@RequestMapping("/hello") //标识请求路径
public class HelloController {
    public String hello(String name){
        System.out.println("HelloController ... hello : " + name);
        return "Hello " + name + " ~ ";
    }
}
```

测试访问：`http://localhost:8080/hello?name=Heima` 返回 `"Hello Heima ~"`。

提示：如果 Spring 官方脚手架连接不上，有对应的解决方案（网络问题）。

**入门程序剖析**

思考：为什么一个 main 方法就将 web 应用启动了？

- **起步依赖**：
  - `spring-boot-starter-web`：包含了 web 应用开发所需要的常见依赖；
  - `spring-boot-starter-test`：包含了单元测试所需要的常见依赖；
  - 官方提供的 starter 列表：https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/#using.build-systems.starters
- **内嵌 Tomcat**：SpringBoot 内置了 Tomcat 服务器，所以直接运行 main 方法即可启动 web 应用。

**HTTP协议**

概念：HTTP（Hyper Text Transfer Protocol，超文本传输协议），规定了浏览器和服务器之间数据传输的规则。

特点：

- 基于 TCP 协议：面向连接，安全；
- 基于请求-响应模型的：一次请求对应一次响应；
- HTTP 协议是**无状态**的协议：对于事务处理没有记忆能力。每次请求-响应都是独立的；
  - 缺点：多次请求间不能共享数据；
  - 优点：速度快。

**HTTP请求数据格式**

请求数据分三部分：

- **请求行**：请求数据第一行（请求方式、资源路径、协议）；
- **请求头**：第二行开始，格式 key：value；
- **请求体**：POST 请求时，存放请求参数（与请求头之间隔了一个空行）。

请求方式对比：

- **GET**：请求参数在请求行中，没有请求体，如：`/brand/findAll?name=OPPO&status=1`。GET 请求大小在浏览器中是有限制的；
- **POST**：请求参数在请求体中，POST 请求大小是没有限制的。

常见请求头：

| 请求头 | 说明 |
| --- | --- |
| Host | 请求的主机名 |
| User-Agent | 浏览器版本，例如 Chrome 浏览器的标识类似 Mozilla/5.0 ... Chrome/79，IE 浏览器的标识类似 Mozilla/5.0 (Windows NT ...) like Gecko |
| Accept | 表示浏览器能接收的资源类型，如 text/*，image/* 或者 */* 表示所有 |
| Accept-Language | 表示浏览器偏好的语言，服务器可以据此返回不同语言的网页 |
| Accept-Encoding | 表示浏览器可以支持的压缩类型，例如 gzip, deflate 等 |
| Content-Type | 请求主体的数据类型 |
| Content-Length | 请求主体的大小（单位：字节） |

**HTTP请求数据获取**

核心结论：Web 服务器（Tomcat）对 HTTP 协议的请求数据进行解析，并进行了封装（**HttpServletRequest**），在调用 Controller 方法的时候传递给了该方法。这样，就使得程序员不必直接对协议进行操作，让 Web 开发更加便捷。

```java
@RequestMapping("/request")
public String request(HttpServletRequest request){
    //  1.获取请求参数name，age
    String name = request.getParameter("name"); // Tom
    //  2.获取请求路径uri 和 url
    String uri = request.getRequestURI(); // /request
    String url = request.getRequestURL().toString(); // http://localhost:8080/request
    //  3.获取请求头 User-Agent
    String userAgent = request.getHeader("User-Agent"); // Mozilla/5.0 (Windows NT 10.0; Win64; x64)
    //  4.获取请求方式
    String method = request.getMethod(); // GET
    //  5.获取请求的查询字符串
    String queryString = request.getQueryString(); // name=Tomcat&age=10
    return "request success";
}
```

小结：HTTP 请求数据需要程序员自己解析吗？——不需要，web 服务器负责对 HTTP 请求数据进行解析，并封装为了请求对象；如何获取请求数据？——HttpServletRequest 对象里面封装了所有的请求信息。

**HTTP响应数据格式**

响应数据分三部分：

- **响应行**：响应数据第一行（协议、状态码、描述）；
- **响应头**：第二行开始，格式 key：value；
- **响应体**：最后一部分，存放响应数据。

状态码分类：

| 分类 | 说明 |
| --- | --- |
| 1xx | 响应中——临时状态码，表示请求已经接收，告诉客户端应该继续请求或者如果它已经完成则忽略它 |
| 2xx | 成功——表示请求已经被成功接收，处理已完成 |
| 3xx | 重定向——重定向到其他地方；让客户端再发起一次请求以完成整个处理 |
| 4xx | 客户端错误——处理发生错误，责任在客户端。如：请求了不存在的资源、客户端未被授权、禁止访问等 |
| 5xx | 服务器错误——处理发生错误，责任在服务端。如：程序抛出异常等 |

常见状态码：**200**（客户端请求成功）、**404**（请求资源不存在，URL输入有误，或者网站资源被删除了）、**500**（服务器发生不可预期的错误）。

常见响应头：

| 响应头 | 说明 |
| --- | --- |
| Content-Type | 表示该响应内容的类型，例如 text/html，application/json |
| Content-Length | 表示该响应内容的长度（字节数） |
| Content-Encoding | 表示该响应压缩算法，例如 gzip |
| Cache-Control | 指示客户端应如何缓存，例如 max-age=300 表示可以最多缓存300秒 |
| Set-Cookie | 告诉浏览器为当前页面所在的域设置 cookie |

**HTTP响应数据设置**

核心结论：Web 服务器对 HTTP 协议的响应数据进行了封装（**HttpServletResponse**），并在调用 Controller 方法的时候传递给了该方法。

方式一：基于 HttpServletResponse 封装：

```java
@RequestMapping("/response")
public void response(HttpServletResponse response) throws IOException {
    // 1.设置响应状态码
    response.setStatus(401);
    // 2.设置响应头
    response.setHeader("itheima","itheima");
    // 3.设置响应体
    response.getWriter().write("<h1>Hello Response</h1>");
}
```

方式二：基于 ResponseEntity 封装：

```java
@RequestMapping("/response")
public ResponseEntity<String> response() {
    return ResponseEntity.status(401)        // 1.设置响应状态码
            .header("group", "itcast")        // 2.设置响应头
            .body("<h1>Hello Response</h1>"); // 3.设置响应体
}
```

注意：响应状态码和响应头如果没有特殊要求的话，通常不手动设定。服务器会根据请求处理的逻辑，自动设置响应状态码和响应头。

小结：HTTP 响应数据需要程序员自己手动设置吗？——不需要，Web 服务器对 HTTP 响应数据进行了封装（HttpServletResponse）；响应状态码、响应头需要我们手动指定吗？——通常情况下，我们无需手动制定，服务器会根据请求逻辑自动设置。

**SpringBootWeb案例——用户列表渲染展示**

需求：开发 web 程序，完成用户列表的渲染展示。

准备工作：

1. 创建一个 SpringBoot 工程，并勾选 web 依赖、lombok；
2. 引入资料中准备好的用户数据文件(user.txt)，及前端静态页面；
3. 定义一个实体类，用来封装用户信息；
4. 开发服务端程序，接收请求，读取文本数据并响应。

访问地址：`http://localhost:8080/list`，响应 `[{"id":1,"username":"daqiao",...}]`。

两个关键知识点：

- **静态资源文件存放位置**：`resources/static`；
- **@ResponseBody 注解的作用**：将 controller 方法的返回值直接写入 HTTP 响应体；如果是对象或集合，会先转为 json，再响应；
- `@RestController = @Controller + @ResponseBody`。

服务端完整代码：

```java
@RequestMapping("/list")
public List<User> list(){
    //1.加载并读取文件
    InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
    ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());

    //2.解析数据，封装成对象 --> 集合
    List<User> userList = lines.stream().map(line -> {
        String[] parts = line.split(",");
        Integer id = Integer.parseInt(parts[0]);
        String username = parts[1];
        String password = parts[2];
        String name = parts[3];
        Integer age = Integer.parseInt(parts[4]);
        LocalDateTime uTime = LocalDateTime.parse(parts[5],
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return new User(id, username, password, name, age, updateTime);
    }).collect(Collectors.toList());

    //3.响应数据
    return userList;
}
```

⚠️ 问题：课件代码中变量声明为 `LocalDateTime uTime = LocalDateTime.parse(...)`，但创建对象时写的是 `new User(..., age, updateTime)`——`updateTime` 这个变量并不存在，代码无法编译。
修正建议：两处命名保持一致，应写成 `new User(id, username, password, name, age, uTime)`（或把变量声明为 `updateTime`）。

这样"读取文件 + 解析 + 响应"全部写在 Controller 中，存在**复用性差、难以维护**的问题——由此引出分层解耦。

**分层解耦——三层架构**

核心结论：按照**单一职责原则**把代码拆分为三层，便于复用与后期维护。

| 层 | 职责 |
| --- | --- |
| controller | 控制层，接收前端发送的请求，对请求进行处理，并响应数据（接收请求、响应数据） |
| service | 业务逻辑层，处理具体的业务逻辑（逻辑处理） |
| dao | 数据访问层(Data Access Object)（持久层），负责数据访问操作，包括数据的增、删、改、查（数据访问） |

拆分前后对比：拆分前复用性差、难以维护；拆分后复用性强、方便维护。

小结：为什么要对代码进行拆分？——遵循单一职责原则，便于复用、后期维护；拆分为了哪三层？——controller（接受请求，响应数据）、service（逻辑处理）、dao（数据访问）。

**分层解耦——耦合、内聚与IOC/DI思想**

- **耦合**：衡量软件中各个层/各个模块的依赖关联程度；
- **内聚**：软件中各个功能模块内部的功能联系；
- **软件设计原则**：**高内聚低耦合**。

核心结论：分层解耦的实现靠三个概念：

- **控制反转（IOC，Inversion Of Control）**：对象的创建控制权由程序自身转移到外部（容器），这种思想称为控制反转；
- **依赖注入（DI，Dependency Injection）**：容器为应用程序提供运行时，所依赖的资源，称之为依赖注入；
- **Bean 对象**：IOC 容器中创建、管理的对象，称之为 Bean。

实现分层解耦的思路：将项目中的类交给 IOC 容器管理（IOC，控制反转）；应用程序运行时需要什么对象，直接依赖容器为其提供（DI，依赖注入）。

**IOC & DI入门**

两步改造：

1. 将 Dao 及 Service 层的实现类，交给 IOC 容器管理；
2. 为 Controller 及 Service 注入运行时所依赖的对象。

```java
@Component
public class UserDaoImpl implements UserDao {
    @Override
    public List<String> list() {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        return IoUtil.readLines(in,StandardCharsets.UTF_8, new ArrayList<>());
    }
}
```

```java
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> list() {
        //1.调用dao获取数据
        List<String> lines = userDao.list();
        //2...
    }
}
```

```java
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public List<User> list(){
        //1.调用service，查询用户信息
        List<User> userList = userService.list();
        //2...
    }
}
```

小结：如何将一个类交给 IOC 容器管理？——`@Component`（注意：是加在**实现类**上，而非接口上）；如何从 IOC 容器中找到该类型的 bean，然后完成依赖注入？——`@Autowired`。

**IOC详解**

要把某个对象交给 IOC 容器管理，需要在对应的类上加上如下注解之一：

| 注解 | 说明 | 位置 |
| --- | --- | --- |
| `@Component` | 声明 bean 的基础注解 | 不属于以下三类时，用此注解 |
| `@Controller` | @Component 的衍生注解 | 标注在控制层类上 |
| `@Service` | @Component 的衍生注解 | 标注在业务层类上 |
| `@Repository` | @Component 的衍生注解 | 标注在数据访问层类上（由于与 mybatis 整合，用的少） |

注意：声明 bean 的时候，可以通过注解的 value 属性指定 bean 的名字，如果没有指定，**默认为类名首字母小写**。

**组件扫描**：前面声明 bean 的四大注解，要想生效，还需要被组件扫描注解 `@ComponentScan` 扫描。该注解虽然没有显式配置，但是实际上已经包含在了启动类声明注解 `@SpringBootApplication` 中，**默认扫描的范围是启动类所在包及其子包**。

小结：声明 bean 的注解有 @Controller、@Service、@Repository、@Component；在 Springboot 集成 web 开发中，声明控制器 bean 只能用 @Controller；声明 bean 的注解要想生效，需要被扫描到，启动类默认扫描当前包及其子包。

**DI详解**

核心结论：基于 `@Autowired` 进行依赖注入的常见方式有三种。

（1）属性注入：

```java
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    //......
}
```

- 优点：代码简洁、方便快速开发；
- 缺点：隐藏了类之间的依赖关系、可能会破坏类的封装性。

（2）构造函数注入：

```java
@RestController
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
}
```

- 优点：能清晰地看到类的依赖关系、提高了代码的安全性；
- 缺点：代码繁琐、如果构造参数过多，可能会导致构造函数臃肿；
- 注意：如果只有一个构造函数，@Autowired 注解可以省略。

（3）setter 注入：

```java
@RestController
public class UserController {
   private UserService userService;
   @Autowired
   public void setUserService(UserService userService) {
       this.userService = userService;
   }
}
```

- 优点：保持了类的封装性，依赖关系更清晰；
- 缺点：需要额外编写 setter 方法，增加了代码量。

**多个同类型Bean的注入问题**

核心结论：`@Autowired` 注解，默认是按照**类型**进行注入的。如果存在多个相同类型的 bean，将会报出错误——三种解决方案：

方案一：`@Primary`（在某个实现类上加 @Primary，标记优先注入）：

```java
@Primary
@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> list(){
        //省略 ……
    }
}
```

方案二：`@Autowired` + `@Qualifier`（按名字指定）：

```java
@RestController
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;
}
```

方案三：`@Resource`（JavaEE 规范注解，按名字注入）：

```java
@RestController
public class UserController {
    @Resource(name = "userServiceImpl")
    private UserService userService;
}
```

`@Resource` 与 `@Autowired` 的区别：

- @Autowired 是 Spring 框架提供的注解，而 @Resource 是 JavaEE 规范提供的；
- @Autowired 默认是按照类型注入，而 @Resource 默认是按照名称注入。

**容易误解的地方**：@Component 等注解必须加在**实现类**上（加在接口上无效）；@Autowired 先按类型找，同类型有多个时才需要 @Qualifier/@Primary/@Resource 辅助；HTTP 是"无状态"协议，多次请求间不能共享数据，这是后面要用 Cookie/Session/JWT 做登录状态保持的根本原因。

本节收束：SpringBoot 通过"起步依赖 + 内嵌 Tomcat"把 Web 应用启动简化为一个 main 方法；HTTP 协议规定了请求（行/头/体）与响应（行/头/体）的数据格式，Tomcat 负责解析并封装成 HttpServletRequest/HttpServletResponse；开发规范上采用 controller-service-dao 三层架构，通过 IOC（@Component 家族）与 DI（@Autowired 家族）实现分层解耦、高内聚低耦合。

### 第七章：数据库

**为什么需要数据库**

核心结论：在 Web 后端开发的三层结构中，**Dao 层负责数据访问**——而数据不能一直存在文本文件里，需要专门的软件来存储和管理，这就是数据库引入的原因。

回顾后端程序的三层分工：

- **Controller**：接收请求、响应数据；
- **Service**：逻辑处理；
- **Dao**：数据访问；
- **数据库**：数据最终存储的位置。

此前把数据存在文件里，随着数据量变大、并发变多，会"不便维护、管理"。所以企业开发中后端数据都交给数据库管理。

**数据库核心概念：DB、DBMS、SQL**

核心结论：三个最基础的名词要先分清——数据库是"仓库"，DBMS 是"管理仓库的软件"，SQL 是"操作仓库的语言"。

- **数据库（DataBase，DB）**：是存储和管理数据的仓库；
- **数据库管理系统（DataBase Management System，DBMS）**：操纵和管理数据库的大型软件；
- **SQL（Structured Query Language）**：操作关系型数据库的编程语言，定义了一套操作关系型数据库的统一标准。

关系图理解：客户端发起操作 → 通过 SQL 语言 → 交给 DBMS（数据库管理系统）执行 → DBMS 管理着多个数据库 → 每个数据库中又有若干张表。

**数据库产品**

核心结论：市面上数据库产品很多，但都遵循 SQL 统一标准；本课程学习的是开源免费的 MySQL。

| 产品 | 说明 |
| --- | --- |
| Oracle | 收费的大型数据库，Oracle 公司的产品 |
| SQL Server | MicroSoft 公司收费的中型的数据库。C#、.net 等语言常使用 |
| PostgreSQL | 开源免费中小型的数据库 |
| DB2 | IBM 公司的大型收费数据库产品 |
| SQLite | 嵌入式的微型数据库。如：作为 Android 内置数据库 |
| MariaDB | 开源免费的中小型的数据库 |
| MySQL | 开源免费的中小型数据库。Sun 公司收购了 MySQL，Oracle 收购 Sun 公司 |

这些产品都遵循 SQL 这一**统一标准**，所以学会 SQL 之后，换数据库产品时大部分操作是通用的。

本份课件的课程结构为：**MySQL 概述、SQL 语句、多表设计、多表查询、事务**；课件正文实际覆盖了"MySQL 概述"与"SQL 语句"两部分内容（DDL、DML、DQL）。

**MySQL 安装**

核心结论：MySQL 官方提供商业版和社区版两种版本，课程采用免费的最新社区版 8.0.34。

- **商业版（MySQL Enterprise Edition）**：收费，可以试用 30 天；官方提供技术支持；
- **社区版（MySQL Community Server）**：免费；MySQL 官方不提供技术支持。

本课程采用的是 MySQL 的最新社区版（MySQL Community Server 8.0.34）。

下载地址：https://dev.mysql.com/downloads/mysql/ （安装按资料中的文档操作）。

**MySQL 连接**

核心结论：安装完成后通过命令行即可连接 MySQL 服务器，基本语法是 `mysql -u用户名 -p密码`，可选的 `-h`、`-P` 用于指定服务器 IP 与端口。

连接语法：

```
mysql –u用户名 –p密码 [-h数据库服务器IP地址 -P端口号]
```

例如完整写法：`mysql -hxxx -Pxxx -uxxx -pxxx`，回车后输入密码即可连接。

⚠️ 问题：课件连接语法中 `-u` 和 `-p` 前用的是全角破折号"–"（而 `-h`、`-P` 前是正常的半角减号"-"），符号混用；如果照着课件直接复制输入，命令会执行失败。
修正建议：命令中所有参数前缀都使用**半角减号"-"**，即 `mysql -u用户名 -p密码 [-h数据库服务器IP地址 -P端口号]`。

细节说明：企业开发中很少直接使用命令行，而是使用图形化工具连接数据库（见下文 DataGrip）。

**关系型数据库与数据模型**

核心结论：MySQL 是关系型数据库——由多张相互连接的二维表组成；数据的存储层级是：数据库 → 表 → 数据（记录）。

- **关系型数据库**：建立在关系模型基础上，由多张相互连接的二维表组成的数据库（RDBMS）；
- 特点：
  - 使用表存储数据，格式统一，便于维护；
  - 使用 SQL 语言操作，标准统一，使用方便，可用于复杂查询。

举例理解：一家公司可以用"员工表"和"部门表"两张二维表存储数据，两张表之间通过字段建立连接（如员工表里的部门 ID 关联部门表）。

数据库的完整数据模型层级：

- 客户端（发起 SQL 操作）；
- 数据库服务器（运行 DBMS）；
- DBMS 管理多个数据库（数据库 1、数据库 2……）；
- 每个数据库中有多张表（表 1、表 2……）；
- 表中存放具体的数据（记录）。

结论：**数据是如何在数据库中存储的？——数据库 -> 表 -> 数据(记录)。**

**SQL 语言分类**

核心结论：SQL 按功能分为四大类——DDL、DML、DQL、DCL；本阶段重点学习前三种。

| 分类 | 全称 | 说明 |
| --- | --- | --- |
| DDL | Data Definition Language | 数据定义语言，用来定义数据库对象（数据库，表，字段） |
| DML | Data Manipulation Language | 数据操作语言，用来对数据库表中的数据进行增删改 |
| DQL | Data Query Language | 数据查询语言，用来查询数据库中表的记录 |
| DCL | Data Control Language | 数据控制语言，用来创建数据库用户、控制数据库的访问权限 |

本份课件的 SQL 内容组织：DDL（数据库、表结构-创建、表结构-查询修改删除）、DML、DQL。

**DDL——数据库操作**

核心结论：数据库的 DDL 操作按"查询——使用——创建——删除"四类记忆：查所有库、查当前库、切换库、建库、删库。

完整语法：

```sql
-- 查询所有数据库
show databases;
-- 查询当前数据库
select database();
-- 使用/切换数据库
use 数据库名;
-- 创建数据库
create database [if not exists] 数据库名 [default charset utf8mb4];
-- 删除数据库
drop database [if exists] 数据库名;
```

细节说明：

- 上述语法中的 `database`，也可以替换成 `schema`。如：`create schema db01;`
- MySQL8 版本中，默认字符集为 utf8mb4；
- `[if not exists]`、`[if exists]` 用方括号括起表示可选，加上可以避免"重复创建报错/删除不存在的库报错"。

容易误解的地方：同一个数据库服务器中，**数据库的名字不可以相同**；MySQL8 版本默认的字符集是 **utf8mb4**（不是 utf8）。

**MySQL 客户端工具——DataGrip**

核心结论：命令行客户端存在"无提示、操作繁琐、无历史记录"的缺点，企业开发中常用图形化工具 DataGrip。

- 命令行方式的问题：无提示、操作繁琐、无历史记录；
- **DataGrip**：JetBrains 旗下的一款数据库管理工具，是管理和开发 MySQL、Oracle、PostgreSQL 的理想解决方案；
- 官网：https://www.jetbrains.com/zh-cn/datagrip/
- 安装：参考资料中提供的《DataGrip安装手册》。

**DDL——表结构创建**

核心结论：创建表的核心是"字段名 + 字段类型 + 约束 + 注释"的组合，语法结构固定。

创建表的语法：

```sql
create table tablename(
    字段1 字段类型 [约束] [comment 字段1注释],
    ......
    字段2 字段类型 [约束] [comment 字段2注释]
)[comment 表注释];
```

**约束**：约束是作用于表中字段上的规则，用于限制存储在表中的数据。目的是**保证数据库中数据的正确性、有效性和完整性**。

| 约束 | 描述 | 关键字 |
| --- | --- | --- |
| 非空约束 | 限制该字段值不能为 null | not null |
| 唯一约束 | 保证字段的所有数据都是唯一、不重复的 | unique |
| 主键约束 | 主键是一行数据的唯一标识，要求非空且唯一 | primary key |
| 默认约束 | 保存数据时，如果未指定该字段值，则采用默认值 | default |
| 外键约束 | 让两张表的数据建立连接，保证数据的一致性和完整性 | foreign key |

例如页面上"性别默认男、姓名非空、id 唯一标识"的需求，就分别对应 default、not null、primary key 三种约束。

几个常见问题：

- MySQL 数据库中分为哪几类约束？——primary key、not null、unique、default、foreign key；
- 如何实现主键自增的效果？——定义主键的时候指定关键字 `auto_increment`；
- 一个字段上是否可以添加多个约束？——可以，多个约束之间使用**空格**分开。

**DDL——表结构创建之数据类型**

核心结论：MySQL 数据类型众多，主要分三类：数值类型、字符串类型、日期时间类型。

两个必须掌握的选择要点：

- **unsigned**：数值类型在定义时后面加 unsigned 关键字表示无符号类型，只能取 0 及正数；不加默认是 signed，表示可以取负数；
- **char 与 varchar 的区别**：char 是**定长字符串**，varchar 是**变长字符串**；
  - 如果一个字段的长度是固定的，建议使用 char；如：身份证号、手机号；
  - 如果一个字段的长度不是固定的，建议使用 varchar；如：用户名、姓名。

**员工表设计案例**

核心结论：根据页面原型设计表结构，遵循"分析原型 → 分析字段 → 建表"三步，并为基础表补充 id、create_time、update_time 三个基础字段。

步骤：

1. 阅读并分析页面原型及需求；
2. 分析表中包含哪些字段，以及字段的类型、约束；
3. 创建表结构（添加基础字段 id、create_time、update_time）。

细节说明：id 作为主键唯一标识一行数据；create_time、update_time 用于记录数据的创建时间与更新时间，是企业表设计的通用基础字段。

**DDL——表结构的查询、修改、删除**

核心结论：表结构的操作围绕"查询——修改——删除"展开，查询用 show/desc，修改用 alter 系列，删除用 drop。

完整语法：

```sql
show tables; -- 查询当前数据库的所有表
desc 表名; -- 查询表结构
show create table 表名; -- 查询建表语句

alter table 表名 add 字段名 类型(长度) [comment 注释] [约束]; -- 添加字段
alter table 表名 modify 字段名 新数据类型(长度); -- 修改字段类型
alter table 表名 change 旧字段名 新字段名 类型(长度) [comment 注释] [约束]; -- 修改字段名与字段类型
alter table 表名 drop column 字段名; -- 删除字段
alter table 表名 rename to 新表名; -- 修改表名

drop table [if exists] 表名; -- 删除表
```

细节说明与容易误解的地方：

- `modify` 只改字段类型，`change` 可以同时改字段名和字段类型，两者不要混用；
- **注意：在删除表时，表中的全部数据也会被删除**（这是 drop 与 delete 的本质区别，delete 只删数据不删表结构）。

**DML——数据操作语言**

核心结论：DML 英文全称是 Data Manipulation Language（数据操作语言），用来对数据库中表的数据记录进行**增、删、改**操作，对应 INSERT、UPDATE、DELETE 三条语句。

**DML——insert 添加数据**

四种插入写法：

```sql
-- 指定字段添加数据
insert into 表名(字段名1, 字段名2) values (值1, 值2);
-- 全部字段添加数据
insert into 表名 values (值1, 值2, ...);
-- 批量添加数据（指定字段）
insert into 表名 (字段名1, 字段名2) values (值1, 值2), (值1, 值2);
-- 批量添加数据（全部字段）
insert into 表名 values (值1, 值2, ...), (值1, 值2, ...);
```

注意：

- 插入数据时，指定的字段顺序需要与值的顺序是**一一对应**的；
- 字符串和日期型数据应该包含在引号中（单引号、双引号都可以）；
- 插入的数据大小/长度，应该在字段的规定范围内（如字段类型是 varchar(10)，就不能插入超过 10 个字符的内容）。

**DML——update 修改数据**

语法：

```sql
-- 修改数据
update 表名 set 字段名1 = 值1, 字段名2 = 值2, .... [where 条件];
```

注意：修改语句的条件可以有，也可以没有；**如果没有条件，则会修改整张表的所有数据**——这是初学者最容易踩的坑，执行 UPDATE 前先确认 where 条件是否写对。

**DML——delete 删除数据**

语法：

```sql
-- 删除数据
delete from 表名 [where 条件];
```

注意：

- DELETE 语句的条件可以有，也可以没有；如果没有条件，则会**删除整张表的所有数据**；
- DELETE 语句**不能删除某一个字段的值**（如果要操作，可以使用 UPDATE，将该字段的值置为 NULL）。

**DQL——数据查询语言总览**

核心结论：DQL 英文全称是 Data Query Language（数据查询语言），用来查询数据库表中的记录，关键字是 **SELECT**；它是 SQL 中使用最频繁、语法最丰富的一类。

完整的 DQL 语句语法：

```sql
select
    字段列表
from
    表名列表
where
    条件列表
group by
    分组字段列表
having
    分组后条件列表
order by
    排序字段列表
limit
    分页参数
```

DQL 按功能分为五个部分（本课件逐一讲解）：

1. 基本查询（select...from...）；
2. 条件查询（where）；
3. 分组查询（group by）；
4. 排序查询（order by）；
5. 分页查询（limit）。

**DQL——基本查询**

核心结论：基本查询解决"查哪些字段"的问题，支持查询指定字段、全部字段（通配符）、字段别名、去重。

语法：

```sql
-- 查询多个字段
select 字段1,字段2,字段3 from 表名;
-- 查询所有字段(通配符)
select * from 表名;
-- 为查询字段设置别名，as关键字可以省略
select 字段1 [as 别名1], 字段2 [as 别名2] from 表名;
-- 去除重复记录
select distinct 字段列表 from 表名;
```

注意：`*` 号代表查询所有字段，在实际开发中尽量少用（不直观、影响效率）。

小结：基本查询语法是 `select 字段列表 from 表名`；为字段设置别名用 `字段名 [as] 别名`；去除重复记录用 `distinct`。

**DQL——条件查询**

核心结论：条件查询通过 where 子句过滤记录，由比较运算符和逻辑运算符组合条件。

语法：

```sql
-- 条件查询
select 字段列表 from 表名 where 条件列表;
```

比较运算符：

| 比较运算符 | 功能 |
| --- | --- |
| > | 大于 |
| >= | 大于等于 |
| < | 小于 |
| <= | 小于等于 |
| = | 等于 |
| <> 或 != | 不等于 |
| between ... and ... | 在某个范围之内（含最小、最大值） |
| in(...) | 在 in 之后的列表中的值，多选一 |
| like 占位符 | 模糊匹配（_匹配单个字符，%匹配任意个字符） |
| is null | 是 null |

逻辑运算符：

| 逻辑运算符 | 功能 |
| --- | --- |
| and 或 && | 并且（多个条件同时成立） |
| or 或 \|\| | 或者（多个条件任意一个成立） |
| not 或 ! | 非，不是 |

小结：如何进行 null 值的判断？——`is null`、`is not null`（注意不能写成 `= null`）；模糊匹配中的通配符？——`%`（任意个字符）、`_`（一个字符）；如何组装多个查询条件？——`and` / `or`。

**DQL——分组查询**

核心结论：分组查询 = "分组 + 聚合"——先按 group by 的字段分组，再对每组用聚合函数做纵向计算。

**聚合函数**：将一列数据作为一个整体，进行纵向计算。

| 函数 | 功能 |
| --- | --- |
| count | 统计数量 |
| max | 最大值 |
| min | 最小值 |
| avg | 平均值 |
| sum | 求和 |

注意：

- null 值不参与所有聚合函数的运算；
- 统计数量可以使用：`count(*)`、`count(字段)`、`count(常量)`，推荐使用 `count(*)`。

分组查询语法：

```sql
-- 分组查询
select 字段列表 from 表名 [where 条件列表] group by 分组字段名 [having 分组后过滤条件];
```

**where 与 having 的区别**：

- 执行时机不同：where 是分组之前进行过滤，不满足 where 条件，不参与分组；而 having 是分组之后对结果进行过滤；
- 判断条件不同：where 不能对聚合函数进行判断，而 having 可以。

注意：

- 分组之后，查询的字段一般为聚合函数和分组字段，查询其他字段无任何意义；
- 执行顺序：where > 聚合函数 > having。

小结：DQL 语句中 where 与 having 的区别？——执行时机不同（where -> group by -> having）；判断条件不同（having 后可以用聚合函数，where 不可以）。

**DQL——排序查询**

核心结论：排序查询用 order by 控制结果顺序，升序 asc（默认，可不写）、降序 desc；支持多字段排序。

排序方式：升序（asc），降序（desc）；默认为升序 asc，是可以不写的。

语法：

```sql
-- 排序查询
select 字段列表 from 表名 [where 条件列表] [group by 分组字段名 having 分组后过滤条件] order by 排序字段 排序方式;
```

注意：如果是多字段排序，**当第一个字段值相同时，才会根据第二个字段进行排序**。

课件中的排序示例解读：

- `... order by age;` —— 按 age 升序排序（asc 省略）；
- `... order by age desc, score asc;` —— 先按 age 降序排序，age 相同时再按 score 升序排序；
- `... order by age, score, update_time desc;` —— 先按 age 升序，age 相同按 score 升序，再相同按 update_time 降序。

**DQL——分页查询**

核心结论：分页查询用 limit 限制返回的记录范围，语法是 `limit 起始索引, 查询记录数`。

语法：

```sql
-- 分页查询
select 字段 from 表名 [where 条件] [group by 分组字段 having 过滤条件] [order by 排序字段] limit 起始索引,查询记录数;
```

说明：

- 起始索引**从 0 开始**；
- 分页查询是数据库的**方言**，不同的数据库有不同的实现，MySQL 中是 LIMIT；
- 如果起始索引为 0，起始索引可以省略，直接简写为 `limit 10`。

容易误解的地方：项目开发中，前端传递过来的是**页码**，需要转换为起始索引，公式为：**（页码 - 1）* 每页展示记录数**。例如每页展示 10 条，查询第 3 页的数据，起始索引 = (3-1) * 10 = 20，即 `limit 20, 10`。

⚠️ 问题：课件分页查询语法示例上方的注释写成了 `-- 排序查询`，与内容（分页查询语法）不符，属于笔误。
修正建议：该注释应写为 `-- 分页查询`。

小结：本章围绕"数据库是什么——SQL 怎么分类——DDL 建库建表——DML 增删改——DQL 查询"的脉络展开。DDL 用 show/create/alter/drop 管理库表结构；DML 用 insert/update/delete 操作数据，删改不带 where 会作用于整表；DQL 用 select 一条语句完成了基本查询、条件查询、分组查询、排序查询、分页查询五类需求，其中 where 与 having 的区别、分页索引换算公式是重点。

### 第八章：后端Web基础——Java操作数据库

**Java 操作数据库的技术体系**

核心结论：Java 程序操作数据库有多种技术方案，从底层的 JDBC 到高层的各持久层框架层层封装；本课程主线是 **JDBC → MyBatis**。

常见技术：

- **JDBC**：(Java DataBase Connectivity)，就是使用 Java 语言操作关系型数据库的一套 API；
- **MyBatis**、**MyBatisPlus**、**Spring Data JPA**、**Hibernate**：在 JDBC 基础之上封装的上层框架。

学习路径：先理解 JDBC 的底层原理（最原始的方式），再学习 MyBatis（企业最常用的持久层框架），后续还有 MyBatisPlus 等增强工具。

**JDBC——介绍**

核心结论：JDBC 的本质是 **sun 公司官方定义的一套操作所有关系型数据库的规范（接口）**，各数据库厂商提供驱动 jar 包实现这套接口，程序员面向接口编程即可操作所有数据库。

- 本质：sun 公司官方定义的一套操作所有关系型数据库的规范，即接口；
- 各个数据库厂商去实现这套接口，提供数据库**驱动** jar 包；
- 我们可以使用这套接口（JDBC）编程，**真正执行的代码是驱动 jar 包中的实现类**。

结构理解：Java 程序 → JDBC（接口规范）→ 各厂商驱动实现（Mysql 实现、Oracle 实现、SqlServer 实现）。

这样设计的好处：Java 代码只依赖 JDBC 接口；换数据库时只需更换驱动 jar 包，业务代码基本不用改。

**JDBC——入门程序**

需求：基于 JDBC 程序，执行 update 语句 `update user set age = 25 where id = 1`。

步骤：

1. 准备工作：创建一个 maven 项目，引入依赖；并准备数据库表 user；
2. 代码实现：编写 JDBC 程序，操作数据库。

在 pom.xml 中引入 MySQL 驱动依赖：

```xml
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.0.33</version>
</dependency>
```

JDBC 程序代码（五个固定步骤）：

```java
//1. 注册驱动
Class.forName("com.mysql.cj.jdbc.Driver");
//2. 获取连接
String url = "jdbc:mysql://localhost:3306/web01";
String username = "root";
String password = "1234";
Connection connection = DriverManager.getConnection(url, username, password);
//3. 获取SQL语句执行对象
Statement statement = connection.createStatement();
//4. 执行SQL
int i = statement.executeUpdate("update user set age = 25 where id = 1");
//5. 释放资源
statement.close();
connection.close();
```

细节说明：

- **注册驱动**：`Class.forName("com.mysql.cj.jdbc.Driver")` 加载驱动类（8.x 版本驱动类名带 `cj`）；
- **获取连接**：url 的格式是 `jdbc:mysql://主机:端口/数据库名`，本例连接本机 3306 端口上的 web01 库；
- **执行 SQL**：`statement.executeUpdate()` 用于执行 DML 语句；
- **释放资源**：用完必须关闭，否则连接泄漏。

小结：什么是 JDBC？——sun 公司提供的一套操作关系型数据库的 API（规范）；JDBC 操作数据库步骤——注册驱动、获取连接、获取执行对象、执行 SQL、释放资源。

**JDBC——查询数据**

核心结论：查询使用 `executeQuery()` 方法，返回 **ResultSet（结果集对象）**，通过 `next()` 逐行遍历、`getXxx()` 按列取值。

需求：基于 JDBC 执行如下 select 语句，将查询结果封装到 User 对象中。

SQL：`select * from user where username = 'daqiao' and password = '123456'`

ResultSet（结果集对象）：`ResultSet rs = statement.executeQuery();`

- **next()**：将光标从当前位置向前移动一行，并判断当前行是否为有效行，返回值为 boolean；
  - true：有效行，当前行有数据；
  - false：无效行，当前行没有数据；
- **getXxx(…)**：获取数据，可以根据列的编号获取，也可以根据列名获取（推荐）。

结果解析步骤（遍历结果集）：

```java
while (resultSet.next()) {
    int id = resultSet.getInt("id");
    //...省略
}
```

小结：

- JDBC 程序执行 DML 语句？——`int rowsAffected = statement.executeUpdate();`
- 执行 DQL 语句？——`ResultSet rs = statement.executeQuery();`
- DQL 语句执行完毕结果集 ResultSet 解析？——`resultSet.next()` 光标往下移动一行；`resultSet.getXxx()` 获取字段数据。

**JDBC——预编译 SQL**

核心结论：JDBC 中执行 SQL 有两种方式——**静态 SQL（参数硬编码）** 与 **预编译 SQL（参数动态传递）**；预编译 SQL 使用 PreparedStatement，能防止 SQL 注入且性能更高。

方式 1：静态 SQL（参数硬编码，使用 Statement）：

```java
Statement statement = connection.createStatement();
int i = statement.executeUpdate("update user set age = 25 where id = 1");
System.out.println("SQL执行完毕, 影响的记录数为: " + i);
```

方式 2：预编译 SQL（参数动态传递，使用 PreparedStatement，`?` 是参数占位符）：

```java
PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM user WHERE username = ? AND password = ?");
pstmt.setString(1, "daqiao");
pstmt.setString(2, "123456");
ResultSet resultSet = pstmt.executeQuery();
```

预编译 SQL 的两大优势：

1. **优势一：可以防止 SQL 注入，更安全**。
   SQL 注入：通过控制输入来修改事先定义好的 SQL 语句，以达到执行代码对服务器进行攻击的方法。
2. **优势二：性能更高**。
   SQL 语句在数据库执行前要经过：SQL 语法解析检查 → 优化 SQL → 编译 SQL → 执行 SQL，并进入缓存。例如依次执行 `delete from user where id = 1;`、`delete from user where id = 2;`、`delete from user where id = 3;` 三条静态 SQL，每条结构都不一样，需要编译 3 次；而 `delete from user where id = ?;` 只需编译 1 次，之后传入不同参数即可复用（3 次执行、1 次编译）。

小结：如何执行预编译 SQL？——用 PreparedStatement + `?` 占位符 + setXxx 传参；为什么要使用预编译 SQL？——安全（防止 SQL 注入）、性能更高。

**MyBatis——介绍**

核心结论：MyBatis 是一款优秀的**持久层框架**，用于**简化 JDBC 的开发**。

- MyBatis 本是 Apache 的一个开源项目 iBatis，2010 年这个项目由 apache 迁移到了 google code，并且改名为 MyBatis。2013 年 11 月迁移到 Github；
- 官网：https://mybatis.org/mybatis-3/zh_CN/index.html

三层架构中的位置：

- **controller（控制层）**：接收请求、响应数据；
- **service（业务层）**：逻辑处理；
- **dao（持久层）**：数据访问——**Mybatis 就工作在这一层**。

对比 JDBC 的逐步操作（注册驱动、获取连接、写 SQL、解析结果、释放资源），Mybatis 的开发"简洁、优雅"，是当今企业开发的主流选择。

**MyBatis——入门程序**

核心结论：使用 Mybatis 查询所有用户数据，只需"建工程、备表、写配置、定接口"四步，SQL 写在 Mapper 接口的注解上。

准备工作与步骤：

1. 创建 SpringBoot 工程、引入 Mybatis 相关依赖；
2. 准备数据库表 user、实体类 User；
3. 配置 Mybatis（在 application.properties 中配置数据库连接信息）；
4. 编写 Mybatis 程序：编写 Mybatis 的持久层接口，定义 SQL（注解/XML）。

细节说明：Mybatis 的持久层接口**命名规范为 XxxMapper**，也称为 **Mapper 接口**。

小结（SpringBoot + Mybatis 入门程序操作步骤）：

- 准备工作：创建 springboot 工程，引入 Mybatis 相关依赖；准备数据库表、实体类；
- application.properties 中配置数据库连接信息；
- 定义 Mapper 接口（@Mapper），编写 SQL。

关于单元测试：SpringBoot 的单元测试类上需要加 **@SpringBootTest** 注解——它会在单元测试运行时，加载 springBoot 的环境。

注意：测试类所在包需要与**引导类包名相同**（或放在引导类所在包的子包下）。

**MyBatis——辅助配置**

**配置 SQL 提示**：

核心结论：默认在 Mybatis 中配置的 SQL 语句是不识别的（不会高亮、没有智能提示），可以做配置解决。

- 产生原因：idea 和数据库没有建立连接，不识别表信息；
- 解决方式：在 idea 中配置 MySQL 数据库连接。

**配置 Mybatis 的日志输出**：

核心结论：默认情况下，在 Mybatis 中，SQL 语句执行时看不到 SQL 语句的执行日志；加入如下配置，即可查看日志。

```properties
#mybatis的配置
mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl
```

加上这条配置后，控制台会打印出真正执行的 SQL 语句、参数与返回结果，便于调试。

**JDBC VS Mybatis**

核心结论：相比 JDBC 的"硬编码、繁琐、资源浪费、性能降低"，SpringBoot + Mybatis 只需一个配置（application.properties）加一个 Mapper 接口。

JDBC 方式操作查询（对比用，完整代码）：

```java
//1.准备工作
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/web";
Connection connection = DriverManager.getConnection(url, "root", "1234");
PreparedStatement ps = connection.prepareStatement("select * from user");

//2. 执行SQL, 处理结果
List<User> userList = new ArrayList<>();
ResultSet resultSet = ps.executeQuery();
while (resultSet.next()) {
    int id = resultSet.getInt("id");
    String username = resultSet.getString("username");
    String name = resultSet.getString("name");
    String password = resultSet.getString("password");
    int age = resultSet.getInt("age");
    User user = new User(id, username, password, name, age);
    userList.add(user);
}

//3.释放资源
resultSet.close();
ps.close();
connection.close();
```

可以看到 JDBC 的问题：**硬编码**（url、账号密码、SQL 都写死在代码里）、**繁琐**（大量重复的取值、封装代码）、**资源浪费**（每次都要获取/释放连接）、**性能降低**。

SpringBoot + Mybatis 方式：

application.properties（数据库连接信息交给配置文件）：

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/web
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=1234
```

UserMapper（只需一个接口 + 注解 SQL）：

```java
@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> findAll();
}
```

对比之下，MyBatis 不需要手写驱动加载、连接获取、结果封装、资源释放——这些都由框架完成，这就是"持久层框架简化 JDBC 开发"的含义。

**数据库连接池**

核心结论：数据库连接池是个容器，负责分配、管理数据库连接（Connection）；它让应用可以**重复使用**现有连接，而不是每次重新建立。

- 数据库连接池是个容器，负责分配、管理数据库连接（Connection）；
- 它允许应用程序重复使用一个现有的数据库连接，而不是再重新建立一个；
- 释放空闲时间超过最大空闲时间的连接，来避免因为没有释放连接而引起的数据库连接遗漏。

优势：

- 资源重用；
- 提升系统响应速度；
- 避免数据库连接遗漏。

**常见产品**：

- **Druid（德鲁伊）**：Druid 连接池是阿里巴巴开源的数据库连接池项目；功能强大，性能优秀，是 Java 语言最好的数据库连接池之一；
- **C3P0**；
- **DBCP**；
- **Hikari**：SpringBoot 默认使用的连接池。

**标准接口**：DataSource——官方（sun）提供的数据库连接池接口，由第三方组织实现此接口；功能：获取连接。

**切换数据库连接池（切换为 Druid）**：

pom.xml 中引入 Druid 起步依赖：

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid-spring-boot-starter</artifactId>
    <version>1.2.19</version>
</dependency>
```

application.properties 中配置连接池类型：

```properties
spring.datasource.type=com.alibaba.druid.pool.DruidDataSource
spring.datasource.url=jdbc:mysql://localhost:3306/web
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=1234
```

小结：数据库连接池是一个容器，负责分配、管理数据库连接（Connection）；优势：资源复用、提升系统响应速度；接口：DataSource；产品：C3P0、DBCP、Druid、Hikari（默认）。

**MyBatis——增删改查操作**

核心结论：Mybatis 中通过 @Delete/@Insert/@Update/@Select 注解即可完成增删改查，SQL 中用 `#{}` 引用参数。

**删除用户——delete**

需求：根据 ID 删除用户信息。

SQL：`delete from user where id = 5;`

Mapper 接口（参数用 `#{}` 动态传递）：

```java
@Delete("delete from user where id = #{id}")
public void deleteById(Integer id);
```

注意：DML 语句执行完毕的返回值，表示该 DML 语句执行完毕**影响的行数**，也可以接收返回值：

```java
@Delete("delete from user where id = #{id}")
public Integer deleteById(Integer id);
```

**Mybatis 中的 # 号与 $ 号**（面试题）：

| 符号 | 说明 | 场景 | 优缺点 |
| --- | --- | --- | --- |
| #{…} | 占位符。执行时，会将 #{…} 替换为 ?，生成预编译 SQL | 参数值传递 | 安全、性能高（推荐） |
| ${…} | 拼接符。直接将参数拼接在 SQL 语句中，存在 SQL 注入问题 | 表名、字段名动态设置时使用 | 不安全、性能低 |

示例对比：

```java
@Delete("delete from dept where id = #{id}")
```

```java
@Select("select id,name,score from ${tableName} order by ${sortField}")
```

小结（面试题）：Mybatis 中 # 与 $ 的区别是什么？——# 是占位符，会替换为 ? 生成预编译 SQL（推荐）；$ 是字符串拼接符号，将参数值直接拼接在 SQL 中。

**新增用户——insert**

需求：添加一个用户。

SQL：`insert into user(username,password,name,age) values('zhouyu','123456','周瑜',20);`

Mapper 接口（`#{}` 中写的是**对象属性名**）：

```java
@Insert("insert into user(username,password,name,age) values(#{username},#{password},#{name},#{age})")
public void insert(User user);
```

**修改用户——update**

需求：根据 ID 更新用户信息。

SQL：`update user set username = 'zhouyu', password = '123456', name = '周瑜', age = 20 where id = 1;`

Mapper 接口：

```java
@Update("update user set username=#{username}, password=#{password}, name=#{name}, age=#{age} where id=#{id}")
public void update(User user);
```

**查询用户——select**

需求：根据用户名和密码查询用户信息。

SQL：`select * from user where username = 'zhouyu' and password = '123456';`

Mapper 接口（多个参数用 @Param 起名）：

```java
@Select("select * from user where username=#{username} and password=#{password}")
public User findByUsernameAndPassword(@Param("username") String uname, @Param("password") String pwd);
```

细节说明：**@Param 注解的作用是为接口的方法形参起名字**（对应 `#{}` 中的名称）。

补充说明：基于官方骨架创建的 springboot 项目中，接口编译时会保留方法形参名，@Param 注解**可以省略**（`#{}` 中直接写形参名）：

```java
@Select("select * from user where username=#{uname} and password=#{pwd}")
public User findByUsernameAndPassword(String uname, String pwd);
```

**MyBatis——XML 映射配置**

核心结论：在 Mybatis 中，既可以通过注解配置 SQL 语句，也可以通过 **XML 配置文件**配置 SQL 语句；XML 映射文件必须遵守"同包同名 + namespace 全限定名 + id 与方法名一致"三条规则。

三条规则：

1. XML 映射文件的名称与 Mapper 接口名称一致，并且将 XML 映射文件和 Mapper 接口放置在**相同包下**（同包同名）；
2. XML 映射文件的 **namespace 属性为 Mapper 接口全限定名**一致；
3. XML 映射文件中 sql 语句的 **id 与 Mapper 接口中的方法名**一致，并保持返回类型一致。

**MybatisX** 是一款基于 IDEA 的快速开发 Mybatis 的插件，为效率而生（可在 IDEA 插件市场安装，方便接口与 XML 之间跳转）。

到底使用注解开发还是 XML 开发？——使用 Mybatis 的注解，主要是来完成一些**简单的增删改查**功能；如果需要实现**复杂的 SQL** 功能，建议使用 **XML** 来配置映射语句。官方说明：https://mybatis.net.cn/getting-started.html

小结（XML 映射文件的定义规则）：XML 文件名称与 Mapper 接口名称一致，并且放置在相同包下（同包同名）；XML 文件的 namespace 属性为 Mapper 接口全限定名一致；XML 文件中 sql 语句的 id 与 Mapper 接口中的方法名一致。

**SpringBoot 配置文件**

核心结论：SpringBoot 项目提供了多种属性配置方式（properties、yaml、yml）；application.properties 配置多了会显得臃肿、层级结构不清晰，yml 格式更简洁、以数据为中心。

**application.properties** 的问题：臃肿、层级结构不清晰。

```properties
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/web01
spring.datasource.username=root
spring.datasource.password=1234
```

**application.yaml / application.yml**（同样的配置，层级结构清晰）：

```yaml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/web01
    username: root
    password: 1234
```

**yml 配置文件格式**：

- 数值前边必须有**空格**，作为分隔符（如 `port: 8080`，冒号后面必须有空格）；
- 使用**缩进**表示层级关系，缩进时，**不允许使用 Tab 键，只能用空格**（idea 中会自动将 Tab 转换为空格）；
- 缩进的空格数目不重要，只要相同层级的元素左侧对齐即可；
- `#` 表示注释，从这个字符一直到行尾，都会被解析器忽略。

配置示例：

```yaml
#配置服务器相关信息
server:
  port: 8080
  address: 127.0.0.1
```

**定义对象/Map 集合**：

```yaml
user:
  name: 张三
  age: 18
  password: 123456
```

**定义数组/List/Set 集合**：

```yaml
hobby:
  - java
  - game
  - sport
```

注意：在 yml 格式的配置文件中，如果配置项的值是以 **0 开头**的，值需要使用 `''` 引起来，因为以 0 开头在 yml 中表示 **8 进制**的数据。

⚠️ 问题：课件"配置文件格式"一页中，properties 与 yml 示例的驱动类名写的是 `com.mysql.jdbc.Driver`（旧版类名），而课件前面"JDBC VS Mybatis"一页及依赖版本（mysql-connector-j 8.0.33）用的是 `com.mysql.cj.jdbc.Driver`——前后写法不一致；在 MySQL Connector/J 8.x 下使用旧类名会输出弃用警告。
修正建议：统一写成新类名 `com.mysql.cj.jdbc.Driver`。

小结：SpringBoot 支持哪几类配置文件？——application.properties、application.yaml、application.yml；yml 配置文件的特点及格式？——简洁、以数据为中心，用缩进表示层级、冒号后必须跟空格、不允许 Tab 缩进；注意 yml 配置文件中以 0 开头的值表示八进制，如果想表示其本身含义，需要用 `''` 引起来。

小结：本章围绕"JDBC 原理 → JDBC 入门与查询 → 预编译 SQL → MyBatis 简化开发 → 连接池 → MyBatis 增删改查与 XML 映射 → SpringBoot 配置文件"展开。JDBC 五步（注册驱动、获取连接、执行对象、执行 SQL、释放资源）是理解一切的底层基础；MyBatis 用 Mapper 接口 + 注解/XML 把 JDBC 的繁琐编码全部屏蔽；`#{}` 与 `${}` 的区别、@Param 的作用、XML 映射三规则、yml 格式要点是本章的高频考点。

### 第九章：Web后端实战——部门管理

**实战项目介绍：Tlias 智能学习辅助系统**

核心结论：从本章开始进入 **Web 后端实战**——开发"Tlias 智能学习辅助系统"；这是对整个后端基础知识的综合运用。

课程全景回顾（Web 开发(AI)）：

- Web 前端基础：HTML、CSS、JavaScript、Vue3；
- Web 后端基础：Maven、Web 基础知识；
- Web 后端实战：MySQL、JDBC、Mybatis、Tlias 案例；
- Web 前端实战：Tlias 案例；
- Web 项目部署：Linux、Docker。

项目需求清单：

- **部门管理**：查询、新增、修改、删除；
- **员工管理**：查询、新增、修改、删除；
- **文件上传**；
- **报表统计**；
- **登录认证**；
- **日志管理**；
- **班级、学员管理**（实战内容）。

本份课件（部门管理）的章节结构：**准备工作、查询部门、删除部门、新增部门、修改部门、日志技术**。其中"准备工作"又包含：开发规范-开发模式、开发规范-Restful 风格、工程搭建。

**开发规范——开发模式**

核心结论：当前最为主流的开发模式是**前后端分离**；它解决了传统前后端混合开发"难以维护、分工不明确、不便管理"的问题。

**前后端混合开发**的问题：难以维护、分工不明确、不便管理。

**前后端分离开发**（当前最为主流的开发模式）：

- 前端开发与后端开发通过**接口文档**协作：双方阅读接口文档进行开发，前端负责接收原型+需求进行页面开发，后端负责接口开发；
- 核心思想：以**接口文档**为桥梁——前端开发读接口文档、后端开发读接口文档，请求与响应遵循文档约定。

完整的开发流程：

1. 需求分析；
2. 接口设计（产出 **API 接口文档**）；
3. 前后端并行开发（遵守规范）；
4. 测试（前端、后端分别测试）；
5. 前后端联调测试。

小结：什么是前后端分离开发？——前端项目、后端项目开发和部署都是分开的；具体的开发流程？——需求分析 -> 接口设计 -> 前后端并行开发 -> 测试 -> 联调。

**开发规范——RESTful 风格**

核心结论：REST（REpresentational State Transfer，表述性状态转换）是一种软件架构风格；它的核心是 **URL 定位资源、HTTP 动词描述操作**，使接口"简洁、规范、优雅"。

**传统风格 url** 的问题（不规范、难维护）——同一个操作有多种命名方式，没有统一标准：

| 传统风格url | 请求方式 | 含义 |
| --- | --- | --- |
| http://localhost:8080/user/getById?id=1 | GET | 查询id为1的用户 |
| http://localhost:8080/user/saveUser | POST | 新增用户 |
| http://localhost:8080/user/updateUser | POST | 修改用户 |
| http://localhost:8080/user/deleteUser?id=1 | GET | 删除id为1的用户 |

例如"新增用户"就出现了 `/user/addUser`、`/user/add`、`/user/insertUser`、`/user/insert`、`/user/saveUser`、`/user/save` 这么多写法，混乱难维护。

**REST 风格 url**（URL 定位资源、HTTP 动词描述操作、简洁规范优雅）：

| REST风格url | 请求方式 | 含义 |
| --- | --- | --- |
| http://localhost:8080/users/1 | GET | 查询id为1的用户 |
| http://localhost:8080/users/1 | DELETE | 删除id为1的用户 |
| http://localhost:8080/users | POST | 新增用户 |
| http://localhost:8080/users | PUT | 修改用户 |

对比要点：

- URL 中只出现**资源名**（users）与**资源标识**（1），不再出现动词（如 getById、saveUser）；
- 操作语义由 HTTP 请求方式表达：**GET 查询、POST 新增、PUT 修改、DELETE 删除**；
- 注意：REST 是风格，是约定方式，约定不是规定，可以打破；
- 描述功能模块通常使用**复数形式（加 s）**，表示此类资源，而非单个资源。如：users、books...。

小结：REST 风格的特点？——URL 定义资源、HTTP 动词描述操作；REST 风格中的四种请求方式及对应的操作？——GET：查询、POST：新增、PUT：修改、DELETE：删除。

**接口测试工具 Apifox**

核心结论：前后端并行开发时，需要借助接口测试工具进行接口请求测试和 Mock 数据——**Apifox** 就是一款集 Api 文档、Api 调试、Api Mock、Api 测试于一体的一体化协作平台。

两个思考（为什么需要它）：

- 前后端都在并行开发，后端开发完对应的接口之后，如何对接口进行请求测试呢？
- 前后端都在并行开发，前端开发过程中，如何获取到数据，测试页面的渲染展示呢？

- 介绍：Apifox 是一款集成了 Api 文档、Api 调试、Api Mock、Api 测试的一体化协作平台；
- 作用：接口文档管理、接口请求测试、Mock 服务；
- 官网：https://apifox.com/

为什么要使用 Apifox？——由于浏览器地址栏发起的请求，都是 GET 方式的请求，如果我们需要发起 POST、PUT、DELETE 方式的请求，就需要借助于这类工具。

**工程搭建**

核心结论：实战项目从前端"原型 + 需求"出发，按三步搭建工程骨架：建工程引依赖、建库表配连接、准备基础代码（实体类 + 统一响应结果封装类）。

步骤：

1. 创建 SpringBoot 工程，并引入 web 开发起步依赖、mybatis、mysql 驱动、lombok；
2. 创建数据库表 dept，并在 application.yml 中配置数据库的基本信息；
3. 准备基础代码结构，并引入实体类 Dept 及统一的响应结果封装类 Result。

**统一的响应结果封装类 Result**：

为什么需要它？如果后端直接响应原始数据（如 `{"id": 1, "name": "教研部", "updateTime": "2024-10-20 00:00:00"}` 或数组 `[{...}]`），前端处理时"不便管理、难以维护"；统一封装后，所有接口响应格式一致。

响应规范：

```json
{
  "code": 1,
  "msg": "操作成功",
  "data": …
}
```

```json
{
  "code": 0,
  "msg": "密码错误",
  "data": …
}
```

Result 类代码：

```java
@Data
public class Result {
   private Integer code; //编码：1成功，0为失败
   private String msg; //错误信息
   private Object data; //数据
}
```

细节说明：code 为 1 表示成功、0 表示失败；data 使用 Object 类型，可以存放任意返回数据（对象、集合等）。

**查询部门——接口开发**

需求：根据页面原型，实现部门列表的查询接口。

**思路分析——三层架构每一层的职责**：

- **Controller**：接收请求、调用 Service 层、响应结果；
- **Service**：调用 Mapper 接口方法；
- **Mapper**：执行 SQL——`select * from dept order by update_time desc;`

**功能实现**（三层代码）：

Controller（接收请求，处理响应）：

```java
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public Result findAll(){
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }
}
```

Service（业务处理）：

```java
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }
}
```

Dao/Mapper（数据访问操作——增删改查）：

```java
@Mapper
public interface DeptMapper {
    /**
     * 查询全部部门
     */
   @Select("select * from dept order by update_time desc")
   public List<Dept> findAll();
}
```

**数据封装**

核心结论：实体类属性名和数据库表查询返回的字段名一致，Mybatis 会**自动封装**；如果不一致，不能自动封装。

解决方案（三种）：

1. **手动结果映射**：通过 @Results 及 @Result 进行手动结果映射：

```java
@Results({
    @Result(column = "create_time", property = "createTime"),
    @Result(column = "update_time", property = "updateTime")
})
@Select("select id, name, create_time, update_time from dept order by update_time desc")
public List<Dept> findAll();
```

2. **起别名**：在 SQL 语句中，对不一样的列名起别名，别名和实体类属性名一样：

```java
@Select("select id, name, create_time createTime, update_time updateTime from dept ...")
public List<Dept> findAll();
```

3. **开启驼峰命名**（推荐）：如果字段名与属性名符合驼峰命名规则，mybatis 会自动通过驼峰命名规则映射：

```yaml
mybatis:
  configuration:
    map-underscore-to-camel-case: true
```

小结：Mybatis 默认数据封装的规则？——实体类属性名和数据库表的字段名一致，mybatis 会自动封装；如果字段名与实体类属性名不一致，如何解决？——手动结果映射 @Results、@Result；起别名；开启驼峰命名开关（要求：xxx_abc -> xxxAbc）。

**前后端联调测试**

核心结论：前后端的联调测试就是启动前端工程（Nginx）与后端工程，让真实的浏览器请求打到后端接口上，验证数据是否能正常渲染。

操作步骤：

1. 将资料中提供的前端工程文件夹中的压缩包，拷贝到一个**没有中文、不带空格**的目录下，解压；
2. 启动 nginx，访问测试：http://localhost:90 。

**Nginx 的反向代理**：

- 问题：前端工程请求服务器的地址为 `http://localhost:90/api/depts`，是如何访问到后端的 tomcat 服务器（8080）的？
- 答案：**Nginx 的反向代理**。

反向代理是一种网络架构，通过代理服务器为后端的服务器做代理，客户端的请求直接请求代理服务器，然后转发给后端的服务器（安全、灵活、负载均衡）。

Nginx/conf/nginx.conf 配置：

```
server {
  listen 90;
  #省略...
  location ^~ /api/ {
    rewrite ^/api/(.*)$ /$1 break;
    proxy_pass http://localhost:8080;
  }
}
```

配置指令说明：

- **location**：用于定义匹配路径匹配的规则；
- **^~ /api/**：表示精确匹配，即只匹配以 /api/ 开头的路径；
- **rewrite**：该指令用于重写匹配到的路径（`rewrite ^/api/(.*)$ /$1 break;` 把 `/api/xxx` 重写为 `/xxx`）；
- **proxy_pass**：该指令用于代理转发，它将匹配到的请求转发给位于后端的指令服务器（这里转发给 http://localhost:8080）。

流程理解：浏览器请求 `http://localhost:90/api/depts` → Nginx 匹配到 `/api/` 前缀 → 重写路径为 `/depts` → 转发到 `http://localhost:8080/depts`（后端 Tomcat）。

小结：什么是反向代理？——反向代理是一种网络架构技术，通过反向代理服务器为后端服务器做代理（安全、灵活、负载均衡）；Nginx 中反向代理的配置？——location（定义路径匹配方式）+ rewrite（路径重写指令）+ proxy_pass（代理转发指令）。

**删除部门——需求分析**

需求：根据 ID 删除部门。

- 删除的条件：主键 ID。

**思路分析——三层架构每一层的职责**：

- **Controller**：接收请求参数（/depts?id=8）、调用 Service 层、响应结果；
- **Service**：调用 Mapper 接口方法；
- **Mapper**：执行 SQL——`delete from dept where id = ?`

**Controller 接收参数**（简单参数）——接收请求参数：`DELETE /depts?id=8`

方式一：通过原始的 HttpServletRequest 对象获取请求参数（繁琐、手动类型转换）：

```java
@DeleteMapping("/depts")
public Result delete(HttpServletRequest request){
    String idStr = request.getParameter("id");
    int id = Integer.parseInt(idStr);
    System.out.println("根据ID删除部门: " + id);
    return Result.success();
}
```

方式二：通过 Spring 提供的 @RequestParam 注解，将请求参数绑定给方法形参：

```java
@DeleteMapping("/depts")
public Result delete(@RequestParam("id") Integer deptId){
    System.out.println("根据ID删除部门: " + deptId);
    return Result.success();
}
```

注意：@RequestParam 注解 **required 属性默认为 true**，代表该参数必须传递，如果不传递将报错。如果参数可选，可以将属性设置为 false。

方式三：如果请求参数名与形参变量名相同，**直接定义方法形参**即可接收（省略 @RequestParam）：

```java
@DeleteMapping("/depts")
public Result delete(@RequestParam("id") Integer id){
    System.out.println("根据ID删除部门: " + id);
    return Result.success();
}
```

小结（简单参数接收方式）：

- 方式一：通过原始的 HttpServletRequest 对象获取——`String xxx = request.getParameter("xxx");`
- 方式二：通过 @RequestParam 注解进行参数绑定——`public Result del(@RequestParam("id")Integer deptId){}`
- 方式三：保证请求参数名与形参变量名相同，直接接收（推荐）；
- 注意事项：一旦加了 @RequestParam 注解，该参数必须传递，因为默认 required 为 true。

**删除部门——功能实现**：

Controller：

```java
@DeleteMapping("/depts")
public Result delete(Integer id){
    System.out.println("根据ID删除部门数据: " + id);
    deptService.delete(id);
    return Result.success();
}
```

Service：

```java
@Override
public void delete(Integer id) {
    deptMapper.delete(id);
}
```

Mapper：

```java
@Delete("delete from dept where id = #{id}")
void delete(Integer id);
```

**新增部门——需求分析**

需求：往 dept 表插入一条数据。

**思路分析——三层架构每一层的职责**：

- **Controller**：接收请求参数（/depts，请求体 `{"name":"教研部"}`）、调用 Service 层、响应结果；
- **Service**：**补全基础属性**（create_time、update_time 由后端生成）；
- **Mapper**：执行 SQL——`insert into dept (name,create_time,update_time) values (?,?,?)`

**Controller 接收参数**（JSON 格式参数）：

核心结论：JSON 格式的参数，通常会使用一个实体对象进行接收。

规则：JSON 数据的**键名与方法形参对象的属性名相同**，并需要使用 **@RequestBody** 注解标识。

接收 json 格式的请求参数：`POST /depts  {"name":"教研部"}`

```java
@PostMapping("/depts")
public Result add(@RequestBody Dept dept){
    System.out.println("添加部门: " + dept);
    deptService.add(dept);
    return Result.success();
}
```

实体类 Dept：

```java
public class Dept {
    private Integer id;
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
```

**新增部门——功能实现**：

Controller：

```java
@PostMapping("/depts")
public Result add(@RequestBody Dept dept){
    System.out.println("添加部门: " + dept);
    deptService.add(dept);
    return Result.success();
}
```

Service（补全基础属性）：

```java
@Override
public void add(Dept dept) {
    dept.setCreateTime(LocalDateTime.now());
    dept.setUpdateTime(LocalDateTime.now());
    deptMapper.add(dept);
}
```

Mapper：

```java
@Insert("insert into dept(name, create_time, update_time) values(#{name}, #{createTime}, #{updateTime})")
void add(Dept dept);
```

小结：如何接收 JSON 格式的请求参数？——通常通过实体对象接收，保证 json 格式的键名与对象属性名保持一致，并添加 @RequestBody 注解；json 格式的请求参数适用场景？——主要在 POST、PUT 请求中，在请求体传递请求参数。

**修改部门——查询回显**

需求：修改部门包含两个功能——**查询回显**、**修改数据**。查询回显即"根据 ID 查询部门"，把数据填充回页面表单。

**需求分析**：根据 ID 查询部门。

**思路分析——三层架构每一层的职责**：

- **Controller**：接收请求参数（/depts/1，**路径参数**）、调用 Service 层、响应结果；
- **Service**：调用 Mapper 接口方法；
- **Mapper**：执行 SQL——`select * from dept where id = ?`

**Controller 接收参数**（路径参数）：

核心结论：路径参数是通过请求 URL 直接传递的参数，使用 `{…}` 来标识该路径参数，需要使用 **@PathVariable** 获取路径参数。

接收请求参数（路径参数）：`GET /depts/1`

```java
@GetMapping("/depts/{id}")
public Result getInfo(@PathVariable("id") Integer deptId){
    System.out.println("根据ID查询部门数据: " + deptId);
    Dept dept = deptService.getInfo(id);
    return Result.success(dept);
}
```

如果路径参数名与形参变量名相同，@PathVariable 注解的 value 属性可以省略：

```java
@GetMapping("/depts/{id}")
public Result getInfo(@PathVariable Integer id){
    System.out.println("根据ID查询部门数据: " + id);
    Dept dept = deptService.getInfo(id);
    return Result.success(dept);
}
```

⚠️ 问题：课件第一段代码中，方法形参定义为 `@PathVariable("id") Integer deptId`，但方法体内调用写成 `deptService.getInfo(id)`——`id` 这个变量并不存在（形参名是 deptId），代码无法编译。
修正建议：调用处应与形参名保持一致，写为 `deptService.getInfo(deptId)`（或把形参名直接定义为 `id`，即第二种简化写法）。

**查询回显——功能实现**：

Controller：

```java
@GetMapping("/depts/{id}")
public Result getInfo(@PathVariable Integer id){
    System.out.println("根据ID查询部门数据: " + id);
    Dept dept = deptService.getInfo(id);
    return Result.success(dept);
}
```

Service：

```java
@Override
public Dept getInfo(Integer id) {
    return deptMapper.getById(id);
}
```

Mapper：

```java
@Select("select id, name, create_time, update_time from dept where id = #{id}")
Dept getById(Integer id);
```

小结：如何接收路径参数？——@PathVariable 注解来声明获取的是路径参数；在 url 中是否可以携带多个路径参数呢，如：/depts/1/0？——可以。

**修改部门——修改数据**

**思路分析**（参照接口文档）——三层架构每一层的职责：

- **Controller**：接收请求参数（json 格式，`{"id":1,"name":"教研部"}`）、调用 Service 层、响应结果；
- **Service**：**补全基础属性**（update_time）；
- **Mapper**：执行 SQL——`update dept set name = ? , update_time = ? where id = ?`

**功能实现**：

Controller：

```java
@PutMapping("/depts")
public Result update(@RequestBody Dept dept){
    System.out.println("修改部门数据: " + dept);
    deptService.update(dept);
    return Result.success();
}
```

Service：

```java
@Override
public void update(Dept dept) {
    dept.setUpdateTime(LocalDateTime.now());
    deptMapper.update(dept);
}
```

Mapper：

```java
@Update("update dept set name = #{name}, update_time = #{updateTime} where id = #{id}")
void update(Dept dept);
```

**@RequestMapping 注解**

核心结论：一个完整的请求路径，应该是**类上的 @RequestMapping 的 value 属性 + 方法上的 @RequestMapping 的 value 属性**。

小结：@RequestMapping 注解可以加在哪儿？——类上（可选的）、方法上；一个完整的请求路径 = 类上 + 方法上的。

**日志技术**

核心结论：程序中的日志用来记录应用程序的运行信息、状态信息、错误信息等；它能解决 System.out.println "只能输出到控制台、不便于扩展维护"的问题。

- 为什么需要日志：System.out.println 只能输出到控制台、不便于扩展、维护；
- 程序中的日志，好比生活中的日记，可以记录你生活中的点点滴滴——程序中用来记录应用程序的运行信息、状态信息、错误信息等；
- 日志的作用：**数据追踪、性能优化、问题排查、系统监控**。

常见日志框架：

- **JUL**：这是 JavaSE 平台提供的官方日志框架，也被称为 JUL（java.util.logging）。配置相对简单，但不够灵活，性能较差；
- **Log4j**：一个流行的日志框架，提供了灵活的配置选项，支持多种输出目标；
- **Logback**：基于 Log4j 升级而来，提供了更多的功能和配置选项，性能优于 Log4j；
- **Slf4j**（Simple Logging Facade for Java）：简单日志门面，提供了一套日志操作的标准接口及抽象类，允许应用程序使用不同的底层日志框架。

课件 Logback 部分的知识结构：Logback 快速入门、Logback 配置文件详解、Logback 日志级别。

**Logback 快速入门**

核心结论：两步上手——引入依赖（配置文件）+ 定义 Logger 对象记录日志。

准备工作：

- 引入 logback 的依赖（springboot 项目中该依赖已传递）：

```xml
<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.4.11</version>
</dependency>
```

- 配置文件 logback.xml。

记录日志：定义日志记录对象 Logger，记录日志：

```java
private static final Logger log = LoggerFactory.getLogger(LogTest.class);
@Test
public void testLog(){
    log.debug("开始计算...");
    int sum = 0;
    int[] nums = {1, 5, 3, 2, 1, 4, 5, 4, 6, 7, 4, 34, 2, 23};
    for (int i = 0; i <= nums.length; i++) {
        sum += nums[i];
    }
    log.info("计算结果为: "+sum);
    log.debug("结束计算...");
}
```

⚠️ 问题：课件代码中循环条件写成 `for (int i = 0; i <= nums.length; i++)`，当 i 等于 nums.length 时访问 `nums[nums.length]` 会数组越界，程序运行抛出 ArrayIndexOutOfBoundsException。
修正建议：循环条件应改为 `i < nums.length`。

小结：Logback 记录日志的步骤？——引入 logback 的依赖、配置文件 logback.xml；定义日志记录对象 Logger，调用方法（debug/info/…）记录日志。

**Logback 配置文件详解**

核心结论：logback.xml 是对 Logback 输出的日志进行控制的配置文件，可以配置输出的格式、位置及日志开关等。

- 配置文件名：logback.xml；
- 该配置文件是对 Logback 日志框架输出的日志进行控制的，可以来配置输出的格式、位置及日志开关等；
- 常用的两种输出日志的位置：**控制台、系统文件**。

```xml
<!-- 控制台输出 -->
<appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">...</appender>

<!-- 系统文件输出 -->
<appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">...</appender>

<root level="ALL">
    <appender-ref ref="STDOUT" />
    <appender-ref ref="FILE" />
</root>
```

细节说明：root 标签中 level 可以开启日志（ALL）、关闭日志（OFF）；`<appender-ref>` 引用上面定义的两个输出位置——即日志同时输出到控制台与文件。

**Logback 日志级别**

核心结论：日志级别指的是日志信息的类型，常见级别由低到高为 trace、debug、info、warn、error。

| 日志级别 | 说明 | 记录方式 |
| --- | --- | --- |
| trace | 追踪，记录程序运行轨迹【使用很少】 | log.trace("...") |
| debug | 调试，记录程序调试过程中的信息，实际应用中一般将其视为最低级别【使用较多】 | log.debug("...") |
| info | 记录一般信息，描述程序运行的关键事件，如：网络连接、io操作【使用较多】 | log.info("...") |
| warn | 警告信息，记录潜在有害的情况【使用较多】 | log.warn("...") |
| error | 错误信息【使用较多】 | log.error("...") |

```xml
<root level="info">
    <appender-ref ref="STDOUT" />
    <appender-ref ref="FILE" />
</root>
```

细节说明：可以在配置文件中，灵活的控制输出哪些类型的日志——**大于等于配置的日志级别的日志才会输出**（例如配置 level="info"，则 info、warn、error 输出，trace、debug 不输出）。

**优化案例日志记录**

核心结论：实战项目中将原有的 System.out.println 替换为日志记录——使用 **@Slf4j** 注解即可省略手写 Logger 对象。

```java
@RestController
public class DeptController {
    private static final Logger log = LoggerFactory.getLogger(DeptController.class);

    @Autowired
    private DeptService deptService;

    /**
     * 根据ID删除部门
     */
    @DeleteMapping("/depts")
    public Result delete(Integer id){
        log.info("根据ID删除部门: {}", id); //System.out.println("根据ID删除部门: " + id);
        deptService.delete(id);
        return Result.success();
    }
}
```

配合 logback.xml 的 root 配置使用：

```xml
<root level="info">
    <appender-ref ref="STDOUT" />
    <appender-ref ref="FILE" />
</root>
```

细节说明：

- 加上 **@Slf4j** 注解后，可以直接使用 `log` 对象，不再需要手写 `LoggerFactory.getLogger(...)`；
- 日志参数使用 **{} 占位符**：`log.info("根据ID删除部门: {}", id)` 比字符串拼接更高效优雅。

小结：Logback 日志级别有哪些，依次从低到高？——trace, debug, info, warn, error；常用的有哪些？具体的使用场景？——debug：记录程序的调试信息；info：记录正常系统运行日志、重要信息；error：记录错误异常信息。

小结：本章以一个完整的部门管理模块贯穿了 Web 后端实战的开发流程：先理解前后端分离与 RESTful 规范，用 Apifox 测接口，搭建带 Result 统一响应封装的工程；然后逐功能实现查询（三层职责、数据封装）、删除（简单参数三种接收方式）、新增（JSON 参数 @RequestBody）、修改（路径参数 @PathVariable + @PutMapping）；最后引入日志技术，用 Logback（@Slf4j、占位符、级别配置）替换 System.out.println。三层职责划分、请求参数接收方式（简单参数/路径参数/JSON 参数）是本章的核心考点。

### 第十章：Web后端实战——员工管理

**员工管理需求总览**

核心结论：员工管理是 Tlias 系统的核心模块，比部门管理复杂得多——它涉及多表设计（员工表 + 工作经历表）、多表查询、分页查询、事务管理、文件上传、异常处理、数据统计等知识点，本章由三份课件组成。

三份课件的内容结构：

- 第一份：多表关系、多表查询、员工列表查询（准备工作、分页查询、条件分页查询）；
- 第二份：新增员工、事务管理（介绍与操作、四大特性）、文件上传（简介、本地存储、阿里云OSS）；
- 第三份：删除员工、修改员工（查询回显、修改数据）、异常处理、员工信息统计（职位统计、性别统计）。

**多表关系——概述**

核心结论：项目开发中，在进行数据库表结构设计时，会根据业务需求及业务模块之间的关系，分析并设计表结构；由于业务之间相互关联，所以各个表结构之间也存在着各种联系。

多表关系分为三种：

1. **一对多（多对一）**；
2. **一对一**；
3. **多对多**。

**一对多关系**

场景：部门与员工的关系（一个部门下有多个员工）。一的一方是父表，多的一方是子表（员工表为子表、部门表为父表）。

建表语句（部门表与员工表）：

```sql
create table dept(
  id int unsigned primary key auto_increment comment 'ID',
  name varchar(10) not null unique comment '部门名称',
  create_time datetime comment '创建时间',
  update_time datetime comment '修改时间'
) comment '部门表' ;

create table emp(
  id int unsigned primary key auto_increment comment 'ID,主键',
  username varchar(20) not null unique comment '用户名',
  password varchar(32) not null comment '密码',
  name varchar(10) not null comment '姓名',
  gender tinyint unsigned not null comment '性别, 1:男, 2:女',
  phone char(11) not null unique comment '手机号',
  job tinyint unsigned comment '职位, 1:班主任,2:讲师...',
  salary int unsigned comment '薪资',
  image varchar(255) comment '头像',
  entry_date date comment '入职日期',
  create_time datetime comment '创建时间',
  update_time datetime comment '修改时间’,
  dept_id int unsigned comment '关联的部门ID’,
) comment '员工表’;
```

⚠️ 问题：课件员工表建表语句有两类语法错误——①从 `update_time` 字段的注释开始出现了**中英文引号混用**（开头是英文单引号 `'`，结尾却是中文右单引号 `’`，如 `comment '修改时间’`、`'关联的部门ID’`、`'员工表’`）；②`dept_id` 是最后一个字段却带了多余逗号（`dept_id int unsigned comment '关联的部门ID’,`）。
修正建议：注释字符串首尾统一使用英文单引号，并删掉最后一个字段 `dept_id` 行尾的逗号，即 `update_time datetime comment '修改时间',`、`dept_id int unsigned comment '关联的部门ID'`、`) comment '员工表';`。按上述修正后语句才能正常执行。

一对多的关系如何实现？——**在数据库表中多的一方，添加字段，来关联一的一方的主键**（员工表中添加 dept_id 字段，关联部门表的 id）。

**外键约束**

核心结论：两张表虽然在字段上建立了关联，但在数据库层面并未建立关联，无法保证数据的一致性和完整性——解决方案是**外键约束**。

- 现象：部门数据可以直接删除，然而还有部分员工归属于该部门下，此时就出现了数据的不完整、不一致问题；
- 原因：目前上述的两张表，在数据库层面，并未建立关联，所以是无法保证数据的一致性和完整性的；
- 解决方案：外键约束。

为字段添加外键约束的语法（可以在创建表时、或表结构创建完成后）：

```sql
-- 创建表时指定
create table 表名(
字段名 数据类型,
...
[constraint] [外键名称] foreign key (外键字段名) references 主表 (字段名)
);
```

```sql
-- 建完表后，添加外键
alter table 表名 add constraint 外键名称 foreign key (外键字段名) references 主表(字段名);
```

**物理外键与逻辑外键**：

- **物理外键**：概念——使用 foreign key 定义外键关联另外一张表。缺点：
  - 影响增、删、改的效率（需要检查外键关系）；
  - 仅用于单节点数据库，不适用与分布式、集群场景；
  - 容易引发数据库的死锁问题，消耗性能。
- **逻辑外键**：概念——在业务层逻辑中，解决外键关联。通过逻辑外键，就可以很方便的解决上述问题。

小结：数据库中的外键约束的作用？——多表操作中保证数据的一致性、完整性和正确性；物理外键与逻辑外键的选择？——逻辑外键（推荐）。

**一对一关系**

- 案例：用户 与 身份证信息 的关系；
- 关系：一对一关系，多用于**单表拆分**，将一张表的基础字段放在一张表中，其他字段放在另一张表中，以提升操作效率；
- 实现：在任意一方加入外键，关联另外一方的主键，并且**设置外键为唯一的（UNIQUE）**。

涉及的表示例：用户基本信息表（tb_user）、用户身份信息表（tb_user_card）。

小结：数据库中如何体现一对一的表关系？——一对一，其实是一种特殊的一对多。在任意一方添加外键，关联另外一方的主键。

**多对多关系**

- 案例：学生 与 课程的关系；
- 关系：一个学生可以选修多门课程，一门课程也可以供多个学生选择；
- 实现：**建立第三张中间表，中间表至少包含两个外键，分别关联两方主键**。

涉及的表示例：学生表（tb_student）、课程表（tb_course）、学生课程关系表（tb_student_course，其中包含 course_id 与 student_id 两个外键字段）。

小结：数据库中如何体现多对多的表关系？——需要建立一张中间表，中间表中有两个外键字段，分别关联两方的主键。

**多表设计案例**

需求：请根据资料中提供的页面原型，设计员工模块涉及到的表结构。

步骤：

1. 阅读页面原型及需求文档，分析各个模块涉及到的表结构，及表结构之间的关系；
2. 根据页面原型及需求文档，分析各个表结构中具体的字段及约束。

**多表查询**

核心结论：多表查询指从多张表中查询数据；多表查询时必须消除无效的**笛卡尔积**，其分类为：连接查询（内连接、外连接）和子查询。

- 多表查询：指从多张表中查询数据；
- **笛卡尔积**：指在数学中，两个集合（A 集合和 B 集合）的所有组合情况（在多表查询时，需要消除无效的笛卡尔积）。

多表查询的分类：

- **连接查询**：
  - **内连接**：相当于查询 A、B 交集部分数据；
  - **外连接**：
    - **左外连接**：查询左表所有数据（包括两张表交集部分数据）；
    - **右外连接**：查询右表所有数据（包括两张表交集部分数据）。
- **子查询**。

**内连接语法**（内连接查询的是两张表交集部分的数据）：

```sql
-- 1.隐式内连接 (常见)
select 字段列表 from 表1 , 表2 where 连接条件 ...;
-- 2.显式内连接
select 字段列表 from 表1 [inner] join 表2 on 连接条件 ... ;
```

给表起别名（简化书写）：

```sql
select 字段列表 from 表1 [as] 别名1, 表2 [as] 别名2 where 条件 ...;
```

注意：一旦为表指定了别名，就要通过别名来指定字段名，而不能再使用表名了。

**外连接语法**（外连接分为左外连接和右外连接）：

```sql
-- 1.左外连接 (常见)
select 字段列表 from 表1 left [outer] join 表2 on 连接条件 ...;
-- 2.右外连接
select 字段列表 from 表1 right [outer] join 表2 on 连接条件 ...;
```

提示：对于外连接，常用的是左外连接，因为右外连接的 SQL 也可以改造成为左外连接（两张表调换个顺序）。

**子查询**：

- 介绍：SQL 语句中嵌套 select 语句，称为嵌套查询，又称子查询；
- 形式：`select * from t1 where column1 = (select column1 from t2 …);`
- 说明：子查询外部的语句可以是 insert / update / delete / select 的任何一个，最常见的是 select；
- 分类：
  - **标量子查询**：子查询返回的结果为单个值；
  - **列子查询**：子查询返回的结果为一列；
  - **行子查询**：子查询返回的结果为一行；
  - **表子查询**：子查询返回的结果为多行多列。

提示：子查询的要点是，先对需求做拆分，明确具体的步骤，然后再逐步编写 SQL 语句。

**多表查询练习**（根据需求，完成多表查询的 SQL 语句编写）：

1. 查询"教研部"的"男性"员工，且在"2011-05-01"之后入职的员工信息；
2. 查询工资低于公司平均工资的且性别为男的员工信息；
3. 查询部门人数超过 10 人的部门名称；
4. 查询在"2010-05-01"后入职，且薪资高于 10000 的"教研部"员工信息，并根据薪资倒序排序；
5. 查询工资低于本部门平均工资的员工信息。

**员工列表查询——需求与准备**

需求：查询所有员工信息，并查询出部门名称（涉及到的表：emp、dept）。

准备工作：

1. 准备数据库表 emp、emp_expr；
2. 准备实体类 Emp、EmpExpr；
3. 准备三层架构的基本代码结构：EmpController、EmpService/EmpServiceImpl、EmpMapper。

课件中的 AI 辅助素材（备注页）：通过给 AI 提供 emp 表建表语句，让 AI 生成封装 emp 表数据的实体类 Emp；再通过提示词（要求：GET /emps、请求参数 page/pageSize、Controller 统一 Result 响应、返回 JSON 包含 total 与 rows 列表——rows 元素包含 id、username、password、name、gender、image、job、salary、entryDate、deptId、deptName、createTime、updateTime 等字段）让 AI 生成基于 SpringBoot + Mybatis 的分页查询接口（EmpController、EmpService、EmpServiceImpl、EmpMapper）。

**员工列表查询——分页查询分析**

核心结论：分页查询需要前后端约定：前端传页码与每页记录数，后端返回数据列表与总记录数；总页数由总记录数计算得出。

- 前端传递给后端的分页参数：
  - 页码：page；
  - 每页展示记录数：pageSize。
- 后端给前端返回的数据：
  - 数据列表：List rows;
  - 总记录数：Long total;
- 总页数计算：500 条数据，每页 10 条：500/10 = 50 页；501 条：501/10 = 50.1 --> 51 页（向上取整）。

分页查询涉及的两条 SQL：

```sql
select * from emp e left join dept d on e.dept_id = d.id limit ?,?;
select count(*) from emp e left join dept d on e.dept_id = d.id;
```

小结：分页查询前端需要给后端传递的参数？——page：当前页码；pageSize：每页展示记录数；分页查询后端需要给前端返回的结果？——total：总记录数；rows：结果列表。

**分页查询——原始方式**

三层架构中，每一层的职责如下：

- **Controller**：接收参数（分页）、调用 Service 进行分页查询获取 PageResult、响应结果；
- **Service**：调用 Mapper 接口查询总记录数、调用 Mapper 接口查询结果列表、封装 PageResult 对象返回；
- **Mapper**：执行 SQL——1. `select count(*) ...`  2. `select ... limit ...`。

请求示例：`/emps?page=1&pageSize=10`

EmpController：

```java
@GetMapping
public Result page(@RequestParam(defaultValue = "1")Integer page,
                   @RequestParam(defaultValue = "10")Integer pageSize) {
    log.info("分页请求参数： {}, {}", page, pageSize);
    PageResult<Emp> pageResult = empService.page(page, pageSize);
    return Result.success(pageResult);
}
```

EmpServiceImpl：

```java
public pageResult<Emp> page(Integer page, Integer pageSize) {
   //1. 获取总记录数
   Long count = empMapper.count();
   //2. 获取每一页的数据列表
   Integer start = (page - 1) * pageSize;
   List<Emp> empList = empMapper.list(start, pageSize);
   //3. 封装分页结果
    return new pageResult<Emp>(count, empList);
}
```

EmpMapper：

```java
@Mapper
public interface EmpMapper {
    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id ")
    public Long count(); //查询总记录数

    @Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id limit #{start},#{pageSize}")
    public List<Emp> list(Integer start , Integer pageSize); //查询结果列表
}
```

细节说明：通过 @RequestParam 注解的 **defaultValue 属性**可以设置参数的默认值。

⚠️ 问题：EmpServiceImpl 中写的是 `public pageResult<Emp> page(...)`，而 EmpController 中用的是 `PageResult<Emp>`——同一分页结果类大小写不一致（pageResult / PageResult），Java 中类名大小写敏感，照抄会导致找不到符号、无法编译。
修正建议：统一类名，均使用 `PageResult<Emp>`（类名首字母大写）。

**分页查询——PageHelper 分页插件**

核心结论：PageHelper 是第三方提供的在 Mybatis 框架中用来实现分页的插件，用来**简化分页操作，提高开发效率**。

对比理解（原始方式 vs PageHelper）：

原始方式 - mapper 层（需要手写两条 SQL）：

```java
//统计符合条件的总记录数
@Select("select count(*) from emp e ... ")
public Long count();
//查询结果列表
@Select("select e.* from emp e ... limit #{start},#{pageSize}")
public List<Emp> list(Integer start , Integer pageSize);
```

原始方式 - service 层（手动计算 start、手动封装）：

```java
public PageResult<Emp> page(Integer page, Integer pageSize) {
    //1. 获取总记录数
    Long total = empMapper.count();
    //2. 获取数据列表
    Integer start = (page - 1) * pageSize;
    List<Emp> empList = empMapper.list(start, pageSize);
    //3. 封装分页结果
    return new PageResult<Emp>(total, empList);
}
```

PageHelper - mapper 层（只写查询，不管分页）：

```java
//查询员工数据
@Select("select e.* from emp e ... ")
public List<Emp> list();
```

PageHelper - service 层（一条 startPage 搞定）：

```java
public PageResult<Emp> page(Integer page, Integer pageSize) {
    //1. 设置分页参数
    PageHelper.startPage(page, pageSize);
    //2. 调用Mapper接口方法
    List<Emp> empList = empMapper.list();
    //3. 解析并封装结果
    return new PageResult(...);
}
```

**使用步骤**：

1. 引入 PageHelper 的依赖：

```xml
<!-- 分页插件PageHelper -->
<dependency>
    <groupId>com.github.pagehelper</groupId>
    <artifactId>pagehelper-spring-boot-starter</artifactId>
    <version>1.4.7</version>
</dependency>
```

2. 定义 Mapper 接口的查询方法（无需考虑分页）：

```java
//查询员工数据
@Select("select e.* from emp e ... ")
public List<Emp> list();
```

3. 在 Service 方法中实现分页查询：

```java
public PageResult<Emp> page(Integer page, Integer pageSize) {
    //1. 设置分页参数
    PageHelper.startPage(page, pageSize);
    //2. 调用Mapper接口方法
    List<Emp> empList = empMapper.list();
    //3. 解析并封装结果
    return new PageResult<Emp>(...);
}
```

**PageHelper 实现机制**：

Mapper 中只写查询：

```java
//查询员工数据
@Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id order by e.update_time desc")
public List<Emp> list();
```

PageHelper 在底层自动补充执行：

```sql
select count(0) from emp e ...
select ... from emp e ... limit ?,?
```

底层拿到"总记录数"和"数据列表"后封装为 `Page<Emp>` 对象供上层解析。

注意事项：

- SQL 语句**结尾不要加分号（;）**；
- PageHelper 只会对**紧跟在其后的第一条 SQL 语句**进行分页处理。

**条件分页查询**

条件分页查询在已实现的分页查询基础上增加过滤条件。请求示例：`/emps?name=张&gender=1&begin=2007-09-01&end=2022-09-01`

三层架构中，每一层的职责如下：

- **Controller**：接收参数（分页、条件）、调用 Service 进行分页查询获取 PageResult、响应结果；
- **Service**：使用 PageHelper 完成分页条件查询、封装 PageResult 对象返回；
- **Mapper**：执行 SQL——`select ... from emp e ... where e.name like ? and e.gender = ? and e.entry_date between ? and ? order by ...`

EmpController：

```java
@GetMapping
public Result page(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "10")Integer pageSize,
                   String name , Integer gender,
                   @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                   @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end){
    log.info("分页查询，参数：{}，{}，{}，{}，{}，{}",page,pageSize,name,gender,begin,end);
    PageResult<Emp> pageResult = empService.page(page,pageSize,name,gender,begin,end);
    return Result.success(pageResult);
}
```

EmpMapper：

```java
public List<Emp> list(String name, Integer gender, LocalDate begin, LocalDate end);
```

EmpMapper.xml：

```xml
<select id="list" resultType="com.itheima.pojo.Emp">
    select e.*, d.name as deptName from emp e left join dept d on e.dept_id = d.id
    where e.name like concat('%',#{name},'%') and e.gender = #{gender} and e.entry_date between #{begin} and #{end}
</select>
```

细节说明：日期时间类型参数接收时，需要通过 **@DateTimeFormat** 注解指定前端传递的日期格式——`@DateTimeFormat(pattern = "yyyy-MM-dd")`。

小结：@RequestParam 注解的使用场景？——接收请求参数、参数名不一致时；设置请求参数的默认值；@DateTimeFormat 的使用场景？——用于接收日期时间类型的参数，指定日期格式。

**条件分页查询——请求参数接收优化**

核心结论：如果 Controller 方法的参数较多且未来可能继续增加，方法签名会变得复杂难以维护，此时可以把多个请求参数**封装为一个对象**。

请求参数：`/emps?name=张&gender=1&begin=2007-09-01&end=2022-09-01&page=1&pageSize=10`

封装类 EmpQueryParam：

```java
@Data
public class EmpQueryParam {
    private Integer page = 1; // 当前页码
    private Integer pageSize = 10; // 每页记录数
    private String name; // 员工姓名
    private Integer gender; // 员工性别
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate begin; // 入职日期
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate end; // 入职日期
}
```

优化后的 EmpController：

```java
@GetMapping
public Result page(EmpQueryParam empQueryParam){
    log.info("分页查询，参数：{}",empQueryParam);
    PageResult<Emp> pageResult = empService.page(empQueryParam);
    return Result.success(pageResult);
}
```

小结（queryString 查询参数接收方式 `/emps?name=xxx&gender=xxx`）：如果参数较少，controller 方法中定义一个一个形参接收；如果参数较多，controller 方法中定义一个对象接收。

**程序优化——动态 SQL**

核心结论：条件分页查询中把所有条件"写死"在 SQL 里不行——查询条件要随着用户输入的变化而变化，这就需要**动态 SQL**。

问题：原 SQL `select * from emp e ... where e.name like ?` 等写法条件写死了；而实际需求中，查询条件随着用户输入的条件变化而变化（可能只按姓名查、只按性别查、按多个条件组合查）。

**动态 SQL** 定义：随着用户的输入或外部条件的变化而变化的 SQL 语句，我们称为动态 SQL。

Mybatis 提供的两个动态 SQL 标签：

- `<if>`：判断条件是否成立，如果条件为 true，则拼接 SQL；

```xml
<if test="gender != null">
   and e.gender = #{gender}
</if>
```

- `<where>`：根据查询条件，来生成 where 关键字，并会自动去除条件前面多余的 and 或 or。

动态查询员工信息的完整写法：

```xml
<select id="list" resultType="com.itheima.pojo.Emp">
    SELECT e.*, d.name AS deptName FROM emp e LEFT JOIN dept d ON e.dept_id = d.id
    <where>
        <if test="name != null and name != ''">
            e.name like concat('%',#{name},'%')
        </if>
        <if test="gender != null">
            and e.gender = #{gender}
        </if>
        <if test="begin != null and end != null">
            and e.entry_date between #{begin} and #{end}
        </if>
    </where>
    order by e.update_time desc
</select>
```

小结：Mybatis 中动态 SQL 的使用场景？——如果 SQL 语句是不固定的，是随着用户的输入或外部条件的变化而变化的；MyBatis 中动态 SQL 的 `<if>` 及 `<where>` 标签的作用？——`<if>` 标签：条件判断，如果条件成立，则拼接对应的 sql 片段；`<where>`：根据查询条件来生成 where 关键字，并会自动去除条件前面多余的 and 或 or。

**新增员工——需求与思路**

需求：新增员工，涉及两张表——员工基本信息（表：emp）与员工工作经历信息（表：emp_expr）。

三层架构中，每一层的职责如下：

- **Controller**：接收请求参数（员工信息）、调用 Service 方法、响应结果；
- **Service**：保存员工基本信息、批量保存员工的工作经历信息；
- **Mapper**：执行 SQL——`insert into emp(...) values (...);` 与 `insert into emp_expr(...) values(...),(...);`。

**新增员工——保存员工基本信息**

EmpController：

```java
@PostMapping
public Result save(@RequestBody Emp emp){
    log.info("请求参数emp: {}", emp);
    empService.save(emp);
    return Result.success();
}
```

EmpServiceImpl：

```java
public void save(Emp emp) {
    //1.补全基础属性
    emp.setCreateTime(LocalDateTime.now());
    emp.setUpdateTime(LocalDateTime.now());
    //2.保存员工基本信息
    empMapper.insert(emp);
}
```

EmpMapper：

```java
@Insert("insert into emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time) values (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime})")
void insert(Emp emp);
```

**新增员工——批量保存工作经历**

核心结论：一名员工可以有多条工作经历，需要**批量**插入 emp_expr 表，使用动态 SQL 的 `<foreach>` 标签实现。

一次插入多条记录的思路：`insert into emp_expr(...) values (?,?,?,?,?)` 逐条拼接到 `insert into emp_expr(...) values (?,?,?,?,?),(?,?,?,?,?),...`，把 `List<EmpExpr>` 中的数据遍历拼接到 SQL 中。

EmpExprMapper.java：

```java
public void insertBatch(List<EmpExpr> exprList);
```

EmpExprMapper.xml：

```xml
<insert id="insertBatch">
    insert into emp_expr (emp_id, begin, end, company, job) values
    <foreach collection="exprList" item="expr" separator=",">
        (#{expr.empId}, #{expr.begin}, #{expr.end}, #{expr.company}, #{expr.job})
    </foreach>
</insert>
```

`<foreach>` 属性说明：

- **collection**：集合名称；
- **item**：集合遍历出来的元素/项；
- **separator**：每一次遍历使用的分隔符（可选）；
- **open**：遍历开始前拼接的片段（可选）；
- **close**：遍历结束后拼接的片段（可选）。

**获取主键值**：在插入数据之后，如何获取到插主键 id 值？——使用 **@Options(useGeneratedKeys = true, keyProperty = "id")**。

小结：`<foreach>` 动态 SQL 标签的作用？——遍历集合/数组。

**事务管理——问题的引出**

问题：保存员工的基本信息成功了，而保存工作经历失败了，是否 OK？——**不可以**；因为这属于一个业务操作，如果保存员工信息成功了，保存工作经历信息失败了，就会造成数据库数据的不完整、不一致。

**事务的概念**：事务是一组操作的集合，它是一个不可分割的工作单位。事务会把所有的操作作为一个整体一起向系统提交或撤销操作请求，即这些操作**要么同时成功，要么同时失败**。

添加员工操作（两条 SQL 一起构成一个业务）：

```sql
-- 1. 保存员工基本信息
insert into emp values (39, 'Tom', '123456', '汤姆', 1, '13300001111', 1, 4000, '1.jpg', '2023-11-01', 1, now(), now());
-- 2. 保存员工的工作经历信息
insert into emp_expr(emp_id, begin, end, company, job) values
(39,'2019-01-01', '2020-01-01', '百度', '开发'),
(39,'2020-01-10', '2022-02-01', '阿里', '架构');
```

注意：默认 MySQL 的事务是**自动提交**的，也就是说，当执行一条 DML 语句，MySQL 会立即隐式的提交事务。

**事务的操作（SQL 层面）**：事务控制主要三步操作——开启事务、提交事务/回滚事务：

```sql
-- 开启事务
start transaction; / begin;
-- 1. 保存员工基本信息
insert into emp values (39, 'Tom', '123456', '汤姆', 1, '13300001111', 1, 4000, '1.jpg', '2023-11-01', 1, now(), now());
-- 2. 保存员工的工作经历信息
insert into emp_expr(emp_id, begin, end, company, job) values
(39,'2019-01-01', '2020-01-01', '百度', '开发'),
(39,'2020-01-10', '2022-02-01', '阿里', '架构');
-- 提交事务(全部成功) / 回滚事务(有一个失败)
commit; / rollback;
```

小结：什么是事务？——事务是一组操作的集合，是一个不可分割的工作单位。这组操作要么全部成功，要么全部失败；如何控制事务？——开启事务：start transaction/begin;、提交事务：commit;（全部成功）、回滚事务：rollback;（只要有一项失败）；场景？——银行转账；下单扣减库存。

**Spring 事务管理——@Transactional**

核心结论：在 Spring 中管理事务只需一个注解——**@Transactional**。

- 注解：**@Transactional**；
- 作用：将当前方法交给 spring 进行事务管理，方法执行前，开启事务；成功执行完毕，提交事务；出现异常，回滚事务；
- 位置：业务（service）层的方法上、类上、接口上（推荐加在方法上）。

演示代码（用 `int i = 1/0;` 模拟异常，观察事务回滚）：

```java
@Autowired
private EmpMapper empMapper;
@Autowired
private EmpExprMapper empExprMapper;

@Override
public void save(Emp emp) {
    //1.保存员工基本信息
    emp.setCreateTime(LocalDateTime.now());
    emp.setUpdateTime(LocalDateTime.now());
    empMapper.insert(emp);

    int i = 1/0;

    //2. 保存员工的工作经历信息 - 批量
    Integer empId = emp.getId();
    List<EmpExpr> exprList = emp.getExprList();
    if(!CollectionUtils.isEmpty(exprList)){
        exprList.forEach(empExpr -> empExpr.setEmpId(empId));
        empExprMapper.insertBatch(exprList);
    }
}
```

可以配置日志查看 Spring 事务管理的底层日志：

```yaml
# 配置日志信息,查看spring事务管理的底层日志
logging:
  level:
    org.springframework.jdbc.support.JdbcTransactionManager: debug
```

小结：Spring 事务管理的注解 @Transactional 的作用是什么，可以加在什么位置？——@Transactional：会在方法运行之前，开启事务，运行完毕后，根据运行的结果，来提交或回滚事务。位置：方法上、类上、接口上。

**事务进阶——rollbackFor**

核心结论：@Transactional 默认只在出现 **RuntimeException** 时回滚；要让其他异常也触发回滚，需要配置 rollbackFor 属性。

- **rollbackFor 属性**用于控制出现何种异常类型，回滚事务（默认情况下，只有出现 RuntimeException 才会回滚）。

```java
@Transactional(rollbackFor = {Exception.class})
@Override
public void save(Emp emp) {
    //1.保存员工基本信息
    emp.setCreateTime(LocalDateTime.now());
    emp.setUpdateTime(LocalDateTime.now());
    empMapper.insert(emp);

    //2. 保存员工的工作经历信息
    //... 省略
}
```

**事务进阶——propagation（事务传播行为）**

核心结论：**事务传播行为**指的就是当一个事务方法被另一个事务方法调用时，这个事务方法应该如何进行事务控制（加入现有事务？还是新建事务？）。

传播行为属性值表：

| 属性值 | 含义 |
| --- | --- |
| REQUIRED | 【默认值】需要事务，有则加入，无则创建新事务 |
| REQUIRES_NEW | 需要新事务，无论有无，总是创建新事务 |
| SUPPORTS | 支持事务，有则加入，无则在无事务状态中运行 |
| NOT_SUPPORTED | 不支持事务，在无事务状态下运行，如果当前存在已有事务，则挂起当前事务 |
| MANDATORY | 必须有事务，否则抛异常 |
| NEVER | 必须没事务，否则抛异常 |

**应用案例——记录操作日志**：

需求：在新增员工信息时，无论是成功还是失败，都要记录操作日志。

步骤：

1. 准备日志表 emp_log、实体类 EmpLog、Mapper 接口 EmpLogMapper；
2. 在新增员工时记录日志（日志记录方法需要用 REQUIRES_NEW——无论业务事务回滚与否，日志都要落库，所以日志方法应运行在独立的新事务中）。

小结：事务的传播行为控制的是什么？——一个事务方法调用另外一个事务方法时，事务应该如何控制（加入？新建？…）；常见的传播行为及应用场景？——REQUIRED：大部分场景；REQUIRES_NEW：希望两个方法在独立的事务中运行，互不影响。

**事务的四大特性（ACID）**

核心结论：事务有四大特性——原子性、一致性、隔离性、持久性，简称 ACID。

| 特性 | 英文 | 说明 |
| --- | --- | --- |
| 原子性 | Atomicity | 事务是不可分割的最小单元，要么全部成功，要么全部失败 |
| 一致性 | Consistency | 事务完成时，必须使所有的数据都保持一致状态 |
| 隔离性 | Isolation | 数据库系统提供的隔离机制，保证事务在不受外部并发操作影响的独立环境下运行 |
| 持久性 | Durability | 事务一旦提交或回滚，它对数据库中的数据的改变就是永久的 |

**文件上传——简介**

核心结论：文件上传是指将本地图片、视频、音频等文件上传到服务器，供其他用户浏览或下载的过程；在项目中应用非常广泛（发微博、发微信朋友圈都用到了文件上传功能）。

前端页面三要素（表单代码）：

```html
<form action="/upload" method="post" enctype="multipart/form-data">
    姓名: <input type="text" name="name" > <br>
    年龄: <input type="text" name="age" > <br>
    图像: <input type="file" name="file" > <br>
    <input type="submit" value="上传文件" name="submit">
</form>
```

从代码可以读出三个关键点：表单以 **POST** 方式提交（method="post"）；编码类型为 **multipart/form-data**；文件项使用 **input type="file"**。

服务端接收文件（使用 **MultipartFile** 类型接收）：

```java
@Slf4j
@RestController
public class UploadController {
    @PostMapping("/upload")
    public Result handleFileUpload(String name, Integer age, MultipartFile file) {
        log.info("文件上传:{}", file);
        return Result.success();
    }
}
```

**文件上传——本地存储**

将上传的文件存储在服务器本地的代码：

```java
@PostMapping("/upload")
public Result handleFileUpload(MultipartFile file) throws Exception {
    log.info("文件上传:{}", file);
    // 生成唯一文件名
    String uniqueFileName = generateUniqueFileName(file.getOriginalFilename());
    // 保存文件
    image.transferTo(new File("D:/images/" + uniqueFileName));
    return Result.success();
}

private String generateUniqueFileName(String originalFilename) {
    String randomStr = UUID.randomUUID().toString().replaceAll("-", "");
    String extension = originalFilename.substring(originalFilename.lastIndexOf("."));
    return randomStr + extension;
}
```

⚠️ 问题：课件代码中方法形参是 `MultipartFile file`，前面的 log 与文件名生成也都用的是 `file`，但保存文件时却写成 `image.transferTo(...)`——`image` 这个变量并不存在，代码无法编译。
修正建议：保存文件应使用形参名，写为 `file.transferTo(new File("D:/images/" + uniqueFileName));`。

小结：如何将上传的文件存储在服务器本地？——`multipartFile.getOriginalFilename()`：获取原始文件名；`multipartFile.transferTo(File dest)`：将文件转存到磁盘文件。

上传文件大小受限怎么办？——默认上传文件的最大大小为 **1MB**，超过大小需要在配置文件配置：

```yaml
spring:
  servlet:
    multipart:
      max-file-size: 10MB # 最大单个文件大小
      max-request-size: 100MB # 最大请求总大小（包括所有文件和表单数据）
```

本地存储的局限性：无法直接访问、磁盘满了、磁盘坏了——因此企业开发中会选择 **FastDFS、MinIO** 等分布式文件系统或**云**存储方案。

**文件上传——阿里云 OSS**

- 阿里云是阿里巴巴集团旗下全球领先的云计算公司，也是国内最大的云服务提供商；提供语音服务、短信服务、邮件服务、实人认证、视频点播、视频直播、文字识别、内容安全、对象存储、机器翻译、云数据库等云服务；
- **阿里云对象存储 OSS（Object Storage Service）**：是一款海量、安全、低成本、高可靠的云存储服务。使用 OSS，您可以通过网络随时存储和调用包括文本、图片、音频和视频等在内的各种文件。

**第三方服务-通用思路**（使用第三方云服务的通用流程）:

1. 注册阿里云（实名认证）；
2. 充值；
3. 开通对象存储服务（OSS）；
4. 创建 bucket；
5. 获取 AccessKey（秘钥）——即准备工作；
6. 参照官方 SDK 编写入门程序；
7. 集成使用。

关键名词：

- **SDK**：Software Development Kit 的缩写，软件开发工具包，包括辅助软件开发的依赖（jar 包）、代码示例等，都可以叫做 SDK；
- **Bucket**：存储空间是用户用于存储对象（Object，就是文件）的容器，所有的对象都必须隶属于某个存储空间。

注意：在使用第三方提供的云服务或技术时，一定要**参照对应的官方文档**进行开发和测试。

**阿里云 OSS——案例集成**

案例目标：1. 接收上传的图片；2. 将图片存储起来（OSS）；3. 返回图片访问的 URL。

步骤：

1. 引入阿里云 OSS 文件上传工具类（由官方的示例代码改造而来）；
2. 上传文件接口开发：

```java
@Autowired
private AliyunOSSOperator aliyunOSSOperator;

/**
 * 文件上传
 */
@PostMapping("/upload")
public Result upload(MultipartFile file) throws Exception {
    log.info("文件上传:{}", file);
    String url = aliyunOSSOperator.upload(file.getBytes(), file.getOriginalFilename());
    return Result.success(url);
}
```

**参数配置化**：

问题：如果将这些参数信息（endpoint、bucketName、region、AccessKey 等）写在 java 代码中有什么问题？——**不便维护与管理**。

- **参数配置化**：指将一些需要灵活变化的参数，配置在配置文件中，然后通过 **@Value** 注解来注入外部配置的属性。

application.yml：

```yaml
aliyun:
  oss:
    endpoint: https://oss-cn-beijing.aliyuncs.com
    bucketName: java-ai
    region: cn-beijing
```

AliyunOSSOperator（@Value 注入）：

```java
@Component
public class AliyunOSSOperator {
    @Value("${aliyun.oss.endpoint}")
    private String endpoint;
    @Value("${aliyun.oss.bucketName}")
    private String bucketName;
    @Value("${aliyun.oss.region}")
    private String region;
}
```

@Value 注入格式：`@Value("${key}")`。

**问题分析**：使用 @Value 注解注入配置文件的配置项，如果配置项多，注入繁琐，不便于维护管理和复用。

**@ConfigurationProperties**（批量注入）：可以批量将多个属性注入到 bean 对象中。

小结：注入外部配置文件中的配置项的两种方式？——@Value：一个属性一个属性的注入；@ConfigurationProperties：批量将多个属性注入到 bean 对象中；两种方式各自的使用场景？——如果属性较少，建议 @Value 注入即可；如果属性较多、考虑复用，建议使用 @ConfigurationProperties。

**删除员工——需求分析**

需求：根据 ID 删除单个员工信息、根据 ID 批量删除员工信息。

- 其实，删除单条数据也是一种特殊的批量删除，所以，删除员工的功能，我们只需要**开发一个接口**就可以了。

三层架构中，每一层的职责如下：

- **Controller**：接收请求参数（ID 值）、调用 Service 方法、响应结果；
- **Service**：批量删除员工基本信息、批量删除员工的工作经历信息；
- **Mapper**：执行 SQL——`delete from emp where id in (?,?,?);` 与 `delete from emp_expr where emp_id in (?,?,?);`。

⚠️ 问题：课件 Mapper 职责图中 SQL 写成了 `delete emp where id in (?,?,?);` 和 `delete emp_expr where emp_id in(?,?,?);`——都**缺少 from 关键字**，MySQL 中 delete 语句必须写为 `delete from 表名`，照抄无法执行。
修正建议：应写为 `delete from emp where id in (?,?,?);` 和 `delete from emp_expr where emp_id in (?,?,?);`（课件后续 EmpMapper.xml 中的写法就是正确的）。

**删除员工——Controller 接收请求参数**

接收请求参数：`DELETE /emps?ids=1,2,3`

方式一：在 Controller 方法中通过**数组**来接收：

```java
@DeleteMapping
public Result delete(Integer[] ids){
    log.info("根据id批量删除员工:{} ", ids);
    return Result.success();
}
```

方式二：在 Controller 方法中通过**集合**来接收：

```java
@DeleteMapping
public Result delete(@RequestParam List<Integer> ids){
    log.info("根据id批量删除员工:{} ", ids);
    return Result.success();
}
```

**删除员工——Service & Mapper**

EmpServiceImpl（删除两张表的数据，加事务保证一致性）：

```java
@Transactional(rollbackFor = {Exception.class})
public void deleteByIds(List<Integer> ids) {
    //1. 根据ID删除员工基本信息
    empMapper.deleteByIds(ids);
    //2. 根据ID删除员工的工作经历信息
    empExprMapper.deleteByEmpIds(ids);
}
```

EmpMapper.xml（动态 SQL 拼接 in 列表）：

```xml
<!-- 根据ID批量删除员工信息 -->
<delete id="deleteByIds">
  delete from emp where id in
  <foreach collection="ids" item="id" separator="," open="(" close=")">
     #{id}
  </foreach>
</delete>
```

EmpExprMapper.xml：

```xml
<!--根据员工ID批量删除员工工作经历信息-->
<delete id="deleteByEmpIds">
  delete from emp_expr where emp_id in
  <foreach collection="empIds" item="empId" separator="," open="(" close=")">
      #{empId}
  </foreach>
</delete>
```

这里 `<foreach>` 的 open="(" 与 close=")" 正好组成 `in (...)` 的括号，separator="," 生成逗号分隔的参数列表。

**修改员工——查询回显**

需求：修改员工包含两个功能——查询回显、修改数据；查询回显需要根据 ID 查询员工的详细信息（基本信息 + 工作经历信息）。

三层架构中，每一层的职责如下：

- **Controller**：接收请求参数（ID 值）、调用 Service 方法、响应结果；
- **Service**：调用 mapper 查询员工详细信息（基本信息、工作经历信息）；
- **Mapper**：执行 SQL——`select ... from emp e left join emp_expr ee on e.id = ee.emp_id where e.id = ?`。

EmpController：

```java
@GetMapping("/{id}")
public Result getInfo(@PathVariable Integer id){
    log.info("根据id查询员工信息, id: {}", id);
    Emp emp = empService.getInfo(id);
    return Result.success(emp);
}
```

EmpMapper.xml——**resultMap 自定义结果集**（解决多表查询字段名与属性名不一致、以及一对多嵌套集合的封装问题）：

```xml
<!--自定义结果集ResultMap-->
<resultMap id="empResultMap" type="com.itheima.pojo.Emp">
    <id column="id" property="id" />
    <result column="username" property="username" />
    <result column="password" property="password" />
    <result column="name" property="name" />
    <result column="gender" property="gender" />
    <result column="image" property="image" />
    <result column="entry_date" property="entryDate" />
    <result column="dept_id" property="deptId" />
    <result column="create_time" property="createTime" />
    <result column="update_time" property="updateTime" />
    <!--封装exprList-->
    <collection property="exprList" ofType="com.itheima.pojo.EmpExpr">
        <id column="ee_id" property="id"/>
        <result column="ee_company" property="company"/>
        <result column="ee_job" property="job"/>
        <result column="ee_begin" property="begin"/>
        <result column="ee_end" property="end"/>
        <result column="ee_empid" property="empId"/>
    </collection>
</resultMap>
```

EmpMapper.xml——查询语句（用 resultMap 引用上面的定义，并为工作经历字段起别名）：

```xml
<!-- 根据ID查询员工的详细信息 -->
<select id="getById" resultMap="empResultMap">
    select
        e.*,
        ee.id ee_id,
        ee.company ee_company,
        ee.job ee_job,
        ee.begin ee_begin,
        ee.end ee_end,
        ee.emp_id ee_empid
    from emp e left join emp_expr ee on e.id = ee.emp_id
    where e.id = #{id}
</select>
```

小结：Mybatis 中封装查询结果，什么时候用 resultType，什么时候用 resultMap？——如果查询返回的字段名与实体的属性名可以直接对应上，用 resultType；如果查询返回的字段名与实体的属性名对应不上，或实体属性比较复杂，可以通过 resultMap 手动封装（`<collection>` 用于封装一对多的集合属性）。

**修改员工——修改数据**

三层架构中，每一层的职责如下：

- **Controller**：接收请求参数、调用 Service 方法、响应结果；
- **Service**：根据 ID 修改员工的基本信息、根据 ID 修改工作经历信息；
- **Mapper**：执行 SQL——`update emp set ....`、`delete emp_expr where...`、`insert into emp_expr...`（工作经历信息采用**先删除再添加**的方式）。

EmpController：

```java
@PutMapping
public Result update(@RequestBody Emp emp){
    log.info("修改员工信息, {}", emp);
    empService.update(emp);
    return Result.success();
}
```

EmpServiceImpl（事务保证两表一致性）：

```java
@Transactional(rollbackFor=Exception.class)
public void update(Emp emp) {
    //1. 根据ID更新员工基本信息
    emp.setUpdateTime(LocalDateTime.now());
    empMapper.updateById(emp);
    //2. 根据员工ID删除员工的工作经历信息 【删除老的】
    empExprMapper.deleteByEmpIds(Arrays.asList(emp.getId()));
    //3. 新增员工的工作经历数据 【新增新的】
    Integer empId = emp.getId();
    List<EmpExpr> exprList = emp.getExprList();
    if(!CollectionUtils.isEmpty(exprList)){
        exprList.forEach(empExpr -> empExpr.setEmpId(empId));
        empExprMapper.insertBatch(exprList);
    }
}
```

EmpMapper.xml（静态 SQL 版本）：

```xml
<!--根据ID更新员工基本信息-->
<update id="updateById">
    UPDATE emp
    SET
        username = #{username},
        password = #{password},
        name = #{name},
        gender = #{gender},
        phone = #{phone},
        job = #{job},
        salary = #{salary},
        image = #{image},
        entry_date = #{entryDate},
        dept_id = #{deptId},
        update_time = #{updateTime}
    WHERE id = #{id}
</update>
```

静态写法的缺点：**不灵活、扩展性差**——不管传了哪些字段，所有列都会被更新。

**修改员工——程序优化（`<set>` 标签）**：

- `<set>`：替换 set 关键字，去除字段之后多余的逗号（,）。

动态 SQL 版本：

```xml
<!-- 根据ID修改员工基本信息 -->
<update id="updateById">
  update emp
  <set>
    <if test="username != null and username != ''">username=#{username},</if>
    <if test="password != null and password != ''">password #{password},</if>
    <if test="name != null and name != ''">name = #{name},</if>
    <if test="gender != null">gender = #{gender},</if>
    <if test="phone != null and phone != ''">phone = #{phone},</if>
    <if test="job != null">job = #{job},</if>
    <if test="salary != null">salary = #{salary},</if>
    <if test="image != null and image != ''">image = #{image},</if>
    <if test="entryDate != null">entry_date = #{entryDate},</if>
    <if test="deptId != null">dept_id = #{deptId},</if>
    <if test="updateTime != null">update_time = #{updateTime}</if>
  </set>
  where id = #{id}
</update>
```

EmpMapper.java：

```java
/**
 * 根据ID更新员工基本信息
 */
void updateById(Emp emp);
```

⚠️ 问题：课件动态 SQL 中 password 条件写成了 `<if test="password != null and password != ''">password #{password},</if>`——`password` 后面**缺少等号**（其他所有条件都是 `字段 = #{字段}` 的格式），拼接出的 SQL 是 `password ?`，语法错误无法执行。
修正建议：应写为 `password = #{password},`。

**异常处理**

核心结论：项目开发及运行过程中，不可避免的会出现各种异常；如果各层不做统一处理，出现异常时默认返回的结果不符合规范——解决方案是**全局异常处理器**。

- 项目开发及运行过程中，不可避免的会出现各种异常；
- 各层（Controller、Service、Mapper）当前对异常的现状：未做处理（如果在各层写 try-catch 处理，会导致代码臃肿，不推荐）；
- 目标效果：正常请求返回正常结果、异常请求统一返回规范的异常结果——由**全局异常处理器**统一拦截处理。

GlobalExceptionHandler：

```java
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public Result handleException(Exception e){
        log.error("全局异常处理器, 拦截到异常", e);
        return Result.error("对不起,服务器异常,请稍后重试");
    }
}
```

小结：如何定义一个全局异常处理器？——@RestControllerAdvice = @ControllerAdvice + @ResponseBody（标识这是一个全局异常处理器）、@ExceptionHandler（标识处理异常的方法）。

**员工信息统计——职位统计**

需求：统计各个职位的员工人数（输出职位列表与对应人数列表）。

响应数据示例：

```json
{
  "code": 1,
  "msg": "success",
  "data": {
    "jobList": ["教研主管","学工主管","其他","班主任","咨询师","讲师"],
    "dataList": [1,1,2,6,8,13]
  }
}
```

封装类 JobOption：

```java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobOption {
    private List jobList; //职位列表
    private List dataList; //人数列表
}
```

三层架构中，每一层的职责如下：

- **Controller**：接收请求、调用 Service 方法、响应结果；
- **Service**：调用 mapper 方法获取职位统计数据、解析数据封装统计结果（JobOption）；
- **Mapper**：执行 SQL。

ReportController：

```java
@GetMapping("/empJobData")
public Result getEmpJobData(){
    log.info("统计各个职位的员工人数");
    JobOption jobOption = reportService.getEmpJobData();
    return Result.success(jobOption);
}
```

ReportServiceImpl（用 stream 从 Map 列表中提取 pos 与 num 两列）：

```java
public JobOption getEmpJobData() {
    List<Map<String,Object>> list = empMapper.countEmpJobData();
    List<Object> jobList = list.stream().map(dataMap -> dataMap.get("pos")).toList();
    List<Object> dataList = list.stream().map(dataMap -> dataMap.get("num")).toList();
    return new JobOption(jobList, dataList);
}
```

ReportMapper（用 case when 把职位编码翻译为职位名称）：

```xml
<select id="countEmpJobData" resultType="java.util.Map">
    select
        (case when job = 1 then '班主任'
            when job = 2 then '讲师'
            when job = 3 then '学工主管'
            when job = 4 then '教研主管'
            when job = 5 then '咨询师'
            else '其他'end) as pos,
        count(*) as num
    from emp
    group by job order by num
</select>
```

**case 流程控制函数**语法：

```sql
-- 语法一：
case when cond1 then res1 [when cond2 then res2] else res end ;
-- 语法二(适用于等值匹配)：
case expr when val1 then res1 [when val2 then res2] else res end ;
```

**员工信息统计——性别统计**

需求：统计男性和女性员工的人数。

响应数据示例：

```json
{
  "code": 1,
  "msg": "success",
  "data": [
    {"name": "男性员工","value": 5},
    {"name": "女性员工","value": 6}
  ]
}
```

返回类型：`List<Map>`

ReportController：

```java
@GetMapping("/empGenderData")
public Result getEmpGenderData(){
    log.info("统计员工性别信息");
    List<Map> genderList = reportService.getEmpGenderData();
    return Result.success(genderList);
}
```

ReportServiceImpl：

```java
@Override
public List<Map> getEmpGenderData() {
    return empMapper.countEmpGenderData();
}
```

EmpMapper：

```java
List<Map> countEmpGenderData();
```

EmpMapper.xml（用 if 函数把性别编码翻译为文本）：

```xml
<!-- 统计员工的性别信息 -->
<select id="countEmpGenderData" resultType="java.util.Map">
    select
        if(gender = 1, '男', '女') as name,
        count(*) as value
    from emp group by gender ;
</select>
```

⚠️ 问题：课件响应数据示例中 name 的值为"男性员工"/"女性员工"，而 EmpMapper.xml 的 SQL 实际查询输出的是 `if(gender = 1, '男', '女')`，即 name 为"男"/"女"——响应示例与 SQL 输出值前后不一致。
修正建议：两者统一，例如把 SQL 改为 `if(gender = 1, '男性员工', '女性员工') as name`，或按"男/女"更新响应数据示例。

**if 流程控制函数**语法：

- `if(expr,val1,val2)`：如果表达式 expr 成立，取 val1，否则取 val2；
- `ifnull(expr,val1)`：如果 expr 不为 null，取自身，否则取 val1。

小结：本章以员工管理为核心展开，知识链条是——多表关系（一对多/一对一/多对多、外键约束、逻辑外键）→ 多表查询（内连接/外连接/子查询、resultType 与 resultMap）→ 分页查询（原始方式、PageHelper、条件查询与动态 SQL `<if>/<where>`）→ 新增员工（`<foreach>` 批量插入、@Options 获取主键）→ 事务管理（@Transactional、rollbackFor、propagation、ACID）→ 文件上传（MultipartFile、本地存储、阿里云 OSS、@Value/@ConfigurationProperties）→ 删除员工（数组/集合接收批量参数）→ 修改员工（resultMap 嵌套封装、`<set>` 动态 SQL）→ 全局异常处理（@RestControllerAdvice + @ExceptionHandler）→ 数据统计（case when、if/ifnull 函数）。每一处数据库操作都要考虑事务与 SQL 的正确性，这是实战开发的关键意识。

### 第十一章：Web后端实战——登录认证

**登录认证需求概述**

核心结论：登录认证包含两个部分——**登录功能**（用户名密码正确即登录成功）与**登录校验**（只有登录成功的员工才能访问后台数据）。

- 登录功能：实现用户名密码验证，登录成功后返回员工信息；
- 登录校验：解决"未登录也能访问系统功能"的安全漏洞。

**登录功能——思路分析**

- 怎么样才算登录成功了呢？——用户名和密码都输入正确，登录成功；否则，登录失败；
- 登录功能的本质是什么？——**查询**：根据用户名和密码查询员工信息。

三层架构中，每一层的职责如下：

- **Controller**：接收请求参数（用户名、密码）、调用 Service 方法、响应结果；
- **Service**：根据用户名和密码查询员工信息、判定，组装数据并返回；
- **Mapper**：执行 SQL——`select * from emp where username = ? and password = ?`

**联调测试引出的问题**：

问题：在未登录情况下，我们也可以直接访问部门管理、员工管理等功能。

需求：**只有员工登录成功，才可以访问后台系统中的数据**——这就需要在系统中加入"登录校验"（对 Login 之外的 Emp、Dept、Report 等接口进行统一拦截）。

**登录校验思路**

核心结论：登录校验 = **登录标记**（登录成功后存下标记，后续每次请求都能取到）+ **统一拦截**（所有请求进来先检查标记）。

- **登录标记**：用户登录成功之后，在后续的每一次请求中，都可以获取到该标记。【会话技术】；
- **统一拦截**：过滤器 Filter、拦截器 Interceptor。

整体数据流：浏览器请求 → Web 服务器（统一拦截先行）→ 校验登录标记（标记在登录成功时"存"，在后续请求"取"）→ 通过则访问 Login、Emp、Dept、Report 等接口。

登录校验涉及的技术内容：会话技术、JWT 令牌、过滤器 Filter、拦截器 Interceptor。

**会话技术**

核心结论：要"在多次请求间共享登录标记"，就要用到会话技术；主流方案有 Cookie、Session、令牌三种。

- **会话**：用户打开浏览器，访问 web 服务器的资源，会话建立，直到有一方断开连接，会话结束。在一次会话中可以包含多次请求和响应；
- **会话跟踪**：一种维护浏览器状态的方法，服务器需要识别多次请求是否来自于同一浏览器，以便在同一次会话的多次请求间共享数据；
- **会话跟踪方案**：
  - 客户端会话跟踪技术：Cookie；
  - 服务端会话跟踪技术：Session；
  - 令牌技术。

**方案一：Cookie**

原理：登录成功后，服务器通过响应头 **Set-Cookie: name=value** 把数据写入浏览器；浏览器后续每次请求都通过请求头 **Cookie: name=value** 把数据带回服务器。

优缺点：

- 优点：HTTP 协议中支持的技术；
- 缺点：
  - 移动端 APP 无法使用 Cookie；
  - 不安全，用户可以自己禁用 Cookie；
  - Cookie 不能跨域。

**跨域**的区分：三个维度——协议、IP/域名、端口。例如 http://192.168.150.200:90 与 http://192.168.150.100:8080 之间协议相同但 IP 与端口都不同，属于跨域，Cookie 无法在这些地址间共享。

小结：Cookie 会话跟踪方案的原理？——响应头：Set-Cookie；请求头：Cookie；优缺点？——优点：HTTP 协议中支持的技术；缺点：移动端 APP 无法使用 Cookie、不安全（用户可以自己禁用 Cookie）、Cookie 不能跨域。

**方案二：Session**

原理：**Session 的底层是基于 Cookie 的**。登录成功后服务器创建 Session 对象（服务端存储），并把 `JSESSIONID` 通过响应头 Set-Cookie: JSESSIONID=1 写入浏览器；后续请求浏览器带着 Cookie: JSESSIONID=1，服务器据此找到对应的 Session 取数据。

优缺点：

- 优点：存储在服务端，安全；
- 缺点：
  - 服务器集群环境下无法直接使用 Session；
  - Cookie 的缺点（移动端无法使用、用户可禁用、不能跨域）。

小结：Session 会话跟踪方案的原理？——Session 的底层是基于 Cookie 的（Set-Cookie、Cookie）；优缺点？——优点：存储在服务端，安全；缺点：服务器集群环境下无法直接使用 Session、Cookie 的缺点。

**方案三：令牌技术（主流方案）**

原理：登录成功后服务器**生成令牌**返回给浏览器（不存储）；浏览器后续请求携带令牌；服务器**校验令牌**合法性。令牌由服务端用算法校验，不依赖服务端存储，也不依赖 Cookie。

优缺点：

- 优点：
  - 支持 PC 端、移动端；
  - 解决集群环境下的认证问题；
  - 减轻服务器端存储压力；
- 缺点：需要自己实现。

Cookie 与 Session 是"传统方案"，令牌技术是当前"主流方案"。

小结：令牌会话跟踪方案的优缺点？——优点：支持 PC 端、移动端、解决集群环境下的认证问题、减轻服务器端存储压力；缺点：需要自己实现。

**JWT 令牌——介绍**

核心结论：JWT（JSON Web Token）是令牌技术的事实标准，它是一种简洁的、自包含的格式，用于在通信双方以 json 数据格式安全地传输信息。

- 全称：JSON Web Token（https://jwt.io/）；
- 定义了一种简洁的、自包含的格式，用于在通信双方以 json 数据格式安全的传输信息；
- 组成：
  - 第一部分：**Header（头）**，记录令牌类型、签名算法等。例如：{"alg":"HS256","type":"JWT"}；
  - 第二部分：**Payload（有效载荷）**，携带一些自定义信息、默认信息等。例如：{"id":"1","username":"Tom"}；
  - 第三部分：**Signature（签名）**，防止 Token 被篡改、确保安全性。将 header、payload 融入，并加入指定秘钥，通过指定签名算法计算而来。

JWT 令牌的形态是三段 Base64 编码用点号连接：

```
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.JTdCJTIybmFtZSUyMiUzQSUyMlRvbSUyMiUyQyUyMmlhdCUyMiUzQTE1MTYyMzkwMjIlN0Q=.SflKxwRJSMeKKF2QT4fwpMeJf...
```

数字签名计算方式：`数字签名(header.payload，secret)`——拿前两段加上秘钥，用签名算法算出第三段。

**Base64**：是一种基于 64 个可打印字符（A-Z a-z 0-9 + /）来表示二进制数据的编码方式。

**JWT 令牌——生成与解析**

核心结论：使用官方提供的 jjwt 依赖和 Jwts 工具类即可生成、解析 JWT 令牌。

1. 引入 jjwt 的依赖：

```xml
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>
```

2. 调用官方提供的工具类 **Jwts** 来生成或解析 jwt 令牌。

生成令牌：

```java
@Test
public void testGenJwt() {
    Map<String, Object> claims = new HashMap<>();
    claims.put("id", 10);
    claims.put("username", "itheima");
    String jwt = Jwts.builder()
            .signWith(SignatureAlgorithm.HS256, "SVRIRUlNQQ==")
            .addClaims(claims)
            .setExpiration(new Date(System.currentTimeMillis() + 12*3600*1000))
            .compact();
    System.out.println(jwt);
}
```

解析令牌：

```java
@Test
public void testParseJwt() throws Exception {
    String jwtToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9...";
    Claims claims = Jwts.parser()
            .setSigningKey("SVRIRUlNQQ==")
            .parseClaimsJws(jwtToken)
            .getBody();
    System.out.println(claims);
}
```

小结：

- JWT 令牌由哪几个部分组成，每个部分都存储什么内容？——header（头），记录令牌类型、签名算法；payload（载荷），携带一些自定义的信息；signature（签名），防止被篡改，保证安全性。
- JWT 令牌生成及校验？——Jwts.builder()...（生成）、Jwts.parser()...（解析校验）。
- JWT 令牌解析（校验）时什么情况会报错？——JWT 令牌被篡改 或 过期失效了。

⚠️ 问题：课件小结文字写成"signature（签名），**访问**被篡改，保证安全性"——"访问"一词语义不通，正确含义是"防止被篡改"。
修正建议：应改为"signature（签名），防止被篡改，保证安全性"。

注意事项：JWT 校验时使用的**签名秘钥，必须和生成 JWT 令牌时使用的秘钥是配套的**。

**登录成功后——生成令牌**

实现思路：

1. 定义 JWT 令牌操作工具类（课件提示：基于 AI 生成工具类）；
2. 登录完成后，调用工具类生成 JWT 令牌，并返回给前端。

流程：用户请求 Login 接口 → 登录成功 → 生成 JWT 令牌 → 响应给浏览器；浏览器后续带令牌请求 Emp、Dept、Report 等接口 → 统一拦截校验令牌。

**过滤器 Filter**

核心结论：Filter 是 JavaWeb 三大组件之一，用于拦截请求实现通用功能——登录校验就是它的典型应用。

- 概念：Filter 过滤器，是 JavaWeb 三大组件（**Servlet、Filter、Listener**）之一；
- 过滤器可以把对资源的请求拦截下来，从而实现一些特殊的功能；
- 过滤器一般完成一些通用的操作，比如：**登录校验、统一编码处理、敏感字符处理**等。

**Filter 快速入门**：

1. 定义 Filter：定义一个类，实现 Filter 接口，并实现其所有方法：

```java
@WebFilter(urlPatterns = "/*")
public class DemoFilter implements Filter {
    //初始化方法, web服务器启动, 创建Filter实例时调用, 只调用一次
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init ...");
    }
    //拦截到请求时,调用该方法,可以调用多次
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws Exception{
        System.out.println("拦截到了请求...");
        chain.doFilter(servletRequest, servletResponse);
    }
    //销毁方法, web服务器关闭时调用, 只调用一次
    public void destroy() {
        System.out.println("destroy ... ");
    }
}
```

2. 配置 Filter：Filter 类上加 **@WebFilter** 注解，配置拦截路径；引导类上加 **@ServletComponentScan** 开启 Servlet 组件支持：

```java
@ServletComponentScan
@SpringBootApplication
public class TliasManagementApplication {
```

小结：Filter 的开发步骤？——定义：定义一个类实现 Filter 接口（init、doFilter、destroy）；配置：@WebFilter(urlPatterns="/*")、@ServletComponentScan。

注意事项：如果过滤器中不执行放行操作，过滤器拦截到请求之后，就不会访问对应的资源；**放行**：`chain.doFilter(request,response)`。

**令牌校验 Filter**

校验逻辑的两个思考：

- 所有的请求，拦截到了之后，都需要校验令牌吗？——有一个**例外**，登录请求（/login）不需要校验；
- 拦截到请求后，什么情况下才可以放行，执行业务操作？——**有令牌，且令牌校验通过（合法）**；否则都返回未登录错误结果。

**令牌校验 Filter 流程**（六个步骤）：

1. 获取请求 url；
2. 判断请求 url 中是否包含 login，如果包含，说明是登录操作，放行；
3. 获取请求头中的令牌（token）；
4. 判断令牌是否存在，如果不存在，响应 401；
5. 解析 token，如果解析失败，响应 401；
6. 放行。

流程图的判定链：请求 → 判断是否是登录请求（是→放行；否→获取请求路径）→ 获取请求头 token → 判断是否有 token（否→响应 401；是→解析 token）→ 解析失败响应 401 / 解析成功放行。

**Filter 详解——执行流程**

核心结论：Filter 的执行分为"放行前 → 放行 → 资源 → 放行后"四段：放行后访问对应资源，**资源访问完成后，还会回到 Filter 中执行放行后的逻辑**（不是重新执行整个 Filter）。

- 问题 1：放行后访问对应资源，资源访问完成后，还会回到 Filter 中吗？——**会**；
- 问题 2：如果回到 Filter 中，是重新执行还是执行放行后的逻辑呢？——执行**放行后**逻辑。

**Filter 详解——拦截路径**

Filter 可以根据需求，配置不同的拦截资源路径：

| 拦截路径 | urlPatterns值 | 含义 |
| --- | --- | --- |
| 拦截具体路径 | /login | 只有访问 /login 路径时，才会被拦截 |
| 目录拦截 | /emps/* | 访问/emps下的所有资源，都会被拦截 |
| 拦截所有 | /* | 访问所有资源，都会被拦截 |

**Filter 详解——过滤器链**

- 介绍：一个 web 应用中，可以配置多个过滤器，这多个过滤器就形成了一个**过滤器链**；
- 顺序：注解配置的 Filter，优先级是按照**过滤器类名（字符串）的自然排序**。

执行顺序理解：Filter1 放行前 → 放行 → Filter2 放行前 → 放行 → 资源 → Filter2 放行后 → Filter1 放行后。

小结：过滤器的执行流程？——放行前 -> 放行 -> 资源 -> 放行后；配置的过滤器的拦截路径 /* 与 /emps/* 分别代表什么意思？——/*：表示拦截所有；/emps/*：表示目录拦截，拦截 /emps 下的所有资源；什么是过滤器链？——项目中的多个过滤器就形成了一个过滤器链。

**拦截器 Interceptor**

核心结论：拦截器是 **Spring 框架提供的**动态拦截方法调用的机制，类似于过滤器，主要用来**动态拦截控制器方法的执行**。

- 概念：是一种动态拦截方法调用的机制，类似于过滤器。Spring 框架中提供的，主要用来动态拦截控制器方法的执行；
- 作用：拦截请求，在指定的方法调用前后，根据业务需要执行预先设定的代码。

**Interceptor 快速入门**：

1. 定义拦截器，实现 **HandlerInterceptor** 接口，并实现其所有方法：

```java
@Component
public class DemoInterceptor implements HandlerInterceptor {
    //目标资源方法执行前执行，返回true：放行，返回false：不放行
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
        return true;
    }
    //目标资源方法执行后执行
    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse resp, Object handler, ModelAndView mv) throws Exception {
        System.out.println("preHandle...");
    }
    //视图渲染完毕后执行，最后执行
    @Override
    public void afterCompletion(HttpServletRequest req, HttpServletResponse resp, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
    }
}
```

2. 注册拦截器：定义配置类实现 WebMvcConfigurer：

```java
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private DemoInterceptor demoInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor).addPathPatterns("/**");
    }
}
```

⚠️ 问题：课件 DemoInterceptor 中 postHandle 方法体内打印的是 `System.out.println("preHandle...")`——打印文案与方法名不匹配（明显是从 preHandle 复制后未修改）；同一页注释文字"放回 true：放行"应为"返回 true"。
修正建议：postHandle 中应打印 `"postHandle..."`；注释应写"返回 true：放行，返回 false：不放行"。

小结：拦截器 Interceptor 的使用步骤？——定义：实现 HandlerInterceptor 接口（preHandle、postHandle、afterCompletion）；配置：定义一个配置类实现 WebMvcConfigurer 接口，注册拦截器（/**）。

**令牌校验 Interceptor**

流程与令牌校验 Filter 完全一致（六个步骤）：

1. 获取请求 url；
2. 判断请求 url 中是否包含 login，如果包含，说明是登录操作，放行；
3. 获取请求头中的令牌（token）；
4. 判断令牌是否存在，如果不存在，响应 401；
5. 解析 token，如果解析失败，响应 401；
6. 放行。

这套校验逻辑既可以写在 Filter 里，也可以写在 Interceptor 里（实际开发常使用拦截器方式）。

**拦截器详解——拦截路径**

拦截器可以根据需求，配置不同的拦截路径（明确"需要拦截哪些资源、不需要拦截哪些资源"）：

| 拦截路径 | 含义 | 举例 |
| --- | --- | --- |
| /* | 一级路径 | 能匹配/depts，/emps，/login，不能匹配 /depts/1 |
| /** | 任意级路径 | 能匹配/depts，/depts/1，/depts/1/2 |
| /depts/* | /depts下的一级路径 | 能匹配/depts/1，不能匹配/depts/1/2，/depts |
| /depts/** | /depts下的任意级路径 | 能匹配/depts，/depts/1，/depts/1/2，不能匹配/emps/1 |

**拦截器详解——执行流程与 Filter 的对比**

拦截器的执行流程：preHandle（放行前）→ Controller（目标资源）→ postHandle → afterCompletion。

**Filter 与 Interceptor 区别**：

- **接口规范不同**：过滤器需要实现 Filter 接口，而拦截器需要实现 HandlerInterceptor 接口；
- **拦截范围不同**：过滤器 Filter 会拦截所有的资源，而 Interceptor 只会拦截 Spring 环境中的资源。

小结：拦截器中的拦截路径 /* 与 /** 的区别是什么？——/*：只能拦截一级路径，如：/depts，/emps；/**：拦截任意级路径，如：/depts，/depts/1；过滤器与拦截器的区别？——接口规范不同、拦截范围不同。

小结：本章围绕登录认证展开：先实现登录功能（本质是一次按用户名密码的查询），再解决"未登录也能访问"的问题——登录校验 = 登录标记（会话技术：Cookie/Session/令牌对比，JWT 是主流令牌方案）+ 统一拦截（Filter 与 Interceptor 两套机制，执行流程、拦截路径各有讲究）。JWT 的三段结构（Header/Payload/Signature）、秘钥配套原则、Filter 的放行与过滤器链、Interceptor 的三个回调方法、/* 与 /** 的区别是本章的核心考点。

### 第十二章：Web后端进阶——AOP

**什么是 AOP**

核心结论：AOP（Aspect Oriented Programming，面向切面编程、面向方面编程），可简单理解为就是**面向特定方法编程**——在不修改原始方法代码的前提下，对特定方法进行功能增强。

学习场景：案例中部分业务方法运行较慢，需要定位执行耗时较长的方法（接口），此时需要统计每一个业务方法的执行耗时。

原始方式：在每个业务方法内部手写统计耗时的代码（以 `DeptServiceImpl` 为例）：

```java
public List<Dept> list() {
    List<Dept> deptList = deptMapper.list();
    return deptList;
}
public void delete(Integer id) {
    deptMapper.delete(id);
}
public Dept getById(Integer id) {
    Dept dept = deptMapper.getById(id);
    return dept;
}
```

改造后（每个方法都插入统计代码）：

```java
public List<Dept> list() {
    long beginTime = System.currentTimeMillis();
    List<Dept> deptList = deptMapper.list();
    long endTime = System.currentTimeMillis();
    log.info("执行耗时: {} ms", endTime - beginTime);
    return deptList;
}
public void delete(Integer id) {
    long beginTime = System.currentTimeMillis();
    deptMapper.delete(id);
    long endTime = System.currentTimeMillis();
    log.info("执行耗时: {} ms", endTime - beginTime);
}
public Dept getById(Integer id) {
    long beginTime = System.currentTimeMillis();
    Dept dept = deptMapper.getById(id);
    long endTime = System.currentTimeMillis();
    log.info("执行耗时: {} ms", endTime - beginTime);
    return dept;
}
//其他方法省略...
```

AOP 方式：定义一个切面类，把"统计耗时"这段公共逻辑集中写一次，通过切入点表达式指定作用于哪些方法：

```java
@Slf4j
@Aspect
@Component
public class RecordTimeAspect {
    @Around("execution(* com.itheima.service.*.*(..))")
    public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {
        long beginTime = System.currentTimeMillis();
        Object result = pjp.proceed();
        long endTime = System.currentTimeMillis();
        log.info("执行耗时:{}ms", endTime - beginTime);
        return result;
    }
}
```

AOP 的四大优势：

- 减少重复代码；
- 代码无侵入（原始业务方法一行都不用改）；
- 提高开发效率；
- 维护方便。

提示：**AOP 是一种思想**，而 Spring 框架中对这种思想进行了实现，我们要学习的就是 **Spring AOP**。

⚠️ 问题：课件中切面类名写作 `RecordTimeApsect`（Aspect 拼成了 Apsect），且第 2 页代码中 `recordTime` 方法缺少 `throws Throwable` 声明——`pjp.proceed()` 声明抛出 Throwable，不声明或不捕获将无法通过编译；第 7 页代码只写了 `@Aspect`、`@Component` 两个注解却直接使用 `log.info`，缺少 `@Slf4j` 注解（Lombok 未生成 log 字段）。
修正建议：类名应为 `RecordTimeAspect`；方法签名应为 `public Object recordTime(ProceedingJoinPoint pjp) throws Throwable`；使用 `log` 前须在类上加 `@Slf4j`。

**AOP 快速入门**

需求：统计所有业务层方法的执行耗时。

开发步骤：

1. 导入依赖：在 pom.xml 中引入 AOP 的依赖：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```

2. 编写 AOP 程序：针对于特定的方法根据业务需要进行编程（AOP 程序 - RecordTimeAspect）：

```java
@Slf4j
@Aspect
@Component
public class RecordTimeAspect {
    @Around("execution(* com.itheima.service.impl.*.*(..))")
    public Object recordTime(ProceedingJoinPoint pjp) throws Throwable {
        long beginTime = System.currentTimeMillis();   // 获取方法运行的开始时间
        Object result = pjp.proceed();                 // 运行原始方法
        long endTime = System.currentTimeMillis();     // 获取方法运行结束时间，计算执行耗时
        log.info("执行耗时: {} ms", endTime - beginTime);
        return result;
    }
}
```

小结：

- SpringAOP 程序的开发步骤？——引入 AOP 的依赖；编写 AOP 的程序（公共的逻辑代码）；
- SpringAOP 的应用场景？——记录系统的操作日志、事务管理、权限控制，等等。

**AOP 核心概念**

核心结论：AOP 有五个核心概念，理解它们才能看懂 AOP 程序的结构。

- **连接点（JoinPoint）**：可以被 AOP 控制的方法（暗含方法执行时的相关信息）；
- **通知（Advice）**：指那些重复的逻辑，也就是共性功能（最终体现为一个方法）；
- **切入点（PointCut）**：匹配连接点的条件，通知仅会在切入点方法执行时被应用；
- **切面（Aspect）**：描述通知与切入点的对应关系（通知 + 切入点）；
- **目标对象（Target）**：通知所应用的对象。

五者关系示意：切面类中定义通知（共性逻辑）与切入点表达式，切入点表达式负责挑选出需要增强的连接点，通知最终应用到目标对象上——"切面 = 通知 + 切入点"。

**AOP 执行流程（动态代理）**

核心结论：Spring AOP 底层通过**动态代理**实现——程序运行时，Spring 为原始的目标对象生成一个**代理对象**；Controller 注入的 Service 实际上就是这个代理对象，请求先进入代理对象，代理对象在执行目标方法的前后织入通知逻辑，再调用目标对象完成原始操作。

流程代码示意：

```java
public class DeptServiceProxy implements DeptService {
    @Override
    public List<Dept> list() {
        long begin = System.currentTimeMillis();
        List<Dept> deptList = 目标对象.list()；//伪代码
        long end = System.currentTimeMillis();
        log.info("执行耗时 : {} ms", (end-begin));
        return deptList;
    }
}
```

```java
@Aspect
public class RecordTimeAspect {
    @Around("execution(* com.itheima.service.impl.*.*(..))")
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long begin = System.currentTimeMillis();
        Object result = joinPoint.proceed();   //调用原始操作
        long end = System.currentTimeMillis();
        log.info("执行耗时 : {} ms", (end-begin));
        return result;
    }
}
```

```java
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping
    public Result list(){
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }
}
```

```java
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        List<Dept> deptList = deptMapper.list();
        return deptList;
    }
}
```

执行链路：浏览器请求 → DeptController 调用 deptService.list()（代理对象）→ 代理对象执行"通知中的放行前逻辑 → 目标对象.list() → 放行后逻辑" → 返回结果。注意上面 `DeptServiceProxy` 中的 `目标对象.list()` 是课件标注的**伪代码**，用于说明代理对象内部会调用原始目标对象。

小结（核心概念回顾）：连接点（JoinPoint）、切入点（PointCut）、通知（Advice）、切面（Aspect）、目标对象（Target）。

**通知类型**

根据通知方法执行时机的不同，将通知类型分为以下常见的五类：

- **@Around**：环绕通知，此注解标注的通知方法在目标方法前、后都被执行；
- **@Before**：前置通知，此注解标注的通知方法在目标方法前被执行；
- **@After**：后置通知，此注解标注的通知方法在目标方法后被执行，无论是否有异常都会执行；
- **@AfterReturning**：返回后通知，此注解标注的通知方法在目标方法后被执行，有异常不会执行；
- **@AfterThrowing**：异常后通知，此注解标注的通知方法发生异常后执行。

两个注意点：

- 注意 1：**@Around 环绕通知需要自己调用 ProceedingJoinPoint.proceed() 来让原始方法执行**，其他通知不需要考虑目标方法执行；
- 注意 2：**@Around 环绕通知方法的返回值，必须指定为 Object**，来接收原始方法的返回值。

**@PointCut 抽取公共切点表达式**

该注解的作用是将公共的切点表达式抽取出来，需要用到时引用该切点表达式即可。

- `private`：仅能在当前切面类中引用该表达式；
- `public`：在其他外部的切面类中也可以引用该表达式。

小结：

- 常见的通知类型有哪些？分别在什么时候执行？——@Before（前置通知）、@After（后置通知）、@Around（环绕通知，重点）、@AfterReturning（返回后通知）、@AfterThrowing（异常后通知）；
- @PointCut 注解的作用是什么？——抽取公共的切点表达式，提高复用性。

**通知顺序**

当有多个切面的切入点都匹配到了目标方法，目标方法运行时，多个通知方法都会被执行。执行顺序规则：

- 不同切面类中，默认按照切面类的**类名字母排序**：
  - 目标方法**前**的通知方法：字母排名靠前的**先**执行；
  - 目标方法**后**的通知方法：字母排名靠前的**后**执行。
- 用 **@Order(数字)** 加在切面类上来控制顺序：
  - 目标方法**前**的通知方法：数字小的**先**执行；
  - 目标方法**后**的通知方法：数字小的**后**执行。

容易误解的地方："前先执行、后后执行"意味着 @Order 数值小的切面在最外层——进入目标方法时它最先执行通知，返回时它最后执行通知，形成"先进后出"的洋葱结构。

**切入点表达式**

介绍：描述切入点方法的一种表达式。

作用：用来决定项目中的哪些方法需要加入通知。

常见形式：

- `execution(……)`：根据方法的签名来匹配；
- `@annotation(……)`：根据注解匹配。

**execution 切入点表达式**

execution 主要根据方法的返回值、包名、类名、方法名、方法参数等信息来匹配，语法为：

```
execution(访问修饰符?  返回值  包名.类名.?方法名(方法参数) throws 异常?)
```

其中带 `?` 的表示可以省略的部分：

- 访问修饰符：可省略（比如：public、protected）；
- 包名.类名：可省略；
- throws 异常：可省略（注意是方法上**声明抛出**的异常，不是实际抛出的异常）。

可以使用通配符描述切入点：

- `*`：单个独立的任意符号，可以通配任意返回值、包名、类名、方法名、任意类型的一个参数，也可以通配包、类、方法名的一部分；
- `..`：多个连续的任意符号，可以通配任意层级的包，或任意类型、任意个数的参数。

示例：

```
execution(* com.*.service.*.update*(*))
execution(* com.itheima..DeptService.*(..))
```

根据业务需要，可以使用 且（&&）、或（||）、非（!）来组合比较复杂的切入点表达式。

小结：

- execution 切入点表达式的完整语法？——`execution(访问修饰符? 返回值 包名.类名.?方法名(方法参数) throws 异常?)`；
- 通配符有哪些？——`*`：单个独立的任意符号；`..`：多个连续的任意符号。

书写建议：

- 所有业务方法名在命名时尽量规范，方便切入点表达式快速匹配。如：findXxx，updateXxx；
- 描述切入点方法通常基于接口描述，而不是直接描述实现类，增强拓展性；
- 在满足业务需要的前提下，尽量缩小切入点的匹配范围。如：包名尽量不使用 `..`，使用 `*` 匹配单个包。

**@annotation 切入点表达式**

@annotation 切入点表达式，用于匹配标识有特定注解的方法。

写法：`@annotation(注解全类名)`。

应用场景选择：

- 如果 execution 切入点表达式方便描述指定的方法，就使用 execution 表达式；
- 否则，就使用 @annotation 切入点表达式。

**连接点（JoinPoint）**

核心结论：在 Spring 中用 JoinPoint 抽象了连接点，用它可以获得方法执行时的相关信息，如目标类名、方法名、方法参数等。

- 对于 **@Around** 通知，获取连接点信息只能使用 **ProceedingJoinPoint**；
- 对于**其它四种**通知，获取连接点信息只能使用 **JoinPoint**，它是 ProceedingJoinPoint 的父类型。

@Around 环绕通知获取连接点信息：

```java
@Around("execution(* com.itheima.service.DeptService.*(..))")
public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
    String className = joinPoint.getTarget().getClass().getName(); //获取目标类名
    Signature signature = joinPoint.getSignature(); //获取目标方法签名
    String methodName = joinPoint.getSignature().getName(); //获取目标方法名
    Object[] args = joinPoint.getArgs(); //获取目标方法运行参数
    Object res = joinPoint.proceed(); //执行原始方法,获取返回值（环绕通知）
    return res;
}
```

其它通知获取连接点信息（以 @Before 为例）：

```java
@Before("execution(* com.itheima.service.DeptService.*(..))")
public void before(JoinPoint joinPoint) {
    String className = joinPoint.getTarget().getClass().getName(); //获取目标类名
    Signature signature = joinPoint.getSignature(); //获取目标方法签名
    String methodName = joinPoint.getSignature().getName(); //获取目标方法名
    Object[] args = joinPoint.getArgs(); //获取目标方法运行参数
}
```

**AOP 案例——记录操作日志**

需求：将案例中增、删、改相关接口的操作日志记录到数据库表中。

日志信息包含：操作人、操作时间、执行方法的全类名、执行方法名、方法运行时参数、返回值、方法执行时长。

两问两答：

- 采用哪种通知类型？——**@Around 环绕通知**（因为需要方法执行时长与返回值）；
- 切入点表达式该怎么写？——由于增、删、改方法名我们定义的比较规范，分别为 save、delete、update：

```java
@Around("execution(* com.itheima.controller.*.save(..)) ||" +
        "execution(* com.itheima.controller.*.delete(..)) ||" +
        "execution(* com.itheima.controller.*.update(..))")
```

也可以改用注解方式定义切入点（结合自定义注解 @Log 使用）：

```java
@Around("@annotation(com.itheima.anno.Log)")
```

课件中基于 AI 生成的 Prompt（用于让 AI 生成记录操作日志的 AOP 程序）："请帮我基于 Spring AOP 实现记录系统所有增、删、改功能接口的操作日志。具体信息如下：…"

Prompt 详细内容：

1. 日志信息包含：操作人、操作时间、执行方法的全类名、执行方法名、方法运行时参数、返回值、方法执行时长；
2. 功能接口所在包为 com.itheima.controller；
3. 日志表为 operate_log 表，对应的实体类为 OperateLog。具体表结构如下：

```sql
create table operate_log(
    id int unsigned primary key auto_increment comment 'ID',
    operate_emp_id int unsigned comment '操作人ID',
    operate_time datetime comment '操作时间',
    class_name varchar(100) comment '操作的类名',
    method_name varchar(100) comment '操作的方法名',
    method_params varchar(1000) comment '方法参数',
    return_value varchar(2000) comment '返回值',
    cost_time bigint comment '方法执行耗时, 单位:ms'
) comment '操作日志表';
```

4. 并且已经提供了 OperateLogMapper 接口来操作 operate_log，并在其中已经定义好了 insert 方法用来保存日志数据。

**获取当前登录员工（ThreadLocal）**

三个关键问题：

- 员工登录成功后，哪里存储的有当前登录员工的信息？——**给客户端浏览器下发的 jwt 令牌中**；
- 如何从 jwt 令牌中获取到当前登录的员工信息？——**获取请求头中传递的 jwt 令牌，并解析**；
- TokenFilter 中已经解析了令牌的信息，如何将其传递给 AOP 程序、Controller、Service 呢？——**ThreadLocal**。

Prompt（基于 AI 生成该功能）："我在令牌校验过滤器 TokenFilter 中获取了 jwt 令牌，并对其进行解析获取到了当前登录员工的 ID，如何将这个 ID 传递给 AOP 程序、Controller、Service 中呢？"

**ThreadLocal 介绍**

核心结论：**ThreadLocal 并不是一个 Thread，而是 Thread 的局部变量**（线程本地变量）。ThreadLocal 为每个线程提供一份单独的存储空间，具有**线程隔离**的效果，不同的线程之间不会相互干扰。

结构示意：每个线程（Thread-1、Thread-2、Thread-3、Thread-4……）内部都各有一份自己的线程本地变量存储区（ThreadLocalMap），互不影响。

ThreadLocal 常用方法：

- `public void set(T value)`：设置当前线程的线程局部变量的值；
- `public T get()`：返回当前线程所对应的线程局部变量的值；
- `public void remove()`：移除当前线程的线程局部变量。

**获取当前登录员工——具体操作步骤**

1. 定义 ThreadLocal 操作的工具类，用于操作当前登录员工 ID；
2. 在 TokenFilter 中，解析完当前登录员工 ID，将其存入 ThreadLocal（用完之后需将其删除）；
3. 在 AOP 程序中，从 ThreadLocal 中获取当前登录员工的 ID。

数据流转：TokenFilter（解析令牌 → 存入 ThreadLocal）→ OperateLogAspect / Controller / Service（从 ThreadLocal 中取出当前员工 ID）→ Mapper（落库）。

小结：

- 什么是 ThreadLocal？——ThreadLocal 其实是线程的局部变量，为每个线程提供单独一份存储空间，具有线程隔离的效果，不同的线程之间不会相互干扰；
- ThreadLocal 的应用场景？——在同一个线程/同一个请求中，进行数据共享。

容易误解的地方：ThreadLocal 用完必须 `remove()`（课件在操作步骤中特别强调了"用完之后需将其删除"）——Web 服务器用的是线程池，线程会被复用；不清理会导致下一个请求读到上一个请求残留的数据（数据串用），也可能造成内存泄漏。

本节收束：AOP 是"面向特定方法编程"的思想，Spring AOP 通过动态代理为匹配切入点的方法织入通知；开发 AOP 只需"引入依赖 + 写切面类（通知 + 切入点表达式 + @Aspect/@Component 注解）"两步；配合 ThreadLocal 可以在同一次请求的过滤器、AOP、Controller、Service 之间安全共享当前登录员工信息，完成操作日志等横切功能。

### 第十三章：Maven 高级

**本章内容概览**

Maven 高级包含三块内容：**分模块设计与开发**、**继承与聚合**、**私服**。

**为什么需要分模块设计**

问题引入：若商城系统把"商品模块、搜索模块、购物车模块、订单模块"全部写在一个工程里，随着业务增长会出现两个突出问题——**不便维护**、**难以复用**。

解决方案：**分模块设计**——将一个大项目拆分成若干个子模块，同时把各模块共用的部分抽取为**通用组件**，这样方便项目的管理维护、扩展，也方便模块间的相互引用、资源共享。

**分模块设计——三种拆分策略**

- 策略一：**按照功能模块拆分**，比如：公共组件、商品模块、搜索模块、购物车模块、订单模块等。示例：mall-common、mall-goods、mall-search、mall-cart、mall-order；
- 策略二：**按层拆分**，比如：公共组件、实体类、控制层、业务层、数据访问层。示例：mall-common、mall-pojo、mall-controller、mall-service、mall-mapper；
- 策略三：**按照功能模块 + 层拆分**。示例：mall-common、mall-goods-controller、mall-goods-service、mall-order-controller、mall-order-service。

**分模块开发实战**

以 tlias 案例为例的模块拆分：

- 创建 maven 模块 **tlias-pojo**，存放实体类；
- 创建 maven 模块 **tlias-utils**，存放相关工具类。

注意事项：**分模块开发需要先针对模块功能进行设计，再进行编码**。不会先将工程开发完毕，然后进行拆分。

小结：

- 什么是分模块设计？——将项目按照功能模块/层拆分成若干个子模块；
- 为什么要分模块设计？——方便项目的管理维护、扩展，也方便模块间的相互引用、资源共享；
- 注意事项？——先设计，再编码。

**继承**

问题引入：tlias-pojo、tlias-utils、tlias-web-management 三个工程都要使用 lombok，于是每个工程的 pom.xml 里都重复粘贴了一遍同样的 `<dependency>` 配置（版本 1.18.34）——**繁琐**且难以统一管理。

概念：继承描述的是两个工程间的关系，与 java 中的继承相似，**子工程可以继承父工程中的配置信息**，常见于依赖关系的继承。

作用：**简化依赖配置、统一管理依赖**。

实现：`<parent> … </parent>`。

工程结构：新建父工程 **tlias-parent**，tlias-pojo、tlias-utils、tlias-web-management 均继承它。

**继承关系实现——三步**

1. 创建 maven 模块 tlias-parent，该工程为父工程，**设置打包方式为 pom**（默认 jar）：

```xml
<groupId>com.itheima</groupId>
<artifactId>tlias-parent</artifactId>
<version>1.0-SNAPSHOT</version>
<packaging>pom</packaging>
```

2. 在子工程的 pom.xml 文件中，配置继承关系：

```xml
<parent>
    <groupId>com.itheima</groupId>
    <artifactId>tlias-parent</artifactId>
    <version>1.0-SNAPSHOT</version>
    <relativePath>../tlias-parent/pom.xml</relativePath>
</parent>
```

3. 在父工程中配置各个工程共有的依赖（子工程会自动继承父工程的依赖）。

关于父工程自身：父工程 tlias-parent 一般也要继承 Spring Boot 提供的父工程 spring-boot-starter-parent：

```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.2.10</version>
    <relativePath/>
</parent>
```

**Maven 打包方式说明**：

- **jar**：普通模块打包，springboot 项目基本都是 jar 包（内嵌 tomcat 运行）；
- **war**：普通 web 程序打包，需要部署在外部的 tomcat 服务器中运行；
- **pom**：父工程或聚合工程，该模块不写代码，仅进行依赖管理。

小结：

- Maven 的继承关系实现步骤？——①创建父工程，设置打包方式为 pom，并继承 spring-boot-starter-parent；②在子工程中配置继承关系；③在父工程中配置各个工程的共有依赖；
- 在子工程中，配置了继承关系之后，坐标中的 **groupId 是可以省略的**，因为会自动继承父工程的（groupId）；
- **relativePath** 指定父工程的 pom 文件的相对位置（如果不指定，将从本地仓库/远程仓库查找）；
- 若父子工程都配置了同一个依赖的不同版本，**以子工程的为准**。

⚠️ 问题：课件第 14 页工程结构示意图注写为 `spring-boot-stater-parent`（stater 拼写有误），同页下方 XML 中写的是正确的 `spring-boot-starter-parent`，图注与代码拼写不一致；同一页子工程 `<relativePath>../ tlias-parent/pom.xml</relativePath>` 中 `../` 与 `tlias-parent` 之间多了一个空格，路径写法不规范。
修正建议：图注应写 `spring-boot-starter-parent`（starter 意为"启动器"）；relativePath 应为 `../tlias-parent/pom.xml`。

**版本锁定**

问题引入：各子工程引用的依赖版本散落在各子工程中，如何统一管理各个依赖的版本呢？

在 maven 中，可以在父工程的 pom 文件中通过 **`<dependencyManagement>`** 来统一管理依赖版本。

父工程（统一管理版本，此处以 JWT 令牌为例）：

```xml
<dependencyManagement>
    <dependencies>
        <!--JWT令牌-->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt</artifactId>
            <version>0.9.1</version>
        </dependency>
    </dependencies>
</dependencyManagement>
```

子工程（引入所需依赖，**无需指定版本**）：

```xml
<dependencies>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt</artifactId>
    </dependency>
</dependencies>
```

**自定义属性/引用属性**

进一步改进：把版本号抽取为属性，通过 `${属性名}` 引用，避免版本号到处散落：

```xml
<properties>
    <lombok.version>1.18.30</lombok.version>
    <jjwt.version>0.9.1</jjwt.version>
</properties>
```

```xml
<dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>${lombok.version}</version>
    </dependency>
</dependencies>
```

```xml
<dependencyManagement>
    <dependencies>
        <!--JWT令牌-->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt</artifactId>
            <version>${jjwt.version}</version>
        </dependency>
    </dependencies>
</dependencyManagement>
```

小结：`<dependencyManagement>` 与 `<dependencies>` 的区别是什么？

- `<dependencies>` 是**直接依赖**，在父工程配置了依赖，子工程会直接继承下来；
- `<dependencyManagement>` 是**统一管理依赖版本**，不会直接依赖，还需要在子工程中引入所需依赖（无需指定版本）。

**聚合**

概念：**将多个模块组织成一个整体，同时进行项目的构建**。

- 聚合工程：一个不具有业务功能的"空"工程（有且仅有一个 pom 文件）；
- 作用：快速构建项目（无需根据依赖关系手动构建，直接在聚合工程上构建即可）；
- 实现：maven 中可以通过 `<modules>` 设置当前聚合工程所包含的子模块名称。

父工程（聚合工程）中的配置：

```xml
<!--聚合-->
<modules>
    <module>../tlias-pojo</module>
    <module>../tlias-utils</module>
    <module>../tlias-web-management</module>
</modules>
```

注意：聚合工程中所包含的模块，在构建时，会**自动根据模块间的依赖关系设置构建顺序**，与聚合工程中模块的配置书写位置无关。

小结：

- maven 中如何实现聚合关系？——`<modules>...</modules>`；
- maven 中继承与聚合的联系与区别？——
  - 联系：继承与聚合都属于设计型模块，打包方式都为 pom，常将两种关系制作到同一个 pom 文件中；
  - 区别：继承用于简化依赖配置、统一管理依赖版本，是在**子工程**中配置继承关系；聚合用于快速构建项目，是在**父工程（聚合工程）**中配置聚合的模块。

**私服——介绍**

问题场景：团队中的 A 开发了 tlias-utils 工具包，B 需要使用它——直接从中央仓库拿不到团队私有资源（图中用 X 表示），需要一个团队内部的共享仓库。

概念：**私服是一种特殊的远程仓库，它是架设在局域网内的仓库服务，用来代理位于外部的中央仓库**，用于解决团队内部的资源共享与资源同步问题。

依赖查找顺序：**本地仓库 → 私服 → 中央仓库**。

注意：私服在企业项目开发中，一个项目/公司只需要一台即可（**无需我们自己搭建，会使用即可**）。

小结：

- Maven 私服的作用是什么？——解决团队内部的资源共享与资源同步问题；
- 有了私服之后依赖查找的顺序是什么样的？——本地仓库 → 私服 → 中央仓库。

**私服——资源上传与下载**

使用私服需要配置三类信息：

- 连接私服的地址（url 地址）；
- 访问私服的用户名/密码；
- 上传资源的位置（url 地址）。

**项目版本说明**：

- **RELEASE（发行版本）**：功能趋于稳定、当前更新停止，可以用于发行的版本，存储在私服中的 RELEASE 仓库中；
- **SNAPSHOT（快照版本）**：功能不稳定、尚处于开发中的版本，即快照版本，存储在私服的 SNAPSHOT 仓库中。

相关命令：**install**（安装到本地仓库）、**deploy**（发布到私服）。资源（如 tlias-utils）通过 deploy 上传到私服，其他开发者（如 B）就能从私服下载依赖（如 logback 等依赖也经由私服的 central 代理仓库下载）。

**步骤 1：设置私服的访问用户名/密码**（settings.xml 中的 servers 中配置）：

```xml
<server>
    <id>maven-releases</id>
    <username>admin</username>
    <password>admin</password>
</server>
<server>
    <id>maven-snapshots</id>
    <username>admin</username>
    <password>admin</password>
</server>
```

**步骤 2：IDEA 的 maven 工程的 pom 文件中配置上传（发布）地址**：

```xml
<distributionManagement>
    <repository>
        <id>maven-releases</id>
        <url>http://192.168.150.101:8081/repository/maven-releases/</url>
    </repository>
    <snapshotRepository>
        <id>maven-snapshots</id>
        <url>http://192.168.150.101:8081/repository/maven-snapshots/</url>
    </snapshotRepository>
</distributionManagement>
```

说明：`<repository>` 对应 **RELEASE 版本**的上传地址；`<snapshotRepository>` 对应 **SNAPSHOT 版本**的上传地址。

**步骤 3：设置私服依赖下载的仓库组地址**（settings.xml 中的 mirrors、profiles 中配置）：

```xml
<mirror>
    <id>maven-public</id>
    <mirrorOf>*</mirrorOf>
    <url>http://192.168.150.101:8081/repository/maven-public/</url>
</mirror>
```

```xml
<profile>
    <id>allow-snapshots</id>
    <activation>
        <activeByDefault>true</activeByDefault>
    </activation>
    <repositories>
        <repository>
            <id>maven-public</id>
            <url>http://192.168.150.101:8081/repository/maven-public/</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>
</profile>
```

小结：私服上传资源及下载资源的步骤？——**固定的，参照讲义操作即可**。

容易误解的地方：`<dependencyManagement>` 只是"版本管理清单"，本身不会引入依赖——子工程如果在 `<dependencies>` 里不写对应的依赖坐标，父工程中管理的那个依赖就不会生效；反过来，一旦子工程引入，就可以省略 `<version>`。

本节收束：Maven 高级解决的是**多模块工程的工程化问题**——分模块设计与开发负责把大项目拆小、把公共代码沉淀为通用组件；继承（pom 打包的父工程 + `<parent>` + 共有依赖 + `<dependencyManagement>` 版本锁定 + `<properties>` 自定义属性）让依赖配置集中管理；聚合（`<modules>`）让多模块一次性构建；私服则通过"本地仓库 → 私服 → 中央仓库"的查找顺序完成团队内部的资源共享与同步。

### 第十四章：SpringBoot 原理

**本章内容概览**

SpringBoot 原理篇包含三块内容：**配置优先级**、**Bean 管理**、**SpringBoot 原理**（起步依赖、自动配置）。这部分内容"熟练使用、面试高频、汲取思想"。

**配置优先级——三种配置文件格式**

SpringBoot 中支持三种格式的配置文件：

- ① `application.properties`：

```properties
server.port=8081
```

- ② `application.yml`：

```yaml
server:
  port: 8082
```

- ③ `application.yaml`：

```yaml
server:
  port: 8083
```

注意：虽然 SpringBoot 支持多种格式配置文件，但是在项目开发时，推荐统一使用一种格式的配置（**yml 是主流**）。

**配置优先级——Java 系统属性与命令行参数**

SpringBoot 除了支持配置文件属性配置，还支持 **Java 系统属性**和**命令行参数**的方式进行属性配置：

- Java 系统属性：`-Dserver.port=9000`；
- 命令行参数：`--server.port=10010`。

打包运行的操作步骤：

1. 执行 maven 打包指令 **package**；
2. 执行 java 指令，运行 jar 包：

```
java -Dserver.port=9000 -jar tlias-web-management-0.0.1-SNAPSHOT.jar --server.port=10010
```

注意：Springboot 项目进行打包时，需要引入插件 **spring-boot-maven-plugin**（基于官网骨架创建项目，会自动添加该插件）。

**配置优先级总表（低 → 高）**

- application.yaml（忽略）；
- application.yml；
- application.properties；
- java 系统属性（-Dxxx=xxx）；
- 命令行参数（--xxx=xxx）。

容易误解的地方：优先级列表中的"忽略"是指在多个配置文件**同时存在且配置冲突**时，application.yaml 的优先级最低、看起来像被忽略——并不意味着 SpringBoot 不支持 .yaml 扩展名；实际优先级场景中，命令行参数 > Java 系统属性 > properties > yml > yaml。

**Bean 管理——Bean 的作用域**

Spring 支持五种作用域，后三种在 web 环境才生效：

| 作用域 | 说明 |
| --- | --- |
| singleton | 容器内同名称的 bean 只有一个实例（单例）（默认） |
| prototype | 每次使用该 bean 时会创建新的实例（非单例/多例） |
| request | 每个请求范围内会创建新的实例（web 环境中，了解） |
| session | 每个会话范围内会创建新的实例（web 环境中，了解） |
| application | 每个应用范围内会创建新的实例（web 环境中，了解） |

通过 **@Scope** 注解配置作用域，例如把 DeptController 配置为 prototype：

```java
@Scope("prototype")
@RequestMapping("/depts")
@RestController
public class DeptController {
}
```

注意：默认 singleton 的 bean，在容器启动时被创建，可以使用 **@Lazy** 注解来延迟初始化（延迟到第一次使用时）。

**单例的 bean（singleton）**

```java
@Slf4j
@RestController
@Scope("singleton")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/depts")
    public Result list(){
        log.info("查询全部部门数据");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }
}
```

注意：实际开发当中，绝大部分的 Bean 是单例的，也就是说绝大部分 Bean 不需要配置 scope 属性。DeptController 这种不保存数据的 bean 属于**无状态的 bean**，单例能**节约资源、提升性能**。

**多例的 bean（prototype）**

```java
@Component
public class DataProcessor {
    private List<EmpModel> dataList = new ArrayList<EmpModel>(); //暂存数据
    private Integer errCount = 0; //错误数据统计
    @Autowired
    private EmpMapper empMapper;

    public void process(List<Emp> empList){
        dataList = empList.stream().map( emp -> {
            // 数据处理
        }).toList();
    }

    public void handle(){
        // ...
    }
}
```

DataProcessor 内部保存了数据（dataList、errCount），属于**有状态的 bean**，多个线程同时操作会出现数据不一致问题，因此需要加 `@Scope("prototype")` 声明为多例。

**面试题**

面试题 1：Spring 容器的 bean 是单例的还是多例的？单例的 bean 是什么时候实例化的？

- 默认是**单例**的；
- 单例的 bean，默认是**项目启动时**实例化的（通过 @Lazy 可以延迟初始化）。

面试题 2：Spring 容器的 bean 是线程安全的吗？

- bean 的线程安全取决于 bean 的**状态**及 bean 的**作用域**；
- 单例 bean：如果是**无状态**的 bean，内部不保存任何状态信息，则是线程安全的；
- 单例 bean：如果是**有状态**的 bean，内部会保存状态信息，多个线程会同时操作该 bean 时，可能会出现数据不一致的问题，这样的 bean 则是线程不安全的。

**Bean 管理——第三方 Bean**

注册 bean 的常用注解：@Component 及其衍生注解 @Controller、@Service、@Repository——但这些注解只能用于**自定义类**。

问题：如果要管理的 bean 对象来自于**第三方**（不是自定义的），是无法用 @Component 及衍生注解声明 bean 的，就需要用到 **@Bean 注解**。

若要管理的第三方 bean 对象较多，建议对这些 bean 进行集中分类配置，可以通过 **@Configuration 注解声明一个配置类**。

方式一——启动类中声明（不推荐）：

```java
@SpringBootApplication
public class SpringbootWebConfigApplication {

    @Bean //将方法返回值交给IOC容器管理,成为IOC容器的bean对象
    public AliyunOSSOperator aliyunOSSOperator(AliyunOSSProperties ossProperties) {
        return new AliyunOSSOperator(ossProperties);
    }
}
```

方式二——配置类中声明（推荐）：

```java
@Configuration
public class OSSConfig {
    @Bean
    public AliyunOSSOperator aliyunOSSOperator(AliyunOSSProperties ossProperties) {
        return new AliyunOSSOperator(ossProperties);
    }
}
```

两个注意点：

- 通过 @Bean 注解的 **name 或 value 属性**可以声明 bean 的名称，如果不指定，**默认 bean 的名称就是方法名**；
- 如果第三方 bean 需要依赖其它 bean 对象，直接在 bean 定义方法中**设置形参**即可，容器会根据类型自动装配。

小结：

- 什么时候使用 @Component 声明 bean，什么时候使用 @Bean 注解？——一般如果是项目中**自定义的类**，使用 @Component 及其衍生注解；如果是**引入第三方依赖中的类**，使用 @Bean 注解。

**SpringBoot 原理——整体认识**

SpringBoot 的两大核心是**起步依赖**与**自动配置**：以前的开发方式依赖、配置繁琐，SpringBoot 让开发变得简单、快捷。

**起步依赖原理**

常见的起步依赖：

- spring-boot-starter-web；
- spring-boot-starter-aop；
- spring-boot-starter-test；
- mybatis-spring-boot-starter；
- pagehelper-spring-boot-starter；
- spring-boot-starter-…。

原理：起步依赖本质上是**依赖传递**——引入一个 starter，它会通过自身的 pom 配置把所需的一整套依赖传递进来，从而简化依赖配置。

**什么是自动配置**

SpringBoot 的自动配置就是当 spring 项目启动后，一些**配置类、bean 对象就自动存入到了 IOC 容器中**，不需要我们手动去声明，从而简化了开发，省去了繁琐的配置操作。

**自动配置实现方案**

场景引入：假设第三方工具包 itheima-utils 中定义了 TokenParser（带 @Component 注解），我们的项目引入该工具包后，TokenParser 的 bean 能否被扫描到？

方案一——**@ComponentScan 扫描指定的包**：

```java
@ComponentScan({"com.example","com.itheima"})
@SpringBootApplication
public class SpringbootWebConfigApplication {
    //...
}
```

第三方工具包中的类：

```java
@Component
public class TokenParser {
    public void parse(){
        System.out.println("TokenParser ... parse ...");
    }
}
```

缺陷：@ComponentScan 必须把所有用到的包都列出来（`,"com.alibaba","com.google",...})`），**性能低、使用繁琐**。

方案二——**@Import 导入**（更方便、优雅）：

```java
@Import({TokenParser.class, HeaderConfig.class})
@SpringBootApplication
public class SpringbootWebConfig2Application {
    //...
}
```

其中配置类：

```java
@Configuration
public class HeaderConfig {
    @Bean
    public HeaderParser headerParser(){
        return new HeaderParser();
    }
    @Bean
    public HeaderGenerator headerGenerator(){
        return new HeaderGenerator();
    }
}
```

**@Import 导入的类会被 Spring 加载到 IOC 容器中**，导入形式主要有以下几种：

- 导入普通类；
- 导入配置类；
- 导入 ImportSelector 接口实现类；
- @EnableXxxx 注解，封装 @Import 注解。

小结：

- 为什么第三方依赖中使用 @Component 及其衍生注解声明 bean 不生效？——基于 @Component 及其衍生注解声明的 bean 要想生效，需要被**组件扫描注解扫描到**（默认只扫描引导类所在包及其子包）；
- 有哪些方案可以使其生效呢？——通过 @ComponentScan 注解扫描指定的包；通过 @Import 注解将其导入到 IOC 容器中（四种常见方式：普通类、配置类、ImportSelector 实现类、@EnableXxx）。

**自动配置——源码跟踪**

**@SpringBootApplication**：该注解标识在 SpringBoot 工程引导类上，是 SpringBoot 中最最最重要的注解。该注解由三个部分组成：

1. **@SpringBootConfiguration**：该注解与 @Configuration 注解作用相同，用来声明当前也是一个配置类；
2. **@ComponentScan**：组件扫描，默认扫描当前引导类所在包及其子包；
3. **@EnableAutoConfiguration**：SpringBoot 实现自动化配置的核心注解。

**@EnableAutoConfiguration 内部逻辑**：自动配置类（XxxAutoConfiguration）如何被加载？

- 在低版本（2.7.0 以前）的 springboot 中，自动配置类（XxxAutoConfiguration）是**定义在 spring.factories 文件中**；
- 新版本中则通过 `META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports` 文件配置。

思考：全部自动配置类都注册为 IOC 容器的 bean 吗？——**NO!** 源码中 `String[] selectImports(...)` 返回的自动配置类还要经过条件筛选，SpringBoot 会根据 **@Conditional 注解**进行**条件装配**。

**@Conditional 条件注解**

作用：按照一定的条件进行判断，**在满足给定条件后才会注册对应的 bean 对象到 Spring IOC 容器中**。

位置：**方法、类**（方法上——针对于当前这个方法声明的 bean；类上——针对于这个类中所有的方法声明的 bean）。

@Conditional 本身是一个父注解，派生出大量的子注解：

- **@ConditionalOnClass**：判断环境中是否有对应字节码文件，才注册 bean 到 IOC 容器；
- **@ConditionalOnMissingBean**：判断环境中没有对应的 bean（类型或名称），才注册 bean 到 IOC 容器；
- **@ConditionalOnProperty**：判断配置文件中有对应属性和值，才注册 bean 到 IOC 容器。

小结：

- @Conditional 及其衍生注解的作用是什么？——满足给定条件后，注册对应的 bean 对象到 Spring IOC 容器中；
- @Conditional 及其衍生注解可以作用在什么地方？——方法上（针对于当前这个方法声明的 bean）、类上（针对于这个类中所有的方法声明的 bean）；
- 自己定义自动配置类的核心是什么？如何完成自动配置？——定义自动配置类；将自动配置类配置在 `META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports` 文件中。

**自定义 starter**

场景：在实际开发中，经常会定义一些公共组件，提供给各个项目团队使用。而在 SpringBoot 的项目中，一般会将这些公共组件封装为 SpringBoot 的 **starter**（包含了**起步依赖**和**自动配置**的功能）——SpringBoot 官方与其它技术提供方的各种 starter 都是如此：既有自动配置功能，又有依赖管理功能。

需求：自定义 **aliyun-oss-spring-boot-starter**，完成阿里云 OSS 操作工具类 AliyunOSSOperator 的自动配置。

目标：引入起步依赖之后，要想使用阿里云 OSS，**注入 AliyunOSSOperator 直接使用即可**。

步骤：

1. 创建 aliyun-oss-spring-boot-starter 模块；
2. 创建 aliyun-oss-spring-boot-autoconfigure 模块，在 starter 中引入该模块；
3. 在 aliyun-oss-spring-boot-autoconfigure 模块中定义自动配置功能，并定义自动配置文件 `META-INF/spring/xxxx.imports`。

结构理解：starter 模块只负责**依赖管理功能**（引入 autoconfigure 模块及其它所需依赖）；autoconfigure 模块负责**自动配置功能**（写自动配置类 + imports 文件）。

本节收束：配置优先级（命令行参数 > Java 系统属性 > properties > yml > yaml）决定了同一属性在多层配置下的最终取值；Bean 管理回答了"bean 何时创建、是否线程安全（单例 + 无状态才安全）、第三方类如何注册（@Bean + @Configuration）"；SpringBoot 原理揭示了"起步依赖 = 依赖传递"、"自动配置 = @EnableAutoConfiguration + AutoConfiguration.imports 文件 + @Conditional 条件装配"，而自定义 starter 正是把这两大机制组合起来封装公共组件的标准做法。

### 第十五章：Web后端开发总结

**整体知识框架——三层架构**

Web 后端开发的主干是经典三层架构，一次请求的处理链路为：

浏览器请求 → **Controller**（控制层）→ **Service**（业务层）→ **Dao**（数据访问层）→ **MySQL**（数据库）→ 逐层返回结果 → 响应给浏览器。

- **Controller**：负责接收请求、接收请求参数、响应数据；
- **Service**：负责业务逻辑处理（含事务控制）；
- **Dao**：负责数据访问，与数据库交互；
- **MySQL**：数据的最终存储位置。

**技术栈全景（按课件归类）**

至此，Web 后端开发阶段接触到的全部技术组件可以按大块归类回顾：

- **JavaWeb 基础**：过滤器 Filter（登录校验的统一拦截入口）；
- **会话与认证方案**：Cookie、Session（传统会话跟踪方案）、JWT 令牌（主流方案，登录认证的核心）；
- **Spring framework 解决方案**：
  - **IOC**：控制反转，bean 对象交给容器管理；
  - **DI**：依赖注入，bean 之间自动装配；
  - **AOP**：面向切面编程，把日志、耗时统计等公共逻辑剥离出业务方法；
  - **事务管理**：@Transactional，保证业务方法的一致性；
  - **全局异常处理**：@RestControllerAdvice 统一处理项目中抛出的异常；
  - **拦截器 Interceptor**：登录校验等统一拦截（与 Filter 相互配合）；
- **SpringMVC（web 层能力）**：接收请求、响应数据；
- **Mybatis（数据层框架）**：操作 MySQL 数据库（注解、XML 映射、动态 SQL、PageHelper 分页）；
- **SpringBoot**：统一整合 Spring、SpringMVC、Mybatis 等框架，通过起步依赖与自动配置简化工程搭建；
- **第三方解决方案**：阿里云 OSS（文件存储）。

**学习路径回顾（课件总结视角）**

从 JavaWeb 基础（Filter、Cookie、Session）出发，经由 Spring framework 提供 IOC/DI/AOP/事务/异常处理/拦截器六大解决方案，再由 SpringMVC 负责请求接收与数据响应、Mybatis 负责数据库访问、SpringBoot 负责整体整合，最后叠加 JWT、阿里云 OSS 等项目实战常用组件——这条主线构成了后端案例（Tlias 智能学习辅助系统）的全部技术底座。

本节收束：Web 后端部分至此全部结束。掌握"三层架构的职责划分 + 各框架解决的问题"，比记住单个注解更重要——Controller 解决"怎么接、怎么回"，Service 解决"业务怎么做、事务怎么保"，Dao 解决"数据怎么存、怎么取"，而 Spring 全家桶与各类组件则围绕这三层提供通用能力的支撑。

### 第十六章：Web前端实战——Vue 工程化与 Element Plus

**本章在课程中的位置**

Web 开发整体蓝图：Web 前端基础（HTML、CSS、JavaScript、Vue3、Ajax/Axios）→ Web 后端基础（Maven、Web 基础知识、MySQL、JDBC、Mybatis）→ Web 后端实战（Tlias 案例）→ **Web 前端实战（Vue 工程化、Element Plus、Tlias 案例）** → Web 项目部署（Linux、Docker）。本章进入"Web 前端实战"，学习 **Vue 工程化**与 **Element Plus**。

**什么是 Vue**

核心结论：Vue 是一款用于构建用户界面的**渐进式的 JavaScript 框架**（官方：https://cn.vuejs.org/）。

示例数据（界面由数据渲染而来）：

```
[
  {"id": 1, "name": "谢逊", "image": "1.jpg", "gender": 1, "job": 1},
  {"id": 2, "name": "韦一笑", "image": "2.jpg", "gender": 1, "job": 1}
]
```

Vue 的核心能力：**基于数据渲染出用户看到的界面**。

Vue 是一个框架，也是一个生态：

- 声明式渲染、组件系统（Vue 核心包）；
- 客户端路由（VueRouter）；
- 状态管理（Pinia、Vuex）；
- 构建工具（Vite、Webpack）。

从使用方式看，Vue 的开发呈递进关系：**Vue 核心包开发**（局部模块改造）→ **Vue 工程化开发**（整站开发）。

**前端工程化**

问题引入（小白眼中的前端开发）：命名乱（image、pic、picture 混用）、代码不规范——导致**不规范、难维护、难复用**。

工程化的四个方面：

- **模块化**：项目划分若干模块，单独开发、维护，提高效率；
- **组件化**：将页面的各个组成部分封装为一个一个的组件，提高复用；
- **规范化**：提供标准统一的目录结构、编码规范、开发流程；
- **自动化**：项目的构建、开发、测试、打包、部署。

前端工程化定义：在企业级的前端项目开发中，把前端开发所需的**工具、技术、流程、经验**等进行**规范化、标准化**——达到统一规范、提高复用、便于维护的目标。

**环境准备——NodeJS 与 npm**

- **create-vue** 是 Vue 官方提供的最新的脚手架工具，用于快速生成一个工程化的 Vue 项目；
- create-vue 提供了如下功能：统一的目录结构、本地调试、热部署、单元测试、集成打包上线；
- 依赖环境：**NodeJS**（安装 NodeJS 后即自带 npm）；
- **npm**：Node Package Manager，是 NodeJS 的软件包管理器（`npm install xxxx` 从远程仓库下载并安装第三方包）。

**Vue 项目——创建**

创建一个工程化的 Vue 项目，执行命令：

```
npm create vue@3.3.4
```

执行后会进入交互式问答（括号内为默认值）：

- **Project name**：项目名称，默认值 vue-project，可输入想要的项目名称；
- **Add TypeScript?**：是否加入 TypeScript 组件？默认值 No；
- **Add JSX Support?**：是否加入 JSX 支持？默认值 No；
- **Add Vue Router ...**：是否为单页应用程序开发添加 Vue Router 路由管理组件？默认值 No；
- **Add Pinia ...**：是否添加 Pinia 组件来进行状态管理？默认值 No；
- **Add Vitest ...**：是否添加 Vitest 来进行单元测试？默认值 No；
- **Add an End-to-End ...**：是否添加端到端测试？默认值 No；
- **Add ESLint for code quality?**：是否添加 ESLint 来进行代码质量检查？默认值 No。

提示：执行上述指令，将会安装并执行 create-vue，它是 Vue 官方的项目脚手架工具。

**Vue 项目——安装依赖**

进入项目目录，执行命令安装当前项目的依赖：

```
npm install
```

注意：创建项目以及安装依赖的过程，都是需要联网的。

**Vue 项目——项目结构**

使用 **VS Code** 打开 Vue 项目，各目录/文件的职责：

- 配置信息目录：Vue 项目的配置信息，如：端口号等；
- **package.json**：项目配置文件，包括项目名、版本号、依赖包、版本等；
- **src**：源代码存放目录（写代码的文件夹）；
- **node_modules**：下载的第三方包存放目录；
- **assets**：静态资源目录，存放图片、字体……；
- **components**：组件目录，存放通用组件；
- **App.vue**：根组件；
- **main.js**：入口文件。

**Vue 项目——启动**

执行命令：

```
npm run dev
```

就可以启动 Vue 项目。访问项目：打开浏览器，在浏览器地址栏访问 **http://localhost:5173** 就可以访问到 Vue 项目。

**Vue 项目操作小结**

- 创建：`npm create vue@版本号`；
- 安装依赖：`npm install`；
- 启动：`npm run dev`。

**Vue 项目开发流程**

整体流程：默认首页 ← 入口文件 ← 根组件（项目由入口文件加载根组件，根组件渲染出默认首页）。

**单文件组件（SFC）**：`*.vue` 是 Vue 项目中的组件文件，在 Vue 项目中也称为单文件组件（SFC，Single-File Components）。Vue 的单文件组件会将一个组件的**逻辑（JS）、模板（HTML）和样式（CSS）封装在同一个文件里**（*.vue）：

- `<template>`：模板部分，由它生成 HTML；
- `<style>`：当前组件的 CSS 样式；
- `<script>`：控制模板的数据及行为。

**API 风格——选项式 API 与组合式 API**

Vue 的组件有两种不同的风格：**选项式 API** 和 **组合式 API**。

选项式 API写法：

```html
<script>
export default {
    data(){ //声明响应式对象
        return {
            count: 0
        }
    },
    methods: { //声明方法，可以通过组件实例访问
        increment: function(){
            this.count++ ;
        }
    },
    mounted(){ //声明钩子函数
        console.log('Vue mounted ...');
    }
}
</script>
<template>
    <button @click="increment">count:{{ count }}</button>
</template>
```

组合式 API写法：

```html
<script setup>
import { ref,onMounted } from 'vue';

const count = ref(0);  //声明响应式变量
function increment(){  //声明函数
    count.value++;
}
onMounted(()=>{ //声明钩子函数
    console.log('Vue Mounted ...');
})
</script>
<template>
    <button @click="increment">count:{{ count }}</button>
</template>
```

两种风格的说明：

- **选项式 API**：可以用包含多个选项的对象来描述组件的逻辑，如：data，methods，mounted 等。选项定义的属性都会暴露在函数内部的 this 上，它会指向当前的组件实例；
- **组合式 API**：是 Vue3 提供的一种基于函数的组件编写方式，通过使用函数来组织和复用组件的逻辑。它提供了一种更灵活、更可组合的方式来编写组件。

**组合式 API 关键点**

- **ref()**：接收一个内部值，返回一个响应式的 ref 对象，此对象只有一个指向内部值的属性 value；
- **onMounted()**：在组合式 API 中的钩子方法，注册一个回调函数，在组件挂载完成后执行；
- **setup**：是一个标识，告诉 Vue 需要进行一些处理，让我们可以更简洁地使用组合式 API；
- 注意：在 Vue 中的组合式 API 使用时，**是没有 this 对象的**，this 对象是 undefined。

小结：

- 在组合式 API 中有没有 this？——没有 this；
- 在组合式 API 中如何更新响应式数据内容？——`xxx.value`。

**案例——用户列表数据渲染**

需求：在 Vue 项目中基于组合式 API 完成用户列表数据渲染。要求在页面加载完毕之后，发送异步请求，加载数据，渲染表格。

项目中用到 axios，就需要安装 axios 的依赖：

```
npm install axios
```

**什么是 Element Plus**

- Element：是**饿了么团队**研发的，基于 **Vue3**，面向设计师和开发者的**组件库**；
- 组件：组成网页的部件，例如 超链接、按钮、图片、表格、表单、分页条等等；
- 官网：https://element-plus.org/zh-CN/#/zh-CN。

**Element Plus——快速入门**

准备工作：

1. 创建 vue 项目；
2. 参照官方文档，安装 Element Plus 组件库（在当前工程的目录下）：

```
npm install element-plus@2.4.4 --save
```

3. main.js 中引入 Element Plus 组件库（参照官方文档）：

```javascript
//引入ElementPlus
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

createApp(App).use(ElementPlus).mount('#app')
```

4. 制作组件：访问 Element 官方文档，复制组件代码，调整。

ElementPlus 的使用步骤小结：

- 安装：`npm install element-plus@2.4.4 --save`；
- 引入：在 main.js 中引入 Element Plus（参照官方文档）；
- 组件：访问官方文档中的组件，调整成我们需要的样子即可。

⚠️ 问题：课件第 36 页"ElementPlus 的使用步骤"中安装命令写为 `npm install element-plus@2.4.4 –save`，其中 `–` 是全角破折号（而第 35 页写的是半角 `--save`）——命令照抄到终端执行会报错。
修正建议：应统一使用半角连字符：`npm install element-plus@2.4.4 --save`。

**常见组件——表格组件**

用于展示多条结构类似的数据，可对数据进行排序、筛选、对比或其他自定义操作。

表格组件使用的关键点：表格组件使用时关键点在于清楚表格中**绑定的数据 data**，以及**每一列要展示的属性信息**。项目开发中的数据应该是 **Ajax 异步请求服务端，服务器端返回**。

**常见组件——分页条组件**

当数据量过多时，使用分页操作分解数据。

默认 Element Plus 的组件是**英文**的，如果希望使用中文语言，可以在 main.js 中做如下配置：

```javascript
//引入中文语言
import zhCn from 'element-plus/es/locale/lang/zh-cn'

createApp(App).use(ElementPlus, { locale: zhCn }).mount('#app')
```

**常见组件——对话框组件**

在**保留当前页面状态**的情况下，告知用户并承载相关操作。

Dialog 对话框组件使用的关键点：通过 **model-value/v-model 给定的 boolean 值**，来控制 Dialog 的显示与隐藏。

**常见组件——表单组件**

表单包含 输入框、单选框、下拉选择、多选框 等用户输入的组件。使用表单，可以收集、验证和提交数据。

表单组件使用的关键点：

- 表单项数据采集：**v-model 数据绑定**；
- 表单数据提交：**事件绑定**。

**案例——ElementPlus 综合页面**

需求：制作目标页面，并异步获取数据完成页面展示——包含两部分工作：页面布局、动态加载数据并渲染展示。

本节收束：Vue 工程化用 create-vue 脚手架 + npm 完成了"规范化项目结构"的第一步，单文件组件（SFC）把模板、逻辑、样式收拢在一个 .vue 文件中，组合式 API（`<script setup>` + ref + onMounted，注意没有 this、更新用 `xxx.value`）是 Vue3 的主流写法；Element Plus 则提供开箱即用的表格、分页条、对话框、表单等组件——"安装 → main.js 引入 → 复制文档组件代码调整"三步即可在项目中直接使用。

### 第十七章：Web前端实战——Tlias 智能学习辅助系统

**案例概述**

本章基于 Vue3 + Element Plus 完成 Tlias 智能学习辅助系统的**前端**开发，功能模块包括：开发模式、整体布局、部门管理、员工管理、登录/退出，以及**班级管理（自己实现）、学员管理（自己实现）**两个练习模块。

**开发模式——前后端分离**

当前最为主流的开发模式：**前后端分离**。

- 前端开发、后端开发两条线并行，双方共同依据**接口文档**（阅读-开发），前端按**原型+需求**开发页面，通过**请求/响应**与服务端交互；
- 开发流程：**需求分析 → 接口定义 → 前后端并行开发 → 测试 → 前后端联调测试**。

小结：什么是前后端分离开发模式？——前后端开发人员**独立开发，独立部署**；需求的开发流程如上五步。

**整体布局——准备工作**

1. 导入资料中准备的基础工程到 VS Code；
2. 启动前端项目，访问该项目。

**整体布局——页面布局**

页面主体采用 Element Plus 的 **Container 布局容器**：

- `<el-container>`：外层容器；
- `<el-header>`：顶栏容器；
- `<el-aside>`：侧边栏容器；
- `<el-main>`：主要区域容器；
- `<el-footer>`：底栏容器。

整体布局 = 顶部栏（el-header）+ 左侧菜单（el-aside）+ 右侧主区域（el-main）。

**整体布局——动态菜单（Vue Router）**

**介绍**：Vue Router 是 Vue 的官方路由。为 Vue 提供富有表现力、可配置的、方便的路由（https://router.vuejs.org/zh）。Vue 中的**路由**：路径与组件的对应关系。

**组成（三个核心部分）**：

- **Router 实例**：路由实例，基于 createRouter 函数创建，维护了应用的路由信息（routes）；
- **`<router-link>`**：路由链接组件，浏览器会解析成 `<a>`；
- **`<router-view>`**：动态视图组件，用来渲染展示与路由路径对应的组件。

工作方式示意：routes 中配置"路径 → 组件"的映射（如 `/stu` → `/views/stu/index.vue`、`/emp` → `/views/emp/index.vue`、`/dept` → `/views/dept/index.vue`）；`<router-link to='/emp'>员工管理</router-link>` 发出路由请求，`<router-view></router-view>` 随路径变化动态渲染对应组件。

**案例路由实现**：采用**嵌套路由**——App.vue 中放置 `<router-view></router-view>` 渲染 layout/index.vue；layout/index.vue 内部再放一个 `<router-view>` 用来渲染 index/index.vue（首页）、dept/index.vue（部门管理）等子页面；左侧菜单通过 `<router-link>` 切换路径。

小结：

- Vue 的路由指的是什么？——Vue Router 是 Vue 官方的路由，描述的是路径与组件的对应关系；
- Vue Router 中的三个核心组成部分？——router 实例（维护应用的路由信息 routes）、`<router-link>`（路由链接组件）、`<router-view>`（动态视图组件）。

课件基于 AI 生成动态路由的 Prompt（用于 /layout/index.vue 左侧菜单点击后右侧跳转）：

"你是一名前端开发工程师，现在基于 Vue3+ElementPlus 开发了一个前端项目。制作了一个页面 /layout/index.vue，页面中左侧是菜单，右侧是主展示区域，现在想点击左侧的菜单右侧跳转到对应的主展示区域。具体的规则如下：

1. 点击首页，展示 /index/index.vue；
2. 点击班级管理，展示 /clazz/index.vue；
3. 点击学员管理，展示 /stu/index.vue；
4. 点击部门管理，展示 /dept/index.vue；
5. 点击员工管理，展示 /emp/index.vue；
6. 点击员工信息统计，展示 /report/emp/index.vue；
7. 点击学员信息统计，展示 /report/stu/index.vue；
8. 点击日志信息统计，展示 /log/index.vue；
9. 当访问 /login 路径时，则要展示的是独立的登录页面 /login/index.vue，不是在右侧的主展示区域展示。目前 /layout/index.vue 中具体的页面内容如下……"

**部门管理——列表查询（页面布局）**

根据页面原型、需求说明、接口文档，先完成页面的基本布局，涉及组件：

- **Button 按钮组件**（新增按钮等）；
- **Table 表格组件**（展示部门列表）。

课件基于 AI 生成表格的 Prompt：

"你是一名前端开发工程师，现需要基于 Vue3+ElementPlus，开发一个表格，具体需求如下：表格需要带边框，并且表格最后有一列操作，操作中包含：修改、删除两个按钮。表格中要渲染展示的列包括：序号、部门名称、最后修改时间。具体的 json 格式如下：{ "code": 1, "msg": "success", "data": [ { "id": 1, "name": "学工部", "createTime": "2022-09-01T23:06:29", "updateTime": "2022-09-01T23:06:29" }, { "id": 2, "name": "教研部", "createTime": "2022-09-01T23:06:29", "updateTime": "2022-09-01T23:06:29" } ] }"。

**部门管理——列表查询（加载数据）**

需求：在打开页面之后，需要**自动加载**全部部门数据，展示在表格中（钩子函数 onMounted + Axios 发送异步请求）。

前后端分离开发模式中，前后端是并行开发的，前端如何进行接口请求测试？——**Mock.js 来生成测试的假数据**、**基于 Apifox 提供的 Mock 服务进行测试**。

直接在 vue 组件中基于 axios 发送异步请求存在的问题（dept/index.vue 示例）：

```javascript
const search = async () => {
    const result = await axios.get('https://apifoxmock.com/m1/3128855-default/depts');
    if (result.data.code) {
        deptList.value = result.data.data;
    }
};
```

两个问题：**请求路径难以维护**、**数据解析繁琐**。

**部门管理——列表查询（程序优化）**

为解决上述问题，在前端项目开发时，通常会定义：

- **请求处理的工具类 request.js**（封装 axios 异步请求的基本信息、拦截器）；
- **API 模块文件**（如 dept.js），与服务端进行异步交互的逻辑封装到单独的 api 中；

utils/request.js：

```javascript
import axios from 'axios'
//创建axios实例对象
const request = axios.create({
    baseURL: 'https://apifoxmock.com...',
    timeout: 600000
})
//axios的响应 response 拦截器
request.interceptors.response.use(
    (response) => { //成功回调
        return response.data
    },
    (error) => { //失败回调
        return Promise.reject(error)
    }
)
export default request
```

api/dept.js：

```javascript
import request from '@/utils/request'
//部门列表查询
export const queryAllApi = () =>  request.get('/depts');
```

dept/index.vue：

```javascript
import { queryAllApi } from '@/api/dept'
//...省略
//动态加载数据-查询部门
const search = async () => {
    const result = await queryAllApi()
    deptList.value = result.data
}
```

**vite.config.js 代理配置**：开发阶段前端（5173 端口）直接请求后端（8080 端口）会跨域，在 vite.config.js 中配置前端请求服务器信息：

```javascript
server: {
    proxy: {
      '/api': {
        target: 'http://localhost:8080',
        secure: false,
        changeOrigin: true,
        rewrite: (path) => path.replace(/^\/api/, '')
      }
    }
}
```

请求链路（含代理转发过程）：dept.js 中写 `'/api'` 开头的路径 → request.js 组装成 `/api/depts` → vite 代理捕获 `/api` 前缀并 rewrite 去掉 → `/depts` → 转发到 `http://localhost:8080/depts`。

小结：

- 请求处理工具类：request.js——封装 axios 异步请求的基本信息（拦截器）；
- api/xxx.js——封装模块异步交互的代码；
- vite.config.js——配置代理规则。

**部门管理——新增部门**

根据页面原型、需求说明、接口文档，先完成页面的基本布局，涉及组件：

- **Dialog 对话框组件**；
- **Form 表单组件**。

提示：**新增部门和编辑部门可以共用一个 Dialog 对话框**。

**新增部门——表单校验**（Element Plus 的 form 表单组件提供了表单校验功能），具体步骤如下：

1. 定义表单校验规则，通过 **rules 属性**与表单绑定；
2. 通过 **prop 属性**绑定对应的表单项；
3. 通过 **ref 属性**注册表单的引用，表单提交时校验表单，校验通过则允许提交表单。

dept/index.vue 示例：

```javascript
const deptFormRef = ref()
const rules = ref({//表单校验规则
    name: [
        { required: true, message: '请输入部门名称', trigger: 'blur' },
        { min: 2, max: 10, message: '部门名称的长度在2-10之间', trigger: 'blur' }
    ]
})
```

```html
<el-form :model="dept" :rules="rules" ref="deptFormRef">
    <el-form-item label="部门名称" label-width="80px" prop="name">
        <el-input v-model="dept.name" autocomplete="off" />
    </el-form-item>
    <el-button type="primary" @click="save">保存</el-button>
</el-form>
```

```javascript
const save = () => {
    //表单校验
    deptFormRef.value.validate(async (valid) => {
        if(valid) {
            //...
        }
    })
}
```

**部门管理——修改部门**

对于修改操作，通常会分为两步进行：① **查询回显**、② **保存修改**。

交互逻辑：

- 点击 编辑 按钮，根据 ID 进行查询，弹出对话框，完成页面回显展示（查询回显）；
- 点击 确定 按钮，保存修改后的数据，完成数据更新操作（保存修改）。

**部门管理——删除部门**

交互逻辑：点击删除按钮，需要删除当前这条数据，删除完成之后，刷新页面，展示出最新的数据。

由于删除是一个比较危险的操作，为避免误操作，通常会在点击删除之后，**弹出确认框进行确认**——使用 Element 组件：**ElMessageBox 消息弹出框组件**。

**员工管理——需求分析**

员工管理包含四个功能：**条件分页查询、新增员工、修改员工、删除员工**。

**员工管理——条件分页查询（页面布局）**

页面由四部分组成：**搜索栏、按钮、数据展示表格、分页条**。

**搜索表单**：如果表单封装的数据较多，建议绑定到一个对象中：

```javascript
//搜索表单对象
let searchEmp = ref({
    name: '',
    gender: '',
    date: []
})
```

日期选择器返回的是数组（如 `['2025-01-01', '2025-12-31']`），而查询接口需要 begin、end 两个参数，因此需要 **watch() 侦听**做一次转换：

```javascript
//搜索表单对象
let searchEmp = ref({
    name: '',
    gender: '',
    date: [],
    begin: '',
    end: ''
})
```

侦听效果：`date` 变化为 `['2025-01-01', '2025-12-31']` 时，自动拆分为 `begin='2025-01-01'`、`end='2025-12-31'`。

**watch 侦听函数**：

- 作用：侦听一个或多个响应式数据源，并在数据源变化时调用传入的回调函数；
- 用法：
  1. 导入 watch 函数；
  2. 执行 watch 函数，传入要侦听的响应式数据源（ref 对象）和回调函数。

```javascript
import { ref, watch } from 'vue'
const a = ref('')
watch(a, (newVal , oldVal) => { //侦听a的变化
    console.log(`a的值为: newVal: ${newVal}, oldVal: ${oldVal}`);
})
```

**watch 侦听对象**：

侦听对象的单个属性：

```javascript
import { ref, watch } from 'vue'
const user = ref({name:'', age:10})
watch( () => user.value.name , (newVal , oldVal) => {  //侦听user对象中name的变化
    console.log(`a的值为: newVal: ${newVal}, oldVal: ${oldVal}`);
})
```

侦听对象的全部属性：

```javascript
import { ref, watch } from 'vue'
const user = ref({name:'', age:10})
watch(user, (newVal , oldVal) => {  //侦听user对象中的全部属性的变化
    console.log(`a的值为: newVal: ${newVal}, oldVal: ${oldVal}`);
}, {deep: true})
```

第三个可选参数，常见两个选项：

- **deep**（boolean）：是否深度侦听，默认浅层侦听；
- **immediate**（boolean）：是否在侦听创建时立即触发回调函数。

小结：

- watch 侦听函数的作用？——侦听一个或多个响应式数据源，并在数据源变化时调用所给的回调函数；
- watch 函数调用时传入的参数？——参数一：侦听的源（可以是一个 ref 对象、一个函数等）；参数二：侦听的源发生变化时触发的回调函数；参数三：可选，是一个对象（deep、immediate）；
- 能否侦听对象的一个属性或全部属性？——可以：侦听一个属性时第一个参数传递函数 `() => user.value.name`；侦听全部属性时第三个参数传递对象指定 `deep: true` 深度侦听。

**员工管理——条件分页查询（页面交互）**

三类触发时机：

- 页面加载完毕后，查询员工信息列表；
- 点击查询按钮，查询员工信息列表；
- 当**页码、每页展示记录数发生变化**时，查询员工信息列表。

**员工管理——新增员工（页面布局）**

新增员工信息的表单包含两个部分：

- **员工的基本信息**；
- **员工的工作经历信息**。

表单项数据动态展示：

- 性别（男/女）；
- 职位（班主任/讲师/学工主管/教研主管/...）；
- 所属部门（动态查询）。

**员工管理——新增员工（页面交互）**

- 添加工作经历：下方就会增加一个工作经历信息（添加元素）；
- 删除工作经历：删除当前这一个工作经历信息（删除元素）。

关键认识：**Vue 是基于数据驱动视图展示的**——工作经历列表的数组增删决定界面上行数的增删。

保存逻辑：

- 点击保存之后，发送异步请求到服务端，提交数据；
- 保存完毕之后，如果成功，关闭对话框，重新加载列表数据；
- 保存完毕之后，如果失败，提示错误信息。

**表单校验规则**：

- 用户名：必填，长度 2-20；
- 姓名：必填，长度 2-10；
- 性别：必填；
- 手机号：必填，符合手机号规则。

课件基于 AI 生成"新增员工 Dialog 表单"的 Prompt（要点）：

"接下来，要完成的是新增员工的功能，当点击页面上的'新增员工'按钮后，要弹出一个 Dialog 对话框，在对话框中要承载一个用户信息的 form 表单。具体的要求如下：

1. 该对话框中的 form 表单在新增和修改员工时，使用的是同一个表单。所以在新增员工时，表单标题显示为'新增员工'，修改员工时，表单标题显示为'修改员工'；
2. 表单分为两个部分展示，一个部分是员工的基本信息，另外一部分为员工的工作经历信息；
3. 员工的基本信息，包括以下几项，每一行展示两个表单项：
   - 第一行：用户名和姓名。两个表单项均为输入框，用户名的输入框提示信息'请输入员工用户名，2-20个字'；姓名输入框提示信息'请输入员工姓名，2-10个字'；
   - 第二行：性别和手机号。性别为下拉框，展示男、女，男提交的值为 1，女提交的值为 2；手机号为输入框；
   - 第三行：职位和薪资。职位为下拉框，展示班主任（提交值为 1）、讲师（提交值为 2）、学工主管（提交值为 3）、教研主管（提交值为 4）、咨询师（提交值为 5）；薪资为输入框，提示信息'请输入员工薪资'；
   - 第四行：所属部门和入职日期。所属部门为下拉框，先写死两个测试数据；入职日期为日期选择组件，可以选择日期，展示和提交的值格式都类似于 2024-05-09；
   - 第五行：头像。这一列有点特殊，为图片上传组件，上传完图片后，要展示出预览图；
4. 在两个部分之间，添加一个按钮，按钮名为'添加工作经历'；
5. 员工的工作经历信息，包括以下几项，在一行中要展示这三个表单项：时间（包括开始时间和结束时间，是一个日期范围组件）、公司（输入框，提示信息'请输入公司名称'）、职位（输入框，提示信息'请输入职位'）。时间、公司、职位这三个表单项要在一行中显示；
6. 在表单的下方，有两个按钮，一个是保存，一个是取消；
7. 先不考虑表单校验；
8. 上述表单，最后对应的数据模型为：

```json
{
    "image": "https://web-framework.oss-cn-hangzhou.aliyuncs.com/2022-09-03-07-37-38222.jpg",
    "username": "linpingzhi",
    "name": "林平之",
    "gender": 1,
    "job": 1,
    "entryDate": "2022-09-18",
    "deptId": 1,
    "phone": "18809091234",
    "salary": 8000,
    "exprList": [
        {
            "company": "百度科技股份有限公司",
            "job": "java开发",
            "begin": "2012-07-01",
            "end": "2019-03-03"
        },
        {
            "company": "阿里巴巴科技股份有限公司",
            "job": "架构师",
            "begin": "2019-03-15",
            "end": "2023-03-01"
        }
    ]
}
```

⚠️ 问题：课件该 Prompt 讲稿中"手机号"表单项的提示信息写成了"请输入员工姓名"（应为手机号相关提示），且需求条目出现两个"5."（工作经历信息与表单按钮条）、"在表单的方"缺"下"字。
修正建议：手机号提示信息应改为"请输入员工手机号"之类；需求条目编号应连续重排；"在表单的方"应为"在表单的下方"。

**员工管理——修改员工**

两步操作：

1. 点击"编辑"按钮，执行**根据 ID 查询员工信息，页面回显**（查询回显步骤：为"编辑"按钮绑定事件；发送异步请求，根据 ID 查询员工详细信息，页面回显）；
2. 点击"保存"按钮，执行修改操作（保存数据步骤：点击保存按钮，执行修改数据操作）。

备注：**添加员工与修改员工使用的是同一个表单**，需要根据 id 判断到底执行新增还是修改。

**员工管理——删除员工**

在删除员工信息时，有两个操作入口：

- 点击每条记录之后的"删除"按钮，删除当前这条记录（删除单个：为"删除"按钮绑定事件，触发事件调用函数；发送异步请求到服务端，根据 id 删除员工信息）；
- 选择前面的复选框，选中要删除的员工，点击"批量删除"之后，会批量删除员工信息（批量删除：为表格的复选框绑定事件，点击复选框之后，获取到目前选中的条件的 id，多个 id 可以封装到数组中；为"批量删除"按钮绑定事件，发送异步请求到服务端，根据 id 批量删除员工信息）。

**登录与退出——登录**

步骤：

- 为"登录"按钮绑定事件，点击登录按钮发送异步请求到服务端，执行登录操作；
- 为"取消"按钮绑定事件，点击取消按钮，清空登录表单数据。

问题：目前执行登录操作，登录成功之后，并没有将令牌信息起来，在后续的每次操作中，也就拿不到登录时的令牌信息了。

方案：需要在登录成功后，将令牌等信息**存储**起来。在后续的请求中，再将令牌取出来，携带到服务端。

⚠️ 问题：课件此处文字"并没有将令牌信息起来"缺字，语义不完整。
修正建议：应为"并没有将令牌信息**存储**起来"。

**localStorage**（存储令牌的载体）：

- localStorage 是浏览器提供的本地存储机制（5MB）；
- 存储形式为 key-value 形式，键和值都是字符串类型；
- API 方法：
  - `localStorage.setItem(key, value)`；
  - `localStorage.getItem(key)`；
  - `localStorage.removeItem(key)`；
  - `localStorage.clear()`。

**携带令牌访问服务端（axios 请求拦截器）**：在后续的每一次 Ajax 请求中都获取 localStorage 中的令牌，在请求头中将令牌携带到服务端——如果每个请求单独写（部门管理-查询/新增/修改/删除、员工管理-查询……每个 axios 都写一遍）非常**繁琐**，因此使用 **axios 请求 request 拦截器**统一处理：

```javascript
//axios的请求 request 拦截器, 在请求头中添加token
request.interceptors.request.use(
    (config) => { //成功回调
        //在请求头中添加token
        const data = JSON.parse(localStorage.getItem('loginUser'))
        if (data && data.token) {
            config.headers.token = data.token
        }
        return config
    },
    (error) => { //失败回调
        return Promise.reject(error)
    }
)
```

**登录与退出——功能完善（401 处理）**

问题：目前，即使用户未登录的情况下访问服务器，服务器会响应 401 状态码，但是前端并不会跳转到登录页面。

方案：在 **axios 响应 response 拦截器**中统一处理：

```javascript
//axios的响应 response 拦截器
request.interceptors.response.use(
    (response) => { //成功回调
        return response.data
    },
    (error) => { //失败回调
        if(error.response.status == 401){ //跳转登录页面
            ElMessage.error('登录失效, 请重新登录')
            router.push('/login')
        }else {
            ElMessage.error('接口访问异常')
        }
        return Promise.reject(error)
    }
)
```

**登录与退出——退出**

退出功能包含两件事：

- 展示当前登录用户；
- 退出登录。

**打包部署——打包**

前端开发、后端开发依据接口文档并行（阅读-开发），前端完成开发后进行**打包**：运行 **build** 命令，生成 **dist** 目录产物。

**打包部署——部署（Nginx）**

介绍：**Nginx 是一款轻量级的 Web 服务器/反向代理服务器**及电子邮件（IMAP/POP3）代理服务器。其特点是占有内存少，并发能力强，在各大型互联网公司都有非常广泛的使用。官网：https://nginx.org/。

部署：

- 部署：将打包好的 **dist 目录下的文件**，复制到 nginx 安装目录的 **html 目录**下；
- 启动：双击 **nginx.exe** 文件即可，Nginx 服务器默认占用 **80 端口号**；
- 访问：http://localhost:80。

注意：Nginx 默认占用 80 端口号，如果 80 端口号被占用，可以在 **nginx.conf** 中修改端口号（也可用命令 `netstat -ano | findStr 80` 查看端口占用情况）。

⚠️ 问题：课件中该排查命令写为 `netstat –ano | findStr  80`，其中 `–` 是全角破折号——照抄到命令行执行会失败。
修正建议：应使用半角连字符：`netstat -ano | findStr 80`。

**前端项目的打包部署小结**：

- 打包：运行 build → dist；
- 部署：将 dist 目录下的打包好的文件 → nginx/html 目录中；
- nginx 命令：
  - 启动：`nginx.exe`；
  - 重载：`nginx.exe -s reload`；
  - 停止：`nginx.exe -s stop`。

**班级管理与学员管理（自己实现）**

课件要求：参照部门管理/员工管理的实现思路，**自己动手完成班级管理与学员管理**两个模块的前端功能。

本节收束：前端实战串起了整个前端知识链——前后端分离模式（接口文档 + 并行开发）、Vue Router 嵌套路由实现整体布局与动态菜单、Element Plus 组件（Container/Button/Table/Dialog/Form/ElMessageBox）搭建页面、axios 的 request/response 拦截器统一处理令牌携带与 401 跳转、localStorage 保存登录信息，最后 build + Nginx 完成打包部署——前端项目从开发到上线的完整闭环至此形成。

### 第十八章：项目部署——Linux

**本章在课程中的位置**

Web 开发蓝图中的"Web 项目部署"环节（Linux、Docker），本章学习 **Linux** 部分：服务器操作系统的使用、常用命令、软件安装与项目部署。服务器上通常需要搭建**软件环境（mysql、redis、MQ 等）**并完成项目部署。

**Linux 概述——Linux 是什么**

- Linux 是一套**免费使用和自由传播**的操作系统；
- 操作系统分类对比：
  - 桌面操作系统：Windows（用户数量最多）、Mac OS（操作体验好，办公人士首选）、Linux（用户数量少）；
  - 移动设备操作系统：Android（基于 Linux、开源，主要用于智能手机、平板、智能电视）、IOS（苹果公司开发、不开源，用于苹果公司的产品）、HarmonyOS（华为公司开发、开源，目前用于华为公司的产品）；
  - 服务器操作系统：Unix（安全、稳定、付费）、**Linux（安全、稳定、免费、占有率高）**、Windows Server（付费、占有率低）。

**Linux 系统版本——内核版与发行版**

Linux 系统分为**内核版**和**发行版**：

- 内核版：由 Linux 核心团队开发、维护；免费、开源；负责**控制硬件**；
- 发行版：基于 Linux 内核版进行扩展；由各个 Linux 厂商开发、维护；有收费版本和免费版本。

常见发行版：

- **Ubuntu**：以桌面应用为主，免费；
- **RedHat**：面向企业用户，收费；
- **CentOS**：RedHat 的社区版，免费；
- **Fedora**：功能完备、快速更新，免费；
- **openSUSE**：对个人完全免费、图形界面华丽；
- **红旗 Linux**：北京中科红旗软件技术有限公司开发。

**Linux 系统安装**

安装方式：

- **物理机安装**：直接将操作系统安装到服务器硬件上；
- **虚拟机安装**：通过虚拟机软件安装。

**虚拟机（Virtual Machine）**指通过软件模拟的具有完整硬件系统功能、运行在完全隔离环境中的完整计算机系统。常见虚拟机软件：VMWare WorkStation、VirtualBox、VMLite WorkStation（通过虚拟机软件来模拟计算机硬件）。

安装流程要点：

1. 直接双击运行资料中的 VMWare 安装程序，根据提示完成安装即可；
2. 安装完毕之后，需要配置网络，才可以在 windows 系统上连接虚拟机上的 linux 系统；
3. 挂载镜像：解压 CentOS7 的镜像压缩包到磁盘目录，然后双击 .vmx 文件完成挂载，然后启动服务器（root/1234）；
4. 虚拟机网络编辑器 → NAT 模式 → 子网 IP 设置为 192.168.100.0；
5. 查看 IP 地址的命令：`ip addr`；
6. 如果没有 IP 地址：执行 start-ens33.sh 脚本，手动激活 ens33 网卡；
7. 启动/停止/重启 Linux 系统：图形化界面/命令（`init 0`：关闭，`init 6`：重启）。

**远程连接**

问题引入：公司在北京，服务器可能在上海/天津/香港/海外，该如何进行软件安装/项目部署？——使用**远程连接**工具。

常用的 **SSH（Secure Shell，安全外壳协议）**远程连接工具：Putty、SecureCRT、Xshell、FinalShell 等。

FinalShell 使用：直接双击运行 FinalShell 的安装程序完成安装即可，然后新建连接输入服务器信息连接到 Linux。

**Linux 目录介绍**

Linux 系统中的目录特点：

- `/` 是所有目录的**顶点**；
- 目录结构像一颗**倒挂的树**。

Linux 目录结构说明：

- **bin**：存放二进制可执行文件；
- **boot**：存放系统引导时使用的各种文件；
- **dev**：存放设备文件；
- **etc**：存放系统配置文件；
- **home**：存放系统用户的文件；
- **lib**：存放程序运行所需的共享库和内核模块；
- **opt**：额外安装的可选应用程序包所放置的位置；
- **root**：超级用户目录；
- **sbin**：存放二进制可执行文件，只有 root 用户才能访问；
- **tmp**：存放临时文件；
- **usr**：存放系统应用程序；
- **var**：存放运行时需要改变数据的文件，例如日志文件。

问题：Linux 系统中的路径 `/itheima` 与 `itheima` 有区别吗？——**有**：`/itheima` 是**绝对路径**，指根目录 `/` 下的 itheima 目录；`itheima` 是**相对路径**，指当前目录下的 itheima 目录。

**Linux 常用命令——命令格式与使用技巧**

Linux 命令格式：`command [-options] [parameter]`

- command：命令名；
- [-options]：选项，可用来对命令进行控制，也可以省略（可选）；
- [parameter]：参数，可以是零个、一个或多个（可选）。

使用技巧：

- Tab 键自动补全；
- 连续两次 Tab 键，给出操作提示；
- 使用上下箭头快速调出曾经使用过的命令；
- 使用 clear 命令或 Ctrl+l 快捷键实现清屏。

**目录操作命令**

**ls**：

- 作用：显示指定目录下的内容；
- 语法：`ls [-al] [dir]`；
- 选项：
  - `-a`：显示所有文件及目录（. 开头的隐藏文件也会列出）；
  - `-l`：除文件名称外，同时将文件类型（d 表示目录，- 表示文件）、权限、拥有者、文件大小等信息详细列出；
- 提示：由于我们使用 ls 命令时经常需要加入 -l 选项，所以 Linux 为 `ls -l` 命令提供了一种简写方式，即 **ll**。

**cd**：

- 作用：用于切换当前工作目录，即进入指定目录；
- 语法：`cd [dirName]`；
- 说明：
  - `.` 表示目前所在的目录；
  - `..` 表示目前目录位置的上级目录；
  - `~` 表示用户的 home 目录；
- 举例：
  - `cd ..` → 切换到当前目录的上级目录；
  - `cd ~` → 切换到用户的 home 目录；
  - `cd /usr/local` → 切换到 /usr/local 目录；
  - `cd -` → 切换到上一次所在目录。

**mkdir**：

- 作用：创建目录；
- 语法：`mkdir [-p] dirName`；
- 说明：`-p`：确保目录名称存在，不存在的就创建一个。通过此选项，可以实现多层目录同时创建；
- 举例：
  - `mkdir itcast` → 在当前目录下，建立一个名为 itcast 的子目录；
  - `mkdir -p itcast/test` → 在 itcast 目录中创建 test 子目录，若 itcast 目录不存在，则建立一个。

**rm**：

- 作用：删除文件或者目录；
- 语法：`rm [-rf] name`；
- 说明：
  - `-r`：将目录及目录中所有文件（目录）逐一删除，即递归删除；
  - `-f`：无需确认，直接删除；
- 举例：
  - `rm -r itcast/` → 删除名为 itcast 的目录和目录中所有文件，删除前需确认；
  - `rm -rf itcast/` → 无需确认，直接删除名为 itcast 的目录和目录中所有文件；
  - `rm -f hello.txt` → 无需确认，直接删除 hello.txt 文件。

小结：查看目录命令？——`ls [-al]`；切换目录命令？——`cd`；创建目录命令？——`mkdir [-p]`；删除目录命令？——`rm [-rf]`。

⚠️ 注意：`rm -rf` 是危险操作（无需确认直接递归删除），使用时必须反复核对路径。

**文件操作命令（查看内容）**

**cat**：

- 作用：用于显示文件的所有内容；
- 语法：`cat [-n] fileName`；
- 说明：`-n`：由 1 开始对所有输出的行数编号；
- 举例：`cat /etc/profile` → 查看 /etc 目录下的 profile 文件内容。

**more**：

- 作用：以分页的形式显示文件内容；
- 语法：`more fileName`；
- 操作说明：
  - 回车键 → 向下滚动一行；
  - 空格键 → 向下滚动一屏；
  - b → 返回上一屏；
  - q 或 Ctrl+C → 退出 more；
- 举例：`more /etc/profile` → 以分页方式显示 /etc 目录下的 profile 文件内容。

**head**：

- 作用：查看文件开头的内容；
- 语法：`head [-n] fileName`；
- 说明：`-n`：输出文件开头的 n 行内容；
- 举例：
  - `head 1.log` → 默认显示 1.log 文件开头的 10 行内容；
  - `head -20 1.log` → 显示 1.log 文件开头的 20 行内容。

**tail**：

- 作用：查看文件末尾的内容；
- 语法：`tail [-nf] fileName`；
- 说明：
  - `-n`：输出文件末尾的 n 行内容；
  - `-f`：动态读取文件末尾内容并显示，通常用于日志文件的内容输出；
- 举例：
  - `tail 1.log` → 默认显示 1.log 文件末尾 10 行的内容；
  - `tail -20 1.log` → 显示 1.log 文件末尾 20 行的内容；
  - `tail -f 1.log` → 动态读取 1.log 文件末尾内容并显示（实时刷新）。

小结：cat、more、head、tail 都可以查看文件的内容，之间有什么区别？——cat：查看文件内容，一次性查看所有内容，适用于查看**小文件**；more：**分页**查看文件内容，适用于查看大文件；head：查看文件**开头**部分的内容；tail：查看文件**结尾**部分的内容。

**拷贝移动命令**

**cp**：

- 作用：用于复制文件或目录；
- 语法：`cp [-r] source dest`；
- 选项：`-r`：如果复制的是目录需要使用此选项，此时将复制该目录下所有的子目录和文件；
- 举例：
  - `cp hello.txt itcast/` → 将 hello.txt 复制到 itcast 目录中；
  - `cp hello.txt ./hi.txt` → 将 hello.txt 复制到当前目录，并改名为 hi.txt；
  - `cp -r itcast/ ./itheima/` → 将 itcast 目录和目录下所有文件复制到 itheima 目录下；
  - `cp -r itcast/* ./itheima/` → 将 itcast 目录下所有文件复制到 itheima 目录下。

**mv**：

- 作用：为文件或目录**重命名**、或将文件或目录**移动到其它位置**（第二个参数是已存在的目录执行移动）；
- 语法：`mv source dest`；
- 举例：
  - `mv hello.txt hi.txt` → 将 hello.txt 改名为 hi.txt；
  - `mv hi.txt itheima/` → 将文件 hi.txt 移动到 itheima 目录中；
  - `mv hi.txt itheima/hello.txt` → 将 hi.txt 移动到 itheima 目录中，并改名为 hello.txt；
  - `mv itcast/ itheima/` → 如果 itheima 目录**不存在**，将 itcast 目录改名为 itheima；
  - `mv itcast/ itheima/` → 如果 itheima 目录**存在**，将 itcast 目录移动到 itheima 目录中。

小结：拷贝与移动的命令是什么？——**cp、mv**；mv 命令什么时候执行移动，什么时候执行重命名？——`mv source dest`：如果第二个参数 dest 是已存在的目录，就执行移动；否则就是重命名。

**打包压缩命令——tar**

- 作用：对文件进行打包、解包、压缩、解压；
- 语法：`tar [-zcxvf] fileName [files]`；
- 说明：
  - 包文件后缀为 `.tar` 表示只是完成了打包，并没有压缩；
  - 包文件后缀为 `.tar.gz` 表示打包的同时还进行了压缩；
- 选项：
  - `-z`：z 代表的是 gzip，通过 gzip 命令处理文件，gzip 可以对文件压缩或者解压；
  - `-c`：c 代表的是 create，即创建新的包文件；
  - `-x`：x 代表的是 extract，实现从包文件中还原文件；
  - `-v`：v 代表的是 verbose，显示命令的执行过程；
  - `-f`：f 代表的是 file，用于指定包文件的名称。

打包：

- `tar -cvf hello.tar hello` → 将当前目录下所有文件打包，打包后的文件名为 hello.tar；
- `tar -zcvf hello.tar.gz hello` → 将当前目录下所有文件打包并压缩，打包后的文件名为 hello.tar.gz。

解包：

- `tar -xvf hello.tar` → 将 hello.tar 文件进行解包，并将解包后的文件放在当前目录；
- `tar -zxvf hello.tar.gz` → 将 hello.tar.gz 文件进行解压，并将解压后的文件放在当前目录；
- `tar -zxvf hello.tar.gz -C /usr/local` → 将 hello.tar.gz 文件进行解压，解压到指定的 /usr/local 目录中。

小结：

- 如何将 itheima 目录下的所有内容，打成一个 tar.gz 的压缩包？——`tar -zcvf itheima.tar.gz itheima`；
- 如果将 tomcat.tar.gz 压缩包中的内容解压出来？——`tar -zxvf tomcat.tar.gz`（解压到当前目录）或 `tar -zxvf tomcat.tar.gz -C /usr/local`（解压到指定目录）。

**文本编辑命令——vi/vim**

**vi**：

- 作用：vi 命令是 Linux 系统提供的一个文本编辑工具，可以对文件内容进行编辑，类似于 Windows 中的记事本；
- 语法：`vi fileName`；
- 说明：
  - vim 是从 vi 发展来的一个功能更加强大的文本编辑工具，在编辑文件时可以对文本内容进行着色（更常用）；
  - 要使用 vim 命令，需要我们自己完成安装。可以使用下面的命令来完成安装：`yum install vim`。

**vim**：作用：对文件内容进行编辑，vim 其实就是一个文本编辑器；语法：`vim fileName`。

**vi/vim 编辑器三种模式的切换**：

- 打开文件进入**命令模式**（vim filename）；
- 输入 **i、a、o** 进入**插入模式**（编辑文本）；
- 在插入模式按 **ESC** 回到命令模式；
- 在命令模式输入 **`:`** 进入**底行模式**；
- 在底行模式按 **ESC** 回到命令模式；
- 底行模式常用命令：
  - **`:wq`** → 保存并退出；
  - **`:q!`** → 退出（不保存）。

**查找命令**

**find**：

- 作用：在指定目录下查找文件；
- 语法：`find dirName -option fileName`；
- 举例：
  - `find . -name "*.log"` → 在当前目录及其子目录下查找 .log 结尾文件；
  - `find /itcast -name "*.log"` → 在 /itcast 目录及其子目录下查找 .log 结尾的文件。

⚠️ 问题：课件 find 命令示例中写为 `find . –name "*.log"`，其中 `–name` 的短横线是全角破折号（同页另一条示例 `find /itcast -name` 用的却是半角）；另外 `find /itcast -name "*. log"` 的引号内 `.` 与 `log` 之间多了一个空格（应为 `"*.log"`）——照抄执行无法正确匹配文件。
修正建议：应统一为半角：`find . -name "*.log"`、`find /itcast -name "*.log"`。

**grep**：

- 作用：从指定文件中查找指定的文本内容；
- 语法：`grep [-inAB] word fileName`；
- 选项：
  - `-i`：检索的关键字忽略（ignore）大小写；
  - `-n`：显示关键字所在的这一行的行号；
  - `-A`：输出关键字所在行及之后（After）的几行记录（如：-A5 表示输出关键字所在行之后的 5 行记录）；
  - `-B`：输出关键字所在行及之前（Before）的几行记录（如：-B5 表示输出关键字所在行之前的 5 行记录）；
- 举例：
  - `grep Hello HelloWorld.java` → 查找 HelloWorld.java 文件中出现的 Hello 字符串的位置；
  - `grep hello *.java` → 查找当前目录中所有 .java 结尾的文件中包含 hello 字符串的位置。

小结：find 与 grep 都是查找命令，两者之间的区别是什么？——**find 命令是根据文件的属性（如：文件名）来查找文件的**；**grep 命令是根据指定的关键字，来查找文件内容的**。

**Linux 软件安装——安装方式介绍**

- **二进制发布包安装**：软件已经针对具体平台编译打包发布，只要解压，修改配置即可；
- **rpm 安装**：软件已经按照 redhat 的包管理规范进行打包，使用 rpm 命令进行安装，不能自行解决库依赖问题；
- **yum 安装**：一种在线软件安装方式，本质上还是 rpm 安装，自动下载安装包并安装，安装过程中自动解决库依赖问题；
- **源码编译安装**：软件以源码工程的形式发布，需要自己编译打包。

**安装 JDK**

1. 使用 FinalShell 自带的上传工具将 jdk 的二进制发布包上传到 Linux；
2. 解压安装包，命令为：

```
tar -zxvf jdk-17.0.10_linux-x64_bin.tar.gz -C /usr/local
```

3. 配置环境变量，使用 vim 命令修改 /etc/profile 文件，在文件末尾加入如下配置：

```
export JAVA_HOME=/usr/local/jdk-17.0.10
export PATH=$JAVA_HOME/bin:$PATH
```

4. 重新加载 profile 文件，使更改的配置立即生效，命令为：

```
source /etc/profile
```

5. 检查安装是否成功，命令为：

```
java -version
```

**安装 MySQL**

准备工作：卸载 Linux 系统中自带的 mysql/mariadb 安装包，否则 MySQL 将安装失败：

```
rpm -qa | grep mariadb
rpm -e --nodeps mariadb-libs-5.5.60-1.el7_5.x86_64
```

⚠️ 问题：课件中上述两条命令写为 `rpm –qa | grep mariadb` 与 `rpm –e –nodeps ...`，其中 `–qa`、`–e`、`–nodeps` 的短横线均为全角破折号——照抄执行会提示命令错误。
修正建议：应使用半角连字符：`rpm -qa | grep mariadb`、`rpm -e --nodeps mariadb-libs-5.5.60-1.el7_5.x86_64`。

后续步骤：

1. 下载并上传 mysql 安装包；
2. 解压安装包到当前目录，并将解压后的文件夹移动到 /usr/local 目录下，改名为 mysql：

```
tar -xvf mysql-8.0.30-linux-glibc2.12-x86_64.tar.xz
```

3. 配置环境变量（编辑 /etc/profile，追加内容）：

```
export MYSQL_HOME=/usr/local/mysql
export PATH=$MYSQL_HOME/bin:$PATH
```

4. 注册 MySQL 为系统服务：

```
cp /usr/local/mysql/support-files/mysql.server /etc/init.d/mysql
chkconfig --add mysql
```

**安装 MySQL——初始化与启动**

初始化数据库：

```
groupadd mysql
useradd -r -g mysql -s /bin/false mysql
mysqld --initialize --user=mysql --basedir=/usr/local/mysql --datadir=/usr/local/mysql/data
```

初始化完毕后，日志中会输出 mysql 的 root 用户的临时密码，记得复制记录下来。

启动服务登录 MySQL：

```
systemctl start mysql
mysql -uroot -pxxxxx
```

配置 MySQL 的 root 用户的密码，授权远程访问：

```sql
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '1234';
CREATE USER 'root'@'%' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';
FLUSH PRIVILEGES;
```

⚠️ 问题：课件中上述三条 SQL 语句结尾的引号写成了全角右单引号（`BY '1234’;`、`'root'@'%’;`）——照抄执行会产生 SQL 语法错误。
修正建议：SQL 语句中必须使用半角单引号：`BY '1234';`、`TO 'root'@'%';`。

**防火墙操作**

- 查看防火墙状态：`systemctl status firewalld`、`firewall-cmd --state`；
- 关闭防火墙：`systemctl stop firewalld`；
- 开启防火墙：`systemctl start firewalld`；
- 永久关闭防火墙：`systemctl disable firewalld`；
- 开放指定端口：`firewall-cmd --zone=public --add-port=8080/tcp --permanent`；
- 关闭指定端口：`firewall-cmd --zone=public --remove-port=8080/tcp --permanent`；
- 立即生效：`firewall-cmd --reload`；
- 查看开放的端口：`firewall-cmd --zone=public --list-ports`。

注意：

1. systemctl 是管理 Linux 中服务的命令，可以对服务进行启动、停止、重启、查看状态等操作；
2. firewall-cmd 是 Linux 中专门用于控制防火墙的命令；
3. 为了保证系统安全，**生产服务器的防火墙不建议关闭**。

**安装 Nginx（源码编译方式）**

1. 安装 nginx 运行时需要的依赖：

```
yum install -y pcre pcre-devel zlib zlib-devel openssl openssl-devel
```

2. 上传 nginx 的源码包；
3. 解压源码包到当前目录：`tar -zxvf nginx-1.20.2.tar.gz`；
4. 进入到解压目录（`cd nginx-1.20.2`）后，执行指令：

```
./configure --prefix=/usr/local/nginx
```

5. 执行编译 nginx 的指令：`make`；
6. 执行安装 nginx 的指令，安装到上述指定的 /usr/local/nginx 目录：`make install`；
7. 进入到 nginx 安装目录 /usr/local/nginx，启动 nginx 服务：`sbin/nginx`。

**项目部署——前端项目部署**

1. 将"资料/06.项目部署/前端/页面资源"文件夹下的打包好的静态资源，上传到 nginx 的 **html 目录**中；
2. 配置 nginx 的配置文件，在 **conf/nginx.conf** 中配置反向代理服务器及路径重写规则：

```
server {
    listen       80;
    server_name  localhost;
    client_max_body_size 10m;

    location / {
        root   html;
        index  index.html index.htm;
        try_files $uri $uri/ /index.html;
    }

    location ^~ /api/ {
        rewrite ^/api/(.*)$ /$1 break;
        proxy_pass http://localhost:8080;
    }
}
```

3. 在 nginx 的安装目录中，执行 sbin 目录下的 nginx 命令启动 nginx 服务：`sbin/nginx` 或 `sbin/nginx -s reload`。

小结：nginx 启动、停止、重新加载操作？——启动：`sbin/nginx`；停止：`sbin/nginx -s quit`；重新加载：`sbin/nginx -s reload`。

**项目部署——后端项目部署**

1. 执行 maven 的父工程中的 **package** 生命周期，对项目进行打包【打包之前，先连接上服务器数据库，先测试通过】；
2. 在 linux 服务器的 /usr/local 目录下，创建一个目录 tlias-app，将 jar 包上传到服务器的 **/usr/local/tlias-app** 目录中；
3. 然后在命令行执行命令，运行 jar 包：`java -jar xxxxxx.jar`。

上述执行运行 jar 包之后，会占用前台窗口，窗口关闭服务也就停了。可以使用 **nohup** 指令，后台运行服务，执行指令：

```
nohup java -jar xxxxxx.jar &> tlias.log &
```

查看进程：

```
ps -ef | grep xxxx
```

**Linux 中的特殊符号**：

- `|`：**管道符**。将前面命令的输出，作为后面命令的输入。如：`ps -ef | grep java`；
- `>` 与 `>>`：**重定向符号**。将前面的文本内容，输出到后面的文件中（`>`：覆盖重定向，`>>`：追加重定向）。如：`echo 'Hello Linux' > 1.log`。

小结：

- 如何让 linux 中的命令在后台运行，不占用前台窗口？——`nohup .... &>xxx.log &`；
- 查看系统进程的命令？杀死系统进程的命令？——`ps -ef`（`ps -ef | grep java` 检索 java 进程）、`kill -9 xxxx`。

本节收束：Linux 是服务器部署的基石——先理解目录结构（`/` 为顶点、绝对/相对路径）与命令格式，再掌握六类常用命令（目录操作 ls/cd/mkdir/rm、文件查看 cat/more/head/tail、拷贝移动 cp/mv、打包压缩 tar、文本编辑 vi/vim、查找 find/grep），随后用二进制/rpm/yum/源码编译等方式安装 JDK、MySQL、Nginx 三件套，最后完成前端（dist 静态资源 + nginx.conf 反向代理）与后端（jar 包 + nohup 后台运行）的项目部署。

### 第十九章：项目部署——Docker

**什么是 Docker**

核心结论：**Docker 就是一款快速构建、运行、管理应用的工具**。

**引入：Linux 中安装 MySQL 的痛点回顾**

回顾 Linux 中安装 MySQL 的完整过程（终端操作回放）：

```
[root@heima ~]# # 查看已安装的MySQL
[root@heima ~]# rpm -qa | grep mysql
[root@heima ~]# rpm -qa | grep mariadb
mariadb-libs-5.5.68-1.el7.x86_64
[root@heima ~]# # 卸载MySQL
[root@heima ~]# rpm -e --nodeps mariadb-libs-5.5.60-1.el7_5.x86_64
[root@heima ~]# # 上传MySQL的安装包
[root@heima ~]# # 解压缩
[root@heima ~]# tar -xvf mysql-8.0.30-linux-glibc2.12-x86_64.tar.xz
[root@heima ~]# # 移动&重命名
[root@heima ~]# mv mysql-8.0.30-linux-glibc2.12-x86_64 /usr/local/mysql
[root@heima ~]# # 切换目录
[root@heima ~]# cd /usr/local/mysql
[root@heima mysql]# # 配置环境变量
[root@heima mysql]# vim /etc/profile
[root@heima mysql]# # 刷新环境变量，立即生效
[root@heima mysql]# source /etc/profile
[root@heima mysql]# # 注册MySQL为系统服务
[root@heima mysql]# cp /usr/local/mysql/support-files/mysql.server /etc/init.d/mysql
[root@heima mysql]# chkconfig --add mysql
[root@heima mysql]# # 创建一个用户组, 组名就叫mysql
[root@heima mysql]# groupadd mysql
[root@heima mysql]# # 创建一个系统用户 mysql, 并归属于用户组 mysql
[root@heima mysql]# useradd -r -g mysql -s /bin/false mysql
[root@heima mysql]# # 初始化mysql
[root@heima mysql]# mysqld --initialize --user=mysql --basedir=/usr/local/mysql --datadir=/usr/local/mysql/data
[root@heima mysql]# # 启动MySQL服务
[root@heima mysql]# systemctl start mysql
[root@heima mysql]# # 通过初始化时的临时密码，登录MySQL
[root@heima mysql]# mysql -uroot -pxxxxx
[root@heima mysql]# # 修改root用户的密码
[root@heima mysql]# ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '1234';
[root@heima mysql]# # 后续省略
```

三大痛点：**命令太太太多，记不住**；**步骤太太太多，易出错**；**安装包哪里下载，找不到**。

⚠️ 问题：课件终端回放中，`rpm -qa | grep mariadb` 查询输出的安装包为 `mariadb-libs-5.5.68-1.el7.x86_64`，但下一行卸载命令写的是 `rpm -e --nodeps mariadb-libs-5.5.60-1.el7_5.x86_64`——卸载的包名版本（5.5.60-1.el7_5）与查询结果（5.5.68-1.el7）不一致，照抄执行会提示"未安装软件包"。
修正建议：卸载时应复制查询结果中的真实包名：`rpm -e --nodeps mariadb-libs-5.5.68-1.el7.x86_64`。

**如何解决？——一条命令安装 MySQL**

```
[root@heima ~]#
docker run -d --name mysql -p 3307:3306 -e MYSQL_ROOT_PASSWORD=123 mysql:8
|
Unable to find image 'mysql:latest' locally
latest: Pulling from library/mysql
72a69066d2fe: Pull complete
93619dbc5b36: Pull complete
99da31dd6142: Pull complete
626033c43d70: Pull complete
Status: Downloaded newer image for mysql:latest
a6cec8ff4765ca0876d0453f3ccab205fca29b5dce74f8cfbad8d76571bf79be
[root@heima ~]#
```

⚠️ 问题：课件此处演示命令指定了 `mysql:8`，但下方执行输出显示 `Unable to find image 'mysql:latest' locally`、`Status: Downloaded newer image for mysql:latest`——命令与实际输出（mysql:latest）前后不一致。
修正建议：使用 `mysql:8` 时输出应显示 mysql:8 的镜像信息；演示输出应与命令保持一致。

**Docker 快速入门——正式安装 MySQL**

先停掉虚拟机中的 MySQL，确保你的虚拟机已经安装 Docker，且网络开通的情况下，执行下面命令即可安装 MySQL：

```
docker run -d \
--name mysql \
-p 3307:3306 \
-e TZ=Asia/Shanghai \
-e MYSQL_ROOT_PASSWORD=123 \
mysql:8
```

**镜像和容器**

核心概念：

- 当我们利用 Docker 安装应用时，Docker 会自动搜索并下载**应用镜像（image）**。镜像不仅包含应用本身，还包含应用运行所需要的**环境、配置、系统函数库**。Docker 会在运行镜像时创建一个**隔离环境，称为容器（container）**；
- **镜像仓库**：存储和管理镜像的平台，Docker 官方维护了一个公共仓库：**Docker Hub**。

结构理解：Client 执行 `docker run` → Docker Server 中的 docker daemon 守护进程从镜像仓库拉取 images → 运行生成 Container。

小结：

- 什么是镜像？——将应用所需的运行环境、配置文件、系统函数库等与应用一起打包得到的就是镜像；
- 什么是容器？——为每个镜像的应用进程创建的隔离运行环境就是容器；
- 什么是镜像仓库？——存储和管理镜像的平台就是镜像仓库；DockerHub 是目前最大的镜像仓库，其中包含各种常见的应用镜像。

**docker run 命令解读**

以 `docker run -d \ --name mysql \ -p 3307:3306 \ -e TZ=Asia/Shanghai \ -e MYSQL_ROOT_PASSWORD=123 \ mysql:8` 为例：

- `docker run`：创建并运行一个容器，`-d` 是让容器在**后台运行**；
- `--name mysql`：给容器起个名字，必须唯一；
- `-p 3307:3306`：设置**端口映射**（宿主机端口 3307 映射到容器内端口 3306）；
- `-e KEY=VALUE`：是设置**环境变量**；
- `mysql:8`：指定运行的镜像的名字、版本。

端口映射理解：MySQL 容器内部监听 3306 端口，通过 `-p 3307:3306` 映射后，外部通过 `jdbc:mysql://192.168.100.128:3307` 访问宿主机 3307 端口即可连接到容器中的 MySQL。

**镜像命名规范**

镜像名称一般分两部分组成：**[repository]:[tag]**。

- repository 就是镜像名（如 mysql）；
- tag 是镜像的版本（如 8）。

注意：在没有指定 tag 时，默认是 **latest**，代表最新版本的镜像。

小结：

- docker run 命令中的常见参数：`-d`（让容器后台运行）、`--name`（给容器命名，唯一）、`-e`（环境变量）、`-p`（宿主机端口映射到容器内端口）；
- 镜像名称结构：Repository:TAG（镜像名 + 版本号）。

**Docker 核心——常见命令**

Docker 最常见的命令就是操作镜像、容器的命令，详见官方文档：https://docs.docker.com/ 。

命令图谱（按对象分类）：

- 镜像操作：
  - `docker build`：构建镜像；
  - `docker pull`：从镜像仓库拉取镜像到本地；
  - `docker push`：推送本地镜像到镜像仓库；
  - `docker images`：查看本地镜像列表；
  - `docker rmi`：删除镜像；
  - `docker save`：保存镜像为文件；
  - `docker load`：加载镜像文件；
- 容器操作：
  - `docker run`：创建并运行容器；
  - `docker stop`：停止容器；
  - `docker start`：启动（已停止的）容器；
  - `docker ps`：查看容器；
  - `docker rm`：删除容器；
  - `docker logs`：查看容器日志；
  - `docker exec`：进入容器执行命令。

**常见命令演练需求**：

1. 查看 DockerHub，搜索 Nginx 镜像，查看镜像的名称；
2. 拉取 Nginx 镜像（比较耗时）；
3. 查看本地镜像列表；
4. 创建并运行 Nginx 容器；
5. 查看容器；
6. 停止容器；
7. 再次启动容器；
8. 进入 Nginx 容器；
9. 删除容器。

**数据卷——介绍**

**数据卷（volume）是一个虚拟目录，是容器内目录与宿主机目录之间映射的桥梁**。

问题场景（利用 Nginx 容器部署静态资源）：

- 需求：创建 Nginx 容器，修改 nginx 容器内的 html 目录下的 index.html 文件，查看变化；将静态资源部署到 nginx 的 html 目录；
- 难点：容器内没有 vim 等编辑工具，直接修改容器内文件很麻烦——因此需要把容器内目录（如 /usr/share/nginx/html、/etc/nginx/conf）映射到宿主机文件系统的数据卷，通过操作宿主机上的目录（数据卷实际存储在宿主机的 /var/lib/docker/volumes/xxx/_data）来间接操作容器内文件。

**数据卷——操作命令**

| 命令 | 说明 |
| --- | --- |
| docker volume create | 创建数据卷 |
| docker volume ls | 查看所有数据卷 |
| docker volume rm | 删除指定数据卷 |
| docker volume inspect | 查看某个数据卷的详情 |
| docker volume prune | 清除所有未使用的数据卷 |

注意：在执行 docker run 命令时，使用 **`-v 数据卷:容器内目录`** 形式可以完成数据卷挂载（**数据卷不存在，会自动创建**）。

小结：

- 什么是数据卷？——数据卷是一个虚拟目录，它将宿主机目录映射到容器内目录，方便我们操作容器内文件，或者方便迁移容器产生的数据；
- 如何挂载数据卷？——在创建容器时，利用 `-v 数据卷名:容器内目录` 完成挂载；容器创建时，如果发现挂载的数据卷不存在时，会自动创建；
- 数据卷的常见命令有哪些？——`docker volume ls`（查看数据卷）、`docker volume rm`（删除数据卷）、`docker volume inspect`（查看数据卷详情）、`docker volume prune`（删除未使用的数据卷）。

**本地目录挂载**

命令格式：

```
docker run -d --name 容器名 -p 宿主机端口:容器端口 -v 宿主机目录或文件:容器内目录或文件 镜像名
```

注意：**本地目录必须以 / 或 ./ 开头**，如果直接以名称开头，会被识别为**数据卷**而非本地目录：

- `-v mysql:/var/lib/mysql` 会被识别为一个数据卷，数据卷叫 mysql；
- `-v ./mysql:/var/lib/mysql` 会被识别为当前目录下的 mysql 目录。

**数据卷挂载 vs 本地目录挂载**：

- 数据卷挂载：`-v 数据卷:容器内目录或文件`；数据卷名字不能以 / 或 ./ 开头（如 html、conf）；宿主机目录固定为 /var/lib/docker/volumes/xxx/_data；
- 本地目录挂载：`-v 宿主机目录或文件:容器内目录或文件`；宿主机目录或文件必须以 / 或 ./ 开头（如 /root/mysql/data）；宿主机目录任意指定。

**需求演练——创建 MySQL 容器并实现本地目录挂载**：

创建 MySQL 容器，并基于本地目录挂载实现 MySQL 容器数据目录、配置文件、初始化脚本的目录挂载（官方文档）：

- 挂载 /root/mysql/data 到容器内的 /var/lib/mysql 目录；
- 挂载 /root/mysql/init 到容器内的 /docker-entrypoint-initdb.d 目录（资料中的 sql 脚本）；
- 挂载 /root/mysql/conf 到容器内的 /etc/mysql/conf.d 目录。

**自定义镜像**

概念：**镜像就是包含了应用程序、程序运行的系统函数库、运行配置等文件的文件包。构建镜像的过程其实就是把上述文件打包的过程**。

部署一个 Java 应用的步骤（传统方式）：

1. 准备一个 Linux 服务器；
2. 安装 JDK 并配置环境变量；
3. 拷贝 Jar 包；
4. 运行 Jar 包。

构建一个 Java 镜像的步骤：

1. 准备一个 Linux 运行环境（BaseImage，如 CentOS 7，含 /etc、/lib、/proc、/bin 等）；
2. 安装 JDK 并配置环境变量；
3. 拷贝 Jar 包；
4. 编写运行脚本，运行 Jar 包（如 `java -jar xx.jar`）。

**镜像结构**：

- **入口（Entrypoint）**：镜像运行入口，一般是程序启动的脚本和参数；
- **层（Layer）**：添加安装包、依赖、配置等，每次操作都形成新的一层；
- **基础镜像（BaseImage）**：应用依赖的系统函数库、环境、配置、文件等。

**Dockerfile**

Dockerfile 就是一个**文本文件**，其中包含一个个的**指令（Instruction）**，用指令来说明要执行什么操作来构建镜像。将来 Docker 可以根据 Dockerfile 帮我们构建镜像。

常见指令如下：

| 指令 | 说明 | 示例 |
| --- | --- | --- |
| FROM | 指定基础镜像 | FROM centos:7 |
| ENV | 设置环境变量，可在后面指令使用 | ENV key=value |
| COPY | 拷贝本地文件到镜像的指定目录 | COPY ./jdk17.tar.gz /tmp |
| RUN | 执行Linux的shell命令，一般是安装过程的命令 | RUN tar -zxvf /tmp/jdk17.tar.gz |
| EXPOSE | 指定容器运行时监听的端口，是给镜像使用者看的 | EXPOSE 8080 |
| ENTRYPOINT | 镜像中应用的启动命令，容器运行时调用 | ENTRYPOINT java -jar xx.jar |

我们可以基于 CentOS7 基础镜像，利用 Dockerfile 描述镜像结构（完整示例）：

```dockerfile
# 使用 CentOS 7 作为基础镜像
FROM centos:7
# 添加 JDK 到镜像中
COPY jdk17.tar.gz /usr/local/
RUN tar -xzf /usr/local/jdk17.tar.gz -C /usr/local/ &&  rm /usr/local/jdk17.tar.gz
# 设置环境变量
ENV JAVA_HOME=/usr/local/jdk-17.0.10
ENV PATH=$JAVA_HOME/bin:$PATH
# 创建应用目录
RUN mkdir -p /app
WORKDIR /app
# 复制应用 JAR 文件到容器
COPY app.jar app.jar
# 暴露端口
EXPOSE 8080
# 运行命令
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
```

编写好了 Dockerfile 之后，可以利用下面命令来构建镜像：

```
docker build -t myImage:1.0 .
```

- `-t`：是给镜像起名，格式依然是 repository:tag 的格式，不指定 tag 时，默认为 latest；
- `.`：是指定 Dockerfile 所在目录，如果就在当前目录，则指定为"."。

小结：

- 镜像的结构是怎样的？——镜像中包含了应用程序所需要的运行环境、函数库、配置、以及应用本身等各种文件，这些文件分层打包而成；
- Dockerfile 是做什么的？——Dockerfile 就是利用固定的指令来描述镜像的结构和构建过程，这样 Docker 才可以依次来构建镜像；
- 构建镜像的命令是什么？——`docker build -t 镜像名 Dockerfile目录`。

课件基于 AI 生成 Dockerfile 的 Prompt：

"你是一名 java 开发工程师，基于 Springboot 开发了一个 web 项目，并将其打成一个 jar 包，名字为 app.jar，现需要将其制作为一个 docker 镜像，请帮我编写一份 Dockerfile 文件：jar 包的名字叫 app.jar；基础镜像为 centos:7，里面没有 jdk 的环境；jdk 的安装包为 jdk17.tar.gz；请参照上述提供的信息，帮我编写一份 docker 文件"。

**网络**

默认情况下，所有容器都是以 **bridge 方式**连接到 Docker 的一个**虚拟网桥**上：宿主机上的 docker0 网桥地址为 172.17.0.1/16，各容器（mysql、java 应用等）通过 eth0 接口（宿主机侧对应 vethX/vethY/vethZ）接入，分别获得 172.17.0.2、172.17.0.3、172.17.0.4 等地址。

**加入自定义网络的容器才可以通过容器名互相访问**，Docker 的网络操作命令如下：

| 命令 | 说明 |
| --- | --- |
| docker network create | 创建一个网络 |
| docker network ls | 查看所有网络 |
| docker network rm | 删除指定网络 |
| docker network prune | 清除未使用的网络 |
| docker network connect | 使指定容器连接加入某网络 |
| docker network disconnect | 使指定容器连接离开某网络 |
| docker network inspect | 查看网络详细信息 |

**项目部署——服务端部署**

需求：将我们开发的 tlias-web-management 项目打包为镜像，并部署。

步骤：

1. 准备 MySQL 容器，并创建 tlias 数据库及表结构（已完成）；
2. 准备 java 应用（tlias 项目）镜像，部署 Docker 容器，运行测试：
   - 修改 tlias 项目的配置文件，修改数据库服务地址及 logback 日志文件存放地址，打 jar 包；
   - 编写 Dockerfile 文件；
   - 构建 Docker 镜像；
   - 部署 Docker 容器。

**项目部署——前端部署**

需求：创建一个新的 nginx 容器，将资料中提供的前端项目的静态资源部署到 nginx 中。

步骤：

1. 部署 nginx 容器（设置目录映射）：
   - `-v /root/tlias-nginx/html:/usr/share/nginx/html`；
   - `-v /root/tlias-nginx/conf/nginx.conf:/etc/nginx/nginx.conf`；
2. 将部署的前端资源文件及配置文件上传至服务器，执行命令创建 nginx 容器。

**手动部署的问题**：当系统涉及多个容器（mysql、nginx、tlias-server、redis、mq、order-server、admin-server……）时，一个个手动部署**繁琐**，且**不便于统一管理**。

**DockerCompose**

**Docker Compose 通过一个单独的 docker-compose.yml 模板文件（YAML 格式）来定义一组相关联的应用容器**，帮助我们实现多个相互关联的 Docker 容器的快速部署。

概念对应：一个 yml 文件描述一个**项目（Project）**，其中的每个应用容器是一个**服务（Service）**：

```yaml
services:
  containerA:
    image: A
    container_name: A
    ports:
      - "11:11"
  containerB:
    image: B
    container_name: B
    ports:
      - "22:22"
  containerC:
    image: C
    container_name: C
    ports:
      - "33:33"
```

**docker run 命令与 compose 写法对照**：

原 docker run 命令：

```
docker run -d \
--name nginx-tlias \
-v /usr/local/app/html:/usr/share/nginx/html \
-v /usr/local/app/conf/nginx.conf:/etc/nginx/nginx.conf \
--network itheima \
-p 80:80 \
nginx:1.20.2
```

对应的 docker-compose.yml：

```yaml
services:
  nginx-tlias:
    image: "nginx:1.20.2"
    container_name: nginx-tlias
    volumes:
      - "/usr/local/app/html:/usr/share/nginx/html"
      - "/usr/local/app/conf/nginx.conf:/etc/nginx/nginx.conf"
    networks:
      - itheima
    ports:
      - "80:80"

networks:
  itheima:
    name: itheima
```

课件基于 AI 做转换的 Prompt："将下面这条 Docker 创建容器的命令，帮我转换成 docker-compose.yml 文件的写法，并添加上注释。命令如下：docker run -d --name nginx-tlias -v /usr/local/app/html:/usr/share/nginx/html -v /usr/local/app/conf/nginx.conf:/etc/nginx/nginx.conf --network itheima -p 80:80 nginx:1.20.2"。

**基于 DockerCompose 快速部署 tlias 系统**

涉及到的服务：MySQL 数据库、服务端、前端 nginx。

步骤：

1. 准备资源（tlias.sql，服务端的 jdk17、jar 包、Dockerfile，前端项目打包文件、nginx.conf）；
2. 准备 docker-compose.yml 配置文件；
3. 基于 DockerCompose 快速构建项目。

**DockerCompose 命令**

Docker Compose 的命令格式：`docker compose [OPTIONS] [COMMAND]`

选项参数说明：

| 类型 | 参数或指令 | 说明 |
| --- | --- | --- |
| Options | -f | 指定compose文件的路径和名称 |
| Options | -p | 指定project名称 |
| Commands | up | 创建并启动所有service容器 |
| Commands | down | 停止并移除所有容器、网络 |
| Commands | ps | 列出所有启动的容器 |
| Commands | logs | 查看指定容器的日志 |
| Commands | stop | 停止容器 |
| Commands | start | 启动容器 |
| Commands | restart | 重启容器 |
| Commands | top | 查看运行的进程 |

本节收束：Docker 用"镜像 + 容器"把"装环境"变成"拉镜像、跑容器"——`docker run` 一条命令即可完成过去几十步的 MySQL 安装；数据卷/本地目录挂载（`-v`）解决容器内文件操作与数据持久化问题；Dockerfile（FROM/ENV/COPY/RUN/EXPOSE/ENTRYPOINT）把"部署 Java 应用的步骤"固化为镜像构建脚本；自定义网络解决容器间互访；Docker Compose 则用一份 docker-compose.yml 把"mysql + 服务端 + nginx"这类多容器系统一键编排部署。

### 第二十章：Web 开发完结

**Web 开发阶段全景回顾**

至此，Web 开发（AI）全部学习完成。整个阶段的知识全景如下：

- **Web 前端基础**：
  - HTML（页面结构）；
  - CSS（页面样式）；
  - JavaScript（页面行为）；
  - Vue3（前端框架基础）；
  - Ajax/Axios（异步请求交互）；
- **Web 后端基础**：
  - Maven（项目构建与依赖管理）；
  - Web 基础知识（HTTP、Tomcat、请求响应、分层解耦等）；
  - MySQL（关系型数据库）；
  - JDBC（Java 操作数据库的基础技术）；
  - Mybatis（持久层框架）；
- **Web 后端实战**：Tlias 案例（部门管理、员工管理、登录认证、AOP 操作日志等）；
- **Web 前端实战**：
  - Vue 工程化（create-vue、单文件组件、组合式 API）；
  - Element Plus（组件库）；
  - Tlias 案例（整体布局、部门管理、员工管理、登录退出、打包部署）；
- **Web 项目部署**：
  - Linux（操作系统、常用命令、软件安装、项目部署）；
  - Docker（镜像与容器、数据卷、自定义镜像、网络、Docker Compose）。

**学习路径主线梳理**

从"看的页面"到"上线的系统"，整个 Web 开发的学习主线为：

1. 会用 HTML/CSS/JavaScript/Vue3/Axios 写出前端页面并发出异步请求；
2. 会用 Maven 管理工程、用 MySQL 存储数据、用 JDBC/Mybatis 让 Java 操作数据库；
3. 用 SpringBoot + SpringMVC + Mybatis 三层架构完成后端接口开发（含事务、AOP、全局异常处理、拦截器与登录认证）；
4. 用 Vue 工程化 + Element Plus 完成前端工程开发，并与后端接口联调（前后端分离）；
5. 用 Linux + Docker（Docker Compose）把系统部署到服务器上线运行。

**完结**

课件以"Web 开发 - 完结 -"收束本阶段，并给出**后续学习路线**的指引——在掌握前端、后端、数据库与部署的完整闭环之后，可继续沿课程规划的方向深入学习。

本节收束：本阶段笔记（第一至二十章）完整覆盖了 Web 开发五大板块的全部课件内容——HTML/CSS/JavaScript/Vue3/Ajax、Maven/Web 基础/MySQL/JDBC/Mybatis、Tlias 后端实战、Vue 工程化/Element Plus/Tlias 前端实战、Linux/Docker 项目部署——达到"能独立完成一个前后端分离 Web 系统从开发到部署"的目标。

<!--CONTINUE-->

## 指令集模块

本模块汇总三个阶段的命令、接口、环境变量、启动方式与访问链接。正文各章均已随知识点讲解，此处按分类统一收集、便于速查；后续阶段的新增内容将合并到对应分类中，不重复堆叠。

**一、Java 编译、运行与版本检查**

- 编译：`javac 程序名.java`（例 `javac HelloWorld.java`）→ 把 `.java` 源代码翻译成 JVM 可执行的 `.class` 字节码文件（编译工具）；
- 运行：`java 程序名`（例 `java HelloWorld`）→ 启动 JVM 执行程序（执行工具）；
- 版本检查：`java -version`、`javac -version`（安装 JDK 后验证是否成功；重新配置环境变量后也用它检测）；
- 程序开发三步：编写（.java 源代码）→ 编译（javac）→ 运行（java）；
- 提醒：命令中的短横线必须是半角 `-`；课件中多处印成全角 `–`，不可照抄（`java –version` 会报"命令不存在"类错误）。

**二、DOS（命令行窗口）常用命令**

打开方式：Win + R → 输入 `cmd` → 回车。

| 命令 | 作用 |
| --- | --- |
| 盘符: | 切换盘符：`D:`、`E:` |
| dir | 查看当前路径下的文件信息 |
| cd | 进入单级目录 `cd itheima`；回退到上一级 `cd ..`；回退到盘符根目录 `cd /` |
| cls | 清屏 |
| tab | 自动补全指定字符开头的单词 |
| ↑ 键 / ↓ 键 | 查看历史命令 |
| exit | 退出 |

**三、环境变量**

- **Path**（Windows）：配置程序所在路径，使 javac、java 等命令能在任意目录直接使用；配置值示例 `E:\develop\Java\jdk21\bin`（按自己电脑的实际安装路径配置，不要照抄）；配置入口：此电脑 → 属性 → 高级系统设置 → 高级 → 环境变量；
- **JAVA_HOME**（Windows）：JDK 的安装目录——其他技术（如 Maven）通过它找到 JDK；
- **MAVEN_HOME**（Windows）：Maven 解压目录，并把其 bin 目录加入 Path；
- **Linux（/etc/profile 末尾追加，改完执行 `source /etc/profile` 立即生效）**：

```bash
export JAVA_HOME=/usr/local/jdk-17.0.10
export PATH=$JAVA_HOME/bin:$PATH
```

**四、IDEA 常用快捷键**

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
| Ctrl + / | 批量加入单行注释，再按一次取消 |
| Ctrl + Shift + / | 批量加入多行注释，再按一次取消 |
| Alt + 1 | 快速打开或隐藏工程面板 |
| F2 | 高亮错误或警告快速定位 |
| Ctrl + F12 | 显示当前文件的结构 |

**五、Java 常用 API 与接口**

- **Scanner**（键盘录入）：`Scanner sc = new Scanner(System.in);` → `sc.nextInt()`、`sc.nextDouble()`、`sc.next()`、`sc.nextLine()`；
- **Random**（随机数）：`Random r = new Random();` → `r.nextInt()`（int 范围内的随机数）、`r.nextInt(n)`（0 ~ n-1）；
- **String**（字符串）：`length()`、`charAt(int)`（⚠️ 课件误拼为 chatAt）、`equals(s)`、`equalsIgnoreCase(s)`、`substring(begin,end)`（包左不包右）、`substring(begin)`、`indexOf(s)`、`contains(s)`、`startsWith/endsWith`、`replace(a,b)`、`split(regex)`、`toCharArray()`、`trim()`、`toUpperCase()/toLowerCase()`、`valueOf(x)`；
- **StringBuilder**（可变字符串）：`new StringBuilder(s)`、`append(x)`、`reverse()`、`length()`、`toString()`（支持链式编程）；
- **包装类与类型转换**：`Integer.parseInt(str)`、`Double.parseDouble(str)`、`Integer.valueOf(x)`、`toBinaryString/toOctalString/toHexString`、自动装箱与拆箱；
- **ArrayList**（集合基础）：`new ArrayList<E>()`、`add(e)`、`add(index,e)`、`get(index)`、`set(index,e)`、`remove(index)`、`size()`；
- **集合体系（进阶）**：`Collection/List/Set/Map` 接口；`HashSet/TreeSet/LinkedHashSet`；`HashMap` 的 `put/get/remove/size/containsKey/keySet/values/entrySet`；迭代器 `iterator()/hasNext()/next()`；增强 for；`Collections.sort()`；
- **Stream 流**：获取流 `list.stream()`、`Arrays.stream(数组)`、`Stream.of(...)`；中间方法 `filter/map/limit/skip/distinct/sorted/Stream.concat`；终结方法 `forEach/count/collect`；收集 `collect(Collectors.toList()/toSet()/toMap(...))`；
- **日期时间（JDK8 时间 API）**：`LocalDate/LocalTime/LocalDateTime` 的 `now()`、`of(...)`、`plusXxx()/minusXxx()`、`getXxx()`、`format()`、`parse()`、`isBefore/isAfter`；格式化 `DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")`；
- **工具类**：`Objects.equals(a,b)`（防空指针）；`Arrays.stream/sort/toString` 等；
- **File 类**：`new File(路径)`、`createNewFile()`、`mkdir()/mkdirs()`、`exists()`、`isFile()/isDirectory()`、`length()`、`getName()/getAbsolutePath()`、`listFiles()`、`delete()`；
- **IO 流**：字节流 `FileInputStream/FileOutputStream`（`read()/write()`，-1 是结尾信号）；字符流 `FileReader/FileWriter`；缓冲流 `BufferedInputStream/BufferedOutputStream`、`BufferedReader.readLine()/BufferedWriter`；资源释放 `close()`（或用 try-with-resources 自动关）；`Properties` 读写配置文件（`setProperty/getProperty/load/store`）；
- **多线程**：`Thread`（`start()/run()/sleep(ms)`、`getName/setName`）、`Runnable`、`Callable + FutureTask`（`ft.get()` 取返回值）；线程池 `Executors.newFixedThreadPool(n)`，或手动 `new ThreadPoolExecutor(...)` 精确控制 7 个参数（拒绝策略默认 `ThreadPoolExecutor.AbortPolicy`）；
- **网络编程**：TCP——客户端 `new Socket(host, port)`、`getInputStream/getOutputStream`，服务端 `new ServerSocket(port)`、`accept()`；UDP——`DatagramSocket` 的 `send/receive` + `DatagramPacket` 打包数据；
- **反射与动态代理**：`Class.forName(全类名)`、`getConstructor()/getDeclaredConstructor().newInstance()`、`getDeclaredMethod/getDeclaredField`；`Proxy.newProxyInstance(类加载器, 接口数组, 处理器)` 生成代理对象；
- **单元测试（JUnit）**：`@Test`、`Assertions.assertEquals(期望值, 实际值)`；
- **JDBC**：`DriverManager.getConnection(url, user, pwd)`；URL 格式 `jdbc:mysql://主机:端口/数据库名`（例 `jdbc:mysql://localhost:3306/web01`）；`conn.prepareStatement(sql)` → `setXxx(占位符索引, 值)` → `executeUpdate()/executeQuery()` → `ResultSet` 的 `next()/getXxx()`；连接池 Druid：`DruidDataSourceFactory.createDataSource(Properties)`；
- **MyBatis**：注解 `@Mapper`、`@Select/@Insert/@Update/@Delete`、`@Param`、`#{}` 预编译占位符；日志配置 `mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl`；
- **Spring / SpringBoot 常用注解**：
  - 组件声明：`@Controller`、`@RestController`、`@Service`、`@Repository`、`@Component`（生效前提：被 `@ComponentScan` 扫描到，默认扫描启动类所在包及其子包）；
  - 依赖注入：`@Autowired`；
  - 启动类：`@SpringBootApplication`（由 @SpringBootConfiguration、@EnableAutoConfiguration、@ComponentScan 三部分组成）；
  - 请求与响应：`@RequestMapping/@GetMapping/@PostMapping/@PutMapping/@DeleteMapping`、`@RequestParam/@PathVariable/@RequestBody`、`@ResponseBody`、`@DateTimeFormat`；
  - 配置类与第三方整合：`@Configuration/@Bean/@Import`、`@ConfigurationProperties/@EnableConfigurationProperties`、`@ConditionalOnClass` 等条件注解、`@Value("${...}")`；
  - 事务与 AOP：`@Transactional`；`@Aspect/@Pointcut/@Around/@Before/@Order`；日志 `@Slf4j`（Lombok）；
  - 全局处理与过滤器：`@RestControllerAdvice/@ExceptionHandler`、`@WebFilter/@ServletComponentScan`、Lombok `@Data`；
  - 常用配置示例：`server.port=8081`、`spring.datasource.url/username/password/driver-class-name`、`mybatis.configuration.log-impl=...`（application.properties 或 application.yml 中配置）。

**六、Maven 命令与配置**

- 版本检查：`mvn -v`；
- 构建生命周期：`mvn clean`（清理）、`mvn compile`（编译）、`mvn package`（打包，生成 jar/war）、`mvn install`（安装到本地仓库）、`mvn deploy`（发布到私服）；
- 本地仓库配置（conf/settings.xml）：`<localRepository>D:\develop\apache-maven-3.9.4\mvn_repo</localRepository>`；
- 阿里云镜像（settings.xml 的 `<mirrors>` 中配置）：`http://maven.aliyun.com/nexus/content/groups/public/`（mirrorOf 为 central）；
- 中央仓库：`https://repo1.maven.org/maven2/`；依赖坐标可在 `https://mvnrepository.com/` 搜索；
- 私服（Nexus）上传：settings.xml 的 `<servers>` 配置用户名/密码（id 分别为 maven-releases、maven-snapshots）；pom.xml 中 `<distributionManagement>` 配置上传地址（`http://192.168.150.101:8081/repository/maven-releases/` 对应 RELEASE 版本、`.../maven-snapshots/` 对应 SNAPSHOT 版本）；依赖下载走仓库组 `http://192.168.150.101:8081/repository/maven-public/`；
- 聚合工程打包：在父工程执行 package 生命周期，可一次性构建所有模块。

**七、MySQL 命令与配置**

- 命令行连接：`mysql -u用户名 -p密码 [-h数据库服务器IP地址 -P端口号]`（企业开发一般使用图形化工具，如 DataGrip）；
- Windows 下载：`https://dev.mysql.com/downloads/mysql/`；
- Linux 安装/初始化：`rpm -qa | grep mariadb`（查自带 mariadb）、`rpm -e --nodeps mariadb-libs-版本号`（卸载，版本号以实际查询结果为准）、`groupadd mysql`、`useradd -r -g mysql -s /bin/false mysql`、`mysqld --initialize --user=mysql --basedir=/usr/local/mysql --datadir=/usr/local/mysql/data`（初始化后控制台输出 root 临时密码，记得记录）；启动服务：`systemctl start mysql`；
- 修改 root 密码与授权远程访问（Linux 安装后配置）：

```sql
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '1234';
CREATE USER 'root'@'%' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%';
FLUSH PRIVILEGES;
```

- SQL 四大分类与核心语句：DDL（`show databases`、`select database()`、`use 库名`、`create database [if not exists] 库名 [default charset utf8mb4]`、`create table 表名(...)`、`drop database/table`）；DML（`insert into 表名(...) values(...)`、`update 表名 set ... where ...`、`delete from 表名 where ...`）；DQL（`select ... from ... where ... group by ... having ... order by ... limit ...`）；DCL（用户与权限控制，见上面 GRANT）；
- Java 连接串：`jdbc:mysql://localhost:3306/web01`（格式：`jdbc:mysql://主机:端口/数据库名`）。

**八、前端命令（npm / Vue 工程化 / Axios）**

- 创建 Vue 工程：`npm create vue@3.3.4`；
- 安装依赖：`npm install`；
- 启动开发服务器：`npm run dev`（默认 `http://localhost:5173`）；
- 安装 axios：`npm install axios`；
- 安装 Element Plus：`npm install element-plus@2.4.4 --save`；main.js 中引入：

```javascript
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'

createApp(App).use(ElementPlus).mount('#app')
```

- Axios 用法：`axios.get(url).then(result => ...)`、`axios.post(url, 数据).then(...)`；async/await 写法：`let result = await axios.get(url)`；
- Vue3 / Axios CDN（非工程化页面直接引入）：`https://unpkg.com/vue@3/dist/vue.esm-browser.js`、`https://unpkg.com/axios/dist/axios.min.js`。

**九、Linux 常用命令**

- 基础：`ip addr`（查看 IP）、`init 0`（关机）、`init 6`（重启）、`clear` 或 Ctrl+l（清屏）、Tab 键补全；
- 目录操作：`ls [-al]`（简写 `ll`）、`cd`（`cd ..` 上级、`cd ~` home、`cd -` 上次目录）、`mkdir [-p]`、`rm [-rf]`（⚠️ 危险操作，注意核对路径）；
- 文件查看：`cat [-n]`（一次性看小文件）、`more`（分页看大文件；回车翻一行、空格翻一屏、b 上一屏、q 退出）、`head [-n]`（看开头）、`tail [-nf]`（看结尾，`-f` 动态刷新，常用于日志）；
- 拷贝移动：`cp [-r] source dest`、`mv source dest`（第二个参数是已存在目录则为移动，否则为重命名）；
- 打包压缩：`tar -zcvf 包名.tar.gz 目标`（打包并压缩）、`tar -zxvf 包名.tar.gz [-C 目录]`（解压到指定目录）；`.tar` 只打包不压缩用 `-cvf/-xvf`；
- 文本编辑：`vim fileName`（i/a/o 进入插入模式、ESC 回命令模式、`:` 进底行模式、`:wq` 保存退出、`:q!` 不保存退出；安装 `yum install vim`）；
- 查找：`find 目录 -name "*.log"`（按文件名查找）、`grep [-inAB] 关键字 文件`（按内容查找，`-i` 忽略大小写、`-n` 行号、`-A/-B` 前后几行）；
- 服务与防火墙：`systemctl start/stop/status/restart/enable/disable 服务名`；`firewall-cmd --state`、`systemctl stop/start firewalld`、`firewall-cmd --zone=public --add-port=8080/tcp --permanent`、`firewall-cmd --zone=public --remove-port=...`、`firewall-cmd --reload`、`firewall-cmd --zone=public --list-ports`（生产服务器不建议关闭防火墙）；
- 环境变量生效：`source /etc/profile`。

**十、Nginx 安装与操作**

- 安装依赖：`yum install -y pcre pcre-devel zlib zlib-devel openssl openssl-devel`；
- 解压源码：`tar -zxvf nginx-1.20.2.tar.gz`，进入目录后 `./configure --prefix=/usr/local/nginx`；
- 编译安装：`make`、`make install`；
- 启动 / 停止 / 重载（在 /usr/local/nginx 目录下）：`sbin/nginx`、`sbin/nginx -s quit`、`sbin/nginx -s reload`。

**十一、Docker 命令**

- 镜像：`docker build -t myImage:1.0 .`（构建，格式 `docker build -t 镜像名 Dockerfile目录`）、`docker images`（查看）、`docker pull/docker push`（拉取/推送）、`docker rmi`（删除）、`docker save/docker load`（保存为文件/加载镜像文件）；
- 容器：`docker run -d --name mysql -p 3307:3306 -e MYSQL_ROOT_PASSWORD=123 mysql:8`（`-d` 后台运行、`--name` 命名唯一、`-e` 环境变量、`-p` 端口映射：宿主机端口:容器内端口）；`docker ps`（查看容器）、`docker stop/start/restart`、`docker logs`（日志）、`docker exec`（进入容器执行命令）、`docker rm`（删除容器）；
- 数据卷：`docker volume create/ls/rm/inspect/prune`；
- 网络：`docker network create/ls/rm/prune`；
- Docker Compose：命令格式 `docker compose [OPTIONS] [COMMAND]`；选项 `-f`（指定 compose 文件路径和名称）、`-p`（指定 project 名称）；命令 `up`（创建并启动所有 service 容器）、`down`（停止并移除所有容器、网络）、`ps`（列出启动的容器）、`logs`、`stop/start/restart`、`top`（查看运行的进程）。

**十二、项目启动与部署方式**

- Java 程序：IDEA 中运行 main 方法，或命令行 `javac` + `java`；
- SpringBoot 后端项目：IDEA 中运行引导类（默认端口 8080）；上线时打成 jar 包后 `java -jar xxxxxx.jar` 运行；Linux 后台运行（不占用前台窗口）：

```bash
nohup java -jar xxxxxx.jar &> tlias.log &
```

- SpringBoot 端口覆盖示例：`java -Dserver.port=9000 -jar tlias-web-management-0.0.1-SNAPSHOT.jar --server.port=10010`（命令行参数优先级高于系统属性）；
- 前端项目：开发时 `npm run dev`；部署时把打包产物放到 Nginx 的 html 目录，在 conf/nginx.conf 中配置静态资源与 `/api/` 反向代理（`rewrite ^/api/(.*)$ /$1 break;` + `proxy_pass http://localhost:8080;`），启动 `sbin/nginx` 后用 `http://localhost:80` 访问；
- Linux 部署位置约定：后端 jar 包上传到 `/usr/local/tlias-app`；前端静态资源上传到 Nginx 的 html 目录；
- Docker 部署：`docker run ...` 单容器启动，或 `docker compose up -d` 一键编排（MySQL + 服务端 + Nginx）。

**十三、课件访问链接汇总**

- 工具与插件：通义灵码 IDEA 插件下载 `https://lingma.aliyun.com/lingma/download`；VS Code：https://code.visualstudio.com ；DataGrip：https://www.jetbrains.com/zh-cn/datagrip/ ；Apifox：https://apifox.com/ ；
- Maven：官网 http://maven.apache.org/ ；中央仓库 `https://repo1.maven.org/maven2/`；阿里云镜像 `http://maven.aliyun.com/nexus/content/groups/public/`；依赖坐标搜索 https://mvnrepository.com/ ；Apache 项目列表 https://www.apache.org/index.html#projects-list ；
- Spring：官网 spring.io；官方 starter 列表：`https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/#using.build-systems.starters` ；
- MyBatis：中文官网 https://mybatis.org/mybatis-3/zh_CN/index.html 、https://mybatis.net.cn/getting-started.html ；
- MySQL 下载：https://dev.mysql.com/downloads/mysql/ ；
- JWT：https://jwt.io/ ；
- Vue 生态：Vue 官网 https://cn.vuejs.org/ ；Axios 官网 https://www.axios-http.cn/ ；Element Plus：https://element-plus.org/zh-CN/#/zh-CN ；Vue Router：https://router.vuejs.org/zh ；
- 部署：Nginx 官网 https://nginx.org/ ；Docker 官方文档 https://docs.docker.com/ ；
- CDN（页面直接引入）：`https://unpkg.com/vue@3/dist/vue.esm-browser.js`、`https://unpkg.com/axios/dist/axios.min.js`；
- 课件案例中的接口与本机地址（前后端联调示例）：本机后端 `http://localhost:8080`（接口如 `/hello?name=Heima`、`/request`、`/list`、`/item/selectAll`、`/user/getById?id=1`、`/user/saveUser`、`/user/updateUser`、`/user/deleteUser?id=1`、`/users`、`/users/1`、`/depts`）；本机前端与代理 `http://localhost:90`、`http://localhost:90/api/depts`、`http://localhost:5173`、`http://localhost:80`；
- 课件案例中的资源与 Mock 接口：`https://web-server.itheima.net/emps/list`、`https://mock.apifox.cn/m1/3083103-0-default/emps/list`、`https://mock.apifox.cn/m1/3083103-0-default/emps/update`、`https://apifoxmock.com/m1/3128855-default/depts`；
- 课件案例中的服务器地址：私服 `http://192.168.150.101:8081/repository/`（maven-releases / maven-snapshots / maven-public）；部署演示地址 `http://192.168.150.200:90`、`http://192.168.150.100:8080`；阿里云 OSS：https://oss-cn-beijing.aliyuncs.com ；
- HTML 案例中的示例链接：`https://www.cctv.com/`（`<a href>` 示例，非开发链接）。

至此，第一、二、三阶段的笔记与指令集模块全部完成。

