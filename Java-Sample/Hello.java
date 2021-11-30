// 作成したクラスをインポート

class Hello {
  public static void main(String[] args) {
    System.out.println("Hello");

    // ここで作成したクラスのメソッドを使い、Helloを出力してください
    HelloYamashita greeting = new HelloYamashita();
    greeting.hello();
  }
}
