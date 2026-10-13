package com.myproject.Equals_Demo;

import java.util.Objects; // 案例5用到 Objects 工具类

public class demo_01 {
    public static void main(String[] args) {
        // 案例：equals 方法——比较两个对象是否"相同"
        // equals 来自 Object 类（默认比较地址值），父类定义它的意义就是留给子类重写，
        // 由子类自己定制比较规则（比如"姓名和年龄都一样，就算同一个人"）

        System.out.println("=== 案例1：== 比较基本数据类型（比的是数据值）===");
        int a = 10;
        int b = 10;
        int c = 20;
        System.out.println("a == b：" + (a == b)); // true：值都是 10
        System.out.println("a == c：" + (a == c)); // false：值不同

        System.out.println();

        System.out.println("=== 案例2：引用类型用 == 比较（比的是地址值）===");
        Person p1 = new Person("张三", 23);
        Person p2 = new Person("张三", 23);
        // new 了两次 → 两个不同的对象（地址不同），即使内容一模一样
        System.out.println("p1 == p2：" + (p1 == p2)); // false

        System.out.println();

        System.out.println("=== 案例3：equals 默认比较地址值（没重写时）===");
        Cat c1 = new Cat("咪咪");
        Cat c2 = new Cat("咪咪");
        System.out.println("c1 == c2：" + (c1 == c2));           // false：地址不同
        System.out.println("c1.equals(c2)：" + c1.equals(c2)); // false：Cat 没重写 equals，默认还是比地址！
        System.out.println("c1.equals(c1)：" + c1.equals(c1)); // true：自己和自己比，地址相同

        System.out.println();

        System.out.println("=== 案例4：重写 equals 后，按内容比较 ===");
        // p1、p2 就是案例2里的两个对象：姓名年龄完全相同，但地址不同
        System.out.println("p1.equals(p2)：" + p1.equals(p2)); // true：Person 重写后按内容比较
        Person p3 = new Person("李四", 23);
        System.out.println("p1.equals(p3)：" + p1.equals(p3)); // false：姓名不同

        System.out.println();

        System.out.println("=== 案例5：Objects.equals——先判 null，避免空指针异常 ===");
        Person p4 = null;
        // System.out.println(p4.equals(p1)); // 运行报错：NullPointerException（空指针异常）
        System.out.println("Objects.equals(p4, p1)：" + Objects.equals(p4, p1)); // false，不会报错
        System.out.println("Objects.equals(p1, p2)：" + Objects.equals(p1, p2)); // true：底层还是调用 p1 重写后的 equals
    }
}

// 人：重写了 equals，定制比较规则——姓名和年龄都相同就认为是同一个人
class Person {
    String name; // 姓名
    int age;     // 年龄

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写 equals 的典型四步：
    // （IDEA 中可以用 Alt + Insert → equals() and hashCode() 自动生成）
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 1. 地址相同（就是同一个对象），直接返回 true
        if (o == null || getClass() != o.getClass()) return false; // 2. 对方为 null 或类型不同，直接返回 false
        Person person = (Person) o; // 3. 向下转型：形参是 Object 类型，转成 Person 才能取出属性
        return age == person.age && Objects.equals(name, person.name); // 4. 逐个比较属性内容
    }
}

// 猫：没有重写 equals，使用 Object 的默认版本（比较地址值）
class Cat {
    String name; // 名字

    public Cat(String name) {
        this.name = name;
    }
}

/*
 * equals 核心要点：
 * 1. equals 来自 Object 类，默认比较地址值；父类定义它的意义就是留给子类重写定制比较规则
 * 2. == 和 equals 的区别（高频面试点）：
 *    - ==：基本数据类型比数据值；引用数据类型比地址值
 *    - equals：默认比地址值，重写后可按内容比较
 * 3. 重写 equals 的典型四步：地址相同直接 true → 对方为 null 或类型不同直接 false →
 *    向下转型 → 逐个比较属性内容
 * 4. Objects.equals(a, b)：工具方法，源码为 (a == b) || (a != null && a.equals(b))，
 *    先判 null 再调 equals，能避免空指针异常；比较规则仍由对象的 equals 决定
 * 5. IDEA 快捷键：Alt + Insert → equals() and hashCode() 自动生成
 */
