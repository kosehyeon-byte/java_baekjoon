package java251104;

import java.io.*;
import java.util.*;

public class No28279 {
	public static class MyDeque<T> {

		// 노드 정의
		private static class Node<T> {
			T data;
			Node<T> prev;
			Node<T> next;

			Node(T data) {
				this.data = data;
			}
		}

		private Node<T> front; // 덱의 앞쪽
		private Node<T> rear; // 덱의 뒤쪽
		private int size;

		// 앞에 삽입
		public void addFirst(T data) {
			Node<T> newNode = new Node<>(data);
			if (isEmpty()) {
				front = rear = newNode;
			} else {
				newNode.next = front;
				front.prev = newNode;
				front = newNode;
			}
			size++;
		}

		// 뒤에 삽입
		public void addLast(T data) {
			Node<T> newNode = new Node<>(data);
			if (isEmpty()) {
				front = rear = newNode;
			} else {
				rear.next = newNode;
				newNode.prev = rear;
				rear = newNode;
			}
			size++;
		}

		// 앞에서 제거
		public T removeFirst() {
			if (isEmpty())
				throw new IllegalStateException("Deque is empty");
			T value = front.data;
			front = front.next;
			if (front != null)
				front.prev = null;
			else
				rear = null;
			size--;
			return value;
		}

		// 뒤에서 제거
		public T removeLast() {
			if (isEmpty())
				throw new IllegalStateException("Deque is empty");
			T value = rear.data;
			rear = rear.prev;
			if (rear != null)
				rear.next = null;
			else
				front = null;
			size--;
			return value;
		}

		// 앞/뒤 확인
		public T peekFirst() {
			if (isEmpty())
				return null;
			return front.data;
		}

		public T peekLast() {
			if (isEmpty())
				return null;
			return rear.data;
		}

		public boolean isEmpty() {
			return size == 0;
		}

		public int size() {
			return size;
		}
	}

	public static void main(String[] args) throws IOException {
		MyDeque<Integer> md = new MyDeque<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			switch (a) {
			case 1:
				md.addFirst(Integer.parseInt(st.nextToken()));
				break;
			case 2:
				md.addLast(Integer.parseInt(st.nextToken()));
				break;
			case 3:
				if (!md.isEmpty()) {
					sb.append(md.removeFirst() + "\n");
					break;
				} else {
					sb.append(-1 + "\n");
					break;
				}
			case 4:
				if (!md.isEmpty()) {
					sb.append(md.removeLast() + "\n");
					break;
				} else {
					sb.append(-1 + "\n");
					break;
				}
			case 5:
				sb.append(md.size() + "\n");
				break;
			case 6:
				if (md.isEmpty()) {
					sb.append(1 + "\n");
					break;
				} else {
					sb.append(0 + "\n");
					break;
				}
			case 7:
				if (!md.isEmpty()) {
					sb.append(md.peekFirst() + "\n");
					break;
				} else {
					sb.append(-1 + "\n");
					break;
				}
			case 8:
				if (!md.isEmpty()) {
					sb.append(md.peekLast() + "\n");
					break;
				} else {
					sb.append(-1 + "\n");
					break;
				}
			}

		}

		System.out.print(sb.toString());

		br.close();
	}

}
