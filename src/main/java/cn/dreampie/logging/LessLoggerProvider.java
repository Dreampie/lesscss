package cn.dreampie.logging;

interface LessLoggerProvider {
    LessLogger getLogger(Class<?> clazz);
}
