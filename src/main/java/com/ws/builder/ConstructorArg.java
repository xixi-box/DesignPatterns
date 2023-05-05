package com.ws.builder;

/**
 * @Author: 王顺
 * @Date: 2023/5/5 16:52
 * @Version 1.0
 */
public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    public ConstructorArg(Builder builder) {
        this.isRef = builder.isRef;
        this.type = builder.type;
        this.arg = builder.arg;
    }

    // TODO: 待完善...
    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFAULT_MAX_IDLE = 8;
        private static final int DEFAULT_MIN_IDLE = 0;
        private boolean isRef;
        private Class type;
        private Object arg;

        public ConstructorArg build() {
            if (isRef) {
                arg = true;
                type = String.class;
            } else {
                arg = false;
                type = Integer.class;
            }
            return new ConstructorArg(this);
        }

        public void setRef(boolean ref) {
            isRef = ref;
        }

        public void setType(Class type) {
            this.type = type;
        }

        public void setArg(Object arg) {
            this.arg = arg;
        }

        public boolean isRef() {
            return isRef;
        }

        public Class getType() {
            return type;
        }

        public Object getArg() {
            return arg;
        }
    }
}