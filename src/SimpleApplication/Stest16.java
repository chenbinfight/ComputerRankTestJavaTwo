package SimpleApplication;

/**
 * @author 作者 binck:
 * @version 创建时间：2018年6月8日 下午3:25:09 类说明
 */
public class Stest16 {
	public static void main(String args[]) {
		SubClass subC = new SubClass();
		subC.doSomething();
	}
}

class SuperClass {

	int x;

	SuperClass() {
		// *********Found********
		x = 3;
		System.out.println("in SuperClass : x=" + x);
	}

	void doSomething() {
		// *********Found********
		System.out.println("in SuperClass.doSomething()");
	}
}

class SubClass extends SuperClass {

	int x;

	SubClass() {
		super();
		// *********Found********
		x = 5;
		System.out.println("in SubClass  :x=" + x);
	}

	void doSomething() {
		super.doSomething();
		// *********Found********
		System.out.println("in SubClass.doSomething()");
		System.out.println("super.x=" + super.x + "  sub.x=" + x);
	}
}
