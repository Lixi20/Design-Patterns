package com.Jsampl.factory;

class Friut {
    public Friut(){
    }
}
class Friut123 extends Friut {
    public void Apple() {
        System.out.println("采集苹果");
    }
    public void Banana(){
        System.out.println("采集香蕉");
    }


interface FactoryFriut {
    static Friut createFriut() {
        return null;
    }
}

static class Factory implements FactoryFriut {
        private FactoryFriut factoryFriut;
        private Friut123 friut123;

    Factory(FactoryFriut factoryFriut, Friut123 friut123) {
        this.factoryFriut = factoryFriut;
        this.friut123 = friut123;
    }
}

}

public class aaa {
    public static void main(String[] args) {
        Friut123 friut123 = new Friut123();
        friut123.Apple();
    }
}