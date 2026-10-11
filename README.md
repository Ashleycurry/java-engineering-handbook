# Java 工程实践手册

[中文](README.md) | [English](README-English.md)

本仓库用于整理 Java 学习与工程实践的课程资料、源码案例和学习笔记，内容按三个阶段循序推进：阶段一为 Java 核心与 AI 开发基础；阶段二为 Java 核心与 AI 开发进阶；阶段三为 AI 赋能 Web 开发。

课程课件位于 `docs/`，源码案例位于 `src/`，学习笔记位于 `notes/`。源码案例按“一个知识点对应一个小案例”的风格编写，并配有中文注释，方便对照课件学习。

## 资料与环境

- 课件目录：[docs](docs)（3 个阶段，48 份 PPTX 与 1 份 PDF，共 49 份）
- 源码目录：[src](src)
- 编程语言：Java（JDK 21）
- 开发工具：IntelliJ IDEA
- 工程组织：按阶段划分为独立 IDEA 工程，每个章节对应一个独立模块（Module）
- 源码包名：`com.myproject.*`

## 学习路线

```text
阶段一：Java 核心与 AI 开发基础
    -> 开发环境搭建与 IDEA 开发工具
    -> 基础语法、运算符、方法与流程控制
    -> 数组、面向对象基础与面向对象高级
    -> 常用 API、集合基础
            |
            v
阶段二：Java 核心与 AI 开发进阶
    -> 集合高级（List / Set / Map 体系）
    -> Stream 流、异常、File 类与递归
    -> 常用 API、IO 流
    -> 多线程、网络编程、Java 高级技术
            |
            v
阶段三：AI 赋能 Web 开发
    -> Web 基础知识、HTML + CSS、JavaScript、Vue3
    -> Maven、数据库、SpringBoot（JDBC / MyBatis）
    -> 后端 Web 实战（Tlias 智能学习辅助系统）
    -> 前端 Web 实战、项目部署（Linux）与 Docker
```

## 课件（docs）

### 阶段一：Java 核心与 AI 开发基础（15 份）

| 编号 | 课件 | 主要内容 | 对应源码 |
| --- | --- | --- | --- |
| 000 | [课程简介](docs/001-阶段一-Java核心与AI开发基础/000-课程简介.pptx) | 课程定位、阶段划分与学习路线 | — |
| 001 | [Java 开发环境搭建](docs/001-阶段一-Java核心与AI开发基础/001-Java开发环境搭建.pptx) | Java 背景、JDK 安装、HelloWorld 与程序执行原理 | [Chapter_01](src/Phase_001/Chapter_01) |
| 002 | [IDEA 开发工具](docs/001-阶段一-Java核心与AI开发基础/002-IDEA开发工具.pptx) | IDEA 安装、第一个代码与常用操作 | [Chapter_01](src/Phase_001/Chapter_01) |
| 002 | [IDEA 使用文档（PDF）](docs/001-阶段一-Java核心与AI开发基础/002-IDEA使用文档.pdf) | IDEA 操作补充文档 | [Chapter_01](src/Phase_001/Chapter_01) |
| 003 | [第三章：Java 基础语法](docs/001-阶段一-Java核心与AI开发基础/003-第三章：Java基础语法.pptx) | 注释、关键字、字面量、变量、标识符与数据类型 | [Chapter_02](src/Phase_001/Chapter_02) |
| 004 | [第四章：运算符](docs/001-阶段一-Java核心与AI开发基础/004-第四章：运算符.pptx) | 算术、赋值、关系、逻辑、三元运算符与类型转换 | [Chapter_02](src/Phase_001/Chapter_02) |
| 005 | [第五章：方法](docs/001-阶段一-Java核心与AI开发基础/005-第五章：方法.pptx) | 方法定义与调用、参数、返回值与方法重载 | [Chapter_02](src/Phase_001/Chapter_02) |
| 006 | [第六章：流程控制语句](docs/001-阶段一-Java核心与AI开发基础/006-第六章：流程控制语句.pptx) | if / switch 分支、for / while 循环与 Debug 工具 | [Chapter_03](src/Phase_001/Chapter_03) |
| 007 | [第七章：数组](docs/001-阶段一-Java核心与AI开发基础/007-第七章：数组.pptx) | 数组介绍、最值计算与销售总额统计案例 | [Chapter_04](src/Phase_001/Chapter_04) |
| 008 | [第八章：面向对象基础](docs/001-阶段一-Java核心与AI开发基础/008-第八章：面向对象基础.pptx) | 面向对象思想、类与对象、封装与构造方法 | [Chapter_05](src/Phase_001/Chapter_05) |
| 009 | [第九章：面向对象高级 1](docs/001-阶段一-Java核心与AI开发基础/009-第九章：面向对象高级1.pptx) | 继承、Object 类与 final 关键字 | [Chapter_06](src/Phase_001/Chapter_06) |
| 009 | [第九章：面向对象高级 2](docs/001-阶段一-Java核心与AI开发基础/009-第九章：面向对象高级2.pptx) | 抽象类、接口与多态 | [Chapter_06](src/Phase_001/Chapter_06) |
| 009 | [第九章：面向对象高级 3](docs/001-阶段一-Java核心与AI开发基础/009-第九章：面向对象高级3.pptx) | 代码块、内部类与包 | [Chapter_06](src/Phase_001/Chapter_06) |
| 010 | [第十章：常用 API](docs/001-阶段一-Java核心与AI开发基础/010-第十章：常用API.pptx) | API 概念、Scanner、Random 等常用类 | Chapter_07（待补充） |
| 011 | [第十一章：集合基础](docs/001-阶段一-Java核心与AI开发基础/011-第十一章：集合基础.pptx) | 集合与数组的对比、集合基础概念 | Chapter_07（待补充） |

### 阶段二：Java 核心与 AI 开发进阶（10 份）

| 编号 | 课件 | 主要内容 |
| --- | --- | --- |
| 000 | [第十二章：集合高级 1](docs/002-阶段二-Java核心与AI开发进阶/000-第十二章：集合高级1.pptx) | 集合的创建、增删改查、遍历与 ArrayList |
| 001 | [第十二章：集合高级 2](docs/002-阶段二-Java核心与AI开发进阶/001-第十二章：集合高级2.pptx) | List（ArrayList / LinkedList）与 Set（HashSet / LinkedHashSet / TreeSet）体系 |
| 002 | [第十三章：Stream 流](docs/002-阶段二-Java核心与AI开发进阶/002-第十三章：Stream流.pptx) | Lambda 表达式与 Stream 流式操作 |
| 003 | [第十四章：异常](docs/002-阶段二-Java核心与AI开发进阶/003-第十四章：异常.pptx) | 异常体系、处理方式与自定义异常 |
| 004 | [第十五章：File 类](docs/002-阶段二-Java核心与AI开发进阶/004-第十五章：File类.pptx) | File 类常用 API 与递归 |
| 005 | [第十六章：常用 API](docs/002-阶段二-Java核心与AI开发进阶/005-第十六章：常用API.pptx) | Math、System、包装类、BigDecimal 与 Arrays |
| 006 | [第十七章：IO 流](docs/002-阶段二-Java核心与AI开发进阶/006-第十七章：IO流.pptx) | IO 分类、字节流与字符流 |
| 007 | [第十八章：多线程](docs/002-阶段二-Java核心与AI开发进阶/007-第十八章：多线程.pptx) | 进程与线程、线程安全与同步、线程池 |
| 008 | [第十九章：网络编程](docs/002-阶段二-Java核心与AI开发进阶/008-第十九章：网络编程.pptx) | 网络编程三要素、UDP 与 TCP 通信 |
| 009 | [第二十章：Java 高级技术](docs/002-阶段二-Java核心与AI开发进阶/009-第二十章-Java高级技术.pptx) | 枚举、类加载器、反射、注解与动态代理 |

### 阶段三：AI 赋能 Web 开发（24 份）

| 编号 | 课件 | 主要内容 |
| --- | --- | --- |
| 000 | [后端 Web 实战（登录认证）](docs/003-阶段三-AI赋能Web开发/000-后端Web实战%28登录认证%29.pptx) | Tlias 智能学习辅助系统：登录认证 |
| 001 | [后端 Web 进阶（AOP）](docs/003-阶段三-AI赋能Web开发/001-后端Web进阶%28AOP%29.pptx) | 面向切面编程 |
| 002 | [后端 Web 进阶（Maven 高级）](docs/003-阶段三-AI赋能Web开发/002-后端Web进阶%28Maven高级%29.pptx) | 分模块设计、继承与聚合、私服 |
| 003 | [后端 Web 进阶（SpringBoot 原理）](docs/003-阶段三-AI赋能Web开发/003-后端Web进阶%28SpringBoot原理%29.pptx) | 配置优先级与 Bean 管理 |
| 004 | [后端 Web 开发总结](docs/003-阶段三-AI赋能Web开发/004-后端Web开发总结.pptx) | 分层架构、过滤器、拦截器与 IOC / DI 总结 |
| 005 | [前端 Web 实战（Vue 工程化 + ElementPlus）](docs/003-阶段三-AI赋能Web开发/005-前端Web实战%28Vue工程化%2BElementPlus%29.pptx) | Vue 工程化与 ElementPlus |
| 006 | [前端 Web 实战（Tlias 案例）](docs/003-阶段三-AI赋能Web开发/006-前端Web实战%28Tlias案例%29.pptx) | Tlias 前端实战（1） |
| 007 | [前端 Web 实战（Tlias 案例）](docs/003-阶段三-AI赋能Web开发/007-前端Web实战%28Tlias案例%29.pptx) | 员工管理：条件分页查询、新增、修改与删除 |
| 008 | [前端 Web 实战（Tlias 案例）](docs/003-阶段三-AI赋能Web开发/008-前端Web实战%28Tlias案例%29.pptx) | 修改 / 删除员工、登录退出与打包部署 |
| 009 | [项目部署（Linux）](docs/003-阶段三-AI赋能Web开发/009-项目部署%28Linux%29.pptx) | Linux 环境下部署项目 |
| 010 | [Docker](docs/003-阶段三-AI赋能Web开发/010-Docker.pptx) | Docker 容器化部署 |
| 011 | [HTML + CSS](docs/003-阶段三-AI赋能Web开发/011-HTML%2BCSS.pptx) | 前端基础：HTML 与 CSS |
| 012 | [Web 开发介绍](docs/003-阶段三-AI赋能Web开发/012-Web开发介绍.pptx) | Web 概念与开发流程概述 |
| 013 | [JavaScript](docs/003-阶段三-AI赋能Web开发/013-JavaScript.pptx) | JavaScript 基础语法与网页交互 |
| 014 | [Vue3 基础](docs/003-阶段三-AI赋能Web开发/014-Vue3基础.pptx) | Vue3 渐进式框架基础 |
| 015 | [Maven 基础](docs/003-阶段三-AI赋能Web开发/015-Maven基础.pptx) | Maven 依赖管理与项目构建 |
| 016 | [Web 基础知识](docs/003-阶段三-AI赋能Web开发/016-Web基础知识.pptx) | Web 服务器、静态资源与动态资源 |
| 017 | [数据库](docs/003-阶段三-AI赋能Web开发/017-数据库.pptx) | 数据库基础与 Web 分层架构 |
| 018 | [后端 Web 基础（java 操作数据库）](docs/003-阶段三-AI赋能Web开发/018-后端Web基础%28java操作数据库%29.pptx) | JDBC、MyBatis 与 MyBatisPlus |
| 019 | [后端 Web 实战（部门管理）](docs/003-阶段三-AI赋能Web开发/019-后端Web实战%28部门管理%29.pptx) | Tlias 部门管理实战 |
| 020 | [后端 Web 实战（员工管理）](docs/003-阶段三-AI赋能Web开发/020-后端Web实战%28员工管理%29.pptx) | 多表关系、多表查询与员工列表查询 |
| 021 | [后端 Web 实战（员工管理）](docs/003-阶段三-AI赋能Web开发/021-后端Web实战%28员工管理%29.pptx) | 新增员工、事务管理与文件上传 |
| 022 | [后端 Web 实战（员工管理）](docs/003-阶段三-AI赋能Web开发/022-后端Web实战%28员工管理%29.pptx) | 删除 / 修改员工、异常处理与员工信息统计 |
| 023 | [Web 开发 - 完结](docs/003-阶段三-AI赋能Web开发/023-Web开发-完结.pptx) | 课程收尾与后续学习路线 |

## 源码（src）

### 阶段一：Phase_001

`src/Phase_001` 是阶段一的独立 IDEA 工程（JDK 21），每个章节对应一个模块，源码位于模块的 `src/com/myproject/` 包下。

#### Chapter_01：环境搭建与入门程序

| 案例 | 主题 |
| --- | --- |
| [untitled_01.java](src/Phase_001/Chapter_01/untitled/src/untitled_01.java) | 第一个 Java 程序：类与 main 方法 |
| [untitled_02.java](src/Phase_001/Chapter_01/untitled1/src/untitled_02.java) | 入门程序练习：控制台输出 |

#### Chapter_02：基础语法（模块 untitled2）

| 案例 | 主题 |
| --- | --- |
| [CommentsDemo.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/comment/CommentsDemo.java) | 注释：单行、多行与文档注释 |
| [LiteralDemo.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/literal/LiteralDemo.java) | 字面量：整数、小数、字符、字符串、布尔与 null |
| [VariableDemo.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/variable/VariableDemo.java) | 变量与八种基本数据类型、进制表示、字符存储原理 |
| [TypeConversionDemo.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/type/TypeConversionDemo.java) | 自动类型转换与表达式类型提升 |
| [OperatorDemo01.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/operator/OperatorDemo01.java) | 算术运算符与拆分数字各位 |
| [OperatorDemo02.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/operator/OperatorDemo02.java) | 逻辑运算符与短路特性 |
| [OperatorDemo03.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/operator/OperatorDemo03.java) | 自增自减运算符 |
| [MethodDemo01.java](src/Phase_001/Chapter_02/untitled2/src/com/myproject/method/MethodDemo01.java) | 方法定义、参数与返回值 |

#### Chapter_03：流程控制语句（模块 untitled3）

| 案例 | 主题 |
| --- | --- |
| [IfDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/if_demo/IfDemo.java) | if 分支结构的三种格式 |
| [SwitchDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/switch_demo/SwitchDemo.java) | switch 分支与 case 穿透 |
| [ForDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/forDemo/ForDemo.java) | for 循环 |
| [ForDemo2.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/forDemo/ForDemo2.java) | 嵌套循环：星号矩形、九九乘法表与金字塔 |
| [WhileDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/whileDemo/WhileDemo.java) | while 循环与累加求和 |
| [DowhileDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/dowhileDemo/DowhileDemo.java) | do-while 循环：至少执行一次 |
| [BreakDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/breakDemo/BreakDemo.java) | break 提前结束循环 |
| [ContinueDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/continueDemo/ContinueDemo.java) | continue 跳过本次循环 |
| [RandomDemo.java](src/Phase_001/Chapter_03/untitled3/src/com/myproject/randomDemo/RandomDemo.java) | Random 随机数与猜数字游戏 |

#### Chapter_04：数组（模块 untitled4）

| 案例 | 主题 |
| --- | --- |
| [demo_01.java](src/Phase_001/Chapter_04/untitled4/src/com/myproject/Array_Demo_01/demo_01.java) | 数组静态初始化：完整格式与简化格式 |
| [demo_02.java](src/Phase_001/Chapter_04/untitled4/src/com/myproject/Array_Demo_02/demo_02.java) | 数组元素访问：取值、修改与遍历 |
| [demo_03.java](src/Phase_001/Chapter_04/untitled4/src/com/myproject/Array_Demo_03/demo_03.java) | 数组遍历应用：求和、最大值与元素反转 |
| [demo_04.java](src/Phase_001/Chapter_04/untitled4/src/com/myproject/Array_Demo_04/demo_04.java) | 静态初始化与动态初始化、默认值规则 |
| [demo_05.java](src/Phase_001/Chapter_04/untitled4/src/com/myproject/Array_Demo_05/demo_05.java) | 二维数组：初始化、元素访问与遍历 |

#### Chapter_05：面向对象基础（模块 untitled5）

| 案例 | 主题 |
| --- | --- |
| [OOP_Demo_01/demo_01.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/OOP_Demo_01/demo_01.java) | 类和对象：创建对象与访问成员 |
| [OOP_Demo_02/demo_02.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/OOP_Demo_02/demo_02.java) | 封装与权限修饰符、get / set 校验 |
| [Constructor/demo_constructor.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/Constructor/demo_constructor.java) | 构造方法：无参构造与有参构造 |
| [This_Demo_01/this_demo_01.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/This_Demo_01/this_demo_01.java) | this 关键字：区分成员变量与局部变量 |
| [Static_Demo/demo_01.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/Static_Demo/demo_01.java) | static 静态变量与静态方法 |
| [JavaBean_demo/demo_01.java](src/Phase_001/Chapter_05/untitled5/src/com/myproject/JavaBean_demo/demo_01.java) | 标准 JavaBean 规范 |

#### Chapter_06：面向对象高级（模块 untitled6）

| 案例 | 主题 |
| --- | --- |
| [OOP_Demo_03/demo_03.java](src/Phase_001/Chapter_06/untitled6/src/com/myproject/OOP_Demo_03/demo_03.java) | 继承：子类继承父类属性与方法 |
| [OOP_Demo_03/demo_04.java](src/Phase_001/Chapter_06/untitled6/src/com/myproject/OOP_Demo_03/demo_04.java) | 继承成员访问特点：就近原则、方法重写与 super |
| [OOP_Demo_04/demo_05.java](src/Phase_001/Chapter_06/untitled6/src/com/myproject/OOP_Demo_04/demo_05.java) | 抽象类与抽象方法 |
| [Final_Demo/demo_01.java](src/Phase_001/Chapter_06/untitled6/src/com/myproject/Final_Demo/demo_01.java) | final 关键字：变量、方法与类 |
| [Object_Demo/demo_01.java](src/Phase_001/Chapter_06/untitled6/src/com/myproject/Object_Demo/demo_01.java) | Object 类与 toString 重写 |

#### Chapter_07（待补充）

Chapter_07 已建好模块骨架，后续补充“常用 API”与“集合基础”相关案例。

### 阶段二、阶段三（待补充）

`src/Phase_002` 与 `src/Phase_003` 将随课程进度补充阶段二、阶段三的源码案例。

## 学习笔记（notes）

`notes/` 目录用于整理课程学习过程中沉淀的文字笔记（知识点总结、易错点、复习提纲等），将随学习进度持续补充。

## 如何运行

- 使用 IntelliJ IDEA 打开对应阶段的工程目录（例如 `src/Phase_001`），IDEA 会自动加载各章节模块。
- 工程默认使用 JDK 21；若本机 JDK 版本不同，可在 `File → Project Structure` 中调整 Project SDK。
- 每个案例类都包含 `main` 方法，可右键直接运行；建议按章节顺序从 `Chapter_01` 开始阅读。
- 所有案例仅依赖 JDK 标准库，无需额外安装依赖。

## 仓库结构

```text
java-engineering-handbook/
├── README.md
├── README-English.md
├── docs/                                  # 课程课件（PPTX / PDF）
│   ├── 001-阶段一-Java核心与AI开发基础/    # 阶段一课件（15 份）
│   ├── 002-阶段二-Java核心与AI开发进阶/    # 阶段二课件（10 份）
│   └── 003-阶段三-AI赋能Web开发/           # 阶段三课件（24 份）
├── notes/                                 # 学习笔记（持续整理中）
└── src/
    ├── Phase_001/                         # 阶段一源码（IDEA 工程）
    │   ├── Chapter_01/                    # 环境搭建与入门程序
    │   ├── Chapter_02/                    # 基础语法
    │   ├── Chapter_03/                    # 流程控制语句
    │   ├── Chapter_04/                    # 数组
    │   ├── Chapter_05/                    # 面向对象基础
    │   ├── Chapter_06/                    # 面向对象高级
    │   ├── Chapter_07/                    # 模块骨架（待补充）
    │   └── out/                           # IDEA 编译输出（可忽略）
    ├── Phase_002/                         # 阶段二源码（待补充）
    └── Phase_003/                         # 阶段三源码（待补充）
```

## 当前范围

- 已包含：三个阶段共 49 份课件；阶段一 Chapter_01 ~ Chapter_06 的源码案例（环境搭建、基础语法、流程控制、数组、面向对象基础、面向对象高级）。
- 待补充：阶段一 Chapter_07（常用 API、集合基础）；阶段二、阶段三的源码案例；`notes/` 学习笔记。

## 关键词

`Java` `JDK 21` `IntelliJ IDEA` `基础语法` `面向对象` `集合` `Stream` `IO` `多线程` `网络编程` `SpringBoot` `MyBatis` `Vue3` `Maven` `Docker`
