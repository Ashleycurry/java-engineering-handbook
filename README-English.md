# Java Engineering Handbook

[中文](README.md) | [English](README-English.md)

This repository organizes course materials, source-code examples, and study notes for learning Java and engineering practice. The content follows three progressive stages: Stage 1 covers Java core and AI development basics; Stage 2 covers advanced Java core topics; Stage 3 focuses on AI-empowered web development.

Courseware is stored in `docs/`, source examples in `src/`, and study notes in `notes/`. Each source example follows a "one topic, one case" style with Chinese comments, making it easy to study alongside the courseware.

## Materials and Environment

- Courseware: [docs](docs) (3 stages, 48 PPTX and 1 PDF files, 49 in total)
- Source code: [src](src)
- Language: Java (JDK 21)
- IDE: IntelliJ IDEA
- Project layout: one standalone IDEA project per stage, one module per chapter
- Package name: `com.myproject.*`

## Learning Path

```text
Stage 1: Java Core and AI Development Basics
    -> Environment setup and the IntelliJ IDEA toolchain
    -> Basic syntax, operators, methods, and flow control
    -> Arrays, OOP basics, and advanced OOP
    -> Common APIs and collection basics
            |
            v
Stage 2: Java Core and AI Development (Advanced)
    -> Advanced collections (List / Set / Map)
    -> Stream API, exceptions, File class, and recursion
    -> Common APIs and I/O streams
    -> Multithreading, network programming, and advanced Java techniques
            |
            v
Stage 3: AI-Empowered Web Development
    -> Web fundamentals, HTML + CSS, JavaScript, and Vue 3
    -> Maven, databases, and Spring Boot (JDBC / MyBatis)
    -> Backend web development practice (Tlias learning assistant system)
    -> Frontend web practice, deployment (Linux), and Docker
```

## Courseware (docs)

### Stage 1: Java Core and AI Development Basics (15 files)

| No. | Courseware | Topics | Source chapter |
| --- | --- | --- | --- |
| 000 | [Course Introduction](docs/001-阶段一-Java核心与AI开发基础/000-课程简介.pptx) | Course positioning, stage breakdown, and learning path | — |
| 001 | [Java Environment Setup](docs/001-阶段一-Java核心与AI开发基础/001-Java开发环境搭建.pptx) | Java background, JDK installation, HelloWorld, and program execution | [Chapter_01](src/Phase_001/Chapter_01) |
| 002 | [IDEA Development Tool](docs/001-阶段一-Java核心与AI开发基础/002-IDEA开发工具.pptx) | IDEA installation, the first code example, and common operations | [Chapter_01](src/Phase_001/Chapter_01) |
| 002 | [IDEA User Guide (PDF)](docs/001-阶段一-Java核心与AI开发基础/002-IDEA使用文档.pdf) | Supplemental document for IDEA operations | [Chapter_01](src/Phase_001/Chapter_01) |
| 003 | [Chapter 3: Java Basic Syntax](docs/001-阶段一-Java核心与AI开发基础/003-第三章：Java基础语法.pptx) | Comments, keywords, literals, variables, identifiers, and data types | [Chapter_02](src/Phase_001/Chapter_02) |
| 004 | [Chapter 4: Operators](docs/001-阶段一-Java核心与AI开发基础/004-第四章：运算符.pptx) | Arithmetic, assignment, relational, logical, and ternary operators; type conversion | [Chapter_02](src/Phase_001/Chapter_02) |
| 005 | [Chapter 5: Methods](docs/001-阶段一-Java核心与AI开发基础/005-第五章：方法.pptx) | Method definition and invocation, parameters, return values, and overloading | [Chapter_02](src/Phase_001/Chapter_02) |
| 006 | [Chapter 6: Flow Control](docs/001-阶段一-Java核心与AI开发基础/006-第六章：流程控制语句.pptx) | if / switch branches, for / while loops, and the Debug tool | [Chapter_03](src/Phase_001/Chapter_03) |
| 007 | [Chapter 7: Arrays](docs/001-阶段一-Java核心与AI开发基础/007-第七章：数组.pptx) | Array introduction, min/max values, and a sales-total case study | [Chapter_04](src/Phase_001/Chapter_04) |
| 008 | [Chapter 8: OOP Basics](docs/001-阶段一-Java核心与AI开发基础/008-第八章：面向对象基础.pptx) | OOP concepts, classes and objects, encapsulation, and constructors | [Chapter_05](src/Phase_001/Chapter_05) |
| 009 | [Chapter 9: Advanced OOP 1](docs/001-阶段一-Java核心与AI开发基础/009-第九章：面向对象高级1.pptx) | Inheritance, the Object class, and the final keyword | [Chapter_06](src/Phase_001/Chapter_06) |
| 009 | [Chapter 9: Advanced OOP 2](docs/001-阶段一-Java核心与AI开发基础/009-第九章：面向对象高级2.pptx) | Abstract classes, interfaces, and polymorphism | [Chapter_06](src/Phase_001/Chapter_06) |
| 009 | [Chapter 9: Advanced OOP 3](docs/001-阶段一-Java核心与AI开发基础/009-第九章：面向对象高级3.pptx) | Code blocks, inner classes, and packages | [Chapter_06](src/Phase_001/Chapter_06) |
| 010 | [Chapter 10: Common APIs](docs/001-阶段一-Java核心与AI开发基础/010-第十章：常用API.pptx) | API concepts, Scanner, Random, and other common classes | Chapter_07 (to be added) |
| 011 | [Chapter 11: Collections Basics](docs/001-阶段一-Java核心与AI开发基础/011-第十一章：集合基础.pptx) | Arrays vs. collections and core collection concepts | Chapter_07 (to be added) |

### Stage 2: Java Core and AI Development (Advanced) (10 files)

| No. | Courseware | Topics |
| --- | --- | --- |
| 000 | [Chapter 12: Advanced Collections 1](docs/002-阶段二-Java核心与AI开发进阶/000-第十二章：集合高级1.pptx) | Collection creation, CRUD operations, iteration, and ArrayList |
| 001 | [Chapter 12: Advanced Collections 2](docs/002-阶段二-Java核心与AI开发进阶/001-第十二章：集合高级2.pptx) | List (ArrayList / LinkedList) and Set (HashSet / LinkedHashSet / TreeSet) |
| 002 | [Chapter 13: Stream API](docs/002-阶段二-Java核心与AI开发进阶/002-第十三章：Stream流.pptx) | Lambda expressions and stream-style collection operations |
| 003 | [Chapter 14: Exceptions](docs/002-阶段二-Java核心与AI开发进阶/003-第十四章：异常.pptx) | Exception hierarchy, handling strategies, and custom exceptions |
| 004 | [Chapter 15: File Class](docs/002-阶段二-Java核心与AI开发进阶/004-第十五章：File类.pptx) | Common File APIs and recursion |
| 005 | [Chapter 16: Common APIs](docs/002-阶段二-Java核心与AI开发进阶/005-第十六章：常用API.pptx) | Math, System, wrapper classes, BigDecimal, and Arrays |
| 006 | [Chapter 17: I/O Streams](docs/002-阶段二-Java核心与AI开发进阶/006-第十七章：IO流.pptx) | I/O classification, byte streams, and character streams |
| 007 | [Chapter 18: Multithreading](docs/002-阶段二-Java核心与AI开发进阶/007-第十八章：多线程.pptx) | Processes and threads, thread safety and synchronization, thread pools |
| 008 | [Chapter 19: Network Programming](docs/002-阶段二-Java核心与AI开发进阶/008-第十九章：网络编程.pptx) | The three elements of network programming, UDP and TCP communication |
| 009 | [Chapter 20: Advanced Java Techniques](docs/002-阶段二-Java核心与AI开发进阶/009-第二十章-Java高级技术.pptx) | Enums, class loaders, reflection, annotations, and dynamic proxies |

### Stage 3: AI-Empowered Web Development (24 files)

| No. | Courseware | Topics |
| --- | --- | --- |
| 000 | [Backend Web Practice (Login and Authentication)](docs/003-阶段三-AI赋能Web开发/000-后端Web实战%28登录认证%29.pptx) | Tlias learning assistant system: login and authentication |
| 001 | [Backend Web Advanced (AOP)](docs/003-阶段三-AI赋能Web开发/001-后端Web进阶%28AOP%29.pptx) | Aspect-oriented programming |
| 002 | [Backend Web Advanced (Advanced Maven)](docs/003-阶段三-AI赋能Web开发/002-后端Web进阶%28Maven高级%29.pptx) | Multi-module design, inheritance and aggregation, private repositories |
| 003 | [Backend Web Advanced (Spring Boot Internals)](docs/003-阶段三-AI赋能Web开发/003-后端Web进阶%28SpringBoot原理%29.pptx) | Configuration priority and bean management |
| 004 | [Backend Web Development Summary](docs/003-阶段三-AI赋能Web开发/004-后端Web开发总结.pptx) | Layered architecture, filters, interceptors, and IoC / DI recap |
| 005 | [Frontend Web Practice (Vue Engineering + ElementPlus)](docs/003-阶段三-AI赋能Web开发/005-前端Web实战%28Vue工程化%2BElementPlus%29.pptx) | Vue engineering setup and ElementPlus |
| 006 | [Frontend Web Practice (Tlias Case)](docs/003-阶段三-AI赋能Web开发/006-前端Web实战%28Tlias案例%29.pptx) | Tlias frontend practice (1) |
| 007 | [Frontend Web Practice (Tlias Case)](docs/003-阶段三-AI赋能Web开发/007-前端Web实战%28Tlias案例%29.pptx) | Employee management: conditional paging query, add, update, delete |
| 008 | [Frontend Web Practice (Tlias Case)](docs/003-阶段三-AI赋能Web开发/008-前端Web实战%28Tlias案例%29.pptx) | Update / delete employees, login and logout, and packaging and deployment |
| 009 | [Project Deployment (Linux)](docs/003-阶段三-AI赋能Web开发/009-项目部署%28Linux%29.pptx) | Deploying projects on Linux |
| 010 | [Docker](docs/003-阶段三-AI赋能Web开发/010-Docker.pptx) | Containerized deployment with Docker |
| 011 | [HTML + CSS](docs/003-阶段三-AI赋能Web开发/011-HTML%2BCSS.pptx) | Frontend fundamentals: HTML and CSS |
| 012 | [Introduction to Web Development](docs/003-阶段三-AI赋能Web开发/012-Web开发介绍.pptx) | Web concepts and development workflow overview |
| 013 | [JavaScript](docs/003-阶段三-AI赋能Web开发/013-JavaScript.pptx) | JavaScript basics and page interaction |
| 014 | [Vue 3 Basics](docs/003-阶段三-AI赋能Web开发/014-Vue3基础.pptx) | Vue 3 progressive framework fundamentals |
| 015 | [Maven Basics](docs/003-阶段三-AI赋能Web开发/015-Maven基础.pptx) | Maven dependency management and project build |
| 016 | [Web Fundamentals](docs/003-阶段三-AI赋能Web开发/016-Web基础知识.pptx) | Web servers, static resources, and dynamic resources |
| 017 | [Databases](docs/003-阶段三-AI赋能Web开发/017-数据库.pptx) | Database basics and the web layered architecture |
| 018 | [Backend Web Basics (Java Database Access)](docs/003-阶段三-AI赋能Web开发/018-后端Web基础%28java操作数据库%29.pptx) | JDBC, MyBatis, and MyBatisPlus |
| 019 | [Backend Web Practice (Department Management)](docs/003-阶段三-AI赋能Web开发/019-后端Web实战%28部门管理%29.pptx) | Tlias department management practice |
| 020 | [Backend Web Practice (Employee Management)](docs/003-阶段三-AI赋能Web开发/020-后端Web实战%28员工管理%29.pptx) | Multi-table relationships, multi-table queries, and employee list queries |
| 021 | [Backend Web Practice (Employee Management)](docs/003-阶段三-AI赋能Web开发/021-后端Web实战%28员工管理%29.pptx) | Adding employees, transaction management, and file upload |
| 022 | [Backend Web Practice (Employee Management)](docs/003-阶段三-AI赋能Web开发/022-后端Web实战%28员工管理%29.pptx) | Deleting / updating employees, exception handling, and employee statistics |
| 023 | [Web Development - Finale](docs/003-阶段三-AI赋能Web开发/023-Web开发-完结.pptx) | Course wrap-up and further learning roadmap |

## Source Code (src)

### Stage 1: Phase_001

`src/Phase_001` is the standalone IDEA project for Stage 1 (JDK 21). Each chapter is a separate module, with source files under `src/com/myproject/`.

#### Chapter_01: Environment Setup and First Programs

| Example | Topics |
| --- | --- |
| [untitled_01.java](src/Phase_001/Chapter_01/untitled/src/untitled_01.java) | The first Java program: classes and the main method |
| [untitled_02.java](src/Phase_001/Chapter_01/untitled1/src/untitled_02.java) | Getting-started practice: console output |

#### Chapter_02: Basic Syntax (module untitled2)

| Example | Topics |
| --- | --- |
| [CommentsDemo.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/comment/CommentsDemo.java) | Comments: single-line, multi-line, and Javadoc |
| [LiteralDemo.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/literal/LiteralDemo.java) | Literals: integers, decimals, characters, strings, booleans, and null |
| [VariableDemo.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/variable/VariableDemo.java) | Variables, the eight primitive types, number bases, and character storage |
| [TypeConversionDemo.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/type/TypeConversionDemo.java) | Automatic type conversion and expression type promotion |
| [OperatorDemo01.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/operator/OperatorDemo01.java) | Arithmetic operators and splitting a number into digits |
| [OperatorDemo02.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/operator/OperatorDemo02.java) | Logical operators and short-circuit evaluation |
| [OperatorDemo03.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/operator/OperatorDemo03.java) | Increment and decrement operators |
| [MethodDemo01.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/method/MethodDemo01.java) | Method definition, parameters, and return values |

#### Chapter_03: Flow Control (module untitled3)

| Example | Topics |
| --- | --- |
| [IfDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/if_demo/IfDemo.java) | The three forms of if branches |
| [SwitchDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/switch_demo/SwitchDemo.java) | switch branches and case fall-through |
| [ForDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/forDemo/ForDemo.java) | for loops |
| [ForDemo2.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/forDemo/ForDemo2.java) | Nested loops: star rectangles, the multiplication table, and pyramids |
| [WhileDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/whileDemo/WhileDemo.java) | while loops and cumulative summation |
| [DowhileDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/dowhileDemo/DowhileDemo.java) | do-while loops: executed at least once |
| [BreakDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/breakDemo/BreakDemo.java) | break: exiting loops early |
| [ContinueDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/continueDemo/ContinueDemo.java) | continue: skipping the current iteration |
| [RandomDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/randomDemo/RandomDemo.java) | Random numbers and a guessing game |

#### Chapter_04: Arrays (module untitled4)

| Example | Topics |
| --- | --- |
| [demo_01.java](src/Phase_001/Chapter_04/untitled4/src/com/myproject/Array_Demo_01/demo_01.java) | Array static initialization: full and shorthand forms |
| [demo_02.java](src/Phase_001/Chapter_04/untitled4/src/com/myproject/Array_Demo_02/demo_02.java) | Array element access: reading, updating, and iterating |
| [demo_03.java](src/Phase_001/Chapter_04/untitled4/src/com/myproject/Array_Demo_03/demo_03.java) | Array traversal applications: sum, maximum, and reversal |
| [demo_04.java](src/Phase_001/Chapter_04/untitled4/src/com/myproject/Array_Demo_04/demo_04.java) | Static vs. dynamic initialization and default value rules |
| [demo_05.java](src/Phase_001/Chapter_04/untitled4/src/com/myproject/Array_Demo_05/demo_05.java) | Two-dimensional arrays: initialization, access, and traversal |

#### Chapter_05: OOP Basics (module untitled5)

| Example | Topics |
| --- | --- |
| [OOP_Demo_01/demo_01.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/OOP_Demo_01/demo_01.java) | Classes and objects: creating objects and accessing members |
| [OOP_Demo_02/demo_02.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/OOP_Demo_02/demo_02.java) | Encapsulation, access modifiers, and get / set validation |
| [Constructor/demo_constructor.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/Constructor/demo_constructor.java) | Constructors: no-argument and parameterized |
| [This_Demo_01/this_demo_01.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/This_Demo_01/this_demo_01.java) | The this keyword: distinguishing member variables from local variables |
| [Static_Demo/demo_01.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/Static_Demo/demo_01.java) | static variables and static methods |
| [JavaBean_demo/demo_01.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/JavaBean_demo/demo_01.java) | The standard JavaBean convention |

#### Chapter_06: Advanced OOP (module untitled6)

| Example | Topics |
| --- | --- |
| [OOP_Demo_03/demo_03.java](src/Phase_001/Chapter_06/untitled6/src/com/myproject/OOP_Demo_03/demo_03.java) | Inheritance: subclasses inherit fields and methods |
| [OOP_Demo_03/demo_04.java](src/Phase_001/Chapter_06/untitled6/src/com/myproject/OOP_Demo_03/demo_04.java) | Member access in inheritance: proximity rule, overriding, and super |
| [OOP_Demo_04/demo_05.java](src/Phase_001/Chapter_06/untitled6/src/com/myproject/OOP_Demo_04/demo_05.java) | Abstract classes and abstract methods |
| [Final_Demo/demo_01.java](src/Phase_001/Chapter_06/untitled6/src/com/myproject/Final_Demo/demo_01.java) | The final keyword: variables, methods, and classes |
| [Object_Demo/demo_01.java](src/Phase_001/Chapter_06/untitled6/src/com/myproject/Object_Demo/demo_01.java) | The Object class and overriding toString |

#### Chapter_07 (to be added)

The Chapter_07 module skeleton is in place; examples for "Common APIs" and "Collections Basics" will be added as the course progresses.

### Stage 2 and Stage 3 (to be added)

`src/Phase_002` and `src/Phase_003` will receive the source examples for Stage 2 and Stage 3 as the course progresses.

## Study Notes (notes)

The `notes/` directory is used for written study notes accumulated during the course (concept summaries, common pitfalls, review outlines, and so on). It will be filled in progressively.

## How to Run

- Open the stage project directory (for example, `src/Phase_001`) in IntelliJ IDEA; the IDE will load all chapter modules automatically.
- The project uses JDK 21 by default; if your local JDK differs, adjust the Project SDK under `File → Project Structure`.
- Every example class contains a `main` method and can be run directly; reading from `Chapter_01` in order is recommended.
- All examples rely only on the JDK standard library, with no extra dependencies to install.

## Repository Structure

```text
java-engineering-handbook/
├── README.md
├── README-English.md
├── docs/                                       # Courseware (PPTX / PDF)
│   ├── 001-阶段一-Java核心与AI开发基础/         # Stage 1 courseware (15 files)
│   ├── 002-阶段二-Java核心与AI开发进阶/         # Stage 2 courseware (10 files)
│   └── 003-阶段三-AI赋能Web开发/                # Stage 3 courseware (24 files)
├── notes/                                      # Study notes (work in progress)
└── src/
    ├── Phase_001/                              # Stage 1 source (IDEA project)
    │   ├── Chapter_01/                         # Environment setup and first programs
    │   ├── Chapter_02/                         # Basic syntax
    │   ├── Chapter_03/                         # Flow control
    │   ├── Chapter_04/                         # Arrays
    │   ├── Chapter_05/                         # OOP basics
    │   ├── Chapter_06/                         # Advanced OOP
    │   ├── Chapter_07/                         # Module skeleton (to be added)
    │   └── out/                                # IDEA build output (can be ignored)
    ├── Phase_002/                              # Stage 2 source (to be added)
    └── Phase_003/                              # Stage 3 source (to be added)
```

## Current Scope

- Included: all 49 courseware files across the three stages; source examples for Stage 1 Chapter_01 through Chapter_06 (environment setup, basic syntax, flow control, arrays, OOP basics, and advanced OOP).
- To be added: Stage 1 Chapter_07 (common APIs and collections basics); Stage 2 and Stage 3 source examples; study notes under `notes/`.

## Keywords

`Java` `JDK 21` `IntelliJ IDEA` `Basic Syntax` `Object-Oriented Programming` `Collections` `Stream API` `IO` `Multithreading` `Network Programming` `Spring Boot` `MyBatis` `Vue 3` `Maven` `Docker`
