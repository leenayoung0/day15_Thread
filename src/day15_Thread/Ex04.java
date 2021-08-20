package day15_Thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TEST"); // ���� ����� ���� �⺻�� �Ǵ� Ʋ�� ����� �۾� ������
		Container c = frame.getContentPane(); //������ ���°�
		JLabel label = new JLabel("Hello GUI"); 
		
		c.add(label);
		
		frame.setLocation(1000,200); // ����, ���� ��ġ (���� ���÷��̿� ���� ��ġ ����)
		//������ ũ��
		frame.setPreferredSize(new Dimension(500, 200));
		frame.pack(); //������ ����
		
		Font font = new Font(null, 0, 32); // �޸��忡�� �۲� �׽�Ʈ�غ���
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i=0; ;i++) //���ѹݺ�
			label.setText(i+ " : �ȳ��ϼ���");
		
	}

}
