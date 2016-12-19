package com.gmail.at.bartoszpop.javakillers.invocation;
public class InstanceMethodInvocation {
    public static void main(String[] args) {
        NestesA a = new NestedB();
        a.test(); // "B"

        NestedC c = new NestedD();
        c.test(); // "C" because C class is nested
        
        OuterE e = new OuterF();
        //e.test(); // method not visible
        
        OuterF f = new OuterF();
        f.test(); // "F"
    }

	private static class NestesA {
		public void test() {
			hidden();
		}
		private void hidden() {
			System.out.println("A");
		}
	}

	private static class NestedB extends NestesA {
		@Override
		public void test() {
			hidden();
		}
		private void hidden() {
			System.out.println("B");
		}
	}

    private static class NestedC {
        private void test() {
            System.out.println("C");
        }
    }

    private static class NestedD extends NestedC {
        public void test() {
            System.out.println("D");
        }
    }
}

class OuterE {
    private void test() {
        System.out.println("E");
    }
}

class OuterF extends OuterE {
    public void test() {
        System.out.println("F");
    }
}