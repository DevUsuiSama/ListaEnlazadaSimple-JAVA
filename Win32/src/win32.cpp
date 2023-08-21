/*
 * Created on Sat Feb 18 2023
 *
 * Copyright (c) 2023 UsuiSama
 */
#include <Console.hpp>

JNIEXPORT void JNICALL
Java_Console_setTitle(JNIEnv *env, jclass c, jstring s)
{
    const char *str = env->GetStringUTFChars(s, NULL);
    SetConsoleTitle(str);
    env->ReleaseStringUTFChars(s, str);
}

JNIEXPORT void JNICALL
Java_Console_command(JNIEnv *env, jclass c, jstring s)
{
    const char *str = env->GetStringUTFChars(s, NULL);
    system(str);
    env->ReleaseStringUTFChars(s, str);
}