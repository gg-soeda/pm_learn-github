package hello;

// 作成したクラスをインポート
import hello.HelloMiyamura;

class Hello {
  public static void main(String[] args) {
    System.out.println(HelloMiyamura.greet());

    // ここで作成したクラスのメソッドを使い、Helloを出力してください
    HelloYamashita greeting = new HelloYamashita();
    greeting.hello();
  }
}
