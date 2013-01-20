/*
 * sumVector.c
 *
 * Code generation for function 'sumVector'
 *
 * C source code generated on: Sat Jan 19 02:52:38 2013
 *
 */

/* Include files */
#include "rt_nonfinite.h"
#include "sumVector.h"

/* Type Definitions */

/* Named Constants */

/* Variable Declarations */

/* Variable Definitions */

/* Function Declarations */

/* Function Definitions */

/*
 * function c = sumVector(a, b)
 */
void sumVector(const int32_T a[10], const int32_T b[10], int32_T c[10])
{
  int32_T i0;
  int32_T q0;
  int32_T q1;
  int32_T qY;

  /* 'sumVector:2' c = a + b */
  for (i0 = 0; i0 < 10; i0++) {
    q0 = a[i0];
    q1 = b[i0];
    qY = q0 * q1;
    if ((q0 < 0) && ((q1 < 0) && (qY >= 0))) {
      qY = MIN_int32_T;
    } else {
      if ((q0 > 0) && ((q1 > 0) && (qY <= 0))) {
        qY = MAX_int32_T;
      }
    }

    c[i0] = qY;
  }
}

/* End of code generation (sumVector.c) */
