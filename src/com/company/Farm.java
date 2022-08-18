package com.company;

public class Farm {
    private String addres;
    private  int cows;
    private int horses;
    private  int sheep;
    private String OwnerName;

    @Override
    public String toString() {
        return "Farm{" +
                "addres='" + addres + '\'' +
                ", cows=" + cows +
                ", horses=" + horses +
                ", sheep=" + sheep +
                ", OwnerName='" + OwnerName + '\'' +
                '}';
    }

    public Farm(String addres, int cows, int horses, int sheep, String ownerName) {
        this.addres = addres;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        OwnerName = ownerName;





    }
}
