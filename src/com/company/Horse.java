package com.company;

public class Horse {
    private int weight;
    private  int age;
    private String color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", nickName='" + nickName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Horse(int weight, int age, String color, String nickName, String gender) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.nickName = nickName;
        this.gender = gender;
    }
}
