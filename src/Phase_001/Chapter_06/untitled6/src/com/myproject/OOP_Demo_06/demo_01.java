package com.myproject.OOP_Demo_06;

public class demo_01 {
    public static void main(String[] args) {
        // 案例：多态——同一个行为具有多个不同表现形式或形态的能力
        // 三个前提（缺一不可）：
        //   1. 有继承/实现关系；2. 有方法重写；3. 有父类引用指向子类对象

        System.out.println("=== 案例1：多态的基本用法（三个前提）===");
        // 父类引用指向子类对象，就是向上转型（自动完成）
        Animal a1 = new Dog(); // 左边父类，右边子类对象
        Animal a2 = new Cat();
        a1.eat(); // 编译看左边（Animal 里有 eat()），执行看右边（执行 Dog 重写后的 eat()）
        a2.eat();

        System.out.println();

        System.out.println("=== 案例2：多态的成员访问特点 ===");
        Fu f = new Zi();
        // 成员变量：编译看左边，执行也看左边（访问的是父类的变量）
        System.out.println("f.num = " + f.num);                    // 10：父类的变量
        System.out.println("(new Zi()).num = " + (new Zi()).num);  // 20：直接拿子类对象才是子类的变量
        // 成员方法：编译看左边，执行看右边（因为方法被重写了）
        f.method(); // 执行 Zi 重写后的 method()
        // 静态成员：编译看父类，运行也看父类（静态方法不参与重写）
        f.show(); // 执行 Fu 的静态方法

        System.out.println();

        System.out.println("=== 案例3：多态的好处——形参写父类，统一接收所有子类对象 ===");
        // 对象多态：形参是 Animal 类型，Dog、Cat 对象都能传进来
        useAnimal(new Dog());
        useAnimal(new Cat());
        // 扩展性好：以后新增 Pig 等子类，useAnimal 方法一行都不用改

        System.out.println();

        System.out.println("=== 案例4：多态的弊端——不能使用子类特有的成员 ===");
        Animal a3 = new Dog();
        a3.eat(); // 能调用父类里定义过的 eat()
        // a3.watchDoor(); // 编译报错：编译时看左边，Animal 里没有 watchDoor()

        System.out.println();

        System.out.println("=== 案例5：向下转型 + instanceof（用回子类特有的成员）===");
        // 向下转型：把父类引用转回子类类型，必须强制转换
        if (a3 instanceof Dog) { // 先判断：a3 指向的确实是 Dog 对象
            Dog d = (Dog) a3;
            d.watchDoor(); // 转型后就能调用 Dog 的特有方法了
        }
        // 如果不加判断、转错类型，运行时会抛 ClassCastException（类型转换异常）：
        // Cat c = (Cat) a3; // 报错：Dog 对象不能转成 Cat
    }

    // 多态的好处：形参写父类 Animal，任何子类对象都能传入（对象多态）
    public static void useAnimal(Animal animal) {
        animal.eat(); // 同一行为（eat）有多个不同表现（行为多态）
    }
}

// 父类：动物
class Animal {
    public void eat() {
        System.out.println("动物吃东西");
    }
}

// 子类：狗——重写 eat()
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    // 子类特有方法（多态下用不了，转型后才能用）
    public void watchDoor() {
        System.out.println("狗在看门");
    }
}

// 子类：猫——重写 eat()
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃小鱼干");
    }
}

// 以下两个类用于演示成员访问特点（编译看左、执行看右）
class Fu {
    int num = 10; // 父类成员变量

    public void method() {
        System.out.println("父类的 method 方法");
    }

    public static void show() {
        System.out.println("父类的静态 show 方法");
    }
}

class Zi extends Fu {
    int num = 20; // 子类的同名成员变量（多态下通过父类引用访问不到）

    @Override
    public void method() {
        System.out.println("子类重写后的 method 方法");
    }

    public static void show() {
        System.out.println("子类的静态 show 方法");
    }
}

/*
 * 多态核心要点：
 * 1. 三个前提（缺一不可）：有继承/实现关系、有方法重写、有父类引用指向子类对象
 * 2. 成员访问口诀：
 *    - 成员变量：编译看左边，执行也看左边（父类）
 *    - 成员方法：编译看左边，执行看右边（子类）——因为方法被重写了
 *    - 静态成员：编译看父类，运行看父类
 * 3. 好处：扩展性高。对象多态（形参写父类，接收任意子类对象）+ 行为多态（同一行为不同表现）
 * 4. 弊端：不能使用子类特有的成员（编译看左边，父类里没有就编译报错）
 * 5. 转型：向上转型自动完成（Fu f = new Zi()）；向下转型必须强制（Zi z = (Zi)f），
 *    转错类型会抛 ClassCastException，推荐先用 instanceof 判断再转
 */
