package SimpleApplication;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest8 {
	public static void main(String args[]) {
		int a[][] = new int[5][5];
		int i, j, k = 1;
		for (i = 0; i < 5; i++)
			// *********Found**********
			for (j = 0; j < 5; j++)
				// *********Found**********
				if ((i + j) < 4)
					a[i][j] = 0;
				else {
					// *********Found**********
					a[i][j] = k++;
				}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++)
				// *********Found**********
				if (a[i][j] < 10)
					System.out.print(a[i][j] + "   ");
				else
					System.out.print(a[i][j] + "  ");
			System.out.println();
		}
	}
}
