package com.zipcodewilmington;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {


    @Test
    public void constructorTest() {

        String expectedFirstName = "Zeth";
        String expectedLastName = "Kane";
        Person newPerson = new Person(expectedFirstName, expectedLastName);

        Assert.assertEquals(expectedFirstName, newPerson.getFirstName());
        Assert.assertEquals(expectedLastName, newPerson.getLastName());

    }

    @Test
    public void constructor2Test(){
        String actualFirstName = "Zeth";
        String actualLastName = "Kane";
        Integer actualAge = 26;
        String actualHeight = "5'11";
        Double actualWeight = null;
        Person newPerson = new Person(actualFirstName, actualLastName, actualAge, actualHeight, actualWeight);

        Assert.assertEquals(actualFirstName, newPerson.getFirstName());
        Assert.assertEquals(actualLastName, newPerson.getLastName());
        Assert.assertEquals(actualAge, newPerson.getAge());
        Assert.assertEquals(actualHeight, newPerson.getHeight());
        Assert.assertEquals(actualWeight, newPerson.getWeight());
    }

    @Test
    public void getFirstNameTest(){
        String expectedFirstName = "Zeth";
        Person newPerson = new Person(expectedFirstName, null);


        Assert.assertEquals(expectedFirstName, newPerson.getFirstName());
    }
    @Test

    public void getLastNameTest(){
        String expectedLastName = "Kane";
        Person newPerson = new Person(null, expectedLastName);

        Assert.assertEquals(expectedLastName, newPerson.getLastName());
    }
    @Test
    public void getAgeTest(){
        Integer actualAge = 26;
        Person newPerson = new Person(null, null, 26, null, null);

        Assert.assertEquals(actualAge, newPerson.getAge());
    }

    @Test
    public void getHeightTest(){
        String actualHeight = "5'11";
        Person newPerson = new Person(null,null,null,"5'11",null);

        Assert.assertEquals(actualHeight, newPerson.getHeight());
    }

    @Test
    public void getWeightTest(){
        Double actualWeight = 180.5;
        Person newPerson = new Person(null,null,null,null, 180.5);

        Assert.assertEquals(actualWeight, newPerson.getWeight());
    }
}
