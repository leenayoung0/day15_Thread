package day15_Thread;

class A02 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("A02 : "+i);
		}
	}
}
class B02 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("������ �귯���ɴϴ�~ "+i);
		}
	}
}

public class Ex02 {
	public static void main(String[] args) {//T1
		A02 a = new A02();
		B02 b = new B02();
		
		a.setDaemon(true);
		b.setDaemon(true);
		
		a.start(); //T2
		b.start(); //T3
		//�� ������ 3��
		
		System.out.println("���α׷��� �����մϴ�");
		System.out.println("���α׷��� �����մϴ�");
		System.out.println("���α׷��� �����մϴ�");
	}
	

}
