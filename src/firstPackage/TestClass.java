package firstPackage;

public class TestClass {
    public int testPublicInt = 10;
    private int testPrivateInt = 11;
    protected int testProtectedInt = 12;
    int testDefaultInt = 13;

    /** private void msg(){
             System.out.println("hello java");
         }
         **/
    public void  TestPublicInt(){
        System.out.println("im a test publicint method is ="+10);
    }
    private void testPrivateInt(){
        System.out.println("im a private method");

    }
      protected void testProtectediInt(){
         System.out.println("im a protected method");

    }
   void  testDefaltInt(){
       System.out.println("im a defoult method");
    }
    }

