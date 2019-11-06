# Android Tool Bundle


## 依赖添加

1. 在项目的 `build.gradle` 文件中添加仓库:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

2. 在模块的 `build.gradle` 文件中引入依赖:

```
// 可以在 Release 页面中查看最新版本并替换版本号
implementation 'com.github.oswayne:AndroidToolBundle:1.0.1'
```


## 快速使用指南


### Preferences 工具

用于替代 Android 自身的 SharedPreferences, 其依赖与 MMKV 框架。Preferences 的优势在于读写速度快，简单上手使用。

1. 在程序启动时初始化，建议在 Application 类中执行

```Kotlin
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Preferences.initialize(this)
    }
}
```

2. Preferences 提供类 `write` 和 `read` 两个方法用于操作数据，并且支持常用数据类型:

```Kotlin
Preferences.write("dKey", "dValue")
println(Preferences.read("dKey","null"))
```


### Time 工具

便捷地获取时间，如获取当前季度、分钟、年、月、日等等