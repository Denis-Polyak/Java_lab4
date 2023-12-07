# Java_lab4
1. У середовищі IntelliJ IDEA створити новий проект, що містить один головний
клас Main.
2. Створити інтерфейс, що містить описання методів для введення масивів з
файлів за зразком:
package lk2.io;
import java.io.File;
public interface DoubleArrayReader {
 double[] readOneDimensionalArray(File file);
 double[] readOneDimensionalArray(String fileName);

 double[][] readTwoDimensionalArray(File file);
 double[][] readTwoDimensionalArray(String fileName);
}
3. Створити інтерфейс, що містить описання методів опрацювання масивів
згідно пунктів завдання.
package lk2.logic;
public interface ArrayProcessor {
 double calculate(double[] array);
 double calculate(double[][] array);
 void processArray(double[] array);
 void processArray(double[][] array);
}
4. Додати до проекту два нових класи, що реалізують описані інтерфейси,
виконуючи завдання 4.1 та 4.2.
5. Створити тестові класи з методами для тестування методів класів з п.4.
