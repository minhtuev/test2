#include "evaluateMatlab.cpp"
//#include <iostream>
#include <jni.h>

//using namespace std;

#ifdef __cplusplus
extern "C"
{
#endif

jint Java_com_example_test3_MainActivity_evaluateThis(JNIEnv* env, jobject thiz, jint a, jint b)
{
    return evaluateMatlab(a, b);
}

#ifdef __cplusplus
}
#endif

//int main()
//{
//    //cout << evaluateJni(1, 3) << endl;
//
//    return 0;
//}
