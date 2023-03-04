package Chap04.sector00;

public class DmbCellPhone extends CellPhone{
    int channel;

    public DmbCellPhone(String model,String color ,int channel) { //CellPhone으로부터 상속받은 필드
        this.channel = channel;
        this.model = model;
        this.color = color;
    }



    void  turnOnDmb(){
        System.out.printf("");
    }
}
