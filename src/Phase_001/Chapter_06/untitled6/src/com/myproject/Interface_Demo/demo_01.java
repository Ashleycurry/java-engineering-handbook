package com.myproject.Interface_Demo;

public class demo_01 {
    public static void main(String[] args) {
        // 案例：接口——对行为的抽象，为程序制定"规则"（支付规则案例）
        // 接口：用 interface 关键字定义；类用 implements 实现接口（实现关系）
        // 思想：接口只声明"能做什么"（规则），不关心"怎么做"（由实现类负责）
        // 对照：抽象类是对"事物"做抽象（是什么），接口是对"行为"做抽象（能干什么）

        System.out.println("=== 案例1：接口不能实例化，实现类重写抽象方法后才能使用 ===");
        // Pay pay = new Pay(); // 编译报错：接口不能实例化
        WeChatPay wechat = new WeChatPay();
        wechat.pay(66.6); // 调用实现类重写后的 pay()

        System.out.println();

        System.out.println("=== 案例2：接口多态——接口作形参，统一处理所有支付方式 ===");
        // 形参写接口 Pay，任何实现类对象都能传进来（对象多态）
        paySomething(new WeChatPay());
        paySomething(new BankCardPay());
        paySomething(new SmartPhone());

        System.out.println();

        System.out.println("=== 案例3：继承一个类的同时实现多个接口 ===");
        SmartPhone phone = new SmartPhone();
        System.out.println("品牌（继承自父类 Device）：" + phone.brand);
        phone.pay(9.9);    // pay() 来自 Pay 接口
        phone.takePhoto(); // takePhoto() 来自 Camera 接口
        Pay p = phone;     // 同一个对象，也可以用某个接口类型的引用指向它
        p.pay(8.8);        // 通过接口引用调用（接口多态）

        System.out.println();

        System.out.println("=== 案例4：接口中的成员特点 ===");
        // 成员变量默认是常量 public static final（修饰符可以省略不写）
        System.out.println("Pay.VERSION = " + Pay.VERSION);
        // Pay.VERSION = "2.0"; // 编译报错：接口中的变量是常量（final），不能修改

        System.out.println();

        System.out.println("=== 案例5：JDK8 新特性——默认方法与静态方法 ===");
        // 默认方法：不强制重写，实现类对象可以直接调用（解决了接口升级问题）
        wechat.log(); // WeChatPay 没有重写 log()，用的是接口里的默认实现
        // 静态方法：只能用"接口名"调用，不能通过实现类名或对象名调用
        Pay.check();
    }

    // 接口多态：形参是接口类型，可以接收任意实现类对象；运行时执行实现类重写后的 pay()
    public static void paySomething(Pay pay) {
        pay.pay(99.9);
    }
}

// 接口：支付规则——声明所有支付方式都必须具备的行为
interface Pay {
    // 成员变量：只能是常量，默认 public static final（必须赋初始值）
    String VERSION = "1.0"; // 等价于 public static final String VERSION = "1.0";

    // 成员方法：默认 public abstract 抽象方法（没有方法体）
    void pay(double money); // 等价于 public abstract void pay(double money);

    // JDK8 默认方法：用 default 修饰、有方法体，实现类不强制重写
    default void log() {
        System.out.println("[日志]支付接口被调用了一次");
    }

    // JDK8 静态方法：用 static 修饰，只能通过接口名调用（Pay.check()）
    static void check() {
        System.out.println("支付环境检查通过");
    }
}

// 接口：拍照规则（用于演示"一个类实现多个接口"）
interface Camera {
    void takePhoto();
}

// 父类：设备（用于演示"继承一个类的同时实现多个接口"）
class Device {
    String brand = "iSelf"; // 品牌
}

// 实现类：微信支付——重写接口中所有抽象方法后，才能创建对象
class WeChatPay implements Pay {
    @Override
    public void pay(double money) {
        System.out.println("使用微信支付：" + money + " 元");
    }
}

// 实现类：银行卡支付
class BankCardPay implements Pay {
    @Override
    public void pay(double money) {
        System.out.println("使用银行卡支付：" + money + " 元");
    }
}

// 继承一个类的同时实现多个接口：SmartPhone 既"可支付"又"可拍照"
class SmartPhone extends Device implements Pay, Camera {
    @Override
    public void pay(double money) {
        System.out.println("手机 NFC 支付：" + money + " 元");
    }

    @Override
    public void takePhoto() {
        System.out.println("咔嚓，拍照成功");
    }
}

/*
 * 接口核心要点：
 * 1. 接口用 interface 定义，类用 implements 实现（实现关系）；接口不能实例化
 * 2. 成员特点：
 *    - 成员变量：只能是常量，默认 public static final；
 *    - 构造方法：没有（所以不能 new）；
 *    - 成员方法：默认 public abstract（JDK8 后有默认方法/静态方法，JDK9 后有私有方法）
 * 3. 各种关系：类与类单继承；类与接口可多实现（也可以继承一个类的同时实现多个接口）；
 *    接口与接口之间是继承关系，可以单继承也可以多继承
 * 4. 实现类：要么重写接口中所有的抽象方法，要么自己也是抽象类
 * 5. JDK8 默认方法 default：有方法体、不强制重写（重写时去掉 default 关键字），
 *    用于接口升级时不影响已有的实现类；JDK8 静态方法 static：只能用接口名调用
 * 6. 接口 + 多态：接口作形参/引用统一处理所有实现类，扩展时只需新增实现类、不用改调用代码
 */
