RU text  
Введение в Maven и Spring Boot
### Шаг 1
Создать Spring Boot проект calculator.
### Шаг 2
Подключить модуль Spring Web при создании.
### Шаг 3
Написать 5 методов, которые при вызове из браузера делают следующее:
1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".
2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.
3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.
4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.
5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.
### При выполнении задания важно учесть
Деление на 0 в Java выкидывает ошибку.
Если какой-то из двух параметров (или оба) не поданы, нужно вернуть ошибку.
Контроллер не должен вычислять результат, а только делегировать его вычисление сервису. После получения от него результата контроллер должен сформировать строку и вернуть пользователю в браузер.

ENG text
Introduction to Maven and Spring Boot
### Step 1
Create a Spring Boot calculator project.
### Step 2
Connect the Spring Web module when creating.
### Step 3
Write 5 methods that, when called from the browser, do the following:
1. The method at /calculator should return the greeting “Welcome to the calculator".
2. The method at /calculator/plus?num1=5&num2=5 should add num1 and num2 and return the result in the format “5 + 5 = 10”.
3. The method at /calculator/minus?num1=5&num2=5 should subtract num2 from num1 and return the result in the format “5 − 5 = 0".
4. The method at /calculator/multiply?num1=5&num2=5 should multiply num1 by num2 and return the result in the format “5 * 5 = 25”.
5. The method at /calculator/divide?num1=5&num2=5 should divide num1 by num2 and return the result in the format “5/5 = 1".
### When completing a task, it is important to consider
Dividing by 0 in Java throws an error.
If any of the two parameters (or both) are not supplied, an error must be returned.
The controller should not calculate the result, but only delegate its calculation to the service. After receiving the result from it, the controller must generate a string and return it to the user in the browser.
