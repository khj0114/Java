package kr.or.iei.func;

import kr.or.iei.vo.User;

public class Exam {
	public void exam1() {

		User[] userArr = new User[10];

		int index = 0;

		User user1 = new User("user01", "유저1", 23, "01022478875");

		User user2 = new User("user02", "유저2", 27, "01095887774");

		User user3 = new User("user03", "유저3", 34, "01036425456");

		userArr[index++] = user1;

		userArr[index++] = user2;

		userArr[index++] = user3;

		System.out.println("아이디\t이름\t나이\t전화번호");

		for(int i=0;i<userArr.length;i++) {

		System.out.println(userArr[i].getId()+"\t"+userArr[i].getName()+"\t"+userArr[i].getAge()+"\t"+userArr[i].getPhone());

		}

		}
}
