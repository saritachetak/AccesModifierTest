package firstPackage;

import secondPackage.ChildTestClassDifferentPackage;

public class MainClass {
    public static void main(String[] args) {

        TestClass t1=new TestClass();
        t1.TestPublicInt();
        t1.testProtectediInt();
        t1.testDefaltInt();


        System.out.println("*****************************************");

        ChildTestClass t2=new ChildTestClass();
        t2.testProtectediInt();
        t2.TestPublicInt();
        t2.testDefaltInt();
        System.out.println("********************************************");
        ChildTestClassDifferentPackage t3=new ChildTestClassDifferentPackage();
        t3.TestPublicInt();
        t3.testProtectediInt();


    }
}

