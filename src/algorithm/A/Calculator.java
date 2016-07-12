package algorithm.A;

import java.util.Stack;

public class Calculator {

	public static void main(String[] args) {
		String strInfix = "(10+20*30+40+50-60*70/80)";	// ������
		String strPostfix = toPostFix2(strInfix);		// ������

		Stack<String> stack = new Stack<>();		// ������ ����ϱ� ���� ����
		String[] calList = strPostfix.split(" ");		// ���� ����Ʈ
		for (String string : calList) {
			int num1, num2;
			switch (string) {
			case "+":
				num1 = Integer.valueOf(stack.pop());
				num2 = Integer.valueOf(stack.pop());
				stack.push(String.valueOf(num1+num2));
				break;
			case "-":
				num1 = Integer.valueOf(stack.pop());
				num2 = Integer.valueOf(stack.pop());
				stack.push(String.valueOf(num2-num1));
				break;
			case "*":
				num1 = Integer.valueOf(stack.pop());
				num2 = Integer.valueOf(stack.pop());
				stack.push(String.valueOf(num1*num2));
				break;
			case "/":
				num1 = Integer.valueOf(stack.pop());
				num2 = Integer.valueOf(stack.pop());
				stack.push(String.valueOf(num2/num1));
				break;
			default:
				stack.push(string);
				break;
			}
		}
		System.out.println(stack.size());
		System.out.println(stack.pop());
	}

	// ��ȣ�� �׻� �����ִ� ������ ���������� ��ȯ�� �� ���
	private static String toPostFix1(String strInfix) {
		String strPostFix = "";
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < strInfix.length(); i++) {
			char ch = strInfix.charAt(i);

			if (ch == ')') { // ��ȣ �ݱ⸦ ������ �����ڸ� ��
				strPostFix += stack.pop();
				strPostFix += ' ';

			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				stack.push(ch);

			} else if (Character.isDigit(ch)) {
				do {
					strPostFix += ch;
					i++;
					ch = strInfix.charAt(i);
				} while (Character.isDigit(ch));
				strPostFix += ' ';
				i--;
			}

		}
		return strPostFix;
	}

	// ��ȣ�� ������� ������ �켱������ �������� �˾Ƽ� �� ���������� ��ȯ���ִ� �޼���
	private static String toPostFix2(String strInfix) {
		String strPostfix = "";
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < strInfix.length(); i++) {
			char c = strInfix.charAt(i);

			if (c == '(') {
				stack.push(c);

			} else if (c == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					strPostfix += stack.pop();
					strPostfix += ' ';
				}
				stack.pop();

			} else if (c == '+' || c == '-' || c == '*' || c == '/') {
				while (!stack.isEmpty() && getPrecedence(stack.peek()) >= getPrecedence(c)) {
					strPostfix += stack.pop();
					strPostfix += ' ';
				}
				stack.push(c);

			} else if (Character.isDigit(c)) {
				do {
					strPostfix += c;
					c = strInfix.charAt(++i);
				} while (Character.isDigit(c));
				strPostfix += ' ';
				i--;

			}
		}

		while (!stack.isEmpty()) {
			strPostfix += stack.pop();
			strPostfix += ' ';
		}

		return strPostfix;
	}

	private static int getPrecedence(Character c) {
		if (c == '(' || c == ')') {
			return 1;
		} else if (c == '+' || c == '-') {
			return 2;
		} else if (c == '*' || c == '/') {
			return 3;
		}
		return 0;
	}
}
