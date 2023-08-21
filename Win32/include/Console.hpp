#ifndef _Included_Console
#define _Included_Console

#include <windows.h>
#include <stdio.h>
#include <conio.h>
#include <jni.h>

#ifdef __cplusplus
extern "C"
{
#endif

  JNIEXPORT void JNICALL
  Java_Console_setTitle(JNIEnv *, jclass, jstring);
  JNIEXPORT void JNICALL
  Java_Console_command(JNIEnv *, jclass, jstring);

#ifdef __cplusplus
}
#endif

#endif // !_Included_Console