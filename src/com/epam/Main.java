package com.epam;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Hrinchenko on 08.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

       char[] arr = myStr1.toCharArray();

        for(char a:arr){

            if(myStr2.indexOf(a)== -1){
                System.out.print(a);
            }
        }

    }
}





