class A {
	void input() {
		System.out.print("Hello ");
	}
}

class B extends A {
	void input() {
		System.out.print("World");
	}
}

class C extends A {
	void input() {
		System.out.print("!\n");
	}
}

class D {
	void input() {
		System.out.println("Hi!");
	}
}

class Gen<T> {
	T ob;
	
	Gen(T o) {
		ob = o;
	}
}

class UseBoundedWildcard {
	static void test(Gen<? extends A> o) {
		
	}
	
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		Gen<A> w1 = new Gen<A>(a);
		Gen<B> w2 = new Gen<B>(b);
		Gen<C> w3 = new Gen<C>(c);
		Gen<D> w4 = new Gen<D>(d);
		
		test(w1);
		test(w2);
		test(w3);
		//test(w4); -> error, since class D do not extend class A
		
		a.input();
		b.input();
		c.input();
		d.input();
	}
}
