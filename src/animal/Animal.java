package animal;

public class Animal {

    //フィールド
    private String name;//名前
    private int age;    //年齢
    
    //コンストラクタ
    public Animal() {
    }
    
    //引数ありコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //自己紹介メソッド
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
    
    //getter.setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
