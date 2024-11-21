package StaticExample;

public class InnerClasses {
    class Test{//Depentend on InnerClass(mean Outerclass)
         String name;
         Test(String n){
             this.name = n;
         }
    }

    static class staticTest{//not dependent on object, you can call direcly with refering to the object
        String name;
        staticTest(String name){
            this.name=name;
        }

        @Override
        public String toString() {
            return "staticTest{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
//
//        Test t1 = new Test("santosh");//can not call direcly
//        Test t2 = new Test("Abhishek");

        staticTest st = new staticTest("saa");
        System.out.println(st.name);


    }
}
