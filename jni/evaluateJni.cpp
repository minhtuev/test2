#include "evaluateMatlab.cpp"
//#include <iostream>
#include <jni.h>

//using namespace std;

jint Java_com_example_test3_MainActivity_evaluateJni(JNIEnv* env, jobject thiz, jint a, jint b)
{
    return evaluateMatlab(a, b);
}

//int main()
//{
//    //cout << evaluateJni(1, 3) << endl;
//
//    return 0;
//}