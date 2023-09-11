# ☕️ Лабораторные работы по Java за третий семестр

Здесь собраны решения всех практических заданий за третий семестр по Java.

## Про структуру проекта

Исходный код решений вы можете найти здесь: [src/main/ru/mirea/wokrshop](https://github.com/burenotti/java-workshop/tree/master/src/main/java/ru/mirea/workshop).
Каждая практика лежит в отдельном пакете с названием wsN, где N - номер практики.

Вместо тестовых классов с выводом, для заданий написаны unit-тесты (потому что я люблю, когда много зеленых галочек ✅). 
Их вы можете найти в [src/test/ru/mirea/wokrshop](https://github.com/burenotti/java-workshop/tree/master/src/test/java/ru/mirea/workshop).

## Как отсюда че-то скачать?

[Тыкать сюда](https://github.com/burenotti/java-workshop/archive/refs/heads/master.zip)

## Сборка
**Требования**:
  - maven 
  - java 19
  - git-клиент

Склонируйте проект:

```shell
git clone https://github.com/burenotti/java-workshop
```

Далее перейдите в папку с проектом и запустите сборку:

```shell
cd java-workshop
mvn build
```

Для запуска тестов используйте:
```shell
mvn test
```
