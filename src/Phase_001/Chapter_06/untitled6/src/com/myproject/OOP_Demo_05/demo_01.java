package com.myproject.OOP_Demo_05;

public class demo_01 {
    public static void main(String[] args) {
        // 案例：抽象方法——父类只定"标准"，子类各自"实现"（员工工作案例）
        // 抽象方法：用 abstract 修饰，只有方法声明、没有方法体，必须定义在抽象类中
        // 由来：多个子类都有同一个行为（如"工作"），但每个子类的实现各不相同，
        //       父类写不出统一的实现，就把这个方法定义为抽象方法，交给子类去重写

        System.out.println("=== 案例1：抽象类不能创建对象 ===");
        // Employee e = new Employee("张三", 23, 15000); // 编译报错：抽象类不能实例化
        System.out.println("Employee 是抽象类，不能 new，只能作为父类被继承");

        System.out.println();

        System.out.println("=== 案例2：子类重写抽象方法后，才能创建对象 ===");
        Coder coder = new Coder("张三", 23, 15000);
        coder.work();      // 抽象方法：调用的是子类重写后的版本
        coder.printInfo(); // 普通方法：从父类直接继承使用

        System.out.println();

        Manager manager = new Manager("李四", 24, 18000, 5000);
        manager.work();
        manager.printInfo();

        System.out.println();

        System.out.println("=== 案例3：父类引用指向子类对象（多态统一调用）===");
        // 统一入口：形参写的是父类 Employee，任何子类对象都能传进来
        // 编译时看父类（能不能调用 work()），运行时看子类（执行谁重写后的实现）
        startWork(coder);   // 实际执行 Coder 的 work()
        startWork(manager); // 实际执行 Manager 的 work()

        System.out.println();

        System.out.println("=== 案例4：抽象方法可以带参数、有返回值 ===");
        // calcBonus 是抽象方法，两个子类各自实现了不同的奖金算法
        System.out.println(coder.name + "的奖金：" + coder.calcBonus(2));
        System.out.println(manager.name + "的奖金：" + manager.calcBonus(2));
    }

    // 父类定标准：形参是抽象类 Employee，多态接收任意子类对象
    public static void startWork(Employee e) {
        e.work();
    }
}

// 抽象类：员工（父类）——类中有抽象方法，所以类必须声明为 abstract
abstract class Employee {
    String name;  // 姓名
    int age;      // 年龄
    int salary;   // 工资

    // 抽象类可以有构造方法：不是给自己 new 用的，而是供子类 super(...) 初始化父类成员
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // 抽象方法1："工作"——程序员写代码、项目经理分配任务，父类无法统一实现
    public abstract void work();

    // 抽象方法2："计算奖金"——可以带参数、有返回值，具体算法由子类各自决定
    public abstract double calcBonus(double factor);

    // 抽象类中可以有普通方法：子类直接继承使用，不用重写
    public void printInfo() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，工资：" + salary);
    }
}

// 子类：程序员 Coder——必须重写父类"所有"抽象方法（work 和 calcBonus），少一个都会编译报错
class Coder extends Employee {
    public Coder(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("姓名为" + name + "，年龄为" + age + "，工资为" + salary + "的程序员正在编写代码");
    }

    @Override
    public double calcBonus(double factor) {
        return 10000 * factor; // 程序员奖金算法：10000 × 系数
    }
}

// 子类：项目经理 Manager——有自己的特有成员"奖金"（父类没有）
class Manager extends Employee {
    int bonus; // 特有成员变量：奖金

    public Manager(String name, int age, int salary, int bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("姓名为" + name + "，年龄为" + age + "，工资为" + salary
                + "，奖金为" + bonus + "的项目经理正在分配任务...");
    }

    @Override
    public double calcBonus(double factor) {
        return (10000 + bonus) * factor; // 项目经理奖金算法：（10000 + 奖金）× 系数
    }
}

/*
 * 抽象方法核心要点：
 * 1. 抽象方法：用 abstract 修饰，只有方法声明、没有方法体{}，必须写在抽象类中
 * 2. 有抽象方法的类，一定是抽象类；抽象类不一定有抽象方法
 * 3. 抽象类不能实例化（不能 new），但可以有构造方法，供子类 super(...) 调用
 * 4. 子类必须重写父类的"所有"抽象方法，少一个都不行；否则子类也必须声明为抽象类
 * 5. 抽象方法可以带参数、有返回值（如 calcBonus(double) 返回 double），并不局限于 void
 * 6. 配合多态使用：父类引用（或形参）接收子类对象，运行时执行子类重写后的实现
 * 7. abstract 与以下关键字冲突：private（子类无法重写）、final（不允许重写）、
 *    static（可以类名直接调用，而抽象方法没有方法体，调用没有意义）
 */
