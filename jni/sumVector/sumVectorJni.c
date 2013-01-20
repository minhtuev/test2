#include "sumVector.c"
#include <jni.h>

// JNI interface for Matlab procedure to compute the sum of two vectors

jint Java_com_example_test3_MainActivity_sumVector(JNIEnv* env, jobject thiz, jintArray a, jintArray b, jintArray c)
{
	// initializations, declarations, etc
    jint *c_array;
    jint *b_array;
    jint *a_array;

    jint i = 0;

    // get a pointer to the array
    c_array = (*env)->GetIntArrayElements(env, c, NULL);
    b_array = (*env)->GetIntArrayElements(env, b, NULL);
    a_array = (*env)->GetIntArrayElements(env, a, NULL);

    // do some exception checking
    if (c_array == NULL) {
        return -1; /* exception occurred */
    }

    // do stuff to the array
//    for (i=0; i<10; i++) {
//        c_array[i] = b_array[i] + a_array[i];
//    }

    sumVector(a_array, b_array, c_array);

    // release the memory so java can have it again
//    (*env)->ReleaseIntArrayElements(env, c, c_array, 0);

//    return sumVector(a, b, c);

	return 42;
}

jint Java_com_example_test3_MainActivity_testSumVector(JNIEnv* env, jobject thiz, jint a, jint b)
{
	// initializations, declarations, etc
//    jint *c_array;
//    jint i = 0;
//
//    // get a pointer to the array
//    c_array = (*env)->GetIntArrayElements(env, c, NULL);
//
//    // do some exception checking
//    if (c_array == NULL) {
//        return -1; /* exception occurred */
//    }
//
//    // do stuff to the array
//    for (i=0; i<10; i++) {
//        c_array[i] = i;
//    }
//
//    // release the memory so java can have it again
//    (*env)->ReleaseIntArrayElements(env, c, c_array, 0);

    //return sumVector(a, b, c);

	return a - b;
}
