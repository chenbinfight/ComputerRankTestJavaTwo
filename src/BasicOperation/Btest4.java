package BasicOperation;

import javax.swing.JOptionPane;

/**
 * @author ���� binck:
 * @version ����ʱ�䣺2018��6��8�� ����3:22:54 ��˵��
 */
public class Btest4 {

	public static void main(String[] args) {
		String s1, s2, s3, s4, output;
		s1 = new String("hello");
		s2 = new String("good bye");
		s3 = new String("Happy Birthday");
		s4 = new String("happy birthday");
		output = "s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3 + "\ns4 = " + s4 + "\n\n";
		// �����ַ������
		if (s1.equals("hello"))
			// *********Found**********
			output = output + "s1 = \"hello";
		else
			output = output + "s1 does not equal \"hello\"\n";
		// ��==�������
		if (s1 == "hello")
			output += "s1 equals \"hello\"\n";
		else
			output += "s1 does not equal \"hello\"\n";
		// �����ַ���ʽ�������
		if (s3.equalsIgnoreCase(s4))
			output += "s3 equals s4\n";
		else
			output += "s3 does not equal s4\n";
		// ���ݱȽ�
		output += "\ns1.compareTo( s2 ) is " + s1.compareTo(s2) + "\ns2.compareTo( s1 ) is " + s2.compareTo(s1)
				+ "\ns1.compareTo( s1 ) is " + s1.compareTo(s1) + "\ns3.compareTo( s4 ) is " + s3.compareTo(s4)
				+ "\ns4.compareTo( s3 ) is " + s4.compareTo(s3) + "\n\n";
		// ���԰����ַ���ʽ����ƥ��
		if (s3.regionMatches(0, s4, 0, 5))
			output += "First 5 characters of s3 and s4 match\n";
		else
			output += "First 5 characters of s3 and s4 do not match\n";
		// �����ַ���ʽ����ƥ��
		if (s3.regionMatches(true, 0, s4, 0, 5))
			output += "First 5 characters of s3 and s4 match";
		else
			output += "First 5 characters of s3 and s4 do not match";
		// *********Found**********
		JOptionPane.showMessageDialog(null, output, "�ַ������췽��ʾ��", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}