# qa_guru_4_10_owner

### Конфигурация WEB тестов c библиотекой Owner

Пример конфигурации для WEB тестов:

Созданы два файла c параметрами браузера:

1. Для локального запуска на chrome - local.properties

2. Для удаленного запуска на selenoid - remote.properties

Файлы конфигрурации src/test/java/config

Реализована возможность с помощью одной системной переменной переключать запуск с локального на удаленный:
````
 -Denv=local/remote
````