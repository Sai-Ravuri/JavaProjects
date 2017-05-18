package com.company;

public class Main {

    public static void main(String[] args) {
        Objects1 obj = new Objects1();
        Object2 obj2 = new Object2();
        Object3 obj3 = new Object3();
        Object4 obj4 = new Object4();



/*Object1*/
        System.out.println(obj.t.toUpperCase());
        System.out.println(obj.r.toLowerCase());
        System.out.println(obj.u.length());
        System.out.println(obj.s.length());
        System.out.println(obj.s.trim());
        System.out.println(obj.u.concat(  obj.t  ));
        System.out.println(obj.u.concat( " Missouri " ));
        System.out.println("Hopping".concat( " Jeroos " ));
        System.out.println("Computer" + " " + "Science" );
        System.out.println(obj.t + " " + "football" );
        System.out.println(obj.r.indexOf("love"));
        System.out.println(obj.s.indexOf("Jump"));
        System.out.println(obj.t.indexOf("cat"));
        System.out.println(obj.u.indexOf("dog"));
        System.out.println(obj.u.substring(5));
        System.out.println(obj.u.substring(1, 3));
        System.out.println(obj.r.substring(7));
        System.out.println(obj.s.substring(0, 3));
        System.out.println("  ");
/*Object2*/
        System.out.println(obj2.s.trim().toUpperCase());
        System.out.println(obj2.r.substring( obj2.r.length() -5));/* "puter*/
        System.out.println(obj2.t.toUpperCase().substring( 14 ));
        System.out.println(obj2.r.substring(obj2.r.indexOf( "p" ), 6));/*put*/
        System.out.println(obj2.t.substring( 3, 5 ).concat(obj2.t.substring( 14, 16 )));
        System.out.println((obj2.r.substring( 0, 4 ) + "sci" ).toUpperCase());
        System.out.println(obj2.t.substring( obj2.t.indexOf( "me" ) , obj2.t.indexOf( "or"/*17,18*/)));
        System.out.println(obj2.t.substring( obj2.t.indexOf( obj2.t.substring( 14 ))));
/*Object3*/
 /* 1 */System.out.println(" Today " + " " + obj3.date.substring( 3, 5 ) );
        System.out.println(" Month " + " " + obj3.date.substring( 0, 2 ) );
        System.out.println(" Year " + " " + obj3.date.substring( 6, 10 ) );
 /* 2 */System.out.println(obj3.wizard.substring( 0 , obj3.wizard.indexOf(" ") ));
        System.out.println(obj3.wizard.substring( obj3.wizard.indexOf(" ") + 1 ));
        System.out.println(obj3.wizard.substring( obj3.wizard.indexOf(" ") + 1 ) + " " + obj3.wizard.substring( 0 , obj3.wizard.indexOf(" ") ));
        System.out.println(obj3.wizard.substring( 0 , 1 )
                            + "." +
                            obj3.wizard.substring(obj3.wizard.indexOf(" ") + 1 , obj3.wizard.indexOf(" ") +2)
                            + "." );
 /*Object4*/
    /*1*/System.out.println(obj4.a.length());
        System.out.println(obj4.a.indexOf("cat" , 10));
        System.out.println(obj4.a.indexOf("cat" , 10));
        System.out.println(obj4.idx);
        System.out.println("Go" + " " +obj4.a.substring(obj4.idx , 24) );
/*Math*/
       System.out.println(Math.floor(obj4.myDouble1));
        System.out.println(Math.max(obj4.myDouble1 , obj4.myDouble2));
        System.out.println(Math.pow(obj4.myInt1 , obj4.MyInt2));



    }
}
