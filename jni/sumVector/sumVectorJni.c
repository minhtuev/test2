#include "sumVector.c"
#include <jni.h>

void Java_com_example3_test3_MainActivity_sumVectorJni(const jint a[10], const jint b[10], jint c[10])
{
	return sumVector(a, b, c);
}
