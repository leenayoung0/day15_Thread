package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TEST"); // 집을 만드는 가장 기본이 되는 틀을 만드는 작업 같은것
		Container c = frame.getContentPane(); //장판을 얻어온것
		JLabel label = new JLabel("Hello GUI"); 
		
		c.add(label);
		
		frame.setLocation(1000,200); // 가로, 세로 위치 (나의 디스플레이에 대한 위치 설정)
		//프레임 크기
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack(); //설정값 적용
		
		Font font = new Font(null, 0, 32); // 메모장에서 글꼴 테스트해보기
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i=0; ;i++) //무한반복
			label.setText(i+ " : 안녕하세요");
		
	}

}
