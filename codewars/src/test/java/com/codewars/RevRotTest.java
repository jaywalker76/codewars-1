package com.codewars;

import static org.junit.Assert.*;
import org.junit.Test;


public class RevRotTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: revRot");   
//        testing(RevRot.revRot("1234", 0), "");
//        testing(RevRot.revRot("", 0), "");
//        testing(RevRot.revRot("1234", 5), "");
//        String s = "733049910872815764";
//        testing(RevRot.revRot(s, 5), "330479108928157");
        
        
        String s = "629442171559525163886170517713219435352303945333100969247071192042295553463255281796463795754321112275174230386830845692997757257846918662583016932240893744068516572848396574250893698044571776572723846798904392099587356350274644237659798069065408549810859940181833676694370780506548577152178798177843577202542966778207252159856236158370973251408396182940251952357629524228789062411037959234099656132785149769289161994448310104513796024591735234214330862416551958543211363564140883478017730159558038863417008904526110455791342229571672783263145491460273579950";
        testing(RevRot.revRot(s, 3), "87632541194064372795");
    }
}