// Учитывая строку s, содержащую только символы '(', ')', '{', и , определите '}', допустима ли входная строка.'['']'

// Входная строка действительна, если:

// Открытые скобки должны быть закрыты однотипными скобками.
// Открытые скобки должны быть закрыты в правильном порядке.
// Каждой закрывающей скобке соответствует открытая скобка того же типа.

// Пример 1:

// Ввод: s = "()"
//  Вывод: правда
// Пример 2:

// Ввод: s = "()[]{}"
//  Вывод: правда
// Пример 3:

// Ввод: s = "(]"
//  Вывод: ложь

// Ограничения:

// 1 <= s.length <= 104
// sсостоит только из скобок '()[]{}'.

import java.util.Stack;

public class home_work_02 {
    public static void main(String[] args) {
        String s1 = "()";
        System.out.println(isValid(s1)); // Output: true

        String s2 = "()[]{}";
        System.out.println(isValid(s2)); // Output: true

        String s3 = "(]";
        System.out.println(isValid(s3)); // Output: false
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
