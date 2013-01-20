#include "evaluateProduct.c"
#include <jni.h>

jint Java_com_example_test3_MainActivity_evaluateProduct(JNIEnv* env, jobject thiz, jint a, jint b)
{
    return evaluateProduct(a, b);
}
