package com.ws.structuralType.adapter.use.u4;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * @Author: 王顺
 * @Date: 2023/5/10 15:43
 * @Version 1.0
 * @Description JDK1.0 中包含一个遍历集合容器的类 Enumeration。JDK2.0 对这个类进行了重构，将它改名为 Iterator 类，并且对它的代码实现做了优化。但是考虑到如果将 Enumeration 直接
 * 从 JDK2.0 中删除，那使用 JDK1.0 的项目如果切换到 JDK2.0，代码就会编译不通过。为了避免这种情况的发生，我们必须把项目中所有使用到 Enumeration 的地方，都修改为使
 * 用 Iterator 才行。单独一个项目做 Enumeration 到 Iterator 的替换，勉强还能接受。但是，使用 Java 开发
 * 的项目太多了，一次 JDK 的升级，导致所有的项目不做代码修改就会编译报错，这显然是不合理的。这就是我们经常所说的不兼容升级。为了做到兼容使用低版本 JDK 的老代码，
 * 我们可以暂时保留 Enumeration 类，并将其实现替换为直接调用 Itertor。代码示例如下所示：
 */
public class Collections {
    public static Enumeration emumeration(final Collection c) {
        Iterator i = c.iterator();
        return new Enumeration() {
            /**
             * @return
             */
            @Override
            public boolean hasMoreElements() {
                return i.hasNext();
            }

            /**
             * @return
             */
            @Override
            public Object nextElement() {
                return i.next();
            }
        };

    }
}