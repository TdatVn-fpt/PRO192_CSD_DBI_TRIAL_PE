
package demob4;

public class Main {
    public static void main(String[] args) {
        DemoStatic o1 = new DemoStatic();
        DemoStatic o2 = new DemoStatic();
        
        System.out.println(o1);
        System.out.println(o2);
        
        o1.nonStaticData = 50;
        o1.staticData = 100;
        
        System.out.println(o1);
        System.out.println(o2);
        
        System.out.println("Variable of class");
        System.out.println(DemoStatic.staticData);
        
        int a = 10;
        //String str = "20";
        //a = Integer.parseInt(str);
        
        //a = Integer.MAX_VALUE;
        
        Integer ai = 10; // boxing
        System.out.println(a == ai);
        
        int b = ai; // unboxing
        System.out.println( a == b);
        System.out.println(a);
        System.out.println(ai);
        System.out.println(b);
        
        double d = Math.ceil(11.2);
        System.out.println(d);
        
        System.out.println(Character.isUpperCase('b'));
        
        String s = "Hello FPTU FPTU";
        char c = s.charAt(6);
        System.out.println(c);
        
        int i = s.indexOf('l');
        System.out.println(i);
        
        int ii = s.indexOf("fPt");
        System.out.println(ii);
        
        String s1 = "aaa";
        String s2 = "aaa";
        System.out.println(s1.equals(s2));
        
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        
        String res = s.replaceFirst("FPTU", "aa");
        System.out.println(res);
        
        res = "Hello" + 1 + 'a' + 10.5;
        
        res = "Hello" + " FPTU";
        StringBuffer strb = new StringBuffer("Hello");
        strb.append(" FPTU");
        
        System.out.println(res);
        System.out.println(strb);
        
        
    }
}
