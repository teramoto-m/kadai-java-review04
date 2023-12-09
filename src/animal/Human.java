package animal;

public class Human extends Animal implements Thinkable{

    //フィールド
    private String hobby;
    
    //コンストラクタ
    public Human(){
    }
    
    //引数ありのコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name,age);//スーパークラス(Animal)のコンストラクタを呼び出す
        this.hobby = hobby;
    }
    
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
    
    //getter.setter
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
