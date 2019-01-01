public class Caretaker {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.set("test1");
        Originator.Memento memento1 = originator.save();

        originator.set("test2");
        Originator.Memento memento2 = originator.save();

        originator.restore(memento2);
        originator.restore(memento1);
    }
}
