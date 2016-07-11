package algorithm.A;

import java.util.Stack;

public class Calculator {

	public static void main(String[] args) {
		String strInfix = "(10+20*30+40+50-60*70/80)";	// 중위식
		String strPostfix = toPostFix2(strInfix);		// 후위식

		Stack<String> stack = new Stack<>();		// 수식을 계산하기 위한 스택
		String[] calList = strPostfix.split(" ");		// 수식 리스트
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

	// 괄호가 항상 쳐져있는 수식을 후위식으로 변환할 때 사용
	private static String toPostFix1(String strInfix) {
		String strPostFix = "";
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < strInfix.length(); i++) {
			char ch = strInfix.charAt(i);

			if (ch == ')') { // 괄호 닫기를 만나면 연산자를 팝
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

	// 괄호에 상관없고 연산자 우선순위를 따져가며 알아서 잘 후위식으로 변환해주는 메서드
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
