package com.javacollections;

import org.codehaus.groovy.ast.stmt.WhileStatement;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class testJavaCollections {

    @Test
    public void arrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("test1");
        arrayList.add("test2");
        for (int i =0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
        arrayList.add(1,"test3");

        //Get element
        System.out.println(arrayList.get(1));

        for (String s : arrayList) {
            System.out.println(s);
        }

        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //Check Is Empty
        System.out.println(arrayList.isEmpty());
        //Find element exists
        System.out.println(arrayList.contains("test1"));

    }

    @Test
    public void linkList() {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Test1");
        linkedList.add("Test2");

        for(int count = 0; count < linkedList.size(); count++) {
            System.out.println(linkedList.get(count));
        }
        System.out.println("=========================================");
        linkedList.add(1,"Test22");
        linkedList.addFirst("Test11");
        linkedList.addLast("TestLast");

        for (String str: linkedList ) {
            System.out.println(str);
        }

        Iterator<String> itr = linkedList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

    @Test
    public void hashMapTest() {
        Map<String, Integer> mapTest = new HashMap<>();
        mapTest.put("k1",1);
        mapTest.put("k2",2);
        mapTest.putIfAbsent("k2",3);
        mapTest.putIfAbsent("k3", 3);
        Map<String, Integer> mapTest2 = new HashMap<>();
        mapTest2.putAll(mapTest);
        System.out.println(mapTest2.get("k2"));

    }

    public void readData() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("");
            Properties p = new Properties();
            p.load(fileReader);
            p.get("test");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","","");
            PreparedStatement ps = con.prepareStatement("");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                rs.getByte("");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
