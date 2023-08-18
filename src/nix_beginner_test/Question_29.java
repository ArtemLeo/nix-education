package nix_beginner_test;

public class Question_29 {

    /*
      Как параметры передаются в POST запросе?

      1) в header
      2) в url
      3) в типе
      4) в схеме
      5) в теле ✔

      Параметры в POST запросе передаются в теле HTTP запроса, а не в URL, как это происходит в GET запросе.
      По сравнению с GET запросами, POST запросы чаще используются для отправки более крупных и сложных данных, таких как формы,
      загрузки файлов и другие типы контента.

      POST /path/to/resource HTTP/1.1
      Host: example.com
      Content-Type: application/x-www-form-urlencoded
      param1=value1&param2=value2&param3=value3

    */
}
