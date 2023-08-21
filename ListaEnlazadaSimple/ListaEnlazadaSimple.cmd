@echo off
chcp 65001
cls
IF EXIST .\ListaEnlazadaSimple.jar (
  java -jar .\ListaEnlazadaSimple.jar
) ELSE (
  echo Flaco, el archivo “ListaEnlazadaSimple.jar” no se encuentra. Búscalo y ponlo en el lugar.
  pause
)