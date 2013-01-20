#include "sumVector.c"
//#include <jni.h>
#include <iostream>

using namespace std;

/*void Java_com_example3_test3_MainActivity_sumVectorJni(const jint a[10], const jint b[10], jint c[10])
{
	return sumVector(a, b, c);
}*/

void sumVectorJni(const int a[10], const int b[10], int c[10])
{
    return sumVector(a, b, c);
}

int main()
{
    int a [10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int b [10] = {2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
    int c[10];

    sumVectorJni(a, b, c);

    for (int i = 0; i < 10; i++)
    {
        cout << c[i] << " ";
    }

    cout << endl;

    return 0;
}
