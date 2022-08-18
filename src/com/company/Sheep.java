package com.company;

public class Sheep  {
    private int weight;
    private  int age;
    private String nickName;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + weight +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Sheep(int weight, int age, String nickName, String gender) {
        this.weight = weight;
        this.age = age;
        this.nickName = nickName;
        this.gender = gender;
    }

}
