package com.myproject.Interface_Demo;

public class demo_02 {
    public static void main(String[] args) {
        // 案例：接口的新特性（JDK8 默认方法/静态方法 + JDK9 私有方法）
        // 背景：接口升级问题——Version1.0 上线后，V2.0 想给接口"加功能"，
        //       如果直接加抽象方法，所有实现类都会编译报错（必须重写新加的抽象方法）
        // JDK8 的解决方案：默认方法 default + 静态方法 static；JDK9 又加入了：私有方法 private

        System.out.println("=== 案例1：JDK8 默认方法——不强制重写（解决接口升级问题）===");
        // MusicPlayer 只重写了抽象方法 play()，没有重写 pause()
        // 相当于"V1.0 时就写好的实现类"，接口升级后一行代码都不用改，照样能调用新方法
        MusicPlayer music = new MusicPlayer();
        music.play();
        music.pause(); // 调用的是接口里的默认实现

        System.out.println();

        System.out.println("=== 案例2：默认方法也可以被重写（重写时去掉 default 关键字）===");
        VideoPlayer video = new VideoPlayer();
        video.play();
        video.pause(); // 调用的是 VideoPlayer 重写后的版本

        System.out.println();

        System.out.println("=== 案例3：JDK8 静态方法——只能通过接口名调用 ===");
        Player.config(); // 正确：接口名.静态方法()
        // music.config();       // 编译报错：不能通过对象名调用
        // MusicPlayer.config(); // 编译报错：不能通过实现类名调用

        System.out.println();

        System.out.println("=== 案例4：JDK9 私有方法——接口内部的代码复用 ===");
        music.start();
        music.end();
        // music.log("xx"); // 编译报错：private 方法只能给接口内部的方法使用

        System.out.println();

        System.out.println("=== 案例5：多个接口有相同签名的默认方法时，必须重写消除冲突 ===");
        SuperMan superMan = new SuperMan();
        superMan.speak();
    }
}

// 接口：播放器——用"从 V1.0 升级到 V2.0"来模拟接口升级问题
interface Player {
    // V1.0 就有的抽象方法：所有实现类都必须重写
    void play();

    // V2.0 新增的默认方法：有方法体、不强制重写（否则所有老实现类都要跟着改代码）
    default void pause() {
        System.out.println("暂停播放（接口的默认实现）");
    }

    // V2.0 新增的默认方法（给案例4用）：start/end 都要打日志，代码重复
    default void start() {
        log("开始播放");
    }

    default void end() {
        log("结束播放");
    }

    // JDK9 私有方法：把重复的日志代码抽出来，只给接口内部的方法（start/end）使用
    private void log(String msg) {
        System.out.println("[日志]" + msg);
    }

    // JDK8 静态方法：只能通过接口名调用（Player.config()）
    static void config() {
        System.out.println("播放器配置完成（由接口名直接调用）");
    }
}

// 实现类：音乐播放器——模拟"V1.0 时就上线"的老代码，只重写了抽象方法 play()
class MusicPlayer implements Player {
    @Override
    public void play() {
        System.out.println("音乐播放器：开始播放音乐");
    }
}

// 实现类：视频播放器——重写了 pause()，定制自己的暂停逻辑（重写时去掉 default）
class VideoPlayer implements Player {
    @Override
    public void play() {
        System.out.println("视频播放器：开始播放视频");
    }

    @Override
    public void pause() {
        System.out.println("视频播放器：暂停并记录播放进度");
    }
}

// 案例5用：两个接口里有签名相同的默认方法
interface SpeakEnglish {
    default void speak() {
        System.out.println("说英语");
    }
}

interface SpeakChinese {
    default void speak() {
        System.out.println("说中文");
    }
}

// 两个接口的默认方法冲突：实现类必须重写 speak()，否则编译报错（不知道该用哪个默认实现）
class SuperMan implements SpeakEnglish, SpeakChinese {
    @Override
    public void speak() {
        SpeakEnglish.super.speak(); // 想保留某个接口的默认实现：接口名.super.方法名()
        SpeakChinese.super.speak();
        System.out.println("超级英雄：两门语言都会说");
    }
}

/*
 * 接口新特性核心要点：
 * 1. JDK8 默认方法 default：有方法体、不强制重写（解决接口升级问题）；
 *    可以被重写，重写时去掉 default 关键字；public 可以省略，default 不能省略
 * 2. JDK8 静态方法 static：只能通过"接口名.方法名()"调用，
 *    不能通过实现类名或对象名调用；public 可以省略，static 不能省略
 * 3. JDK9 私有方法 private：只能给接口内部的方法调用（复用代码），
 *    实现类看不到也调不了；可以写成 private（实例）或 private static
 * 4. 实现多个接口时，多个接口中存在相同签名的默认方法，实现类必须重写消除冲突；
 *    想调用某个接口原来的默认实现，用"接口名.super.方法名()"
 * 5. 新旧规则不冲突：接口里原有的抽象方法仍然必须被实现类全部重写
 * 6. 版本对照：JDK8 之前接口只能写常量和抽象方法；JDK8 加入默认方法、静态方法；
 *    JDK9 加入私有方法
 */
