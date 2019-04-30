package grammar;

/**
 * 枚举: 与常量值功能相似，比常量值更规范。
 * 1.可以自定义属性、
 */
public enum MyEnum {
    MON("1"), TUE("1");
    private final String key;

    MyEnum(String key) {
        this.key = key;
    }}
