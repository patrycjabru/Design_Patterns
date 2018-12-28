public class Main {

    public static void main(String[] args) {
        MonstersAI monster = new MonstersAI();
        OrcsAI orc = new OrcsAI();

        orc.turn();

        monster.turn();
    }
}
