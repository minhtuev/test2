#include "evaluateMatlab.cpp"
#include <jni.h>

// the JNI code for the matlab code evaluateMatlab.cpp

jint Java_com_example_test3_MainActivity_evaluateThis(JNIEnv* env, jobject thiz, jint a, jint b)
{
    return evaluateMatlab(a, b);
}
